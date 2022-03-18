package com.bytedance.ee.bear.templates.preview.announce;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.util.io.NonProguard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/UsedTemplateResult;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "ObjToken", "", "NewRev", "", "(Ljava/lang/String;I)V", "getNewRev", "()I", "getObjToken", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class UsedTemplateResult extends NetService.Result<UsedTemplateResult> implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11547a();
    private final int NewRev;
    private final String ObjToken;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.UsedTemplateResult$a */
    public static class C11547a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new UsedTemplateResult(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UsedTemplateResult[i];
        }
    }

    public static /* synthetic */ UsedTemplateResult copy$default(UsedTemplateResult usedTemplateResult, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = usedTemplateResult.ObjToken;
        }
        if ((i2 & 2) != 0) {
            i = usedTemplateResult.NewRev;
        }
        return usedTemplateResult.copy(str, i);
    }

    public final String component1() {
        return this.ObjToken;
    }

    public final int component2() {
        return this.NewRev;
    }

    public final UsedTemplateResult copy(String str, int i) {
        return new UsedTemplateResult(str, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UsedTemplateResult) {
                UsedTemplateResult usedTemplateResult = (UsedTemplateResult) obj;
                if (Intrinsics.areEqual(this.ObjToken, usedTemplateResult.ObjToken)) {
                    if (this.NewRev == usedTemplateResult.NewRev) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.ObjToken;
        return ((str != null ? str.hashCode() : 0) * 31) + this.NewRev;
    }

    public String toString() {
        return "UsedTemplateResult(ObjToken=" + this.ObjToken + ", NewRev=" + this.NewRev + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.ObjToken);
        parcel.writeInt(this.NewRev);
    }

    public final int getNewRev() {
        return this.NewRev;
    }

    public final String getObjToken() {
        return this.ObjToken;
    }

    public UsedTemplateResult(String str, int i) {
        this.ObjToken = str;
        this.NewRev = i;
    }
}
