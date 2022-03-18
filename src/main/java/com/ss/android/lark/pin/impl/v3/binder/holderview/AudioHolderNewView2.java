package com.ss.android.lark.pin.impl.v3.binder.holderview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.ui.BasePopupWindow;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.p1593a.C32807a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.p1820e.C36913c;
import com.ss.android.lark.p1820e.p1821a.C36894a;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.statistics.ChatPinHitPoint;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b;
import com.ss.android.lark.pin.impl.v3.binder.viewholder.AudioViewNewHolder;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.audioview.AbstractC58321a;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.AudioWaveBar;
import com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002J \u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0014J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0002H\u0002J\u0018\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0010H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/AudioHolderNewView2;", "Lcom/ss/android/lark/pin/impl/v3/binder/holderview/BaseHolderView2;", "Lcom/ss/android/lark/pin/impl/v3/binder/viewholder/AudioViewNewHolder;", "context", "Landroid/content/Context;", "adapter", "Lcom/ss/android/lark/pin/impl/PinMessageAdapter;", "onContentViewClickListener", "Lcom/ss/android/lark/pin/impl/PinMessageAdapter$OnContentViewClickListener;", "(Landroid/content/Context;Lcom/ss/android/lark/pin/impl/PinMessageAdapter;Lcom/ss/android/lark/pin/impl/PinMessageAdapter$OnContentViewClickListener;)V", "mAdapter", "mAudioWaveBar", "Lcom/ss/android/lark/widget/lark_chat_keyboard/widget/AudioWaveBar;", "mPopupWindow", "Lcom/larksuite/framework/ui/BasePopupWindow;", "sNeedShowAudioText", "", "bindAudioCard", "", "viewHolder", "position", "", "item", "Lcom/ss/android/lark/pin/impl/entity/PinInfo;", "getAudioBarLengthInPx", "duration", "minLength", "lengthStep", "isShownInDialog", "onBindViewHolder", "onCreateViewHolder", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setDisplaySize", "holder", "showWaveBar", "anchorView", "Landroid/view/View;", "show", "AudioPlayCallbackHandler", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a */
public final class AudioHolderNewView2 extends AbstractC51540b<AudioViewNewHolder> {

    /* renamed from: a */
    public AudioWaveBar f128280a;

    /* renamed from: b */
    public BasePopupWindow f128281b;

    /* renamed from: h */
    private final boolean f128282h;

    /* renamed from: i */
    private final C51502e f128283i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/pin/impl/v3/binder/holderview/AudioHolderNewView2$AudioPlayCallbackHandler;", "Lcom/ss/android/lark/audio/opus/AudioPlayer$ICallBack;", "mAudioView", "Lcom/ss/android/lark/widget/audioview/IAudioView;", "(Lcom/ss/android/lark/widget/audioview/IAudioView;)V", "mHandler", "Landroid/os/Handler;", "error", "", "pause", "resume", "start", "stop", "updateProgress", "progress", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a */
    public static final class AudioPlayCallbackHandler implements C36894a.AbstractC36896a {

        /* renamed from: a */
        public final AbstractC58321a f128284a;

        /* renamed from: b */
        private final Handler f128285b = new Handler(Looper.getMainLooper());

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a$a */
        static final class RunnableC51531a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioPlayCallbackHandler f128286a;

            RunnableC51531a(AudioPlayCallbackHandler aVar) {
                this.f128286a = aVar;
            }

