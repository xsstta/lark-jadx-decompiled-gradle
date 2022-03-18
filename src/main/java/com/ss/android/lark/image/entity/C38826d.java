package com.ss.android.lark.image.entity;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.load.AbstractC2265c;
import com.ss.android.lark.diskmanage.storage.StoragePathUtils;
import java.io.File;
import java.security.MessageDigest;
import java.util.Objects;

/* renamed from: com.ss.android.lark.image.entity.d */
public class C38826d implements AbstractC2265c {

    /* renamed from: b */
    private String f99781b;

    /* renamed from: c */
    private long f99782c;

    /* renamed from: d */
    private volatile byte[] f99783d;

    /* renamed from: a */
    public String mo142327a() {
        return this.f99781b;
    }

    /* renamed from: c */
    private byte[] m153240c() {
        if (this.f99783d == null) {
            this.f99783d = mo142329b().getBytes(f7599a);
        }
        return this.f99783d;
    }

    /* renamed from: b */
    public String mo142329b() {
        return this.f99781b + "_" + this.f99782c;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return Objects.hash(this.f99781b, Long.valueOf(this.f99782c));
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m153240c());
    }

    public C38826d(String str) {
        this.f99781b = str;
        File file = new File(str);
        if (file.exists()) {
            this.f99782c = file.lastModified();
        }
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38826d)) {
            return false;
        }
        C38826d dVar = (C38826d) obj;
        if (this.f99782c != dVar.f99782c || !Objects.equals(this.f99781b, dVar.f99781b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public String mo142328a(Context context) {
        String str = StoragePathUtils.f94669a.mo135741g(context) + Math.abs(this.f99781b.hashCode()) + "_" + this.f99782c + ".jpg";
        Log.d("VideoImage", "getCoverPath:" + str);
        return str;
    }
}
