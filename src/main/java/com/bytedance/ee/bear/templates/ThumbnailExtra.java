package com.bytedance.ee.bear.templates;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/templates/ThumbnailExtra;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", ShareHitPoint.f121869d, "", "thumbnail", "", "decryptKey", "(ILjava/lang/String;Ljava/lang/String;)V", "getDecryptKey", "()Ljava/lang/String;", "getThumbnail", "getType", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ThumbnailExtra implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11436a();
    private final String decryptKey;
    private final String thumbnail;
    private final int type;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.ThumbnailExtra$a */
    public static class C11436a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ThumbnailExtra(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThumbnailExtra[i];
        }
    }

    public ThumbnailExtra() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ ThumbnailExtra copy$default(ThumbnailExtra thumbnailExtra, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = thumbnailExtra.type;
        }
        if ((i2 & 2) != 0) {
            str = thumbnailExtra.thumbnail;
        }
        if ((i2 & 4) != 0) {
            str2 = thumbnailExtra.decryptKey;
        }
        return thumbnailExtra.copy(i, str, str2);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.thumbnail;
    }

    public final String component3() {
        return this.decryptKey;
    }

    public final ThumbnailExtra copy(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "thumbnail");
        Intrinsics.checkParameterIsNotNull(str2, "decryptKey");
        return new ThumbnailExtra(i, str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThumbnailExtra) {
                ThumbnailExtra thumbnailExtra = (ThumbnailExtra) obj;
                if (!(this.type == thumbnailExtra.type) || !Intrinsics.areEqual(this.thumbnail, thumbnailExtra.thumbnail) || !Intrinsics.areEqual(this.decryptKey, thumbnailExtra.decryptKey)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.thumbnail;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.decryptKey;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ThumbnailExtra(type=" + this.type + ", thumbnail=" + this.thumbnail + ", decryptKey=" + this.decryptKey + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.decryptKey);
    }

    public final String getDecryptKey() {
        return this.decryptKey;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public ThumbnailExtra(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "thumbnail");
        Intrinsics.checkParameterIsNotNull(str2, "decryptKey");
        this.type = i;
        this.thumbnail = str;
        this.decryptKey = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailExtra(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
