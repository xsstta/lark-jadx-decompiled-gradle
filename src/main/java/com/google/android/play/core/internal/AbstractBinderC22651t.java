package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.google.android.play.core.internal.t */
public abstract class AbstractBinderC22651t extends BinderC22641j implements AbstractC22652u {
    public AbstractBinderC22651t() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.BinderC22641j
    /* renamed from: a */
    public final boolean mo78896a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo78738a(parcel.readInt(), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78737a(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78743b(readInt2);
                return true;
            case 5:
                mo78741a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Bundle bundle3 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78744b((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 7:
                mo78739a((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Bundle bundle4 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78746c((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 9:
            default:
                return false;
            case 10:
                Bundle bundle5 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78748d((Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 11:
                mo78740a((Bundle) ch.m82407a(parcel, Bundle.CREATOR), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case HwBuildEx.VersionCodes.EMUI_5_1 /*{ENCODED_INT: 12}*/:
                mo78745b((Bundle) ch.m82407a(parcel, Bundle.CREATOR), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 13:
                mo78747c((Bundle) ch.m82407a(parcel, Bundle.CREATOR), (Bundle) ch.m82407a(parcel, Bundle.CREATOR));
                return true;
            case 14:
                Bundle bundle6 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                Bundle bundle7 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78742b();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) ch.m82407a(parcel, Bundle.CREATOR);
                mo78736a();
                return true;
        }
    }
}
