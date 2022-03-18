package com.bytedance.ee.bear.drive.loader.download.platform.abs;

import android.text.TextUtils;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.middleground.drive.export.DownloadCallback;
import com.bytedance.ee.bear.middleground.drive.export.DownloadRequestInfo;
import com.bytedance.ee.bear.middleground.drive.export.DrivePriority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.platform.abs.g */
public class C7045g {
    /* renamed from: a */
    public static void m28051a(Collection<String> collection) {
        for (String str : collection) {
            m28053b(str);
        }
    }

    /* renamed from: b */
    public static void m28053b(String str) {
        if (!TextUtils.isEmpty(str)) {
            ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19657a(new ArrayList<>(Arrays.asList(str)));
        }
    }

    /* renamed from: a */
    public static boolean m28052a(String str) {
        if (str == null || TextUtils.equals(str, "-1") || str.startsWith("-1")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m28049a(String str, String str2, DrivePriority.DownloadPriority downloadPriority, String str3, long j, String str4, DownloadCallback downloadCallback) {
        return ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19659b(new DownloadRequestInfo.C9355a().mo35671f(str).mo35662a(str2).mo35661a(downloadPriority).mo35670e(str3).mo35663a(true).mo35673h(str4).mo35658a(downloadCallback).mo35664a());
    }

    /* renamed from: a */
    public static String m28050a(String str, String str2, String str3, String str4, DrivePriority.DownloadPriority downloadPriority, String str5, boolean z, String str6, DownloadCallback downloadCallback) {
        DownloadRequestInfo.DownloadType downloadType;
        DownloadRequestInfo.C9355a e = new DownloadRequestInfo.C9355a().mo35662a(str).mo35666b(str2).mo35668c(str3).mo35669d(str4).mo35661a(downloadPriority).mo35670e(str5);
        if (z) {
            downloadType = DownloadRequestInfo.DownloadType.PREVIEW;
        } else {
            downloadType = DownloadRequestInfo.DownloadType.DRIVE;
        }
        return ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19649a(e.mo35659a(downloadType).mo35673h(str6).mo35658a(downloadCallback).mo35664a());
    }
}
