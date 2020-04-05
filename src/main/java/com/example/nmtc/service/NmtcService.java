package com.example.nmtc.service;


import com.example.nmtc.entity.NmtcUser;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-05 13:45
 */
public interface NmtcService {
    /**
     * 新增方法
     * @param nmtcUser
     * @return
     */
    boolean gitNmtc(NmtcUser nmtcUser);

    NmtcUser gitNmtcId(int id);


}
