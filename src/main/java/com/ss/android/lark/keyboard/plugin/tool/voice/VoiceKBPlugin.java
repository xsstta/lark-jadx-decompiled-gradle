package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.utils.ChatResourceCache;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.C41026a;
import com.ss.android.lark.keyboard.plugin.tool.voice.legacy.LarkRecorderPanel;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41035a;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41037b;
import com.ss.android.lark.keyboard.plugin.tool.voice.p2092c.C41039c;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioRecordPanel;
import com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioWithTextPanel;
import com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.widget.richtext.RichText;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000½\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0011*\u0001 \u0018\u0000 l2\u00020\u0001:\u0001lB\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\n\u0010/\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u00100\u001a\u000201H\u0002J\n\u00102\u001a\u0004\u0018\u000103H\u0002J\b\u00104\u001a\u0004\u0018\u000105J\b\u00106\u001a\u00020#H\u0002J\b\u00107\u001a\u00020)H\u0002J\b\u00108\u001a\u00020\u0003H\u0002J\b\u00109\u001a\u00020\u0003H\u0002J\u000e\u0010:\u001a\u00020)2\u0006\u0010;\u001a\u00020<J\u001e\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u0002012\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003J\b\u0010A\u001a\u00020\u0003H\u0016J\u0010\u0010B\u001a\u00020)2\u0006\u0010C\u001a\u00020DH\u0016J\u0018\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010F\u001a\u00020DH\u0016J\b\u0010J\u001a\u00020)H\u0016J\u0010\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020\u0003H\u0016J\u0010\u0010M\u001a\u00020)2\u0006\u0010N\u001a\u00020\u0003H\u0016J\u0010\u0010O\u001a\u00020)2\u0006\u0010P\u001a\u00020\u0003H\u0016J\b\u0010Q\u001a\u00020)H\u0016J\b\u0010R\u001a\u00020)H\u0016J\b\u0010S\u001a\u00020)H\u0016J\u0010\u0010T\u001a\u00020)2\u0006\u0010U\u001a\u00020\u0003H\u0016J\b\u0010V\u001a\u00020)H\u0002J\u000e\u0010W\u001a\u00020)2\u0006\u0010X\u001a\u00020#J\u0016\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020#2\u0006\u0010[\u001a\u00020\\J\u0010\u0010]\u001a\u00020)2\u0006\u0010^\u001a\u00020\u0003H\u0002J\u0010\u0010_\u001a\u00020)2\u0006\u0010`\u001a\u00020\u0018H\u0016J\u000e\u0010a\u001a\u00020)2\u0006\u0010b\u001a\u00020\u001eJ\u0010\u0010c\u001a\u00020)2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0018\u0010d\u001a\u00020)2\u0006\u0010e\u001a\u00020#2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010f\u001a\u00020)2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010g\u001a\u00020)2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0010\u0010h\u001a\u00020)2\u0006\u0010N\u001a\u00020\u0003H\u0002J\u0018\u0010i\u001a\u00020)2\u0006\u0010j\u001a\u00020\u00032\u0006\u0010k\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0004\n\u0002\u0010!R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "isDarkStyle", "", "mRecordListener", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IRecordListener;", "mDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/IVoiceDependency;", "(ZLcom/ss/android/lark/keyboard/plugin/tool/voice/IRecordListener;Lcom/ss/android/lark/keyboard/plugin/tool/voice/IVoiceDependency;)V", "mAudioInputPanel", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioInputPanel2;", "mAudioPopupWindow", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/IAudioPopup;", "mAudioRecorderListener", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/AudioRecorderListener;", "mAudioWithTextPanel", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioWithTextPanel;", "mAudioWithTextPanelWrap", "Landroid/widget/LinearLayout;", "mCurrentPanel", "mIcon", "Landroid/view/View;", "mIsRecording", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mLarkRecordNewPanel", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioRecordPanel;", "mLarkRecorderPanel", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/legacy/LarkRecorderPanel;", "mPluginClickListener", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "mRecorderListener", "com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$mRecorderListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$mRecorderListener$1;", "mShownPanelIndex", "", "mTextRecognizePanel", "mTextRecognizePanelWrap", "mVibrator", "Landroid/os/Vibrator;", "cancelAudioInput", "", "createIcon", "getAudioBtnListener", "Landroid/view/View$OnTouchListener;", "onClickListener", "Landroid/view/View$OnClickListener;", "getAudioPanel", "getEditInput", "", "getKeyboardEditText", "Landroid/widget/EditText;", "getMsgEditText", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "getPanelHeight", "hideAudioTextPanel", "isEditInputEmpty", "isPopupWindowShown", "maybeUpdateHintOrShowError", "errHint", "Landroid/text/Spannable;", "notifySpeechResult", "speechText", "fromResp", "isFinished", "onBackPressed", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStop", "onVisibleChanged", "isVisible", "sendVoicePanelHitPoint", "setAudioCountDown", "countDown", "setAudioInputValue", "realDuration", "amplitude", "", "setAudioPanelEnable", "enable", "setKeyBoardContext", "context", "setPluginClickListener", "listener", "showAudioInputPanel", "showAudioPanel", "index", "showAudioWithTextPanel", "showTextRecognizePanel", "toggleAudioPanel", "updateKeyboardHeight", "isPanelShown", "isShown", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d */
public final class VoiceKBPlugin implements IKeyBoardPlugin {

