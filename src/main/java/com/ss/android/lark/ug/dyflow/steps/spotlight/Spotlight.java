package com.ss.android.lark.ug.dyflow.steps.spotlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.statistics.OnboardingHitPoint;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.StepDelegate;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.apm.OnBoardingAppreciable;
import com.ss.android.lark.ug.apm.UGApm;
import com.ss.android.lark.ug.dyflow.common.BaseFlowStep;
import com.ss.android.lark.ug.dyflow.common.FlowStepDelegateHelper;
import com.ss.android.lark.ug.dyflow.common.IFlowStepDelegate;
import com.ss.android.lark.ug.dyflow.common.data.FlowSlotData;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.data.elements.ConfigElementData;
import com.ss.android.lark.ug.dyflow.steps.StepsUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.json.JSONArray;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u0018\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002J2\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132 \u0010\u0014\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015\u0018\u00010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight;", "", "stepDelegate", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate;", "(Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate;)V", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "getStepData", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "setStepData", "(Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "getTabTypeFromSlotKeys", "", "key", "slotKeys", "", "show", "", "activity", "Landroid/app/Activity;", "viewList", "Landroid/util/Pair;", "Landroid/view/View;", "Companion", "StepBubbleHelper", "ViewIndexSortHelper", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a */
public final class Spotlight {

    /* renamed from: c */
    public static final Companion f141535c = new Companion(null);

    /* renamed from: a */
    public FlowStepData f141536a;

    /* renamed from: b */
    public final IFlowStepDelegate f141537b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J$\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bH\u0002Jf\u0010\f\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\rj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e`\u00102\u0006\u0010\u0011\u001a\u00020\u00122.\u0010\u0013\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\rj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e`\u0010¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$ViewIndexSortHelper;", "", "()V", "isAutoMainTab", "", "indexKey", "", "isCustomIndexTab", "parseIndexKey", "", "configs", "", "sort", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "flowStepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "viewList", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$c */
    public static final class ViewIndexSortHelper {

