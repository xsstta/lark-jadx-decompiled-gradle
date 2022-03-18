package com.ss.ttvideoengine;

import android.text.TextUtils;
import com.ss.ttvideoengine.model.VideoRef;

public enum Resolution {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", ""),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", ""),
    ExtremelyHigh_50F("1080p 50fps", ""),
    TwoK_50F("2k 50fps", ""),
    FourK_50F("4k 50fps", ""),
    ExtremelyHigh_60F("1080p 60fps", ""),
    TwoK_60F("2k 60fps", ""),
    FourK_60F("4k 60fps", ""),
    ExtremelyHigh_120F("1080p 120fps", ""),
    TwoK_120F("2k 120fps", ""),
    FourK_120F("4k 120fps", ""),
    L_Standard_HDR("240p HDR", ""),
    Standard_HDR("360p HDR", ""),
    High_HDR("480p HDR", ""),
    H_High_HDR("540p HDR", ""),
    SuperHigh_HDR("720p HDR", ""),
    ExtremelyHigh_HDR("1080p HDR", ""),
    TwoK_HDR("2k HDR", ""),
    FourK_HDR("4k HDR", "");
    
    private final String audioquality;
    private final String resolution;

    public String toString() {
        return this.resolution;
    }

    public int getIndex() {
        return ordinal();
    }

    public static Resolution[] getAllResolutions() {
        try {
            return new Resolution[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F, L_Standard_HDR, Standard_HDR, High_HDR, H_High_HDR, SuperHigh_HDR, ExtremelyHigh_HDR, TwoK_HDR, FourK_HDR};
        } catch (Exception unused) {
            return new Resolution[0];
        }
    }

    public static Resolution valueOf(int i) {
        Resolution resolution2 = Undefine;
        if (i < resolution2.ordinal() || i > FourK_HDR.ordinal()) {
            return resolution2;
        }
        return values()[i];
    }

    public String toString(int i) {
        if (i == VideoRef.TYPE_AUDIO) {
            return this.audioquality;
        }
        if (i == VideoRef.TYPE_VIDEO) {
            return this.resolution;
        }
        return "";
    }

    public static String toString(Resolution resolution2) {
        if (resolution2 == null || resolution2 == Undefine) {
            return "Undefine";
        }
        if (resolution2 == Standard) {
            return "Standard";
        }
        if (resolution2 == High) {
            return "High";
        }
        if (resolution2 == SuperHigh) {
            return "SuperHigh";
        }
        if (resolution2 == FourK) {
            return "FourK";
        }
        if (resolution2 == HDR) {
            return "HDR";
        }
        if (resolution2 == Auto) {
            return "Auto";
        }
        if (resolution2 == L_Standard) {
            return "L_Standard";
        }
        if (resolution2 == H_High) {
            return "H_High";
        }
        if (resolution2 == TwoK) {
            return "TwoK";
        }
        if (resolution2 == ExtremelyHigh_50F) {
            return "ExtremelyHigh_50F";
        }
        if (resolution2 == TwoK_50F) {
            return "TwoK_50F";
        }
        if (resolution2 == FourK_50F) {
            return "FourK_50F";
        }
        if (resolution2 == ExtremelyHigh_60F) {
            return "ExtremelyHigh_60F";
        }
        if (resolution2 == TwoK_60F) {
            return "TwoK_60F";
        }
        if (resolution2 == FourK_60F) {
            return "FourK_60F";
        }
        if (resolution2 == ExtremelyHigh_120F) {
            return "ExtremelyHigh_120F";
        }
        if (resolution2 == TwoK_120F) {
            return "TwoK_120F";
        }
        if (resolution2 == FourK_120F) {
            return "FourK_120F";
        }
        if (resolution2 == L_Standard_HDR) {
            return "L_Standard_HDR";
        }
        if (resolution2 == Standard_HDR) {
            return "Standard_HDR";
        }
        if (resolution2 == High_HDR) {
            return "High_HDR";
        }
        if (resolution2 == H_High_HDR) {
            return "H_High_HDR";
        }
        if (resolution2 == SuperHigh_HDR) {
            return "SuperHigh_HDR";
        }
        if (resolution2 == ExtremelyHigh_HDR) {
            return "ExtremelyHigh_HDR";
        }
        if (resolution2 == TwoK_HDR) {
            return "TwoK_HDR";
        }
        if (resolution2 == FourK_HDR) {
            return "FourK_HDR";
        }
        return "Undefine";
    }

    public static Resolution forString(String str) {
        if (TextUtils.isEmpty(str)) {
            return Undefine;
        }
        if (str.equals("Undefine")) {
            return Undefine;
        }
        if (str.equals("Standard")) {
            return Standard;
        }
        if (str.equals("High")) {
            return High;
        }
        if (str.equals("SuperHigh")) {
            return SuperHigh;
        }
        if (str.equals("FourK")) {
            return FourK;
        }
        if (str.equals("HDR")) {
            return HDR;
        }
        if (str.equals("Auto")) {
            return Auto;
        }
        if (str.equals("L_Standard")) {
            return L_Standard;
        }
        if (str.equals("H_High")) {
            return H_High;
        }
        if (str.equals("TwoK")) {
            return TwoK;
        }
        if (str.equals("ExtremelyHigh_50F")) {
            return ExtremelyHigh_50F;
        }
        if (str.equals("TwoK_50F")) {
            return TwoK_50F;
        }
        if (str.equals("FourK_50F")) {
            return FourK_50F;
        }
        if (str.equals("ExtremelyHigh_60F")) {
            return ExtremelyHigh_60F;
        }
        if (str.equals("TwoK_60F")) {
            return TwoK_60F;
        }
        if (str.equals("FourK_60F")) {
            return FourK_60F;
        }
        if (str.equals("ExtremelyHigh_120F")) {
            return ExtremelyHigh_120F;
        }
        if (str.equals("TwoK_120F")) {
            return TwoK_120F;
        }
        if (str.equals("FourK_120F")) {
            return FourK_120F;
        }
        if (str.equals("L_Standard_HDR")) {
            return L_Standard_HDR;
        }
        if (str.equals("Standard_HDR")) {
            return Standard_HDR;
        }
        if (str.equals("High_HDR")) {
            return High_HDR;
        }
        if (str.equals("H_High_HDR")) {
            return H_High_HDR;
        }
        if (str.equals("SuperHigh_HDR")) {
            return SuperHigh_HDR;
        }
        if (str.equals("ExtremelyHigh_HDR")) {
            return ExtremelyHigh_HDR;
        }
        if (str.equals("TwoK_HDR")) {
            return TwoK_HDR;
        }
        if (str.equals("FourK_HDR")) {
            return FourK_HDR;
        }
        return Undefine;
    }

    private Resolution(String str, String str2) {
        this.resolution = str;
        this.audioquality = str2;
    }
}
