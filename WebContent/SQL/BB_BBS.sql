--(new)BB_BBS
DROP TABLE BB_BBS
CASCADE CONSTRAINT;

DROP SEQUENCE BB_BBS_SEQ;

CREATE TABLE BB_BBS(
	SEQ NUMBER(10) PRIMARY KEY,
	BURGER_SEQ NUMBER(10) NOT NULL,
	WRITER NUMBER(10) NOT NULL,
	BBS_LIKE NUMBER(10) NOT NULL, (라이크 +1)
	DEL NUMBER(1) NOT NULL
)
CREATE SEQUENCE BB_BBS_SEQ
START WITH 1
INCREMENT BY 1;

INSERT INTO BB_BBS
VALUES(1,1,1,0,0);

UPDATE BB_BBS SET
BBS_LIKE=(BBS_LIKE+1)
WHERE SEQ=1

UPDATE BB_BBS SET
BBS_LIKE=(BBS_LIKE-1)
WHERE SEQ=1

--(old)BB_BBS

SELECT * FROM BB_BBS;

DROP TABLE BB_BBS
CASCADE CONSTRAINT;

DROP SEQUENCE BB_BBS_SEQ;

CREATE TABLE BB_BBS(
	SEQ NUMBER(10) PRIMARY KEY,
	BURGER_SEQ NUMBER(10) NOT NULL,
	ID VARCHAR2(20) NOT NULL,
	BBS_LIKE NUMBER(10) NOT NULL,
	DEL NUMBER(1) NOT NULL
);

CREATE SEQUENCE BB_BBS_SEQ
START WITH 1
INCREMENT BY 1;

ALTER TABLE BB_BBS
ADD CONSTRAINT FK_BB_BURGER_BBS_SEQ FOREIGN KEY(BURGER_SEQ)
REFERENCES BB_BURGER(SEQ);

