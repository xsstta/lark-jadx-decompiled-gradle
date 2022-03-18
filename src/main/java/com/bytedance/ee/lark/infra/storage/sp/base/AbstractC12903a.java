package com.bytedance.ee.lark.infra.storage.sp.base;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.storage.p640c.C12899a;
import com.bytedance.ee.lark.infra.storage.p640c.SharedPreferencesC12900b;
import com.bytedance.ee.lark.infra.storage.sp.biz.SetValueIOException;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.bytedance.ee.lark.infra.storage.sp.base.a */
public abstract class AbstractC12903a {

    /* renamed from: a */
    String f34399a = "exceed storage max size 10Mb";

    /* renamed from: b */
    String f34400b = "exceed storage item max length";

    /* renamed from: c */
    private final long f34401c;

    /* renamed from: d */
    private final long f34402d;

    /* renamed from: e */
    private Context f34403e;

    /* renamed from: f */
    private long f34404f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo48673a();

    /* renamed from: d */
    public long mo48682d() {
        return this.f34401c;
    }

    /* renamed from: f */
    public void mo48684f() {
        mo48685g();
    }

    /* renamed from: e */
    public JSONArray mo48683e() {
        return m53208i();
    }

    /* renamed from: c */
    public long mo48680c() {
        long j = this.f34404f;
        if (j > 0) {
            return j;
        }
        long h = mo48674h();
        this.f34404f = h;
        return h;
    }

    /* renamed from: g */
    public SharedPreferences mo48685g() {
        Context context = this.f34403e;
        if (context != null) {
            return C12899a.m53203a(context, mo48673a());
        }
        AppBrandLogger.m52829e("AbsStorage", "context is null，so create NullPointerSafeSP");
        return new SharedPreferencesC12900b();
    }

    /* renamed from: i */
    private JSONArray m53208i() {
        Set<String> keySet = mo48685g().getAll().keySet();
        JSONArray jSONArray = new JSONArray();
        if (keySet != null) {
            for (String str : keySet) {
                if (str != null && !str.endsWith("__type__")) {
                    jSONArray.put(str);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: b */
    public boolean mo48679b() {
        this.f34404f = 0;
        return mo48685g().edit().clear().commit();
    }

    /* renamed from: h */
    private long mo48674h() {
        String string;
        Set<String> keySet = mo48685g().getAll().keySet();
        String[] strArr = new String[keySet.size()];
        keySet.toArray(strArr);
        long j = 0;
        for (int i = 0; i < keySet.size(); i++) {
            String str = strArr[i];
            if ((i != 0 || !str.startsWith("__") || !str.endsWith("__")) && !str.endsWith("__type__") && (string = mo48685g().getString(str, null)) != null) {
                j += (long) string.length();
            }
        }
        return j;
    }

    /* renamed from: a */
    public String mo48676a(String str) {
        return mo48685g().getString(str, null);
    }

    /* renamed from: b */
    public String mo48678b(String str) {
        SharedPreferences g = mo48685g();
        return g.getString(str + "__type__", null);
    }

    /* renamed from: c */
    public boolean mo48681c(String str) {
        String string = mo48685g().getString(str, null);
        if (string != null) {
            this.f34404f -= (long) string.length();
        }
        return mo48685g().edit().remove(str).remove(str + "__type__").commit();
    }

    public AbstractC12903a(Context context, long j, long j2) {
        this.f34401c = j;
        this.f34402d = j2;
        if (context != null) {
            this.f34403e = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public boolean mo48677a(String str, String str2, String str3) throws SetValueIOException {
        SharedPreferences g = mo48685g();
        int length = str2.getBytes().length;
        long j = this.f34402d;
        if (j <= 0 || ((long) length) <= j) {
            long c = mo48680c();
            long j2 = this.f34401c;
            if (j2 <= 0 || ((long) length) + c <= j2) {
                if (this.f34404f > 0) {
                    if (!g.contains(str)) {
                        this.f34404f += (long) length;
                    } else {
                        this.f34404f = (this.f34404f + ((long) length)) - ((long) g.getString(str, "").length());
                    }
                }
                return g.edit().putString(str, str2).putString(str + "__type__", str3).commit();
            }
            throw new SetValueIOException(20, this.f34399a);
        }
        throw new SetValueIOException(10, this.f34400b);
    }
}
