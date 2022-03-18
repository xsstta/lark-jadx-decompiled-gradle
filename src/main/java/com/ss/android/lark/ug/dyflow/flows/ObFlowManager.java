package com.ss.android.lark.ug.dyflow.flows;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.debug.MockFlowConfig;
import com.ss.android.lark.ug.dyflow.common.Flow;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.dyflow.common.IFlowStep;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.ss.android.lark.ug.dyflow.common.service.DyFlowService;
import com.ss.android.lark.ug.dyflow.common.service.IDyFlowService;
import com.ss.android.lark.ug.dyflow.common.service.MockFlowService;
import com.ss.android.lark.ug.dyflow.steps.StepsUtils;
import com.ss.android.lark.ug.dyflow.steps.addfriends.AddFriendsFlowStep;
import com.ss.android.lark.ug.dyflow.steps.completion.CompletionFlowStep;
import com.ss.android.lark.ug.dyflow.steps.invite.InviteFlowStep;
import com.ss.android.lark.ug.dyflow.steps.inviteguide.InviteGuideFlowStep;
import com.ss.android.lark.ug.dyflow.steps.jump.JumpFlowStep;
import com.ss.android.lark.ug.dyflow.steps.spotlight.SpotlightFlowStep;
import com.ss.android.lark.ug.dyflow.steps.video.VideoFlowStep;
import com.ss.android.lark.ug.dyflow.steps.welcome.WelcomeFlowStep;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0006\u0010\u0010\u001a\u00020\u0004J\b\u0010\u0011\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/flows/ObFlowManager;", "Lcom/ss/android/lark/ug/dyflow/flows/BaseFlowManager;", "()V", "checkStatus", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/os/Bundle;", "createFlow", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "userId", "", "createFlowService", "Lcom/ss/android/lark/ug/dyflow/common/service/IDyFlowService;", "isMockEnable", "", "resumeIfNeed", "start", "Companion", "LocalStorage", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.a.b */
public final class ObFlowManager extends BaseFlowManager {

