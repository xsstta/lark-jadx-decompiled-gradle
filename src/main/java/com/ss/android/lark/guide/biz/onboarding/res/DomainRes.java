package com.ss.android.lark.guide.biz.onboarding.res;

import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/DomainRes;", "", "resMap", "", "", "Lcom/ss/android/lark/guide/biz/onboarding/res/ResItem;", "(Ljava/util/Map;)V", "getResItem", "resKey", "getString", "locale", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.e */
public final class DomainRes {

    /* renamed from: a */
    public static final Companion f99161a = new Companion(null);

    /* renamed from: b */
    private final Map<String, ResItem> f99162b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/DomainRes$Companion;", "", "()V", "KEY_RES", "", "TAG", "parse", "Lcom/ss/android/lark/guide/biz/onboarding/res/DomainRes;", "jsonString", "jsonObj", "Lorg/json/JSONObject;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.res.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DomainRes mo141356a(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            try {
                return mo141357a(new JSONObject(str));
            } catch (Exception e) {
                Log.m165384e("DomainRes", "parse json err", e);
                return null;
            }
        }

        /* renamed from: a */
        public final DomainRes mo141357a(JSONObject jSONObject) {
            boolean z;
            Iterator<String> keys;
            ResItem a;
            if (jSONObject != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("res");
                    HashMap hashMap = new HashMap();
                    if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                            if (!(optJSONObject2 == null || (a = ResItem.f99166a.mo141367a(optJSONObject2)) == null)) {
                                Intrinsics.checkExpressionValueIsNotNull(next, "resKey");
                                hashMap.put(next, a);
                            }
                        }
                    }
                    if (hashMap.size() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        hashMap = null;
                    }
                    if (hashMap != null) {
                        return new DomainRes(hashMap);
                    }
                    return null;
                } catch (Exception e) {
                    Log.m165384e("DomainRes", "parse json err", e);
                }
            }
            return null;
        }
    }

    public DomainRes(Map<String, ResItem> map) {
        Intrinsics.checkParameterIsNotNull(map, "resMap");
        this.f99162b = map;
    }

    /* renamed from: a */
    public final String mo141355a(String str, String str2) {
        boolean z;
        ResItem oVar;
        String str3 = str;
        boolean z2 = false;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str4 = str2;
        if (str4 == null || str4.length() == 0) {
            z2 = true;
        }
        if (!z2 && (oVar = this.f99162b.get(str)) != null) {
            return oVar.mo141366a(str2);
        }
        return null;
    }
}
