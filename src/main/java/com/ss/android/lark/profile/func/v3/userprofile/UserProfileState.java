package com.ss.android.lark.profile.func.v3.userprofile;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.AvatarMedal;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.DeniedReason;
import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.bytedance.lark.pb.basic.v1.WorkStatus;
import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Event;
import com.larksuite.arch.jack.State;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.profile.C52239a;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;
import com.ss.android.lark.profile.func.user_profile.action.ActionBtnViewData;
import com.ss.android.lark.profile.func.v3.userprofile.fields.InfoViewDataParserV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.alias.AliasItemViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import com.ss.android.lark.profile.func.v3.userprofile.fields.description.DescriptionViewData;
import com.ss.android.lark.profile.func.v3.userprofile.fields.phone_number.PhoneNumberItemViewDataV3;
import com.ss.android.lark.profile.statistics.UserProfileExtraParams;
import com.ss.android.lark.profile.v2.entity.AliasDescriptionField;
import com.ss.android.lark.profile.v2.entity.BaseField;
import com.ss.android.lark.profile.v2.entity.DepartmentField;
import com.ss.android.lark.profile.v2.entity.DescriptionField;
import com.ss.android.lark.profile.v2.entity.HrefField;
import com.ss.android.lark.profile.v2.entity.HrefListField;
import com.ss.android.lark.profile.v2.entity.PhoneNumberField;
import com.ss.android.lark.profile.v2.entity.TextField;
import com.ss.android.lark.profile.v2.entity.TextListField;
import com.ss.android.lark.profile.v2.service.ModelParser;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.widget.span.RecogniseSpansResult;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az */
public final class UserProfileState implements State {

    /* renamed from: a */
    private final boolean f130390a;

    /* renamed from: b */
    private final boolean f130391b;

    /* renamed from: c */
    private final boolean f130392c;

    /* renamed from: d */
    private final boolean f130393d;

    /* renamed from: e */
    private final boolean f130394e;

    /* renamed from: f */
    private final String f130395f;

    /* renamed from: g */
    private final String f130396g;

    /* renamed from: h */
    private final Lazy f130397h;

    /* renamed from: i */
    private final Lazy f130398i;

    /* renamed from: j */
    private final Async<GetUserProfileResponse> f130399j;

    /* renamed from: k */
    private final Event<String> f130400k;

    /* renamed from: l */
    private final Event<Boolean> f130401l;

    /* renamed from: m */
    private final Event<String> f130402m;

    /* renamed from: n */
    private final String f130403n;

    /* renamed from: o */
    private final String f130404o;

    /* renamed from: p */
    private final Event<Unit> f130405p;

    /* renamed from: q */
    private final boolean f130406q;

    /* renamed from: r */
    private final boolean f130407r;

    /* renamed from: s */
    private final boolean f130408s;

    /* renamed from: t */
    private final RecogniseSpansResult f130409t;

    /* renamed from: u */
    private final Event<Chatter.ChatterCustomStatus> f130410u;

    /* renamed from: v */
    private final Event<Boolean> f130411v;

    /* renamed from: w */
    private final Event<IconToast> f130412w;

    public UserProfileState() {
        this(null, null, null, null, null, null, null, false, false, false, null, null, null, null, 16383, null);
    }

    /* renamed from: a */
    public static /* synthetic */ UserProfileState m204146a(UserProfileState azVar, Async aVar, Event dVar, Event dVar2, Event dVar3, String str, String str2, Event dVar4, boolean z, boolean z2, boolean z3, RecogniseSpansResult recogniseSpansResult, Event dVar5, Event dVar6, Event dVar7, int i, Object obj) {
        return azVar.mo180021a((i & 1) != 0 ? azVar.f130399j : aVar, (i & 2) != 0 ? azVar.f130400k : dVar, (i & 4) != 0 ? azVar.f130401l : dVar2, (i & 8) != 0 ? azVar.f130402m : dVar3, (i & 16) != 0 ? azVar.f130403n : str, (i & 32) != 0 ? azVar.f130404o : str2, (i & 64) != 0 ? azVar.f130405p : dVar4, (i & SmActions.ACTION_ONTHECALL_EXIT) != 0 ? azVar.f130406q : z, (i & DynamicModule.f58006b) != 0 ? azVar.f130407r : z2, (i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0 ? azVar.f130408s : z3, (i & 1024) != 0 ? azVar.f130409t : recogniseSpansResult, (i & 2048) != 0 ? azVar.f130410u : dVar5, (i & 4096) != 0 ? azVar.f130411v : dVar6, (i & 8192) != 0 ? azVar.f130412w : dVar7);
    }

    /* renamed from: P */
    public final String mo180010P() {
        return (String) this.f130397h.getValue();
    }

    /* renamed from: Q */
    public final UserProfileExtraParams.ContactTypeParam mo180011Q() {
        return (UserProfileExtraParams.ContactTypeParam) this.f130398i.getValue();
    }

    /* renamed from: a */
    public final UserProfileState mo180021a(Async<GetUserProfileResponse> aVar, Event<String> dVar, Event<Boolean> dVar2, Event<String> dVar3, String str, String str2, Event<Unit> dVar4, boolean z, boolean z2, boolean z3, RecogniseSpansResult recogniseSpansResult, Event<Chatter.ChatterCustomStatus> dVar5, Event<Boolean> dVar6, Event<IconToast> dVar7) {
        Intrinsics.checkParameterIsNotNull(aVar, "request");
        Intrinsics.checkParameterIsNotNull(dVar, "createP2pSecretChatEvent");
        Intrinsics.checkParameterIsNotNull(dVar2, "agreeChatApplicationEvent");
        Intrinsics.checkParameterIsNotNull(dVar3, "toastEvent");
        Intrinsics.checkParameterIsNotNull(dVar5, "openedCustomStatusEvent");
        Intrinsics.checkParameterIsNotNull(dVar6, "mainViewPointEvent");
        Intrinsics.checkParameterIsNotNull(dVar7, "iconToastEvent");
        return new UserProfileState(aVar, dVar, dVar2, dVar3, str, str2, dVar4, z, z2, z3, recogniseSpansResult, dVar5, dVar6, dVar7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileState)) {
            return false;
        }
        UserProfileState azVar = (UserProfileState) obj;
        return Intrinsics.areEqual(this.f130399j, azVar.f130399j) && Intrinsics.areEqual(this.f130400k, azVar.f130400k) && Intrinsics.areEqual(this.f130401l, azVar.f130401l) && Intrinsics.areEqual(this.f130402m, azVar.f130402m) && Intrinsics.areEqual(this.f130403n, azVar.f130403n) && Intrinsics.areEqual(this.f130404o, azVar.f130404o) && Intrinsics.areEqual(this.f130405p, azVar.f130405p) && this.f130406q == azVar.f130406q && this.f130407r == azVar.f130407r && this.f130408s == azVar.f130408s && Intrinsics.areEqual(this.f130409t, azVar.f130409t) && Intrinsics.areEqual(this.f130410u, azVar.f130410u) && Intrinsics.areEqual(this.f130411v, azVar.f130411v) && Intrinsics.areEqual(this.f130412w, azVar.f130412w);
    }

