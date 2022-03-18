package com.ss.android.lark.guide.biz.bubble.tabpage.contact;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ug.facade.UgReachSdk;
import com.ss.android.lark.ug.facade.bean.BizContextProvider;
import com.ss.android.lark.ug.feat.add_friends.AddRecFriendsActivity;
import com.ss.android.lark.ug.spotlight.SpotlightReachPoint;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0012H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u00050\u00050\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "contextProvider", "Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact$ContextProvider;", "lifecycleListener", "Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact$LifeCycleListener;", "reachPoint", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint;", "viewRef", "kotlin.jvm.PlatformType", "openAddRecFriendsPage", "", "recycle", "showIfPossible", "tryExpose", "Companion", "ContextProvider", "LifeCycleListener", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.b.b.b */
public final class UGReachAddNewContact {

    /* renamed from: c */
    public static final Companion f99103c = new Companion(null);

    /* renamed from: a */
    public final WeakReference<Activity> f99104a;

    /* renamed from: b */
    public final WeakReference<View> f99105b;

    /* renamed from: d */
    private SpotlightReachPoint f99106d;

    /* renamed from: e */
    private final ContextProvider f99107e;

    /* renamed from: f */
    private final LifeCycleListener f99108f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact$Companion;", "", "()V", "BIZ_CONTEXT_KEY_GUIDE_KEY", "", "GUIDE_KEY", "REACH_POINT_ID", "SCENARIO_ID", "TAG", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.b.b.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo141313a() {
        m152128d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact$ContextProvider;", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$SpotlightContextProvider;", "ugReachAddNewContact", "Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;", "(Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;)V", "getUgReachAddNewContact", "()Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;", "getActivity", "Landroid/app/Activity;", "getAnchorViews", "", "Landroid/view/View;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.b.b.b$b */
    private static final class ContextProvider implements SpotlightReachPoint.SpotlightContextProvider {

        /* renamed from: a */
        private final UGReachAddNewContact f99111a;

        @Override // com.ss.android.lark.ug.spotlight.SpotlightReachPoint.SpotlightContextProvider
        /* renamed from: a */
        public Activity mo141318a() {
            return this.f99111a.f99104a.get();
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightReachPoint.SpotlightContextProvider
        /* renamed from: b */
        public List<View> mo141319b() {
            View view = this.f99111a.f99105b.get();
            if (view != null) {
                return CollectionsKt.listOf(view);
            }
            return CollectionsKt.emptyList();
        }

        public ContextProvider(UGReachAddNewContact bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "ugReachAddNewContact");
            this.f99111a = bVar;
        }
    }

    /* renamed from: c */
    public final void mo141315c() {
        SpotlightReachPoint jVar = this.f99106d;
        if (jVar != null) {
            UgReachSdk.INSTANCE.recycleReachPoint(jVar);
        }
    }

    /* renamed from: d */
    private final void m152128d() {
        Log.m165389i("UGReachAddNewContact", "tryExpose");
        UgReachSdk.tryExpose$default(UgReachSdk.INSTANCE, "SCENE_CONTACT", (BizContextProvider) null, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo141314b() {
        Activity activity = this.f99104a.get();
        if (activity != null) {
            activity.startActivity(new Intent(activity, AddRecFriendsActivity.class));
        } else {
            Log.m165389i("UGReachAddNewContact", "openAddRecFriendsPage -> activity is null.");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact$LifeCycleListener;", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint$SpotlightLifecycleListener;", "ugReachAddNewContact", "Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;", "(Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;)V", "getUgReachAddNewContact", "()Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/UGReachAddNewContact;", "onClose", "", "spotlightReachPoint", "Lcom/ss/android/lark/ug/spotlight/SpotlightReachPoint;", "onLeftButtonClick", "curIndex", "", "total", "onRightButtonClick", "onShow", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.b.b.b$c */
    private static final class LifeCycleListener implements SpotlightReachPoint.SpotlightLifecycleListener {

        /* renamed from: a */
        private final UGReachAddNewContact f99112a;

        public LifeCycleListener(UGReachAddNewContact bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "ugReachAddNewContact");
            this.f99112a = bVar;
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightReachPoint.SpotlightLifecycleListener
        /* renamed from: a */
        public void mo141320a(SpotlightReachPoint jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "spotlightReachPoint");
            Log.m165389i("UGReachAddNewContact", "onClose:" + jVar.mo195214h());
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightReachPoint.SpotlightLifecycleListener
        /* renamed from: b */
        public void mo141322b(SpotlightReachPoint jVar) {
            Intrinsics.checkParameterIsNotNull(jVar, "spotlightReachPoint");
            Log.m165389i("UGReachAddNewContact", "onShow:" + jVar.mo195214h());
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightReachPoint.SpotlightLifecycleListener
        /* renamed from: a */
        public void mo141321a(SpotlightReachPoint jVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(jVar, "spotlightReachPoint");
            jVar.mo195194a();
            this.f99112a.mo141315c();
        }

        @Override // com.ss.android.lark.ug.spotlight.SpotlightReachPoint.SpotlightLifecycleListener
        /* renamed from: b */
        public void mo141323b(SpotlightReachPoint jVar, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(jVar, "spotlightReachPoint");
            this.f99112a.mo141314b();
            jVar.mo195194a();
            this.f99112a.mo141315c();
        }
    }

    public UGReachAddNewContact(Activity activity, final View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "anchorView");
        this.f99104a = new WeakReference<>(activity);
        this.f99105b = new WeakReference<>(view);
        ContextProvider bVar = new ContextProvider(this);
        this.f99107e = bVar;
        LifeCycleListener cVar = new LifeCycleListener(this);
        this.f99108f = cVar;
        SpotlightReachPoint jVar = (SpotlightReachPoint) UgReachSdk.obtainReachPointById$default(UgReachSdk.INSTANCE, "RP_SPOTLIGHT_ADD_NEW_CONTACT", SpotlightReachPoint.class, null, 4, null);
        this.f99106d = jVar;
        if (jVar != null) {
            jVar.mo195195a(bVar);
        }
        SpotlightReachPoint jVar2 = this.f99106d;
        if (jVar2 != null) {
            jVar2.mo195196a(cVar);
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.ss.android.lark.guide.biz.bubble.tabpage.contact.UGReachAddNewContact.View$OnAttachStateChangeListenerC385731 */

            /* renamed from: a */
            final /* synthetic */ UGReachAddNewContact f99109a;

            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                this.f99109a.mo141315c();
            }

            {
                this.f99109a = r1;
            }
        });
    }
}
