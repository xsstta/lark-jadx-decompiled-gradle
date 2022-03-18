package com.ss.android.lark.monitor.app;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/monitor/app/MemoryAppPlugin;", "Lcom/ss/android/lark/monitor/app/BaseAppPlugin;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mContext", "collectData", "Lorg/json/JSONObject;", "eventType", "", "getEventName", "", "parseRamResult", "runOneTimeTask", "", "isMainProcess", "", "runScheduleTask", "EventType", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MemoryAppPlugin extends BaseAppPlugin {

    /* renamed from: b */
    private final Context f121343b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/monitor/app/MemoryAppPlugin$EventType;", "", "Companion", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface EventType {
        public static final Companion Companion = Companion.f121344a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/monitor/app/MemoryAppPlugin$EventType$Companion;", "", "()V", "RAM_USAGE", "", "getRAM_USAGE", "()I", "setRAM_USAGE", "(I)V", "monitor_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.monitor.app.MemoryAppPlugin$EventType$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f121344a = new Companion();

            /* renamed from: b */
            private static int f121345b = 2;

            private Companion() {
            }

            /* renamed from: a */
            public final int mo168707a() {
                return f121345b;
            }
        }
    }

    @Override // com.ss.android.lark.monitor.app.IAppPlugin
    /* renamed from: b */
    public void mo168701b(boolean z) {
    }

    /* renamed from: a */
    private final JSONObject m190273a() {
        boolean z;
        Object systemService = this.f121343b.getSystemService("activity");
        if (systemService != null) {
            Debug.MemoryInfo[] processMemoryInfo = ((ActivityManager) systemService).getProcessMemoryInfo(new int[]{Process.myPid()});
            Intrinsics.checkExpressionValueIsNotNull(processMemoryInfo, "processMemoryInfo");
            if (processMemoryInfo.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z)) {
                return null;
            }
            return mo168727a(NativeMonitor.getInstance().setAndGetAppMem(processMemoryInfo[0]));
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: a */
    public JSONObject mo168705a(int i) {
        if (i == EventType.Companion.mo168707a()) {
            return m190273a();
        }
        return null;
    }

    /* renamed from: b */
    public String mo168706b(int i) {
        if (i == EventType.Companion.mo168707a()) {
            return "app_mem_usage";
        }
        return "";
    }

    @Override // com.ss.android.lark.monitor.app.IAppPlugin
    /* renamed from: a */
    public void mo168699a(boolean z) {
        if (z) {
            mo168728a(mo168706b(EventType.Companion.mo168707a()), mo168705a(EventType.Companion.mo168707a()));
        } else {
            mo168705a(EventType.Companion.mo168707a());
        }
    }
}
