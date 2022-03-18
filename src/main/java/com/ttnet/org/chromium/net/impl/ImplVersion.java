package com.ttnet.org.chromium.net.impl;

public class ImplVersion {
    public static int getApiLevel() {
        return 12;
    }

    public static String getCronetVersion() {
        return "77.0.3844.0";
    }

    public static String getLastChange() {
        return "75ce914eec9114172da89f1390e9ab437ede0a6a-refs/heads/master@{#674799}";
    }

    private ImplVersion() {
    }

    public static String getCronetVersionWithLastChange() {
        return "77.0.3844.0@" + "75ce914e";
    }
}
