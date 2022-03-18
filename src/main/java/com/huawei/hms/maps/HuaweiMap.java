package com.huawei.hms.maps;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.AbstractC23699map;
import com.huawei.hms.maps.maf;
import com.huawei.hms.maps.maj;
import com.huawei.hms.maps.mao;
import com.huawei.hms.maps.maq;
import com.huawei.hms.maps.mar;
import com.huawei.hms.maps.mas;
import com.huawei.hms.maps.mat;
import com.huawei.hms.maps.mau;
import com.huawei.hms.maps.mav;
import com.huawei.hms.maps.maw;
import com.huawei.hms.maps.max;
import com.huawei.hms.maps.maz;
import com.huawei.hms.maps.mba;
import com.huawei.hms.maps.mbb;
import com.huawei.hms.maps.mbd;
import com.huawei.hms.maps.mbe;
import com.huawei.hms.maps.mbf;
import com.huawei.hms.maps.mbg;
import com.huawei.hms.maps.mbh;
import com.huawei.hms.maps.mbi;
import com.huawei.hms.maps.mbj;
import com.huawei.hms.maps.mbp;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.Circle;
import com.huawei.hms.maps.model.CircleOptions;
import com.huawei.hms.maps.model.GroundOverlay;
import com.huawei.hms.maps.model.GroundOverlayOptions;
import com.huawei.hms.maps.model.IndoorBuilding;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import com.huawei.hms.maps.model.MapStyleOptions;
import com.huawei.hms.maps.model.Marker;
import com.huawei.hms.maps.model.MarkerOptions;
import com.huawei.hms.maps.model.PointOfInterest;
import com.huawei.hms.maps.model.Polygon;
import com.huawei.hms.maps.model.PolygonOptions;
import com.huawei.hms.maps.model.Polyline;
import com.huawei.hms.maps.model.PolylineOptions;
import com.huawei.hms.maps.model.TileOverlay;
import com.huawei.hms.maps.model.TileOverlayOptions;

public class HuaweiMap {
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;

    /* renamed from: a */
    private boolean f58448a;

    /* renamed from: b */
    private mai f58449b;