        /* renamed from: a */
        public static final Companion f141544a = new Companion(null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$ViewIndexSortHelper$Companion;", "", "()V", "ARG_ORDER_LIST", "", "TAB_INDEX_AUTO_MAIN_TAB", "TAB_INDEX_CUSTOM_GADGET_PREFIX", "TAB_INDEX_CUSTOM_NATIVE_PREFIX", "TAB_INDEX_CUSTOM_WEBAPP_PREFIX", "TAG", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$c$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: a */
        private final boolean m222898a(String str) {
            return TextUtils.equals(str, "auto_main_tab");
        }

        /* renamed from: b */
        private final boolean m222899b(String str) {
            if (StringsKt.startsWith$default(str, "native_", false, 2, (Object) null) || StringsKt.startsWith$default(str, "gadget_", false, 2, (Object) null) || StringsKt.startsWith$default(str, "webapp_", false, 2, (Object) null)) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        private final List<String> m222897a(Map<String, String> map) {
            String str = map.get("order_list");
            if (str != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    boolean z = false;
                    boolean z2 = false;
                    for (int i = 0; i < length; i++) {
                        Object obj = jSONArray.get(i);
                        if (obj instanceof String) {
                            arrayList.add(obj);
                            String str2 = (String) obj;
                            if (m222898a(str2)) {
                                z = true;
                            } else if (m222899b(str2)) {
                                z2 = true;
                            }
                        }
                    }
                    if (!z || !z2) {
                        return arrayList;
                    }
                    Log.m165383e("ViewIndexSortHelper", "logic error, order_list has autoMainTab and customIndexTab");
                    UGApm.DyFlow.f141198a.mo194473a(2, "logic error, order_list has autoMainTab and customIndexTab");
                    OnBoardingAppreciable.f141195a.mo194462a(2, "logic error, order_list has autoMainTab and customIndexTab");
                    return null;
                } catch (Exception e) {
                    Log.m165384e("ViewIndexSortHelper", "parse order_list error", e);
                    UGApm.DyFlow.f141198a.mo194473a(2, "parse order_list error");
                    OnBoardingAppreciable.f141195a.mo194462a(2, "parse order_list error");
                    return null;
                }
            } else {
                UGApm.DyFlow.f141198a.mo194473a(1, "order_list config lost");
                OnBoardingAppreciable.f141195a.mo194462a(1, "order_list config lost");
                return null;
            }
        }

        /* renamed from: a */
        public final ArrayList<Pair<String, View>> mo194993a(FlowStepData flowStepData, ArrayList<Pair<String, View>> arrayList) {
            Map<String, String> a;
            List<String> a2;
            Intrinsics.checkParameterIsNotNull(flowStepData, "flowStepData");
            Intrinsics.checkParameterIsNotNull(arrayList, "viewList");
            ConfigElementData i = flowStepData.mo194847i("spotlight_config");
            if (!(i == null || (a = i.mo194886a()) == null || (a2 = m222897a(a)) == null)) {
                if (!(!a2.isEmpty())) {
                    a2 = null;
                }
                if (a2 != null) {
                    ArrayList<Pair<String, View>> arrayList2 = new ArrayList<>();
                    ArrayList<Pair<String, View>> arrayList3 = arrayList;
                    ArrayList arrayList4 = new ArrayList();
                    for (T t : arrayList3) {
                        if (m222899b((String) t.getFirst())) {
                            arrayList4.add(t);
                        }
                    }
                    ArrayList arrayList5 = arrayList4;
                    HashMap hashMap = new HashMap();
                    for (T t2 : arrayList3) {
                        hashMap.put(t2.getFirst(), t2);
                    }
                    HashMap hashMap2 = hashMap;
                    for (String str : a2) {
                        if (m222898a(str)) {
                            arrayList2.addAll(arrayList5);
                        } else {
                            Pair<String, View> pair = (Pair) hashMap2.get(str);
                            if (pair != null) {
                                arrayList2.add(pair);
                            }
                        }
                    }
                    return arrayList2;
                }
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$Companion;", "", "()V", "KEY_ENTRY", "", "KEY_INTENT_FLOW_SPOTLIGHT", "KEY_MORE_BTN", "TAB_TYPE_GADGET", "TAB_TYPE_NATIVE", "TAB_TYPE_WEBAPP", "TAG", "isIntentValid", "", "intent", "Landroid/content/Intent;", "openFromIntent", "", "activity", "Landroid/app/Activity;", "sendOpenIntent", "step", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo194990a(Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            return intent.getBooleanExtra("key_intent_flow_spotlight", false);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002 \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J*\u0010\n\u001a\u00020\u00072 \u0010\u000b\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$Companion$openFromIntent$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Landroid/util/Pair;", "", "Landroid/view/View;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$a$a */
        public static final class C57450a implements IGetDataCallback<List<? extends android.util.Pair<String, View>>> {

            /* renamed from: a */
            final /* synthetic */ IFlowStepDelegate f141538a;

            /* renamed from: b */
            final /* synthetic */ Activity f141539b;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165384e("DyFlow", "spotlight_open->onError", errorResult);
                SpotlightFlowStep.f141546b.mo194996b();
            }

            /* renamed from: a */
            public void onSuccess(List<? extends android.util.Pair<String, View>> list) {
                try {
                    boolean a = new Spotlight(this.f141538a).mo194987a(this.f141539b, list);
                    Log.m165389i("DyFlow", "spotlight_open->show onSuccess and show, result=" + a);
                    if (!a) {
                        SpotlightFlowStep.f141546b.mo194996b();
                    }
                } catch (Exception e) {
                    Log.m165384e("DyFlow", "spotlight_open->show error", e);
                    SpotlightFlowStep.f141546b.mo194996b();
                }
            }

            C57450a(IFlowStepDelegate iFlowStepDelegate, Activity activity) {
                this.f141538a = iFlowStepDelegate;
                this.f141539b = activity;
            }
        }

        /* renamed from: a */
        public final void mo194989a(BaseFlowStep aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "step");
            Bundle bundle = new Bundle();
            bundle.putBoolean("key_intent_flow_spotlight", true);
            FlowStepDelegateHelper.f141398a.mo194774a(bundle, aVar);
            StepsUtils.f141524a.mo194971a("conversation", bundle);
        }

        /* renamed from: a */
        public final void mo194988a(Activity activity, Intent intent) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(intent, "intent");
            Log.m165389i("DyFlow", "spotlight_open, enter");
            if (!mo194990a(intent)) {
                Log.m165383e("DyFlow", "spotlight_open, intent is invalid");
                return;
            }
            IFlowStepDelegate a = FlowStepDelegateHelper.f141398a.mo194772a(intent);
            if (a != null) {
                AbstractC38549a a2 = C38548a.m152027a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "GuideModule.getDependency()");
                a2.mo141262l().mo141276a(activity, new C57450a(a, activity));
                return;
            }
            Log.m165383e("DyFlow", "spotlight_open, stepDelegate is null");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$show$4", "Lkotlin/Function0;", "", "invoke", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$d */
    public static final class C57453d implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ Spotlight f141545a;

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            mo194994a();
            return Unit.INSTANCE;
        }

