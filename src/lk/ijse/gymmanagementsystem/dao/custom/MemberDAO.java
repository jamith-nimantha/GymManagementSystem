/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagementsystem.dao.custom;

import lk.ijse.gymmanagementsystem.dao.CrudDAO;
import lk.ijse.gymmanagementsystem.entity.Member;

/**
 *
 * @author jamith
 */
public interface MemberDAO extends CrudDAO<Member, String>{
    public Member searchMemberIDUsingFullName(String name) throws Exception;
}
