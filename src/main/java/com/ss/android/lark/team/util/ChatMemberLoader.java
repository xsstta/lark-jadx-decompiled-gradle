package com.ss.android.lark.team.util;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.dependency.ITeamModuleDependency;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u001a\u001a\u00020\u0013J\u0006\u0010\u001b\u001a\u00020\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/team/util/ChatMemberLoader;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "chatId", "", "pageSize", "", "loadCallback", "Lcom/ss/android/lark/team/util/ChatMemberLoader$LoadCallback;", "(Ljava/lang/String;ILcom/ss/android/lark/team/util/ChatMemberLoader$LoadCallback;)V", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "chatterIdSet", "", "cursor", "isLoading", "", "needSearchForSecurity", "destroy", "", "loadMore", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "reset", "startLoad", "Companion", "LoadCallback", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.f.a */
public final class ChatMemberLoader implements IGetDataCallback<ChatChatterResponse> {

    /* renamed from: a */
    public static final Companion f136859a = new Companion(null);

    /* renamed from: b */
    private String f136860b;

    /* renamed from: c */
    private boolean f136861c;

    /* renamed from: d */
    private final CallbackManager f136862d = new CallbackManager();

    /* renamed from: e */
    private boolean f136863e;

    /* renamed from: f */
    private final Set<String> f136864f = new LinkedHashSet();

    /* renamed from: g */
    private final String f136865g;

    /* renamed from: h */
    private final int f136866h;

    /* renamed from: i */
    private LoadCallback f136867i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/util/ChatMemberLoader$LoadCallback;", "", "()V", "needSearchForSecurity", "", "onFirstPage", "chatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "onLoadFailed", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onLoadMore", "onNoMore", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.f.a$b */
    public static class LoadCallback {
        /* renamed from: a */
        public void mo189202a() {
        }

        /* renamed from: a */
        public void mo189203a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* renamed from: a */
        public void mo189204a(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatters");
        }

        /* renamed from: b */
        public void mo189205b() {
        }

        /* renamed from: b */
        public void mo189206b(List<? extends ChatChatter> list) {
            Intrinsics.checkParameterIsNotNull(list, "chatters");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/util/ChatMemberLoader$Companion;", "", "()V", "PAGE_SIZE_NO_LIMIT", "", "TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.f.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo189201d() {
        Log.m165379d("ChatMemberLoader", "call destroy");
        mo189200c();
        this.f136867i = null;
    }

    /* renamed from: c */
    public final void mo189200c() {
        Log.m165379d("ChatMemberLoader", "call reset");
        this.f136860b = null;
        this.f136861c = false;
        this.f136863e = false;
        this.f136864f.clear();
    }

    /* renamed from: a */
    public final void mo189197a() {
        Log.m165379d("ChatMemberLoader", "call startLoad");
        if (this.f136861c) {
            Log.m165379d("ChatMemberLoader", "now is loading, ignore this call");
        } else if (this.f136863e) {
            Log.m165379d("ChatMemberLoader", "need search for security, ignore this call");
            LoadCallback bVar = this.f136867i;
            if (bVar != null) {
                bVar.mo189202a();
            }
        } else {
            Log.m165379d("ChatMemberLoader", "start load, chatId: " + this.f136865g + ", cursor: " + this.f136860b + ", pageSize: " + this.f136866h);
            this.f136861c = true;
            UIGetDataCallback wrapAndAddGetDataCallback = this.f136862d.wrapAndAddGetDataCallback(this);
            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
            String str = this.f136865g;
            String str2 = this.f136860b;
            int i = this.f136866h;
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "cb");
            c.mo144140a(str, str2, i, false, wrapAndAddGetDataCallback, -1);
        }
    }

