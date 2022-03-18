package com.ss.android.lark.larkconfig.larksetting.handler.p2113g;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import com.ss.android.lark.larkconfig.larksetting.handler.p2113g.C41191a;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.utils.DyResUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.g.a */
public class C41191a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.g.a$a */
    public static class C41192a {

        /* renamed from: a */
        public static C41193b f104970a = new C41193b();

        /* renamed from: b */
        public static Map<String, String> f104971b = new HashMap();
    }

    /* renamed from: a */
    public static AbstractBaseSettingHandler m163406a() {
        return C41192a.f104970a;
    }

    static {
        DyResUtils.DyResDependencyAPi.f142246a.mo195943a($$Lambda$fysHrK4uv7WvSkYSQcbSc2Xbfvw.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.larkconfig.larksetting.handler.g.a$b */
    public static class C41193b extends AbstractBaseSettingHandler {
        @Override // com.ss.android.lark.larkconfig.export.handler.IBaseSettingHandler
        /* renamed from: a */
        public String mo107772a() {
            return "guide_config_data";
        }

        @Override // com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler
        /* renamed from: c */
        public String mo107774c() {
            return "ResHandler";
        }

        public C41193b() {
            mo148402a(mo148411i().mo148421a(new Function1() {
                /* class com.ss.android.lark.larkconfig.larksetting.handler.p2113g.$$Lambda$a$b$dPOT0XVzDJrMIxASrsKshdnaXQ */

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C41191a.C41193b.this.m163410d((String) obj);
                }
            }));
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d */
        private /* synthetic */ Unit m163410d(String str) {
            m163408a(str);
            return null;
        }

        /* renamed from: a */
        private void m163408a(String str) {
            try {
                m163409a(new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE));
            } catch (JSONException e) {
                C53241h.m205895a("ResHandler", "parse json guide_config_data err", e);
            } catch (Exception e2) {
                C53241h.m205895a("ResHandler", "parseData err", e2);
            }
        }

        /* renamed from: a */
        private void m163409a(JSONObject jSONObject) {
            if (jSONObject == null) {
                C53241h.m205894a("ResHandler", "parseRes dataObj is null");
                return;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    C41192a.f104971b.put(next, optString);
                }
            }
        }
    }

    /* renamed from: a */
    public static String m163407a(String str) {
        return C41192a.f104971b.get(str);
    }
}
