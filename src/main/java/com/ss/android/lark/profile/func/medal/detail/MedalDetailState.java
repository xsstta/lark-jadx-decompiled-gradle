package com.ss.android.lark.profile.func.medal.detail;

import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.State;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.pb.ug.GetUserMedalDetailResponse;
import com.ss.android.lark.pb.ug.GetUserTakingMedalResponse;
import com.ss.android.lark.pb.ug.I18nVal;
import com.ss.android.lark.profile.func.medal.p2523b.C52356a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Be\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\u0011\u00106\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003Jm\u00107\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u00108\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\fHÖ\u0001J\t\u0010<\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001fR\u0011\u0010!\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0013\u0010&\u001a\u0004\u0018\u00010'8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001d¨\u0006="}, d2 = {"Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "Lcom/larksuite/arch/jack/State;", "getMedalRequest", "Lcom/larksuite/arch/jack/Async;", "Lcom/ss/android/lark/pb/ug/GetUserMedalDetailResponse;", "getUserWearMedalRequest", "Lcom/ss/android/lark/pb/ug/GetUserTakingMedalResponse;", "userId", "", "medalId", "grantId", ShareHitPoint.f121868c, "", "isLoadMedalFaild", "", "medalDetailViewPointEvent", "Lcom/larksuite/arch/jack/Event;", "", "(Lcom/larksuite/arch/jack/Async;Lcom/larksuite/arch/jack/Async;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/larksuite/arch/jack/Event;)V", "effectTime", "", "getEffectTime", "()Ljava/lang/Long;", "expireTime", "getExpireTime", "getGetMedalRequest", "()Lcom/larksuite/arch/jack/Async;", "getGetUserWearMedalRequest", "getGrantId", "()Ljava/lang/String;", "isFromMedalWall", "()Z", "isInValid", "medalDetail", "getMedalDetail", "getMedalDetailViewPointEvent", "()Lcom/larksuite/arch/jack/Event;", "getMedalId", "medalImage", "Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;", "getMedalImage", "()Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;", "medalName", "getMedalName", "getSource", "()I", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.detail.i */
public final class MedalDetailState implements State {

    /* renamed from: a */
    private final Async<GetUserMedalDetailResponse> f129809a;

    /* renamed from: b */
    private final Async<GetUserTakingMedalResponse> f129810b;

    /* renamed from: c */
    private final String f129811c;

    /* renamed from: d */
    private final String f129812d;

    /* renamed from: e */
    private final String f129813e;

    /* renamed from: f */
    private final int f129814f;

    /* renamed from: g */
    private final boolean f129815g;

    /* renamed from: h */
    private final Event<Unit> f129816h;

