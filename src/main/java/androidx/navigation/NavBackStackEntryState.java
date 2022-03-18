package androidx.navigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* access modifiers changed from: package-private */
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new Parcelable.Creator<NavBackStackEntryState>() {
        /* class androidx.navigation.NavBackStackEntryState.C12391 */

        /* renamed from: a */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }

        /* renamed from: a */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            return new NavBackStackEntryState(parcel);
        }
    };

    /* renamed from: a */
    private final UUID f4463a;

    /* renamed from: b */
    private final int f4464b;

    /* renamed from: c */
    private final Bundle f4465c;

    /* renamed from: d */
    private final Bundle f4466d;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public UUID mo6231a() {
        return this.f4463a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6232b() {
        return this.f4464b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bundle mo6233c() {
        return this.f4465c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Bundle mo6234d() {
        return this.f4466d;
    }

    NavBackStackEntryState(Parcel parcel) {
        this.f4463a = UUID.fromString(parcel.readString());
        this.f4464b = parcel.readInt();
        this.f4465c = parcel.readBundle(getClass().getClassLoader());
        this.f4466d = parcel.readBundle(getClass().getClassLoader());
    }

    NavBackStackEntryState(C1250f fVar) {
        this.f4463a = fVar.f4499a;
        this.f4464b = fVar.mo6299a().mo6254h();
        this.f4465c = fVar.mo6303b();
        Bundle bundle = new Bundle();
        this.f4466d = bundle;
        fVar.mo6304b(bundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4463a.toString());
        parcel.writeInt(this.f4464b);
        parcel.writeBundle(this.f4465c);
        parcel.writeBundle(this.f4466d);
    }
}
