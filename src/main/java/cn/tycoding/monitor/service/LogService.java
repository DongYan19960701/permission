package cn.tycoding.monitor.service;

import cn.tycoding.common.service.BaseService;
import cn.tycoding.monitor.entity.SysLog;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.scheduling.annotation.Async;

import java.util.List;

/**
 * @author tycoding
 * @date 2019-03-13
 */
public interface LogService extends BaseService<SysLog> {

    List<SysLog> findByPage(SysLog log);

    void deleteLogs(List<Long> ids);

    @Async
    void saveLog(ProceedingJoinPoint proceedingJoinPoint, SysLog log) throws JsonProcessingException;
}
