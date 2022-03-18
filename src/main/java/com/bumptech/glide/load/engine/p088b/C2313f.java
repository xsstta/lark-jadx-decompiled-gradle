package com.bumptech.glide.load.engine.p088b;

import android.content.Context;
import com.bumptech.glide.load.engine.p088b.C2309d;
import java.io.File;

/* renamed from: com.bumptech.glide.load.engine.b.f */
public final class C2313f extends C2309d {
    public C2313f(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public C2313f(final Context context, final String str, long j) {
        super(new C2309d.AbstractC2310a() {
            /* class com.bumptech.glide.load.engine.p088b.C2313f.C23141 */

            @Override // com.bumptech.glide.load.engine.p088b.C2309d.AbstractC2310a
            public File getCacheDirectory() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                if (str != null) {
                    return new File(cacheDir, str);
                }
                return cacheDir;
            }
        }, j);
    }
}
