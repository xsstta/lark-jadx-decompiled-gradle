package com.ss.android.lark.chat.chatwindow.chat.v2.plugin;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.lark.pb.im.v1.PushSpeechRecognitionStatus;
import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse;
import com.bytedance.lark.pb.im.v1.ToggleTextOnAudioResponse;
import com.bytedance.lark.pb.media.v1.UploadAudioDataResponse;
import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.C25969c;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.service.p1600b.C32848e;
import com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent;
import com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin;
import com.ss.android.lark.chat.chatwindow.chat.model.p1635a.C33395d;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33134w;
import com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.C33103ae;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.IChatWindowApp;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.IMessageListComponent;
import com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler;
import com.ss.android.lark.chat.chatwindow.chat.v2.model.IMessageSender;
import com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.IInnerMessageService;
import com.ss.android.lark.chat.utils.C34340h;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import com.ss.android.lark.chatbase.p1690c.C34438a;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.chatwindow.p1720a.p1721a.C35219b;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.dependency.AbstractC36502p;
import com.ss.android.lark.dependency.AbstractC36510y;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.richtextinput.RichTextInputShrinkPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener;
import com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0001^B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u001a\u00104\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0018\u00109\u001a\u0002012\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u000201H\u0016J\u0018\u0010?\u001a\u0002012\u0006\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020BH\u0016J0\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00102\u0006\u0010G\u001a\u00020\t2\u0006\u0010H\u001a\u00020IH\u0016JJ\u0010J\u001a\u0004\u0018\u00010K2\u0006\u00107\u001a\u0002082\b\u0010L\u001a\u0004\u0018\u00010K2\u0006\u0010E\u001a\u00020\u00132\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\t2\u0006\u0010G\u001a\u00020\t2\u000e\u0010P\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010QJ\u0012\u0010R\u001a\u0002012\b\u0010S\u001a\u0004\u0018\u00010TH\u0002J\u0010\u0010U\u001a\u0002012\u0006\u0010V\u001a\u00020\u0010H\u0002J\u0018\u0010W\u001a\u0002012\u0006\u0010D\u001a\u00020\u00102\u0006\u0010X\u001a\u00020\tH\u0002JD\u0010Y\u001a\u0002012\u0006\u00107\u001a\u0002082\b\u0010Z\u001a\u0004\u0018\u00010\u00102\u0006\u0010[\u001a\u00020\u00132\b\u0010\\\u001a\u0004\u0018\u00010\u00102\u0006\u0010G\u001a\u00020\t2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010]\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n \u001c*\u0004\u0018\u00010$0$X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n \u001c*\u0004\u0018\u00010'0'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X.¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler$IAudioPushListener;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "isEnableRichTextInput", "", "()Z", "isEnableRichTextInput$delegate", "Lkotlin/Lazy;", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mAudio2TextContent", "", "mAudio2TextId", "mAudio2TextIndex", "", "mAudioSendExecutor", "Ljava/util/concurrent/ExecutorService;", "mCancelableUIExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mChatAudioPushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler;", "mFeatureConfigDependency", "Lcom/ss/android/lark/dependency/IFeatureConfigDependency;", "kotlin.jvm.PlatformType", "mHasFinalAudio2TextResp", "mIsAudio2TextTimeout", "mIsLoading", "mIsOnlyText", "mKeyboardLoadingCallback", "Lcom/ss/android/lark/chat/utils/SpannableStringUtils$DrawableCallback;", "mLanguageDependency", "Lcom/ss/android/lark/dependency/ILanguageDependency;", "mLastAudio2TextContent", "mMessageService", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "mNeedAudio2Text", "mTranslateHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/ITranslateModelHandler;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "messageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "executeSerialTaskInBackground", "", "runnable", "Ljava/lang/Runnable;", "getKeyboardHint", "getVoicePlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onPushSpeechRecognitionStatus", "srcId", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/im/v1/PushSpeechRecognitionStatus$Status;", "onPushUpdateAudioText", "messageId", "sequenceId", "audioText", "isFinish", "diffIndex", "", "sendAudioData", "Lcom/ss/android/lark/chat/entity/message/Message;", "message", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/nio/ByteBuffer;", "needRecognized", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "sendVoiceRecordPoint", "recognizeResponse", "Lcom/bytedance/lark/pb/im/v1/SendSpeechRecognitionResponse;", "showToast", "tips", "toggleAudioText", "shown", "updateAudioText", "uploadId", "seqId", "audio2Text", "fromResp", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w */
public final class VoicePlugin extends BaseChatPlugin implements ChatAudioPushHandler.IAudioPushListener {

    /* renamed from: v */
    public static final Companion f87253v = new Companion(null);

    /* renamed from: A */
    private final Lazy f87254A;

    /* renamed from: a */
    public IKeyboardComponent f87255a;

    /* renamed from: b */
    public IMessageListComponent f87256b;

    /* renamed from: c */
    public IMessageSender f87257c;

    /* renamed from: d */
    public Chat f87258d;

    /* renamed from: e */
    public ChatChatter f87259e;

    /* renamed from: f */
    public boolean f87260f;

    /* renamed from: g */
    public boolean f87261g;

    /* renamed from: h */
    public String f87262h;

    /* renamed from: l */
    public String f87263l;

    /* renamed from: m */
    public int f87264m;

    /* renamed from: n */
    public boolean f87265n;

    /* renamed from: o */
    public String f87266o;

    /* renamed from: p */
    public boolean f87267p;

    /* renamed from: q */
    public boolean f87268q;

    /* renamed from: r */
    public C34357v.C34361a f87269r;

    /* renamed from: s */
    public C25969c f87270s = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: t */
    public final AbstractC36502p f87271t;

    /* renamed from: u */
    public final IInnerMessageService f87272u;

    /* renamed from: w */
    private ExecutorService f87273w;

    /* renamed from: x */
    private final AbstractC36510y f87274x;

    /* renamed from: y */
    private ChatAudioPushHandler f87275y;

    /* renamed from: z */
    private AbstractC33134w<AbstractC34006a> f87276z;

