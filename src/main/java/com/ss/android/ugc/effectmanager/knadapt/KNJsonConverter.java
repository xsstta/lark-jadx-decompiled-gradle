package com.ss.android.ugc.effectmanager.knadapt;

import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import com.ss.ugc.effectplatform.bridge.jsonconverter.IAndroidJsonConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\u0016¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u0004\u0018\u00010\b\"\u0004\b\u0000\u0010\u00062\u0006\u0010\r\u001a\u0002H\u0006H\u0016¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNJsonConverter;", "Lcom/ss/ugc/effectplatform/bridge/jsonconverter/IAndroidJsonConverter;", "jsonConverter", "Lcom/ss/android/ugc/effectmanager/common/listener/IJsonConverter;", "(Lcom/ss/android/ugc/effectmanager/common/listener/IJsonConverter;)V", "convertJsonToObj", "T", "json", "", "cls", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "convertObjToJson", "object", "(Ljava/lang/Object;)Ljava/lang/String;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.d */
public final class KNJsonConverter implements IAndroidJsonConverter {

    /* renamed from: a */
    private final AbstractC60510b f151438a;

    @Override // com.ss.ugc.effectplatform.bridge.jsonconverter.IAndroidJsonConverter
    /* renamed from: a */
    public <T> String mo207365a(T t) {
        return this.f151438a.mo207189a(t);
    }

    public KNJsonConverter(AbstractC60510b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "jsonConverter");
        this.f151438a = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        kotlin.io.C69101b.m265907a(r2, r6);
     */
    @Override // com.ss.ugc.effectplatform.bridge.jsonconverter.IAndroidJsonConverter
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo207364a(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            java.lang.String r0 = "cls"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r7, r0)
            java.nio.charset.Charset r0 = kotlin.text.Charsets.f173341a
            byte[] r0 = r6.getBytes(r0)
            java.lang.String r1 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = 0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r3 = r2
            java.io.ByteArrayInputStream r3 = (java.io.ByteArrayInputStream) r3     // Catch:{ all -> 0x003c }
            com.ss.android.ugc.effectmanager.common.c.b r3 = r5.f151438a     // Catch:{ all -> 0x003c }
            java.nio.charset.Charset r4 = kotlin.text.Charsets.f173341a     // Catch:{ all -> 0x003c }
            byte[] r6 = r6.getBytes(r4)     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r6, r1)     // Catch:{ all -> 0x003c }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x003c }
            r1.<init>(r6)     // Catch:{ all -> 0x003c }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x003c }
            java.lang.Object r6 = r3.mo207188a(r1, r7)     // Catch:{ all -> 0x003c }
            kotlin.io.C69101b.m265907a(r2, r0)
            return r6
        L_0x003c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x003e }
        L_0x003e:
            r7 = move-exception
            kotlin.io.C69101b.m265907a(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter.mo207364a(java.lang.String, java.lang.Class):java.lang.Object");
    }
}
