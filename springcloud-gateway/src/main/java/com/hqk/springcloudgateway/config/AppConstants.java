package com.hqk.springcloudgateway.config;

/**
 * @version V1.0
 * @author: hqk
 * @date: 2020/5/12 15:59
 * @Description:
 */
public class AppConstants {


    public static final Integer SUCCESS_CODE = 200;

    public static final Integer ERROR_CODE = 401;

    /**
     *  POST
     */
    public static final String METHOD_POST = "ticket";

    /**
     *  GET
     */
    public static final String METHOD_GET = "ticket";

    /**
     *  token 参数
     */
    public static final String TOKEN = "ticket";

    /**
     * redis token
     */
    public static final String REDIS_KEY_TOKEN = "UMI:TICKET:";

    /**
     * UTF-8 字符集
     */
    public static final String UTF8 = "UTF-8";


    /**
     * 参数管理 cache name
     */
    public static final String SYS_CONFIG_CACHE = "sys-config";

    /**
     * 参数管理 cache key
     */
    public static final String SYS_CONFIG_KEY = "sys_config:";


    public static final String REPLACE_CHAR = "&";


    public static final String DEFAULT_URL_SPLIT = "/";

    public static final String DEFAULT_INFO_SPLIT = "-";

}
