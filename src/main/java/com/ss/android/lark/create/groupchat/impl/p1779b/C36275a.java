package com.ss.android.lark.create.groupchat.impl.p1779b;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.create.groupchat.impl.b.a */
public class C36275a {

    /* renamed from: a */
    private static final Map<String, WeakReference<Activity>> f93565a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final Map<String, WeakReference<C36516a>> f93566b = new ConcurrentHashMap();

    /* renamed from: a */
    public static void m142816a() {
        for (Map.Entry<String, WeakReference<Activity>> entry : f93565a.entrySet()) {
            Activity activity = entry.getValue().get();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    public static void m142817a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f93565a.remove(str);
        }
    }

    /* renamed from: b */
    public static void m142821b(String str) {
        if (!TextUtils.isEmpty(str)) {
            f93566b.remove(str);
        }
    }

    /* renamed from: c */
    public static void m142822c(String str) {
        Map<String, WeakReference<Activity>> map;
        WeakReference<Activity> weakReference;
        Activity activity;
        if (!TextUtils.isEmpty(str) && (weakReference = (map = f93565a).get(str)) != null && (activity = weakReference.get()) != null) {
            activity.finish();
            map.remove(str);
        }
    }

    /* renamed from: d */
    public static void m142823d(String str) {
        Map<String, WeakReference<C36516a>> map;
        WeakReference<C36516a> weakReference;
        C36516a aVar;
        if (!TextUtils.isEmpty(str) && (weakReference = (map = f93566b).get(str)) != null && (aVar = weakReference.get()) != null) {
            aVar.finish();
            map.remove(str);
        }
    }

    /* renamed from: a */
    public static void m142819a(String str, Activity activity) {
        if (!TextUtils.isEmpty(str) && activity != null) {
            f93565a.put(str, new WeakReference<>(activity));
        }
    }

    /* renamed from: a */
    public static void m142818a(String str, int i) {
        Map<String, WeakReference<Activity>> map;
        WeakReference<Activity> weakReference;
        Activity activity;
        if (!TextUtils.isEmpty(str) && (weakReference = (map = f93565a).get(str)) != null && (activity = weakReference.get()) != null) {
            activity.setResult(i);
            activity.finish();
            map.remove(str);
        }
    }

    /* renamed from: a */
    public static void m142820a(String str, C36516a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            f93566b.put(str, new WeakReference<>(aVar));
        }
    }
}
