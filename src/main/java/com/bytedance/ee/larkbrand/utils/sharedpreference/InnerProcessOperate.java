package com.bytedance.ee.larkbrand.utils.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0011H\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/sharedpreference/InnerProcessOperate;", "Lcom/bytedance/ee/larkbrand/utils/sharedpreference/SpOperate;", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "realSp", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getBoolean", "", "key", "default", "getInt", "", "getLong", "", "getString", "remove", "", "save", "sync", "setBoolean", "value", "setInt", "setLong", "setString", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.a.b */
public final class InnerProcessOperate implements SpOperate {

    /* renamed from: a */
    private final SharedPreferences f35234a;

    /* renamed from: b */
    private final SharedPreferences.Editor f35235b;

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49623a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f35235b.remove(str);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public boolean mo49628a(boolean z) {
        if (z) {
            return this.f35235b.commit();
        }
        this.f35235b.apply();
        return true;
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public int mo49629b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.f35234a.getInt(str, i);
    }

    public InnerProcessOperate(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "name");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        this.f35234a = sharedPreferences;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Intrinsics.checkExpressionValueIsNotNull(edit, "realSp.edit()");
        this.f35235b = edit;
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49624a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f35235b.putInt(str, i);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public long mo49630b(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.f35234a.getLong(str, j);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49625a(String str, long j) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f35235b.putLong(str, j);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public String mo49631b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "default");
        return this.f35234a.getString(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49626a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(str2, "value");
        this.f35235b.putString(str, str2);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: b */
    public boolean mo49632b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return this.f35234a.getBoolean(str, z);
    }

    @Override // com.bytedance.ee.larkbrand.utils.sharedpreference.SpOperate
    /* renamed from: a */
    public void mo49627a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f35235b.putBoolean(str, z);
    }
}
