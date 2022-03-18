package com.ss.android.lark.ug.dyflow.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.common.BackToHomeUtils;
import com.ss.android.lark.ug.dyflow.common.FlowStepDelegateHelper;
import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000  2\u00020\u0001:\u0002 !B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0004J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\fH\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010H\u0004J\u0012\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH&J\u0012\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "flowStepData", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "getFlowStepData", "()Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "setFlowStepData", "(Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;)V", "flowStepDelegate", "Lcom/ss/android/lark/ug/dyflow/common/IFlowStepDelegate;", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "getFlowParam", "", "key", "handleSlotAction", "slotName", "mustLink", "notifyExExit", "", "errCode", "", ApiHandler.API_CALLBACK_ERRMSG, "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreate2", "runStep", "uri", "Companion", "DefaultFlowStepResDependency", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseFlowAct extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f141376a = new Companion(null);

    /* renamed from: b */
    private IFlowStepDelegate f141377b;

    /* renamed from: c */
    private FlowStepData f141378c;

    /* renamed from: a */
    public abstract void mo194722a(Bundle bundle);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct$Companion;", "", "()V", "TAG", "", "startFromStep", "", "context", "Landroid/content/Context;", "clazz", "Ljava/lang/Class;", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;", "flowStep", "Lcom/ss/android/lark/ug/dyflow/common/BaseFlowStep;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.BaseFlowAct$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo194724a(Context context, Class<? extends BaseFlowAct> cls, BaseFlowStep aVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(cls, "clazz");
            Intrinsics.checkParameterIsNotNull(aVar, "flowStep");
            Intent intent = new Intent(context, cls);
            FlowStepDelegateHelper.f141398a.mo194773a(intent, aVar);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final FlowStepData mo194720a() {
        return this.f141378c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct$DefaultFlowStepResDependency;", "Lcom/ss/android/lark/ug/dyflow/common/FlowStepResDependency;", "(Lcom/ss/android/lark/ug/dyflow/common/BaseFlowAct;)V", "doClick", "", "view", "Landroid/view/View;", "slotName", "", "getButtonText", "getPictureUrl", "getText", "getVideoUrl", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.BaseFlowAct$b */
    public class DefaultFlowStepResDependency implements FlowStepResDependency {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public DefaultFlowStepResDependency() {
        }

        @Override // com.ss.android.lark.ug.dyflow.common.FlowStepResDependency
        /* renamed from: a */
        public String mo194725a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "slotName");
            FlowStepData a = BaseFlowAct.this.mo194720a();
            if (a != null) {
                return a.mo194838d(str);
            }
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.FlowStepResDependency
        /* renamed from: b */
        public String mo194727b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "slotName");
            FlowStepData a = BaseFlowAct.this.mo194720a();
            if (a != null) {
                return a.mo194846h(str);
            }
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.FlowStepResDependency
        /* renamed from: c */
        public String mo194728c(String str) {
            Intrinsics.checkParameterIsNotNull(str, "slotName");
            FlowStepData a = BaseFlowAct.this.mo194720a();
            if (a != null) {
                return a.mo194841e(str);
            }
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.FlowStepResDependency
        /* renamed from: d */
        public String mo194729d(String str) {
            Intrinsics.checkParameterIsNotNull(str, "slotName");
            FlowStepData a = BaseFlowAct.this.mo194720a();
            if (a != null) {
                return a.mo194844f(str);
            }
            return null;
        }

        @Override // com.ss.android.lark.ug.dyflow.common.FlowStepResDependency
        /* renamed from: a */
        public void mo194726a(View view, String str) {
            Intrinsics.checkParameterIsNotNull(str, "slotName");
            BaseFlowAct.this.mo194723a(str, true);
        }
    }

    /* renamed from: a */
    public final String mo194721a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        IFlowStepDelegate iFlowStepDelegate = this.f141377b;
        if (iFlowStepDelegate != null) {
            return iFlowStepDelegate.getFlowParam(str);
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (BackToHomeUtils.f141336a.mo194683a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        FlowStepData stepData;
        super.onCreate(bundle);
        FlowStepDelegateHelper.Companion aVar = FlowStepDelegateHelper.f141398a;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        IFlowStepDelegate a = aVar.mo194772a(intent);
        if (a != null) {
            this.f141377b = a;
            if (a == null || (stepData = a.getStepData()) == null) {
                Log.m165389i("DyFlow", "act_" + getClass() + ", flowStepData is null");
                finish();
                return;
            }
            this.f141378c = stepData;
            mo194722a(bundle);
            return;
        }
        Log.m165389i("DyFlow", "act_" + getClass() + ", flowStepDelegate is null");
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo194723a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "slotName");
        IFlowStepDelegate iFlowStepDelegate = this.f141377b;
        if (iFlowStepDelegate != null) {
            return iFlowStepDelegate.handleSlotAction(str, z);
        }
        Log.m165389i("DyFlow", "act_" + getClass() + ", flowStepDelegate is null");
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m222605a(BaseFlowAct baseFlowAct, String str, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return baseFlowAct.mo194723a(str, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleSlotAction");
    }
}
