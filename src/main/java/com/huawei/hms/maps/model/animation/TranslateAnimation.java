package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.LatLng;

public class TranslateAnimation extends Animation {
    public static final Parcelable.Creator<TranslateAnimation> CREATOR = new Parcelable.Creator<TranslateAnimation>() {
        /* class com.huawei.hms.maps.model.animation.TranslateAnimation.C237371 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TranslateAnimation createFromParcel(Parcel parcel) {
            return new TranslateAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TranslateAnimation[] newArray(int i) {
            return new TranslateAnimation[0];
        }
    };

    /* renamed from: h */
    private LatLng f58827h;

    protected TranslateAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.f58827h = (LatLng) parcelReader.readParcelable(8, LatLng.CREATOR, null);
    }

    public TranslateAnimation(LatLng latLng) {
        this.f58812a = 4;
        this.f58827h = latLng;
    }

    /* access modifiers changed from: protected */
    @Override // com.huawei.hms.maps.model.animation.Animation
    /* renamed from: a */
    public final void mo84782a(ParcelWrite parcelWrite, int i) {
        parcelWrite.writeParcelable(8, this.f58827h, i, false);
    }

    public LatLng getTarget() {
        return this.f58827h;
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
