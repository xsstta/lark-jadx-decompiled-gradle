package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C21611a;
import com.google.android.gms.common.api.internal.cc;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final ArrayMap<cc<?>, ConnectionResult> zaay;

    public AvailabilityException(ArrayMap<cc<?>, ConnectionResult> arrayMap) {
        this.zaay = arrayMap;
    }

    public ConnectionResult getConnectionResult(C21628c<? extends C21611a.AbstractC21615d> cVar) {
        cc<? extends C21611a.AbstractC21615d> e = cVar.mo73252e();
        Preconditions.checkArgument(this.zaay.get(e) != null, "The given API was not part of the availability request.");
        return this.zaay.get(e);
    }

    public final ArrayMap<cc<?>, ConnectionResult> zaj() {
        return this.zaay;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (cc<?> ccVar : this.zaay.keySet()) {
            ConnectionResult connectionResult = this.zaay.get(ccVar);
            if (connectionResult.isSuccess()) {
                z = false;
            }
            String a = ccVar.mo73446a();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
