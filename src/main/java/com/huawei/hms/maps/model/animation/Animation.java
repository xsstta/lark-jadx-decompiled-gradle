package com.huawei.hms.maps.model.animation;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;

public abstract class Animation implements Parcelable {
    public static final Parcelable.Creator<Animation> CREATOR = new Parcelable.Creator<Animation>() {
        /* class com.huawei.hms.maps.model.animation.Animation.C237331 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Animation createFromParcel(Parcel parcel) {
            return Animation.m86916a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Animation[] newArray(int i) {
            return new Animation[0];
        }
    };
    public static final int FILL_MODE_BACKWARDS = 1;
    public static final int FILL_MODE_FORWARDS = 0;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;

    /* renamed from: a */
    protected int f58812a;

    /* renamed from: b */
    protected int f58813b;

    /* renamed from: c */
    protected int f58814c = 1;

    /* renamed from: d */
    protected int f58815d;

    /* renamed from: e */
    protected long f58816e = 250;

    /* renamed from: f */
    protected Interpolator f58817f;

    /* renamed from: g */
    protected AnimationListener f58818g;

    public interface AnimationListener {
        void onAnimationEnd();

        void onAnimationStart();
    }

    public Animation() {
    }

    protected Animation(ParcelReader parcelReader) {
        this.f58812a = parcelReader.readInt(2, 0);
        this.f58813b = parcelReader.readInt(3, 0);
        this.f58814c = parcelReader.readInt(4, 0);
        this.f58815d = parcelReader.readInt(5, 0);
        this.f58816e = parcelReader.readLong(6, 0);
        IBinder readIBinder = parcelReader.readIBinder(7, null);
        if (readIBinder != null) {
            this.f58817f = (Interpolator) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(readIBinder));
        }
    }

    /* renamed from: a */
    static /* synthetic */ Animation m86916a(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int readInt = parcelReader.readInt(2, 0);
        if (readInt == 1) {
            return new AlphaAnimation(parcelReader);
        }
        if (readInt == 2) {
            return new RotateAnimation(parcelReader);
        }
        if (readInt == 3) {
            return new ScaleAnimation(parcelReader);
        }
        if (readInt == 4) {
            return new TranslateAnimation(parcelReader);
        }
        if (readInt != 5) {
            return null;
        }
        return new AnimationSet(parcelReader);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo84782a(ParcelWrite parcelWrite, int i);

    public int describeContents() {
        return 0;
    }

    public long getDuration() {
        return this.f58816e;
    }

    public int getFillMode() {
        return this.f58813b;
    }

    public Interpolator getInterpolator() {
        return this.f58817f;
    }

    public AnimationListener getListener() {
        return this.f58818g;
    }

    public int getRepeatCount() {
        return this.f58815d;
    }

    public int getRepeatMode() {
        return this.f58814c;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.f58818g = animationListener;
    }

    public abstract void setDuration(long j);

    public void setFillMode(int i) {
        this.f58813b = i;
    }

    public abstract void setInterpolator(Interpolator interpolator);

    public void setRepeatCount(int i) {
        this.f58815d = i;
    }

    public void setRepeatMode(int i) {
        this.f58814c = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.f58812a);
        parcelWrite.writeInt(3, this.f58813b);
        parcelWrite.writeInt(4, this.f58814c);
        parcelWrite.writeInt(5, this.f58815d);
        parcelWrite.writeLong(6, this.f58816e);
        parcelWrite.writeIBinder(7, ObjectWrapper.wrap(this.f58817f).asBinder(), false);
        mo84782a(parcelWrite, i);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
