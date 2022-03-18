package com.huawei.hms.maps;

import android.graphics.Point;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.CameraUpdateParam;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;

public final class CameraUpdateFactory {
    private CameraUpdateFactory() {
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        mcq.m86886b("CameraUpdateFactory", "newCameraPosition: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setCameraPosition(cameraPosition);
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        mcq.m86886b("CameraUpdateFactory", "newLatLng: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setLatLng(latLng);
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        mcq.m86886b("CameraUpdateFactory", "newLatLngBounds: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setNewLatLngBounds(new CameraUpdateParam.NewLatLngBounds(latLngBounds, i));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        mcq.m86886b("CameraUpdateFactory", "newLatLngBoundsWithSize: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setNewLatLngBoundsWidthHeight(new CameraUpdateParam.NewLatLngBoundsWidthHeight(latLngBounds, i, i2, i3));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        mcq.m86886b("CameraUpdateFactory", "newLatLngZoom: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setNewLatLngZoom(new CameraUpdateParam.NewLatLngZoom(latLng, f));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        mcq.m86886b("CameraUpdateFactory", "scrollBy: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setScrollBy(new CameraUpdateParam.ScrollBy(f, f2));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate zoomBy(float f) {
        mcq.m86886b("CameraUpdateFactory", "zoomBy: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setZoomBy(new CameraUpdateParam.ZoomBy(f));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        mcq.m86886b("CameraUpdateFactory", "zoomBy: ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setZoomByWithFocus(new CameraUpdateParam.ZoomByWithFocus(f, point));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate zoomIn() {
        mcq.m86886b("CameraUpdateFactory", "zoomIn ");
        return zoomBy(1.0f);
    }

    public static CameraUpdate zoomOut() {
        return zoomBy(-1.0f);
    }

    public static CameraUpdate zoomTo(float f) {
        mcq.m86886b("CameraUpdateFactory", "zoomTo ");
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setZoomTo(new CameraUpdateParam.ZoomTo(f));
        return new CameraUpdate(cameraUpdateParam);
    }
}
