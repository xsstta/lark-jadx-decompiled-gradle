package com.ss.android.lark.chat.chatwindow.chat.v2.component.message;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.ICallback;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.AndroidThrottle;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.api.service.IMessageService;
import com.ss.android.lark.chat.api.service.p1600b.C32821b;
import com.ss.android.lark.chat.api.service.p1600b.C32835d;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.api.service.track.AbstractC32909d;
import com.ss.android.lark.chat.api.service.track.C32911g;
import com.ss.android.lark.chat.api.service.track.ChatMsgTrackSource;
import com.ss.android.lark.chat.api.service.track.IMessageSource;
import com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker;
import com.ss.android.lark.chat.api.service.track.sample.SampleConfigParser;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import com.ss.android.lark.chat.chatwindow.chat.C33235f;
import com.ss.android.lark.chat.chatwindow.chat.MessageReader;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ChatTextLayoutPreCalculator;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.ITextLayoutPreCalculateLifeCycle;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33220b;
import com.ss.android.lark.chat.chatwindow.chat.data.p1620a.C33223m;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.ChatReplyDigestCreator;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.IReplyService;
import com.ss.android.lark.chat.chatwindow.chat.data.reply.ReplyService;
import com.ss.android.lark.chat.chatwindow.chat.model.C33384a;
import com.ss.android.lark.chat.chatwindow.chat.model.C33400c;
import com.ss.android.lark.chat.chatwindow.chat.model.C33407d;
import com.ss.android.lark.chat.chatwindow.chat.model.C33408e;
import com.ss.android.lark.chat.chatwindow.chat.model.C33410f;
import com.ss.android.lark.chat.chatwindow.chat.model.C33411g;
import com.ss.android.lark.chat.chatwindow.chat.model.C33412h;
import com.ss.android.lark.chat.chatwindow.chat.model.C33413i;
import com.ss.android.lark.chat.chatwindow.chat.model.ChatPageData;
import com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader;
import com.ss.android.lark.chat.chatwindow.chat.model.URLAsyncMeasureInterceptor;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33385a;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33394c;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33396e;
import com.ss.android.lark.chat.chatwindow.chat.model.p1637c.C33405c;
import com.ss.android.lark.chat.chatwindow.chat.model.push.PersonalSignGetUrlPreviewBuffer;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.C33201b;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33213c;
import com.ss.android.lark.chat.chatwindow.chat.p1616c.p1619c.C33215e;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.filter.MessageSenderFilter;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.filter.MessageSenderListFilter;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.filter.PinSenderFilter;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.filter.ReactionFilter;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.AliasNameUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.AvatarUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.MessageSenderUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.NickNameUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.PersonalSignUrlPreViewUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.operation.PreviewUpdater;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1638a.C33427a;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i;
import com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33466o;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatDingPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatPreviewPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatReactionPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatSettingPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatStickerPushHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.IStreamProvider;
import com.ss.android.lark.chat.chatwindow.secretchat.data.SecretChatTextLayoutPreCalculator;
import com.ss.android.lark.chat.chatwindow.secretchat.data.convert.SecretChatDataMapper;
import com.ss.android.lark.chat.chatwindow.secretchat.data.reply.SecretChatReplyDigestCreator;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.AbstractExecutorC33962g;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.core.model.C33963h;
import com.ss.android.lark.chat.core.model.ChannelDataFetcherStrategy;
import com.ss.android.lark.chat.core.model.MessageFetchScene;
import com.ss.android.lark.chat.core.model.ObservableMappedArrayList;
import com.ss.android.lark.chat.core.model.PageLoader;
import com.ss.android.lark.chat.core.model.SerialExecutor;
import com.ss.android.lark.chat.core.model.entity.ChatMessageResponse;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.favorite.FavoriteMessageInfo;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FileState;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.preview.UrlPreviewEntity;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.preview.entity.UrlPreViewEntries;
import com.ss.android.lark.chat.service.AbstractC34295j;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.service.impl.AbstractC34231l;
import com.ss.android.lark.chat.service.impl.C34218i;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.chat.utils.C34339g;
import com.ss.android.lark.chat.utils.C34352r;
import com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.Stream;
import com.ss.android.lark.chatbase.p1688b.AbstractC34427a;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35221d;
import com.ss.android.lark.chatwindow.p1720a.p1722b.AbstractC35227d;
import com.ss.android.lark.chatwindow.p1720a.p1722b.C35222a;
import com.ss.android.lark.chatwindow.p1723b.C35234b;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36501o;
import com.ss.android.lark.dependency.IStickerDependency;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.group.ChatChatterKickInfo;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p2392o.AbstractC48698d;
import com.ss.android.lark.statistics.chat.C54948d;
import com.ss.android.lark.statistics.chat.ChatHitPoint;
import com.ss.android.lark.utils.C57881t;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.apache.commons.codec.p3491a.C69743a;
import org.apache.commons.codec.p3492b.C69745a;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g */
public final class MessageListViewModel extends AbstractC1142af implements ChatPreviewPushHandler.IPreviewPushListener, IStreamProvider, IMessageListPushListener {
    public static final Companion Companion = new Companion(null);
    private final String chatId;
    private final C1177w<String> closePageInfo = new C1177w<>();
    private final C1177w<Chat> currentChat;
    public C33400c dataStore;
    private boolean destroyed;
    private final C1177w<String> dialogInfo = new C1177w<>();
    private final Lazy isEnableRichTextInput$delegate;
    private C32920b mActionDispatcher;
    public AbstractExecutorC33962g mBackgroundExecutor;
    private final CallbackManager mCallbackManager;
    public C25969c mCancelableExecutor;
    private C33454i mChatRelationPushHandler;
    public final C32821b mChatService;
    private AbstractC48698d mConnectionStateListener;
    public C33955c<?, ?> mDataListPipeline;
    private WeakReference<IMessageListComponent.MessageListComponentDependency> mDependencyRefs;
    private boolean mDissolveGroupByLocalFlag;
    private final C34218i mDraftService;
    public C33408e mExtraItemInterceptor;
    private AbstractC34427a<MessageInfo, ?> mFirstScreenLoader;
    private final Set<String> mImmediatePushWhiteList;
    public AbstractExecutorC33962g mMessageHandlerExecutor;
    private MessageReader mMessageReader;
    public MessageResourceLoader mMessageResourceLoader;
    public final IInnerMessageService mMessageService;
    private AndroidThrottle<MessageInfo> mMessageUpdateThrottle;
    private final C33608ac mOnDataChangeListener2;
    private boolean mQuitGroupBySelf;
    private final Lazy mReplyService$delegate;
    private IStickerDependency mStickerService;
    private final C33235f mUIModel;
    private final com.ss.android.lark.dependency.al mUserSettingService;
    private final C1177w<List<ChatMessageVO<?>>> messageList = new C1177w<>();
    private final C1177w<Boolean> needRelocateMessage = new C1177w<>();
    private final C1177w<List<MessageInfo>> newMessageItems = new C1177w<>();
    private final C1177w<ChatChatter> p2pChatterLiveData;
    private C33407d pageLoader;
    private final C33466o pushManager = new C33466o();
    private final C1177w<ChatChatter> selfChatterLiveData;
    private final int showPosition;
    private AndroidThrottle<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> signUrlUpdateThrottle;
    public final ITextLayoutPreCalculateLifeCycle textLayoutPreCalculator;
    private final C1177w<String> toastInfo = new C1177w<>();
    public URLAsyncMeasureInterceptor urlAsyncMeasureInterceptor;

    private final IReplyService getMReplyService() {
        return (IReplyService) this.mReplyService$delegate.getValue();
    }

