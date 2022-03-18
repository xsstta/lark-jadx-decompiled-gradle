package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.android.HwBuildEx;

public abstract class bq extends BinderC22641j implements br {
    public bq() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.BinderC22641j
    /* renamed from: a */
    public final boolean mo78896a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo78905c(parcel.readInt(), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78898a(readInt);
                return true;
            case 4:
                mo78899a(parcel.readInt(), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo78903b(parcel.readInt(), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 6:
                mo78908e((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo78901a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 8:
                mo78907d((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 9:
                mo78900a((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 10:
                Bundle bundle2 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78902b();
                return true;
            case 11:
                Bundle bundle3 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78897a();
                return true;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                mo78904b((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo78906c((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
