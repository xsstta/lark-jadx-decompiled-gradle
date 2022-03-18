package com.larksuite.component.openplatform.core.plugin.op.appscope;

public enum ApplyStatus {
    NOT_APPLY("not_apply"),
    APPLYING("applying"),
    NO_APPLY_LIST("no_apply_list"),
    APPLY_EXCEED_LIMIT("apply_exceed_limit"),
    UNAUTHORIZE_SENSITIVE_PERMISSION("unauthorize_sensitive_permission"),
    UNKNOWN("unknown");
    
    private String status;

    public String getValue() {
        return this.status;
    }

    public static ApplyStatus forNumber(int i) {
        if (i == 0) {
            return NOT_APPLY;
        }
        if (i == 10250) {
            return UNAUTHORIZE_SENSITIVE_PERMISSION;
        }
        switch (i) {
            case 10246:
                return NO_APPLY_LIST;
            case 10247:
                return APPLY_EXCEED_LIMIT;
            case 10248:
                return APPLYING;
            default:
                return UNKNOWN;
        }
    }

    private ApplyStatus(String str) {
        this.status = str;
    }
}
