CREATE OR REPLACE TRIGGER address_ID_addr_trg BEFORE
	INSERT ON ADDRESS
	FOR EACH ROW
	WHEN (new.ID_addr IS NULL)
BEGIN
	:new.ID_addr := address_ID_addr_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER employee_ID_emp_trg BEFORE
	INSERT ON EMPLOYEE
	FOR EACH ROW
	WHEN (new.ID_emp IS NULL)
BEGIN
	:new.ID_emp := employee_ID_emp_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER trainee_ID_trn_trg BEFORE
	INSERT ON TRAINEE
	FOR EACH ROW
	WHEN (new.ID_trn IS NULL)
BEGIN
	:new.ID_trn := trainee_ID_trn_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER word_ID_word_trg BEFORE
	INSERT ON WORD
	FOR EACH ROW
	WHEN (new.ID_word IS NULL)
BEGIN
	:new.ID_word := word_ID_word_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER exam_ID_exam_trg BEFORE
	INSERT ON EXAM
	FOR EACH ROW
	WHEN (new.ID_exam IS NULL)
BEGIN
	:new.ID_exam := exam_ID_exam_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER vehicle_ID_veh_trg BEFORE
	INSERT ON VEHICLE
	FOR EACH ROW
	WHEN (new.ID_veh IS NULL)
BEGIN
	:new.ID_veh := vehicle_ID_veh_seq.nextval;
END;
/

CREATE OR REPLACE TRIGGER lesson_ID_lesson_trg BEFORE
	INSERT ON LESSON
	FOR EACH ROW
	WHEN (new.ID_lesson IS NULL)
BEGIN
	:new.ID_lesson := lesson_ID_lesson_seq.nextval;
END;
/