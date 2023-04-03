INSERT INTO artwork (id, img_src, descr) SELECT * FROM CSVREAD('classpath:datafiles/artwork.csv');
