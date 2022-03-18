package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import androidx.core.graphics.C0769b;
import androidx.core.util.C0843d;
import androidx.core.util.C0845f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* renamed from: androidx.core.view.ab */
public class C0883ab {

    /* renamed from: a */
    public static final C0883ab f3406a = new C0884a().mo4662a().mo4655j().mo4654i().mo4651g();

    /* renamed from: b */
    private final C0888e f3407b;

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.view.ab$b */
    public static class C0885b {

        /* renamed from: a */
        private final C0883ab f3409a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4665a(C0769b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4666b(C0769b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0883ab mo4664a() {
            return this.f3409a;
        }

        C0885b() {
            this(new C0883ab((C0883ab) null));
        }

        C0885b(C0883ab abVar) {
            this.f3409a = abVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.view.ab$e */
    public static class C0888e {

        /* renamed from: a */
        final C0883ab f3416a;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4668a() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4669b() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0897c mo4672e() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0883ab mo4670c() {
            return this.f3416a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0883ab mo4671d() {
            return this.f3416a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0883ab mo4674f() {
            return this.f3416a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0769b mo4675g() {
            return C0769b.f3130a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0769b mo4676h() {
            return C0769b.f3130a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0769b mo4678i() {
            return mo4675g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C0769b mo4679j() {
            return mo4675g();
        }

        public int hashCode() {
            return C0843d.m3986a(Boolean.valueOf(mo4668a()), Boolean.valueOf(mo4669b()), mo4675g(), mo4676h(), mo4672e());
        }

        C0888e(C0883ab abVar) {
            this.f3416a = abVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0888e)) {
                return false;
            }
            C0888e eVar = (C0888e) obj;
            if (mo4668a() != eVar.mo4668a() || mo4669b() != eVar.mo4669b() || !C0843d.m3987a(mo4675g(), eVar.mo4675g()) || !C0843d.m3987a(mo4676h(), eVar.mo4676h()) || !C0843d.m3987a(mo4672e(), eVar.mo4672e())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0883ab mo4667a(int i, int i2, int i3, int i4) {
            return C0883ab.f3406a;
        }
    }

    /* renamed from: androidx.core.view.ab$c */
    private static class C0886c extends C0885b {

        /* renamed from: a */
        private static Field f3410a;

        /* renamed from: b */
        private static boolean f3411b;

        /* renamed from: c */
        private static Constructor<WindowInsets> f3412c;

        /* renamed from: d */
        private static boolean f3413d;

        /* renamed from: e */
        private WindowInsets f3414e;

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0885b
        /* renamed from: a */
        public C0883ab mo4664a() {
            return C0883ab.m4271a(this.f3414e);
        }

        C0886c() {
            this.f3414e = m4295b();
        }

        /* renamed from: b */
        private static WindowInsets m4295b() {
            if (!f3411b) {
                try {
                    f3410a = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f3411b = true;
            }
            Field field = f3410a;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f3413d) {
                try {
                    f3412c = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f3413d = true;
            }
            Constructor<WindowInsets> constructor = f3412c;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        C0886c(C0883ab abVar) {
            this.f3414e = abVar.mo4660o();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0885b
        /* renamed from: a */
        public void mo4665a(C0769b bVar) {
            WindowInsets windowInsets = this.f3414e;
            if (windowInsets != null) {
                this.f3414e = windowInsets.replaceSystemWindowInsets(bVar.f3131b, bVar.f3132c, bVar.f3133d, bVar.f3134e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.view.ab$f */
    public static class C0889f extends C0888e {

        /* renamed from: b */
        final WindowInsets f3417b;

        /* renamed from: c */
        private C0769b f3418c;

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: a */
        public boolean mo4668a() {
            return this.f3417b.isRound();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: g */
        public final C0769b mo4675g() {
            if (this.f3418c == null) {
                this.f3418c = C0769b.m3718a(this.f3417b.getSystemWindowInsetLeft(), this.f3417b.getSystemWindowInsetTop(), this.f3417b.getSystemWindowInsetRight(), this.f3417b.getSystemWindowInsetBottom());
            }
            return this.f3418c;
        }

        C0889f(C0883ab abVar, WindowInsets windowInsets) {
            super(abVar);
            this.f3417b = windowInsets;
        }

        C0889f(C0883ab abVar, C0889f fVar) {
            this(abVar, new WindowInsets(fVar.f3417b));
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: a */
        public C0883ab mo4667a(int i, int i2, int i3, int i4) {
            C0884a aVar = new C0884a(C0883ab.m4271a(this.f3417b));
            aVar.mo4661a(C0883ab.m4270a(mo4675g(), i, i2, i3, i4));
            aVar.mo4663b(C0883ab.m4270a(mo4676h(), i, i2, i3, i4));
            return aVar.mo4662a();
        }
    }

    /* renamed from: androidx.core.view.ab$g */
    private static class C0890g extends C0889f {

        /* renamed from: c */
        private C0769b f3419c;

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: b */
        public boolean mo4669b() {
            return this.f3417b.isConsumed();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: c */
        public C0883ab mo4670c() {
            return C0883ab.m4271a(this.f3417b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: d */
        public C0883ab mo4671d() {
            return C0883ab.m4271a(this.f3417b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: h */
        public final C0769b mo4676h() {
            if (this.f3419c == null) {
                this.f3419c = C0769b.m3718a(this.f3417b.getStableInsetLeft(), this.f3417b.getStableInsetTop(), this.f3417b.getStableInsetRight(), this.f3417b.getStableInsetBottom());
            }
            return this.f3419c;
        }

        C0890g(C0883ab abVar, WindowInsets windowInsets) {
            super(abVar, windowInsets);
        }

        C0890g(C0883ab abVar, C0890g gVar) {
            super(abVar, gVar);
        }
    }

    /* renamed from: androidx.core.view.ab$h */
    private static class C0891h extends C0890g {
        @Override // androidx.core.view.C0883ab.C0888e
        public int hashCode() {
            return this.f3417b.hashCode();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: e */
        public C0897c mo4672e() {
            return C0897c.m4339a(this.f3417b.getDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: f */
        public C0883ab mo4674f() {
            return C0883ab.m4271a(this.f3417b.consumeDisplayCutout());
        }

        @Override // androidx.core.view.C0883ab.C0888e
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0891h)) {
                return false;
            }
            return Objects.equals(this.f3417b, ((C0891h) obj).f3417b);
        }

        C0891h(C0883ab abVar, WindowInsets windowInsets) {
            super(abVar, windowInsets);
        }

        C0891h(C0883ab abVar, C0891h hVar) {
            super(abVar, hVar);
        }
    }

    /* renamed from: a */
    public int mo4642a() {
        return mo4656k().f3131b;
    }

    /* renamed from: b */
    public int mo4644b() {
        return mo4656k().f3132c;
    }

    /* renamed from: c */
    public int mo4646c() {
        return mo4656k().f3133d;
    }

    /* renamed from: d */
    public int mo4647d() {
        return mo4656k().f3134e;
    }

    /* renamed from: f */
    public boolean mo4650f() {
        return this.f3407b.mo4669b();
    }

    /* renamed from: g */
    public C0883ab mo4651g() {
        return this.f3407b.mo4670c();
    }

    /* renamed from: h */
    public int mo4652h() {
        return mo4657l().f3134e;
    }

    /* renamed from: i */
    public C0883ab mo4654i() {
        return this.f3407b.mo4671d();
    }

    /* renamed from: j */
    public C0883ab mo4655j() {
        return this.f3407b.mo4674f();
    }

    /* renamed from: k */
    public C0769b mo4656k() {
        return this.f3407b.mo4675g();
    }

    /* renamed from: l */
    public C0769b mo4657l() {
        return this.f3407b.mo4676h();
    }

    /* renamed from: m */
    public C0769b mo4658m() {
        return this.f3407b.mo4679j();
    }

    /* renamed from: n */
    public C0769b mo4659n() {
        return this.f3407b.mo4678i();
    }

    /* renamed from: androidx.core.view.ab$a */
    public static final class C0884a {

        /* renamed from: a */
        private final C0885b f3408a;

        /* renamed from: a */
        public C0883ab mo4662a() {
            return this.f3408a.mo4664a();
        }

        public C0884a() {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3408a = new C0887d();
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.f3408a = new C0886c();
            } else {
                this.f3408a = new C0885b();
            }
        }

        /* renamed from: a */
        public C0884a mo4661a(C0769b bVar) {
            this.f3408a.mo4665a(bVar);
            return this;
        }

        /* renamed from: b */
        public C0884a mo4663b(C0769b bVar) {
            this.f3408a.mo4666b(bVar);
            return this;
        }

        public C0884a(C0883ab abVar) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3408a = new C0887d(abVar);
            } else if (Build.VERSION.SDK_INT >= 20) {
                this.f3408a = new C0886c(abVar);
            } else {
                this.f3408a = new C0885b(abVar);
            }
        }
    }

    /* renamed from: androidx.core.view.ab$d */
    private static class C0887d extends C0885b {

        /* renamed from: a */
        final WindowInsets.Builder f3415a;

        C0887d() {
            this.f3415a = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0885b
        /* renamed from: a */
        public C0883ab mo4664a() {
            return C0883ab.m4271a(this.f3415a.build());
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0885b
        /* renamed from: b */
        public void mo4666b(C0769b bVar) {
            this.f3415a.setStableInsets(bVar.mo4290a());
        }

        C0887d(C0883ab abVar) {
            WindowInsets.Builder builder;
            WindowInsets o = abVar.mo4660o();
            if (o != null) {
                builder = new WindowInsets.Builder(o);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3415a = builder;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0885b
        /* renamed from: a */
        public void mo4665a(C0769b bVar) {
            this.f3415a.setSystemWindowInsets(bVar.mo4290a());
        }
    }

    /* renamed from: e */
    public boolean mo4648e() {
        return !mo4656k().equals(C0769b.f3130a);
    }

    public int hashCode() {
        C0888e eVar = this.f3407b;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    /* renamed from: o */
    public WindowInsets mo4660o() {
        C0888e eVar = this.f3407b;
        if (eVar instanceof C0889f) {
            return ((C0889f) eVar).f3417b;
        }
        return null;
    }

    /* renamed from: androidx.core.view.ab$i */
    private static class C0892i extends C0891h {

        /* renamed from: c */
        private C0769b f3420c;

        /* renamed from: d */
        private C0769b f3421d;

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: i */
        public C0769b mo4678i() {
            if (this.f3420c == null) {
                this.f3420c = C0769b.m3719a(this.f3417b.getSystemGestureInsets());
            }
            return this.f3420c;
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e
        /* renamed from: j */
        public C0769b mo4679j() {
            if (this.f3421d == null) {
                this.f3421d = C0769b.m3719a(this.f3417b.getMandatorySystemGestureInsets());
            }
            return this.f3421d;
        }

        C0892i(C0883ab abVar, WindowInsets windowInsets) {
            super(abVar, windowInsets);
        }

        C0892i(C0883ab abVar, C0892i iVar) {
            super(abVar, iVar);
        }

        /* access modifiers changed from: package-private */
        @Override // androidx.core.view.C0883ab.C0888e, androidx.core.view.C0883ab.C0889f
        /* renamed from: a */
        public C0883ab mo4667a(int i, int i2, int i3, int i4) {
            return C0883ab.m4271a(this.f3417b.inset(i, i2, i3, i4));
        }
    }

    /* renamed from: a */
    public static C0883ab m4271a(WindowInsets windowInsets) {
        return new C0883ab((WindowInsets) C0845f.m3991a(windowInsets));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0883ab)) {
            return false;
        }
        return C0843d.m3987a(this.f3407b, ((C0883ab) obj).f3407b);
    }

    private C0883ab(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3407b = new C0892i(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.f3407b = new C0891h(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f3407b = new C0890g(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f3407b = new C0889f(this, windowInsets);
        } else {
            this.f3407b = new C0888e(this);
        }
    }

    public C0883ab(C0883ab abVar) {
        if (abVar != null) {
            C0888e eVar = abVar.f3407b;
            if (Build.VERSION.SDK_INT >= 29 && (eVar instanceof C0892i)) {
                this.f3407b = new C0892i(this, (C0892i) eVar);
            } else if (Build.VERSION.SDK_INT >= 28 && (eVar instanceof C0891h)) {
                this.f3407b = new C0891h(this, (C0891h) eVar);
            } else if (Build.VERSION.SDK_INT >= 21 && (eVar instanceof C0890g)) {
                this.f3407b = new C0890g(this, (C0890g) eVar);
            } else if (Build.VERSION.SDK_INT < 20 || !(eVar instanceof C0889f)) {
                this.f3407b = new C0888e(this);
            } else {
                this.f3407b = new C0889f(this, (C0889f) eVar);
            }
        } else {
            this.f3407b = new C0888e(this);
        }
    }

    /* renamed from: b */
    public C0883ab mo4645b(int i, int i2, int i3, int i4) {
        return this.f3407b.mo4667a(i, i2, i3, i4);
    }

    /* renamed from: a */
    public C0883ab mo4643a(int i, int i2, int i3, int i4) {
        return new C0884a(this).mo4661a(C0769b.m3718a(i, i2, i3, i4)).mo4662a();
    }

    /* renamed from: a */
    static C0769b m4270a(C0769b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f3131b - i);
        int max2 = Math.max(0, bVar.f3132c - i2);
        int max3 = Math.max(0, bVar.f3133d - i3);
        int max4 = Math.max(0, bVar.f3134e - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return bVar;
        }
        return C0769b.m3718a(max, max2, max3, max4);
    }
}
