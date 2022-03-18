package com.ss.android.lark.dependency;

import com.ss.android.lark.C29990c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/dependency/ChatFGUtils;", "", "()V", "isSupportFolderMessage", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.dependency.a */
public final class ChatFGUtils {

    /* renamed from: a */
    public static final ChatFGUtils f94019a = new ChatFGUtils();

    /* renamed from: b */
    private static final boolean f94020b;

    private ChatFGUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m143689a() {
        return f94020b;
    }

    static {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        f94020b = b.mo134586n().mo134685a("messenger.message_folder_receive");
    }
}
