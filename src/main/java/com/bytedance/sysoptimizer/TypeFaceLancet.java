package com.bytedance.sysoptimizer;

import android.graphics.Typeface;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import me.ele.lancet.base.Origin;

public class TypeFaceLancet {
    public static ConcurrentHashMap cache = new ConcurrentHashMap();

    public static Typeface createFromFile(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (cache.contains(path)) {
                return (Typeface) cache.get(path);
            }
            Typeface typeface = (Typeface) Origin.call();
            if (typeface != null) {
                cache.put(path, typeface);
                return typeface;
            }
        }
        return (Typeface) Origin.call();
    }

    public static Typeface createFromFile(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (cache.contains(str)) {
                return (Typeface) cache.get(str);
            }
            Typeface typeface = (Typeface) Origin.call();
            if (typeface != null) {
                cache.put(str, typeface);
                return typeface;
            }
        }
        return (Typeface) Origin.call();
    }
}
