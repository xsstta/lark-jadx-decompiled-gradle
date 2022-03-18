package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

/* access modifiers changed from: package-private */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        /* class androidx.fragment.app.FragmentState.C10161 */

        /* renamed from: a */
        public FragmentState[] newArray(int i) {
            return new FragmentState[i];
        }

        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };

    /* renamed from: a */
    final String f3871a;

    /* renamed from: b */
    final String f3872b;

    /* renamed from: c */
    final boolean f3873c;

    /* renamed from: d */
    final int f3874d;

    /* renamed from: e */
    final int f3875e;

    /* renamed from: f */
    final String f3876f;

    /* renamed from: g */
    final boolean f3877g;

    /* renamed from: h */
    final boolean f3878h;

    /* renamed from: i */
    final boolean f3879i;

    /* renamed from: j */
    final Bundle f3880j;

    /* renamed from: k */
    final boolean f3881k;

    /* renamed from: l */
    final int f3882l;

    /* renamed from: m */
    Bundle f3883m;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((int) SmActions.ACTION_ONTHECALL_EXIT);
        sb.append("FragmentState{");
        sb.append(this.f3871a);
        sb.append(" (");
        sb.append(this.f3872b);
        sb.append(")}:");
        if (this.f3873c) {
            sb.append(" fromLayout");
        }
        if (this.f3875e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3875e));
        }
        String str = this.f3876f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3876f);
        }
        if (this.f3877g) {
            sb.append(" retainInstance");
        }
        if (this.f3878h) {
            sb.append(" removing");
        }
        if (this.f3879i) {
            sb.append(" detached");
        }
        if (this.f3881k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    FragmentState(Fragment fragment) {
        this.f3871a = fragment.getClass().getName();
        this.f3872b = fragment.mWho;
        this.f3873c = fragment.mFromLayout;
        this.f3874d = fragment.mFragmentId;
        this.f3875e = fragment.mContainerId;
        this.f3876f = fragment.mTag;
        this.f3877g = fragment.mRetainInstance;
        this.f3878h = fragment.mRemoving;
        this.f3879i = fragment.mDetached;
        this.f3880j = fragment.mArguments;
        this.f3881k = fragment.mHidden;
        this.f3882l = fragment.mMaxState.ordinal();
    }

    FragmentState(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f3871a = parcel.readString();
        this.f3872b = parcel.readString();
        boolean z5 = true;
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f3873c = z;
        this.f3874d = parcel.readInt();
        this.f3875e = parcel.readInt();
        this.f3876f = parcel.readString();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f3877g = z2;
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f3878h = z3;
        if (parcel.readInt() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f3879i = z4;
        this.f3880j = parcel.readBundle();
        this.f3881k = parcel.readInt() == 0 ? false : z5;
        this.f3883m = parcel.readBundle();
        this.f3882l = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3871a);
        parcel.writeString(this.f3872b);
        parcel.writeInt(this.f3873c ? 1 : 0);
        parcel.writeInt(this.f3874d);
        parcel.writeInt(this.f3875e);
        parcel.writeString(this.f3876f);
        parcel.writeInt(this.f3877g ? 1 : 0);
        parcel.writeInt(this.f3878h ? 1 : 0);
        parcel.writeInt(this.f3879i ? 1 : 0);
        parcel.writeBundle(this.f3880j);
        parcel.writeInt(this.f3881k ? 1 : 0);
        parcel.writeBundle(this.f3883m);
        parcel.writeInt(this.f3882l);
    }
}
