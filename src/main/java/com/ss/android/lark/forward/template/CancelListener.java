package com.ss.android.lark.forward.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.forward.dto.template.IForwardCancelListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/forward/template/CancelListener;", "Lcom/ss/android/lark/forward/dto/template/IForwardCancelListener;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "postId", "", "(Ljava/lang/String;)V", "getPostId", "()Ljava/lang/String;", "describeContents", "", "onCancel", "", "writeToParcel", "flags", "CREATOR", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CancelListener implements IForwardCancelListener {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f98871a;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/forward/template/CancelListener$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/lark/forward/template/CancelListener;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/lark/forward/template/CancelListener;", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.template.CancelListener$a */
    public static final class CREATOR implements Parcelable.Creator<CancelListener> {
        private CREATOR() {
        }

        /* renamed from: a */
        public CancelListener[] newArray(int i) {
            return new CancelListener[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public CancelListener createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new CancelListener(parcel);
        }
    }

    @Override // com.ss.android.lark.forward.dto.template.IForwardCancelListener
    /* renamed from: a */
    public void mo140899a() {
        C38511e.m151893a(false, this.f98871a);
    }

    public CancelListener(String str) {
        this.f98871a = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CancelListener(Parcel parcel) {
        this(parcel.readString());
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeString(this.f98871a);
    }
}
