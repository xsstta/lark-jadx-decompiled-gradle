package com.bytedance.ee.bear.quoto;

import android.os.Parcel;
import android.os.Parcelable;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0013B\u0019\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SingleFileQuotaConfig;", "", "Landroid/os/Parcelable;", "placeHolderId", "", "quotaType", "(Ljava/lang/String;III)V", "getPlaceHolderId", "()I", "getQuotaType", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "UPLOAD", "DUPLICATE", "SAVE", "CREATOR", "quoto-api_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum SingleFileQuotaConfig implements Parcelable {
    UPLOAD(R.drawable.illustration_ccm_empty_positive_storage_limit, 1),
    DUPLICATE(R.drawable.illustration_ccm_empty_positive_storage_limit, 2),
    SAVE(R.drawable.illustration_ccm_empty_positive_storage_limit, 3);
    
    public static final CREATOR CREATOR = new CREATOR(null);
    private final int placeHolderId;
    private final int quotaType;

    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/quoto/SingleFileQuotaConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/bytedance/ee/bear/quoto/SingleFileQuotaConfig;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/bytedance/ee/bear/quoto/SingleFileQuotaConfig;", "quoto-api_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.quoto.SingleFileQuotaConfig$a */
    public static final class CREATOR implements Parcelable.Creator<SingleFileQuotaConfig> {
        private CREATOR() {
        }

        /* renamed from: a */
        public SingleFileQuotaConfig[] newArray(int i) {
            return new SingleFileQuotaConfig[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public SingleFileQuotaConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return SingleFileQuotaConfig.values()[parcel.readInt()];
        }
    }

    public final int getPlaceHolderId() {
        return this.placeHolderId;
    }

    public final int getQuotaType() {
        return this.quotaType;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        parcel.writeInt(ordinal());
    }

    private SingleFileQuotaConfig(int i, int i2) {
        this.placeHolderId = i;
        this.quotaType = i2;
    }
}
