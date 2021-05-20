package edu.ptu.zhiyan.base;
import edu.ptu.zhiyan.base.ResultCode;
public class Result {
    private String code;
    private String msg;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Result ok() {
        Result result = new Result();
        result.code = ResultCode.OK.getCode();
        return result;
    }


    public String getMsg() {
        return msg;
    }



    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Result ok(Object data) {
        Result result = new Result();
        result.code = ResultCode.OK.getCode();
        result.data = data;
        return result;
    }
    public static Result ok(String message) {

        Result result = new Result();
        result.msg=message;
        result.code = ResultCode.OK.getCode();
        return result;
    }
    public static Result ok(Object data,String message) {

        Result result = new Result();
        result.msg=message;
        result.code = ResultCode.OK.getCode();
        result.data = data;
        return result;
    }

    public static Result fail(String message) {
        Result result = new Result();
        result.code = ResultCode.FAIL.getCode();
        result.msg = message;
        return result;
    }


}
