package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileInputStream;
import java.io.IOException;

public final class mcp extends mck {

    /* renamed from: a */
    private String f58681a;

    /* renamed from: b */
    private Bitmap f58682b;

    public mcp(String str) {
        this.f58681a = str;
    }

    @Override // com.huawei.hms.maps.mck
    /* renamed from: a */
    public final Bitmap mo84271a(Context context) {
        StringBuilder sb;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = context.openFileInput(this.f58681a);
            this.f58682b = BitmapFactory.decodeStream(fileInputStream);
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e = e;
                    sb = new StringBuilder("generateBitmap close fileInputStream IOException : ");
                }
            }
        } catch (IOException e2) {
            mcq.m86889e("FileBitmapDescriptor", "generateBitmap IOException : " + e2.toString());
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    e = e3;
                    sb = new StringBuilder("generateBitmap close fileInputStream IOException : ");
                }
            }
        } catch (OutOfMemoryError unused) {
            mcq.m86889e("FileBitmapDescriptor", "generateBitmap OutOfMemoryError: ");
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    e = e4;
                    sb = new StringBuilder("generateBitmap close fileInputStream IOException : ");
                }
            }
        } catch (Throwable th) {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e5) {
                    mcq.m86886b("FileBitmapDescriptor", "generateBitmap close fileInputStream IOException : " + e5.toString());
                }
            }
            throw th;
        }
        return this.f58682b;
        sb.append(e.toString());
        mcq.m86886b("FileBitmapDescriptor", sb.toString());
        return this.f58682b;
    }
}
