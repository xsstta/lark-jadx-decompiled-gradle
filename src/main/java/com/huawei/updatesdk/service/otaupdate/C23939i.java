package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.otaupdate.i */
public class C23939i {
    /* renamed from: a */
    public static int m87522a(long j, long j2) {
        if (j2 <= 0) {
            return 0;
        }
        return Math.min((int) Math.round((((double) j) / ((double) j2)) * 100.0d), 100);
    }

    /* renamed from: a */
    public static String m87523a(int i) {
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        return percentInstance.format(((double) i) / 100.0d);
    }

    /* renamed from: a */
    public static String m87524a(Context context, long j) {
        if (j == 0) {
            return context.getString(C23935g.m87507e(context, "upsdk_storage_utils"), "0");
        }
        DecimalFormat decimalFormat = null;
        if (j > 104857) {
            decimalFormat = new DecimalFormat("###.#");
        } else if (j > 10485) {
            decimalFormat = new DecimalFormat("###.##");
        }
        if (decimalFormat != null) {
            return context.getString(C23935g.m87507e(context, "upsdk_storage_utils"), decimalFormat.format(((double) j) / 1048576.0d));
        }
        return context.getString(C23935g.m87507e(context, "upsdk_storage_utils"), "0.01");
    }

    /* renamed from: a */
    public static boolean m87525a(List list) {
        return list == null || list.size() <= 0;
    }
}
