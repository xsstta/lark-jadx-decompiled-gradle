package com.ss.android.lark.search.impl.func.chatimage;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.dependency.ISearchModuleDependency;
import com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceView;
import com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.utils.C57881t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 '2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002'(B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\u0004H\u0014J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001fH\u0002J\u001c\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001fJ \u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\fH\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006)"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IModel;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView$Delegate;", "rootView", "Landroid/view/View;", "viewDependency", "Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;", "chatId", "", "isThread", "", "(Landroid/view/View;Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "()Z", "mRequestCount", "", "mRequestFailedCount", "mRequestSucceedCount", "getRootView", "()Landroid/view/View;", "getViewDependency", "()Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceView$ViewDependency;", "createViewDelegate", "downloadImage", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/viewdata/ChatInsideSearchImageViewData;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "downloadVideo", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "updateRequestStatus", "isSucceed", "Companion", "ViewDelegate", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatimage.d */
public final class ChatImageResourcePresenter extends BasePresenter<IChatImageResourceContract.IModel, IChatImageResourceContract.IView, IChatImageResourceContract.IView.Delegate> {

    /* renamed from: d */
    public static final String f131960d = "ChatImageResource";

    /* renamed from: e */
    public static final int f131961e = 16;

    /* renamed from: f */
    public static final int f131962f = 17;

    /* renamed from: g */
    public static final Companion f131963g = new Companion(null);

    /* renamed from: a */
    public volatile int f131964a;

    /* renamed from: b */
    public volatile int f131965b;

    /* renamed from: c */
    public volatile int f131966c;

    /* renamed from: h */
    private final View f131967h;

    /* renamed from: i */
    private final ChatImageResourceView.ViewDependency f131968i;

    /* renamed from: j */
    private final String f131969j;

    /* renamed from: k */
    private final boolean f131970k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$Companion;", "", "()V", "REQUEST_CODE_FORWARD", "", "getREQUEST_CODE_FORWARD", "()I", "REQUEST_CODE_MERGE_FORWARD", "getREQUEST_CODE_MERGE_FORWARD", "TAG", "", "getTAG", "()Ljava/lang/String;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo182385a() {
            return ChatImageResourcePresenter.f131960d;
        }

        /* renamed from: b */
        public final int mo182386b() {
            return ChatImageResourcePresenter.f131961e;
        }

