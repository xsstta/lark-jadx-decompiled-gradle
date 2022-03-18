package com.ss.android.lark.diskmanage.monitor;

import android.content.Context;
import android.os.Environment;
import android.util.Pair;
import com.bytedance.storagehandler.StorageFilter;
import com.bytedance.storagehandlerapi.StorageCheckListener;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.diskmanage.monitor.a */
public class C36819a {

    /* renamed from: a */
    public static AbstractC36821a f94611a;

    /* renamed from: b */
    private static final List<String> f94612b = new ArrayList();

    /* renamed from: c */
    private static final List<String> f94613c = new ArrayList();

    /* renamed from: d */
    private static volatile boolean f94614d = false;

    /* renamed from: e */
    private static Context f94615e;

    /* renamed from: com.ss.android.lark.diskmanage.monitor.a$a */
    public interface AbstractC36821a {
        /* renamed from: a */
        Pair<List<String>, List<String>> mo102669a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.diskmanage.monitor.a$b */
    public static class C36822b implements StorageCheckListener {
        private C36822b() {
        }
    }

    /* renamed from: a */
    private static void m145271a() {
        m145274b();
        m145275c();
    }

    /* renamed from: b */
    private static void m145274b() {
        try {
            List<String> list = f94612b;
            list.add(f94615e.getFilesDir().getParentFile().getAbsolutePath());
            list.add("/data/data/" + f94615e.getPackageName());
            list.add(f94615e.getExternalCacheDir().getParentFile().getAbsolutePath());
        } catch (Exception e) {
            f94612b.clear();
            Log.m165385e("FileDeletionMonitor", "addDefaultConfig error!", e, true);
        }
    }

    /* renamed from: c */
    private static void m145275c() {
        Pair<List<String>, List<String>> pair;
        AbstractC36821a aVar = f94611a;
        if (aVar != null) {
            pair = aVar.mo102669a();
        } else {
            pair = null;
        }
        if (pair != null) {
            m145273a(f94612b, (List) pair.first);
            m145273a(f94613c, (List) pair.second);
        }
        Log.m165389i("FileDeletionMonitor", "final config: whiteList = " + f94612b + ", blackList = " + f94613c);
    }

    /* renamed from: a */
    private static List<String> m145270a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            String replace = str.replace("[SDCARD_DATA]", f94615e.getExternalCacheDir().getParentFile().getAbsolutePath()).replace("[SDCARD_ROOT]", Environment.getExternalStorageDirectory().getAbsolutePath()).replace("[PACKAGE_NAME]", f94615e.getPackageName());
            if (replace.contains("[DATA]")) {
                arrayList.add(replace.replace("[DATA]", f94615e.getFilesDir().getParentFile().getParentFile().getAbsolutePath()));
                arrayList.add(replace.replace("[DATA]", "/data/data"));
            } else {
                arrayList.add(replace);
            }
        } catch (Exception e) {
            Log.m165384e("FileDeletionMonitor", "processPattern error! pattern = " + str, e);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m145272a(Context context, AbstractC36821a aVar) {
        if (f94614d) {
            Log.m165397w("FileDeletionMonitor", "FileDeletionMonitor has been initialized before, don't call init more than once!");
            return;
        }
        f94614d = true;
        Log.m165389i("FileDeletionMonitor", "init StorageFilter");
        try {
            StorageFilter.m75498a(context);
            f94615e = context.getApplicationContext();
            f94611a = aVar;
            m145271a();
            StorageFilter.m75499a(new C36822b());
        } catch (Exception e) {
            Log.m165384e("FileDeletionMonitor", "init StorageFilter failed!", e);
        }
    }

    /* renamed from: a */
    private static void m145273a(List<String> list, List<String> list2) {
        if (!(list2 == null || list2.isEmpty())) {
            for (String str : list2) {
                list.addAll(m145270a(str));
            }
        }
    }
}
