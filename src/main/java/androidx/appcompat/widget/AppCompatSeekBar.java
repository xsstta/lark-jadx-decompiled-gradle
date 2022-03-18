package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.larksuite.suite.R;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    private final C0450j f1333a;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1333a.mo2609c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1333a.mo2608b();
    }

    public AppCompatSeekBar(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1333a.mo2606a(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0422aa.m1768a(this, getContext());
        C0450j jVar = new C0450j(this);
        this.f1333a = jVar;
        jVar.mo2605a(attributeSet, i);
    }
}
