package com.tt.miniapp.util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.tt.miniapp.util.d */
public class C67030d {

    /* renamed from: a */
    private final Properties f168999a;

    public C67030d() throws IOException {
        Properties properties = new Properties();
        this.f168999a = properties;
        properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
    }
}
