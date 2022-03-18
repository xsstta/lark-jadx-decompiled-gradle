package com.bytedance.ee.bear.templates.preview.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.util.io.NonProguard;
import com.bytedance.ee.util.p700c.C13598b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/data/Item;", "Landroid/os/Parcelable;", "Lcom/bytedance/ee/util/io/NonProguard;", "objToken", "", "name", "objType", "", ShareHitPoint.f121868c, "index", "(Ljava/lang/String;Ljava/lang/String;III)V", "getIndex", "()I", "getName", "()Ljava/lang/String;", "getObjToken", "getObjType", "getSource", "canReportNotEncryption", "", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "other", "", "getReportName", "getReportToken", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class Item implements Parcelable, NonProguard {
    public static final Parcelable.Creator CREATOR = new C11570a();
    private final int index;
    private final String name;
    private final String objToken;
    private final int objType;
    private final int source;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.data.Item$a */
    public static class C11570a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "in");
            return new Item(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Item[i];
        }
    }

    public static /* synthetic */ Item copy$default(Item item, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = item.objToken;
        }
        if ((i4 & 2) != 0) {
            str2 = item.name;
        }
        if ((i4 & 4) != 0) {
            i = item.objType;
        }
        if ((i4 & 8) != 0) {
            i2 = item.source;
        }
        if ((i4 & 16) != 0) {
            i3 = item.index;
        }
        return item.copy(str, str2, i, i2, i3);
    }

    public final String component1() {
        return this.objToken;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.objType;
    }

    public final int component4() {
        return this.source;
    }

    public final int component5() {
        return this.index;
    }

    public final Item copy(String str, String str2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        return new Item(str, str2, i, i2, i3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Item) {
                Item item = (Item) obj;
                if (Intrinsics.areEqual(this.objToken, item.objToken) && Intrinsics.areEqual(this.name, item.name)) {
                    if (this.objType == item.objType) {
                        if (this.source == item.source) {
                            if (this.index == item.index) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.objToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.objType) * 31) + this.source) * 31) + this.index;
    }

    public String toString() {
        return "Item(objToken=" + this.objToken + ", name=" + this.name + ", objType=" + this.objType + ", source=" + this.source + ", index=" + this.index + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.objToken);
        parcel.writeString(this.name);
        parcel.writeInt(this.objType);
        parcel.writeInt(this.source);
        parcel.writeInt(this.index);
    }

    public final int getIndex() {
        return this.index;
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

    public final int getSource() {
        return this.source;
    }

    private final boolean canReportNotEncryption() {
        if (this.source == 1) {
            return true;
        }
        return false;
    }

    public final String getReportName() {
        if (canReportNotEncryption()) {
            return this.name;
        }
        String d = C13598b.m55197d(this.name);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(name)");
        return d;
    }

    public final String getReportToken() {
        if (canReportNotEncryption()) {
            return this.objToken;
        }
        String d = C13598b.m55197d(this.objToken);
        Intrinsics.checkExpressionValueIsNotNull(d, "EncriptUtils.handleEncription(objToken)");
        return d;
    }

    public Item(String str, String str2, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(str2, "name");
        this.objToken = str;
        this.name = str2;
        this.objType = i;
        this.source = i2;
        this.index = i3;
    }
}
