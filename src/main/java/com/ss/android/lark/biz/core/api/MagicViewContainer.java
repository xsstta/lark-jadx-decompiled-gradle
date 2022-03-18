package com.ss.android.lark.biz.core.api;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\u0003R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "getContextRef", "()Ljava/lang/ref/WeakReference;", "getContext", "core_api_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.core.api.aw */
public final class MagicViewContainer {

    /* renamed from: a */
    private final WeakReference<Context> f73946a;

    /* renamed from: a */
    public final Context mo105615a() {
        return this.f73946a.get();
    }

    public MagicViewContainer(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f73946a = new WeakReference<>(context);
    }
}
