package com.ss.android.lark.applink;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface AppLinkSource {

    /* renamed from: a */
    public static final String[] f73032a = {"unknown", "app", "scan", "qrcode", "card", "p2p_message", "group_message", "mini_program", "webview", "chat", "appcenter", "doc", "thread_topic"};

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
    }
}
