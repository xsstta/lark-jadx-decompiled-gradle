package com.ss.android.lark.album;

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
import com.ss.android.lark.C29990c;
import com.ss.android.lark.album.ChatAlbumView;
import com.ss.android.lark.album.IChatAlbumContract;
import com.ss.android.lark.album.image.ChatImageViewData;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002*+B%\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u001a\u001a\u00020\u0004H\u0014J\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0002J\u001e\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0 H\u0002J \u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010%J\u001c\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\f2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0002R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006,"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/album/IChatAlbumContract$IModel;", "Lcom/ss/android/lark/album/IChatAlbumContract$IView;", "Lcom/ss/android/lark/album/IChatAlbumContract$IView$Delegate;", "rootView", "Landroid/view/View;", "viewDependency", "Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;", "chatId", "", "isThread", "", "(Landroid/view/View;Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;Ljava/lang/String;Z)V", "authorizationFailed", "getChatId", "()Ljava/lang/String;", "()Z", "requestCount", "", "requestFailedCount", "requestSucceedCount", "getRootView", "()Landroid/view/View;", "getViewDependency", "()Lcom/ss/android/lark/album/ChatAlbumView$ViewDependency;", "createViewDelegate", "downloadImage", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/album/image/ChatImageViewData;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "downloadVideo", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "updateRequestStatus", "isSucceed", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "Companion", "ViewDelegate", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.album.d */
public final class ChatAlbumPresenter extends BasePresenter<IChatAlbumContract.IModel, IChatAlbumContract.IView, IChatAlbumContract.IView.Delegate> {

    /* renamed from: e */
    public static final String f72071e = "ChatImageResource";

    /* renamed from: f */
    public static final int f72072f = 16;

    /* renamed from: g */
    public static final int f72073g = 17;

    /* renamed from: h */
    public static final Companion f72074h = new Companion(null);

    /* renamed from: a */
    public volatile int f72075a;

    /* renamed from: b */
    public volatile int f72076b;

    /* renamed from: c */
    public volatile int f72077c;

    /* renamed from: d */
    public volatile boolean f72078d;

    /* renamed from: i */
    private final View f72079i;

    /* renamed from: j */
    private final ChatAlbumView.ViewDependency f72080j;

    /* renamed from: k */
    private final String f72081k;

    /* renamed from: l */
    private final boolean f72082l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumPresenter$Companion;", "", "()V", "REQUEST_CODE_FORWARD", "", "getREQUEST_CODE_FORWARD", "()I", "REQUEST_CODE_MERGE_FORWARD", "getREQUEST_CODE_MERGE_FORWARD", "TAG", "", "getTAG", "()Ljava/lang/String;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo101925a() {
            return ChatAlbumPresenter.f72071e;
        }

        /* renamed from: b */
        public final int mo101926b() {
            return ChatAlbumPresenter.f72072f;
        }

