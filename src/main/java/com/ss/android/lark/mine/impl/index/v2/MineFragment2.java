package com.ss.android.lark.mine.impl.index.v2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ak;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.AbstractC29528b;
import com.ss.android.lark.biz.core.api.IMineController;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.mine.impl.index.IMineFragment;
import com.ss.android.lark.mine.impl.index.v2.container.MineContainer;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u001a\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\rH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u0005H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/MineFragment2;", "Lcom/ss/android/lark/base/fragment/LazyLoadFragment;", "Lcom/ss/android/lark/mine/impl/index/IMineFragment;", "()V", "mListener", "Lcom/ss/android/lark/biz/core/api/IMineController$OnGotoOtherPageListener;", "getMListener", "()Lcom/ss/android/lark/biz/core/api/IMineController$OnGotoOtherPageListener;", "setMListener", "(Lcom/ss/android/lark/biz/core/api/IMineController$OnGotoOtherPageListener;)V", "mineContainer", "Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer;", "rootView", "Landroid/view/View;", "destroy", "", "getContentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "initMineContainer", "view", "noticeShowMineTip", "canShow", "", "onShow", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "reload", "setPageChangeListener", "listener", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.index.v2.c */
public final class MineFragment2 extends AbstractC29528b implements IMineFragment {

    /* renamed from: a */
    private View f115317a;

    /* renamed from: b */
    private MineContainer f115318b;

    /* renamed from: c */
    private IMineController.OnGotoOtherPageListener f115319c;

    /* renamed from: d */
    private HashMap f115320d;

    /* renamed from: f */
    public void mo67293f() {
        HashMap hashMap = this.f115320d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.AbstractC29528b, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo67293f();
    }

    /* renamed from: e */
    public final IMineController.OnGotoOtherPageListener mo67292e() {
        return this.f115319c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/MineFragment2$initMineContainer$1", "Lcom/ss/android/lark/mine/impl/index/v2/container/MineContainer$IContainerDependency;", "isFragmentAdded", "", "onGotoOtherPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.c$a */
    public static final class C45668a implements MineContainer.IContainerDependency {

        /* renamed from: a */
        final /* synthetic */ MineFragment2 f115321a;

        @Override // com.ss.android.lark.mine.impl.index.v2.container.MineContainer.IContainerDependency
        /* renamed from: b */
        public boolean mo160801b() {
            return this.f115321a.isActive();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.index.v2.c$a$a */
        static final class RunnableC45669a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45668a f115322a;

            RunnableC45669a(C45668a aVar) {
                this.f115322a = aVar;
            }

            public final void run() {
                IMineController.OnGotoOtherPageListener e = this.f115322a.f115321a.mo67292e();
                if (e != null) {
                    e.onGotoOtherPage();
                }
            }
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.container.MineContainer.IContainerDependency
        /* renamed from: a */
        public void mo160800a() {
            if (!DesktopUtil.m144301a(this.f115321a.mContext)) {
                UICallbackExecutor.executeDelayed(new RunnableC45669a(this), 800);
            } else {
                this.f115321a.finish();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45668a(MineFragment2 cVar) {
            this.f115321a = cVar;
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.IMineFragment
    /* renamed from: a */
    public void mo67278a() {
        MineHitPoint.m181466a();
        MineContainer mineContainer = this.f115318b;
        if (mineContainer != null) {
            mineContainer.bb_();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: l */
    public void mo104653l() {
        ak viewModelStore;
        super.mo104653l();
        FragmentActivity activity = getActivity();
        if (activity != null && (viewModelStore = activity.getViewModelStore()) != null) {
            viewModelStore.mo6010b();
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.IMineFragment
    /* renamed from: b */
    public void mo67285b() {
        ak viewModelStore;
        if (this.f115318b != null) {
            WidgetManager a = WidgetManager.Companion.m151976a(WidgetManager.f99047e, this, null, 2, null);
            MineContainer mineContainer = this.f115318b;
            if (mineContainer != null) {
                a.mo141217b(mineContainer);
                FragmentActivity activity = getActivity();
                if (!(activity == null || (viewModelStore = activity.getViewModelStore()) == null)) {
                    viewModelStore.mo6010b();
                }
                View view = this.f115317a;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("rootView");
                }
                m181071b(view);
                MineContainer mineContainer2 = this.f115318b;
                if (mineContainer2 == null) {
                    Intrinsics.throwNpe();
                }
                mineContainer2.ba_();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.IMineFragment
    /* renamed from: a */
    public void mo160767a(IMineController.OnGotoOtherPageListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f115319c = aVar;
    }

    /* renamed from: b */
    private final void m181071b(View view) {
        this.f115318b = new MineContainer(getActivity(), new C45668a(this));
        WidgetManager a = WidgetManager.f99047e.mo141218a(this, view);
        MineContainer mineContainer = this.f115318b;
        if (mineContainer != null) {
            a.mo141213a(R.id.root, (Widget) mineContainer, false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.framework.larkwidget.Widget");
    }

    @Override // com.ss.android.lark.mine.impl.index.IMineFragment
    /* renamed from: a */
    public void mo67284a(boolean z) {
        MineContainer mineContainer = this.f115318b;
        if (mineContainer != null) {
            mineContainer.mo160803a(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m181071b(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: a */
    public View mo67276a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_mine_v2_root, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…2_root, container, false)");
        this.f115317a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}
