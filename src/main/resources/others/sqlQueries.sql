--for postgres
create table users (
id serial not null primary key,
username varchar(45) not null,
password varchar(45) not null,
enabled int not null
);

create table authorities (
id serial not null primary key,
username varchar(45) not null,
authority varchar(45) not null
);


INSERT INTO public.authorities
(username, authority)
VALUES('happy', 'write');
INSERT INTO public.users
(username, "password", enabled)
VALUES('happy', '12345', 1);
