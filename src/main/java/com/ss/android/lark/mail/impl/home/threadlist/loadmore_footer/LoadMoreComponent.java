package com.ss.android.lark.mail.impl.home.threadlist.loadmore_footer;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.arch.jack.Async;
import com.larksuite.arch.jack.Disposable;
import com.larksuite.arch.jack.ISubscriber;
import com.larksuite.arch.jack.JackView;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.arch.jack.LifecycleOwnerHolder;
import com.larksuite.arch.jack.State;
import com.larksuite.arch.jack.SubscriptionConfig;
import com.larksuite.arch.jack.Tuple1;
import com.larksuite.arch.jack.Tuple2;
import com.larksuite.arch.jack.Tuple3;
import com.larksuite.arch.jack.Tuple4;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27084f;
import com.scwang.smart.refresh.layout.p1230b.AbstractC27090f;
import com.scwang.smart.refresh.layout.p1231c.C27097c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.home.C42515f;
import com.ss.android.lark.mail.impl.home.C42531g;
import com.ss.android.lark.mail.impl.home.threadlist.C42593a;
import com.ss.android.lark.mail.impl.home.threadlist.MailFeedRecyclerView;
import com.ss.android.lark.mail.impl.home.threadlist.MailSmartRefreshLayout;
import com.ss.android.lark.mail.impl.service.C43374f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\u0006J.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreComponent;", "Lcom/larksuite/arch/jack/JackView;", "()V", "loadMoreView", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreView;", "loadMoreViewModel", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreViewModel;", "mFragment", "Landroidx/fragment/app/Fragment;", "mMailHomeAdapter", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailHomeAdapter;", "mMailHomePresenter", "Lcom/ss/android/lark/mail/impl/home/MailHomePresenter;", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "getLoadMoreViewModel", "init", "", "fragment", "smartRefreshLayout", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailSmartRefreshLayout;", "recyclerView", "Lcom/ss/android/lark/mail/impl/home/threadlist/MailFeedRecyclerView;", "homePresenter", "mailHomeAdapter", "onDestroy", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.a */
public final class LoadMoreComponent implements JackView {

    /* renamed from: a */
    public LoadMoreView f108452a;

    /* renamed from: b */
    public LoadMoreViewModel f108453b;

    /* renamed from: c */
    public C42531g f108454c;

    /* renamed from: d */
    public C42593a f108455d;

    /* renamed from: e */
    private Fragment f108456e;

