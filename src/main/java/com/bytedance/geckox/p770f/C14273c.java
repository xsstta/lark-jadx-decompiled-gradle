package com.bytedance.geckox.p770f;

import android.os.Process;
import android.util.Pair;
import com.bytedance.geckox.utils.C14357e;
import com.bytedance.geckox.utils.ExecutorC14360g;
import com.bytedance.geckox.utils.FileLock;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.geckox.f.c */
public class C14273c {

    /* renamed from: a */
    private static final Map<String, Pair<FileLock, AtomicLong>> f37532a = new HashMap();

    /* renamed from: a */
    public static void m57597a(String str) throws Exception {
        Map<String, Pair<FileLock, AtomicLong>> map = f37532a;
        synchronized (map) {
            FileLock b = FileLock.m57801b(str);
            if (b != null) {
                Pair<FileLock, AtomicLong> pair = map.get(str);
                if (pair == null || ((AtomicLong) pair.second).get() == 0) {
                    File parentFile = new File(str).getParentFile();
                    final File file = new File(parentFile.getAbsolutePath() + "--pending-delete");
                    boolean renameTo = parentFile.renameTo(file);
                    b.mo52472a();
                    b.mo52473b();
                    if (renameTo) {
                        ExecutorC14360g.m57832a().execute(new Runnable() {
                            /* class com.bytedance.geckox.p770f.C14273c.RunnableC142741 */

                            public void run() {
                                C14357e.m57823a(file);
                            }
                        });
                    }
                    return;
                }
                b.mo52472a();
                FileLock.m57800a(str, Process.myPid());
            }
        }
    }
}
