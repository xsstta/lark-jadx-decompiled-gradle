package com.ss.android.lark.threadmergeforward;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.lark.pb.basic.v1.Thread;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.core.model.AbstractC33959e;
import com.ss.android.lark.chat.core.model.AbstractC33961f;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.utils.C34353s;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import com.ss.android.lark.threadmergeforward.C55954a;
import com.ss.android.lark.threadmergeforward.ThreadMergeForwardView;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u0000 (2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002()B%\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0004H\u0014J \u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#J\b\u0010$\u001a\u00020\u001aH\u0002J\u0016\u0010%\u001a\u00020\u001a2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060'H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IModel;", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView;", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView$Delegate;", "Lcom/ss/android/lark/chat/core/model/DataListPipeline$OnChangeListener;", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "context", "Landroidx/fragment/app/FragmentActivity;", "mOriginMergeForwardId", "", "mMergeForwardMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "viewDependency", "Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/ss/android/lark/chat/entity/message/Message;Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "mDataListPipeline", "Lcom/ss/android/lark/chat/core/model/DataListPipeline;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "mThreadDetailItemConverter", "Lcom/ss/android/lark/chat/core/model/IRetConverter;", "getViewDependency", "()Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardView$ViewDependency;", "create", "", "createModelDelegate", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IModel$Delegate;", "createViewDelegate", "handleActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "loadData", "onChanged", "snapshots", "", "Companion", "ThreadDetailDataMapper", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadmergeforward.g */
public final class ThreadMergeForwardPresenter extends BasePresenter<C55954a.AbstractC55955a, C55954a.AbstractC55957b, C55954a.AbstractC55957b.AbstractC55958a> implements C33955c.AbstractC33957b<C55905a> {

    /* renamed from: e */
    public static final Companion f138309e = new Companion(null);

    /* renamed from: a */
    public C33955c<C55905a, MessageInfo> f138310a;

    /* renamed from: b */
    public final AbstractC33961f<C55905a> f138311b = new C55971f(this);

    /* renamed from: c */
    public final String f138312c;

    /* renamed from: d */
    public final Message f138313d;

    /* renamed from: f */
    private final FragmentActivity f138314f;

    /* renamed from: g */
    private final ThreadMergeForwardView.ViewDependency f138315g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter$Companion;", "", "()V", "LOG_TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000K\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J4\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0016\u0010\u0019\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016J\u001c\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0016H\u0016¨\u0006 "}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter$createViewDelegate$1", "Lcom/ss/android/lark/threadmergeforward/IThreadMergeForwardContract$IView$Delegate;", "getChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatChatters", "", "chatId", "", "dataCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "getChatId", "getMergeForwardMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "getOriginMergeForwardMessageId", "getThreadId", "onImageClick", "view", "Landroid/view/View;", "photoItem", "Lcom/ss/android/lark/widget/photo_picker/entity/PhotoItem;", "photoItems", "", "isMute", "", "onMessageMultiSave", "selectedMessageIds", "onPrepareAudioData", "audioKey", "messageId", "onSaveFavorite", "list", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$d */
    public static final class C55967d implements C55954a.AbstractC55957b.AbstractC55958a {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardPresenter f138318a;

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: d */
        public String mo190741d() {
            return this.f138318a.f138312c;
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: e */
        public Message mo190742e() {
            return this.f138318a.f138313d;
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: a */
        public String mo190733a() {
            C55954a.AbstractC55955a aVar = (C55954a.AbstractC55955a) this.f138318a.getModel();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
            String b = aVar.mo190727b();
            Intrinsics.checkExpressionValueIsNotNull(b, "model.threadId");
            return b;
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: b */
        public Chat mo190738b() {
            C55954a.AbstractC55955a aVar = (C55954a.AbstractC55955a) this.f138318a.getModel();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
            return aVar.mo190722a();
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: c */
        public String mo190740c() {
            String id;
            C55954a.AbstractC55955a aVar = (C55954a.AbstractC55955a) this.f138318a.getModel();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
            Chat a = aVar.mo190722a();
            if (a == null || (id = a.getId()) == null) {
                return "";
            }
            return id;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter$createViewDelegate$1$onMessageMultiSave$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.threadmergeforward.g$d$a */
        public static final class C55968a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C55967d f138319a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55968a(C55967d dVar) {
                this.f138319a = dVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((C55954a.AbstractC55957b) this.f138319a.f138318a.getView()).mo190710a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail)));
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((C55954a.AbstractC55957b) this.f138319a.f138318a.getView()).mo190710a(UIHelper.getString(R.string.Lark_Legacy_CombineFavoriteSuccess));
                ((C55954a.AbstractC55957b) this.f138319a.f138318a.getView()).mo190706a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter$createViewDelegate$1$onSaveFavorite$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/favorite/FavoriteMessageInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.threadmergeforward.g$d$b */
        public static final class C55969b implements IGetDataCallback<List<? extends FavoriteMessageInfo>> {

            /* renamed from: a */
            final /* synthetic */ C55967d f138320a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C55969b(C55967d dVar) {
                this.f138320a = dVar;
            }

            /* renamed from: a */
            public void onSuccess(List<? extends FavoriteMessageInfo> list) {
                Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                ((C55954a.AbstractC55957b) this.f138320a.f138318a.getView()).mo190710a(UIHelper.getString(R.string.Lark_Legacy_ChatViewFavorites));
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((C55954a.AbstractC55957b) this.f138320a.f138318a.getView()).mo190710a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail)));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55967d(ThreadMergeForwardPresenter gVar) {
            this.f138318a = gVar;
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: b */
        public void mo190739b(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectedMessageIds");
            ((C55954a.AbstractC55955a) this.f138318a.getModel()).mo190728b(list, new UIGetDataCallback(new C55968a(this)));
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: a */
        public void mo190737a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            ((C55954a.AbstractC55955a) this.f138318a.getModel()).mo190726a(list, new UIGetDataCallback(new C55969b(this)));
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: a */
        public void mo190735a(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "chatId");
            ((C55954a.AbstractC55955a) this.f138318a.getModel()).mo190724a(str, iGetDataCallback);
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: a */
        public void mo190736a(String str, String str2) {
            ((C55954a.AbstractC55955a) this.f138318a.getModel()).mo190725a(str, str2);
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55957b.AbstractC55958a
        /* renamed from: a */
        public void mo190734a(View view, PhotoItem photoItem, List<PhotoItem> list, boolean z) {
            ((C55954a.AbstractC55957b) this.f138318a.getView()).mo190708a(C34353s.m133238a(list, photoItem), list, view, z);
        }
    }

    /* renamed from: b */
    private final C55954a.AbstractC55955a.AbstractC55956a m217503b() {
        return new C55966c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C55954a.AbstractC55957b.AbstractC55958a createViewDelegate() {
        return new C55967d(this);
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m217504c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDataInit"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$c */
    public static final class C55966c implements C55954a.AbstractC55955a.AbstractC55956a {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardPresenter f138317a;

        C55966c(ThreadMergeForwardPresenter gVar) {
            this.f138317a = gVar;
        }

        @Override // com.ss.android.lark.threadmergeforward.C55954a.AbstractC55955a.AbstractC55956a
        /* renamed from: a */
        public final void mo190732a() {
            ((C55954a.AbstractC55957b) this.f138317a.getView()).mo190714c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$g */
    static final class RunnableC55972g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardPresenter f138323a;

        /* renamed from: b */
        final /* synthetic */ List f138324b;

        RunnableC55972g(ThreadMergeForwardPresenter gVar, List list) {
            this.f138323a = gVar;
            this.f138324b = list;
        }

        public final void run() {
            ((C55954a.AbstractC55957b) this.f138323a.getView()).mo190711a(this.f138324b);
        }
    }

    /* renamed from: c */
    private final void m217504c() {
        ((C55954a.AbstractC55955a) getModel()).mo190723a(new UIGetDataCallback(new C55970e(this)));
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter$ThreadDetailDataMapper;", "Lcom/ss/android/lark/chat/core/model/IDataMapper;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "(Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter;)V", "from", "messageInfo", "index", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$b */
    public final class ThreadDetailDataMapper implements AbstractC33959e<MessageInfo, C55905a> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ThreadDetailDataMapper() {
        }

        /* renamed from: a */
        public C55905a mo122490a(MessageInfo messageInfo, int i) {
            String str;
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            C55954a.AbstractC55955a aVar = (C55954a.AbstractC55955a) ThreadMergeForwardPresenter.this.getModel();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
            String d = aVar.mo190730d();
            C55954a.AbstractC55955a aVar2 = (C55954a.AbstractC55955a) ThreadMergeForwardPresenter.this.getModel();
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "model");
            Thread c = aVar2.mo190729c();
            if (c != null) {
                str = c.anonymous_id;
            } else {
                str = null;
            }
            Message message = messageInfo.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            C55905a a = C55905a.m217086a(messageInfo, d, false, Intrinsics.areEqual(str, message.getFromId()));
            Intrinsics.checkExpressionValueIsNotNull(a, "ThreadDetailUIItem.creat… isAnonymousMessageOwner)");
            return a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/threadmergeforward/ThreadMergeForwardPresenter$loadData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/core/model/ObservableList;", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$e */
    public static final class C55970e implements IGetDataCallback<AbstractC33964i<MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardPresenter f138321a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55970e(ThreadMergeForwardPresenter gVar) {
            this.f138321a = gVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165386e("ThreadMergeForwardPresenter", errorResult);
            ((C55954a.AbstractC55957b) this.f138321a.getView()).mo190713b();
        }

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C33955c<C55905a, MessageInfo> cVar = new C33955c<>(iVar, new ThreadDetailDataMapper());
            this.f138321a.f138310a = cVar;
            cVar.mo124068a(this.f138321a.f138311b);
            cVar.mo124067a(this.f138321a);
            ((C55954a.AbstractC55957b) this.f138321a.getView()).mo190711a(cVar.mo124071b());
        }
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
    public void onChanged(List<C55905a> list) {
        Intrinsics.checkParameterIsNotNull(list, "snapshots");
        UICallbackExecutor.execute(new RunnableC55972g(this, list));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00020\u0002 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00050\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "origin", "kotlin.jvm.PlatformType", "", "convert"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threadmergeforward.g$f */
    static final class C55971f<T> implements AbstractC33961f<C55905a> {

        /* renamed from: a */
        final /* synthetic */ ThreadMergeForwardPresenter f138322a;

        C55971f(ThreadMergeForwardPresenter gVar) {
            this.f138322a = gVar;
        }

        @Override // com.ss.android.lark.chat.core.model.AbstractC33961f
        /* renamed from: a */
        public final List<C55905a> mo124080a(List<C55905a> list) {
            C55954a.AbstractC55955a aVar = (C55954a.AbstractC55955a) this.f138322a.getModel();
            Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
            int e = aVar.mo190731e();
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkExpressionValueIsNotNull(list, "origin");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C55905a aVar2 = list.get(i);
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "originItem");
                if (aVar2.mo190598f() != null) {
                    Message message = aVar2.mo190598f().getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "originItem.messageInfo.getMessage()");
                    if (message.getThreadPosition() == 0 && aVar2.mo190615p() != e) {
                        C55905a a = C55905a.m217087a(aVar2, e);
                        Intrinsics.checkExpressionValueIsNotNull(a, "item");
                        arrayList.add(a);
                    }
                }
                arrayList.add(aVar2);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo190756a(int i, int i2, Intent intent) {
        if (i2 == -1 && intent != null && i == 9) {
            ((C55954a.AbstractC55957b) getView()).mo190706a();
        }
    }

    public ThreadMergeForwardPresenter(FragmentActivity fragmentActivity, String str, Message message, ThreadMergeForwardView.ViewDependency bVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(str, "mOriginMergeForwardId");
        Intrinsics.checkParameterIsNotNull(message, "mMergeForwardMessage");
        Intrinsics.checkParameterIsNotNull(bVar, "viewDependency");
        this.f138314f = fragmentActivity;
        this.f138312c = str;
        this.f138313d = message;
        this.f138315g = bVar;
        ThreadMergeForwardView threadMergeForwardView = new ThreadMergeForwardView(fragmentActivity, bVar);
        ThreadMergeForwardModel fVar = new ThreadMergeForwardModel(str, message);
        setView(threadMergeForwardView);
        setModel(fVar);
        threadMergeForwardView.setViewDelegate(createViewDelegate());
        fVar.mo190748a(m217503b());
    }
}