    /* renamed from: c */
    private UiSettings f58450c;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    public interface InfoWindowAdapter {
        View getInfoContents(Marker marker);

        View getInfoWindow(Marker marker);
    }

    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i);
    }

    public interface OnCircleClickListener {
        void onCircleClick(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(GroundOverlay groundOverlay);
    }

    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(IndoorBuilding indoorBuilding);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(Marker marker);
    }

    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    public interface OnMyLocationClickListener {
        void onMyLocationClick(Location location);
    }

    public interface OnPoiClickListener {
        void onPoiClick(PointOfInterest pointOfInterest);
    }

    public interface OnPolygonClickListener {
        void onPolygonClick(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        void onPolylineClick(Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    HuaweiMap(mai mai) {
        this.f58449b = mai;
        try {
            BitmapDescriptorFactory.sIBitmapDescriptorDelegate = mai.mo83965p();
        } catch (RemoteException unused) {
            mcq.m86889e("HuaweiMap", "getBitmapDescriptor RemoteException: ");
        }
    }

    public Circle addCircle(CircleOptions circleOptions) {
        try {
            return new Circle(this.f58449b.mo83900a(circleOptions));
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "addCircle RemoteException: " + e.toString());
            return null;
        }
    }

    public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        if (groundOverlayOptions.getImage() != null) {
            try {
                mcc a = this.f58449b.mo83901a(groundOverlayOptions);
                if (a != null) {
                    return new GroundOverlay(a);
                }
                return null;
            } catch (RemoteException e) {
                mcq.m86886b("HuaweiMap", "addGroundOverlay RemoteException: " + e.toString());
                return null;
            }
        } else {
            throw new IllegalArgumentException("GroundOverlayOptions image must not be null");
        }
    }

    public Marker addMarker(MarkerOptions markerOptions) {
        try {
            return new Marker(this.f58449b.mo83903a(markerOptions));
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
            return null;
        }
    }

    public Polygon addPolygon(PolygonOptions polygonOptions) {
        try {
            return new Polygon(this.f58449b.mo83904a(polygonOptions));
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "addPolygon RemoteException: " + e.toString());
            return null;
        }
    }

    public Polyline addPolyline(PolylineOptions polylineOptions) {
        try {
            return new Polyline(this.f58449b.mo83905a(polylineOptions));
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "addPolyline RemoteException: " + e.toString());
            return null;
        }
    }

    public TileOverlay addTileOverlay(TileOverlayOptions tileOverlayOptions) {
        if (tileOverlayOptions.getTileProvider() != null) {
            try {
                return new TileOverlay(this.f58449b.mo83906a(tileOverlayOptions));
            } catch (RemoteException e) {
                mcq.m86889e("HuaweiMap", "addTileOverlay RemoteException: " + e.toString());
                return null;
            }
        } else {
            throw new IllegalArgumentException("TileProvider must not be null");
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate) {
        try {
            mcq.m86886b("HuaweiMap", "animateCamera begin");
            this.f58449b.mo83935a(cameraUpdate.getCameraUpdate());
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, int i, final CancelableCallback cancelableCallback) {
        try {
            this.f58449b.mo83936a(cameraUpdate.getCameraUpdate(), i, cancelableCallback == null ? null : new maf.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236836 */

                @Override // com.huawei.hms.maps.maf
                public void onCancel() {
                    cancelableCallback.onCancel();
                }

                @Override // com.huawei.hms.maps.maf
                public void onFinish() {
                    cancelableCallback.onFinish();
                }
            });
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException" + e.toString());
        }
    }

    public void animateCamera(CameraUpdate cameraUpdate, final CancelableCallback cancelableCallback) {
        mcq.m86886b("HuaweiMap", "animateCamera(update,callback)");
        try {
            this.f58449b.mo83937a(cameraUpdate.getCameraUpdate(), cancelableCallback == null ? null : new maf.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236825 */

                @Override // com.huawei.hms.maps.maf
                public void onCancel() {
                    cancelableCallback.onCancel();
                }

                @Override // com.huawei.hms.maps.maf
                public void onFinish() {
                    cancelableCallback.onFinish();
                }
            });
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException" + e.toString());
        }
    }

    public void clear() {
        try {
            this.f58449b.mo83962m();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "clear RemoteException: " + e.toString());
        }
    }

    public CameraPosition getCameraPosition() {
        try {
            mcq.m86884a("HuaweiMap", "getCameraPosition begin");
            return this.f58449b.mo83963n();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
            return null;
        }
    }

    public IndoorBuilding getFocusedBuilding() {
        try {
            mcd a = this.f58449b.mo83902a();
            if (a == null) {
                return null;
            }
            return new IndoorBuilding(a);
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "getFocusedBuilding RemoteException: " + e.toString());
            return null;
        }
    }

    public int getMapType() {
        try {
            return this.f58449b.mo83954f();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "getMapType RemoteException: " + e.toString());
            return 0;
        }
    }

    public float getMaxZoomLevel() {
        try {
            return this.f58449b.mo83942b();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "getMaxZoomLevel RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public float getMinZoomLevel() {
        try {
            return this.f58449b.mo83947c();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "getMinZoomLevel RemoteException: " + e.toString());
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public Projection getProjection() {
        try {
            return new Projection(this.f58449b.mo83961l());
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "getProjection: " + e.getMessage());
            return null;
        }
    }

    public UiSettings getUiSettings() {
        try {
            UiSettings uiSettings = new UiSettings(this.f58449b.mo83960k());
            this.f58450c = uiSettings;
            return uiSettings;
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "getUiSettings RemoteException: " + e.toString());
            return null;
        }
    }

    public boolean isBuildingsEnabled() {
        try {
            return this.f58449b.mo83951d();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "isBuildingsEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isIndoorEnabled() {
        try {
            return this.f58449b.mo83956g();
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "isIndoorEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isMyLocationEnabled() {
        try {
            return this.f58449b.mo83953e();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "isMyLocationEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public boolean isTrafficEnabled() {
        try {
            return this.f58449b.mo83957h();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "isTrafficEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public void moveCamera(CameraUpdate cameraUpdate) {
        try {
            mcq.m86886b("HuaweiMap", "moveCamera begin");
            this.f58449b.mo83944b(cameraUpdate.getCameraUpdate());
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void resetMinMaxZoomPreference() {
        try {
            this.f58449b.mo83958i();
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "resetMinMaxZoomPreference RemoteException: " + e.toString());
        }
    }

    public void setBuildingsEnabled(boolean z) {
        try {
            this.f58449b.mo83940a(z);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setBuildingsEnabled RemoteException: " + e.toString());
        }
    }

    public void setContentDescription(String str) {
        try {
            this.f58449b.mo83939a(str);
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setContentDescription RemoteException: " + e.toString());
        }
    }

    public void setGeoPoliticalView(String str) {
        try {
            mcq.m86887c("HuaweiMap", "setGeoPoliticalView : ".concat(String.valueOf(str)));
            this.f58449b.mo83945b(str);
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setGeoPoliticalView RemoteException: " + e.toString());
        }
    }

    public boolean setIndoorEnabled(boolean z) {
        try {
            this.f58449b.mo83949c(z);
            return false;
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setIndoorEnabled RemoteException: " + e.toString());
            return false;
        }
    }

    public void setInfoWindowAdapter(final InfoWindowAdapter infoWindowAdapter) {
        try {
            this.f58449b.mo83911a(new maj.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236847 */

                @Override // com.huawei.hms.maps.maj
                public IObjectWrapper getInfoContents(mcf mcf) {
                    InfoWindowAdapter infoWindowAdapter = infoWindowAdapter;
                    if (infoWindowAdapter == null) {
                        return null;
                    }
                    return ObjectWrapper.wrap(infoWindowAdapter.getInfoContents(new Marker(mcf)));
                }

                @Override // com.huawei.hms.maps.maj
                public IObjectWrapper getInfoWindow(mcf mcf) {
                    InfoWindowAdapter infoWindowAdapter = infoWindowAdapter;
                    if (infoWindowAdapter == null) {
                        return null;
                    }
                    return ObjectWrapper.wrap(infoWindowAdapter.getInfoWindow(new Marker(mcf)));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setLanguage(String str) {
        try {
            mcq.m86887c("HuaweiMap", "setLanguage : ".concat(String.valueOf(str)));
            this.f58449b.mo83948c(str);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setLanguage RemoteException: " + e.toString());
        }
    }

    public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        try {
            this.f58449b.mo83938a(latLngBounds);
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setLocationSource(LocationSource locationSource) {
        if (locationSource == null) {
            try {
                this.f58448a = false;
                this.f58449b.mo83912a((mak) null);
            } catch (RemoteException e) {
                mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
            }
        } else {
            this.f58448a = true;
            this.f58449b.mo83912a(new mbu(locationSource));
        }
    }

    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) {
        try {
            return this.f58449b.mo83941a(mapStyleOptions);
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
            return false;
        }
    }

    public void setMapType(int i) {
        try {
            this.f58449b.mo83908a(i);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setMapType RemoteException: " + e.toString());
        }
    }

    public void setMarkersClustering(boolean z) {
        try {
            this.f58449b.mo83955f(z);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setMaxZoomPreference(float f) {
        try {
            this.f58449b.mo83907a(f);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setMaxZoomPreference RemoteException: " + e.toString());
        }
    }

    public void setMinZoomPreference(float f) {
        try {
            this.f58449b.mo83943b(f);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setMinZoomPreference RemoteException: " + e.toString());
        }
    }

    public void setMyLocationEnabled(boolean z) {
        Context b;
        if (!this.f58448a && (b = MapClientIdentify.m86148b()) != null) {
            PackageManager packageManager = b.getPackageManager();
            String packageName = b.getPackageName();
            if (!(packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", packageName) == 0 || packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", packageName) == 0)) {
                throw new SecurityException("the permission is not granted, my location requires permission ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION.");
            }
        }
        try {
            this.f58449b.mo83946b(z);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setMyLocationEnabled RemoteException: " + e.toString());
        }
    }

    public void setOnCameraIdleListener(final OnCameraIdleListener onCameraIdleListener) {
        mcq.m86886b("HuaweiMap", "setOnCameraIdleListener: ");
        try {
            this.f58449b.mo83913a(onCameraIdleListener == null ? null : new mao.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236792 */

                @Override // com.huawei.hms.maps.mao
                public void onCameraIdle() {
                    mcq.m86887c("HuaweiMap", "onCameraIdle: ");
                    onCameraIdleListener.onCameraIdle();
                }
            });
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnCameraMoveCanceledListener(final OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        mcq.m86886b("HuaweiMap", "HuaweiMap does not support ");
        try {
            this.f58449b.mo83914a(onCameraMoveCanceledListener == null ? null : new AbstractC23699map.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236814 */

                @Override // com.huawei.hms.maps.AbstractC23699map
                public void onCameraMoveCanceled() {
                    mcq.m86886b("HuaweiMap", "onCameraMoveCanceled");
                    onCameraMoveCanceledListener.onCameraMoveCanceled();
                }
            });
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnCameraMoveListener(final OnCameraMoveListener onCameraMoveListener) {
        mcq.m86886b("HuaweiMap", "setCameraMoveListener: ");
        try {
            this.f58449b.mo83915a(onCameraMoveListener == null ? null : new maq.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236803 */

                @Override // com.huawei.hms.maps.maq
                public void onCameraMove() {
                    mcq.m86884a("HuaweiMap", "onCameraMove: ");
                    onCameraMoveListener.onCameraMove();
                }
            });
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnCameraMoveStartedListener(final OnCameraMoveStartedListener onCameraMoveStartedListener) {
        mcq.m86886b("HuaweiMap", "setOnCameraMoveStartedListener: ");
        try {
            this.f58449b.mo83916a(onCameraMoveStartedListener == null ? null : new mar.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236781 */

                @Override // com.huawei.hms.maps.mar
                public void onCameraMoveStarted(int i) {
                    mcq.m86887c("HuaweiMap", "onCameraMoveStarted: ".concat(String.valueOf(i)));
                    onCameraMoveStartedListener.onCameraMoveStarted(i);
                }
            });
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnCircleClickListener(final OnCircleClickListener onCircleClickListener) {
        mcq.m86886b("HuaweiMap", "onCircleClick setListener start: ");
        try {
            this.f58449b.mo83917a(onCircleClickListener == null ? null : new mas.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass11 */

                @Override // com.huawei.hms.maps.mas
                public void onCircleClick(mcb mcb) {
                    mcq.m86887c("HuaweiMap", "onCircleClick callback start: ");
                    Circle circle = new Circle(mcb);
                    OnCircleClickListener onCircleClickListener = onCircleClickListener;
                    if (onCircleClickListener != null) {
                        onCircleClickListener.onCircleClick(circle);
                    }
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnGroundOverlayClickListener(final OnGroundOverlayClickListener onGroundOverlayClickListener) {
        try {
            this.f58449b.mo83918a(onGroundOverlayClickListener == null ? null : new mat.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass22 */

                @Override // com.huawei.hms.maps.mat
                public void onGroundOverlayClick(mcc mcc) {
                    onGroundOverlayClickListener.onGroundOverlayClick(new GroundOverlay(mcc));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setOnGroundOverlayClickListener RemoteException: " + e.toString());
        }
    }

    public void setOnIndoorStateChangeListener(final OnIndoorStateChangeListener onIndoorStateChangeListener) {
        try {
            this.f58449b.mo83919a(onIndoorStateChangeListener == null ? null : new mau.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass23 */

                @Override // com.huawei.hms.maps.mau
                public void onIndoorBuildingFocused() {
                    onIndoorStateChangeListener.onIndoorBuildingFocused();
                }

                @Override // com.huawei.hms.maps.mau
                public void onIndoorLevelActivated(mcd mcd) {
                    onIndoorStateChangeListener.onIndoorLevelActivated(new IndoorBuilding(mcd));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setOnIndoorStateChangeListener RemoteException: " + e.toString());
        }
    }

    public void setOnInfoWindowClickListener(final OnInfoWindowClickListener onInfoWindowClickListener) {
        try {
            this.f58449b.mo83920a(onInfoWindowClickListener == null ? null : new mav.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass21 */

                @Override // com.huawei.hms.maps.mav
                public void onInfoWindowClick(mcf mcf) {
                    mcq.m86887c("HuaweiMap", "onInfoWindowClick callback start: ");
                    onInfoWindowClickListener.onInfoWindowClick(new Marker(mcf));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnInfoWindowCloseListener(final OnInfoWindowCloseListener onInfoWindowCloseListener) {
        try {
            this.f58449b.mo83921a(onInfoWindowCloseListener == null ? null : new maw.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass24 */

                @Override // com.huawei.hms.maps.maw
                public void onInfoWindowClose(mcf mcf) {
                    onInfoWindowCloseListener.onInfoWindowClose(new Marker(mcf));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setOnInfoWindowCloseListener RemoteException: " + e.toString());
        }
    }

    public void setOnInfoWindowLongClickListener(final OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        try {
            this.f58449b.mo83922a(onInfoWindowLongClickListener == null ? null : new max.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass25 */

                @Override // com.huawei.hms.maps.max
                public void onInfoWindowLongClick(mcf mcf) {
                    onInfoWindowLongClickListener.onInfoWindowLongClick(new Marker(mcf));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setOnInfoWindowLongClickListener RemoteException: " + e.toString());
        }
    }

    public void setOnMapClickListener(final OnMapClickListener onMapClickListener) {
        mcq.m86886b("HuaweiMap", "setOnMapClickListener: ");
        try {
            this.f58449b.mo83923a(onMapClickListener == null ? null : new maz.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass14 */

                @Override // com.huawei.hms.maps.maz
                public void onMapClick(LatLng latLng) {
                    onMapClickListener.onMapClick(latLng);
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnMapLoadedCallback(final OnMapLoadedCallback onMapLoadedCallback) {
        try {
            this.f58449b.mo83924a(new mba.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236858 */

                @Override // com.huawei.hms.maps.mba
                public void onMapLoaded() {
                    OnMapLoadedCallback onMapLoadedCallback = onMapLoadedCallback;
                    if (onMapLoadedCallback != null) {
                        onMapLoadedCallback.onMapLoaded();
                    }
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setOnMapLoadedCallback: " + e.getMessage());
        }
    }

    public void setOnMapLongClickListener(final OnMapLongClickListener onMapLongClickListener) {
        mcq.m86886b("HuaweiMap", "setOnMapLongClickListener");
        try {
            this.f58449b.mo83925a(onMapLongClickListener == null ? null : new mbb.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass15 */

                @Override // com.huawei.hms.maps.mbb
                public void onMapLongClick(LatLng latLng) {
                    mcq.m86886b("HuaweiMap", "onMapLongClick");
                    onMapLongClickListener.onMapLongClick(latLng);
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnMarkerClickListener(final OnMarkerClickListener onMarkerClickListener) {
        try {
            this.f58449b.mo83926a(onMarkerClickListener == null ? null : new mbd.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.BinderC236869 */

                @Override // com.huawei.hms.maps.mbd
                public boolean onMarkerClick(mcf mcf) {
                    Marker marker = new Marker(mcf);
                    OnMarkerClickListener onMarkerClickListener = onMarkerClickListener;
                    if (onMarkerClickListener != null) {
                        return onMarkerClickListener.onMarkerClick(marker);
                    }
                    return false;
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnMarkerDragListener(final OnMarkerDragListener onMarkerDragListener) {
        mcq.m86886b("HuaweiMap", "onMarkerDrag setListener start: ");
        try {
            this.f58449b.mo83927a(onMarkerDragListener == null ? null : new mbe.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass10 */

                @Override // com.huawei.hms.maps.mbe
                public void onMarkerDrag(mcf mcf) {
                    mcq.m86887c("HuaweiMap", "onMarkerDrag callback start: ");
                    onMarkerDragListener.onMarkerDrag(new Marker(mcf));
                }

                @Override // com.huawei.hms.maps.mbe
                public void onMarkerDragEnd(mcf mcf) {
                    mcq.m86887c("HuaweiMap", "onMarkerDrag callback start: ");
                    onMarkerDragListener.onMarkerDragEnd(new Marker(mcf));
                }

                @Override // com.huawei.hms.maps.mbe
                public void onMarkerDragStart(mcf mcf) {
                    mcq.m86887c("HuaweiMap", "onMarkerDrag callback start: ");
                    onMarkerDragListener.onMarkerDragStart(new Marker(mcf));
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnMyLocationButtonClickListener(final OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        mcq.m86886b("HuaweiMap", "setOnMyLocationButtonClickListener: ");
        try {
            this.f58449b.mo83928a(onMyLocationButtonClickListener == null ? null : new mbf.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass16 */

                @Override // com.huawei.hms.maps.mbf
                public boolean onMyLocationButtonClick() {
                    return onMyLocationButtonClickListener.onMyLocationButtonClick();
                }
            });
        } catch (RemoteException unused) {
            mcq.m86889e("HuaweiMap", "RemoteException: ");
        }
    }

    public void setOnMyLocationClickListener(final OnMyLocationClickListener onMyLocationClickListener) {
        try {
            this.f58449b.mo83929a(onMyLocationClickListener == null ? null : new mbg.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass19 */

                @Override // com.huawei.hms.maps.mbg
                public void onMyLocationClick(Location location) {
                    onMyLocationClickListener.onMyLocationClick(location);
                }
            });
        } catch (RemoteException unused) {
            mcq.m86889e("HuaweiMap", "setOnMyLocationClickListener RemoteException");
        }
    }

    public void setOnPoiClickListener(final OnPoiClickListener onPoiClickListener) {
        try {
            this.f58449b.mo83930a(onPoiClickListener == null ? null : new mbh.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass20 */

                @Override // com.huawei.hms.maps.mbh
                public void onPoiClick(PointOfInterest pointOfInterest) {
                    onPoiClickListener.onPoiClick(pointOfInterest);
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setOnPoiClickListener".concat(String.valueOf(e)));
        }
    }

    public void setOnPolygonClickListener(final OnPolygonClickListener onPolygonClickListener) {
        mcq.m86886b("HuaweiMap", "setOnPolygonClickListener: ");
        try {
            this.f58449b.mo83931a(onPolygonClickListener == null ? null : new mbi.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass13 */

                @Override // com.huawei.hms.maps.mbi
                public void onPolygonClick(mcg mcg) {
                    mcq.m86887c("HuaweiMap", "onPolygonClick entrance: ");
                    Polygon polygon = new Polygon(mcg);
                    OnPolygonClickListener onPolygonClickListener = onPolygonClickListener;
                    if (onPolygonClickListener != null) {
                        onPolygonClickListener.onPolygonClick(polygon);
                    }
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setOnPolylineClickListener(final OnPolylineClickListener onPolylineClickListener) {
        mcq.m86886b("HuaweiMap", "setOnCircleClickListener: ");
        try {
            this.f58449b.mo83932a(onPolylineClickListener == null ? null : new mbj.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass12 */

                @Override // com.huawei.hms.maps.mbj
                public void onPolylineClick(mch mch) {
                    mcq.m86887c("HuaweiMap", "onPolylineClick first: ");
                    Polyline polyline = new Polyline(mch);
                    OnPolylineClickListener onPolylineClickListener = onPolylineClickListener;
                    if (onPolylineClickListener != null) {
                        onPolylineClickListener.onPolylineClick(polyline);
                    }
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "RemoteException: " + e.toString());
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.f58449b.mo83910a(i, i2, i3, i4);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setPadding RemoteException: " + e.toString());
        }
    }

    public void setPointToCenter(int i, int i2) {
        try {
            this.f58449b.mo83909a(i, i2);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setPointToCenter RemoteException: " + e.toString());
        }
    }

    public void setTrafficEnabled(boolean z) {
        try {
            this.f58449b.mo83950d(z);
        } catch (RemoteException e) {
            mcq.m86886b("HuaweiMap", "setTrafficEnabled RemoteException: " + e.toString());
        }
    }

    public void setWatermarkEnabled(boolean z) {
        try {
            this.f58449b.mo83952e(z);
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "setWatermarkEnabled RemoteException: " + e.toString());
        }
    }

    public void snapshot(final SnapshotReadyCallback snapshotReadyCallback) {
        try {
            this.f58449b.mo83933a(new mbp.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass18 */

                @Override // com.huawei.hms.maps.mbp
                public void onSnapshotReady(Bitmap bitmap) {
                    SnapshotReadyCallback snapshotReadyCallback = snapshotReadyCallback;
                    if (snapshotReadyCallback != null) {
                        snapshotReadyCallback.onSnapshotReady(bitmap);
                    }
                }

                @Override // com.huawei.hms.maps.mbp
                public void onSnapshotReadyWrapper(IObjectWrapper iObjectWrapper) {
                }
            });
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "snapshot".concat(String.valueOf(e)));
        }
    }

    public void snapshot(final SnapshotReadyCallback snapshotReadyCallback, Bitmap bitmap) {
        try {
            this.f58449b.mo83934a(new mbp.maa() {
                /* class com.huawei.hms.maps.HuaweiMap.AnonymousClass17 */

                @Override // com.huawei.hms.maps.mbp
                public void onSnapshotReady(Bitmap bitmap) {
                    SnapshotReadyCallback snapshotReadyCallback = snapshotReadyCallback;
                    if (snapshotReadyCallback != null) {
                        snapshotReadyCallback.onSnapshotReady(bitmap);
                    }
                }

                @Override // com.huawei.hms.maps.mbp
                public void onSnapshotReadyWrapper(IObjectWrapper iObjectWrapper) {
                }
            }, ObjectWrapper.wrap(bitmap));
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "snapshot".concat(String.valueOf(e)));
        }
    }

    public void stopAnimation() {
        try {
            this.f58449b.mo83964o();
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "stopAnimation".concat(String.valueOf(e)));
        }
    }

    public boolean useViewLifecycleWhenInFragment() {
        try {
            return this.f58449b.mo83959j();
        } catch (RemoteException e) {
            mcq.m86889e("HuaweiMap", "useViewLifecycleWhenInFragment RemoteException: " + e.toString());
            return true;
        }
    }
}
