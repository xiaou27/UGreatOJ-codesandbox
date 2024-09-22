package com.kitek.greatojcodesandbox.model;

import lombok.Data;
import org.apache.catalina.valves.LoadBalancerDrainingValve;

/**
 * 进程执行信息
 *
 * @author VTEFKUECELB
 */
@Data
public class ExecuteMessage {

    /**
     * 进程命令行执行状态码
     **/
    private Integer exitValue;

    /**
     * 进程命令行执行正常信息
     **/
    private String message;
    /**
     * 进程命令行执行错误信息
     **/
    private String errorMessage;
    /**
     * 进程命令行执行消耗时间
     **/
    private Long time;
    /**
     * 进程命令行执行消耗内存
     **/
    private Long memory;

}
