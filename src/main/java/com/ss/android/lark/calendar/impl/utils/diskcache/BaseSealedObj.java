package com.ss.android.lark.calendar.impl.utils.diskcache;

import com.ss.android.ttvecamera.p3038g.C60375c;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/BaseSealedObj;", "Ljava/io/Serializable;", "obj", C60375c.f150914a, "Ljavax/crypto/Cipher;", "(Ljava/io/Serializable;Ljavax/crypto/Cipher;)V", "encryptedContent", "", "getObject", "", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BaseSealedObj implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 2;
    private byte[] encryptedContent;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/utils/diskcache/BaseSealedObj$Companion;", "", "()V", "serialVersionUID", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.utils.diskcache.BaseSealedObj$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        kotlin.p3465a.C69027a.m265650a(r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getObject(javax.crypto.Cipher r4) throws java.io.IOException, java.lang.ClassNotFoundException, javax.crypto.IllegalBlockSizeException, javax.crypto.BadPaddingException {
        /*
            r3 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            byte[] r0 = r3.encryptedContent
            byte[] r4 = r4.doFinal(r0)
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r4)
            com.ss.android.lark.calendar.impl.utils.diskcache.d r4 = new com.ss.android.lark.calendar.impl.utils.diskcache.d
            java.io.InputStream r0 = (java.io.InputStream) r0
            r4.<init>(r0)
            java.io.ObjectInput r4 = (java.io.ObjectInput) r4
            java.lang.AutoCloseable r4 = (java.lang.AutoCloseable) r4
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1 = r4
            java.io.ObjectInput r1 = (java.io.ObjectInput) r1     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r1.readObject()     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "a.readObject()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)     // Catch:{ all -> 0x0033 }
            kotlin.p3465a.C69027a.m265650a(r4, r0)
            java.lang.String r4 = "a.use { a ->\n            a.readObject()\n        }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            return r1
        L_0x0033:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r1 = move-exception
            kotlin.p3465a.C69027a.m265650a(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.utils.diskcache.BaseSealedObj.getObject(javax.crypto.Cipher):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        kotlin.p3465a.C69027a.m265650a(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BaseSealedObj(java.io.Serializable r5, javax.crypto.Cipher r6) throws java.io.IOException, javax.crypto.IllegalBlockSizeException {
        /*
            r4 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            r4.<init>()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            r2 = r0
            java.io.OutputStream r2 = (java.io.OutputStream) r2
            r1.<init>(r2)
            java.io.ObjectOutput r1 = (java.io.ObjectOutput) r1
            java.lang.AutoCloseable r1 = (java.lang.AutoCloseable) r1
            r2 = 0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3 = r1
            java.io.ObjectOutput r3 = (java.io.ObjectOutput) r3     // Catch:{ all -> 0x003d }
            r3.writeObject(r5)     // Catch:{ all -> 0x003d }
            r3.flush()     // Catch:{ all -> 0x003d }
            byte[] r5 = r0.toByteArray()     // Catch:{ all -> 0x003d }
            java.lang.String r0 = "b.toByteArray()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)     // Catch:{ all -> 0x003d }
            kotlin.p3465a.C69027a.m265650a(r1, r2)
            java.lang.String r0 = "a.use { a ->\n           …b.toByteArray()\n        }"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r0)
            byte[] r5 = r6.doFinal(r5)     // Catch:{ BadPaddingException -> 0x003c }
            r4.encryptedContent = r5     // Catch:{ BadPaddingException -> 0x003c }
        L_0x003c:
            return
        L_0x003d:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003f }
        L_0x003f:
            r6 = move-exception
            kotlin.p3465a.C69027a.m265650a(r1, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.utils.diskcache.BaseSealedObj.<init>(java.io.Serializable, javax.crypto.Cipher):void");
    }
}
