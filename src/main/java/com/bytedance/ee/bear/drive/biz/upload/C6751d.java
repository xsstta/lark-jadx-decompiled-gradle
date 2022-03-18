package com.bytedance.ee.bear.drive.biz.upload;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ee.bear.drive.biz.upload.p332a.C6746a;
import com.bytedance.ee.bear.drive.biz.upload.p333b.C6748a;
import com.bytedance.ee.bear.drive.common.activity.DriveCarrierActivity;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.d */
public class C6751d {
    /* renamed from: a */
    private static Bundle m26611a(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("extras_mount_node_point", str);
        bundle2.putString("extras_mount_point", str2);
        bundle2.putBundle("extras_tea_params", bundle);
        return bundle2;
    }

    /* renamed from: a */
    public static void m26612a(Context context, String str, String str2, Bundle bundle, int i) {
        DriveCarrierActivity.m27214a(context, C6746a.class, m26611a(str, str2, bundle), i);
    }

    /* renamed from: b */
    public static void m26613b(Context context, String str, String str2, Bundle bundle, int i) {
        DriveCarrierActivity.m27214a(context, C6748a.class, m26611a(str, str2, bundle), i);
    }
}
