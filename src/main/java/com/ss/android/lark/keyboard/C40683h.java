package com.ss.android.lark.keyboard;

import com.ss.android.lark.chat.utils.ChatParamUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"THREAD_ID", "", "extraParam", "", "", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "inputPlusClick", "inputPlusView", "keyMainClick", "toolBarClick", "toolBarView", "im_keyboard_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.h */
public final class C40683h {
    /* renamed from: a */
    public static final String m160851a(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "$this$keyMainClick");
        int i = C40684i.f103326a[keyboardScene.ordinal()];
        if (i == 1 || i == 2) {
            return "im_chat_main_click";
        }
        return "";
    }

    /* renamed from: b */
    public static final String m160852b(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "$this$toolBarClick");
        int i = C40684i.f103327b[keyboardScene.ordinal()];
        if (i == 1 || i == 2) {
            return "im_chat_toolbar_click";
        }
        return "";
    }

    /* renamed from: c */
    public static final String m160853c(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "$this$toolBarView");
        int i = C40684i.f103328c[keyboardScene.ordinal()];
        if (i == 1 || i == 2) {
            return "im_chat_toolbar_view";
        }
        return "";
    }

    /* renamed from: d */
    public static final String m160854d(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "$this$inputPlusClick");
        int i = C40684i.f103329d[keyboardScene.ordinal()];
        if (i == 1 || i == 2) {
            return "im_chat_input_plus_click";
        }
        return "";
    }

    /* renamed from: e */
    public static final String m160855e(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "$this$inputPlusView");
        int i = C40684i.f103330e[keyboardScene.ordinal()];
        if (i == 1 || i == 2) {
            return "im_chat_input_plus_view";
        }
        return "";
    }

    /* renamed from: f */
    public static final Map<String, Object> m160856f(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "$this$extraParam");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String a = ChatParamUtils.m133134a();
        if (a != null && keyboardScene == KeyboardScene.ThreadMain) {
            linkedHashMap.put("thread_id", a);
        }
        return linkedHashMap;
    }
}