        /* renamed from: c */
        public final int mo182387c() {
            return ChatImageResourcePresenter.f131962f;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo182383b() {
        return this.f131969j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IChatImageResourceContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$c */
    public static final class RunnableC53396c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourcePresenter f131980a;

        RunnableC53396c(ChatImageResourcePresenter dVar) {
            this.f131980a = dVar;
        }

        public final void run() {
            ((IChatImageResourceContract.IView) this.f131980a.getView()).mo182400a(R.string.Lark_Legacy_Success);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$d */
    public static final class RunnableC53397d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatImageResourcePresenter f131981a;

        RunnableC53397d(ChatImageResourcePresenter dVar) {
            this.f131981a = dVar;
        }

        public final void run() {
            if (this.f131981a.f131966c == this.f131981a.f131964a) {
                ((IChatImageResourceContract.IView) this.f131981a.getView()).mo182411c(R.string.Lark_Legacy_SavedToast);
            } else if (this.f131981a.f131966c > 0) {
                ((IChatImageResourceContract.IView) this.f131981a.getView()).mo182401a(this.f131981a.f131966c, this.f131981a.f131965b, R.string.Lark_Legacy_NumberDownloadSuccessNumberFail);
            } else {
                ((IChatImageResourceContract.IView) this.f131981a.getView()).mo182412d(R.string.Lark_Legacy_SaveFailTip);
            }
            ((IChatImageResourceContract.IView) this.f131981a.getView()).mo182406b();
            ((IChatImageResourceContract.IView) this.f131981a.getView()).mo182409b(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$ViewDelegate;", "Lcom/ss/android/lark/search/impl/func/chatimage/IChatImageResourceContract$IView$Delegate;", "(Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter;)V", "onDelete", "", "selectMessageIds", "", "", "onDownload", "selectItems", "Lcom/ss/android/lark/search/impl/func/chatinside/detail/image/viewdata/ChatInsideSearchImageViewData;", "onForward", "Ljava/util/ArrayList;", "onMergeForward", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$b */
    public final class ViewDelegate implements IChatImageResourceContract.IView.Delegate {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$ViewDelegate$onDownload$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "filePath", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$b$b */
        public static final class C53392b implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f131974a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C53392b(ViewDelegate bVar) {
                this.f131974a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ChatImageResourcePresenter.this.mo182382a(false);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "filePath");
                ChatImageResourcePresenter.this.mo182382a(true);
                C26311p.m95268a(((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182410c(), str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$ViewDelegate$onDownload$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "filePath", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$b$c */
        public static final class C53393c implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f131975a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C53393c(ViewDelegate bVar) {
                this.f131975a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ChatImageResourcePresenter.this.mo182382a(false);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "filePath");
                ChatImageResourcePresenter.this.mo182382a(true);
                C26311p.m95268a(((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182410c(), str);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$ViewDelegate$onDelete$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isSucceed", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$b$a */
        public static final class C53391a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f131972a;

            /* renamed from: b */
            final /* synthetic */ List f131973b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo182392a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo182392a(boolean z) {
                ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182400a(R.string.Lark_Legacy_DeletedToast);
                ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182404a(this.f131973b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182400a(R.string.Lark_Legacy_DeleteFail);
            }

            C53391a(ViewDelegate bVar, List list) {
                this.f131972a = bVar;
                this.f131973b = list;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$ViewDelegate$onForward$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$b$d */
        public static final class C53394d implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f131976a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f131977b;

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat != null) {
                    ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182408b(chat, this.f131977b, ChatImageResourcePresenter.f131963g.mo182387c());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String a = ChatImageResourcePresenter.f131963g.mo182385a();
                Log.m165389i(a, "get chat error : " + errorResult.getDisplayMsg());
            }

            C53394d(ViewDelegate bVar, ArrayList arrayList) {
                this.f131976a = bVar;
                this.f131977b = arrayList;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/search/impl/func/chatimage/ChatImageResourcePresenter$ViewDelegate$onMergeForward$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.search.impl.func.chatimage.d$b$e */
        public static final class C53395e implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f131978a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f131979b;

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat != null) {
                    ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182402a(chat, this.f131979b, ChatImageResourcePresenter.f131963g.mo182386b());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String a = ChatImageResourcePresenter.f131963g.mo182385a();
                Log.m165389i(a, "get chat error : " + errorResult.getDisplayMsg());
            }

            C53395e(ViewDelegate bVar, ArrayList arrayList) {
                this.f131978a = bVar;
                this.f131979b = arrayList;
            }
        }

        @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView.Delegate
        /* renamed from: a */
        public void mo182388a(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectMessageIds");
            ((IChatImageResourceContract.IModel) ChatImageResourcePresenter.this.getModel()).mo182375a(ChatImageResourcePresenter.this.mo182383b(), new C53395e(this, arrayList));
        }

        @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView.Delegate
        /* renamed from: b */
        public void mo182390b(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectMessageIds");
            ((IChatImageResourceContract.IModel) ChatImageResourcePresenter.this.getModel()).mo182375a(ChatImageResourcePresenter.this.mo182383b(), new C53394d(this, arrayList));
        }

        @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView.Delegate
        /* renamed from: b */
        public void mo182391b(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectMessageIds");
            ((IChatImageResourceContract.IModel) ChatImageResourcePresenter.this.getModel()).mo182376a(list, new UIGetDataCallback(new C53391a(this, list)));
        }

        @Override // com.ss.android.lark.search.impl.func.chatimage.IChatImageResourceContract.IView.Delegate
        /* renamed from: a */
        public void mo182389a(List<? extends ChatInsideSearchImageViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectItems");
            if (!CollectionUtils.isEmpty(list)) {
                ISearchModuleDependency a = C53258a.m205939a();
                Intrinsics.checkExpressionValueIsNotNull(a, "SearchModule.getDependency()");
                ISearchModuleDependency.AbstractC53320g p = a.mo181767p();
                Intrinsics.checkExpressionValueIsNotNull(p, "SearchModule.getDependency().cipherDependency");
                if (p.mo181829a()) {
                    ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182400a(R.string.Lark_Core_SecuritySettingKAToast);
                    return;
                }
                ((IChatImageResourceContract.IView) ChatImageResourcePresenter.this.getView()).mo182407b(R.string.Lark_Legacy_FileDownloading);
                ChatImageResourcePresenter.this.f131964a = list.size();
                ChatImageResourcePresenter.this.f131965b = 0;
                ChatImageResourcePresenter.this.f131966c = 0;
                for (ChatInsideSearchImageViewData chatInsideSearchImageViewData : list) {
                    if (chatInsideSearchImageViewData.getType() == 2) {
                        ChatImageResourcePresenter.this.mo182384b(chatInsideSearchImageViewData, new C53392b(this));
                    } else {
                        ChatImageResourcePresenter.this.mo182381a(chatInsideSearchImageViewData, new C53393c(this));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo182382a(boolean z) {
        if (z) {
            this.f131966c++;
        } else {
            this.f131965b++;
        }
        if (this.f131966c + this.f131965b == this.f131964a) {
            UICallbackExecutor.execute(new RunnableC53397d(this));
        }
    }

    /* renamed from: a */
    public final void mo182381a(ChatInsideSearchImageViewData chatInsideSearchImageViewData, IGetDataCallback<String> iGetDataCallback) {
        ((IChatImageResourceContract.IModel) getModel()).mo182377b(((IChatImageResourceContract.IView) getView()).mo182410c(), chatInsideSearchImageViewData, iGetDataCallback);
    }

    /* renamed from: b */
    public final void mo182384b(ChatInsideSearchImageViewData chatInsideSearchImageViewData, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(chatInsideSearchImageViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ImageSet imageSet = chatInsideSearchImageViewData.getImageSet();
        if (imageSet != null) {
            MediaExtra mediaExtra = ((MediaImageSet) imageSet).getMediaExtra();
            Intrinsics.checkExpressionValueIsNotNull(mediaExtra, "mediaExtra");
            if (C26311p.m95290j(C57881t.m224618a(((IChatImageResourceContract.IView) getView()).mo182410c(), mediaExtra.getMime(), mediaExtra.getKey()))) {
                iGetDataCallback.onError(new ErrorResult("file exits"));
            } else {
                ((IChatImageResourceContract.IModel) getModel()).mo182374a(((IChatImageResourceContract.IView) getView()).mo182410c(), chatInsideSearchImageViewData, iGetDataCallback);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.media.MediaImageSet");
        }
    }

    /* renamed from: a */
    public final void mo182380a(int i, int i2, Intent intent) {
        if (i == f131961e && i2 == -1) {
            UICallbackExecutor.execute(new RunnableC53396c(this));
        }
    }

    public ChatImageResourcePresenter(View view, ChatImageResourceView.ViewDependency bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f131967h = view;
        this.f131968i = bVar;
        this.f131969j = str;
        this.f131970k = z;
        setView(new ChatImageResourceView(view, bVar, str, z));
        ((IChatImageResourceContract.IView) getView()).setViewDelegate(createViewDelegate());
        setModel(new ChatImageResourceModel());
    }
}
