package com.ss.android.lark.magic.provider;

import com.bytedance.feelgood.p735a.C13913d;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/ss/android/lark/magic/provider/TriggerResponse;", "", "uniqueTag", "", "scenarioId", "event", "bizResponse", "Lcom/bytedance/feelgood/entity/SurveyResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/feelgood/entity/SurveyResponse;)V", "getBizResponse", "()Lcom/bytedance/feelgood/entity/SurveyResponse;", "getEvent", "()Ljava/lang/String;", "globalMagic", "", "getGlobalMagic", "()Z", "setGlobalMagic", "(Z)V", "getScenarioId", "setScenarioId", "(Ljava/lang/String;)V", "sourceParams", "", "getSourceParams", "()Ljava/util/Map;", "setSourceParams", "(Ljava/util/Map;)V", "getUniqueTag", "viewContainer", "Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "getViewContainer", "()Lcom/ss/android/lark/biz/core/api/MagicViewContainer;", "setViewContainer", "(Lcom/ss/android/lark/biz/core/api/MagicViewContainer;)V", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.d.e */
public final class TriggerResponse {

    /* renamed from: a */
    private boolean f105952a;

    /* renamed from: b */
    private transient MagicViewContainer f105953b;

    /* renamed from: c */
    private Map<String, String> f105954c = MapsKt.emptyMap();

    /* renamed from: d */
    private final String f105955d;

    /* renamed from: e */
    private String f105956e;

    /* renamed from: f */
    private final String f105957f;

    /* renamed from: g */
    private final C13913d f105958g;

    /* renamed from: b */
    public final MagicViewContainer mo150040b() {
        return this.f105953b;
    }

    /* renamed from: c */
    public final Map<String, String> mo150041c() {
        return this.f105954c;
    }

    /* renamed from: d */
    public final String mo150042d() {
        return this.f105955d;
    }

    /* renamed from: e */
    public final String mo150043e() {
        return this.f105956e;
    }

    /* renamed from: f */
    public final String mo150044f() {
        return this.f105957f;
    }

    /* renamed from: g */
    public final C13913d mo150045g() {
        return this.f105958g;
    }

    /* renamed from: a */
    public final boolean mo150039a() {
        return this.f105952a;
    }

    /* renamed from: a */
    public final void mo150035a(MagicViewContainer awVar) {
        this.f105953b = awVar;
    }

    /* renamed from: a */
    public final void mo150036a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f105956e = str;
    }

    /* renamed from: a */
    public final void mo150037a(Map<String, String> map) {
        this.f105954c = map;
    }

    /* renamed from: a */
    public final void mo150038a(boolean z) {
        this.f105952a = z;
    }

    public TriggerResponse(String str, String str2, String str3, C13913d dVar) {
        Intrinsics.checkParameterIsNotNull(str, "uniqueTag");
        Intrinsics.checkParameterIsNotNull(str2, "scenarioId");
        Intrinsics.checkParameterIsNotNull(str3, "event");
        this.f105955d = str;
        this.f105956e = str2;
        this.f105957f = str3;
        this.f105958g = dVar;
    }
}
