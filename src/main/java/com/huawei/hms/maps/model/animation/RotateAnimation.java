package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class RotateAnimation extends Animation {
    public static final Parcelable.Creator<RotateAnimation> CREATOR = new Parcelable.Creator<RotateAnimation>() {
        /* class com.huawei.hms.maps.model.animation.RotateAnimation.C237351 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RotateAnimation createFromParcel(Parcel parcel) {
            return new RotateAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RotateAnimation[] newArray(int i) {
            return new RotateAnimation[0];
        }
    };

    /* renamed from: h */
    private float f58821h;

    /* renamed from: i */
    private float f58822i;

    public RotateAnimation(float f, float f2) {
        this.f58812a = 2;
        this.f58821h = f;
        this.f58822i = f2;
    }

    protected RotateAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.f58821h = parcelReader.readFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.f58822i = parcelReader.readFloat(9, BitmapDescriptorFactory.HUE_RED);
    }

    /* access modifiers changed from: protected */
    @Override // com.huawei.hms.maps.model.animation.Animation
    /* renamed from: a */
    public final void mo84782a(ParcelWrite parcelWrite, int i) {
        parcelWrite.writeFloat(8, this.f58821h);
        parcelWrite.writeFloat(9, this.f58822i);
    }

    public float getFromDegree() {
        return this.f58821h;
    }

    public float getToDegree() {
        return this.f58822i;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setDuration(long j) {
        this.f58816e = j;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
        this.f58817f = interpolator;
    }
}
