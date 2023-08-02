create database SOF203_PD
go
use SOF203_PD
go
create table SinhVien(
MaSV nvarchar(7) not null primary key,
HoTen nvarchar(50) not null,
Diem float not null,
nganh nvarchar(50) not null
)
go
insert into SinhVien(MaSV,HoTen,Diem,nganh)
values('PH0001','Le Anh Tuan',9,'PTPM'),
('PH0002','Nguyen Lan Anh',7,'MKT'),
('PH0003','Do Dang Hieu',8,'UDPM'),
('PH0004','Dao Duy Tu',5,'PTPM');

SELECT * FROM SINHVIEN