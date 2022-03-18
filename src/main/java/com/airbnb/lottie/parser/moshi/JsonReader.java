package com.airbnb.lottie.parser.moshi;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.AbstractC69698d;
import okio.AbstractC69699e;
import okio.ByteString;
import okio.C69694c;
import okio.C69710l;

public abstract class JsonReader implements Closeable {

    /* renamed from: g */
    private static final String[] f6507g = new String[SmActions.ACTION_ONTHECALL_EXIT];

    /* renamed from: a */
    int f6508a;

    /* renamed from: b */
    int[] f6509b = new int[32];

    /* renamed from: c */
    String[] f6510c = new String[32];

    /* renamed from: d */
    int[] f6511d = new int[32];

    /* renamed from: e */
    boolean f6512e;

    /* renamed from: f */
    boolean f6513f;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: a */
    public abstract int mo9321a(C1891a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo9323a() throws IOException;

    /* renamed from: b */
    public abstract void mo9325b() throws IOException;

    /* renamed from: c */
    public abstract void mo9326c() throws IOException;

    /* renamed from: d */
    public abstract void mo9327d() throws IOException;

    /* renamed from: e */
    public abstract boolean mo9328e() throws IOException;

    /* renamed from: f */
    public abstract Token mo9329f() throws IOException;

    /* renamed from: g */
    public abstract String mo9330g() throws IOException;

    /* renamed from: h */
    public abstract void mo9331h() throws IOException;

    /* renamed from: i */
    public abstract String mo9332i() throws IOException;

    /* renamed from: j */
    public abstract boolean mo9333j() throws IOException;

    /* renamed from: k */
    public abstract double mo9334k() throws IOException;

    /* renamed from: l */
    public abstract int mo9335l() throws IOException;

    /* renamed from: m */
    public abstract void mo9336m() throws IOException;

    /* renamed from: n */
    public final String mo9337n() {
        return C1894c.m8475a(this.f6508a, this.f6509b, this.f6510c, this.f6511d);
    }

    JsonReader() {
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f6507g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f6507g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: a */
    public static JsonReader m8455a(AbstractC69699e eVar) {
        return new C1895d(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1893b mo9322a(String str) throws C1893b {
        throw new C1893b(str + " at path " + mo9337n());
    }

    /* renamed from: com.airbnb.lottie.parser.moshi.JsonReader$a */
    public static final class C1891a {

        /* renamed from: a */
        final String[] f6514a;

        /* renamed from: b */
        final C69710l f6515b;

        /* renamed from: a */
        public static C1891a m8474a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                C69694c cVar = new C69694c();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.m8456a(cVar, strArr[i]);
                    cVar.readByte();
                    byteStringArr[i] = cVar.readByteString();
                }
                return new C1891a((String[]) strArr.clone(), C69710l.m267604a(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        private C1891a(String[] strArr, C69710l lVar) {
            this.f6514a = strArr;
            this.f6515b = lVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9324a(int i) {
        int i2 = this.f6508a;
        int[] iArr = this.f6509b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f6509b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f6510c;
                this.f6510c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f6511d;
                this.f6511d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new C1892a("Nesting too deep at " + mo9337n());
            }
        }
        int[] iArr3 = this.f6509b;
        int i3 = this.f6508a;
        this.f6508a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: a */
    public static void m8456a(AbstractC69698d dVar, String str) throws IOException {
        String str2;
        String[] strArr = f6507g;
        dVar.mo244562k(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                dVar.mo244531b(str, i, i2);
            }
            dVar.mo244530b(str2);
            i = i2 + 1;
        }
        if (i < length) {
            dVar.mo244531b(str, i, length);
        }
        dVar.mo244562k(34);
    }
}