    /* renamed from: a */
    public static final Lazy f141354a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C57407b.INSTANCE);

    /* renamed from: b */
    public static final Companion f141355b = new Companion(null);

    @JvmStatic
    /* renamed from: e */
    public static final ObFlowManager m222572e() {
        return f141355b.mo194697a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/flows/ObFlowManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/lark/ug/dyflow/flows/ObFlowManager;", "getInstance", "()Lcom/ss/android/lark/ug/dyflow/flows/ObFlowManager;", "instance$delegate", "Lkotlin/Lazy;", "inst", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$a */
    public static final class Companion {
        /* renamed from: b */
        private final ObFlowManager m222579b() {
            Lazy lazy = ObFlowManager.f141354a;
            Companion aVar = ObFlowManager.f141355b;
            return (ObFlowManager) lazy.getValue();
        }

        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final ObFlowManager mo194697a() {
            return m222579b();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/flows/ObFlowManager$LocalStorage;", "", "()V", "UG_FLOW_ONBOARDING_FINISHED", "", "UG_OLD_ONBOARDING_FINISHED", "notNeedResumeInMemory", "", "canNeedResume", "isOnBoardingFinished", "markNotNeedResumeInMemory", "", "markOnBoardingFinished", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$c */
    public static final class LocalStorage {

        /* renamed from: a */
        public static final LocalStorage f141356a = new LocalStorage();

        /* renamed from: b */
        private static boolean f141357b;

        /* renamed from: b */
        public final void mo194699b() {
            f141357b = true;
        }

        private LocalStorage() {
        }

        /* renamed from: d */
        public final boolean mo194701d() {
            return !f141357b;
        }

        /* renamed from: a */
        public final void mo194698a() {
            UserSP.getInstance().putBoolean("ug_flow_onboarding_finished", true);
        }

        /* renamed from: c */
        public final boolean mo194700c() {
            if (UserSP.getInstance().getBoolean("ug_flow_onboarding_finished", false) || UserSP.getInstance().getBoolean("sp_guide_tour_finished", false)) {
                return true;
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$1", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$f */
    public static final class C57410f implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57410f() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new WelcomeFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$2", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$g */
    public static final class C57411g implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57411g() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new VideoFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$3", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$h */
    public static final class C57412h implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57412h() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new InviteGuideFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$4", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$i */
    public static final class C57413i implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57413i() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new InviteFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$5", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$j */
    public static final class C57414j implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57414j() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new SpotlightFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$6", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$k */
    public static final class C57415k implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57415k() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new JumpFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$7", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$l */
    public static final class C57416l implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57416l() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new AddFriendsFlowStep(dVar, flowStepData);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001j\u0002`\u0005J\u0019\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$8", "Lkotlin/Function2;", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStep;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepCreator;", "invoke", "flow", "stepData", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$m */
    public static final class C57417m implements Function2<IFlow, FlowStepData, IFlowStep> {
        C57417m() {
        }

        /* renamed from: a */
        public IFlowStep invoke(IFlow dVar, FlowStepData flowStepData) {
            Intrinsics.checkParameterIsNotNull(dVar, "flow");
            Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
            return new CompletionFlowStep(dVar, flowStepData);
        }
    }

    private ObFlowManager() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/ug/dyflow/flows/ObFlowManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$b */
    static final class C57407b extends Lambda implements Function0<ObFlowManager> {
        public static final C57407b INSTANCE = new C57407b();

        C57407b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ObFlowManager invoke() {
            return new ObFlowManager(null);
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.flows.BaseFlowManager
    /* renamed from: b */
    public boolean mo194693b() {
        boolean b = super.mo194693b();
        if (b) {
            LocalStorage.f141356a.mo194699b();
        }
        return b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$createFlow$9", "Lcom/ss/android/lark/ug/dyflow/common/IFlow$IFlowStatusListener;", "onComplete", "", "onExit", "onStart", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$n */
    public static final class C57418n implements IFlow.IFlowStatusListener {

        /* renamed from: a */
        final /* synthetic */ ObFlowManager f141367a;

        /* renamed from: b */
        final /* synthetic */ String f141368b;

        @Override // com.ss.android.lark.ug.dyflow.common.IFlow.IFlowStatusListener
        /* renamed from: a */
        public void mo194712a() {
            if (!this.f141367a.mo194696d()) {
                LocalStorage.f141356a.mo194698a();
            }
            this.f141367a.mo194689a().remove(this.f141368b);
        }

        @Override // com.ss.android.lark.ug.dyflow.common.IFlow.IFlowStatusListener
        /* renamed from: b */
        public void mo194713b() {
            if (!this.f141367a.mo194696d()) {
                LocalStorage.f141356a.mo194698a();
            }
            this.f141367a.mo194689a().remove(this.f141368b);
            StepsUtils.f141524a.mo194970a("");
        }

        C57418n(ObFlowManager bVar, String str) {
            this.f141367a = bVar;
            this.f141368b = str;
        }
    }

    /* renamed from: f */
    private final IDyFlowService m222573f() {
        String a;
        boolean z;
        if (mo194696d() && (a = MockFlowConfig.f141222a.mo194523a()) != null) {
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                a = null;
            }
            if (a != null) {
                return new MockFlowService(a);
            }
        }
        return DyFlowService.f141399b.mo194777a();
    }

    /* renamed from: c */
    public final void mo194695c() {
        if (LocalStorage.f141356a.mo194700c() || !LocalStorage.f141356a.mo194701d()) {
            Log.m165379d("ObFlowManager", "resumeIfNeed, not need resume");
            return;
        }
        Log.m165389i("ObFlowManager", "resumeIfNeed enter");
        mo194690a(new C57419o(this));
    }

    /* renamed from: d */
    public final boolean mo194696d() {
        boolean z;
        AbstractC57392a a = C57345a.m222261a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
        if (C26284k.m95186b(a.mo194672d())) {
            String a2 = MockFlowConfig.f141222a.mo194523a();
            if (a2 == null || a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$e */
    public static final class RunnableC57409e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ObFlowManager f141361a;

        /* renamed from: b */
        final /* synthetic */ C57408d f141362b;

        /* renamed from: c */
        final /* synthetic */ CountDownLatch f141363c;

        /* renamed from: d */
        final /* synthetic */ Ref.ObjectRef f141364d;

        /* renamed from: e */
        final /* synthetic */ Ref.ObjectRef f141365e;

        /* renamed from: f */
        final /* synthetic */ IGetDataCallback f141366f;

        RunnableC57409e(ObFlowManager bVar, C57408d dVar, CountDownLatch countDownLatch, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, IGetDataCallback iGetDataCallback) {
            this.f141361a = bVar;
            this.f141362b = dVar;
            this.f141363c = countDownLatch;
            this.f141364d = objectRef;
            this.f141365e = objectRef2;
            this.f141366f = iGetDataCallback;
        }

        public final void run() {
            this.f141361a.mo194690a(this.f141362b);
            try {
                this.f141363c.await(3000, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                Log.m165390i("ObFlowManager", "checkStatus, await timeout", e);
                this.f141364d.element = (T) new ErrorResult("checkStatus, await timeout", e);
            }
            if (this.f141365e.element != null) {
                IGetDataCallback iGetDataCallback = this.f141366f;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(this.f141365e.element);
                    return;
                }
                return;
            }
            IGetDataCallback iGetDataCallback2 = this.f141366f;
            if (iGetDataCallback2 != null) {
                T t = this.f141364d.element;
                if (t == null) {
                    t = new ErrorResult("checkStatus, dataResult is null");
                }
                iGetDataCallback2.onError(t);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$resumeIfNeed$innerCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$o */
    public static final class C57419o implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ObFlowManager f141369a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57419o(ObFlowManager bVar) {
            this.f141369a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("ObFlowManager", "resumeIfNeed, loadData error", errorResult);
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Log.m165389i("ObFlowManager", "resumeIfNeed, loadData success, data=" + bool);
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                this.f141369a.mo194693b();
            }
        }
    }

    public /* synthetic */ ObFlowManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/ug/dyflow/flows/ObFlowManager$checkStatus$innerCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.a.b$d */
    public static final class C57408d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef f141358a;

        /* renamed from: b */
        final /* synthetic */ CountDownLatch f141359b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f141360c;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.larksuite.framework.callback.Entity.ErrorResult */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165384e("ObFlowManager", "checkStatus, loadData error", errorResult);
            this.f141360c.element = errorResult;
            this.f141359b.countDown();
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            T t;
            Log.m165389i("ObFlowManager", "checkStatus, loadData success, ret=" + bool);
            this.f141358a.element = (T) new Bundle();
            if (Intrinsics.areEqual((Object) bool, (Object) true) && (t = this.f141358a.element) != null) {
                t.putBoolean("need_on_boarding", true);
            }
            this.f141359b.countDown();
        }

        C57408d(Ref.ObjectRef objectRef, CountDownLatch countDownLatch, Ref.ObjectRef objectRef2) {
            this.f141358a = objectRef;
            this.f141359b = countDownLatch;
            this.f141360c = objectRef2;
        }
    }

    @Override // com.ss.android.lark.ug.dyflow.flows.BaseFlowManager
    /* renamed from: b */
    public IFlow mo194692b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Flow flow = new Flow(1, m222573f());
        flow.mo194740a("welcome", new C57410f());
        flow.mo194740a("video", new C57411g());
        flow.mo194740a("invite_guide", new C57412h());
        flow.mo194740a("invite", new C57413i());
        flow.mo194740a("spotlight", new C57414j());
        flow.mo194740a("jump", new C57415k());
        flow.mo194740a("add_friends", new C57416l());
        flow.mo194740a("completion", new C57417m());
        flow.mo194737a(new C57418n(this, str));
        return flow;
    }

    /* renamed from: b */
    public final void mo194694b(IGetDataCallback<Bundle> iGetDataCallback) {
        if (LocalStorage.f141356a.mo194700c()) {
            Log.m165389i("ObFlowManager", "checkStatus, onboarding finished.local");
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(new Bundle());
                return;
            }
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = (T) null;
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().submit(new RunnableC57409e(this, new C57408d(objectRef, countDownLatch, objectRef2), countDownLatch, objectRef2, objectRef, iGetDataCallback));
    }
}
