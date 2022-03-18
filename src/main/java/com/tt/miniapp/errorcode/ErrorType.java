package com.tt.miniapp.errorcode;

public enum ErrorType {
    LOAD_ERROR("A"),
    RUN_ERROR("B"),
    NETWORK_ERROR("C"),
    APP_NOT_EXIST("D"),
    PERMISSION_ERROR("E"),
    LOGIN_STATUS_ERROR("F"),
    DEVICE_MEMORY_ERROR("G"),
    APP_FILE_LOAD_ERROR("H"),
    APP_FILE_RUN_ERROR("I"),
    JSSDK_ERROR("J"),
    APP_ENGINE_ERROR("K"),
    APP_META_ERROR("L"),
    APP_ENVIRONMENT_ERROR("M"),
    STORAGE_SPACE_ERROR("N"),
    APP_PREVIEW_ERROR("O"),
    VERSION_ERROR("P");
    
    private String status;

    public String getValue() {
        return this.status;
    }

    private ErrorType(String str) {
        this.status = str;
    }
}
