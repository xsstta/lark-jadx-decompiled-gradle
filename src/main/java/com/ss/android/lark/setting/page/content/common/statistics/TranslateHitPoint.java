package com.ss.android.lark.setting.page.content.common.statistics;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.ss.android.lark.setting.page.content.common.impl.translate.p2667c.C54247b;
import com.ss.android.lark.setting.page.content.common.impl.translate.v2.entity.C54377c;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.statistics.base.BaseHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J;\u0010\u0004\u001a5\u0012\u0004\u0012\u00020\u0006\u0012+\u0012)\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u00070\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0007J\u0010\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rH\u0007J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006H\u0007¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/setting/page/content/common/statistics/TranslateHitPoint;", "Lcom/ss/android/lark/statistics/base/BaseHitPoint;", "Lcom/ss/android/lark/statistics/base/IHitPoint;", "()V", "createAutoTranslateSwitchParamFactory", "", "", "Lkotlin/Function1;", "Lcom/ss/android/lark/setting/page/content/common/impl/translate/v2/entity/LanguageAutoTranslateScope;", "Lkotlin/ParameterName;", "name", "scope", "", "", "getReadableSwitchDescription", "switchIsOpen", "", "sendUpdateAutoTranslateSwitch", "", "configMask", "languageKey", "autoTranslateScope", "action", "sendUpdateLanguageTranslateEffect", "displayRule", "currentDisplayRule", "sendUpdateTargetLanguage", "sendUpdateTranslateEffect", "core_setting_setting_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.setting.page.content.common.b.d */
public final class TranslateHitPoint extends BaseHitPoint {

    /* renamed from: a */
    public static final TranslateHitPoint f134056a = new TranslateHitPoint();

    /* renamed from: a */
    public final String mo185348a(boolean z) {
        return z ? "open" : "close";
    }

    private TranslateHitPoint() {
    }

    /* renamed from: a */
    private final Map<Integer, Function1<C54377c, Map<String, String>>> m210260a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(C54377c.f134510b), C54156a.INSTANCE);
        hashMap.put(Integer.valueOf(C54377c.f134511c), C54157b.INSTANCE);
        hashMap.put(Integer.valueOf(C54377c.f134512d), C54158c.INSTANCE);
        hashMap.put(Integer.valueOf(C54377c.f134513e), C54159d.INSTANCE);
        return hashMap;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210261a(int i) {
        Statistics.sendEvent("translate_effect_setting", C54247b.m210656a("action", Integer.valueOf(i)));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "it", "Lcom/ss/android/lark/setting/page/content/common/impl/translate/v2/entity/LanguageAutoTranslateScope;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.b.d$a */
    public static final class C54156a extends Lambda implements Function1<C54377c, HashMap<String, String>> {
        public static final C54156a INSTANCE = new C54156a();

        C54156a() {
            super(1);
        }

        public final HashMap<String, String> invoke(C54377c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("object", "message");
            hashMap2.put("default", TranslateHitPoint.f134056a.mo185348a(cVar.mo185973a()));
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "it", "Lcom/ss/android/lark/setting/page/content/common/impl/translate/v2/entity/LanguageAutoTranslateScope;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.b.d$b */
    public static final class C54157b extends Lambda implements Function1<C54377c, HashMap<String, String>> {
        public static final C54157b INSTANCE = new C54157b();

        C54157b() {
            super(1);
        }

        public final HashMap<String, String> invoke(C54377c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("object", "doc");
            hashMap2.put("default", TranslateHitPoint.f134056a.mo185348a(cVar.mo185974b()));
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "it", "Lcom/ss/android/lark/setting/page/content/common/impl/translate/v2/entity/LanguageAutoTranslateScope;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.b.d$c */
    public static final class C54158c extends Lambda implements Function1<C54377c, HashMap<String, String>> {
        public static final C54158c INSTANCE = new C54158c();

        C54158c() {
            super(1);
        }

        public final HashMap<String, String> invoke(C54377c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("object", Comment.f24093e);
            hashMap.put("default", TranslateHitPoint.f134056a.mo185348a(cVar.mo185977c()));
            return hashMap;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/HashMap;", "", "it", "Lcom/ss/android/lark/setting/page/content/common/impl/translate/v2/entity/LanguageAutoTranslateScope;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.setting.page.content.common.b.d$d */
    public static final class C54159d extends Lambda implements Function1<C54377c, HashMap<String, String>> {
        public static final C54159d INSTANCE = new C54159d();

        C54159d() {
            super(1);
        }

        public final HashMap<String, String> invoke(C54377c cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            HashMap<String, String> hashMap = new HashMap<>();
            HashMap<String, String> hashMap2 = hashMap;
            hashMap2.put("object", "web");
            hashMap2.put("default", TranslateHitPoint.f134056a.mo185348a(cVar.mo185980e()));
            return hashMap;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210263a(String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(str, "languageKey");
        HashMap hashMap = new HashMap();
        hashMap.put("language", str);
        hashMap.put("action", Integer.valueOf(i));
        hashMap.put("default", Integer.valueOf(i2));
        Statistics.sendEvent("translate_effect_special_setting", C54247b.m210657a(hashMap));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m210262a(int i, String str, C54377c cVar, boolean z) {
        Map<String, String> invoke;
        Intrinsics.checkParameterIsNotNull(str, "languageKey");
        Intrinsics.checkParameterIsNotNull(cVar, "autoTranslateScope");
        TranslateHitPoint dVar = f134056a;
        Function1<C54377c, Map<String, String>> function1 = dVar.m210260a().get(Integer.valueOf(i));
        if (function1 != null && (invoke = function1.invoke(cVar)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(invoke);
            hashMap.put("language", str);
            hashMap.put("action", dVar.mo185348a(z));
            Statistics.sendEvent("autotranslate_special_setting", C54247b.m210657a(hashMap));
        }
    }
}
