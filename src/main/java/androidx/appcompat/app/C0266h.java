package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.Window$CallbackC0308h;
import androidx.appcompat.view.menu.AbstractC0337l;
import androidx.appcompat.view.menu.C0322f;
import androidx.appcompat.widget.AbstractC0459o;
import androidx.appcompat.widget.C0428ag;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.h */
public class C0266h extends ActionBar {

    /* renamed from: a */
    AbstractC0459o f721a;

    /* renamed from: b */
    boolean f722b;

    /* renamed from: c */
    Window.Callback f723c;

    /* renamed from: d */
    private boolean f724d;

    /* renamed from: e */
    private boolean f725e;

    /* renamed from: f */
    private ArrayList<ActionBar.AbstractC0217a> f726f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f727g = new Runnable() {
        /* class androidx.appcompat.app.C0266h.RunnableC02671 */

        public void run() {
            C0266h.this.mo969i();
        }
    };

    /* renamed from: h */
    private final Toolbar.AbstractC0418b f728h;

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public void mo703b(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: d */
    public void mo706d(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: e */
    public void mo708e(boolean z) {
    }

    /* renamed from: h */
    public Window.Callback mo968h() {
        return this.f723c;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public int mo692a() {
        return this.f721a.mo2528o();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public Context mo701b() {
        return this.f721a.mo2504b();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: c */
    public boolean mo705c() {
        return this.f721a.mo2524k();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: d */
    public boolean mo707d() {
        return this.f721a.mo2525l();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public void mo712g() {
        this.f721a.mo2493a().removeCallbacks(this.f727g);
    }

    /* renamed from: j */
    private Menu m972j() {
        if (!this.f724d) {
            this.f721a.mo2500a(new C0269a(), new C0270b());
            this.f724d = true;
        }
        return this.f721a.mo2530q();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: e */
    public boolean mo709e() {
        this.f721a.mo2493a().removeCallbacks(this.f727g);
        ViewCompat.m4046a(this.f721a.mo2493a(), this.f727g);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: f */
    public boolean mo711f() {
        if (!this.f721a.mo2512c()) {
            return false;
        }
        this.f721a.mo2513d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo969i() {
        C0322f fVar;
        Menu j = m972j();
        if (j instanceof C0322f) {
            fVar = (C0322f) j;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.mo1432h();
        }
        try {
            j.clear();
            if (!this.f723c.onCreatePanelMenu(0, j) || !this.f723c.onPreparePanel(0, null, j)) {
                j.clear();
            }
        } finally {
            if (fVar != null) {
                fVar.mo1434i();
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo696a(Configuration configuration) {
        super.mo696a(configuration);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$a */
    public final class C0269a implements AbstractC0337l.AbstractC0338a {

        /* renamed from: b */
        private boolean f732b;

        C0269a() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public boolean mo883a(C0322f fVar) {
            if (C0266h.this.f723c == null) {
                return false;
            }
            C0266h.this.f723c.onMenuOpened(108, fVar);
            return true;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0337l.AbstractC0338a
        /* renamed from: a */
        public void mo882a(C0322f fVar, boolean z) {
            if (!this.f732b) {
                this.f732b = true;
                C0266h.this.f721a.mo2527n();
                if (C0266h.this.f723c != null) {
                    C0266h.this.f723c.onPanelClosed(108, fVar);
                }
                this.f732b = false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$b */
    public final class C0270b implements C0322f.AbstractC0323a {
        @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
        /* renamed from: a */
        public boolean mo839a(C0322f fVar, MenuItem menuItem) {
            return false;
        }

        C0270b() {
        }

        @Override // androidx.appcompat.view.menu.C0322f.AbstractC0323a
        /* renamed from: a */
        public void mo836a(C0322f fVar) {
            if (C0266h.this.f723c == null) {
                return;
            }
            if (C0266h.this.f721a.mo2522i()) {
                C0266h.this.f723c.onPanelClosed(108, fVar);
            } else if (C0266h.this.f723c.onPreparePanel(0, null, fVar)) {
                C0266h.this.f723c.onMenuOpened(108, fVar);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo694a(float f) {
        ViewCompat.m4092k(this.f721a.mo2493a(), f);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public void mo702b(CharSequence charSequence) {
        this.f721a.mo2502a(charSequence);
    }

    /* renamed from: androidx.appcompat.app.h$c */
    private class C0271c extends Window$CallbackC0308h {
        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0266h.this.f721a.mo2504b());
            }
            return super.onCreatePanelView(i);
        }

        public C0271c(Window.Callback callback) {
            super(callback);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0308h
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C0266h.this.f722b) {
                C0266h.this.f721a.mo2526m();
                C0266h.this.f722b = true;
            }
            return onPreparePanel;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo695a(int i) {
        this.f721a.mo2514d(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: f */
    public void mo710f(boolean z) {
        if (z != this.f725e) {
            this.f725e = z;
            int size = this.f726f.size();
            for (int i = 0; i < size; i++) {
                this.f726f.get(i).mo713a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo697a(CharSequence charSequence) {
        this.f721a.mo2507b(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public void mo698a(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        mo967a(i, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public boolean mo700a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo705c();
        }
        return true;
    }

    /* renamed from: a */
    public void mo967a(int i, int i2) {
        this.f721a.mo2509c((i & i2) | ((~i2) & this.f721a.mo2528o()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public boolean mo699a(int i, KeyEvent keyEvent) {
        int i2;
        Menu j = m972j();
        if (j == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        j.setQwertyMode(z);
        return j.performShortcut(i, keyEvent, 0);
    }

    C0266h(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C02682 r0 = new Toolbar.AbstractC0418b() {
            /* class androidx.appcompat.app.C0266h.C02682 */

            @Override // androidx.appcompat.widget.Toolbar.AbstractC0418b
            /* renamed from: a */
            public boolean mo971a(MenuItem menuItem) {
                return C0266h.this.f723c.onMenuItemSelected(0, menuItem);
            }
        };
        this.f728h = r0;
        this.f721a = new C0428ag(toolbar, false);
        C0271c cVar = new C0271c(callback);
        this.f723c = cVar;
        this.f721a.mo2499a(cVar);
        toolbar.setOnMenuItemClickListener(r0);
        this.f721a.mo2502a(charSequence);
    }
}
