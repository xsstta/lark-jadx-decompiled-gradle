package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C21936a;
import com.google.android.gms.internal.maps.zza;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzac;
import com.google.android.gms.internal.maps.zzad;
import com.google.android.gms.internal.maps.zzh;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.internal.maps.zzk;
import com.google.android.gms.internal.maps.zzl;
import com.google.android.gms.internal.maps.zzn;
import com.google.android.gms.internal.maps.zzo;
import com.google.android.gms.internal.maps.zzt;
import com.google.android.gms.internal.maps.zzu;
import com.google.android.gms.internal.maps.zzw;
import com.google.android.gms.internal.maps.zzx;
import com.google.android.gms.internal.maps.zzz;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.huawei.hms.location.ActivityIdentificationData;

public final class zzg extends zza implements IGoogleMapDelegate {
    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final CameraPosition getCameraPosition() throws RemoteException {
        Parcel zza = zza(1, zza());
        CameraPosition cameraPosition = (CameraPosition) C21936a.m79263a(zza, CameraPosition.CREATOR);
        zza.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMaxZoomLevel() throws RemoteException {
        Parcel zza = zza(2, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMinZoomLevel() throws RemoteException {
        Parcel zza = zza(3, zza());
        float readFloat = zza.readFloat();
        zza.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(4, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(5, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzc zzc) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        C21936a.m79264a(zza, zzc);
        zzb(6, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzc zzc) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iObjectWrapper);
        zza.writeInt(i);
        C21936a.m79264a(zza, zzc);
        zzb(7, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void stopAnimation() throws RemoteException {
        zzb(8, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzz addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, polylineOptions);
        Parcel zza2 = zza(9, zza);
        zzz zzi = zzaa.zzi(zza2.readStrongBinder());
        zza2.recycle();
        return zzi;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzw addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, polygonOptions);
        Parcel zza2 = zza(10, zza);
        zzw zzh = zzx.zzh(zza2.readStrongBinder());
        zza2.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzt addMarker(MarkerOptions markerOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, markerOptions);
        Parcel zza2 = zza(11, zza);
        zzt zzg = zzu.zzg(zza2.readStrongBinder());
        zza2.recycle();
        return zzg;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzk addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, groundOverlayOptions);
        Parcel zza2 = zza(12, zza);
        zzk zzd = zzl.zzd(zza2.readStrongBinder());
        zza2.recycle();
        return zzd;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzac addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, tileOverlayOptions);
        Parcel zza2 = zza(13, zza);
        zzac zzj = zzad.zzj(zza2.readStrongBinder());
        zza2.recycle();
        return zzj;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() throws RemoteException {
        zzb(14, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapType() throws RemoteException {
        Parcel zza = zza(15, zza());
        int readInt = zza.readInt();
        zza.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapType(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzb(16, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTrafficEnabled() throws RemoteException {
        Parcel zza = zza(17, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTrafficEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(18, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isIndoorEnabled() throws RemoteException {
        Parcel zza = zza(19, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setIndoorEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        Parcel zza2 = zza(20, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isMyLocationEnabled() throws RemoteException {
        Parcel zza = zza(21, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(22, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final Location getMyLocation() throws RemoteException {
        Parcel zza = zza(23, zza());
        Location location = (Location) C21936a.m79263a(zza, Location.CREATOR);
        zza.recycle();
        return location;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, iLocationSourceDelegate);
        zzb(24, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IUiSettingsDelegate getUiSettings() throws RemoteException {
        IUiSettingsDelegate iUiSettingsDelegate;
        Parcel zza = zza(25, zza());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            iUiSettingsDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof IUiSettingsDelegate) {
                iUiSettingsDelegate = (IUiSettingsDelegate) queryLocalInterface;
            } else {
                iUiSettingsDelegate = new zzbx(readStrongBinder);
            }
        }
        zza.recycle();
        return iUiSettingsDelegate;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IProjectionDelegate getProjection() throws RemoteException {
        IProjectionDelegate iProjectionDelegate;
        Parcel zza = zza(26, zza());
        IBinder readStrongBinder = zza.readStrongBinder();
        if (readStrongBinder == null) {
            iProjectionDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (queryLocalInterface instanceof IProjectionDelegate) {
                iProjectionDelegate = (IProjectionDelegate) queryLocalInterface;
            } else {
                iProjectionDelegate = new zzbr(readStrongBinder);
            }
        }
        zza.recycle();
        return iProjectionDelegate;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraChangeListener(zzl zzl) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzl);
        zzb(27, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapClickListener(zzaj zzaj) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzaj);
        zzb(28, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLongClickListener(zzan zzan) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzan);
        zzb(29, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerClickListener(zzar zzar) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzar);
        zzb(30, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerDragListener(zzat zzat) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzat);
        zzb(31, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowClickListener(zzab zzab) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzab);
        zzb(32, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setInfoWindowAdapter(zzh zzh) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzh);
        zzb(33, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzh addCircle(CircleOptions circleOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, circleOptions);
        Parcel zza2 = zza(35, zza);
        zzh zzc = zzi.zzc(zza2.readStrongBinder());
        zza2.recycle();
        return zzc;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationChangeListener(zzax zzax) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzax);
        zzb(36, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationButtonClickListener(zzav zzav) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzav);
        zzb(37, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshot(zzbs zzbs, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbs);
        C21936a.m79264a(zza, iObjectWrapper);
        zzb(38, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(i4);
        zzb(39, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isBuildingsEnabled() throws RemoteException {
        Parcel zza = zza(40, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setBuildingsEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(41, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLoadedCallback(zzal zzal) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzal);
        zzb(42, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final zzn getFocusedBuilding() throws RemoteException {
        Parcel zza = zza(44, zza());
        zzn zze = zzo.zze(zza.readStrongBinder());
        zza.recycle();
        return zze;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnIndoorStateChangeListener(zzz zzz) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzz);
        zzb(45, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setWatermarkEnabled(boolean z) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79266a(zza, z);
        zzb(51, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzap);
        zzb(53, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        zzb(54, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onResume() throws RemoteException {
        zzb(55, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onPause() throws RemoteException {
        zzb(56, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onDestroy() throws RemoteException {
        zzb(57, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onLowMemory() throws RemoteException {
        zzb(58, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean useViewLifecycleWhenInFragment() throws RemoteException {
        Parcel zza = zza(59, zza());
        boolean a = C21936a.m79267a(zza);
        zza.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        Parcel zza2 = zza(60, zza);
        if (zza2.readInt() != 0) {
            bundle.readFromParcel(zza2);
        }
        zza2.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setContentDescription(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzb(61, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshotForTest(zzbs zzbs) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbs);
        zzb(71, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPoiClickListener(zzbb zzbb) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbb);
        zzb(80, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, bundle);
        zzb(81, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onExitAmbient() throws RemoteException {
        zzb(82, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnGroundOverlayClickListener(zzx zzx) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzx);
        zzb(83, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowLongClickListener(zzaf zzaf) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzaf);
        zzb(84, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolygonClickListener(zzbd zzbd) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbd);
        zzb(85, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowCloseListener(zzad zzad) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzad);
        zzb(86, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolylineClickListener(zzbf zzbf) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzbf);
        zzb(87, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCircleClickListener(zzv zzv) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzv);
        zzb(89, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMinZoomPreference(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(92, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMaxZoomPreference(float f) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f);
        zzb(93, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void resetMinMaxZoomPreference() throws RemoteException {
        zzb(94, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, latLngBounds);
        zzb(95, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveStartedListener(zzt zzt) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzt);
        zzb(96, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveListener(zzr zzr) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzr);
        zzb(97, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveCanceledListener(zzp zzp) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzp);
        zzb(98, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraIdleListener(zzn zzn) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzn);
        zzb(99, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79265a(zza, mapStyleOptions);
        Parcel zza2 = zza(91, zza);
        boolean a = C21936a.m79267a(zza2);
        zza2.recycle();
        return a;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStart() throws RemoteException {
        zzb(101, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStop() throws RemoteException {
        zzb(102, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationClickListener(zzaz zzaz) throws RemoteException {
        Parcel zza = zza();
        C21936a.m79264a(zza, zzaz);
        zzb(ActivityIdentificationData.WALKING, zza);
    }
}
