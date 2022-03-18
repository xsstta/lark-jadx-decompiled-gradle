package com.bytedance.ee.bear.templates.preview.announce;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/ThumbnailExtra;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "decrypt_key", "", "thumbnail", ShareHitPoint.f121869d, "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDecrypt_key", "()Ljava/lang/String;", "getThumbnail", "getType", "()I", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ThumbnailExtra implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11546a();
    private final String decrypt_key;
    private final String thumbnail;
    private final int type;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.ThumbnailExtra$a */
    public static class C11546a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new ThumbnailExtra(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThumbnailExtra[i];
        }
    }

    public ThumbnailExtra() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ThumbnailExtra copy$default(ThumbnailExtra thumbnailExtra, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = thumbnailExtra.decrypt_key;
        }
        if ((i2 & 2) != 0) {
            str2 = thumbnailExtra.thumbnail;
        }
        if ((i2 & 4) != 0) {
            i = thumbnailExtra.type;
        }
        return thumbnailExtra.copy(str, str2, i);
    }

    public final String component1() {
        return this.decrypt_key;
    }

    public final String component2() {
        return this.thumbnail;
    }

    public final int component3() {
        return this.type;
    }

    public final ThumbnailExtra copy(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "decrypt_key");
        Intrinsics.checkParameterIsNotNull(str2, "thumbnail");
        return new ThumbnailExtra(str, str2, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ThumbnailExtra) {
                ThumbnailExtra thumbnailExtra = (ThumbnailExtra) obj;
                if (Intrinsics.areEqual(this.decrypt_key, thumbnailExtra.decrypt_key) && Intrinsics.areEqual(this.thumbnail, thumbnailExtra.thumbnail)) {
                    if (this.type == thumbnailExtra.type) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.decrypt_key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.thumbnail;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.type;
    }

    public String toString() {
        return "ThumbnailExtra(decrypt_key=" + this.decrypt_key + ", thumbnail=" + this.thumbnail + ", type=" + this.type + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.decrypt_key);
        parcel.writeString(this.thumbnail);
        parcel.writeInt(this.type);
    }

    public final String getDecrypt_key() {
        return this.decrypt_key;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public ThumbnailExtra(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "decrypt_key");
        Intrinsics.checkParameterIsNotNull(str2, "thumbnail");
        this.decrypt_key = str;
        this.thumbnail = str2;
        this.type = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailExtra(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 1 : i);
    }
}
