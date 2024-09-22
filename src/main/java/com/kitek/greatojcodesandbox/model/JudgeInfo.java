package com.kitek.greatojcodesandbox.model;

import lombok.Data;

/**
 * 判题信息
 * @author VTEFKUECELB
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 执行代码进程-消耗内存
     */
    private Long memory;

    /**
     * 执行代码进程-消耗时间（KB）
     */
    private Long time;
}
