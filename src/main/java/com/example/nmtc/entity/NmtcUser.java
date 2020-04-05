package com.example.nmtc.entity;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

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
    private int userPhone;
    private LocalDateTime userCreation;
    private LocalDateTime userTurnover;
    private int usetDepartmentId;


}
