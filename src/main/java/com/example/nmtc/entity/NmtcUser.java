package com.example.nmtc.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author shkstart
 * @create 2020-04-05 13:22
 */
@Data
@ToString
public class NmtcUser {
    private int userId;
    private String userName;
    private int userAge;
    private String userPhone;
    private String userCreation;
    private String userTurnover;
    private int usetDepartment_id;

}
