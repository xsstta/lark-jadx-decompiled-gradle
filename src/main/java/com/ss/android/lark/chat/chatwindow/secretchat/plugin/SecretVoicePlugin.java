package com.ss.android.lark.chat.chatwindow.secretchat.plugin;

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
import com.ss.android.lark.keyboard.plugin.tool.voice.statistics.AppreciablePerformance;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.statistics.message.MessageHitPoint;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001\\B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0002J\u001a\u00102\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J\u0018\u00107\u001a\u00020/2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020/H\u0016J\u0018\u0010=\u001a\u00020/2\u0006\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020@H\u0016J0\u0010A\u001a\u00020/2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u00102\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u00020GH\u0016JJ\u0010H\u001a\u0004\u0018\u00010I2\u0006\u00105\u001a\u0002062\b\u0010J\u001a\u0004\u0018\u00010I2\u0006\u0010C\u001a\u00020\u00132\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\t2\u0006\u0010E\u001a\u00020\t2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010OJ\u0012\u0010P\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0002J\u0010\u0010S\u001a\u00020/2\u0006\u0010T\u001a\u00020\u0010H\u0002J\u0018\u0010U\u001a\u00020/2\u0006\u0010B\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\tH\u0002JD\u0010W\u001a\u00020/2\u0006\u00105\u001a\u0002062\b\u0010X\u001a\u0004\u0018\u00010\u00102\u0006\u0010Y\u001a\u00020\u00132\b\u0010Z\u001a\u0004\u0018\u00010\u00102\u0006\u0010E\u001a\u00020\t2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010[\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \"*\u0004\u0018\u00010!0!X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\n \"*\u0004\u0018\u00010%0%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X.¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin;", "Lcom/ss/android/lark/chat/chatwindow/biz/plugin/core/BaseChatPlugin;", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler$IAudioPushListener;", "()V", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "chatChatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "isEnableRichTextInput", "", "()Z", "isEnableRichTextInput$delegate", "Lkotlin/Lazy;", "keyboardComponent", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent;", "mAudio2TextContent", "", "mAudio2TextId", "mAudio2TextIndex", "", "mAudioSendExecutor", "Ljava/util/concurrent/ExecutorService;", "mCancelableUIExecutor", "Lcom/larksuite/framework/callback/CancelableCallbackExecutor;", "mChatAudioPushHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/push/ChatAudioPushHandler;", "mHasFinalAudio2TextResp", "mIsAudio2TextTimeout", "mIsLoading", "mIsOnlyText", "mKeyboardLoadingCallback", "Lcom/ss/android/lark/chat/utils/SpannableStringUtils$DrawableCallback;", "mLanguageDependency", "Lcom/ss/android/lark/dependency/ILanguageDependency;", "kotlin.jvm.PlatformType", "mLastAudio2TextContent", "mMessageService", "Lcom/ss/android/lark/chat/service/IInnerMessageService;", "mNeedAudio2Text", "mTranslateHandler", "Lcom/ss/android/lark/chat/chatwindow/chat/menu/handler/ITranslateModelHandler;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "messageListComponent", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/IMessageListComponent;", "messageSender", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/IMessageSender;", "executeSerialTaskInBackground", "", "runnable", "Ljava/lang/Runnable;", "getKeyboardHint", "getVoicePlugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "onCreate", "chatApp", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/IChatWindowApp;", "initData", "Lcom/ss/android/lark/chatwindow/model/data/ChatWindowInitData;", "onDestroy", "onPushSpeechRecognitionStatus", "srcId", UpdateKey.STATUS, "Lcom/bytedance/lark/pb/im/v1/PushSpeechRecognitionStatus$Status;", "onPushUpdateAudioText", "messageId", "sequenceId", "audioText", "isFinish", "diffIndex", "", "sendAudioData", "Lcom/ss/android/lark/chat/entity/message/Message;", "message", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Ljava/nio/ByteBuffer;", "needRecognized", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "sendVoiceRecordPoint", "recognizeResponse", "Lcom/bytedance/lark/pb/im/v1/SendSpeechRecognitionResponse;", "showToast", "tips", "toggleAudioText", "shown", "updateAudioText", "uploadId", "seqId", "audio2Text", "fromResp", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g */
public final class SecretVoicePlugin extends BaseChatPlugin implements ChatAudioPushHandler.IAudioPushListener {

    /* renamed from: u */
    public static final Companion f87435u = new Companion(null);

    /* renamed from: a */
    public IKeyboardComponent f87436a;

    /* renamed from: b */
    public IMessageListComponent f87437b;

    /* renamed from: c */
    public IMessageSender f87438c;

    /* renamed from: d */
    public Chat f87439d;

    /* renamed from: e */
    public ChatChatter f87440e;

    /* renamed from: f */
    public boolean f87441f;

    /* renamed from: g */
    public boolean f87442g;

    /* renamed from: h */
    public String f87443h;

    /* renamed from: l */
    public String f87444l;

    /* renamed from: m */
    public int f87445m;

    /* renamed from: n */
    public boolean f87446n;

    /* renamed from: o */
    public String f87447o;

    /* renamed from: p */
    public boolean f87448p;

    /* renamed from: q */
    public boolean f87449q;

    /* renamed from: r */
    public C34357v.C34361a f87450r;

    /* renamed from: s */
    public C25969c f87451s = new C25969c(new Handler(Looper.getMainLooper()));

    /* renamed from: t */
    public final IInnerMessageService f87452t;

    /* renamed from: v */
    private ExecutorService f87453v;

    /* renamed from: w */
    private final AbstractC36510y f87454w;

    /* renamed from: x */
    private ChatAudioPushHandler f87455x;

    /* renamed from: y */
    private AbstractC33134w<AbstractC34006a> f87456y;

    /* renamed from: z */
    private final Lazy f87457z;

    /* renamed from: b */
    public final boolean mo123975b() {
        return ((Boolean) this.f87457z.getValue()).booleanValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$Companion;", "", "()V", "AUDIO_RECOGNIZE_DEFAULT_LOCALE", "", "AUDIO_RECOGNIZE_FORMAT", "AUDIO_RECOGNIZE_RATE", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$getVoicePlugin$plugin$2", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IVoiceDependency;", "isAudio2TextEnabled", "", "isAudioWithTextEnabled", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$c */
    public static final class C33929c implements IVoiceDependency {
        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: a */
        public boolean mo123921a() {
            return false;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: b */
        public boolean mo123922b() {
            return false;
        }

        C33929c() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IVoiceDependency
        /* renamed from: c */
        public boolean mo123923c() {
            return IVoiceDependency.C41034a.m162690a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$onCreate$1", "Lcom/ss/android/lark/chat/chatwindow/biz/component/keyboard/IKeyboardComponent$IKeyboardComponentCallbacks;", "onKeyboardReady", "", "keyboard", "Lcom/ss/android/lark/keyboard/KeyBoard;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$e */
    public static final class C33931e implements IKeyboardComponent.IKeyboardComponentCallbacks {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87473a;

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
        C33931e(SecretVoicePlugin gVar) {
            this.f87473a = gVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.biz.component.keyboard.IKeyboardComponent.IKeyboardComponentCallbacks
        /* renamed from: a */
        public void mo122066a(KeyBoard fVar) {
            Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
            SecretVoicePlugin.m131295a(this.f87473a).mo121978a("voice", this.f87473a.mo123968a(fVar));
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
            mo123973a(string);
        }
    }

    @Override // com.ss.android.lark.chat.chatwindow.chat.v2.push.ChatAudioPushHandler.IAudioPushListener
    /* renamed from: a */
    public void mo123058a(String str, PushSpeechRecognitionStatus.Status status) {
        Intrinsics.checkParameterIsNotNull(str, "srcId");
        Intrinsics.checkParameterIsNotNull(status, UpdateKey.STATUS);
        Log.m165389i("ChatWindowLog", "on push speech recognition status:" + str + '/' + status);
        if (TextUtils.equals(str, this.f87447o) && status == PushSpeechRecognitionStatus.Status.Timeout && !this.f87448p) {
            this.f87451s.mo92345a(new RunnableC33933g(this));
        }
    }

    /* renamed from: a */
    public final void mo123974a(String str, boolean z) {
        IMessageListComponent iMessageListComponent = this.f87437b;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        AbstractC34006a t = iMessageListComponent.mo123331t(str);
        if (t != null) {
            Message message = t.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
            if (message.getType() == Message.Type.AUDIO) {
                Message message2 = t.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
                if (message2.isSourceFileDelete()) {
                    String string = UIHelper.getString(R.string.Lark_Message_AudioMessageWithdrawMessageToast);
                    Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…sageWithdrawMessageToast)");
                    mo123973a(string);
                    return;
                }
                this.f87452t.mo121268b(str, z, (IGetDataCallback) mo122129j().wrapAndAddCallback(new C33937k(this, t, z, str)));
            }
        }
    }

    /* renamed from: a */
    public final void mo123973a(String str) {
        UICallbackExecutor.execute(new RunnableC33936j(this, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\bH\u0016J(\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0003H\u0016J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J(\u0010 \u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J*\u0010!\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0005H\u0002J\u0010\u0010)\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u0003H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$getVoicePlugin$plugin$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IRecordListener;", "audio2TextError", "", "isAudio2Text", "", "localCid", "localDuration", "", "localFileName", "recordingAudioMessage", "Lcom/ss/android/lark/chat/entity/message/Message;", "onAudio2Text", "", "onAudioRecorded", "strFileName", "cid", "duration", "needRecognized", "onCancelRecord", "onClearResult", "onPanelHeightChanged", "height", "onPrepareForRecord", "onlyText", "onSendAudio", "onSendAudioText", "text", "onSendText", "content", "richText", "Lcom/ss/android/lark/widget/richtext/RichText;", "onStartRecord", "onUpdateAudio", "buffer", "Ljava/nio/ByteBuffer;", "volume", "", "updateFinishState", "uploadId", "autoStop", "updateStartState", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$b */
    public static final class C33924b implements IRecordListener {

        /* renamed from: a */
        public Message f87458a;

        /* renamed from: b */
        public String f87459b;

        /* renamed from: c */
        public String f87460c;

        /* renamed from: d */
        public int f87461d;

        /* renamed from: e */
        public String f87462e;

        /* renamed from: f */
        public boolean f87463f;

        /* renamed from: g */
        final /* synthetic */ SecretVoicePlugin f87464g;

        /* renamed from: h */
        final /* synthetic */ KeyBoard f87465h;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123907a(ByteBuffer byteBuffer, int i, double d, boolean z) {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123901a() {
            MessageHitPoint.f135779d.mo187562k(this.f87464g.f87447o);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123908b() {
            this.f87464g.mo123972a(new RunnableC33926b(this));
            MessageHitPoint.f135779d.mo187530a("audio_and_text", this.f87461d, TextUtils.isEmpty(this.f87464g.f87444l));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: c */
        public void mo123911c() {
            this.f87464g.f87441f = true;
            this.f87463f = true;
            this.f87464g.mo123972a(new RunnableC33925a(this));
            if (this.f87464g.f87447o != null) {
                String str = this.f87464g.f87447o;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                m131311a(str, this.f87464g.f87448p);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$getVoicePlugin$plugin$1$onAudio2Text$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$b$a */
        public static final class RunnableC33925a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33924b f87466a;

            public void run() {
                if (this.f87466a.f87458a == null) {
                    Log.m165397w("ChatWindowLog", "onAudio2Text recordingAudioMessage is null");
                    return;
                }
                Message message = this.f87466a.f87458a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                AudioContent audioContent = (AudioContent) content;
                SecretVoicePlugin gVar = this.f87466a.f87464g;
                KeyBoard fVar = this.f87466a.f87465h;
                Message message2 = this.f87466a.f87458a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                int localSequenceId = audioContent.getLocalSequenceId();
                ByteBuffer wrap = ByteBuffer.wrap(new byte[0]);
                Intrinsics.checkExpressionValueIsNotNull(wrap, "ByteBuffer.wrap(ByteArray(0))");
                gVar.mo123967a(fVar, message2, localSequenceId, wrap, true, true, (IGetDataCallback<String>) null);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            RunnableC33925a(C33924b bVar) {
                this.f87466a = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$getVoicePlugin$plugin$1$onSendAudio$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$b$b */
        public static final class RunnableC33926b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33924b f87467a;

            public void run() {
                if (this.f87467a.f87458a == null || this.f87467a.f87459b == null) {
                    Log.m165397w("ChatWindowLog", "onSendAudio recordingAudioMessage or localFileName is null");
                    return;
                }
                Message message = this.f87467a.f87458a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                ((AudioContent) content).setUploadId(null);
                IMessageSender b = SecretVoicePlugin.m131296b(this.f87467a.f87464g);
                Message message2 = this.f87467a.f87458a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                String str = this.f87467a.f87459b;
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                b.mo123008a(message2, str, this.f87467a.f87460c, this.f87467a.f87461d);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            RunnableC33926b(C33924b bVar) {
                this.f87467a = bVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$getVoicePlugin$plugin$1$onSendAudioText$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$b$c */
        public static final class RunnableC33927c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33924b f87468a;

            /* renamed from: b */
            final /* synthetic */ String f87469b;

            public void run() {
                if (this.f87468a.f87458a == null || this.f87468a.f87459b == null) {
                    Log.m165397w("ChatWindowLog", "onSendAudioText recordingAudioMessage or localFileName is null");
                    return;
                }
                Message message = this.f87468a.f87458a;
                if (message == null) {
                    Intrinsics.throwNpe();
                }
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "recordingAudioMessage!!.getContent<AudioContent>()");
                ((AudioContent) content).setUploadId(null);
                IMessageSender b = SecretVoicePlugin.m131296b(this.f87468a.f87464g);
                Message message2 = this.f87468a.f87458a;
                if (message2 == null) {
                    Intrinsics.throwNpe();
                }
                String str = this.f87469b;
                String str2 = this.f87468a.f87459b;
                if (str2 == null) {
                    Intrinsics.throwNpe();
                }
                String str3 = this.f87468a.f87460c;
                if (str3 == null) {
                    Intrinsics.throwNpe();
                }
                b.mo123009a(message2, str, str2, str3, this.f87468a.f87461d);
                if (!TextUtils.equals(this.f87469b, this.f87468a.f87464g.f87444l)) {
                    MessageHitPoint.f135779d.mo187563l(this.f87468a.f87464g.f87447o);
                }
            }

            RunnableC33927c(C33924b bVar, String str) {
                this.f87468a = bVar;
                this.f87469b = str;
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$b$d */
        public static final class RunnableC33928d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C33924b f87470a;

            /* renamed from: b */
            final /* synthetic */ String f87471b;

            /* renamed from: c */
            final /* synthetic */ boolean f87472c;

            RunnableC33928d(C33924b bVar, String str, boolean z) {
                this.f87470a = bVar;
                this.f87471b = str;
                this.f87472c = z;
            }

            public final void run() {
                Log.m165379d("ChatWindowLog", "updateFinishState:" + this.f87470a.f87464g.f87444l + '/' + this.f87470a.f87464g.f87447o + '/' + this.f87471b);
                this.f87470a.f87464g.mo123971a(this.f87470a.f87465h, this.f87471b, 0, this.f87470a.f87464g.f87444l, true, new int[0], false);
                if (!TextUtils.isEmpty(this.f87470a.f87462e)) {
                    Log.m165397w("ChatWindowLog", "updateFinishState:" + this.f87471b + '/' + this.f87470a.f87462e);
                    MessageHitPoint.Companion aVar = MessageHitPoint.f135779d;
                    boolean z = this.f87470a.f87463f;
                    String str = this.f87470a.f87462e;
                    if (str == null) {
                        Intrinsics.throwNpe();
                    }
                    aVar.mo187538a(z, str);
                    if (this.f87470a.f87463f && !this.f87472c) {
                        C35212a.m137531a(this.f87470a.f87464g.mo122128i(), "", UIUtils.getString(this.f87470a.f87464g.mo122128i(), R.string.Lark_Chat_AudioConvertedFailedOnlySendText));
                    }
                }
            }
        }

        /* renamed from: c */
        private final void m131312c(String str) {
            this.f87464g.f87449q = false;
            this.f87464g.mo123971a(this.f87465h, str, 0, "", false, new int[0], false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123902a(int i) {
            KeyBoard fVar = this.f87465h;
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
            if (this.f87458a != null) {
                IMessageListComponent c = SecretVoicePlugin.m131297c(this.f87464g);
                Message message = this.f87458a;
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
            this.f87464g.mo123972a(new RunnableC33927c(this, str));
        }

        C33924b(SecretVoicePlugin gVar, KeyBoard fVar) {
            this.f87464g = gVar;
            this.f87465h = fVar;
        }

        /* renamed from: a */
        private final void m131311a(String str, boolean z) {
            long j;
            C25969c cVar = this.f87464g.f87451s;
            RunnableC33928d dVar = new RunnableC33928d(this, str, z);
            if (z) {
                j = 0;
            } else {
                j = VoiceKBPlugin.f104495h.mo147973a(this.f87464g.f87449q);
            }
            cVar.mo92346a(dVar, j);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123904a(String str, RichText richText) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(richText, "richText");
            this.f87464g.f87451s.mo92349b();
            SecretVoicePlugin.m131296b(this.f87464g).mo123011a(this.f87465h.mo146836q(), this.f87465h.mo146837r(), richText);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: b */
        public void mo123910b(String str, String str2, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            String q = this.f87465h.mo146836q();
            String r = this.f87465h.mo146837r();
            this.f87464g.f87441f = z;
            this.f87464g.f87442g = z2;
            this.f87464g.f87446n = false;
            String str3 = null;
            this.f87464g.f87443h = str3;
            this.f87464g.f87444l = str3;
            this.f87462e = str3;
            this.f87463f = false;
            this.f87464g.f87448p = false;
            Log.m165379d("ChatWindowLog", "onPrepareForRecord:" + str + '/' + str2);
            this.f87458a = SecretVoicePlugin.m131296b(this.f87464g).mo123005a(q, r, str, str2);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123905a(String str, String str2, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            Log.m165379d("ChatWindowLog", "onAudioRecorded:" + str + '/' + str2 + '/' + i + '/' + z);
            if (this.f87458a == null) {
                Log.m165397w("ChatWindowLog", "onAudioRecorded recordingAudioMessage is null");
                return;
            }
            IMessageSender b = SecretVoicePlugin.m131296b(this.f87464g);
            Message message = this.f87458a;
            if (message == null) {
                Intrinsics.throwNpe();
            }
            b.mo123008a(message, str, str2, i);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.IRecordListener
        /* renamed from: a */
        public void mo123906a(String str, String str2, boolean z, boolean z2) {
            String str3;
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            Log.m165379d("ChatWindowLog", "onStartRecord:" + str + '/' + str2);
            if (this.f87464g.f87441f && (str3 = this.f87464g.f87447o) != null && (!StringsKt.isBlank(str3))) {
                MessageHitPoint.f135779d.mo187552e(this.f87464g.f87447o);
                String str4 = this.f87464g.f87447o;
                if (str4 == null) {
                    Intrinsics.throwNpe();
                }
                m131312c(str4);
            }
            Log.m165379d("ChatWindowLog", "onStartRecord：" + this.f87464g.f87447o);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$j */
    public static final class RunnableC33936j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87485a;

        /* renamed from: b */
        final /* synthetic */ String f87486b;

        RunnableC33936j(SecretVoicePlugin gVar, String str) {
            this.f87485a = gVar;
            this.f87486b = str;
        }

        public final void run() {
            LKUIToast.show(this.f87485a.mo122128i(), this.f87486b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$d */
    static final class C33930d extends Lambda implements Function0<Boolean> {
        public static final C33930d INSTANCE = new C33930d();

        C33930d() {
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
        ChatAudioPushHandler aVar = this.f87455x;
        if (aVar != null) {
            aVar.mo123056b();
        }
        this.f87455x = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$g */
    static final class RunnableC33933g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87475a;

        RunnableC33933g(SecretVoicePlugin gVar) {
            this.f87475a = gVar;
        }

        public final void run() {
            VoiceKBPlugin dVar = (VoiceKBPlugin) SecretVoicePlugin.m131295a(this.f87475a).mo121967a("voice");
            SpannableStringBuilder a = C34357v.m133266a(this.f87475a.mo122128i(), UIHelper.getString(R.string.Lark_Chat_SendAudioAndTextPoorNetworkPlaceholder), this.f87475a.f87450r);
            a.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f87475a.mo122128i(), R.color.lkui_N500)), 0, a.length(), 33);
            if (dVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(a, "spannable");
                dVar.mo147964a(a);
            }
            this.f87475a.f87448p = true;
        }
    }

    public SecretVoicePlugin() {
        ExecutorService newSerialIODensityThreadPool = CoreThreadPool.getDefault().newSerialIODensityThreadPool("audio-send");
        Intrinsics.checkExpressionValueIsNotNull(newSerialIODensityThreadPool, "CoreThreadPool.getDefaul…yThreadPool(\"audio-send\")");
        this.f87453v = newSerialIODensityThreadPool;
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        this.f87454w = b.mo134587o();
        this.f87452t = C32848e.m126401b();
        this.f87457z = LazyKt.lazy(C33930d.INSTANCE);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$updateAudioText$1", "Ljava/lang/Runnable;", "run", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$l */
    public static final class RunnableC33940l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87493a;

        /* renamed from: b */
        final /* synthetic */ KeyBoard f87494b;

        /* renamed from: c */
        final /* synthetic */ String f87495c;

        /* renamed from: d */
        final /* synthetic */ String f87496d;

        /* renamed from: e */
        final /* synthetic */ boolean f87497e;

        /* renamed from: f */
        final /* synthetic */ boolean f87498f;

        /* renamed from: g */
        final /* synthetic */ int[] f87499g;

        public void run() {
            VoiceKBPlugin dVar;
            int i;
            String str;
            RichTextEmojiconEditText M;
            RichTextEmojiconEditText r;
            KeyBoard fVar = this.f87494b;
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
                if (this.f87493a.f87450r == null) {
                    this.f87493a.f87450r = new C34357v.C34361a(d);
                }
                if (this.f87493a.f87443h == null) {
                    if (!this.f87493a.mo123975b()) {
                        TextInputSupportPlugin cVar = (TextInputSupportPlugin) this.f87494b.mo146821d("text");
                        if (!(cVar == null || (r = cVar.mo147266r()) == null)) {
                            richText = r.getRichText();
                        }
                    } else {
                        RichTextInputShrinkPlugin dVar2 = (RichTextInputShrinkPlugin) this.f87494b.mo146821d("input_richtext_shrink");
                        if (!(dVar2 == null || (M = dVar2.mo147028M()) == null)) {
                            richText = M.getRichText();
                        }
                    }
                    if (richText != null) {
                        SecretVoicePlugin gVar = this.f87493a;
                        if (gVar.f87442g) {
                            str = C59035h.m229211b(richText);
                        } else {
                            str = "";
                        }
                        gVar.f87443h = str;
                        SecretVoicePlugin gVar2 = this.f87493a;
                        String str2 = gVar2.f87443h;
                        if (str2 == null) {
                            Intrinsics.throwNpe();
                        }
                        gVar2.f87445m = str2.length();
                    }
                }
                String str3 = this.f87495c;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (!TextUtils.isEmpty(str4) && TextUtils.isEmpty(this.f87493a.f87444l)) {
                    MessageHitPoint.f135779d.mo187554f(this.f87496d);
                }
                String stringPlus = Intrinsics.stringPlus(this.f87493a.f87443h, str3);
                dVar.mo147966a(stringPlus, this.f87497e, this.f87498f);
                this.f87493a.f87444l = str3;
                if (this.f87498f) {
                    SecretVoicePlugin gVar3 = this.f87493a;
                    String a = gVar3.mo123969a(SecretVoicePlugin.m131298d(gVar3), this.f87493a.f87440e);
                    if (d == null) {
                        Intrinsics.throwNpe();
                    }
                    d.setHint(TextUtils.ellipsize(a, d.getPaint(), (float) d.getMeasuredWidth(), TextUtils.TruncateAt.END));
                    d.setOriginText(stringPlus);
                    d.setSelection(d.getText().length());
                    this.f87493a.f87446n = false;
                    this.f87493a.f87447o = "";
                    if (TextUtils.isEmpty(str4)) {
                        MessageHitPoint.f135779d.mo187561j(this.f87496d);
                    } else {
                        MessageHitPoint.f135779d.mo187560i(this.f87496d);
                    }
                } else {
                    int[] iArr = this.f87499g;
                    if (iArr == null || iArr.length <= 0) {
                        i = str3.length();
                    } else {
                        i = iArr[0];
                    }
                    SpannableStringBuilder a2 = C34357v.m133265a(this.f87493a.mo122128i(), stringPlus, this.f87493a.f87445m + Math.max(i, str3.length() - 3));
                    String str5 = stringPlus;
                    if (!TextUtils.isEmpty(str5)) {
                        C34357v.m133261a(this.f87493a.mo122128i(), a2, this.f87493a.f87450r);
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
                    if (!this.f87493a.f87446n) {
                        this.f87493a.f87446n = true;
                        SpannableStringBuilder a3 = C34357v.m133266a(this.f87493a.mo122128i(), UIHelper.getString(R.string.Lark_Chat_AudioToTextSpeakTip), this.f87493a.f87450r);
                        a3.setSpan(new ForegroundColorSpan(UIUtils.getColor(this.f87493a.mo122128i(), R.color.lkui_N500)), 0, a3.length(), 33);
                        d.setHint(a3);
                    }
                }
            }
        }

        RunnableC33940l(SecretVoicePlugin gVar, KeyBoard fVar, String str, String str2, boolean z, boolean z2, int[] iArr) {
            this.f87493a = gVar;
            this.f87494b = fVar;
            this.f87495c = str;
            this.f87496d = str2;
            this.f87497e = z;
            this.f87498f = z2;
            this.f87499g = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$toggleAudioText$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/ToggleTextOnAudioResponse;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "toggleTextOnAudioResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$k */
    public static final class C33937k implements IGetDataCallback<ToggleTextOnAudioResponse> {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87487a;

        /* renamed from: b */
        final /* synthetic */ AbstractC34006a f87488b;

        /* renamed from: c */
        final /* synthetic */ boolean f87489c;

        /* renamed from: d */
        final /* synthetic */ String f87490d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$toggleAudioText$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "aBoolean", "(Ljava/lang/Boolean;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$k$a */
        public static final class C33938a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C33937k f87491a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33938a(C33937k kVar) {
                this.f87491a = kVar;
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
                SecretVoicePlugin gVar = this.f87491a.f87487a;
                if (errorResult.getErrorCode() != 5029) {
                    str = errorResult.getErrorMsg();
                } else {
                    str = UIHelper.getString(R.string.Lark_Chat_AudioConvertToTextError);
                }
                Intrinsics.checkExpressionValueIsNotNull(str, "if (err.errorCode != 502…_AudioConvertToTextError)");
                gVar.mo123973a(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$toggleAudioText$1$onSuccess$2", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "doUpdateIfExist", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$k$b */
        public static final class C33939b extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

            /* renamed from: a */
            final /* synthetic */ C33937k f87492a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C33939b(C33937k kVar) {
                this.f87492a = kVar;
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public AbstractC34006a mo122917a(AbstractC34006a aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
                Message message = aVar.getMessage();
                Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
                ((AudioContent) content).setNeedHideText(!this.f87492a.f87489c);
                return aVar;
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
            Log.m165379d("ChatWindowLog", "hide audio text fail:" + this.f87490d);
        }

        /* renamed from: a */
        public void onSuccess(ToggleTextOnAudioResponse toggleTextOnAudioResponse) {
            String str;
            Intrinsics.checkParameterIsNotNull(toggleTextOnAudioResponse, "toggleTextOnAudioResponse");
            AbstractC34006a aVar = this.f87488b;
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo!!.getMessage()");
            Content content = message.getContent();
            if (content != null) {
                AudioContent audioContent = (AudioContent) content;
                if (this.f87489c && TextUtils.isEmpty(audioContent.getRecognizedText())) {
                    AbstractC36474h b = C29990c.m110930b();
                    Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
                    String locale = b.mo134587o().mo134745d().toString();
                    Intrinsics.checkExpressionValueIsNotNull(locale, "ChatModuleInstanceHolder…              .toString()");
                    if (TextUtils.isEmpty(locale)) {
                        str = "zh_ch";
                    } else if (locale != null) {
                        str = locale.toLowerCase();
                        Intrinsics.checkExpressionValueIsNotNull(str, "(this as java.lang.String).toLowerCase()");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    this.f87487a.f87452t.mo121260a(this.f87490d, str, 16000, "opus", new C33938a(this));
                }
                SecretVoicePlugin.m131297c(this.f87487a).mo123314a(new AbstractC34417b.C34425g(this.f87490d), new C33939b(this));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.AudioContent");
        }

        C33937k(SecretVoicePlugin gVar, AbstractC34006a aVar, boolean z, String str) {
            this.f87487a = gVar;
            this.f87488b = aVar;
            this.f87489c = z;
            this.f87490d = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$onCreate$2", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/message/MessageCallbackHandler;", "onToggleAudioTextClick", "", "messageId", "", "shown", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$f */
    public static final class C33932f extends MessageCallbackHandler {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87474a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33932f(SecretVoicePlugin gVar) {
            this.f87474a = gVar;
        }

        @Override // com.ss.android.lark.chat.chatwindow.chat.v2.component.message.MessageCallbackHandler, com.ss.android.lark.chat.chatwindow.chat.p1613b.p1615b.AbstractC33132u
        /* renamed from: b */
        public void mo121941b(String str, boolean z) {
            if (str != null) {
                this.f87474a.mo123974a(str, z);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyboardComponent m131295a(SecretVoicePlugin gVar) {
        IKeyboardComponent cVar = gVar.f87436a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IMessageSender m131296b(SecretVoicePlugin gVar) {
        IMessageSender aVar = gVar.f87438c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageSender");
        }
        return aVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ IMessageListComponent m131297c(SecretVoicePlugin gVar) {
        IMessageListComponent iMessageListComponent = gVar.f87437b;
        if (iMessageListComponent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
        }
        return iMessageListComponent;
    }

    /* renamed from: d */
    public static final /* synthetic */ Chat m131298d(SecretVoicePlugin gVar) {
        Chat chat = gVar.f87439d;
        if (chat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chat");
        }
        return chat;
    }

    /* renamed from: a */
    public final IKeyBoardPlugin mo123968a(KeyBoard fVar) {
        return new VoiceKBPlugin(true, new C33924b(this, fVar), new C33929c());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$sendAudioData$2", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/media/v1/UploadAudioDataResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "uploadAudioDataResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$i */
    public static final class C33935i implements IGetDataCallback<UploadAudioDataResponse> {

        /* renamed from: a */
        final /* synthetic */ AudioContent f87482a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f87483b;

        /* renamed from: c */
        final /* synthetic */ Message f87484c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f87483b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            Log.m165379d("ChatWindowLog", "sendAudioData-onError:" + this.f87484c.getId());
        }

        /* renamed from: a */
        public void onSuccess(UploadAudioDataResponse uploadAudioDataResponse) {
            String str;
            if (uploadAudioDataResponse != null) {
                AudioContent audioContent = this.f87482a;
                Integer num = uploadAudioDataResponse.sequence_id;
                Intrinsics.checkExpressionValueIsNotNull(num, "uploadAudioDataResponse.sequence_id");
                audioContent.setSequenceId(num.intValue());
                this.f87482a.setAudioToken(uploadAudioDataResponse.token);
                if (!TextUtils.isEmpty(uploadAudioDataResponse.audio2text)) {
                    this.f87482a.setRecognizedText(uploadAudioDataResponse.audio2text);
                }
                Log.m165379d("ChatWindowLog", "sendAudioData-token:" + uploadAudioDataResponse.token);
            }
            IGetDataCallback iGetDataCallback = this.f87483b;
            if (iGetDataCallback != null) {
                if (uploadAudioDataResponse != null) {
                    str = uploadAudioDataResponse.audio2text;
                } else {
                    str = "";
                }
                iGetDataCallback.onSuccess(str);
            }
            Log.m165379d("ChatWindowLog", "sendAudioData-onSuccess:" + this.f87484c.getId());
        }

        C33935i(AudioContent audioContent, IGetDataCallback iGetDataCallback, Message message) {
            this.f87482a = audioContent;
            this.f87483b = iGetDataCallback;
            this.f87484c = message;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/chat/chatwindow/secretchat/plugin/SecretVoicePlugin$sendAudioData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/SendSpeechRecognitionResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "recognizeResponse", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.secretchat.plugin.g$h */
    public static final class C33934h implements IGetDataCallback<SendSpeechRecognitionResponse> {

        /* renamed from: a */
        final /* synthetic */ SecretVoicePlugin f87476a;

        /* renamed from: b */
        final /* synthetic */ AudioContent f87477b;

        /* renamed from: c */
        final /* synthetic */ KeyBoard f87478c;

        /* renamed from: d */
        final /* synthetic */ int f87479d;

        /* renamed from: e */
        final /* synthetic */ IGetDataCallback f87480e;

        /* renamed from: f */
        final /* synthetic */ boolean f87481f;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f87476a.mo123971a(this.f87478c, "", this.f87479d, "", true, new int[0], true);
            IGetDataCallback iGetDataCallback = this.f87480e;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            if (this.f87481f) {
                MessageHitPoint.f135779d.mo187534a(this.f87477b.getUploadId(), false);
                AppreciablePerformance.f104480a.mo147943b(1, errorResult.getDisplayMsg());
            }
            Log.m165379d("ChatWindowLog", errorResult.toString());
        }

        /* renamed from: a */
        public void onSuccess(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
            String str;
            Intrinsics.checkParameterIsNotNull(sendSpeechRecognitionResponse, "recognizeResponse");
            if (Intrinsics.compare(sendSpeechRecognitionResponse.sequence_id.intValue(), this.f87477b.getSequenceId()) >= 0) {
                Boolean bool = sendSpeechRecognitionResponse.is_available;
                Intrinsics.checkExpressionValueIsNotNull(bool, "recognizeResponse.is_available");
                if (bool.booleanValue()) {
                    AudioContent audioContent = this.f87477b;
                    Integer num = sendSpeechRecognitionResponse.sequence_id;
                    Intrinsics.checkExpressionValueIsNotNull(num, "recognizeResponse.sequence_id");
                    audioContent.setSequenceId(num.intValue());
                    SecretVoicePlugin gVar = this.f87476a;
                    KeyBoard fVar = this.f87478c;
                    String uploadId = this.f87477b.getUploadId();
                    int i = this.f87479d;
                    String str2 = sendSpeechRecognitionResponse.result;
                    Boolean bool2 = sendSpeechRecognitionResponse.is_end;
                    Intrinsics.checkExpressionValueIsNotNull(bool2, "recognizeResponse.is_end");
                    gVar.mo123971a(fVar, uploadId, i, str2, bool2.booleanValue(), C34438a.m133582a(sendSpeechRecognitionResponse.diff_index_slice), true);
                }
            }
            Boolean bool3 = sendSpeechRecognitionResponse.is_end;
            Intrinsics.checkExpressionValueIsNotNull(bool3, "recognizeResponse.is_end");
            if (bool3.booleanValue()) {
                MessageHitPoint.f135779d.mo187534a(this.f87477b.getUploadId(), true);
            }
            this.f87476a.mo123970a(sendSpeechRecognitionResponse);
            IGetDataCallback iGetDataCallback = this.f87480e;
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

        C33934h(SecretVoicePlugin gVar, AudioContent audioContent, KeyBoard fVar, int i, IGetDataCallback iGetDataCallback, boolean z) {
            this.f87476a = gVar;
            this.f87477b = audioContent;
            this.f87478c = fVar;
            this.f87479d = i;
            this.f87480e = iGetDataCallback;
            this.f87481f = z;
        }
    }

    /* renamed from: a */
    public final void mo123970a(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
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
    public final void mo123972a(Runnable runnable) {
        ExecutorService executorService = this.f87453v;
        if (executorService != null && !executorService.isShutdown()) {
            this.f87453v.execute(runnable);
        }
    }

    /* renamed from: a */
    public final String mo123969a(Chat chat, ChatChatter chatChatter) {
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
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(\n    …n_YouAreBanned_InputHint)");
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
            this.f87439d = chat;
            this.f87440e = bVar.f90957g;
            this.f87438c = dVar.mo123136g();
            this.f87437b = (IMessageListComponent) dVar.mo123122a(IMessageListComponent.class);
            IKeyboardComponent cVar = (IKeyboardComponent) dVar.mo123122a(IKeyboardComponent.class);
            this.f87436a = cVar;
            if (cVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("keyboardComponent");
            }
            cVar.mo121971a(new C33931e(this));
            IMessageListComponent iMessageListComponent = this.f87437b;
            if (iMessageListComponent == null) {
                Intrinsics.throwUninitializedPropertyAccessException("messageListComponent");
            }
            iMessageListComponent.mo123312a(new C33932f(this));
            ChatAudioPushHandler aVar = new ChatAudioPushHandler(this);
            this.f87455x = aVar;
            if (aVar != null) {
                aVar.mo123055a();
            }
            Context i = mo122128i();
            if (i != null) {
                this.f87456y = C33103ae.from((FragmentActivity) i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final Message mo123967a(KeyBoard fVar, Message message, int i, ByteBuffer byteBuffer, boolean z, boolean z2, IGetDataCallback<String> iGetDataCallback) {
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
                AbstractC36510y yVar = this.f87454w;
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
                IInnerMessageService iInnerMessageService = this.f87452t;
                String uploadId = audioContent.getUploadId();
                byte[] array2 = byteBuffer.array();
                Chat chat = this.f87439d;
                if (chat == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("chat");
                }
                iInnerMessageService.mo121257a(uploadId, i, str2, string, array2, i2, 16000, "opus", true, chat.getId(), new C33934h(this, audioContent, fVar, i, iGetDataCallback, z2));
            } else {
                this.f87452t.mo121258a(audioContent.getUploadId(), i, byteBuffer.array(), z, z2, "", new C33935i(audioContent, iGetDataCallback, message));
            }
        }
        return message;
    }

    /* renamed from: a */
    public final void mo123971a(KeyBoard fVar, String str, int i, String str2, boolean z, int[] iArr, boolean z2) {
        Intrinsics.checkParameterIsNotNull(fVar, "keyboard");
        Log.m165379d("ChatWindowLog", "updatekeyboardText:" + i + '/' + str2 + '/' + this.f87441f + '/' + z);
        if (TextUtils.equals(str, this.f87447o)) {
            String str3 = this.f87444l;
            if (str3 == null || !Intrinsics.areEqual(str3, str2) || z) {
                if (!this.f87449q && z) {
                    this.f87449q = true;
                }
                if (this.f87441f) {
                    this.f87451s.mo92345a(new RunnableC33940l(this, fVar, str2, str, z2, z, iArr));
                }
            }
        }
    }
}
