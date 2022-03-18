package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.drawerlayout.widget.DrawerLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

public class ActionBarDrawerToggle implements DrawerLayout.AbstractC0974c {

    /* renamed from: a */
    boolean f477a;

    /* renamed from: b */
    private final AbstractC0219a f478b;

    /* renamed from: c */
    private DrawerArrowDrawable f479c;

    /* renamed from: d */
    private boolean f480d;

    /* renamed from: e */
    private final int f481e;

    /* renamed from: f */
    private final int f482f;

    public interface DelegateProvider {
        AbstractC0219a getDrawerToggleDelegate();
    }

    /* renamed from: androidx.appcompat.app.ActionBarDrawerToggle$a */
    public interface AbstractC0219a {
        /* renamed from: a */
        void mo725a(int i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
    /* renamed from: a */
    public void mo719a(int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo722b(int i) {
        this.f478b.mo725a(i);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
    /* renamed from: a */
    public void mo720a(View view) {
        m686a(1.0f);
        if (this.f477a) {
            mo722b(this.f482f);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
    /* renamed from: b */
    public void mo723b(View view) {
        m686a(BitmapDescriptorFactory.HUE_RED);
        if (this.f477a) {
            mo722b(this.f481e);
        }
    }

    /* renamed from: a */
    private void m686a(float f) {
        if (f == 1.0f) {
            this.f479c.mo1005a(true);
        } else if (f == BitmapDescriptorFactory.HUE_RED) {
            this.f479c.mo1005a(false);
        }
        this.f479c.setProgress(f);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.AbstractC0974c
    /* renamed from: a */
    public void mo721a(View view, float f) {
        if (this.f480d) {
            m686a(Math.min(1.0f, Math.max((float) BitmapDescriptorFactory.HUE_RED, f)));
        } else {
            m686a(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
