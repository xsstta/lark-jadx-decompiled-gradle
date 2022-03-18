package com.bytedance.ee.bear.middleground_permission_export.model;

public enum OperateType {
    SEARCH_USERS(0),
    NEW_SHARE_FOLDER_COLLABORATOR_MANAGE(1);
    
    private int type;

    public int getType() {
        return this.type;
    }

    private OperateType(int i) {
        this.type = i;
    }
}
