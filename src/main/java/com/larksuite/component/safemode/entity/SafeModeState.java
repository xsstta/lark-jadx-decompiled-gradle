package com.larksuite.component.safemode.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/safemode/entity/SafeModeState;", "", ShareHitPoint.f121869d, "", "stamp", "", "process", "appVersion", "count", "", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V", "getAppVersion", "()Ljava/lang/String;", "getCount", "()I", "getProcess", "getStamp", "()J", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.safemode.a.b */
public final class SafeModeState {

    /* renamed from: a */
    public static final Companion f62327a = new Companion(null);

    /* renamed from: b */
    private final String f62328b;

    /* renamed from: c */
    private final long f62329c;

    /* renamed from: d */
    private final String f62330d;

    /* renamed from: e */
    private final String f62331e;

    /* renamed from: f */
    private final int f62332f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeModeState)) {
            return false;
        }
        SafeModeState bVar = (SafeModeState) obj;
        return Intrinsics.areEqual(this.f62328b, bVar.f62328b) && this.f62329c == bVar.f62329c && Intrinsics.areEqual(this.f62330d, bVar.f62330d) && Intrinsics.areEqual(this.f62331e, bVar.f62331e) && this.f62332f == bVar.f62332f;
    }

    public int hashCode() {
        String str = this.f62328b;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f62329c;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str2 = this.f62330d;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f62331e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f62332f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/larksuite/component/safemode/entity/SafeModeState$Companion;", "", "()V", "fromJson", "Lcom/larksuite/component/safemode/entity/SafeModeState;", "jsonObject", "Lorg/json/JSONObject;", "toJson", "state", "safemode_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.safemode.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SafeModeState mo88862a(JSONObject jSONObject) {
            String optString;
            String optString2;
            Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObject");
            String optString3 = jSONObject.optString(ShareHitPoint.f121869d);
            if (optString3 == null || (optString = jSONObject.optString("proc")) == null || (optString2 = jSONObject.optString("ver")) == null) {
                return null;
            }
            long optLong = jSONObject.optLong("stamp", -1);
            int optInt = jSONObject.optInt("count", -1);
            if (optLong == -1 || optInt == -1) {
                return null;
            }
            return new SafeModeState(optString3, optLong, optString, optString2, optInt);
        }

        /* renamed from: a */
        public final JSONObject mo88863a(SafeModeState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "state");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, bVar.mo88854a());
            jSONObject.put("stamp", bVar.mo88855b());
            jSONObject.put("proc", bVar.mo88856c());
            jSONObject.put("ver", bVar.mo88857d());
            jSONObject.put("count", bVar.mo88858e());
            return jSONObject;
        }
    }

    /* renamed from: a */
    public final String mo88854a() {
        return this.f62328b;
    }

    /* renamed from: b */
    public final long mo88855b() {
        return this.f62329c;
    }

    /* renamed from: c */
    public final String mo88856c() {
        return this.f62330d;
    }

    /* renamed from: d */
    public final String mo88857d() {
        return this.f62331e;
    }

    /* renamed from: e */
    public final int mo88858e() {
        return this.f62332f;
    }

    public String toString() {
        return "[type:" + this.f62328b + ", process:" + this.f62330d + ", appVersion:" + this.f62331e + ", stamp:" + this.f62329c + ", count:" + this.f62332f + ']';
    }

    public SafeModeState(String str, long j, String str2, String str3, int i) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "process");
        Intrinsics.checkParameterIsNotNull(str3, "appVersion");
        this.f62328b = str;
        this.f62329c = j;
        this.f62330d = str2;
        this.f62331e = str3;
        this.f62332f = i;
    }
}
