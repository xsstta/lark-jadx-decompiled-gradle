package com.ss.android.lark.image.impl.p1964d;

import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.lark.log.Log;
import io.reactivex.Observable;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.image.impl.d.a */
public class C38884a {

    /* renamed from: a */
    private static String f99891a = "luban_disk_cache";

    /* renamed from: b */
    private File f99892b;

    /* renamed from: c */
    private List<File> f99893c;

    /* renamed from: d */
    private C38885b f99894d;

    /* renamed from: a */
    public Observable<File> mo142401a() {
        return new C38886c(this.f99894d).mo142403a(this.f99892b);
    }

    /* renamed from: a */
    private static File m153454a(Context context) {
        return m153455a(context, f99891a);
    }

    /* renamed from: b */
    public C38884a mo142402b(int i) {
        this.f99894d.f99895a = i;
        return this;
    }

    private C38884a(File file) {
        this.f99894d = new C38885b(file);
    }

    /* renamed from: a */
    public C38884a mo142399a(int i) {
        this.f99894d.f99900f = i;
        return this;
    }

    /* renamed from: a */
    public C38884a mo142400a(Bitmap.CompressFormat compressFormat) {
        this.f99894d.f99899e = compressFormat;
        return this;
    }

    /* renamed from: a */
    public static C38884a m153453a(Context context, File file) {
        C38884a aVar = new C38884a(m153454a(context));
        aVar.f99892b = file;
        aVar.f99893c = Collections.singletonList(file);
        return aVar;
    }

    /* renamed from: a */
    private static File m153455a(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        Log.m165383e("Luban", "default disk cache dir is null");
        return null;
    }
}
