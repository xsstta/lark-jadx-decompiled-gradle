package com.bytedance.ies.bullet.service.base;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B9\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "", "bizTag", "", "virtualAID", "containerName", "commonCategory", "Lorg/json/JSONObject;", "commonData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "getBizTag", "()Ljava/lang/String;", "getCommonCategory", "()Lorg/json/JSONObject;", "getCommonData", "getContainerName", "getVirtualAID", "Builder", "Companion", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ies.bullet.service.base.k */
public final class MonitorConfig {

    /* renamed from: a */
    public static final MonitorConfig f37875a = new MonitorConfig("", null, null, null, null);

    /* renamed from: b */
    public static final Companion f37876b = new Companion(null);

    /* renamed from: c */
    private final String f37877c;

    /* renamed from: d */
    private final String f37878d;

    /* renamed from: e */
    private final String f37879e;

    /* renamed from: f */
    private final JSONObject f37880f;

    /* renamed from: g */
    private final JSONObject f37881g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/MonitorConfig$Companion;", "", "()V", "DEFAULT", "Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "getDEFAULT", "()Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.k$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo52671a() {
        return this.f37877c;
    }

    /* renamed from: b */
    public final String mo52672b() {
        return this.f37878d;
    }

    /* renamed from: c */
    public final String mo52673c() {
        return this.f37879e;
    }

    /* renamed from: d */
    public final JSONObject mo52674d() {
        return this.f37880f;
    }

    /* renamed from: e */
    public final JSONObject mo52675e() {
        return this.f37881g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/bytedance/ies/bullet/service/base/MonitorConfig$Builder;", "", "()V", "bizTag", "", "getBizTag", "()Ljava/lang/String;", "setBizTag", "(Ljava/lang/String;)V", "commonCategory", "Lorg/json/JSONObject;", "getCommonCategory", "()Lorg/json/JSONObject;", "setCommonCategory", "(Lorg/json/JSONObject;)V", "commonData", "getCommonData", "setCommonData", "containerName", "getContainerName", "setContainerName", "virtualAID", "getVirtualAID", "setVirtualAID", "tag", "build", "Lcom/bytedance/ies/bullet/service/base/MonitorConfig;", "category", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "name", "aid", "x-servicecenter_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ies.bullet.service.base.k$a */
    public static final class Builder {

        /* renamed from: a */
        private String f37882a = "";

        /* renamed from: b */
        private String f37883b;

        /* renamed from: c */
        private JSONObject f37884c;

        /* renamed from: d */
        private String f37885d;

        /* renamed from: e */
        private JSONObject f37886e;

        /* renamed from: a */
        public final MonitorConfig mo52677a() {
            return new MonitorConfig(this.f37882a, this.f37883b, this.f37885d, this.f37886e, this.f37884c, null);
        }

        /* renamed from: a */
        public final Builder mo52676a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            this.f37885d = str;
            return this;
        }
    }

    private MonitorConfig(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f37877c = str;
        this.f37878d = str2;
        this.f37879e = str3;
        this.f37880f = jSONObject;
        this.f37881g = jSONObject2;
    }

    public /* synthetic */ MonitorConfig(String str, String str2, String str3, JSONObject jSONObject, JSONObject jSONObject2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, jSONObject, jSONObject2);
    }
}
