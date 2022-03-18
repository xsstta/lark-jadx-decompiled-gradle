package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        /* class androidx.fragment.app.BackStackState.C09951 */

        /* renamed from: a */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }

        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };

    /* renamed from: a */
    final int[] f3810a;

    /* renamed from: b */
    final ArrayList<String> f3811b;

    /* renamed from: c */
    final int[] f3812c;

    /* renamed from: d */
    final int[] f3813d;

    /* renamed from: e */
    final int f3814e;

    /* renamed from: f */
    final String f3815f;

    /* renamed from: g */
    final int f3816g;

    /* renamed from: h */
    final int f3817h;

    /* renamed from: i */
    final CharSequence f3818i;

    /* renamed from: j */
    final int f3819j;

    /* renamed from: k */
    final CharSequence f3820k;

    /* renamed from: l */
    final ArrayList<String> f3821l;

    /* renamed from: m */
    final ArrayList<String> f3822m;

    /* renamed from: n */
    final boolean f3823n;

    public int describeContents() {
        return 0;
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.f3810a = parcel.createIntArray();
        this.f3811b = parcel.createStringArrayList();
        this.f3812c = parcel.createIntArray();
        this.f3813d = parcel.createIntArray();
        this.f3814e = parcel.readInt();
        this.f3815f = parcel.readString();
        this.f3816g = parcel.readInt();
        this.f3817h = parcel.readInt();
        this.f3818i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3819j = parcel.readInt();
        this.f3820k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3821l = parcel.createStringArrayList();
        this.f3822m = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f3823n = z;
    }

    public BackStackState(C1020a aVar) {
        String str;
        int size = aVar.mOps.size();
        this.f3810a = new int[(size * 5)];
        if (aVar.mAddToBackStack) {
            this.f3811b = new ArrayList<>(size);
            this.f3812c = new int[size];
            this.f3813d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                FragmentTransaction.C1019a aVar2 = (FragmentTransaction.C1019a) aVar.mOps.get(i);
                int i3 = i2 + 1;
                this.f3810a[i2] = aVar2.f3896a;
                ArrayList<String> arrayList = this.f3811b;
                if (aVar2.f3897b != null) {
                    str = aVar2.f3897b.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int i4 = i3 + 1;
                this.f3810a[i3] = aVar2.f3898c;
                int i5 = i4 + 1;
                this.f3810a[i4] = aVar2.f3899d;
                int i6 = i5 + 1;
                this.f3810a[i5] = aVar2.f3900e;
                this.f3810a[i6] = aVar2.f3901f;
                this.f3812c[i] = aVar2.f3902g.ordinal();
                this.f3813d[i] = aVar2.f3903h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f3814e = aVar.mTransition;
            this.f3815f = aVar.mName;
            this.f3816g = aVar.f3906c;
            this.f3817h = aVar.mBreadCrumbTitleRes;
            this.f3818i = aVar.mBreadCrumbTitleText;
            this.f3819j = aVar.mBreadCrumbShortTitleRes;
            this.f3820k = aVar.mBreadCrumbShortTitleText;
            this.f3821l = aVar.mSharedElementSourceNames;
            this.f3822m = aVar.mSharedElementTargetNames;
            this.f3823n = aVar.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C1020a mo5062a(FragmentManager fragmentManager) {
        C1020a aVar = new C1020a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f3810a.length) {
            FragmentTransaction.C1019a aVar2 = new FragmentTransaction.C1019a();
            int i3 = i + 1;
            aVar2.f3896a = this.f3810a[i];
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f3810a[i3]);
            }
            String str = this.f3811b.get(i2);
            if (str != null) {
                aVar2.f3897b = fragmentManager.findActiveFragment(str);
            } else {
                aVar2.f3897b = null;
            }
            aVar2.f3902g = Lifecycle.State.values()[this.f3812c[i2]];
            aVar2.f3903h = Lifecycle.State.values()[this.f3813d[i2]];
            int i4 = i3 + 1;
            aVar2.f3898c = this.f3810a[i3];
            int i5 = i4 + 1;
            aVar2.f3899d = this.f3810a[i4];
            int i6 = i5 + 1;
            aVar2.f3900e = this.f3810a[i5];
            aVar2.f3901f = this.f3810a[i6];
            aVar.mEnterAnim = aVar2.f3898c;
            aVar.mExitAnim = aVar2.f3899d;
            aVar.mPopEnterAnim = aVar2.f3900e;
            aVar.mPopExitAnim = aVar2.f3901f;
            aVar.addOp(aVar2);
            i2++;
            i = i6 + 1;
        }
        aVar.mTransition = this.f3814e;
        aVar.mName = this.f3815f;
        aVar.f3906c = this.f3816g;
        aVar.mAddToBackStack = true;
        aVar.mBreadCrumbTitleRes = this.f3817h;
        aVar.mBreadCrumbTitleText = this.f3818i;
        aVar.mBreadCrumbShortTitleRes = this.f3819j;
        aVar.mBreadCrumbShortTitleText = this.f3820k;
        aVar.mSharedElementSourceNames = this.f3821l;
        aVar.mSharedElementTargetNames = this.f3822m;
        aVar.mReorderingAllowed = this.f3823n;
        aVar.mo5498a(1);
        return aVar;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3810a);
        parcel.writeStringList(this.f3811b);
        parcel.writeIntArray(this.f3812c);
        parcel.writeIntArray(this.f3813d);
        parcel.writeInt(this.f3814e);
        parcel.writeString(this.f3815f);
        parcel.writeInt(this.f3816g);
        parcel.writeInt(this.f3817h);
        TextUtils.writeToParcel(this.f3818i, parcel, 0);
        parcel.writeInt(this.f3819j);
        TextUtils.writeToParcel(this.f3820k, parcel, 0);
        parcel.writeStringList(this.f3821l);
        parcel.writeStringList(this.f3822m);
        parcel.writeInt(this.f3823n ? 1 : 0);
    }
}
