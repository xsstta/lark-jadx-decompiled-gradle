package com.bytedance.ee.bear.drive.biz.upload;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.drive.biz.upload.p332a.C6746a;
import com.bytedance.ee.bear.drive.biz.upload.p333b.C6748a;
import com.bytedance.ee.bear.drive.common.activity.DriveCarrierActivity;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.fileselector.api.SimpleFileSelectListener;

/* renamed from: com.bytedance.ee.bear.drive.biz.upload.c */
public class C6750c {
    /* renamed from: a */
    public static void m26609a(Fragment fragment, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("extras_need_result", true);
        bundle.putBoolean("extras_multiple", z);
        DriveCarrierActivity.m27215a(fragment, C6746a.class, bundle);
    }

    /* renamed from: a */
    public static void m26608a(Fragment fragment, SimpleFileSelectListener bVar) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            FileSelectorManager.m31232a(activity, activity.getSupportFragmentManager(), ((FileSelectConfig.C7792g) ((FileSelectConfig.C7792g) FileSelectConfig.larkCamaraBuilder().mo30459a(bVar)).mo30463g(false)).mo30455a(), fragment.getClass().getName());
        } else {
            Log.w("PickerHelper", "requestCameraPicker activity is null");
        }
    }

    /* renamed from: a */
    public static void m26610a(Fragment fragment, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("extras_need_result", true);
        bundle.putBoolean("extras_multiple", z);
        if (z2) {
            bundle.putInt("extras_media_type", 0);
        } else {
            bundle.putInt("extras_media_type", 1);
        }
        DriveCarrierActivity.m27215a(fragment, C6748a.class, bundle);
    }
}
