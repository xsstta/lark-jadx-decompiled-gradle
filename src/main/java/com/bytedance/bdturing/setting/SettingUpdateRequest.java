package com.bytedance.bdturing.setting;

import com.bytedance.bdturing.net.HttpClient;
import com.bytedance.frameworks.core.p747a.C14094b;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3469d.C69094e;
import kotlin.random.Random;
import kotlin.text.Charsets;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/bdturing/setting/SettingUpdateRequest;", "", "mUrl", "", "params", "", "mCallback", "Lcom/bytedance/bdturing/setting/SettingUpdateRequest$Callback;", "mHttpClient", "Lcom/bytedance/bdturing/net/HttpClient;", "(Ljava/lang/String;Ljava/util/Map;Lcom/bytedance/bdturing/setting/SettingUpdateRequest$Callback;Lcom/bytedance/bdturing/net/HttpClient;)V", "decryptResponse", "key", "", "iv", "responseStream", "Ljava/io/InputStream;", "generateKey", "Lkotlin/Pair;", "startGetResponse", "", "Callback", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.setting.f */
public final class SettingUpdateRequest {

    /* renamed from: a */
    private final String f11293a;

    /* renamed from: b */
    private final Map<String, String> f11294b;

    /* renamed from: c */
    private final Callback f11295c;

    /* renamed from: d */
    private final HttpClient f11296d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/bytedance/bdturing/setting/SettingUpdateRequest$Callback;", "", "onResponse", "", "responseCode", "", "responseContent", "", "duration", "", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bdturing.setting.f$a */
    public interface Callback {
        /* renamed from: a */
        void mo14278a(int i, String str, long j);
    }

    /* renamed from: b */
    private final Pair<byte[], byte[]> m15069b() {
        Random a = C69094e.m265885a(System.nanoTime());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            sb.append("qwertyuioplkjhgfdsamnbvcxz".charAt(a.mo239192b(26)));
            if (i < 16) {
                sb2.append("qwertyuioplkjhgfdsamnbvcxz".charAt(a.mo239192b(26)));
            }
        }
        String sb3 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb3, "key.toString()");
        Charset charset = Charsets.f173341a;
        if (sb3 != null) {
            byte[] bytes = sb3.getBytes(charset);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            String sb4 = sb2.toString();
            Intrinsics.checkExpressionValueIsNotNull(sb4, "iv.toString()");
            Charset charset2 = Charsets.f173341a;
            if (sb4 != null) {
                byte[] bytes2 = sb4.getBytes(charset2);
                Intrinsics.checkExpressionValueIsNotNull(bytes2, "(this as java.lang.String).getBytes(charset)");
                return new Pair<>(bytes, bytes2);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final void mo14395a() {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        String str = "";
        Pair<byte[], byte[]> b = m15069b();
        byte[] first = b.getFirst();
        byte[] second = b.getSecond();
        if (!(first == null || second == null)) {
            Map<String, String> map = this.f11294b;
            if (first == null) {
                Intrinsics.throwNpe();
            }
            map.put("key", new String(first, Charsets.f173341a));
            Map<String, String> map2 = this.f11294b;
            if (second == null) {
                Intrinsics.throwNpe();
            }
            map2.put("iv", new String(second, Charsets.f173341a));
        }
        try {
            String jSONObject = new JSONObject(this.f11294b).toString();
            Intrinsics.checkExpressionValueIsNotNull(jSONObject, "JSONObject(params).toString()");
            Charset charset = Charsets.f173341a;
            if (jSONObject != null) {
                byte[] bytes = jSONObject.getBytes(charset);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] a = C14094b.m57065a(bytes, bytes.length);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("Content-type", "application/octet-stream;tt-data=a");
                HttpClient aVar = this.f11296d;
                String str2 = this.f11293a;
                Intrinsics.checkExpressionValueIsNotNull(a, "encrypt");
                byte[] post = aVar.post(str2, linkedHashMap, a);
                if (post == null || post.length <= 0) {
                    i = 204;
                } else {
                    i = LocationRequest.PRIORITY_HD_ACCURACY;
                    str = m15068a(first, second, new ByteArrayInputStream(post));
                }
                this.f11295c.mo14278a(i, str, System.currentTimeMillis() - currentTimeMillis);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e) {
            i = ParticipantRepo.f117150c;
            e.printStackTrace();
        } catch (Throwable th) {
            this.f11295c.mo14278a(ParticipantRepo.f117150c, str, System.currentTimeMillis() - currentTimeMillis);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0050, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        kotlin.io.C69101b.m265907a(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        throw r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m15068a(byte[] r3, byte[] r4, java.io.InputStream r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0055
            if (r4 != 0) goto L_0x0005
            goto L_0x0055
        L_0x0005:
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r1 = "AES"
            r0.<init>(r3, r1)
            javax.crypto.spec.IvParameterSpec r3 = new javax.crypto.spec.IvParameterSpec
            r3.<init>(r4)
            java.lang.String r4 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)
            r1 = 2
            java.security.Key r0 = (java.security.Key) r0
            java.security.spec.AlgorithmParameterSpec r3 = (java.security.spec.AlgorithmParameterSpec) r3
            r4.init(r1, r0, r3)
            byte[] r3 = kotlin.io.C69100a.m265906a(r5)
            byte[] r3 = r4.doFinal(r3)
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r3)
            java.io.InputStream r5 = (java.io.InputStream) r5
            r4.<init>(r5)
            java.io.Closeable r4 = (java.io.Closeable) r4
            r3 = 0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5 = r4
            java.util.zip.GZIPInputStream r5 = (java.util.zip.GZIPInputStream) r5     // Catch:{ all -> 0x004e }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x004e }
            java.io.InputStream r5 = (java.io.InputStream) r5     // Catch:{ all -> 0x004e }
            r0.<init>(r5)     // Catch:{ all -> 0x004e }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ all -> 0x004e }
            java.lang.String r5 = kotlin.io.C69111n.m265945b(r0)     // Catch:{ all -> 0x004e }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x004e }
            kotlin.io.C69101b.m265907a(r4, r3)
            return r5
        L_0x004e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r5 = move-exception
            kotlin.io.C69101b.m265907a(r4, r3)
            throw r5
        L_0x0055:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r5)
            java.io.Reader r3 = (java.io.Reader) r3
            java.lang.String r3 = kotlin.io.C69111n.m265945b(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.setting.SettingUpdateRequest.m15068a(byte[], byte[], java.io.InputStream):java.lang.String");
    }

    public SettingUpdateRequest(String str, Map<String, String> map, Callback aVar, HttpClient aVar2) {
        Intrinsics.checkParameterIsNotNull(str, "mUrl");
        Intrinsics.checkParameterIsNotNull(map, "params");
        Intrinsics.checkParameterIsNotNull(aVar, "mCallback");
        Intrinsics.checkParameterIsNotNull(aVar2, "mHttpClient");
        this.f11293a = str;
        this.f11294b = map;
        this.f11295c = aVar;
        this.f11296d = aVar2;
    }
}
