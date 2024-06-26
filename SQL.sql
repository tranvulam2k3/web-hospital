create database HospitalWebsite

use HospitalWebsite

create table Account(
	id int IDENTITY (1,1),
	username nvarchar(50),
	[password] nvarchar(50),
	[role] nvarchar(50),
	[name] nvarchar(50)
)
insert into Account(username,[password],[role],[name])
	values ('conghieu','conghieu','2','Hi?u'),
			('banguyen','banguyen','2','Nguyên')



create table Booking(
	Stt int IDENTITY (1,1),
	hoTenBenhNhan nvarchar(50),
	namSinh nvarchar(50),
	gioiTinh nvarchar(50),
	SDT nvarchar(50),
	diaChi nvarchar(50),
	email nvarchar(50),
	hoTenBacSi nvarchar(50),
	ngaydat nvarchar(50),
	note nvarchar(max)
)
drop table Booking

create table Khoa(
	maKhoa int primary key,
	tenKhoa nvarchar(50)
)
insert into Khoa(maKhoa,tenKhoa)
	values (3,'Tim M?ch'),
			(4,'Ph? s?n')
			
UPDATE Doctor
SET l=N''
WHERE idD=3;

ALTER TABLE Booking
  ADD maBS int;

  ALTER TABLE Doctor ADD  username nvarchar(50)

 select * from Doctor
select * from Patients
select * from Account
select * from Doctor
select * from Khoa
select * from 

select * from Booking
	where id = 15

select tenKhoa from Khoa
select * from Doctor
where idd=1

UPDATE Doctor
SET maKhoa = 4
WHERE idD=5;

insert into Doctor(hoTenBacSi,namSinh,gioiTinh,SDT,email,)
select * from Doctor
select * from Booking
SELECT Booking.*, Account.idD
FROM Booking
INNER JOIN Doctor ON Booking.idD = Doctor.idD;

INSERT INTO Booking(hoTenBenhNhan,namSinh,gioiTinh,SDT,diaChi,email,hoTenBacSi,ngaydat,loiNhan,idd)
values()

	SELECT 
			Top 1 
				Booking.*, Doctor.gia
		FROM 
			Booking
		INNER JOIN 
			Doctor 
				ON 
					Booking.idD = Doctor.idD;

SELECT TOP 1 Booking.* ,Doctor.gia
FROM Booking
INNER JOIN Doctor ON Booking.idD = Doctor.idD
ORDER BY Booking.stt DESC;

SELECT TOP 1 *
FROM Booking
INNER JOIN Doctor ON Booking.idD = Doctor.idD;
ORDER BY Booking.stt DESC;

SELECT TOP 1 Booking.*, Doctor.gia
FROM Booking
INNER JOIN Doctor ON Booking.idD = Doctor.idD
ORDER BY Booking.stt DESC


 

select Top 1 * from booking
order by stt desc


DELETE FROM booking
WHERE stt = 4;

SELECT Doctor.idD
FROM Doctor
INNER JOIN Account ON Account.username = Doctor.username
where Account.username like '%vanba%'

select * from booking
where idd = 2

SELECT Doctor.*, Khoa.tenKhoa
FROM Doctor
INNER JOIN Khoa ON Doctor.maKhoa = Khoa.maKhoa;


select * from Account

CREATE TABLE HoSo (
    idHoSo INT PRIMARY KEY IDENTITY (1,1),
	hotenbenhnhan nvarchar(50),
    namSinh nvarchar(50),
	gioiTinh nvarchar(50),
	SDT nvarchar(50),
	diaChi nvarchar(50),
	ngayKham date,
	idD int ,
	hotenbacsi nvarchar(50),
	chuanDoan nvarchar(50),
	donThuoc nvarchar(50)
);

insert into MedicalVisits(hotenbenhnhan,ngayKham,lidoKham,chuanDoan,ghichucuabacsi,donthuoc,idD)
	values(N'Phan Công Nhân','26-4-2024',N'Đau Đầu',N'Căng thẳng, suy nghĩ nhiều',N'Ngủ sớm và thư giản','Acetaminophen',1),
	(N'Huyền Trân','26-4-2024',N'Đau Mắt',N'Tiếp xúc ánh sáng xanh',N'Ngủ sớm và thư giản','Levofloxacin ',1),
	(N'Văn Quý','28-4-2024',N'Đau Đầu',N'Căng thẳng, suy nghĩ nhiều',N'Ngủ sớm và thư giản','Acetaminophen',2),
	(N'Hồng Hồng','11-4-2024',N'Đau Mắt',N'Tiếp xúc ánh sáng xanh',N'Ngủ sớm và thư giản','Levofloxacin',2),
	(N'Nguyễn Công Nhân','21-4-2024',N'Đau Đầu',N'Căng thẳng, suy nghĩ nhiều',N'Ngủ sớm và thư giản','Acetaminophen',3),
	(N'Huỳnh Công Thành','23-4-2024',N'Đau Mắt',N'Tiếp xúc ánh sáng xanh',N'Ngủ sớm và thư giản','Levofloxacin',3),
	(N'Gia Cát Lượng','26-6-2024',N'Đau Đầu',N'Căng thẳng, suy nghĩ nhiều',N'Ngủ sớm và thư giản','Acetaminophen',4),
	(N'Dân Trường','26-1-2024',N'Đau Mắt',N'Tiếp xúc ánh sáng xanh',N'Ngủ sớm và thư giản','Levofloxacin',4)


