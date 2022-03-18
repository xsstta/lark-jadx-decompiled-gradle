package com.tt.refer.common.download.engine.model;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IVerifyHandler {

    @Retention(RetentionPolicy.SOURCE)
    public @interface VerifyResult {
    }

    /* renamed from: a */
    int mo235151a(File file);
}
