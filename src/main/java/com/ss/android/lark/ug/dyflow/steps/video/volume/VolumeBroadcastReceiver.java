package com.ss.android.lark.ug.dyflow.steps.video.volume;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.lark.utils.C57782ag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/volume/VolumeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "listener", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/OnVolumeChangeListener;", "(Lcom/ss/android/lark/ug/dyflow/steps/video/volume/OnVolumeChangeListener;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class VolumeBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final Companion f141635a = new Companion(null);

    /* renamed from: b */
    private OnVolumeChangeListener f141636b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/video/volume/VolumeBroadcastReceiver$Companion;", "", "()V", "ACTION_VOLUME_CHANGE", "", "registerReceiver", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/VolumeBroadcastReceiver;", "context", "Landroid/content/Context;", "listener", "Lcom/ss/android/lark/ug/dyflow/steps/video/volume/OnVolumeChangeListener;", "unregisterReceiver", "", "receiver", "Landroid/content/BroadcastReceiver;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.video.volume.VolumeBroadcastReceiver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo195092a(Context context, BroadcastReceiver broadcastReceiver) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(broadcastReceiver, "receiver");
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public final VolumeBroadcastReceiver mo195091a(Context context, OnVolumeChangeListener aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            try {
                VolumeBroadcastReceiver volumeBroadcastReceiver = new VolumeBroadcastReceiver(aVar);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                m223079a(context, volumeBroadcastReceiver, intentFilter);
                return volumeBroadcastReceiver;
            } catch (Exception unused) {
                return null;
            }
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m223079a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }
    }

    public VolumeBroadcastReceiver(OnVolumeChangeListener aVar) {
        this.f141636b = aVar;
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        OnVolumeChangeListener aVar;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (C57782ag.m224242a("android.media.VOLUME_CHANGED_ACTION", str) && (aVar = this.f141636b) != null) {
            aVar.mo195079a();
        }
    }
}
