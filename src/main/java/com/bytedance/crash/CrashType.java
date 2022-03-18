package com.bytedance.crash;

public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    GAME("game"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");
    
    private final String mName;

    public String getName() {
        return this.mName;
    }

    public String toString() {
        return getName();
    }

    private CrashType(String str) {
        this.mName = str;
    }
}
