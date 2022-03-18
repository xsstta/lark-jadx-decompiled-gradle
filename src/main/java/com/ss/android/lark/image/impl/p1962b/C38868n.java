package com.ss.android.lark.image.impl.p1962b;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.larksuite.tool.image.JPEGTool;
import com.ss.android.lark.log.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;

/* renamed from: com.ss.android.lark.image.impl.b.n */
class C38868n {
    C38868n() {
    }

    /* renamed from: a */
    private C38865m m153421a(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(inputStream, null, options);
        return C38865m.m153409d().mo142381a(options.outWidth).mo142386b(options.outHeight).mo142383a(options.outMimeType).mo142385a();
    }

    /* renamed from: b */
    private int m153422b(String str) {
        try {
            return new ExifInterface(str).getAttributeInt("Orientation", 1);
        } catch (IOException e) {
            Log.m165389i("ImageCompressor", "orientation not found, " + e.getMessage());
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C38865m mo142389a(String str) {
        boolean z;
        try {
            File file = new File(str);
            long length = file.length();
            C38865m a = m153421a(new FileInputStream(file));
            if (a.mo142378b()) {
                int b = m153422b(str);
                if (b >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                int jpegQualityByPath = JPEGTool.getJpegQualityByPath(str);
                Pair<Integer, Integer> a2 = C38870p.m153429a(a.f99853a, a.f99854b, b);
                int intValue = a2.getFirst().intValue();
                return C38865m.m153408a(a).mo142381a(intValue).mo142386b(a2.getSecond().intValue()).mo142388d(b).mo142384a(z).mo142382a(length).mo142387c(jpegQualityByPath).mo142385a();
            }
            Log.m165383e("ImageCompressor", "decode image file fail, invalid size, " + str);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
