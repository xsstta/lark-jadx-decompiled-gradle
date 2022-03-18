package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.lark.pb.im.v1.PushImageTranslationInfo;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.AndroidThrottle;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33386b;
import com.ss.android.lark.chat.chatwindow.chat.model.p1637c.C33404b;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33111af;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.utils.C34350p;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dto.translate.C36874a;
import com.ss.android.lark.dto.translate.TranslateState;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J]\u0010!\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020'\u0018\u00010)2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020'\u0018\u00010)H\u0016¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.H\u0016J\u001a\u0010/\u001a\u00020\u00152\u0010\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003010%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/TranslatePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler$ITranslatePushListener;", "()V", "mChatTranslatePushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatTranslatePushHandler;", "mCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mFeatureConfigDependency", "Lcom/ss/android/lark/dependency/IFeatureConfigDependency;", "kotlin.jvm.PlatformType", "mMessageTranslateThrottle", "Lcom/larksuite/framework/utils/AndroidThrottle;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "mTranslateMenuHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/TranslateViewHandler;", "mTranslateModelHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/TranslateModelHandler;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "handleTranslatePushMessages", "", "messageInfos", "", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onPushImageTranslationInfo", "info", "Lcom/bytedance/lark/pb/im/v1/PushImageTranslationInfo;", "onPushTranslateSetting", "targetLanguage", "", "disableKeys", "", "globalDisplayConfig", "", "displayConfigMap", "", "autoTranslateMap", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)V", "onPushTranslateState", "translateState", "Lcom/ss/android/lark/dto/translate/TranslateResult;", "translateMessage", "itemList", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v */
public final class TranslatePlugin extends BaseChatPlugin implements ChatTranslatePushHandler.ITranslatePushListener {

    /* renamed from: a */
    public C33111af f87236a;

    /* renamed from: b */
    public C33103ae f87237b;

    /* renamed from: c */
    public IMessageListComponent f87238c;

    /* renamed from: d */
    public Chat f87239d;

    /* renamed from: e */
    public final AbstractC36502p f87240e;

    /* renamed from: f */
    public AndroidThrottle<AbstractC34006a> f87241f;

