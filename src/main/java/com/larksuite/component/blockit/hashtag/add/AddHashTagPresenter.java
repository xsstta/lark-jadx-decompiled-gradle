package com.larksuite.component.blockit.hashtag.add;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.entity.BlockTypeID;
import com.larksuite.component.blockit.entity.TagPermissionType;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.add.AddHashTagView;
import com.larksuite.component.blockit.hashtag.add.IAddHashTagContract;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001fBU\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0014J \u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0006\u0010\u001e\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IModel;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView$Delegate;", "rootView", "Landroid/view/View;", "viewDependency", "Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView$ViewDependency;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "mIsAdd", "", "context", "", "userId", "hitPointParams", "", "", "(Landroid/view/View;Lcom/larksuite/component/blockit/hashtag/add/AddHashTagView$ViewDependency;Lcom/larksuite/component/blockit/entity/BlockEntity;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "isWait", "create", "", "createViewDelegate", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "ViewDelegate", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.add.c */
public final class AddHashTagPresenter extends BasePresenter<IAddHashTagContract.IModel, IAddHashTagContract.IView, IAddHashTagContract.IView.Delegate> {

    /* renamed from: a */
    public boolean f59530a;

    /* renamed from: b */
    public final BlockEntity f59531b;

    /* renamed from: c */
    public final boolean f59532c;

    /* renamed from: d */
    public final String f59533d;

    /* renamed from: e */
    public final String f59534e;

    /* renamed from: f */
    private final Map<String, Object> f59535f;

    /* renamed from: a */
    public final void mo86459a(int i, int i2, Intent intent) {
    }

    /* renamed from: b */
    public final boolean mo86460b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IAddHashTagContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (this.f59532c) {
            ((IAddHashTagContract.IModel) getModel()).mo86450a("", new UIGetDataCallback(new C24093b(this)));
        } else {
            ((IAddHashTagContract.IModel) getModel()).mo86451a("", this.f59534e, new UIGetDataCallback(new C24094c(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$ViewDelegate;", "Lcom/larksuite/component/blockit/hashtag/add/IAddHashTagContract$IView$Delegate;", "(Lcom/larksuite/component/blockit/hashtag/add/AddHashTagPresenter;)V", "onAddHashTag", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onCreateHashTag", "onDeleteSearchQuery", "onSearchHashTag", SearchIntents.EXTRA_QUERY, "", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.c$a */
    public final class ViewDelegate implements IAddHashTagContract.IView.Delegate {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$ViewDelegate$onAddHashTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.add.c$a$a */
        public static final class C24089a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f59537a;

            /* renamed from: b */
            final /* synthetic */ HashTagViewData f59538b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo86464a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                AddHashTagPresenter.this.f59530a = false;
                Log.m165382e(errorResult.toString());
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg != null) {
                    Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                    IAddHashTagContract.IView.C24101a.m88006a((IAddHashTagContract.IView) AddHashTagPresenter.this.getView(), debugMsg, 0, 2, null);
                }
            }

            /* renamed from: a */
            public void mo86464a(boolean z) {
                String str;
                if (this.f59538b.mo86498j() == TagPermissionType.Private.value()) {
                    BlockEntity blockEntity = AddHashTagPresenter.this.f59531b;
                    if (blockEntity != null) {
                        str = blockEntity.getBlockTypeID();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, BlockTypeID.CHAT.getValue())) {
                        String string = UIHelper.getString(R.string.Lark_Pano_AddAutoTagTopicSuccess);
                        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…o_AddAutoTagTopicSuccess)");
                        ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86474a(string, R.drawable.ic_svg_toast_succeed);
                        ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86476b();
                    }
                }
                String string2 = UIHelper.getString(R.string.Lark_Pano_AddTopicSuccess);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…ark_Pano_AddTopicSuccess)");
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86474a(string2, R.drawable.ic_svg_toast_succeed);
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86476b();
            }

            C24089a(ViewDelegate aVar, HashTagViewData bVar) {
                this.f59537a = aVar;
                this.f59538b = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$ViewDelegate$onCreateHashTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.add.c$a$b */
        public static final class C24090b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f59539a;

            /* renamed from: b */
            final /* synthetic */ HashTagViewData f59540b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo86465a(bool.booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                AddHashTagPresenter.this.f59530a = false;
                Log.m165382e(errorResult.toString());
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg != null) {
                    Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                    IAddHashTagContract.IView.C24101a.m88006a((IAddHashTagContract.IView) AddHashTagPresenter.this.getView(), debugMsg, 0, 2, null);
                }
            }

