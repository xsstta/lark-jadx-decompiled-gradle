package com.huawei.hms.locationSdk;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.client.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class w0 {
    /* renamed from: a */
    public static Location m86118a(HWLocation hWLocation) {
        if (hWLocation == null) {
            return null;
        }
        Location location = new Location(hWLocation.getProvider());
        location.setTime(hWLocation.getTime());
        if (Build.VERSION.SDK_INT >= 17) {
            location.setElapsedRealtimeNanos(hWLocation.getElapsedRealtimeNanos());
        }
        location.setLatitude(hWLocation.getLatitude());
        location.setLongitude(hWLocation.getLongitude());
        location.setAltitude(hWLocation.getAltitude());
        location.setSpeed(hWLocation.getSpeed());
        location.setBearing(hWLocation.getBearing());
        location.setAccuracy(hWLocation.getAccuracy());
        if (Build.VERSION.SDK_INT >= 26) {
            location.setVerticalAccuracyMeters(hWLocation.getVerticalAccuracyMeters());
            location.setSpeedAccuracyMetersPerSecond(hWLocation.getSpeedAccuracyMetersPerSecond());
            location.setBearingAccuracyDegrees(hWLocation.getBearingAccuracyDegrees());
        }
        if (hWLocation.getExtraInfo() != null) {
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject(hWLocation.getExtraInfo());
            for (Map.Entry<String, Object> entry : hWLocation.getExtraInfo().entrySet()) {
                try {
                    String key = entry.getKey();
                    if (!entry.getKey().startsWith("hw-address-")) {
                        Object obj = jSONObject.get(key);
                        if (obj instanceof Boolean) {
                            bundle.putBoolean(key, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            bundle.putInt(key, ((Integer) obj).intValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(key, ((Float) obj).floatValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(key, ((Long) obj).longValue());
                        } else if (obj instanceof Short) {
                            bundle.putShort(key, ((Short) obj).shortValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(key, ((Double) obj).doubleValue());
                        } else {
                            bundle.putString(key, jSONObject.getString(key));
                        }
                    }
                } catch (JSONException unused) {
                    u0.m86105b("LocationJsonUtil", "", "json exception by key:" + entry.getKey());
                }
            }
            location.setExtras(bundle);
        }
        return location;
    }

    /* renamed from: a */
    public static HWLocation m86119a(JSONObject jSONObject) throws JSONException, ApiException {
        JSONObject jSONObject2;
        Log.d("LocationJsonUtil", "parseLocationFromJsonObject: enter");
        if (jSONObject == null || !jSONObject.has("location") || (jSONObject2 = jSONObject.getJSONObject("location")) == null) {
            return null;
        }
        if (jSONObject2.has("mProvider")) {
            String string = jSONObject2.getString("mProvider");
            HWLocation hWLocation = new HWLocation();
            hWLocation.setProvider(string);
            hWLocation.setAltitude(jSONObject2.optDouble("mAltitude", 0.0d));
            hWLocation.setBearing((float) jSONObject2.optDouble("mBearing", 0.0d));
            if (Build.VERSION.SDK_INT >= 26) {
                hWLocation.setBearingAccuracyDegrees((float) jSONObject2.optDouble("mBearingAccuracyDegrees", 0.0d));
            }
            hWLocation.setElapsedRealtimeNanos(jSONObject2.optLong("mElapsedRealtimeNanos", 0));
            hWLocation.setAccuracy((float) jSONObject2.optDouble("mHorizontalAccuracyMeters", 0.0d));
            hWLocation.setLatitude(jSONObject2.optDouble("mLatitude", 0.0d));
            hWLocation.setLongitude(jSONObject2.optDouble("mLongitude", 0.0d));
            hWLocation.setSpeed((float) jSONObject2.optDouble("mSpeed", 0.0d));
            if (Build.VERSION.SDK_INT >= 26) {
                hWLocation.setSpeedAccuracyMetersPerSecond((float) jSONObject2.optDouble("mSpeedAccuracyMetersPerSecond", 0.0d));
            }
            hWLocation.setTime(jSONObject2.optLong("mTime", 0));
            if (Build.VERSION.SDK_INT >= 26) {
                hWLocation.setVerticalAccuracyMeters((float) jSONObject2.optDouble("mVerticalAccuracyMeters", 0.0d));
            }
            m86122a(jSONObject, hWLocation);
            return hWLocation;
        }
        throw new ApiException(new Status(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, y0.getStatusCodeString(HwBuildEx.VersionCodes.CUR_DEVELOPMENT)));
    }

    /* renamed from: a */
    public static LocationAvailability m86120a(String str) throws JSONException {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject(str);
        if (!jSONObject2.has("locationAvailability") || (jSONObject = jSONObject2.getJSONObject("locationAvailability")) == null) {
            return null;
        }
        LocationAvailability locationAvailability = new LocationAvailability();
        locationAvailability.setCellStatus(jSONObject.optInt("cellStatus"));
        locationAvailability.setWifiStatus(jSONObject.optInt("wifiStatus"));
        locationAvailability.setElapsedRealtimeNs(jSONObject.optLong("elapsedRealtimeNs"));
        locationAvailability.setLocationStatus(jSONObject.optInt("locationStatus"));
        return locationAvailability;
    }

    /* renamed from: a */
    public static JSONObject m86121a(Location location) throws JSONException {
        Log.d("LocationJsonUtil", "createLocationJsonObject: enter");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mProvider", location.getProvider());
        jSONObject.put("mAltitude", location.getAltitude());
        jSONObject.put("mBearing", (double) location.getBearing());
        if (Build.VERSION.SDK_INT >= 17) {
            jSONObject.put("mElapsedRealtimeNanos", location.getElapsedRealtimeNanos());
        }
        jSONObject.put("mHorizontalAccuracyMeters", (double) location.getAccuracy());
        jSONObject.put("mLatitude", location.getLatitude());
        jSONObject.put("mLongitude", location.getLongitude());
        jSONObject.put("mSpeed", (double) location.getSpeed());
        if (Build.VERSION.SDK_INT >= 26) {
            jSONObject.put("mSpeedAccuracyMetersPerSecond", (double) location.getSpeedAccuracyMetersPerSecond());
            jSONObject.put("mVerticalAccuracyMeters", (double) location.getVerticalAccuracyMeters());
            jSONObject.put("mBearingAccuracyDegrees", (double) location.getBearingAccuracyDegrees());
        }
        jSONObject.put("mTime", location.getTime());
        Log.d("LocationJsonUtil", "createLocationJsonObject: exit");
        return jSONObject;
    }

    /* renamed from: a */
    private static void m86122a(JSONObject jSONObject, HWLocation hWLocation) throws JSONException {
        JSONObject jSONObject2;
        if (jSONObject.has("address") && (jSONObject2 = jSONObject.getJSONObject("address")) != null) {
            hWLocation.setCountryCode(jSONObject2.optString("mCountryCode", ""));
            hWLocation.setCountryName(jSONObject2.optString("mCountryName", ""));
            hWLocation.setState(jSONObject2.optString("mState", ""));
            hWLocation.setCity(jSONObject2.optString("mCity", ""));
            hWLocation.setCounty(jSONObject2.optString("mCounty", ""));
            hWLocation.setStreet(jSONObject2.optString("mStreet", ""));
            hWLocation.setFeatureName(jSONObject2.optString("mFeatureName", ""));
            hWLocation.setPostalCode(jSONObject2.optString("mPostalCode", ""));
            hWLocation.setPhone(jSONObject2.optString("mPhone", ""));
            hWLocation.setUrl(jSONObject2.optString("mUrl", ""));
            if (jSONObject2.has("mExtraInfo")) {
                Object opt = jSONObject2.opt("mExtraInfo");
                JSONObject jSONObject3 = null;
                if (opt instanceof JSONObject) {
                    jSONObject3 = (JSONObject) opt;
                }
                if (jSONObject3 == null) {
                    u0.m86106c("LocationJsonUtil", "", "address extraInfo is null, return");
                    return;
                }
                Iterator<String> keys = jSONObject3.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject3.get(next));
                }
                hWLocation.setExtraInfo(hashMap);
            }
        }
    }

    /* renamed from: b */
    public static LocationResult m86123b(JSONObject jSONObject) throws JSONException, ApiException {
        JSONObject jSONObject2;
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("locationResult")) == null) {
            return null;
        }
        List<HWLocation> c = m86124c(jSONObject2);
        if (t0.m86101a(c)) {
            return null;
        }
        return LocationResult.create(c);
    }

    /* renamed from: c */
    public static List<HWLocation> m86124c(JSONObject jSONObject) throws JSONException, ApiException {
        Log.d("LocationJsonUtil", "parseLocationsFromJsonObject: enter");
        JSONArray jSONArray = jSONObject.getJSONArray("locations");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HWLocation a = m86119a(jSONArray.getJSONObject(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        if (t0.m86101a(arrayList)) {
            return null;
        }
        Log.d("LocationJsonUtil", "parseLocationsFromJsonObject: exit");
        return arrayList;
    }
}
