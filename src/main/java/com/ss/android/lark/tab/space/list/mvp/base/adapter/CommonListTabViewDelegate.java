package com.ss.android.lark.tab.space.list.mvp.base.adapter;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u000eH\u0004R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabViewDelegate;", "T", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView$Delegate;", "view", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "model", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "(Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;)V", "getModel", "()Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "getView", "()Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "canLoadMore", "", "onLoadMore", "", "onPull", "reset", "pullData", "loadMore", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.c */
public abstract class CommonListTabViewDelegate<T extends BaseListViewData> implements ICommonListTabContract.IView.Delegate<T> {

    /* renamed from: a */
    private final ICommonListTabContract.IView<T> f136493a;

    /* renamed from: b */
    private final ICommonListTabContract.IModel<T> f136494b;

    /* renamed from: c */
    public final ICommonListTabContract.IView<T> mo188526c() {
        return this.f136493a;
    }

    /* renamed from: d */
    public final ICommonListTabContract.IModel<T> mo188527d() {
        return this.f136494b;
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView.Delegate
    /* renamed from: a */
    public void mo188493a() {
        mo188525b(true);
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView.Delegate
    /* renamed from: b */
    public boolean mo188497b() {
        return this.f136494b.mo188485c();
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IView.Delegate
    /* renamed from: a */
    public void mo188495a(boolean z) {
        if (z) {
            this.f136494b.mo188484b();
        }
        mo188525b(!z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo188525b(boolean z) {
        this.f136494b.mo188483a(new C55307a(this, z), z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabViewDelegate$pullData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "searchInfoList", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.mvp.base.a.c$a */
    public static final class C55307a implements IGetDataCallback<List<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ CommonListTabViewDelegate f136495a;

        /* renamed from: b */
        final /* synthetic */ boolean f136496b;

        /* renamed from: a */
        public void onSuccess(List<? extends T> list) {
            Intrinsics.checkParameterIsNotNull(list, "searchInfoList");
            this.f136495a.mo188526c().mo188486a();
            this.f136495a.mo188526c().mo188488a(list, this.f136496b);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f136495a.mo188526c().mo188486a();
            this.f136495a.mo188526c().mo188489a(this.f136496b);
        }

        C55307a(CommonListTabViewDelegate cVar, boolean z) {
            this.f136495a = cVar;
            this.f136496b = z;
        }
    }

    public CommonListTabViewDelegate(ICommonListTabContract.IView<T> bVar, ICommonListTabContract.IModel<T> aVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f136493a = bVar;
        this.f136494b = aVar;
    }
}
