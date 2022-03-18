package com.ss.android.lark.utils;

import android.content.Context;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.vesdk.AbstractC63928aa;
import com.ss.android.vesdk.C63937ah;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\rH\u0007J\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0006\u0010\u0016\u001a\u00020\rJ\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0014H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/utils/VeSDKTools;", "", "()V", "TAG", "", "hasRegisterLogger", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasSetSdCardLibraryLoad", "veAppLogListener", "Lcom/ss/android/vesdk/VEListener$VEApplogListener;", "veMonitorListener", "Lcom/ss/android/vesdk/VEListener$VEMonitorListener;", "adjustSdCardLibraryLoad", "", "context", "Landroid/content/Context;", "appLogRegister", "hidVEMetaData", "monitorRegister", "isEnable", "", "registerLogger", "resolutionAlign4", "updateValueForVE", "key", "value", "feature-shared-utils_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.utils.am */
public final class VeSDKTools {

    /* renamed from: a */
    public static final VeSDKTools f142325a = new VeSDKTools();

    /* renamed from: b */
    private static volatile VEListener.AbstractC63860c f142326b;

    /* renamed from: c */
    private static volatile VEListener.AbstractC63881x f142327c;

    /* renamed from: d */
    private static final AtomicBoolean f142328d = new AtomicBoolean(false);

    /* renamed from: e */
    private static final AtomicBoolean f142329e = new AtomicBoolean(false);

    private VeSDKTools() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m224283a() {
        if (f142326b == null) {
            f142326b = C57796a.f142330a;
        }
        C63937ah.m251002b(true);
        C63937ah.m250995a(f142326b);
    }

    /* renamed from: b */
    public final void mo196106b() {
        boolean z = true;
        if (VideoSettingUtils.m224296c().getInternalSetting().getEncodeResolutionAlign4() != 1) {
            z = false;
        }
        Log.m165389i("VeSDKTools", "resolutionAlign4: " + z);
        m224285a("ve_enable_render_encode_resolution_align4", z);
    }

    /* renamed from: c */
    public final void mo196107c() {
        boolean z = true;
        if (C57852m.m224554a(LarkContext.getApplication()) || VideoSettingUtils.m224296c().getInternalSetting().getHideVEMetaData() != 1) {
            z = false;
        }
        Log.m165389i("VeSDKTools", "hidVEMetaData: " + z);
        m224285a("ve_compile_hide_ve_metadata", z);
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m224287b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (C57852m.m224554a(context)) {
            AtomicBoolean atomicBoolean = f142329e;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m224284a(Context context) {
        byte b;
        Intrinsics.checkParameterIsNotNull(context, "context");
        AtomicBoolean atomicBoolean = f142328d;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            boolean a = C57852m.m224554a(context);
            if (a) {
                b = 31;
            } else {
                b = 7;
            }
            C63937ah.m250992a(b);
            C63937ah.m250997a(C57798c.f142332a, a);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m224286a(boolean z) {
        if (z) {
            if (f142327c == null) {
                f142327c = C57797b.f142331a;
            }
            C63937ah.m250996a(f142327c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "msg", "", "logToLocal"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.am$c */
    public static final class C57798c implements AbstractC63928aa {

        /* renamed from: a */
        public static final C57798c f142332a = new C57798c();

        C57798c() {
        }

        @Override // com.ss.android.vesdk.AbstractC63928aa
        /* renamed from: a */
        public final void mo196110a(int i, String str) {
            Log.m165389i("VeSDKTools", str);
        }
    }

    @JvmStatic
    /* renamed from: a */
    private static final void m224285a(String str, boolean z) {
        VEConfigCenter.m250617a().mo220635b(str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "logType", "", "kotlin.jvm.PlatformType", "logExtra", "Lorg/json/JSONObject;", "monitorLog"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.am$b */
    public static final class C57797b implements VEListener.AbstractC63881x {

        /* renamed from: a */
        public static final C57797b f142331a = new C57797b();

        C57797b() {
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63881x
        /* renamed from: a */
        public final void mo196109a(String str, JSONObject jSONObject) {
            try {
                Log.m165379d("VeSDKTools", "monitorLog, logType:" + str + ", logExtra:" + jSONObject);
                MonitorUtils.monitorEvent(str, jSONObject, null, null);
            } catch (Exception e) {
                Log.m165386e("VeSDKTools", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u0003H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "event", "", "params", "Lorg/json/JSONObject;", "secondAppId", "secondAppName", "productType", "onInternalEventV3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.utils.am$a */
    public static final class C57796a implements VEListener.AbstractC63860c {

        /* renamed from: a */
        public static final C57796a f142330a = new C57796a();

        C57796a() {
        }

        @Override // com.ss.android.vesdk.VEListener.AbstractC63860c
        /* renamed from: a */
        public final void mo196108a(String str, JSONObject jSONObject, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "event");
            Intrinsics.checkParameterIsNotNull(str4, "productType");
            VeSDKTools amVar = VeSDKTools.f142325a;
            Log.m165389i("VeSDKTools", "event: " + str + ", params: " + jSONObject + ", secondAppId: " + str2 + ", secondAppName: " + str3 + ", productType: " + str4 + ", ");
            Statistics.sendEvent(str, jSONObject);
        }
    }
}
