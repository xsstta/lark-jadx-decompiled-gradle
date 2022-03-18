package com.bytedance.bdturing.setting;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/bytedance/bdturing/setting/DefaultSettings;", "", "()V", "SETTINGS", "Lorg/json/JSONObject;", "getSETTINGS", "()Lorg/json/JSONObject;", "raw", "", "getRaw", "()Ljava/lang/String;", "raw$delegate", "Lkotlin/Lazy;", "setting_i18nRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.bdturing.setting.c */
public final class DefaultSettings {

    /* renamed from: a */
    public static final DefaultSettings f11289a;

    /* renamed from: b */
    private static final Lazy f11290b = LazyKt.lazy(C3572a.INSTANCE);

    /* renamed from: c */
    private static final JSONObject f11291c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.bdturing.setting.c$a */
    static final class C3572a extends Lambda implements Function0<String> {
        public static final C3572a INSTANCE = new C3572a();

        C3572a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "{\n    \"common\": {\n        \"period\": 300000, \n        \"alpha\": \"0.5\",\n        \"retry_count\":3,\n        \"retry_interval\":2000,\n        \"rgb\": \"000000\",\n        \"skip_launch\":0, \n        \"use_jsb_request\":0, \n        \"pre_create\":0,\n        \"request_encrypt\":0, \n        \"host\": {\n            \"va\": \"https://vcs-va.byteoversea.com/\",\n            \"sg\": \"https://vcs-sg.byteoversea.com/\",\n            \"in\":\"https://vcs-va-useast2a.byteoversea.com/\"\n        },\n        \"back_up_host\": {\n            \"va\": \"https://vcs-va.byteoversea.com/\",\n            \"sg\": \"https://vcs-sg.byteoversea.com/\",\n            \"in\":\"https://vcs-va-useast2a.byteoversea.com/\"\n        }\n    },\n    \"verify\": {\n        \"host\": {\n            \"va\": \"https://verification-va.byteoversea.com/\",\n            \"sg\": \"https://verify-sg.byteoversea.com/\",\n            \"in\":\"https://verification-va-useast2a.byteoversea.com/\"\n        },\n        \"url\": {\n            \"va\": \"https://sf16-scmcdn-va.ibytedtos.com/obj/static-us/secsdk-captcha/va/2.21.2/index.html\",\n            \"sg\": \"https://sf16-scmcdn-sg.ibytedtos.com/obj/static-sg/secsdk-captcha/sg/2.21.2/index.html\",\n            \"in\": \"https://sf16-scmcdn-useast2a.ibytedtos.com/obj/static-aiso/secsdk-captcha/in/2.21.2/index.html\"\n        },\n      \"height\": 303,\n      \"width\": 300\n    }\n}";
        }
    }

    /* renamed from: b */
    private final String m15063b() {
        return (String) f11290b.getValue();
    }

    private DefaultSettings() {
    }

    /* renamed from: a */
    public final JSONObject mo14391a() {
        return f11291c;
    }

    static {
        DefaultSettings cVar = new DefaultSettings();
        f11289a = cVar;
        f11291c = new JSONObject(cVar.m15063b());
    }
}
