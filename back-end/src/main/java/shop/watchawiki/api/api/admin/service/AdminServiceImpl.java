package shop.watchawiki.api.api.admin.service;
import org.springframework.stereotype.Service;
import shop.watchawiki.api.api.admin.domain.AdminVO;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class AdminServiceImpl  implements AdminService{
    @Override
    public void saveID(AdminVO AVO){

    }
    @Override
    public void deleteID(String ID){

    }
    @Override
    public boolean loginID(String ID, String PW){
        return false;
    }
    @Override
    public ArrayList<AdminVO> viewAdminAccountList() {    //전체 관리자 조회

        return null;
    }

}
