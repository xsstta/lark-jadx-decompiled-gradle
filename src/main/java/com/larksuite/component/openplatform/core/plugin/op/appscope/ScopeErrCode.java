package com.larksuite.component.openplatform.core.plugin.op.appscope;

public enum ScopeErrCode {
    SERVER_INTERNAL_ERROR("SERVER_INTERNAL_ERROR"),
    NO_VISIBILITY("NO_VISIBILITY"),
    APPLICATION_NOT_INSTALLED("APPLICATION_NOT_INSTALLED"),
    EMPTY_SCOPES_NEED_AUTH("EMPTY_SCOPES_NEED_AUTH"),
    APPLY_EXCEED_LIMIT("APPLY_EXCEED_LIMIT"),
    APPLY_DUPLICATED("APPLY_DUPLICATED"),
    UNKNOWN("unknown");
    
    private String status;

    public String getValue() {
        return this.status;
    }

    public static ScopeErrCode forNumber(int i) {
        if (i == 2200) {
            return SERVER_INTERNAL_ERROR;
        }
        if (i == 10228) {
            return NO_VISIBILITY;
        }
        switch (i) {
            case 10245:
                return APPLICATION_NOT_INSTALLED;
            case 10246:
                return EMPTY_SCOPES_NEED_AUTH;
            case 10247:
                return APPLY_EXCEED_LIMIT;
            case 10248:
                return APPLY_DUPLICATED;
            default:
                return UNKNOWN;
        }
    }

    private ScopeErrCode(String str) {
        this.status = str;
    }
}
