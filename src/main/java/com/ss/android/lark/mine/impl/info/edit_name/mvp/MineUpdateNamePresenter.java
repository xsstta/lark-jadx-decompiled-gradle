package com.ss.android.lark.mine.impl.info.edit_name.mvp;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0014J\b\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNamePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IModel;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView$Delegate;", "model", "view", "(Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IModel;Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView;)V", "create", "", "createViewDelegate", "init", "ViewDelegate", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.c */
public final class MineUpdateNamePresenter extends BasePresenter<IMineUpdateNameContract.IModel, IMineUpdateNameContract.IView, IMineUpdateNameContract.IView.Delegate> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IMineUpdateNameContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m181383b();
    }

    /* renamed from: b */
    private final void m181383b() {
        ((IMineUpdateNameContract.IView) getView()).mo160964a(((IMineUpdateNameContract.IModel) getModel()).mo160970a());
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNamePresenter$ViewDelegate;", "Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/IMineUpdateNameContract$IView$Delegate;", "(Lcom/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNamePresenter;)V", "onSetMineName", "", "mineName", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.c$a */
    public final class ViewDelegate implements IMineUpdateNameContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mine/impl/info/edit_name/mvp/MineUpdateNamePresenter$ViewDelegate$onSetMineName$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mine.impl.info.edit_name.mvp.c$a$a */
        public static final class C45772a implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f115538a;

            /* renamed from: b */
            final /* synthetic */ String f115539b;

            /* renamed from: a */
            public void onSuccess(String str) {
                ((IMineUpdateNameContract.IView) MineUpdateNamePresenter.this.getView()).mo160966b(this.f115539b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String displayMsg = errorResult.getDisplayMsg();
                if (displayMsg == null) {
                    displayMsg = UIHelper.getString(R.string.Lark_Setting_NameNoPassDetection);
                }
                if (!TextUtils.isEmpty(displayMsg)) {
                    Intrinsics.checkExpressionValueIsNotNull(displayMsg, "finalDisplayMsg");
                    ((IMineUpdateNameContract.IView) MineUpdateNamePresenter.this.getView()).mo160968c(displayMsg);
                    return;
                }
                String string = UIHelper.getString(R.string.Lark_Setting_NameNoPassDetection);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…ting_NameNoPassDetection)");
                ((IMineUpdateNameContract.IView) MineUpdateNamePresenter.this.getView()).mo160968c(string);
            }

            C45772a(ViewDelegate aVar, String str) {
                this.f115538a = aVar;
                this.f115539b = str;
            }
        }

        @Override // com.ss.android.lark.mine.impl.info.edit_name.mvp.IMineUpdateNameContract.IView.Delegate
        /* renamed from: a */
        public void mo160972a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "mineName");
            ((IMineUpdateNameContract.IModel) MineUpdateNamePresenter.this.getModel()).mo160971a(str, new UIGetDataCallback(new C45772a(this, str)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MineUpdateNamePresenter(IMineUpdateNameContract.IModel aVar, IMineUpdateNameContract.IView bVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
    }
}
