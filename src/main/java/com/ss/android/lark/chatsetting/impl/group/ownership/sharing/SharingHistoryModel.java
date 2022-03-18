package com.ss.android.lark.chatsetting.impl.group.ownership.sharing;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.PullChatShareHistoryResponse;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract;
import com.ss.android.lark.chatsetting.impl.group.ownership.sharing.SharingHistoryViewData;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0007H\u0016J&\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018H\u0016J\u001e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0016J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00162\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0016H\u0002J\u0012\u0010'\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0002J\u001c\u0010(\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00160\u0018H\u0016J\u001c\u0010)\u001a\u00020\u00142\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00160\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/ISharingHistoryContract$IModel;", "mChatId", "", "(Ljava/lang/String;)V", "mCanLoaderMore", "", "mChatDependency", "Lcom/ss/android/lark/chatsetting/dependency/IChatSettingModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "getMChatId", "()Ljava/lang/String;", "mCursor", "mShareInfos", "Ljava/util/HashMap;", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo;", "Lkotlin/collections/HashMap;", "canLoadMore", "deactivateSharing", "", "selectedIds", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getChat", "chatId", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getChatter", BottomDialog.f17198f, "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getShareTarget", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingTarget;", "chatShareInfo", "getShareType", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData$SharingType;", "handleData", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryViewData;", "chatShareInfos", "isDeactivate", "loadData", "loadInitData", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.i */
public final class SharingHistoryModel extends BaseModel implements ISharingHistoryContract.IModel {

    /* renamed from: e */
    public static final Companion f89891e = new Companion(null);

    /* renamed from: a */
    public boolean f89892a = true;

    /* renamed from: b */
    public String f89893b = "0";

    /* renamed from: c */
    public HashMap<String, ChatShareInfo> f89894c = new HashMap<>();

    /* renamed from: d */
    public final AbstractC34461c.AbstractC34466e f89895d;

