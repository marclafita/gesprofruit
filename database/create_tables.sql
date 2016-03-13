CREATE TABLE gesprofruit.usuaris (
   idusuari INT NOT NULL,
   nom_usuari VARCHAR(100) NOT NULL,
   correu_electronic VARCHAR(100) NOT NULL,
   contrasenya VARCHAR(100) NOT NULL,
   ultima_conexio DATE NOT NULL,   
  PRIMARY KEY (idusuari))
  TABLESPACE tbs_gesprofruit;