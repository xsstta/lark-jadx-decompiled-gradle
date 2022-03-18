package com.ss.android.lark.mm.module.player.videotoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.NetworkUtils;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.external.MmSp;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.mm.module.player.core.AbstractC46596c;
import com.ss.android.lark.mm.module.player.core.AbstractC46599f;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.core.layer.widget.KeyWordCircle;
import com.ss.android.lark.mm.module.player.p2308a.C46587a;
import com.ss.android.lark.mm.module.reaction.model.EmojiReaction;
import com.ss.android.lark.mm.module.reaction.panel.ReactionTimeLine;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.PlayerPlayPauseEvent;
import com.ss.android.lark.mm.utils.C47116p;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.utils.MmOnBoardingUtils;
import com.ss.android.lark.mm.utils.MmTimeUtils;
import com.ss.android.lark.mm.widget.badge.BadgeDrawable;
import com.ss.android.lark.mm.widget.badge.UDBadgeAlign;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;
import java.util.List;

public class MmVideoToolBar extends FrameLayout implements SeekBar.OnSeekBarChangeListener, AbstractC46596c, AbstractC46599f {

    /* renamed from: a */
    public View$OnClickListenerC46730c f117556a;

    /* renamed from: b */
    public AbstractC46729b f117557b;

    /* renamed from: c */
    public AbstractC46728a f117558c;

    /* renamed from: d */
    private C46602i f117559d;

    /* renamed from: e */
    private AbstractC46732d f117560e;

    /* renamed from: f */
    private boolean f117561f;

    /* renamed from: g */
    private final int f117562g;

    /* renamed from: h */
    private final int f117563h;

    /* renamed from: i */
    private int f117564i;

    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar$a */
    public interface AbstractC46728a {
        /* renamed from: a */
        float mo164189a();

        /* renamed from: b */
        String mo164190b();

        /* renamed from: c */
        C46602i mo164191c();
    }

    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar$b */
    public interface AbstractC46729b {
        /* renamed from: a */
        void mo164192a();

        /* renamed from: a */
        void mo164193a(long j);

        /* renamed from: a */
        void mo164194a(String str, Long l);

        /* renamed from: b */
        void mo164195b();

        /* renamed from: c */
        void mo164196c();

        /* renamed from: d */
        void mo164197d();

        /* renamed from: e */
        void mo164198e();

        /* renamed from: f */
        void mo164199f();

        /* renamed from: g */
        void mo164200g();

        /* renamed from: h */
        void mo164201h();

