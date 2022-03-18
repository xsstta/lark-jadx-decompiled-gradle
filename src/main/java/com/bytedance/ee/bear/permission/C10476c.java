package com.bytedance.ee.bear.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

/* renamed from: com.bytedance.ee.bear.permission.c */
public class C10476c {

    /* renamed from: a */
    private final String f28177a = "PermissionCheck";

    /* renamed from: b */
    private Hashtable<String, Integer> f28178b = new Hashtable<>();

    /* renamed from: a */
    public int mo39799a() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    private String[] m43464b(Context context, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        return m43465b(strArr, context);
    }

    /* renamed from: b */
    private String[] m43465b(String[] strArr, Context context) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!m43462a(str, context)) {
                arrayList.add(str);
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        return strArr2;
    }

    /* renamed from: a */
    public void mo39800a(Activity activity, String[] strArr) {
        if (mo39799a() < 23) {
            C13479a.m54772d("PermissionCheck", "PermissionGrant tryRequestPermission api is " + mo39799a());
            return;
        }
        String[] b = m43464b(activity, strArr);
        if (b.length != 0) {
            try {
                activity.requestPermissions(b, 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private boolean m43462a(String str, Context context) {
        if (mo39799a() < 23) {
            C13479a.m54772d("PermissionCheck", "PermissionGrant hasPermission api is " + mo39799a());
            return true;
        }
        if (!this.f28178b.containsKey(str) || this.f28178b.get(str).intValue() == -1) {
            try {
                this.f28178b.put(str, Integer.valueOf(context.checkSelfPermission(str)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f28178b.get(str).intValue() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m43463a(String[] strArr, Context context) {
        if (mo39799a() < 23) {
            C13479a.m54772d("PermissionCheck", "PermissionGrant hasPermission api is " + mo39799a());
            return true;
        }
        for (String str : strArr) {
            if (!m43462a(str, context)) {
                C13479a.m54772d("PermissionCheck", "PermissionGrant hasPermissions: has no permission=" + str);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo39801a(Context context, String[] strArr) {
        C13479a.m54772d("PermissionCheck", "PermissionGrant hasRequiredPermissions: permissions=" + Arrays.toString(strArr));
        if (strArr == null) {
            return true;
        }
        return m43463a(strArr, context);
    }
}
