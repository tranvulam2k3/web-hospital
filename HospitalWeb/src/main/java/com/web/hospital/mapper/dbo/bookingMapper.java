package com.web.hospital.mapper.dbo;

import com.web.hospital.model.MedicalVisits;
import com.web.hospital.model.booking;
import com.web.hospital.model.bookingExample;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface bookingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    long countByExample(bookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    int deleteByExample(bookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    int insert(booking row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    int insertSelective(booking row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    List<booking> selectByExample(bookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    int updateByExampleSelective(@Param("row") booking row, @Param("example") bookingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Booking
     *
     * @mbg.generated Thu May 09 14:06:43 ICT 2024
     */
    int updateByExample(@Param("row") booking row, @Param("example") bookingExample example);
    
    int save(@Param("hotenbenhnhan") String hotenbenhnhan, @Param("namsinh") String namsinh, @Param("gioitinh") String gioitinh,
    		@Param("sdt") String sdt,@Param("diachi") String diachi,@Param("email") String email,
    		@Param("hotenbacsi") String hotenbacsi,@Param("loinhan") String loinhan,@Param("idd") int idd,@Param("mount") int mount,
            @Param("day") Date day,@Param("id") int id, @Param("idphong") int idphong, @Param("thoigiandat") LocalTime thoigiandat,
             @Param("timeslot") String timeslot);

    List<booking> listBookingByidD(@Param("idd") int idd);
    booking findbystt(@Param("stt") int stt);
    int updateBooking(@Param("hotenbenhnhan") String hotenbenhnhan,@Param("namsinh") String namsinh,@Param("gioitinh") String gioitinh,
    		@Param("sdt") String sdt,@Param("diachi") String diachi,@Param("email") String email,
                      @Param("day") Date day,@Param("loinhan") String loinhan,@Param("stt") int stt);
    int deletebyStt(@Param("stt") int stt);

    List<booking> checkBookingbyID(@Param("id") int id);

    int savebydoc(@Param("hotenbenhnhan") String hotenbenhnhan, @Param("namsinh") String namsinh, @Param("gioitinh") String gioitinh,
             @Param("sdt") String sdt,@Param("diachi") String diachi,@Param("email") String email,
             @Param("hotenbacsi") String hotenbacsi,@Param("loinhan") String loinhan,@Param("idd") int idd,@Param("mount") int mount,
             @Param("day") Date day, @Param("idphong") int idphong, @Param("thoigiandat") LocalTime thoigiandat);

    //
    List<String> checkSlottime(@Param("day") Date day,@Param("idd") int idd);
}