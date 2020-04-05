package com.example.nmtc.service.impl;

import com.example.nmtc.entity.NmtcUser;
import com.example.nmtc.mapper.NmtcUserMapper;
import com.example.nmtc.service.NmtcService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author shkstart
 * @create 2020-04-05 13:49
 */
public class NmtcServiceImpl implements NmtcService {

    @Autowired
    private NmtcUserMapper nmtcUserMapper;

    @Override
    public boolean gitNmtc(NmtcUser nmtcUser) {
        nmtcUserMapper.gitNmtc(nmtcUser);
        return false;
    }

}
