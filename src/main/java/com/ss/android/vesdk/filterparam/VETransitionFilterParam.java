package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;

public class VETransitionFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VETransitionFilterParam> CREATOR = new Parcelable.Creator<VETransitionFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VETransitionFilterParam.C640141 */

        /* renamed from: a */
        public VETransitionFilterParam[] newArray(int i) {
            return new VETransitionFilterParam[i];
        }

        /* renamed from: a */
        public VETransitionFilterParam createFromParcel(Parcel parcel) {
            return new VETransitionFilterParam(parcel);
        }
    };
    public int tranDuration;
    public int tranType;
    public String transName;

    public enum TransitionType {
        TransitionType_DEFAULT,
        TransitionType_VARIABLE_TIME,
        TransitionType_SINGLE
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VETransitionFilterParam() {
        this.filterName = "tran filter";
        this.filterType = 14;
        this.transName = "";
        this.tranType = TransitionType.TransitionType_DEFAULT.ordinal();
        this.tranDuration = ParticipantRepo.f117150c;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VETransitionFilterParam{transName='" + this.transName + '\'' + ", tranType=" + this.tranType + ", tranDuration=" + this.tranDuration + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VETransitionFilterParam(Parcel parcel) {
        super(parcel);
        this.transName = parcel.readString();
        this.tranType = parcel.readInt();
        this.tranDuration = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.transName);
        parcel.writeInt(this.tranType);
        parcel.writeInt(this.tranDuration);
    }
}
