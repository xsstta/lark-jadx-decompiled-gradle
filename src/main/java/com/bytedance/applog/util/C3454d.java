package com.bytedance.applog.util;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.bytedance.common.utility.concurrent.TTExecutors;
import com.bytedance.common.utility.io.IOUtils;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.applog.util.d */
public class C3454d {

    /* renamed from: a */
    public final Context f10968a;

    /* renamed from: b */
    public final boolean f10969b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13897a() {
        TTExecutors.getIOThreadPool().submit(new Runnable() {
            /* class com.bytedance.applog.util.C3454d.RunnableC34551 */

            public void run() {
                String str;
                ArrayList<String> arrayList = new ArrayList();
                try {
                    if (C3454d.this.f10969b) {
                        str = "device_id";
                    } else {
                        str = C3468q.m14662a();
                    }
                    arrayList.add(C3454d.this.f10968a.getExternalCacheDir().getParent() + "/" + str);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (!C3454d.this.f10969b) {
                    try {
                        arrayList.add(Environment.getExternalStorageDirectory().getPath() + C3468q.m14663a("L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9ieXRlZGFuY2U="));
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    try {
                        arrayList.add(Environment.getExternalStorageDirectory().getPath() + "/" + C3468q.m14662a());
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                for (String str2 : arrayList) {
                    try {
                        Log.d("DeprecatedFileCleaner", "dlt " + str2);
                        IOUtils.deletePath(str2);
                    } catch (Throwable th4) {
                        th4.printStackTrace();
                    }
                }
            }
        });
    }

    C3454d(Context context, boolean z) {
        this.f10968a = context;
        this.f10969b = z;
    }
}
