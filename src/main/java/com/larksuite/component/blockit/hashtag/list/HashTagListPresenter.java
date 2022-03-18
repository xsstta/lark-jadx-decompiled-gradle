package com.larksuite.component.blockit.hashtag.list;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.component.blockit.hashtag.HashTagViewData;
import com.larksuite.component.blockit.hashtag.list.HashTagListView;
import com.larksuite.component.blockit.hashtag.list.IHashTagListContract;
import com.larksuite.component.blockit.p1066a.C24048b;
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
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001eB?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IModel;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView$Delegate;", "rootView", "Landroid/view/View;", "viewDependency", "Lcom/larksuite/component/blockit/hashtag/list/HashTagListView$ViewDependency;", "blockEntity", "Lcom/larksuite/component/blockit/entity/BlockEntity;", "contextJson", "", "hitPointParams", "", "", "(Landroid/view/View;Lcom/larksuite/component/blockit/hashtag/list/HashTagListView$ViewDependency;Lcom/larksuite/component/blockit/entity/BlockEntity;Ljava/lang/String;Ljava/util/Map;)V", "create", "", "createViewDelegate", "loadData", "isInit", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "ViewDelegate", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.blockit.hashtag.list.c */
public final class HashTagListPresenter extends BasePresenter<IHashTagListContract.IModel, IHashTagListContract.IView, IHashTagListContract.IView.Delegate> {

    /* renamed from: a */
    public final BlockEntity f59587a;

    /* renamed from: b */
    public final Map<String, Object> f59588b;

    /* renamed from: c */
    private final String f59589c;

    /* renamed from: b */
    public final boolean mo86521b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IHashTagListContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        mo86520a(true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/larksuite/component/blockit/hashtag/list/HashTagListPresenter$ViewDelegate;", "Lcom/larksuite/component/blockit/hashtag/list/IHashTagListContract$IView$Delegate;", "(Lcom/larksuite/component/blockit/hashtag/list/HashTagListPresenter;)V", "getBlockTypeId", "", "onDeleteTag", "", "tagId", "tagInstanceId", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.c$a */
    public final class ViewDelegate implements IHashTagListContract.IView.Delegate {
        @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IView.Delegate
        /* renamed from: a */
        public String mo86522a() {
            String blockTypeID = HashTagListPresenter.this.f59587a.getBlockTypeID();
            Intrinsics.checkExpressionValueIsNotNull(blockTypeID, "blockEntity.blockTypeID");
            return blockTypeID;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListPresenter$ViewDelegate$onDeleteTag$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/hashtag/list/InitData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "initData", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.larksuite.component.blockit.hashtag.list.c$a$a */
        public static final class C24104a implements IGetDataCallback<InitData> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f59591a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C24104a(ViewDelegate aVar) {
                this.f59591a = aVar;
            }

            /* renamed from: a */
            public void onSuccess(InitData hVar) {
                Intrinsics.checkParameterIsNotNull(hVar, "initData");
                HashTagListPresenter.this.mo86520a(false);
                String string = UIHelper.getString(R.string.Lark_Pano_DeleteTopicSuccess);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_Pano_DeleteTopicSuccess)");
                ((IHashTagListContract.IView) HashTagListPresenter.this.getView()).mo86529a(string);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165382e(errorResult.toString());
                String debugMsg = errorResult.getDebugMsg();
                if (debugMsg != null) {
                    Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                    ((IHashTagListContract.IView) HashTagListPresenter.this.getView()).mo86530b(debugMsg);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Override // com.larksuite.component.blockit.hashtag.list.IHashTagListContract.IView.Delegate
        /* renamed from: a */
        public void mo86523a(String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "tagId");
            Intrinsics.checkParameterIsNotNull(str2, "tagInstanceId");
            ((IHashTagListContract.IModel) HashTagListPresenter.this.getModel()).mo86515a(str, str2, new UIGetDataCallback(new C24104a(this)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/larksuite/component/blockit/hashtag/list/HashTagListPresenter$loadData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/larksuite/component/blockit/hashtag/list/InitData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "initData", "blockit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.blockit.hashtag.list.c$b */
    public static final class C24105b implements IGetDataCallback<InitData> {

        /* renamed from: a */
        final /* synthetic */ HashTagListPresenter f59592a;

        /* renamed from: b */
        final /* synthetic */ boolean f59593b;

        /* renamed from: a */
        public void onSuccess(InitData hVar) {
            Integer num;
            Intrinsics.checkParameterIsNotNull(hVar, "initData");
            ((IHashTagListContract.IView) this.f59592a.getView()).mo86528a(hVar);
            if (this.f59593b) {
                JSONObject jSONObject = new JSONObject(this.f59592a.f59588b);
                List<HashTagViewData> a = hVar.mo86543a();
                if (a != null) {
                    num = Integer.valueOf(a.size());
                } else {
                    num = null;
                }
                jSONObject.put("tag_count", num);
                C24048b.m87864a("pano_open_tag_action_panel", jSONObject);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165382e(errorResult.toString());
            String debugMsg = errorResult.getDebugMsg();
            if (debugMsg != null) {
                Intrinsics.checkExpressionValueIsNotNull(debugMsg, "it");
                ((IHashTagListContract.IView) this.f59592a.getView()).mo86530b(debugMsg);
            }
        }

        C24105b(HashTagListPresenter cVar, boolean z) {
            this.f59592a = cVar;
            this.f59593b = z;
        }
    }

    /* renamed from: a */
    public final void mo86520a(boolean z) {
        String blockID = this.f59587a.getBlockID();
        Intrinsics.checkExpressionValueIsNotNull(blockID, "blockEntity.blockID");
        ((IHashTagListContract.IModel) getModel()).mo86514a(blockID, new UIGetDataCallback(new C24105b(this, z)));
    }

    /* renamed from: a */
    public final void mo86519a(int i, int i2, Intent intent) {
        mo86520a(false);
    }

    public HashTagListPresenter(View view, HashTagListView.ViewDependency aVar, BlockEntity blockEntity, String str, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(blockEntity, "blockEntity");
        this.f59587a = blockEntity;
        this.f59589c = str;
        this.f59588b = map;
        setView(new HashTagListView(view, aVar, map));
        ((IHashTagListContract.IView) getView()).setViewDelegate(createViewDelegate());
        setModel(new HashTagListModel(blockEntity, str));
    }
}
