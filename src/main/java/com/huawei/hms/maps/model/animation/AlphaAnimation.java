package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class AlphaAnimation extends Animation {
    public static final Parcelable.Creator<AlphaAnimation> CREATOR = new Parcelable.Creator<AlphaAnimation>() {
        /* class com.huawei.hms.maps.model.animation.AlphaAnimation.C237321 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AlphaAnimation createFromParcel(Parcel parcel) {
            return new AlphaAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AlphaAnimation[] newArray(int i) {
            return new AlphaAnimation[0];
        }
    };

    /* renamed from: h */
    private float f58810h;

    /* renamed from: i */
    private float f58811i;

    public AlphaAnimation(float f, float f2) {
        this.f58812a = 1;
        this.f58810h = Math.min(Math.max(f, (float) BitmapDescriptorFactory.HUE_RED), 1.0f);
        this.f58811i = Math.min(Math.max(f2, (float) BitmapDescriptorFactory.HUE_RED), 1.0f);
    }

    protected AlphaAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.f58810h = parcelReader.readFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.f58811i = parcelReader.readFloat(9, BitmapDescriptorFactory.HUE_RED);
    }

    /* access modifiers changed from: protected */
    @Override // com.huawei.hms.maps.model.animation.Animation
    /* renamed from: a */
    public final void mo84782a(ParcelWrite parcelWrite, int i) {
        parcelWrite.writeFloat(8, this.f58810h);
        parcelWrite.writeFloat(9, this.f58811i);
    }

    public float getFromAlpha() {
        return this.f58810h;
    }

    public float getToAlpha() {
        return this.f58811i;
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