    /* renamed from: c */
    public final void mo153150c() {
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public LifecycleOwnerHolder mo86226a() {
        return JackView.C24027a.m87835a(this);
    }

    @Override // com.larksuite.arch.jack.LifecycleOwnerHolder
    public LifecycleOwner aZ_() {
        return JackView.C24027a.m87836b(this);
    }

    /* renamed from: d */
    public final LoadMoreViewModel mo153151d() {
        LoadMoreViewModel dVar = this.f108453b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadMoreViewModel");
        }
        return dVar;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Fragment fragment = this.f108456e;
        if (fragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFragment");
        }
        Lifecycle lifecycle = fragment.getLifecycle();
        Intrinsics.checkExpressionValueIsNotNull(lifecycle, "mFragment.lifecycle");
        return lifecycle;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreComponent$init$1", "Lcom/scwang/smart/refresh/layout/simple/SimpleMultiListener;", "onStateChanged", "", "refreshLayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.a$a */
    public static final class C42610a extends C27097c {

        /* renamed from: a */
        final /* synthetic */ LoadMoreComponent f108457a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42610a(LoadMoreComponent aVar) {
            this.f108457a = aVar;
        }

        @Override // com.scwang.smart.refresh.layout.p1231c.C27097c, com.scwang.smart.refresh.layout.p1230b.AbstractC27093i
        /* renamed from: a */
        public void mo96324a(AbstractC27084f fVar, RefreshState refreshState, RefreshState refreshState2) {
            Intrinsics.checkParameterIsNotNull(fVar, "refreshLayout");
            Intrinsics.checkParameterIsNotNull(refreshState, "oldState");
            Intrinsics.checkParameterIsNotNull(refreshState2, "newState");
            if (refreshState == RefreshState.RefreshFinish && refreshState2 == RefreshState.None) {
                LoadMoreViewModel a = LoadMoreComponent.m169968a(this.f108457a);
                C42515f d = LoadMoreComponent.m169969b(this.f108457a).mo152995d();
                Intrinsics.checkExpressionValueIsNotNull(d, "mMailHomePresenter.dataLoader");
                a.autoLoadMore(d, LoadMoreComponent.m169970c(this.f108457a).mo153128j(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.a$b */
    public static final class C42611b extends Lambda implements Function1<LoadMoreState, Unit> {
        final /* synthetic */ LoadMoreComponent this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42611b(LoadMoreComponent aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LoadMoreState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(LoadMoreState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            Log.m165389i("LoadMoreViewModel", "newState : " + bVar);
            if (!bVar.mo153154a()) {
                LoadMoreComponent.m169971d(this.this$0).mo153166e();
            } else if (bVar.mo153157d() == RefreshState.Loading) {
                LoadMoreComponent.m169971d(this.this$0).mo153164c();
            } else {
                LoadMoreComponent.m169971d(this.this$0).mo153165d();
                if (bVar.mo153155b()) {
                    LoadMoreComponent.m169971d(this.this$0).mo153162a(bVar.mo153156c());
                } else {
                    LoadMoreComponent.m169971d(this.this$0).mo153166e();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/loadmore_footer/LoadMoreComponent$init$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a.a$c */
    public static final class C42612c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ LoadMoreComponent f108458a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42612c(LoadMoreComponent aVar) {
            this.f108458a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            if (i2 > 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager != null) {
                    i3 = linearLayoutManager.findLastVisibleItemPosition();
                } else {
                    i3 = 0;
                }
                C43374f f = C43374f.m172264f();
                Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
                if (!TextUtils.equals(f.mo155129q(), "OUTBOX") && LoadMoreComponent.m169970c(this.f108458a).getItemCount() <= i3 + C42038d.C42039a.m167222b()) {
                    Log.m165389i("LoadMoreViewModel", "onScrolled tryToPreLoadMore");
                    LoadMoreViewModel a = LoadMoreComponent.m169968a(this.f108458a);
                    C42515f d = LoadMoreComponent.m169969b(this.f108458a).mo152995d();
                    Intrinsics.checkExpressionValueIsNotNull(d, "mMailHomePresenter.dataLoader");
                    a.autoLoadMore(d, LoadMoreComponent.m169970c(this.f108458a).mo153128j(), true);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LoadMoreViewModel m169968a(LoadMoreComponent aVar) {
        LoadMoreViewModel dVar = aVar.f108453b;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadMoreViewModel");
        }
        return dVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ C42531g m169969b(LoadMoreComponent aVar) {
        C42531g gVar = aVar.f108454c;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailHomePresenter");
        }
        return gVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ C42593a m169970c(LoadMoreComponent aVar) {
        C42593a aVar2 = aVar.f108455d;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMailHomeAdapter");
        }
        return aVar2;
    }

    /* renamed from: d */
    public static final /* synthetic */ LoadMoreView m169971d(LoadMoreComponent aVar) {
        LoadMoreView cVar = aVar.f108452a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadMoreView");
        }
        return cVar;
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State> Disposable mo86220a(JackViewModel<S> lVar, SubscriptionConfig<S> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$subscribe");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87829a(this, lVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A> Disposable mo86221a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, SubscriptionConfig<Tuple1<A>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87830a(this, lVar, eVar, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B> Disposable mo86223a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, SubscriptionConfig<Tuple2<A, B>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87832a(this, lVar, eVar, eVar2, vVar, function1);
    }

    /* renamed from: a */
    public final void mo153149a(Fragment fragment, MailSmartRefreshLayout mailSmartRefreshLayout, MailFeedRecyclerView mailFeedRecyclerView, C42531g gVar, C42593a aVar) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        Intrinsics.checkParameterIsNotNull(mailSmartRefreshLayout, "smartRefreshLayout");
        Intrinsics.checkParameterIsNotNull(mailFeedRecyclerView, "recyclerView");
        Intrinsics.checkParameterIsNotNull(gVar, "homePresenter");
        Intrinsics.checkParameterIsNotNull(aVar, "mailHomeAdapter");
        this.f108456e = fragment;
        this.f108454c = gVar;
        this.f108455d = aVar;
        mailSmartRefreshLayout.mo96239b(false);
        mailSmartRefreshLayout.mo96229a((AbstractC27090f) new C42610a(this));
        AbstractC1142af a = new C1144ai(fragment).mo6005a(LoadMoreViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(fragme…oreViewModel::class.java)");
        LoadMoreViewModel dVar = (LoadMoreViewModel) a;
        this.f108453b = dVar;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadMoreViewModel");
        }
        dVar.start();
        LoadMoreView cVar = new LoadMoreView(mailFeedRecyclerView);
        this.f108452a = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadMoreView");
        }
        mailFeedRecyclerView.mo156540b(cVar.mo153163b());
        LoadMoreViewModel dVar2 = this.f108453b;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadMoreViewModel");
        }
        ISubscriber.C24024a.m87808a(this, dVar2, (SubscriptionConfig) null, new C42611b(this), 1, (Object) null);
        mailFeedRecyclerView.addOnScrollListener(new C42612c(this));
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, T> Disposable mo86222a(JackViewModel<S> lVar, KProperty1<S, ? extends Async<? extends T>> eVar, SubscriptionConfig<Tuple1<Async<T>>> vVar, Function1<? super Throwable, Unit> function1, Function0<Unit> function0, Function1<? super T, Unit> function12) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$asyncSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        return JackView.C24027a.m87831a(this, lVar, eVar, vVar, function1, function0, function12);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C> Disposable mo86224a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, SubscriptionConfig<Tuple3<A, B, C>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87833a(this, lVar, eVar, eVar2, eVar3, vVar, function1);
    }

    @Override // com.larksuite.arch.jack.ISubscriber
    /* renamed from: a */
    public <S extends State, A, B, C, D> Disposable mo86225a(JackViewModel<S> lVar, KProperty1<S, ? extends A> eVar, KProperty1<S, ? extends B> eVar2, KProperty1<S, ? extends C> eVar3, KProperty1<S, ? extends D> eVar4, SubscriptionConfig<Tuple4<A, B, C, D>> vVar, Function1<? super S, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(lVar, "$this$selectSubscribe");
        Intrinsics.checkParameterIsNotNull(eVar, "prop1");
        Intrinsics.checkParameterIsNotNull(eVar2, "prop2");
        Intrinsics.checkParameterIsNotNull(eVar3, "prop3");
        Intrinsics.checkParameterIsNotNull(eVar4, "prop4");
        Intrinsics.checkParameterIsNotNull(vVar, "config");
        Intrinsics.checkParameterIsNotNull(function1, "subscriber");
        return JackView.C24027a.m87834a(this, lVar, eVar, eVar2, eVar3, eVar4, vVar, function1);
    }
}
