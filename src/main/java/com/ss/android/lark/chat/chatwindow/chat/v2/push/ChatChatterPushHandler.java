package com.ss.android.lark.chat.chatwindow.chat.v2.push;

import android.text.TextUtils;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.service.impl.C34209g;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00050\u00050\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/PushHandlerManager$IPushHandler;", "mChatId", "", "listener", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler$IChatterPushListener;", "(Ljava/lang/String;Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler$IChatterPushListener;)V", "mPushChannelNicknameListener", "Lcom/ss/android/lark/chat/service/impl/ChatterPush$IPushChannelNicknameListener;", "mPushChattersListener", "Lcom/ss/android/lark/biz/im/api/IPushChatterListener;", "mPushMineChatterChangedListener", "Lcom/ss/android/lark/biz/im/api/IPushMineChatterChangedListener;", "mRefs", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "register", "", "unRegister", "IChatterPushListener", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.c */
public final class ChatChatterPushHandler implements C33466o.AbstractC33467a {

    /* renamed from: a */
    public WeakReference<IChatterPushListener> f86197a;

    /* renamed from: b */
    public String f86198b;

    /* renamed from: c */
    private final AbstractC29623p f86199c = new C33440c(this);

    /* renamed from: d */
    private final C34209g.AbstractC34214b f86200d = new C33439b(this);

    /* renamed from: e */
    private final AbstractC29627s f86201e = new C33441d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatChatterPushHandler$IChatterPushListener;", "", "onPushUpdatedChatter", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onPushUpdatedNickname", BottomDialog.f17198f, "", "nickname", "onUpdateSelfInfo", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.c$a */
    public interface IChatterPushListener {
        void onPushUpdatedChatter(Chatter chatter);

        void onPushUpdatedNickname(String str, String str2);

        void onUpdateSelfInfo(Chatter chatter);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: a */
    public void mo123055a() {
        C34209g.m132771a().mo126756a(this.f86199c);
        C34209g.m132771a().mo126759a(this.f86200d);
        C34209g.m132771a().mo126757a(this.f86201e);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o.AbstractC33467a
    /* renamed from: b */
    public void mo123056b() {
        C34209g.m132771a().mo126760b(this.f86199c);
        C34209g.m132771a().mo126762b(this.f86200d);
        C34209g.m132771a().mo126761b(this.f86201e);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "onPushChatter"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.c$c */
    static final class C33440c implements AbstractC29623p {

        /* renamed from: a */
        final /* synthetic */ ChatChatterPushHandler f86203a;

        C33440c(ChatChatterPushHandler cVar) {
            this.f86203a = cVar;
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
        public final void onPushChatter(Chatter chatter) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            String format = String.format("onPushChatter, id is [%s], avatarKey is [%s]", Arrays.copyOf(new Object[]{chatter.getId(), chatter.getAvatarKey()}, 2));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(format, *args)");
            Log.m165379d("ChatWindowLog", format);
            IChatterPushListener aVar = this.f86203a.f86197a.get();
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(chatter, "chatter");
                aVar.onPushUpdatedChatter(chatter);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "kotlin.jvm.PlatformType", "mineChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onPushMineChatterChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.c$d */
    static final class C33441d implements AbstractC29627s {

        /* renamed from: a */
        final /* synthetic */ ChatChatterPushHandler f86204a;

        C33441d(ChatChatterPushHandler cVar) {
            this.f86204a = cVar;
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
        public final void onPushMineChatterChanged(Chatter chatter, Chat chat) {
            IChatterPushListener aVar;
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            AbstractC36450aa N = b.mo134515N();
            Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
            String a = N.mo134394a();
            if (chatter != null && Intrinsics.areEqual(a, chatter.getId()) && (aVar = this.f86204a.f86197a.get()) != null) {
                aVar.onUpdateSelfInfo(chatter);
            }
        }
    }

    public ChatChatterPushHandler(String str, IChatterPushListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, "mChatId");
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f86198b = str;
        this.f86197a = new WeakReference<>(aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "userId", "", "kotlin.jvm.PlatformType", "nickname", "channel", "Lcom/ss/android/lark/chat/entity/Channel;", "onPushChannelNickname"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.c.c$b */
    static final class C33439b implements C34209g.AbstractC34214b {

        /* renamed from: a */
        final /* synthetic */ ChatChatterPushHandler f86202a;

        C33439b(ChatChatterPushHandler cVar) {
            this.f86202a = cVar;
        }

        @Override // com.ss.android.lark.chat.service.impl.C34209g.AbstractC34214b
        /* renamed from: a */
        public final void mo123066a(String str, String str2, Channel channel) {
            IChatterPushListener aVar;
            if (channel != null && Intrinsics.areEqual(this.f86202a.f86198b, channel.getId()) && !TextUtils.isEmpty(str) && (aVar = this.f86202a.f86197a.get()) != null) {
                Intrinsics.checkExpressionValueIsNotNull(str, "userId");
                Intrinsics.checkExpressionValueIsNotNull(str2, "nickname");
                aVar.onPushUpdatedNickname(str, str2);
            }
        }
    }
}
