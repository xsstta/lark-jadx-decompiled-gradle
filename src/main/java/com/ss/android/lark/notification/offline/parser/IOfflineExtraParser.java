package com.ss.android.lark.notification.offline.parser;

import android.content.Intent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IOfflineExtraParser {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ParserType {
    }

    /* renamed from: a */
    int mo169635a();

    /* renamed from: b */
    Intent mo169636b();
}
