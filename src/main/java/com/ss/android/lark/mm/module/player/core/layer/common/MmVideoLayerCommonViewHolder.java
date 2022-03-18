package com.ss.android.lark.mm.module.player.core.layer.common;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.external.MmSp;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.C46627b;
import com.ss.android.lark.mm.module.reaction.panel.ReactionTimeLine;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.FormatUtil;
import com.ss.android.lark.mm.utils.MmOnBoardingUtils;
import com.ss.android.lark.mm.utils.MmTimeUtils;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.badge.BadgeDrawable;
import com.ss.android.lark.mm.widget.badge.UDBadgeAlign;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3194a.C64087a;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0011J\b\u0010\u001f\u001a\u00020\u001dH\u0002J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0011J\u0010\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010$J\b\u0010%\u001a\u00020\u001dH\u0002J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020\u0003H\u0002J\u000e\u0010(\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0011J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0007J\u0016\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020+2\u0006\u0010*\u001a\u00020+J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u000200H\u0007J\u0006\u00101\u001a\u00020\u001dR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/mm/module/player/core/layer/common/MmVideoLayerCommonViewHolder;", "", "host", "Landroid/view/View;", "layer", "Lcom/ss/android/videoshop/layer/ILayer;", "layerContext", "Lcom/ss/android/lark/mm/module/player/core/layer/context/IMmLayerContext;", "(Landroid/view/View;Lcom/ss/android/videoshop/layer/ILayer;Lcom/ss/android/lark/mm/module/player/core/layer/context/IMmLayerContext;)V", "durationTv", "Landroid/widget/TextView;", "entryMore", "Landroid/widget/ImageView;", "expandFullScreen", "getHost", "()Landroid/view/View;", "isSubtitleOn", "", "ivLeft", "getLayer", "()Lcom/ss/android/videoshop/layer/ILayer;", "mmVideoReactionLine", "Lcom/ss/android/lark/mm/module/reaction/panel/ReactionTimeLine;", "playPositionTv", "podcastIcon", "speedView", "speedViewTag", "subtitleView", "editModeChange", "", "isEditMode", "initViews", "setExpandEntryVisibility", "isShow", "setTimeLine", "timeLine", "Lcom/ss/android/lark/mm/module/highlight/timeline/HightlightTimeLine;", "showEditSpeakerOnBoarding", "showPodcastOnboard", "entry", "updateCommentIconVisibility", "updateDuration", "duration", "", "updatePlayPos", "current", "updateSpeed", "speed", "", "updateSubtitleIcon", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a */
public final class MmVideoLayerCommonViewHolder {

    /* renamed from: a */
    public final ImageView f117322a;

    /* renamed from: b */
    public boolean f117323b = true;

    /* renamed from: c */
    public final AbstractC46626a f117324c;

    /* renamed from: d */
    private final ImageView f117325d;

    /* renamed from: e */
    private final ImageView f117326e;

    /* renamed from: f */
    private final ImageView f117327f;

    /* renamed from: g */
    private final View f117328g;

    /* renamed from: h */
    private final TextView f117329h;

    /* renamed from: i */
    private final View f117330i;

    /* renamed from: j */
    private final TextView f117331j;

    /* renamed from: k */
    private final TextView f117332k;

    /* renamed from: l */
    private final ReactionTimeLine f117333l;

    /* renamed from: m */
    private final View f117334m;

    /* renamed from: n */
    private final AbstractC64152a f117335n;

    /* renamed from: b */
    public final View mo163811b() {
        return this.f117334m;
    }

    /* renamed from: c */
    public final AbstractC64152a mo163813c() {
        return this.f117335n;
    }

    /* renamed from: e */
    private final void m184435e() {
        MmOnBoardingUtils.f118633a.mo165492a(this.f117327f);
    }

    /* renamed from: a */
    public final void mo163805a() {
        int i;
        ImageView imageView = this.f117322a;
        C46627b b = this.f117324c.mo163726b();
        Intrinsics.checkExpressionValueIsNotNull(b, "layerContext.layerData");
        if (b.mo163829e()) {
            i = R.drawable.mm_player_subtitle_on;
        } else {
            i = R.drawable.mm_player_subtitle_off;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: d */
    private final void m184434d() {
        m184435e();
        m184433a(this.f117325d);
        C46627b b = this.f117324c.mo163726b();
        Intrinsics.checkExpressionValueIsNotNull(b, "layerContext.layerData");
        mo163806a(b.mo163826b());
        this.f117327f.setOnClickListener(new View$OnClickListenerC46620a(this));
        this.f117322a.setOnClickListener(new View$OnClickListenerC46621b(this));
        C47110e.m186573a(this.f117325d, new C46622c(this));
        this.f117326e.setOnClickListener(new View$OnClickListenerC46623d(this));
        this.f117328g.setOnClickListener(new View$OnClickListenerC46624e(this));
        View view = this.f117330i;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC46625f(this));
        }
        View view2 = this.f117330i;
        if (view2 != null) {
            C47110e.m186572a(view2, C57582a.m223600a(10));
        }
        C47110e.m186572a(this.f117326e, C57582a.m223600a(10));
        C47110e.m186572a(this.f117327f, C57582a.m223600a(8));
        C47110e.m186572a(this.f117325d, C57582a.m223600a(8));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a$c */
    public static final class C46622c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmVideoLayerCommonViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46622c(MmVideoLayerCommonViewHolder aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            IMmDepend a = C45899c.m181859a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
            if (a.getContextDepend().mo144565b("vc_minutes_podcast")) {
                IMmDepend a2 = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
                a2.getContextDepend().mo144561a("vc_minutes_podcast");
            }
            C47083e.m186423a(view.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("podcast_enter").mo165423e("vc_minutes_podcast_view").mo165425g("true").mo165421c());
            this.this$0.f117324c.mo163725a().mo163694l();
        }
    }

    /* renamed from: c */
    public final void mo163814c(boolean z) {
        ReactionTimeLine reactionTimeLine = this.f117333l;
        if (reactionTimeLine != null) {
            reactionTimeLine.setShowComment(z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a$a */
    public static final class View$OnClickListenerC46620a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoLayerCommonViewHolder f117336a;

        View$OnClickListenerC46620a(MmVideoLayerCommonViewHolder aVar) {
            this.f117336a = aVar;
        }

        public final void onClick(View view) {
            this.f117336a.f117324c.mo163725a().mo163695m();
        }
    }

    /* renamed from: a */
    public final void mo163809a(HightlightTimeLine hightlightTimeLine) {
        ReactionTimeLine reactionTimeLine;
        if (hightlightTimeLine != null && (reactionTimeLine = this.f117333l) != null) {
            reactionTimeLine.setTimeLine(hightlightTimeLine.timeline);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a$d */
    public static final class View$OnClickListenerC46623d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoLayerCommonViewHolder f117338a;

        View$OnClickListenerC46623d(MmVideoLayerCommonViewHolder aVar) {
            this.f117338a = aVar;
        }

        public final void onClick(View view) {
            C47098d.m186533a(this.f117338a.mo163811b().getContext()).finish();
        }
    }

    /* renamed from: b */
    public final void mo163812b(boolean z) {
        if (z) {
            this.f117326e.setVisibility(8);
            this.f117327f.setVisibility(8);
            return;
        }
        this.f117326e.setVisibility(0);
        this.f117327f.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a$e */
    public static final class View$OnClickListenerC46624e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoLayerCommonViewHolder f117339a;

        View$OnClickListenerC46624e(MmVideoLayerCommonViewHolder aVar) {
            this.f117339a = aVar;
        }

        public final void onClick(View view) {
            this.f117339a.f117324c.mo163725a().mo163696n();
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            C47083e.m186423a(view.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("setting").mo165423e("vc_minutes_detail_setting_view").mo165421c());
        }
    }

    /* renamed from: a */
    public final void mo163806a(float f) {
        TextView textView = this.f117329h;
        textView.setText(FormatUtil.f118607a.mo165482a(f) + "x");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a$f */
    public static final class View$OnClickListenerC46625f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoLayerCommonViewHolder f117340a;

        View$OnClickListenerC46625f(MmVideoLayerCommonViewHolder aVar) {
            this.f117340a = aVar;
        }

        public final void onClick(View view) {
            C45855f.m181664c("MmVideoTitleViewHolder", "click expand");
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            C47083e.m186423a(view.getContext(), "vc_mm_click_button", C47086i.m186432a().mo165409a("zoom_in").mo165421c());
            C47083e.m186423a(view.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("zoom_in").mo165423e("none").mo165421c());
            AbstractC64108o s = this.f117340a.mo163813c().mo222211s();
            if (s != null && s.mo221918j()) {
                this.f117340a.mo163813c().mo222202a(new C64087a(103));
            }
        }
    }

    /* renamed from: a */
    public final void mo163807a(long j) {
        TextView textView = this.f117332k;
        if (textView != null) {
            textView.setText(" / " + MmTimeUtils.m186493a(j));
        }
        ReactionTimeLine reactionTimeLine = this.f117333l;
        if (reactionTimeLine != null) {
            reactionTimeLine.setTimeLineLength(j);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.core.layer.b.a$b */
    public static final class View$OnClickListenerC46621b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MmVideoLayerCommonViewHolder f117337a;

        View$OnClickListenerC46621b(MmVideoLayerCommonViewHolder aVar) {
            this.f117337a = aVar;
        }

        public final void onClick(View view) {
            int i;
            C45855f.m181664c("MmVideoTitleViewHolder", "click subtitle");
            MmVideoLayerCommonViewHolder aVar = this.f117337a;
            aVar.f117323b = !aVar.f117323b;
            ImageView imageView = this.f117337a.f117322a;
            if (this.f117337a.f117323b) {
                i = R.drawable.mm_player_subtitle_on;
            } else {
                i = R.drawable.mm_player_subtitle_off;
            }
            imageView.setImageResource(i);
            C46627b b = this.f117337a.f117324c.mo163726b();
            Intrinsics.checkExpressionValueIsNotNull(b, "layerContext.layerData");
            b.mo163825a(this.f117337a.f117323b);
            this.f117337a.mo163813c().mo222206b(new C64119c(1005, Boolean.valueOf(this.f117337a.f117323b)));
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            C47083e.m186423a(view.getContext(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("show_subtitles").mo165416b().mo165419b(this.f117337a.f117323b).mo165413a("is_full_screen", "false").mo165421c());
        }
    }

    /* renamed from: a */
    private final void m184433a(View view) {
        IMmDepend a = C45899c.m181859a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
        if (a.getContextDepend().mo144565b("vc_minutes_podcast")) {
            if (!MmSp.f115679a.mo161159a(MmOnBoardingUtils.f118633a.mo165491a(), true)) {
                IMmDepend a2 = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
                a2.getContextDepend().mo144561a("vc_minutes_podcast");
                return;
            }
            Drawable drawable = ContextCompat.getDrawable(view.getContext(), R.drawable.mm_ic_badge_new);
            if (drawable != null) {
                Intrinsics.checkExpressionValueIsNotNull(drawable, "ContextCompat.getDrawabl…                ?: return");
                float dp2px = (float) UIUtils.dp2px(view.getContext(), 2.0f);
                ((BadgeDrawable.DrawableEditor) ((BadgeDrawable.DrawableEditor) ((BadgeDrawable.DrawableEditor) ((BadgeDrawable.DrawableEditor) BadgeDrawable.f118836a.mo165748a(view).mo165740a().mo165751a(R.style.Badge).mo165753a(true).mo165750a((float) UIUtils.dp2px(view.getContext(), 10.0f), (float) UIUtils.dp2px(view.getContext(), -3.0f)).mo165710b(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, dp2px, dp2px))).mo165709b((float) UIUtils.dp2px(view.getContext(), 16.0f))).mo165712c(0)).mo165711b(drawable)).mo165752a(UDBadgeAlign.RIGHT_TOP).mo165754a();
            }
        }
    }

    /* renamed from: a */
    public final void mo163810a(boolean z) {
        int i;
        View view = this.f117330i;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public final void mo163808a(long j, long j2) {
        TextView textView = this.f117331j;
        if (textView != null) {
            textView.setText(MmTimeUtils.m186494a(j, MmTimeUtils.m186496b(j2)));
        }
    }

    public MmVideoLayerCommonViewHolder(View view, AbstractC64152a aVar, AbstractC46626a aVar2) {
        Intrinsics.checkParameterIsNotNull(view, "host");
        Intrinsics.checkParameterIsNotNull(aVar, "layer");
        Intrinsics.checkParameterIsNotNull(aVar2, "layerContext");
        this.f117334m = view;
        this.f117335n = aVar;
        this.f117324c = aVar2;
        View findViewById = view.findViewById(R.id.player_half_subtitle);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "host.findViewById(R.id.player_half_subtitle)");
        this.f117322a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.podcastIcon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "host.findViewById(R.id.podcastIcon)");
        this.f117325d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ivLeft);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "host.findViewById(R.id.ivLeft)");
        this.f117326e = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.entryMore);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "host.findViewById(R.id.entryMore)");
        this.f117327f = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.mm_toolbar_speed);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "host.findViewById(R.id.mm_toolbar_speed)");
        this.f117328g = findViewById5;
        View findViewById6 = view.findViewById(R.id.mm_toolbar_speed_tag);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "host.findViewById(R.id.mm_toolbar_speed_tag)");
        this.f117329h = (TextView) findViewById6;
        this.f117330i = view.findViewById(R.id.expandFullScreen);
        this.f117331j = (TextView) view.findViewById(R.id.playPositionTv);
        this.f117332k = (TextView) view.findViewById(R.id.durationTv);
        this.f117333l = (ReactionTimeLine) view.findViewById(R.id.mmVideoReactionLine);
        m184434d();
    }
}
