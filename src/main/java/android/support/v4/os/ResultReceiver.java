package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;

public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new Parcelable.Creator<ResultReceiver>() {
        /* class android.support.v4.os.ResultReceiver.C01761 */

        /* renamed from: a */
        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }

        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }
    };

    /* renamed from: a */
    final boolean f395a;

    /* renamed from: b */
    final Handler f396b;

    /* renamed from: c */
    IResultReceiver f397c;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class RunnableC0177a implements Runnable {

        /* renamed from: a */
        final int f398a;

        /* renamed from: b */
        final Bundle f399b;

        public void run() {
            ResultReceiver.this.mo156a(this.f398a, this.f399b);
        }

        RunnableC0177a(int i, Bundle bundle) {
            this.f398a = i;
            this.f399b = bundle;
        }
    }

    class MyResultReceiver extends IResultReceiver.Stub {
        MyResultReceiver() {
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int i, Bundle bundle) {
            if (ResultReceiver.this.f396b != null) {
                ResultReceiver.this.f396b.post(new RunnableC0177a(i, bundle));
            } else {
                ResultReceiver.this.mo156a(i, bundle);
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f397c = IResultReceiver.Stub.asInterface(parcel.readStrongBinder());
    }

    /* renamed from: b */
    public void mo539b(int i, Bundle bundle) {
        if (this.f395a) {
            Handler handler = this.f396b;
            if (handler != null) {
                handler.post(new RunnableC0177a(i, bundle));
            } else {
                mo156a(i, bundle);
            }
        } else {
            IResultReceiver iResultReceiver = this.f397c;
            if (iResultReceiver != null) {
                try {
                    iResultReceiver.send(i, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f397c == null) {
                this.f397c = new MyResultReceiver();
            }
            parcel.writeStrongBinder(this.f397c.asBinder());
        }
    }
}
