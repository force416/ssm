--liquibase formatted sql
--changeset version:v1

create table if not exists users (
    id SERIAL NOT NULL primary key,
    username varchar(255)
);
--rollback drop table chats;
