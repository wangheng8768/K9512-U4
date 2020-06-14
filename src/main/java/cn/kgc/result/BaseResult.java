package cn.kgc.result;

import java.io.Serializable;

/**
 * @Author 王恒
 * @Date 2020/6/5 16:40
 * @Description :
 * @Created by 王恒
 */
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 1L;

    //表示失败
    public static final int RESULT_FAIL = 0;
    //表示成功
    public static final int RESULT_SUCCESS = 1;

    //返回代码
    private Integer  code;   //表示状态码
    //返回消息
    private String message;  //表示提示信息（如错误的描述信息）
    //返回对象
    private  Object data;   //表示数据


    public BaseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public BaseResult(Integer code, Object object) {
        this.code = code;
        this.data = object;
    }
    public BaseResult(Integer code, String message, Object object) {
        this.code = code;
        this.message = message;
        this.data = object;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}