            /* renamed from: a */
            public void mo86465a(boolean z) {
                String str;
                if (this.f59540b.mo86498j() == TagPermissionType.Private.value()) {
                    BlockEntity blockEntity = AddHashTagPresenter.this.f59531b;
                    if (blockEntity != null) {
                        str = blockEntity.getBlockTypeID();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.areEqual(str, BlockTypeID.CHAT.getValue())) {
                        String string = UIHelper.getString(R.string.Lark_Pano_AddAutoTagTopicSuccess);
                        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…o_AddAutoTagTopicSuccess)");
                        ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86474a(string, R.drawable.ic_svg_toast_succeed);
                        ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86476b();
                    }
                }
                String string2 = UIHelper.getString(R.string.Lark_Pano_AddTopicSuccess);
                Intrinsics.checkExpressionValueIsNotNull(string2, "UIHelper.getString(R.str…ark_Pano_AddTopicSuccess)");
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86474a(string2, R.drawable.ic_svg_toast_succeed);
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86476b();
            }

            C24090b(ViewDelegate aVar, HashTagViewData bVar) {
                this.f59539a = aVar;
                this.f59540b = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$ViewDelegate$onSearchHashTag$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.add.c$a$d */
        public static final class C24092d implements IGetDataCallback<List<? extends HashTagViewData>> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f59543a;

            /* renamed from: b */
            final /* synthetic */ String f59544b;

            /* renamed from: a */
            public void onSuccess(List<HashTagViewData> list) {
                Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86475a(this.f59544b, list, false);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165382e(errorResult.toString());
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86475a(this.f59544b, null, false);
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg != null) {
                    Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                    IAddHashTagContract.IView.C24101a.m88006a((IAddHashTagContract.IView) AddHashTagPresenter.this.getView(), debugMsg, 0, 2, null);
                }
            }

            C24092d(ViewDelegate aVar, String str) {
                this.f59543a = aVar;
                this.f59544b = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\f"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$ViewDelegate$onSearchHashTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lkotlin/Pair;", "", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.add.c$a$c */
        public static final class C24091c implements IGetDataCallback<Pair<? extends Boolean, ? extends List<? extends HashTagViewData>>> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f59541a;

            /* renamed from: b */
            final /* synthetic */ String f59542b;

            /* renamed from: a */
            public void onSuccess(Pair<Boolean, ? extends List<HashTagViewData>> pair) {
                Intrinsics.checkParameterIsNotNull(pair, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86475a(this.f59542b, (List) pair.getSecond(), pair.getFirst().booleanValue());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165382e(errorResult.toString());
                ((IAddHashTagContract.IView) AddHashTagPresenter.this.getView()).mo86475a(this.f59542b, null, true);
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg != null) {
                    Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                    IAddHashTagContract.IView.C24101a.m88006a((IAddHashTagContract.IView) AddHashTagPresenter.this.getView(), debugMsg, 0, 2, null);
                }
            }

            C24091c(ViewDelegate aVar, String str) {
                this.f59541a = aVar;
                this.f59542b = str;
            }
        }

        @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView.Delegate
        /* renamed from: a */
        public void mo86461a(HashTagViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!AddHashTagPresenter.this.f59530a) {
                AddHashTagPresenter.this.f59530a = true;
                ((IAddHashTagContract.IModel) AddHashTagPresenter.this.getModel()).mo86452b(bVar.mo86489c(), AddHashTagPresenter.this.f59533d, new UIGetDataCallback(new C24090b(this, bVar)));
            }
        }

        @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView.Delegate
        /* renamed from: b */
        public void mo86463b(HashTagViewData bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!AddHashTagPresenter.this.f59530a) {
                AddHashTagPresenter.this.f59530a = true;
                ((IAddHashTagContract.IModel) AddHashTagPresenter.this.getModel()).mo86453c(bVar.mo86487a(), AddHashTagPresenter.this.f59533d, new UIGetDataCallback(new C24089a(this, bVar)));
            }
        }

        @Override // com.larksuite.component.blockit.hashtag.add.IAddHashTagContract.IView.Delegate
        /* renamed from: a */
        public void mo86462a(String str) {
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            if (AddHashTagPresenter.this.f59532c) {
                ((IAddHashTagContract.IModel) AddHashTagPresenter.this.getModel()).mo86450a(str, new UIGetDataCallback(new C24091c(this, str)));
            } else {
                ((IAddHashTagContract.IModel) AddHashTagPresenter.this.getModel()).mo86451a(str, AddHashTagPresenter.this.f59534e, new UIGetDataCallback(new C24092d(this, str)));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\f"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lkotlin/Pair;", "", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.c$b */
    public static final class C24093b implements IGetDataCallback<Pair<? extends Boolean, ? extends List<? extends HashTagViewData>>> {

        /* renamed from: a */
        final /* synthetic */ AddHashTagPresenter f59545a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C24093b(AddHashTagPresenter cVar) {
            this.f59545a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(Pair<Boolean, ? extends List<HashTagViewData>> pair) {
            Intrinsics.checkParameterIsNotNull(pair, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((IAddHashTagContract.IView) this.f59545a.getView()).mo86472a(new InitData((List) pair.getSecond()));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e(errorResult.toString());
            String debugMsg = errorResult.getDebugMsg();
            if (debugMsg != null) {
                Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                IAddHashTagContract.IView.C24101a.m88006a((IAddHashTagContract.IView) this.f59545a.getView(), debugMsg, 0, 2, null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/larksuite/component/blockit/hashtag/add/AddHashTagPresenter$create$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/larksuite/component/blockit/hashtag/HashTagViewData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.add.c$c */
    public static final class C24094c implements IGetDataCallback<List<? extends HashTagViewData>> {

        /* renamed from: a */
        final /* synthetic */ AddHashTagPresenter f59546a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C24094c(AddHashTagPresenter cVar) {
            this.f59546a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(List<HashTagViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((IAddHashTagContract.IView) this.f59546a.getView()).mo86472a(new InitData(list));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e(errorResult.toString());
            String debugMsg = errorResult.getDebugMsg();
            if (debugMsg != null) {
                Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                IAddHashTagContract.IView.C24101a.m88006a((IAddHashTagContract.IView) this.f59546a.getView(), debugMsg, 0, 2, null);
            }
        }
    }

    public AddHashTagPresenter(View view, AddHashTagView.ViewDependency aVar, BlockEntity blockEntity, boolean z, String str, String str2, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f59531b = blockEntity;
        this.f59532c = z;
        this.f59533d = str;
        this.f59534e = str2;
        this.f59535f = map;
        setView(new AddHashTagView(view, aVar, z, map));
        ((IAddHashTagContract.IView) getView()).setViewDelegate(createViewDelegate());
        setModel(new AddHashTagModel(blockEntity));
    }
}