    /* renamed from: g */
    private ChatTranslatePushHandler f87242g = new ChatTranslatePushHandler(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TranslatePlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent$IListComponentCallbacks;", "onChatUpdate", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$b */
    public static final class C33857b implements IMessageListComponent.IListComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87244a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122152a() {
            IMessageListComponent.IListComponentCallbacks.C33556a.m130094a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33857b(TranslatePlugin vVar) {
            this.f87244a = vVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122153a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130095a(this, chat);
            this.f87244a.f87239d = chat;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent.IListComponentCallbacks
        /* renamed from: a */
        public void mo122154a(ChatChatter chatChatter) {
            Intrinsics.checkParameterIsNotNull(chatChatter, "chatChatter");
            IMessageListComponent.IListComponentCallbacks.C33556a.m130096a(this, chatChatter);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TranslatePlugin$onPushTranslateState$1", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/ITranslateModelHandler$IPushCallback;", "onError", "", "translateError", "Lcom/ss/android/lark/dto/translate/TranslateState;", "onSuccess", "translateStateMap", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$f */
    public static final class C33861f implements AbstractC33134w.AbstractC33136b {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87248a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
        /* renamed from: a */
        public void mo122326a(Map<String, TranslateState> map) {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$f$a */
        static final class RunnableC33862a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33861f f87249a;

            /* renamed from: b */
            final /* synthetic */ TranslateState f87250b;

            RunnableC33862a(C33861f fVar, TranslateState translateState) {
                this.f87249a = fVar;
                this.f87250b = translateState;
            }

            public final void run() {
                TranslatePlugin.m131109b(this.f87249a.f87248a).mo122311a(this.f87250b);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33861f(TranslatePlugin vVar) {
            this.f87248a = vVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33136b
        /* renamed from: a */
        public void mo122325a(TranslateState translateState) {
            UICallbackExecutor.post(new RunnableC33862a(this, translateState));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        this.f87241f.mo93302a();
        C33111af afVar = this.f87236a;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateMenuHandler");
        }
        afVar.mo122308a();
        this.f87242g.mo123056b();
    }

    public TranslatePlugin() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f87240e = b.af();
        AndroidThrottle<AbstractC34006a> a = new AndroidThrottle.C26229a().mo93309a(300L).mo93310a(CoreThreadPool.getNonblockingHandler()).mo93311a(new C33404b()).mo93312a(new C33856a(this)).mo93313a();
        Intrinsics.checkExpressionValueIsNotNull(a, "AndroidThrottle.Builder<…Messages(tasks) }.build()");
        this.f87241f = a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$g */
    public static final class RunnableC33863g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87251a;

        /* renamed from: b */
        final /* synthetic */ List f87252b;

        RunnableC33863g(TranslatePlugin vVar, List list) {
            this.f87251a = vVar;
            this.f87252b = list;
        }

        public final void run() {
            AbstractC36502p pVar = this.f87251a.f87240e;
            Intrinsics.checkExpressionValueIsNotNull(pVar, "mFeatureConfigDependency");
            if (pVar.mo134683a()) {
                ArrayList arrayList = new ArrayList();
                for (ChatMessageVO cVar : this.f87252b) {
                    arrayList.add(cVar.mo121681a());
                }
                List<AbstractC34006a> a = TranslatePlugin.m131110c(this.f87251a).mo123303a((Collection<String>) arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (T t : a) {
                    Message message = t.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "it.getMessage()");
                    if (!(message.getType() == Message.Type.TEXT || message.getType() == Message.Type.MERGE_FORWARD || message.getType() == Message.Type.IMAGE)) {
                        if (message.getType() != Message.Type.POST) {
                            continue;
                        } else {
                            Content content = message.getContent();
                            if (content == null) {
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.PostContent");
                            } else if (((PostContent) content).isGroupAnnouncement()) {
                            }
                        }
                    }
                    if (TranslatePlugin.m131108a(this.f87251a).isAutoTranslate() || C34350p.m133219b(message)) {
                        arrayList2.add(t);
                    }
                }
                TranslatePlugin.m131111d(this.f87251a).batchUpdateTranslateState(arrayList2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0010\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J \u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TranslatePlugin$onCreate$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/widget/RecyclerViewItemDetector$ItemDetectListener;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "onItemDetected", "", "itemList", "", "onReachToBottom", "onScrollPassed", "scrolled", "", "scrolledStartIndex", "", "scrolledEndIndex", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$c */
    public static final class C33858c implements RecyclerViewItemDetector.ItemDetectListener<ChatMessageVO<?>> {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87245a;

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122146a() {
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122148a(boolean z, int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33858c(TranslatePlugin vVar) {
            this.f87245a = vVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
        /* renamed from: a */
        public void mo122147a(List<? extends ChatMessageVO<?>> list) {
            Intrinsics.checkParameterIsNotNull(list, "itemList");
            this.f87245a.mo123889a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u00020\u0003\"\u0016\b\u0000\u0010\u0004*\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\"\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\u0012H\u0016¨\u0006\u0014"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TranslatePlugin$onCreate$3", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "onTranslate", "", "M", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "itemView", "Landroid/view/View;", "hiveHolder", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "translatableMessageVO", "onTranslateFeedbackClick", "messageId", "", "onTranslateSettingClick", "onTranslateShowOriginClick", "textMessageVO", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "Lcom/ss/android/lark/chat/base/view/vo/message/TranslatableContentVO;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$d */
    public static final class C33859d extends MessageCallbackHandler {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87246a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33859d(TranslatePlugin vVar) {
            this.f87246a = vVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q, com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler
        /* renamed from: s */
        public void mo122780s(String str) {
            TranslatePlugin.m131109b(this.f87246a).mo122312a(str);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.message.p1624a.AbstractC33307q, com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler
        /* renamed from: a */
        public void mo122778a(View view, ChatMessageVO<TranslatableContentVO<?>> cVar) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(cVar, "textMessageVO");
            TranslatePlugin.m131109b(this.f87246a).mo122309a(view, (String) null, cVar.mo121681a());
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33133v
        /* renamed from: a */
        public <M extends AbsMessageVO<? extends ContentVO<?>>> void mo122321a(View view, AbstractC59010e eVar, AbsMessageVO<? extends ContentVO<?>> aVar) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(eVar, "hiveHolder");
            Intrinsics.checkParameterIsNotNull(aVar, "translatableMessageVO");
            TranslatePlugin.m131109b(this.f87246a).mo122309a(view, (String) null, aVar.mo121681a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/TranslatePlugin$onCreate$4", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/ITranslateModelHandler$IDataProvider;", "batchHandlePush", "", "messageList", "", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "batchUpdateItem", "getItemByIds", "", "ids", "", "filterType", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$e */
    public static final class C33860e implements AbstractC33134w.AbstractC33135a {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87247a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33860e(TranslatePlugin vVar) {
            this.f87247a = vVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
        /* renamed from: b */
        public void mo122324b(Collection<AbstractC34006a> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "messageList");
            this.f87247a.f87241f.mo93304a(collection);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
        /* renamed from: a */
        public void mo122323a(Collection<AbstractC34006a> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "messageList");
            IMessageListComponent c = TranslatePlugin.m131110c(this.f87247a);
            List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> b = C33386b.m129361b(collection);
            Intrinsics.checkExpressionValueIsNotNull(b, "MessagePatchProvidersFac…anslatePatch(messageList)");
            c.mo123316a((List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>>) b);
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w.AbstractC33135a
        /* renamed from: a */
        public List<AbstractC34006a> mo122322a(Collection<String> collection, int i) {
            Intrinsics.checkParameterIsNotNull(collection, "ids");
            return new ArrayList(TranslatePlugin.m131110c(this.f87247a).mo123303a(collection));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\u0010\u0000\u001a\u00020\u00012(\u0010\u0002\u001a$\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "tasks", "", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "kotlin.jvm.PlatformType", "", "execute"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.v$a */
    static final class C33856a<T> implements AndroidThrottle.AbstractC26233e<AbstractC34006a> {

        /* renamed from: a */
        final /* synthetic */ TranslatePlugin f87243a;

        C33856a(TranslatePlugin vVar) {
            this.f87243a = vVar;
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
        public final void execute(Collection<AbstractC34006a> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "tasks");
            this.f87243a.mo123888a(collection);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Chat m131108a(TranslatePlugin vVar) {
        Chat chat = vVar.f87239d;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCurrentChat");
        }
        return chat;
    }

    /* renamed from: b */
    public static final /* synthetic */ C33111af m131109b(TranslatePlugin vVar) {
        C33111af afVar = vVar.f87236a;
        if (afVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateMenuHandler");
        }
        return afVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ IMessageListComponent m131110c(TranslatePlugin vVar) {
        IMessageListComponent iMessageListComponent = vVar.f87238c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    /* renamed from: d */
    public static final /* synthetic */ C33103ae m131111d(TranslatePlugin vVar) {
        C33103ae aeVar = vVar.f87237b;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateModelHandler");
        }
        return aeVar;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler.ITranslatePushListener
    /* renamed from: a */
    public void mo123111a(PushImageTranslationInfo pushImageTranslationInfo) {
        Intrinsics.checkParameterIsNotNull(pushImageTranslationInfo, "info");
        C33103ae aeVar = this.f87237b;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateModelHandler");
        }
        aeVar.handlePushImageTranslationInfo(pushImageTranslationInfo);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler.ITranslatePushListener
    /* renamed from: a */
    public void mo123112a(C36874a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "translateState");
        C33103ae aeVar = this.f87237b;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateModelHandler");
        }
        aeVar.handlePushTranslateState(aVar, new C33861f(this));
    }

    /* renamed from: a */
    public final void mo123888a(Collection<? extends AbstractC34006a> collection) {
        IMessageListComponent iMessageListComponent = this.f87238c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> b = C33386b.m129361b(collection);
        Intrinsics.checkExpressionValueIsNotNull(b, "MessagePatchProvidersFac…nslatePatch(messageInfos)");
        iMessageListComponent.mo123316a((List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>>) b);
    }

    /* renamed from: a */
    public final void mo123889a(List<? extends ChatMessageVO<?>> list) {
        IMessageListComponent iMessageListComponent = this.f87238c;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        iMessageListComponent.mo123315a(new RunnableC33863g(this, list));
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        Chat chat = bVar.f90956f;
        Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
        this.f87239d = chat;
        Context i = mo122128i();
        if (i != null) {
            C33103ae from = C33103ae.from((FragmentActivity) i);
            Intrinsics.checkExpressionValueIsNotNull(from, "TranslateModelHandler.fr…text as FragmentActivity)");
            this.f87237b = from;
            Context i2 = mo122128i();
            if (i2 != null) {
                this.f87236a = new C33111af((FragmentActivity) i2);
                IMessageListComponent iMessageListComponent = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
                this.f87238c = iMessageListComponent;
                if (iMessageListComponent == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
                }
                iMessageListComponent.mo121971a(new C33857b(this));
                IMessageListComponent iMessageListComponent2 = this.f87238c;
                if (iMessageListComponent2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
                }
                iMessageListComponent2.mo123313a(new C33858c(this));
                IMessageListComponent iMessageListComponent3 = this.f87238c;
                if (iMessageListComponent3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
                }
                iMessageListComponent3.mo123312a(new C33859d(this));
                C33103ae aeVar = this.f87237b;
                if (aeVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTranslateModelHandler");
                }
                aeVar.setInitData(bVar.f90955e, new C33860e(this));
                this.f87242g.mo123055a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatTranslatePushHandler.ITranslatePushListener
    /* renamed from: a */
    public void mo123113a(String str, List<String> list, Integer num, Map<String, Integer> map, Map<String, Integer> map2) {
        C33103ae aeVar = this.f87237b;
        if (aeVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTranslateModelHandler");
        }
        if (aeVar.handlePushTranslateSettingV2(str, list, num, map, map2)) {
            IMessageListComponent iMessageListComponent = this.f87238c;
            if (iMessageListComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
            }
            mo123889a((List<? extends ChatMessageVO<?>>) iMessageListComponent.mo123326j());
        }
    }
}
