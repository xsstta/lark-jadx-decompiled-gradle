package com.bytedance.ee.bear.templates.preview.announce;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\bHÖ\u0001R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "id", "", "name", "objToken", "objType", "", "thumbnailExtra", "Lcom/bytedance/ee/bear/templates/preview/announce/ThumbnailExtra;", "enable", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/bytedance/ee/bear/templates/preview/announce/ThumbnailExtra;Z)V", "getEnable", "()Z", "setEnable", "(Z)V", "getId", "()Ljava/lang/String;", "getName", "getObjToken", "getObjType", "()I", "getThumbnailExtra", "()Lcom/bytedance/ee/bear/templates/preview/announce/ThumbnailExtra;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class AnnounceTemplate implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11542a();
    private boolean enable;
    private final String id;
    private final String name;
    private final String objToken;
    private final int objType;
    private final ThumbnailExtra thumbnailExtra;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplate$a */
    public static class C11542a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new AnnounceTemplate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (ThumbnailExtra) ThumbnailExtra.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnnounceTemplate[i];
        }
    }

    public static /* synthetic */ AnnounceTemplate copy$default(AnnounceTemplate announceTemplate, String str, String str2, String str3, int i, ThumbnailExtra thumbnailExtra2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = announceTemplate.id;
        }
        if ((i2 & 2) != 0) {
            str2 = announceTemplate.name;
        }
        if ((i2 & 4) != 0) {
            str3 = announceTemplate.objToken;
        }
        if ((i2 & 8) != 0) {
            i = announceTemplate.objType;
        }
        if ((i2 & 16) != 0) {
            thumbnailExtra2 = announceTemplate.thumbnailExtra;
        }
        if ((i2 & 32) != 0) {
            z = announceTemplate.enable;
        }
        return announceTemplate.copy(str, str2, str3, i, thumbnailExtra2, z);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.objToken;
    }

    public final int component4() {
        return this.objType;
    }

    public final ThumbnailExtra component5() {
        return this.thumbnailExtra;
    }

    public final boolean component6() {
        return this.enable;
    }

    public final AnnounceTemplate copy(String str, String str2, String str3, int i, ThumbnailExtra thumbnailExtra2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "objToken");
        Intrinsics.checkParameterIsNotNull(thumbnailExtra2, "thumbnailExtra");
        return new AnnounceTemplate(str, str2, str3, i, thumbnailExtra2, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnnounceTemplate) {
                AnnounceTemplate announceTemplate = (AnnounceTemplate) obj;
                if (Intrinsics.areEqual(this.id, announceTemplate.id) && Intrinsics.areEqual(this.name, announceTemplate.name) && Intrinsics.areEqual(this.objToken, announceTemplate.objToken)) {
                    if ((this.objType == announceTemplate.objType) && Intrinsics.areEqual(this.thumbnailExtra, announceTemplate.thumbnailExtra)) {
                        if (this.enable == announceTemplate.enable) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.objToken;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.objType) * 31;
        ThumbnailExtra thumbnailExtra2 = this.thumbnailExtra;
        if (thumbnailExtra2 != null) {
            i = thumbnailExtra2.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "AnnounceTemplate(id=" + this.id + ", name=" + this.name + ", objToken=" + this.objToken + ", objType=" + this.objType + ", thumbnailExtra=" + this.thumbnailExtra + ", enable=" + this.enable + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.objToken);
        parcel.writeInt(this.objType);
        this.thumbnailExtra.writeToParcel(parcel, 0);
        parcel.writeInt(this.enable ? 1 : 0);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjToken() {
        return this.objToken;
    }

    public final int getObjType() {
        return this.objType;
    }

    public final ThumbnailExtra getThumbnailExtra() {
        return this.thumbnailExtra;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public AnnounceTemplate(String str, String str2, String str3, int i, ThumbnailExtra thumbnailExtra2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        Intrinsics.checkParameterIsNotNull(str3, "objToken");
        Intrinsics.checkParameterIsNotNull(thumbnailExtra2, "thumbnailExtra");
        this.id = str;
        this.name = str2;
        this.objToken = str3;
        this.objType = i;
        this.thumbnailExtra = thumbnailExtra2;
        this.enable = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnnounceTemplate(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, com.bytedance.ee.bear.templates.preview.announce.ThumbnailExtra r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r14 = r14 & 32
            if (r14 == 0) goto L_0x0007
            r13 = 1
            r6 = 1
            goto L_0x0008
        L_0x0007:
            r6 = r13
        L_0x0008:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplate.<init>(java.lang.String, java.lang.String, java.lang.String, int, com.bytedance.ee.bear.templates.preview.announce.ThumbnailExtra, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
