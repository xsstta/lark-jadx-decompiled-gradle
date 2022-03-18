package com.ss.android.lark.profile.func.medal.wall;

import android.graphics.drawable.Drawable;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.State;
import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.pb.ug.I18nVal;
import com.ss.android.lark.pb.ug.ListUserMedalsResponse;
import com.ss.android.lark.pb.ug.MedalItem;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.medal.Medal;
import com.ss.android.lark.profile.func.medal.p2523b.C52356a;
import com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.profile.func.medal.wall.n */
public final class MedalWallState implements State {

    /* renamed from: a */
    private final Async<ListUserMedalsResponse> f129864a;

    /* renamed from: b */
    private final String f129865b;

    /* renamed from: c */
    private final boolean f129866c;

    /* renamed from: d */
    private final boolean f129867d;

    /* renamed from: e */
    private final boolean f129868e;

    /* renamed from: f */
    private final Drawable f129869f;

    /* renamed from: g */
    private final Medal f129870g;

    /* renamed from: h */
    private final Event<String> f129871h;

    /* renamed from: i */
    private final Event<Unit> f129872i;

    public MedalWallState() {
        this(null, null, false, false, false, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
    }

    /* renamed from: a */
    public static /* synthetic */ MedalWallState m203168a(MedalWallState nVar, Async aVar, String str, boolean z, boolean z2, boolean z3, Drawable drawable, Medal aVar2, Event dVar, Event dVar2, int i, Object obj) {
        return nVar.mo179355a((i & 1) != 0 ? nVar.f129864a : aVar, (i & 2) != 0 ? nVar.f129865b : str, (i & 4) != 0 ? nVar.f129866c : z, (i & 8) != 0 ? nVar.f129867d : z2, (i & 16) != 0 ? nVar.f129868e : z3, (i & 32) != 0 ? nVar.f129869f : drawable, (i & 64) != 0 ? nVar.f129870g : aVar2, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? nVar.f129871h : dVar, (i & DynamicModule.f58006b) != 0 ? nVar.f129872i : dVar2);
    }

    /* renamed from: a */
    public final MedalWallState mo179355a(Async<ListUserMedalsResponse> aVar, String str, boolean z, boolean z2, boolean z3, Drawable drawable, Medal aVar2, Event<String> dVar, Event<Unit> dVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "getMedalListRequest");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(dVar, "toastEvent");
        return new MedalWallState(aVar, str, z, z2, z3, drawable, aVar2, dVar, dVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MedalWallState)) {
            return false;
        }
        MedalWallState nVar = (MedalWallState) obj;
        return Intrinsics.areEqual(this.f129864a, nVar.f129864a) && Intrinsics.areEqual(this.f129865b, nVar.f129865b) && this.f129866c == nVar.f129866c && this.f129867d == nVar.f129867d && this.f129868e == nVar.f129868e && Intrinsics.areEqual(this.f129869f, nVar.f129869f) && Intrinsics.areEqual(this.f129870g, nVar.f129870g) && Intrinsics.areEqual(this.f129871h, nVar.f129871h) && Intrinsics.areEqual(this.f129872i, nVar.f129872i);
    }

    public int hashCode() {
        Async<ListUserMedalsResponse> aVar = this.f129864a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        String str = this.f129865b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f129866c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        boolean z2 = this.f129867d;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f129868e;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (i10 + i2) * 31;
        Drawable drawable = this.f129869f;
        int hashCode3 = (i11 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Medal aVar2 = this.f129870g;
        int hashCode4 = (hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        Event<String> dVar = this.f129871h;
        int hashCode5 = (hashCode4 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Event<Unit> dVar2 = this.f129872i;
        if (dVar2 != null) {
            i = dVar2.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "MedalWallState(getMedalListRequest=" + this.f129864a + ", userId=" + this.f129865b + ", isResigned=" + this.f129866c + ", isSameTenant=" + this.f129867d + ", isLoadMedalsError=" + this.f129868e + ", screenShotBlur=" + this.f129869f + ", medalSelected=" + this.f129870g + ", toastEvent=" + this.f129871h + ", medalWallPointEvent=" + this.f129872i + ")";
    }

    /* renamed from: j */
    public final Async<ListUserMedalsResponse> mo179366j() {
        return this.f129864a;
    }

    /* renamed from: k */
    public final String mo179367k() {
        return this.f129865b;
    }

    /* renamed from: l */
    public final boolean mo179368l() {
        return this.f129866c;
    }

    /* renamed from: m */
    public final boolean mo179369m() {
        return this.f129867d;
    }

    /* renamed from: n */
    public final Drawable mo179370n() {
        return this.f129869f;
    }

    /* renamed from: o */
    public final Medal mo179371o() {
        return this.f129870g;
    }

    /* renamed from: p */
    public final Event<String> mo179372p() {
        return this.f129871h;
    }

    /* renamed from: q */
    public final Event<Unit> mo179373q() {
        return this.f129872i;
    }

    /* renamed from: c */
    public final ImageSetPassThrough mo179357c() {
        return m203170r();
    }

    /* renamed from: f */
    public final int mo179361f() {
        return mo179358d().size() - mo179359e();
    }

    /* renamed from: a */
    public final ImageSetPassThrough mo179354a() {
        ListUserMedalsResponse.UserInfo userInfo;
        ListUserMedalsResponse a = this.f129864a.mo86206a();
        if (a == null || (userInfo = a.muser_info) == null) {
            return null;
        }
        return userInfo.mtop_image;
    }

    /* renamed from: b */
    public final String mo179356b() {
        ListUserMedalsResponse.UserInfo userInfo;
        String str;
        ListUserMedalsResponse a = this.f129864a.mo86206a();
        if (a == null || (userInfo = a.muser_info) == null || (str = userInfo.mavatar_key) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: d */
    public final List<Medal> mo179358d() {
        List<MedalItem> list;
        ListUserMedalsResponse a = this.f129864a.mo86206a();
        if (a != null) {
            list = a.mmedal_list;
        } else {
            list = null;
        }
        return m203169a(list);
    }

    /* renamed from: h */
    public final boolean mo179363h() {
        String str = this.f129865b;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52253g q = d.mo133587q();
        Intrinsics.checkExpressionValueIsNotNull(q, "ProfileModule.getDependency().loginDependency");
        return Intrinsics.areEqual(str, q.mo133622a());
    }

    /* renamed from: i */
    public final boolean mo179365i() {
        List<MedalItem> list;
        ListUserMedalsResponse a = this.f129864a.mo86206a();
        if (a == null || (list = a.mmedal_list) == null) {
            return false;
        }
        return list.isEmpty();
    }

    /* renamed from: r */
    private final ImageSetPassThrough m203170r() {
        T t;
        boolean z;
        Iterator<T> it = mo179358d().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.mo179234e() == MedalWallAdapter.MedalStatus.WORN) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            return t2.mo179231b();
        }
        return null;
    }

    /* renamed from: e */
    public final int mo179359e() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (T t : mo179358d()) {
            T t2 = t;
            if (t2.mo179234e() == MedalWallAdapter.MedalStatus.VALID || t2.mo179234e() == MedalWallAdapter.MedalStatus.WORN) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        return arrayList.size();
    }

    /* renamed from: g */
    public final boolean mo179362g() {
        T t;
        boolean z;
        Iterator<T> it = mo179358d().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.mo179234e() == MedalWallAdapter.MedalStatus.WORN) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (t != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final List<Medal> m203169a(List<MedalItem> list) {
        boolean z;
        List<MedalItem> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String str = t.mmedal_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.mmedal_id");
            ImageSetPassThrough imageSetPassThrough = t.mmedal_show_image;
            ImageSetPassThrough imageSetPassThrough2 = t.mmedal_image;
            I18nVal i18nVal = t.mname;
            Intrinsics.checkExpressionValueIsNotNull(i18nVal, "it.mname");
            String a = C52356a.m203084a(i18nVal);
            MedalItem.MedalStatus medalStatus = t.mstatus;
            Intrinsics.checkExpressionValueIsNotNull(medalStatus, "it.mstatus");
            MedalWallAdapter.MedalStatus a2 = C52356a.m203083a(medalStatus);
            String str2 = t.mgrant_id;
            Intrinsics.checkExpressionValueIsNotNull(str2, "it.mgrant_id");
            arrayList.add(new Medal(str, imageSetPassThrough, imageSetPassThrough2, a, a2, str2));
        }
        return arrayList;
    }

    public MedalWallState(Async<ListUserMedalsResponse> aVar, String str, boolean z, boolean z2, boolean z3, Drawable drawable, Medal aVar2, Event<String> dVar, Event<Unit> dVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "getMedalListRequest");
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(dVar, "toastEvent");
        this.f129864a = aVar;
        this.f129865b = str;
        this.f129866c = z;
        this.f129867d = z2;
        this.f129868e = z3;
        this.f129869f = drawable;
        this.f129870g = aVar2;
        this.f129871h = dVar;
        this.f129872i = dVar2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MedalWallState(com.larksuite.arch.jack.Async r11, java.lang.String r12, boolean r13, boolean r14, boolean r15, android.graphics.drawable.Drawable r16, com.ss.android.lark.profile.func.medal.Medal r17, com.larksuite.arch.jack.Event r18, com.larksuite.arch.jack.Event r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.medal.wall.MedalWallState.<init>(com.larksuite.arch.jack.a, java.lang.String, boolean, boolean, boolean, android.graphics.drawable.Drawable, com.ss.android.lark.profile.func.medal.a, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
