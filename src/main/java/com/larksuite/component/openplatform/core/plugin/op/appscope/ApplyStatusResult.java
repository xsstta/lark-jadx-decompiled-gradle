package com.larksuite.component.openplatform.core.plugin.op.appscope;

public enum ApplyStatusResult {
    USER_APPLY(1, "user agrees to apply"),
    USER_CANCEL_APPY(2, "user cancels application"),
    USER_APPLYING(3, "administrator is processing"),
    NO_APPLY_LIST(4, "no application list to apply"),
    APPLY_EXCEED_LIMIT(5, "the number of applications exceeds the limit"),
    UNKNOWN(-1, "unknown error");
    
    private String msg;
    private int status;

    public String getMsg() {
        return this.msg;
    }

    public int getStatus() {
        return this.status;
    }

    public static ApplyStatusResult forNumber(int i) {
        ApplyStatusResult[] values = values();
        for (int i2 = 0; i2 < values.length; i2++) {
            if (values[i2].getStatus() == i) {
                return values[i2];
            }
        }
        return UNKNOWN;
    }

    private ApplyStatusResult(int i, String str) {
        this.status = i;
        this.msg = str;
    }
}
