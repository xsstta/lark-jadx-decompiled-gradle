package com.bytedance.kit.nglynx.compatible;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/bytedance/kit/nglynx/compatible/CardConfig;", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "id", "path", "desc", "fetchRes", "", "resPrefix", "", "extra", "Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lorg/json/JSONObject;)V", "getDesc", "()Ljava/lang/String;", "getExtra", "()Lorg/json/JSONObject;", "getFetchRes", "()Z", "getId", "getPath", "getResPrefix", "()Ljava/util/List;", "getVersion", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.a.a */
public final class CardConfig {

    /* renamed from: a */
    private final String f38528a;

    /* renamed from: b */
    private final String f38529b;

    /* renamed from: c */
    private final String f38530c;

    /* renamed from: d */
    private final String f38531d;

    /* renamed from: e */
    private final boolean f38532e;

    /* renamed from: f */
    private final List<String> f38533f;

    /* renamed from: g */
    private final JSONObject f38534g;

    /* renamed from: a */
    public final List<String> mo53711a() {
        return this.f38533f;
    }

    public CardConfig(String str, String str2, String str3, String str4, boolean z, List<String> list, JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, HiAnalyticsConstant.HaKey.BI_KEY_VERSION);
        Intrinsics.checkParameterIsNotNull(str2, "id");
        Intrinsics.checkParameterIsNotNull(str3, "path");
        this.f38528a = str;
        this.f38529b = str2;
        this.f38530c = str3;
        this.f38531d = str4;
        this.f38532e = z;
        this.f38533f = list;
        this.f38534g = jSONObject;
    }
}
