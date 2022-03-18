package com.serenegiant.usb;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class DeviceFilter {
    public final boolean isExclude;
    public final int mClass;
    public final String mManufacturerName;
    public final int mProductId;
    public final String mProductName;
    public final int mProtocol;
    public final String mSerialNumber;
    public final int mSubclass;
    public final int mVendorId;

    public int hashCode() {
        return ((this.mVendorId << 16) | this.mProductId) ^ (((this.mClass << 16) | (this.mSubclass << 8)) | this.mProtocol);
    }

    public String toString() {
        return "DeviceFilter[mVendorId=" + this.mVendorId + ",mProductId=" + this.mProductId + ",mClass=" + this.mClass + ",mSubclass=" + this.mSubclass + ",mProtocol=" + this.mProtocol + ",mManufacturerName=" + this.mManufacturerName + ",mProductName=" + this.mProductName + ",mSerialNumber=" + this.mSerialNumber + ",isExclude=" + this.isExclude + "]";
    }

    public DeviceFilter(UsbDevice usbDevice) {
        this(usbDevice, false);
    }

    public boolean isExclude(UsbDevice usbDevice) {
        if (!this.isExclude || !matches(usbDevice)) {
            return false;
        }
        return true;
    }

    public boolean matches(UsbDevice usbDevice) {
        if (!(this.mVendorId == -1 || usbDevice.getVendorId() == this.mVendorId)) {
            return false;
        }
        if (!(this.mProductId == -1 || usbDevice.getProductId() == this.mProductId)) {
            return false;
        }
        if (matches(usbDevice.getDeviceClass(), usbDevice.getDeviceSubclass(), usbDevice.getDeviceProtocol())) {
            return true;
        }
        int interfaceCount = usbDevice.getInterfaceCount();
        for (int i = 0; i < interfaceCount; i++) {
            UsbInterface usbInterface = usbDevice.getInterface(i);
            if (matches(usbInterface.getInterfaceClass(), usbInterface.getInterfaceSubclass(), usbInterface.getInterfaceProtocol())) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i5 = this.mVendorId;
        if (!(i5 == -1 || (i = this.mProductId) == -1 || (i2 = this.mClass) == -1 || (i3 = this.mSubclass) == -1 || (i4 = this.mProtocol) == -1)) {
            if (obj instanceof DeviceFilter) {
                DeviceFilter deviceFilter = (DeviceFilter) obj;
                if (deviceFilter.mVendorId != i5 || deviceFilter.mProductId != i || deviceFilter.mClass != i2 || deviceFilter.mSubclass != i3 || deviceFilter.mProtocol != i4) {
                    return false;
                }
                String str8 = deviceFilter.mManufacturerName;
                if ((str8 != null && this.mManufacturerName == null) || ((str8 == null && this.mManufacturerName != null) || (((str = deviceFilter.mProductName) != null && this.mProductName == null) || ((str == null && this.mProductName != null) || (((str2 = deviceFilter.mSerialNumber) != null && this.mSerialNumber == null) || (str2 == null && this.mSerialNumber != null)))))) {
                    return false;
                }
                if ((str8 == null || (str7 = this.mManufacturerName) == null || str7.equals(str8)) && (((str3 = deviceFilter.mProductName) == null || (str6 = this.mProductName) == null || str6.equals(str3)) && (((str4 = deviceFilter.mSerialNumber) == null || (str5 = this.mSerialNumber) == null || str5.equals(str4)) && deviceFilter.isExclude != this.isExclude))) {
                    return true;
                }
                return false;
            } else if (obj instanceof UsbDevice) {
                UsbDevice usbDevice = (UsbDevice) obj;
                if (!this.isExclude && usbDevice.getVendorId() == this.mVendorId && usbDevice.getProductId() == this.mProductId && usbDevice.getDeviceClass() == this.mClass && usbDevice.getDeviceSubclass() == this.mSubclass && usbDevice.getDeviceProtocol() == this.mProtocol) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public boolean matches(DeviceFilter deviceFilter) {
        String str;
        String str2;
        if (this.isExclude != deviceFilter.isExclude) {
            return false;
        }
        int i = this.mVendorId;
        if (i != -1 && deviceFilter.mVendorId != i) {
            return false;
        }
        int i2 = this.mProductId;
        if (i2 != -1 && deviceFilter.mProductId != i2) {
            return false;
        }
        String str3 = deviceFilter.mManufacturerName;
        if (str3 != null && this.mManufacturerName == null) {
            return false;
        }
        if (deviceFilter.mProductName != null && this.mProductName == null) {
            return false;
        }
        if (deviceFilter.mSerialNumber != null && this.mSerialNumber == null) {
            return false;
        }
        String str4 = this.mManufacturerName;
        if (str4 != null && str3 != null && !str4.equals(str3)) {
            return false;
        }
        String str5 = this.mProductName;
        if (str5 != null && (str2 = deviceFilter.mProductName) != null && !str5.equals(str2)) {
            return false;
        }
        String str6 = this.mSerialNumber;
        if (str6 == null || (str = deviceFilter.mSerialNumber) == null || str6.equals(str)) {
            return matches(deviceFilter.mClass, deviceFilter.mSubclass, deviceFilter.mProtocol);
        }
        return false;
    }

    public static List<DeviceFilter> getDeviceFilters(Context context, int i) {
        DeviceFilter readEntryOne;
        XmlResourceParser xml = context.getResources().getXml(i);
        ArrayList arrayList = new ArrayList();
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2 && (readEntryOne = readEntryOne(context, xml)) != null) {
                    arrayList.add(readEntryOne);
                }
            }
        } catch (XmlPullParserException e) {
            Log.d("DeviceFilter", "XmlPullParserException", e);
        } catch (IOException e2) {
            Log.d("DeviceFilter", "IOException", e2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public DeviceFilter(UsbDevice usbDevice, boolean z) {
        this.mVendorId = usbDevice.getVendorId();
        this.mProductId = usbDevice.getProductId();
        this.mClass = usbDevice.getDeviceClass();
        this.mSubclass = usbDevice.getDeviceSubclass();
        this.mProtocol = usbDevice.getDeviceProtocol();
        this.mManufacturerName = null;
        this.mProductName = null;
        this.mSerialNumber = null;
        this.isExclude = z;
    }

    public static int INVOKEVIRTUAL_com_serenegiant_usb_DeviceFilter_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    public static DeviceFilter readEntryOne(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        boolean z2 = false;
        while (eventType != 1) {
            String name = xmlPullParser.getName();
            if (!TextUtils.isEmpty(name) && name.equalsIgnoreCase("usb-device")) {
                if (eventType == 2) {
                    int attributeInteger = getAttributeInteger(context, xmlPullParser, null, "vendor-id", -1);
                    if (attributeInteger == -1 && (attributeInteger = getAttributeInteger(context, xmlPullParser, null, "vendorId", -1)) == -1) {
                        attributeInteger = getAttributeInteger(context, xmlPullParser, null, "venderId", -1);
                    }
                    i = attributeInteger;
                    int attributeInteger2 = getAttributeInteger(context, xmlPullParser, null, "product-id", -1);
                    if (attributeInteger2 == -1) {
                        attributeInteger2 = getAttributeInteger(context, xmlPullParser, null, "productId", -1);
                    }
                    i2 = attributeInteger2;
                    i3 = getAttributeInteger(context, xmlPullParser, null, "class", -1);
                    i4 = getAttributeInteger(context, xmlPullParser, null, "subclass", -1);
                    i5 = getAttributeInteger(context, xmlPullParser, null, "protocol", -1);
                    String attributeString = getAttributeString(context, xmlPullParser, null, "manufacturer-name", null);
                    if (TextUtils.isEmpty(attributeString)) {
                        attributeString = getAttributeString(context, xmlPullParser, null, "manufacture", null);
                    }
                    str = attributeString;
                    String attributeString2 = getAttributeString(context, xmlPullParser, null, "product-name", null);
                    if (TextUtils.isEmpty(attributeString2)) {
                        attributeString2 = getAttributeString(context, xmlPullParser, null, "product", null);
                    }
                    str2 = attributeString2;
                    String attributeString3 = getAttributeString(context, xmlPullParser, null, "serial-number", null);
                    if (TextUtils.isEmpty(attributeString3)) {
                        attributeString3 = getAttributeString(context, xmlPullParser, null, "serial", null);
                    }
                    str3 = attributeString3;
                    z2 = getAttributeBoolean(context, xmlPullParser, null, "exclude", false);
                    z = true;
                } else if (eventType == 3 && z) {
                    return new DeviceFilter(i, i2, i3, i4, i5, str, str2, str3, z2);
                }
            }
            eventType = xmlPullParser.next();
        }
        return null;
    }

    private boolean matches(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.mClass;
        if ((i6 == -1 || i == i6) && (((i4 = this.mSubclass) == -1 || i2 == i4) && ((i5 = this.mProtocol) == -1 || i3 == i5))) {
            return true;
        }
        return false;
    }

    private static final String getAttributeString(Context context, XmlPullParser xmlPullParser, String str, String str2, String str3) {
        int identifier;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(str, str2);
            if (attributeValue == null) {
                attributeValue = str3;
            }
            if (TextUtils.isEmpty(attributeValue) || !attributeValue.startsWith("@") || (identifier = context.getResources().getIdentifier(attributeValue.substring(1), null, context.getPackageName())) <= 0) {
                return attributeValue;
            }
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException | NullPointerException | NumberFormatException unused) {
            return str3;
        }
    }

    private static final boolean getAttributeBoolean(Context context, XmlPullParser xmlPullParser, String str, String str2, boolean z) {
        try {
            String attributeValue = xmlPullParser.getAttributeValue(str, str2);
            boolean z2 = false;
            if ("TRUE".equalsIgnoreCase(attributeValue)) {
                return true;
            }
            if ("FALSE".equalsIgnoreCase(attributeValue)) {
                return false;
            }
            if (TextUtils.isEmpty(attributeValue) || !attributeValue.startsWith("@")) {
                int i = 10;
                if (attributeValue != null && attributeValue.length() > 2 && attributeValue.charAt(0) == '0' && (attributeValue.charAt(1) == 'x' || attributeValue.charAt(1) == 'X')) {
                    i = 16;
                    attributeValue = attributeValue.substring(2);
                }
                if (Integer.parseInt(attributeValue, i) != 0) {
                    z2 = true;
                }
                return z2;
            }
            int identifier = context.getResources().getIdentifier(attributeValue.substring(1), null, context.getPackageName());
            if (identifier > 0) {
                return context.getResources().getBoolean(identifier);
            }
            return z;
        } catch (Resources.NotFoundException | NullPointerException | NumberFormatException unused) {
            return z;
        }
    }

    private static final int getAttributeInteger(Context context, XmlPullParser xmlPullParser, String str, String str2, int i) {
        try {
            String attributeValue = xmlPullParser.getAttributeValue(str, str2);
            if (TextUtils.isEmpty(attributeValue) || !attributeValue.startsWith("@")) {
                int i2 = 10;
                if (attributeValue != null && attributeValue.length() > 2 && attributeValue.charAt(0) == '0' && (attributeValue.charAt(1) == 'x' || attributeValue.charAt(1) == 'X')) {
                    i2 = 16;
                    attributeValue = attributeValue.substring(2);
                }
                return Integer.parseInt(attributeValue, i2);
            }
            int identifier = context.getResources().getIdentifier(attributeValue.substring(1), null, context.getPackageName());
            if (identifier > 0) {
                return INVOKEVIRTUAL_com_serenegiant_usb_DeviceFilter_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(context.getResources(), identifier);
            }
            return i;
        } catch (Resources.NotFoundException | NullPointerException | NumberFormatException unused) {
            return i;
        }
    }

    public DeviceFilter(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3) {
        this(i, i2, i3, i4, i5, str, str2, str3, false);
    }

    public DeviceFilter(int i, int i2, int i3, int i4, int i5, String str, String str2, String str3, boolean z) {
        this.mVendorId = i;
        this.mProductId = i2;
        this.mClass = i3;
        this.mSubclass = i4;
        this.mProtocol = i5;
        this.mManufacturerName = str;
        this.mProductName = str2;
        this.mSerialNumber = str3;
        this.isExclude = z;
    }
}
