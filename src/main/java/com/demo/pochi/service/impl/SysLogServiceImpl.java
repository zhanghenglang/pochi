package com.demo.pochi.service.impl;

import com.demo.pochi.mapper.SysLogMapper;
import com.demo.pochi.pojo.SysLog;
import com.demo.pochi.service.SysLogService;
import com.demo.pochi.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLogServiceImpl implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;
    @Autowired
    private IdWorker idWorker;

    @Override
    public void save(SysLog logger) {
        logger.setLogId(idWorker.nextId());
        sysLogMapper.save(logger);
    }
}
