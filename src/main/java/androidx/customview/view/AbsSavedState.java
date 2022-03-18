package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() {
        /* class androidx.customview.view.AbsSavedState.C09642 */

        /* renamed from: a */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3614c;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: c */
    public static final AbsSavedState f3614c = new AbsSavedState() {
        /* class androidx.customview.view.AbsSavedState.C09631 */
    };

    /* renamed from: a */
    private final Parcelable f3615a;

    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
    }

    /* renamed from: a */
    public final Parcelable mo4902a() {
        return this.f3615a;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3615a = parcelable == f3614c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3615a, i);
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3615a = readParcelable == null ? f3614c : readParcelable;
    }
}
