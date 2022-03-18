package com.ss.android.lark.ug.dyflow.feat;

import android.app.Activity;
import android.content.DialogInterface;
import android.util.Pair;
import android.widget.TextView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.dyflow.common.data.FlowContext;
import com.ss.android.lark.ug.dyflow.common.data.FlowSlotData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.service.FlowServiceUtils;
import com.ss.android.lark.ug.dyflow.common.storage.FlowStorage;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.vc.statistics.p3180a.C63690d;
import com.tt.frontendapiinterface.ApiHandler;
import io.reactivex.AbstractC69009q;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0005\t\n\u000b\f\rB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager;", "", "()V", "tabSwitchAlertDialogController", "Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager$TabSwitchAlertDialogController;", "updateData", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "AlertDialogController", "ApmUtils", "Companion", "GuideDialog", "TabSwitchAlertDialogController", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.feat.a */
public final class GuideDialogManager {

    /* renamed from: a */
    public static final Lazy f141496a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57439c.INSTANCE);

    /* renamed from: b */
    public static final Companion f141497b = new Companion(null);

    /* renamed from: c */
    private final TabSwitchAlertDialogController f141498c = new TabSwitchAlertDialogController();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager$ApmUtils;", "", "()V", "reportError", "", ApiHandler.API_CALLBACK_ERRMSG, "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$a */
    public static final class ApmUtils {

        /* renamed from: a */
        public static final ApmUtils f141499a = new ApmUtils();

        private ApmUtils() {
        }

        /* renamed from: a */
        public final void mo194950a(String str, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            UGApm.DyFlow bVar = UGApm.DyFlow.f141198a;
            bVar.mo194474a(-1, "push_stepData_invalid, " + str, String.valueOf(flowStepData.mo194828a()), flowStepData.mo194834b(), flowStepData.mo194837c());
            OnBoardingAppreciable aVar = OnBoardingAppreciable.f141195a;
            aVar.mo194463a(-1, "push_stepData_invalid, " + str, String.valueOf(flowStepData.mo194828a()), flowStepData.mo194834b(), flowStepData.mo194837c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager$Companion;", "", "()V", "RES_BTN_CANCEL", "", "RES_BTN_PRIMARY", "RES_CONTENT", "RES_TAB_KEY", "RES_TITLE", "instance", "Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager;", "getInstance", "()Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager;", "instance$delegate", "Lkotlin/Lazy;", "inst", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$b */
    public static final class Companion {
        /* renamed from: b */
        private final GuideDialogManager m222828b() {
            Lazy lazy = GuideDialogManager.f141496a;
            Companion bVar = GuideDialogManager.f141497b;
            return (GuideDialogManager) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final GuideDialogManager mo194951a() {
            return m222828b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$c */
    static final class C57439c extends Lambda implements Function0<GuideDialogManager> {
        public static final C57439c INSTANCE = new C57439c();

        C57439c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GuideDialogManager invoke() {
            return new GuideDialogManager();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0016\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016R&\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager$TabSwitchAlertDialogController;", "Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager$AlertDialogController;", "()V", "tab2StepKeyMap", "", "", "Landroid/util/Pair;", "", "tabSwitchDispose", "Lio/reactivex/disposables/Disposable;", "cacheData", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "isMatched", "registerTabSwitchObserverIfNeed", "", "removeTabSwitchObserverIfNeed", "showDialogIfNeed", "activity", "Landroid/app/Activity;", "tabKey", "updateData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$e */
    public static final class TabSwitchAlertDialogController {

        /* renamed from: a */
        public Disposable f141509a;

        /* renamed from: b */
        private final Map<String, Pair<Long, String>> f141510b = new ConcurrentHashMap();

        /* renamed from: b */
        private final void m222835b() {
            Disposable disposable;
            Disposable disposable2;
            if (!(!this.f141510b.isEmpty()) && (disposable = this.f141509a) != null && !disposable.isDisposed() && (disposable2 = this.f141509a) != null) {
                disposable2.dispose();
            }
        }

        /* renamed from: a */
        private final void m222834a() {
            Disposable disposable = this.f141509a;
            if (disposable == null || disposable.isDisposed()) {
                AbstractC57392a a = C57345a.m222261a();
                Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
                a.mo194674f().mo194679a(new C57443a(this));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001e\u0010\n\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/ug/dyflow/feat/GuideDialogManager$TabSwitchAlertDialogController$registerTabSwitchObserverIfNeed$1", "Lio/reactivex/Observer;", "Landroid/util/Pair;", "Landroid/app/Activity;", "", "onComplete", "", "onError", "e", "", "onNext", "t", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$e$a */
        public static final class C57443a implements AbstractC69009q<Pair<Activity, String>> {

            /* renamed from: a */
            final /* synthetic */ TabSwitchAlertDialogController f141511a;

            @Override // io.reactivex.AbstractC69009q
            public void onComplete() {
            }

            @Override // io.reactivex.AbstractC69009q
            public void onError(Throwable th) {
                Intrinsics.checkParameterIsNotNull(th, "e");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57443a(TabSwitchAlertDialogController eVar) {
                this.f141511a = eVar;
            }

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
                this.f141511a.f141509a = disposable;
            }

            /* renamed from: a */
            public void onNext(Pair<Activity, String> pair) {
                String str;
                Intrinsics.checkParameterIsNotNull(pair, "t");
                Activity activity = (Activity) pair.first;
                if (activity != null && (str = (String) pair.second) != null) {
                    this.f141511a.mo194956a(activity, str);
                }
            }
        }

        /* renamed from: b */
        public void mo194958b(FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            if (m222836c(flowStepData)) {
                m222834a();
            } else {
                m222835b();
            }
        }

        /* renamed from: a */
        public boolean mo194957a(FlowStepData flowStepData) {
            Map<String, String> a;
            String str;
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            FlowContext f = flowStepData.mo194843f();
            if (f == null || (a = f.mo194855a()) == null || (str = a.get("tab")) == null || str.length() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final boolean m222836c(FlowStepData flowStepData) {
            Map<String, String> a;
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Pair<Long, String> remove;
            FlowContext f = flowStepData.mo194843f();
            if (!(f == null || (a = f.mo194855a()) == null || (str = a.get("tab")) == null)) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (!z) {
                    str = null;
                }
                if (str != null) {
                    String d = flowStepData.mo194838d("title");
                    if (d != null) {
                        if (d.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            d = null;
                        }
                        if (d != null) {
                            String d2 = flowStepData.mo194838d("content");
                            if (d2 != null) {
                                if (d2.length() > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    d2 = null;
                                }
                                if (d2 != null) {
                                    String e = flowStepData.mo194841e("button_primary");
                                    if (e != null) {
                                        if (e.length() > 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (!z4) {
                                            e = null;
                                        }
                                        if (e != null) {
                                            String e2 = flowStepData.mo194841e("button_cancel");
                                            if (e2 != null) {
                                                if (e2.length() > 0) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (!z5) {
                                                    e2 = null;
                                                }
                                                if (e2 != null) {
                                                    Long valueOf = Long.valueOf(flowStepData.mo194828a());
                                                    if (valueOf.longValue() != -1) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (!z6) {
                                                        valueOf = null;
                                                    }
                                                    if (valueOf != null) {
                                                        long longValue = valueOf.longValue();
                                                        String b = flowStepData.mo194834b();
                                                        if (b != null) {
                                                            if (b.length() > 0) {
                                                                z7 = true;
                                                            } else {
                                                                z7 = false;
                                                            }
                                                            if (z7) {
                                                                str2 = b;
                                                            }
                                                            if (str2 != null) {
                                                                if (this.f141510b.containsKey(str) && (remove = this.f141510b.remove(str)) != null) {
                                                                    FlowStorage a2 = FlowStorage.f141417c.mo194787a();
                                                                    Object obj = remove.first;
                                                                    Intrinsics.checkExpressionValueIsNotNull(obj, "pair.first");
                                                                    long longValue2 = ((Number) obj).longValue();
                                                                    Object obj2 = remove.second;
                                                                    Intrinsics.checkExpressionValueIsNotNull(obj2, "pair.second");
                                                                    a2.mo194785a(longValue2, (String) obj2, true);
                                                                }
                                                                this.f141510b.put(str, new Pair<>(Long.valueOf(longValue), str2));
                                                                FlowStorage.f141417c.mo194787a().mo194786a(flowStepData);
                                                                return true;
                                                            }
                                                        }
                                                        ApmUtils.f141499a.mo194950a("stepId is null", flowStepData);
                                                        return false;
                                                    }
                                                    ApmUtils.f141499a.mo194950a("flowId is not valid", flowStepData);
                                                    return false;
                                                }
                                            }
                                            ApmUtils.f141499a.mo194950a("btnCancel is null", flowStepData);
                                            return false;
                                        }
                                    }
                                    ApmUtils.f141499a.mo194950a("btnPrimary is null", flowStepData);
                                    return false;
                                }
                            }
                            ApmUtils.f141499a.mo194950a("content is null", flowStepData);
                            return false;
                        }
                    }
                    ApmUtils.f141499a.mo194950a("title is null", flowStepData);
                    return false;
                }
            }
            ApmUtils.f141499a.mo194950a("tab param is null", flowStepData);
            return false;
        }

        /* renamed from: a */
        public final boolean mo194956a(Activity activity, String str) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(str, "tabKey");
            if (!this.f141510b.containsKey(str)) {
                return false;
            }
            Pair<Long, String> remove = this.f141510b.remove(str);
            m222835b();
            if (remove != null) {
                FlowStorage a = FlowStorage.f141417c.mo194787a();
                Object obj = remove.first;
                Intrinsics.checkExpressionValueIsNotNull(obj, "pair.first");
                long longValue = ((Number) obj).longValue();
                Object obj2 = remove.second;
                Intrinsics.checkExpressionValueIsNotNull(obj2, "pair.second");
                FlowStepData a2 = a.mo194785a(longValue, (String) obj2, true);
                if (a2 != null) {
                    new GuideDialog(a2).mo194952a(activity);
                    return true;
                }
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/feat/GuideDialogManager$GuideDialog;", "", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "(Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "btnCancel", "", "btnPrimary", "content", "flowId", "title", "handleSlotAction", "", "slotId", "show", "activity", "Landroid/app/Activity;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$d */
    public static final class GuideDialog {

        /* renamed from: a */
        public String f141500a;

        /* renamed from: b */
        public String f141501b;

        /* renamed from: c */
        public String f141502c;

        /* renamed from: d */
        private String f141503d;

        /* renamed from: e */
        private String f141504e;

        /* renamed from: f */
        private final FlowStepData f141505f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0007"}, d2 = {"com/ss/android/lark/ug/dyflow/feat/GuideDialogManager$GuideDialog$show$1", "Lcom/larksuite/component/ui/dialog/LKUIDialogBuilder$LifecycleCallback;", "Lcom/larksuite/component/ui/dialog/LKUIDialog;", "beforeCreate", "", "dialog", "onCreated", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$d$a */
        public static final class C57440a extends C25639g.AbstractC25641b<DialogC25637f> {

            /* renamed from: a */
            final /* synthetic */ GuideDialog f141506a;

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: a */
            public void mo89273a(DialogC25637f fVar) {
                super.mo89273a(fVar);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C57440a(GuideDialog dVar) {
                this.f141506a = dVar;
            }

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.ui.dialog.C25639g.AbstractC25641b
            /* renamed from: b */
            public void mo89274b(DialogC25637f fVar) {
                super.mo89274b(fVar);
                if (fVar != null) {
                    TextView textView = (TextView) fVar.findViewById(R.id.title);
                    if (textView != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView, "it");
                        textView.setText(this.f141506a.f141500a);
                    }
                    TextView textView2 = (TextView) fVar.findViewById(R.id.detail);
                    if (textView2 != null) {
                        Intrinsics.checkExpressionValueIsNotNull(textView2, "it");
                        textView2.setText(this.f141506a.f141501b);
                    }
                }
            }
        }

        public GuideDialog(FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            this.f141505f = flowStepData;
            this.f141500a = flowStepData.mo194838d("title");
            this.f141501b = flowStepData.mo194838d("content");
            this.f141503d = flowStepData.mo194841e("button_primary");
            this.f141504e = flowStepData.mo194841e("button_cancel");
            this.f141502c = String.valueOf(flowStepData.mo194828a());
        }

        /* renamed from: a */
        public final void mo194952a(Activity activity) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            new C25639g(activity).mo89258q(R.layout.guide_dialog_invite).mo89230a(new C57440a(this)).mo89225a(R.id.lkui_dialog_btn_left, this.f141504e, new DialogInterface$OnClickListenerC57441b(this)).mo89225a(R.id.lkui_dialog_btn_right, this.f141503d, new DialogInterface$OnClickListenerC57442c(this)).mo89247e(false).mo89239c();
            OnboardingHitPoint.f99379a.mo141620e(this.f141502c);
        }

        /* renamed from: a */
        public final void mo194953a(String str) {
            boolean z;
            FlowSlotData c = this.f141505f.mo194836c(str);
            if (c != null) {
                if (c.mo194822g()) {
                    FlowServiceUtils.Companion aVar = FlowServiceUtils.f141408a;
                    long a = c.mo194808a();
                    String b = c.mo194813b();
                    String str2 = "";
                    if (b == null) {
                        b = str2;
                    }
                    String d = c.mo194817d();
                    if (d != null) {
                        str2 = d;
                    }
                    aVar.mo194780a(a, b, str2);
                }
                String f = c.mo194821f();
                if (f != null) {
                    if (f.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        f = null;
                    }
                    if (f != null) {
                        C57345a.m222261a().mo194669b(f);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$d$b */
        public static final class DialogInterface$OnClickListenerC57441b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ GuideDialog f141507a;

            DialogInterface$OnClickListenerC57441b(GuideDialog dVar) {
                this.f141507a = dVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f141507a.mo194953a("button_cancel");
                OnboardingHitPoint.f99379a.mo141628g(this.f141507a.f141502c);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.feat.a$d$c */
        public static final class DialogInterface$OnClickListenerC57442c implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ GuideDialog f141508a;

            DialogInterface$OnClickListenerC57442c(GuideDialog dVar) {
                this.f141508a = dVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f141508a.mo194953a("button_primary");
                OnboardingHitPoint.f99379a.mo141624f(this.f141508a.f141502c);
            }
        }
    }

    /* renamed from: a */
    public final void mo194949a(FlowStepData flowStepData) {
        if (flowStepData == null) {
            return;
        }
        if (this.f141498c.mo194957a(flowStepData)) {
            this.f141498c.mo194958b(flowStepData);
        } else {
            ApmUtils.f141499a.mo194950a("params is invalid", flowStepData);
        }
    }
}
