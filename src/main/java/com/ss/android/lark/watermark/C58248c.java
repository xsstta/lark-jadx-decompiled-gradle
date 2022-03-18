package com.ss.android.lark.watermark;

import android.app.Activity;
import android.content.IntentFilter;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a+\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\b\n\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"TAG", "", "putWatermarkFGData", "", "receiveTimeTickWhenStarted", "Landroid/app/Activity;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "action", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "core_watermark_watermark_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.c */
public final class C58248c {
    /* renamed from: a */
    public static final void m225948a() {
        IWatermarkModuleDependency a = C58275e.m225982a();
        Intrinsics.checkExpressionValueIsNotNull(a, "WatermarkModule.getDependency()");
        Watermark.inst().putFgData("lark.core.mysterious.watermark", a.mo177767d().mo177774a("lark.core.mysterious.watermark"));
    }

    /* renamed from: a */
    public static final void m225949a(Activity activity, LifecycleOwner lifecycleOwner, Function1<? super Activity, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(activity, "$this$receiveTimeTickWhenStarted");
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        lifecycleOwner.getLifecycle().addObserver(new WatermarkControllerKt$receiveTimeTickWhenStarted$observer$1(activity, new WatermarkControllerKt$receiveTimeTickWhenStarted$receiver$1(activity, function1), new IntentFilter("android.intent.action.TIME_TICK")));
    }
}
