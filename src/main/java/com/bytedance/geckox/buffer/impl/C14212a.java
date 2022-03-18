package com.bytedance.geckox.buffer.impl;

import android.content.Context;
import com.bytedance.geckox.buffer.AbstractC14208a;
import com.bytedance.geckox.p771g.C14276b;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.buffer.impl.a */
public class C14212a {
    /* renamed from: a */
    public static AbstractC14208a m57400a(Context context, File file, long j) throws IOException {
        AbstractC14208a b = m57401b(context, file, j);
        C14276b.m57604a("gecko-debug-tag", "buffer type:" + b.getClass());
        return b;
    }

    /* renamed from: b */
    private static AbstractC14208a m57401b(Context context, File file, long j) throws IOException {
        if (j <= 0) {
            try {
                return new C14213b(file);
            } catch (Exception e) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e.getMessage(), e);
            }
        } else {
            try {
                return new MMapBuffer(j, file);
            } catch (Exception e2) {
                C14276b.m57603a("gecko-debug-tag", "mmap failed:", e2);
                try {
                    return new C14214c(j, file);
                } catch (Exception e3) {
                    throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e3.getMessage(), e3);
                }
            }
        }
    }
}
