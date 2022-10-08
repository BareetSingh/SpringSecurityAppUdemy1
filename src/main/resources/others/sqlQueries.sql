--for postgres
create table customer (
id serial not null primary key,
email varchar(45) not null,
pwd varchar(200) not null,
role varchar(45) not null
);

INSERT INTO public.customer
(email, pwd, "role")
VALUES('test@gmail.com', '$2a$12$YYD4GU311sIofQZzEtScheaNSkJFskGgmZ7RFauwoqdDcS9Oc/hcG', 'ADMIN');