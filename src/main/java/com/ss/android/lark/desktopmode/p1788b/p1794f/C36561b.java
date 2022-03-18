package com.ss.android.lark.desktopmode.p1788b.p1794f;

import android.app.Activity;
import android.content.ComponentName;
import com.larksuite.framework.utils.UIUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.desktopmode.b.f.b */
public class C36561b {

    /* renamed from: a */
    Map<Integer, WeakReference<Activity>> f94109a;

    /* renamed from: b */
    Map<Integer, Class<? extends Activity>> f94110b;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.desktopmode.b.f.b$a */
    public static final class C36563a {

        /* renamed from: a */
        public static final C36561b f94111a = new C36561b();
    }

    /* renamed from: a */
    public static C36561b m144265a() {
        return C36563a.f94111a;
    }

    private C36561b() {
        this.f94109a = new ConcurrentHashMap();
        this.f94110b = new ConcurrentHashMap();
    }

    /* renamed from: b */
    public void mo134924b(Activity activity) {
        this.f94109a.remove(Integer.valueOf(activity.hashCode()));
        this.f94110b.remove(Integer.valueOf(activity.hashCode()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.Map<java.lang.Integer, java.lang.Class<? extends android.app.Activity>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo134922a(Activity activity) {
        if (UIUtils.isActivityRunning(activity)) {
            this.f94109a.put(Integer.valueOf(activity.hashCode()), new WeakReference<>(activity));
            this.f94110b.put(Integer.valueOf(activity.hashCode()), activity.getClass());
        }
    }

    /* renamed from: a */
    public boolean mo134923a(ComponentName componentName) {
        int i;
        WeakReference<Activity> weakReference;
        Iterator<Map.Entry<Integer, Class<? extends Activity>>> it = this.f94110b.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Map.Entry<Integer, Class<? extends Activity>> next = it.next();
            if (next.getValue().getName().equals(componentName.getClassName())) {
                i = next.getKey().intValue();
                break;
            }
        }
        if (i == -1 || (weakReference = this.f94109a.get(Integer.valueOf(i))) == null) {
            return false;
        }
        weakReference.get().finish();
        return true;
    }
}
