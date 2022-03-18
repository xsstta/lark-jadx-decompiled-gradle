package com.ss.android.vc.meeting.module.sketch.render.gl.util;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

public class FileUtils {
    public static String loadAssetFile(Context context, String str) {
        try {
            InputStream open = context.getResources().getAssets().open(str);
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            String str2 = new String(bArr, "utf-8");
            open.close();
            return str2;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
