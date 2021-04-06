CREATE USER leo WITH PASSWORD 'leonard' CREATEDB;


CREATE TABLE produtos
(
    id integer NOT NULL,
    nome character varying(255) COLLATE pg_catalog."default",
    valor_producao double precision,
    valor_venda double precision,
    CONSTRAINT produtos_pkey PRIMARY KEY (id)
);

INSERT INTO produtos(
	id, nome, valor_producao, valor_venda)
	VALUES (1, 'IPHONE 6', 6000, 6700);

INSERT INTO produtos(
	id, nome, valor_producao, valor_venda)
	VALUES (2, 'NOTEBOOK DELL', 2500, 3700);

INSERT INTO produtos(
	id, nome, valor_producao, valor_venda)
	VALUES (3, 'TELEVISÃO 60', 4000, 5500);

INSERT INTO produtos(
	id, nome, valor_producao, valor_venda)
	VALUES (4, 'GELADEIRA', 2000, 2700);