package com.larksuite.framework.utils;

import android.os.Environment;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/* renamed from: com.larksuite.framework.utils.c */
public class C26265c {

    /* renamed from: a */
    private static volatile C26265c f64864a;

    /* renamed from: b */
    private final Properties f64865b;

    /* renamed from: a */
    public static C26265c m95079a() {
        if (f64864a == null) {
            synchronized (C26265c.class) {
                f64864a = new C26265c();
            }
        }
        return f64864a;
    }

    private C26265c() {
        Properties properties = new Properties();
        this.f64865b = properties;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            try {
                properties.load(fileInputStream2);
                C26314q.m95296a(fileInputStream2);
            } catch (Throwable unused) {
                fileInputStream = fileInputStream2;
                try {
                    Log.m165383e("BuildPropertyReader", "Unable to init FileInputStream");
                    C26314q.m95296a(fileInputStream);
                } catch (Throwable th) {
                    C26314q.m95296a(fileInputStream);
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            Log.m165383e("BuildPropertyReader", "Unable to init FileInputStream");
            C26314q.m95296a(fileInputStream);
        }
    }

    /* renamed from: a */
    public String mo93374a(String str) {
        return this.f64865b.getProperty(str);
    }
}
