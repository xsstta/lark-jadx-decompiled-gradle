package com.ss.android.lark.mm.module.floatwindow.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J9\u0010\u0018\u001a\u00020\u000f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000f0\u001dH\u0016J\b\u0010 \u001a\u00020\u000fH\u0002R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/mm/module/floatwindow/view/MiniAudioRecord;", "Landroid/widget/LinearLayout;", "Lcom/ss/android/lark/mm/module/floatwindow/view/IMiniView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isRecording", "", "init", "", "onDuration", "duration", "", "onModeChange", "mode", "onPause", "isEnabled", "onResume", "setOnClickAction", "trackContextGetter", "Lkotlin/Function0;", "Lcom/ss/android/lark/mm/statistics/hitpoint/MmHitPointContext;", "onAction", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "updateView", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MiniAudioRecord extends LinearLayout implements IMiniView {

    /* renamed from: a */
    public boolean f116675a;

    /* renamed from: b */
    private HashMap f116676b;

    /* renamed from: a */
    public View mo162801a(int i) {
        if (this.f116676b == null) {
            this.f116676b = new HashMap();
        }
        View view = (View) this.f116676b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f116676b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m183415a() {
        LayoutInflater.from(getContext()).inflate(R.layout.mm_view_mini_audio_record, this);
        setGravity(16);
        TextView textView = (TextView) mo162801a(R.id.tvDuration);
        Intrinsics.checkExpressionValueIsNotNull(textView, "tvDuration");
        textView.setText("00:00:00");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniAudioRecord(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MiniAudioRecord(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MiniAudioRecord(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f116675a = true;
        m183415a();
    }
}
