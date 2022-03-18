package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.ee.bear.service.remote.IConsumer;
import com.bytedance.ee.log.C13479a;
import java.util.Arrays;

public class RemoteConsumer<T> implements Parcelable {
    public static final Parcelable.Creator<RemoteConsumer> CREATOR = new Parcelable.Creator<RemoteConsumer>() {
        /* class com.bytedance.ee.bear.service.remote.RemoteConsumer.C109392 */

        /* renamed from: a */
        public RemoteConsumer[] newArray(int i) {
            return new RemoteConsumer[i];
        }

        /* renamed from: a */
        public RemoteConsumer createFromParcel(Parcel parcel) {
            return new RemoteConsumer(parcel);
        }
    };

    /* renamed from: a */
    private String f29425a;

    /* renamed from: b */
    private IBinder f29426b;

    /* renamed from: c */
    private IConsumer<T> f29427c;

    /* renamed from: com.bytedance.ee.bear.service.remote.RemoteConsumer$a */
    public interface AbstractC10940a<T> {
        /* renamed from: a */
        void mo19729a(T t);

        /* renamed from: a */
        void mo19730a(Throwable th);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public void mo41547a(T t) {
        try {
            this.f29427c.onResult(t);
        } catch (RemoteException e) {
            C13479a.m54759a("RemoteConsumer", "onResult: error", e);
        }
    }

    protected RemoteConsumer(Parcel parcel) {
        this.f29425a = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        this.f29426b = readStrongBinder;
        this.f29427c = IConsumer.Stub.asInterface(readStrongBinder, this.f29425a);
    }

    public RemoteConsumer(final AbstractC10940a<T> aVar) {
        this.f29425a = String.valueOf(SystemClock.elapsedRealtime());
        BinderC109381 r0 = new IConsumer.Stub<T>(this.f29425a) {
            /* class com.bytedance.ee.bear.service.remote.RemoteConsumer.BinderC109381 */

            @Override // com.bytedance.ee.bear.service.remote.IConsumer
            public void onResult(T t) throws RemoteException {
                aVar.mo19729a((Object) t);
            }

            @Override // com.bytedance.ee.bear.service.remote.IConsumer
            public void onError(String str) throws RemoteException {
                aVar.mo19730a((Throwable) new Exception(str));
            }
        };
        this.f29426b = r0;
        this.f29427c = r0;
    }

    /* renamed from: a */
    public void mo41548a(Throwable th) {
        try {
            th.printStackTrace();
            IConsumer<T> iConsumer = this.f29427c;
            iConsumer.onError(th.getMessage() + Arrays.toString(th.getStackTrace()));
        } catch (RemoteException unused) {
            C13479a.m54759a("RemoteConsumer", "onError: error", th);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29425a);
        parcel.writeStrongBinder(this.f29426b);
    }
}
