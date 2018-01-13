package com.huanghongxi.chiguoguoservice.system.utils;

import java.io.Serializable;

public enum ResponseState implements Serializable {
    FAIL(0, "失败"),
    SUCCESS(1, "成功"),
    WARNING(2, "警告");

    private int code;
    private String codeInfo;

    private ResponseState(int code, String codeInfo) {
        this.code = code;
        this.codeInfo = codeInfo;
    }

    public int getCode() {
        return this.code;
    }

    public String getCodeInfo() {
        return this.codeInfo;
    }

    public String toString() {
        return super.toString().toLowerCase();
    }

    public static ResponseState byCode(int code) {
        ResponseState[] states = values();

        for(int i = 0; i < states.length; ++i) {
            ResponseState state = states[i];
            if (state.getCode() == code) {
                return state;
            }
        }

        return FAIL;
    }
}