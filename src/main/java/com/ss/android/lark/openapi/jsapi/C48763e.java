package com.ss.android.lark.openapi.jsapi;

import android.text.TextUtils;

/* renamed from: com.ss.android.lark.openapi.jsapi.e */
public class C48763e extends AbstractC48760b {
    @Override // com.ss.android.lark.openapi.jsapi.AbstractC48760b
    /* renamed from: a */
    public boolean mo51068a() {
        return false;
    }

    @Override // com.ss.android.lark.openapi.jsapi.AbstractC48760b
    /* renamed from: b */
    public String mo51069b() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{\"errorCode\":" + this.f122528b);
        if (!TextUtils.isEmpty(this.f122529c)) {
            stringBuffer.append(",\"errorMessage\":\"" + this.f122529c + "\"");
        }
        stringBuffer.append("}");
        return stringBuffer.toString();
    }

    public C48763e(int i, String str) {
        super(i, str);
    }
}
