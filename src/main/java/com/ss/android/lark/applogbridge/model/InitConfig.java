package com.ss.android.lark.applogbridge.model;

import com.bytedance.applog.network.AbstractC3450b;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.p216c.AbstractC3586a;
import com.ss.android.lark.log.Log;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BO\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/ss/android/lark/applogbridge/model/InitConfig;", "", "appId", "", "channel", "", "networkClient", "Lcom/bytedance/common/utility/NetworkClient;", "sdkDomain", "sendUrls", "", "enableConfiger", "", "encryptor", "Lcom/bytedance/mpaas/IEncryptor;", "(ILjava/lang/String;Lcom/bytedance/common/utility/NetworkClient;Ljava/lang/String;Ljava/util/List;ZLcom/bytedance/mpaas/IEncryptor;)V", "TAG", "getAppId", "()I", "setAppId", "(I)V", "getChannel", "()Ljava/lang/String;", "setChannel", "(Ljava/lang/String;)V", "getEnableConfiger", "()Z", "setEnableConfiger", "(Z)V", "getEncryptor", "()Lcom/bytedance/mpaas/IEncryptor;", "setEncryptor", "(Lcom/bytedance/mpaas/IEncryptor;)V", "Lcom/bytedance/applog/network/INetworkClient;", "getNetworkClient", "()Lcom/bytedance/applog/network/INetworkClient;", "setNetworkClient", "(Lcom/bytedance/applog/network/INetworkClient;)V", "getSdkDomain", "setSdkDomain", "getSendUrls", "()Ljava/util/List;", "setSendUrls", "(Ljava/util/List;)V", "applog-bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.applogbridge.b.a */
public final class InitConfig {

    /* renamed from: a */
    public final String f73078a = "InitConfig";

    /* renamed from: b */
    private int f73079b;

    /* renamed from: c */
    private String f73080c;

    /* renamed from: d */
    private AbstractC3450b f73081d;

    /* renamed from: e */
    private String f73082e;

    /* renamed from: f */
    private List<String> f73083f;

    /* renamed from: g */
    private boolean f73084g = true;

    /* renamed from: h */
    private AbstractC3586a f73085h;

    /* renamed from: a */
    public final int mo103495a() {
        return this.f73079b;
    }

    /* renamed from: b */
    public final String mo103496b() {
        return this.f73080c;
    }

    /* renamed from: c */
    public final AbstractC3450b mo103497c() {
        return this.f73081d;
    }

    /* renamed from: d */
    public final String mo103498d() {
        return this.f73082e;
    }

    /* renamed from: e */
    public final List<String> mo103499e() {
        return this.f73083f;
    }

    /* renamed from: f */
    public final AbstractC3586a mo103500f() {
        return this.f73085h;
    }

    public InitConfig(int i, String str, final NetworkClient networkClient, String str2, List<String> list, boolean z, AbstractC3586a aVar) {
        this.f73079b = i;
        this.f73080c = str;
        this.f73082e = str2;
        this.f73083f = list;
        this.f73084g = z;
        this.f73085h = aVar;
        if (networkClient != null) {
            this.f73081d = new AbstractC3450b(this) {
                /* class com.ss.android.lark.applogbridge.model.InitConfig.C292021 */

                /* renamed from: a */
                final /* synthetic */ InitConfig f73086a;

                {
                    this.f73086a = r1;
                }

                @Override // com.bytedance.applog.network.AbstractC3450b
                /* renamed from: a */
                public String mo13885a(String str, Map<String, String> map) {
                    NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
                    reqContext.addCommonParams = true;
                    String str2 = networkClient.get(str, map, reqContext);
                    Log.m165379d(this.f73086a.f73078a, str2);
                    Intrinsics.checkExpressionValueIsNotNull(str2, "proxyResponse");
                    return str2;
                }

                @Override // com.bytedance.applog.network.AbstractC3450b
                /* renamed from: a */
                public String mo13886a(String str, byte[] bArr, String str2) {
                    String post = networkClient.post(str, bArr, false, str2, true);
                    Log.m165379d(this.f73086a.f73078a, post);
                    Intrinsics.checkExpressionValueIsNotNull(post, "proxyResponse");
                    return post;
                }

                @Override // com.bytedance.applog.network.AbstractC3450b
                /* renamed from: b */
                public byte[] mo13888b(String str, byte[] bArr, Map<String, String> map) {
                    boolean z;
                    NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
                    reqContext.addCommonParams = true;
                    byte[] postDataStream = networkClient.postDataStream(str, bArr, map, reqContext);
                    if (postDataStream != null) {
                        if (postDataStream.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            Log.m165379d(this.f73086a.f73078a, postDataStream.toString());
                        }
                    }
                    Intrinsics.checkExpressionValueIsNotNull(postDataStream, "proxyResponse");
                    return postDataStream;
                }

                @Override // com.bytedance.applog.network.AbstractC3450b
                /* renamed from: a */
                public String mo13887a(String str, byte[] bArr, Map<String, String> map) {
                    NetworkClient.ReqContext reqContext = new NetworkClient.ReqContext();
                    reqContext.addCommonParams = true;
                    String post = networkClient.post(str, bArr, map, reqContext);
                    Log.m165379d(this.f73086a.f73078a, post);
                    Intrinsics.checkExpressionValueIsNotNull(post, "proxyResponse");
                    return post;
                }
            };
        }
    }
}
