package com.ss.android.lark.money.redpacket.cover;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.money.redpacket.cover.IRedPacketCoverContract;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IModel;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IModel;Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView;)V", "viewDelegate", "create", "", "createViewDelegate", "RedPacketCoverViewDelegate", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.cover.e */
public final class RedPacketCoverPresenter extends BasePresenter<IRedPacketCoverContract.IModel, IRedPacketCoverContract.IView, IRedPacketCoverContract.IView.Delegate> {

    /* renamed from: a */
    private IRedPacketCoverContract.IView.Delegate f120992a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IRedPacketCoverContract.IView.Delegate createViewDelegate() {
        RedPacketCoverViewDelegate aVar = new RedPacketCoverViewDelegate();
        this.f120992a = aVar;
        if (aVar != null) {
            return aVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.money.redpacket.cover.RedPacketCoverPresenter.RedPacketCoverViewDelegate");
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((IRedPacketCoverContract.IView) getView()).mo168255a();
        ((IRedPacketCoverContract.IModel) getModel()).mo168274a(new UIGetDataCallback(new C48059b(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverPresenter$RedPacketCoverViewDelegate;", "Lcom/ss/android/lark/money/redpacket/cover/IRedPacketCoverContract$IView$Delegate;", "(Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverPresenter;)V", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.e$a */
    public final class RedPacketCoverViewDelegate implements IRedPacketCoverContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RedPacketCoverViewDelegate() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/money/redpacket/cover/RedPacketCoverPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.e$b */
    public static final class C48059b implements IGetDataCallback<RedPacketCoverListResponse> {

        /* renamed from: a */
        final /* synthetic */ RedPacketCoverPresenter f120994a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48059b(RedPacketCoverPresenter eVar) {
            this.f120994a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(RedPacketCoverListResponse redPacketCoverListResponse) {
            Intrinsics.checkParameterIsNotNull(redPacketCoverListResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((IRedPacketCoverContract.IView) this.f120994a.getView()).mo168257a(redPacketCoverListResponse);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((IRedPacketCoverContract.IView) this.f120994a.getView()).mo168258b();
        }
    }

    public RedPacketCoverPresenter(IRedPacketCoverContract.IModel aVar, IRedPacketCoverContract.IView bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        setModel(aVar);
        setView(bVar);
        ((IRedPacketCoverContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
