package com.example.library_system_springboot_mybatis.resource;


import com.example.library_system_springboot_mybatis.mappers.AuthenticationSystemMapper;
import com.example.library_system_springboot_mybatis.mappers.ItemsMapper;
import com.example.library_system_springboot_mybatis.mappers.LibrarianMapper;
import com.example.library_system_springboot_mybatis.mappers.MemberMapper;
import com.example.library_system_springboot_mybatis.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/librarian")
public class LibrarianResource {
private LibrarianMapper librarianMapper;
private AuthenticationSystemMapper authenticationSystemMapper;
private ItemsMapper itemsMapper;
private MemberMapper memberMapper;

    public LibrarianResource(LibrarianMapper librarianMapper, AuthenticationSystemMapper authenticationSystemMapper, ItemsMapper itemsMapper, MemberMapper memberMapper) {
        this.librarianMapper = librarianMapper;
        this.authenticationSystemMapper=authenticationSystemMapper;
        this.itemsMapper=itemsMapper;
        this.memberMapper=memberMapper;
    }

    // Librarian Part (select,insert,update and delete)
    @GetMapping("/all")
    public List<Librarian> getAll(){return librarianMapper.findAllLibrarians();}
    @GetMapping("/insertion")
    public String insertion()
    {
        boolean verif=false;
        Librarian librarian=new Librarian(/*"RaouiaRaouia1456","Raouia","Lokbani","3529 Miskolc",12365*/);
        librarian.setAdminID(452);
        librarian.setPassword("admin452admin;;");
        librarian.setFirstName("Raouia");
        librarian.setLastName("Lokbani");
        librarian.setAddress("3529 Miskolc");
        librarian.setPhoneNo(1452);

        for(AuthentificationSystem as: authenticationSystemMapper.findAll() )
        {
            if(as.getLoginID()==librarian.getAdminID()) {
                verif=true;
                break;
            }else verif =false;
        }
        if(verif)
        {
            return "USER ALREADY EXISTS";
        }else{
           AuthentificationSystem authentificationSystem=new AuthentificationSystem(librarian.getAdminID(),librarian.getPassword());
           authenticationSystemMapper.insertUser(authentificationSystem);
           librarianMapper.insertLibrarian(librarian);
            return "Librarian Well Inserted";
        }



    }
    @GetMapping("/update")
    public String update()
    {
        Librarian librarian=new Librarian();
        librarian.setAdminID(99);
        librarian.setPassword("RaouiaAdmin99");
        librarian.setAddress("3515 Miskolc");
        librarian.setLastName("Raouia");
        librarian.setFirstName("Lokbani");
        librarian.setPhoneNo(5463);
        librarianMapper.updateLibrarian(librarian);
        AuthentificationSystem authentificationSystem=new AuthentificationSystem();
        authentificationSystem.setLoginID(librarian.getAdminID());
        authentificationSystem.setPassword(librarian.getPassword());
        authenticationSystemMapper.updateUser(authentificationSystem);
        return "Librarian information well updated";
    }
    @GetMapping("/delete")
    public String delete()
    {
        Librarian librarian=new Librarian();
        librarian.setAdminID(152);
        librarianMapper.deleteLibrarian(librarian);
        AuthentificationSystem authentificationSystem=new AuthentificationSystem();
        authentificationSystem.setLoginID(librarian.getAdminID());
        authenticationSystemMapper.deleteUser(authentificationSystem);
        return "Librarian well deleted";
    }


    // Items Part (select,insert,update and delete)
    @GetMapping("/allItems")
    public List<Items> getAllItems(){
        return librarianMapper.findAllItems();
    }
    @GetMapping("/insertionItem")
    public String insertionItem()
    {
        boolean verif=false;
        Items items=new Items();
        items.setISBN(6321);
        items.setTitle("Algérie mon pays");
        items.setAuthNo(4);
        items.setPrice(15000);
        items.setCategory("History");
        items.setEdition("Patrie Edition");

        for(Items i: librarianMapper.findAllItems() )
        {
            if(i.getISBN()==items.getISBN()) {
                verif=true;
                break;
            }else verif =false;
        }
        if(verif)
        {
            return "ITEM ALREADY EXISTS";
        }else{
            librarianMapper.insertItem(items);
            return "Item Well Inserted";
        }
    }
    @GetMapping("/updateItem")
    public String updateItem()
    {
        Items items=new Items();
        items.setISBN(389);
        items.setTitle("Into Football");
        items.setAuthNo(2);
        items.setPrice(7000);
        items.setCategory("Sports");
        items.setEdition("Foot Academy");
        librarianMapper.updateItem(items);
        return "Item information well updated";
    }
    @GetMapping("/deleteItem")
    public String deleteItem()
    {
        Items items=new Items();
        items.setISBN(1563);
        librarianMapper.deleteItem(items);
        return "Item well deleted";
    }


    // Members Part (select,insert,update and delete)
    @GetMapping("/allMembers")
    public List<Member> getAllMembers(){return librarianMapper.findAllMembers();}
    @GetMapping("/insertionMember")
    public String insertionMember()
    {
        boolean verif=false;
        Member member=new Member();
        member.setUserID(88);
        member.setAddress("141414 Lyon");
        member.setFirstName("Meriem");
        member.setLastName("Ghali");
        member.setPassword("MeriemCLMF00");
        member.setPhoneNo(4587);
        member.setProfession("Student");

        for(Member m: librarianMapper.findAllMembers() )
        {
            if(m.getUserID()==member.getUserID()) {
                verif=true;
                break;
            }else verif =false;
        }
        if(verif)
        {
            return "MEMBER ALREADY EXISTS";
        }else{
            AuthentificationSystem authentificationSystem=new AuthentificationSystem(member.getUserID(),member.getPassword());
            authenticationSystemMapper.insertUser(authentificationSystem);
            librarianMapper.insertMember(member);
            return "Member Well Inserted";
        }
 }

    @GetMapping("/updateMember")
    public String updateMember()
    {
        Member member=new Member();
        member.setUserID(660);
        member.setAddress("3030 Eger");
        member.setFirstName("Philip");
        member.setLastName("Lahm");
        member.setPassword("sdlo8854djfxzjsj@skdj");
        member.setPhoneNo(9852);
        member.setProfession("Teacher");
        librarianMapper.updateMember(member);
        AuthentificationSystem authentificationSystem=new AuthentificationSystem(member.getUserID(),member.getPassword());
        authenticationSystemMapper.updateUser(authentificationSystem);
        return "Member information well updated";
    }
    @GetMapping("/deleteMember")
    public String deleteMember()
    {
        Member member=new Member();
        member.setUserID(660);
        librarianMapper.deleteMember(member);
        AuthentificationSystem authentificationSystem=new AuthentificationSystem(member.getUserID(),member.getPassword());
        authenticationSystemMapper.deleteUser(authentificationSystem);
        return "Member well deleted";
    }

    //RESERVATIONS PART

    @GetMapping("/allReservations")
    public List<Reservations> allReservations()
    {
        return librarianMapper.findAllReservations();
    }

}
