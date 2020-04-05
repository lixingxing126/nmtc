package com.example.nmtc.service.impl;

import com.example.nmtc.entity.NmtcUser;
import com.example.nmtc.mapper.NmtcUserMapper;
import com.example.nmtc.service.NmtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author shkstart
 * @create 2020-04-05 13:49
 */
@Service
public class NmtcServiceImpl implements NmtcService {

    @Autowired
    private NmtcUserMapper nmtcUserMapper;

    @Override
    public boolean gitNmtc(NmtcUser nmtcUser) {
        boolean b = nmtcUserMapper.gitNmtc(nmtcUser);
        return b;
    }

    @Override
    public NmtcUser gitNmtcId(int id) {
        NmtcUser nmtcUser = nmtcUserMapper.gitNmtcId(id);
        return nmtcUser;
    }

    @Override
    public NmtcUser getById(int id) {
        return nmtcUserMapper.getById(id);
    }


}
