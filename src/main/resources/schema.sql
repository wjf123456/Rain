create table rain(
id int PRIMARY  KEY  AUTO_INCREMENT
,districtName VARCHAR (22)
,monitorTime DATE
,rain int
,monitoringStation varchar(200)
,monitoringAddress VARCHAR (200)
);



INSERT INTO rain(districtName,monitorTime,rain,monitoringStation,monitoringAddress)
VALUES ('丰台区','2014-5-11',5,'七里庄站','七里庄站'),
('西城区','2014-7-9','2','什么街站','展览路'),
('东城区','2014-7-6',3,'东四站','东四街道');




-- private int id;
--     private String districtName;
--     private Date monitorTime;
--     private int rain;
--     private String monitoringStation;
--     private String monitoringAddress;