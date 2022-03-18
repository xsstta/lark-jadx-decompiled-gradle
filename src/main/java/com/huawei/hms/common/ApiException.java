package com.huawei.hms.common;

import com.huawei.hms.support.api.client.Status;

public class ApiException extends Exception {
    protected final Status mStatus;

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(com.huawei.hms.support.api.client.Status r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.getStatusCode()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r3.getStatusMessage()
            if (r1 == 0) goto L_0x001c
            java.lang.String r1 = r3.getStatusMessage()
            goto L_0x001e
        L_0x001c:
            java.lang.String r1 = ""
        L_0x001e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.mStatus = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.ApiException.<init>(com.huawei.hms.support.api.client.Status):void");
    }
}