            public final void run() {
                this.f128286a.f128284a.mo136735b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a$b */
        static final class RunnableC51532b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioPlayCallbackHandler f128287a;

            RunnableC51532b(AudioPlayCallbackHandler aVar) {
                this.f128287a = aVar;
            }

            public final void run() {
                this.f128287a.f128284a.mo136736c();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a$c */
        static final class RunnableC51533c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioPlayCallbackHandler f128288a;

            RunnableC51533c(AudioPlayCallbackHandler aVar) {
                this.f128288a = aVar;
            }

            public final void run() {
                this.f128288a.f128284a.mo136737d();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a$d */
        static final class RunnableC51534d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioPlayCallbackHandler f128289a;

            RunnableC51534d(AudioPlayCallbackHandler aVar) {
                this.f128289a = aVar;
            }

            public final void run() {
                this.f128289a.f128284a.mo136734a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a$e */
        static final class RunnableC51535e implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioPlayCallbackHandler f128290a;

            RunnableC51535e(AudioPlayCallbackHandler aVar) {
                this.f128290a = aVar;
            }

            public final void run() {
                this.f128290a.f128284a.mo136735b();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$a$f */
        static final class RunnableC51536f implements Runnable {

            /* renamed from: a */
            final /* synthetic */ AudioPlayCallbackHandler f128291a;

            /* renamed from: b */
            final /* synthetic */ float f128292b;

            RunnableC51536f(AudioPlayCallbackHandler aVar, float f) {
                this.f128291a = aVar;
                this.f128292b = f;
            }

            public final void run() {
                this.f128291a.f128284a.setProgress(this.f128292b);
            }
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: a */
        public void mo122673a() {
            this.f128285b.post(new RunnableC51534d(this));
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: b */
        public void mo122675b() {
            this.f128285b.post(new RunnableC51532b(this));
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: c */
        public void mo122676c() {
            this.f128285b.post(new RunnableC51533c(this));
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: d */
        public void mo122677d() {
            this.f128285b.post(new RunnableC51535e(this));
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: e */
        public void mo122678e() {
            this.f128285b.post(new RunnableC51531a(this));
        }

        public AudioPlayCallbackHandler(AbstractC58321a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "mAudioView");
            this.f128284a = aVar;
        }

        @Override // com.ss.android.lark.p1820e.p1821a.C36894a.AbstractC36896a
        /* renamed from: a */
        public void mo122674a(float f) {
            this.f128285b.post(new RunnableC51536f(this, f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/pin/impl/v3/binder/holderview/AudioHolderNewView2$bindAudioCard$2", "Lcom/ss/android/lark/widget/lark_chat_keyboard/widget/PlayControlBar$PlayControlBarDelegate;", "onPause", "", "onPlay", "onProgressChanged", "progress", "", "onResume", "onStartTrackingTouch", "onStop", "onStopTrackingTouch", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$c */
    public static final class C51538c implements PlayControlBar.AbstractC58473a {

        /* renamed from: a */
        final /* synthetic */ AudioHolderNewView2 f128297a;

        /* renamed from: b */
        final /* synthetic */ AudioContent f128298b;

        /* renamed from: c */
        final /* synthetic */ AudioViewNewHolder f128299c;

        /* renamed from: d */
        final /* synthetic */ Message f128300d;

        /* renamed from: e */
        final /* synthetic */ C36913c f128301e;

        @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
        /* renamed from: d */
        public void mo122662d() {
            C36894a.m145605a().mo136204b();
        }

        @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
        /* renamed from: c */
        public void mo122661c() {
            ArrayList arrayList = new ArrayList();
            String str = this.f128300d.getcId();
            Intrinsics.checkExpressionValueIsNotNull(str, "clickMessage.getcId()");
            arrayList.add(str);
            this.f128301e.mo136288a(arrayList);
        }

        @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
        /* renamed from: a */
        public void mo122658a() {
            if (this.f128298b.getAudioWaveBytes() != null && !this.f128297a.mo177522a()) {
                AudioHolderNewView2 aVar = this.f128297a;
                PlayControlBar playControlBar = this.f128299c.mPlayControlBar;
                Intrinsics.checkExpressionValueIsNotNull(playControlBar, "viewHolder.mPlayControlBar");
                aVar.mo177519a((View) playControlBar, true);
                AudioWaveBar audioWaveBar = this.f128297a.f128280a;
                if (audioWaveBar != null) {
                    audioWaveBar.setWaveBytes(this.f128298b.getAudioWaveBytes());
                }
                AudioWaveBar audioWaveBar2 = this.f128297a.f128280a;
                if (audioWaveBar2 != null) {
                    PlayControlBar playControlBar2 = this.f128299c.mPlayControlBar;
                    Intrinsics.checkExpressionValueIsNotNull(playControlBar2, "viewHolder.mPlayControlBar");
                    audioWaveBar2.setDurationText(playControlBar2.getDurationText());
                }
            }
            C36894a.m145605a().mo136204b();
            ChatPinHitPoint.f128202a.mo177416h();
        }

        @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
        /* renamed from: b */
        public void mo122660b() {
            if (!TextUtils.isEmpty(this.f128298b.getLocalFilePath()) && !this.f128297a.mo177522a()) {
                AudioHolderNewView2 aVar = this.f128297a;
                PlayControlBar playControlBar = this.f128299c.mPlayControlBar;
                Intrinsics.checkExpressionValueIsNotNull(playControlBar, "viewHolder.mPlayControlBar");
                aVar.mo177519a((View) playControlBar, false);
            }
            if (C36894a.m145605a().mo136202a(this.f128298b.getLocalFilePath())) {
                AudioContent audioContent = this.f128298b;
                PlayControlBar playControlBar2 = this.f128299c.mPlayControlBar;
                Intrinsics.checkExpressionValueIsNotNull(playControlBar2, "viewHolder.mPlayControlBar");
                audioContent.setProgress((int) playControlBar2.getProgress());
                C36894a a = C36894a.m145605a();
                PlayControlBar playControlBar3 = this.f128299c.mPlayControlBar;
                Intrinsics.checkExpressionValueIsNotNull(playControlBar3, "viewHolder.mPlayControlBar");
                a.mo136199a(playControlBar3.getProgress() / 100.0f);
                C36894a.m145605a().mo136205c();
                return;
            }
            mo122661c();
        }

        @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.PlayControlBar.AbstractC58473a
        /* renamed from: a */
        public void mo122659a(int i) {
            if (this.f128297a.f128281b != null) {
                BasePopupWindow basePopupWindow = this.f128297a.f128281b;
                if (basePopupWindow == null) {
                    Intrinsics.throwNpe();
                }
                if (basePopupWindow.isShowing() && this.f128297a.f128280a != null) {
                    AudioWaveBar audioWaveBar = this.f128297a.f128280a;
                    if (audioWaveBar != null) {
                        audioWaveBar.setProgress(i);
                    }
                    AudioWaveBar audioWaveBar2 = this.f128297a.f128280a;
                    if (audioWaveBar2 != null) {
                        PlayControlBar playControlBar = this.f128299c.mPlayControlBar;
                        Intrinsics.checkExpressionValueIsNotNull(playControlBar, "viewHolder.mPlayControlBar");
                        audioWaveBar2.setDurationText(playControlBar.getDurationText());
                    }
                }
            }
            this.f128298b.setProgress(i);
        }

        C51538c(AudioHolderNewView2 aVar, AudioContent audioContent, AudioViewNewHolder audioViewNewHolder, Message message, C36913c cVar) {
            this.f128297a = aVar;
            this.f128298b = audioContent;
            this.f128299c = audioViewNewHolder;
            this.f128300d = message;
            this.f128301e = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"com/ss/android/lark/pin/impl/v3/binder/holderview/AudioHolderNewView2$bindAudioCard$audioItemProvider$1", "Lcom/ss/android/lark/audio/SequnceAudioPlayer$IAudioItemProvider;", "playCallbackHandler", "Lcom/ss/android/lark/pin/impl/v3/binder/holderview/AudioHolderNewView2$AudioPlayCallbackHandler;", "getAudioDuration", "", "getAudioLocalFilePath", "", "getMsgId", "getPlayCallback", "Lcom/ss/android/lark/audio/opus/AudioPlayer$ICallBack;", "getProgress", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$d */
    public static final class C51539d implements C36913c.AbstractC36916a {

        /* renamed from: a */
        final /* synthetic */ AudioContent f128302a;

        /* renamed from: b */
        final /* synthetic */ AudioViewNewHolder f128303b;

        /* renamed from: c */
        private final AudioPlayCallbackHandler f128304c;

        @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
        /* renamed from: e */
        public String mo122667e() {
            return null;
        }

        @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
        /* renamed from: a */
        public C36894a.AbstractC36896a mo122663a() {
            return this.f128304c;
        }

        @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
        /* renamed from: b */
        public String mo122664b() {
            return this.f128302a.getLocalFilePath();
        }

        @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
        /* renamed from: c */
        public int mo122665c() {
            return this.f128302a.getDuration();
        }

        @Override // com.ss.android.lark.p1820e.C36913c.AbstractC36916a
        /* renamed from: d */
        public int mo122666d() {
            return this.f128302a.getProgress();
        }

        C51539d(AudioContent audioContent, AudioViewNewHolder audioViewNewHolder) {
            this.f128302a = audioContent;
            this.f128303b = audioViewNewHolder;
            PlayControlBar playControlBar = audioViewNewHolder.mPlayControlBar;
            Intrinsics.checkExpressionValueIsNotNull(playControlBar, "viewHolder.mPlayControlBar");
            this.f128304c = new AudioPlayCallbackHandler(playControlBar);
        }
    }

    /* renamed from: a */
    public final boolean mo177522a() {
        if (this.f128283i == null) {
            return true;
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/pin/impl/v3/binder/holderview/AudioHolderNewView2$bindAudioCard$1", "Lcom/ss/android/lark/widget/audioview/IAudioView$IAudioViewListener;", "onLongClicked", "", "view", "Landroid/view/View;", "onToggle", "", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.a$b */
    public static final class C51537b implements AbstractC58321a.AbstractC58322a {

        /* renamed from: a */
        final /* synthetic */ AudioHolderNewView2 f128293a;

        /* renamed from: b */
        final /* synthetic */ AudioViewNewHolder f128294b;

        /* renamed from: c */
        final /* synthetic */ int f128295c;

        /* renamed from: d */
        final /* synthetic */ PinInfo f128296d;

        @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
        /* renamed from: a */
        public void mo122668a(View view) {
        }

        @Override // com.ss.android.lark.widget.audioview.AbstractC58321a.AbstractC58322a
        /* renamed from: b */
        public boolean mo122669b(View view) {
            return this.f128293a.mo200116a(this.f128294b.itemView, this.f128295c, this.f128296d);
        }

        C51537b(AudioHolderNewView2 aVar, AudioViewNewHolder audioViewNewHolder, int i, PinInfo bVar) {
            this.f128293a = aVar;
            this.f128294b = audioViewNewHolder;
            this.f128295c = i;
            this.f128296d = bVar;
        }
    }

    /* renamed from: a */
    private final void m199989a(AudioViewNewHolder audioViewNewHolder) {
        TextView textView = audioViewNewHolder.mRecognizedTv;
        Intrinsics.checkExpressionValueIsNotNull(textView, "holder.mRecognizedTv");
        C25649b.m91857a(textView, LarkFont.HEADLINE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AudioViewNewHolder mo31176b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        AudioViewNewHolder a = AudioViewNewHolder.C51596a.m200235a(layoutInflater, viewGroup);
        Intrinsics.checkExpressionValueIsNotNull(a, "AudioViewNewHolder.Facto…eate(inflater, container)");
        return a;
    }

    /* renamed from: a */
    public final void mo177519a(View view, boolean z) {
        BasePopupWindow basePopupWindow;
        int i;
        if (this.f128280a == null || this.f128281b == null) {
            this.f128280a = new AudioWaveBar(this.f146181d);
            BasePopupWindow basePopupWindow2 = new BasePopupWindow(this.f128280a, -2, -2);
            this.f128281b = basePopupWindow2;
            if (basePopupWindow2 != null) {
                basePopupWindow2.setOutsideTouchable(true);
            }
        }
        if (z) {
            BasePopupWindow basePopupWindow3 = this.f128281b;
            if (basePopupWindow3 == null) {
                Intrinsics.throwNpe();
            }
            if (!basePopupWindow3.isShowing()) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                if (iArr[1] > UIHelper.dp2px(64.0f) + DeviceUtils.getStatusHeight(this.f146181d)) {
                    i = iArr[1] - UIHelper.dp2px(64.0f);
                } else {
                    i = iArr[1] + UIHelper.dp2px(20.0f);
                }
                BasePopupWindow basePopupWindow4 = this.f128281b;
                if (basePopupWindow4 != null) {
                    basePopupWindow4.showAtLocation(view, 49, 0, i);
                    return;
                }
                return;
            }
        }
        if (!z && (basePopupWindow = this.f128281b) != null) {
            basePopupWindow.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioHolderNewView2(Context context, C51502e eVar, C51502e.AbstractC51506c cVar) {
        super(context, cVar);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f128283i = eVar;
    }

    /* renamed from: a */
    private final int m199988a(int i, int i2, int i3) {
        int i4 = ((i / 1000) - 1) / 10;
        if (i4 > 6) {
            i4 = 6;
        }
        return UIHelper.dp2px((float) (i2 + (i4 * i3)));
    }

    /* renamed from: b */
    private final void m199990b(AudioViewNewHolder audioViewNewHolder, int i, PinInfo bVar) {
        boolean z;
        AbstractC51472a.AbstractC51474b i2;
        Message g = bVar.mo177396g();
        Content content = g.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "clickMessage.getContent()");
        AudioContent audioContent = (AudioContent) content;
        AbstractC51472a a = PinModule.f128091b.mo177253a();
        if (!(a == null || (i2 = a.mo144035i()) == null)) {
            i2.mo144074a(g, false);
        }
        if (audioContent.isNeedHideText() || TextUtils.isEmpty(audioContent.getRecognizedText()) || !this.f128282h) {
            z = false;
        } else {
            z = true;
        }
        int a2 = m199988a(audioContent.getDuration(), 140, 20);
        if (z) {
            TextView textView = audioViewNewHolder.mRecognizedTv;
            Intrinsics.checkExpressionValueIsNotNull(textView, "viewHolder.mRecognizedTv");
            textView.setText(audioContent.getRecognizedText());
            TextView textView2 = audioViewNewHolder.mRecognizedTv;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "viewHolder.mRecognizedTv");
            textView2.setVisibility(0);
        } else {
            TextView textView3 = audioViewNewHolder.mRecognizedTv;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "viewHolder.mRecognizedTv");
            textView3.setVisibility(8);
        }
        View view = audioViewNewHolder.mAudioView;
        Intrinsics.checkExpressionValueIsNotNull(view, "viewHolder.mAudioView");
        view.setMinimumWidth(a2);
        PlayControlBar playControlBar = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar, "viewHolder.mPlayControlBar");
        playControlBar.setDuration(audioContent.getDuration());
        ImageView imageView = audioViewNewHolder.mUnreadTipsIv;
        Intrinsics.checkExpressionValueIsNotNull(imageView, "viewHolder.mUnreadTipsIv");
        imageView.setVisibility(8);
        if (z) {
            View view2 = audioViewNewHolder.mAudioView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "viewHolder.mAudioView");
            view2.setBackground(C32807a.m125898a(UIHelper.getDrawable(R.drawable.pin_audio_bg)));
            audioViewNewHolder.mAudioView.setPadding(UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(12.0f), UIHelper.dp2px(8.0f));
        } else {
            View view3 = audioViewNewHolder.mAudioView;
            Intrinsics.checkExpressionValueIsNotNull(view3, "viewHolder.mAudioView");
            view3.setBackground(C32807a.m125898a(UIHelper.getDrawable(R.drawable.pin_audio_bg)));
            audioViewNewHolder.mAudioView.setPadding(UIHelper.dp2px(10.0f), UIHelper.dp2px(8.0f), UIHelper.dp2px(10.0f), UIHelper.dp2px(8.0f));
        }
        if (bVar.mo177391b()) {
            View view4 = audioViewNewHolder.mAudioView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "viewHolder.mAudioView");
            view4.setBackground(C32807a.m125898a(UIHelper.getDrawable(R.drawable.pin_audio_bg)));
        }
        PlayControlBar playControlBar2 = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar2, "viewHolder.mPlayControlBar");
        playControlBar2.setDuration(audioContent.getDuration());
        PlayControlBar playControlBar3 = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar3, "viewHolder.mPlayControlBar");
        C36913c a3 = C36913c.m145732a(playControlBar3.getContext());
        float a4 = a3.mo136284a(audioContent.getLocalFilePath());
        PlayControlBar playControlBar4 = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar4, "viewHolder.mPlayControlBar");
        playControlBar4.setProgress(a4);
        C51539d dVar = new C51539d(audioContent, audioViewNewHolder);
        PlayControlBar playControlBar5 = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar5, "viewHolder.mPlayControlBar");
        playControlBar5.setTag(dVar);
        a3.mo136287a(g.getcId(), dVar);
        PlayControlBar playControlBar6 = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar6, "viewHolder.mPlayControlBar");
        playControlBar6.setListener(new C51537b(this, audioViewNewHolder, i, bVar));
        PlayControlBar playControlBar7 = audioViewNewHolder.mPlayControlBar;
        Intrinsics.checkExpressionValueIsNotNull(playControlBar7, "viewHolder.mPlayControlBar");
        playControlBar7.setDelegate(new C51538c(this, audioContent, audioViewNewHolder, g, a3));
    }

    /* renamed from: a */
    public void mo177520a(AudioViewNewHolder audioViewNewHolder, int i, PinInfo bVar) {
        Intrinsics.checkParameterIsNotNull(audioViewNewHolder, "viewHolder");
        Intrinsics.checkParameterIsNotNull(bVar, "item");
        super.mo31174a((AbstractC51540b.C51541a) audioViewNewHolder, i, bVar);
        m199990b(audioViewNewHolder, i, bVar);
        if (!DesktopUtil.m144307b()) {
            m199989a(audioViewNewHolder);
        }
    }
}
