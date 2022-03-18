package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.IMessengerCompat;

public class FirebaseIidMessengerCompat implements Parcelable {
    public static final Parcelable.Creator<FirebaseIidMessengerCompat> CREATOR = new Parcelable.Creator<FirebaseIidMessengerCompat>() {
        /* class com.google.firebase.iid.FirebaseIidMessengerCompat.C227961 */

        /* renamed from: a */
        public FirebaseIidMessengerCompat[] newArray(int i) {
            return new FirebaseIidMessengerCompat[i];
        }

        /* renamed from: a */
        public FirebaseIidMessengerCompat createFromParcel(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                return new FirebaseIidMessengerCompat(readStrongBinder);
            }
            return null;
        }
    };

    /* renamed from: a */
    Messenger f56346a;

    /* renamed from: b */
    IMessengerCompat f56347b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public IBinder mo79227a() {
        Messenger messenger = this.f56346a;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return this.f56347b.asBinder();
    }

    public int hashCode() {
        return mo79227a().hashCode();
    }

    public FirebaseIidMessengerCompat(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f56346a = new Messenger(iBinder);
        } else {
            this.f56347b = new IMessengerCompat.Proxy(iBinder);
        }
    }

    /* renamed from: a */
    public void mo79228a(Message message) throws RemoteException {
        Messenger messenger = this.f56346a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f56347b.send(message);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo79227a().equals(((FirebaseIidMessengerCompat) obj).mo79227a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: com.google.firebase.iid.FirebaseIidMessengerCompat$a */
    public static final class C22797a extends ClassLoader {
        /* access modifiers changed from: protected */
        @Override // java.lang.ClassLoader
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.isDebugLogEnabled()) {
                return FirebaseIidMessengerCompat.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return FirebaseIidMessengerCompat.class;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f56346a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f56347b.asBinder());
        }
    }
}