        /* renamed from: i */
        void mo164202i();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163659a(boolean z) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: e */
    public void mo163663e() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: h */
    public void mo163666h() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: l */
    public void mo163694l() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: m */
    public void mo163695m() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: n */
    public void mo163696n() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: o */
    public void mo163697o() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: p */
    public void mo163698p() {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: q */
    public void mo163699q() {
    }

    public void setReactionIconVisibility(boolean z) {
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163658a(Error error) {
        this.f117556a.f117572e.setImageResource(mo164167r() ? R.drawable.mm_video_play_pc : R.drawable.mm_video_play);
        mo163668j();
        AbstractC46729b bVar = this.f117557b;
        if (bVar != null) {
            bVar.mo164197d();
        }
    }

    /* renamed from: a */
    public void mo164158a(boolean z, boolean z2) {
        if (this.f117556a.f117575h != null) {
            this.f117556a.f117575h.setEnabled(z);
        }
        if (this.f117556a.f117576i != null) {
            this.f117556a.f117576i.setEnabled(z2);
        }
    }

    /* renamed from: v */
    private boolean m184964v() {
        if (this.f117564i == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: c */
    public void mo163661c() {
        C45855f.m181663b("MmVideoToolBar", "onRelease");
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: f */
    public void mo163664f() {
        C45855f.m181663b("MmVideoToolBar", "onStartSeek");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo164187u();
    }

    /* renamed from: r */
    public boolean mo164167r() {
        if (this.f117564i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public void mo164187u() {
        C46602i iVar = this.f117559d;
        if (iVar != null) {
            iVar.mo163733b((AbstractC46596c) this);
            this.f117559d.mo163734b((AbstractC46599f) this);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: b */
    public void mo163660b() {
        int i;
        ImageView imageView = this.f117556a.f117572e;
        if (mo164167r()) {
            i = R.drawable.mm_video_play_pc;
        } else {
            i = R.drawable.mm_video_play;
        }
        imageView.setImageResource(i);
        AbstractC46729b bVar = this.f117557b;
        if (bVar != null) {
            bVar.mo164195b();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: g */
    public void mo163665g() {
        C45855f.m181663b("MmVideoToolBar", "onSeekComplete");
        this.f117560e.mo164222a(this.f117556a.f117569b.getProgress(), true);
    }

    public C46602i getPlayerAdapter() {
        AbstractC46728a aVar;
        if (this.f117559d == null && (aVar = this.f117558c) != null) {
            mo164156a(aVar.mo164191c());
        }
        return this.f117559d;
    }

    public int getVDuration() {
        int i;
        C46602i iVar = this.f117559d;
        if (iVar == null) {
            i = 0;
        } else {
            i = iVar.mo163685a().mo163710a();
        }
        if (i > 0) {
            return i;
        }
        return this.f117556a.f117569b.getMax();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: j */
    public void mo163668j() {
        Animation animation = this.f117556a.f117573f.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f117556a.f117573f.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f117556a.f117573f.setVisibility(8);
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: k */
    public void mo163669k() {
        Animation animation = this.f117556a.f117573f.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f117556a.f117573f.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.f117556a.f117573f.setVisibility(4);
    }

    /* renamed from: t */
    public void mo164186t() {
        if (this.f117556a.f117583p != null && this.f117556a.f117583p.getVisibility() == 0) {
            View$OnClickListenerC46730c cVar = this.f117556a;
            cVar.mo164203a(cVar.f117583p);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163655a() {
        int i;
        ImageView imageView = this.f117556a.f117572e;
        if (mo164167r()) {
            i = R.drawable.mm_video_pause_pc;
        } else {
            i = R.drawable.mm_video_pause;
        }
        imageView.setImageResource(i);
        setDuration(getVDuration());
        AbstractC46729b bVar = this.f117557b;
        if (bVar != null) {
            bVar.mo164192a();
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: d */
    public void mo163662d() {
        int i;
        ImageView imageView = this.f117556a.f117572e;
        if (mo164167r()) {
            i = R.drawable.mm_video_play_pc;
        } else {
            i = R.drawable.mm_video_play;
        }
        imageView.setImageResource(i);
        mo163668j();
        this.f117556a.f117569b.setProgress(this.f117556a.f117569b.getMax());
        AbstractC46729b bVar = this.f117557b;
        if (bVar != null) {
            bVar.mo164196c();
        }
    }

    public int getVPostion() {
        C46602i iVar = this.f117559d;
        if (iVar == null || !iVar.mo163685a().mo163714c()) {
            return this.f117556a.f117569b.getProgress();
        }
        int b = this.f117559d.mo163685a().mo163713b();
        if (b > 0) {
            return b;
        }
        return this.f117556a.f117569b.getProgress();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: i */
    public void mo163667i() {
        this.f117556a.f117573f.setVisibility(0);
        this.f117556a.f117573f.setAlpha(1.0f);
        RotateAnimation rotateAnimation = new RotateAnimation(BitmapDescriptorFactory.HUE_RED, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setDuration(800);
        rotateAnimation.setRepeatCount(-1);
        this.f117556a.f117573f.startAnimation(rotateAnimation);
    }

    /* renamed from: s */
    public void mo164168s() {
        if (this.f117558c != null) {
            this.f117556a.f117577j.setText(FormatUtil.f118607a.mo165482a(this.f117558c.mo164189a()) + "x");
        }
    }

    /* renamed from: w */
    private void m184965w() {
        if (m184964v()) {
            LayoutInflater.from(getContext()).inflate(R.layout.mm_video_toolbar, (ViewGroup) this, true);
        } else {
            LayoutInflater.from(getContext()).inflate(R.layout.mm_video_toolbar_pc, (ViewGroup) this, true);
        }
        View$OnClickListenerC46730c cVar = new View$OnClickListenerC46730c(this);
        this.f117556a = cVar;
        cVar.f117572e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mm.module.player.videotoolbar.$$Lambda$MmVideoToolBar$HS5PgMoZuTpZNXXqXOVKG271M */

            public final void onClick(View view) {
                MmVideoToolBar.m270841lambda$HS5PgMoZuTpZNXXqXOVKG271M(MmVideoToolBar.this, view);
            }
        });
        this.f117556a.f117580m.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.View$OnTouchListenerC467272 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                float f;
                Rect rect = new Rect();
                MmVideoToolBar.this.f117556a.f117569b.getHitRect(rect);
                if (motionEvent.getY() < ((float) (rect.top - 500)) || motionEvent.getY() > ((float) (rect.bottom + ParticipantRepo.f117150c))) {
                    return false;
                }
                float height = (float) (rect.top + (rect.height() / 2));
                float x = motionEvent.getX() - ((float) rect.left);
                if (x < BitmapDescriptorFactory.HUE_RED) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if (x > ((float) rect.width())) {
                    f = (float) rect.width();
                } else {
                    f = x;
                }
                return MmVideoToolBar.this.f117556a.f117569b.onTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), f, height, motionEvent.getMetaState()));
            }
        });
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f117561f = true;
    }

    public void setSeekListener(AbstractC46732d dVar) {
        this.f117560e = dVar;
    }

    public void setVideoToolbarDepend(AbstractC46728a aVar) {
        this.f117558c = aVar;
    }

    public void setVideoToolbarListener(AbstractC46729b bVar) {
        this.f117557b = bVar;
    }

    public MmVideoToolBar(Context context) {
        this(context, null);
    }

    public void setPodcast(boolean z) {
        this.f117556a.f117578k.setPodcast(z);
    }

    public void setTimeLineList(List<HighlightTimeLineItem> list) {
        this.f117556a.f117578k.setTimeLine(list);
    }

    /* renamed from: a */
    public void mo164157a(EmojiReaction emojiReaction) {
        this.f117556a.f117578k.mo164487a(emojiReaction);
    }

    /* renamed from: b */
    public void mo164159b(int i) {
        AbstractC46729b bVar = this.f117557b;
        if (bVar != null) {
            bVar.mo164198e();
        }
        mo164154a(i);
    }

    public void setCommentSwitchState(Boolean bool) {
        this.f117556a.f117578k.setShowComment(bool.booleanValue());
    }

    public void setEmojiSwitchState(Boolean bool) {
        this.f117556a.f117578k.setShowEmoji(bool.booleanValue());
    }

    public void setKeywordHighLight(int i) {
        this.f117556a.f117579l.setHighLightIndex(i);
        this.f117556a.f117579l.invalidate();
    }

    public void setSpeedClickListener(final View.OnClickListener onClickListener) {
        this.f117556a.f117574g.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar.C467261 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C45855f.m181664c("MmVideoToolBar", "click speed");
                onClickListener.onClick(view);
            }
        });
    }

    public void setTimeLine(HightlightTimeLine hightlightTimeLine) {
        if (hightlightTimeLine != null) {
            this.f117556a.f117578k.setTimeLine(hightlightTimeLine.timeline);
        }
    }

    public void setWholeTimeStamp(Long l) {
        this.f117556a.f117579l.setWholeWidth(l);
        this.f117556a.f117579l.invalidate();
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163657a(TTVideoEngine tTVideoEngine) {
        C45855f.m181663b("MmVideoToolBar", "onEngineInitPlay");
    }

    public void setDuration(int i) {
        long j = (long) i;
        this.f117556a.f117571d.setText(MmTimeUtils.m186493a(j));
        this.f117556a.f117569b.setMax(i);
        this.f117556a.f117578k.setTimeLineLength(j);
    }

    public void setPodcastEnterVisibility(boolean z) {
        int i;
        if (this.f117556a.f117583p != null) {
            View view = this.f117556a.f117583p;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setKeywordCircle(FindResponse findResponse) {
        if (findResponse != null) {
            this.f117556a.f117579l.setVisibility(0);
            this.f117556a.f117579l.mo163938a();
            this.f117556a.f117579l.setCirclePos(findResponse);
        } else {
            this.f117556a.f117579l.setVisibility(4);
            this.f117556a.f117579l.mo163938a();
        }
        this.f117556a.f117579l.invalidate();
    }

    public void setPosition(int i) {
        C45855f.m181663b("MmVideoToolBar", "setPosition " + (i / 1000));
        this.f117556a.f117570c.setText(MmTimeUtils.m186494a((long) i, MmTimeUtils.m186496b((long) getVDuration())));
        C47116p.m186582a(this.f117556a.f117569b, i);
    }

    public void setSpeed(float f) {
        if (getPlayerAdapter() != null) {
            this.f117556a.f117577j.setText(FormatUtil.f118607a.mo165482a(f) + "x");
            getPlayerAdapter().mo163732b(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46596c
    /* renamed from: a */
    public void mo163693a(float f) {
        if (getPlayerAdapter() != null) {
            this.f117556a.f117577j.setText(FormatUtil.f118607a.mo165482a(f) + "x");
            getPlayerAdapter().mo163732b(f);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        PlayerPlayPauseEvent lVar = new PlayerPlayPauseEvent();
        lVar.mo165434a(getContext());
        lVar.mo165432a("progress_bar_change");
        lVar.mo165433b("controller");
        lVar.mo165437a();
        C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("progress_bar_change").mo165423e("none").mo165424f("controller").mo165421c());
        this.f117561f = false;
        if (getPlayerAdapter() != null) {
            getPlayerAdapter().mo163686b().mo163703a((long) seekBar.getProgress());
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.MmVideoToolBar$c */
    public class View$OnClickListenerC46730c implements View.OnClickListener {

        /* renamed from: a */
        public LottieAnimationView f117568a;

        /* renamed from: b */
        public SeekBar f117569b;

        /* renamed from: c */
        public TextView f117570c;

        /* renamed from: d */
        public TextView f117571d;

        /* renamed from: e */
        public ImageView f117572e;

        /* renamed from: f */
        public ImageView f117573f;

        /* renamed from: g */
        public View f117574g;

        /* renamed from: h */
        public ImageView f117575h;

        /* renamed from: i */
        public ImageView f117576i;

        /* renamed from: j */
        public TextView f117577j;

        /* renamed from: k */
        public ReactionTimeLine f117578k;

        /* renamed from: l */
        public KeyWordCircle f117579l;

        /* renamed from: m */
        public View f117580m;

        /* renamed from: n */
        public View f117581n;

        /* renamed from: o */
        public View f117582o;

        /* renamed from: p */
        public View f117583p;

        /* renamed from: q */
        public View f117584q;

        /* renamed from: s */
        private ViewGroup f117586s;

        /* renamed from: a */
        public void mo164203a(View view) {
            if (C45899c.m181859a().getContextDepend().mo144565b("vc_minutes_podcast")) {
                if (!MmSp.f115679a.mo161159a(MmOnBoardingUtils.f118633a.mo165491a(), true)) {
                    C45899c.m181859a().getContextDepend().mo144561a("vc_minutes_podcast");
                    return;
                }
                float dp2px = (float) UIUtils.dp2px(view.getContext(), 2.0f);
                ((BadgeDrawable.DrawableEditor) ((BadgeDrawable.DrawableEditor) ((BadgeDrawable.DrawableEditor) ((BadgeDrawable.DrawableEditor) BadgeDrawable.f118836a.mo165748a(view).mo165740a().mo165751a(R.style.Badge).mo165753a(true).mo165750a((float) UIUtils.dp2px(view.getContext(), 2.0f), (float) UIUtils.dp2px(view.getContext(), 6.0f)).mo165710b(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, dp2px, dp2px))).mo165709b((float) UIUtils.dp2px(view.getContext(), 16.0f))).mo165712c(0)).mo165711b(ContextCompat.getDrawable(MmVideoToolBar.this.getContext(), R.drawable.mm_ic_badge_new))).mo165752a(UDBadgeAlign.RIGHT_TOP).mo165754a();
            }
        }

        public void onClick(View view) {
            if (MmVideoToolBar.this.getPlayerAdapter() != null) {
                if (view.getId() == R.id.mm_toolbar_prev15s) {
                    if (MmVideoToolBar.this.mo164167r()) {
                        C45855f.m181664c("MmVideoToolBar", "podcast prev15s");
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("fifteen_secs_back").mo165421c());
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("fifteen_secs_back").mo165423e("none").mo165426h("detail_page").mo165421c());
                    } else {
                        C45855f.m181664c("MmVideoToolBar", "detail prev15s");
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("fifteen_secs_back").mo165423e("none").mo165426h("detail_page").mo165421c());
                    }
                    int vPostion = MmVideoToolBar.this.getVPostion() - 15000;
                    if (vPostion <= 0) {
                        vPostion = 0;
                    }
                    MmVideoToolBar.this.mo164159b(vPostion);
                } else if (view.getId() == R.id.mm_toolbar_next15s) {
                    if (MmVideoToolBar.this.mo164167r()) {
                        C45855f.m181664c("MmVideoToolBar", "podcast next15s");
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("fifteen_secs_forward").mo165421c());
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("fifteen_secs_forward").mo165423e("none").mo165421c());
                    } else {
                        C45855f.m181664c("MmVideoToolBar", "detail next15s");
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("fifteen_secs_forward").mo165423e("none").mo165426h("detail_page").mo165421c());
                    }
                    int vPostion2 = MmVideoToolBar.this.getVPostion() + 15000;
                    if (vPostion2 >= MmVideoToolBar.this.getVDuration()) {
                        vPostion2 = MmVideoToolBar.this.getVDuration();
                    }
                    MmVideoToolBar.this.mo164159b(vPostion2);
                } else if (view.getId() == R.id.mm_toolbar_reaction) {
                    if (MmVideoToolBar.this.mo164167r()) {
                        C45855f.m181664c("MmVideoToolBar", "podcast reaction");
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("reaction").mo165421c());
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("reaction").mo165423e("none").mo165421c());
                    } else {
                        C45855f.m181664c("MmVideoToolBar", "detail reaction");
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("reaction").mo165421c());
                        C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("create_reaction").mo165423e("none").mo165421c());
                    }
                    MmVideoToolBar.this.f117556a.f117568a.playAnimation();
                    if (MmVideoToolBar.this.f117557b != null) {
                        MmVideoToolBar.this.f117557b.mo164194a("THUMBSUP", Long.valueOf((long) MmVideoToolBar.this.getVPostion()));
                    }
                } else if (view.getId() == R.id.mm_toolbar_prev) {
                    C45855f.m181664c("MmVideoToolBar", "podcast play pre");
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("last_one").mo165421c());
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("last_one").mo165423e("none").mo165421c());
                    if (MmVideoToolBar.this.f117557b != null) {
                        MmVideoToolBar.this.f117557b.mo164199f();
                    }
                } else if (view.getId() == R.id.mm_toolbar_next) {
                    C45855f.m181664c("MmVideoToolBar", "podcast play next");
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("next_one").mo165421c());
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("next_one").mo165423e("none").mo165421c());
                    if (MmVideoToolBar.this.f117557b != null) {
                        MmVideoToolBar.this.f117557b.mo164200g();
                    }
                } else if (view.getId() == R.id.mm_toolbar_podcast_enter) {
                    C45855f.m181664c("MmVideoToolBar", "enter podcast");
                    if (C45899c.m181859a().getContextDepend().mo144565b("vc_minutes_podcast")) {
                        C45899c.m181859a().getContextDepend().mo144561a("vc_minutes_podcast");
                    }
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("podcast_enter").mo165421c());
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("podcast_enter").mo165423e("vc_minutes_podcast_view").mo165425g("true").mo165421c());
                    if (MmVideoToolBar.this.f117558c != null) {
                        C46587a.m184216a(MmVideoToolBar.this.f117558c.mo164190b(), this.f117569b.getProgress(), true);
                    }
                    if (MmVideoToolBar.this.f117557b != null) {
                        MmVideoToolBar.this.f117557b.mo164201h();
                    }
                } else if (view.getId() == R.id.mm_toolbar_podcast_exit) {
                    C45855f.m181664c("MmVideoToolBar", "exit podcast");
                    if (MmVideoToolBar.this.f117558c != null) {
                        C46587a.m184216a(MmVideoToolBar.this.f117558c.mo164190b(), this.f117569b.getProgress(), true);
                    }
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("podcast_exit").mo165421c());
                    C47083e.m186423a(MmVideoToolBar.this.getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("podcast_exit").mo165423e("vc_minutes_detail_view").mo165421c());
                    if (MmVideoToolBar.this.f117557b != null) {
                        MmVideoToolBar.this.f117557b.mo164202i();
                    }
                }
            }
        }

