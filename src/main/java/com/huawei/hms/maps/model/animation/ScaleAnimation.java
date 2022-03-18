package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class ScaleAnimation extends Animation {
    public static final Parcelable.Creator<ScaleAnimation> CREATOR = new Parcelable.Creator<ScaleAnimation>() {
        /* class com.huawei.hms.maps.model.animation.ScaleAnimation.C237361 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScaleAnimation createFromParcel(Parcel parcel) {
            return new ScaleAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScaleAnimation[] newArray(int i) {
            return new ScaleAnimation[0];
        }
    };

    /* renamed from: h */
    private float f58823h;

    /* renamed from: i */
    private float f58824i;

    /* renamed from: j */
    private float f58825j;

    /* renamed from: k */
    private float f58826k;

    public ScaleAnimation(float f, float f2, float f3, float f4) {
        this.f58812a = 3;
        this.f58813b = 1;
        this.f58823h = Math.max(f, (float) BitmapDescriptorFactory.HUE_RED);
        this.f58824i = Math.max(f2, (float) BitmapDescriptorFactory.HUE_RED);
        this.f58825j = Math.max(f3, (float) BitmapDescriptorFactory.HUE_RED);
        this.f58826k = Math.max(f4, (float) BitmapDescriptorFactory.HUE_RED);
    }

    protected ScaleAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.f58823h = parcelReader.readFloat(8, BitmapDescriptorFactory.HUE_RED);
        this.f58824i = parcelReader.readFloat(9, BitmapDescriptorFactory.HUE_RED);
        this.f58825j = parcelReader.readFloat(10, BitmapDescriptorFactory.HUE_RED);
        this.f58826k = parcelReader.readFloat(11, BitmapDescriptorFactory.HUE_RED);
    }

    /* access modifiers changed from: protected */
    @Override // com.huawei.hms.maps.model.animation.Animation
    /* renamed from: a */
    public final void mo84782a(ParcelWrite parcelWrite, int i) {
        parcelWrite.writeFloat(8, this.f58823h);
        parcelWrite.writeFloat(9, this.f58824i);
        parcelWrite.writeFloat(10, this.f58825j);
        parcelWrite.writeFloat(11, this.f58826k);
    }

    public float getFromX() {
        return this.f58823h;
    }

    public float getFromY() {
        return this.f58825j;
    }

    public float getToX() {
        return this.f58824i;
    }

    public float getToY() {
        return this.f58826k;
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