    /* renamed from: h */
    public static final Companion f104495h = new Companion(null);

    /* renamed from: a */
    public IKeyBoardPlugin.IPluginClickListener f104496a;

    /* renamed from: b */
    public IKeyBoardPlugin.IKeyBoardContext f104497b;

    /* renamed from: c */
    public boolean f104498c;

    /* renamed from: d */
    public View f104499d;

    /* renamed from: e */
    public C41026a f104500e;

    /* renamed from: f */
    public IRecordListener f104501f;

    /* renamed from: g */
    public IVoiceDependency f104502g;

    /* renamed from: i */
    private LarkRecorderPanel f104503i;

    /* renamed from: j */
    private AudioRecordPanel f104504j;

    /* renamed from: k */
    private final C41045c f104505k = new C41045c(this);

    /* renamed from: l */
    private AudioInputPanel2 f104506l;

    /* renamed from: m */
    private AudioWithTextPanel f104507m;

    /* renamed from: n */
    private LinearLayout f104508n;

    /* renamed from: o */
    private AudioWithTextPanel f104509o;

    /* renamed from: p */
    private LinearLayout f104510p;

    /* renamed from: q */
    private AudioWithTextPanel f104511q;

    /* renamed from: r */
    private IAudioPopup f104512r;

    /* renamed from: s */
    private Vibrator f104513s;

    /* renamed from: t */
    private int f104514t;

    /* renamed from: u */
    private final boolean f104515u;

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$Companion;", "", "()V", "MAX_TOUCH_MOVE_DISTANCE", "", "NORMAL_ASR_WAIT_TIME", "", "NO_RESULT_ASR_WAIT_TIME_MAX", "TAG", "", "getWaitTime", "hasFinalResp", "", "isAsrOptNoNetworkEnable", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo147974a() {
            return C40682g.m160850a().mo133171a("ai.asr.opt.no_network");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo147973a(boolean z) {
            if (z || !mo147974a()) {
                return 1000;
            }
            return 5000;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        return IKeyBoardPlugin.C40806a.m161552a(this, i, intent);
    }

