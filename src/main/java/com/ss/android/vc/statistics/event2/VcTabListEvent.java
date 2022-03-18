package com.ss.android.vc.statistics.event2;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.statistics.p3183d.C63728b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/statistics/event2/VcTabListEvent;", "", "()V", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.aj */
public final class VcTabListEvent {

    /* renamed from: a */
    public static final Companion f160819a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final void m249755a(String str) {
        f160819a.mo220253a(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249756a(String str, String str2) {
        Companion.m249758a(f160819a, str, str2, null, null, 12, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m249757a(String str, String str2, String str3) {
        Companion.m249758a(f160819a, str, str2, str3, null, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/statistics/event2/VcTabListEvent$Companion;", "", "()V", "TAG", "", "sendClickEvent", "", "envId", "clickName", "target", "extraParams", "", "sendPageViewEvent", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.statistics.b.aj$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220253a(String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("env_id", str);
                }
                C63728b.m249928a("vc_tab_list_view", jSONObject, null);
            } catch (JSONException e) {
                C60700b.m235851b("VcTabListEvent@", "[sendPageViewEvent]", "exception = " + e.getMessage());
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo220254a(String str, String str2, String str3, Map<String, String> map) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str2, "clickName");
            try {
                JSONObject jSONObject = new JSONObject();
                boolean z2 = false;
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jSONObject.put("env_id", str);
                    }
                }
                String str4 = str3;
                if (str4 == null || str4.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    str3 = "none";
                }
                jSONObject.put("target", str3);
                jSONObject.put("click", str2);
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                }
                C63728b.m249928a("vc_tab_list_click", jSONObject, null);
            } catch (JSONException e) {
                C60700b.m235851b("VcTabListEvent@", "[sendClickEvent]", "exception = " + e.getMessage());
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.vc.statistics.b.aj$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m249758a(Companion aVar, String str, String str2, String str3, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                map = null;
            }
            aVar.mo220254a(str, str2, str3, map);
        }
    }
}
