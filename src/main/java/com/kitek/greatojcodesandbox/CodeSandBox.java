package com.kitek.greatojcodesandbox;


import com.kitek.greatojcodesandbox.model.ExecuteCodeRequest;
import com.kitek.greatojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 *
 * @author VTEFKUECELB
 */
public interface CodeSandBox {

    /**
     * 代码沙箱执行代码接口
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
