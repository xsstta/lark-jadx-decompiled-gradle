package com.ss.android.ttve.common;

import android.util.Log;

public class TESpdLogManager {

    /* renamed from: a */
    private static volatile TESpdLogManager f150193a;

    /* renamed from: b */
    private TESpdLogInvoker f150194b = new TESpdLogInvoker();

    public enum InfoLevel {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3
    }

    /* renamed from: b */
    public void mo205521b() {
        this.f150194b.close();
    }

    private TESpdLogManager() {
    }

    /* renamed from: a */
    public static TESpdLogManager m233919a() {
        if (f150193a == null) {
            synchronized (TESpdLogManager.class) {
                if (f150193a == null) {
                    f150193a = new TESpdLogManager();
                }
            }
        }
        return f150193a;
    }

    /* renamed from: a */
    public void mo205520a(InfoLevel infoLevel) {
        this.f150194b.setLevel(infoLevel.ordinal());
    }

    /* renamed from: a */
    public int mo205519a(String str, int i, int i2) {
        Log.e("TESpdLogManager", "logDir: " + str);
        int initSpdLog = this.f150194b.initSpdLog(str, i, i2);
        if (initSpdLog < 0) {
            return initSpdLog;
        }
        return 0;
    }
}
