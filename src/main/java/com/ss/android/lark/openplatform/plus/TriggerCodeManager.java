package com.ss.android.lark.openplatform.plus;

import com.ss.android.lark.log.Log;
import com.ss.android.openbusiness.data.AppShortCutChatData;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0005J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/openplatform/plus/TriggerCodeManager;", "", "()V", "triggerMap", "", "", "Lcom/ss/android/lark/openplatform/plus/TriggerBean;", "triggerMessageMap", "Lcom/ss/android/lark/openplatform/plus/TriggerMessageBean;", "addTriggerMap", "", "triggerCode", "bean", "addTriggerMessageMap", "getTriggerBean", "getTriggerMessageBean", "appId", "Companion", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.openplatform.plus.f */
public final class TriggerCodeManager {

    /* renamed from: a */
    public static final Lazy f122715a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C48851b.INSTANCE);

    /* renamed from: b */
    public static final Companion f122716b = new Companion(null);

    /* renamed from: c */
    private Map<String, C48850e> f122717c;

    /* renamed from: d */
    private Map<String, C48852g> f122718d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/openplatform/plus/TriggerCodeManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/openplatform/plus/TriggerCodeManager;", "getInstance", "()Lcom/ss/android/lark/openplatform/plus/TriggerCodeManager;", "instance$delegate", "Lkotlin/Lazy;", "open-platform_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.openplatform.plus.f$a */
    public static final class Companion {
        /* renamed from: a */
        public final TriggerCodeManager mo170647a() {
            Lazy lazy = TriggerCodeManager.f122715a;
            Companion aVar = TriggerCodeManager.f122716b;
            return (TriggerCodeManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/openplatform/plus/TriggerCodeManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.openplatform.plus.f$b */
    static final class C48851b extends Lambda implements Function0<TriggerCodeManager> {
        public static final C48851b INSTANCE = new C48851b();

        C48851b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TriggerCodeManager invoke() {
            return new TriggerCodeManager(null);
        }
    }

    private TriggerCodeManager() {
        this.f122717c = new HashMap();
        this.f122718d = new HashMap();
    }

    public /* synthetic */ TriggerCodeManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final C48850e mo170643a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "triggerCode");
        Log.m165389i("TriggerCodeManager", "get context bean " + str);
        return this.f122717c.get(str);
    }

    /* renamed from: a */
    public final C48852g mo170644a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "appId");
        Intrinsics.checkParameterIsNotNull(str2, "triggerCode");
        Log.m165389i("TriggerCodeManager", "get message bean " + str + ", " + str2);
        C48852g gVar = this.f122718d.get(str2);
        if (gVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(str, gVar.mo170648a())) {
            return gVar;
        }
        Log.m165389i("TriggerCodeManager", "getTriggerMessageBean id not match:" + str);
        return null;
    }

    /* renamed from: a */
    public final void mo170645a(String str, C48850e eVar) {
        String str2;
        Intrinsics.checkParameterIsNotNull(str, "triggerCode");
        Intrinsics.checkParameterIsNotNull(eVar, "bean");
        StringBuilder sb = new StringBuilder();
        sb.append("add context bean ");
        sb.append(str);
        sb.append(", ");
        AppShortCutChatData a = eVar.mo170641a();
        if (a != null) {
            str2 = a.mo202946e();
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.m165389i("TriggerCodeManager", sb.toString());
        this.f122717c.put(str, eVar);
    }

    /* renamed from: a */
    public final void mo170646a(String str, C48852g gVar) {
        Intrinsics.checkParameterIsNotNull(str, "triggerCode");
        Intrinsics.checkParameterIsNotNull(gVar, "bean");
        Log.m165389i("TriggerCodeManager", "add message bean " + str + ", " + gVar.mo170649b());
        this.f122718d.put(str, gVar);
    }
}
