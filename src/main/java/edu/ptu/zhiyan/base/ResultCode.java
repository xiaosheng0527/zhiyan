package edu.ptu.zhiyan.base;

public enum ResultCode {

    OK("200"),
    FAIL("400"),
    INTERENAL_ERROR("500");

    public final String code;
    ResultCode(String code) {
        this.code=code;
    }

    public String getCode() {
        return code;
    }
}
