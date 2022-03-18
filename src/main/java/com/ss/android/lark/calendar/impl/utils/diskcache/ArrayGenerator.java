package com.ss.android.lark.calendar.impl.utils.diskcache;

import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C69043h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/ArrayGenerator;", "", "()V", "digest", "Ljava/security/MessageDigest;", "unit", "Lcom/ss/android/lark/calendar/impl/utils/diskcache/ArrayGenerator$DataUnit;", "getUnit", "()Lcom/ss/android/lark/calendar/impl/utils/diskcache/ArrayGenerator$DataUnit;", "setUnit", "(Lcom/ss/android/lark/calendar/impl/utils/diskcache/ArrayGenerator$DataUnit;)V", "genArKr", "", "id", "", "ar16", "", "kr12", "genKrData", "input", "getCaCipher", "getCipherRes", "DataUnit", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.a */
public final class ArrayGenerator {

    /* renamed from: a */
    public static final ArrayGenerator f83762a = new ArrayGenerator();

    /* renamed from: b */
    private static final MessageDigest f83763b;

    /* renamed from: c */
    private static volatile DataUnit f83764c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/ArrayGenerator$DataUnit;", "", "cacheBytesAr", "", "cacheBytesKr", "cacheId", "", "([B[BLjava/lang/String;)V", "getCacheBytesAr", "()[B", "setCacheBytesAr", "([B)V", "getCacheBytesKr", "setCacheBytesKr", "getCacheId", "()Ljava/lang/String;", "setCacheId", "(Ljava/lang/String;)V", "cipherRes", "getCipherRes", "setCipherRes", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.a$a */
    public static final class DataUnit {

        /* renamed from: a */
        private byte[] f83765a;

        /* renamed from: b */
        private byte[] f83766b;

        /* renamed from: c */
        private byte[] f83767c;

        /* renamed from: d */
        private String f83768d;

        /* renamed from: b */
        public final byte[] mo120338b() {
            return this.f83766b;
        }

        /* renamed from: c */
        public final byte[] mo120339c() {
            return this.f83767c;
        }

        /* renamed from: d */
        public final String mo120340d() {
            return this.f83768d;
        }

        /* renamed from: a */
        public final byte[] mo120337a() {
            return this.f83765a;
        }

        /* renamed from: a */
        public final void mo120336a(byte[] bArr) {
            this.f83765a = bArr;
        }

        public DataUnit(byte[] bArr, byte[] bArr2, String str) {
            Intrinsics.checkParameterIsNotNull(bArr, "cacheBytesAr");
            Intrinsics.checkParameterIsNotNull(bArr2, "cacheBytesKr");
            Intrinsics.checkParameterIsNotNull(str, "cacheId");
            this.f83766b = bArr;
            this.f83767c = bArr2;
            this.f83768d = str;
        }
    }

    private ArrayGenerator() {
    }

    static {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        Intrinsics.checkExpressionValueIsNotNull(instance, "MessageDigest.getInstance(\"MD5\")");
        f83763b = instance;
    }

    /* renamed from: a */
    private final byte[] m125287a(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            if (i2 >= 12) {
                break;
            }
            bArr2[i2] = (byte) (b + 105);
            i++;
            i2++;
        }
        return bArr2;
    }

    /* renamed from: a */
    public final DataUnit mo120333a(String str) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "id");
        DataUnit aVar = f83764c;
        if (aVar != null) {
            str2 = aVar.mo120340d();
        } else {
            str2 = null;
        }
        if (!(!Intrinsics.areEqual(str, str2))) {
            return aVar;
        }
        String str3 = str + "LARK_CALENDAR16BYTE";
        Charset charset = Charsets.f173341a;
        if (str3 != null) {
            byte[] bytes = str3.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] a = C69043h.m265721a(bytes, 0, 16);
            Charset charset2 = Charsets.f173341a;
            if (str3 != null) {
                byte[] bytes2 = str3.getBytes(charset2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                byte[] a2 = m125287a(bytes2);
                DataUnit aVar2 = new DataUnit(a, a2, str);
                try {
                    aVar2.mo120336a(m125288b(a, a2));
                } catch (Exception unused) {
                }
                f83764c = aVar2;
                return aVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    private final byte[] m125288b(byte[] bArr, byte[] bArr2) {
        Key a = CalendarAndroidKeyStore.f83769a.mo120341a();
        if (a == null) {
            return null;
        }
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, a, new GCMParameterSpec(SmActions.ACTION_ONTHECALL_EXIT, bArr2));
        byte[] doFinal = instance.doFinal(bArr);
        Intrinsics.checkExpressionValueIsNotNull(doFinal, "cipher.doFinal(ar16)");
        byte[] copyOf = Arrays.copyOf(doFinal, bArr.length);
        Intrinsics.checkExpressionValueIsNotNull(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        return copyOf;
    }

    /* renamed from: a */
    public final byte[] mo120335a(byte[] bArr, byte[] bArr2) {
        byte[] b;
        byte[] c;
        Intrinsics.checkParameterIsNotNull(bArr, "ar16");
        Intrinsics.checkParameterIsNotNull(bArr2, "kr12");
        DataUnit aVar = f83764c;
        if (aVar == null || (b = aVar.mo120338b()) == null || (c = aVar.mo120339c()) == null || !Arrays.equals(bArr, b) || !Arrays.equals(bArr2, c)) {
            return null;
        }
        return aVar.mo120337a();
    }

    /* renamed from: a */
    public final void mo120334a(String str, byte[] bArr, byte[] bArr2) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(bArr, "ar16");
        Intrinsics.checkParameterIsNotNull(bArr2, "kr12");
        DataUnit a = mo120333a(str);
        System.arraycopy(a.mo120338b(), 0, bArr, 0, 16);
        System.arraycopy(a.mo120339c(), 0, bArr2, 0, 12);
    }
}
