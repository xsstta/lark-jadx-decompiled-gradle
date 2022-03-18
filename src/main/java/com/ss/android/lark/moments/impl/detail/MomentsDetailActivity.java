package com.ss.android.lark.moments.impl.detail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.C1170p;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.detail.MomentsDetailFragment;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0014J\u0006\u0010\u0005\u001a\u00020\u000bJ\"\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000bH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "detailFragment", "Lcom/ss/android/lark/moments/impl/detail/MomentsDetailFragment;", "needExitAnim", "", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "finish", "", "isSlideEnable", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsDetailActivity extends BaseFragmentActivity {

    /* renamed from: c */
    public static final Companion f119492c = new Companion(null);

    /* renamed from: a */
    public MomentsDetailFragment f119493a;

    /* renamed from: b */
    public boolean f119494b;

    /* renamed from: a */
    public Context mo166496a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo166498a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m187708a(this, context);
    }

    /* renamed from: b */
    public Resources mo166499b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo166500c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m187706a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo166502d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m187712e(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m187710c(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m187711d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/detail/MomentsDetailActivity$Companion;", "", "()V", "EXTRA_JUMP_COMMENT_ID", "", "EXTRA_NEED_SHOW_JUMP_TITLE", "EXTRA_POST_DELETED", "EXTRA_POST_ID", "EXTRA_SHOW_COMMENT", "LOG_TAG", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.detail.MomentsDetailActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo166497a() {
        this.f119494b = true;
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        Job unused = C69553g.m266944a(C1170p.m5399a(this), null, null, new C47332b(this, null), 3, null);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        Log.m165389i("MomentsDetailActivity", "onDestroy");
        MomentsDetailFragment dVar = this.f119493a;
        if (dVar != null) {
            dVar.mo166608e();
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        Boolean bool;
        MomentsDetailFragment dVar = this.f119493a;
        if (dVar != null) {
            bool = dVar.mo166610g();
        } else {
            bool = null;
        }
        if (!Intrinsics.areEqual((Object) bool, (Object) false)) {
            MomentsDetailFragment dVar2 = this.f119493a;
            if (dVar2 != null) {
                dVar2.mo166609f();
            }
            Job unused = C69553g.m266944a(C1170p.m5399a(this), null, null, new C47333c(this, null), 3, null);
        }
    }

    /* renamed from: c */
    public static Resources m187710c(MomentsDetailActivity momentsDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsDetailActivity);
        }
        return momentsDetailActivity.mo166499b();
    }

    /* renamed from: e */
    public static AssetManager m187712e(MomentsDetailActivity momentsDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsDetailActivity);
        }
        return momentsDetailActivity.mo166502d();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Boolean bool;
        MomentsDetailFragment dVar = this.f119493a;
        if (dVar != null) {
            bool = dVar.mo166610g();
        } else {
            bool = null;
        }
        if (Intrinsics.areEqual((Object) bool, (Object) false)) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailActivity$finish$1", mo239173f = "MomentsDetailActivity.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.detail.MomentsDetailActivity$b */
    static final class C47332b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47332b(MomentsDetailActivity momentsDetailActivity, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsDetailActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47332b bVar = new C47332b(this.this$0, cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47332b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                MomentsDetailFragment dVar = this.this$0.f119493a;
                if (dVar != null) {
                    dVar.mo166607d();
                }
                MomentsDetailActivity.super.finish();
                if (!this.this$0.f119494b) {
                    this.this$0.overridePendingTransition(R.anim.moments_activity_exit_anim_none, R.anim.moments_activity_exit_anim_none);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.detail.MomentsDetailActivity$onBackPressed$1", mo239173f = "MomentsDetailActivity.kt", mo239174i = {}, mo239175l = {}, mo239176m = "invokeSuspend", mo239177n = {}, mo239178s = {})
    /* renamed from: com.ss.android.lark.moments.impl.detail.MomentsDetailActivity$c */
    static final class C47333c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsDetailActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47333c(MomentsDetailActivity momentsDetailActivity, Continuation cVar) {
            super(2, cVar);
            this.this$0 = momentsDetailActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47333c cVar2 = new C47333c(this.this$0, cVar);
            cVar2.p$ = (CoroutineScope) obj;
            return cVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47333c) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C69086a.m265828a();
            if (this.label == 0) {
                C69097g.m265891a(obj);
                MomentsDetailFragment dVar = this.this$0.f119493a;
                if (dVar != null) {
                    dVar.mo166607d();
                }
                this.this$0.mo166497a();
                MomentsDetailActivity.super.onBackPressed();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: d */
    public static void m187711d(MomentsDetailActivity momentsDetailActivity) {
        momentsDetailActivity.mo166500c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsDetailActivity momentsDetailActivity2 = momentsDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m165389i("MomentsDetailActivity", "onCreate");
        getWindow().setBackgroundDrawable(getResources().getDrawable(R.color.bg_body));
        MomentsDetailFragment.Companion aVar = MomentsDetailFragment.f119611j;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        MomentsDetailFragment a = aVar.mo166612a(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, a);
        beginTransaction.commitAllowingStateLoss();
        this.f119493a = a;
    }

    /* renamed from: a */
    public static void m187708a(MomentsDetailActivity momentsDetailActivity, Context context) {
        momentsDetailActivity.mo166498a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m187706a(MomentsDetailActivity momentsDetailActivity, Configuration configuration) {
        Context a = momentsDetailActivity.mo166496a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        MomentsDetailFragment dVar = this.f119493a;
        if (dVar != null) {
            dVar.mo166603a(i, i2, intent);
        }
    }
}
