package com.bytedance.storagehandler;

import android.content.Context;
import com.C1711a;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.storagehandlerapi.StorageCheckListener;
import java.util.ArrayList;
import java.util.List;

public class StorageFilter {

    /* renamed from: a */
    private static final Object f50673a = new Object();

    /* renamed from: b */
    private static volatile List<StorageCheckListener> f50674b;

    public static native void configStack(int i, boolean z);

    private static native void init(String str);

    public static native void test();

    static {
        ByteHook.init();
        C1711a.m7628a("storagehandlerlib");
    }

    /* renamed from: a */
    public static void m75498a(Context context) {
        String packageName = context.getPackageName();
        init(".*" + packageName.replaceAll("\\.", "\\\\.") + ".*/lib/.*\\.so$");
    }

    /* renamed from: a */
    public static void m75499a(StorageCheckListener storageCheckListener) {
        if (storageCheckListener != null) {
            ArrayList arrayList = new ArrayList();
            synchronized (f50673a) {
                if (f50674b != null) {
                    for (StorageCheckListener storageCheckListener2 : f50674b) {
                        arrayList.add(storageCheckListener2);
                    }
                }
                arrayList.add(storageCheckListener);
                f50674b = arrayList;
            }
        }
    }
}
