package bytekn.foundation.io.file;

import com.ss.android.vesdk.p3188b.C63954b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J&\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0019\u001a\u00020\u0006J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004¨\u0006\u001f"}, d2 = {"Lbytekn/foundation/io/file/ByteArrayOutputStream;", "", "size", "", "(I)V", "buf", "", "getBuf", "()[B", "setBuf", "([B)V", "count", "getCount", "()I", "setCount", "ensureCapacity", "", "minCapacity", "grow", "read", C63954b.f161494a, "srcOffset", "desOffset", "len", "reset", "toByteArray", "toString", "", "write", "off", "Companion", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: bytekn.foundation.io.file.a */
public class ByteArrayOutputStream {

    /* renamed from: a */
    public static final int f5812a = f5812a;

    /* renamed from: b */
    public static final Companion f5813b = new Companion(null);

    /* renamed from: c */
    private byte[] f5814c;

    /* renamed from: d */
    private int f5815d;

    public ByteArrayOutputStream() {
        this(0, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lbytekn/foundation/io/file/ByteArrayOutputStream$Companion;", "", "()V", "MAX_ARRAY_SIZE", "", "hugeCapacity", "minCapacity", "kn_io_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: bytekn.foundation.io.file.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo8704a(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("out of memory!".toString());
            } else if (i > ByteArrayOutputStream.f5812a) {
                return Integer.MAX_VALUE;
            } else {
                return ByteArrayOutputStream.f5812a;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo8700a() {
        return this.f5814c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo8701b() {
        return this.f5815d;
    }

    public String toString() {
        return this.f5814c.toString();
    }

    /* renamed from: c */
    public final byte[] mo8702c() {
        byte[] copyOf = Arrays.copyOf(this.f5814c, this.f5815d);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: a */
    private final void m7567a(int i) {
        if (i - this.f5814c.length > 0) {
            m7568b(i);
        }
    }

    public ByteArrayOutputStream(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5814c = new byte[i];
            return;
        }
        throw new IllegalArgumentException(("Negative initial size: " + i).toString());
    }

    /* renamed from: b */
    private final void m7568b(int i) {
        int length = this.f5814c.length << 1;
        if (length - i < 0) {
            length = i;
        }
        if (length - f5812a > 0) {
            length = f5813b.mo8704a(i);
        }
        byte[] copyOf = Arrays.copyOf(this.f5814c, length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        this.f5814c = copyOf;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ByteArrayOutputStream(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 32 : i);
    }

    /* renamed from: a */
    public final void mo8699a(byte[] bArr, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(bArr, C63954b.f161494a);
        if (i >= 0 && i <= bArr.length && i2 >= 0) {
            int i3 = i + i2;
            if (i3 - bArr.length <= 0) {
                m7567a(this.f5815d + i2);
                C69043h.m265722a(bArr, this.f5814c, this.f5815d, i, i3);
                this.f5815d += i2;
                return;
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
