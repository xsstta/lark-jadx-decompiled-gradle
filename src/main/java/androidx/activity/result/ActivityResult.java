package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() {
        /* class androidx.activity.result.ActivityResult.C02061 */

        /* renamed from: a */
        public ActivityResult[] newArray(int i) {
            return new ActivityResult[i];
        }

        /* renamed from: a */
        public ActivityResult createFromParcel(Parcel parcel) {
            return new ActivityResult(parcel);
        }
    };

    /* renamed from: a */
    private final int f445a;

    /* renamed from: b */
    private final Intent f446b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo636a() {
        return this.f445a;
    }

    /* renamed from: b */
    public Intent mo637b() {
        return this.f446b;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m632a(this.f445a) + ", data=" + this.f446b + '}';
    }

    /* renamed from: a */
    public static String m632a(int i) {
        if (i == -1) {
            return "RESULT_OK";
        }
        if (i != 0) {
            return String.valueOf(i);
        }
        return "RESULT_CANCELED";
    }

    ActivityResult(Parcel parcel) {
        Intent intent;
        this.f445a = parcel.readInt();
        if (parcel.readInt() == 0) {
            intent = null;
        } else {
            intent = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
        this.f446b = intent;
    }

    public ActivityResult(int i, Intent intent) {
        this.f445a = i;
        this.f446b = intent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f445a);
        if (this.f446b == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f446b;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
