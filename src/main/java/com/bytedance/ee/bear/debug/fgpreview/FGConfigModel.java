package com.bytedance.ee.bear.debug.fgpreview;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\nR9\u0010\u000b\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R-\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R9\u0010\u0016\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R9\u0010\u0018\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bX\u0004¢\u0006\u0004\n\u0002\u0010\u001cR9\u0010\u001d\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\r`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R-\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R9\u0010!\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0011R9\u0010#\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r0\fj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r`\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011¨\u0006%"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGConfigModel;", "", "rcJsonObj", "Lorg/json/JSONObject;", "gaJsonObj", "rcMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "gaMap", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/util/HashMap;Ljava/util/HashMap;)V", "gaBooleanList", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "", "Lkotlin/collections/ArrayList;", "getGaBooleanList", "()Ljava/util/ArrayList;", "getGaJsonObj", "()Lorg/json/JSONObject;", "getGaMap", "()Ljava/util/HashMap;", "gaMultiList", "getGaMultiList", "gaTextList", "getGaTextList", "keySetArray", "", "[Ljava/lang/String;", "rcBooleanList", "getRcBooleanList", "getRcJsonObj", "getRcMap", "rcMultiList", "getRcMultiList", "rcTextList", "getRcTextList", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.fgpreview.a */
public final class FGConfigModel {

    /* renamed from: a */
    private final ArrayList<Pair<String, Boolean>> f15170a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<Pair<String, String>> f15171b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<Pair<String, String>> f15172c = new ArrayList<>();

    /* renamed from: d */
    private final ArrayList<Pair<String, Boolean>> f15173d = new ArrayList<>();

    /* renamed from: e */
    private final ArrayList<Pair<String, String>> f15174e = new ArrayList<>();

    /* renamed from: f */
    private final ArrayList<Pair<String, String>> f15175f = new ArrayList<>();

    /* renamed from: g */
    private final String[] f15176g;

    /* renamed from: h */
    private final JSONObject f15177h;

    /* renamed from: i */
    private final JSONObject f15178i;

    /* renamed from: j */
    private final HashMap<String, String> f15179j;

    /* renamed from: k */
    private final HashMap<String, String> f15180k;

    /* renamed from: a */
    public final ArrayList<Pair<String, Boolean>> mo21295a() {
        return this.f15170a;
    }

    /* renamed from: b */
    public final ArrayList<Pair<String, String>> mo21296b() {
        return this.f15171b;
    }

    /* renamed from: c */
    public final ArrayList<Pair<String, String>> mo21297c() {
        return this.f15172c;
    }

    /* renamed from: d */
    public final ArrayList<Pair<String, Boolean>> mo21298d() {
        return this.f15173d;
    }

    /* renamed from: e */
    public final ArrayList<Pair<String, String>> mo21299e() {
        return this.f15174e;
    }

    /* renamed from: f */
    public final ArrayList<Pair<String, String>> mo21300f() {
        return this.f15175f;
    }

    /* renamed from: g */
    public final JSONObject mo21301g() {
        return this.f15177h;
    }

    /* renamed from: h */
    public final JSONObject mo21302h() {
        return this.f15178i;
    }

    /* renamed from: i */
    public final HashMap<String, String> mo21303i() {
        return this.f15179j;
    }

    /* renamed from: j */
    public final HashMap<String, String> mo21304j() {
        return this.f15180k;
    }

    public FGConfigModel(JSONObject jSONObject, JSONObject jSONObject2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        boolean z;
        boolean z2;
        Intrinsics.checkParameterIsNotNull(hashMap, "rcMap");
        Intrinsics.checkParameterIsNotNull(hashMap2, "gaMap");
        this.f15177h = jSONObject;
        this.f15178i = jSONObject2;
        this.f15179j = hashMap;
        this.f15180k = hashMap2;
        Set<String> keySet = hashMap.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "rcMap.keys");
        Set<String> set = keySet;
        if (set != null) {
            Object[] array = set.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                this.f15176g = strArr;
                Arrays.sort(strArr);
                for (String str : strArr) {
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = this.f15179j.get(str);
                        String str3 = this.f15180k.get(str);
                        String str4 = str2;
                        if (TextUtils.equals(str4, "true") || TextUtils.equals(str4, "false")) {
                            ArrayList<Pair<String, Boolean>> arrayList = this.f15170a;
                            if (str2 != null) {
                                z = Boolean.parseBoolean(str2);
                            } else {
                                z = false;
                            }
                            arrayList.add(new Pair<>(str, Boolean.valueOf(z)));
                            ArrayList<Pair<String, Boolean>> arrayList2 = this.f15173d;
                            if (str3 != null) {
                                z2 = Boolean.parseBoolean(str3);
                            } else {
                                z2 = false;
                            }
                            arrayList2.add(new Pair<>(str, Boolean.valueOf(z2)));
                        } else if (str2 == null || !StringsKt.contains$default((CharSequence) str4, (CharSequence) "{", false, 2, (Object) null)) {
                            this.f15171b.add(new Pair<>(str, str2 == null ? "value is empty" : str2));
                            this.f15174e.add(new Pair<>(str, str3 == null ? "value is empty" : str3));
                        } else {
                            this.f15172c.add(new Pair<>(str, str2));
                            this.f15175f.add(new Pair<>(str, str3 == null ? "value is empty" : str3));
                        }
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }
}
