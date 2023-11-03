CREATE TABLE audit_department
(
    revisioNnumber text not null PRIMARY KEY,
    productType text not null,
    locationAddress text not null

);

insert into audit_department
(revisioNnumber, productType, locationAddress)
values
    ('Xg_5124','компьютер','общага');
insert into audit_department
(revisioNnumber, productType, locationAddress)
values
    ('Xg_5125','ноутбук','жилой дом');
insert into audit_department
(revisioNnumber, productType, locationAddress)
values
    ('Xg_5126','планшет','офис')

SELECT * FROM audit_department