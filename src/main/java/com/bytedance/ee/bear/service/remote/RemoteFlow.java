package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import com.bytedance.ee.bear.service.remote.IFlow;
import com.bytedance.ee.log.C13479a;

public class RemoteFlow implements Parcelable {
    public static final Parcelable.Creator<RemoteFlow> CREATOR = new Parcelable.Creator<RemoteFlow>() {
        /* class com.bytedance.ee.bear.service.remote.RemoteFlow.C109422 */

        /* renamed from: a */
        public RemoteFlow[] newArray(int i) {
            return new RemoteFlow[i];
        }

        /* renamed from: a */
        public RemoteFlow createFromParcel(Parcel parcel) {
            return new RemoteFlow(parcel);
        }
    };

    /* renamed from: a */
    private String f29428a;

    /* renamed from: b */
    private IBinder f29429b;

    /* renamed from: c */
    private IFlow f29430c;

    /* renamed from: com.bytedance.ee.bear.service.remote.RemoteFlow$a */
    public interface AbstractC10943a {
        /* renamed from: a */
        void mo19712a(RemoteConsumer remoteConsumer);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public void mo41555a(RemoteConsumer remoteConsumer) {
        try {
            this.f29430c.subscribe(remoteConsumer);
        } catch (RemoteException e) {
            C13479a.m54759a("RemoteFlow", "subscribe: subscribe error", e);
        }
    }

    protected RemoteFlow(Parcel parcel) {
        this.f29428a = parcel.readString();
        IBinder readStrongBinder = parcel.readStrongBinder();
        this.f29429b = readStrongBinder;
        this.f29430c = IFlow.Stub.asInterface(readStrongBinder, this.f29428a);
    }

    public RemoteFlow(final AbstractC10943a aVar) {
        this.f29428a = String.valueOf(SystemClock.elapsedRealtime());
        BinderC109411 r0 = new IFlow.Stub(this.f29428a) {
            /* class com.bytedance.ee.bear.service.remote.RemoteFlow.BinderC109411 */

            @Override // com.bytedance.ee.bear.service.remote.IFlow
            public void subscribe(RemoteConsumer remoteConsumer) throws RemoteException {
                aVar.mo19712a(remoteConsumer);
            }
        };
        this.f29429b = r0;
        this.f29430c = r0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29428a);
        parcel.writeStrongBinder(this.f29429b);
    }
}
