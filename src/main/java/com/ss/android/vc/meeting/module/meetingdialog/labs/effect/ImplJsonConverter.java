package com.ss.android.vc.meeting.module.meetingdialog.labs.effect;

import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J+\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\u0016¢\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\n2\u0006\u0010\u0011\u001a\u0002H\nH\u0016¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/vc/meeting/module/meetingdialog/labs/effect/ImplJsonConverter;", "Lcom/ss/android/ugc/effectmanager/common/listener/IJsonConverter;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "gson", "Lcom/google/gson/Gson;", "convertJsonToObj", "T", "json", "Ljava/io/InputStream;", "cls", "Ljava/lang/Class;", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Object;", "convertObjToJson", "object", "(Ljava/lang/Object;)Ljava/lang/String;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.e */
public final class ImplJsonConverter implements AbstractC60510b {

    /* renamed from: a */
    private final String f156368a = "ImplJsonConverter";

    /* renamed from: b */
    private final Gson f156369b = new Gson();

    @Override // com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b
    /* renamed from: a */
    public <T> String mo207189a(T t) throws Exception {
        String json = this.f156369b.toJson((Object) t);
        Intrinsics.checkExpressionValueIsNotNull(json, "gson.toJson(`object`)");
        return json;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC, Splitter:B:20:0x0043] */
    @Override // com.ss.android.ugc.effectmanager.common.p3048c.AbstractC60510b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T mo207188a(java.io.InputStream r4, java.lang.Class<T> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r0)
            java.lang.String r0 = "cls"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r0)
            r0 = 0
            com.google.gson.stream.JsonReader r0 = (com.google.gson.stream.JsonReader) r0
            com.google.gson.stream.JsonReader r1 = new com.google.gson.stream.JsonReader     // Catch:{ JsonSyntaxException -> 0x0032 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ JsonSyntaxException -> 0x0032 }
            r2.<init>(r4)     // Catch:{ JsonSyntaxException -> 0x0032 }
            java.io.Reader r2 = (java.io.Reader) r2     // Catch:{ JsonSyntaxException -> 0x0032 }
            r1.<init>(r2)     // Catch:{ JsonSyntaxException -> 0x0032 }
            com.google.gson.Gson r4 = r3.f156369b     // Catch:{ JsonSyntaxException -> 0x002d, all -> 0x002a }
            java.lang.reflect.Type r5 = (java.lang.reflect.Type) r5     // Catch:{ JsonSyntaxException -> 0x002d, all -> 0x002a }
            java.lang.Object r4 = r4.fromJson(r1, r5)     // Catch:{ JsonSyntaxException -> 0x002d, all -> 0x002a }
            r1.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0029:
            return r4
        L_0x002a:
            r4 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x002d:
            r4 = move-exception
            r0 = r1
            goto L_0x0033
        L_0x0030:
            r4 = move-exception
            goto L_0x0041
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            java.lang.String r5 = r3.f156368a     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "[convertJsonToObj]"
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0030 }
            com.ss.android.vc.common.p3077b.C60700b.m235864f(r5, r1, r2)     // Catch:{ all -> 0x0030 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0030 }
            throw r4     // Catch:{ all -> 0x0030 }
        L_0x0041:
            if (r0 == 0) goto L_0x004b
            r0.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r5 = move-exception
            r5.printStackTrace()
        L_0x004b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.effect.ImplJsonConverter.mo207188a(java.io.InputStream, java.lang.Class):java.lang.Object");
    }
}
