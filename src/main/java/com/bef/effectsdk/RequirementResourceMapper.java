package com.bef.effectsdk;

public final class RequirementResourceMapper {
    private static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    private RequirementResourceMapper() {
    }

    /* renamed from: a */
    public static String[] m9043a(String[] strArr) {
        return nativePeekResourcesNeededByRequirements(strArr);
    }
}
