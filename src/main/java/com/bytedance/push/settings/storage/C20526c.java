package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.push.settings.storage.c */
public final class C20526c extends C20534g {

    /* renamed from: a */
    public final String f50079a;

    /* renamed from: b */
    private final Context f50080b;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.push.settings.storage.c$a */
    public final class SharedPreferences$EditorC20527a implements SharedPreferences.Editor {

        /* renamed from: b */
        private final Context f50082b;

        /* renamed from: c */
        private Map<String, String> f50083c = new ConcurrentHashMap();

        /* renamed from: d */
        private final SharedPreferences.Editor f50084d;

        public SharedPreferences.Editor clear() {
            throw new UnsupportedOperationException("不支持clear");
        }

        public void apply() {
            this.f50084d.apply();
            m74744a();
        }

        public boolean commit() {
            boolean commit = this.f50084d.commit();
            m74744a();
            return commit;
        }

        /* renamed from: a */
        private void m74744a() {
            for (Map.Entry<String, String> entry : this.f50083c.entrySet()) {
                PushProvider.m74730a(this.f50082b, C20526c.this.f50079a, entry.getKey(), entry.getValue()).run();
            }
            this.f50083c.clear();
        }

        public SharedPreferences.Editor remove(String str) {
            this.f50084d.remove(str);
            this.f50083c.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            throw new UnsupportedOperationException("不支持putStringSet");
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.f50084d.putBoolean(str, z);
            if (z == C20526c.this.mo69131e(str)) {
                this.f50083c.remove(str);
            } else {
                this.f50083c.put(str, "boolean");
            }
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.f50084d.putFloat(str, f);
            if (f == C20526c.this.mo69130d(str)) {
                this.f50083c.remove(str);
            } else {
                this.f50083c.put(str, "float");
            }
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.f50084d.putInt(str, i);
            if (i == C20526c.this.mo69128b(str)) {
                this.f50083c.remove(str);
            } else {
                this.f50083c.put(str, "integer");
            }
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.f50084d.putLong(str, j);
            if (j == C20526c.this.mo69129c(str)) {
                this.f50083c.remove(str);
            } else {
                this.f50083c.put(str, "long");
            }
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.f50084d.putString(str, str2);
            if (TextUtils.equals(C20526c.this.mo69123a(str), str2)) {
                this.f50083c.remove(str);
            } else {
                this.f50083c.put(str, "string");
            }
            return this;
        }

        SharedPreferences$EditorC20527a(Context context, SharedPreferences.Editor editor) {
            this.f50082b = context;
            this.f50084d = editor;
        }
    }

    /* renamed from: a */
    public SharedPreferences$EditorC20527a mo69109b() {
        return new SharedPreferences$EditorC20527a(this.f50080b, super.mo69109b());
    }

    C20526c(Context context, String str) {
        super(context, str);
        this.f50079a = str;
        this.f50080b = context;
    }
}
