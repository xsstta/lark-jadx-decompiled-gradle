package com.ss.android.vc.common.p3083e;

import android.content.Context;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.ss.android.vc.common.e.u */
public class C60782u {
    /* renamed from: a */
    private static void m236223a(String str, InputStream inputStream) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[inputStream.available()];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m236222a(Context context, int i, String str, String str2) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        m236223a(str2 + File.separator + str, openRawResource);
    }
}
