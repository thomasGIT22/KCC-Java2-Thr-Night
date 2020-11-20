DROP DATABASE IF EXISTS java_ii_final_database;
CREATE DATABASE java_ii_final_database;
USE java_ii_final_database;

/* *****************************************************************************
	Create statement for table Animal
***************************************************************************** */
DROP TABLE IF EXISTS Animal;
CREATE TABLE Animal(
    Animal_ID           VARCHAR(12)     NOT NULL,
    Animal_Name         VARCHAR(100)    NOT NULL,
    Animal_Species      VARCHAR(50)     NOT NULL,
    Animal_Gender       VARCHAR(6)      NOT NULL,
    Animal_Age          INT             NOT NULL,
    Animal_Fixed        BIT             NOT NULL,
    Animal_Legs         INT             NOT NULL,
    Animal_Weight       DECIMAL(10,2)   NOT NULL,
    Date_Added          DATE            NOT NULL, /*YYYY-DD-MM*/
    Last_Feeding_Time   DATETIME        NOT NULL, /*YYYY-DD-MM HH-SS*/
    PRIMARY KEY(Animal_ID))
;

/* *****************************************************************************
	Build Stored Procedure sp_add_Animal_Record
***************************************************************************** */
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_add_Animal_Record$$
CREATE PROCEDURE sp_add_AnimalRecord(
    IN p_Animal_ID          VARCHAR(12),
    IN p_Animal_Name        VARCHAR(100),
    IN p_Animal_Species     VARCHAR(50),
    IN p_Animal_Gender      VARCHAR(6),
    IN p_Animal_Age         INT,
    IN p_Animal_Fixed       BIT,
    IN p_Animal_Legs        INT,
    IN p_Animal_Weight      DECIMAL(10,2),
    IN p_Date_Added         DATE,
    IN p_Last_Feeding_Time  DATETIME
    
)
BEGIN
    INSERT INTO Animal(
        Animal_ID,
        Animal_Name,
        Animal_Species,
        Animal_Gender,
        Animal_Age,
        Animal_Fixed,
        Animal_Legs,
        Animal_Weight,
        Date_Added,
        Last_Feeding_Time
    )
    VALUES (
        p_Animal_ID,
        p_Animal_Name,
        p_Animal_Species,
        p_Animal_Gender,
        p_Animal_Age,
        p_Animal_Fixed,
        p_Animal_Legs,
        p_Animal_Weight,
        p_Date_Added,
        p_Last_Feeding_Time
    );
END$$
DELIMITER ;

/* *****************************************************************************
	Build Stored Procedure sp_get_an_Animal_Record
***************************************************************************** */
DELIMITER $$
DROP PROCEDURE IF EXISTS sp_get_an_Animal_Record$$
CREATE PROCEDURE sp_get_an_Animal_Record( 
	IN p_original_Animal_ID VARCHAR(12)
) 
BEGIN
	SELECT *
	FROM Animal
    WHERE Animal_ID = p_original_Animal_ID;
END$$
DELIMITER ;

/* *****************************************************************************
	Add some data
***************************************************************************** */
CALL sp_add_AnimalRecord('A12345678912','Spyro','Dog','Male',4,1,4,63.5,"2020-06-22","2020-11-19 14:29:36");
CALL sp_add_AnimalRecord('A12345678913','Peanut','Cat','Female',1,0,4,10.7,"2020-07-05","2020-11-19 20:20:55");
CALL sp_add_AnimalRecord('A12345678914','Abby','Dog','Female',5,1,4,18,"2020-07-09","2020-11-19 15:45:07");
CALL sp_add_AnimalRecord('A12345678915','Ziva','Dog','Female',3,0,4,15,"2020-07-20","2020-11-19 15:45:07");
CALL sp_add_AnimalRecord('A12345678916','Opie','Cat','Male',6,1,4,12,"2020-08-15","2020-11-19 20:20:55");

/* *****************************************************************************
                               END OF SCRIPT	
***************************************************************************** */