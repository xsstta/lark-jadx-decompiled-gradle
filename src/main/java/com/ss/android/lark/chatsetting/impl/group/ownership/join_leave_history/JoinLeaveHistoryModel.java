package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.GetChatJoinLeaveHistoryResponse;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract;
import com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveViewData;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001c\u0010\u000f\u001a\u00020\n2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\rH\u0016J(\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00160\u0013H\u0002J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/IJoinLeaveHistoryContract$IJoinLeaveHistoryModel;", "mChatId", "", "(Ljava/lang/String;)V", "mCursor", "mHasMore", "", "getChatById", "", "chatId", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatJoinLeaveHistory", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData;", "getContentValueMap", "", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$ContentValue;", "historyMap", "Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$ContentValue;", "getJoinHistoryList", "chatJoinLeaveHistoryList", "Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory;", "getJoinLeaveWay", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveViewData$JoinLeaveWay;", "extra", "Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory$HistoryExtra;", "hasMore", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.d */
public final class JoinLeaveHistoryModel extends BaseModel implements IJoinLeaveHistoryContract.IJoinLeaveHistoryModel {

    /* renamed from: c */
    public static final Companion f89705c = new Companion(null);

    /* renamed from: a */
    public String f89706a = "0";

    /* renamed from: b */
    public boolean f89707b = true;

    /* renamed from: d */
    private final String f89708d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryModel$Companion;", "", "()V", "PAGE_SIZE", "", "TAG", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryModel
    /* renamed from: a */
    public boolean mo128217a() {
        return this.f89707b;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.d$b */
    static final class C34727b<T> implements C57865c.AbstractC57873d<Chat> {

        /* renamed from: a */
        final /* synthetic */ String f89709a;

        C34727b(String str) {
            this.f89709a = str;
        }

        /* renamed from: a */
        public final Chat produce() {
            AbstractC34461c a = ChatSettingModule.m133639a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
            return a.mo127274d().mo127349b(this.f89709a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.d$c */
    static final class C34728c<T> implements C57865c.AbstractC57871b<Chat> {

        /* renamed from: a */
        final /* synthetic */ UIGetDataCallback f89710a;

        C34728c(UIGetDataCallback uIGetDataCallback) {
            this.f89710a = uIGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(Chat chat) {
            this.f89710a.onSuccess(chat);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryModel$getChatJoinLeaveHistory$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatsetting/dto/GetChatJoinLeaveHistoryResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.d$d */
    public static final class C34729d implements IGetDataCallback<GetChatJoinLeaveHistoryResponse> {

        /* renamed from: a */
        final /* synthetic */ JoinLeaveHistoryModel f89711a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f89712b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89712b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(GetChatJoinLeaveHistoryResponse bVar) {
            if (bVar == null) {
                this.f89712b.onError(new ErrorResult("GetChatJoinLeaveHistoryResponse is null"));
                Log.m165383e("JoinLeaveHistoryModel", "GetChatJoinLeaveHistoryResponse is null");
                return;
            }
            this.f89711a.f89706a = bVar.mo127525c();
            this.f89711a.f89707b = bVar.mo127524b();
            this.f89712b.onSuccess(this.f89711a.mo128256a(bVar.mo127523a()));
        }

        C34729d(JoinLeaveHistoryModel dVar, IGetDataCallback iGetDataCallback) {
            this.f89711a = dVar;
            this.f89712b = iGetDataCallback;
        }
    }

    public JoinLeaveHistoryModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        this.f89708d = str;
    }

    /* renamed from: a */
    private final JoinLeaveViewData.JoinLeaveWay m135039a(ChatJoinLeaveHistory.HistoryExtra bVar) {
        return new JoinLeaveViewData.JoinLeaveWay(bVar.mo124627a(), m135040a(bVar.mo124628b()));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryModel
    /* renamed from: a */
    public void mo128215a(IGetDataCallback<List<JoinLeaveViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        a.mo127274d().mo127359b(this.f89708d, this.f89706a, 20, getCallbackManager().wrapAndAddGetDataCallback(new C34729d(this, iGetDataCallback)));
    }

    /* renamed from: a */
    private final Map<String, JoinLeaveViewData.ContentValue> m135040a(Map<String, ChatJoinLeaveHistory.ContentValue> map) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(map)) {
            return hashMap;
        }
        for (String str : map.keySet()) {
            if (map.get(str) != null) {
                hashMap.put(str, new JoinLeaveViewData.ContentValue(((ChatJoinLeaveHistory.ContentValue) MapsKt.getValue(map, str)).mo124624c(), ((ChatJoinLeaveHistory.ContentValue) MapsKt.getValue(map, str)).mo124622a(), ((ChatJoinLeaveHistory.ContentValue) MapsKt.getValue(map, str)).mo124623b(), ((ChatJoinLeaveHistory.ContentValue) MapsKt.getValue(map, str)).mo124625d(), ((ChatJoinLeaveHistory.ContentValue) MapsKt.getValue(map, str)).mo124626e()));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final List<JoinLeaveViewData> mo128256a(List<ChatJoinLeaveHistory> list) {
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(list)) {
            return arrayList;
        }
        for (ChatJoinLeaveHistory chatJoinLeaveHistory : list) {
            arrayList.add(new JoinLeaveViewData(chatJoinLeaveHistory.mo124615a(), chatJoinLeaveHistory.mo124616b(), chatJoinLeaveHistory.mo124617c(), chatJoinLeaveHistory.mo124618d(), chatJoinLeaveHistory.mo124619e(), chatJoinLeaveHistory.mo124620f(), m135039a(chatJoinLeaveHistory.mo124621g())));
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.IJoinLeaveHistoryContract.IJoinLeaveHistoryModel
    /* renamed from: a */
    public void mo128216a(String str, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C57865c.m224574a(new C34727b(str), new C34728c(getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback)));
    }
}
