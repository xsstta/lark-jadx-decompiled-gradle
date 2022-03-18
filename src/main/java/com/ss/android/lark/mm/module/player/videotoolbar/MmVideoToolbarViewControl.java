package com.ss.android.lark.mm.module.player.videotoolbar;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.MmDetailActivity;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmPlaySettingInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.AbstractC46598e;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.core.layer.widget.KeyWordCircle;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.module.player.speed.PodCastSpeedPickerDialog;
import com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog;
import com.ss.android.lark.mm.module.player.speed.repo.SilenceDetail;
import com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d;
import com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar;
import com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar;
import com.ss.android.lark.mm.module.podcast.MmPodcastControl;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.module.reaction.model.EmojiReaction;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciablePodcastDetailTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.utils.MmNavigationBarUtils;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import com.ss.android.lark.mm.widget.MmLikeLottieView;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\rH\u0016J\b\u0010!\u001a\u00020\rH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0002H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u000fH\u0016J\u0018\u00101\u001a\u00020\u001b2\u000e\u00102\u001a\n\u0012\u0004\u0012\u000204\u0018\u000103H\u0016J\u0010\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u00020\u000fH\u0016J\b\u00107\u001a\u00020\u001bH\u0016J\b\u00108\u001a\u00020\u001bH\u0016J\u0012\u00109\u001a\u00020\u001b2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\rH\u0016J\b\u0010>\u001a\u00020\u001bH\u0016J\b\u0010?\u001a\u00020\u001bH\u0016J\u0010\u0010@\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u00020BH\u0016J\u0018\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\rH\u0002J\u0018\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020(2\u0006\u0010I\u001a\u00020\u000fH\u0016J\b\u0010J\u001a\u00020\u001bH\u0016J\b\u0010K\u001a\u00020\u001bH\u0016J\u0010\u0010L\u001a\u00020\u001b2\u0006\u0010M\u001a\u00020(H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarListener;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarDependency;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "audioToolbar", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolBar;", "currentPlayPosition", "", "isAudioMode", "", "Ljava/lang/Boolean;", "isSkipSilence", "locations", "", "screenHeight", "silenceList", "", "Lcom/ss/android/lark/mm/module/player/speed/repo/SilenceDetail;", "simpleVideoToolbar", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar;", "bindPlayAdapter", "", "playAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "doEnterPodcast", "doShowSpeedPicker", "getBottomPanelHeight", "getBottomPanelY", "getMetSilenceItem", "progress", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "getSeekBarPosition", "", "initTimeLineData", "initToolbarForAudio", "initToolbarForVideo", "onBaseInfoChange", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "onChangeCommentSwitchState", "switchOn", "onChangeReactionLine", "list", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "onChangeReactionSwitchState", "isSwitchOn", "onCreate", "onDestroy", "onFindResult", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "onFindResultFocusChange", "index", "onForceUpdateProgress", "onHideToolBar", "onMediaViewMove", "scale", "", "onMediaViewTouchUp", "totalDiff", "onProgressChange", "fromUser", "onSeekTo", "ts", "manual", "onStart", "onSwitchPodcastSucceed", "recordLastProgress", "timestamp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g */
public final class MmVideoToolbarViewControl extends MmBaseViewControl<IMmVideoToolbarListener, IMmVideoToolbarDependency> implements IMmVideoToolbarInquirer, IMmVideoToolbarListener {

    /* renamed from: a */
    public final MmVideoToolBar f117594a;

    /* renamed from: b */
    public MmSimpleVideoToolbar f117595b;

    /* renamed from: c */
    public boolean f117596c;

    /* renamed from: d */
    public final List<SilenceDetail> f117597d;

    /* renamed from: e */
    public final IMmViewControlContext f117598e;

    /* renamed from: f */
    public final MmBaseViewControlAdapter<IMmVideoToolbarListener, IMmVideoToolbarDependency> f117599f;

    /* renamed from: g */
    private final int[] f117600g = new int[2];

    /* renamed from: h */
    private int f117601h;

    /* renamed from: i */
    private final int f117602i;

    /* renamed from: j */
    private Boolean f117603j;

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: n */
    public IMmVideoToolbarListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: x */
    public void mo161248x() {
        super.mo161248x();
    }

    /* renamed from: a */
    public final void mo164237a(boolean z, int i) {
        this.f117601h = i;
        if (z) {
            C46587a.m184215a(((IMmVideoToolbarDependency) mo161247w()).mo161661n(), i);
        }
        ((IMmVideoToolbarDependency) mo161247w()).mo161645a((long) i, z);
        SilenceDetail b = m185080b(i);
        if (b != null && this.f117596c && !z) {
            if (mo164238k()) {
                this.f117594a.mo164154a((int) (b.getStopTime() + 1));
                return;
            }
            MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117595b;
            if (mmSimpleVideoToolbar != null) {
                mmSimpleVideoToolbar.mo164123a((int) (b.getStopTime() + 1));
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164215a(boolean z) {
        if (mo164238k()) {
            this.f117594a.setEmojiSwitchState(Boolean.valueOf(z));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164214a(List<? extends HighlightTimeLineItem> list) {
        if (list != 0) {
            if (mo164238k()) {
                this.f117594a.setTimeLineList(list);
                return;
            }
            C46602i b = ((IMmVideoToolbarDependency) mo161247w()).mo161649b();
            if (b != null) {
                HightlightTimeLine hightlightTimeLine = new HightlightTimeLine();
                hightlightTimeLine.timeline = list;
                b.mo163728a(hightlightTimeLine);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u001a\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$initToolbarForAudio$4", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolBar$IVideoToolbarListener;", "onComplete", "", "onError", "onPageTouchSeek", "timestamp", "", "onPause", "onPlay", "onPlayNext", "onPlayPrev", "onPodcastEnter", "onPodcastExit", "onSeekManual", "sendReaction", "reactionKey", "", "progress", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$f */
    public static final class C46740f implements MmVideoToolBar.AbstractC46729b {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117609a;

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: c */
        public void mo164196c() {
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: d */
        public void mo164197d() {
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: h */
        public void mo164201h() {
            this.f117609a.mo164240m();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: a */
        public void mo164192a() {
            this.f117609a.f117599f.mo161230c().mo161650c();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: b */
        public void mo164195b() {
            this.f117609a.f117599f.mo161230c().mo161652e();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: e */
        public void mo164198e() {
            ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161651d();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: f */
        public void mo164199f() {
            this.f117609a.f117594a.setVisibility(8);
            ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161654g();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: g */
        public void mo164200g() {
            this.f117609a.f117594a.setVisibility(8);
            ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161653f();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: i */
        public void mo164202i() {
            C45855f.m181664c("MmDetailToolbarViewControl", "click exit podcast");
            C45852d a = C45852d.m181651a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmControl.of()");
            a.mo161151b().mo164279i();
            MmDetailActivity.Companion.m182008a(MmDetailActivity.f115761d, this.f117609a.f117598e.mo161232n(), ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161662o(), 18, ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161657j(), new MmPlaySettingInfo(((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161658k(), ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161659l(), ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161664q()), null, 32, null);
            FragmentActivity a2 = C47107a.m186565a(this.f117609a.f117598e.mo161232n());
            if (a2 != null) {
                a2.finish();
            }
            ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161669v();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46740f(MmVideoToolbarViewControl gVar) {
            this.f117609a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: a */
        public void mo164193a(long j) {
            this.f117609a.mo164236a(j);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$initToolbarForAudio$4$sendReaction$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$f$a */
        public static final class C46741a extends AbstractC47070c<String> {

            /* renamed from: a */
            final /* synthetic */ C46740f f117610a;

            /* renamed from: b */
            final /* synthetic */ EmojiReaction f117611b;

            @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
            /* renamed from: a */
            public void mo161288a(C47068a aVar) {
                C45855f.m181666e("MmDetailToolbarViewControl", "error " + aVar);
            }

            /* renamed from: a */
            public void mo161289a(String str) {
                this.f117610a.f117609a.f117594a.mo164157a(this.f117611b);
                C45855f.m181663b("MmDetailToolbarViewControl", "onSuccess");
            }

            C46741a(C46740f fVar, EmojiReaction emojiReaction) {
                this.f117610a = fVar;
                this.f117611b = emojiReaction;
            }
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46729b
        /* renamed from: a */
        public /* synthetic */ void mo164194a(String str, Long l) {
            mo164244a(str, l.longValue());
        }

        /* renamed from: a */
        public void mo164244a(String str, long j) {
            ((MmLikeLottieView) this.f117609a.f117598e.mo161233o().findViewById(R.id.mm_like_big_pc)).mo165610a();
            EmojiReaction emojiReaction = new EmojiReaction(str, j, UUID.randomUUID().toString());
            C47057a.m186288f(((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161660m(), ((IMmVideoToolbarDependency) this.f117609a.mo161247w()).mo161661n(), emojiReaction.toJson(), new C46741a(this, emojiReaction));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$initToolbarForVideo$1", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmSimpleVideoToolbar$ISimpleVideoToolbarListener;", "onEnterPodcast", "", "onPageTouchSeek", "timestamp", "", "onSeekManual", "showMoreMenu", "showSpeedPicker", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$g */
    public static final class C46742g implements MmSimpleVideoToolbar.ISimpleVideoToolbarListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117612a;

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.ISimpleVideoToolbarListener
        /* renamed from: a */
        public void mo164147a() {
            this.f117612a.mo164240m();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.ISimpleVideoToolbarListener
        /* renamed from: c */
        public void mo164150c() {
            this.f117612a.mo164239l();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.ISimpleVideoToolbarListener
        /* renamed from: b */
        public void mo164149b() {
            ((IMmVideoToolbarDependency) this.f117612a.mo161247w()).mo161666s();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.ISimpleVideoToolbarListener
        /* renamed from: d */
        public void mo164151d() {
            ((IMmVideoToolbarDependency) this.f117612a.mo161247w()).mo161651d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46742g(MmVideoToolbarViewControl gVar) {
            this.f117612a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmSimpleVideoToolbar.ISimpleVideoToolbarListener
        /* renamed from: a */
        public void mo164148a(long j) {
            this.f117612a.mo164236a(j);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: i */
    public void mo164219i() {
        this.f117594a.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$initToolbarForAudio$3", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolBar$IVideoToolbarDepend;", "getObjectToken", "", "getPlayerAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "getSpeed", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$e */
    public static final class C46739e implements MmVideoToolBar.AbstractC46728a {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117608a;

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46728a
        /* renamed from: a */
        public float mo164189a() {
            return ((IMmVideoToolbarDependency) this.f117608a.mo161247w()).mo161658k();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46728a
        /* renamed from: b */
        public String mo164190b() {
            return ((IMmVideoToolbarDependency) this.f117608a.mo161247w()).mo161661n();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.AbstractC46728a
        /* renamed from: c */
        public C46602i mo164191c() {
            return ((IMmVideoToolbarDependency) this.f117608a.mo161247w()).mo161649b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46739e(MmVideoToolbarViewControl gVar) {
            this.f117608a = gVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$initToolbarForVideo$2", "Lcom/ss/android/lark/mm/module/player/videotoolbar/ISeekBarListener;", "onProgressChanged", "", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$h */
    public static final class C46743h implements AbstractC46732d {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117613a;

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d
        /* renamed from: a */
        public void mo164221a() {
            ((IMmVideoToolbarDependency) this.f117613a.mo161247w()).mo161668u();
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d
        /* renamed from: b */
        public void mo164223b() {
            ((IMmVideoToolbarDependency) this.f117613a.mo161247w()).mo161667t();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46743h(MmVideoToolbarViewControl gVar) {
            this.f117613a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d
        /* renamed from: a */
        public void mo164222a(int i, boolean z) {
            this.f117613a.mo164237a(z, i);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarInquirer
    /* renamed from: b */
    public int mo164206b() {
        if (mo164238k()) {
            return this.f117594a.getHeight();
        }
        return 0;
    }

    /* renamed from: q */
    private final void m185083q() {
        if (!((IMmVideoToolbarDependency) mo161247w()).mo161663p()) {
            this.f117599f.mo161230c().mo161646a(new C46736b(this));
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarInquirer
    /* renamed from: a */
    public int mo164205a() {
        if (!mo164238k()) {
            return this.f117602i;
        }
        this.f117594a.getLocationOnScreen(this.f117600g);
        return this.f117600g[1];
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        ((IMmVideoToolbarDependency) mo161247w()).mo161663p();
        m185083q();
        if (mo164238k()) {
            m185082p();
        } else {
            m185081o();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarInquirer
    /* renamed from: f */
    public long mo164207f() {
        int vPostion;
        if (mo164238k()) {
            vPostion = this.f117594a.getVPostion();
        } else {
            MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117595b;
            if (mmSimpleVideoToolbar == null) {
                return 0;
            }
            vPostion = mmSimpleVideoToolbar.getVPostion();
        }
        return (long) vPostion;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: h */
    public void mo161245h() {
        super.mo161245h();
        if (mo164238k()) {
            this.f117594a.mo164187u();
            return;
        }
        MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117595b;
        if (mmSimpleVideoToolbar != null) {
            mmSimpleVideoToolbar.mo164135m();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: j */
    public void mo164220j() {
        C46587a.m184216a(((IMmVideoToolbarDependency) mo161247w()).mo161661n(), this.f117601h, true);
    }

    /* renamed from: k */
    public final boolean mo164238k() {
        boolean z;
        MmBaseInfo a;
        if (this.f117603j == null) {
            if (((IMmVideoToolbarDependency) mo161247w()).mo161663p() || ((a = ((IMmVideoToolbarDependency) mo161247w()).mo161643a()) != null && a.isAudioType())) {
                z = true;
            } else {
                z = false;
            }
            this.f117603j = Boolean.valueOf(z);
        }
        return Intrinsics.areEqual((Object) this.f117603j, (Object) true);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$i */
    static final class RunnableC46744i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117614a;

        /* renamed from: b */
        final /* synthetic */ boolean f117615b;

        /* renamed from: c */
        final /* synthetic */ long f117616c;

        RunnableC46744i(MmVideoToolbarViewControl gVar, boolean z, long j) {
            this.f117614a = gVar;
            this.f117615b = z;
            this.f117616c = j;
        }

        public final void run() {
            if (this.f117615b) {
                if (this.f117614a.mo164238k()) {
                    this.f117614a.f117594a.mo164159b((int) this.f117616c);
                    return;
                }
                MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117614a.f117595b;
                if (mmSimpleVideoToolbar != null) {
                    mmSimpleVideoToolbar.mo164127b((int) this.f117616c);
                }
            } else if (this.f117614a.mo164238k()) {
                this.f117614a.f117594a.mo164154a((int) this.f117616c);
            } else {
                MmSimpleVideoToolbar mmSimpleVideoToolbar2 = this.f117614a.f117595b;
                if (mmSimpleVideoToolbar2 != null) {
                    mmSimpleVideoToolbar2.mo164123a((int) this.f117616c);
                }
            }
        }
    }

    /* renamed from: o */
    private final void m185081o() {
        MmBaseInfo a = this.f117599f.mo161230c().mo161643a();
        if (a != null) {
            MmSimpleVideoToolbar mmSimpleVideoToolbar = (MmSimpleVideoToolbar) this.f117598e.mo161233o().findViewById(R.id.simpleVideoToolbar);
            this.f117595b = mmSimpleVideoToolbar;
            if (mmSimpleVideoToolbar != null) {
                mmSimpleVideoToolbar.setMmVideoToolbarCircle((KeyWordCircle) this.f117598e.mo161233o().findViewById(R.id.mmVideoToolbarCircle));
            }
            MmSimpleVideoToolbar mmSimpleVideoToolbar2 = this.f117595b;
            if (mmSimpleVideoToolbar2 != null) {
                mmSimpleVideoToolbar2.setVisibility(0);
            }
            MmSimpleVideoToolbar mmSimpleVideoToolbar3 = this.f117595b;
            if (mmSimpleVideoToolbar3 != null) {
                mmSimpleVideoToolbar3.setMListener(new C46742g(this));
            }
            MmSimpleVideoToolbar mmSimpleVideoToolbar4 = this.f117595b;
            if (mmSimpleVideoToolbar4 != null) {
                mmSimpleVideoToolbar4.setMSeekListener(new C46743h(this));
            }
            MmSimpleVideoToolbar mmSimpleVideoToolbar5 = this.f117595b;
            if (mmSimpleVideoToolbar5 != null) {
                mmSimpleVideoToolbar5.mo164124a(0, (int) a.getDuration());
            }
            MmSimpleVideoToolbar mmSimpleVideoToolbar6 = this.f117595b;
            if (mmSimpleVideoToolbar6 != null) {
                mmSimpleVideoToolbar6.setWholeTimeStamp(Long.valueOf(a.getDuration()));
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: g */
    public void mo164218g() {
        MmBaseInfo a;
        String str;
        if (mo164238k() && (a = ((IMmVideoToolbarDependency) mo161247w()).mo161643a()) != null) {
            this.f117597d.clear();
            this.f117594a.setDuration((int) a.getDuration());
            MmVideoToolBar mmVideoToolBar = this.f117594a;
            MmBaseInfo a2 = ((IMmVideoToolbarDependency) mo161247w()).mo161643a();
            if (a2 != null) {
                str = a2.getObjectToken();
            } else {
                str = null;
            }
            mmVideoToolBar.mo164154a(C46587a.m184214a(str));
            this.f117594a.setVisibility(0);
            this.f117594a.mo164158a(((IMmVideoToolbarDependency) mo161247w()).mo161655h(), ((IMmVideoToolbarDependency) mo161247w()).mo161656i());
        }
    }

    /* renamed from: m */
    public final void mo164240m() {
        String str;
        if (MmRecordManager.f117918g.mo164549a()) {
            C45858j.m181677a((int) R.string.MMWeb_G_PodcastDisabledWhileRecording);
            return;
        }
        MmAppreciablePodcastDetailTracker.m186400a();
        FragmentActivity a = C47107a.m186565a(this.f117598e.mo161232n());
        if (a != null) {
            a.finish();
        }
        MmPlaySettingInfo mmPlaySettingInfo = new MmPlaySettingInfo(((IMmVideoToolbarDependency) mo161247w()).mo161658k(), ((IMmVideoToolbarDependency) mo161247w()).mo161659l(), ((IMmVideoToolbarDependency) mo161247w()).mo161664q());
        C45852d a2 = C45852d.m181651a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "MmControl.of()");
        MmPodcastControl b = a2.mo161151b();
        String o = ((IMmVideoToolbarDependency) mo161247w()).mo161662o();
        MmBaseInfo a3 = ((IMmVideoToolbarDependency) mo161247w()).mo161643a();
        if (a3 == null || (str = a3.getTopic()) == null) {
            str = "";
        }
        b.mo164266a(new MmPodcastLinkInfo(o, str), ((IMmVideoToolbarDependency) mo161247w()).mo161657j(), mmPlaySettingInfo);
        C45852d a4 = C45852d.m181651a();
        Intrinsics.checkExpressionValueIsNotNull(a4, "MmControl.of()");
        a4.mo161151b().mo164280j();
    }

    /* renamed from: p */
    private final void m185082p() {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        MmBaseInfo a = this.f117599f.mo161230c().mo161643a();
        if (a != null) {
            this.f117594a.setSpeedClickListener(new View$OnClickListenerC46737c(this));
            if (!((IMmVideoToolbarDependency) mo161247w()).mo161663p()) {
                MmBaseInfo a2 = ((IMmVideoToolbarDependency) mo161247w()).mo161643a();
                if (a2 != null) {
                    str = a2.getVideoUrlWithLocal();
                } else {
                    str = null;
                }
                String str2 = str;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    this.f117594a.setVisibility(0);
                }
            }
            this.f117594a.setSpeed(((IMmVideoToolbarDependency) mo161247w()).mo161658k());
            MmVideoToolBar mmVideoToolBar = this.f117594a;
            if (((IMmVideoToolbarDependency) mo161247w()).mo161663p() || !((IMmVideoToolbarDependency) mo161247w()).mo161665r()) {
                z = false;
            } else {
                z = true;
            }
            mmVideoToolBar.setPodcastEnterVisibility(z);
            MmVideoToolBar mmVideoToolBar2 = this.f117594a;
            if (((IMmVideoToolbarDependency) mo161247w()).mo161663p() || ((IMmVideoToolbarDependency) mo161247w()).mo161665r()) {
                z2 = false;
            } else {
                z2 = true;
            }
            mmVideoToolBar2.setReactionIconVisibility(z2);
            this.f117594a.mo164186t();
            if (((IMmVideoToolbarDependency) mo161247w()).mo161663p()) {
                ViewGroup.LayoutParams layoutParams = this.f117594a.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = MmNavigationBarUtils.f118632a.mo165490a(this.f117598e.mo161232n());
                    this.f117594a.setLayoutParams(marginLayoutParams);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            this.f117594a.setSeekListener(new C46738d(this));
            this.f117594a.mo164158a(((IMmVideoToolbarDependency) mo161247w()).mo161655h(), ((IMmVideoToolbarDependency) mo161247w()).mo161656i());
            this.f117594a.mo164155a(0, (int) a.getDuration());
            this.f117594a.setVideoToolbarDepend(new C46739e(this));
            this.f117594a.setVideoToolbarListener(new C46740f(this));
            this.f117594a.setWholeTimeStamp(Long.valueOf(a.getDuration()));
            if (((IMmVideoToolbarDependency) mo161247w()).mo161663p()) {
                this.f117594a.setPodcast(true);
            }
        }
    }

    /* renamed from: l */
    public final void mo164239l() {
        String str;
        PodCastSpeedPickerDialog aVar;
        FragmentManager supportFragmentManager;
        String m = this.f117599f.mo161230c().mo161660m();
        MmBaseInfo a = this.f117599f.mo161230c().mo161643a();
        if (a == null || (str = a.getObjectToken()) == null) {
            str = "";
        }
        C46735a aVar2 = new C46735a(this);
        boolean q = ((IMmVideoToolbarDependency) mo161247w()).mo161664q();
        float k = ((IMmVideoToolbarDependency) mo161247w()).mo161658k();
        if (((IMmVideoToolbarDependency) mo161247w()).mo161663p()) {
            C47083e.m186423a(this.f117598e.mo161232n(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("adjust_button").mo165421c());
            C47083e.m186423a(this.f117598e.mo161232n(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("setting").mo165423e("vc_minutes_podcast_setting_view").mo165421c());
            aVar = new PodCastSpeedPickerDialog(q, m, str, k, aVar2);
        } else {
            C47083e.m186423a(this.f117598e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("adjust_button").mo165421c());
            C47083e.m186423a(this.f117598e.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("setting").mo165423e("vc_minutes_detail_setting_view").mo165421c());
            aVar = new SpeedPickerDialog(q, str, k, aVar2);
        }
        FragmentActivity a2 = C47107a.m186565a(this.f117598e.mo161232n());
        if (!(a2 == null || (supportFragmentManager = a2.getSupportFragmentManager()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "it");
            aVar.mo5511a(supportFragmentManager, "speed");
        }
        if (aVar instanceof PodCastSpeedPickerDialog) {
            C47083e.m186423a(this.f117598e.mo161232n(), "vc_minutes_podcast_setting_view", C47086i.m186432a().mo165421c());
        } else {
            C47083e.m186423a(this.f117598e.mo161232n(), "vc_minutes_detail_setting_view", C47086i.m186432a().mo165421c());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$doShowSpeedPicker$speedPickerDepend$1", "Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;", "getSpeed", "", "onSilence", "", "isEnabled", "", "objectToken", "", "silenceList", "", "Lcom/ss/android/lark/mm/module/player/speed/repo/SilenceDetail;", "onSpeed", "speed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$a */
    public static final class C46735a implements SpeedPickerDialog.ISpeedPickerDepend {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117604a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46735a(MmVideoToolbarViewControl gVar) {
            this.f117604a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog.ISpeedPickerDepend
        /* renamed from: a */
        public void mo164090a(float f) {
            if (((IMmVideoToolbarDependency) this.f117604a.mo161247w()).mo161663p()) {
                C47083e.m186423a(this.f117604a.f117598e.mo161232n(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("speed_change").mo165413a("action_type", FormatUtil.f118607a.mo165482a(f)).mo165421c());
                C47083e.m186423a(this.f117604a.f117598e.mo161232n(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("speed_change").mo165423e("none").mo165413a("speed_type", FormatUtil.f118607a.mo165482a(f)).mo165421c());
            } else {
                C47083e.m186423a(this.f117604a.f117598e.mo161232n(), "vc_mm_click_button", C47086i.m186432a().mo165409a("speed_change").mo165413a("action_type", FormatUtil.f118607a.mo165482a(f)).mo165413a("from_source", "controller").mo165421c());
                C47083e.m186423a(this.f117604a.f117598e.mo161232n(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("speed_change").mo165423e("none").mo165424f("controller").mo165413a("speed_type", FormatUtil.f118607a.mo165482a(f)).mo165421c());
            }
            ((IMmVideoToolbarDependency) this.f117604a.mo161247w()).mo161644a(f);
            this.f117604a.f117594a.setSpeed(f);
        }

        @Override // com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog.ISpeedPickerDepend
        /* renamed from: a */
        public void mo164091a(boolean z, String str, List<? extends SilenceDetail> list) {
            boolean z2;
            ((IMmVideoToolbarDependency) this.f117604a.mo161247w()).mo161648a(z);
            MmVideoToolbarViewControl gVar = this.f117604a;
            if (!z || !Intrinsics.areEqual(str, ((IMmVideoToolbarDependency) gVar.mo161247w()).mo161661n()) || list == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            gVar.f117596c = z2;
            if (list != null) {
                this.f117604a.f117597d.clear();
                this.f117604a.f117597d.addAll(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarViewControl$initTimeLineData$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/highlight/timeline/HightlightTimeLine;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$b */
    public static final class C46736b extends AbstractC47070c<HightlightTimeLine> {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117605a;

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46736b(MmVideoToolbarViewControl gVar) {
            this.f117605a = gVar;
        }

        /* renamed from: a */
        public void mo161289a(HightlightTimeLine hightlightTimeLine) {
            if (this.f117605a.mo164238k()) {
                this.f117605a.f117594a.setTimeLine(hightlightTimeLine);
                return;
            }
            C46602i b = ((IMmVideoToolbarDependency) this.f117605a.mo161247w()).mo161649b();
            if (b != null) {
                b.mo163728a(hightlightTimeLine);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$c */
    public static final class View$OnClickListenerC46737c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117606a;

        View$OnClickListenerC46737c(MmVideoToolbarViewControl gVar) {
            this.f117606a = gVar;
        }

        public final void onClick(View view) {
            this.f117606a.mo164239l();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164208a(float f) {
        MmSimpleVideoToolbar mmSimpleVideoToolbar;
        if (!mo164238k() && (mmSimpleVideoToolbar = this.f117595b) != null) {
            mmSimpleVideoToolbar.mo164122a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: b */
    public void mo164216b(float f) {
        MmSimpleVideoToolbar mmSimpleVideoToolbar;
        if (!mo164238k() && (mmSimpleVideoToolbar = this.f117595b) != null) {
            mmSimpleVideoToolbar.mo164136n();
        }
    }

    /* renamed from: b */
    private final SilenceDetail m185080b(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.f117597d.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            long startTime = t2.getStartTime();
            long stopTime = t2.getStopTime();
            long j = (long) i;
            if (startTime <= j && stopTime >= j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t;
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164209a(int i) {
        if (mo164238k()) {
            this.f117594a.setKeywordHighLight(i);
            return;
        }
        MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117595b;
        if (mmSimpleVideoToolbar != null) {
            mmSimpleVideoToolbar.setKeywordHighLight(i);
        }
    }

    /* renamed from: a */
    public final void mo164236a(long j) {
        AbstractC46598e a;
        C46602i b = ((IMmVideoToolbarDependency) mo161247w()).mo161649b();
        if (b != null && (a = b.mo163685a()) != null && !a.mo163717f()) {
            C46587a.m184215a(((IMmVideoToolbarDependency) mo161247w()).mo161661n(), (int) j);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: b */
    public void mo164217b(boolean z) {
        if (mo164238k()) {
            this.f117594a.setCommentSwitchState(Boolean.valueOf(z));
            return;
        }
        C46602i b = ((IMmVideoToolbarDependency) mo161247w()).mo161649b();
        if (b != null) {
            b.mo163731a(z);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164211a(MmBaseInfo mmBaseInfo) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
        if (((IMmVideoToolbarDependency) mo161247w()).mo161665r() && mmBaseInfo.isRecordingObjectType()) {
            String videoUrl = mmBaseInfo.getVideoUrl();
            if (videoUrl == null || StringsKt.isBlank(videoUrl)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                boolean l = ((IMmVideoToolbarDependency) mo161247w()).mo161659l();
                ((IMmVideoToolbarDependency) mo161247w()).mo161670w();
                this.f117594a.mo164155a(C46587a.m184214a(mmBaseInfo.getObjectToken()), (int) mmBaseInfo.getDuration());
                String videoUrl2 = mmBaseInfo.getVideoUrl();
                Intrinsics.checkExpressionValueIsNotNull(videoUrl2, "baseInfo.videoUrl");
                ((IMmVideoToolbarDependency) mo161247w()).mo161647a(videoUrl2, l);
                this.f117594a.setPodcastEnterVisibility(!((IMmVideoToolbarDependency) mo161247w()).mo161663p());
                this.f117594a.setReactionIconVisibility(false);
                this.f117594a.setVisibility(0);
            }
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164212a(FindResponse findResponse) {
        if (mo164238k()) {
            this.f117594a.setKeywordCircle(findResponse);
            return;
        }
        MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117595b;
        if (mmSimpleVideoToolbar != null) {
            mmSimpleVideoToolbar.setKeywordCircle(findResponse);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164213a(C46602i iVar) {
        if (mo164238k()) {
            this.f117594a.mo164156a(iVar);
            this.f117594a.mo164168s();
            return;
        }
        MmSimpleVideoToolbar mmSimpleVideoToolbar = this.f117595b;
        if (mmSimpleVideoToolbar != null) {
            mmSimpleVideoToolbar.mo164126a(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "progress", "", "fromUser", "", "onProgressChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.g$d */
    public static final class C46738d implements AbstractC46732d {

        /* renamed from: a */
        final /* synthetic */ MmVideoToolbarViewControl f117607a;

        C46738d(MmVideoToolbarViewControl gVar) {
            this.f117607a = gVar;
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d
        /* renamed from: a */
        public /* synthetic */ void mo164221a() {
            AbstractC46732d.CC.$default$a(this);
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d
        /* renamed from: b */
        public /* synthetic */ void mo164223b() {
            AbstractC46732d.CC.$default$b(this);
        }

        @Override // com.ss.android.lark.mm.module.player.videotoolbar.AbstractC46732d
        /* renamed from: a */
        public final void mo164222a(int i, boolean z) {
            this.f117607a.mo164237a(z, i);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmVideoToolbarViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmVideoToolbarListener, IMmVideoToolbarDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f117598e = gVar;
        this.f117599f = jVar;
        View findViewById = gVar.mo161233o().findViewById(R.id.detail_video_toolbar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().….id.detail_video_toolbar)");
        this.f117594a = (MmVideoToolBar) findViewById;
        this.f117602i = C57582a.m223609b(gVar.mo161232n());
        this.f117597d = new ArrayList();
    }

    @Override // com.ss.android.lark.mm.module.player.videotoolbar.IMmVideoToolbarListener
    /* renamed from: a */
    public void mo164210a(long j, boolean z) {
        C45859k.m181685a(new RunnableC46744i(this, z, j));
    }
}