    /* renamed from: b */
    public final boolean mo123900b() {
        return ((Boolean) this.f87254A.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$Companion;", "", "()V", "AUDIO_RECOGNIZE_DEFAULT_LOCALE", "", "AUDIO_RECOGNIZE_FORMAT", "AUDIO_RECOGNIZE_RATE", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$e */
    public static final class C33876e implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87305a;

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122065a() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127734a(this);
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: b */
        public void mo122067b() {
            IKeyboardComponent.IKeyboardComponentCallbacks.C33036a.m127736b(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33876e(VoicePlugin wVar) {
            this.f87305a = wVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            VoicePlugin.m131132a(this.f87305a).mo121978a("voice", this.f87305a.mo123893a(fVar));
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler.IAudioPushListener
    /* renamed from: a */
    public void mo123057a(String str, int i, String str2, boolean z, int[] iArr) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "audioText");
        Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
        Log.m165389i("ChatWindowLog", "on push audio text:" + str + '/' + i + '/' + str2.length() + "/ isFinish = " + z);
        if (TextUtils.isEmpty(str2) && z) {
            String string = UIHelper.getString(R.string.Lark_Chat_AudioConvertToTextError);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_AudioConvertToTextError)");
            mo123898a(string);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler.IAudioPushListener
    /* renamed from: a */
    public void mo123058a(String str, PushSpeechRecognitionStatus.Status status) {
        Intrinsics.checkParameterIsNotNull(str, "srcId");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Log.m165389i("ChatWindowLog", "on push speech recognition status:" + str + '/' + status);
        if (TextUtils.equals(str, this.f87266o) && status == PushSpeechRecognitionStatus.Status.Timeout && !this.f87267p) {
            this.f87270s.mo92345a(new RunnableC33878g(this));
        }
    }

    /* renamed from: a */
    public final void mo123899a(String str, boolean z) {
        IMessageListComponent iMessageListComponent = this.f87256b;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        AbstractC34006a t = iMessageListComponent.mo123331t(str);
        if (t != null) {
            Message message = t.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo!!.getMessage()");
            if (message.getType() == Message.Type.AUDIO) {
                Message message2 = t.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo!!.getMessage()");
                if (message2.isSourceFileDelete()) {
                    String string = UIHelper.getString(R.string.Lark_Message_AudioMessageWithdrawMessageToast);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…sageWithdrawMessageToast)");
                    mo123898a(string);
                    return;
                }
                this.f87272u.mo121268b(str, z, (IGetDataCallback) mo122129j().wrapAndAddCallback(new C33882k(this, t, z, str)));
            }
        }
    }

    /* renamed from: a */
    public final void mo123898a(String str) {
        UICallbackExecutor.execute(new RunnableC33881j(this, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$2", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IVoiceDependency;", "isAudio2TextEnabled", "", "isAudioWithTextEnabled", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$c */
    public static final class C33874c implements IVoiceDependency {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87304a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: c */
        public boolean mo123923c() {
            return IVoiceDependency.C41034a.m162690a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: a */
        public boolean mo123921a() {
            AbstractC36502p pVar = this.f87304a.f87271t;
            Intrinsics.checkExpressionValueIsNotNull(pVar, "mFeatureConfigDependency");
            return pVar.mo134684b();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: b */
        public boolean mo123922b() {
            AbstractC36502p pVar = this.f87304a.f87271t;
            Intrinsics.checkExpressionValueIsNotNull(pVar, "mFeatureConfigDependency");
            return pVar.mo134684b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33874c(VoicePlugin wVar) {
            this.f87304a = wVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\bH\u0016J(\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J*\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0005H\u0002J\u0010\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0003H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IRecordListener;", "audio2TextError", "", "isAudio2Text", "", "localCid", "localDuration", "", "localFileName", "recordingAudioMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "onAudio2Text", "", "onAudioRecorded", "strFileName", "cid", "duration", "needRecognized", "onCancelRecord", "onClearResult", "onPanelHeightChanged", "height", "onPrepareForRecord", "onlyText", "onSendAudio", "onSendAudioText", "text", "onSendText", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "onStartRecord", "onUpdateAudio", "buffer", "Ljava/nio/ByteBuffer;", "volume", "", "updateFinishState", "uploadId", "autoStop", "updateStartState", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b */
    public static final class C33864b implements IRecordListener {

        /* renamed from: a */
        public Message f87277a;

        /* renamed from: b */
        public String f87278b;

        /* renamed from: c */
        public String f87279c;

        /* renamed from: d */
        public int f87280d;

        /* renamed from: e */
        public String f87281e;

        /* renamed from: f */
        public boolean f87282f;

        /* renamed from: g */
        final /* synthetic */ VoicePlugin f87283g;

        /* renamed from: h */
        final /* synthetic */ KeyBoard f87284h;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123901a() {
            MessageHitPoint.f135779d.mo187562k(this.f87283g.f87266o);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123908b() {
            this.f87283g.mo123897a(new RunnableC33869d(this));
            MessageHitPoint.f135779d.mo187530a("audio_and_text", this.f87280d, TextUtils.isEmpty(this.f87283g.f87263l));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: c */
        public void mo123911c() {
            this.f87283g.f87260f = true;
            this.f87282f = true;
            this.f87283g.mo123897a(new RunnableC33865a(this));
            if (this.f87283g.f87266o != null) {
                String str = this.f87283g.f87266o;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                m131148a(str, this.f87283g.f87267p);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onAudio2Text$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$a */
        public static final class RunnableC33865a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87285a;

            public void run() {
                if (this.f87285a.f87277a == null) {
                    Log.m165397w("ChatWindowLog", "onAudio2Text recordingAudioMessage is null");
                    return;
                }
                Message message = this.f87285a.f87277a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                AudioContent audioContent = (AudioContent) content;
                VoicePlugin wVar = this.f87285a.f87283g;
                KeyBoard fVar = this.f87285a.f87284h;
                Message message2 = this.f87285a.f87277a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                int localSequenceId = audioContent.getLocalSequenceId();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
                Intrinsics.checkExpressionValueIsNotNull(wrap, "ByteBuffer.wrap(ByteArray(0))");
                wVar.mo123892a(fVar, message2, localSequenceId, wrap, true, true, (IGetDataCallback<String>) null);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            RunnableC33865a(C33864b bVar) {
                this.f87285a = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onSendAudio$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$d */
        public static final class RunnableC33869d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87294a;

            public void run() {
                if (this.f87294a.f87277a == null || this.f87294a.f87278b == null) {
                    Log.m165397w("ChatWindowLog", "onSendAudio recordingAudioMessage or localFileName is null");
                    return;
                }
                Message message = this.f87294a.f87277a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                ((AudioContent) content).setUploadId(null);
                IMessageSender b = VoicePlugin.m131133b(this.f87294a.f87283g);
                Message message2 = this.f87294a.f87277a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                String str = this.f87294a.f87278b;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                b.mo123008a(message2, str, this.f87294a.f87279c, this.f87294a.f87280d);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            RunnableC33869d(C33864b bVar) {
                this.f87294a = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onSendAudioText$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$e */
        public static final class RunnableC33870e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87295a;

            /* renamed from: b */
            final /* synthetic */ String f87296b;

            public void run() {
                if (this.f87295a.f87277a == null || this.f87295a.f87278b == null) {
                    Log.m165397w("ChatWindowLog", "onSendAudioText recordingAudioMessage or localFileName is null");
                    return;
                }
                Message message = this.f87295a.f87277a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                ((AudioContent) content).setUploadId(null);
                IMessageSender b = VoicePlugin.m131133b(this.f87295a.f87283g);
                Message message2 = this.f87295a.f87277a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                String str = this.f87296b;
                String str2 = this.f87295a.f87278b;
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                String str3 = this.f87295a.f87279c;
                if (str3 == null) {
                    Intrinsics.throwNpe();
                }
                b.mo123009a(message2, str, str2, str3, this.f87295a.f87280d);
                if (!TextUtils.equals(this.f87296b, this.f87295a.f87283g.f87263l)) {
                    MessageHitPoint.f135779d.mo187563l(this.f87295a.f87283g.f87266o);
                }
            }

            RunnableC33870e(C33864b bVar, String str) {
                this.f87295a = bVar;
                this.f87296b = str;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onUpdateAudio$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$f */
        public static final class RunnableC33871f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87297a;

            /* renamed from: b */
            final /* synthetic */ ByteBuffer f87298b;

            /* renamed from: c */
            final /* synthetic */ boolean f87299c;

            public void run() {
                if (this.f87297a.f87277a == null || this.f87298b == null) {
                    Log.m165383e("ChatWindowLog", "recordingAudioMessage or buffer is null");
                    return;
                }
                Message message = this.f87297a.f87277a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                AudioContent audioContent = (AudioContent) content;
                if (TextUtils.isEmpty(audioContent.getUploadId())) {
                    Log.m165383e("ChatWindowLog", "UploadId is empty");
                    return;
                }
                VoicePlugin wVar = this.f87297a.f87283g;
                KeyBoard fVar = this.f87297a.f87284h;
                Message message2 = this.f87297a.f87277a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                wVar.mo123892a(fVar, message2, audioContent.getLocalSequenceId(), this.f87298b, this.f87299c, false, (IGetDataCallback<String>) new C33872a(this));
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onUpdateAudio$1$run$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "s", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$f$a */
            public static final class C33872a implements IGetDataCallback<String> {

                /* renamed from: a */
                final /* synthetic */ RunnableC33871f f87300a;

                /* renamed from: a */
                public void onSuccess(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "s");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                C33872a(RunnableC33871f fVar) {
                    this.f87300a = fVar;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f87300a.f87297a.f87281e = errorResult.getDisplayMsg();
                    StringBuilder sb = new StringBuilder();
                    sb.append("onSendAudioData onError:");
                    String str = this.f87300a.f87297a.f87281e;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    sb.append(str);
                    Log.m165397w("ChatWindowLog", sb.toString());
                }
            }

            RunnableC33871f(C33864b bVar, ByteBuffer byteBuffer, boolean z) {
                this.f87297a = bVar;
                this.f87298b = byteBuffer;
                this.f87299c = z;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onAudioRecorded$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$b */
        public static final class RunnableC33866b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87286a;

            /* renamed from: b */
            final /* synthetic */ boolean f87287b;

            /* renamed from: c */
            final /* synthetic */ int f87288c;

            /* renamed from: d */
            final /* synthetic */ String f87289d;

            /* renamed from: e */
            final /* synthetic */ String f87290e;

            public void run() {
                if (this.f87286a.f87277a == null) {
                    Log.m165397w("ChatWindowLog", "onSendAudioMessage recordingAudioMessage is null");
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Message message = this.f87286a.f87277a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                AudioContent audioContent = (AudioContent) content;
                VoicePlugin wVar = this.f87286a.f87283g;
                KeyBoard fVar = this.f87286a.f87284h;
                Message message2 = this.f87286a.f87277a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                int localSequenceId = audioContent.getLocalSequenceId();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
                Intrinsics.checkExpressionValueIsNotNull(wrap, "ByteBuffer.wrap(ByteArray(0))");
                wVar.mo123892a(fVar, message2, localSequenceId, wrap, this.f87287b, true, (IGetDataCallback<String>) new C33867a(countDownLatch));
                try {
                    countDownLatch.await(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Log.m165379d("ChatWindowLog", "countdown:" + countDownLatch);
                if (!this.f87287b) {
                    MessageHitPoint.f135779d.mo187530a("audio_only", this.f87288c, false);
                    IMessageSender b = VoicePlugin.m131133b(this.f87286a.f87283g);
                    Message message3 = this.f87286a.f87277a;
                    if (message3 == null) {
                        Intrinsics.throwNpe();
                    }
                    b.mo123008a(message3, this.f87289d, this.f87290e, this.f87288c);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onAudioRecorded$1$run$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "s", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$b$a */
            public static final class C33867a implements IGetDataCallback<String> {

                /* renamed from: a */
                final /* synthetic */ CountDownLatch f87291a;

                C33867a(CountDownLatch countDownLatch) {
                    this.f87291a = countDownLatch;
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
                    this.f87291a.countDown();
                    Log.m165379d("ChatWindowLog", "onSendAudioData last onError:");
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    Intrinsics.checkParameterIsNotNull(str, "s");
                    this.f87291a.countDown();
                    Log.m165379d("ChatWindowLog", "onSendAudioData last onSuccess:" + str);
                }
            }

            RunnableC33866b(C33864b bVar, boolean z, int i, String str, String str2) {
                this.f87286a = bVar;
                this.f87287b = z;
                this.f87288c = i;
                this.f87289d = str;
                this.f87290e = str2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$getVoicePlugin$plugin$1$onPrepareForRecord$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$c */
        public static final class RunnableC33868c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87292a;

            /* renamed from: b */
            final /* synthetic */ String f87293b;

            public void run() {
                String str;
                if (this.f87292a.f87277a == null) {
                    Log.m165397w("ChatWindowLog", "onPrepareForRecord recordingAudioMessage is null");
                    return;
                }
                if (!this.f87292a.f87283g.f87260f || this.f87292a.f87283g.f87266o == null) {
                    IInnerMessageService b = C32848e.m126401b();
                    Message message = this.f87292a.f87277a;
                    if (message == null) {
                        Intrinsics.throwNpe();
                    }
                    str = b.mo121249a(message.getChatId(), "", this.f87293b, C41039c.m162705a());
                    Intrinsics.checkExpressionValueIsNotNull(str, "MessageService.inst()\n  …etAudioRecognizeLocale())");
                } else {
                    str = this.f87292a.f87283g.f87266o;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    Message message2 = this.f87292a.f87277a;
                    if (message2 == null) {
                        Intrinsics.throwNpe();
                    }
                    Content content = message2.getContent();
                    Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                    AudioContent audioContent = (AudioContent) content;
                    audioContent.setUploadId(str);
                    audioContent.setSequenceId(0);
                    if (this.f87292a.f87283g.f87260f) {
                        VoicePlugin wVar = this.f87292a.f87283g;
                        KeyBoard fVar = this.f87292a.f87284h;
                        Message message3 = this.f87292a.f87277a;
                        int localSequenceId = audioContent.getLocalSequenceId();
                        ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
                        Intrinsics.checkExpressionValueIsNotNull(wrap, "ByteBuffer.wrap(ByteArray(0))");
                        wVar.mo123892a(fVar, message3, localSequenceId, wrap, true, false, (IGetDataCallback<String>) null);
                    }
                }
            }

            RunnableC33868c(C33864b bVar, String str) {
                this.f87292a = bVar;
                this.f87293b = str;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$b$g */
        public static final class RunnableC33873g implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33864b f87301a;

            /* renamed from: b */
            final /* synthetic */ String f87302b;

            /* renamed from: c */
            final /* synthetic */ boolean f87303c;

            RunnableC33873g(C33864b bVar, String str, boolean z) {
                this.f87301a = bVar;
                this.f87302b = str;
                this.f87303c = z;
            }

            public final void run() {
                Log.m165379d("ChatWindowLog", "updateFinishState:" + this.f87301a.f87283g.f87263l + '/' + this.f87301a.f87283g.f87266o + '/' + this.f87302b);
                this.f87301a.f87283g.mo123896a(this.f87301a.f87284h, this.f87302b, 0, this.f87301a.f87283g.f87263l, true, new int[0], false);
                if (!TextUtils.isEmpty(this.f87301a.f87281e)) {
                    Log.m165397w("ChatWindowLog", "updateFinishState:" + this.f87302b + '/' + this.f87301a.f87281e);
                    MessageHitPoint.Companion aVar = MessageHitPoint.f135779d;
                    boolean z = this.f87301a.f87282f;
                    String str = this.f87301a.f87281e;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.mo187538a(z, str);
                    if (this.f87301a.f87282f && !this.f87303c) {
                        C35212a.m137531a(this.f87301a.f87283g.mo122128i(), "", UIUtils.getString(this.f87301a.f87283g.mo122128i(), R.string.Lark_Chat_AudioConvertedFailedOnlySendText));
                    }
                }
            }
        }

        /* renamed from: c */
        private final void m131149c(String str) {
            this.f87283g.f87268q = false;
            this.f87283g.mo123896a(this.f87284h, str, 0, "", false, new int[0], false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123902a(int i) {
            KeyBoard fVar = this.f87284h;
            if (fVar != null) {
                if (fVar == null) {
                    Intrinsics.throwNpe();
                }
                if (fVar.mo146818b("post")) {
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123909b(String str) {
            Log.m165379d("ChatWindowLog", "onCancelRecord");
            if (this.f87277a != null) {
                IMessageListComponent c = VoicePlugin.m131134c(this.f87283g);
                Message message = this.f87277a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                c.mo123314a(new AbstractC34417b.C34425g(message.getId()), new C33395d());
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123903a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            this.f87283g.mo123897a(new RunnableC33870e(this, str));
        }

        C33864b(VoicePlugin wVar, KeyBoard fVar) {
            this.f87283g = wVar;
            this.f87284h = fVar;
        }

        /* renamed from: a */
        private final void m131148a(String str, boolean z) {
            long j;
            C25969c cVar = this.f87283g.f87270s;
            RunnableC33873g gVar = new RunnableC33873g(this, str, z);
            if (z) {
                j = 0;
            } else {
                j = VoiceKBPlugin.f104495h.mo147973a(this.f87283g.f87268q);
            }
            cVar.mo92346a(gVar, j);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123904a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            this.f87283g.f87270s.mo92349b();
            VoicePlugin.m131133b(this.f87283g).mo123011a(this.f87284h.mo146836q(), this.f87284h.mo146837r(), richText);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123910b(String str, String str2, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            String q = this.f87284h.mo146836q();
            String r = this.f87284h.mo146837r();
            this.f87283g.f87260f = z;
            this.f87283g.f87261g = z2;
            this.f87283g.f87265n = false;
            String str3 = null;
            this.f87283g.f87262h = str3;
            this.f87283g.f87263l = str3;
            this.f87281e = str3;
            this.f87282f = false;
            this.f87283g.f87267p = false;
            Log.m165379d("ChatWindowLog", "onPrepareForRecord:" + str + '/' + str2);
            this.f87277a = VoicePlugin.m131133b(this.f87283g).mo123005a(q, r, str, str2);
            if (this.f87283g.f87260f) {
                this.f87283g.f87266o = UUID.randomUUID().toString();
                MessageHitPoint.f135779d.mo187550d(this.f87283g.f87266o);
            }
            this.f87283g.mo123897a(new RunnableC33868c(this, str));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123905a(String str, String str2, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            Log.m165389i("ChatWindowLog", "onAudioRecorded:" + str2 + '/' + i + '/' + z);
            if (this.f87277a == null) {
                Log.m165397w("ChatWindowLog", "onAudioRecorded recordingAudioMessage is null");
                return;
            }
            this.f87283g.f87260f = z;
            if (z) {
                this.f87278b = str;
                this.f87279c = str2;
                this.f87280d = i;
                if (this.f87283g.f87266o != null) {
                    String str3 = this.f87283g.f87266o;
                    if (str3 == null) {
                        Intrinsics.throwNpe();
                    }
                    m131148a(str3, false);
                    MessageHitPoint.f135779d.mo187556g(this.f87283g.f87266o);
                }
            }
            this.f87283g.mo123897a(new RunnableC33866b(this, z, i, str, str2));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123906a(String str, String str2, boolean z, boolean z2) {
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            Log.m165379d("ChatWindowLog", "onStartRecord:" + str + '/' + str2);
            if (this.f87283g.f87260f && (str3 = this.f87283g.f87266o) != null && (!StringsKt.isBlank(str3))) {
                MessageHitPoint.f135779d.mo187552e(this.f87283g.f87266o);
                String str4 = this.f87283g.f87266o;
                if (str4 == null) {
                    Intrinsics.throwNpe();
                }
                m131149c(str4);
            }
            Log.m165389i("ChatWindowLog", "onStartRecord：" + this.f87283g.f87266o);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123907a(ByteBuffer byteBuffer, int i, double d, boolean z) {
            this.f87283g.f87260f = z;
            this.f87283g.mo123897a(new RunnableC33871f(this, byteBuffer, z));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$j */
    public static final class RunnableC33881j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87317a;

        /* renamed from: b */
        final /* synthetic */ String f87318b;

        RunnableC33881j(VoicePlugin wVar, String str) {
            this.f87317a = wVar;
            this.f87318b = str;
        }

        public final void run() {
            LKUIToast.show(this.f87317a.mo122128i(), this.f87318b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$d */
    static final class C33875d extends Lambda implements Function0<Boolean> {
        public static final C33875d INSTANCE = new C33875d();

        C33875d() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            return b.mo134586n().mo134685a("messenger.message_inputbox_redesign");
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    public void as_() {
        super.as_();
        C36894a.m145605a().mo136207d();
        ChatAudioPushHandler aVar = this.f87275y;
        if (aVar != null) {
            aVar.mo123056b();
        }
        this.f87275y = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$g */
    static final class RunnableC33878g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87307a;

        RunnableC33878g(VoicePlugin wVar) {
            this.f87307a = wVar;
        }

        public final void run() {
            VoiceKBPlugin dVar = (VoiceKBPlugin) VoicePlugin.m131132a(this.f87307a).mo121967a("voice");
            SpannableStringBuilder a = C34357v.m133266a(this.f87307a.mo122128i(), UIHelper.getString(R.string.Lark_Chat_SendAudioAndTextPoorNetworkPlaceholder), this.f87307a.f87269r);
            a.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f87307a.mo122128i(), R.color.lkui_N500)), 0, a.length(), 33);
            if (dVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "spannable");
                dVar.mo147964a(a);
            }
            this.f87307a.f87267p = true;
        }
    }

    public VoicePlugin() {
        ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("audio-send");
        Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…yThreadPool(\"audio-send\")");
        this.f87273w = newSerialIODensityThreadPool;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f87271t = b.af();
        this.f87274x = C29990c.m110930b().mo134587o();
        this.f87272u = C32848e.m126401b();
        this.f87254A = LazyKt.lazy(C33875d.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$updateAudioText$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$l */
    public static final class RunnableC33885l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87325a;

        /* renamed from: b */
        final /* synthetic */ KeyBoard f87326b;

        /* renamed from: c */
        final /* synthetic */ String f87327c;

        /* renamed from: d */
        final /* synthetic */ String f87328d;

        /* renamed from: e */
        final /* synthetic */ boolean f87329e;

        /* renamed from: f */
        final /* synthetic */ boolean f87330f;

        /* renamed from: g */
        final /* synthetic */ int[] f87331g;

        public void run() {
            VoiceKBPlugin dVar;
            int i;
            String str;
            RichTextEmojiconEditText M;
            RichTextEmojiconEditText r;
            KeyBoard fVar = this.f87326b;
            RichText richText = null;
            if (fVar != null) {
                dVar = (VoiceKBPlugin) fVar.mo146819c("voice");
            } else {
                dVar = null;
            }
            if (dVar == null) {
                Intrinsics.throwNpe();
            }
            RichTextEmojiconEditText d = dVar.mo147969d();
            if (d != null) {
                if (this.f87325a.f87269r == null) {
                    this.f87325a.f87269r = new C34357v.C34361a(d);
                }
                if (this.f87325a.f87262h == null) {
                    if (!this.f87325a.mo123900b()) {
                        TextInputSupportPlugin cVar = (TextInputSupportPlugin) this.f87326b.mo146821d("text");
                        if (!(cVar == null || (r = cVar.mo147266r()) == null)) {
                            richText = r.getRichText();
                        }
                    } else {
                        RichTextInputShrinkPlugin dVar2 = (RichTextInputShrinkPlugin) this.f87326b.mo146821d("input_richtext_shrink");
                        if (!(dVar2 == null || (M = dVar2.mo147028M()) == null)) {
                            richText = M.getRichText();
                        }
                    }
                    if (richText != null) {
                        VoicePlugin wVar = this.f87325a;
                        if (wVar.f87261g) {
                            str = C59035h.m229211b(richText);
                        } else {
                            str = "";
                        }
                        wVar.f87262h = str;
                        VoicePlugin wVar2 = this.f87325a;
                        String str2 = wVar2.f87262h;
                        if (str2 == null) {
                            Intrinsics.throwNpe();
                        }
                        wVar2.f87264m = str2.length();
                    }
                }
                String str3 = this.f87327c;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(this.f87325a.f87263l)) {
                    MessageHitPoint.f135779d.mo187554f(this.f87328d);
                }
                String stringPlus = Intrinsics.stringPlus(this.f87325a.f87262h, str3);
                dVar.mo147966a(stringPlus, this.f87329e, this.f87330f);
                this.f87325a.f87263l = str3;
                if (this.f87330f) {
                    VoicePlugin wVar3 = this.f87325a;
                    String a = wVar3.mo123894a(VoicePlugin.m131135d(wVar3), this.f87325a.f87259e);
                    if (d == null) {
                        Intrinsics.throwNpe();
                    }
                    d.setHint(TextUtils.ellipsize(a, d.getPaint(), (float) d.getMeasuredWidth(), TextUtils.TruncateAt.END));
                    d.setOriginText(stringPlus);
                    d.setSelection(d.getText().length());
                    this.f87325a.f87265n = false;
                    this.f87325a.f87266o = "";
                    if (TextUtils.isEmpty(str4)) {
                        MessageHitPoint.f135779d.mo187561j(this.f87328d);
                    } else {
                        MessageHitPoint.f135779d.mo187560i(this.f87328d);
                    }
                } else {
                    int[] iArr = this.f87331g;
                    if (iArr == null || iArr.length <= 0) {
                        i = str3.length();
                    } else {
                        i = iArr[0];
                    }
                    SpannableStringBuilder a2 = C34357v.m133265a(this.f87325a.mo122128i(), stringPlus, this.f87325a.f87264m + Math.max(i, str3.length() - 3));
                    String str5 = stringPlus;
                    if (!TextUtils.isEmpty(str5)) {
                        C34357v.m133261a(this.f87325a.mo122128i(), a2, this.f87325a.f87269r);
                        if (d == null) {
                            Intrinsics.throwNpe();
                        }
                        d.setOriginText(a2);
                        d.setSelection(d.getText().length());
                    } else {
                        if (d == null) {
                            Intrinsics.throwNpe();
                        }
                        d.setOriginText(str5);
                    }
                    if (!this.f87325a.f87265n) {
                        this.f87325a.f87265n = true;
                        SpannableStringBuilder a3 = C34357v.m133266a(this.f87325a.mo122128i(), UIHelper.getString(R.string.Lark_Chat_AudioToTextSpeakTip), this.f87325a.f87269r);
                        a3.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f87325a.mo122128i(), R.color.lkui_N500)), 0, a3.length(), 33);
                        d.setHint(a3);
                    }
                }
            }
        }

        RunnableC33885l(VoicePlugin wVar, KeyBoard fVar, String str, String str2, boolean z, boolean z2, int[] iArr) {
            this.f87325a = wVar;
            this.f87326b = fVar;
            this.f87327c = str;
            this.f87328d = str2;
            this.f87329e = z;
            this.f87330f = z2;
            this.f87331g = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$toggleAudioText$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/ToggleTextOnAudioResponse;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "toggleTextOnAudioResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$k */
    public static final class C33882k implements IGetDataCallback<ToggleTextOnAudioResponse> {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87319a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34006a f87320b;

        /* renamed from: c */
        final /* synthetic */ boolean f87321c;

        /* renamed from: d */
        final /* synthetic */ String f87322d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$toggleAudioText$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$k$a */
        public static final class C33883a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C33882k f87323a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33883a(C33882k kVar) {
                this.f87323a = kVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                StringBuilder sb = new StringBuilder();
                sb.append("sendAudioMessage2Text success：");
                if (bool == null) {
                    Intrinsics.throwNpe();
                }
                sb.append(bool.booleanValue());
                Log.m165379d("ChatWindowLog", sb.toString());
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165379d("ChatWindowLog", "sendAudioMessage2Text error：" + errorResult.getErrorMsg());
                VoicePlugin wVar = this.f87323a.f87319a;
                if (errorResult.getErrorCode() != 5029) {
                    str = errorResult.getErrorMsg();
                } else {
                    str = UIHelper.getString(R.string.Lark_Chat_AudioConvertToTextError);
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "if (err.errorCode != 502…_AudioConvertToTextError)");
                wVar.mo123898a(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$toggleAudioText$1$onSuccess$2", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "doUpdateIfExist", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$k$b */
        public static final class C33884b extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

            /* renamed from: a */
            final /* synthetic */ C33882k f87324a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33884b(C33882k kVar) {
                this.f87324a = kVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
                Message message = aVar.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
                ((AudioContent) content).setNeedHideText(!this.f87324a.f87321c);
                return aVar;
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165379d("ChatWindowLog", "hide audio text fail:" + this.f87322d);
        }

        /* renamed from: a */
        public void onSuccess(ToggleTextOnAudioResponse toggleTextOnAudioResponse) {
            String str;
            Intrinsics.checkParameterIsNotNull(toggleTextOnAudioResponse, "toggleTextOnAudioResponse");
            AbstractC34006a aVar = this.f87320b;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo!!.getMessage()");
            Content content = message.getContent();
            if (content != null) {
                AudioContent audioContent = (AudioContent) content;
                if (this.f87321c && TextUtils.isEmpty(audioContent.getRecognizedText())) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    String locale = b.mo134587o().mo134745d().toString();
                    Intrinsics.checkExpressionValueIsNotNull(locale, "ChatModuleInstanceHolder…guageSetting().toString()");
                    if (TextUtils.isEmpty(locale)) {
                        str = "zh_ch";
                    } else if (locale != null) {
                        str = locale.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase()");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    this.f87319a.f87272u.mo121260a(this.f87322d, str, 16000, "opus", new C33883a(this));
                }
                VoicePlugin.m131134c(this.f87319a).mo123314a(new AbstractC34417b.C34425g(this.f87322d), new C33884b(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.AudioContent");
        }

        C33882k(VoicePlugin wVar, AbstractC34006a aVar, boolean z, String str) {
            this.f87319a = wVar;
            this.f87320b = aVar;
            this.f87321c = z;
            this.f87322d = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$onCreate$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "onToggleAudioTextClick", "", "messageId", "", "shown", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$f */
    public static final class C33877f extends MessageCallbackHandler {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87306a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33877f(VoicePlugin wVar) {
            this.f87306a = wVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
        /* renamed from: b */
        public void mo121941b(String str, boolean z) {
            if (str != null) {
                this.f87306a.mo123899a(str, z);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardComponent m131132a(VoicePlugin wVar) {
        IKeyboardComponent cVar = wVar.f87255a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IMessageSender m131133b(VoicePlugin wVar) {
        IMessageSender aVar = wVar.f87257c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ IMessageListComponent m131134c(VoicePlugin wVar) {
        IMessageListComponent iMessageListComponent = wVar.f87256b;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    /* renamed from: d */
    public static final /* synthetic */ Chat m131135d(VoicePlugin wVar) {
        Chat chat = wVar.f87258d;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        return chat;
    }

    /* renamed from: a */
    public final IKeyBoardPlugin mo123893a(KeyBoard fVar) {
        return new VoiceKBPlugin(false, new C33864b(this, fVar), new C33874c(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$sendAudioData$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/media/v1/UploadAudioDataResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "uploadAudioDataResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$i */
    public static final class C33880i implements IGetDataCallback<UploadAudioDataResponse> {

        /* renamed from: a */
        final /* synthetic */ AudioContent f87314a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f87315b;

        /* renamed from: c */
        final /* synthetic */ Message f87316c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f87315b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            Log.m165379d("ChatWindowLog", "sendAudioData-onError:" + this.f87316c.getId());
        }

        /* renamed from: a */
        public void onSuccess(UploadAudioDataResponse uploadAudioDataResponse) {
            String str;
            if (uploadAudioDataResponse != null) {
                AudioContent audioContent = this.f87314a;
                Integer num = uploadAudioDataResponse.sequence_id;
                Intrinsics.checkExpressionValueIsNotNull(num, "uploadAudioDataResponse.sequence_id");
                audioContent.setSequenceId(num.intValue());
                this.f87314a.setAudioToken(uploadAudioDataResponse.token);
                if (!TextUtils.isEmpty(uploadAudioDataResponse.audio2text)) {
                    this.f87314a.setRecognizedText(uploadAudioDataResponse.audio2text);
                }
                Log.m165379d("ChatWindowLog", "sendAudioData-token:" + uploadAudioDataResponse.token);
            }
            IGetDataCallback iGetDataCallback = this.f87315b;
            if (iGetDataCallback != null) {
                if (uploadAudioDataResponse != null) {
                    str = uploadAudioDataResponse.audio2text;
                } else {
                    str = "";
                }
                iGetDataCallback.onSuccess(str);
            }
            Log.m165379d("ChatWindowLog", "sendAudioData-onSuccess:" + this.f87316c.getId());
        }

        C33880i(AudioContent audioContent, IGetDataCallback iGetDataCallback, Message message) {
            this.f87314a = audioContent;
            this.f87315b = iGetDataCallback;
            this.f87316c = message;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/chat/v2/plugin/VoicePlugin$sendAudioData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/SendSpeechRecognitionResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "recognizeResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.plugin.w$h */
    public static final class C33879h implements IGetDataCallback<SendSpeechRecognitionResponse> {

        /* renamed from: a */
        final /* synthetic */ VoicePlugin f87308a;

        /* renamed from: b */
        final /* synthetic */ AudioContent f87309b;

        /* renamed from: c */
        final /* synthetic */ KeyBoard f87310c;

        /* renamed from: d */
        final /* synthetic */ int f87311d;

        /* renamed from: e */
        final /* synthetic */ IGetDataCallback f87312e;

        /* renamed from: f */
        final /* synthetic */ boolean f87313f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f87308a.mo123896a(this.f87310c, "", this.f87311d, "", true, new int[0], true);
            IGetDataCallback iGetDataCallback = this.f87312e;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            if (this.f87313f) {
                MessageHitPoint.f135779d.mo187534a(this.f87309b.getUploadId(), false);
                AppreciablePerformance.f104480a.mo147943b(1, errorResult.getDisplayMsg());
            }
            Log.m165379d("ChatWindowLog", errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
            String str;
            Intrinsics.checkParameterIsNotNull(sendSpeechRecognitionResponse, "recognizeResponse");
            if (Intrinsics.compare(sendSpeechRecognitionResponse.sequence_id.intValue(), this.f87309b.getSequenceId()) >= 0) {
                Boolean bool = sendSpeechRecognitionResponse.is_available;
                Intrinsics.checkExpressionValueIsNotNull(bool, "recognizeResponse.is_available");
                if (bool.booleanValue()) {
                    AudioContent audioContent = this.f87309b;
                    Integer num = sendSpeechRecognitionResponse.sequence_id;
                    Intrinsics.checkExpressionValueIsNotNull(num, "recognizeResponse.sequence_id");
                    audioContent.setSequenceId(num.intValue());
                    VoicePlugin wVar = this.f87308a;
                    KeyBoard fVar = this.f87310c;
                    String uploadId = this.f87309b.getUploadId();
                    int i = this.f87311d;
                    String str2 = sendSpeechRecognitionResponse.result;
                    Boolean bool2 = sendSpeechRecognitionResponse.is_end;
                    Intrinsics.checkExpressionValueIsNotNull(bool2, "recognizeResponse.is_end");
                    wVar.mo123896a(fVar, uploadId, i, str2, bool2.booleanValue(), C34438a.m133582a(sendSpeechRecognitionResponse.diff_index_slice), true);
                }
            }
            Boolean bool3 = sendSpeechRecognitionResponse.is_end;
            Intrinsics.checkExpressionValueIsNotNull(bool3, "recognizeResponse.is_end");
            if (bool3.booleanValue()) {
                MessageHitPoint.f135779d.mo187534a(this.f87309b.getUploadId(), true);
            }
            this.f87308a.mo123895a(sendSpeechRecognitionResponse);
            IGetDataCallback iGetDataCallback = this.f87312e;
            if (iGetDataCallback != null) {
                if (sendSpeechRecognitionResponse.result != null) {
                    str = sendSpeechRecognitionResponse.result;
                } else {
                    str = "";
                }
                iGetDataCallback.onSuccess(str);
            }
            Log.m165379d("ChatWindowLog", "audio2text:" + sendSpeechRecognitionResponse.result + "/" + sendSpeechRecognitionResponse.is_available + "/" + sendSpeechRecognitionResponse.is_end);
        }

        C33879h(VoicePlugin wVar, AudioContent audioContent, KeyBoard fVar, int i, IGetDataCallback iGetDataCallback, boolean z) {
            this.f87308a = wVar;
            this.f87309b = audioContent;
            this.f87310c = fVar;
            this.f87311d = i;
            this.f87312e = iGetDataCallback;
            this.f87313f = z;
        }
    }

    /* renamed from: a */
    public final void mo123895a(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
        if (sendSpeechRecognitionResponse != null) {
            String str = sendSpeechRecognitionResponse.result;
            Boolean bool = sendSpeechRecognitionResponse.is_end;
            if (TextUtils.isEmpty(str)) {
                Intrinsics.checkExpressionValueIsNotNull(bool, "isEnd");
                if (bool.booleanValue()) {
                    AppreciablePerformance.f104480a.mo147943b(3, "");
                    return;
                }
                return;
            }
            AppreciablePerformance.f104480a.mo147946d();
        }
    }

    /* renamed from: a */
    public final void mo123897a(Runnable runnable) {
        ExecutorService executorService = this.f87273w;
        if (executorService != null && !executorService.isShutdown()) {
            this.f87273w.execute(runnable);
        }
    }

    /* renamed from: a */
    public final String mo123894a(Chat chat, ChatChatter chatChatter) {
        String str;
        if (chat.isAllowPost()) {
            if (chat.getType() == Chat.Type.GROUP) {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SendTip, "name", chat.getName());
            } else {
                str = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SendTip, "name", C34340h.m133174a(chatChatter, ChatterNameDisplayRule.ALIAS_NAME));
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (chat.type == GROUP) …LIAS_NAME))\n            }");
            return str;
        }
        String string = UIHelper.getString(R.string.Lark_Group_GroupSettings_MsgRestriction_YouAreBanned_InputHint);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strin…n_YouAreBanned_InputHint)");
        return string;
    }

    @Override // com.ss.android.lark.chat.chatwindow.biz.plugin.core.IChatPlugin, com.ss.android.lark.chat.chatwindow.biz.plugin.core.BaseChatPlugin
    /* renamed from: a */
    public void mo122114a(IChatWindowApp dVar, C35219b bVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatApp");
        Intrinsics.checkParameterIsNotNull(bVar, "initData");
        super.mo122114a(dVar, bVar);
        if (!DesktopUtil.m144301a(mo122128i())) {
            Chat chat = bVar.f90956f;
            Intrinsics.checkExpressionValueIsNotNull(chat, "initData.chat");
            this.f87258d = chat;
            this.f87259e = bVar.f90957g;
            this.f87257c = dVar.mo123136g();
            this.f87256b = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            this.f87255a = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
            }
            cVar.mo121971a(new C33876e(this));
            IMessageListComponent iMessageListComponent = this.f87256b;
            if (iMessageListComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
            }
            iMessageListComponent.mo123312a(new C33877f(this));
            ChatAudioPushHandler aVar = new ChatAudioPushHandler(this);
            this.f87275y = aVar;
            if (aVar != null) {
                aVar.mo123055a();
            }
            Context i = mo122128i();
            if (i != null) {
                this.f87276z = C33103ae.from((FragmentActivity) i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final Message mo123892a(KeyBoard fVar, Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback<String> iGetDataCallback) {
        String str;
        int i2;
        String str2;
        Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
        Intrinsics.checkParameterIsNotNull(byteBuffer, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Log.m165379d("ChatWindowLog", "sendAudioData:" + message + '/' + i + '/' + z);
        if (message != null && message.getType() == Message.Type.AUDIO) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
            AudioContent audioContent = (AudioContent) content;
            if (audioContent != null) {
                str = audioContent.getUploadId();
            } else {
                str = null;
            }
            if (str == null) {
                return message;
            }
            if (z) {
                if (i == 1) {
                    i2 = 1;
                } else if (z2) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                if (z2) {
                    MessageHitPoint.f135779d.mo187558h(audioContent.getUploadId());
                }
                String string = UserSP.getInstance().getString("user_audio_2_text_locale", "zh_ch");
                AbstractC36510y yVar = this.f87274x;
                Intrinsics.checkExpressionValueIsNotNull(yVar, "mLanguageDependency");
                String locale = yVar.mo134745d().toString();
                Intrinsics.checkExpressionValueIsNotNull(locale, "mLanguageDependency.languageSetting.toString()");
                if (TextUtils.isEmpty(locale)) {
                    str2 = "zh_ch";
                } else if (locale != null) {
                    String lowerCase = locale.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    str2 = lowerCase;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                AppreciablePerformance aVar = AppreciablePerformance.f104480a;
                byte[] array = byteBuffer.array();
                Intrinsics.checkExpressionValueIsNotNull(array, "data.array()");
                aVar.mo147941a(array);
                IInnerMessageService iInnerMessageService = this.f87272u;
                String uploadId = audioContent.getUploadId();
                byte[] array2 = byteBuffer.array();
                Chat chat = this.f87258d;
                if (chat == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chat");
                }
                iInnerMessageService.mo121257a(uploadId, i, str2, string, array2, i2, 16000, "opus", true, chat.getId(), new C33879h(this, audioContent, fVar, i, iGetDataCallback, z2));
            } else {
                this.f87272u.mo121258a(audioContent.getUploadId(), i, byteBuffer.array(), z, z2, "", new C33880i(audioContent, iGetDataCallback, message));
            }
        }
        return message;
    }

    /* renamed from: a */
    public final void mo123896a(KeyBoard fVar, String str, int i, String str2, boolean z, int[] iArr, boolean z2) {
        Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
        Log.m165379d("ChatWindowLog", "updatekeyboardText:" + i + '/' + str2 + '/' + this.f87260f + '/' + z);
        if (TextUtils.equals(str, this.f87266o)) {
            String str3 = this.f87263l;
            if (str3 == null || !Intrinsics.areEqual(str3, str2) || z) {
                if (!this.f87268q && z) {
                    this.f87268q = true;
                }
                if (this.f87260f) {
                    this.f87270s.mo92345a(new RunnableC33885l(this, fVar, str2, str, z2, z, iArr));
                }
            }
        }
    }
}
