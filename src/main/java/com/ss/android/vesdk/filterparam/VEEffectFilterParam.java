package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class VEEffectFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEEffectFilterParam> CREATOR = new Parcelable.Creator<VEEffectFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEEffectFilterParam.C640041 */

        /* renamed from: a */
        public VEEffectFilterParam[] newArray(int i) {
            return new VEEffectFilterParam[i];
        }

        /* renamed from: a */
        public VEEffectFilterParam createFromParcel(Parcel parcel) {
            return new VEEffectFilterParam(parcel);
        }
    };
    public String[] composerTags;
    public float[] composerValues;
    public EffectFilterType effectFilterType = EffectFilterType.DEFAULT;
    public String effectPath;
    public boolean isSyncLoadResource;
    public boolean needReload;
    public int reqId;
    public int stickerId;
    public String stickerTag;
    public int timeout;

    public enum EffectFilterType {
        DEFAULT,
        MUSIC,
        AUDIO_SPEED,
        MIMO
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEEffectFilterParam() {
        this.filterName = "filter effect";
        this.filterType = 8;
        this.effectPath = "";
        this.stickerTag = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEEffectFilterParam{effectPath='" + this.effectPath + '\'' + ", stickerId=" + this.stickerId + ", reqId=" + this.reqId + ", timeout=" + this.timeout + ", needReload=" + this.needReload + ", stickerTag='" + this.stickerTag + '\'' + ", isSyncLoadResource=" + this.isSyncLoadResource + ", composerTags=" + Arrays.toString(this.composerTags) + ", composerValues=" + Arrays.toString(this.composerValues) + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '\'' + ", effectFilterType=" + this.effectFilterType.ordinal() + '}';
    }

    protected VEEffectFilterParam(Parcel parcel) {
        super(parcel);
        boolean z;
        this.effectPath = parcel.readString();
        this.stickerId = parcel.readInt();
        this.reqId = parcel.readInt();
        this.timeout = parcel.readInt();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.needReload = z;
        this.stickerTag = parcel.readString();
        this.isSyncLoadResource = parcel.readByte() == 0 ? false : z2;
        this.composerTags = parcel.createStringArray();
        this.composerValues = parcel.createFloatArray();
        this.effectFilterType = EffectFilterType.values()[parcel.readInt()];
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.effectPath);
        parcel.writeInt(this.stickerId);
        parcel.writeInt(this.reqId);
        parcel.writeInt(this.timeout);
        parcel.writeByte(this.needReload ? (byte) 1 : 0);
        parcel.writeString(this.stickerTag);
        parcel.writeByte(this.isSyncLoadResource ? (byte) 1 : 0);
        parcel.writeStringArray(this.composerTags);
        parcel.writeFloatArray(this.composerValues);
        parcel.writeInt(this.effectFilterType.ordinal());
    }
}