        public View$OnClickListenerC46730c(View view) {
            this.f117569b = (SeekBar) view.findViewById(R.id.mm_toolbar_seekbar);
            this.f117570c = (TextView) view.findViewById(R.id.mm_toolbar_position);
            this.f117571d = (TextView) view.findViewById(R.id.mm_toolbar_duration);
            this.f117572e = (ImageView) view.findViewById(R.id.mm_toolbar_play_pause);
            this.f117573f = (ImageView) view.findViewById(R.id.mm_toolbar_play_loading);
            this.f117586s = (ViewGroup) view.findViewById(R.id.container);
            this.f117574g = view.findViewById(R.id.mm_toolbar_speed);
            TextView textView = (TextView) view.findViewById(R.id.mm_toolbar_speed_tag);
            this.f117577j = textView;
            textView.setText(FormatUtil.f118607a.mo165482a(1.0f));
            this.f117579l = (KeyWordCircle) view.findViewById(R.id.mm_toolbar_search_dot_line);
            this.f117578k = (ReactionTimeLine) view.findViewById(R.id.mm_toolbar_reaction_line);
            this.f117580m = view.findViewById(R.id.mm_toolbar_seekbar_container);
            ImageView imageView = (ImageView) view.findViewById(R.id.mm_toolbar_prev);
            this.f117575h = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(this);
            }
            ImageView imageView2 = (ImageView) view.findViewById(R.id.mm_toolbar_next);
            this.f117576i = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(this);
            }
            this.f117581n = view.findViewById(R.id.mm_toolbar_prev15s);
            this.f117582o = view.findViewById(R.id.mm_toolbar_next15s);
            this.f117568a = (LottieAnimationView) view.findViewById(R.id.mm_toolbar_reaction);
            View findViewById = view.findViewById(R.id.mm_toolbar_podcast_enter);
            this.f117583p = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(this);
            }
            View findViewById2 = view.findViewById(R.id.mm_toolbar_podcast_exit);
            this.f117584q = findViewById2;
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(this);
            }
            LottieAnimationView lottieAnimationView = this.f117568a;
            if (lottieAnimationView != null) {
                lottieAnimationView.setOnClickListener(this);
            }
            this.f117581n.setOnClickListener(this);
            this.f117582o.setOnClickListener(this);
        }
    }

    /* renamed from: a */
    public void mo164154a(int i) {
        if (getPlayerAdapter() != null) {
            C45855f.m181663b("MmVideoToolBar", "seekTo " + i);
            setPosition(i);
            long j = (long) i;
            getPlayerAdapter().mo163686b().mo163703a(j);
            AbstractC46729b bVar = this.f117557b;
            if (bVar != null) {
                bVar.mo164193a(j);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m184963a(View view) {
        if (getPlayerAdapter() != null) {
            if (getPlayerAdapter().mo163685a().mo163715d()) {
                if (mo164167r()) {
                    C45855f.m181664c("MmVideoToolBar", "podcast pause");
                    C47083e.m186423a(getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("pause_podcast").mo165421c());
                    C47083e.m186423a(getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("pause").mo165423e("none").mo165421c());
                } else {
                    C45855f.m181664c("MmVideoToolBar", "detail pause");
                    C47083e.m186423a(getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("video_pause").mo165417b("controller").mo165421c());
                    C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_pause").mo165423e("none").mo165424f("controller").mo165421c());
                }
                getPlayerAdapter().mo163686b().mo163700a();
                return;
            }
            if (mo164167r()) {
                C45855f.m181664c("MmVideoToolBar", "podcast play");
                C47083e.m186423a(getContext(), "vc_mm_podcast_page", C47086i.m186432a().mo165409a("continue_podcast").mo165421c());
                C47083e.m186423a(getContext(), "vc_minutes_podcast_click", C47086i.m186432a().mo165422d("play").mo165423e("none").mo165421c());
            } else {
                C45855f.m181664c("MmVideoToolBar", "detail play");
                C47083e.m186423a(getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("video_play").mo165417b("controller").mo165421c());
                C47083e.m186423a(getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("video_play").mo165423e("none").mo165424f("controller").mo165421c());
            }
            if (getPlayerAdapter().mo163685a().mo163714c() || NetworkUtils.isNetworkAvailable(getContext())) {
                getPlayerAdapter().mo163686b().mo163706b();
                return;
            }
            C45855f.m181664c("MmVideoToolBar", "play failed");
            C45858j.m181677a((int) R.string.MMWeb_G_FailedToLoad);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.AbstractC46599f
    /* renamed from: a */
    public void mo163656a(long j) {
        if (!this.f117561f) {
            int i = (int) j;
            this.f117556a.f117570c.setText(MmTimeUtils.m186494a((long) i, MmTimeUtils.m186496b((long) getVDuration())));
            this.f117556a.f117569b.setProgress(i);
        }
    }

    /* renamed from: a */
    public void mo164156a(C46602i iVar) {
        int i;
        int i2;
        if (iVar != null) {
            this.f117559d = iVar;
            iVar.mo163730a((AbstractC46599f) this);
            this.f117559d.mo163729a((AbstractC46596c) this);
            this.f117556a.f117569b.setOnSeekBarChangeListener(this);
            if (iVar.mo163685a().mo163715d()) {
                ImageView imageView = this.f117556a.f117572e;
                if (mo164167r()) {
                    i2 = R.drawable.mm_video_pause_pc;
                } else {
                    i2 = R.drawable.mm_video_pause;
                }
                imageView.setImageResource(i2);
                return;
            }
            ImageView imageView2 = this.f117556a.f117572e;
            if (mo164167r()) {
                i = R.drawable.mm_video_play_pc;
            } else {
                i = R.drawable.mm_video_play;
            }
            imageView2.setImageResource(i);
        }
    }

    /* renamed from: a */
    public void mo164155a(int i, int i2) {
        setDuration(i2);
        setPosition(i);
    }

    public MmVideoToolBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MmVideoToolBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117562g = 1;
        this.f117563h = 2;
        this.f117564i = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.display, R.attr.display_mode});
            this.f117564i = obtainStyledAttributes.getInt(1, 1);
            obtainStyledAttributes.recycle();
        }
        m184965w();
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        AbstractC46732d dVar = this.f117560e;
        if (dVar != null) {
            dVar.mo164222a(i, z);
        }
        this.f117556a.f117570c.setText(MmTimeUtils.m186494a((long) seekBar.getProgress(), MmTimeUtils.m186496b((long) seekBar.getMax())));
        if (getPlayerAdapter() != null && !getPlayerAdapter().mo163685a().mo163714c()) {
            getPlayerAdapter().mo163686b().mo163702a(i);
        }
    }
}
