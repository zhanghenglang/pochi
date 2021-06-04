package com.demo.pochi.service;

import com.demo.pochi.pojo.SysLog;

public interface SysLogService {

    /**
     * 保存日志
     * @param logger
     */
    void save(SysLog logger);
}
