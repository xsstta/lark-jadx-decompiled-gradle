package com.ss.android.lark.calendar.impl.utils;

import android.util.SparseArray;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.MonthEventChipViewData;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.utils.y */
public class C32673y {
    /* renamed from: b */
    public static String m125374b(String str) {
        return "{" + "\"module\":\"calendar\"" + ", " + "\"push_type\"" + ":\"" + str + "\"" + "}";
    }

    /* renamed from: c */
    public static String m125377c(String str) {
        return "{" + "\"module\":\"calendar\"" + ", " + "\"assert\"" + ":\"" + str + "\"" + "}";
    }

    /* renamed from: d */
    public static String m125378d(String str) {
        return "{" + "\"module\":\"calendar\"" + ", " + "\"monitor\"" + ":\"" + str + "\"" + "}";
    }

    /* renamed from: a */
    public static String m125369a(String str) {
        return "{" + "\"module\":\"calendar\"" + ", " + "\"opt_type\"" + ":\"" + str + "\"" + "}";
    }

    /* renamed from: a */
    public static int m125368a(SparseArray<List<MonthEventChipViewData>> sparseArray, SparseArray<List<MonthEventChipViewData>> sparseArray2) {
        int i;
        int i2;
        int i3;
        if (sparseArray != null) {
            i = 0;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                List<MonthEventChipViewData> valueAt = sparseArray.valueAt(i4);
                if (valueAt == null) {
                    i3 = 0;
                } else {
                    i3 = valueAt.size();
                }
                i += i3;
            }
        } else {
            i = 0;
        }
        if (sparseArray2 != null) {
            for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
                List<MonthEventChipViewData> valueAt2 = sparseArray2.valueAt(i5);
                if (valueAt2 == null) {
                    i2 = 0;
                } else {
                    i2 = valueAt2.size();
                }
                i += i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static String m125373a(String str, String str2, String... strArr) {
        return m125372a(str, str2, "suc", strArr);
    }

    /* renamed from: b */
    public static String m125376b(String str, String str2, String... strArr) {
        return m125372a(str, str2, HiAnalyticsConstant.Direction.REQUEST, strArr);
    }

    /* renamed from: a */
    public static String m125371a(String str, String str2, String str3) {
        return m125375b(str, str2, "\"err_msg\":\"" + str3 + "\"");
    }

    /* renamed from: b */
    private static String m125375b(String str, String str2, String str3) {
        return "{" + "\"module\":\"calendar\"" + ", " + "\"context_id\"" + ":\"" + str + "\", " + "\"api_name\"" + ":\"" + str2 + "\", " + "\"api_opt\"" + ":\"" + "err" + "\", " + str3 + "}";
    }

    /* renamed from: a */
    public static String m125370a(String str, String str2, ErrorResult errorResult) {
        StringBuilder sb = new StringBuilder();
        if (errorResult == null) {
            sb.append("\"error_result\":\"null\"");
        } else {
            sb.append("\"err_code\"");
            sb.append(":\"");
            sb.append(errorResult.getErrorCode());
            sb.append("\", ");
            sb.append("\"err_msg\"");
            sb.append(":\"");
            sb.append(errorResult.getDebugMsg());
            sb.append("\"");
        }
        return m125375b(str, str2, sb.toString());
    }

    /* renamed from: a */
    private static String m125372a(String str, String str2, String str3, String... strArr) {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"module\":\"calendar\"");
        sb.append(", ");
        sb.append("\"context_id\"");
        sb.append(":\"");
        sb.append(str);
        sb.append("\", ");
        sb.append("\"api_name\"");
        sb.append(":\"");
        sb.append(str2);
        sb.append("\", ");
        sb.append("\"api_opt\"");
        sb.append(":\"");
        sb.append(str3);
        sb.append("\"");
        if (strArr != null) {
            int i = 0;
            while (i < strArr.length - 1) {
                sb.append(", \"");
                int i2 = i + 1;
                sb.append(strArr[i]);
                sb.append("\"");
                sb.append(":");
                sb.append("\"");
                i = i2 + 1;
                sb.append(strArr[i2]);
                sb.append("\"");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