    public int hashCode() {
        Async<GetUserProfileResponse> aVar = this.f130399j;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Event<String> dVar = this.f130400k;
        int hashCode2 = (hashCode + (dVar != null ? dVar.hashCode() : 0)) * 31;
        Event<Boolean> dVar2 = this.f130401l;
        int hashCode3 = (hashCode2 + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        Event<String> dVar3 = this.f130402m;
        int hashCode4 = (hashCode3 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        String str = this.f130403n;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f130404o;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Event<Unit> dVar4 = this.f130405p;
        int hashCode7 = (hashCode6 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        boolean z = this.f130406q;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode7 + i3) * 31;
        boolean z2 = this.f130407r;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f130408s;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (i10 + i2) * 31;
        RecogniseSpansResult recogniseSpansResult = this.f130409t;
        int hashCode8 = (i11 + (recogniseSpansResult != null ? recogniseSpansResult.hashCode() : 0)) * 31;
        Event<Chatter.ChatterCustomStatus> dVar5 = this.f130410u;
        int hashCode9 = (hashCode8 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31;
        Event<Boolean> dVar6 = this.f130411v;
        int hashCode10 = (hashCode9 + (dVar6 != null ? dVar6.hashCode() : 0)) * 31;
        Event<IconToast> dVar7 = this.f130412w;
        if (dVar7 != null) {
            i = dVar7.hashCode();
        }
        return hashCode10 + i;
    }

    public String toString() {
        return "UserProfileState(request=" + this.f130399j + ", createP2pSecretChatEvent=" + this.f130400k + ", agreeChatApplicationEvent=" + this.f130401l + ", toastEvent=" + this.f130402m + ", nameCardId=" + this.f130403n + ", email=" + this.f130404o + ", finishEvent=" + this.f130405p + ", showLoadDataError=" + this.f130406q + ", showEmptyPage=" + this.f130407r + ", showPrivateOnboarding=" + this.f130408s + ", userStatusSpanResult=" + this.f130409t + ", openedCustomStatusEvent=" + this.f130410u + ", mainViewPointEvent=" + this.f130411v + ", iconToastEvent=" + this.f130412w + ")";
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$a */
    public static final class CtaInfo {

        /* renamed from: a */
        private final String f130413a;

        /* renamed from: b */
        private final String f130414b;

        /* renamed from: c */
        private final boolean f130415c;

        /* renamed from: d */
        private final GetUserProfileResponse.CTA.CTAType f130416d;

        /* renamed from: e */
        private final String f130417e;

        /* renamed from: f */
        private final String f130418f;

        /* renamed from: g */
        private final String f130419g;

        /* renamed from: h */
        private final DeniedReason f130420h;

        /* renamed from: i */
        private final boolean f130421i;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CtaInfo)) {
                return false;
            }
            CtaInfo aVar = (CtaInfo) obj;
            return Intrinsics.areEqual(this.f130413a, aVar.f130413a) && Intrinsics.areEqual(this.f130414b, aVar.f130414b) && this.f130415c == aVar.f130415c && Intrinsics.areEqual(this.f130416d, aVar.f130416d) && Intrinsics.areEqual(this.f130417e, aVar.f130417e) && Intrinsics.areEqual(this.f130418f, aVar.f130418f) && Intrinsics.areEqual(this.f130419g, aVar.f130419g) && Intrinsics.areEqual(this.f130420h, aVar.f130420h) && this.f130421i == aVar.f130421i;
        }

        public int hashCode() {
            String str = this.f130413a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f130414b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.f130415c;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode2 + i3) * 31;
            GetUserProfileResponse.CTA.CTAType cTAType = this.f130416d;
            int hashCode3 = (i6 + (cTAType != null ? cTAType.hashCode() : 0)) * 31;
            String str3 = this.f130417e;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f130418f;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f130419g;
            int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            DeniedReason deniedReason = this.f130420h;
            if (deniedReason != null) {
                i = deniedReason.hashCode();
            }
            int i7 = (hashCode6 + i) * 31;
            boolean z2 = this.f130421i;
            if (!z2) {
                i2 = z2 ? 1 : 0;
            }
            return i7 + i2;
        }

        public String toString() {
            return "CtaInfo(key=" + this.f130413a + ", label=" + this.f130414b + ", enable=" + this.f130415c + ", type=" + this.f130416d + ", link=" + this.f130417e + ", iconKey=" + this.f130418f + ", deniedDescription=" + this.f130419g + ", deniedReason=" + this.f130420h + ", isResigned=" + this.f130421i + ")";
        }

        /* renamed from: a */
        public final String mo180063a() {
            return this.f130413a;
        }

        /* renamed from: b */
        public final String mo180064b() {
            return this.f130414b;
        }

        /* renamed from: c */
        public final boolean mo180065c() {
            return this.f130415c;
        }

        /* renamed from: d */
        public final GetUserProfileResponse.CTA.CTAType mo180066d() {
            return this.f130416d;
        }

        /* renamed from: e */
        public final String mo180067e() {
            return this.f130419g;
        }

        /* renamed from: f */
        public final DeniedReason mo180069f() {
            return this.f130420h;
        }

        /* renamed from: g */
        public final boolean mo180070g() {
            return this.f130421i;
        }

        public CtaInfo(String str, String str2, boolean z, GetUserProfileResponse.CTA.CTAType cTAType, String str3, String str4, String str5, DeniedReason deniedReason, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "label");
            Intrinsics.checkParameterIsNotNull(cTAType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str3, "link");
            Intrinsics.checkParameterIsNotNull(str4, "iconKey");
            Intrinsics.checkParameterIsNotNull(str5, "deniedDescription");
            Intrinsics.checkParameterIsNotNull(deniedReason, "deniedReason");
            this.f130413a = str;
            this.f130414b = str2;
            this.f130415c = z;
            this.f130416d = cTAType;
            this.f130417e = str3;
            this.f130418f = str4;
            this.f130419g = str5;
            this.f130420h = deniedReason;
            this.f130421i = z2;
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$b */
    public static final class DepartmentTagInfo {

        /* renamed from: a */
        private final boolean f130422a;

        /* renamed from: b */
        private final boolean f130423b;

        /* renamed from: c */
        private final String f130424c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DepartmentTagInfo)) {
                return false;
            }
            DepartmentTagInfo bVar = (DepartmentTagInfo) obj;
            return this.f130422a == bVar.f130422a && this.f130423b == bVar.f130423b && Intrinsics.areEqual(this.f130424c, bVar.f130424c);
        }

        public int hashCode() {
            boolean z = this.f130422a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.f130423b;
            if (!z2) {
                i = z2 ? 1 : 0;
            }
            int i6 = (i5 + i) * 31;
            String str = this.f130424c;
            return i6 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "DepartmentTagInfo(hasTenantCertification=" + this.f130422a + ", isTenantCertification=" + this.f130423b + ", tenantCertificationUrl=" + this.f130424c + ")";
        }

        /* renamed from: a */
        public final boolean mo180073a() {
            return this.f130422a;
        }

        /* renamed from: b */
        public final boolean mo180074b() {
            return this.f130423b;
        }

        /* renamed from: c */
        public final String mo180075c() {
            return this.f130424c;
        }

        public DepartmentTagInfo(boolean z, boolean z2, String str) {
            this.f130422a = z;
            this.f130423b = z2;
            this.f130424c = str;
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$c */
    public static final class NameTagInfo {

        /* renamed from: a */
        private final GetUserProfileResponse.UserInfo.Gender f130425a;

        /* renamed from: b */
        private final boolean f130426b;

        /* renamed from: c */
        private final boolean f130427c;

        /* renamed from: d */
        private final WorkStatus f130428d;

        /* renamed from: e */
        private final boolean f130429e;

        /* renamed from: f */
        private final boolean f130430f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameTagInfo)) {
                return false;
            }
            NameTagInfo cVar = (NameTagInfo) obj;
            return Intrinsics.areEqual(this.f130425a, cVar.f130425a) && this.f130426b == cVar.f130426b && this.f130427c == cVar.f130427c && Intrinsics.areEqual(this.f130428d, cVar.f130428d) && this.f130429e == cVar.f130429e && this.f130430f == cVar.f130430f;
        }

        public int hashCode() {
            GetUserProfileResponse.UserInfo.Gender gender = this.f130425a;
            int i = 0;
            int hashCode = (gender != null ? gender.hashCode() : 0) * 31;
            boolean z = this.f130426b;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (hashCode + i3) * 31;
            boolean z2 = this.f130427c;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            WorkStatus workStatus = this.f130428d;
            if (workStatus != null) {
                i = workStatus.hashCode();
            }
            int i11 = (i10 + i) * 31;
            boolean z3 = this.f130429e;
            if (z3) {
                z3 = true;
            }
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = z3 ? 1 : 0;
            int i15 = (i11 + i12) * 31;
            boolean z4 = this.f130430f;
            if (!z4) {
                i2 = z4 ? 1 : 0;
            }
            return i15 + i2;
        }

        public String toString() {
            return "NameTagInfo(gender=" + this.f130425a + ", isBlocked=" + this.f130426b + ", isDoNotDisturb=" + this.f130427c + ", workState=" + this.f130428d + ", isFrozen=" + this.f130429e + ", isResigned=" + this.f130430f + ")";
        }

        /* renamed from: a */
        public final GetUserProfileResponse.UserInfo.Gender mo180079a() {
            return this.f130425a;
        }

        /* renamed from: b */
        public final boolean mo180080b() {
            return this.f130426b;
        }

        /* renamed from: c */
        public final boolean mo180081c() {
            return this.f130427c;
        }

        /* renamed from: d */
        public final WorkStatus mo180082d() {
            return this.f130428d;
        }

        /* renamed from: e */
        public final boolean mo180083e() {
            return this.f130429e;
        }

        /* renamed from: f */
        public final boolean mo180085f() {
            return this.f130430f;
        }

        public NameTagInfo(GetUserProfileResponse.UserInfo.Gender gender, boolean z, boolean z2, WorkStatus workStatus, boolean z3, boolean z4) {
            Intrinsics.checkParameterIsNotNull(gender, "gender");
            this.f130425a = gender;
            this.f130426b = z;
            this.f130427c = z2;
            this.f130428d = workStatus;
            this.f130429e = z3;
            this.f130430f = z4;
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$d */
    public static final class ShareInfo {

        /* renamed from: a */
        private final boolean f130431a;

        /* renamed from: b */
        private final String f130432b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShareInfo)) {
                return false;
            }
            ShareInfo dVar = (ShareInfo) obj;
            return this.f130431a == dVar.f130431a && Intrinsics.areEqual(this.f130432b, dVar.f130432b);
        }

        public int hashCode() {
            boolean z = this.f130431a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            String str = this.f130432b;
            return i4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "ShareInfo(enable=" + this.f130431a + ", deniedReason=" + this.f130432b + ")";
        }

        /* renamed from: a */
        public final boolean mo180088a() {
            return this.f130431a;
        }

        /* renamed from: b */
        public final String mo180089b() {
            return this.f130432b;
        }

        public ShareInfo(boolean z, String str) {
            this.f130431a = z;
            this.f130432b = str;
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$e */
    public static final class TabInfo {

        /* renamed from: a */
        private final String f130433a;

        /* renamed from: b */
        private final String f130434b;

        /* renamed from: c */
        private final GetUserProfileResponse.TabInfo.TabType f130435c;

        /* renamed from: d */
        private final String f130436d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabInfo)) {
                return false;
            }
            TabInfo eVar = (TabInfo) obj;
            return Intrinsics.areEqual(this.f130433a, eVar.f130433a) && Intrinsics.areEqual(this.f130434b, eVar.f130434b) && Intrinsics.areEqual(this.f130435c, eVar.f130435c) && Intrinsics.areEqual(this.f130436d, eVar.f130436d);
        }

        public int hashCode() {
            String str = this.f130433a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f130434b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            GetUserProfileResponse.TabInfo.TabType tabType = this.f130435c;
            int hashCode3 = (hashCode2 + (tabType != null ? tabType.hashCode() : 0)) * 31;
            String str3 = this.f130436d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            return "TabInfo(key=" + this.f130433a + ", name=" + this.f130434b + ", type=" + this.f130435c + ", jsonContent=" + this.f130436d + ")";
        }

        /* renamed from: a */
        public final String mo180093a() {
            return this.f130434b;
        }

        /* renamed from: b */
        public final GetUserProfileResponse.TabInfo.TabType mo180094b() {
            return this.f130435c;
        }

        public TabInfo(String str, String str2, GetUserProfileResponse.TabInfo.TabType tabType, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(str2, "name");
            Intrinsics.checkParameterIsNotNull(tabType, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(str3, "jsonContent");
            this.f130433a = str;
            this.f130434b = str2;
            this.f130435c = tabType;
            this.f130436d = str3;
        }
    }

    /* renamed from: C */
    public final boolean mo179997C() {
        return this.f130390a;
    }

    /* renamed from: G */
    public final boolean mo180001G() {
        return this.f130391b;
    }

    /* renamed from: H */
    public final boolean mo180002H() {
        return this.f130392c;
    }

    /* renamed from: I */
    public final boolean mo180003I() {
        return this.f130393d;
    }

    /* renamed from: J */
    public final boolean mo180004J() {
        return this.f130394e;
    }

    /* renamed from: Z */
    public final Async<GetUserProfileResponse> mo180020Z() {
        return this.f130399j;
    }

    public final Event<String> aa() {
        return this.f130400k;
    }

    public final Event<String> ab() {
        return this.f130402m;
    }

    public final String ac() {
        return this.f130403n;
    }

    public final String ad() {
        return this.f130404o;
    }

    public final Event<Unit> ae() {
        return this.f130405p;
    }

    public final boolean af() {
        return this.f130406q;
    }

    public final boolean ag() {
        return this.f130407r;
    }

    public final boolean ah() {
        return this.f130408s;
    }

    public final RecogniseSpansResult ai() {
        return this.f130409t;
    }

    public final Event<Chatter.ChatterCustomStatus> aj() {
        return this.f130410u;
    }

    public final Event<Boolean> ak() {
        return this.f130411v;
    }

    public final Event<IconToast> al() {
        return this.f130412w;
    }

    /* renamed from: a */
    public final String mo180022a() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        return (a == null || (userInfo = a.user_info) == null || (str = userInfo.user_name) == null) ? "" : str;
    }

    /* renamed from: F */
    public final boolean mo180000F() {
        return !mo180007M();
    }

    /* renamed from: q */
    public final AliasItemViewDataV3 mo180052q() {
        return ao();
    }

    /* renamed from: r */
    public final PhoneNumberItemViewDataV3 mo180053r() {
        return an();
    }

    /* renamed from: B */
    public final boolean mo179996B() {
        return this.f130390a | mo179999E() | mo180000F();
    }

    /* renamed from: O */
    public final boolean mo180009O() {
        if (mo180060x() == GetUserProfileResponse.UserInfo.FriendStatus.DOUBLE) {
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final boolean mo180013S() {
        return C52239a.m202617d().mo133561a("messenger.profile.badge");
    }

    /* renamed from: l */
    public final List<BaseInfoViewDataV3> mo180047l() {
        return InfoViewDataParserV3.f130467a.mo180229a(mo180046k());
    }

    /* renamed from: D */
    public final boolean mo179998D() {
        if (mo180007M() || GetUserProfileResponse.UserInfo.FriendStatus.DOUBLE != mo180060x()) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    public final boolean mo179999E() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (str = userInfo.leader_id) == null) {
            return false;
        }
        return Intrinsics.areEqual(str, this.f130396g);
    }

    /* renamed from: L */
    public final boolean mo180006L() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (str = userInfo.user_id) == null) {
            return false;
        }
        return Intrinsics.areEqual(str, this.f130396g);
    }

    /* renamed from: M */
    public final boolean mo180007M() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (str = userInfo.tenant_id) == null) {
            return false;
        }
        return Intrinsics.areEqual(str, this.f130395f);
    }

    /* renamed from: N */
    public final List<GetUserProfileResponse.CustomImage> mo180008N() {
        GetUserProfileResponse.UserInfo userInfo;
        List<GetUserProfileResponse.CustomImage> c;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (c = m204150c(userInfo)) == null) {
            return CollectionsKt.emptyList();
        }
        return c;
    }

    /* renamed from: R */
    public final String mo180012R() {
        GetUserProfileResponse.UserInfo userInfo;
        AvatarMedal avatarMedal;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (avatarMedal = userInfo.avatar_medal) == null || (str = avatarMedal.key) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: U */
    public final boolean mo180015U() {
        if (mo180054s() || !mo180007M() || !mo180013S()) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public final GetUserProfileResponse.MedalList mo180016V() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return userInfo.medal_list;
    }

    /* renamed from: W */
    public final int mo180017W() {
        Integer num;
        GetUserProfileResponse.MedalList V = mo180016V();
        if (V == null || (num = V.total_num) == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: X */
    public final String mo180018X() {
        String a;
        BaseInfoViewDataV3 a2 = m204147a(LocationRequest.PRIORITY_NO_POWER, C52687f.INSTANCE);
        if (!(a2 instanceof DescriptionViewData)) {
            a2 = null;
        }
        DescriptionViewData bVar = (DescriptionViewData) a2;
        if (bVar == null || (a = bVar.mo180265a()) == null) {
            return "";
        }
        return a;
    }

    /* renamed from: Y */
    public final ImageSetPassThrough mo180019Y() {
        BaseInfoViewDataV3 a = m204147a(LocationRequest.PRIORITY_NO_POWER, C52688g.INSTANCE);
        if (!(a instanceof DescriptionViewData)) {
            a = null;
        }
        DescriptionViewData bVar = (DescriptionViewData) a;
        if (bVar != null) {
            return bVar.mo180266b();
        }
        return null;
    }

    /* renamed from: c */
    public final Chatter.Description mo180036c() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return userInfo.description;
    }

    /* renamed from: d */
    public final String mo180037d() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse.I18nVal i18nVal;
        String a;
        GetUserProfileResponse a2 = this.f130399j.mo86206a();
        if (a2 == null || (userInfo = a2.user_info) == null || (i18nVal = userInfo.tenant_name) == null || (a = m204148a(i18nVal)) == null) {
            return "";
        }
        return a;
    }

    /* renamed from: e */
    public final String mo180038e() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (str = userInfo.avatar_key) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public final ImageSetPassThrough mo180040f() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return userInfo.top_image;
    }

    /* renamed from: g */
    public final String mo180041g() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (str = userInfo.tenant_id) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: j */
    public final String mo180045j() {
        GetUserProfileResponse.UserInfo userInfo;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (str = userInfo.user_id) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public final String mo180048m() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return userInfo.str_contact_application_id;
    }

    /* renamed from: n */
    public final boolean mo180049n() {
        GetUserProfileResponse.UserInfo userInfo;
        Boolean bool;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (bool = userInfo.has_tenant_certification) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: o */
    public final boolean mo180050o() {
        GetUserProfileResponse.UserInfo userInfo;
        Boolean bool;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (bool = userInfo.is_tenant_certification) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: s */
    public final boolean mo180054s() {
        GetUserProfileResponse.UserInfo userInfo;
        Boolean bool;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (bool = userInfo.is_resigned) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: t */
    public final NameTagInfo mo180055t() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return m204143a(userInfo);
    }

    /* renamed from: u */
    public final DepartmentTagInfo mo180057u() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return m204149b(userInfo);
    }

    /* renamed from: v */
    public final ShareInfo mo180058v() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse.ShareInfo shareInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (shareInfo = userInfo.share_info) == null) {
            return null;
        }
        return m204144a(shareInfo);
    }

    /* renamed from: w */
    public final boolean mo180059w() {
        GetUserProfileResponse.UserInfo userInfo;
        Boolean bool;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (bool = userInfo.is_special_focus) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: x */
    public final GetUserProfileResponse.UserInfo.FriendStatus mo180060x() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return userInfo.friend_status;
    }

    /* renamed from: z */
    public final String mo180062z() {
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            return null;
        }
        return userInfo.contact_token;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$h */
    public static final class C52689h extends Lambda implements Function0<UserProfileExtraParams.ContactTypeParam> {
        final /* synthetic */ UserProfileState this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52689h(UserProfileState azVar) {
            super(0);
            this.this$0 = azVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final UserProfileExtraParams.ContactTypeParam invoke() {
            if (this.this$0.mo180007M()) {
                if (this.this$0.mo180006L()) {
                    return UserProfileExtraParams.ContactTypeParam.SELF;
                }
                return UserProfileExtraParams.ContactTypeParam.INTERNAL;
            } else if (this.this$0.mo180009O()) {
                return UserProfileExtraParams.ContactTypeParam.EXTERNAL_FRIEND;
            } else {
                return UserProfileExtraParams.ContactTypeParam.EXTERNAL_NOFRIEND;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$i */
    public static final class C52690i extends Lambda implements Function0<String> {
        final /* synthetic */ UserProfileState this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52690i(UserProfileState azVar) {
            super(0);
            this.this$0 = azVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            boolean z;
            if (this.this$0.mo180045j().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C57859q.m224565a(this.this$0.mo180045j());
            }
            return C57859q.m224565a(this.this$0.mo180062z());
        }
    }

    private final boolean am() {
        if (!C52239a.m202617d().mo133578h("secretChat")) {
            return false;
        }
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        if (!d.mo133580j()) {
            return C52239a.m202617d().mo133561a("secretchat.main");
        }
        IProfileModuleDependency d2 = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
        return d2.mo133581k();
    }

    private final PhoneNumberItemViewDataV3 an() {
        for (T t : mo180046k()) {
            if (t.getFieldType() == 101) {
                InfoViewDataParserV3.Companion aVar = InfoViewDataParserV3.f130467a;
                if (t != null) {
                    return aVar.mo180226a((PhoneNumberField) t);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.PhoneNumberField");
            }
        }
        return null;
    }

    private final AliasItemViewDataV3 ao() {
        for (T t : mo180046k()) {
            if (t.getFieldType() == 50) {
                InfoViewDataParserV3.Companion aVar = InfoViewDataParserV3.f130467a;
                if (t != null) {
                    return aVar.mo180230b(t);
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.profile.v2.entity.TextField");
            }
        }
        return null;
    }

    /* renamed from: A */
    public final Chatter.ChatterCustomStatus mo179995A() {
        List<Chatter.ChatterCustomStatus> list;
        GetUserProfileResponse.UserInfo userInfo;
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        IProfileModuleDependency.AbstractC52254h v = d.mo133592v();
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null) {
            list = null;
        } else {
            list = userInfo.chatter_status;
        }
        return v.mo133643a(list);
    }

    /* renamed from: K */
    public final boolean mo180005K() {
        boolean z;
        if (!TextUtils.isEmpty(this.f130403n) || !TextUtils.isEmpty(this.f130404o)) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !TextUtils.isEmpty(mo180045j()) || !TextUtils.isEmpty(mo180062z())) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public final boolean mo180014T() {
        boolean z;
        if (!mo180054s() && mo180007M() && mo180013S()) {
            if (mo180012R().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final String mo180035b() {
        GetUserProfileResponse.UserInfo userInfo;
        Chatter.Description description;
        String str;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (userInfo = a.user_info) == null || (description = userInfo.description) == null || (str = description.text) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: k */
    public final List<BaseField> mo180046k() {
        List<GetUserProfileResponse.Field> list;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        ArrayList arrayList = null;
        if (a != null) {
            list = a.field_orders;
        } else {
            list = null;
        }
        ModelParser.Companion aVar = ModelParser.f130758a;
        if (list instanceof List) {
            arrayList = list;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return aVar.mo180743b(arrayList);
    }

    /* renamed from: y */
    public final boolean mo180061y() {
        GetUserProfileResponse.UserInfo.BlockStatus blockStatus;
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse.UserInfo userInfo2;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        GetUserProfileResponse.UserInfo.BlockStatus blockStatus2 = null;
        if (a == null || (userInfo2 = a.user_info) == null) {
            blockStatus = null;
        } else {
            blockStatus = userInfo2.block_status;
        }
        if (blockStatus != GetUserProfileResponse.UserInfo.BlockStatus.B_FORWARD) {
            GetUserProfileResponse a2 = this.f130399j.mo86206a();
            if (!(a2 == null || (userInfo = a2.user_info) == null)) {
                blockStatus2 = userInfo.block_status;
            }
            if (blockStatus2 == GetUserProfileResponse.UserInfo.BlockStatus.B_DOUBLE) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final List<CtaInfo> mo180042h() {
        List<GetUserProfileResponse.CTA> list;
        boolean z;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (list = a.cta_orders) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.cta_type == GetUserProfileResponse.CTA.CTAType.CRYPTO_CHAT) {
                z = am();
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        ArrayList<GetUserProfileResponse.CTA> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (GetUserProfileResponse.CTA cta : arrayList2) {
            Intrinsics.checkExpressionValueIsNotNull(cta, "it");
            arrayList3.add(m204142a(cta));
        }
        return arrayList3;
    }

    /* renamed from: i */
    public final List<TabInfo> mo180044i() {
        List<GetUserProfileResponse.TabInfo> list;
        GetUserProfileResponse a = this.f130399j.mo86206a();
        if (a == null || (list = a.tab_orders) == null) {
            return CollectionsKt.emptyList();
        }
        List<GetUserProfileResponse.TabInfo> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(m204145a((GetUserProfileResponse.TabInfo) t));
        }
        return arrayList;
    }

    /* renamed from: p */
    public final ActionBtnViewData mo180051p() {
        int i;
        GetUserProfileResponse a;
        GetUserProfileResponse.UserInfo userInfo;
        GetUserProfileResponse.UserInfo.BlockStatus blockStatus;
        GetUserProfileResponse.UserInfo userInfo2;
        GetUserProfileResponse.UserInfo.BlockStatus blockStatus2;
        GetUserProfileResponse.UserInfo userInfo3;
        GetUserProfileResponse.UserInfo.FriendStatus friendStatus;
        boolean z = false;
        ActionBtnViewData actionBtnViewData = new ActionBtnViewData(0, false, false, 7, null);
        GetUserProfileResponse a2 = this.f130399j.mo86206a();
        if (a2 == null || (userInfo3 = a2.user_info) == null || (friendStatus = userInfo3.friend_status) == null) {
            i = 0;
        } else {
            i = friendStatus.getValue();
        }
        actionBtnViewData.mo179600a(i);
        GetUserProfileResponse a3 = this.f130399j.mo86206a();
        if (!((a3 == null || (userInfo2 = a3.user_info) == null || (blockStatus2 = userInfo2.block_status) == null || blockStatus2.getValue() != 2) && ((a = this.f130399j.mo86206a()) == null || (userInfo = a.user_info) == null || (blockStatus = userInfo.block_status) == null || blockStatus.getValue() != 4))) {
            z = true;
        }
        actionBtnViewData.mo179601a(z);
        actionBtnViewData.mo179602b(mo180005K());
        return actionBtnViewData;
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$f */
    public static final class C52687f extends Lambda implements Function1<BaseField, DescriptionViewData> {
        public static final C52687f INSTANCE = new C52687f();

        C52687f() {
            super(1);
        }

        public final DescriptionViewData invoke(BaseField baseField) {
            Intrinsics.checkParameterIsNotNull(baseField, "field");
            return InfoViewDataParserV3.f130467a.mo180224a((AliasDescriptionField) baseField);
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.az$g */
    public static final class C52688g extends Lambda implements Function1<BaseField, DescriptionViewData> {
        public static final C52688g INSTANCE = new C52688g();

        C52688g() {
            super(1);
        }

        public final DescriptionViewData invoke(BaseField baseField) {
            Intrinsics.checkParameterIsNotNull(baseField, "field");
            return InfoViewDataParserV3.f130467a.mo180224a((AliasDescriptionField) baseField);
        }
    }

    /* renamed from: a */
    private final ShareInfo m204144a(GetUserProfileResponse.ShareInfo shareInfo) {
        String str;
        Boolean bool = shareInfo.enable;
        Intrinsics.checkExpressionValueIsNotNull(bool, "enable");
        boolean booleanValue = bool.booleanValue();
        GetUserProfileResponse.I18nVal i18nVal = shareInfo.denied_description;
        if (i18nVal != null) {
            str = m204148a(i18nVal);
        } else {
            str = null;
        }
        return new ShareInfo(booleanValue, str);
    }

    /* renamed from: b */
    private final DepartmentTagInfo m204149b(GetUserProfileResponse.UserInfo userInfo) {
        Boolean bool = userInfo.has_tenant_certification;
        Intrinsics.checkExpressionValueIsNotNull(bool, "has_tenant_certification");
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = userInfo.is_tenant_certification;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "is_tenant_certification");
        return new DepartmentTagInfo(booleanValue, bool2.booleanValue(), userInfo.tenant_certification_url);
    }

    /* renamed from: a */
    private final TabInfo m204145a(GetUserProfileResponse.TabInfo tabInfo) {
        String str;
        String str2 = tabInfo.key;
        Intrinsics.checkExpressionValueIsNotNull(str2, "key");
        GetUserProfileResponse.I18nVal i18nVal = tabInfo.name;
        if (i18nVal == null || (str = m204148a(i18nVal)) == null) {
            str = "";
        }
        GetUserProfileResponse.TabInfo.TabType tabType = tabInfo.tab_type;
        Intrinsics.checkExpressionValueIsNotNull(tabType, "tab_type");
        String str3 = tabInfo.content;
        Intrinsics.checkExpressionValueIsNotNull(str3, "content");
        return new TabInfo(str2, str, tabType, str3);
    }

    /* renamed from: a */
    private final CtaInfo m204142a(GetUserProfileResponse.CTA cta) {
        String str;
        String str2 = cta.key;
        Intrinsics.checkExpressionValueIsNotNull(str2, "key");
        GetUserProfileResponse.I18nVal i18nVal = cta.i18n_names;
        Intrinsics.checkExpressionValueIsNotNull(i18nVal, "i18n_names");
        String a = m204148a(i18nVal);
        Boolean bool = cta.enable;
        Intrinsics.checkExpressionValueIsNotNull(bool, "enable");
        boolean booleanValue = bool.booleanValue();
        GetUserProfileResponse.CTA.CTAType cTAType = cta.cta_type;
        Intrinsics.checkExpressionValueIsNotNull(cTAType, "cta_type");
        String str3 = cta.link;
        Intrinsics.checkExpressionValueIsNotNull(str3, "link");
        String str4 = cta.icon_key;
        Intrinsics.checkExpressionValueIsNotNull(str4, "icon_key");
        GetUserProfileResponse.I18nVal i18nVal2 = cta.denied_description;
        if (i18nVal2 == null || (str = m204148a(i18nVal2)) == null) {
            str = "";
        }
        DeniedReason deniedReason = cta.denied_reason;
        Intrinsics.checkExpressionValueIsNotNull(deniedReason, "denied_reason");
        return new CtaInfo(str2, a, booleanValue, cTAType, str3, str4, str, deniedReason, mo180054s());
    }

    /* renamed from: c */
    private final List<GetUserProfileResponse.CustomImage> m204150c(GetUserProfileResponse.UserInfo userInfo) {
        List<GetUserProfileResponse.Field> list = userInfo.custom_tag_fields;
        Intrinsics.checkExpressionValueIsNotNull(list, "custom_tag_fields");
        List<GetUserProfileResponse.Field> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            JsonElement parse = new JsonParser().parse(it.next().json_field_val);
            Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(it.json_field_val)");
            JsonElement jsonElement = parse.getAsJsonObject().get("resource_key");
            Intrinsics.checkExpressionValueIsNotNull(jsonElement, "jsonObj.get(\"resource_key\")");
            arrayList.add(new GetUserProfileResponse.CustomImage(jsonElement.getAsString()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private final NameTagInfo m204143a(GetUserProfileResponse.UserInfo userInfo) {
        boolean z;
        if (userInfo.do_not_disturb_end_time != null) {
            IProfileModuleDependency d = C52239a.m202617d();
            Long l = userInfo.do_not_disturb_end_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "do_not_disturb_end_time");
            z = d.mo133560a(l.longValue());
        } else {
            z = false;
        }
        GetUserProfileResponse.UserInfo.Gender gender = userInfo.gender;
        Intrinsics.checkExpressionValueIsNotNull(gender, "gender");
        boolean y = mo180061y();
        WorkStatus workStatus = userInfo.work_status;
        Boolean bool = userInfo.is_frozen;
        Intrinsics.checkExpressionValueIsNotNull(bool, "is_frozen");
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = userInfo.is_resigned;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "is_resigned");
        return new NameTagInfo(gender, y, z, workStatus, booleanValue, bool2.booleanValue());
    }

    /* renamed from: a */
    private final String m204148a(GetUserProfileResponse.I18nVal i18nVal) {
        StringBuilder sb = new StringBuilder();
        IProfileModuleDependency d = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ProfileModule.getDependency()");
        Locale h = d.mo133577h();
        Intrinsics.checkExpressionValueIsNotNull(h, "ProfileModule.getDependency().languageSetting");
        sb.append(h.getLanguage());
        sb.append('_');
        IProfileModuleDependency d2 = C52239a.m202617d();
        Intrinsics.checkExpressionValueIsNotNull(d2, "ProfileModule.getDependency()");
        Locale h2 = d2.mo133577h();
        Intrinsics.checkExpressionValueIsNotNull(h2, "ProfileModule.getDependency().languageSetting");
        sb.append(h2.getCountry());
        String sb2 = sb.toString();
        Map<String, String> map = i18nVal.i18n_vals;
        if (sb2 != null) {
            String lowerCase = sb2.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
            String str = map.get(lowerCase);
            if (TextUtils.isEmpty(str)) {
                str = i18nVal.default_val;
            }
            if (str != null) {
                return str;
            }
            return "";
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final BaseInfoViewDataV3 m204147a(int i, Function1<? super BaseField, ? extends BaseInfoViewDataV3> function1) {
        T t;
        boolean z;
        Iterator<T> it = mo180046k().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getFieldType() == i) {
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
        if (t2 instanceof AliasDescriptionField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof DepartmentField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof DescriptionField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof HrefField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof HrefListField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof PhoneNumberField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof TextField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        if (t2 instanceof TextListField) {
            return (BaseInfoViewDataV3) function1.invoke(t2);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UserProfileState(com.larksuite.arch.jack.Async<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse> r2, com.larksuite.arch.jack.Event<java.lang.String> r3, com.larksuite.arch.jack.Event<java.lang.Boolean> r4, com.larksuite.arch.jack.Event<java.lang.String> r5, java.lang.String r6, java.lang.String r7, com.larksuite.arch.jack.Event<kotlin.Unit> r8, boolean r9, boolean r10, boolean r11, com.ss.android.lark.widget.span.RecogniseSpansResult r12, com.larksuite.arch.jack.Event<com.bytedance.lark.pb.basic.v1.Chatter.ChatterCustomStatus> r13, com.larksuite.arch.jack.Event<java.lang.Boolean> r14, com.larksuite.arch.jack.Event<com.ss.android.lark.profile.func.v3.userprofile.IconToast> r15) {
        /*
        // Method dump skipped, instructions count: 355
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.userprofile.UserProfileState.<init>(com.larksuite.arch.jack.a, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, java.lang.String, java.lang.String, com.larksuite.arch.jack.d, boolean, boolean, boolean, com.ss.android.lark.widget.span.RecogniseSpansResult, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserProfileState(com.larksuite.arch.jack.Async r16, com.larksuite.arch.jack.Event r17, com.larksuite.arch.jack.Event r18, com.larksuite.arch.jack.Event r19, java.lang.String r20, java.lang.String r21, com.larksuite.arch.jack.Event r22, boolean r23, boolean r24, boolean r25, com.ss.android.lark.widget.span.RecogniseSpansResult r26, com.larksuite.arch.jack.Event r27, com.larksuite.arch.jack.Event r28, com.larksuite.arch.jack.Event r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.v3.userprofile.UserProfileState.<init>(com.larksuite.arch.jack.a, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, java.lang.String, java.lang.String, com.larksuite.arch.jack.d, boolean, boolean, boolean, com.ss.android.lark.widget.span.RecogniseSpansResult, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, com.larksuite.arch.jack.d, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
