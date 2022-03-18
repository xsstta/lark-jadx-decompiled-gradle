package com.ss.android.lark.watermark;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/watermark/WatermarkControllerKt$receiveTimeTickWhenStarted$receiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WatermarkControllerKt$receiveTimeTickWhenStarted$receiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ Activity f143156a;

    /* renamed from: b */
    final /* synthetic */ Function1 f143157b;

    WatermarkControllerKt$receiveTimeTickWhenStarted$receiver$1(Activity activity, Function1 function1) {
        this.f143156a = activity;
        this.f143157b = function1;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        Log.m165389i("WatermarkController", "onReceive() time tick");
        this.f143157b.invoke(this.f143156a);
    }
}
