package com.facebook.common.media;

import com.facebook.common.internal.ImmutableMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public class MediaUtils {
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = ImmutableMap.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    public static boolean isNonNativeSupportedMimeType(String str) {
        return ADDITIONAL_ALLOWED_MIME_TYPES.containsValue(str);
    }

    public static boolean isPhoto(@Nullable String str) {
        if (str == null || !str.startsWith("image/")) {
            return false;
        }
        return true;
    }

    public static boolean isThreeD(@Nullable String str) {
        if (str == null || !str.equals("model/gltf-binary")) {
            return false;
        }
        return true;
    }

    public static boolean isVideo(@Nullable String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }

    @Nullable
    private static String extractExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    @Nullable
    public static String extractMime(String str) {
        String extractExtension = extractExtension(str);
        if (extractExtension == null) {
            return null;
        }
        String lowerCase = extractExtension.toLowerCase(Locale.US);
        String a = C21029a.m76654a(lowerCase);
        if (a == null) {
            return ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase);
        }
        return a;
    }
}
