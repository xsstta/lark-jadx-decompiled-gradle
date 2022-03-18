package com.ss.android.lark.setting.service.usersetting.appearance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import me.ele.lancet.base.annotations.Skip;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/UiModeChangeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "onUiModeChange", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "getOnUiModeChange", "()Lkotlin/jvm/functions/Function0;", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class UiModeChangeBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final Companion f135035a = new Companion(null);

    /* renamed from: b */
    private final Function0<Unit> f135036b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/setting/service/usersetting/appearance/UiModeChangeBroadcastReceiver$Companion;", "", "()V", "BROADCAST_ACTION_SUFFIX", "", "BROADCAST_PERMISSION_SUFFIX", "getBroadcastAction", "context", "Landroid/content/Context;", "getBroadcastPermission", "register", "Lcom/ss/android/lark/setting/service/usersetting/appearance/UiModeChangeBroadcastReceiver;", "onUiModeChange", "Lkotlin/Function0;", "", "send", "send$core_setting_setting_productionUsRelease", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.service.usersetting.appearance.UiModeChangeBroadcastReceiver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: b */
        public final String mo186672b(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return context.getPackageName() + ".setting.permissions.UI_MODE_BROADCAST";
        }

        @JvmStatic
        /* renamed from: c */
        public final void mo186673c(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intent intent = new Intent();
            Companion aVar = this;
            intent.setAction(aVar.mo186671a(context));
            context.sendBroadcast(intent, aVar.mo186672b(context));
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo186671a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            return context.getPackageName() + ".setting.action.UI_MODE_BROADCAST";
        }

        @JvmStatic
        /* renamed from: a */
        public final UiModeChangeBroadcastReceiver mo186670a(Context context, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(function0, "onUiModeChange");
            UiModeChangeBroadcastReceiver uiModeChangeBroadcastReceiver = new UiModeChangeBroadcastReceiver(function0, null);
            IntentFilter intentFilter = new IntentFilter();
            Companion aVar = this;
            intentFilter.addAction(aVar.mo186671a(context));
            m212128a(context, uiModeChangeBroadcastReceiver, intentFilter, aVar.mo186672b(context), null);
            return uiModeChangeBroadcastReceiver;
        }

        @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
        /* renamed from: a */
        public static Intent m212128a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler) {
            try {
                return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, str, handler);
                }
                throw e;
            }
        }
    }

    private UiModeChangeBroadcastReceiver(Function0<Unit> function0) {
        this.f135036b = function0;
    }

    public /* synthetic */ UiModeChangeBroadcastReceiver(Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0);
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        this.f135036b.invoke();
    }
}
