package com.bytedance.dataplatform;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.dataplatform.p233a.C3985a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.dataplatform.d */
public class C3991d {

    /* renamed from: a */
    private Context f12141a;

    /* renamed from: b */
    private SharedPreferences f12142b;

    /* renamed from: c */
    private Set<String> f12143c;

    /* renamed from: d */
    private Set<String> f12144d;

    /* renamed from: e */
    private String f12145e;

    /* renamed from: f */
    private AbstractC3992e f12146f;

    /* renamed from: g */
    private Set<String> f12147g;

    /* renamed from: b */
    private synchronized void m16630b() {
        this.f12144d = new HashSet();
        Iterator<String> it = this.f12147g.iterator();
        while (it.hasNext()) {
            Context context = this.f12141a;
            for (Object obj : context.getSharedPreferences("SP_CLIENT_EXPOSURE_CACHE$$$" + it.next(), 0).getAll().values()) {
                if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                    this.f12144d.add((String) obj);
                }
            }
        }
    }

    /* renamed from: a */
    private synchronized void m16629a() {
        String str;
        if (!this.f12143c.isEmpty() || !this.f12144d.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            if (!this.f12143c.isEmpty()) {
                Iterator<String> it = this.f12143c.iterator();
                sb.append(it.next());
                while (it.hasNext()) {
                    sb.append(',');
                    sb.append(it.next());
                }
            }
            if (!this.f12144d.isEmpty()) {
                if (!this.f12143c.isEmpty()) {
                    sb.append(',');
                }
                Iterator<String> it2 = this.f12144d.iterator();
                sb.append(it2.next());
                while (it2.hasNext()) {
                    sb.append(',');
                    sb.append(it2.next());
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, this.f12145e)) {
            this.f12145e = str;
            AbstractC3992e eVar = this.f12146f;
            if (eVar != null) {
                eVar.mo15696a(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo15693a(String str) {
        if (this.f12142b.contains(str)) {
            String string = this.f12142b.getString(str, "");
            if (!this.f12143c.contains(string)) {
                if (!TextUtils.isEmpty(string)) {
                    this.f12143c.add(string);
                    this.f12141a.getSharedPreferences("SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f12143c).apply();
                    m16629a();
                }
            }
        }
    }

    C3991d(Context context, AbstractC3992e eVar) {
        this.f12141a = context;
        this.f12146f = eVar;
        this.f12143c = new HashSet(context.getSharedPreferences("SP_EXPERIMENT_CACHE", 0).getStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", new HashSet()));
        this.f12142b = context.getSharedPreferences("SP_EXPERIMENT_EXPOSURE_CACHE", 0);
        this.f12147g = new HashSet(context.getSharedPreferences("SP_EXPERIMENT_CACHE", 0).getStringSet("SP_CLIENT_EXPOSURE_CACHE", new HashSet()));
        m16630b();
        m16629a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo15695a(Map<String, String> map, Map<String, Long> map2) {
        SharedPreferences.Editor edit = this.f12142b.edit();
        edit.clear().apply();
        for (String str : map.keySet()) {
            edit.putString(str, map.get(str));
        }
        edit.apply();
        this.f12143c.retainAll(map.values());
        this.f12141a.getSharedPreferences("SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_EXPERIMENT_EXPOSURE_CACHE", this.f12143c).apply();
        m16629a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized <T> void mo15694a(String str, C3985a<T> aVar, String str2) {
        if (aVar != null) {
            List asList = Arrays.asList(aVar.mo15684e());
            String d = aVar.mo15683d();
            this.f12147g.add(d);
            this.f12141a.getSharedPreferences("SP_EXPERIMENT_CACHE", 0).edit().putStringSet("SP_CLIENT_EXPOSURE_CACHE", this.f12147g).apply();
            Context context = this.f12141a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("SP_CLIENT_EXPOSURE_CACHE$$$" + d, 0);
            for (String str3 : sharedPreferences.getAll().keySet()) {
                if (!asList.contains(str3)) {
                    sharedPreferences.edit().remove(str3).apply();
                }
            }
            sharedPreferences.edit().putString(str, str2).apply();
            m16630b();
            m16629a();
        }
    }
}
