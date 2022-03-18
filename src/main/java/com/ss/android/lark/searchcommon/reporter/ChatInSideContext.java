package com.ss.android.lark.searchcommon.reporter;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0006\u0010\u0012\u001a\u00020\u000fJ\b\u0010\u0013\u001a\u00020\u0011H\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/searchcommon/reporter/ChatInSideContext;", "", "()V", "chatId", "", "chatId$annotations", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "chatType", "chatType$annotations", "getChatType", "setChatType", "inChatContext", "", "chatIn", "", "inChat", "reset", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.d.a */
public final class ChatInSideContext {

    /* renamed from: a */
    public static final ChatInSideContext f133144a = new ChatInSideContext();

    /* renamed from: b */
    private static boolean f133145b;

    /* renamed from: c */
    private static String f133146c = "";

    /* renamed from: d */
    private static String f133147d = "";

    @JvmStatic
    /* renamed from: c */
    public static final void m208822c() {
        f133145b = true;
    }

    private ChatInSideContext() {
    }

    /* renamed from: a */
    public static final String m208818a() {
        return f133146c;
    }

    /* renamed from: b */
    public static final String m208820b() {
        return f133147d;
    }

    /* renamed from: d */
    public final boolean mo183805d() {
        return f133145b;
    }

    @JvmStatic
    /* renamed from: e */
    public static final void m208823e() {
        f133145b = false;
        f133146c = "";
        f133147d = "";
    }

    /* renamed from: a */
    public static final void m208819a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f133146c = str;
    }

    /* renamed from: b */
    public static final void m208821b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        f133147d = str;
    }
}