    private final boolean isEnableRichTextInput() {
        return ((Boolean) this.isEnableRichTextInput$delegate.getValue()).booleanValue();
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ae */
    public static final class C33611ae extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {
        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            return aVar;
        }

        C33611ae() {
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$e */
    public static final class C33620e extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {
        C33620e() {
        }

        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
            message.setBurned(true);
            C34438a.m133577a("burn message ", aVar.getMessage());
            return aVar;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$o */
    public static final class RunnableC33634o implements Runnable {

        /* renamed from: a */
        public static final RunnableC33634o f86656a = new RunnableC33634o();

        RunnableC33634o() {
        }

        public final void run() {
            SampleConfigParser.initConfig();
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$q */
    public static final class C33636q implements MessageResourceLoader.IContextDependency {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86658a;

        /* renamed from: b */
        final /* synthetic */ Context f86659b;

        /* renamed from: c */
        final /* synthetic */ Chat f86660c;

        /* renamed from: d */
        final /* synthetic */ ChatChatter f86661d;

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
        /* renamed from: a */
        public Context mo122906a() {
            return this.f86659b;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
        /* renamed from: b */
        public boolean mo122908b() {
            Chat chat = this.f86660c;
            if (chat == null || !chat.isSecret()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
        /* renamed from: c */
        public boolean mo122909c() {
            ChatChatter chatChatter = this.f86661d;
            if (chatChatter == null || chatChatter.getType() != Chatter.ChatterType.BOT) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.MessageResourceLoader.IContextDependency
        /* renamed from: a */
        public void mo122907a(List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> list) {
            Intrinsics.checkParameterIsNotNull(list, "patchList");
            this.f86658a.dataStore.mo127110b((List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>>) list);
        }

        C33636q(MessageListViewModel gVar, Context context, Chat chat, ChatChatter chatChatter) {
            this.f86658a = gVar;
            this.f86659b = context;
            this.f86660c = chat;
            this.f86661d = chatChatter;
        }
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final C1177w<String> getClosePageInfo() {
        return this.closePageInfo;
    }

    public final C1177w<Chat> getCurrentChat() {
        return this.currentChat;
    }

    public final C1177w<String> getDialogInfo() {
        return this.dialogInfo;
    }

    public final C1177w<List<ChatMessageVO<?>>> getMessageList() {
        return this.messageList;
    }

    public final C1177w<Boolean> getNeedRelocateMessage() {
        return this.needRelocateMessage;
    }

    public final C1177w<List<MessageInfo>> getNewMessageItems() {
        return this.newMessageItems;
    }

    public final C1177w<ChatChatter> getP2pChatterLiveData() {
        return this.p2pChatterLiveData;
    }

    public final C1177w<ChatChatter> getSelfChatterLiveData() {
        return this.selfChatterLiveData;
    }

    public final int getShowPosition() {
        return this.showPosition;
    }

    public final C1177w<String> getToastInfo() {
        return this.toastInfo;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ab */
    public static final class C33607ab implements C33408e.AbstractC33409a {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86594a;

        /* renamed from: b */
        final /* synthetic */ Chat f86595b;

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.C33408e.AbstractC33409a
        /* renamed from: a */
        public boolean mo122972a() {
            return this.f86594a.canLoadMore();
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.model.C33408e.AbstractC33409a
        /* renamed from: b */
        public boolean mo122973b() {
            return this.f86595b.isSecret();
        }

        C33607ab(MessageListViewModel gVar, Chat chat) {
            this.f86594a = gVar;
            this.f86595b = chat;
        }
    }

    @Override // androidx.lifecycle.AbstractC1142af
    public void onCleared() {
        super.onCleared();
        destroy();
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ac */
    public static final class C33608ac implements AbstractC34417b.AbstractC34423e<MessageInfo> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86596a;

        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ac$a */
        static final class RunnableC33609a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33608ac f86597a;

            RunnableC33609a(C33608ac acVar) {
                this.f86597a = acVar;
            }

            public final void run() {
                this.f86597a.f86596a.loadPrePage(null);
            }
        }

        @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34423e
        /* renamed from: a */
        public void mo123490a() {
            this.f86596a.mBackgroundExecutor.execute(new RunnableC33609a(this));
        }

        C33608ac(MessageListViewModel gVar) {
            this.f86596a = gVar;
        }

        @Override // com.ss.android.lark.chatbase.AbstractC34417b.AbstractC34423e
        /* renamed from: a */
        public void mo123491a(List<MessageInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "newDataList");
            if (CollectionUtils.isNotEmpty(list)) {
                this.f86596a.getNewMessageItems().mo5926a(list);
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$r */
    public static final class RunnableC33637r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86662a;

        RunnableC33637r(MessageListViewModel gVar) {
            this.f86662a = gVar;
        }

        public final void run() {
            MessageResourceLoader messageResourceLoader = this.f86662a.mMessageResourceLoader;
            if (messageResourceLoader != null) {
                messageResourceLoader.mo122894a(3, null, null);
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$x */
    public static final class C33645x implements PageLoader.AbstractC33950c {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86673a;

        C33645x(MessageListViewModel gVar) {
            this.f86673a = gVar;
        }

        @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
        public final int getPosition() {
            return this.f86673a.dataStore.mo127117f();
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$z */
    public static final class C33647z implements PageLoader.AbstractC33950c {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86675a;

        C33647z(MessageListViewModel gVar) {
            this.f86675a = gVar;
        }

        @Override // com.ss.android.lark.chat.core.model.PageLoader.AbstractC33950c
        public final int getPosition() {
            return this.f86675a.dataStore.mo127115e();
        }
    }

    private final void initMessageSampleConfig() {
        this.mBackgroundExecutor.execute(RunnableC33634o.f86656a);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler.IFilePushListener
    public void onFileDownloadFail() {
        this.toastInfo.mo5926a(UIHelper.getString(R.string.Lark_Legacy_FileDownloadFail));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.IStreamProvider, com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler.IFilePushListener
    public Stream<AbstractC34006a> stream() {
        Stream<AbstractC34006a> k = this.dataStore.mo127124k();
        Intrinsics.checkExpressionValueIsNotNull(k, "dataStore.stream()");
        return k;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$h */
    public static final class C33624h implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86637a;

        /* renamed from: b */
        final /* synthetic */ String f86638b;

        /* renamed from: c */
        final /* synthetic */ Context f86639c;

        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$h$a */
        public static final class RunnableC33625a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33624h f86640a;

            RunnableC33625a(C33624h hVar) {
                this.f86640a = hVar;
            }

            public final void run() {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134520S().mo134704a(this.f86640a.f86639c, false);
            }
        }

        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$h$b */
        public static final class RunnableC33626b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33624h f86641a;

            RunnableC33626b(C33624h hVar) {
                this.f86641a = hVar;
            }

            public final void run() {
                AbstractC36474h b = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                b.mo134520S().mo134704a(this.f86641a.f86639c, true);
            }
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "filePath");
            if (TextUtils.isEmpty(str)) {
                Log.m165389i("ChatWindowLog", "download success, filePath is empty");
                this.f86637a.updateFileStatus(this.f86638b, FileState.DOWNLOAD, null, 0);
            } else if (new File(str).exists()) {
                Log.m165389i("ChatWindowLog", "download success, filePath is:" + str);
                this.f86637a.updateFileStatus(this.f86638b, FileState.DONE, str, 100);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("ChatWindowLog", "onError:" + errorResult);
            if (errorResult.getErrorCode() == 5601) {
                UICallbackExecutor.execute(new RunnableC33625a(this));
            } else if (errorResult.getErrorCode() == 5602) {
                UICallbackExecutor.execute(new RunnableC33626b(this));
            }
        }

        C33624h(MessageListViewModel gVar, String str, Context context) {
            this.f86637a = gVar;
            this.f86638b = str;
            this.f86639c = context;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$t */
    static final class C33639t extends Lambda implements Function0<Boolean> {
        public static final C33639t INSTANCE = new C33639t();

        C33639t() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Boolean, boolean] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // kotlin.jvm.functions.Function0
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke() {
            /*
                r2 = this;
                com.ss.android.lark.dependency.h r0 = com.ss.android.lark.C29990c.m110930b()
                java.lang.String r1 = "ChatModuleInstanceHolder.getDependency()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                com.ss.android.lark.dependency.q r0 = r0.mo134586n()
                java.lang.String r1 = "messenger.message_inputbox_redesign"
                boolean r0 = r0.mo134685a(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.C33639t.invoke():boolean");
        }
    }

    private final void registerConnectionStateChangeListener() {
        this.mConnectionStateListener = new aj(this);
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134585m().mo134482a(this.mConnectionStateListener);
    }

    public final boolean canLoadMore() {
        int i;
        int f = this.dataStore.mo127117f();
        if (f >= 0) {
            Chat b = this.currentChat.mo5927b();
            if (b != null) {
                i = b.getLastVisibleMessagePosition();
            } else {
                i = -1;
            }
            if (f < i) {
                return true;
            }
        }
        return false;
    }

    public final void syncWSReconnect() {
        Log.m165389i("ChatWindowLog", "ws reconnect");
        this.mBackgroundExecutor.execute(new aq(this));
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ad */
    static final class C33610ad extends Lambda implements Function0<ReplyService> {
        final /* synthetic */ Chat $initChat;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33610ad(Chat chat) {
            super(0);
            this.$initChat = chat;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReplyService invoke() {
            if (this.$initChat.isSecret()) {
                return new ReplyService(this.$initChat, new SecretChatReplyDigestCreator());
            }
            return new ReplyService(this.$initChat, new ChatReplyDigestCreator());
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$an */
    public static final class an implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86610a;

        /* renamed from: b */
        final /* synthetic */ Chat f86611b;

        an(MessageListViewModel gVar, Chat chat) {
            this.f86610a = gVar;
            this.f86611b = chat;
        }

        public final void run() {
            String str;
            ChatChatterKickInfo j = C32821b.m126120a().mo121074j(this.f86611b.getId());
            if (j != null) {
                str = j.mo136121a();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                str = UIHelper.getString(R.string.Lark_Legacy_OutOfGroup);
            }
            this.f86610a.getClosePageInfo().mo5926a(str);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$c */
    public static final class SafeRunnable implements Runnable {

        /* renamed from: a */
        private final WeakReference<MessageListViewModel> f86625a;

        /* renamed from: b */
        private final MessageInfo f86626b;

        /* renamed from: c */
        private final ErrorResult f86627c;

        public void run() {
            MessageListViewModel gVar = this.f86625a.get();
            if (gVar != null) {
                Message message = this.f86626b.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                message.setSendStatus(SendStatus.FAIL);
                gVar.handleLocalMessageUpdate(this.f86626b);
                gVar.handleSendMessageFailError(this.f86627c);
            }
        }

        public SafeRunnable(MessageListViewModel gVar, MessageInfo messageInfo, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(gVar, "model");
            Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            this.f86626b = messageInfo;
            this.f86627c = errorResult;
            this.f86625a = new WeakReference<>(gVar);
        }
    }

    private final void checkToClearBadge() {
        Chat b = this.currentChat.mo5927b();
        if (b != null) {
            Channel channel = new Channel(Channel.Type.CHAT, this.chatId);
            AbstractC35227d a = C35222a.m137559a().mo129686a(b);
            Intrinsics.checkExpressionValueIsNotNull(b, "it");
            a.mo129687a(channel, b.getLastMessagePosition(), b.getLastMessagePositionBadgeCount(), b.isSuper());
        }
    }

    private final synchronized AndroidThrottle<MessageInfo> getMsgUpdateThrottle() {
        if (this.mMessageUpdateThrottle == null) {
            this.mMessageUpdateThrottle = new AndroidThrottle.C26229a().mo93309a(300L).mo93308a(2).mo93310a(CoreThreadPool.getNonblockingHandler()).mo93311a(new C33405c()).mo93312a(new C33629k(this)).mo93313a();
        }
        return this.mMessageUpdateThrottle;
    }

    private final void handleQuitOnCallGroup() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        String a = N.mo134394a();
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC33632m(this, a));
    }

    private final boolean isURLAsycLayoutEnable() {
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        boolean a = b.mo134586n().mo134685a("messager_url_async_layout");
        Log.m165389i("ChatWindowLog", "url_async_layout FG is " + a);
        return a;
    }

    public final boolean canLoadPre() {
        int e = this.dataStore.mo127115e();
        Chat b = this.currentChat.mo5927b();
        if (b == null) {
            return false;
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "currentChat.value ?: return false");
        if (e <= b.getFirstMessagePosition() + 1 || e <= 0 || e == Integer.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$af */
    public static final class RunnableC33612af implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86598a;

        /* renamed from: b */
        final /* synthetic */ Map f86599b;

        RunnableC33612af(MessageListViewModel gVar, Map map) {
            this.f86598a = gVar;
            this.f86599b = map;
        }

        public final void run() {
            Set keySet;
            Map map = this.f86599b;
            if (!(map == null || (keySet = map.keySet()) == null || !(!keySet.isEmpty()))) {
                Log.m165379d("ChatWindowLog", "push preview " + ((String) new ArrayList(this.f86599b.keySet()).get(0)));
            }
            this.f86598a.dataStore.mo127124k().mo127143a(new Function1<AbstractC34006a, Boolean>(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.RunnableC33612af.C336131 */
                final /* synthetic */ RunnableC33612af this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Boolean invoke(AbstractC34006a aVar) {
                    return Boolean.valueOf(invoke(aVar));
                }

                public final boolean invoke(AbstractC34006a aVar) {
                    Set keySet;
                    StringBuilder sb = new StringBuilder();
                    sb.append("local message ");
                    Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
                    sb.append(aVar.getId());
                    Log.m165379d("ChatWindowLog", sb.toString());
                    Map map = this.this$0.f86599b;
                    if (map == null || (keySet = map.keySet()) == null) {
                        return false;
                    }
                    return keySet.contains(aVar.getId());
                }
            }).mo127146b(new PreviewUpdater(this.f86599b));
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$aq */
    public static final class aq implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86615a;

        aq(MessageListViewModel gVar) {
            this.f86615a = gVar;
        }

        public final void run() {
            for (int i = 0; i <= 2; i++) {
                Map<String, Chat> c = this.f86615a.mChatService.mo121046c(CollectionsKt.listOf(this.f86615a.getChatId()));
                Intrinsics.checkExpressionValueIsNotNull(c, "mChatService.syncGetChat…dsFromNet(listOf(chatId))");
                Chat chat = c.get(this.f86615a.getChatId());
                if (chat != null) {
                    this.f86615a.onPushChat(chat);
                    Log.m165389i("ChatWindowLog", "latest chat: " + chat);
                    return;
                }
                Log.m165383e("ChatWindowLog", "cannot fetch chat when syncWSReconnect, times: " + i);
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$m */
    public static final class RunnableC33632m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86653a;

        /* renamed from: b */
        final /* synthetic */ String f86654b;

        RunnableC33632m(MessageListViewModel gVar, String str) {
            this.f86653a = gVar;
            this.f86654b = str;
        }

        public final void run() {
            String str;
            String str2;
            ChatChatter a = C32835d.m126323c().m126324c(this.f86653a.getChatId(), this.f86654b);
            Intrinsics.checkExpressionValueIsNotNull(a, "chatter");
            int onCallRole = a.getOnCallRole();
            if (onCallRole == 4 || onCallRole == 5 || onCallRole == 6) {
                Chat b = this.f86653a.getCurrentChat().mo5927b();
                if (b == null || (str2 = b.getName()) == null) {
                    str2 = "";
                }
                str = UIHelper.mustacheFormat((int) R.string.Lark_HelpDesk_EndedServiceTipforAgent, "name", str2);
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_OutOfGroup);
            }
            this.f86653a.getClosePageInfo().mo5926a(str);
        }
    }

    public final void destroy() {
        if (!this.destroyed) {
            this.pushManager.mo123119b();
            this.mCallbackManager.cancelCallbacks();
            C25969c cVar = this.mCancelableExecutor;
            if (cVar != null) {
                cVar.mo92349b();
            }
            C32920b bVar = this.mActionDispatcher;
            if (bVar != null) {
                bVar.unregisterActionHandler(this.dataStore);
            }
            AbstractExecutorC33962g gVar = this.mBackgroundExecutor;
            if (gVar != null) {
                gVar.mo124077c();
            }
            AbstractExecutorC33962g gVar2 = this.mMessageHandlerExecutor;
            if (gVar2 != null) {
                gVar2.mo124077c();
            }
            MessageResourceLoader messageResourceLoader = this.mMessageResourceLoader;
            if (messageResourceLoader != null) {
                messageResourceLoader.mo122896b();
            }
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134585m().mo134483b(this.mConnectionStateListener);
            C32911g.m126697d(this.chatId).mo121415a();
            MsgSampleIssueTracker.f84545b.mo121484a(this.chatId).mo121415a();
            this.mMessageReader.mo122611a();
            checkToClearBadge();
            this.destroyed = true;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$l */
    public static final class RunnableC33630l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86648a;

        /* renamed from: b */
        final /* synthetic */ Collection f86649b;

        RunnableC33630l(MessageListViewModel gVar, Collection collection) {
            this.f86648a = gVar;
            this.f86649b = collection;
        }

        public final void run() {
            List a = this.f86648a.dataStore.mo127100a(this.f86649b);
            Intrinsics.checkExpressionValueIsNotNull(a, "dataStore.getDatasByIds(messageIds)");
            List list = a;
            if (!list.isEmpty()) {
                Log.m165389i("ChatWindowLog", "last message of the chat is " + ((MessageInfo) CollectionsKt.lastOrNull(a)));
                Log.m165389i("ChatWindowLog", "handleMessageRead found items:" + this.f86649b.size() + "/" + a.size());
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    MessageInfo messageInfo = (MessageInfo) a.get(i);
                    Message message = messageInfo.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                    if (!message.isPreMessage()) {
                        arrayList.add(messageInfo);
                        if (message.isDing() && !message.isFromMe()) {
                            arrayList2.add(message.getId());
                        }
                    }
                }
                CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
                coreThreadPool.getFixedThreadPool().execute(new Runnable(this) {
                    /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.RunnableC33630l.RunnableC336311 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC33630l f86650a;

                    {
                        this.f86650a = r1;
                    }

                    public final void run() {
                        this.f86650a.f86648a.readMessageInner(new ArrayList(arrayList));
                        MessageResourceLoader messageResourceLoader = this.f86650a.f86648a.mMessageResourceLoader;
                        if (messageResourceLoader != null) {
                            messageResourceLoader.mo122895a(arrayList);
                        }
                        if (!arrayList2.isEmpty()) {
                            AbstractC36474h b = C29990c.m110930b();
                            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                            b.mo134511J().mo134664a(arrayList2);
                        }
                    }
                });
                return;
            }
            Log.m165383e("ChatWindowLog", "handleMessageRead not found items:" + this.f86649b.size());
        }
    }

    private final void initPushHandler() {
        this.mChatRelationPushHandler = new C33454i(this.chatId, this, new C33635p(this));
        ChatFilePushHandler eVar = new ChatFilePushHandler(this.chatId, this);
        ChatSettingPushHandler jVar = new ChatSettingPushHandler(this.chatId, this);
        ChatDingPushHandler dVar = new ChatDingPushHandler(this.chatId, this);
        ChatStickerPushHandler kVar = new ChatStickerPushHandler(this);
        ChatChatterPushHandler cVar = new ChatChatterPushHandler(this.chatId, this);
        ChatReactionPushHandler hVar = new ChatReactionPushHandler();
        this.pushManager.mo123117a(this.mChatRelationPushHandler).mo123117a(eVar).mo123117a(jVar).mo123117a(dVar).mo123117a(kVar).mo123117a(cVar).mo123117a(hVar).mo123117a(new ChatPreviewPushHandler(this)).mo123118a();
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$u */
    public static final class C33640u implements IGetDataCallback<C33215e<Object>> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86664a;

        /* renamed from: b */
        final /* synthetic */ boolean f86665b;

        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$u$a */
        public static final class RunnableC33641a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33640u f86666a;

            /* renamed from: b */
            final /* synthetic */ C33215e f86667b;

            RunnableC33641a(C33640u uVar, C33215e eVar) {
                this.f86666a = uVar;
                this.f86667b = eVar;
            }

            public final void run() {
                long j;
                String str;
                boolean z;
                PerfLog.end("chat_fetch_first_page_data", "");
                if (!this.f86667b.mo122447c()) {
                    Log.m165383e("ChatWindowLog", "load first page error:" + this.f86667b.mo122446b());
                    this.f86666a.f86664a.textLayoutPreCalculator.mo122457a(true);
                    URLAsyncMeasureInterceptor jVar = this.f86666a.f86664a.urlAsyncMeasureInterceptor;
                    if (jVar != null) {
                        jVar.mo122980a(true);
                    }
                } else if (!this.f86666a.f86664a.dataStore.mo127120h()) {
                    Log.m165397w("ChatWindowLog", "Send msg before data back， abandon result");
                    this.f86666a.f86664a.textLayoutPreCalculator.mo122457a(true);
                    URLAsyncMeasureInterceptor jVar2 = this.f86666a.f86664a.urlAsyncMeasureInterceptor;
                    if (jVar2 != null) {
                        jVar2.mo122980a(true);
                    }
                } else {
                    Object a = this.f86667b.mo122443a();
                    if (a != null) {
                        final ChatMessageResponse chatMessageResponse = (ChatMessageResponse) a;
                        List<MessageInfo> list = chatMessageResponse.messageInfoList;
                        Intrinsics.checkExpressionValueIsNotNull(list, "response.messageInfoList");
                        List<Integer> list2 = chatMessageResponse.invisiblePositions;
                        Intrinsics.checkExpressionValueIsNotNull(list2, "response.invisiblePositions");
                        List<Integer> list3 = chatMessageResponse.missingPositions;
                        Intrinsics.checkExpressionValueIsNotNull(list3, "response.missingPositions");
                        Map<String, Boolean> map = chatMessageResponse.messagesSyncPipeFinished;
                        Intrinsics.checkExpressionValueIsNotNull(map, "response.messagesSyncPipeFinished");
                        this.f86666a.f86664a.dataStore.mo127112c((C33952a) new ChatPageData(list, list2, list3, map));
                        Log.m165379d("ChatWindowLog", "load first page");
                        boolean z2 = false;
                        if (CollectionUtils.isNotEmpty(chatMessageResponse.missingPositions)) {
                            MessageListViewModel gVar = this.f86666a.f86664a;
                            List<Integer> list4 = chatMessageResponse.missingPositions;
                            Intrinsics.checkExpressionValueIsNotNull(list4, "response.missingPositions");
                            gVar.loadMissingData(list4);
                            ChatBundle.ChatType a2 = C34339g.m133165a(this.f86666a.f86664a.getCurrentChat().mo5927b(), this.f86666a.f86664a.getP2pChatterLiveData().mo5927b());
                            Chat b = this.f86666a.f86664a.getCurrentChat().mo5927b();
                            if (b != null) {
                                z = b.isCrossTenant();
                            } else {
                                z = false;
                            }
                            C35212a.m137538a(a2, z, new ErrorResult(6));
                            Log.m165389i("ChatWindowLog", "load first page missing msg");
                        }
                        if (CollectionUtils.isEmpty(chatMessageResponse.messageInfoList)) {
                            C33955c<?, ?> cVar = this.f86666a.f86664a.mDataListPipeline;
                            if (cVar != null) {
                                cVar.mo124066a();
                            }
                            Log.m165383e("ChatWindowLog", "notify message List is empty");
                            Chat chat = chatMessageResponse.chat;
                            if (chat != null) {
                                str = chat.getLastMessageId();
                            } else {
                                str = null;
                            }
                            if (!TextUtils.isEmpty(str)) {
                                ChatBundle.ChatType a3 = C34339g.m133165a(this.f86666a.f86664a.getCurrentChat().mo5927b(), this.f86666a.f86664a.getP2pChatterLiveData().mo5927b());
                                Chat b2 = this.f86666a.f86664a.getCurrentChat().mo5927b();
                                if (b2 != null) {
                                    z2 = b2.isCrossTenant();
                                }
                                C35212a.m137538a(a3, z2, new ErrorResult(7));
                            }
                        }
                        if (this.f86666a.f86665b) {
                            j = 3000;
                        } else {
                            j = 0;
                        }
                        C25969c cVar2 = this.f86666a.f86664a.mCancelableExecutor;
                        if (cVar2 != null) {
                            cVar2.mo92346a(new Runnable(this) {
                                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.C33640u.RunnableC33641a.RunnableC336421 */

                                /* renamed from: a */
                                final /* synthetic */ RunnableC33641a f86668a;

                                {
                                    this.f86668a = r1;
                                }

                                public final void run() {
                                    MessageListViewModel gVar = this.f86668a.f86666a.f86664a;
                                    List<MessageInfo> list = chatMessageResponse.messageInfoList;
                                    Intrinsics.checkExpressionValueIsNotNull(list, "response.messageInfoList");
                                    gVar.reloadFirstScreenData(list);
                                }
                            }, j);
                        }
                        this.f86666a.f86664a.textLayoutPreCalculator.mo122457a(true);
                        URLAsyncMeasureInterceptor jVar3 = this.f86666a.f86664a.urlAsyncMeasureInterceptor;
                        if (jVar3 != null) {
                            jVar3.mo122980a(true);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.core.model.entity.ChatMessageResponse");
                }
            }
        }

        /* renamed from: a */
        public void onSuccess(C33215e<Object> eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "result");
            this.f86664a.mMessageHandlerExecutor.execute(new RunnableC33641a(this, eVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            PerfLog.end("chat_fetch_first_page_data", "");
            Log.m165383e("ChatWindowLog", "load first page error:" + errorResult);
            this.f86664a.textLayoutPreCalculator.mo122457a(true);
            URLAsyncMeasureInterceptor jVar = this.f86664a.urlAsyncMeasureInterceptor;
            if (jVar != null) {
                jVar.mo122980a(true);
            }
        }

        C33640u(MessageListViewModel gVar, boolean z) {
            this.f86664a = gVar;
            this.f86665b = z;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ak */
    public static final class ak implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86605a;

        /* renamed from: b */
        final /* synthetic */ List f86606b;

        ak(MessageListViewModel gVar, List list) {
            this.f86605a = gVar;
            this.f86606b = list;
        }

        public final void run() {
            boolean z;
            MessageFetchScene messageFetchScene;
            List<MessageInfo> list;
            Map<String, Chat> c = this.f86605a.mChatService.mo121046c(CollectionsKt.listOf(this.f86605a.getChatId()));
            Intrinsics.checkExpressionValueIsNotNull(c, "mChatService.syncGetChat…dsFromNet(listOf(chatId))");
            Boolean bool = null;
            Chat chat = (c == null || !c.containsKey(this.f86605a.getChatId())) ? null : c.get(this.f86605a.getChatId());
            if (chat == null || !chat.isSuper()) {
                z = false;
            } else {
                this.f86605a.onPushChat(chat);
                z = true;
            }
            if (this.f86605a.getShowPosition() >= 0) {
                messageFetchScene = MessageFetchScene.SPECIFIED_POSITION;
            } else {
                messageFetchScene = MessageFetchScene.FIRST_SCREEN;
            }
            ChatMessageResponse a = this.f86605a.mMessageService.mo121079a(this.f86605a.getChatId(), messageFetchScene, this.f86605a.getShowPosition(), 15, 5, 30, true, ChannelDataFetcherStrategy.SYNC_SERVER_DATA, "");
            if (a == null) {
                Log.m165383e("ChatWindowLog", "reload first screen data failed");
                return;
            }
            List<MessageInfo> list2 = a.messageInfoList;
            Intrinsics.checkExpressionValueIsNotNull(list2, "response!!.messageInfoList");
            HashSet hashSet = new HashSet();
            for (MessageInfo messageInfo : this.f86606b) {
                Message message = messageInfo.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                hashSet.add(Integer.valueOf(message.getPosition()));
            }
            if (CollectionUtils.isNotEmpty(list2)) {
                this.f86605a.onPushMessage(list2, false);
                for (MessageInfo messageInfo2 : list2) {
                    Message message2 = messageInfo2.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                    hashSet.remove(Integer.valueOf(message2.getPosition()));
                }
            }
            HashSet hashSet2 = hashSet;
            if (!CollectionUtils.isEmpty(hashSet2)) {
                ChatMessageResponse a2 = this.f86605a.mMessageService.mo121247a(this.f86605a.getChatId(), new ArrayList(hashSet2));
                if ((a2 != null ? a2.messageInfoList : null) != null) {
                    if (!(a2 == null || (list = a2.messageInfoList) == null)) {
                        bool = Boolean.valueOf(!list.isEmpty());
                    }
                    if (bool.booleanValue()) {
                        MessageListViewModel gVar = this.f86605a;
                        List<MessageInfo> list3 = a2.messageInfoList;
                        Intrinsics.checkExpressionValueIsNotNull(list3, "response.messageInfoList");
                        gVar.onPushMessage(list3, false);
                    }
                }
                if (!(chat == null || z)) {
                    this.f86605a.onPushChat(chat);
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatSettingPushHandler.ISettingPushListener
    public void updateDissolveGroupLocalFlag(boolean z) {
        this.mDissolveGroupByLocalFlag = true;
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$d */
    public static final class C33618d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86628a;

        /* renamed from: b */
        final /* synthetic */ Message f86629b;

        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$d$a */
        public static final class C33619a extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

            /* renamed from: a */
            final /* synthetic */ boolean f86630a;

            C33619a(boolean z) {
                this.f86630a = z;
            }

            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
                Content content = aVar.getMessage().getContent();
                if (content != null) {
                    ((StickerContent) content).setAdded(this.f86630a);
                    return aVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.StickerContent");
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo123511a(bool.booleanValue());
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            C1177w<String> toastInfo = this.f86628a.getToastInfo();
            String displayMsg = errorResult.getDisplayMsg();
            if (displayMsg == null) {
                displayMsg = UIHelper.getString(R.string.Lark_Legacy_AddStickerFail);
            }
            toastInfo.mo5926a(displayMsg);
        }

        /* renamed from: a */
        public void mo123511a(boolean z) {
            this.f86628a.dataStore.mo127105a(this.f86629b.getId(), new C33619a(z));
            this.f86628a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_AddStickerSuccess));
        }

        C33618d(MessageListViewModel gVar, Message message) {
            this.f86628a = gVar;
            this.f86629b = message;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$aa */
    public static final class C33606aa implements IGetDataCallback<AbstractC33964i<MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f86593a;

        C33606aa(IGetDataCallback iGetDataCallback) {
            this.f86593a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
            IGetDataCallback iGetDataCallback = this.f86593a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(null);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f86593a;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ah */
    public static final class C33615ah implements IGetDataCallback<List<? extends FavoriteMessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86602a;

        C33615ah(MessageListViewModel gVar) {
            this.f86602a = gVar;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends FavoriteMessageInfo> list) {
            Intrinsics.checkParameterIsNotNull(list, "list");
            this.f86602a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_ChatViewFavorites));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86602a.getToastInfo().mo5926a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_SaveBoxSaveFail)));
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ai */
    public static final class C33616ai implements IGetDataCallback<Chat> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86603a;

        C33616ai(MessageListViewModel gVar) {
            this.f86603a = gVar;
        }

        /* renamed from: a */
        public void onSuccess(Chat chat) {
            this.f86603a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Group_RevokeSuccess));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86603a.getDialogInfo().mo5926a(errorResult.getDisplayMsg());
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$aj */
    public static final class aj implements AbstractC48698d {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86604a;

        aj(MessageListViewModel gVar) {
            this.f86604a = gVar;
        }

        @Override // com.ss.android.lark.p2392o.AbstractC48698d
        /* renamed from: a */
        public final void mo123499a(boolean z) {
            if (z) {
                this.f86604a.syncWSReconnect();
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$al */
    public static final class al extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86607a;

        al(MessageListViewModel gVar) {
            this.f86607a = gVar;
        }

        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
            if (message.getType() == Message.Type.MEDIA) {
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<MediaContent>()");
                MediaContent mediaContent = (MediaContent) content;
                if (!new File(mediaContent.getOriginPath()).exists()) {
                    this.f86607a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_VideoDeleted));
                    return aVar;
                }
                mediaContent.setFileState(FileState.COMPRESSING);
            }
            message.setUpdateTime(C26279i.m95159b());
            message.setSendStatus(SendStatus.SENDING);
            this.f86607a.retrySendMessageInner((MessageInfo) aVar);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ar */
    public static final class ar extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

        /* renamed from: a */
        final /* synthetic */ int f86616a;

        ar(int i) {
            this.f86616a = i;
        }

        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
            if (message.getType() == Message.Type.FILE) {
                Content content = aVar.getMessage().getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "existedItem.getMessage().getContent<FileContent>()");
                ((FileContent) content).setSaveToDrive(this.f86616a);
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$f */
    public static final class C33621f implements IGetDataCallback<Map<String, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f86631a;

        C33621f(IGetDataCallback iGetDataCallback) {
            this.f86631a = iGetDataCallback;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86631a.onError(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(Map<String, Boolean> map) {
            Intrinsics.checkParameterIsNotNull(map, "chatterIdMap");
            Set<Map.Entry<String, Boolean>> entrySet = map.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Boolean> entry : entrySet) {
                if (entry.getValue().booleanValue()) {
                    arrayList.add(entry.getKey());
                }
            }
            this.f86631a.onSuccess(arrayList);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$n */
    public static final class C33633n implements UserStatusParseUrlPreViewUtils.GetSignUrlPreViewCallBack {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86655a;

        C33633n(MessageListViewModel gVar) {
            this.f86655a = gVar;
        }

        @Override // com.ss.android.lark.chat.utils.UserStatusParseUrlPreViewUtils.GetSignUrlPreViewCallBack
        /* renamed from: a */
        public void mo123524a(List<String> list) {
            if (list != null) {
                List<String> list2 = list;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                for (T t : list2) {
                    linkedHashMap.put(t, t);
                }
                this.f86655a.dataStore.mo127124k().mo127143a(new MessageSenderListFilter(linkedHashMap)).mo127146b(new PersonalSignUrlPreViewUpdater(null));
            }
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$s */
    public static final class C33638s implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86663a;

        C33638s(MessageListViewModel gVar) {
            this.f86663a = gVar;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f86663a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Group_RevokeExpireToast));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86663a.getDialogInfo().mo5926a(errorResult.getDisplayMsg());
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$w */
    public static final class C33644w implements IGetDataCallback<AbstractC33964i<MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f86672a;

        C33644w(IGetDataCallback iGetDataCallback) {
            this.f86672a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "messageInfos");
            this.f86672a.onSuccess(null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            this.f86672a.onError(errorResult);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$y */
    public static final class C33646y implements IGetDataCallback<AbstractC33964i<MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f86674a;

        C33646y(IGetDataCallback iGetDataCallback) {
            this.f86674a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "messageInfos");
            this.f86674a.onSuccess(null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            this.f86674a.onError(errorResult);
        }
    }

    public final void handleUpdateMsg(Collection<? extends MessageInfo> collection) {
        this.dataStore.mo127109b((Collection<AbstractC34006a>) collection);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ao */
    public static final class ao<T> implements AndroidThrottle.AbstractC26233e<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86612a;

        ao(MessageListViewModel gVar) {
            this.f86612a = gVar;
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
        public final void execute(Collection<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "it");
            this.f86612a.handleSignUrlRequest(collection);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ap */
    public static final class ap implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86613a;

        /* renamed from: b */
        final /* synthetic */ String f86614b;

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f86613a.updateFileStatus(this.f86614b, FileState.DOWNLOAD, null, 0);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("ChatWindowLog", "cancel download failed:" + errorResult);
        }

        ap(MessageListViewModel gVar, String str) {
            this.f86613a = gVar;
            this.f86614b = str;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$k */
    public static final class C33629k<T> implements AndroidThrottle.AbstractC26233e<MessageInfo> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86647a;

        C33629k(MessageListViewModel gVar) {
            this.f86647a = gVar;
        }

        @Override // com.larksuite.framework.utils.AndroidThrottle.AbstractC26233e
        public final void execute(Collection<MessageInfo> collection) {
            Intrinsics.checkParameterIsNotNull(collection, "it");
            this.f86647a.handleUpdateMsg(collection);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$p */
    public static final class C33635p implements C33454i.AbstractC33458a {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86657a;

        C33635p(MessageListViewModel gVar) {
            this.f86657a = gVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33458a
        public final MessageInfo getMessageById(String str) {
            return (MessageInfo) this.f86657a.dataStore.mo127099a(str);
        }
    }

    private final void handleMessageRead(Collection<String> collection) {
        this.mMessageHandlerExecutor.execute(new RunnableC33630l(this, collection));
    }

    public final void batchUpdateMsg(List<? extends AbstractC34417b.AbstractC34426h<String, AbstractC34006a>> list) {
        Intrinsics.checkParameterIsNotNull(list, "patchProviderList");
        this.dataStore.mo127110b((List<AbstractC34417b.AbstractC34426h<String, AbstractC34006a>>) list);
    }

    public final void cancelUploadMediaMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cId");
        this.mMessageService.mo121109c(str);
    }

    public final void executeMessage(Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(runnable, "runnable");
        this.mMessageHandlerExecutor.execute(runnable);
    }

    public final MessageInfo getMessageInfoById(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        return (MessageInfo) this.dataStore.mo127099a(str);
    }

    public final void handleShowMoreTextClick(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        this.mUIModel.mo122565a(str, false);
    }

    public final void handleSignUrlRequest(Collection<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> collection) {
        UserStatusParseUrlPreViewUtils.f88765a.mo126952a(collection, new C33633n(this));
    }

    public final void notifyMessageChange(String str) {
        this.dataStore.mo127105a(str, new C33611ae());
    }

    public final void onAuditedFailed(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        this.dialogInfo.mo5926a(str);
    }

    public final void registerImmediateMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        this.mImmediatePushWhiteList.add(str);
    }

    public final void reloadFirstScreenData(List<? extends MessageInfo> list) {
        this.mBackgroundExecutor.execute(new ak(this, list));
    }

    public final void setScreenItemProvider(C33400c.AbstractC33402a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        this.dataStore.mo122935a(aVar);
    }

    public final void toggleItemShowTime(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        this.mUIModel.mo122569d(str);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$ag */
    public static final class C33614ag implements IGetDataCallback<Map<String, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86600a;

        /* renamed from: b */
        final /* synthetic */ String f86601b;

        /* renamed from: a */
        public void onSuccess(Map<String, String> map) {
            AppreciablePerformance.f104480a.mo147944b(this.f86601b);
            this.f86600a.dataStore.mo127105a(this.f86601b, new C33385a(AudioContent.AudioState.DONE_OPEN));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            AppreciablePerformance.f104480a.mo147937a(1);
            this.f86600a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Video_CantDownloadTryAgain));
            this.f86600a.dataStore.mo127105a(this.f86601b, new C33385a(AudioContent.AudioState.DOWNLOAD));
        }

        C33614ag(MessageListViewModel gVar, String str) {
            this.f86600a = gVar;
            this.f86601b = str;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$b */
    public static final class MediaMessageResendCallback implements IGetDataCallback<String>, AbstractC34231l, AbstractC34295j {

        /* renamed from: a */
        private final WeakReference<IGetDataCallback<String>> f86622a;

        /* renamed from: b */
        private final WeakReference<MessageListViewModel> f86623b;

        /* renamed from: c */
        private final MessageInfo f86624c;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "messageId");
            IGetDataCallback<String> iGetDataCallback = this.f86622a.get();
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(str);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback<String> iGetDataCallback = this.f86622a.get();
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        @Override // com.ss.android.lark.chat.service.AbstractC34295j
        /* renamed from: a */
        public void mo121315a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            MessageListViewModel gVar = this.f86623b.get();
            if (gVar != null) {
                this.f86624c.setMessage(message);
                String id = message.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "message.id");
                gVar.notifyMessageChange(id);
            }
        }

        @Override // com.ss.android.lark.chat.service.impl.AbstractC34231l
        /* renamed from: b */
        public void mo121318b(Message message) {
            C33400c cVar;
            Intrinsics.checkParameterIsNotNull(message, "message");
            MessageListViewModel gVar = this.f86623b.get();
            if (gVar != null && (cVar = gVar.dataStore) != null) {
                cVar.mo127102a(new C33410f(message), new C33394c(message));
            }
        }

        public MediaMessageResendCallback(MessageInfo messageInfo, IGetDataCallback<String> iGetDataCallback, MessageListViewModel gVar) {
            Intrinsics.checkParameterIsNotNull(messageInfo, "mMessageInfo");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            Intrinsics.checkParameterIsNotNull(gVar, "model");
            this.f86624c = messageInfo;
            this.f86622a = new WeakReference<>(iGetDataCallback);
            this.f86623b = new WeakReference<>(gVar);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$g */
    public static final class C33622g implements IGetDataCallback<List<? extends IMessageService.C32815a>> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86632a;

        /* renamed from: b */
        final /* synthetic */ String f86633b;

        /* renamed from: c */
        final /* synthetic */ MessageUrlPreview f86634c;

        /* renamed from: a */
        public void onSuccess(List<? extends IMessageService.C32815a> list) {
            Intrinsics.checkParameterIsNotNull(list, "urlPreviews");
            this.f86632a.dataStore.mo127105a(this.f86633b, new C33623a(this, list));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86632a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_HidePreviewFailed));
        }

        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$g$a */
        public static final class C33623a extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

            /* renamed from: a */
            final /* synthetic */ C33622g f86635a;

            /* renamed from: b */
            final /* synthetic */ List f86636b;

            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
                if (!CollectionUtils.isEmpty(this.f86636b)) {
                    for (IMessageService.C32815a aVar2 : this.f86636b) {
                        String a = aVar2.mo121112a();
                        MessageUrlPreview messageUrlPreview = this.f86635a.f86634c;
                        if (messageUrlPreview == null) {
                            Intrinsics.throwNpe();
                        }
                        if (Intrinsics.areEqual(a, messageUrlPreview.getMessageId()) && aVar2.mo121113b() == this.f86635a.f86634c.getSequenceId()) {
                            this.f86635a.f86634c.setDeleted(true);
                        }
                    }
                } else {
                    MessageUrlPreview messageUrlPreview2 = this.f86635a.f86634c;
                    if (messageUrlPreview2 == null) {
                        Intrinsics.throwNpe();
                    }
                    messageUrlPreview2.setDeleted(true);
                }
                return aVar;
            }

            C33623a(C33622g gVar, List list) {
                this.f86635a = gVar;
                this.f86636b = list;
            }
        }

        C33622g(MessageListViewModel gVar, String str, MessageUrlPreview messageUrlPreview) {
            this.f86632a = gVar;
            this.f86633b = str;
            this.f86634c = messageUrlPreview;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$j */
    public static final class C33628j implements IGetDataCallback<AbstractC33964i<MessageInfo>> {

        /* renamed from: a */
        final /* synthetic */ int f86644a;

        /* renamed from: b */
        final /* synthetic */ MessageListViewModel f86645b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f86646c;

        /* renamed from: a */
        public void onSuccess(AbstractC33964i<MessageInfo> iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "messageInfos");
            this.f86646c.onSuccess(Integer.valueOf(this.f86644a));
            Log.m165389i("ChatWindowLog", "reload msg before send success");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86646c.onError(errorResult);
            Log.m165383e("ChatWindowLog", "reload msg before send failed:" + errorResult);
        }

        C33628j(int i, MessageListViewModel gVar, IGetDataCallback iGetDataCallback) {
            this.f86644a = i;
            this.f86645b = gVar;
            this.f86646c = iGetDataCallback;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$v */
    public static final class C33643v implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86670a;

        /* renamed from: b */
        final /* synthetic */ long f86671b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            if (SystemClock.elapsedRealtime() - this.f86671b < ((long) 1000)) {
                this.f86670a.getNeedRelocateMessage().mo5926a((Boolean) true);
            }
        }

        C33643v(MessageListViewModel gVar, long j) {
            this.f86670a = gVar;
            this.f86671b = j;
        }
    }

    private final boolean needToReloadMessageBeforeSend(Chat chat) {
        if (!this.dataStore.mo127122i() || chat.getLastMessagePosition() <= this.dataStore.mo127117f()) {
            return false;
        }
        return true;
    }

    private final void scheduleQuitGroup(Chat chat) {
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new an(this, chat));
    }

    public final void burnMsg(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        this.dataStore.mo127105a(str, new C33620e());
    }

    public final boolean containsPosition(int i) {
        if (this.dataStore.mo127117f() < i || this.dataStore.mo127115e() > i) {
            return false;
        }
        return true;
    }

    public final List<MessageInfo> getMessageInfoByIds(Collection<String> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "msgIds");
        List<MessageInfo> a = this.dataStore.mo127100a(collection);
        Intrinsics.checkExpressionValueIsNotNull(a, "dataStore.getDatasByIds(msgIds)");
        return a;
    }

    public final void handleLocalMessageUpdate(MessageInfo messageInfo) {
        this.dataStore.mo127102a(new C33410f(messageInfo.getMessage()), new C33396e(messageInfo));
    }

    public final void invalidGroupShare(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        this.mChatService.mo121053d(str, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33638s(this)));
    }

    public final void loadMissingData(List<Integer> list) {
        this.mFirstScreenLoader.mo122910a(list, new C33643v(this, SystemClock.elapsedRealtime()));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33459b
    public void onPushChat(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        handleChatChange(chat);
        if (chat.isDissolved()) {
            handleQuitGroup(chat);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatDingPushHandler.IDingPushListener
    public void onPushDingMessage(MessageInfo messageInfo) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        ArrayList arrayList = new ArrayList();
        arrayList.add(messageInfo);
        onPushMessage(arrayList, false);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatPreviewPushHandler.IPreviewPushListener
    public void onPushPreview(Map<String, ? extends Map<String, ? extends UrlPreviewEntity>> map) {
        CoreThreadPool.getBackgroundHandler().postDelayed(new RunnableC33612af(this, map), 500);
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatSettingPushHandler.ISettingPushListener
    public void onQuitGroup(boolean z) {
        Log.m165389i("ChatWindowLog", "event Quit Group: " + z);
        this.mQuitGroupBySelf = z;
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatFilePushHandler.IFilePushListener
    public void onSwitchToCellularDataNetwork(boolean z) {
        if (z) {
            this.toastInfo.mo5926a(UIHelper.getString(R.string.Lark_Legacy_SwitchedToMobileNetworkDownloadsupend));
        } else {
            this.toastInfo.mo5926a(UIHelper.getString(R.string.Lark_Legacy_SwitchedToMobileNetwork));
        }
    }

    public final void readMessageInner(List<? extends MessageInfo> list) {
        Chat b = this.currentChat.mo5927b();
        if (b != null) {
            this.mMessageReader.mo122613a(list, b.getReadPosition());
        }
    }

    public final void retrySendMessage(String str) {
        Intrinsics.checkParameterIsNotNull(str, "preMsgId");
        this.dataStore.mo127105a(str, new al(this));
    }

    public final void setActionDispatch(C32920b bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dispatcher");
        this.mActionDispatcher = bVar;
        if (bVar != null) {
            bVar.registerActionListener(this.dataStore);
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$as */
    public static final class as extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

        /* renamed from: a */
        final /* synthetic */ FileState f86617a;

        /* renamed from: b */
        final /* synthetic */ String f86618b;

        /* renamed from: c */
        final /* synthetic */ int f86619c;

        /* renamed from: a */
        public AbstractC34006a mo122917a(AbstractC34006a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
            Content content = aVar.getMessage().getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "existedItem.getMessage().getContent<FileContent>()");
            FileContent fileContent = (FileContent) content;
            FileState fileState = this.f86617a;
            if (fileState != null) {
                fileContent.setFileState(fileState);
            }
            String str = this.f86618b;
            if (str != null) {
                fileContent.setFilePath(str);
            }
            fileContent.setProgress(this.f86619c);
            return aVar;
        }

        as(FileState fileState, String str, int i) {
            this.f86617a = fileState;
            this.f86618b = str;
            this.f86619c = i;
        }
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$at */
    public static final class C33617at implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86620a;

        /* renamed from: b */
        final /* synthetic */ String f86621b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f86620a.updateFileSaveToNutStatus(this.f86621b, 2);
            this.f86620a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
            Log.m165383e("ChatWindowLog", "Failed to save file to drive");
        }

        /* renamed from: a */
        public void onSuccess(String str) {
            if (Intrinsics.areEqual("success", str)) {
                Log.m165389i("ChatWindowLog", "save file success，messageId: " + this.f86621b);
                this.f86620a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_SavedFileToDrive));
                this.f86620a.updateFileSaveToNutStatus(this.f86621b, 0);
                return;
            }
            this.f86620a.updateFileSaveToNutStatus(this.f86621b, 2);
            this.f86620a.getToastInfo().mo5926a(UIHelper.getString(R.string.Lark_Legacy_SaveToDriveFail));
            Log.m165397w("ChatWindowLog", "Failed to save file to drive! result: " + str + "  messageId: " + this.f86621b);
        }

        C33617at(MessageListViewModel gVar, String str) {
            this.f86620a = gVar;
            this.f86621b = str;
        }
    }

    private final void handleChatChange(Chat chat) {
        if (TextUtils.equals(this.chatId, chat.getId())) {
            Log.m165389i("ChatWindowLog", "onPushChat:" + chat);
            this.currentChat.mo5926a(chat);
        }
    }

    private final void handleQuitGroup(Chat chat) {
        if (this.mDissolveGroupByLocalFlag || this.mQuitGroupBySelf) {
            this.closePageInfo.mo5926a("");
        } else if (chat.isOnCall()) {
            handleQuitOnCallGroup();
        } else {
            scheduleQuitGroup(chat);
        }
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134512K().mo134688a(new Channel(Channel.Type.CHAT, this.chatId));
    }

    public final void deleteUrlPreview(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageInfo messageInfoById = getMessageInfoById(str);
        if (messageInfoById != null) {
            MessageUrlPreview a = C34352r.m133224a(messageInfoById);
            C33622g gVar = new C33622g(this, str, a);
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new IMessageService.C32815a(a.getMessageId(), a.getSequenceId()));
                this.mMessageService.mo121270c(arrayList, this.mCallbackManager.wrapAndAddGetDataCallback(gVar));
            }
        }
    }

    public final void ensureLastPageDataLoaded(IGetDataCallback<Integer> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        Chat b = this.currentChat.mo5927b();
        if (b != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "it");
            if (needToReloadMessageBeforeSend(b)) {
                int lastMessagePosition = b.getLastMessagePosition();
                ICallback wrapAndAddCallback = this.mCallbackManager.wrapAndAddCallback(new C33628j(lastMessagePosition, this, iGetDataCallback));
                Intrinsics.checkExpressionValueIsNotNull(wrapAndAddCallback, "mCallbackManager.wrapAnd… }\n                    })");
                tryToLoadSpecificPosition(lastMessagePosition, (IGetDataCallback) wrapAndAddCallback);
            }
        }
    }

    public final void loadFirstPage(boolean z) {
        C33640u uVar = new C33640u(this, z);
        PerfLog.start("chat_fetch_first_page_data", "");
        C33201b.m128282a().mo122418a(new C33213c(this.chatId, this.showPosition), uVar);
    }

    public final void loadNextPage(IGetDataCallback<Unit> iGetDataCallback) {
        C33644w wVar;
        C33963h hVar = new C33963h(new C33645x(this), 30);
        C33407d dVar = this.pageLoader;
        C33963h hVar2 = hVar;
        C33400c cVar = this.dataStore;
        if (iGetDataCallback == null) {
            wVar = null;
        } else {
            wVar = new C33644w(iGetDataCallback);
        }
        dVar.mo124049b(hVar2, new C33411g(cVar, wVar));
    }

    public final void loadPrePage(IGetDataCallback<Unit> iGetDataCallback) {
        C33646y yVar;
        if (this.dataStore.mo127115e() > 0) {
            C33963h hVar = new C33963h(new C33647z(this), 30);
            C33407d dVar = this.pageLoader;
            C33963h hVar2 = hVar;
            C33400c cVar = this.dataStore;
            if (iGetDataCallback == null) {
                yVar = null;
            } else {
                yVar = new C33646y(iGetDataCallback);
            }
            dVar.mo124051c(hVar2, new C33411g(cVar, yVar));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onUpdateSelfInfo(Chatter chatter) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Stream<AbstractC34006a> k = this.dataStore.mo127124k();
        String id = chatter.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
        Stream<AbstractC34006a> a = k.mo127143a(new MessageSenderFilter(id));
        String avatarKey = chatter.getAvatarKey();
        Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatter.getAvatarKey()");
        a.mo127146b(new AvatarUpdater(avatarKey));
    }

    public final void putMessagesInSaveBox(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "messageIds");
        if (!list.isEmpty()) {
            C33615ah ahVar = new C33615ah(this);
            ChatHitPoint.f135648a.mo187356a(list);
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            b.mo134522U().mo134620a(list, "", (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(ahVar));
        }
    }

    public final void readFileMsg(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        MessageInfo messageInfoById = getMessageInfoById(str);
        if (messageInfoById != null) {
            IInnerMessageService iInnerMessageService = this.mMessageService;
            Message message = messageInfoById.getMessage();
            Chat b = this.currentChat.mo5927b();
            if (b != null) {
                z = b.isSuper();
            } else {
                z = false;
            }
            iInnerMessageService.mo121088a(message, z);
        }
    }

    public final void readMessage(List<? extends AbsMessageVO<?>> list) {
        Intrinsics.checkParameterIsNotNull(list, "intervalMessages");
        HashSet hashSet = new HashSet();
        Iterator<? extends AbsMessageVO<?>> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((AbsMessageVO) it.next()).mo121681a());
        }
        handleMessageRead(hashSet);
    }

    public final void retrySendMessageInner(MessageInfo messageInfo) {
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        this.mMessageService.mo121087a(message, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(wrapResendCallback(messageInfo, new am(this, messageInfo))));
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$am */
    public static final class am implements IGetDataCallback<String> {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86608a;

        /* renamed from: b */
        final /* synthetic */ MessageInfo f86609b;

        /* renamed from: a */
        public void onSuccess(String str) {
            Intrinsics.checkParameterIsNotNull(str, "integer");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            if (errorResult.getErrorCode() == 4042) {
                Chat b = this.f86608a.getCurrentChat().mo5927b();
                if (b != null) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "currentChat.value ?: return");
                    this.f86608a.getToastInfo().mo5926a(UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", b.getName()));
                } else {
                    return;
                }
            }
            UICallbackExecutor.executeDelayed(new SafeRunnable(this.f86608a, this.f86609b, errorResult), 500);
        }

        am(MessageListViewModel gVar, MessageInfo messageInfo) {
            this.f86608a = gVar;
            this.f86609b = messageInfo;
        }
    }

    public final void handleSendMessageFailError(ErrorResult errorResult) {
        if (errorResult != null) {
            int errorCode = errorResult.getErrorCode();
            if (errorCode == 4042) {
                Chat b = this.currentChat.mo5927b();
                if (b != null) {
                    Intrinsics.checkExpressionValueIsNotNull(b, "currentChat.value ?: return");
                    this.toastInfo.mo5926a(UIHelper.mustacheFormat((int) R.string.Lark_Group_MsgRestriction_SendFail_Content, "group_name", b.getName()));
                }
            } else if (errorCode == 5007) {
                this.toastInfo.mo5926a(errorResult.getDisplayMsg(UIHelper.getString(R.string.Lark_Legacy_MessageTooLargeAlert)));
            } else if (errorCode == 5009 || errorCode == 6003) {
                this.toastInfo.mo5926a(errorResult.getDisplayMsg());
            } else if (errorCode == 321000) {
                AbstractC36474h b2 = C29990c.m110930b();
                Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                this.dialogInfo.mo5926a(errorResult.getDisplayMsg(b2.mo134594v().mo134494a()));
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatPreviewPushHandler.IPreviewPushListener
    public void onPushSignUrlPreview(List<UrlPreViewEntries> list) {
        Intrinsics.checkParameterIsNotNull(list, "entriesList");
        List<UrlPreViewEntries> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String sourceId = it.next().getSourceId();
            if (sourceId == null) {
                sourceId = "";
            }
            arrayList.add(sourceId);
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put((String) obj, obj);
        }
        this.dataStore.mo127124k().mo127143a(new MessageSenderListFilter(linkedHashMap)).mo127146b(new PersonalSignUrlPreViewUpdater(list));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatSettingPushHandler.ISettingPushListener
    public void onSendChatAnnouncement(String str) {
        IMessageSender c;
        Intrinsics.checkParameterIsNotNull(str, "content");
        Log.m165389i("ChatWindowLog", "event Send Chat Announcement: " + this.chatId);
        IMessageListComponent.MessageListComponentDependency gVar = this.mDependencyRefs.get();
        if (gVar != null && (c = gVar.mo123154c()) != null) {
            String string = UIHelper.getString(R.string.Lark_Legacy_Announcement);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Lark_Legacy_Announcement)");
            RichText b = C59029c.m229161b(str);
            Intrinsics.checkExpressionValueIsNotNull(b, "RichTextCreator.generateSimpleRichText(content)");
            c.mo123012a(string, str, b, "", "");
        }
    }

    public final void stopDownloadFile(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        MessageInfo messageInfoById = getMessageInfoById(str);
        if (messageInfoById != null) {
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (message.getType() == Message.Type.FILE) {
                if (messageInfoById == null) {
                    Intrinsics.throwNpe();
                }
                Message message2 = messageInfoById.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo!!.getMessage()");
                Content content = messageInfoById.getMessage().getContent();
                if (content != null) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36501o s = b.mo134591s();
                    String key = ((FileContent) content).getKey();
                    String sourceId = message2.getSourceId();
                    Message.SourceType sourceType = message2.getSourceType();
                    Intrinsics.checkExpressionValueIsNotNull(sourceType, "message.sourceType");
                    s.mo134680a(str, key, sourceId, sourceType.getNumber(), (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new ap(this, str)));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.FileContent");
            }
        }
    }

    public final void addSticker(String str) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageInfo messageInfoById = getMessageInfoById(str);
        if (messageInfoById != null) {
            if (messageInfoById == null) {
                Intrinsics.throwNpe();
            }
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo!!.getMessage()");
            if (message != null && message.getType() == Message.Type.STICKER) {
                Content content = message.getContent();
                if (content != null) {
                    StickerContent stickerContent = (StickerContent) content;
                    if (stickerContent == null) {
                        Log.m165379d("ChatWindowLog", "addSticker2 called. stickerContent is null");
                    } else if (!stickerContent.isPaid()) {
                        this.toastInfo.mo5926a(UIHelper.getString(R.string.Lark_Chat_StickerPackNeedBuy));
                    } else {
                        String key = stickerContent.getKey();
                        ArrayList arrayList = new ArrayList();
                        if (key != null) {
                            arrayList.add(key);
                        }
                        Sticker a = C33223m.m128430a(stickerContent);
                        if (a == null) {
                            Log.m165383e("ChatWindowLog", "addSticker2 called. sticker is null");
                            return;
                        }
                        this.mStickerService.mo134385a(CollectionsKt.listOf(a), (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33618d(this, message)));
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.StickerContent");
                }
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onPushUpdatedChatter(Chatter chatter) {
        boolean z;
        Chat b;
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        ChatChatter b2 = this.selfChatterLiveData.mo5927b();
        if (Intrinsics.areEqual(chatter, b2)) {
            if ((chatter instanceof ChatChatter) && Intrinsics.areEqual(chatter.getId(), this.chatId)) {
                if (b2 != null) {
                    b2.setChatter(((ChatChatter) chatter).getChatter());
                }
                if (b2 != null) {
                    b2.setOnCallRole(((ChatChatter) chatter).getOnCallRole());
                }
                if (b2 != null) {
                    b2.setNickName(((ChatChatter) chatter).getNickName());
                }
            } else if (b2 != null) {
                b2.setChatter(chatter);
            }
            this.selfChatterLiveData.mo5926a(b2);
        }
        C1177w<Chat> wVar = this.currentChat;
        boolean z2 = false;
        if (wVar == null || (b = wVar.mo5927b()) == null) {
            z = false;
        } else {
            z = b.isP2PChat();
        }
        if (z && (chatter instanceof ChatChatter) && Intrinsics.areEqual(this.chatId, ((ChatChatter) chatter).getChatId())) {
            z2 = true;
        }
        Stream<AbstractC34006a> k = this.dataStore.mo127124k();
        String id = chatter.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
        k.mo127143a(new MessageSenderFilter(id)).mo127146b(new MessageSenderUpdater(chatter, this.chatId));
        if (z2) {
            Stream<AbstractC34006a> k2 = this.dataStore.mo127124k();
            String id2 = chatter.getId();
            Intrinsics.checkExpressionValueIsNotNull(id2, "chatter.getId()");
            Stream<AbstractC34006a> a = k2.mo127143a(new ReactionFilter(id2));
            String id3 = chatter.getId();
            Intrinsics.checkExpressionValueIsNotNull(id3, "chatter.getId()");
            String alias = chatter.getAlias();
            Intrinsics.checkExpressionValueIsNotNull(alias, "chatter.getAlias()");
            a.mo127146b(new AliasNameUpdater(id3, alias));
        }
    }

    public final void updateMsg(AbstractC34417b.AbstractC34421c<String> cVar, AbstractC34432b.AbstractC34434b<AbstractC34006a> bVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        Intrinsics.checkParameterIsNotNull(bVar, "updater");
        this.dataStore.mo127102a(cVar, bVar);
    }

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g$i */
    public static final class C33627i implements AbstractC25974h {

        /* renamed from: a */
        final /* synthetic */ MessageListViewModel f86642a;

        /* renamed from: b */
        final /* synthetic */ String f86643b;

        C33627i(MessageListViewModel gVar, String str) {
            this.f86642a = gVar;
            this.f86643b = str;
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public final void onUpdateProgress(long j, int i) {
            if (j > 0) {
                this.f86642a.updateFileStatus(this.f86643b, null, null, (int) ((((long) i) * 100) / j));
            }
        }
    }

    private final void tryToLoadSpecificPosition(int i, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        if (!containsPosition(i)) {
            loadToPosition(i, true, iGetDataCallback);
        } else {
            iGetDataCallback.onSuccess(this.dataStore.mo127125l());
        }
    }

    private final IGetDataCallback<String> wrapResendCallback(MessageInfo messageInfo, IGetDataCallback<String> iGetDataCallback) {
        Message message = messageInfo.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        if (message.getType() == Message.Type.MEDIA) {
            return new MediaMessageResendCallback(messageInfo, iGetDataCallback, this);
        }
        return iGetDataCallback;
    }

    public final void convertOfficeToDocUrl(String str, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ConvertOfficeToSpaceService.f88310h.mo126548a().mo126547a(str, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(iGetDataCallback));
    }

    public final void getChatchatters(String str, IGetDataCallback<ChatChatterResponse> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        C32821b.m126120a().mo121020a(str, (String) null, true, (IGetDataCallback<ChatChatterResponse>) this.mCallbackManager.wrapAndAddGetDataCallback(iGetDataCallback), 0);
    }

    public final void loadSpecialPage(int i, IGetDataCallback<Unit> iGetDataCallback) {
        C33606aa aaVar = new C33606aa(iGetDataCallback);
        if (!containsPosition(i)) {
            loadToPosition(i, true, aaVar);
        }
    }

    public final void updateFileSaveToNutStatus(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        this.dataStore.mo127105a(str, new ar(i));
    }

    public final List<ImageSet> getAllImage(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "clickedMsgId");
        List<? extends MessageInfo> g = this.dataStore.mo127118g();
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isEmpty(g)) {
            return arrayList;
        }
        Intrinsics.checkExpressionValueIsNotNull(g, "messageInfoList");
        ArrayList arrayList2 = arrayList;
        parseImageSetFromMsgInfoList(str, z, g, arrayList2);
        return arrayList2;
    }

    public final void getReEditReplyInfo(String str, IGetDataCallback<C35221d> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        MessageInfo b = this.mMessageService.mo121106b(str);
        IReplyService mReplyService = getMReplyService();
        Intrinsics.checkExpressionValueIsNotNull(b, "messageInfo");
        mReplyService.mo122512c(b, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(iGetDataCallback));
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33459b
    public void onPushChatRemoveChatters(Chat chat, Map<String, ? extends Chatter> map) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(map, "chatterMap");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        AbstractC36450aa N = b.mo134515N();
        Intrinsics.checkExpressionValueIsNotNull(N, "ChatModuleInstanceHolder…endency().loginDependency");
        if (map.containsKey(N.mo134394a())) {
            handleChatChange(chat);
            handleQuitGroup(chat);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatChatterPushHandler.IChatterPushListener
    public void onPushUpdatedNickname(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, BottomDialog.f17198f);
        Intrinsics.checkParameterIsNotNull(str2, "nickname");
        this.dataStore.mo127124k().mo127143a(new ReactionFilter(str)).mo127143a(new MessageSenderFilter(str)).mo127143a(new PinSenderFilter(str)).mo127146b(new NickNameUpdater(str, str2));
    }

    public final void getReplyInfo(String str, IGetDataCallback<C35221d> iGetDataCallback) {
        Chat b;
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        MessageInfo messageInfoById = getMessageInfoById(str);
        if (messageInfoById == null) {
            Log.m165397w("ChatWindowLog", "cannot get reply info：" + str);
            iGetDataCallback.onError(new ErrorResult("cannot get reply info：" + str));
        } else if (!isEnableRichTextInput() || ((b = this.currentChat.mo5927b()) != null && b.isSecret())) {
            getMReplyService().mo122510a(messageInfoById, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(iGetDataCallback));
        } else {
            getMReplyService().mo122511b(messageInfoById, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(iGetDataCallback));
        }
    }

    public final void sendSignRequest(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        Intrinsics.checkParameterIsNotNull(str2, "sourceId");
        char[] a = C69743a.m267688a(C69745a.m267697b(str));
        Intrinsics.checkExpressionValueIsNotNull(a, "Hex.encodeHex(DigestUtils.md5(description))");
        String str3 = new String(a);
        if (this.signUrlUpdateThrottle == null) {
            this.signUrlUpdateThrottle = new AndroidThrottle.C26229a().mo93309a(100L).mo93310a(CoreThreadPool.getNonblockingHandler()).mo93311a(new PersonalSignGetUrlPreviewBuffer()).mo93312a(new ao(this)).mo93313a();
        }
        AndroidThrottle<UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams> androidThrottle = this.signUrlUpdateThrottle;
        if (androidThrottle != null) {
            androidThrottle.mo93303a(new UserStatusParseUrlPreViewUtils.GetSignUrlPreviewParams(str, str2, str3));
        }
    }

    public final void downloadFile(Context context, String str) {
        Chat b;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "msgId");
        MessageInfo messageInfoById = getMessageInfoById(str);
        if (messageInfoById != null && (b = this.currentChat.mo5927b()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(b, "currentChat.value ?: return");
            Message message = messageInfoById.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (message.getType() == Message.Type.FILE) {
                Message message2 = messageInfoById.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                Content content = messageInfoById.getMessage().getContent();
                if (content != null) {
                    FileContent fileContent = (FileContent) content;
                    String str2 = null;
                    updateFileStatus(str, FileState.DOWNLOADING, null, 0);
                    String x = C57881t.m224652x(context);
                    if (!b.isSecret()) {
                        str2 = C26308n.m95252a(context, x, fileContent.getName());
                    }
                    C33627i iVar = new C33627i(this, str);
                    AbstractC36474h b2 = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
                    AbstractC36501o s = b2.mo134591s();
                    String sourceId = message2.getSourceId();
                    String str3 = this.chatId;
                    Message.SourceType sourceType = message2.getSourceType();
                    Intrinsics.checkExpressionValueIsNotNull(sourceType, "message.sourceType");
                    s.mo134677a(context, str, sourceId, str3, sourceType.getNumber(), fileContent.getKey(), str2, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33624h(this, str, context)), iVar);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.FileContent");
            }
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.p1642c.C33454i.AbstractC33459b
    public void onPushMessage(List<MessageInfo> list, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(list, "messageInfos");
        if (!CollectionUtils.isEmpty(list)) {
            for (MessageInfo messageInfo : list) {
                if (messageInfo.isPreMessage()) {
                    Message message = messageInfo.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
                    C54948d.m213136a(message);
                } else {
                    Message message2 = messageInfo.getMessage();
                    Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                    C54948d.m213139b(message2);
                }
                Message message3 = messageInfo.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message3, "messageInfo.getMessage()");
                String id = message3.getId();
                if (z || this.mImmediatePushWhiteList.contains(id) || message3.getType() == Message.Type.RED_PACKET) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    AndroidThrottle<MessageInfo> msgUpdateThrottle = getMsgUpdateThrottle();
                    if (msgUpdateThrottle != null) {
                        msgUpdateThrottle.mo93306c(messageInfo);
                    }
                    Log.m165389i("ChatWindowLog", "flash push message,  message： " + messageInfo);
                } else {
                    AndroidThrottle<MessageInfo> msgUpdateThrottle2 = getMsgUpdateThrottle();
                    if (msgUpdateThrottle2 != null) {
                        msgUpdateThrottle2.mo93303a(messageInfo);
                    }
                    Log.m165389i("ChatWindowLog", "post push message,  message： " + messageInfo);
                }
            }
        }
    }

    public final void onCheckMembersInChat(String str, List<GroupRecallEntity> list, IGetDataCallback<List<GroupRecallEntity>> iGetDataCallback) {
        this.mChatService.mo121043b(list, str, iGetDataCallback);
    }

    private final void initResourceLoader(Chat chat, ChatChatter chatChatter, Context context) {
        MessageResourceLoader messageResourceLoader = new MessageResourceLoader(new C33636q(this, context, chat, chatChatter));
        this.mMessageResourceLoader = messageResourceLoader;
        if (messageResourceLoader != null) {
            messageResourceLoader.mo122893a();
        }
        C25969c cVar = new C25969c(new Handler(Looper.getMainLooper()));
        this.mCancelableExecutor = cVar;
        if (cVar != null) {
            cVar.mo92346a(new RunnableC33637r(this), 5000);
        }
    }

    private final void loadToPosition(int i, boolean z, IGetDataCallback<AbstractC33964i<MessageInfo>> iGetDataCallback) {
        MessageFetchScene messageFetchScene;
        ChannelDataFetcherStrategy channelDataFetcherStrategy;
        int max = Math.max(i, -1);
        if (max >= 0) {
            messageFetchScene = MessageFetchScene.SPECIFIED_POSITION;
        } else {
            messageFetchScene = MessageFetchScene.FIRST_SCREEN;
        }
        if (z) {
            channelDataFetcherStrategy = ChannelDataFetcherStrategy.SYNC_SERVER_DATA;
        } else {
            channelDataFetcherStrategy = ChannelDataFetcherStrategy.RETURN_LOCAL_DATA;
        }
        this.pageLoader.mo124045a(new C33963h(max, 15, messageFetchScene, channelDataFetcherStrategy), new C33411g(this.dataStore, iGetDataCallback));
    }

    public final void checkChatterInChat(String str, ArrayList<String> arrayList, IGetDataCallback<List<String>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(arrayList, "chatterIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        this.mChatService.mo121029a(arrayList, str, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33621f(iGetDataCallback)));
    }

    public final void recallMembers(String str, List<String> list, List<? extends PickChatEntity> list2) {
        Intrinsics.checkParameterIsNotNull(list, "chatterIds");
        this.mChatService.mo121008a(str, list, list2, 2, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33616ai(this)));
    }

    public final void prepareAudioData(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "audioKey");
        Intrinsics.checkParameterIsNotNull(str2, "msgId");
        Log.m165389i("ChatWindowLog", "prepareAudioData-manual:" + str + '/' + str2 + '/' + z);
        ArrayList arrayList = new ArrayList();
        MessageInfo messageInfoById = getMessageInfoById(str2);
        if (messageInfoById != null) {
            arrayList.add(messageInfoById);
            this.dataStore.mo127105a(str2, new C33385a(AudioContent.AudioState.DOWNLOADING));
            MessageResourceLoader messageResourceLoader = this.mMessageResourceLoader;
            if (messageResourceLoader != null) {
                messageResourceLoader.mo122894a(1, arrayList, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33614ag(this, str2)));
            }
        }
    }

    public final void updateFileStatus(String str, FileState fileState, String str2, int i) {
        this.dataStore.mo127105a(str, new as(fileState, str2, i));
    }

    public final void getPreviewDriveUrl(String str, String str2, Message.SourceType sourceType, IGetDataCallback<String> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134503B().mo134613a(str, str2, sourceType, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(iGetDataCallback));
    }

    public final void uploadToDriveSpace(String str, String str2, String str3, Message.SourceType sourceType) {
        Intrinsics.checkParameterIsNotNull(str, "fileKey");
        Intrinsics.checkParameterIsNotNull(str2, "msgId");
        Intrinsics.checkParameterIsNotNull(str3, "sourceId");
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        b.mo134503B().mo134614a(str, str2, str3, sourceType, (IGetDataCallback) this.mCallbackManager.wrapAndAddCallback(new C33617at(this, str2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0077 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void parseImageSetFromMsgInfoList(java.lang.String r8, boolean r9, java.util.List<? extends com.ss.android.lark.chat.entity.message.MessageInfo> r10, java.util.List<com.ss.android.lark.chat.entity.image.ImageSet> r11) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.parseImageSetFromMsgInfoList(java.lang.String, boolean, java.util.List, java.util.List):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.chatwindow.chat.v2.component.message.g */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void recallMembers$default(MessageListViewModel gVar, String str, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        gVar.recallMembers(str, list, list2);
    }

    public MessageListViewModel(Context context, Chat chat, ChatChatter chatChatter, ChatChatter chatChatter2, int i, IMessageListComponent.MessageListComponentDependency gVar) {
        ChatTextLayoutPreCalculator aVar;
        C33220b bVar;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(chat, "initChat");
        Intrinsics.checkParameterIsNotNull(chatChatter, "selfChatter");
        Intrinsics.checkParameterIsNotNull(gVar, "dependency");
        this.showPosition = i;
        String id = chat.getId();
        Intrinsics.checkExpressionValueIsNotNull(id, "initChat.getId()");
        this.chatId = id;
        C1177w wVar = new C1177w();
        wVar.mo5929b(chat);
        this.currentChat = C33427a.m129532a(wVar);
        C1177w<ChatChatter> wVar2 = new C1177w<>();
        this.selfChatterLiveData = wVar2;
        C1177w<ChatChatter> wVar3 = new C1177w<>();
        this.p2pChatterLiveData = wVar3;
        this.mMessageReader = new MessageReader(chat.isSuper());
        ScheduledExecutorService singleScheduledThreadPool = CoreThreadPool.getDefault().getSingleScheduledThreadPool("lk-chat-window");
        Intrinsics.checkExpressionValueIsNotNull(singleScheduledThreadPool, "CoreThreadPool.getDefaul…eadPool(\"lk-chat-window\")");
        this.mMessageHandlerExecutor = new SerialExecutor(singleScheduledThreadPool);
        ScheduledExecutorService singleScheduledThreadPool2 = CoreThreadPool.getDefault().getSingleScheduledThreadPool("lk-chat-window-bg");
        Intrinsics.checkExpressionValueIsNotNull(singleScheduledThreadPool2, "CoreThreadPool.getDefaul…Pool(\"lk-chat-window-bg\")");
        this.mBackgroundExecutor = new SerialExecutor(singleScheduledThreadPool2);
        CallbackManager callbackManager = new CallbackManager();
        this.mCallbackManager = callbackManager;
        C33235f fVar = new C33235f();
        this.mUIModel = fVar;
        this.mMessageService = C32848e.m126401b();
        this.mChatService = C32821b.m126120a();
        this.mDraftService = C34218i.m132791a();
        this.mReplyService$delegate = LazyKt.lazy(new C33610ad(chat));
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.mStickerService = b.mo134502A();
        AbstractC36474h b2 = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "ChatModuleInstanceHolder.getDependency()");
        com.ss.android.lark.dependency.al x = b2.mo134596x();
        this.mUserSettingService = x;
        this.mDependencyRefs = new WeakReference<>(gVar);
        this.mImmediatePushWhiteList = Collections.synchronizedSet(new HashSet());
        this.isEnableRichTextInput$delegate = LazyKt.lazy(C33639t.INSTANCE);
        this.mExtraItemInterceptor = new C33408e(new C33607ab(this, chat));
        C33608ac acVar = new C33608ac(this);
        this.mOnDataChangeListener2 = acVar;
        wVar2.mo5929b(chatChatter);
        wVar3.mo5929b(chatChatter2);
        this.pageLoader = new C33407d(this.mMessageHandlerExecutor, id);
        if (chat.isSecret()) {
            aVar = new SecretChatTextLayoutPreCalculator(context);
        } else {
            String anonymousId = chat.getAnonymousId();
            Intrinsics.checkExpressionValueIsNotNull(anonymousId, "initChat.anonymousId");
            aVar = new ChatTextLayoutPreCalculator(context, anonymousId, chat.isSuper());
        }
        this.textLayoutPreCalculator = aVar;
        Intrinsics.checkExpressionValueIsNotNull(x, "mUserSettingService");
        boolean c = x.mo134466c();
        if (chat.isSecret()) {
            bVar = new SecretChatDataMapper(c, aVar);
        } else {
            bVar = new C33220b(true, c);
        }
        C33400c cVar = new C33400c(this.mMessageHandlerExecutor, acVar, aVar);
        this.dataStore = cVar;
        cVar.mo127101a(chat.getLastMessagePosition());
        this.mFirstScreenLoader = new C33384a(this.pageLoader, this.dataStore, this.mBackgroundExecutor, this.mMessageHandlerExecutor, callbackManager, chat);
        initPushHandler();
        registerConnectionStateChangeListener();
        AbstractC33964i d = this.dataStore.mo127125l();
        Intrinsics.checkExpressionValueIsNotNull(d, "dataStore.dataObservableList");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C33412h(chat.getFirstUnReadMessageBadgeCount()));
        arrayList.add(new C33413i(fVar));
        if (isURLAsycLayoutEnable()) {
            URLAsyncMeasureInterceptor jVar = new URLAsyncMeasureInterceptor(context, chat.isGroup());
            arrayList.add(jVar);
            this.urlAsyncMeasureInterceptor = jVar;
        }
        fVar.mo122562a(new C33235f.AbstractC33236a(this) {
            /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.C336021 */

            /* renamed from: a */
            final /* synthetic */ MessageListViewModel f86589a;

            {
                this.f86589a = r1;
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.C33235f.AbstractC33236a
            /* renamed from: a */
            public final void mo122571a(String str) {
                MessageListViewModel gVar = this.f86589a;
                Intrinsics.checkExpressionValueIsNotNull(str, "messageId");
                gVar.notifyMessageChange(str);
            }
        });
        this.mDataListPipeline = new C33955c<>(d, bVar, arrayList, new C33955c.AbstractC33957b<ChatMessageVO<?>>(this) {
            /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.C336032 */

            /* renamed from: a */
            final /* synthetic */ MessageListViewModel f86590a;

            {
                this.f86590a = r1;
            }

            @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33957b
            public final void onChanged(List<ChatMessageVO<?>> list) {
                C33408e eVar = this.f86590a.mExtraItemInterceptor;
                if (eVar != null) {
                    eVar.mo122971c(list, 0, list.size());
                }
                this.f86590a.getMessageList().mo5926a(list);
            }
        });
        initResourceLoader(chat, chatChatter2, context);
        initMessageSampleConfig();
        AbstractC32909d d2 = C32911g.m126697d(id);
        if (d != null) {
            d2.mo121417a(chat, new ChatMsgTrackSource((ObservableMappedArrayList) d));
            MsgSampleIssueTracker.f84545b.mo121484a(id).mo121422a(chat, new MsgSampleIssueTracker.IMessageSourceFetcher(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.C336043 */

                /* renamed from: a */
                final /* synthetic */ MessageListViewModel f86591a;

                @Override // com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker.IMessageSourceFetcher
                /* renamed from: a */
                public IMessageSource mo121487a() {
                    AbstractC33964i d = this.f86591a.dataStore.mo127125l();
                    if (d != null) {
                        return new ChatMsgTrackSource((ObservableMappedArrayList) d);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.core.model.ObservableMappedArrayList<kotlin.String, com.ss.android.lark.chat.entity.message.MessageInfo>");
                }

                {
                    this.f86591a = r1;
                }
            }, new MsgSampleIssueTracker.IMessagePipeSyncFetcher(this) {
                /* class com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageListViewModel.C336054 */

                /* renamed from: a */
                final /* synthetic */ MessageListViewModel f86592a;

                @Override // com.ss.android.lark.chat.api.service.track.sample.MsgSampleIssueTracker.IMessagePipeSyncFetcher
                /* renamed from: a */
                public Map<String, Boolean> mo121486a() {
                    Map<String, Boolean> b = this.f86592a.dataStore.mo122940b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "dataStore.msgSyncPipeFinishedMap");
                    return b;
                }

                {
                    this.f86592a = r1;
                }
            });
            C35234b.m137579e().mo121399a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.core.model.ObservableMappedArrayList<kotlin.String, com.ss.android.lark.chat.entity.message.MessageInfo>");
    }
}
