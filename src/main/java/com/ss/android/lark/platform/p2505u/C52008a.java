package com.ss.android.lark.platform.p2505u;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.tool.v1.DecryptSealRequest;
import com.bytedance.lark.pb.tool.v1.DecryptSealResponse;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.LarkContext;
import java.io.ByteArrayInputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* renamed from: com.ss.android.lark.platform.u.a */
public class C52008a extends AbstractBaseSettingHandler.UserSPCachedSettingHandler {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.u.a$a */
    public static class C52010a {

        /* renamed from: a */
        public static C52008a f129171a = new C52008a();
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
    /* renamed from: a */
    public String mo107772a() {
        return "seal_certificate_config";
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: b */
    public String mo107773b() {
        return "seal_certificate_config";
    }

    @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
    /* renamed from: c */
    public String mo107774c() {
        return "SealCertificateConfigHandler";
    }

    /* renamed from: d */
    public static C52008a m201787d() {
        return C52010a.f129171a;
    }

    /* renamed from: com.ss.android.lark.platform.u.a$c */
    public static class C52012c implements IAppSettingPlugin {
        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: b */
        public String mo107779b() {
            return "SealCertificateConfigHandler";
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: c */
        public boolean mo107780c() {
            return false;
        }

        @Override // com.ss.android.lark.larkconfig.export.plugin.IAppSettingPlugin
        /* renamed from: a */
        public Collection<AbstractBaseSettingHandler> mo107778a() {
            return new HashSet(Collections.singletonList(C52008a.m201787d()));
        }
    }

    private C52008a() {
        mo148402a(mo148411i().mo148421a(new Function1() {
            /* class com.ss.android.lark.platform.p2505u.$$Lambda$a$KP_lobWDlS4EijOqgt7gS6Ahhs */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C52008a.this.m201790h((String) obj);
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Unit m201790h(String str) {
        m201788f(str);
        return null;
    }

    /* renamed from: a */
    public PrivateKey mo178253a(String str) {
        C52011b g = m201789g(str);
        if (g != null) {
            return g.f129172a;
        }
        return null;
    }

    /* renamed from: d */
    public X509Certificate mo178256d(String str) {
        C52011b g = m201789g(str);
        if (g != null) {
            return g.f129173b;
        }
        return null;
    }

    /* renamed from: e */
    public List<String> mo178257e(String str) {
        List jSONArray = UserSP.getInstance().getJSONArray("seal_certificate_trust_host_" + str, String.class);
        if (!CollectionUtils.isEmpty(jSONArray)) {
            return new CopyOnWriteArrayList(jSONArray);
        }
        Log.m165389i("SealCertificateConfigHandler", "getTenantTrustHostList empty");
        return new CopyOnWriteArrayList();
    }

    /* renamed from: f */
    private void m201788f(String str) {
        JSONObject parseObject;
        try {
            if (!TextUtils.isEmpty(str) && (parseObject = JSONObject.parseObject(str)) != null) {
                String str2 = "seal_certificate_trust_host_" + C36083a.m141486a().getPassportDependency().mo133088g();
                JSONArray jSONArray = parseObject.getJSONArray(str2);
                if (jSONArray != null) {
                    if (jSONArray.isEmpty()) {
                        Log.m165389i("SealCertificateConfigHandler", "found target config, but it s empty");
                        UserSP.getInstance().remove(str2);
                        return;
                    }
                    int size = jSONArray.size();
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < size; i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                    UserSP.getInstance().putJSONArray(str2, arrayList);
                }
            }
        } catch (Exception e) {
            Log.m165391i("SealCertificateConfigHandler", e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[SYNTHETIC, Splitter:B:20:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[SYNTHETIC, Splitter:B:27:0x005b] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.lark.platform.p2505u.C52008a.C52011b m201789g(java.lang.String r5) {
        /*
            r4 = this;
            java.io.File r0 = new java.io.File
            android.app.Application r1 = com.ss.android.lark.utils.LarkContext.getApplication()
            android.content.Context r1 = r1.getApplicationContext()
            java.io.File r1 = r1.getFilesDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "seal_c_s"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            r2 = 0
            if (r1 != 0) goto L_0x002a
            return r2
        L_0x002a:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048, all -> 0x0046 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0048, all -> 0x0046 }
            java.lang.String r0 = "PKCS12"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0044 }
            char[] r3 = r5.toCharArray()     // Catch:{ Exception -> 0x0044 }
            r0.load(r1, r3)     // Catch:{ Exception -> 0x0044 }
            com.ss.android.lark.platform.u.a$b r5 = r4.m201785a(r0, r5)     // Catch:{ Exception -> 0x0044 }
            r1.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r5
        L_0x0044:
            r5 = move-exception
            goto L_0x004a
        L_0x0046:
            r5 = move-exception
            goto L_0x0059
        L_0x0048:
            r5 = move-exception
            r1 = r2
        L_0x004a:
            java.lang.String r0 = "SealCertificateConfigHandler"
            java.lang.String r3 = "getCacheSealCertStore failed"
            com.ss.android.lark.log.Log.m165384e(r0, r3, r5)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            return r2
        L_0x0057:
            r5 = move-exception
            r2 = r1
        L_0x0059:
            if (r2 == 0) goto L_0x005e
            r2.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.p2505u.C52008a.m201789g(java.lang.String):com.ss.android.lark.platform.u.a$b");
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.u.a$b */
    public static class C52011b {

        /* renamed from: a */
        public PrivateKey f129172a;

        /* renamed from: b */
        public X509Certificate f129173b;

        private C52011b(PrivateKey privateKey, X509Certificate x509Certificate) {
            this.f129172a = privateKey;
            this.f129173b = x509Certificate;
        }
    }

    /* renamed from: a */
    private C52011b m201785a(KeyStore keyStore, String str) {
        PrivateKey privateKey;
        X509Certificate x509Certificate;
        try {
            String nextElement = keyStore.aliases().nextElement();
            Key key = keyStore.getKey(nextElement, str.toCharArray());
            if (key instanceof PrivateKey) {
                privateKey = (PrivateKey) key;
                x509Certificate = (X509Certificate) keyStore.getCertificate(nextElement);
            } else {
                x509Certificate = null;
                privateKey = null;
            }
            if (!(privateKey == null || x509Certificate == null)) {
                return new C52011b(privateKey, x509Certificate);
            }
        } catch (Exception e) {
            Log.m165398w("SealCertificateConfigHandler", "analysisCertData failed", e);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo178255a(final Context context, Uri uri) {
        try {
            if (!TextUtils.equals(uri.getQueryParameter("tenant_id"), C36083a.m141486a().getPassportDependency().mo133088g())) {
                Log.m165397w("SealCertificateConfigHandler", "installSealCertificate failed, not the current tenant id.");
                return false;
            } else if (!"1".equals(uri.getQueryParameter(HiAnalyticsConstant.HaKey.BI_KEY_VERSION))) {
                Log.m165397w("SealCertificateConfigHandler", "installSealCertificate failed, current version not support.");
                return false;
            } else {
                String queryParameter = uri.getQueryParameter("r");
                if (TextUtils.isEmpty(queryParameter)) {
                    Log.m165397w("SealCertificateConfigHandler", "installSealCertificate failed, nonce is empty.");
                    return false;
                }
                String queryParameter2 = uri.getQueryParameter("public_key");
                if (TextUtils.isEmpty(queryParameter2)) {
                    Log.m165397w("SealCertificateConfigHandler", "installSealCertificate failed, public_key is empty.");
                    return false;
                }
                String queryParameter3 = uri.getQueryParameter("pkid");
                if (TextUtils.isEmpty(queryParameter3)) {
                    Log.m165397w("SealCertificateConfigHandler", "installSealCertificate failed, pkid is empty.");
                    return false;
                }
                String queryParameter4 = uri.getQueryParameter(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (TextUtils.isEmpty(queryParameter4)) {
                    Log.m165397w("SealCertificateConfigHandler", "installSealCertificate failed, data is empty.");
                    return false;
                }
                DecryptSealRequest.C19691a d = new DecryptSealRequest.C19691a().mo66764a(ByteString.of(Base64.decode(queryParameter3, 8))).mo66766b(ByteString.of(Base64.decode(queryParameter2, 8))).mo66767c(ByteString.of(Base64.decode(queryParameter, 8))).mo66768d(ByteString.of(Base64.decode(queryParameter4, 8)));
                Command command = Command.DECRYPT_SEAL_SECRET_DATA;
                C520091 r3 = new IGetDataCallback<DecryptSealResponse>() {
                    /* class com.ss.android.lark.platform.p2505u.C52008a.C520091 */

                    /* renamed from: a */
                    public void onSuccess(DecryptSealResponse decryptSealResponse) {
                        if (decryptSealResponse == null || decryptSealResponse.plaintext == null) {
                            Log.m165383e("SealCertificateConfigHandler", "DecryptSealResponse empty");
                        } else {
                            C52008a.this.mo178254a(context, decryptSealResponse.plaintext.toByteArray(), "");
                        }
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        Log.m165383e("SealCertificateConfigHandler", "DecryptSealResponse failed " + errorResult.toString());
                        LKUIToast.enableToast();
                        LKUIToast.show(LarkContext.getApplication().getApplicationContext(), errorResult.getDisplayMsg());
                    }
                };
                ProtoAdapter<DecryptSealResponse> protoAdapter = DecryptSealResponse.ADAPTER;
                protoAdapter.getClass();
                SdkSender.asynSendRequestNonWrap(command, d, r3, new SdkSender.IParser() {
                    /* class com.ss.android.lark.platform.p2505u.$$Lambda$pKACHgtlSLtKmXB1OyqFtJYVXA */

                    @Override // com.ss.android.lark.sdk.SdkSender.IParser
                    public final Object parse(byte[] bArr) {
                        return (DecryptSealResponse) ProtoAdapter.this.decode(bArr);
                    }
                });
                return true;
            }
        } catch (Exception e) {
            Log.m165398w("SealCertificateConfigHandler", "installSealCertificate failed", e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e A[SYNTHETIC, Splitter:B:22:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m201786a(android.content.Context r4, java.lang.String r5, java.security.KeyStore r6) {
        /*
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r4 = r4.getFilesDir()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "seal_c_s"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L_0x0023
            r0.delete()
        L_0x0023:
            r4 = 0
            r0.createNewFile()     // Catch:{ Exception -> 0x003d, all -> 0x0039 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x003d, all -> 0x0039 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x003d, all -> 0x0039 }
            char[] r4 = r5.toCharArray()     // Catch:{ Exception -> 0x0037 }
            r6.store(r1, r4)     // Catch:{ Exception -> 0x0037 }
        L_0x0033:
            r1.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004a
        L_0x0037:
            r4 = move-exception
            goto L_0x0040
        L_0x0039:
            r5 = move-exception
            r1 = r4
            r4 = r5
            goto L_0x004c
        L_0x003d:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L_0x0040:
            java.lang.String r5 = "SealCertificateConfigHandler"
            java.lang.String r6 = "storeTenantCertificateByKS failed"
            com.ss.android.lark.log.Log.m165384e(r5, r6, r4)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            return
        L_0x004b:
            r4 = move-exception
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0051:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.platform.p2505u.C52008a.m201786a(android.content.Context, java.lang.String, java.security.KeyStore):void");
    }

    /* renamed from: a */
    public void mo178254a(Context context, byte[] bArr, String str) {
        char[] cArr;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            KeyStore instance = KeyStore.getInstance("PKCS12");
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                cArr = null;
            }
            instance.load(byteArrayInputStream, cArr);
            if (m201785a(instance, str) != null) {
                m201786a(context, C36083a.m141486a().getPassportDependency().mo133088g(), instance);
            }
            byteArrayInputStream.close();
            LKUIToast.enableToast();
            LKUIToast.show(LarkContext.getApplication().getApplicationContext(), (int) R.string.Lark_Security_SealCertificationImported);
        } catch (Exception e) {
            Log.m165398w("SealCertificateConfigHandler", "analysisCertData failed", e);
            LKUIToast.enableToast();
            LKUIToast.show(LarkContext.getApplication().getApplicationContext(), e.getMessage());
        }
    }
}
