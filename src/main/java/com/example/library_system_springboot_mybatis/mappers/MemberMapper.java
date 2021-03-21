package com.example.library_system_springboot_mybatis.mappers;

import com.example.library_system_springboot_mybatis.model.Items;
import com.example.library_system_springboot_mybatis.model.Member;
import com.example.library_system_springboot_mybatis.model.Reservations;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MemberMapper {
    final String selectAll="SELECT * FROM member";
    final String insertMember="INSERT INTO member (UserID, Password, Address, FirstName, LastName, PhoneNo, Profession) VALUES (#{userID}, #{password}, #{address}, #{firstName}, #{lastName}, #{phoneNo}, #{profession})";
    final String deleteMember="DELETE FROM member WHERE UserID=#{userID}";
    final String updateMember="UPDATE member " +
            "SET Password=#{password}, Address=#{address}, FirstName=#{firstName}, LastName=#{lastName}, PhoneNo=#{phoneNo}, Profession=#{profession}" +
            "WHERE UserID=#{userID}";
    final String selectAllItems="SELECT * FROM items";
    final String insertReservation="INSERT INTO reservations (ReserveDate, ReturnDate, Duration, Fees, ISBN, UserID, AdminID) " +
            "VALUES (#{reserveDate},#{returnDate},#{duration},#{fees},#{ISBN},#{userID},#{adminID})";


    @Select(selectAllItems)
    List<Items> findAllItems();
    @Insert(insertReservation)
    @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "reservationNo",before = false,resultType = Integer.class)
    void reserveItem(Reservations reservations);

   /* @Insert(insertMember)
   // @SelectKey(statement = "SELECT LAST_INSERT_ID()",keyProperty = "UserID",before = false,resultType = Integer.class)
    void insert(Member member);
    @Update(updateMember)
    void update(Member member);
    @Delete(deleteMember)
    void delete(Member member);*/
}
