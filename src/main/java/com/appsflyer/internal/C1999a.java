package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import me.ele.lancet.base.annotations.Skip;

/* renamed from: com.appsflyer.internal.a */
public final class C1999a {

    /* renamed from: ɩ */
    private IntentFilter f6843 = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: com.appsflyer.internal.a$b */
    public static final class C2001b {

        /* renamed from: ɩ */
        public static final C1999a f6846 = new C1999a();
    }

    /* renamed from: com.appsflyer.internal.a$a */
    public static final class C2000a {

        /* renamed from: ı */
        public final String f6844;

        /* renamed from: ι */
        public final float f6845;

        C2000a() {
        }

        C2000a(float f, String str) {
            this.f6845 = f;
            this.f6844 = str;
        }
    }

    C1999a() {
    }

    /* renamed from: Ι */
    public final C2000a mo10054(Context context) {
        boolean z;
        String str = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        try {
            Intent INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver = INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(context, null, this.f6843);
            if (INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver != null) {
                if (2 == INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra(UpdateKey.STATUS, -1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int intExtra = INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra == 2) {
                        str = "usb";
                    } else if (intExtra != 4) {
                        str = "other";
                    } else {
                        str = "wireless";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("level", -1);
                int intExtra3 = INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver.getIntExtra("scale", -1);
                if (!(-1 == intExtra2 || -1 == intExtra3)) {
                    f = (((float) intExtra2) * 100.0f) / ((float) intExtra3);
                }
            }
        } catch (Throwable unused) {
        }
        return new C2000a(f, str);
    }

    @Skip({"com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer"})
    public static Intent INVOKEVIRTUAL_com_appsflyer_internal_a_com_bytedance_sysoptimizer_ReceiverRegisterLancet_registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
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
