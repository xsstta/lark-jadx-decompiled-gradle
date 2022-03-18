package bytekn.foundation.encryption;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H$J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH$J\b\u0010\u0012\u001a\u00020\u000fH$J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H$J\u000e\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0000J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0007J\u001e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lbytekn/foundation/encryption/Hasher;", "", "chunkSize", "", "digestSize", "(II)V", "chunk", "", "getChunkSize", "()I", "getDigestSize", "totalWritten", "", "writtenInChunk", "coreDigest", "", "out", "corePadding", "coreReset", "coreUpdate", "digest", "Lbytekn/foundation/encryption/Hash;", "()[B", "digestOut", "reset", "update", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "offset", "count", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.d */
public abstract class Hasher {

    /* renamed from: a */
    private final byte[] f5798a;

    /* renamed from: b */
    private int f5799b;

    /* renamed from: c */
    private long f5800c;

    /* renamed from: d */
    private final int f5801d;

    /* renamed from: e */
    private final int f5802e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8691a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo8693a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo8694b(byte[] bArr);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo8697c(byte[] bArr);

    /* renamed from: c */
    public final int mo8696c() {
        return this.f5801d;
    }

    /* renamed from: b */
    public final byte[] mo8695b() {
        byte[] bArr = new byte[this.f5802e];
        mo8692a(bArr);
        return Hash.m7548b(bArr);
    }

    /* renamed from: a */
    public final void mo8692a(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "out");
        byte[] a = mo8693a(this.f5800c);
        int i = 0;
        while (i < a.length) {
            int i2 = this.f5801d;
            int i3 = this.f5799b;
            int i4 = i2 - i3;
            C1702b.m7545a(a, i, this.f5798a, i3, i4);
            mo8694b(this.f5798a);
            this.f5799b = 0;
            i += i4;
        }
        mo8697c(bArr);
        mo8691a();
    }

    public Hasher(int i, int i2) {
        this.f5801d = i;
        this.f5802e = i2;
        this.f5798a = new byte[i];
    }

    /* renamed from: a */
    public final Hasher mo8690a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(this.f5801d - this.f5799b, i3);
            C1702b.m7545a(bArr, i, this.f5798a, this.f5799b, min);
            i3 -= min;
            i += min;
            int i4 = this.f5799b + min;
            this.f5799b = i4;
            int i5 = this.f5801d;
            if (i4 >= i5) {
                this.f5799b = i4 - i5;
                mo8694b(this.f5798a);
            }
        }
        this.f5800c += (long) i2;
        return this;
    }
}
