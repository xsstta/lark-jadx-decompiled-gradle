package com.ss.android.lark.searchcommon.view.binder;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.constant.SearchCommonConstants;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.reporter.SearchClickReporter;
import com.ss.android.lark.utils.C57782ag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/ViewInChatClickListener;", "T", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "", "()V", "getChatId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;)Ljava/lang/String;", "getChatPosition", "", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;)I", "getThreadId", "getThreadPosition", "onViewInChatClick", "", "position", "(Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;I)V", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.ae */
public abstract class ViewInChatClickListener<T extends SearchBaseInfo> {
    /* renamed from: a */
    public abstract String mo184771a(T t);

    /* renamed from: b */
    public abstract String mo184773b(T t);

    /* renamed from: c */
    public abstract int mo184774c(T t);

    /* renamed from: d */
    public abstract int mo184775d(T t);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/ViewInChatClickListener$onViewInChatClick$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chat", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.binder.ae$a */
    public static final class C53982a implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ ViewInChatClickListener f133584a;

        /* renamed from: b */
        final /* synthetic */ SearchBaseInfo f133585b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.searchcommon.view.binder.ae */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: com.ss.android.lark.searchcommon.view.binder.ae */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: com.ss.android.lark.searchcommon.view.binder.ae */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.ss.android.lark.searchcommon.view.binder.ae */
        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: com.ss.android.lark.searchcommon.view.binder.ae */
        /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: com.ss.android.lark.searchcommon.view.binder.ae */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public void onSuccess(Chat chat) {
            if (chat != null) {
                if (chat.isThread()) {
                    SearchCommonModuleDependency.m208732b().mo102898a(this.f133584a.mo184771a(this.f133585b), SearchCommonConstants.FeedType.THREAD);
                    SearchCommonModuleDependency.m208732b().mo102908b(this.f133584a.mo184771a(this.f133585b), this.f133584a.mo184774c(this.f133585b));
                    return;
                }
                SearchCommonModuleDependency.m208732b().mo102898a(this.f133584a.mo184773b(this.f133585b), SearchCommonConstants.FeedType.CHAT);
                SearchCommonModuleDependency.m208732b().mo102896a(this.f133584a.mo184773b(this.f133585b), this.f133584a.mo184775d(this.f133585b));
            }
        }

        C53982a(ViewInChatClickListener aeVar, SearchBaseInfo searchBaseInfo) {
            this.f133584a = aeVar;
            this.f133585b = searchBaseInfo;
        }
    }

    /* renamed from: a */
    public final void mo184772a(T t, int i) {
        Intrinsics.checkParameterIsNotNull(t, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        SearchClickReporter.m208834a(t, "chat", "file", Integer.valueOf(i + 1), "enter_conversation");
        if (C57782ag.m224241a(mo184771a(t))) {
            SearchCommonModuleDependency.m208732b().mo102898a(mo184773b(t), SearchCommonConstants.FeedType.CHAT);
            SearchCommonModuleDependency.m208732b().mo102896a(mo184773b(t), mo184775d(t));
            return;
        }
        SearchCommonModuleDependency.m208732b().mo102897a(mo184773b(t), new UIGetDataCallback(new C53982a(this, t)));
    }
}
