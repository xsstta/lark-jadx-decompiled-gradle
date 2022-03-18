package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.push.settings.AbstractC20511a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.g */
class C20534g implements AbstractC20537i {

    /* renamed from: a */
    private SharedPreferences f50096a;

    /* renamed from: b */
    private Map<AbstractC20511a, SharedPreferences.OnSharedPreferenceChangeListener> f50097b = new ConcurrentHashMap();

    /* renamed from: a */
    private void m74779a(Exception exc) {
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: b */
    public SharedPreferences.Editor mo69109b() {
        return this.f50096a.edit();
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public String mo69123a(String str) {
        return mo69124a(str, (String) null);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: b */
    public int mo69128b(String str) {
        return mo69121a(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: c */
    public long mo69129c(String str) {
        return mo69122a(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: d */
    public float mo69130d(String str) {
        return mo69120a(str, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: e */
    public boolean mo69131e(String str) {
        return mo69127a(str, false);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: f */
    public boolean mo69132f(String str) {
        return this.f50096a.contains(str);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public void mo69126a(AbstractC20511a aVar) {
        SharedPreferences.OnSharedPreferenceChangeListener remove;
        if (aVar != null && (remove = this.f50097b.remove(aVar)) != null) {
            this.f50096a.unregisterOnSharedPreferenceChangeListener(remove);
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public float mo69120a(String str, float f) {
        try {
            return this.f50096a.getFloat(str, f);
        } catch (Exception e) {
            m74779a(e);
            return f;
        }
    }

    C20534g(Context context, String str) {
        this.f50096a = context.getSharedPreferences(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public int mo69121a(String str, int i) {
        try {
            return this.f50096a.getInt(str, i);
        } catch (Exception e) {
            m74779a(e);
            return i;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public long mo69122a(String str, long j) {
        try {
            return this.f50096a.getLong(str, j);
        } catch (Exception e) {
            m74779a(e);
            return j;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public String mo69124a(String str, String str2) {
        try {
            return this.f50096a.getString(str, str2);
        } catch (Exception e) {
            m74779a(e);
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public boolean mo69127a(String str, boolean z) {
        try {
            return this.f50096a.getBoolean(str, z);
        } catch (Exception e) {
            m74779a(e);
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC20537i
    /* renamed from: a */
    public void mo69125a(Context context, final String str, String str2, final AbstractC20511a aVar) {
        if (aVar != null) {
            SharedPreferences$OnSharedPreferenceChangeListenerC205351 r1 = new SharedPreferences.OnSharedPreferenceChangeListener() {
                /* class com.bytedance.push.settings.storage.C20534g.SharedPreferences$OnSharedPreferenceChangeListenerC205351 */

                public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    if (TextUtils.equals(str, str)) {
                        aVar.mo68839a();
                    }
                }
            };
            this.f50097b.put(aVar, r1);
            this.f50096a.registerOnSharedPreferenceChangeListener(r1);
        }
    }
}
