package ee.android.framework.manis.base;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new Parcelable.Creator<BinderWrapper>() {
        /* class ee.android.framework.manis.base.BinderWrapper.C681861 */

        /* renamed from: a */
        public BinderWrapper[] newArray(int i) {
            return new BinderWrapper[i];
        }

        /* renamed from: a */
        public BinderWrapper createFromParcel(Parcel parcel) {
            return new BinderWrapper(parcel);
        }
    };

    /* renamed from: a */
    private final IBinder f171425a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public IBinder mo237091a() {
        return this.f171425a;
    }

    public BinderWrapper(IBinder iBinder) {
        this.f171425a = iBinder;
    }

    public BinderWrapper(Parcel parcel) {
        this.f171425a = parcel.readStrongBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f171425a);
    }
}
