package com.ss.android.lark.create.groupchat.impl.util;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/util/Utils;", "", "()V", "Companion", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.b.e */
public final class Utils {

    /* renamed from: a */
    public static final Companion f93572a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/util/Utils$Companion;", "", "()V", "hideKeyboard", "", "context", "Landroid/content/Context;", "showKeyboard", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.create.groupchat.impl.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo133837a(Context context) {
            InputMethodManager inputMethodManager = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                Object systemService = activity.getSystemService("input_method");
                if (systemService instanceof InputMethodManager) {
                    inputMethodManager = systemService;
                }
                InputMethodManager inputMethodManager2 = inputMethodManager;
                if (inputMethodManager2 != null) {
                    inputMethodManager2.toggleSoftInput(2, 2);
                }
            }
        }

        /* renamed from: b */
        public final void mo133838b(Context context) {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                Object systemService = activity.getSystemService("input_method");
                if (systemService != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    if (inputMethodManager.isActive() && activity.getCurrentFocus() != null) {
                        View currentFocus = activity.getCurrentFocus();
                        if (currentFocus == null) {
                            Intrinsics.throwNpe();
                        }
                        Intrinsics.checkExpressionValueIsNotNull(currentFocus, "activity.currentFocus!!");
                        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
    }
}
