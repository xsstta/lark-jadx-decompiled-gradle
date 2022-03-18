package com.lynx.tasm.behavior.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.ui.AbstractC26746a;

public class UIBody extends UIGroup<UIBodyView> {

    /* renamed from: a */
    private UIBodyView f66263a;

    public static class UIBodyView extends FrameLayout implements AbstractC26746a.AbstractC26747a {
        private AbstractC26746a mDrawChildHook;
        private boolean mHasMeaningfulLayout;
        private boolean mHasMeaningfulPaint;
        private long mMeaningfulPaintTiming;

        /* access modifiers changed from: package-private */
        public void notifyMeaningfulLayout() {
            this.mHasMeaningfulLayout = true;
        }

        public long getMeaningfulPaintTiming() {
            return this.mMeaningfulPaintTiming;
        }

        /* access modifiers changed from: package-private */
        public void clearMeaningfulFlag() {
            this.mHasMeaningfulLayout = false;
            this.mHasMeaningfulPaint = false;
            this.mMeaningfulPaintTiming = 0;
        }

        public UIBodyView(Context context) {
            super(context);
        }

        @Override // com.lynx.tasm.behavior.ui.AbstractC26746a.AbstractC26747a
        public void bindDrawChildHook(AbstractC26746a aVar) {
            this.mDrawChildHook = aVar;
        }

        public void setChildrenDrawingOrderEnabled(boolean z) {
            super.setChildrenDrawingOrderEnabled(z);
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            TraceEvent.m96443a("UIBodyView.dispatchDraw");
            AbstractC26746a aVar = this.mDrawChildHook;
            if (aVar != null) {
                aVar.mo95123a(canvas);
            }
            super.dispatchDraw(canvas);
            AbstractC26746a aVar2 = this.mDrawChildHook;
            if (aVar2 != null) {
                aVar2.mo95128b(canvas);
            }
            TraceEvent.m96444b("UIBodyView.dispatchDraw");
            if (this.mHasMeaningfulLayout && !this.mHasMeaningfulPaint) {
                this.mMeaningfulPaintTiming = System.currentTimeMillis();
                this.mHasMeaningfulPaint = true;
            }
        }

        public UIBodyView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public int getChildDrawingOrder(int i, int i2) {
            AbstractC26746a aVar = this.mDrawChildHook;
            if (aVar != null) {
                return aVar.mo95119a(i, i2);
            }
            return super.getChildDrawingOrder(i, i2);
        }

        /* access modifiers changed from: protected */
        public boolean drawChild(Canvas canvas, View view, long j) {
            Rect rect;
            boolean z;
            AbstractC26746a aVar = this.mDrawChildHook;
            if (aVar != null) {
                rect = aVar.mo95120a(canvas, view, j);
            } else {
                rect = null;
            }
            if (rect != null) {
                canvas.save();
                canvas.clipRect(rect);
                z = super.drawChild(canvas, view, j);
                canvas.restore();
            } else {
                z = super.drawChild(canvas, view, j);
            }
            AbstractC26746a aVar2 = this.mDrawChildHook;
            if (aVar2 != null) {
                aVar2.mo95129b(canvas, view, j);
            }
            return z;
        }
    }

    /* renamed from: d */
    public UIBodyView mo53300d() {
        return this.f66263a;
    }

    /* access modifiers changed from: protected */
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: h */
    public View mo53304h() {
        return this.f66263a;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    /* renamed from: a */
    public void mo53258a() {
        super.mo53258a();
        this.f66263a.notifyMeaningfulLayout();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /* renamed from: l */
    public void mo95109l() {
        super.mo95109l();
        this.f66263a.clearMeaningfulFlag();
    }

    /* renamed from: i */
    public void mo53305i() {
        for (LynxBaseUI lynxBaseUI : mo94921D()) {
            lynxBaseUI.ah();
        }
    }

    /* renamed from: k */
    public void mo53307k() {
        for (LynxBaseUI lynxBaseUI : mo94921D()) {
            lynxBaseUI.mo53306j();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public UIBodyView mo33942b(Context context) {
        return this.f66263a;
    }

    /* renamed from: a */
    public void mo95108a(UIBodyView uIBodyView) {
        this.f66263a = uIBodyView;
        mo95044z();
    }

    public UIBody(AbstractC26684l lVar, UIBodyView uIBodyView) {
        super(lVar);
        this.f66263a = uIBodyView;
        mo95044z();
    }
}
