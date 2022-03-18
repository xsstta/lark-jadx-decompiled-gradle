package com.ss.android.lark.forward.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J9\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001bH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000e¨\u0006&"}, d2 = {"Lcom/ss/android/lark/forward/dto/CardLink;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "href", "", "androidHref", "iosHref", "pcHref", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidHref", "()Ljava/lang/String;", "setAndroidHref", "(Ljava/lang/String;)V", "getHref", "setHref", "getIosHref", "setIosHref", "getPcHref", "setPcHref", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CardLink implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private String f98607a;

    /* renamed from: b */
    private String f98608b;

    /* renamed from: c */
    private String f98609c;

    /* renamed from: d */
    private String f98610d;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardLink)) {
            return false;
        }
        CardLink cardLink = (CardLink) obj;
        return Intrinsics.areEqual(this.f98607a, cardLink.f98607a) && Intrinsics.areEqual(this.f98608b, cardLink.f98608b) && Intrinsics.areEqual(this.f98609c, cardLink.f98609c) && Intrinsics.areEqual(this.f98610d, cardLink.f98610d);
    }

    public int hashCode() {
        String str = this.f98607a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f98608b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f98609c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f98610d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "CardLink(href=" + this.f98607a + ", androidHref=" + this.f98608b + ", iosHref=" + this.f98609c + ", pcHref=" + this.f98610d + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/forward/dto/CardLink$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/forward/dto/CardLink;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/forward/dto/CardLink;", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.forward.dto.CardLink$a */
    public static final class CREATOR implements Parcelable.Creator<CardLink> {
        private CREATOR() {
        }

        /* renamed from: a */
        public CardLink[] newArray(int i) {
            return new CardLink[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public CardLink createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new CardLink(parcel);
        }
    }

    /* renamed from: a */
    public final String mo140551a() {
        return this.f98607a;
    }

    /* renamed from: b */
    public final String mo140552b() {
        return this.f98608b;
    }

    /* renamed from: c */
    public final String mo140553c() {
        return this.f98609c;
    }

    /* renamed from: d */
    public final String mo140554d() {
        return this.f98610d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardLink(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f98607a);
        parcel.writeString(this.f98608b);
        parcel.writeString(this.f98609c);
        parcel.writeString(this.f98610d);
    }

    public CardLink(String str, String str2, String str3, String str4) {
        this.f98607a = str;
        this.f98608b = str2;
        this.f98609c = str3;
        this.f98610d = str4;
    }
}
