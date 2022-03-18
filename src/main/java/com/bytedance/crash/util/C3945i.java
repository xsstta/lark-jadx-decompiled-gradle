package com.bytedance.crash.util;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.runtime.C3840b;
import com.bytedance.crash.runtime.C3859j;
import com.bytedance.crash.runtime.p227a.C3824a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.util.i */
public class C3945i {
    /* renamed from: a */
    public static void m16374a() {
        File j = C3962t.m16514j(C3774m.m15609j());
        j.mkdirs();
        m16375a(j);
    }

    /* renamed from: b */
    public static JSONArray m16376b() {
        Window window;
        View peekDecorView;
        JSONArray jSONArray = new JSONArray();
        ArrayList<WeakReference<Activity>> g = C3824a.m15819d().mo15402g();
        if (g == null || g.size() <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<WeakReference<Activity>> it = g.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (!(activity == null || (window = activity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null)) {
                JSONObject jSONObject = new JSONObject();
                linkedList.add(new Pair(peekDecorView, jSONObject));
                jSONArray.put(jSONObject);
            }
        }
        while (!linkedList.isEmpty()) {
            Pair pair = (Pair) linkedList.pop();
            View view = (View) pair.first;
            JSONObject jSONObject2 = (JSONObject) pair.second;
            C3955q.m16447a(jSONObject2, "cls", String.valueOf(view.getClass()));
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                JSONArray jSONArray2 = new JSONArray();
                C3955q.m16447a(jSONObject2, "children", jSONArray2);
                for (int i = 0; i < childCount; i++) {
                    try {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONArray2.put(jSONObject3);
                            linkedList.push(new Pair(childAt, jSONObject3));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static void m16377b(File file) {
        File file2 = new File(file, "viewTree.txt");
        if (!file2.exists()) {
            try {
                C3949m.m16404a(file2, m16376b(), false);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static File m16379d(File file) {
        File file2 = new File(file, "anr_trace.txt");
        if (file2.exists() || !C3840b.m15892j()) {
            return file2;
        }
        File file3 = new File("/data/anr/traces.txt");
        if (!file3.exists()) {
            return file2;
        }
        C3949m.m16400a(file3, file2, 1048576);
        return file2;
    }

    /* renamed from: e */
    private static void m16380e(File file) {
        File file2 = new File(file, "malloc.txt");
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            NativeTools.m16236b().mo15593a(file2.getAbsolutePath());
        }
    }

    /* renamed from: f */
    private static void m16381f(File file) {
        File file2 = new File(file, "pthreads.txt");
        if (!file2.exists()) {
            File file3 = new File(file, "rountines.txt");
            file2.getParentFile().mkdirs();
            NativeTools.m16236b().mo15602b(file2.getAbsolutePath(), file3.getAbsolutePath());
        }
    }

    /* renamed from: c */
    public static void m16378c(File file) {
        FileOutputStream fileOutputStream = null;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object invoke = cls.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("dumpGfxInfo", FileDescriptor.class, String[].class);
            declaredMethod.setAccessible(true);
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, "gfxinfo.txt"));
            try {
                declaredMethod.invoke(invoke, fileOutputStream2.getFD(), new String[0]);
                C3954p.m16437a(fileOutputStream2);
            } catch (Throwable unused) {
                fileOutputStream = fileOutputStream2;
                C3954p.m16437a(fileOutputStream);
            }
        } catch (Throwable unused2) {
            C3954p.m16437a(fileOutputStream);
        }
    }

    /* renamed from: a */
    public static void m16375a(File file) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            File file2 = new File(file, "maps.txt");
            String str5 = null;
            if (!file2.exists()) {
                str = file2.getAbsolutePath();
            } else {
                str = null;
            }
            File file3 = new File(file, "smaps.txt");
            if (!file3.exists()) {
                str2 = file3.getAbsolutePath();
            } else {
                str2 = null;
            }
            File file4 = new File(file, "meminfo.txt");
            if (!file4.exists()) {
                str3 = file4.getAbsolutePath();
            } else {
                str3 = null;
            }
            File file5 = new File(file, "fds.txt");
            if (!file5.exists()) {
                str4 = file5.getAbsolutePath();
            } else {
                str4 = null;
            }
            File file6 = new File(file, "threads.txt");
            if (!file6.exists()) {
                str5 = file6.getAbsolutePath();
            }
            m16373a(new File(file, "logcat.txt"), new File(file, "logerr.txt"), false);
            NativeTools.m16236b().mo15595a(str4, str, str2, str5, str3);
            m16381f(file);
            m16380e(file);
            m16378c(file);
            m16377b(file);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static File m16373a(File file, File file2, boolean z) {
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        C3859j.m15991a(file.getAbsolutePath(), file2.getAbsolutePath(), z);
        return file;
    }
}