    /* renamed from: b */
    public final void mo189199b() {
        Log.m165379d("ChatMemberLoader", "call loadMore");
        if (this.f136861c) {
            Log.m165379d("ChatMemberLoader", "now is loading, ignore this call");
        } else if (this.f136863e) {
            Log.m165379d("ChatMemberLoader", "need search for security, ignore this call");
            LoadCallback bVar = this.f136867i;
            if (bVar != null) {
                bVar.mo189202a();
            }
        } else {
            Log.m165379d("ChatMemberLoader", "start load more, chatId: " + this.f136865g + ", cursor: " + this.f136860b + ", pageSize: " + this.f136866h + '\"');
            this.f136861c = true;
            UIGetDataCallback wrapAndAddGetDataCallback = this.f136862d.wrapAndAddGetDataCallback(this);
            ITeamModuleDependency.IChatDependency c = C55356a.m214819a().mo144124c();
            String str = this.f136865g;
            String str2 = this.f136860b;
            int i = this.f136866h;
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "cb");
            c.mo144140a(str, str2, i, false, wrapAndAddGetDataCallback, -1);
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        Intrinsics.checkParameterIsNotNull(errorResult, "err");
        Log.m165379d("ChatMemberLoader", "onError " + errorResult.getDebugMsg());
        this.f136861c = false;
        LoadCallback bVar = this.f136867i;
        if (bVar != null) {
            bVar.mo189203a(errorResult);
        }
    }

    /* renamed from: a */
    public void onSuccess(ChatChatterResponse aVar) {
        LoadCallback bVar;
        boolean z;
        Log.m165379d("ChatMemberLoader", "onSuccess");
        boolean z2 = false;
        this.f136861c = false;
        if (aVar == null) {
            Log.m165379d("ChatMemberLoader", "onSuccess but data is null, call onLoadFailed");
            LoadCallback bVar2 = this.f136867i;
            if (bVar2 != null) {
                bVar2.mo189203a(new ErrorResult(new Exception("ChatChatterResponse is null")));
                return;
            }
            return;
        }
        if (aVar.mo136068b() >= 1) {
            List<ChatChatter> e = aVar.mo136071e();
            if (e == null || e.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (ChatChatter chatChatter : aVar.mo136071e()) {
                    String id = chatChatter.getId();
                    Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
                    if (!chatChatter.isBot() && !this.f136864f.contains(id)) {
                        this.f136864f.add(id);
                        arrayList.add(chatChatter);
                    }
                }
                Log.m165379d("ChatMemberLoader", "onSuccess with " + arrayList.size() + " chatters");
                if (arrayList.size() < 1) {
                    Log.m165379d("ChatMemberLoader", "onSuccess call onNoMore");
                    LoadCallback bVar3 = this.f136867i;
                    if (bVar3 != null) {
                        bVar3.mo189205b();
                    }
                } else {
                    String str = this.f136860b;
                    if (str == null || str.length() == 0) {
                        z2 = true;
                    }
                    if (z2) {
                        Log.m165379d("ChatMemberLoader", "onSuccess call onFirstPage");
                        LoadCallback bVar4 = this.f136867i;
                        if (bVar4 != null) {
                            bVar4.mo189204a(arrayList);
                        }
                    } else {
                        Log.m165379d("ChatMemberLoader", "onSuccess call onLoadMore");
                        LoadCallback bVar5 = this.f136867i;
                        if (bVar5 != null) {
                            bVar5.mo189206b(arrayList);
                        }
                    }
                }
                this.f136860b = aVar.mo136070d();
                this.f136863e = aVar.mo136069c();
                Log.m165379d("ChatMemberLoader", "onSuccess showSearch is " + aVar.mo136069c());
                if (this.f136863e && (bVar = this.f136867i) != null) {
                    bVar.mo189202a();
                    return;
                }
            }
        }
        Log.m165379d("ChatMemberLoader", "onSuccess but no data, call onNoMore");
        LoadCallback bVar6 = this.f136867i;
        if (bVar6 != null) {
            bVar6.mo189205b();
        }
        this.f136860b = aVar.mo136070d();
        this.f136863e = aVar.mo136069c();
        Log.m165379d("ChatMemberLoader", "onSuccess showSearch is " + aVar.mo136069c());
        if (this.f136863e) {
        }
    }

    public ChatMemberLoader(String str, int i, LoadCallback bVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        this.f136865g = str;
        this.f136866h = i;
        this.f136867i = bVar;
    }
}
