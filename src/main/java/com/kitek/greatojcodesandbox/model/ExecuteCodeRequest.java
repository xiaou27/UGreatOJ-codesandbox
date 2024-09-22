package com.kitek.greatojcodesandbox.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 执行程序请求信息
 *
 * @author VTEFKUECELB
 * 接收后端业务请求
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExecuteCodeRequest {

    /**
     * 题目输入用例
     **/
    private List<String> inputList;
    /**
     * 用户提交代码
     **/
    private String code;
    /**
     * 代码语言
     **/
    private String language;
}
