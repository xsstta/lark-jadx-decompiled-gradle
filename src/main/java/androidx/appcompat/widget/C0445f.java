package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.appcompat.widget.C0472v;
import androidx.core.graphics.C0768a;
import com.larksuite.suite.R;

/* renamed from: androidx.appcompat.widget.f */
public final class C0445f {

    /* renamed from: a */
    public static final PorterDuff.Mode f1630a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0445f f1631b;

    /* renamed from: c */
    private C0472v f1632c;

    /* renamed from: b */
    public static synchronized C0445f m1910b() {
        C0445f fVar;
        synchronized (C0445f.class) {
            if (f1631b == null) {
                m1908a();
            }
            fVar = f1631b;
        }
        return fVar;
    }

    /* renamed from: a */
    public static synchronized void m1908a() {
        synchronized (C0445f.class) {
            if (f1631b == null) {
                C0445f fVar = new C0445f();
                f1631b = fVar;
                fVar.f1632c = C0472v.m2105a();
                f1631b.f1632c.mo2687a(new C0472v.AbstractC0477e() {
                    /* class androidx.appcompat.widget.C0445f.C04461 */

                    /* renamed from: a */
                    private final int[] f1633a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

                    /* renamed from: b */
                    private final int[] f1634b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

                    /* renamed from: c */
                    private final int[] f1635c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, 2131230845, R.drawable.abc_text_cursor_material, 2131230902, 2131230904, 2131230906, 2131230903, 2131230905, 2131230907};

                    /* renamed from: d */
                    private final int[] f1636d = {2131230883, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

                    /* renamed from: e */
                    private final int[] f1637e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

                    /* renamed from: f */
                    private final int[] f1638f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

                    /* renamed from: b */
                    private ColorStateList m1918b(Context context) {
                        return m1919b(context, 0);
                    }

                    /* renamed from: a */
                    private ColorStateList m1915a(Context context) {
                        return m1919b(context, C0422aa.m1765a(context, (int) R.attr.colorButtonNormal));
                    }

                    /* renamed from: c */
                    private ColorStateList m1920c(Context context) {
                        return m1919b(context, C0422aa.m1765a(context, (int) R.attr.colorAccent));
                    }

                    /* renamed from: d */
                    private ColorStateList m1921d(Context context) {
                        int[][] iArr = new int[3][];
                        int[] iArr2 = new int[3];
                        ColorStateList b = C0422aa.m1769b(context, R.attr.colorSwitchThumbNormal);
                        if (b == null || !b.isStateful()) {
                            iArr[0] = C0422aa.f1527a;
                            iArr2[0] = C0422aa.m1770c(context, R.attr.colorSwitchThumbNormal);
                            iArr[1] = C0422aa.f1531e;
                            iArr2[1] = C0422aa.m1765a(context, (int) R.attr.colorControlActivated);
                            iArr[2] = C0422aa.f1534h;
                            iArr2[2] = C0422aa.m1765a(context, (int) R.attr.colorSwitchThumbNormal);
                        } else {
                            iArr[0] = C0422aa.f1527a;
                            iArr2[0] = b.getColorForState(iArr[0], 0);
                            iArr[1] = C0422aa.f1531e;
                            iArr2[1] = C0422aa.m1765a(context, (int) R.attr.colorControlActivated);
                            iArr[2] = C0422aa.f1534h;
                            iArr2[2] = b.getDefaultColor();
                        }
                        return new ColorStateList(iArr, iArr2);
                    }

                    @Override // androidx.appcompat.widget.C0472v.AbstractC0477e
                    /* renamed from: a */
                    public PorterDuff.Mode mo2592a(int i) {
                        if (i == R.drawable.abc_switch_thumb_material) {
                            return PorterDuff.Mode.MULTIPLY;
                        }
                        return null;
                    }

                    /* renamed from: a */
                    private boolean m1917a(int[] iArr, int i) {
                        for (int i2 : iArr) {
                            if (i2 == i) {
                                return true;
                            }
                        }
                        return false;
                    }

                    /* renamed from: b */
                    private ColorStateList m1919b(Context context, int i) {
                        int a = C0422aa.m1765a(context, (int) R.attr.colorControlHighlight);
                        int c = C0422aa.m1770c(context, R.attr.colorButtonNormal);
                        return new ColorStateList(new int[][]{C0422aa.f1527a, C0422aa.f1530d, C0422aa.f1528b, C0422aa.f1534h}, new int[]{c, C0768a.m3706a(a, i), C0768a.m3706a(a, i), i});
                    }

                    @Override // androidx.appcompat.widget.C0472v.AbstractC0477e
                    /* renamed from: a */
                    public ColorStateList mo2591a(Context context, int i) {
                        if (i == R.drawable.abc_edit_text_material) {
                            return C0215a.m652a(context, R.color.abc_tint_edittext);
                        }
                        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                            return C0215a.m652a(context, R.color.abc_tint_switch_track);
                        }
                        if (i == R.drawable.abc_switch_thumb_material) {
                            return m1921d(context);
                        }
                        if (i == R.drawable.abc_btn_default_mtrl_shape) {
                            return m1915a(context);
                        }
                        if (i == R.drawable.abc_btn_borderless_material) {
                            return m1918b(context);
                        }
                        if (i == R.drawable.abc_btn_colored_material) {
                            return m1920c(context);
                        }
                        if (i == 2131230895 || i == R.drawable.abc_spinner_textfield_background_material) {
                            return C0215a.m652a(context, R.color.abc_tint_spinner);
                        }
                        if (m1917a(this.f1634b, i)) {
                            return C0422aa.m1769b(context, R.attr.colorControlNormal);
                        }
                        if (m1917a(this.f1637e, i)) {
                            return C0215a.m652a(context, R.color.abc_tint_default);
                        }
                        if (m1917a(this.f1638f, i)) {
                            return C0215a.m652a(context, R.color.abc_tint_btn_checkable);
                        }
                        if (i == R.drawable.abc_seekbar_thumb_material) {
                            return C0215a.m652a(context, R.color.abc_tint_seek_thumb);
                        }
                        return null;
                    }

                    /* renamed from: a */
                    private void m1916a(Drawable drawable, int i, PorterDuff.Mode mode) {
                        if (C0460p.m2061c(drawable)) {
                            drawable = drawable.mutate();
                        }
                        if (mode == null) {
                            mode = C0445f.f1630a;
                        }
                        drawable.setColorFilter(C0445f.m1907a(i, mode));
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048  */
                    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
                    @Override // androidx.appcompat.widget.C0472v.AbstractC0477e
                    /* renamed from: b */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public boolean mo2595b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
                        /*
                            r6 = this;
                            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0445f.f1630a
                            int[] r1 = r6.f1633a
                            boolean r1 = r6.m1917a(r1, r8)
                            r2 = 16842801(0x1010031, float:2.3693695E-38)
                            r3 = -1
                            r4 = 0
                            r5 = 1
                            if (r1 == 0) goto L_0x0016
                            r2 = 2130968946(0x7f040172, float:1.754656E38)
                        L_0x0013:
                            r8 = -1
                        L_0x0014:
                            r1 = 1
                            goto L_0x0046
                        L_0x0016:
                            int[] r1 = r6.f1635c
                            boolean r1 = r6.m1917a(r1, r8)
                            if (r1 == 0) goto L_0x0022
                            r2 = 2130968944(0x7f040170, float:1.7546556E38)
                            goto L_0x0013
                        L_0x0022:
                            int[] r1 = r6.f1636d
                            boolean r1 = r6.m1917a(r1, r8)
                            if (r1 == 0) goto L_0x002d
                            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                            goto L_0x0013
                        L_0x002d:
                            r1 = 2131230871(0x7f080097, float:1.8077807E38)
                            if (r8 != r1) goto L_0x003d
                            r2 = 16842800(0x1010030, float:2.3693693E-38)
                            r8 = 1109603123(0x42233333, float:40.8)
                            int r8 = java.lang.Math.round(r8)
                            goto L_0x0014
                        L_0x003d:
                            r1 = 2131230847(0x7f08007f, float:1.8077758E38)
                            if (r8 != r1) goto L_0x0043
                            goto L_0x0013
                        L_0x0043:
                            r8 = -1
                            r1 = 0
                            r2 = 0
                        L_0x0046:
                            if (r1 == 0) goto L_0x0063
                            boolean r1 = androidx.appcompat.widget.C0460p.m2061c(r9)
                            if (r1 == 0) goto L_0x0052
                            android.graphics.drawable.Drawable r9 = r9.mutate()
                        L_0x0052:
                            int r7 = androidx.appcompat.widget.C0422aa.m1765a(r7, r2)
                            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0445f.m1907a(r7, r0)
                            r9.setColorFilter(r7)
                            if (r8 == r3) goto L_0x0062
                            r9.setAlpha(r8)
                        L_0x0062:
                            return r5
                        L_0x0063:
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0445f.C04461.mo2595b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                    }

                    @Override // androidx.appcompat.widget.C0472v.AbstractC0477e
                    /* renamed from: a */
                    public Drawable mo2593a(C0472v vVar, Context context, int i) {
                        if (i != R.drawable.abc_cab_background_top_material) {
                            return null;
                        }
                        return new LayerDrawable(new Drawable[]{vVar.mo2683a(context, R.drawable.abc_cab_background_internal_bg), vVar.mo2683a(context, 2131230845)});
                    }

                    @Override // androidx.appcompat.widget.C0472v.AbstractC0477e
                    /* renamed from: a */
                    public boolean mo2594a(Context context, int i, Drawable drawable) {
                        if (i == R.drawable.abc_seekbar_track_material) {
                            LayerDrawable layerDrawable = (LayerDrawable) drawable;
                            m1916a(layerDrawable.findDrawableByLayerId(16908288), C0422aa.m1765a(context, (int) R.attr.colorControlNormal), C0445f.f1630a);
                            m1916a(layerDrawable.findDrawableByLayerId(16908303), C0422aa.m1765a(context, (int) R.attr.colorControlNormal), C0445f.f1630a);
                            m1916a(layerDrawable.findDrawableByLayerId(16908301), C0422aa.m1765a(context, (int) R.attr.colorControlActivated), C0445f.f1630a);
                            return true;
                        } else if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
                            return false;
                        } else {
                            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                            m1916a(layerDrawable2.findDrawableByLayerId(16908288), C0422aa.m1770c(context, R.attr.colorControlNormal), C0445f.f1630a);
                            m1916a(layerDrawable2.findDrawableByLayerId(16908303), C0422aa.m1765a(context, (int) R.attr.colorControlActivated), C0445f.f1630a);
                            m1916a(layerDrawable2.findDrawableByLayerId(16908301), C0422aa.m1765a(context, (int) R.attr.colorControlActivated), C0445f.f1630a);
                            return true;
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo2589a(Context context) {
        this.f1632c.mo2686a(context);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1907a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0445f.class) {
            a = C0472v.m2101a(i, mode);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo2590b(Context context, int i) {
        return this.f1632c.mo2689b(context, i);
    }

    /* renamed from: a */
    public synchronized Drawable mo2587a(Context context, int i) {
        return this.f1632c.mo2683a(context, i);
    }

    /* renamed from: a */
    static void m1909a(Drawable drawable, C0425ad adVar, int[] iArr) {
        C0472v.m2107a(drawable, adVar, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo2588a(Context context, int i, boolean z) {
        return this.f1632c.mo2684a(context, i, z);
    }
}
