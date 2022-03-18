package com.ss.android.lark.mm.module.minifloatwindow.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.statistics.hitpoint.MiniAudioRecordClickEvent;
import com.ss.android.lark.mm.utils.MmTimeUtils;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J9\u0010\u0016\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/mm/module/minifloatwindow/view/MiniAudioRecord;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/mm/module/minifloatwindow/view/IMiniView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isRecording", "", "init", "", "onDuration", "duration", "", "onPause", "isEnabled", "onResume", "setOnClickAction", "trackContextGetter", "Lkotlin/Function0;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "onAction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "updateView", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MiniAudioRecord extends LinearLayout implements IMiniView {

    /* renamed from: a */
    public boolean f117133a;

    /* renamed from: b */
    private HashMap f117134b;

    /* renamed from: a */
    public View mo163457a(int i) {
        if (this.f117134b == null) {
            this.f117134b = new HashMap();
        }
        View view = (View) this.f117134b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117134b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163376a() {
        IMiniView.C46541a.m184085b(this);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: z */
    public void mo163381z() {
        IMiniView.C46541a.m184079a(this);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: A */
    public void mo163375A() {
        this.f117133a = true;
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo163457a(R.id.ivResumePause);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivResumePause");
        appCompatImageView.setEnabled(true);
        mo163460b();
    }

    /* renamed from: c */
    private final void m184053c() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_mini_audio_record, this);
        setGravity(16);
        TextView textView = (TextView) mo163457a(R.id.tvDuration);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvDuration");
        textView.setText("00:00:00");
    }

    /* renamed from: b */
    public final void mo163460b() {
        if (!this.f117133a) {
            ((AppCompatImageView) mo163457a(R.id.ivResumePause)).setImageDrawable(C57582a.m223614c(getContext(), R.drawable.mm_ic_record_float_resume));
        } else {
            ((AppCompatImageView) mo163457a(R.id.ivResumePause)).setImageDrawable(C57582a.m223614c(getContext(), R.drawable.mm_ic_record_float_pause));
        }
        if (this.f117133a) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo163457a(R.id.ivWavePause);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivWavePause");
            appCompatImageView.setVisibility(8);
            LKUILottieAnimationView lKUILottieAnimationView = (LKUILottieAnimationView) mo163457a(R.id.ivWaveLottie);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView, "ivWaveLottie");
            lKUILottieAnimationView.setVisibility(0);
            ((LKUILottieAnimationView) mo163457a(R.id.ivWaveLottie)).setAnimation("mm_record_float_wave.json");
            LKUILottieAnimationView lKUILottieAnimationView2 = (LKUILottieAnimationView) mo163457a(R.id.ivWaveLottie);
            Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView2, "ivWaveLottie");
            lKUILottieAnimationView2.setRepeatCount(-1);
            ((LKUILottieAnimationView) mo163457a(R.id.ivWaveLottie)).playAnimation();
            return;
        }
        ((LKUILottieAnimationView) mo163457a(R.id.ivWaveLottie)).pauseAnimation();
        LKUILottieAnimationView lKUILottieAnimationView3 = (LKUILottieAnimationView) mo163457a(R.id.ivWaveLottie);
        Intrinsics.checkExpressionValueIsNotNull(lKUILottieAnimationView3, "ivWaveLottie");
        lKUILottieAnimationView3.setVisibility(8);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo163457a(R.id.ivWavePause);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "ivWavePause");
        appCompatImageView2.setVisibility(0);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniAudioRecord(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163377a(long j) {
        TextView textView = (TextView) mo163457a(R.id.tvDuration);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvDuration");
        textView.setText(MmTimeUtils.m186495a(Long.valueOf(j)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.minifloatwindow.view.MiniAudioRecord$a */
    static final class View$OnClickListenerC46539a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MiniAudioRecord f117135a;

        /* renamed from: b */
        final /* synthetic */ Function1 f117136b;

        /* renamed from: c */
        final /* synthetic */ Function0 f117137c;

        View$OnClickListenerC46539a(MiniAudioRecord miniAudioRecord, Function1 function1, Function0 function0) {
            this.f117135a = miniAudioRecord;
            this.f117136b = function1;
            this.f117137c = function0;
        }

        public final void onClick(View view) {
            String str;
            this.f117136b.invoke(Boolean.valueOf(this.f117135a.f117133a));
            String str2 = "pause_recording";
            if (this.f117135a.f117133a) {
                str = str2;
            } else {
                str = "continue_recording";
            }
            new MiniAudioRecordClickEvent(str, null, 2, null).mo165435a((C47084f) this.f117137c.invoke()).mo165437a();
            C47084f fVar = (C47084f) this.f117137c.invoke();
            C47086i a = C47086i.m186432a();
            if (!this.f117135a.f117133a) {
                str2 = "continue_recording";
            }
            C47083e.m186425a(fVar, "vc_minutes_recording_mini_click", a.mo165422d(str2).mo165423e("vc_minutes_recording_mini_view").mo165421c());
            this.f117135a.mo163460b();
        }
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163380a(boolean z) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo163457a(R.id.ivResumePause);
        Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "ivResumePause");
        appCompatImageView.setEnabled(z);
        this.f117133a = false;
        mo163460b();
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163378a(long j, long j2) {
        IMiniView.C46541a.m184081a(this, j, j2);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.control.IMiniListener
    /* renamed from: a */
    public void mo163379a(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        IMiniView.C46541a.m184082a(this, str, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniAudioRecord(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView
    /* renamed from: a */
    public void mo163458a(Function0<? extends C47084f> function0, Function0<Unit> function02) {
        Intrinsics.checkParameterIsNotNull(function0, "trackContextGetter");
        Intrinsics.checkParameterIsNotNull(function02, "onDismiss");
        IMiniView.C46541a.m184083a(this, function0, function02);
    }

    @Override // com.ss.android.lark.mm.module.minifloatwindow.view.IMiniView
    /* renamed from: a */
    public void mo163459a(Function0<? extends C47084f> function0, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function0, "trackContextGetter");
        Intrinsics.checkParameterIsNotNull(function1, "onAction");
        ((AppCompatImageView) mo163457a(R.id.ivResumePause)).setOnClickListener(new View$OnClickListenerC46539a(this, function1, function0));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniAudioRecord(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f117133a = true;
        m184053c();
    }
}
