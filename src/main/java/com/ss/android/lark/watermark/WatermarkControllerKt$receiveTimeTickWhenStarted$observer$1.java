package com.ss.android.lark.watermark;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.lifecycle.AbstractC1168n;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/watermark/WatermarkControllerKt$receiveTimeTickWhenStarted$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", ShareHitPoint.f121868c, "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class WatermarkControllerKt$receiveTimeTickWhenStarted$observer$1 implements AbstractC1168n {

    /* renamed from: a */
    final /* synthetic */ Activity f143153a;

    /* renamed from: b */
    final /* synthetic */ WatermarkControllerKt$receiveTimeTickWhenStarted$receiver$1 f143154b;

    /* renamed from: c */
    final /* synthetic */ IntentFilter f143155c;

    @Override // androidx.lifecycle.AbstractC1168n
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, ShareHitPoint.f121868c);
        Intrinsics.checkParameterIsNotNull(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            Log.m165389i("WatermarkController", "registerReceiver");
            m225863a(this.f143153a, this.f143154b, this.f143155c);
        } else if (event == Lifecycle.Event.ON_STOP) {
            Log.m165389i("WatermarkController", "unregisterReceiver");
            this.f143153a.unregisterReceiver(this.f143154b);
        }
    }

    WatermarkControllerKt$receiveTimeTickWhenStarted$observer$1(Activity activity, WatermarkControllerKt$receiveTimeTickWhenStarted$receiver$1 watermarkControllerKt$receiveTimeTickWhenStarted$receiver$1, IntentFilter intentFilter) {
        this.f143153a = activity;
        this.f143154b = watermarkControllerKt$receiveTimeTickWhenStarted$receiver$1;
        this.f143155c = intentFilter;
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    /* renamed from: a */
    public static Intent m225863a(Activity activity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return activity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }
}
