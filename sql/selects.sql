SELECT W.Name, A.City, A.Street, A.Building_number
FROM WORD W, ADDRESS A
WHERE W.ID_addr = A.ID_addr;
------------------------------------------------------------------------------------
SELECT E.Name_of_position, P.Surname, P.Name, A. City, A.Street, A.Building_number, A.Flat_number
FROM EMPLOYEE E, PERSON P, ADDRESS A
WHERE E.Pesel = P.Pesel AND P.ID_addr = A.ID_addr
ORDER BY P.Surname, P.Name;
------------------------------------------------------------------------------------
SELECT E.ID_emp, P.Surname, P.Name
FROM EMPLOYEE E, PERSON P
WHERE E.Pesel = P.Pesel AND E.Name_of_position = 'instructor'
ORDER BY E.ID_emp;