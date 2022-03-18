package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class MultiSelectParams implements BaseJSModel {
    private List<String> options;
    private List<String> selectOption;

    public List<String> getOptions() {
        return this.options;
    }

    public List<String> getSelectOption() {
        return this.selectOption;
    }

    public void setOptions(List<String> list) {
        this.options = list;
    }

    public void setSelectOption(List<String> list) {
        this.selectOption = list;
    }
}
