package com.ss.android.lark.forward.dto;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/forward/dto/ShareLittleApp;", "Lcom/ss/android/lark/forward/dto/BaseShareData;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "appId", "", "cardLink", "Lcom/ss/android/lark/forward/dto/CardLink;", "(Ljava/lang/String;Lcom/ss/android/lark/forward/dto/CardLink;)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "describeContents", "", "writeToParcel", "", "flags", "CREATOR", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareLittleApp extends BaseShareData implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private String f98641a;

    @Override // com.ss.android.lark.forward.dto.BaseShareData
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/forward/dto/ShareLittleApp$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/forward/dto/ShareLittleApp;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/forward/dto/ShareLittleApp;", "core_forward_forward-export_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.forward.dto.ShareLittleApp$a */
    public static final class CREATOR implements Parcelable.Creator<ShareLittleApp> {
        private CREATOR() {
        }

        /* renamed from: a */
        public ShareLittleApp[] newArray(int i) {
            return new ShareLittleApp[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public ShareLittleApp createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new ShareLittleApp(parcel);
        }
    }

    /* renamed from: b */
    public final String mo140632b() {
        return this.f98641a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ShareLittleApp(Parcel parcel) {
        this(parcel.readString(), (CardLink) parcel.readParcelable(CardLink.class.getClassLoader()));
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public ShareLittleApp(String str, CardLink cardLink) {
        super(cardLink);
        this.f98641a = str;
    }

    @Override // com.ss.android.lark.forward.dto.BaseShareData
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f98641a);
        parcel.writeParcelable(mo140523a(), i);
    }
}
