package com.ss.android.lark.location.dto;

import android.text.TextUtils;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import org.json.JSONObject;

public class POIInfo implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    private transient boolean isCurrent;
    private boolean isInternal;
    private boolean isSelfDefine;
    private double latitude;
    private String locationAddress;
    private LocationImageData locationImageData;
    private String locationName;
    private double longitude;
    private int mZoomLevel;
    private String placeId;
    private String vendor;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Vendor {
    }

    public POIInfo() {
    }

    public boolean getIsCurrent() {
        return this.isCurrent;
    }

    public boolean getIsSelfDefine() {
        return this.isSelfDefine;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocationAddress() {
        return this.locationAddress;
    }

    public LocationImageData getLocationImageData() {
        return this.locationImageData;
    }

    public String getLocationName() {
        return this.locationName;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getPlaceId() {
        return this.placeId;
    }

    public String getVendor() {
        return this.vendor;
    }

    public int getZoomLevel() {
        return this.mZoomLevel;
    }

    public boolean isInternal() {
        return this.isInternal;
    }

    public boolean isPlaceIdEmpty() {
        return TextUtils.isEmpty(this.placeId);
    }

    public int hashCode() {
        return Objects.hash(this.locationName, this.locationAddress);
    }

    @Override // java.lang.Object
    public Object clone() {
        POIInfo pOIInfo;
        CloneNotSupportedException e;
        try {
            pOIInfo = (POIInfo) super.clone();
            try {
                LocationImageData locationImageData2 = this.locationImageData;
                if (locationImageData2 != null) {
                    pOIInfo.setLocationImageData((LocationImageData) locationImageData2.clone());
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                Log.m165384e("POIInfo", "failed to clone POIInfo.", e);
                return pOIInfo;
            }
        } catch (CloneNotSupportedException e3) {
            pOIInfo = null;
            e = e3;
            Log.m165384e("POIInfo", "failed to clone POIInfo.", e);
            return pOIInfo;
        }
        return pOIInfo;
    }

    public void setInternal(boolean z) {
        this.isInternal = z;
    }

    public void setIsCurrent(boolean z) {
        this.isCurrent = z;
    }

    public void setIsSelfDefine(boolean z) {
        this.isSelfDefine = z;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLocationAddress(String str) {
        this.locationAddress = str;
    }

    public void setLocationImageData(LocationImageData locationImageData2) {
        this.locationImageData = locationImageData2;
    }

    public void setLocationName(String str) {
        this.locationName = str;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setVendor(String str) {
        this.vendor = str;
    }

    public void setZoomLevel(int i) {
        this.mZoomLevel = i;
    }

    public static POIInfo parse(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new POIInfo(jSONObject);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof POIInfo)) {
            return super.equals(obj);
        }
        POIInfo pOIInfo = (POIInfo) obj;
        String str = pOIInfo.locationName;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = pOIInfo.locationAddress;
        if (str3 != null) {
            str2 = str3;
        }
        if (!str.equals(this.locationName) || !str2.equals(this.locationAddress)) {
            return false;
        }
        return true;
    }

    public POIInfo(JSONObject jSONObject) {
        this.locationName = jSONObject.optString("locationName");
        this.locationAddress = jSONObject.optString("locationAddress");
        this.latitude = jSONObject.optDouble("latitude", 360.0d);
        this.longitude = jSONObject.optDouble("longitude", 360.0d);
        this.isSelfDefine = jSONObject.optBoolean("isSelfDefine", false);
        this.placeId = jSONObject.optString("placeId");
        this.isCurrent = false;
    }

    public POIInfo(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public POIInfo(String str, String str2, double d, double d2) {
        this.locationName = str;
        this.locationAddress = str2;
        this.latitude = d;
        this.longitude = d2;
    }

    public POIInfo(String str, String str2, String str3, double d, double d2) {
        this(str2, str3, d, d2);
        this.placeId = str;
    }

    public POIInfo(String str, String str2, double d, double d2, boolean z, boolean z2) {
        this.locationName = str;
        this.locationAddress = str2;
        this.latitude = d;
        this.longitude = d2;
        this.isCurrent = z;
        this.isSelfDefine = z2;
    }

    public POIInfo(String str, String str2, String str3, double d, double d2, boolean z, boolean z2) {
        this(str2, str3, d, d2, z, z2);
        this.placeId = str;
    }
}
