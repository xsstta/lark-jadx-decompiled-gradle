package com.ss.android.vc.entity.background;

import com.google.gson.Gson;
import java.io.Serializable;

public class ViewDeviceSetting implements Serializable {
    public Video video;

    public static class Video implements Serializable {
        public String advancedBeauty;
        public boolean backgroundBlur;
        public String cameraDeviceId;
        public boolean defaultCameraMuted;
        public boolean dynamicLayout;
        public boolean faceBeauty;
        public int faceBeautyLevel;
        public boolean mirror = true;
        public boolean smoothShare;
        public boolean videoEnhance;
        public String virtualBackground;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
