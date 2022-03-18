package com.ss.android.ttve.nativePort;

import android.app.Application;
import android.content.ContentResolver;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.ss.android.vesdk.C63929ab;
import java.lang.reflect.Field;

public class TEContentProviderUtils {
    private static Application _initApplication;

    public static ContentResolver getContentResolver() {
        Application applicationContext = getApplicationContext();
        if (applicationContext != null) {
            return applicationContext.getContentResolver();
        }
        return null;
    }

    private static Application getApplicationContext() {
        if (_initApplication == null) {
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, null);
                declaredField.setAccessible(true);
                _initApplication = (Application) declaredField.get(invoke);
            } catch (Throwable th) {
                C63929ab.m250971a(TEContentProviderUtils.class, "[getApplicationContext] err", th);
            }
        }
        return _initApplication;
    }

    public static String getExtensionFromUri(String str) {
        return MimeTypeMap.getSingleton().getExtensionFromMimeType(getFileTypeFromUri(str));
    }

    public static String getFileTypeFromUri(String str) {
        Application applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            ContentResolver contentResolver = applicationContext.getContentResolver();
            if (parse == null || contentResolver == null) {
                return null;
            }
            return contentResolver.getType(parse);
        } catch (Throwable th) {
            C63929ab.m250971a(TEContentProviderUtils.class, "[getFileTypeFromUri] err", th);
            return null;
        }
    }

    public static int getFd(String str, String str2) {
        Application applicationContext = getApplicationContext();
        if (applicationContext == null) {
            return -1;
        }
        try {
            ContentResolver contentResolver = applicationContext.getContentResolver();
            Uri parse = Uri.parse(str);
            if (parse == null || contentResolver == null) {
                return -1;
            }
            return contentResolver.openFileDescriptor(parse, str2).detachFd();
        } catch (Throwable th) {
            C63929ab.m250971a(TEContentProviderUtils.class, "[getFd] err", th);
            return -1;
        }
    }
}
