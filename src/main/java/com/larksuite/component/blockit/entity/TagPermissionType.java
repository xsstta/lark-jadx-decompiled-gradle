package com.larksuite.component.blockit.entity;

public enum TagPermissionType {
    Default(0),
    Public(1),
    Private(2);
    
    int value;

    public int value() {
        return this.value;
    }

    private TagPermissionType(int i) {
        this.value = i;
    }
}
