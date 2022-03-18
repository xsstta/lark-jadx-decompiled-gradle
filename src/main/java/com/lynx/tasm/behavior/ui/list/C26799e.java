package com.lynx.tasm.behavior.ui.list;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.C26840a;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.ss.ttm.player.MediaPlayer;

/* renamed from: com.lynx.tasm.behavior.ui.list.e */
public class C26799e extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final C26800a f66487a;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public UIComponent mo95320b() {
        return this.f66487a.f66489b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95318a() {
        if (this.f66487a.f66489b != null) {
            this.f66487a.removeAllViews();
            this.f66487a.f66489b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.lynx.tasm.behavior.ui.list.e$a */
    public static class C26800a extends FrameLayout {

        /* renamed from: a */
        int f66488a;

        /* renamed from: b */
        public UIComponent f66489b;

        /* renamed from: c */
        public int f66490c;

        public C26800a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            int i3;
            int i4;
            if (this.f66488a == 0) {
                i4 = View.MeasureSpec.getSize(i);
                i3 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
            } else {
                UIComponent uIComponent = this.f66489b;
                if (uIComponent == null || uIComponent.mo94938U() <= 0) {
                    i4 = getMeasuredWidth();
                    i3 = getMeasuredHeight();
                } else {
                    this.f66489b.ah();
                    if (2 == this.f66488a) {
                        this.f66488a = 3;
                    }
                    i4 = this.f66489b.mo94937T() + this.f66489b.mo94941X() + this.f66489b.mo94943Z();
                    i3 = this.f66489b.mo94938U() + this.f66489b.mo94942Y() + this.f66489b.aa();
                }
            }
            setMeasuredDimension(i4, i3);
            if (UIList.f66420e) {
                LLog.m96425c("UIList2", String.format("WrapView %d (w %d, h %d), mLayoutStatus %d", Integer.valueOf(this.f66490c), Integer.valueOf(getMeasuredWidth()), Integer.valueOf(getMeasuredHeight()), Integer.valueOf(this.f66488a)));
            }
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            UIComponent uIComponent = this.f66489b;
            if (uIComponent != null) {
                uIComponent.mo94999e(0);
                this.f66489b.mo94997d(0);
                this.f66489b.mo53306j();
                int X = this.f66489b.mo94941X();
                int Y = this.f66489b.mo94942Y();
                ((C26840a) this.f66489b.av()).layout(X, Y, this.f66489b.mo94937T() + X, this.f66489b.mo94938U() + Y);
                if (this.f66489b.mo94930M() != 0) {
                    ((ViewGroup) getParent()).setClipChildren(false);
                }
                Rect H = ViewCompat.m4014H(this.f66489b.av());
                if (H != null) {
                    H.set(Math.min(H.left, i), Math.min(H.top, i2), Math.max(H.right, i3), Math.max(H.bottom, i4));
                    ViewCompat.m4038a(this, H);
                }
            }
        }
    }

    public C26799e(C26800a aVar) {
        super(aVar);
        this.f66487a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo95319a(UIComponent uIComponent) {
        this.f66487a.f66489b = uIComponent;
        this.f66487a.addView(uIComponent.av(), new FrameLayout.LayoutParams(-1, -2));
        this.f66487a.f66490c = getAdapterPosition();
    }
}
