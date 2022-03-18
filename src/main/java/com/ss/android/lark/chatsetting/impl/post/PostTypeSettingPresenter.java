package com.ss.android.lark.chatsetting.impl.post;

import android.view.View;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.dto.SelectChatterDTO;
import com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract;
import com.ss.android.lark.chatsetting.impl.post.PostTypeSettingView;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u001aB5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0014J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0014\u0010\u0016\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IModel;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView$Delegate;", "rootView", "Landroid/view/View;", "dependency", "Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;", "chatId", "", "ownerId", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "isThread", "", "(Landroid/view/View;Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingView$ViewDependency;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;Z)V", "create", "", "createViewDelegate", "fetchWhiteListInner", "postType", "onEditWhiteListResult", "selectChatters", "", "Lcom/ss/android/lark/chatsetting/dto/SelectChatterDTO;", "ViewDelegate", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.post.e */
public final class PostTypeSettingPresenter extends BasePresenter<IPostTypeSettingContract.IModel, IPostTypeSettingContract.IView, IPostTypeSettingContract.IView.Delegate> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IPostTypeSettingContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter$ViewDelegate;", "Lcom/ss/android/lark/chatsetting/impl/post/IPostTypeSettingContract$IView$Delegate;", "(Lcom/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter;)V", "confirm", "", "getChatId", "", "isThread", "", "onAvatarClicked", BottomDialog.f17198f, "onEditWhiteListClicked", "onSetPostType", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/chat/Chat$PostType;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.e$a */
    public final class ViewDelegate implements IPostTypeSettingContract.IView.Delegate {
        @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView.Delegate
        /* renamed from: c */
        public boolean mo129143c() {
            return ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129132d();
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView.Delegate
        /* renamed from: d */
        public String mo129144d() {
            return ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129131c();
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView.Delegate
        /* renamed from: b */
        public void mo129142b() {
            ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129130b(new C35059a(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.post.e$a$b */
        static final class RunnableC35060b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f90462a;

            /* renamed from: b */
            final /* synthetic */ String f90463b;

            RunnableC35060b(ViewDelegate aVar, String str) {
                this.f90462a = aVar;
                this.f90463b = str;
            }

            public final void run() {
                final Chatter a = ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129125a(this.f90463b);
                final String e = ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129133e();
                if (a != null) {
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.chatsetting.impl.post.PostTypeSettingPresenter.ViewDelegate.RunnableC35060b.RunnableC350611 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC35060b f90464a;

                        {
                            this.f90464a = r1;
                        }

                        public final void run() {
                            ((IPostTypeSettingContract.IView) PostTypeSettingPresenter.this.getView()).mo129137a(a, ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129131c(), e);
                        }
                    });
                }
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView.Delegate
        /* renamed from: a */
        public void mo129139a() {
            ArrayList<String> b = ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129129b();
            ((IPostTypeSettingContract.IView) PostTypeSettingPresenter.this.getView()).mo129138a(((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129131c(), b);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter$ViewDelegate$confirm$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Ljava/lang/Void;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.post.e$a$a */
        public static final class C35059a extends UIGetDataCallback<Void> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f90461a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C35059a(ViewDelegate aVar) {
                this.f90461a = aVar;
            }

            /* renamed from: a */
            public void onSuccessed(Void r1) {
                super.onSuccessed(r1);
                ((IPostTypeSettingContract.IView) PostTypeSettingPresenter.this.getView()).mo129134a();
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                super.onErrored(errorResult);
                ((IPostTypeSettingContract.IView) PostTypeSettingPresenter.this.getView()).mo129135a(errorResult);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter$ViewDelegate$onSetPostType$1", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", "list", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chatsetting.impl.post.e$a$c */
        public static final class C35062c extends UIGetDataCallback<List<? extends PostWhiteListViewData>> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f90467a;

            /* renamed from: b */
            final /* synthetic */ Chat.PostType f90468b;

            /* renamed from: a */
            public void onSuccessed(List<PostWhiteListViewData> list) {
                ((IPostTypeSettingContract.IView) PostTypeSettingPresenter.this.getView()).mo129136a(this.f90468b, list);
            }

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "error");
                ((IPostTypeSettingContract.IView) PostTypeSettingPresenter.this.getView()).mo129135a(errorResult);
            }

            C35062c(ViewDelegate aVar, Chat.PostType postType) {
                this.f90467a = aVar;
                this.f90468b = postType;
            }
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView.Delegate
        /* renamed from: a */
        public void mo129140a(Chat.PostType postType) {
            Intrinsics.checkParameterIsNotNull(postType, ShareHitPoint.f121869d);
            ((IPostTypeSettingContract.IModel) PostTypeSettingPresenter.this.getModel()).mo129127a(postType, new C35062c(this, postType));
        }

        @Override // com.ss.android.lark.chatsetting.impl.post.IPostTypeSettingContract.IView.Delegate
        /* renamed from: a */
        public void mo129141a(String str) {
            Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            coreThreadPool.getFixedThreadPool().execute(new RunnableC35060b(this, str));
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        Chat.PostType a = ((IPostTypeSettingContract.IModel) getModel()).mo129124a();
        ((IPostTypeSettingContract.IView) getView()).mo129136a(a, (List<PostWhiteListViewData>) null);
        if (a == Chat.PostType.WHITE_LIST) {
            m136582a(a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter$onEditWhiteListResult$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "list", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.e$c */
    public static final class C35064c implements IGetDataCallback<List<? extends PostWhiteListViewData>> {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingPresenter f90471a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35064c(PostTypeSettingPresenter eVar) {
            this.f90471a = eVar;
        }

        /* renamed from: a */
        public void onSuccess(List<PostWhiteListViewData> list) {
            ((IPostTypeSettingContract.IView) this.f90471a.getView()).mo129136a(Chat.PostType.WHITE_LIST, list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            ((IPostTypeSettingContract.IView) this.f90471a.getView()).mo129135a(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/post/PostTypeSettingPresenter$fetchWhiteListInner$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chatsetting/impl/post/PostWhiteListViewData;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.post.e$b */
    public static final class C35063b implements IGetDataCallback<List<? extends PostWhiteListViewData>> {

        /* renamed from: a */
        final /* synthetic */ PostTypeSettingPresenter f90469a;

        /* renamed from: b */
        final /* synthetic */ Chat.PostType f90470b;

        /* renamed from: a */
        public void onSuccess(List<PostWhiteListViewData> list) {
            ((IPostTypeSettingContract.IView) this.f90469a.getView()).mo129136a(this.f90470b, list);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            ((IPostTypeSettingContract.IView) this.f90469a.getView()).mo129135a(errorResult);
        }

        C35063b(PostTypeSettingPresenter eVar, Chat.PostType postType) {
            this.f90469a = eVar;
            this.f90470b = postType;
        }
    }

    /* renamed from: a */
    private final void m136582a(Chat.PostType postType) {
        ((IPostTypeSettingContract.IModel) getModel()).mo129126a(new C35063b(this, postType));
    }

    /* renamed from: a */
    public final void mo129155a(List<SelectChatterDTO> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectChatters");
        ((IPostTypeSettingContract.IModel) getModel()).mo129128a(list, new UIGetDataCallback(new C35064c(this)));
    }

    public PostTypeSettingPresenter(View view, PostTypeSettingView.ViewDependency bVar, String str, String str2, Chat.PostType postType, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "ownerId");
        Intrinsics.checkParameterIsNotNull(postType, ShareHitPoint.f121869d);
        PostTypeSettingModel cVar = new PostTypeSettingModel(str, str2, postType, z);
        PostTypeSettingView fVar = new PostTypeSettingView(view, bVar);
        setModel(cVar);
        setView(fVar);
        fVar.setViewDelegate(createViewDelegate());
    }
}
