package com.bytedance.ee.lark.infra.config.mina.v2;

import android.text.TextUtils;

/* renamed from: com.bytedance.ee.lark.infra.config.mina.v2.b */
public abstract class AbstractC12744b implements AbstractC12751f {
    private boolean needReportEmpty = true;

    /* access modifiers changed from: protected */
    public abstract String loadConfig(String str, String str2);

    @Override // com.bytedance.ee.lark.infra.config.mina.v2.AbstractC12751f
    public void reset() {
        this.needReportEmpty = true;
    }

    public final String getSettingFromLocal(String str, String str2) {
        String loadConfig = loadConfig(str, str2);
        if (TextUtils.isEmpty(loadConfig) && this.needReportEmpty) {
            C12748d.m52749a(str);
            this.needReportEmpty = false;
        }
        return loadConfig;
    }
}
