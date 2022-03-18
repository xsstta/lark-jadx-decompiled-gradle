package com.bef.effectsdk.text;

import android.graphics.Typeface;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.io.File;
import java.util.Hashtable;
import java.util.LinkedList;

/* renamed from: com.bef.effectsdk.text.a */
public class C2085a {

    /* renamed from: a */
    private static Hashtable<String, Typeface> f7191a = new Hashtable<>();

    /* renamed from: b */
    private static LinkedList<String> f7192b = new LinkedList<>();

    /* renamed from: a */
    public static Typeface m9054a(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (TypeFaceLancet.cache.contains(path)) {
                return (Typeface) TypeFaceLancet.cache.get(path);
            }
            Typeface createFromFile = Typeface.createFromFile(file);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(path, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(file);
    }

    /* renamed from: a */
    public static synchronized Typeface m9055a(String str, int i) {
        Typeface typeface;
        synchronized (C2085a.class) {
            String str2 = "SYSTEM_" + str + "_" + i;
            typeface = f7191a.get(str2);
            if (typeface == null) {
                try {
                    typeface = Typeface.create(str, i);
                    if (f7192b.size() >= 32) {
                        f7191a.remove(f7192b.removeLast());
                        System.gc();
                    }
                    f7191a.put(str2, typeface);
                    f7192b.addFirst(str2);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                f7192b.remove(str2);
                f7192b.addFirst(str2);
            }
        }
        return typeface;
    }

    /* renamed from: a */
    public static synchronized Typeface m9056a(String str, String str2) {
        Typeface typeface;
        synchronized (C2085a.class) {
            String str3 = "FILE_" + str + "_" + str2;
            typeface = f7191a.get(str3);
            if (typeface == null) {
                try {
                    typeface = m9054a(new File(str, str2));
                    if (f7192b.size() >= 32) {
                        f7191a.remove(f7192b.removeLast());
                        System.gc();
                    }
                    f7191a.put(str3, typeface);
                    f7192b.addFirst(str3);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                f7192b.remove(str3);
                f7192b.addFirst(str3);
            }
        }
        return typeface;
    }
}
