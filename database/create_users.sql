DROP USER gesprofruit;
CREATE USER gesprofruit 
    IDENTIFIED BY gesprofruit 
    DEFAULT TABLESPACE tbs_gesprofruit; 
GRANT DBA TO gesprofruit;