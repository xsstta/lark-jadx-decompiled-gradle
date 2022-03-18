package com.ss.android.lark.newemoji.loader;

import android.text.TextUtils;
import com.bumptech.glide.load.AbstractC2265c;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/newemoji/loader/EmojiImageResource;", "Lcom/bumptech/glide/load/Key;", "imageKey", "", "(Ljava/lang/String;)V", "cacheKeyBytes", "", "getImageKey", "()Ljava/lang/String;", "equals", "", "other", "", "getCacheKeyBytes", "hashCode", "", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "lark-emoji_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.t.b.a */
public final class EmojiImageResource implements AbstractC2265c {

    /* renamed from: b */
    private volatile byte[] f136350b;

    /* renamed from: c */
    private final String f136351c;

    /* renamed from: a */
    public final String mo188283a() {
        return this.f136351c;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public int hashCode() {
        return this.f136351c.hashCode();
    }

    /* renamed from: b */
    private final byte[] m214301b() {
        if (this.f136350b == null) {
            String str = this.f136351c;
            Charset charset = AbstractC2265c.f7599a;
            Intrinsics.checkExpressionValueIsNotNull(charset, "Key.CHARSET");
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                this.f136350b = bytes;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return this.f136350b;
    }

    public EmojiImageResource(String str) {
        Intrinsics.checkParameterIsNotNull(str, "imageKey");
        this.f136351c = str;
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public void updateDiskCacheKey(MessageDigest messageDigest) {
        Intrinsics.checkParameterIsNotNull(messageDigest, "messageDigest");
        byte[] b = m214301b();
        if (b != null) {
            messageDigest.update(b);
        }
    }

    @Override // com.bumptech.glide.load.AbstractC2265c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!Intrinsics.areEqual(getClass(), obj.getClass()))) {
            return false;
        }
        return TextUtils.equals(this.f136351c, ((EmojiImageResource) obj).f136351c);
    }
}
