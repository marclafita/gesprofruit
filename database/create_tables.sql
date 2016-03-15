CREATE TABLE gesprofruit.usuaris (
   idusuari INT NOT NULL,
   nom_usuari VARCHAR(100) NOT NULL,
   correu_electronic VARCHAR(100) NOT NULL,
   contrasenya VARCHAR(100) NOT NULL,
   ultima_conexio DATE NOT NULL,   
  PRIMARY KEY (idusuari))
  TABLESPACE tbs_gesprofruit;
  
CREATE SEQUENCE seq_usuaris_idusuari
	START WITH 1 
	INCREMENT BY 1 
	NOMAXVALUE; 	

CREATE TRIGGER trig_usuaris_seq
  BEFORE INSERT ON gesprofruit.usuaris
  FOR EACH ROW
  BEGIN
    SELECT seq_usuaris_idusuari.nextval INTO :new.idusuari FROM dual;
  END;