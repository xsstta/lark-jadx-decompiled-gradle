package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.Nullable;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C21711i();

    /* renamed from: a */
    private final String f53221a;
    @Nullable

    /* renamed from: b */
    private final zze f53222b;

    /* renamed from: c */
    private final boolean f53223c;

    /* renamed from: d */
    private final boolean f53224d;

    zzk(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f53221a = str;
        this.f53222b = m79098a(iBinder);
        this.f53223c = z;
        this.f53224d = z2;
    }

    zzk(String str, @Nullable zze zze, boolean z, boolean z2) {
        this.f53221a = str;
        this.f53222b = zze;
        this.f53223c = z;
        this.f53224d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f53221a, false);
        zze zze = this.f53222b;
        if (zze == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            iBinder = null;
        } else {
            iBinder = zze.asBinder();
        }
        SafeParcelWriter.writeIBinder(parcel, 2, iBinder, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f53223c);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f53224d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Nullable
    /* renamed from: a */
    private static zze m79098a(@Nullable IBinder iBinder) {
        byte[] bArr;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzb = zzj.zzb(iBinder).zzb();
            if (zzb == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ObjectWrapper.unwrap(zzb);
            }
            if (bArr != null) {
                return new zzf(bArr);
            }
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            return null;
        } catch (RemoteException e) {
            Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            return null;
        }
    }
}
