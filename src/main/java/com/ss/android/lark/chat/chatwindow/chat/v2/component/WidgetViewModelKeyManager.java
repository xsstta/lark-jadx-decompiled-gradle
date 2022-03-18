package com.ss.android.lark.chat.chatwindow.chat.v2.component;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/WidgetViewModelKeyManager;", "", "()V", "DEFAULT_KEY", "", "currentIndex", "", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "getViewModelKey", "modelClass", "Ljava/lang/Class;", "increase", "", "reset", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.i */
public final class WidgetViewModelKeyManager {

    /* renamed from: a */
    public static final WidgetViewModelKeyManager f86344a = new WidgetViewModelKeyManager();

    /* renamed from: b */
    private static final String f86345b = f86345b;

    /* renamed from: c */
    private static int f86346c;

    /* renamed from: a */
    public final void mo123199a() {
        f86346c = 0;
    }

    private WidgetViewModelKeyManager() {
    }

    /* renamed from: b */
    public final void mo123200b() {
        f86346c++;
    }

    /* renamed from: a */
    public final String mo123198a(Class<?> cls) {
        Intrinsics.checkParameterIsNotNull(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return f86345b + f86346c + canonicalName;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
