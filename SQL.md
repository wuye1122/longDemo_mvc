#### init sql and data 

* create db and table 
```mysql
create database test;

create table test.`department`
(
    `d_id`         int         not null auto_increment,
    `d_department` varchar(32) not null,
    `d_name`       varchar(32) not null,
    `create_time`  timestamp   not null default current_timestamp,
    `update_time`  timestamp   not null default current_timestamp on update current_timestamp,
    primary key (`d_id`)
)

```

* insert some init data

```mysql

 INSERT INTO test.department (d_department, d_name, create_time, update_time) VALUES ('test', 'lemon', DEFAULT, DEFAULT)

```