        /* renamed from: c */
        public final int mo101927c() {
            return ChatAlbumPresenter.f72073g;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final String mo101923b() {
        return this.f72081k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public IChatAlbumContract.IView.Delegate createViewDelegate() {
        return new ViewDelegate();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.d$c */
    public static final class RunnableC28650c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumPresenter f72092a;

        RunnableC28650c(ChatAlbumPresenter dVar) {
            this.f72092a = dVar;
        }

        public final void run() {
            ((IChatAlbumContract.IView) this.f72092a.getView()).mo101940a(R.string.Lark_Legacy_Success);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.d$d */
    public static final class RunnableC28651d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ChatAlbumPresenter f72093a;

        RunnableC28651d(ChatAlbumPresenter dVar) {
            this.f72093a = dVar;
        }

        public final void run() {
            if (this.f72093a.f72077c == this.f72093a.f72075a) {
                ((IChatAlbumContract.IView) this.f72093a.getView()).mo101952c(R.string.Lark_Legacy_SavedToast);
            } else if (this.f72093a.f72077c > 0) {
                ((IChatAlbumContract.IView) this.f72093a.getView()).mo101941a(this.f72093a.f72077c, this.f72093a.f72076b, R.string.Lark_Legacy_NumberDownloadSuccessNumberFail);
            } else if (this.f72093a.f72078d) {
                String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Audit_BlockedActionsDueToPermissionSettings, "BlockedAction", UIHelper.getString(R.string.Lark_Audit_BlockedActionDownloadFullImage));
                Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "UIHelper.mustacheFormat(… \"BlockedAction\", action)");
                ((IChatAlbumContract.IView) this.f72093a.getView()).mo101944a(mustacheFormat);
            } else {
                ((IChatAlbumContract.IView) this.f72093a.getView()).mo101953d(R.string.Lark_Legacy_SaveFailTip);
            }
            ((IChatAlbumContract.IView) this.f72093a.getView()).mo101947b();
            ((IChatAlbumContract.IView) this.f72093a.getView()).mo101950b(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumPresenter$ViewDelegate;", "Lcom/ss/android/lark/album/IChatAlbumContract$IView$Delegate;", "(Lcom/ss/android/lark/album/ChatAlbumPresenter;)V", "onDelete", "", "selectMessageIds", "", "", "onDownload", "selectItems", "Lcom/ss/android/lark/album/image/ChatImageViewData;", "onForward", "Ljava/util/ArrayList;", "onMergeForward", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.d$b */
    public final class ViewDelegate implements IChatAlbumContract.IView.Delegate {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/album/ChatAlbumPresenter$ViewDelegate$onDownload$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "filePath", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.d$b$b */
        public static final class C28646b implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f72086a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C28646b(ViewDelegate bVar) {
                this.f72086a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ChatAlbumPresenter.this.mo101922a(false, errorResult);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "filePath");
                ChatAlbumPresenter.m105011a(ChatAlbumPresenter.this, true, null, 2, null);
                C26311p.m95268a(((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101951c(), str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/album/ChatAlbumPresenter$ViewDelegate$onDownload$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "filePath", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.d$b$c */
        public static final class C28647c implements IGetDataCallback<String> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f72087a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C28647c(ViewDelegate bVar) {
                this.f72087a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ChatAlbumPresenter.this.mo101922a(false, errorResult);
            }

            /* renamed from: a */
            public void onSuccess(String str) {
                Intrinsics.checkParameterIsNotNull(str, "filePath");
                ChatAlbumPresenter.m105011a(ChatAlbumPresenter.this, true, null, 2, null);
                C26311p.m95268a(((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101951c(), str);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ViewDelegate() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/album/ChatAlbumPresenter$ViewDelegate$onDelete$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "isSucceed", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.d$b$a */
        public static final class C28645a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f72084a;

            /* renamed from: b */
            final /* synthetic */ List f72085b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo101932a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo101932a(boolean z) {
                ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101940a(R.string.Lark_Legacy_DeletedToast);
                ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101945a(this.f72085b);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101940a(R.string.Lark_Legacy_DeleteFail);
            }

            C28645a(ViewDelegate bVar, List list) {
                this.f72084a = bVar;
                this.f72085b = list;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/album/ChatAlbumPresenter$ViewDelegate$onForward$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.d$b$d */
        public static final class C28648d implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f72088a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f72089b;

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat != null) {
                    ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101949b(chat, this.f72089b, ChatAlbumPresenter.f72074h.mo101927c());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String a = ChatAlbumPresenter.f72074h.mo101925a();
                Log.m165389i(a, "get chat error : " + errorResult.getDisplayMsg());
            }

            C28648d(ViewDelegate bVar, ArrayList arrayList) {
                this.f72088a = bVar;
                this.f72089b = arrayList;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/album/ChatAlbumPresenter$ViewDelegate$onMergeForward$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.album.d$b$e */
        public static final class C28649e implements IGetDataCallback<Chat> {

            /* renamed from: a */
            final /* synthetic */ ViewDelegate f72090a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f72091b;

            /* renamed from: a */
            public void onSuccess(Chat chat) {
                if (chat != null) {
                    ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101943a(chat, this.f72091b, ChatAlbumPresenter.f72074h.mo101926b());
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                String a = ChatAlbumPresenter.f72074h.mo101925a();
                Log.m165389i(a, "get chat error : " + errorResult.getDisplayMsg());
            }

            C28649e(ViewDelegate bVar, ArrayList arrayList) {
                this.f72090a = bVar;
                this.f72091b = arrayList;
            }
        }

        @Override // com.ss.android.lark.album.IChatAlbumContract.IView.Delegate
        /* renamed from: a */
        public void mo101928a(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectMessageIds");
            ((IChatAlbumContract.IModel) ChatAlbumPresenter.this.getModel()).mo101913a(ChatAlbumPresenter.this.mo101923b(), new C28649e(this, arrayList));
        }

        @Override // com.ss.android.lark.album.IChatAlbumContract.IView.Delegate
        /* renamed from: b */
        public void mo101930b(ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(arrayList, "selectMessageIds");
            ((IChatAlbumContract.IModel) ChatAlbumPresenter.this.getModel()).mo101913a(ChatAlbumPresenter.this.mo101923b(), new C28648d(this, arrayList));
        }

        @Override // com.ss.android.lark.album.IChatAlbumContract.IView.Delegate
        /* renamed from: b */
        public void mo101931b(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectMessageIds");
            ((IChatAlbumContract.IModel) ChatAlbumPresenter.this.getModel()).mo101914a(list, new UIGetDataCallback(new C28645a(this, list)));
        }

        @Override // com.ss.android.lark.album.IChatAlbumContract.IView.Delegate
        /* renamed from: a */
        public void mo101929a(List<? extends ChatImageViewData> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectItems");
            if (!CollectionUtils.isEmpty(list)) {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                AbstractC36474h.AbstractC36478d aw = b.aw();
                Intrinsics.checkExpressionValueIsNotNull(aw, "ChatModuleInstanceHolder…ndency().cipherDependency");
                if (aw.mo134611a()) {
                    ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101940a(R.string.Lark_Core_SecuritySettingKAToast);
                    return;
                }
                ((IChatAlbumContract.IView) ChatAlbumPresenter.this.getView()).mo101948b(R.string.Lark_Legacy_FileDownloading);
                ChatAlbumPresenter.this.f72075a = list.size();
                ChatAlbumPresenter.this.f72076b = 0;
                ChatAlbumPresenter.this.f72077c = 0;
                ChatAlbumPresenter.this.f72078d = false;
                for (ChatImageViewData chatImageViewData : list) {
                    if (chatImageViewData.getType() == 2) {
                        ChatAlbumPresenter.this.mo101924b(chatImageViewData, new C28646b(this));
                    } else {
                        ChatAlbumPresenter.this.mo101921a(chatImageViewData, new C28647c(this));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo101924b(ChatImageViewData chatImageViewData, IGetDataCallback<String> iGetDataCallback) {
        ((IChatAlbumContract.IModel) getModel()).mo101912a(((IChatAlbumContract.IView) getView()).mo101951c(), chatImageViewData, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo101921a(ChatImageViewData chatImageViewData, IGetDataCallback<String> iGetDataCallback) {
        ((IChatAlbumContract.IModel) getModel()).mo101915b(((IChatAlbumContract.IView) getView()).mo101951c(), chatImageViewData, iGetDataCallback);
    }

    /* renamed from: a */
    public final void mo101922a(boolean z, ErrorResult errorResult) {
        if (z) {
            this.f72077c++;
        } else {
            this.f72076b++;
        }
        if (errorResult != null && errorResult.getErrorCode() == ChatAlbumModel.f72068c.mo101916a()) {
            this.f72078d = true;
        }
        if (this.f72077c + this.f72076b == this.f72075a) {
            UICallbackExecutor.execute(new RunnableC28651d(this));
        }
    }

    /* renamed from: a */
    public final void mo101920a(int i, int i2, Intent intent) {
        if (i == f72072f && i2 == -1) {
            UICallbackExecutor.execute(new RunnableC28650c(this));
        }
    }

    public ChatAlbumPresenter(View view, ChatAlbumView.ViewDependency bVar, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f72079i = view;
        this.f72080j = bVar;
        this.f72081k = str;
        this.f72082l = z;
        setView(new ChatAlbumView(view, bVar, str, z));
        ((IChatAlbumContract.IView) getView()).setViewDelegate(createViewDelegate());
        setModel(new ChatAlbumModel());
    }

    /* renamed from: a */
    static /* synthetic */ void m105011a(ChatAlbumPresenter dVar, boolean z, ErrorResult errorResult, int i, Object obj) {
        if ((i & 2) != 0) {
            errorResult = null;
        }
        dVar.mo101922a(z, errorResult);
    }
}
