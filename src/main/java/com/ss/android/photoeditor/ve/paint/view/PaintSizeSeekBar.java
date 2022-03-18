package com.ss.android.photoeditor.ve.paint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0006\u0010\u001a\u001a\u00020\tJ\b\u0010\u001b\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u0012R\u000e\u0010\u000b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/view/PaintSizeSeekBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "initProcess", "layoutId", "progressDesc", "Landroid/widget/TextView;", "seekBar", "Landroidx/appcompat/widget/AppCompatSeekBar;", "seekBarChangeListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "view", "Landroid/view/View;", "changeProgressDescLocation", "", "progress", "fromUser", "", "getCurrentProgress", "initListener", "initView", "setInitProgress", "setOnSeekBarChangeListener", "listener", "Companion", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PaintSizeSeekBar extends LinearLayout {

    /* renamed from: c */
    public static final Companion f149312c = new Companion(null);

    /* renamed from: a */
    public SeekBar.OnSeekBarChangeListener f149313a;

    /* renamed from: b */
    public int f149314b = 50;

    /* renamed from: d */
    private final int f149315d = R.layout.view_paint_size_seek_bar;

    /* renamed from: e */
    private View f149316e;

    /* renamed from: f */
    private TextView f149317f;

    /* renamed from: g */
    private AppCompatSeekBar f149318g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/photoeditor/ve/paint/view/PaintSizeSeekBar$Companion;", "", "()V", "HALF_THUMB_WIDTH", "", "SEEK_BAR_INIT_PROGRESS", "", "THUMB_WIDTH", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.view.PaintSizeSeekBar$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m232568a() {
        AppCompatSeekBar appCompatSeekBar = this.f149318g;
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setOnSeekBarChangeListener(new C59924b(this));
        }
    }

    public final int getCurrentProgress() {
        AppCompatSeekBar appCompatSeekBar = this.f149318g;
        if (appCompatSeekBar != null) {
            return appCompatSeekBar.getProgress();
        }
        return 0;
    }

    /* renamed from: b */
    private final void m232569b() {
        this.f149317f = (TextView) this.f149316e.findViewById(R.id.tv_seek_bar_progress_desc);
        this.f149318g = (AppCompatSeekBar) this.f149316e.findViewById(R.id.seek_bar_paint_size);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"com/ss/android/photoeditor/ve/paint/view/PaintSizeSeekBar$initListener$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.paint.view.PaintSizeSeekBar$b */
    public static final class C59924b implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ PaintSizeSeekBar f149319a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59924b(PaintSizeSeekBar paintSizeSeekBar) {
            this.f149319a = paintSizeSeekBar;
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f149319a.f149313a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            this.f149319a.invalidate();
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f149319a.f149313a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(seekBar);
            }
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics.checkParameterIsNotNull(seekBar, "seekBar");
            String valueOf = String.valueOf(i - this.f149319a.f149314b);
            if (i - this.f149319a.f149314b > 0) {
                valueOf = '+' + valueOf;
            }
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f149319a.f149313a;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(seekBar, Integer.parseInt(valueOf), z);
            }
        }
    }

    public final void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        Intrinsics.checkParameterIsNotNull(onSeekBarChangeListener, "listener");
        this.f149313a = onSeekBarChangeListener;
    }

    public final void setInitProgress(int i) {
        this.f149314b = i;
        AppCompatSeekBar appCompatSeekBar = this.f149318g;
        if (appCompatSeekBar != null) {
            appCompatSeekBar.setProgress(i);
        }
    }

    public PaintSizeSeekBar(Context context) {
        super(context);
        View inflate = View.inflate(getContext(), R.layout.view_paint_size_seek_bar, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149316e = inflate;
        m232569b();
        m232568a();
    }

    public PaintSizeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = View.inflate(getContext(), R.layout.view_paint_size_seek_bar, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149316e = inflate;
        m232569b();
        m232568a();
    }

    public PaintSizeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = View.inflate(getContext(), R.layout.view_paint_size_seek_bar, this);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "View.inflate(context, layoutId, this)");
        this.f149316e = inflate;
        m232569b();
        m232568a();
    }
}
