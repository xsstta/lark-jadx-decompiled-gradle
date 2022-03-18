package com.ss.ugc.effectplatform.settings;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\fH\u0016J\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/ugc/effectplatform/settings/AndroidSettings;", "Lcom/ss/ugc/effectplatform/settings/Setttings;", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "getBoolean", "", "key", "defaultValue", "getFloat", "", "getInt", "", "getLong", "", "getString", "getStringOrNull", "hasKey", "putBoolean", "value", "putFloat", "putInt", "putLong", "putString", "remove", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.g.a */
public final class AndroidSettings implements Setttings {

    /* renamed from: a */
    private final SharedPreferences f164930a;

    /* renamed from: b */
    private final Context f164931b;

    /* renamed from: c */
    private final String f164932c;

    @Override // com.ss.ugc.effectplatform.settings.Setttings
    /* renamed from: a */
    public void mo227813a(String str, String str2) {
        SharedPreferences.Editor putString;
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        SharedPreferences.Editor edit = this.f164930a.edit();
        if (edit != null && (putString = edit.putString(str, str2)) != null) {
            putString.apply();
        }
    }

    @Override // com.ss.ugc.effectplatform.settings.Setttings
    /* renamed from: b */
    public String mo227814b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "defaultValue");
        String string = this.f164930a.getString(str, str2);
        return string != null ? string : str2;
    }

    public AndroidSettings(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f164931b = context;
        this.f164932c = str;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(str, 0);
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "appContext.getSharedPref…ences(name, MODE_PRIVATE)");
        this.f164930a = sharedPreferences;
    }
}
