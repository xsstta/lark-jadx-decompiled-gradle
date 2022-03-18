package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.hms.maps.mcd;
import com.huawei.hms.maps.mce;
import java.util.ArrayList;
import java.util.List;

public final class IndoorBuilding {

    /* renamed from: a */
    private mcd f58745a;

    public IndoorBuilding(mcd mcd) {
        this.f58745a = mcd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IndoorBuilding)) {
            return false;
        }
        try {
            return this.f58745a.mo84169a(((IndoorBuilding) obj).f58745a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getActiveLevelIndex() {
        try {
            return this.f58745a.mo84168a();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int getDefaultLevelIndex() {
        try {
            return this.f58745a.mo84170b();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final List<IndoorLevel> getLevels() {
        try {
            List<IBinder> c = this.f58745a.mo84171c();
            ArrayList arrayList = new ArrayList(c.size());
            for (IBinder iBinder : c) {
                IBinder iBinder2 = null;
                if (iBinder instanceof IBinder) {
                    iBinder2 = iBinder;
                }
                arrayList.add(new IndoorLevel(mce.maa.m86673a(iBinder2)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            return this.f58745a.mo84173e();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isUnderground() {
        try {
            return this.f58745a.mo84172d();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
