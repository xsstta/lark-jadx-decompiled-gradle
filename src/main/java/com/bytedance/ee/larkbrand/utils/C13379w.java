package com.bytedance.ee.larkbrand.utils;

import com.bumptech.glide.load.AbstractC2265c;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.larkbrand.utils.w */
public class C13379w implements AbstractC2265c {

    /* renamed from: b */
    private final String f35289b;

    /* renamed from: c */
    private final AbstractC2265c f35290c;

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return (this.f35289b.hashCode() * 31) + this.f35290c.hashCode();
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        try {
            messageDigest.update(this.f35289b.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f35290c.updateDiskCacheKey(messageDigest);
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13379w wVar = (C13379w) obj;
        if (this.f35289b.equals(wVar.f35289b) && this.f35290c.equals(wVar.f35290c)) {
            return true;
        }
        return false;
    }

    public C13379w(String str, AbstractC2265c cVar) {
        this.f35289b = str;
        this.f35290c = cVar;
    }
}
