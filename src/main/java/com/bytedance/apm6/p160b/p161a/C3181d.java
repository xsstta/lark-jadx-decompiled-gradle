package com.bytedance.apm6.p160b.p161a;

import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.util.p195b.C3350b;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: com.bytedance.apm6.b.a.d */
public class C3181d {

    /* renamed from: a */
    private MappedByteBuffer f10192a;

    /* renamed from: b */
    private long f10193b;

    /* renamed from: com.bytedance.apm6.b.a.d$a */
    private static class C3182a {

        /* renamed from: a */
        public static final C3181d f10194a = new C3181d();
    }

    /* renamed from: a */
    public static C3181d m13301a() {
        return C3182a.f10194a;
    }

    /* renamed from: b */
    public long mo13232b() {
        if (this.f10192a == null) {
            try {
                String f = C3318a.m13828f();
                File file = new File(C3162b.m13177a(), f.replace(".", "_").replace(":", "-") + "_seq_num.txt");
                boolean exists = file.exists();
                if (!exists) {
                    file.createNewFile();
                }
                MappedByteBuffer map = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0, 8);
                this.f10192a = map;
                if (!exists) {
                    map.putLong(0, 0);
                    return 0;
                }
            } catch (Throwable th) {
                C3350b.m13935b(C3159a.f10110a, "prepare seq_number fail.", th);
            }
        }
        MappedByteBuffer mappedByteBuffer = this.f10192a;
        if (mappedByteBuffer != null) {
            long j = mappedByteBuffer.getLong(0) + 1;
            this.f10193b = j;
            this.f10192a.putLong(0, j);
            return this.f10193b;
        }
        long j2 = this.f10193b;
        this.f10193b = 1 + j2;
        return j2;
    }
}
