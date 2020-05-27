package com.hqk.springcloudgateway.dto;



import com.hqk.springcloudgateway.config.AppConstants;

import java.util.HashMap;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/12 19:21
 * @Description: 通用返回
 */
public class CommonResult extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    /** 状态码 */
    public static final String CODE_TAG = "code";

    /** 返回内容 */
    public static final String MSG_TAG = "msg";

    /** 数据对象 */
    public static final String DATA_TAG = "data";

    /**
     * 初始化一个新创建的 CommonResult 对象，使其表示一个空消息。
     */
    public CommonResult() {
    }

    /**
     * 初始化一个新创建的 CommonResult 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     */
    public CommonResult(int code, String msg)
    {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
    }

    /**
     * 初始化一个新创建的 CommonResult 对象
     *
     * @param code 状态码
     * @param msg 返回内容
     * @param data 数据对象
     */
    public CommonResult(int code, String msg, Object data)
    {
        super.put(CODE_TAG, code);
        super.put(MSG_TAG, msg);
       /* if (data!=null)
        {
            super.put(DATA_TAG, data);
        }*/
        super.put(DATA_TAG, data);
    }

    /**
     * 返回成功消息
     *
     * @return 成功消息
     */
    public static CommonResult success()
    {
        return CommonResult.success("操作成功");
    }

    /**
     * 返回成功数据
     *
     * @return 成功消息
     */
    public static CommonResult success(Object data)
    {
        return CommonResult.success("操作成功", data);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @return 成功消息
     */
    public static CommonResult success(String msg)
    {
        return CommonResult.success(msg, null);
    }

    /**
     * 返回成功消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 成功消息
     */
    public static CommonResult success(String msg, Object data)
    {
        return new CommonResult(AppConstants.SUCCESS_CODE, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @return
     */
    public static CommonResult error()
    {
        return CommonResult.error("操作失败");
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @return 警告消息
     */
    public static CommonResult error(String msg)
    {
        return CommonResult.error(msg, null);
    }

    /**
     * 返回错误消息
     *
     * @param msg 返回内容
     * @param data 数据对象
     * @return 警告消息
     */
    public static CommonResult error(String msg, Object data)
    {
        return new CommonResult(AppConstants.ERROR_CODE, msg, data);
    }

    /**
     * 返回错误消息
     *
     * @param code 状态码
     * @param msg 返回内容
     * @return 警告消息
     */
    public static CommonResult error(int code, String msg)
    {
        return new CommonResult(code, msg, null);
    }
}
