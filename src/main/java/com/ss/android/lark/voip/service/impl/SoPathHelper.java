package com.ss.android.lark.voip.service.impl;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class SoPathHelper {
    public static List<String> getNativePathList(Context context) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Field findField = findField(classLoader, "pathList");
            findField.setAccessible(true);
            Object obj = findField.get(classLoader);
            Field findField2 = findField(obj, "nativeLibraryDirectories");
            findField2.setAccessible(true);
            Object obj2 = findField2.get(obj);
            if (obj2 instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (File file : (List) obj2) {
                    String absolutePath = file.getAbsolutePath();
                    if (!absolutePath.endsWith("/")) {
                        absolutePath = absolutePath + "/";
                    }
                    arrayList.add(absolutePath);
                }
                return arrayList;
            } else if (!(obj2 instanceof File[])) {
                return null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (File file2 : (File[]) obj2) {
                    String absolutePath2 = file2.getAbsolutePath();
                    if (!absolutePath2.endsWith("/")) {
                        absolutePath2 = absolutePath2 + "/";
                    }
                    arrayList2.add(absolutePath2);
                }
                return arrayList2;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private static Field findField(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
