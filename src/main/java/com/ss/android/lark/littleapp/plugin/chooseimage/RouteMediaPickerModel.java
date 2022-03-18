package com.ss.android.lark.littleapp.plugin.chooseimage;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.plugin.chooseimage.ChooseMediaPlugin;
import java.util.ArrayList;
import java.util.List;

public class RouteMediaPickerModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteMediaPickerModel> CREATOR = new Parcelable.Creator<RouteMediaPickerModel>() {
        /* class com.ss.android.lark.littleapp.plugin.chooseimage.RouteMediaPickerModel.C414081 */

        /* renamed from: a */
        public RouteMediaPickerModel[] newArray(int i) {
            return new RouteMediaPickerModel[i];
        }

        /* renamed from: a */
        public RouteMediaPickerModel createFromParcel(Parcel parcel) {
            return new RouteMediaPickerModel(parcel);
        }
    };

    /* renamed from: a */
    private int f105280a;

    /* renamed from: b */
    private List<String> f105281b;

    /* renamed from: c */
    private List<String> f105282c;

    /* renamed from: d */
    private int f105283d;

    /* renamed from: e */
    private boolean f105284e;

    /* renamed from: f */
    private boolean f105285f;

    /* renamed from: b */
    public int mo149108b() {
        return this.f105280a;
    }

    /* renamed from: c */
    public List<String> mo149109c() {
        return this.f105281b;
    }

    /* renamed from: d */
    public List<String> mo149110d() {
        return this.f105282c;
    }

    /* renamed from: e */
    public int mo149111e() {
        return this.f105283d;
    }

    /* renamed from: f */
    public boolean mo149112f() {
        return this.f105285f;
    }

    public String toString() {
        return String.format("RouteMediaPickerModel{mCount=%d, mSourceType=%s, mMediaType=%s, maxDuration=%s, mKeepOrigin=%s, mCameraFront=%s}", Integer.valueOf(this.f105280a), this.f105281b, this.f105282c, Integer.valueOf(this.f105283d), Boolean.valueOf(this.f105285f), Boolean.valueOf(this.f105284e));
    }

    public RouteMediaPickerModel(Parcel parcel) {
        super(parcel);
        this.f105280a = 9;
        this.f105281b = new ArrayList();
        this.f105282c = new ArrayList();
        this.f105283d = 15;
        this.f105284e = false;
        this.f105285f = false;
        this.f105280a = parcel.readInt();
        parcel.readStringList(this.f105281b);
        parcel.readStringList(this.f105282c);
        this.f105283d = parcel.readInt();
        this.f105284e = parcel.readBoolean();
        this.f105285f = parcel.readBoolean();
    }

    public RouteMediaPickerModel(ChooseMediaPlugin.MediaRequest mediaRequest) {
        this.f105280a = 9;
        this.f105281b = new ArrayList();
        this.f105282c = new ArrayList();
        this.f105283d = 15;
        boolean z = false;
        this.f105284e = false;
        this.f105285f = false;
        this.f105280a = mediaRequest.mSelectMaxCount;
        this.f105281b = mediaRequest.mSourceTypeArray;
        this.f105282c = mediaRequest.mediaType;
        this.f105283d = mediaRequest.getMaxDuration();
        this.f105284e = EnumC41409a.FRONT.mValue.equals(mediaRequest.mCameraDevice);
        if (mediaRequest.mSizeTypeArray.contains(EnumC41411c.ORIGINAL.mValue) && !mediaRequest.mSizeTypeArray.contains(EnumC41411c.COMPRESSED.mValue)) {
            z = true;
        }
        this.f105285f = z;
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f105280a);
        List<String> list = this.f105281b;
        if (list == null) {
            list = new ArrayList<>();
        }
        parcel.writeStringList(list);
        List<String> list2 = this.f105282c;
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        parcel.writeStringList(list2);
        parcel.writeInt(this.f105283d);
        parcel.writeBoolean(this.f105284e);
        parcel.writeBoolean(this.f105285f);
    }
}
