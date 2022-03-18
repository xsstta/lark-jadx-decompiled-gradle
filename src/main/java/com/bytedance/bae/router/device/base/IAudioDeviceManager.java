package com.bytedance.bae.router.device.base;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface IAudioDeviceManager {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActiveState {
    }

    public interface HotplugDeviceListener extends NotHotPlugableDeviceListener {
        void onDeviceOffline();

        void onDeviceOnline();
    }

    public interface IHotplugDevice extends HotplugDeviceListener {
        int getOnlineState();
    }

    public interface INotHotPlugableDevice extends NotHotPlugableDeviceListener {
        void activeDevice();

        int getActiveState();

        void inactiveDevice();

        boolean isActive();
    }

    public interface NotHotPlugableDeviceListener {
    }

    public interface OnHotPlugDeviceCallback extends HotplugDeviceListener, OnNotHotPlugableDeviceCallback {
    }

    public interface OnNotHotPlugableDeviceCallback extends NotHotPlugableDeviceListener {
        void onError(int i, String str);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OnlineState {
    }
}
