CREATE OR REPLACE PROCEDURE finish_theory(pesel_out VARCHAR2)
IS
BEGIN
	UPDATE TRAINEE
	SET Theory = 'T'
	WHERE Pesel = pesel_out AND Theory = 'F';
END;

execute finish_theory(xxx);



CREATE OR REPLACE PROCEDURE pass_internal_exam(pesel_out VARCHAR2)
IS
BEGIN
    DECLARE
    notTheory EXCEPTION;
    th CHAR;
    PRAGMA EXCEPTION_INIT(notTheory, -20101);
    BEGIN
        BEGIN
            SELECT Theory INTO th
            FROM TRAINEE
            WHERE Pesel = pesel_out;
            
            IF th = 'F' THEN
                raise_application_error(-20101, 'Theory is not finished');
            END IF;
        
            UPDATE TRAINEE
            SET Internal_Exam = 'T'
            WHERE Pesel = pesel_out AND Internal_Exam = 'F';
        END;
        EXCEPTION
            WHEN notTheory THEN
                dbms_output.put_line(SQLERRM);
                raise;
    END;
END;

execute pass_internal_exam(xxx);


------------------------------ZROBIC, WIECEJ DANYCH. TYP, KIEDY, KOMU
CREATE OR REPLACE PROCEDURE pass_exam_word(pesel_out VARCHAR2)
IS
BEGIN
	UPDATE EXAM
	SET Pass_or_not = 'T'
	WHERE Pesel = pesel_out AND Pass_or_not = 'F';
END;
