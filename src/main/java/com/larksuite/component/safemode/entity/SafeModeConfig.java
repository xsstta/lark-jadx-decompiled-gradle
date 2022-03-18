package com.larksuite.component.safemode.entity;

import com.larksuite.component.safemode.preference.SafeModePreference;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0019\b\b\u0018\u0000 $2\u00020\u0001:\u0001$BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JW\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020\u00032\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\b\u0010#\u001a\u00020\fH\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/larksuite/component/safemode/entity/SafeModeConfig;", "", "enable", "", "maxDetectTime", "", "expiration", "serious", "urgent", "emergency", "forbidSet", "", "", "(ZIIIIILjava/util/Set;)V", "getEmergency", "()I", "getEnable", "()Z", "getExpiration", "getForbidSet", "()Ljava/util/Set;", "getMaxDetectTime", "getSerious", "getUrgent", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "Companion", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.safemode.a.a */
public final class SafeModeConfig {

    /* renamed from: a */
    public static final Companion f62319a = new Companion(null);

    /* renamed from: b */
    private final boolean f62320b;

    /* renamed from: c */
    private final int f62321c;

    /* renamed from: d */
    private final int f62322d;

    /* renamed from: e */
    private final int f62323e;

    /* renamed from: f */
    private final int f62324f;

    /* renamed from: g */
    private final int f62325g;

    /* renamed from: h */
    private final Set<String> f62326h;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeModeConfig)) {
            return false;
        }
        SafeModeConfig aVar = (SafeModeConfig) obj;
        return this.f62320b == aVar.f62320b && this.f62321c == aVar.f62321c && this.f62322d == aVar.f62322d && this.f62323e == aVar.f62323e && this.f62324f == aVar.f62324f && this.f62325g == aVar.f62325g && Intrinsics.areEqual(this.f62326h, aVar.f62326h);
    }

    public int hashCode() {
        boolean z = this.f62320b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = ((((((((((i * 31) + this.f62321c) * 31) + this.f62322d) * 31) + this.f62323e) * 31) + this.f62324f) * 31) + this.f62325g) * 31;
        Set<String> set = this.f62326h;
        return i4 + (set != null ? set.hashCode() : 0);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/larksuite/component/safemode/entity/SafeModeConfig$Companion;", "", "()V", "getConfig", "Lcom/larksuite/component/safemode/entity/SafeModeConfig;", "saveConfig", "", "jsonObject", "Lorg/json/JSONObject;", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final SafeModeConfig mo88852a() {
            return new SafeModeConfig(SafeModePreference.f62347a.mo88889a("enable", true), SafeModePreference.f62347a.mo88885a("max_detect_time", 20), SafeModePreference.f62347a.mo88885a("expiration", 20), SafeModePreference.f62347a.mo88885a("serious", 2), SafeModePreference.f62347a.mo88885a("urgent", 3), SafeModePreference.f62347a.mo88885a("emergency", 4), SafeModePreference.f62347a.mo88887a("forbid_list", (Set<String>) null));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo88853a(JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
            SafeModePreference.f62347a.mo88892b("enable", jSONObject.optBoolean("enable", false));
            SafeModePreference.f62347a.mo88890b("expiration", jSONObject.optInt("expiration", 20));
            SafeModePreference.f62347a.mo88890b("max_detect_time", jSONObject.optInt("max_detect_time", 20));
            SafeModePreference.f62347a.mo88890b("serious", jSONObject.optInt("serious", 2));
            SafeModePreference.f62347a.mo88890b("urgent", jSONObject.optInt("urgent", 3));
            SafeModePreference.f62347a.mo88890b("emergency", jSONObject.optInt("emergency", 4));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            JSONArray optJSONArray = jSONObject.optJSONArray("forbid_list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    linkedHashSet.add(optJSONArray.get(i).toString());
                }
            }
            SafeModePreference.f62347a.mo88891b("forbid_list", linkedHashSet);
        }
    }

    /* renamed from: a */
    public final boolean mo88842a() {
        return this.f62320b;
    }

    /* renamed from: b */
    public final int mo88843b() {
        return this.f62321c;
    }

    /* renamed from: c */
    public final int mo88844c() {
        return this.f62322d;
    }

    /* renamed from: d */
    public final int mo88845d() {
        return this.f62323e;
    }

    /* renamed from: e */
    public final int mo88846e() {
        return this.f62324f;
    }

    /* renamed from: f */
    public final int mo88848f() {
        return this.f62325g;
    }

    /* renamed from: g */
    public final Set<String> mo88849g() {
        return this.f62326h;
    }

    public String toString() {
        return "[enable:" + this.f62320b + ", maxDetectTime:" + this.f62321c + ", expiration:" + this.f62322d + ", serious:" + this.f62323e + ", urgent:" + this.f62324f + ", emergency:" + this.f62325g + ']';
    }

    public SafeModeConfig(boolean z, int i, int i2, int i3, int i4, int i5, Set<String> set) {
        this.f62320b = z;
        this.f62321c = i;
        this.f62322d = i2;
        this.f62323e = i3;
        this.f62324f = i4;
        this.f62325g = i5;
        this.f62326h = set;
    }
}
