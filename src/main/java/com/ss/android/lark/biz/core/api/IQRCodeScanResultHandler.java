package com.ss.android.lark.biz.core.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IQRCodeScanResultHandler {

    @Retention(RetentionPolicy.SOURCE)
    public @interface QrCodeSource {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScanFormat {
    }

    /* renamed from: a */
    boolean mo105369a(String str, aj ajVar, int i);
}
