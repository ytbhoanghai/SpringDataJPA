create table account
(
    id_account int auto_increment
        primary key,
    username   varchar(45) null,
    password   varchar(45) null,
    constraint account_username_uindex
        unique (username)
);

INSERT INTO `[example]_mapping`.account (id_account, username, password) VALUES (5, 'root', '123');
create table department
(
    id_department int auto_increment
        primary key,
    name          varchar(45) null
);

INSERT INTO `[example]_mapping`.department (id_department, name) VALUES (1, 'IT');
create table employment
(
    id_employment int auto_increment
        primary key,
    name          varchar(45) null,
    id_account    int         null,
    id_department int         null,
    constraint employment_account_id_account_fk
        foreign key (id_account) references account (id_account),
    constraint employment_department_id_department_fk
        foreign key (id_department) references department (id_department)
);

INSERT INTO `[example]_mapping`.employment (id_employment, name, id_account, id_department) VALUES (2, 'Nguyễn Văn A', 5, 1);
create table employment_project
(
    id_employment int null,
    id_project    int not null
        primary key,
    constraint Employment_Project_employment_id_employment_fk
        foreign key (id_employment) references employment (id_employment),
    constraint Employment_Project_project_id_project_fk
        foreign key (id_project) references project (id_project)
);

create index Employment_Project_id_employment_index
    on employment_project (id_employment);

INSERT INTO `[example]_mapping`.employment_project (id_employment, id_project) VALUES (2, 1);
create table guest
(
    id_guest int auto_increment
        primary key,
    name     varchar(45) null
);

INSERT INTO `[example]_mapping`.guest (id_guest, name) VALUES (1, 'Trần Thị B');
INSERT INTO `[example]_mapping`.guest (id_guest, name) VALUES (2, 'Hoàng Văn C');
create table project
(
    id_project int auto_increment
        primary key,
    name       varchar(45) null
);

INSERT INTO `[example]_mapping`.project (id_project, name) VALUES (1, 'Mía Đường La Ngà');
INSERT INTO `[example]_mapping`.project (id_project, name) VALUES (2, 'OutSourcing');
create table project_guest
(
    id_project int                              not null
        primary key,
    id_guest   int                              null,
    date_sale  date default current_timestamp() null,
    constraint Project_Guest_guest_id_guest_fk
        foreign key (id_guest) references guest (id_guest),
    constraint Project_Guest_project_id_project_fk
        foreign key (id_project) references project (id_project)
);

create index Project_Guest_id_project_index
    on project_guest (id_project);

INSERT INTO `[example]_mapping`.project_guest (id_project, id_guest, date_sale) VALUES (1, 1, '2020-01-24');
INSERT INTO `[example]_mapping`.project_guest (id_project, id_guest, date_sale) VALUES (2, 1, '2020-01-23');