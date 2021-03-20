package com.example.library_system_springboot_mybatis.resource;

import com.example.library_system_springboot_mybatis.mappers.ItemsMapper;
import com.example.library_system_springboot_mybatis.mappers.MemberMapper;
import com.example.library_system_springboot_mybatis.model.Items;
import com.example.library_system_springboot_mybatis.model.Member;
import com.example.library_system_springboot_mybatis.model.Reservations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/member")
public class MemberResource {
    private MemberMapper memberMapper;
   // private ItemsMapper itemsMapper;

    public MemberResource(MemberMapper memberMapper /*, ItemsMapper itemsMapper*/) {
        this.memberMapper = memberMapper;
        //this.itemsMapper = itemsMapper;
    }
    //Items PART (SHOW)
    @GetMapping("/allItems")
    public List<Items> getAll()
    {
        return memberMapper.findAllItems();
    }
    @GetMapping("/reserveItem")
    public String reserveItem(){
        Reservations reservations=new Reservations();
        reservations.setAdminID(99);
        reservations.setUserID(456);
        reservations.setISBN(5844);
        reservations.setReserveDate(200321);
        reservations.setReturnDate(200421);
        reservations.setDuration(30);
        reservations.setFees(0);
        memberMapper.reserveItem(reservations);
        return "Item well reserved for "+reservations.getDuration()+" Days";
    }





}
