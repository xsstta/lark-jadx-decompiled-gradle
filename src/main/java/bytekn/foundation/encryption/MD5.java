package bytekn.foundation.encryption;

import com.huawei.hms.site.ActivityC23764o;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vesdk.p3188b.C63954b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lbytekn/foundation/encryption/MD5;", "Lbytekn/foundation/encryption/Hasher;", "()V", C63954b.f161494a, "", ActivityC23764o.f58839a, "r", "coreDigest", "", "out", "", "corePadding", "totalWritten", "", "coreReset", "coreUpdate", "chunk", "Companion", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.encryption.g */
public final class MD5 extends Hasher {

    /* renamed from: a */
    public static final Companion f5804a = new Companion(null);

    /* renamed from: e */
    private static final int[] f5805e = {7, 12, 17, 22, 5, 9, 14, 20, 4, 11, 16, 23, 6, 10, 15, 21};

    /* renamed from: f */
    private static final int[] f5806f;

    /* renamed from: b */
    private final int[] f5807b = new int[4];

    /* renamed from: c */
    private final int[] f5808c = new int[4];

    /* renamed from: d */
    private final int[] f5809d = new int[16];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lbytekn/foundation/encryption/MD5$Companion;", "Lbytekn/foundation/encryption/HasherFactory;", "()V", "S", "", "T", "kn_common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.encryption.g$a */
    public static final class Companion extends HasherFactory {
        private Companion() {
            super(C17041.INSTANCE);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MD5() {
        super(64, 16);
        mo8691a();
    }

    /* access modifiers changed from: protected */
    @Override // bytekn.foundation.encryption.Hasher
    /* renamed from: a */
    public void mo8691a() {
        int[] iArr = this.f5807b;
        iArr[0] = 1732584193;
        iArr[1] = (int) 4023233417L;
        iArr[2] = (int) 2562383102L;
        iArr[3] = 271733878;
    }

    static {
        int[] iArr = new int[64];
        for (int i = 0; i < 64; i++) {
            iArr[i] = (int) ((long) (((double) 4294967296L) * Math.abs(Math.sin(((double) i) + 1.0d))));
        }
        f5806f = iArr;
    }

    /* access modifiers changed from: protected */
    @Override // bytekn.foundation.encryption.Hasher
    /* renamed from: c */
    public void mo8697c(byte[] bArr) {
        Intrinsics.checkParameterIsNotNull(bArr, "out");
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) (this.f5807b[i / 4] >>> ((i % 4) * 8));
        }
    }

    /* access modifiers changed from: protected */
    @Override // bytekn.foundation.encryption.Hasher
    /* renamed from: a */
    public byte[] mo8693a(long j) {
        long j2 = (long) 8;
        long j3 = j2 * j;
        int c = (int) (((((j + j2) / ((long) mo8696c())) + 1) * ((long) mo8696c())) - j);
        byte[] bArr = new byte[c];
        bArr[0] = (byte) SmActions.ACTION_ONTHECALL_EXIT;
        for (int i = 0; i < 8; i++) {
            bArr[(c - 8) + i] = (byte) ((int) (j3 >>> (i * 8)));
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    @Override // bytekn.foundation.encryption.Hasher
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8694b(byte[] r12) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: bytekn.foundation.encryption.MD5.mo8694b(byte[]):void");
    }
}