    /* renamed from: a */
    public final void mo147965a(IKeyBoardPlugin.IPluginClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f104496a = cVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f104499d;
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* renamed from: a */
    public final void mo147966a(String str, boolean z, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "speechText");
        IAudioPopup cVar = this.f104512r;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo147922a()) {
                AudioWithTextPanel audioWithTextPanel = this.f104507m;
                if (audioWithTextPanel != null) {
                    audioWithTextPanel.mo148149a(str, z, z2);
                    return;
                }
                return;
            }
        }
        AudioRecordPanel audioRecordPanel = this.f104504j;
        if (audioRecordPanel != null) {
            audioRecordPanel.mo148131a(str, z, z2);
        }
    }

    /* renamed from: a */
    public final void mo147964a(Spannable spannable) {
        AudioRecordPanel audioRecordPanel;
        RichTextEmojiconEditText d;
        ViewPager viewPager;
        Intrinsics.checkParameterIsNotNull(spannable, "errHint");
        AudioRecordPanel audioRecordPanel2 = this.f104504j;
        int currentItem = (audioRecordPanel2 == null || (viewPager = audioRecordPanel2.mViewPager) == null) ? this.f104514t : viewPager.getCurrentItem();
        if (currentItem == 0) {
            if (m162725m() && (d = mo147969d()) != null) {
                d.setHint(spannable);
            }
        } else if (currentItem == 2) {
            if (this.f104498c) {
                IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
                }
                C41035a.m162693a(bVar.mo147365B(), (int) R.string.Lark_Chat_AudioToTextPoorNetworkError);
            }
            if (!m162724l() && (audioRecordPanel = this.f104504j) != null) {
                audioRecordPanel.mo148137d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$onCreatePluginPanel$audioTextDelegate$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioPanelRecordTextView$Delegate;", "onClearText", "", "onSendAll", "onSendAudio", "onSendText", "onStartRecord", "onStopRecord", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$f */
    public static final class C41048f implements AudioPanelRecordTextView.AbstractC41071a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104533a;

        /* renamed from: b */
        final /* synthetic */ C41049g f104534b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: a */
        public void mo147981a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: e */
        public void mo147985e() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: f */
        public void mo147986f() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: d */
        public void mo147984d() {
            this.f104534b.mo147988b();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: b */
        public void mo147982b() {
            this.f104533a.f104501f.mo123908b();
            HitPointHelper.f103322b.mo146884c();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: c */
        public void mo147983c() {
            RichTextEmojiconEditText d = this.f104533a.mo147969d();
            if (d instanceof RichTextEmojiconEditText) {
                IRecordListener bVar = this.f104533a.f104501f;
                String a = d.mo146908a(false);
                Intrinsics.checkExpressionValueIsNotNull(a, "richEdit!!.getStringText(false)");
                bVar.mo123903a(a);
            }
        }

        C41048f(VoiceKBPlugin dVar, C41049g gVar) {
            this.f104533a = dVar;
            this.f104534b = gVar;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
        Log.m165379d("VoiceKBPlugin", "onDestroy");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$getAudioBtnListener$1", "Landroid/view/View$OnTouchListener;", "hasAudioPermission", "", "isSingleClick", "onDownX", "", "onDownY", "showAudioInputRunnable", "Ljava/lang/Runnable;", "shownPopupWindow", "handleSingleClick", "", "v", "Landroid/view/View;", "isGranted", "onTouch", "event", "Landroid/view/MotionEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$b */
    public static final class View$OnTouchListenerC41041b implements View.OnTouchListener {

        /* renamed from: a */
        public boolean f104516a;

        /* renamed from: b */
        public boolean f104517b;

        /* renamed from: c */
        public boolean f104518c;

        /* renamed from: d */
        final /* synthetic */ VoiceKBPlugin f104519d;

        /* renamed from: e */
        final /* synthetic */ View.OnClickListener f104520e;

        /* renamed from: f */
        private Runnable f104521f;

        /* renamed from: g */
        private float f104522g = -1.0f;

        /* renamed from: h */
        private float f104523h = -1.0f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$b$c */
        static final class RunnableC41044c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnTouchListenerC41041b f104528a;

            RunnableC41044c(View$OnTouchListenerC41041b bVar) {
                this.f104528a = bVar;
            }

            public final void run() {
                this.f104528a.f104519d.mo147971f(false);
                this.f104528a.f104517b = false;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$b$b */
        static final class RunnableC41043b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnTouchListenerC41041b f104526a;

            /* renamed from: b */
            final /* synthetic */ MotionEvent f104527b;

            RunnableC41043b(View$OnTouchListenerC41041b bVar, MotionEvent motionEvent) {
                this.f104526a = bVar;
                this.f104527b = motionEvent;
            }

            public final void run() {
                if (!this.f104526a.f104517b) {
                    this.f104526a.f104517b = true;
                    this.f104526a.f104519d.mo147972g(true);
                    this.f104526a.f104519d.mo147971f(true);
                    this.f104527b.setAction(0);
                    View b = this.f104526a.f104519d.mo147967b();
                    if (b == null) {
                        Intrinsics.throwNpe();
                    }
                    b.onTouchEvent(this.f104527b);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$b$a */
        static final class C41042a implements C57805b.AbstractC57809a {

            /* renamed from: a */
            final /* synthetic */ View$OnTouchListenerC41041b f104524a;

            /* renamed from: b */
            final /* synthetic */ View f104525b;

            C41042a(View$OnTouchListenerC41041b bVar, View view) {
                this.f104524a = bVar;
                this.f104525b = view;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                this.f104524a.f104516a = z;
                if (this.f104524a.f104518c && this.f104524a.f104516a) {
                    Object tag = this.f104525b.getTag(R.id.voice_btn_permission_tag);
                    if (tag == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                    } else if (!((Boolean) tag).booleanValue()) {
                        View$OnTouchListenerC41041b bVar = this.f104524a;
                        bVar.mo147975a(this.f104525b, bVar.f104516a);
                    }
                }
            }
        }

        View$OnTouchListenerC41041b(VoiceKBPlugin dVar, View.OnClickListener onClickListener) {
            this.f104519d = dVar;
            this.f104520e = onClickListener;
        }

        /* renamed from: a */
        public final void mo147975a(View view, boolean z) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            view.setTag(R.id.voice_btn_permission_tag, Boolean.valueOf(z));
            this.f104520e.onClick(view);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (r0 != 3) goto L_0x00f7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            /*
            // Method dump skipped, instructions count: 276
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin.View$OnTouchListenerC41041b.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0016J(\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J*\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u0018"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$mRecorderListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/AudioRecorderListener$RecorderCallback;", "onAudio2Text", "", "onAudioCountDown", "countDown", "", "needFinish", "", "onAudioRecorded", "strFileName", "", "cid", "duration", "needRecognized", "onCancelRecord", "onPrepareForRecord", "onlyText", "onStartRecord", "onUpdateAudio", "buffer", "Ljava/nio/ByteBuffer;", "volume", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$c */
    public static final class C41045c implements C41026a.AbstractC41029a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104529a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: a */
        public void mo147913a() {
            this.f104529a.f104501f.mo123911c();
            this.f104529a.f104498c = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41045c(VoiceKBPlugin dVar) {
            this.f104529a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: a */
        public void mo147914a(int i, boolean z) {
            this.f104529a.mo147961a(i);
            if (z) {
                this.f104529a.mo147968c();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: a */
        public void mo147915a(String str, int i) {
            if (1 <= i && 999 >= i) {
                this.f104529a.mo147970e();
            }
            this.f104529a.f104501f.mo123909b(str);
            this.f104529a.f104498c = false;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: b */
        public void mo147919b(String str, String str2, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            this.f104529a.f104501f.mo123906a(str, str2, z, z2);
            this.f104529a.f104498c = true;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: a */
        public void mo147916a(String str, String str2, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            this.f104529a.f104501f.mo123905a(str, str2, i, z);
            VoiceKBPlugin.m162718a(this.f104529a).mo147379v();
            this.f104529a.f104498c = false;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: a */
        public void mo147917a(String str, String str2, boolean z, boolean z2) {
            Intrinsics.checkParameterIsNotNull(str, "strFileName");
            Intrinsics.checkParameterIsNotNull(str2, "cid");
            this.f104529a.f104501f.mo123910b(str, str2, z, z2);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.C41026a.AbstractC41029a
        /* renamed from: a */
        public void mo147918a(ByteBuffer byteBuffer, int i, double d, boolean z) {
            this.f104529a.mo147962a(i, d);
            this.f104529a.f104501f.mo123907a(byteBuffer, i, d, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$showAudioWithTextPanel$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioPanelRecordTextView$Delegate;", "onClearText", "", "onSendAll", "onSendAudio", "onSendText", "onStartRecord", "onStopRecord", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$i */
    public static final class C41051i implements AudioPanelRecordTextView.AbstractC41071a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104537a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: a */
        public void mo147981a() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: b */
        public void mo147982b() {
            this.f104537a.f104501f.mo123908b();
            mo147984d();
            HitPointHelper.f103322b.mo146884c();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: d */
        public void mo147984d() {
            RichTextEmojiconEditText d = this.f104537a.mo147969d();
            if (d instanceof RichTextEmojiconEditText) {
                d.setText("");
            }
            this.f104537a.mo147963a(0, false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: c */
        public void mo147983c() {
            RichTextEmojiconEditText d = this.f104537a.mo147969d();
            if (d instanceof RichTextEmojiconEditText) {
                IRecordListener bVar = this.f104537a.f104501f;
                String a = d.mo146908a(false);
                Intrinsics.checkExpressionValueIsNotNull(a, "richEdit!!.getStringText(false)");
                bVar.mo123903a(a);
                d.setText("");
            }
            this.f104537a.mo147963a(0, false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: e */
        public void mo147985e() {
            Log.m165379d("VoiceKBPlugin", "onStartRecord");
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104537a).mo147365B()).mo147954a();
            C41026a aVar = this.f104537a.f104500e;
            if (aVar != null) {
                aVar.mo147908a(true, false);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: f */
        public void mo147986f() {
            Log.m165379d("VoiceKBPlugin", "onRecorded");
            C41026a aVar = this.f104537a.f104500e;
            if (aVar != null) {
                aVar.mo147907a(false);
            }
            C41026a aVar2 = this.f104537a.f104500e;
            if (aVar2 != null) {
                aVar2.mo147909b();
            }
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104537a).mo147365B()).mo147957b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41051i(VoiceKBPlugin dVar) {
            this.f104537a = dVar;
        }
    }

    /* renamed from: m */
    private final boolean m162725m() {
        return TextUtils.isEmpty(m162726n());
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        Log.m165379d("VoiceKBPlugin", "onRestart");
        View view = this.f104499d;
        if (view != null) {
            view.setSelected(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$onCreatePluginPanel$textDelegate$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioPanelTextView$Delegate;", "onClearText", "", "onSendText", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$g */
    public static final class C41049g implements AudioPanelTextView.AbstractC41077a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104535a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView.AbstractC41077a
        /* renamed from: b */
        public void mo147988b() {
            RichTextEmojiconEditText d = this.f104535a.mo147969d();
            if (d instanceof RichTextEmojiconEditText) {
                d.setText("");
            }
            this.f104535a.f104501f.mo123901a();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelTextView.AbstractC41077a
        /* renamed from: a */
        public void mo147987a() {
            RichTextEmojiconEditText d = this.f104535a.mo147969d();
            if ((d instanceof RichTextEmojiconEditText) && !TextUtils.isEmpty(String.valueOf(d.getText()))) {
                IRecordListener bVar = this.f104535a.f104501f;
                String a = d.mo146908a(false);
                Intrinsics.checkExpressionValueIsNotNull(a, "richEdit!!.getStringText(false)");
                RichText richText = d.getRichText();
                Intrinsics.checkExpressionValueIsNotNull(richText, "richEdit.richText");
                bVar.mo123904a(a, richText);
                HitPointHelper.f103322b.mo146878a(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41049g(VoiceKBPlugin dVar) {
            this.f104535a = dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$showTextRecognizePanel$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioPanelRecordTextView$Delegate;", "onClearText", "", "onSendAll", "onSendAudio", "onSendText", "onStartRecord", "onStopRecord", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$j */
    public static final class C41052j implements AudioPanelRecordTextView.AbstractC41071a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104538a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: c */
        public void mo147983c() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: b */
        public void mo147982b() {
            this.f104538a.f104501f.mo123908b();
            mo147984d();
            this.f104538a.mo147963a(2, false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: d */
        public void mo147984d() {
            RichTextEmojiconEditText d = this.f104538a.mo147969d();
            if (d instanceof RichTextEmojiconEditText) {
                d.setText("");
            }
            this.f104538a.mo147963a(2, false);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: a */
        public void mo147981a() {
            RichTextEmojiconEditText d = this.f104538a.mo147969d();
            if (d instanceof RichTextEmojiconEditText) {
                IRecordListener bVar = this.f104538a.f104501f;
                String a = d.mo146908a(false);
                Intrinsics.checkExpressionValueIsNotNull(a, "richEdit!!.getStringText(false)");
                RichText richText = d.getRichText();
                Intrinsics.checkExpressionValueIsNotNull(richText, "richEdit.richText");
                bVar.mo123904a(a, richText);
                HitPointHelper.f103322b.mo146878a(false);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: e */
        public void mo147985e() {
            Log.m165379d("VoiceKBPlugin", "onStartRecord");
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104538a).mo147365B()).mo147954a();
            C41026a aVar = this.f104538a.f104500e;
            if (aVar != null) {
                aVar.mo147908a(true, true);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioPanelRecordTextView.AbstractC41071a
        /* renamed from: f */
        public void mo147986f() {
            Log.m165379d("VoiceKBPlugin", "onRecorded");
            C41026a aVar = this.f104538a.f104500e;
            if (aVar != null) {
                aVar.mo147907a(false);
            }
            C41026a aVar2 = this.f104538a.f104500e;
            if (aVar2 != null) {
                aVar2.mo147909b();
            }
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104538a).mo147365B()).mo147957b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41052j(VoiceKBPlugin dVar) {
            this.f104538a = dVar;
        }
    }

    /* renamed from: l */
    private final boolean m162724l() {
        IAudioPopup cVar = this.f104512r;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo147922a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    private final String m162726n() {
        Editable text;
        String obj;
        RichTextEmojiconEditText d = mo147969d();
        if (d == null || (text = d.getText()) == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    /* renamed from: o */
    private final EditText m162727o() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return bVar.mo147381z().mo146904l();
    }

    /* renamed from: p */
    private final int m162728p() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        int E = bVar.mo147368E();
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104497b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return E + bVar2.mo147366C();
    }

    /* renamed from: c */
    public final void mo147968c() {
        if (!m162724l()) {
            AudioRecordPanel audioRecordPanel = this.f104504j;
            if (audioRecordPanel != null && audioRecordPanel != null) {
                audioRecordPanel.mo148135b();
            }
        } else if (this.f104514t == 1) {
            m162723j(false);
        }
    }

    /* renamed from: e */
    public final void mo147970e() {
        IAudioPopup cVar = this.f104512r;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo147922a()) {
                if (this.f104514t == 0) {
                    mo147963a(0, false);
                    return;
                }
                return;
            }
        }
        AudioRecordPanel audioRecordPanel = this.f104504j;
        if (audioRecordPanel != null) {
            audioRecordPanel.mo148130a();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        View view = this.f104499d;
        if (view != null) {
            view.setSelected(false);
        }
        AudioRecordPanel audioRecordPanel = this.f104504j;
        if (audioRecordPanel != null) {
            audioRecordPanel.mo148136c();
        }
        Log.m165379d("VoiceKBPlugin", "onStop");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        boolean z;
        boolean z2;
        IAudioPopup cVar = this.f104512r;
        if (cVar != null) {
            z = cVar.mo147924c();
        } else {
            z = false;
        }
        if (!z) {
            AudioRecordPanel audioRecordPanel = this.f104504j;
            if (audioRecordPanel != null) {
                z2 = audioRecordPanel.mo148138e();
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/voice/VoiceKBPlugin$showAudioInputPanel$1", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/panel/AudioInputPanel2$Delegate;", "onCancel", "", "onRecorded", "onStartRecord", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$h */
    public static final class C41050h implements AudioInputPanel2.AbstractC41066a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104536a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.AbstractC41066a
        /* renamed from: a */
        public void mo147989a() {
            Log.m165379d("VoiceKBPlugin", "onStartRecord");
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104536a).mo147365B()).mo147954a();
            C41026a aVar = this.f104536a.f104500e;
            if (aVar != null) {
                aVar.mo147908a(false, false);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.AbstractC41066a
        /* renamed from: b */
        public void mo147990b() {
            Log.m165379d("VoiceKBPlugin", "onStopRecord");
            C41026a aVar = this.f104536a.f104500e;
            if (aVar != null) {
                aVar.mo147910c();
            }
            HitPointHelper.f103322b.mo146886d();
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104536a).mo147365B()).mo147957b();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioInputPanel2.AbstractC41066a
        /* renamed from: c */
        public void mo147991c() {
            Log.m165379d("VoiceKBPlugin", "onRecorded");
            C41026a aVar = this.f104536a.f104500e;
            if (aVar != null) {
                aVar.mo147909b();
            }
            C41037b.m162698a(VoiceKBPlugin.m162718a(this.f104536a).mo147365B()).mo147957b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41050h(VoiceKBPlugin dVar) {
            this.f104536a = dVar;
        }
    }

    /* renamed from: f */
    private final View m162720f() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_voice, R.drawable.ud_icon_voice_outlined);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…e.ud_icon_voice_outlined)");
        return a;
    }

    /* renamed from: b */
    public final View mo147967b() {
        int i;
        if (this.f104502g.mo123922b()) {
            i = C41039c.m162704a(1);
        } else {
            i = 1;
        }
        if (i == 0) {
            return this.f104507m;
        }
        if (i != 1) {
            return this.f104509o;
        }
        return this.f104506l;
    }

    /* renamed from: d */
    public final RichTextEmojiconEditText mo147969d() {
        AudioWithTextPanel audioWithTextPanel;
        IAudioPopup cVar = this.f104512r;
        if (cVar != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo147922a()) {
                int i = this.f104514t;
                if (i == 0) {
                    AudioWithTextPanel audioWithTextPanel2 = this.f104507m;
                    if (audioWithTextPanel2 != null) {
                        return audioWithTextPanel2.getMsgEditText();
                    }
                    return null;
                } else if (i == 1 || (audioWithTextPanel = this.f104509o) == null) {
                    return null;
                } else {
                    return audioWithTextPanel.getMsgEditText();
                }
            }
        }
        AudioRecordPanel audioRecordPanel = this.f104504j;
        if (audioRecordPanel != null) {
            return audioRecordPanel.getMsgEditText();
        }
        return null;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        Log.m165379d("VoiceKBPlugin", "onStart");
        View view = this.f104499d;
        if (view != null) {
            view.setSelected(true);
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        C41026a aVar = new C41026a(bVar.mo147365B(), this.f104503i, this.f104505k);
        this.f104500e = aVar;
        LarkRecorderPanel larkRecorderPanel = this.f104503i;
        if (larkRecorderPanel != null) {
            larkRecorderPanel.setRecordListener(aVar);
        }
        AudioRecordPanel audioRecordPanel = this.f104504j;
        if (audioRecordPanel != null) {
            audioRecordPanel.setRecordListener(this.f104500e);
        }
        AudioRecordPanel audioRecordPanel2 = this.f104504j;
        if (audioRecordPanel2 != null) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104497b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            audioRecordPanel2.setKeyboardContext(bVar2);
        }
    }

    /* renamed from: a */
    public final void mo147960a() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104497b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(KeyboardHitPointExtraParams.Click.VOICE_MSG.plus(KeyboardHitPointExtraParams.Target.IM_CHAT_VOICE_MSG_VIEW).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())), C40683h.m160856f(b)));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    /* renamed from: a */
    private final View.OnTouchListener m162717a(View.OnClickListener onClickListener) {
        return new View$OnTouchListenerC41041b(this, onClickListener);
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext m162718a(VoiceKBPlugin dVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar = dVar.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        Log.m165379d("VoiceKBPlugin", "onCreateView");
    }

    /* renamed from: g */
    public final void mo147972g(boolean z) {
        View b = mo147967b();
        if (b != null) {
            b.setEnabled(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "iconId", "", "onTabIconChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$e */
    static final class C41047e implements AudioRecordPanel.AbstractC41079a {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104532a;

        C41047e(VoiceKBPlugin dVar) {
            this.f104532a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioRecordPanel.AbstractC41079a
        /* renamed from: a */
        public final void mo147980a(int i) {
            View view = this.f104532a.f104499d;
            if (view != null) {
                AppCompatImageView appCompatImageView = (AppCompatImageView) view;
                if (this.f104532a.f104502g.mo123922b()) {
                    appCompatImageView.setImageResource(i);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f104497b = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.d$d */
    static final class View$OnClickListenerC41046d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VoiceKBPlugin f104530a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f104531b;

        View$OnClickListenerC41046d(VoiceKBPlugin dVar, IKeyBoardPlugin.ITouchActionNotifier dVar2) {
            this.f104530a = dVar;
            this.f104531b = dVar2;
        }

        public final void onClick(View view) {
            Object tag = view.getTag(R.id.voice_btn_permission_tag);
            if (tag == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
            } else if (((Boolean) tag).booleanValue()) {
                IKeyBoardPlugin.IPluginClickListener cVar = this.f104530a.f104496a;
                if (cVar != null) {
                    cVar.mo122033a();
                }
                this.f104530a.mo147960a();
                this.f104531b.mo147313a(this.f104530a);
            }
        }
    }

    /* renamed from: a */
    public final void mo147961a(int i) {
        AudioInputPanel2 audioInputPanel2;
        if (m162724l()) {
            int i2 = this.f104514t;
            if (i2 == 0) {
                AudioWithTextPanel audioWithTextPanel = this.f104507m;
            } else if (i2 == 1 && (audioInputPanel2 = this.f104506l) != null) {
                if (audioInputPanel2 == null) {
                    Intrinsics.throwNpe();
                }
                audioInputPanel2.setAudioCountDown(String.valueOf(i));
            }
        } else {
            AudioRecordPanel audioRecordPanel = this.f104504j;
            if (audioRecordPanel != null && audioRecordPanel != null) {
                audioRecordPanel.setAudioCountDown(String.valueOf(i));
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
        IAudioPopup cVar;
        Object obj;
        AudioRecordPanel audioRecordPanel = this.f104504j;
        if (audioRecordPanel != null) {
            audioRecordPanel.mo148133a(z);
        }
        Log.m165379d("VoiceKBPlugin", "onKeyboardChanged:" + z);
        if (!z && (cVar = this.f104512r) != null) {
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            if (cVar.mo147922a()) {
                AudioWithTextPanel audioWithTextPanel = this.f104507m;
                if (audioWithTextPanel != null) {
                    obj = audioWithTextPanel.getTag();
                } else {
                    obj = null;
                }
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    IAudioPopup cVar2 = this.f104512r;
                    if (cVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    cVar2.mo147923b();
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo147971f(boolean z) {
        int i;
        Editable editable;
        if (this.f104502g.mo123922b()) {
            i = C41039c.m162704a(1);
        } else {
            i = 1;
        }
        this.f104514t = i;
        if (z) {
            mo147963a(i, true);
        } else if (i == 0) {
            AudioWithTextPanel audioWithTextPanel = this.f104507m;
            if (audioWithTextPanel != null) {
                audioWithTextPanel.mo148155d();
            }
        } else if (i != 1) {
            EditText o = m162727o();
            RichTextEmojiconEditText d = mo147969d();
            if (d != null) {
                editable = d.getText();
            } else {
                editable = null;
            }
            String valueOf = String.valueOf(editable);
            String str = valueOf;
            if (!TextUtils.isEmpty(str)) {
                if (o != null) {
                    o.setText(str);
                }
                if (o != null) {
                    o.setSelection(valueOf.length());
                }
                if (o != null) {
                    o.requestFocus();
                }
                if (d != null) {
                    d.setText("");
                }
                IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
                }
                bVar.mo147375j();
                HitPointHelper.f103322b.mo146878a(false);
            }
            mo147963a(this.f104514t, false);
        } else {
            mo147963a(i, false);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Log.m165379d("VoiceKBPlugin", "onCreatePluginPanel");
        if (this.f104504j == null) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            View inflate = LayoutInflater.from(bVar.mo147365B()).inflate(R.layout.kb_plugin_voice_new, viewGroup, false);
            if (inflate != null) {
                AudioRecordPanel audioRecordPanel = (AudioRecordPanel) inflate;
                this.f104504j = audioRecordPanel;
                if (audioRecordPanel != null) {
                    audioRecordPanel.mo148134a(this.f104502g.mo123923c(), this.f104502g.mo123921a(), this.f104502g.mo123922b(), new C41047e(this));
                }
                C41049g gVar = new C41049g(this);
                AudioRecordPanel audioRecordPanel2 = this.f104504j;
                if (audioRecordPanel2 != null) {
                    audioRecordPanel2.setDelegate(gVar);
                }
                C41048f fVar = new C41048f(this, gVar);
                AudioRecordPanel audioRecordPanel3 = this.f104504j;
                if (audioRecordPanel3 != null) {
                    audioRecordPanel3.setDelegate(fVar);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.tool.voice.panel.AudioRecordPanel");
            }
        }
        AudioRecordPanel audioRecordPanel4 = this.f104504j;
        if (audioRecordPanel4 == null) {
            Intrinsics.throwNpe();
        }
        return audioRecordPanel4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e3  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m162722i(boolean r12) {
        /*
        // Method dump skipped, instructions count: 497
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin.m162722i(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017e  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m162723j(boolean r12) {
        /*
        // Method dump skipped, instructions count: 393
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin.m162723j(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0199  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m162721h(boolean r13) {
        /*
        // Method dump skipped, instructions count: 515
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin.m162721h(boolean):void");
    }

    /* renamed from: a */
    private final void m162719a(boolean z, boolean z2) {
        Integer num;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        int E = bVar.mo147368E();
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104497b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        int C = E + bVar2.mo147366C();
        if (z2) {
            AudioWithTextPanel audioWithTextPanel = this.f104511q;
            if (audioWithTextPanel != null) {
                num = Integer.valueOf(audioWithTextPanel.getPanelHeight());
            } else {
                num = null;
            }
            if (num == null) {
                Intrinsics.throwNpe();
            }
            int intValue = num.intValue();
            if (z) {
                IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f104497b;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
                }
                intValue += bVar3.mo147367D();
            }
            this.f104501f.mo123902a(intValue);
            return;
        }
        if (z) {
            IKeyBoardPlugin.IKeyBoardContext bVar4 = this.f104497b;
            if (bVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            C += bVar4.mo147367D();
        }
        this.f104501f.mo123902a(C);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        Log.m165379d("VoiceKBPlugin", "onCreateIcon");
        View f = m162720f();
        if (f != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) f;
            appCompatImageView.setActivated(this.f104515u);
            if (!this.f104515u && this.f104502g.mo123922b()) {
                ChatResourceCache fVar = ChatResourceCache.f88672a;
                Context context = viewGroup.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
                appCompatImageView.setImageDrawable(fVar.mo126918a(context, C41039c.m162710c(C41039c.m162704a(1))));
            }
            appCompatImageView.setHapticFeedbackEnabled(true);
            appCompatImageView.setBackground(null);
            f.setOnTouchListener(m162717a(new View$OnClickListenerC41046d(this, dVar)));
            this.f104499d = f;
            return f;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatImageView");
    }

    /* renamed from: a */
    public final void mo147962a(int i, double d) {
        Log.m165379d("VoiceKBPlugin", "setAudioInputValue:" + d);
        int i2 = i + -500;
        if (m162724l()) {
            int i3 = this.f104514t;
            if (i3 != 0) {
                if (i3 == 1) {
                    AudioInputPanel2 audioInputPanel2 = this.f104506l;
                    if (audioInputPanel2 != null) {
                        if (audioInputPanel2 == null) {
                            Intrinsics.throwNpe();
                        }
                        audioInputPanel2.setAudioAmplitude(d);
                        audioInputPanel2.setAudioDuration(i2);
                    }
                } else if (this.f104509o != null) {
                    double d2 = (double) 100;
                    double min = Math.min(1100.0d, Math.max(0.0d, d - d2));
                    AudioWithTextPanel audioWithTextPanel = this.f104509o;
                    if (audioWithTextPanel == null) {
                        Intrinsics.throwNpe();
                    }
                    audioWithTextPanel.setAudioAmplitude((int) ((min / ((double) 1100.0f)) * d2));
                    audioWithTextPanel.setAudioDuration(i2);
                }
            } else if (this.f104507m != null) {
                double d3 = (double) 100;
                double min2 = Math.min(1100.0d, Math.max(0.0d, d - d3));
                AudioWithTextPanel audioWithTextPanel2 = this.f104507m;
                if (audioWithTextPanel2 == null) {
                    Intrinsics.throwNpe();
                }
                audioWithTextPanel2.setAudioAmplitude((int) ((min2 / ((double) 1100.0f)) * d3));
                audioWithTextPanel2.setAudioDuration(i2);
            }
        } else {
            AudioRecordPanel audioRecordPanel = this.f104504j;
            if (audioRecordPanel != null) {
                if (audioRecordPanel != null) {
                    audioRecordPanel.setAudioVolume(d);
                }
                AudioRecordPanel audioRecordPanel2 = this.f104504j;
                if (audioRecordPanel2 != null) {
                    audioRecordPanel2.setAudioDuration(i2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo147963a(int i, boolean z) {
        if (i == 0) {
            m162722i(z);
            this.f104511q = this.f104507m;
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104497b;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            m162719a(bVar.mo147369F(), z);
        } else if (i != 1) {
            m162721h(z);
            this.f104511q = this.f104509o;
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104497b;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            m162719a(bVar2.mo147369F(), z);
        } else {
            HitPointHelper.f103322b.mo146876a("audio_button");
            m162723j(z);
        }
    }

    public VoiceKBPlugin(boolean z, IRecordListener bVar, IVoiceDependency cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "mRecordListener");
        Intrinsics.checkParameterIsNotNull(cVar, "mDependency");
        this.f104515u = z;
        this.f104501f = bVar;
        this.f104502g = cVar;
    }
}
