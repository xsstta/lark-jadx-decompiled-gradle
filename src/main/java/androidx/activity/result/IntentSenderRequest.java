package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new Parcelable.Creator<IntentSenderRequest>() {
        /* class androidx.activity.result.IntentSenderRequest.C02071 */

        /* renamed from: a */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }

        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }
    };

    /* renamed from: a */
    private final IntentSender f451a;

    /* renamed from: b */
    private final Intent f452b;

    /* renamed from: c */
    private final int f453c;

    /* renamed from: d */
    private final int f454d;

    public int describeContents() {
        return 0;
    }

    IntentSenderRequest(Parcel parcel) {
        this.f451a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f452b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f453c = parcel.readInt();
        this.f454d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f451a, i);
        parcel.writeParcelable(this.f452b, i);
        parcel.writeInt(this.f453c);
        parcel.writeInt(this.f454d);
    }
}
