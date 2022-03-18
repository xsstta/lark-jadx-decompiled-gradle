package com.ss.android.lark.mm.module.detail.subtitles;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.module.detail.baseinfo.PermissionUserType;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingContent;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import com.ss.android.lark.mm.module.detail.subtitles.model.ParagraphHighlightInfoViewModel;
import com.ss.android.lark.mm.module.detail.subtitles.model.SentenceHighlightInfoViewModel;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.p2288b.C45853e;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.p2288b.C45857i;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.ClickSubtitleContentEvent;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.ktextensions.C47109c;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.MmBubbleTagLayout;
import com.ss.android.lark.mm.widget.selectable.C47167b;
import com.ss.android.lark.mm.widget.selectable.SelectableOverlay;
import com.ss.android.lark.mm.widget.selectable.SelectableTextHelper;
import com.ss.android.lark.mm.widget.texthighlightbg.HighlightStyle;
import com.ss.android.lark.mm.widget.texthighlightbg.MmAnnotationSpan;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;

public final class MmSubtitlesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: A */
    private MmBubbleTagLayout f116284A;

    /* renamed from: a */
    public final String f116285a = "MmTranscriptionAdapter";

    /* renamed from: b */
    public final LinearLayoutManager f116286b;

    /* renamed from: c */
    public final List<MmMeetingParagraph> f116287c;

    /* renamed from: d */
    public ParagraphHighlightInfoViewModel f116288d;

    /* renamed from: e */
    public ScrollMode f116289e;

    /* renamed from: f */
    public int f116290f;

    /* renamed from: g */
    public int f116291g;

    /* renamed from: h */
    public Pair<Integer, ? extends SelectableTextHelper> f116292h;

    /* renamed from: i */
    public Pair<Integer, IntRange> f116293i;

    /* renamed from: j */
    public Pair<Integer, Boolean> f116294j;

    /* renamed from: k */
    public final MmTransAdapterDepend f116295k;

    /* renamed from: l */
    public final MmTransAdapterCallback f116296l;

    /* renamed from: m */
    private List<String> f116297m;

    /* renamed from: n */
    private MmComment f116298n;

    /* renamed from: o */
    private final List<Integer> f116299o;

    /* renamed from: p */
    private ParagraphHighlightInfoViewModel f116300p;

    /* renamed from: q */
    private final int[] f116301q;

    /* renamed from: r */
    private final List<Integer> f116302r;

    /* renamed from: s */
    private final List<Integer> f116303s;

    /* renamed from: t */
    private Rect f116304t;

    /* renamed from: u */
    private final Lazy f116305u;

    /* renamed from: v */
    private boolean f116306v;

    /* renamed from: w */
    private boolean f116307w;

    /* renamed from: x */
    private final int f116308x;

    /* renamed from: y */
    private MmTranslateLangType f116309y;

    /* renamed from: z */
    private boolean f116310z;

    public enum PayloadType {
        ONLY_CONTENT
    }

    public enum ScrollMode {
        AutoFlipPage,
        Keep
    }

    public enum ViewType {
        KEYWORD,
        TRANSCRIPTION
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$d */
    public interface MmTransAdapterDepend {
        /* renamed from: a */
        Context mo162220a();

        /* renamed from: b */
        RecyclerView mo162221b();

        /* renamed from: c */
        int mo162222c();

        /* renamed from: d */
        int mo162223d();

        /* renamed from: e */
        boolean mo162224e();

        /* renamed from: f */
        boolean mo162225f();

        /* renamed from: g */
        boolean mo162226g();

        /* renamed from: h */
        boolean mo162227h();

        /* renamed from: i */
        boolean mo162228i();
    }

    /* renamed from: g */
    private final boolean m182742g(int i) {
        return i == 0;
    }

    /* renamed from: c */
    public final int mo162184c(int i) {
        return i + 1;
    }

    /* renamed from: c */
    public final ClickSubtitleContentEvent mo162185c() {
        return (ClickSubtitleContentEvent) this.f116305u.getValue();
    }

    /* renamed from: d */
    public final int mo162187d(int i) {
        return i - 1;
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b */
    public final class MMParagraphViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f116316a;

        /* renamed from: b */
        public MmMeetingParagraph f116317b;

        /* renamed from: c */
        final /* synthetic */ MmSubtitlesAdapter f116318c;

        /* renamed from: d */
        private final TextView f116319d;

        /* renamed from: e */
        private final TextView f116320e;

        /* renamed from: f */
        private final TextView f116321f;

        /* renamed from: g */
        private final MmSubtitleContentTextView f116322g;

        /* renamed from: h */
        private final SpannableStringBuilder f116323h = new SpannableStringBuilder();

        /* renamed from: i */
        private final TextView f116324i;

        /* renamed from: j */
        private final LinearLayout f116325j;

        /* renamed from: k */
        private final View f116326k;

        /* renamed from: l */
        private final View f116327l;

        /* renamed from: a */
        public final MmSubtitleContentTextView mo162198a() {
            return this.f116322g;
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$e */
        public static final class C46150e extends Lambda implements Function0<Unit> {
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46150e(MMParagraphViewHolder bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f116318c.mo162188d(true);
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$g */
        public static final class C46152g implements MmSubtitleContentTextView.IMmSubtitleContentTextViewDepend {

            /* renamed from: a */
            final /* synthetic */ MMParagraphViewHolder f116330a;

            @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.IMmSubtitleContentTextViewDepend
            /* renamed from: a */
            public boolean mo162153a() {
                if (this.f116330a.f116318c.mo162191e() != MmTranslateLangType.DEFAULT) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.IMmSubtitleContentTextViewDepend
            /* renamed from: b */
            public boolean mo162154b() {
                return this.f116330a.f116318c.f116295k.mo162224e();
            }

            @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.IMmSubtitleContentTextViewDepend
            /* renamed from: c */
            public boolean mo162155c() {
                return this.f116330a.f116318c.f116295k.mo162226g();
            }

            @Override // com.ss.android.lark.mm.module.detail.subtitles.MmSubtitleContentTextView.IMmSubtitleContentTextViewDepend
            /* renamed from: d */
            public boolean mo162156d() {
                return this.f116330a.f116318c.f116295k.mo162228i();
            }

            C46152g(MMParagraphViewHolder bVar) {
                this.f116330a = bVar;
            }
        }

        /* renamed from: b */
        private final void m182781b() {
            this.f116322g.setOnClickCallback(new C46158k(this));
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$f */
        public static final class C46151f extends Lambda implements Function0<Unit> {
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46151f(MMParagraphViewHolder bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.f116318c.f116296l.mo162214a(this.this$0.f116318c.mo162187d(this.this$0.getAdapterPosition()));
                MMParagraphViewHolder.m182780a(this.this$0, 0, null, 2, null);
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$h */
        public static final class View$OnAttachStateChangeListenerC46153h implements View.OnAttachStateChangeListener {

            /* renamed from: a */
            final /* synthetic */ MMParagraphViewHolder f116331a;

            public void onViewDetachedFromWindow(View view) {
            }

            /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$h$a */
            static final class RunnableC46154a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ View$OnAttachStateChangeListenerC46153h f116332a;

                RunnableC46154a(View$OnAttachStateChangeListenerC46153h hVar) {
                    this.f116332a = hVar;
                }

                public final void run() {
                    SelectableTextHelper selectableTextHelper;
                    C47167b b;
                    C47167b b2;
                    this.f116332a.f116331a.mo162198a().mo162133a();
                    Pair<Integer, ? extends SelectableTextHelper> pair = this.f116332a.f116331a.f116318c.f116292h;
                    if (pair != null && pair.getFirst().intValue() == this.f116332a.f116331a.getAdapterPosition() && (selectableTextHelper = (SelectableTextHelper) pair.getSecond()) != null && (b = selectableTextHelper.mo165814b()) != null) {
                        int i = b.f118944a;
                        SelectableTextHelper selectableTextHelper2 = (SelectableTextHelper) pair.getSecond();
                        if (selectableTextHelper2 != null && (b2 = selectableTextHelper2.mo165814b()) != null) {
                            int i2 = b2.f118945b;
                            SelectableTextHelper selectableTextHelper3 = this.f116332a.f116331a.mo162198a().getSelectableTextHelper();
                            if (selectableTextHelper3 != null) {
                                selectableTextHelper3.mo165815b(i, i2);
                            }
                            this.f116332a.f116331a.f116318c.f116292h = TuplesKt.to(Integer.valueOf(this.f116332a.f116331a.getAdapterPosition()), this.f116332a.f116331a.mo162198a().getSelectableTextHelper());
                        }
                    }
                }
            }

            View$OnAttachStateChangeListenerC46153h(MMParagraphViewHolder bVar) {
                this.f116331a = bVar;
            }

            public void onViewAttachedToWindow(View view) {
                this.f116331a.mo162198a().post(new RunnableC46154a(this));
            }
        }

        /* renamed from: c */
        private final void m182783c() {
            this.f116322g.setOnStartCommentCallback(new C46147c(this));
            this.f116322g.setOnLongClickCallback(new C46149d(this));
            this.f116322g.setCopyTextCallback(new C46150e(this));
            this.f116322g.setViewOriginalTextCallback(new C46151f(this));
            this.f116322g.setDepend(new C46152g(this));
            this.f116322g.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC46153h(this));
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$d */
        public static final class C46149d extends Lambda implements Function0<Unit> {
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46149d(MMParagraphViewHolder bVar) {
                super(0);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                SelectableTextHelper selectableTextHelper;
                Pair<Integer, ? extends SelectableTextHelper> pair = this.this$0.f116318c.f116292h;
                if (!(pair == null || (selectableTextHelper = (SelectableTextHelper) pair.getSecond()) == null)) {
                    selectableTextHelper.mo165821g();
                }
                this.this$0.f116318c.f116292h = TuplesKt.to(Integer.valueOf(this.this$0.getAdapterPosition()), this.this$0.mo162198a().getSelectableTextHelper());
                if (this.this$0.f116318c.mo162191e() != MmTranslateLangType.DEFAULT && !this.this$0.f116318c.f116295k.mo162224e()) {
                    Pair<Integer, Boolean> pair2 = this.this$0.f116318c.f116294j;
                    if (pair2 != null) {
                        int intValue = pair2.getFirst().intValue();
                        this.this$0.f116318c.f116294j = null;
                        this.this$0.f116318c.notifyItemChanged(intValue, PayloadType.ONLY_CONTENT);
                    }
                    this.this$0.f116318c.f116294j = TuplesKt.to(Integer.valueOf(this.this$0.getAdapterPosition()), true);
                    this.this$0.f116318c.notifyItemChanged(this.this$0.getAdapterPosition(), PayloadType.ONLY_CONTENT);
                }
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$i */
        public static final class RunnableC46155i implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MMParagraphViewHolder f116333a;

            /* renamed from: b */
            final /* synthetic */ int f116334b;

            /* renamed from: c */
            final /* synthetic */ Function0 f116335c;

            RunnableC46155i(MMParagraphViewHolder bVar, int i, Function0 function0) {
                this.f116333a = bVar;
                this.f116334b = i;
                this.f116335c = function0;
            }

            public final void run() {
                final RecyclerView.ViewHolder e = this.f116333a.f116318c.mo162190e(this.f116333a.getAdapterPosition());
                if (e == null) {
                    MmSubtitlesAdapter mmSubtitlesAdapter = this.f116333a.f116318c;
                    mmSubtitlesAdapter.mo162174a("pushRecyclerView", this.f116333a.getAdapterPosition() + " viewHolder is null");
                }
                if (e instanceof MMParagraphViewHolder) {
                    final int[] iArr = new int[2];
                    MMParagraphViewHolder bVar = (MMParagraphViewHolder) e;
                    bVar.mo162198a().getLocationOnScreen(iArr);
                    final Rect a = this.f116333a.f116318c.mo162160a(bVar.mo162198a(), this.f116334b);
                    final int dp2px = UIUtils.dp2px(this.f116333a.f116318c.f116295k.mo162220a(), 44.0f);
                    this.f116333a.f116318c.f116286b.scrollToPositionWithOffset(this.f116333a.getAdapterPosition(), -a.top);
                    this.f116333a.mo162198a().post(new Runnable(this) {
                        /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MMParagraphViewHolder.RunnableC46155i.RunnableC461561 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC46155i f116336a;

                        {
                            this.f116336a = r1;
                        }

                        public final void run() {
                            int findFirstVisibleItemPosition = this.f116336a.f116333a.f116318c.f116286b.findFirstVisibleItemPosition();
                            int findLastVisibleItemPosition = this.f116336a.f116333a.f116318c.f116286b.findLastVisibleItemPosition();
                            String str = this.f116336a.f116333a.f116318c.f116285a;
                            C45855f.m181666e(str, "firstVisiblePosition: " + findFirstVisibleItemPosition + ", position: " + this.f116336a.f116333a.getAdapterPosition() + ", lastVisiblePosition:" + findLastVisibleItemPosition + ", itemCount:" + this.f116336a.f116333a.f116318c.getItemCount());
                            if (findFirstVisibleItemPosition != this.f116336a.f116333a.getAdapterPosition() || findLastVisibleItemPosition >= this.f116336a.f116333a.f116318c.getItemCount() - 1) {
                                ((MMParagraphViewHolder) e).mo162198a().getLocationOnScreen(iArr);
                                float f = -((float) (((iArr[1] - this.f116336a.f116333a.f116318c.f116295k.mo162223d()) + a.top) - dp2px));
                                if (f != BitmapDescriptorFactory.HUE_RED) {
                                    RecyclerView b = this.f116336a.f116333a.f116318c.f116295k.mo162221b();
                                    b.setTranslationY(b.getTranslationY() + f);
                                }
                            }
                            Function0 function0 = this.f116336a.f116335c;
                            if (function0 != null) {
                                Unit unit = (Unit) function0.invoke();
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$b */
        public static final class C46146b extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MmMeetingParagraph $paragraph;
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46146b(MMParagraphViewHolder bVar, MmMeetingParagraph mmMeetingParagraph) {
                super(1);
                this.this$0 = bVar;
                this.$paragraph = mmMeetingParagraph;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkParameterIsNotNull(view, "it");
                C45855f.m181664c(this.this$0.f116318c.f116285a, "click avatar, open profile");
                Activity a = C47098d.m186533a(this.this$0.f116316a.getContext());
                if (a != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) a;
                    C47083e.m186423a(fragmentActivity, "vc_mm_click_button", C47086i.m186432a().mo165409a("profile_picture").mo165413a("page_name", "detail_page").mo165413a("from_source", "speaker_picture").mo165421c());
                    C47083e.m186423a(fragmentActivity, "vc_minutes_detail_click", C47086i.m186432a().mo165422d("profile").mo165423e("none").mo165424f("speaker_picture").mo165421c());
                    IMmDepend a2 = C45899c.m181859a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "MmDepend.impl()");
                    IMmDepend.AbstractC45879g hostDepend = a2.getHostDepend();
                    Context context = this.this$0.f116316a.getContext();
                    MmParticipants.MmParticipantInfo speaker = this.$paragraph.getSpeaker();
                    Intrinsics.checkExpressionValueIsNotNull(speaker, "paragraph.speaker");
                    String userId = speaker.getUserId();
                    PermissionUserType.Companion aVar = PermissionUserType.Companion;
                    MmParticipants.MmParticipantInfo speaker2 = this.$paragraph.getSpeaker();
                    Intrinsics.checkExpressionValueIsNotNull(speaker2, "paragraph.speaker");
                    hostDepend.mo144633a(context, userId, aVar.mo161614a(speaker2.getUserType()));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$l */
        public static final class C46159l extends Lambda implements Function1<View, Unit> {
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46159l(MMParagraphViewHolder bVar) {
                super(1);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkParameterIsNotNull(view, "it");
                C45855f.m181664c(this.this$0.f116318c.f116285a, "view all comments");
                C47083e.m186423a(this.this$0.f116318c.f116295k.mo162220a(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("view_comment").mo165416b().mo165424f("subtitle").mo165421c());
                MmTransAdapterCallback.C46160a.m182802a(this.this$0.f116318c.f116296l, this.this$0.getAdapterPosition(), 0, 2, null);
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$k */
        public static final class C46158k extends Lambda implements Function1<Integer, Unit> {
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46158k(MMParagraphViewHolder bVar) {
                super(1);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                T t;
                boolean z;
                MmMeetingParagraph mmMeetingParagraph = this.this$0.f116317b;
                if (mmMeetingParagraph != null) {
                    boolean z2 = false;
                    for (MmMeetingSentence mmMeetingSentence : mmMeetingParagraph.getSentences()) {
                        if (!z2) {
                            List<MmMeetingContent> list = mmMeetingSentence.contents;
                            Intrinsics.checkExpressionValueIsNotNull(list, "contents");
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                T t2 = t;
                                Intrinsics.checkExpressionValueIsNotNull(t2, "content");
                                IntRange offsetInParaRange = t2.getOffsetInParaRange();
                                if (offsetInParaRange == null || !offsetInParaRange.mo239410a(i)) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            T t3 = t;
                            if (t3 != null) {
                                if (!this.this$0.f116318c.f116295k.mo162224e()) {
                                    this.this$0.f116318c.mo162169a(ScrollMode.Keep);
                                }
                                this.this$0.f116318c.mo162185c().mo165437a();
                                C47083e.m186423a(this.this$0.f116318c.f116295k.mo162220a(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle").mo165423e("none").mo165421c());
                                MmTransAdapterCallback cVar = this.this$0.f116318c.f116296l;
                                String startTime = t3.getStartTime();
                                Intrinsics.checkExpressionValueIsNotNull(startTime, "targetContent.startTime");
                                long parseLong = Long.parseLong(startTime);
                                String stopTime = t3.getStopTime();
                                Intrinsics.checkExpressionValueIsNotNull(stopTime, "targetContent.stopTime");
                                cVar.mo162218a((parseLong + Long.parseLong(stopTime)) / ((long) 2));
                                z2 = true;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$a */
        public static final class C46145a implements C45853e.AbstractC45854a {

            /* renamed from: a */
            final /* synthetic */ MMParagraphViewHolder f116328a;

            /* renamed from: b */
            final /* synthetic */ String f116329b;

            C46145a(MMParagraphViewHolder bVar, String str) {
                this.f116328a = bVar;
                this.f116329b = str;
            }

            @Override // com.ss.android.lark.mm.p2288b.C45853e.AbstractC45854a
            /* renamed from: a */
            public final void mo161154a(Bitmap bitmap) {
                if (bitmap != null && Intrinsics.areEqual(this.f116328a.f116316a.getTag(), this.f116329b)) {
                    this.f116328a.f116316a.setImageBitmap(bitmap);
                }
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$j */
        public static final class C46157j<T> implements Consumer<Unit> {

            /* renamed from: a */
            final /* synthetic */ MMParagraphViewHolder f116341a;

            C46157j(MMParagraphViewHolder bVar) {
                this.f116341a = bVar;
            }

            /* renamed from: a */
            public final void accept(Unit unit) {
                MmMeetingParagraph mmMeetingParagraph = this.f116341a.f116317b;
                if (mmMeetingParagraph != null) {
                    MmTransAdapterCallback cVar = this.f116341a.f116318c.f116296l;
                    int d = this.f116341a.f116318c.mo162187d(this.f116341a.getAdapterPosition());
                    String pid = mmMeetingParagraph.getPid();
                    Intrinsics.checkExpressionValueIsNotNull(pid, "it.pid");
                    MmParticipants.MmParticipantInfo speaker = mmMeetingParagraph.getSpeaker();
                    Intrinsics.checkExpressionValueIsNotNull(speaker, "it.speaker");
                    String userId = speaker.getUserId();
                    Intrinsics.checkExpressionValueIsNotNull(userId, "it.speaker.userId");
                    cVar.mo162217a(d, pid, userId);
                }
            }
        }

        /* renamed from: a */
        public final void mo162200a(MmComment.MmCommentInfo mmCommentInfo) {
            if (mmCommentInfo == null || mmCommentInfo.getComment_num() <= 0) {
                this.f116324i.setVisibility(8);
            } else {
                this.f116324i.setText(String.valueOf(mmCommentInfo.getComment_num()));
                this.f116324i.setVisibility(0);
                this.f116324i.setSelected(true);
            }
            View view = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
            C47110e.m186572a(this.f116324i, UIUtils.dp2px(view.getContext(), 20.0f));
            C47110e.m186573a(this.f116324i, new C46159l(this));
        }

        /* renamed from: a */
        public final void mo162201a(MmMeetingParagraph mmMeetingParagraph) {
            int i;
            int i2;
            int i3;
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            this.f116317b = mmMeetingParagraph;
            TextView textView = this.f116319d;
            MmParticipants.MmParticipantInfo speaker = mmMeetingParagraph.getSpeaker();
            Intrinsics.checkExpressionValueIsNotNull(speaker, "paragraph.speaker");
            textView.setText(speaker.getUserName());
            TextView textView2 = this.f116319d;
            textView2.setMaxWidth((int) (((double) UIHelper.getWindowWidth(textView2.getContext())) * 0.5d));
            boolean h = this.f116318c.f116295k.mo162227h();
            ImageView imageView = this.f116316a;
            int i4 = 8;
            if (h) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
            TextView textView3 = this.f116319d;
            if (h) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            textView3.setVisibility(i2);
            TextView textView4 = this.f116321f;
            if (h) {
                textView4.setText(mmMeetingParagraph.getDisplayStartTime());
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView4.setVisibility(i3);
            TextView textView5 = this.f116320e;
            if (!h) {
                i4 = 0;
            }
            textView5.setVisibility(i4);
            MmParticipants.MmParticipantInfo speaker2 = mmMeetingParagraph.getSpeaker();
            Intrinsics.checkExpressionValueIsNotNull(speaker2, "paragraph.speaker");
            String avatarUrl = speaker2.getAvatarUrl();
            this.f116316a.setTag(avatarUrl);
            C45853e.m181656a(this.f116316a.getContext(), avatarUrl, C57582a.m223600a(32), C57582a.m223600a(32), new C46145a(this, avatarUrl));
            C47110e.m186573a(this.f116316a, new C46146b(this, mmMeetingParagraph));
            this.f116320e.setText(mmMeetingParagraph.getDisplayStartTime());
        }

        /* renamed from: a */
        public final void mo162203a(boolean z) {
            if (z) {
                this.f116316a.setEnabled(false);
                this.f116325j.setPadding(C57582a.m223600a(4), 0, C57582a.m223600a(4), 0);
                this.f116325j.setBackgroundResource(R.drawable.mm_bg_speaker_edit);
                this.f116326k.setVisibility(0);
                Disposable subscribe = C47109c.m186569a(this.f116325j).throttleFirst(1, TimeUnit.SECONDS).subscribe(new C46157j(this));
                Intrinsics.checkExpressionValueIsNotNull(subscribe, "nameLayout.clicks().thro…      }\n                }");
                C47108b.m186566a(subscribe, this.f116325j.getContext());
                return;
            }
            this.f116325j.setPadding(0, 0, 0, 0);
            this.f116316a.setEnabled(true);
            this.f116325j.setOnClickListener(null);
            this.f116325j.setBackground(null);
            this.f116326k.setVisibility(8);
        }

        /* renamed from: a */
        public final void mo162199a(int i, Function0<Unit> function0) {
            this.f116322g.post(new RunnableC46155i(this, i, function0));
        }

        /* renamed from: a */
        public final void mo162202a(MmMeetingParagraph mmMeetingParagraph, ParagraphHighlightInfoViewModel bVar) {
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            this.f116323h.clear();
            this.f116323h.clearSpans();
            m182782b(mmMeetingParagraph, bVar);
            this.f116322g.setText(this.f116323h);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MMParagraphViewHolder(MmSubtitlesAdapter mmSubtitlesAdapter, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            this.f116318c = mmSubtitlesAdapter;
            this.f116327l = view;
            View findViewById = view.findViewById(R.id.avatarIv);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.avatarIv)");
            this.f116316a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.useName);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.useName)");
            this.f116319d = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.timeView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.timeView)");
            this.f116320e = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.leftTimeView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.leftTimeView)");
            this.f116321f = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.contentView);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.contentView)");
            this.f116322g = (MmSubtitleContentTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.commentViewAll);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.commentViewAll)");
            this.f116324i = (TextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.nameLayout);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "view.findViewById(R.id.nameLayout)");
            this.f116325j = (LinearLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.editIcon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "view.findViewById(R.id.editIcon)");
            this.f116326k = findViewById8;
            m182781b();
            m182783c();
        }

        /* renamed from: b */
        private final void m182782b(MmMeetingParagraph mmMeetingParagraph, ParagraphHighlightInfoViewModel bVar) {
            List<SentenceHighlightInfoViewModel> list;
            Pair<Integer, Boolean> pair;
            Pair<Integer, Boolean> pair2;
            Pair<Integer, IntRange> pair3;
            IntRange second;
            List<SentenceHighlightInfoViewModel> filterNotNull;
            ConcurrentHashMap<String, List<SentenceHighlightInfoViewModel>> a;
            if (bVar == null || (a = bVar.mo162572a()) == null) {
                list = null;
            } else {
                list = a.get(mmMeetingParagraph.getPid());
            }
            this.f116323h.append((CharSequence) mmMeetingParagraph.getParaContents());
            List<SentenceHighlightInfoViewModel> syncHighLightModel = mmMeetingParagraph.getSyncHighLightModel();
            if (!(syncHighLightModel == null || (filterNotNull = CollectionsKt.filterNotNull(syncHighLightModel)) == null)) {
                for (SentenceHighlightInfoViewModel cVar : filterNotNull) {
                    int f = cVar.mo162580f();
                    int c = cVar.mo162576c() + f;
                    if (c >= 0 && f >= 0 && c > f) {
                        this.f116323h.setSpan(new MmAnnotationSpan("highlightSpan", String.valueOf(HighlightStyle.SYNC.getValue())), f, c, 17);
                        this.f116323h.setSpan(new ForegroundColorSpan(-1), f, c, 17);
                    }
                }
            }
            if (list != null) {
                for (T t : list) {
                    int f2 = t.mo162580f();
                    int c2 = t.mo162576c() + f2;
                    if (c2 >= 0 && f2 >= 0 && c2 > f2) {
                        this.f116323h.setSpan(new MmAnnotationSpan("highlightSpan", String.valueOf(t.mo162577d().getValue())), f2, c2, 17);
                        this.f116323h.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this.f116318c.f116295k.mo162220a(), R.color.text_title)), f2, c2, 17);
                    }
                }
            }
            List<MmHighlightInfo> commentRenderHighlightModel = mmMeetingParagraph.getCommentRenderHighlightModel();
            if (commentRenderHighlightModel != null) {
                for (T t2 : commentRenderHighlightModel) {
                    Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                    int offsetInPara = t2.getOffsetInPara();
                    int size = t2.getSize() + offsetInPara;
                    if (size >= 0 && offsetInPara >= 0 && size > offsetInPara) {
                        this.f116323h.setSpan(new MmAnnotationSpan("highlightSpan", String.valueOf(HighlightStyle.COMMENT_DOTTED_LINE.getValue())), offsetInPara, size, 17);
                    }
                }
            }
            SelectableTextHelper selectableTextHelper = this.f116322g.getSelectableTextHelper();
            if (selectableTextHelper != null && this.f116318c.mo162191e() == MmTranslateLangType.DEFAULT) {
                int i = selectableTextHelper.f118899m;
                int i2 = selectableTextHelper.f118900n;
                if (!(i == -1 || i2 == -1)) {
                    this.f116323h.setSpan(new BackgroundColorSpan(this.f116322g.getSelectedColor()), i, i2, 17);
                }
            }
            Pair<Integer, IntRange> pair4 = this.f116318c.f116293i;
            if (!(pair4 == null || pair4.getFirst().intValue() != getAdapterPosition() || (pair3 = this.f116318c.f116293i) == null || (second = pair3.getSecond()) == null)) {
                int a2 = second.mo239399a();
                int b = second.mo239400b();
                if (a2 >= 0 && b >= 0 && a2 <= b) {
                    this.f116323h.setSpan(new MmAnnotationSpan("highlightSpan", String.valueOf(HighlightStyle.COMMENT_SELECTION_BG.getValue())), a2, b, 17);
                    this.f116323h.setSpan(new MmAnnotationSpan("highlightSpan", String.valueOf(HighlightStyle.COMMENT_SELECTION_UNDERLINE.getValue())), a2, b, 17);
                }
            }
            if (!(this.f116318c.mo162191e() == MmTranslateLangType.DEFAULT || (pair = this.f116318c.f116294j) == null || pair.getFirst().intValue() != getAdapterPosition() || (pair2 = this.f116318c.f116294j) == null || !pair2.getSecond().booleanValue())) {
                this.f116323h.setSpan(new MmAnnotationSpan("highlightSpan", String.valueOf(HighlightStyle.ORIGINAL_TEXT_BG.getValue())), 0, this.f116323h.length(), 17);
            }
        }

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b$c */
        public static final class C46147c extends Lambda implements Function3<Integer, Integer, String, Unit> {
            final /* synthetic */ MMParagraphViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46147c(MMParagraphViewHolder bVar) {
                super(3);
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* synthetic */ Unit invoke(Integer num, Integer num2, String str) {
                invoke(num.intValue(), num2.intValue(), str);
                return Unit.INSTANCE;
            }

            public final void invoke(final int i, final int i2, final String str) {
                Intrinsics.checkParameterIsNotNull(str, "content");
                this.this$0.f116318c.mo162166a(this.this$0.getAdapterPosition(), new IntRange(i, i2));
                this.this$0.mo162199a(i, new Function0<Unit>(this) {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.MMParagraphViewHolder.C46147c.C461481 */
                    final /* synthetic */ C46147c this$0;

                    {
                        this.this$0 = r1;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final void invoke() {
                        this.this$0.this$0.f116318c.f116296l.mo162216a(i, i2, str, this.this$0.this$0.f116318c.f116287c.get(this.this$0.this$0.f116318c.mo162187d(this.this$0.this$0.getAdapterPosition())), this.this$0.this$0.getAdapterPosition());
                    }
                });
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$b */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m182780a(MMParagraphViewHolder bVar, int i, Function0 function0, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                function0 = null;
            }
            bVar.mo162199a(i, function0);
        }
    }

    /* renamed from: a */
    public final List<Integer> mo162162a() {
        return this.f116303s;
    }

    /* renamed from: b */
    public final Rect mo162181b() {
        return this.f116304t;
    }

    /* renamed from: e */
    public final MmTranslateLangType mo162191e() {
        return this.f116309y;
    }

    /* renamed from: a */
    public final void mo162180a(boolean z) {
        this.f116306v = z;
    }

    /* renamed from: a */
    public final void mo162173a(MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "<set-?>");
        this.f116309y = mmTranslateLangType;
    }

    /* renamed from: a */
    public final void mo162178a(List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.f116297m = arrayList;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        arrayList.addAll(list);
        if (z) {
            notifyItemChanged(0);
        }
    }

    /* renamed from: a */
    public final void mo162176a(List<? extends MmMeetingParagraph> list, List<String> list2, MmComment mmComment) {
        mo162178a(list2, false);
        if (list != null) {
            this.f116287c.clear();
            this.f116287c.addAll(list);
            this.f116298n = mmComment;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo162175a(List<? extends MmMeetingParagraph> list) {
        if (list != null) {
            this.f116287c.clear();
            this.f116287c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo162170a(MmMeetingParagraph mmMeetingParagraph, int i, MmComment.MmCommentInfo mmCommentInfo) {
        Map<String, MmComment.MmCommentInfo> comments;
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
        mo162171a(mmMeetingParagraph, mo162187d(i), false);
        MmComment mmComment = this.f116298n;
        if (!(mmComment == null || (comments = mmComment.getComments()) == null)) {
            comments.put(mmMeetingParagraph.getPid(), mmCommentInfo);
        }
        notifyItemChanged(i, PayloadType.ONLY_CONTENT);
    }

    /* renamed from: a */
    public final void mo162171a(MmMeetingParagraph mmMeetingParagraph, int i, boolean z) {
        Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
        if (i >= 0 && i < this.f116287c.size()) {
            this.f116287c.set(i, mmMeetingParagraph);
            if (z) {
                notifyItemChanged(mo162184c(i), PayloadType.ONLY_CONTENT);
            }
        }
    }

    /* renamed from: a */
    public final void mo162168a(MmComment mmComment, List<String> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "paraIds");
        this.f116298n = mmComment;
        if (z) {
            ArrayList<Number> arrayList = new ArrayList();
            int i = 0;
            for (T t : this.f116287c) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (list.contains(t.getPid())) {
                    arrayList.add(Integer.valueOf(mo162184c(i)));
                }
                i = i2;
            }
            for (Number number : arrayList) {
                notifyItemChanged(number.intValue(), PayloadType.ONLY_CONTENT);
            }
        }
    }

    /* renamed from: a */
    public final void mo162179a(IntRange kVar, int i, boolean z) {
        if (kVar != null) {
            RecyclerView.ViewHolder e = mo162190e(i);
            if (e == null && z) {
                this.f116286b.scrollToPositionWithOffset(i, 0);
                C45859k.m181686a(new RunnableC46162f(this, kVar, i), 100);
            } else if (e instanceof MMParagraphViewHolder) {
                MMParagraphViewHolder.m182780a((MMParagraphViewHolder) e, kVar.mo239399a(), null, 2, null);
                mo162166a(i, kVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo162166a(int i, IntRange kVar) {
        this.f116293i = TuplesKt.to(Integer.valueOf(i), kVar);
        notifyItemChanged(i, PayloadType.ONLY_CONTENT);
    }

    /* renamed from: a */
    public final void mo162169a(ScrollMode scrollMode) {
        Intrinsics.checkParameterIsNotNull(scrollMode, "scrollMode");
        this.f116289e = scrollMode;
    }

    /* renamed from: a */
    public final void mo162172a(ParagraphHighlightInfoViewModel bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "highlightMode");
        this.f116288d = bVar;
        if (bVar.mo162572a().isEmpty()) {
            m182741b(this.f116299o);
            return;
        }
        List<Integer> b = m182739b(bVar);
        if (!b.isEmpty()) {
            m182741b(b);
            int intValue = b.get(0).intValue();
            this.f116299o.clear();
            this.f116299o.addAll(b);
            C45857i.m181676a(new RunnableC46163g(this, intValue));
        }
    }

    /* renamed from: a */
    public final void mo162165a(int i, int i2, boolean z) {
        int i3 = 0;
        this.f116306v = false;
        this.f116290f = i;
        this.f116291g = i2;
        int findLastVisibleItemPosition = this.f116286b.findLastVisibleItemPosition();
        int findFirstVisibleItemPosition = this.f116286b.findFirstVisibleItemPosition();
        if ((this.f116307w || z) && findFirstVisibleItemPosition >= i) {
            this.f116307w = false;
            Rect b = m182738b(i, i2);
            LinearLayoutManager linearLayoutManager = this.f116286b;
            if (b != null) {
                i3 = b.top;
            }
            linearLayoutManager.scrollToPositionWithOffset(i, -i3);
        } else if (findLastVisibleItemPosition == i) {
            mo162164a(i, i2);
        } else if (findLastVisibleItemPosition < i) {
            this.f116286b.scrollToPositionWithOffset(i, 0);
        }
    }

    /* renamed from: a */
    public final void mo162177a(List<? extends MmMeetingParagraph> list, List<Integer> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "para");
        if (list2 != null && !list2.isEmpty()) {
            this.f116287c.clear();
            this.f116287c.addAll(list);
            this.f116302r.clear();
            List<Integer> list3 = this.f116302r;
            List<Integer> list4 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(mo162184c(it.next().intValue())));
            }
            list3.addAll(arrayList);
            m182741b(this.f116302r);
            Iterator<T> it2 = this.f116303s.iterator();
            while (it2.hasNext()) {
                int intValue = it2.next().intValue();
                if (!this.f116302r.contains(Integer.valueOf(intValue))) {
                    notifyItemChanged(intValue, PayloadType.ONLY_CONTENT);
                }
            }
            this.f116303s.clear();
            this.f116303s.addAll(this.f116302r);
            int intValue2 = list2.get(list2.size() - 1).intValue();
            int c = mo162184c(intValue2);
            MmMeetingParagraph mmMeetingParagraph = this.f116287c.get(intValue2);
            List<SentenceHighlightInfoViewModel> syncHighLightModel = mmMeetingParagraph.getSyncHighLightModel();
            SentenceHighlightInfoViewModel cVar = syncHighLightModel != null ? syncHighLightModel.get(0) : null;
            if (cVar == null) {
                mo162174a("syncContentWithAudio", "sentenceHighlightInfoViewModel is null, para: " + mmMeetingParagraph.getPid());
                return;
            }
            int f = cVar.mo162580f();
            this.f116290f = c;
            this.f116291g = f;
            if (this.f116289e == ScrollMode.AutoFlipPage) {
                mo162165a(c, f, z);
            }
        }
    }

    /* renamed from: a */
    public final void mo162174a(String str, String str2) {
        String str3 = this.f116285a;
        C45855f.m181666e(str3, "token:" + C45950b.m182104a(this.f116295k.mo162220a()).bc_() + ",[" + str + "]," + str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$e */
    public static final class C46161e extends Lambda implements Function0<ClickSubtitleContentEvent> {
        public static final C46161e INSTANCE = new C46161e();

        C46161e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ClickSubtitleContentEvent invoke() {
            return new ClickSubtitleContentEvent(null, null, 3, null);
        }
    }

    /* renamed from: d */
    public final boolean mo162189d() {
        return this.f116306v;
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$f */
    public static final class RunnableC46162f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmSubtitlesAdapter f116342a;

        /* renamed from: b */
        final /* synthetic */ IntRange f116343b;

        /* renamed from: c */
        final /* synthetic */ int f116344c;

        RunnableC46162f(MmSubtitlesAdapter mmSubtitlesAdapter, IntRange kVar, int i) {
            this.f116342a = mmSubtitlesAdapter;
            this.f116343b = kVar;
            this.f116344c = i;
        }

        public final void run() {
            this.f116342a.mo162179a(this.f116343b, this.f116344c, false);
        }
    }

    /* renamed from: f */
    public final void mo162192f() {
        MmBubbleTagLayout mmBubbleTagLayout = this.f116284A;
        if (mmBubbleTagLayout != null) {
            mmBubbleTagLayout.mo165559a(-1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (!this.f116287c.isEmpty()) {
            return this.f116287c.size() + 1;
        }
        return 0;
    }

    /* renamed from: g */
    public final int mo162194g() {
        int i;
        Rect b = m182738b(this.f116290f, this.f116291g);
        if (b != null) {
            this.f116304t = b;
            return this.f116301q[1] + b.bottom;
        }
        int i2 = this.f116301q[1];
        Rect rect = this.f116304t;
        if (rect != null) {
            i = rect.bottom;
        } else {
            i = 0;
        }
        return i2 + i;
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$h */
    public static final class RunnableC46165h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmSubtitlesAdapter f116349a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f116350b;

        /* renamed from: c */
        final /* synthetic */ Ref.ObjectRef f116351c;

        RunnableC46165h(MmSubtitlesAdapter mmSubtitlesAdapter, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
            this.f116349a = mmSubtitlesAdapter;
            this.f116350b = objectRef;
            this.f116351c = objectRef2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$h$a */
        public static final class RunnableC46166a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MmMeetingParagraph f116352a;

            /* renamed from: b */
            final /* synthetic */ MmMeetingContent f116353b;

            /* renamed from: c */
            final /* synthetic */ RunnableC46165h f116354c;

            RunnableC46166a(MmMeetingParagraph mmMeetingParagraph, MmMeetingContent mmMeetingContent, RunnableC46165h hVar) {
                this.f116352a = mmMeetingParagraph;
                this.f116353b = mmMeetingContent;
                this.f116354c = hVar;
            }

            public final void run() {
                int c = this.f116354c.f116349a.mo162184c(this.f116354c.f116349a.f116287c.indexOf(this.f116352a));
                final ScrollMode scrollMode = this.f116354c.f116349a.f116289e;
                this.f116354c.f116349a.mo162169a(ScrollMode.Keep);
                MmTransAdapterCallback cVar = this.f116354c.f116349a.f116296l;
                String startTime = this.f116353b.getStartTime();
                Intrinsics.checkExpressionValueIsNotNull(startTime, "currentContent.startTime");
                cVar.mo162218a(Long.parseLong(startTime));
                this.f116354c.f116349a.mo162165a(c, this.f116353b.getOffsetInParaRange().mo239399a(), true);
                this.f116354c.f116349a.f116295k.mo162221b().postDelayed(new Runnable(this) {
                    /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.RunnableC46165h.RunnableC46166a.RunnableC461671 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC46166a f116355a;

                    {
                        this.f116355a = r1;
                    }

                    public final void run() {
                        this.f116355a.f116354c.f116349a.mo162169a(scrollMode);
                    }
                }, 300);
            }
        }

        public final void run() {
            String str;
            T t;
            T t2;
            T t3;
            String str2;
            List<MmMeetingContent> list;
            T t4;
            List<MmMeetingSentence> sentences;
            T t5;
            T t6 = this.f116350b.element;
            if (t6 != null) {
                Iterator<T> it = this.f116349a.f116287c.iterator();
                while (true) {
                    str = null;
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getPid(), this.f116351c.element)) {
                        break;
                    }
                }
                T t7 = t;
                if (t7 == null || (sentences = t7.getSentences()) == null) {
                    t2 = null;
                } else {
                    Iterator<T> it2 = sentences.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t5 = null;
                            break;
                        }
                        t5 = it2.next();
                        T t8 = t5;
                        Intrinsics.checkExpressionValueIsNotNull(t8, "sentence");
                        if (Intrinsics.areEqual(t8.getSid(), t6.mo162573a())) {
                            break;
                        }
                    }
                    t2 = t5;
                }
                if (t2 == null || (list = t2.contents) == null) {
                    t3 = null;
                } else {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            t4 = null;
                            break;
                        }
                        t4 = it3.next();
                        T t9 = t4;
                        Intrinsics.checkExpressionValueIsNotNull(t9, "it");
                        if (t9.getOffsetInSentenceRange().mo239410a(t6.mo162575b())) {
                            break;
                        }
                    }
                    t3 = t4;
                }
                if (t3 == null) {
                    MmSubtitlesAdapter mmSubtitlesAdapter = this.f116349a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(" para:");
                    if (t7 != null) {
                        str2 = t7.getPid();
                    } else {
                        str2 = null;
                    }
                    sb.append(str2);
                    sb.append(", sentence: ");
                    if (t2 != null) {
                        str = t2.getSid();
                    }
                    sb.append(str);
                    sb.append(", currentHighlightInfo: ");
                    sb.append((Object) t6);
                    mmSubtitlesAdapter.mo162174a("selectCurrentHighlight", sb.toString());
                    return;
                }
                C45859k.m181685a(new RunnableC46166a(t7, t3, this));
            }
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$g */
    public static final class RunnableC46163g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmSubtitlesAdapter f116345a;

        /* renamed from: b */
        final /* synthetic */ int f116346b;

        RunnableC46163g(MmSubtitlesAdapter mmSubtitlesAdapter, int i) {
            this.f116345a = mmSubtitlesAdapter;
            this.f116346b = i;
        }

        public final void run() {
            SentenceHighlightInfoViewModel cVar;
            T t;
            T t2;
            List<MmMeetingContent> list;
            List<MmMeetingSentence> sentences;
            T t3;
            ConcurrentHashMap<String, List<SentenceHighlightInfoViewModel>> a;
            List<SentenceHighlightInfoViewModel> list2;
            String pid = this.f116345a.f116287c.get(this.f116345a.mo162187d(this.f116346b)).getPid();
            ParagraphHighlightInfoViewModel bVar = this.f116345a.f116288d;
            T t4 = null;
            if (bVar == null || (a = bVar.mo162572a()) == null || (list2 = a.get(pid)) == null) {
                cVar = null;
            } else {
                cVar = list2.get(0);
            }
            if (cVar != null) {
                Iterator<T> it = this.f116345a.f116287c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (Intrinsics.areEqual(t.getPid(), pid)) {
                        break;
                    }
                }
                T t5 = t;
                if (t5 == null || (sentences = t5.getSentences()) == null) {
                    t2 = null;
                } else {
                    Iterator<T> it2 = sentences.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t3 = null;
                            break;
                        }
                        t3 = it2.next();
                        T t6 = t3;
                        Intrinsics.checkExpressionValueIsNotNull(t6, "sentence");
                        if (Intrinsics.areEqual(t6.getSid(), cVar.mo162573a())) {
                            break;
                        }
                    }
                    t2 = t3;
                }
                if (t2 != null && (list = t2.contents) != null) {
                    Iterator<T> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next = it3.next();
                        T t7 = next;
                        Intrinsics.checkExpressionValueIsNotNull(t7, "it");
                        if (t7.getOffsetInSentenceRange().mo239410a(cVar.mo162575b())) {
                            t4 = next;
                            break;
                        }
                    }
                    final T t8 = t4;
                    if (t8 != null) {
                        C45859k.m181685a(new Runnable(this) {
                            /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.RunnableC46163g.RunnableC461641 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC46163g f116347a;

                            {
                                this.f116347a = r1;
                            }

                            public final void run() {
                                this.f116347a.f116345a.mo162165a(this.f116347a.f116346b, t8.getOffsetInParaRange().mo239399a(), true);
                                MmTransAdapterCallback cVar = this.f116347a.f116345a.f116296l;
                                String startTime = t8.getStartTime();
                                Intrinsics.checkExpressionValueIsNotNull(startTime, "currentContent.startTime");
                                long parseLong = Long.parseLong(startTime);
                                String stopTime = t8.getStopTime();
                                Intrinsics.checkExpressionValueIsNotNull(stopTime, "currentContent.stopTime");
                                cVar.mo162218a((parseLong + Long.parseLong(stopTime)) / ((long) 2));
                                this.f116347a.f116345a.mo162169a(ScrollMode.AutoFlipPage);
                            }
                        });
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$a */
    public final class KeywordViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ MmSubtitlesAdapter f116313a;

        /* renamed from: b */
        private final MmBubbleTagLayout f116314b;

        /* renamed from: c */
        private final int f116315c;

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$a$a */
        public static final class C46144a extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ KeywordViewHolder this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46144a(KeywordViewHolder aVar) {
                super(1);
                this.this$0 = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                this.this$0.f116313a.f116296l.mo162219a(str);
            }
        }

        /* renamed from: a */
        public final void mo162196a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "keywords");
            this.f116314b.mo165560a(list, this.f116315c, new C46144a(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public KeywordViewHolder(MmSubtitlesAdapter mmSubtitlesAdapter, MmBubbleTagLayout mmBubbleTagLayout, int i) {
            super(mmBubbleTagLayout);
            Intrinsics.checkParameterIsNotNull(mmBubbleTagLayout, "view");
            this.f116313a = mmSubtitlesAdapter;
            this.f116314b = mmBubbleTagLayout;
            this.f116315c = i;
        }
    }

    /* renamed from: a */
    public final void mo162167a(MmComment mmComment) {
        this.f116298n = mmComment;
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo162183b(boolean z) {
        this.f116310z = z;
        notifyDataSetChanged();
    }

    /* renamed from: c */
    public final void mo162186c(boolean z) {
        this.f116307w = z;
    }

    /* renamed from: e */
    public final RecyclerView.ViewHolder mo162190e(int i) {
        return this.f116295k.mo162221b().findViewHolderForAdapterPosition(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ViewType viewType;
        if (m182742g(i)) {
            viewType = ViewType.KEYWORD;
        } else {
            viewType = ViewType.TRANSCRIPTION;
        }
        return viewType.ordinal();
    }

    /* renamed from: b */
    private final void m182741b(List<Integer> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            notifyItemChanged(it.next().intValue(), PayloadType.ONLY_CONTENT);
        }
    }

    /* renamed from: d */
    public final void mo162188d(boolean z) {
        SelectableTextHelper selectableTextHelper;
        Pair<Integer, Boolean> pair = this.f116294j;
        if (pair != null && (z || !this.f116295k.mo162225f())) {
            int intValue = pair.getFirst().intValue();
            this.f116294j = null;
            notifyItemChanged(intValue, PayloadType.ONLY_CONTENT);
        }
        Pair<Integer, ? extends SelectableTextHelper> pair2 = this.f116292h;
        if (!(pair2 == null || (selectableTextHelper = (SelectableTextHelper) pair2.getSecond()) == null)) {
            selectableTextHelper.mo165821g();
        }
        this.f116292h = null;
    }

    /* renamed from: b */
    private final List<Integer> m182739b(ParagraphHighlightInfoViewModel bVar) {
        boolean z;
        if (bVar == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (T t : this.f116287c) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (bVar.mo162572a().containsKey(t.getPid())) {
                arrayList.add(Integer.valueOf(mo162184c(i)));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(t);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: f */
    public final void mo162193f(int i) {
        ConcurrentHashMap<String, List<SentenceHighlightInfoViewModel>> a;
        HighlightStyle highlightStyle;
        m182740b("selectCurrentHighlight", "index: " + i);
        ParagraphHighlightInfoViewModel bVar = this.f116288d;
        if (bVar != null) {
            if ((bVar != null ? bVar.mo162572a() : null) != null) {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = "";
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = (T) null;
                ParagraphHighlightInfoViewModel bVar2 = this.f116288d;
                if (!(bVar2 == null || (a = bVar2.mo162572a()) == null)) {
                    for (Map.Entry<String, List<SentenceHighlightInfoViewModel>> entry : a.entrySet()) {
                        for (T t : entry.getValue()) {
                            if (t.mo162578e() == i) {
                                objectRef.element = (T) entry.getKey();
                                objectRef2.element = t;
                                highlightStyle = HighlightStyle.INDEX_KEYWORD_FIND;
                            } else {
                                highlightStyle = HighlightStyle.KEYWORD_FIND;
                            }
                            t.mo162574a(highlightStyle);
                        }
                    }
                }
                List<Integer> b = m182739b(this.f116288d);
                if (b.isEmpty()) {
                    mo162174a("selectCurrentHighlight", "needNotifyPositions is empty, currentHighlightInfo: " + ((Object) objectRef2.element));
                    return;
                }
                m182741b(b);
                C45857i.m181676a(new RunnableC46165h(this, objectRef2, objectRef));
            }
        }
    }

    /* renamed from: a */
    public final Integer mo162161a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pid");
        Iterator<MmMeetingParagraph> it = this.f116287c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getPid(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return -1;
        }
        return Integer.valueOf(mo162184c(i));
    }

    /* renamed from: b */
    public final void mo162182b(int i) {
        int i2;
        int i3;
        SelectableTextHelper selectableTextHelper;
        SelectableTextHelper selectableTextHelper2;
        C47167b b;
        SelectableTextHelper selectableTextHelper3;
        C47167b b2;
        RecyclerView.ViewHolder e = mo162190e(i);
        if (e instanceof MMParagraphViewHolder) {
            Pair<Integer, ? extends SelectableTextHelper> pair = this.f116292h;
            if (pair == null || (selectableTextHelper3 = (SelectableTextHelper) pair.getSecond()) == null || (b2 = selectableTextHelper3.mo165814b()) == null) {
                i2 = -1;
            } else {
                i2 = b2.f118944a;
            }
            Pair<Integer, ? extends SelectableTextHelper> pair2 = this.f116292h;
            if (pair2 == null || (selectableTextHelper2 = (SelectableTextHelper) pair2.getSecond()) == null || (b = selectableTextHelper2.mo165814b()) == null) {
                i3 = -1;
            } else {
                i3 = b.f118945b;
            }
            if (i2 != -1 && i3 != -1 && (selectableTextHelper = ((MMParagraphViewHolder) e).mo162198a().getSelectableTextHelper()) != null) {
                selectableTextHelper.mo165815b(i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo162163a(int i) {
        this.f116295k.mo162221b().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        notifyItemChanged(i, PayloadType.ONLY_CONTENT);
    }

    /* renamed from: b */
    private final Rect m182738b(int i, int i2) {
        RecyclerView.ViewHolder e = mo162190e(i);
        if (e == null) {
            mo162174a("scrollWhenTouchBottomEdge", i + " viewHolder is null, highlightOffsetInPara:" + i2);
        }
        if (!(e instanceof MMParagraphViewHolder)) {
            return null;
        }
        MMParagraphViewHolder bVar = (MMParagraphViewHolder) e;
        bVar.mo162198a().getLocationOnScreen(this.f116301q);
        return mo162160a(bVar.mo162198a(), i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MmComment.MmCommentInfo mmCommentInfo;
        Map<String, MmComment.MmCommentInfo> comments;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        if (viewHolder instanceof KeywordViewHolder) {
            ((KeywordViewHolder) viewHolder).mo162196a(this.f116297m);
        } else if (viewHolder instanceof MMParagraphViewHolder) {
            MmMeetingParagraph mmMeetingParagraph = this.f116287c.get(mo162187d(i));
            MMParagraphViewHolder bVar = (MMParagraphViewHolder) viewHolder;
            bVar.mo162202a(mmMeetingParagraph, this.f116288d);
            MmComment mmComment = this.f116298n;
            if (mmComment == null || (comments = mmComment.getComments()) == null) {
                mmCommentInfo = null;
            } else {
                mmCommentInfo = comments.get(mmMeetingParagraph.getPid());
            }
            bVar.mo162200a(mmCommentInfo);
            bVar.mo162203a(this.f116310z);
        }
        if (m182742g(i)) {
            ((KeywordViewHolder) viewHolder).mo162196a(this.f116297m);
        } else {
            ((MMParagraphViewHolder) viewHolder).mo162202a(this.f116287c.get(mo162187d(i)), this.f116288d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == ViewType.KEYWORD.ordinal()) {
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            MmBubbleTagLayout mmBubbleTagLayout = new MmBubbleTagLayout(context);
            this.f116284A = mmBubbleTagLayout;
            return new KeywordViewHolder(this, mmBubbleTagLayout, viewGroup.getMeasuredWidth());
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mm_item_content, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
        return new MMParagraphViewHolder(this, inflate);
    }

    public MmSubtitlesAdapter(MmTransAdapterDepend dVar, MmTransAdapterCallback cVar) {
        C68296b<Boolean> dismissSubject;
        Disposable subscribe;
        Intrinsics.checkParameterIsNotNull(dVar, "depend");
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        this.f116295k = dVar;
        this.f116296l = cVar;
        RecyclerView.LayoutManager layoutManager = dVar.mo162221b().getLayoutManager();
        if (layoutManager != null) {
            this.f116286b = (LinearLayoutManager) layoutManager;
            this.f116297m = new ArrayList();
            this.f116287c = new ArrayList();
            this.f116299o = new ArrayList();
            this.f116300p = new ParagraphHighlightInfoViewModel(new ConcurrentHashMap());
            this.f116301q = new int[2];
            this.f116302r = new ArrayList();
            this.f116303s = new ArrayList();
            this.f116289e = ScrollMode.AutoFlipPage;
            this.f116291g = -1;
            this.f116305u = LazyKt.lazy(C46161e.INSTANCE);
            this.f116308x = DeviceUtils.getRealScreenHeight(dVar.mo162220a());
            this.f116309y = MmTranslateLangType.DEFAULT;
            mo162185c().mo165434a(dVar.mo162220a());
            C47083e.m186423a(dVar.mo162220a(), "vc_minutes_detail_click", C47086i.m186432a().mo165422d("subtitle").mo165423e("none").mo165421c());
            dVar.mo162221b().addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.C461421 */

                /* renamed from: a */
                final /* synthetic */ MmSubtitlesAdapter f116311a;

                {
                    this.f116311a = r1;
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                    super.onScrollStateChanged(recyclerView, i);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
                    super.onScrolled(recyclerView, i, i2);
                    if (!this.f116311a.mo162189d()) {
                        MmSubtitlesAdapter mmSubtitlesAdapter = this.f116311a;
                        mmSubtitlesAdapter.mo162164a(mmSubtitlesAdapter.f116290f, this.f116311a.f116291g);
                    }
                }
            });
            SelectableOverlay a = SelectableOverlay.f118884a.mo165806a(dVar.mo162220a());
            if (a != null && (dismissSubject = a.getDismissSubject()) != null && (subscribe = dismissSubject.subscribe(new Consumer<Boolean>(this) {
                /* class com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter.C461432 */

                /* renamed from: a */
                final /* synthetic */ MmSubtitlesAdapter f116312a;

                {
                    this.f116312a = r1;
                }

                /* renamed from: a */
                public final void accept(Boolean bool) {
                    MmSubtitlesAdapter.m182737a(this.f116312a, false, 1, null);
                }
            })) != null) {
                C47108b.m186566a(subscribe, dVar.mo162220a());
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* renamed from: b */
    private final void m182740b(String str, String str2) {
        String str3 = this.f116285a;
        C45855f.m181664c(str3, "token:" + C45950b.m182104a(this.f116295k.mo162220a()).bc_() + ",[" + str + "]," + str2);
    }

    /* renamed from: a */
    public final Rect mo162160a(TextView textView, int i) {
        Layout layout = textView.getLayout();
        if (layout == null) {
            return new Rect(0, 0, 0, 0);
        }
        Rect rect = new Rect();
        layout.getLineBounds(layout.getLineForOffset(i), rect);
        return rect;
    }

    /* renamed from: a */
    public final void mo162164a(int i, int i2) {
        Rect b = m182738b(i, i2);
        if (b != null) {
            boolean z = true;
            if (this.f116308x - this.f116295k.mo162222c() > b.bottom + this.f116301q[1] + UIUtils.dp2px(this.f116295k.mo162220a(), 80.0f)) {
                z = false;
            }
            if (z) {
                int i3 = -(b.top + UIUtils.dp2px(this.f116295k.mo162220a(), 44.0f));
                String str = this.f116285a;
                C45855f.m181663b(str, "[scrollWhenTouchBottomEdge] offset: " + i3);
                this.f116286b.scrollToPositionWithOffset(i, i3);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        Intrinsics.checkParameterIsNotNull(list, "payloads");
        super.onBindViewHolder(viewHolder, i, list);
        if (m182742g(i)) {
            ((KeywordViewHolder) viewHolder).mo162196a(this.f116297m);
        } else if (list.isEmpty()) {
            ((MMParagraphViewHolder) viewHolder).mo162201a(this.f116287c.get(mo162187d(i)));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m182737a(MmSubtitlesAdapter mmSubtitlesAdapter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        mmSubtitlesAdapter.mo162188d(z);
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$c */
    public interface MmTransAdapterCallback {
        /* renamed from: a */
        void mo162214a(int i);

        /* renamed from: a */
        void mo162215a(int i, int i2);

        /* renamed from: a */
        void mo162216a(int i, int i2, String str, MmMeetingParagraph mmMeetingParagraph, int i3);

        /* renamed from: a */
        void mo162217a(int i, String str, String str2);

        /* renamed from: a */
        void mo162218a(long j);

        /* renamed from: a */
        void mo162219a(String str);

        /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.MmSubtitlesAdapter$c$a */
        public static final class C46160a {
            /* renamed from: a */
            public static /* synthetic */ void m182802a(MmTransAdapterCallback cVar, int i, int i2, int i3, Object obj) {
                if (obj == null) {
                    if ((i3 & 2) != 0) {
                        i2 = 0;
                    }
                    cVar.mo162215a(i, i2);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onViewParaComments");
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m182734a(MmSubtitlesAdapter mmSubtitlesAdapter, MmComment mmComment, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        mmSubtitlesAdapter.mo162168a(mmComment, list, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m182735a(MmSubtitlesAdapter mmSubtitlesAdapter, MmMeetingParagraph mmMeetingParagraph, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        mmSubtitlesAdapter.mo162171a(mmMeetingParagraph, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ void m182736a(MmSubtitlesAdapter mmSubtitlesAdapter, IntRange kVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        mmSubtitlesAdapter.mo162179a(kVar, i, z);
    }
}
