package com.bytedance.ee.bear.drive.view.preview.image.progressloader.p372d;

import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bytedance.ee.bear.drive.view.preview.image.progressloader.p371c.AbstractC7324b;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.e */
public class C7331e {

    /* renamed from: a */
    private final View f19617a;

    /* renamed from: b */
    private final List<AbstractC7324b> f19618b = new ArrayList();

    /* renamed from: c */
    private ViewTreeObserver$OnPreDrawListenerC7332a f19619c;

    /* renamed from: d */
    private Point f19620d;

    /* renamed from: a */
    private boolean m29286a(int i) {
        return i > 0 || i == -2;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.d.e$a */
    public static class ViewTreeObserver$OnPreDrawListenerC7332a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        private final WeakReference<C7331e> f19621a;

        public boolean onPreDraw() {
            C13479a.m54764b("SizeDeterminer", "OnGlobalLayoutListener called listener=" + this);
            C7331e eVar = this.f19621a.get();
            if (eVar == null) {
                return true;
            }
            eVar.mo28582a();
            return true;
        }

        public ViewTreeObserver$OnPreDrawListenerC7332a(C7331e eVar) {
            this.f19621a = new WeakReference<>(eVar);
        }
    }

    /* renamed from: b */
    private int m29287b() {
        ViewGroup.LayoutParams layoutParams = this.f19617a.getLayoutParams();
        if (m29286a(this.f19617a.getHeight())) {
            return this.f19617a.getHeight();
        }
        if (layoutParams != null) {
            return m29284a(layoutParams.height, true);
        }
        return 0;
    }

    /* renamed from: c */
    private int m29288c() {
        ViewGroup.LayoutParams layoutParams = this.f19617a.getLayoutParams();
        if (m29286a(this.f19617a.getWidth())) {
            return this.f19617a.getWidth();
        }
        if (layoutParams != null) {
            return m29284a(layoutParams.width, false);
        }
        return 0;
    }

    /* renamed from: d */
    private Point m29289d() {
        Point point = this.f19620d;
        if (point != null) {
            return point;
        }
        Display defaultDisplay = ((WindowManager) this.f19617a.getContext().getSystemService("window")).getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 13) {
            Point point2 = new Point();
            this.f19620d = point2;
            defaultDisplay.getSize(point2);
        } else {
            this.f19620d = new Point(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        return this.f19620d;
    }

    /* renamed from: a */
    public void mo28582a() {
        if (!this.f19618b.isEmpty()) {
            int c = m29288c();
            int b = m29287b();
            if (m29286a(c) && m29286a(b)) {
                m29285a(c, b);
                ViewTreeObserver viewTreeObserver = this.f19617a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f19619c);
                }
                this.f19619c = null;
            }
        }
    }

    public C7331e(View view) {
        this.f19617a = view;
    }

    /* renamed from: a */
    public void mo28583a(AbstractC7324b bVar) {
        int c = m29288c();
        int b = m29287b();
        if (!m29286a(c) || !m29286a(b)) {
            if (!this.f19618b.contains(bVar)) {
                this.f19618b.add(bVar);
            }
            if (this.f19619c == null) {
                ViewTreeObserver viewTreeObserver = this.f19617a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC7332a aVar = new ViewTreeObserver$OnPreDrawListenerC7332a(this);
                this.f19619c = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
                return;
            }
            return;
        }
        bVar.mo28480a(c, b);
    }

    /* renamed from: a */
    private int m29284a(int i, boolean z) {
        if (i != -2) {
            return i;
        }
        Point d = m29289d();
        if (z) {
            return d.y;
        }
        return d.x;
    }

    /* renamed from: a */
    private void m29285a(int i, int i2) {
        for (AbstractC7324b bVar : this.f19618b) {
            bVar.mo28480a(i, i2);
        }
        this.f19618b.clear();
    }
}
