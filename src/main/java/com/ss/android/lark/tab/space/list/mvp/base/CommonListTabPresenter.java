package com.ss.android.lark.tab.space.list.mvp.base;

import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001c*\b\b\u0000\u0010\u0001*\u00020\u00022&\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00060\u00032\u00020\u0007:\u0001\u001cB/\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0013H\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabPresenter;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "Lcom/ss/android/lark/tab/space/list/mvp/base/ILifeCycle;", "model", "view", "viewDelegate", "(Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;)V", "getModel", "()Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "getView", "()Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "getViewDelegate", "()Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "addOnListScrollListener", "", "listener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "create", "createViewDelegate", "destroy", "pause", "removeOnListScrollListener", "resume", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.b */
public final class CommonListTabPresenter<T extends BaseListViewData> extends BasePresenter<ICommonListTabContract.IModel<T>, ICommonListTabContract.IView<T>, ICommonListTabContract.IView.Delegate<T>> {

    /* renamed from: a */
    public static final Companion f136499a = new Companion(null);

    /* renamed from: b */
    private final ICommonListTabContract.IModel<T> f136500b;

    /* renamed from: c */
    private final ICommonListTabContract.IView<T> f136501c;

    /* renamed from: d */
    private final ICommonListTabContract.IView.Delegate<T> f136502d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabPresenter$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ICommonListTabContract.IView.Delegate<T> createViewDelegate() {
        return this.f136502d;
    }

    /* renamed from: c */
    public final ICommonListTabContract.IView<T> mo188535c() {
        return this.f136501c;
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    /* renamed from: a */
    public void mo188532a() {
        this.f136501c.mo188492c();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ICommonListTabContract.IModel) getModel()).mo188482a(new C55308b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/CommonListTabPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.b$b */
    public static final class C55308b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CommonListTabPresenter f136503a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55308b(CommonListTabPresenter bVar) {
            this.f136503a = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo188536a(bool.booleanValue());
        }

        /* renamed from: a */
        public void mo188536a(boolean z) {
            this.f136503a.mo188535c().mo188491b(z);
            this.f136503a.mo188535c().mo188492c();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CommonListTabPresenter", "loadTimeFormat failed: " + errorResult.getDebugMsg());
            this.f136503a.mo188535c().mo188491b(true);
            this.f136503a.mo188535c().mo188492c();
        }
    }

    /* renamed from: a */
    public final void mo188533a(RecyclerView.OnScrollListener onScrollListener) {
        Intrinsics.checkParameterIsNotNull(onScrollListener, "listener");
        this.f136501c.mo188487a(onScrollListener);
    }

    public CommonListTabPresenter(ICommonListTabContract.IModel<T> aVar, ICommonListTabContract.IView<T> bVar, ICommonListTabContract.IView.Delegate<T> aVar2) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar2, "viewDelegate");
        this.f136500b = aVar;
        this.f136501c = bVar;
        this.f136502d = aVar2;
        setModel(aVar);
        setView(bVar);
        bVar.setViewDelegate(createViewDelegate());
    }
}
