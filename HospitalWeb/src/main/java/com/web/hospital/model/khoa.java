package com.web.hospital.model;

public class khoa {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.Khoa.maKhoa
     *
     * @mbg.generated Wed May 08 19:21:48 ICT 2024
     */
    private Integer makhoa;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dbo.Khoa.tenKhoa
     *
     * @mbg.generated Wed May 08 19:21:48 ICT 2024
     */
    private String tenkhoa;
    
    private String truongKhoa;

    private String hinhanhkhoa;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.Khoa.maKhoa
     *
     * @return the value of dbo.Khoa.maKhoa
     *
     * @mbg.generated Wed May 08 19:21:48 ICT 2024
     */
    public Integer getMakhoa() {
        return makhoa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.Khoa.maKhoa
     *
     * @param makhoa the value for dbo.Khoa.maKhoa
     *
     * @mbg.generated Wed May 08 19:21:48 ICT 2024
     */
    public void setMakhoa(Integer makhoa) {
        this.makhoa = makhoa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dbo.Khoa.tenKhoa
     *
     * @return the value of dbo.Khoa.tenKhoa
     *
     * @mbg.generated Wed May 08 19:21:48 ICT 2024
     */
    public String getTenkhoa() {
        return tenkhoa;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dbo.Khoa.tenKhoa
     *
     * @param tenkhoa the value for dbo.Khoa.tenKhoa
     *
     * @mbg.generated Wed May 08 19:21:48 ICT 2024
     */
    public void setTenkhoa(String tenkhoa) {
        this.tenkhoa = tenkhoa;
    }

	public String getTruongKhoa() {
		return truongKhoa;
	}

	public void setTruongKhoa(String truongKhoa) {
		this.truongKhoa = truongKhoa;
	}

    public String getHinhanhkhoa() {
        return hinhanhkhoa;
    }

    public void setHinhanhkhoa(String hinhanhkhoa) {
        this.hinhanhkhoa = hinhanhkhoa;
    }
}