package com.larksuite.component.safemode.preference;

import com.tencent.mmkv.MMKV;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bJ&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000bJ\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/larksuite/component/safemode/preference/SafeModePreference;", "", "()V", "safeModeKV", "Lcom/tencent/mmkv/MMKV;", "getBoolean", "", "key", "", "fallback", "getInt", "", "getString", "getStringSet", "", "defValues", "putBoolean", "", "value", "putInt", "putString", "putStringSet", "values", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.safemode.b.a */
public final class SafeModePreference {

    /* renamed from: a */
    public static final SafeModePreference f62347a = new SafeModePreference();

    /* renamed from: b */
    private static final MMKV f62348b;

    private SafeModePreference() {
    }

    static {
        MMKV mmkvWithID = MMKV.mmkvWithID("sm_pref", 2);
        Intrinsics.checkExpressionValueIsNotNull(mmkvWithID, "MMKV.mmkvWithID(SafeMode… MMKV.MULTI_PROCESS_MODE)");
        f62348b = mmkvWithID;
    }

    /* renamed from: a */
    public final String mo88886a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return f62348b.getString(str, null);
    }

    /* renamed from: a */
    public final int mo88885a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return f62348b.getInt(str, i);
    }

    /* renamed from: b */
    public final void mo88890b(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        f62348b.putInt(str, i);
    }

    /* renamed from: b */
    public final void mo88891b(String str, Set<String> set) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        Intrinsics.checkParameterIsNotNull(set, "values");
        f62348b.putStringSet(str, set);
    }

    /* renamed from: a */
    public final Set<String> mo88887a(String str, Set<String> set) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return f62348b.getStringSet(str, set);
    }

    /* renamed from: b */
    public final void mo88892b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        f62348b.putBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo88888a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        f62348b.putString(str, str2);
    }

    /* renamed from: a */
    public final boolean mo88889a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        return f62348b.getBoolean(str, z);
    }
}
