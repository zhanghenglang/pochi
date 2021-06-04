package com.demo.pochi.context;

import com.demo.pochi.pojo.SysLog;
import lombok.Data;

/**
 * 本地线程上下文
 * 用来存储在同一个线程中可能会用到的全局变量
 */
@Data
public class SystemContext {

    /**
     * 日志实体
     */
    private SysLog sysLog = new SysLog();

    /**
     * 是否记录日志
     */
    private boolean isLog = false;

    /**
     * 线程本地内存中的变量
     */
    private static ThreadLocal<SystemContext> threadLocal = new ThreadLocal<>();

    public static SystemContext get() {
        if (threadLocal.get() == null) {
            SystemContext threadLocalContext = new SystemContext();
            threadLocal.set(threadLocalContext);
        }
        return threadLocal.get();
    }

    public void remove() {
        threadLocal.remove();
    }

}
