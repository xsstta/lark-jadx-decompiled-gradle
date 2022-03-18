package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() {
        /* class androidx.fragment.app.FragmentManagerState.C10151 */

        /* renamed from: a */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };

    /* renamed from: a */
    ArrayList<FragmentState> f3866a;

    /* renamed from: b */
    ArrayList<String> f3867b;

    /* renamed from: c */
    BackStackState[] f3868c;

    /* renamed from: d */
    int f3869d;

    /* renamed from: e */
    String f3870e;

    public int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3866a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3867b = parcel.createStringArrayList();
        this.f3868c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3869d = parcel.readInt();
        this.f3870e = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f3866a);
        parcel.writeStringList(this.f3867b);
        parcel.writeTypedArray(this.f3868c, i);
        parcel.writeInt(this.f3869d);
        parcel.writeString(this.f3870e);
    }
}
