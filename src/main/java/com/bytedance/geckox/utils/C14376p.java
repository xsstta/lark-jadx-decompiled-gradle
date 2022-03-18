package com.bytedance.geckox.utils;

import com.bytedance.geckox.C14189a;
import com.bytedance.geckox.p771g.C14276b;
import com.bytedance.geckox.statistic.C14343e;
import com.bytedance.geckox.statistic.model.EventMessageModel;
import com.bytedance.pipeline.exception.DataException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.bytedance.geckox.utils.p */
public class C14376p {

    /* renamed from: a */
    private static byte[] f37740a = {80, 75, 3, 4};

    /* renamed from: b */
    private static byte[] f37741b = {80, 75, 5, 6};

    /* renamed from: b */
    private static boolean m57865b(String str) {
        if (str.startsWith("__MACOSX/") || str.equals(".DS_Store")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m57862a(String str) {
        if (!str.contains("tasm") || C14189a.m57302a().mo52070c()) {
            throw new DataException("unzip file " + str);
        }
    }

    /* renamed from: a */
    private static boolean m57864a(InputStream inputStream) throws Exception {
        try {
            byte[] bArr = new byte[4];
            boolean z = false;
            if (inputStream.read(bArr, 0, 4) == 4) {
                if (Arrays.equals(f37740a, bArr) || Arrays.equals(f37741b, bArr)) {
                    z = true;
                }
                return z;
            }
            C14355c.m57819a(inputStream);
            return false;
        } finally {
            C14355c.m57819a(inputStream);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m57861a(java.io.InputStream r27, java.lang.String r28, java.lang.String r29, int r30) throws java.lang.Exception {
        /*
        // Method dump skipped, instructions count: 621
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.utils.C14376p.m57861a(java.io.InputStream, java.lang.String, java.lang.String, int):void");
    }

    /* renamed from: a */
    private static void m57863a(String str, String str2, long j, long j2, long j3, int i, String str3) throws DataException {
        String str4 = "channel:" + str + ",file :" + str2 + ",entry size:" + j + ",local file size:" + j2 + ",stream size:" + j3 + ",pid:" + C14350a.m57806a() + ",thread id:" + Thread.currentThread().getId();
        C14276b.m57604a("gecko-debug-tag", "mmap+ZipInputStream unzip " + str3, str4);
        EventMessageModel eventMessageModel = new EventMessageModel();
        eventMessageModel.setEventType(3);
        eventMessageModel.setSubType(31);
        eventMessageModel.setErrMsg(str3 + "," + str4);
        StringBuilder sb = new StringBuilder();
        sb.append("retry count:");
        sb.append(i);
        eventMessageModel.setExtra(sb.toString());
        C14343e.m57790a(eventMessageModel);
    }
}
