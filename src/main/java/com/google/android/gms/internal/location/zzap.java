package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.zzal;

public final class zzap extends zza implements zzao {
    zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final Location zza(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
        Location location = (Location) C21928p.m79250a(transactAndReadException, Location.CREATOR);
        transactAndReadException.recycle();
        return location;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(long j, boolean z, PendingIntent pendingIntent) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeLong(j);
        C21928p.m79253a(obtainAndWriteInterfaceToken, true);
        C21928p.m79252a(obtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, pendingIntent);
        C21928p.m79251a(obtainAndWriteInterfaceToken, iStatusCallback);
        transactAndReadExceptionReturnVoid(73, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(Location location) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, location);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(zzaj zzaj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79251a(obtainAndWriteInterfaceToken, zzaj);
        transactAndReadExceptionReturnVoid(67, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(zzbf zzbf) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, zzbf);
        transactAndReadExceptionReturnVoid(59, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(zzo zzo) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, zzo);
        transactAndReadExceptionReturnVoid(75, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, activityTransitionRequest);
        C21928p.m79252a(obtainAndWriteInterfaceToken, pendingIntent);
        C21928p.m79251a(obtainAndWriteInterfaceToken, iStatusCallback);
        transactAndReadExceptionReturnVoid(72, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, zzam zzam) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, geofencingRequest);
        C21928p.m79252a(obtainAndWriteInterfaceToken, pendingIntent);
        C21928p.m79251a(obtainAndWriteInterfaceToken, zzam);
        transactAndReadExceptionReturnVoid(57, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(LocationSettingsRequest locationSettingsRequest, zzaq zzaq, String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, locationSettingsRequest);
        C21928p.m79251a(obtainAndWriteInterfaceToken, zzaq);
        obtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(63, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(zzal zzal, zzam zzam) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, zzal);
        C21928p.m79251a(obtainAndWriteInterfaceToken, zzam);
        transactAndReadExceptionReturnVoid(74, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zza(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79253a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final LocationAvailability zzb(String str) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeString(str);
        Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken);
        LocationAvailability locationAvailability = (LocationAvailability) C21928p.m79250a(transactAndReadException, LocationAvailability.CREATOR);
        transactAndReadException.recycle();
        return locationAvailability;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(PendingIntent pendingIntent) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C21928p.m79252a(obtainAndWriteInterfaceToken, pendingIntent);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }
}
