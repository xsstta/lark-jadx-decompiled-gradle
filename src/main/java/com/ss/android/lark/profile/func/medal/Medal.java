package com.ss.android.lark.profile.func.medal;

import com.ss.android.lark.pb.entities.ImageSetPassThrough;
import com.ss.android.lark.profile.func.medal.wall.MedalWallAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/Medal;", "", "medalId", "", "medalDecoration", "Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;", "medalDetail", "medalName", "medalStatus", "Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalStatus;", "grantId", "(Ljava/lang/String;Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;Ljava/lang/String;Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalStatus;Ljava/lang/String;)V", "getGrantId", "()Ljava/lang/String;", "getMedalDecoration", "()Lcom/ss/android/lark/pb/entities/ImageSetPassThrough;", "getMedalDetail", "getMedalId", "getMedalName", "getMedalStatus", "()Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalStatus;", "setMedalStatus", "(Lcom/ss/android/lark/profile/func/medal/wall/MedalWallAdapter$MedalStatus;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.a */
public final class Medal {

    /* renamed from: a */
    private final String f129779a;

    /* renamed from: b */
    private final ImageSetPassThrough f129780b;

    /* renamed from: c */
    private final ImageSetPassThrough f129781c;

    /* renamed from: d */
    private final String f129782d;

    /* renamed from: e */
    private MedalWallAdapter.MedalStatus f129783e;

    /* renamed from: f */
    private final String f129784f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Medal)) {
            return false;
        }
        Medal aVar = (Medal) obj;
        return Intrinsics.areEqual(this.f129779a, aVar.f129779a) && Intrinsics.areEqual(this.f129780b, aVar.f129780b) && Intrinsics.areEqual(this.f129781c, aVar.f129781c) && Intrinsics.areEqual(this.f129782d, aVar.f129782d) && Intrinsics.areEqual(this.f129783e, aVar.f129783e) && Intrinsics.areEqual(this.f129784f, aVar.f129784f);
    }

    public int hashCode() {
        String str = this.f129779a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ImageSetPassThrough imageSetPassThrough = this.f129780b;
        int hashCode2 = (hashCode + (imageSetPassThrough != null ? imageSetPassThrough.hashCode() : 0)) * 31;
        ImageSetPassThrough imageSetPassThrough2 = this.f129781c;
        int hashCode3 = (hashCode2 + (imageSetPassThrough2 != null ? imageSetPassThrough2.hashCode() : 0)) * 31;
        String str2 = this.f129782d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        MedalWallAdapter.MedalStatus medalStatus = this.f129783e;
        int hashCode5 = (hashCode4 + (medalStatus != null ? medalStatus.hashCode() : 0)) * 31;
        String str3 = this.f129784f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "Medal(medalId=" + this.f129779a + ", medalDecoration=" + this.f129780b + ", medalDetail=" + this.f129781c + ", medalName=" + this.f129782d + ", medalStatus=" + this.f129783e + ", grantId=" + this.f129784f + ")";
    }

    /* renamed from: a */
    public final String mo179230a() {
        return this.f129779a;
    }

    /* renamed from: b */
    public final ImageSetPassThrough mo179231b() {
        return this.f129780b;
    }

    /* renamed from: c */
    public final ImageSetPassThrough mo179232c() {
        return this.f129781c;
    }

    /* renamed from: d */
    public final String mo179233d() {
        return this.f129782d;
    }

    /* renamed from: e */
    public final MedalWallAdapter.MedalStatus mo179234e() {
        return this.f129783e;
    }

    /* renamed from: f */
    public final String mo179236f() {
        return this.f129784f;
    }

    public Medal(String str, ImageSetPassThrough imageSetPassThrough, ImageSetPassThrough imageSetPassThrough2, String str2, MedalWallAdapter.MedalStatus medalStatus, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "medalId");
        Intrinsics.checkParameterIsNotNull(str2, "medalName");
        Intrinsics.checkParameterIsNotNull(medalStatus, "medalStatus");
        Intrinsics.checkParameterIsNotNull(str3, "grantId");
        this.f129779a = str;
        this.f129780b = imageSetPassThrough;
        this.f129781c = imageSetPassThrough2;
        this.f129782d = str2;
        this.f129783e = medalStatus;
        this.f129784f = str3;
    }
}
