package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.bx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

final class cp {

    /* renamed from: a */
    private static final Pattern f55879a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    static List<File> m82093a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(co.f55878a);
        if (listFiles != null) {
            int length = listFiles.length;
            fileArr = new File[length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr[parseInt] != null) {
                    throw new ay("Metadata folder ordering corrupt.");
                }
                fileArr[parseInt] = file3;
            }
        } else {
            fileArr = new File[0];
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    ct a = new C22584ai(fileInputStream).mo78729a();
                    if (a.mo78719a() != null) {
                        File file5 = new File(file, a.mo78719a());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new ay(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                        }
                    } else {
                        throw new ay("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    bx.m82371a(th, th);
                }
            }
        }
        return arrayList;
        throw th;
    }
}
