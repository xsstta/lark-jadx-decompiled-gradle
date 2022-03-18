package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.List;

public class AnimationSet extends Animation {
    public static final Parcelable.Creator<AnimationSet> CREATOR = new Parcelable.Creator<AnimationSet>() {
        /* class com.huawei.hms.maps.model.animation.AnimationSet.C237341 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AnimationSet createFromParcel(Parcel parcel) {
            return new AnimationSet(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AnimationSet[] newArray(int i) {
            return new AnimationSet[0];
        }
    };

    /* renamed from: h */
    private boolean f58819h;

    /* renamed from: i */
    private List<Animation> f58820i = new ArrayList();

    protected AnimationSet(ParcelReader parcelReader) {
        super(parcelReader);
        this.f58819h = parcelReader.readBoolean(8, false);
        this.f58820i = parcelReader.createTypedList(9, Animation.CREATOR, new ArrayList());
    }

    public AnimationSet(boolean z) {
        this.f58812a = 5;
        this.f58819h = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.huawei.hms.maps.model.animation.Animation
    /* renamed from: a */
    public final void mo84782a(ParcelWrite parcelWrite, int i) {
        parcelWrite.writeBoolean(8, this.f58819h);
        parcelWrite.writeTypedList(9, this.f58820i, false);
    }

    public void addAnimation(Animation animation) {
        this.f58820i.add(animation);
    }

    public void cleanAnimation() {
        this.f58820i.clear();
    }

    public List<Animation> getAnimations() {
        return this.f58820i;
    }

    public boolean isShareInterpolator() {
        return this.f58819h;
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
