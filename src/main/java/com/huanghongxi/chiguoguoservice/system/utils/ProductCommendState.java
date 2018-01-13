package com.huanghongxi.chiguoguoservice.system.utils;

public enum ProductCommendState {

    SHOW("显示", 0),
    HIDDEN("隐藏", 1);

    private String state;
    private Integer value;

    ProductCommendState(String state, int value) {
        this.state = state;
        this.value = value;
    }

    public static String getState(int value) {
        for (ProductCommendState state : ProductCommendState.values()) {
            if (state.getValue().equals(value)) {
                return state.getState();
            }
        }
        return null;
    }

    public String getState() {
        return state;
    }

    public Integer getValue() {
        return value;
    }
}
