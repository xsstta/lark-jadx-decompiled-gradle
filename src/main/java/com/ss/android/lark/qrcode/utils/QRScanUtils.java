package com.ss.android.lark.qrcode.utils;

import android.app.ActivityManager;
import com.ss.android.lark.utils.LarkContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/qrcode/utils/QRScanUtils;", "", "()V", "isMinAppExist", "", "isP0Exist", "isProcessExist", "processSuffix", "Lcom/ss/android/lark/qrcode/utils/QRScanUtils$ProcessSuffix;", "ProcessSuffix", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class QRScanUtils {

    /* renamed from: a */
    public static final QRScanUtils f130882a = new QRScanUtils();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/qrcode/utils/QRScanUtils$ProcessSuffix;", "", "suffix", "", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "getValue", "SUFFIX_P0", "SUFFIX_MINI_APP", "core_qrcode_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum ProcessSuffix {
        SUFFIX_P0(":p0"),
        SUFFIX_MINI_APP(":miniapp");
        
        private final String value;

        public final String getValue() {
            return this.value;
        }

        private ProcessSuffix(String str) {
            this.value = str;
        }
    }

    private QRScanUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m205152a() {
        return f130882a.m205153a(ProcessSuffix.SUFFIX_P0);
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m205154b() {
        return f130882a.m205153a(ProcessSuffix.SUFFIX_MINI_APP);
    }

    /* renamed from: a */
    private final boolean m205153a(ProcessSuffix processSuffix) {
        ActivityManager activityManager = (ActivityManager) LarkContext.getApplication().getSystemService("activity");
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            Intrinsics.checkExpressionValueIsNotNull(runningAppProcesses, "am.runningAppProcesses");
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String str = runningAppProcessInfo.processName;
                Intrinsics.checkExpressionValueIsNotNull(str, "info.processName");
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) processSuffix.getValue(), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }
}