    /* renamed from: f */
    private final String f89896f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryModel$Companion;", "", "()V", "PAGE_SIZE", "", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.i$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IModel
    /* renamed from: a */
    public boolean mo128429a() {
        return this.f89892a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.i$c */
    static final class RunnableC34801c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryModel f89900a;

        /* renamed from: b */
        final /* synthetic */ UIGetDataCallback f89901b;

        /* renamed from: c */
        final /* synthetic */ String f89902c;

        RunnableC34801c(SharingHistoryModel iVar, UIGetDataCallback uIGetDataCallback, String str) {
            this.f89900a = iVar;
            this.f89901b = uIGetDataCallback;
            this.f89902c = str;
        }

        public final void run() {
            this.f89901b.onSuccess(this.f89900a.f89895d.mo127349b(this.f89902c));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryModel$deactivateSharing$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.i$b */
    public static final class C34800b implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryModel f89897a;

        /* renamed from: b */
        final /* synthetic */ List f89898b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f89899c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89899c.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            ChatShareInfo chatShareInfo;
            List<String> list = this.f89898b;
            if (list == null) {
                Intrinsics.throwNpe();
            }
            for (String str : list) {
                if (this.f89897a.f89894c.get(str) != null) {
                    ChatShareInfo chatShareInfo2 = this.f89897a.f89894c.get(str);
                    if (chatShareInfo2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!TextUtils.isEmpty(chatShareInfo2.mo124646e()) && (chatShareInfo = this.f89897a.f89894c.get(str)) != null) {
                        chatShareInfo.mo124642a(ChatShareInfo.ShareStatus.DEACTIVATED);
                    }
                }
            }
            this.f89899c.onSuccess(bool);
        }

        C34800b(SharingHistoryModel iVar, List list, IGetDataCallback iGetDataCallback) {
            this.f89897a = iVar;
            this.f89898b = list;
            this.f89899c = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chatsetting/impl/group/ownership/sharing/SharingHistoryModel$loadData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chatsetting/dto/PullChatShareHistoryResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.sharing.i$d */
    public static final class C34802d implements IGetDataCallback<PullChatShareHistoryResponse> {

        /* renamed from: a */
        final /* synthetic */ SharingHistoryModel f89903a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f89904b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f89904b.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(PullChatShareHistoryResponse hVar) {
            boolean z;
            if (hVar == null) {
                this.f89904b.onSuccess(new ArrayList());
                return;
            }
            SharingHistoryModel iVar = this.f89903a;
            Boolean b = hVar.mo127532b();
            if (b != null) {
                z = b.booleanValue();
            } else {
                z = false;
            }
            iVar.f89892a = z;
            SharingHistoryModel iVar2 = this.f89903a;
            String c = hVar.mo127533c();
            if (c == null) {
                c = this.f89903a.f89893b;
            }
            iVar2.f89893b = c;
            this.f89904b.onSuccess(this.f89903a.mo128484a(hVar.mo127531a()));
        }

        C34802d(SharingHistoryModel iVar, IGetDataCallback iGetDataCallback) {
            this.f89903a = iVar;
            this.f89904b = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IModel
    /* renamed from: a */
    public void mo128426a(IGetDataCallback<List<SharingHistoryViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        mo128430b(iGetDataCallback);
    }

    public SharingHistoryModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        this.f89896f = str;
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        this.f89895d = a.mo127274d();
    }

    /* renamed from: a */
    private final boolean m135305a(ChatShareInfo chatShareInfo) {
        ChatShareInfo.ShareStatus shareStatus;
        long j;
        if (chatShareInfo != null) {
            shareStatus = chatShareInfo.mo124644c();
        } else {
            shareStatus = null;
        }
        if (shareStatus != ChatShareInfo.ShareStatus.ACTIVE) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long g = chatShareInfo.mo124649g();
        if (g != null) {
            j = g.longValue() * ((long) 1000);
        } else {
            j = 0;
        }
        if (currentTimeMillis > j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final SharingHistoryViewData.SharingType m135306b(ChatShareInfo chatShareInfo) {
        ChatShareInfo.ShareType shareType;
        ChatShareInfo.ShareType shareType2 = null;
        if (chatShareInfo != null) {
            shareType = chatShareInfo.mo124643b();
        } else {
            shareType = null;
        }
        if (shareType == ChatShareInfo.ShareType.QRCODE && chatShareInfo.mo124645d() == ChatShareInfo.ShareTargetType.TARGET_QRCODE) {
            return SharingHistoryViewData.SharingType.SAVE_QR;
        }
        if (chatShareInfo != null) {
            shareType2 = chatShareInfo.mo124643b();
        }
        if (shareType2 == ChatShareInfo.ShareType.LINK) {
            return SharingHistoryViewData.SharingType.SHARED_LINK;
        }
        return SharingHistoryViewData.SharingType.SHARED_INVITATION;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IModel
    /* renamed from: b */
    public void mo128430b(IGetDataCallback<List<SharingHistoryViewData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f89895d.mo127338a(this.f89896f, this.f89893b, 20, getCallbackManager().wrapAndAddGetDataCallback(new C34802d(this, iGetDataCallback)));
    }

    /* renamed from: c */
    private final SharingTarget m135307c(ChatShareInfo chatShareInfo) {
        String str;
        String a;
        String str2;
        String a2;
        String str3;
        DocType docType;
        boolean z;
        String a3;
        if (chatShareInfo == null) {
            return null;
        }
        SharingTarget mVar = null;
        ChatShareInfo.ShareTargetType d = chatShareInfo.mo124645d();
        if (d == null) {
            return mVar;
        }
        int i = C34803j.f89905a[d.ordinal()];
        String str4 = "";
        if (i == 1) {
            ChatShareInfo.TargetChatterExtra k = chatShareInfo.mo124654k();
            if (k == null || (str = k.mo124678b()) == null) {
                str = str4;
            }
            ChatShareInfo.TargetChatterExtra k2 = chatShareInfo.mo124654k();
            if (!(k2 == null || (a = k2.mo124677a()) == null)) {
                str4 = a;
            }
            return new ChatterTarget(str, str4);
        } else if (i == 2) {
            ChatShareInfo.TargetChatExtra j = chatShareInfo.mo124653j();
            if (j == null || (str2 = j.mo124673b()) == null) {
                str2 = str4;
            }
            ChatShareInfo.TargetChatExtra j2 = chatShareInfo.mo124653j();
            if (!(j2 == null || (a2 = j2.mo124672a()) == null)) {
                str4 = a2;
            }
            return new ChatTarget(str2, str4);
        } else if (i != 3) {
            return mVar;
        } else {
            ChatShareInfo.TargetDocExtra i2 = chatShareInfo.mo124652i();
            if (i2 == null || (str3 = i2.mo124683b()) == null) {
                str3 = str4;
            }
            ChatShareInfo.TargetDocExtra i3 = chatShareInfo.mo124652i();
            if (!(i3 == null || (a3 = i3.mo124682a()) == null)) {
                str4 = a3;
            }
            ChatShareInfo.TargetDocExtra i4 = chatShareInfo.mo124652i();
            if (i4 == null || (docType = i4.mo124684c()) == null) {
                docType = DocType.DOC;
            }
            ChatShareInfo.TargetDocExtra i5 = chatShareInfo.mo124652i();
            if (i5 != null) {
                z = i5.mo124685d();
            } else {
                z = false;
            }
            return new DocTarget(str3, str4, docType, z);
        }
    }

    /* renamed from: a */
    public final List<SharingHistoryViewData> mo128484a(List<ChatShareInfo> list) {
        String str;
        String str2;
        String str3;
        long j;
        String a;
        String b;
        String c;
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (ChatShareInfo chatShareInfo : list) {
            if (!TextUtils.isEmpty(chatShareInfo.mo124641a())) {
                HashMap<String, ChatShareInfo> hashMap = this.f89894c;
                String a2 = chatShareInfo.mo124641a();
                if (a2 == null) {
                    Intrinsics.throwNpe();
                }
                hashMap.put(a2, chatShareInfo);
                String a3 = chatShareInfo.mo124641a();
                if (a3 == null) {
                    Intrinsics.throwNpe();
                }
                ChatShareInfo.ShareChatterExtra h = chatShareInfo.mo124650h();
                if (h == null || (c = h.mo124668c()) == null) {
                    str = "";
                } else {
                    str = c;
                }
                ChatShareInfo.ShareChatterExtra h2 = chatShareInfo.mo124650h();
                if (h2 == null || (b = h2.mo124667b()) == null) {
                    str2 = "";
                } else {
                    str2 = b;
                }
                ChatShareInfo.ShareChatterExtra h3 = chatShareInfo.mo124650h();
                if (h3 == null || (a = h3.mo124666a()) == null) {
                    str3 = "";
                } else {
                    str3 = a;
                }
                boolean a4 = m135305a(chatShareInfo);
                Long f = chatShareInfo.mo124648f();
                if (f != null) {
                    j = f.longValue() * ((long) 1000);
                } else {
                    j = 0;
                }
                arrayList.add(new SharingHistoryViewData(a3, false, str, str2, str3, a4, j, m135306b(chatShareInfo), m135307c(chatShareInfo)));
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IModel
    /* renamed from: a */
    public void mo128427a(String str, IGetDataCallback<Chatter> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.f89895d.mo127369d(str, iGetDataCallback);
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IModel
    /* renamed from: b */
    public void mo128431b(String str, IGetDataCallback<Chat> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        C57865c.m224576a(new RunnableC34801c(this, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), str));
    }

    @Override // com.ss.android.lark.chatsetting.impl.group.ownership.sharing.ISharingHistoryContract.IModel
    /* renamed from: a */
    public void mo128428a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        String str;
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        if (!CollectionUtils.isEmpty(list)) {
            ArrayList arrayList = new ArrayList();
            if (list == null) {
                Intrinsics.throwNpe();
            }
            for (String str2 : list) {
                if (this.f89894c.get(str2) != null) {
                    ChatShareInfo chatShareInfo = this.f89894c.get(str2);
                    if (chatShareInfo == null) {
                        Intrinsics.throwNpe();
                    }
                    if (!TextUtils.isEmpty(chatShareInfo.mo124646e())) {
                        ChatShareInfo chatShareInfo2 = this.f89894c.get(str2);
                        if (chatShareInfo2 != null) {
                            str = chatShareInfo2.mo124646e();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            Intrinsics.throwNpe();
                        }
                        arrayList.add(str);
                    }
                }
            }
            if (!CollectionUtils.isEmpty(arrayList)) {
                this.f89895d.mo127347a(arrayList, ChatShareInfo.ShareStatus.DEACTIVATED, getCallbackManager().wrapAndAddGetDataCallback(new C34800b(this, list, iGetDataCallback)));
            }
        }
    }
}
