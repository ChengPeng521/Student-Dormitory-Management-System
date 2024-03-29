package com.cp.service.impl;

import com.cp.dao.RegisterDao;
import com.cp.pojo.Register;
import com.cp.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterDao registerdao;

    @Override
    public Integer addRegister(Register d) {
        return registerdao.addRegister(d);
    }

    @Override
    public Integer updateRegister(Register d) {
        return registerdao.updateRegister(d);
    }

    @Override
    public Integer deleteRegister(Integer id) {
        return registerdao.deleteRegister(id);
    }

    @Override
    public List<Register> query() {
        return registerdao.query();
    }

    @Override
    public Register get(Integer id) {
        return registerdao.get(id);
    }
}