DELETE FROM MedicalVisits;

	select * from booking
	where stt=1

drop table MedicalVisits

select * from Account

insert into booking(hotenbenhnhan,namsinh,gioitinh,sdt,diachi,email,hotenbacsi,ngaydat,loinhan,idd)
values(N'Đặng Lâm',N'1999',N'Nam','0967321678',N'Hà Lam','lam11@gmail.com',N'Lê Nguyên','26/5/2024',N'không có',2)

CREATE TABLE phong_kham (
		id INT PRIMARY KEY IDENTITY,
		ten_phong_kham NVARCHAR(255),
		dia_chi NVARCHAR(255),
		so_dien_thoai NVARCHAR(255),
		ghi_chu NVARCHAR(255)
);

INSERT INTO phong_kham (ten_phong_kham, dia_chi, so_dien_thoai,  ghi_chu)
VALUES (N'Phòng Khám Đa Khoa ABC', N'123 Đường XYZ, Quận 1, TP.HCM', '0123456789',N'Phòng khám uy tín với đội ngũ bác sĩ chuyên nghiệp'),
		(N'Phòng Khám Đa Khoa DEF', N'456 Đường LMN, Quận 2, TP.HCM', '0987654321', N'Phòng khám chuyên về nội khoa'),
	 (N'Phòng Khám Nhi Khoa GHI', N'789 Đường OPQ, Quận 3, TP.HCM', '0234567890', N'Chuyên khám và điều trị cho trẻ em');

	 SELECT * FROM phong_kham;
	 DELETE FROM phong_kham
WHERE id = 3;

select * from Account

select * from Doctor
where maKhoa = 2


UPDATE Khoa
SET hinhanhKhoa = 'https://benhviensaigonnamdinh.vn/wp-content/uploads/2023/05/thai-san-sn1-2.jpg'
WHERE maKhoa=4;

select
		*
		from
		Booking
		where
		stt = 36

select * from HoSo
where idD=2
ORDER BY HoSo.ngayKham ASC

INSERT INTO HoSo(hotenbenhnhan,namSinh,gioiTinh,SDT,diaChi,ngayKham,idD,hotenbacsi,chuanDoan,donThuoc)
values()

create table ThongTinCaNhan(
	idcanhan INT PRIMARY KEY IDENTITY (1,1),
	hoten nvarchar(50),
	gioiTinh nvarchar(50),
	SDT nvarchar(50),
	ngaysinh date,
	email nvarchar(50),
	diaChi nvarchar(50),
	username nvarchar(50)
)

select ThongTinCaNhan.* , Account.password  from ThongTinCaNhan
inner join Account on ThongTinCaNhan.username = Account.username

select * from ThongTinCaNhan
where username = 'lam'


UPDATE Account
SET password = '123123'
WHERE username='lam';

create table historylichkham(
	Stt int ,
	hoTenBenhNhan nvarchar(50),
	namSinh nvarchar(50),
	gioiTinh nvarchar(50),
	SDT nvarchar(50),
	diaChi nvarchar(50),
	email nvarchar(50),
	hoTenBacSi nvarchar(50),
	day date,
	note nvarchar(max),
	mount int,
	id int
)
select * from HoSo
select * from historylichkham
where id =2 

INSERT INTO historylichkham(Stt,hoTenBenhNhan,namSinh,gioiTinh,SDT,diaChi,email,hoTenBacSi,day,note,mount,id) 
SELECT Booking.Stt , Booking.hoTenBenhNhan, Booking.namSinh, Booking.gioiTinh, Booking.SDT, Booking.diaChi, 
		Booking.email, Booking.hoTenBacSi, Booking.day, Booking.loinhan, Booking.mount, Booking.id FROM Booking 
where stt = 52;

DELETE FROM booking
where stt = 56

create table historygiaodich(
	idgiaodich INT PRIMARY KEY IDENTITY (1,1),
	magiaodich nvarchar(50),
	ngaygiaodich date,
	mount int,
	id int
)

select * from historygiaodich
select * from Account
select * from ThongTinCaNhan
where id = 2

select historygiaodich.* , ThongTinCaNhan.hoten from historygiaodich 
INNER JOIN Account on historygiaodich.id = Account.id
INNER JOIN ThongTinCaNhan on ThongTinCaNhan.username= Account.username


	insert into ThongTinCaNhan(username) 
	values ('nhatkha')

	Địa Chỉ Phòng Khám

select booking.*,phong_kham.dia_chi from booking
INNER JOIN phong_kham on booking.idphong=phong_kham.idphong
where booking.id = 2
ORDER BY Stt ASC

ALTER TABLE booking
DROP COLUMN  thoigiandat;

select Doctor.* , phong_kham.ten_phong_kham from Doctor
INNER JOIN phong_kham on Doctor.idphong = phong_kham.idphong

select * from Doctor
select * from booking
where id =2
select * from phong_kham


SELECT Doctor.*, Khoa.tenKhoa FROM Doctor
INNER JOIN Khoa ON Doctor.makhoa = Khoa.makhoa
WHERE hoTenBacSi LIKE '%a%'
ORDER BY idd
OFFSET 6
ROWS FETCH NEXT 6
ROWS ONLY

