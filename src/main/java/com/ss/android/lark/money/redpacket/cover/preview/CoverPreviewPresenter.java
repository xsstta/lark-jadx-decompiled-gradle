package com.ss.android.lark.money.redpacket.cover.preview;

import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.money.redpacket.cover.preview.ICoverPreviewContract;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IModel;", "Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IView;", "Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IModel;Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IView;)V", "viewDelegate", "create", "", "createViewDelegate", "CoverPreviewViewDelegate", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.preview.c */
public final class CoverPreviewPresenter extends BasePresenter<ICoverPreviewContract.IModel, ICoverPreviewContract.IView, ICoverPreviewContract.IView.Delegate> {

    /* renamed from: a */
    private ICoverPreviewContract.IView.Delegate f121012a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ICoverPreviewContract.IView.Delegate createViewDelegate() {
        CoverPreviewViewDelegate aVar = new CoverPreviewViewDelegate();
        this.f121012a = aVar;
        if (aVar != null) {
            return aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewPresenter.CoverPreviewViewDelegate");
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ICoverPreviewContract.IView) getView()).mo168289a();
        ((ICoverPreviewContract.IView) getView()).mo168293b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewPresenter$CoverPreviewViewDelegate;", "Lcom/ss/android/lark/money/redpacket/cover/preview/ICoverPreviewContract$IView$Delegate;", "(Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewPresenter;)V", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.c$a */
    public final class CoverPreviewViewDelegate implements ICoverPreviewContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CoverPreviewViewDelegate() {
        }
    }

    public CoverPreviewPresenter(ICoverPreviewContract.IModel aVar, ICoverPreviewContract.IView bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        setModel(aVar);
        setView(bVar);
        ((ICoverPreviewContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
