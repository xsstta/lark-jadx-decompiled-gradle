package com.smt.usbcam;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class USBCamManager {
    private static USBCamApi sUSBCamApi;

    private USBCamManager() {
    }

    public static USBCamApi getApiSingleton() {
        if (sUSBCamApi == null) {
            sUSBCamApi = createUSBCamApi();
        }
        return sUSBCamApi;
    }

    private static USBCamApi createUSBCamApi() {
        try {
            Constructor<?> declaredConstructor = Class.forName("com.serenegiant.usb.USBCamApiImp").getDeclaredConstructor(new Class[0]);
            if (declaredConstructor != null) {
                boolean isAccessible = declaredConstructor.isAccessible();
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                declaredConstructor.setAccessible(isAccessible);
                if (newInstance instanceof USBCamApi) {
                    return (USBCamApi) newInstance;
                }
                throw new RuntimeException("mast imp USBCamApi");
            }
            throw new RuntimeException("can not create USBCamApiImp");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return null;
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return null;
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
