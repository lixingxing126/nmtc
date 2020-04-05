package com.example.nmtc.mapper;

import com.example.nmtc.entity.NmtcUser;

/**
 * @author shkstart
 * @create 2020-04-05 14:00
 */
public interface NmtcUserMapper {
    /**
     * 通用mapper
     * @param nmtcUser
     * @return
     */
    boolean gitNmtc(NmtcUser nmtcUser);

    /**
     * 用ID返回一个对象
     * @param id
     * @return
     */
    NmtcUser gitNmtcId(int id);


}
