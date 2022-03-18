package com.tt.miniapp.audio.p3259a;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.audio.C65754b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tt.miniapp.audio.a.a */
public class C65752a {
    /* renamed from: a */
    public static boolean m257762a(String str, String str2, boolean z, C65754b.C65759c cVar) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        int length = (int) file.length();
        C65753b bVar = new C65753b();
        bVar.f165682b = length + 36;
        bVar.f165685e = 16;
        bVar.f165691k = 16;
        bVar.f165687g = cVar.f165719d;
        bVar.f165686f = 1;
        bVar.f165688h = cVar.f165717b;
        bVar.f165690j = (short) ((bVar.f165687g * bVar.f165691k) / 8);
        bVar.f165689i = bVar.f165690j * bVar.f165688h;
        bVar.f165693m = length;
        try {
            byte[] a = bVar.mo230387a();
            if (a.length != 44) {
                return false;
            }
            File file2 = new File(str2);
            if (file2.exists()) {
                file2.delete();
            }
            try {
                byte[] bArr = new byte[4096];
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                bufferedOutputStream.write(a, 0, a.length);
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                for (int read = bufferedInputStream.read(bArr); read != -1; read = bufferedInputStream.read(bArr)) {
                    bufferedOutputStream.write(bArr);
                }
                bufferedInputStream.close();
                bufferedOutputStream.close();
                if (z) {
                    file.delete();
                }
                AppBrandLogger.m52830i("tma_PcmToWav", "makePCMFileToWAVFile  success!", new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
                return true;
            } catch (FileNotFoundException e) {
                AppBrandLogger.m52829e("tma_PcmToWav", e.getMessage());
                return false;
            } catch (IOException e2) {
                AppBrandLogger.m52829e("tma_PcmToWav", e2.getMessage());
                return false;
            }
        } catch (IOException e3) {
            AppBrandLogger.m52829e("tma_PcmToWav", e3.getMessage());
            return false;
        }
    }
}
