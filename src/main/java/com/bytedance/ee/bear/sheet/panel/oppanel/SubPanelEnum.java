package com.bytedance.ee.bear.sheet.panel.oppanel;

public enum SubPanelEnum {
    insert(C11277d.class.getName()),
    operation(C11279e.class.getName()),
    style(C11280f.class.getName());
    
    public String fragment;

    private SubPanelEnum(String str) {
        this.fragment = str;
    }
}
