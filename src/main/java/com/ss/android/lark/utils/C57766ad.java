package com.ss.android.lark.utils;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.Map;

/* renamed from: com.ss.android.lark.utils.ad */
public class C57766ad {

    /* renamed from: a */
    private Class<?> f142275a;

    /* renamed from: b */
    private Intent f142276b;

    /* renamed from: c */
    private int f142277c = -1;

    /* renamed from: d */
    private int f142278d = -1;

    /* renamed from: a */
    public boolean mo196064a(Context context) {
        return mo196065a(context, -1);
    }

    /* renamed from: a */
    public boolean mo196065a(Context context, int i) {
        if (context == null) {
            Log.m165382e("RouteBuilder#open context is null!!!");
            return false;
        }
        this.f142276b.setComponent(new ComponentName(context, this.f142275a));
        this.f142276b.setPackage(context.getPackageName());
        int a = m224198a(this.f142275a);
        if (a == 3) {
            context.sendBroadcast(this.f142276b);
        } else if (a == 2) {
            context.startService(this.f142276b);
        } else if (a == 1) {
            return m224199a(context, this.f142276b, i);
        } else {
            Log.m165382e(String.format("Route %s is not one of activity, service and broadcast", this.f142275a));
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C57766ad mo196060a(String str, boolean z) {
        this.f142276b.putExtra(str, z);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196063a(String str, boolean[] zArr) {
        this.f142276b.putExtra(str, zArr);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196061a(String str, int[] iArr) {
        this.f142276b.putExtra(str, iArr);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196057a(String str, Serializable serializable) {
        this.f142276b.putExtra(str, serializable);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196058a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.f142276b.putExtra(str, str2);
        }
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196062a(String str, String[] strArr) {
        this.f142276b.putExtra(str, strArr);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196059a(String str, Map map) {
        this.f142276b.putExtra(str, (Serializable) map);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196050a(int i) {
        if (i != -1) {
            this.f142276b.addFlags(i);
        }
        return this;
    }

    public C57766ad(Class<?> cls) {
        this.f142275a = cls;
        this.f142276b = new Intent();
    }

    /* renamed from: a */
    public C57766ad mo196052a(Bundle bundle) {
        if (bundle != null) {
            this.f142276b.putExtras(bundle);
        }
        return this;
    }

    /* renamed from: a */
    private int m224198a(Class<?> cls) {
        if (cls == null) {
            return 0;
        }
        if (Activity.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (Service.class.isAssignableFrom(cls)) {
            return 2;
        }
        if (BroadcastReceiver.class.isAssignableFrom(cls)) {
            return 3;
        }
        return 0;
    }

    /* renamed from: b */
    public Intent mo196066b(Context context) {
        if (context == null) {
            Log.m165382e("RouteBuilder#intent context is null!!!");
            return null;
        }
        this.f142276b.setComponent(new ComponentName(context, this.f142275a));
        this.f142276b.setPackage(context.getPackageName());
        return this.f142276b;
    }

    /* renamed from: a */
    public C57766ad mo196051a(int i, int i2) {
        this.f142277c = i;
        this.f142278d = i2;
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196053a(String str, int i) {
        this.f142276b.putExtra(str, i);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196054a(String str, long j) {
        this.f142276b.putExtra(str, j);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196055a(String str, Bundle bundle) {
        this.f142276b.putExtra(str, bundle);
        return this;
    }

    /* renamed from: a */
    public C57766ad mo196056a(String str, Parcelable parcelable) {
        this.f142276b.putExtra(str, parcelable);
        return this;
    }

    /* renamed from: a */
    private boolean m224199a(Context context, Intent intent, int i) {
        if (context == null || intent == null) {
            return false;
        }
        if (context instanceof Activity) {
            if (i > 0) {
                ((Activity) context).startActivityForResult(intent, i);
            } else {
                context.startActivity(intent);
            }
            int i2 = this.f142277c;
            if (i2 == -1 && this.f142278d == -1) {
                return true;
            }
            ((Activity) context).overridePendingTransition(i2, this.f142278d);
            return true;
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
        return true;
    }
}
