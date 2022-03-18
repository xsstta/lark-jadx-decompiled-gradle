package com.ss.android.lark.guide.biz.onboarding.res;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/ResItem;", "", ShareHitPoint.f121869d, "", "valueMap", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getType", "getValue", "locale", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.res.o */
public final class ResItem {

    /* renamed from: a */
    public static final Companion f99166a = new Companion(null);

    /* renamed from: b */
    private final String f99167b;

    /* renamed from: c */
    private final Map<String, String> f99168c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/res/ResItem$Companion;", "", "()V", "KEY_TYPE", "", "KEY_VALUE", "TAG", "parse", "Lcom/ss/android/lark/guide/biz/onboarding/res/ResItem;", "jsonString", "jsonObj", "Lorg/json/JSONObject;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.res.o$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ResItem mo141367a(JSONObject jSONObject) {
            boolean z;
            Iterator<String> keys;
            if (jSONObject != null) {
                try {
                    String optString = jSONObject.optString(ShareHitPoint.f121869d);
                    JSONObject optJSONObject = jSONObject.optJSONObject("value");
                    HashMap hashMap = new HashMap();
                    if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Intrinsics.checkExpressionValueIsNotNull(next, "key");
                            String optString2 = optJSONObject.optString(next);
                            Intrinsics.checkExpressionValueIsNotNull(optString2, "value.optString(key)");
                            hashMap.put(next, optString2);
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
                    if (hashMap == null) {
                        return null;
                    }
                    Intrinsics.checkExpressionValueIsNotNull(optString, ShareHitPoint.f121869d);
                    return new ResItem(optString, hashMap);
                } catch (Exception e) {
                    Log.m165384e("ResItem", "parse json err", e);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final String mo141366a(String str) {
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
        return this.f99168c.get(str);
    }

    public ResItem(String str, Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(map, "valueMap");
        this.f99167b = str;
        this.f99168c = map;
    }
}
