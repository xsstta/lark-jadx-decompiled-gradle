package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        /* class androidx.versionedparcelable.ParcelImpl.C15641 */

        /* renamed from: a */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }
    };

    /* renamed from: a */
    private final AbstractC1566b f5465a;

    public int describeContents() {
        return 0;
    }

    protected ParcelImpl(Parcel parcel) {
        this.f5465a = new C1565a(parcel).mo8105j();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1565a(parcel).mo8075a(this.f5465a);
    }
}
