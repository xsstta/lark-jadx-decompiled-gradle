package com.ttnet.org.chromium.net;

public class ApiVersion {
    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return "77.0.3844.0";
    }

    public static String getLastChange() {
        return "75ce914eec9114172da89f1390e9ab437ede0a6a-refs/heads/master@{#674799}";
    }

    public static int getMaximumAvailableApiLevel() {
        return 12;
    }

    private ApiVersion() {
    }

    public static String getCronetVersionWithLastChange() {
        return "77.0.3844.0@" + "75ce914e";
    }
}
