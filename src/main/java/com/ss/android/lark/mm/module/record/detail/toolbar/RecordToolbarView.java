package com.ss.android.lark.mm.module.record.detail.toolbar;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.C26171w;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import com.ss.android.lark.mm.module.record.audiorecorder.MmAudioRecordService;
import com.ss.android.lark.mm.module.record.detail.menu.LanguagePopup;
import com.ss.android.lark.mm.module.record.model.Language;
import com.ss.android.lark.mm.module.record.model.WaveData;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.RecordingPageClickEvent;
import com.ss.android.lark.mm.utils.MmTimeUtils;
import com.ss.android.lark.mm.utils.ResString;
import com.ss.android.lark.mm.widget.BoldTextView;
import com.ss.android.lark.mm.widget.InterceptableRelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00013B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\u0016\u0010\u0019\u001a\u00020\u001a2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cJ\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u001aH\u0003J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\tJ7\u0010'\u001a\u00020\u001a2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\u001a0+J\u0014\u0010/\u001a\u00020\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001a0)J\u000e\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001dR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/RecordToolbarView;", "Lcom/ss/android/lark/mm/widget/InterceptableRelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "isScrolling", "", "state", "Lcom/ss/android/lark/mm/module/record/MmRecordManager$RecordState;", "trackContext", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "getTrackContext", "()Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "setTrackContext", "(Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;)V", "waveAdapter", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/RecordToolbarView$WaveAdapter;", "bindRecordingLanguageList", "", "recordingLanguageList", "", "Lcom/ss/android/lark/mm/module/record/model/Language;", "init", "initControl", "initWaveList", "onDuration", "duration", "", "onRecordingStateChange", "onVolumeChange", "volume", "setOnLanguageSelectListener", "currentRecordingLanguageGetter", "Lkotlin/Function0;", "onSelectLanguage", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "lan", "setOnMoreActionListener", "onMoreAction", "setRecordingLanguage", "recordingLanguage", "WaveAdapter", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class RecordToolbarView extends InterceptableRelativeLayout {

    /* renamed from: a */
    public MmRecordManager.RecordState f118131a;

    /* renamed from: b */
    public WaveAdapter f118132b;

    /* renamed from: c */
    public C47084f f118133c;

    /* renamed from: d */
    public boolean f118134d;

    /* renamed from: e */
    private HashMap f118135e;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$d */
    public static final class View$OnTouchListenerC46925d implements View.OnTouchListener {

        /* renamed from: a */
        public static final View$OnTouchListenerC46925d f118141a = new View$OnTouchListenerC46925d();

        View$OnTouchListenerC46925d() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    @Override // com.ss.android.lark.mm.widget.InterceptableRelativeLayout
    /* renamed from: b */
    public View mo164769b(int i) {
        if (this.f118135e == null) {
            this.f118135e = new HashMap();
        }
        View view = (View) this.f118135e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f118135e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\b\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0006\u0010\u0014\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/RecordToolbarView$WaveAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "items", "", "Lcom/ss/android/lark/mm/module/record/model/WaveData;", "pausePos", "", "addData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "pause", "WaveViewHolder", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$a */
    public static final class WaveAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        /* renamed from: a */
        private final List<WaveData> f118136a = new ArrayList();

        /* renamed from: b */
        private int f118137b = -1;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f118136a.size();
        }

        /* renamed from: a */
        public final void mo164774a() {
            this.f118137b = this.f118136a.size() - 1;
            notifyDataSetChanged();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/toolbar/RecordToolbarView$WaveAdapter$WaveViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lcom/ss/android/lark/mm/module/record/detail/toolbar/WaveView;", "(Lcom/ss/android/lark/mm/module/record/detail/toolbar/WaveView;)V", "waveView", "bindData", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/record/model/WaveData;", "isEnabled", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$a$a */
        public static final class WaveViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a */
            private WaveView f118138a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public WaveViewHolder(WaveView waveView) {
                super(waveView);
                Intrinsics.checkParameterIsNotNull(waveView, "view");
                this.f118138a = waveView;
            }

            /* renamed from: a */
            public final void mo164776a(WaveData waveData, boolean z) {
                Intrinsics.checkParameterIsNotNull(waveData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                this.f118138a.mo164787a(waveData);
                this.f118138a.setEnabled(z);
            }
        }

        /* renamed from: a */
        public final void mo164775a(WaveData waveData) {
            Intrinsics.checkParameterIsNotNull(waveData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f118136a.add(waveData);
            notifyItemInserted(this.f118136a.size() - 1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
            if (viewHolder instanceof WaveViewHolder) {
                WaveViewHolder aVar = (WaveViewHolder) viewHolder;
                WaveData waveData = this.f118136a.get(i);
                if (i > this.f118137b) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo164776a(waveData, z);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            return new WaveViewHolder(new WaveView(context));
        }
    }

    public final C47084f getTrackContext() {
        C47084f fVar = this.f118133c;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackContext");
        }
        return fVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$e */
    static final class RunnableC46926e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarView f118142a;

        /* renamed from: b */
        final /* synthetic */ long f118143b;

        RunnableC46926e(RecordToolbarView recordToolbarView, long j) {
            this.f118142a = recordToolbarView;
            this.f118143b = j;
        }

        public final void run() {
            BoldTextView boldTextView = (BoldTextView) this.f118142a.mo164769b(R.id.tvDuration);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "tvDuration");
            boldTextView.setText(MmTimeUtils.m186495a(Long.valueOf(this.f118143b)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$g */
    static final class RunnableC46928g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarView f118146a;

        /* renamed from: b */
        final /* synthetic */ int f118147b;

        RunnableC46928g(RecordToolbarView recordToolbarView, int i) {
            this.f118146a = recordToolbarView;
            this.f118147b = i;
        }

        public final void run() {
            RecordToolbarView.m185851a(this.f118146a).mo164775a(new WaveData((short) this.f118147b));
            if (!this.f118146a.f118134d) {
                ((RecyclerView) this.f118146a.mo164769b(R.id.rvWave)).smoothScrollToPosition(RecordToolbarView.m185851a(this.f118146a).getItemCount() - 1);
            }
        }
    }

    /* renamed from: a */
    private final void m185852a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_record_toolbar, (ViewGroup) this, true);
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        ((BoldTextView) mo164769b(R.id.tvDuration)).setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/DINAlternateBold.ttf"), 1);
        m185854c();
        m185853b();
    }

    /* renamed from: b */
    private final void m185853b() {
        InterceptableRelativeLayout interceptableRelativeLayout = (InterceptableRelativeLayout) mo164769b(R.id.rootDialog);
        Intrinsics.checkExpressionValueIsNotNull(interceptableRelativeLayout, "rootDialog");
        ((LanguagePopup) mo164769b(R.id.languagePopup)).mo164705a(interceptableRelativeLayout);
        ((BoldTextView) mo164769b(R.id.ivResumePause)).setOnClickListener(new View$OnClickListenerC46923b(this));
        ((AppCompatImageView) mo164769b(R.id.ivStop)).setOnClickListener(new View$OnClickListenerC46924c(this));
    }

    /* renamed from: c */
    private final void m185854c() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView = (RecyclerView) mo164769b(R.id.rvWave);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rvWave");
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f118132b = new WaveAdapter();
        RecyclerView recyclerView2 = (RecyclerView) mo164769b(R.id.rvWave);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rvWave");
        WaveAdapter aVar = this.f118132b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waveAdapter");
        }
        recyclerView2.setAdapter(aVar);
        RecyclerView recyclerView3 = (RecyclerView) mo164769b(R.id.rvWave);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rvWave");
        recyclerView3.setItemAnimator(null);
        ((RecyclerView) mo164769b(R.id.rvWave)).setOnTouchListener(View$OnTouchListenerC46925d.f118141a);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$f */
    static final class RunnableC46927f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarView f118144a;

        /* renamed from: b */
        final /* synthetic */ MmRecordManager.RecordState f118145b;

        RunnableC46927f(RecordToolbarView recordToolbarView, MmRecordManager.RecordState recordState) {
            this.f118144a = recordToolbarView;
            this.f118145b = recordState;
        }

        public final void run() {
            BoldTextView boldTextView = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "ivResumePause");
            if (boldTextView.getVisibility() != 0) {
                BoldTextView boldTextView2 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView2, "ivResumePause");
                boldTextView2.setVisibility(0);
            }
            this.f118144a.f118131a = this.f118145b;
            int i = C46955h.f118184a[this.f118145b.ordinal()];
            if (i == 1) {
                BoldTextView boldTextView3 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView3, "ivResumePause");
                boldTextView3.setEnabled(true);
                BoldTextView boldTextView4 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView4, "ivResumePause");
                boldTextView4.setText("");
                ((BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause)).setBackgroundResource(R.drawable.mm_btn_record_status_pause);
            } else if (i == 2) {
                BoldTextView boldTextView5 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView5, "ivResumePause");
                boldTextView5.setEnabled(true);
                ((BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause)).setBackgroundResource(R.drawable.mm_btn_record_status_resume);
                BoldTextView boldTextView6 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView6, "ivResumePause");
                boldTextView6.setText(ResString.f118656a.mo165504a(R.string.MMWeb_G_Resume));
                RecordToolbarView.m185851a(this.f118144a).mo164774a();
            } else if (i == 3) {
                BoldTextView boldTextView7 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView7, "ivResumePause");
                boldTextView7.setEnabled(false);
                ((BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause)).setBackgroundResource(R.drawable.mm_btn_record_status_resume);
                BoldTextView boldTextView8 = (BoldTextView) this.f118144a.mo164769b(R.id.ivResumePause);
                Intrinsics.checkExpressionValueIsNotNull(boldTextView8, "ivResumePause");
                boldTextView8.setText(ResString.f118656a.mo165504a(R.string.MMWeb_G_Resume));
                RecordToolbarView.m185851a(this.f118144a).mo164774a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$i */
    static final class View$OnClickListenerC46931i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Function0 f118151a;

        View$OnClickListenerC46931i(Function0 function0) {
            this.f118151a = function0;
        }

        public final void onClick(View view) {
            this.f118151a.invoke();
        }
    }

    public final void setTrackContext(C47084f fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "<set-?>");
        this.f118133c = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RecordToolbarView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ WaveAdapter m185851a(RecordToolbarView recordToolbarView) {
        WaveAdapter aVar = recordToolbarView.f118132b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waveAdapter");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo164764a(int i) {
        C26171w.m94675a(new RunnableC46928g(this, i));
    }

    public final void setOnMoreActionListener(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onMoreAction");
        ((FrameLayout) mo164769b(R.id.ivMore)).setOnClickListener(new View$OnClickListenerC46931i(function0));
    }

    public final void setRecordingLanguage(Language language) {
        Intrinsics.checkParameterIsNotNull(language, "recordingLanguage");
        TextView textView = (TextView) mo164769b(R.id.tvLanguage);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvLanguage");
        textView.setText(language.getLanguageName());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$c */
    public static final class View$OnClickListenerC46924c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarView f118140a;

        View$OnClickListenerC46924c(RecordToolbarView recordToolbarView) {
            this.f118140a = recordToolbarView;
        }

        public final void onClick(View view) {
            new RecordingPageClickEvent("stop_recording", null, null, null, 14, null).mo165435a(this.f118140a.getTrackContext()).mo165437a();
            C45858j.m181677a((int) R.string.MMWeb_G_RecordingSaved);
            C47083e.m186425a(this.f118140a.getTrackContext(), "vc_minutes_recording_click", C47086i.m186432a().mo165422d("stop_recording").mo165423e("none").mo165421c());
            MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
            Context context = this.f118140a.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            aVar.mo164590c(context);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$h */
    public static final class View$OnClickListenerC46929h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarView f118148a;

        /* renamed from: b */
        final /* synthetic */ Function0 f118149b;

        /* renamed from: c */
        final /* synthetic */ Function1 f118150c;

        View$OnClickListenerC46929h(RecordToolbarView recordToolbarView, Function0 function0, Function1 function1) {
            this.f118148a = recordToolbarView;
            this.f118149b = function0;
            this.f118150c = function1;
        }

        public final void onClick(View view) {
            new RecordingPageClickEvent("recording_language_change", null, null, null, 14, null).mo165435a(this.f118148a.getTrackContext()).mo165437a();
            C47083e.m186425a(this.f118148a.getTrackContext(), "vc_minutes_recording_click", C47086i.m186432a().mo165422d("recording_language_change").mo165423e("none").mo165421c());
            ((LanguagePopup) this.f118148a.mo164769b(R.id.languagePopup)).mo164704a((Language) this.f118149b.invoke(), new Function1<Language, Unit>(this) {
                /* class com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView.View$OnClickListenerC46929h.C469301 */
                final /* synthetic */ View$OnClickListenerC46929h this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Language language) {
                    invoke(language);
                    return Unit.INSTANCE;
                }

                public final void invoke(Language language) {
                    Intrinsics.checkParameterIsNotNull(language, "lan");
                    new RecordingPageClickEvent("subtitle_language_change", null, ((Language) this.this$0.f118149b.invoke()).getLanguage(), language.getLanguage(), 2, null).mo165435a(this.this$0.f118148a.getTrackContext()).mo165437a();
                    this.this$0.f118150c.invoke(language);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo164765a(long j) {
        C26171w.m94675a(new RunnableC46926e(this, j));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.RecordToolbarView$b */
    public static final class View$OnClickListenerC46923b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecordToolbarView f118139a;

        View$OnClickListenerC46923b(RecordToolbarView recordToolbarView) {
            this.f118139a = recordToolbarView;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            if (this.f118139a.f118131a == MmRecordManager.RecordState.RECORDING) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                MmAudioRecordService.Companion aVar = MmAudioRecordService.f117956f;
                Context context = this.f118139a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                aVar.mo164589b(context);
            } else {
                MmAudioRecordService.Companion aVar2 = MmAudioRecordService.f117956f;
                Context context2 = this.f118139a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                aVar2.mo164587a(context2);
            }
            BoldTextView boldTextView = (BoldTextView) this.f118139a.mo164769b(R.id.ivResumePause);
            Intrinsics.checkExpressionValueIsNotNull(boldTextView, "ivResumePause");
            boldTextView.setEnabled(false);
            String str2 = "pause_recording";
            if (z) {
                str = str2;
            } else {
                str = "continue_recording";
            }
            new RecordingPageClickEvent(str, null, null, null, 14, null).mo165435a(this.f118139a.getTrackContext()).mo165437a();
            C47084f trackContext = this.f118139a.getTrackContext();
            C47086i a = C47086i.m186432a();
            if (!z) {
                str2 = "continue_recording";
            }
            C47083e.m186425a(trackContext, "vc_minutes_recording_click", a.mo165422d(str2).mo165423e("none").mo165421c());
        }
    }

    /* renamed from: a */
    public final void mo164766a(MmRecordManager.RecordState recordState) {
        Intrinsics.checkParameterIsNotNull(recordState, "state");
        C26171w.m94675a(new RunnableC46927f(this, recordState));
    }

    /* renamed from: a */
    public final void mo164767a(List<? extends Language> list) {
        ((LanguagePopup) mo164769b(R.id.languagePopup)).mo164706a(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RecordToolbarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo164768a(Function0<? extends Language> function0, Function1<? super Language, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "currentRecordingLanguageGetter");
        Intrinsics.checkParameterIsNotNull(function1, "onSelectLanguage");
        setRecordingLanguage((Language) function0.invoke());
        ((LinearLayout) mo164769b(R.id.btnLanguage)).setOnClickListener(new View$OnClickListenerC46929h(this, function0, function1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RecordToolbarView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecordToolbarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118131a = MmRecordManager.RecordState.RECORDING;
        m185852a();
    }
}
