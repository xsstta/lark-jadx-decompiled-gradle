package com.tt.miniapp.streamloader;

import java.io.File;

/* renamed from: com.tt.miniapp.streamloader.d */
public class C66878d {
    /* renamed from: a */
    public static File m260855a(File file) {
        if (file == null) {
            return null;
        }
        String name = file.getName();
        String parent = file.getParent();
        return new File(parent, name + ".info");
    }
}