    /* renamed from: a */
    public static /* synthetic */ MedalDetailState m203110a(MedalDetailState iVar, Async aVar, Async aVar2, String str, String str2, String str3, int i, boolean z, Event dVar, int i2, Object obj) {
        return iVar.mo179284a((i2 & 1) != 0 ? iVar.f129809a : aVar, (i2 & 2) != 0 ? iVar.f129810b : aVar2, (i2 & 4) != 0 ? iVar.f129811c : str, (i2 & 8) != 0 ? iVar.f129812d : str2, (i2 & 16) != 0 ? iVar.f129813e : str3, (i2 & 32) != 0 ? iVar.f129814f : i, (i2 & 64) != 0 ? iVar.f129815g : z, (i2 & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? iVar.f129816h : dVar);
    }

    /* renamed from: a */
    public final MedalDetailState mo179284a(Async<GetUserMedalDetailResponse> aVar, Async<GetUserTakingMedalResponse> aVar2, String str, String str2, String str3, int i, boolean z, Event<Unit> dVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "getMedalRequest");
        Intrinsics.checkParameterIsNotNull(aVar2, "getUserWearMedalRequest");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "medalId");
        Intrinsics.checkParameterIsNotNull(str3, "grantId");
        return new MedalDetailState(aVar, aVar2, str, str2, str3, i, z, dVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MedalDetailState)) {
            return false;
        }
        MedalDetailState iVar = (MedalDetailState) obj;
        return Intrinsics.areEqual(this.f129809a, iVar.f129809a) && Intrinsics.areEqual(this.f129810b, iVar.f129810b) && Intrinsics.areEqual(this.f129811c, iVar.f129811c) && Intrinsics.areEqual(this.f129812d, iVar.f129812d) && Intrinsics.areEqual(this.f129813e, iVar.f129813e) && this.f129814f == iVar.f129814f && this.f129815g == iVar.f129815g && Intrinsics.areEqual(this.f129816h, iVar.f129816h);
    }

    public int hashCode() {
        Async<GetUserMedalDetailResponse> aVar = this.f129809a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Async<GetUserTakingMedalResponse> aVar2 = this.f129810b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        String str = this.f129811c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f129812d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f129813e;
        int hashCode5 = (((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f129814f) * 31;
        boolean z = this.f129815g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode5 + i2) * 31;
        Event<Unit> dVar = this.f129816h;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return i5 + i;
    }

    public String toString() {
        return "MedalDetailState(getMedalRequest=" + this.f129809a + ", getUserWearMedalRequest=" + this.f129810b + ", userId=" + this.f129811c + ", medalId=" + this.f129812d + ", grantId=" + this.f129813e + ", source=" + this.f129814f + ", isLoadMedalFaild=" + this.f129815g + ", medalDetailViewPointEvent=" + this.f129816h + ")";
    }

    /* renamed from: h */
    public final String mo179293h() {
        return this.f129812d;
    }

    /* renamed from: i */
    public final Event<Unit> mo179295i() {
        return this.f129816h;
    }

    /* renamed from: a */
    public final boolean mo179285a() {
        if (this.f129814f == MedalDetailSource.SOURCE_MEDAL_WALL.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final ImageSetPassThrough mo179286b() {
        if (mo179285a()) {
            GetUserMedalDetailResponse a = this.f129809a.mo86206a();
            if (a != null) {
                return a.mmedal_image;
            }
            return null;
        }
        GetUserTakingMedalResponse a2 = this.f129810b.mo86206a();
        if (a2 != null) {
            return a2.mmedal_image;
        }
        return null;
    }

    /* renamed from: c */
    public final String mo179287c() {
        String str;
        I18nVal i18nVal;
        I18nVal i18nVal2;
        if (mo179285a()) {
            GetUserMedalDetailResponse a = this.f129809a.mo86206a();
            if (a == null || (i18nVal2 = a.mname) == null || (str = C52356a.m203084a(i18nVal2)) == null) {
                return "";
            }
        } else {
            GetUserTakingMedalResponse a2 = this.f129810b.mo86206a();
            if (a2 == null || (i18nVal = a2.mname) == null || (str = C52356a.m203084a(i18nVal)) == null) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: d */
    public final String mo179288d() {
        String str;
        I18nVal i18nVal;
        I18nVal i18nVal2;
        if (mo179285a()) {
            GetUserMedalDetailResponse a = this.f129809a.mo86206a();
            if (a == null || (i18nVal2 = a.mexplanation) == null || (str = C52356a.m203084a(i18nVal2)) == null) {
                return "";
            }
        } else {
            GetUserTakingMedalResponse a2 = this.f129810b.mo86206a();
            if (a2 == null || (i18nVal = a2.mexplanation) == null || (str = C52356a.m203084a(i18nVal)) == null) {
                return "";
            }
        }
        return str;
    }

    /* renamed from: e */
    public final Long mo179289e() {
        if (mo179285a()) {
            GetUserMedalDetailResponse a = this.f129809a.mo86206a();
            if (a != null) {
                return a.meffect_time;
            }
            return null;
        }
        GetUserTakingMedalResponse a2 = this.f129810b.mo86206a();
        if (a2 != null) {
            return a2.meffect_time;
        }
        return null;
    }

    /* renamed from: f */
    public final Long mo179291f() {
        if (mo179285a()) {
            GetUserMedalDetailResponse a = this.f129809a.mo86206a();
            if (a != null) {
                return a.mexpire_time;
            }
            return null;
        }
        GetUserTakingMedalResponse a2 = this.f129810b.mo86206a();
        if (a2 != null) {
            return a2.mexpire_time;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo179292g() {
        /*
            r3 = this;
            boolean r0 = r3.mo179285a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            com.larksuite.arch.jack.a<com.ss.android.lark.pb.ug.GetUserMedalDetailResponse> r0 = r3.f129809a
            java.lang.Object r0 = r0.mo86206a()
            com.ss.android.lark.pb.ug.GetUserMedalDetailResponse r0 = (com.ss.android.lark.pb.ug.GetUserMedalDetailResponse) r0
            if (r0 == 0) goto L_0x001b
            java.lang.Boolean r0 = r0.mis_valid
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.booleanValue()
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 != 0) goto L_0x0036
            goto L_0x0035
        L_0x001f:
            com.larksuite.arch.jack.a<com.ss.android.lark.pb.ug.GetUserTakingMedalResponse> r0 = r3.f129810b
            java.lang.Object r0 = r0.mo86206a()
            com.ss.android.lark.pb.ug.GetUserTakingMedalResponse r0 = (com.ss.android.lark.pb.ug.GetUserTakingMedalResponse) r0
            if (r0 == 0) goto L_0x0032
            java.lang.Boolean r0 = r0.mis_valid
            if (r0 == 0) goto L_0x0032
            boolean r0 = r0.booleanValue()
            goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 != 0) goto L_0x0036
        L_0x0035:
            r1 = 1
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.medal.detail.MedalDetailState.mo179292g():boolean");
    }

    public MedalDetailState(Async<GetUserMedalDetailResponse> aVar, Async<GetUserTakingMedalResponse> aVar2, String str, String str2, String str3, int i, boolean z, Event<Unit> dVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "getMedalRequest");
        Intrinsics.checkParameterIsNotNull(aVar2, "getUserWearMedalRequest");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "medalId");
        Intrinsics.checkParameterIsNotNull(str3, "grantId");
        this.f129809a = aVar;
        this.f129810b = aVar2;
        this.f129811c = str;
        this.f129812d = str2;
        this.f129813e = str3;
        this.f129814f = i;
        this.f129815g = z;
        this.f129816h = dVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MedalDetailState(com.larksuite.arch.jack.Async r12, com.larksuite.arch.jack.Async r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, boolean r18, com.larksuite.arch.jack.Event r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r11 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            com.larksuite.arch.jack.ac r1 = com.larksuite.arch.jack.Uninitialized.f59411a
            com.larksuite.arch.jack.a r1 = (com.larksuite.arch.jack.Async) r1
            r3 = r1
            goto L_0x000d
        L_0x000c:
            r3 = r12
        L_0x000d:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0017
            com.larksuite.arch.jack.ac r1 = com.larksuite.arch.jack.Uninitialized.f59411a
            com.larksuite.arch.jack.a r1 = (com.larksuite.arch.jack.Async) r1
            r4 = r1
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r1 = r0 & 4
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0021
        L_0x0020:
            r5 = r14
        L_0x0021:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0028
        L_0x0027:
            r6 = r15
        L_0x0028:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002f
            r1 = 0
            r9 = 0
            goto L_0x0031
        L_0x002f:
            r9 = r18
        L_0x0031:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            r0 = 0
            com.larksuite.arch.jack.d r0 = (com.larksuite.arch.jack.Event) r0
            r10 = r0
            goto L_0x003c
        L_0x003a:
            r10 = r19
        L_0x003c:
            r2 = r11
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.medal.detail.MedalDetailState.<init>(com.larksuite.arch.jack.a, com.larksuite.arch.jack.a, java.lang.String, java.lang.String, java.lang.String, int, boolean, com.larksuite.arch.jack.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
