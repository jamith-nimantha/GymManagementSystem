/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gymmanagementsystem.common;

import java.io.IOException;
import java.sql.SQLException;
import java.text.NumberFormat;
import lk.ijse.gymmanagementsystem.controller.IDGenaratorController;

/**
 *
 * @author jamith
 */
public class IDGenarator {
    public static String getNewID(String tableName, String colName, String prifix) throws SQLException, ClassNotFoundException, IOException {
        String lastId = IDGenaratorController.getLastID(tableName, colName);
        if (lastId != null) {
            int id = Integer.parseInt(lastId.split(prifix)[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(4);
            numberFormat.setGroupingUsed(false);
            String newID = numberFormat.format(id);
            return prifix + newID;
        } else {
            return prifix+"0001";
        }
    }
}
