package com.bytedance.ee.bear.persistence;

import android.app.Application;
import android.content.SharedPreferences;
import com.bytedance.ee.util.p701d.C13615c;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u0003H\u0003J\u0011\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nH\u0001J%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u0002H\f¢\u0006\u0002\u0010\u0010J5\u0010\u0011\u001a.\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0012\u0002\b\u0003 \b*\u0016\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0012\u0002\b\u0003\u0018\u00010\u00130\u0012H\u0001J!\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0001J!\u0010\u0016\u001a\u00020\u00172\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0015\u001a\u00020\u0017H\u0001J!\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0015\u001a\u00020\u0019H\u0001J!\u0010\u001a\u001a\u00020\u001b2\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0015\u001a\u00020\u001bH\u0001J'\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u00032\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0001Jo\u0010\u001d\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u001f0\u001e2\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010\u00030\u00032.\b\u0001\u0010\u0015\u001a(\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u0001 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u001f0\u001eH\u0001J\u0018\u0010 \u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\rJ\u0019\u0010#\u001a\u00020!2\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010$0$H\u0001J\u000e\u0010%\u001a\u00020!2\u0006\u0010\u000e\u001a\u00020\rJ\u0019\u0010&\u001a\u00020!2\u000e\u0010\u0007\u001a\n \b*\u0004\u0018\u00010$0$H\u0001¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "Landroid/content/SharedPreferences;", "name", "", "(Ljava/lang/String;)V", "contains", "", "p0", "kotlin.jvm.PlatformType", "edit", "Landroid/content/SharedPreferences$Editor;", "get", "T", "", "key", "defValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getAll", "", "", "getBoolean", "p1", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringSet", "", "", "put", "", "value", "registerOnSharedPreferenceChangeListener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "remove", "unregisterOnSharedPreferenceChangeListener", "persistence_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.m.a */
public final class PersistenceSharedPreference implements SharedPreferences {

    /* renamed from: a */
    private final /* synthetic */ SharedPreferences f23870a;

    public boolean contains(String str) {
        return this.f23870a.contains(str);
    }

    public SharedPreferences.Editor edit() {
        return this.f23870a.edit();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f23870a.getAll();
    }

    public boolean getBoolean(String str, boolean z) {
        return this.f23870a.getBoolean(str, z);
    }

    public float getFloat(String str, float f) {
        return this.f23870a.getFloat(str, f);
    }

    public int getInt(String str, int i) {
        return this.f23870a.getInt(str, i);
    }

    public long getLong(String str, long j) {
        return this.f23870a.getLong(str, j);
    }

    public String getString(String str, String str2) {
        return this.f23870a.getString(str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return this.f23870a.getStringSet(str, set);
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f23870a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f23870a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public PersistenceSharedPreference(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Application application = C13615c.f35773a;
        if (application == null) {
            Intrinsics.throwNpe();
        }
        SharedPreferences sharedPreferences = application.getSharedPreferences(str, 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "ContextUtils.baseApplica…me, Context.MODE_PRIVATE)");
        this.f23870a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo34036a(Object obj) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        String obj2 = obj.toString();
        SharedPreferences.Editor edit = edit();
        edit.remove(obj2);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo34037a(Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(obj, "key");
        if (obj2 != null) {
            String obj3 = obj.toString();
            SharedPreferences.Editor edit = edit();
            if (obj2 instanceof String) {
                edit.putString(obj3, (String) obj2);
            } else if (obj2 instanceof Boolean) {
                edit.putBoolean(obj3, ((Boolean) obj2).booleanValue());
            } else if (obj2 instanceof Float) {
                edit.putFloat(obj3, ((Number) obj2).floatValue());
            } else if (obj2 instanceof Integer) {
                edit.putInt(obj3, ((Number) obj2).intValue());
            } else if (obj2 instanceof Long) {
                edit.putLong(obj3, ((Number) obj2).longValue());
            } else if (obj2 instanceof Set) {
                edit.putStringSet(obj3, (Set) obj2);
            }
            edit.apply();
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r3 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r3 != null) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo34038b(java.lang.Object r3, T r4) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.persistence.PersistenceSharedPreference.mo34038b(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