        /* renamed from: a */
        public void mo194994a() {
            this.f141545a.f141537b.handleSlotAction("spotlight_complete", true);
            SpotlightFlowStep.f141546b.mo194996b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57453d(Spotlight aVar) {
            this.f141545a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\"\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J8\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$StepBubbleHelper;", "", "()V", "minWidth", "", "createMaskConfig", "Lcom/ss/android/lark/guide/ui/config/MaskConfig;", "createNextButton", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig;", "name", "", "stepIndex", "totalSize", "createPrevButton", "createStepBubble", "Lcom/ss/android/lark/guide/ui/config/ButtonBubbleConfig;", "anchorView", "Landroid/view/View;", "anchorGravity", "Lcom/ss/android/lark/guide/ui/config/AnchorConfig$AnchorGravity;", "stepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "tabTypeKey", "index", "total", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$b */
    public static final class StepBubbleHelper {

        /* renamed from: a */
        private final int f141540a = UIHelper.dp2px(48.0f);

        /* renamed from: a */
        private final MaskConfig m222893a() {
            MaskConfig.ShapeType shapeType = MaskConfig.ShapeType.RECTANGLE;
            int i = this.f141540a;
            return new MaskConfig(76, BitmapDescriptorFactory.HUE_RED, shapeType, null, new Size(i, i));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$StepBubbleHelper$createPrevButton$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$b$b */
        public static final class C57452b implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ int f141543a;

            C57452b(int i) {
                this.f141543a = i;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                if (gVar instanceof StepDelegate) {
                    ((StepDelegate) gVar).mo141667c();
                }
                OnboardingHitPoint.f99379a.mo141632i(this.f141543a + 1);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/ug/dyflow/steps/spotlight/Spotlight$StepBubbleHelper$createNextButton$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ug.dyflow.steps.c.a$b$a */
        public static final class C57451a implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ int f141541a;

            /* renamed from: b */
            final /* synthetic */ int f141542b;

            C57451a(int i, int i2) {
                this.f141541a = i;
                this.f141542b = i2;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                if (gVar instanceof StepDelegate) {
                    ((StepDelegate) gVar).mo141668d();
                }
                if (this.f141541a == this.f141542b - 1) {
                    OnboardingHitPoint.f99379a.mo141634j(this.f141541a + 1);
                } else {
                    OnboardingHitPoint.f99379a.mo141630h(this.f141541a + 1);
                }
            }
        }

        /* renamed from: b */
        private final ButtonConfig m222895b(String str, int i, int i2) {
            return new ButtonConfig(str, new C57451a(i, i2));
        }

        /* renamed from: a */
        private final ButtonConfig m222894a(String str, int i, int i2) {
            if (i == 0) {
                return null;
            }
            return new ButtonConfig(str, new C57452b(i));
        }

        /* renamed from: a */
        public final ButtonBubbleConfig mo194992a(View view, AnchorConfig.AnchorGravity anchorGravity, FlowStepData flowStepData, String str, int i, int i2) {
            String str2;
            String str3;
            String str4;
            Intrinsics.checkParameterIsNotNull(view, "anchorView");
            Intrinsics.checkParameterIsNotNull(anchorGravity, "anchorGravity");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            Intrinsics.checkParameterIsNotNull(str, "tabTypeKey");
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            String format = String.format("spotlight_%s_title", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            StringCompanionObject mVar2 = StringCompanionObject.f173215a;
            String format2 = String.format("spotlight_%s_detail", Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(format, *args)");
            if (!flowStepData.mo194848j(format) || !flowStepData.mo194848j(format2)) {
                Log.m165383e("DyFlow", "slotAndElement not found, titleKey=" + format + ", contentKey=" + format2);
                return null;
            }
            String d = flowStepData.mo194838d(format);
            String str5 = "";
            if (d != null) {
                str2 = d;
            } else {
                str2 = str5;
            }
            String d2 = flowStepData.mo194838d(format2);
            if (d2 != null) {
                str3 = d2;
            } else {
                str3 = str5;
            }
            AnchorConfig anchorConfig = new AnchorConfig(view, anchorGravity, null, 4, null);
            MaskConfig a = m222893a();
            String e = flowStepData.mo194841e("spotlight_previous");
            if (e == null) {
                e = str5;
            }
            ButtonConfig a2 = m222894a(e, i, i2);
            if (i == i2 - 1) {
                str4 = flowStepData.mo194841e("spotlight_complete");
            } else {
                str4 = flowStepData.mo194841e("spotlight_next");
            }
            if (str4 != null) {
                str5 = str4;
            }
            return new ButtonBubbleConfig(anchorConfig, a, str2, str3, a2, m222895b(str5, i, i2));
        }
    }

    public Spotlight(IFlowStepDelegate iFlowStepDelegate) {
        Intrinsics.checkParameterIsNotNull(iFlowStepDelegate, "stepDelegate");
        this.f141537b = iFlowStepDelegate;
    }

    /* renamed from: a */
    private final String m222887a(String str, List<String> list) {
        for (T t : list) {
            if (StringsKt.contains$default((CharSequence) t, (CharSequence) ("native_" + str), false, 2, (Object) null)) {
                return "native";
            }
            if (StringsKt.contains$default((CharSequence) t, (CharSequence) ("gadget_" + str), false, 2, (Object) null)) {
                return "gadget";
            }
            if (StringsKt.contains$default((CharSequence) t, (CharSequence) ("webapp_" + str), false, 2, (Object) null)) {
                return "webapp";
            }
        }
        return "native";
    }

    /* renamed from: a */
    public final boolean mo194987a(Activity activity, List<? extends android.util.Pair<String, View>> list) {
        Integer num;
        ArrayList arrayList;
        String str;
        AnchorConfig.AnchorGravity anchorGravity;
        View view;
        boolean z;
        Set<String> keySet;
        if (activity == null) {
            Log.m165383e("DyFlow", "spotlight_show, activity is null");
            return false;
        } else if (list == null || list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("spotlight_show, viewList - ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            sb.append(num);
            String sb2 = sb.toString();
            Log.m165383e("DyFlow", sb2);
            UGApm.DyFlow.f141198a.mo194473a(-1, sb2);
            OnBoardingAppreciable.f141195a.mo194462a(-1, sb2);
            return false;
        } else {
            FlowStepData stepData = this.f141537b.getStepData();
            if (stepData != null) {
                this.f141536a = stepData;
                if (stepData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stepData");
                }
                Map<String, FlowSlotData> d = stepData.mo194839d();
                if (d == null || (keySet = d.keySet()) == null || (arrayList = CollectionsKt.toList(keySet)) == null) {
                    arrayList = new ArrayList();
                }
                ArrayList<Pair<String, View>> arrayList2 = new ArrayList<>();
                Iterator it = new ArrayList(list).iterator();
                while (true) {
                    str = "entry";
                    if (!it.hasNext()) {
                        break;
                    }
                    android.util.Pair pair = (android.util.Pair) it.next();
                    if (pair != null) {
                        Intrinsics.checkExpressionValueIsNotNull(pair, "element ?: continue");
                        String str2 = (String) pair.first;
                        if (!(str2 == null || (view = (View) pair.second) == null)) {
                            if (!TextUtils.equals(str2, "more_btn")) {
                                String a = C57345a.m222261a().mo194664a(str2);
                                if (a == null) {
                                    a = "";
                                }
                                String str3 = a;
                                if (str3 == null || str3.length() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    a = m222887a(str2, arrayList);
                                    Log.m165389i("DyFlow", "use tabType from slotKeys, tabType=" + a);
                                }
                                str = a + '_' + str2;
                            }
                            arrayList2.add(new Pair<>(str, view));
                        }
                    }
                }
                ViewIndexSortHelper cVar = new ViewIndexSortHelper();
                FlowStepData flowStepData = this.f141536a;
                if (flowStepData == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stepData");
                }
                ArrayList<Pair<String, View>> a2 = cVar.mo194993a(flowStepData, arrayList2);
                StepBubbleHelper bVar = new StepBubbleHelper();
                ArrayList arrayList3 = new ArrayList();
                int size = a2.size();
                for (int i = 0; i < size; i++) {
                    Pair<String, View> pair2 = a2.get(i);
                    Intrinsics.checkExpressionValueIsNotNull(pair2, "sortedViewList[index]");
                    Pair<String, View> pair3 = pair2;
                    String first = pair3.getFirst();
                    View second = pair3.getSecond();
                    if (Intrinsics.areEqual(first, str)) {
                        anchorGravity = AnchorConfig.AnchorGravity.BOTTOM;
                    } else {
                        anchorGravity = AnchorConfig.AnchorGravity.TOP;
                    }
                    FlowStepData flowStepData2 = this.f141536a;
                    if (flowStepData2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stepData");
                    }
                    ButtonBubbleConfig a3 = bVar.mo194992a(second, anchorGravity, flowStepData2, first, i, size);
                    if (a3 != null) {
                        arrayList3.add(a3);
                    } else {
                        Log.m165389i("DyFlow", "spotlight_show, can't createStepBubble tabTypeKey=" + first);
                    }
                }
                return GuideComponent.f99382a.mo141644a(activity, arrayList3, new C57453d(this));
            }
            Log.m165383e("DyFlow", "spotlight_show, stepData is null");
            this.f141537b.notifyExtExit(1, "spotlight_show, stepData is null");
            return false;
        }
    }
}
