package com.bytedance.common.profilesdk.core;

import android.os.Build;
import android.os.SystemClock;
import android.system.Os;
import com.bytedance.common.profilesdk.AppContext;
import com.bytedance.common.profilesdk.util.FileUtils;
import com.bytedance.common.profilesdk.util.Logger;
import com.bytedance.common.profilesdk.util.VersionUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Profman {
    static File sBinary;
    static boolean sInited;
    List<String> options;
    File redirectOutput;

    public static class Builder {
        List<String> options = new ArrayList();
        File redirectOutput;

        public Profman build() {
            Profman profman = new Profman();
            profman.options = this.options;
            profman.redirectOutput = this.redirectOutput;
            return profman;
        }

        public Builder addOption(String str) {
            this.options.add(str);
            return this;
        }
    }

    static File install() {
        if (VersionUtils.isP() || VersionUtils.isQR()) {
            return FileUtils.getSo("cvt");
        }
        if (sInited) {
            return new File(AppContext.getContext().getDir("imageloader", 0), "converter");
        }
        File dir = AppContext.getContext().getDir("imageloader", 0);
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File(dir, "converter");
        file.exists();
        if (extractAssetsFile("converter", file) == null) {
            Logger.m15163d("extract failed.");
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Os.chmod(file.getAbsolutePath(), 744);
            } catch (Throwable unused) {
                Logger.m15163d("failed to chmod, go on anyway.");
            }
        }
        if (!file.exists()) {
            Logger.m15163d("install s3 converter not exist " + file);
            return null;
        }
        sInited = true;
        return file;
    }

    public int run() {
        if (sBinary == null) {
            sBinary = install();
            Logger.m15163d("install profman, path=" + sBinary);
        }
        File file = sBinary;
        int i = -1;
        if (file != null && file.exists()) {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(sBinary.getAbsolutePath());
            arrayList.addAll(this.options);
            try {
                long uptimeMillis = SystemClock.uptimeMillis();
                ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
                if (VersionUtils.isQ()) {
                    processBuilder.environment().put("LD_LIBRARY_PATH", "/apex/com.android.runtime/lib");
                }
                if (VersionUtils.isR()) {
                    processBuilder.environment().put("LD_LIBRARY_PATH", "/apex/com.android.art/lib");
                }
                if (this.redirectOutput != null && Build.VERSION.SDK_INT >= 26) {
                    processBuilder.redirectOutput(this.redirectOutput);
                }
                i = processBuilder.start().waitFor();
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                StringBuilder sb = new StringBuilder();
                for (String str : arrayList) {
                    sb.append(str);
                    sb.append(" ");
                }
                Logger.m15163d("profman took " + uptimeMillis2 + "ms, ret=" + i + ", cmd=" + sb.toString());
            } catch (Exception e) {
                Logger.m15163d(e.toString());
            }
        }
        return i;
    }

    /* JADX INFO: finally extract failed */
    public static String extractAssetsFile(String str, File file) {
        try {
            InputStream open = AppContext.getContext().getAssets().open(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = open.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            open.close();
                            return file.getAbsolutePath();
                        }
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                open.close();
                throw th2;
            }
        } catch (IOException e) {
            Logger.m15163d("install s2 error " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
