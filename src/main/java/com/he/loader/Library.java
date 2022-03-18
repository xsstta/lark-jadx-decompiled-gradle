package com.he.loader;

import com.C1711a;

public class Library {
    private static Loader _loader;

    public interface Loader {
        String getSoPluginDir();

        void load(String str) throws Exception;
    }

    public static String getSoPluginDir() {
        Loader loader = _loader;
        if (loader == null) {
            return null;
        }
        return loader.getSoPluginDir();
    }

    public static void setLoader(Loader loader) {
        _loader = loader;
    }

    public static void load(String str) throws Exception {
        Loader loader = _loader;
        if (loader != null) {
            loader.load(str);
        } else {
            C1711a.m7628a(str);
        }
    }
}
