package com.demo.pochi.mapper;

import com.demo.pochi.pojo.SysLog;

import org.springframework.stereotype.Component;

@Component
public interface SysLogMapper {
    /**
     * 保存日志
     * @param logger
     */
    void save(SysLog logger);
}
