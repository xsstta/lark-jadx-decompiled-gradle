package com.huawei.hms.location;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.location.common.LocationBaseResponse;
import java.util.HashMap;
import java.util.Map;

public class HWLocation extends LocationBaseResponse implements Parcelable {
    public static final Parcelable.Creator<HWLocation> CREATOR = new C23635a();
    private Map<String, Object> extraInfo;
    private double mAltitude = 0.0d;
    private float mBearing = BitmapDescriptorFactory.HUE_RED;
    private float mBearingAccuracyDegrees = BitmapDescriptorFactory.HUE_RED;
    private String mCity;
    private String mCountryCode;
    private String mCountryName;
    private String mCounty;
    private long mElapsedRealtimeNanos = 0;
    private String mFeatureName;
    private float mHorizontalAccuracyMeters = BitmapDescriptorFactory.HUE_RED;
    private double mLatitude = 0.0d;
    private double mLongitude = 0.0d;
    private String mPhone;
    private String mPostalCode;
    private String mProvider;
    private float mSpeed = BitmapDescriptorFactory.HUE_RED;
    private float mSpeedAccuracyMetersPerSecond = BitmapDescriptorFactory.HUE_RED;
    private String mState;
    private String mStreet;
    private long mTime = 0;
    private String mUrl;
    private float mVerticalAccuracyMeters = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: com.huawei.hms.location.HWLocation$a */
    static class C23635a implements Parcelable.Creator<HWLocation> {
        C23635a() {
        }

        @Override // android.os.Parcelable.Creator
        public HWLocation createFromParcel(Parcel parcel) {
            return new HWLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public HWLocation[] newArray(int i) {
            return new HWLocation[i];
        }
    }

    public HWLocation() {
    }

    protected HWLocation(Parcel parcel) {
        this.mProvider = parcel.readString();
        this.mTime = parcel.readLong();
        if (Build.VERSION.SDK_INT >= 17) {
            this.mElapsedRealtimeNanos = parcel.readLong();
        }
        parcel.readByte();
        this.mLatitude = parcel.readDouble();
        this.mLongitude = parcel.readDouble();
        this.mAltitude = parcel.readDouble();
        this.mSpeed = parcel.readFloat();
        this.mBearing = parcel.readFloat();
        this.mHorizontalAccuracyMeters = parcel.readFloat();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mVerticalAccuracyMeters = parcel.readFloat();
            this.mSpeedAccuracyMetersPerSecond = parcel.readFloat();
            this.mBearingAccuracyDegrees = parcel.readFloat();
        }
        this.extraInfo = new HashMap();
        Bundle readBundle = parcel.readBundle(HWLocation.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                Object obj = readBundle.get(str);
                if (obj != null) {
                    this.extraInfo.put(str, obj);
                }
            }
        }
        this.mCountryCode = parcel.readString();
        this.mCountryName = parcel.readString();
        this.mState = parcel.readString();
        this.mCity = parcel.readString();
        this.mCounty = parcel.readString();
        this.mStreet = parcel.readString();
        this.mFeatureName = parcel.readString();
        this.mPostalCode = parcel.readString();
        this.mPhone = parcel.readString();
        this.mUrl = parcel.readString();
        parcel.readMap(this.extraInfo, HWLocation.class.getClassLoader());
    }

    public static Parcelable.Creator<HWLocation> getCREATOR() {
        return CREATOR;
    }

    public int describeContents() {
        return 0;
    }

    public float getAccuracy() {
        return this.mHorizontalAccuracyMeters;
    }

    public double getAltitude() {
        return this.mAltitude;
    }

    public float getBearing() {
        return this.mBearing;
    }

    public float getBearingAccuracyDegrees() {
        return this.mBearingAccuracyDegrees;
    }

    public String getCity() {
        return this.mCity;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public String getCountryName() {
        return this.mCountryName;
    }

    public String getCounty() {
        return this.mCounty;
    }

    public long getElapsedRealtimeNanos() {
        return this.mElapsedRealtimeNanos;
    }

    public Map<String, Object> getExtraInfo() {
        return this.extraInfo;
    }

    public String getFeatureName() {
        return this.mFeatureName;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public String getPhone() {
        return this.mPhone;
    }

    public String getPostalCode() {
        return this.mPostalCode;
    }

    public String getProvider() {
        return this.mProvider;
    }

    public float getSpeed() {
        return this.mSpeed;
    }

    public float getSpeedAccuracyMetersPerSecond() {
        return this.mSpeedAccuracyMetersPerSecond;
    }

    public String getState() {
        return this.mState;
    }

    public String getStreet() {
        return this.mStreet;
    }

    public long getTime() {
        return this.mTime;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public float getVerticalAccuracyMeters() {
        return this.mVerticalAccuracyMeters;
    }

    public void setAccuracy(float f) {
        this.mHorizontalAccuracyMeters = f;
    }

    public void setAltitude(double d) {
        this.mAltitude = d;
    }

    public void setBearing(float f) {
        this.mBearing = f;
    }

    public void setBearingAccuracyDegrees(float f) {
        this.mBearingAccuracyDegrees = f;
    }

    public void setCity(String str) {
        this.mCity = str;
    }

    public void setCountryCode(String str) {
        this.mCountryCode = str;
    }

    public void setCountryName(String str) {
        this.mCountryName = str;
    }

    public void setCounty(String str) {
        this.mCounty = str;
    }

    public void setElapsedRealtimeNanos(long j) {
        this.mElapsedRealtimeNanos = j;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.extraInfo = map;
    }

    public void setFeatureName(String str) {
        this.mFeatureName = str;
    }

    public void setLatitude(double d) {
        this.mLatitude = d;
    }

    public void setLongitude(double d) {
        this.mLongitude = d;
    }

    public void setPhone(String str) {
        this.mPhone = str;
    }

    public void setPostalCode(String str) {
        this.mPostalCode = str;
    }

    public void setProvider(String str) {
        this.mProvider = str;
    }

    public void setSpeed(float f) {
        this.mSpeed = f;
    }

    public void setSpeedAccuracyMetersPerSecond(float f) {
        this.mSpeedAccuracyMetersPerSecond = f;
    }

    public void setState(String str) {
        this.mState = str;
    }

    public void setStreet(String str) {
        this.mStreet = str;
    }

    public void setTime(long j) {
        this.mTime = j;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public void setVerticalAccuracyMeters(float f) {
        this.mVerticalAccuracyMeters = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitude);
        parcel.writeDouble(this.mLongitude);
        parcel.writeDouble(this.mAltitude);
        parcel.writeFloat(this.mSpeed);
        parcel.writeFloat(this.mBearing);
        parcel.writeFloat(this.mHorizontalAccuracyMeters);
        parcel.writeFloat(this.mVerticalAccuracyMeters);
        parcel.writeFloat(this.mSpeedAccuracyMetersPerSecond);
        parcel.writeFloat(this.mBearingAccuracyDegrees);
        parcel.writeString(this.mProvider);
        parcel.writeLong(this.mTime);
        parcel.writeLong(this.mElapsedRealtimeNanos);
        parcel.writeString(this.mCountryCode);
        parcel.writeString(this.mCountryName);
        parcel.writeString(this.mState);
        parcel.writeString(this.mCity);
        parcel.writeString(this.mCounty);
        parcel.writeString(this.mStreet);
        parcel.writeString(this.mFeatureName);
        parcel.writeString(this.mPostalCode);
        parcel.writeString(this.mPhone);
        parcel.writeString(this.mUrl);
        parcel.writeMap(this.extraInfo);
    }
}
