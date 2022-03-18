package com.ss.android.lark.feed.app.binder;

import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.ss.android.lark.feed.app.binder.l */
public class C37414l {

    /* renamed from: a */
    public static ThreadLocal<C37415a> f95989a = new ThreadLocal<>();

    /* renamed from: com.ss.android.lark.feed.app.binder.l$a */
    public static class C37415a {

        /* renamed from: a */
        private int f95990a;

        /* renamed from: b */
        private int f95991b;

        /* renamed from: c */
        private int f95992c;

        /* renamed from: d */
        private String f95993d;

        /* renamed from: e */
        private float f95994e;

        /* renamed from: a */
        public int mo137298a() {
            return this.f95990a;
        }

        /* renamed from: b */
        public int mo137302b() {
            return this.f95991b;
        }

        /* renamed from: c */
        public String mo137304c() {
            return this.f95993d;
        }

        /* renamed from: d */
        public int mo137306d() {
            return this.f95992c;
        }

        /* renamed from: e */
        public float mo137307e() {
            return this.f95994e;
        }

        /* renamed from: f */
        public void mo137308f() {
            this.f95991b = 0;
            this.f95990a = 0;
            this.f95992c = 8;
            this.f95993d = null;
            this.f95994e = BitmapDescriptorFactory.HUE_RED;
        }

        /* renamed from: a */
        public void mo137299a(float f) {
            this.f95994e = f;
        }

        /* renamed from: b */
        public void mo137303b(int i) {
            this.f95991b = i;
        }

        /* renamed from: c */
        public void mo137305c(int i) {
            this.f95992c = i;
        }

        /* renamed from: a */
        public void mo137300a(int i) {
            this.f95990a = i;
        }

        /* renamed from: a */
        public void mo137301a(String str) {
            this.f95993d = str;
        }
    }

    /* renamed from: a */
    public static C37415a m147240a(IBadgeable iBadgeable, boolean z, boolean z2) {
        return m147241a(iBadgeable, z, z2, true);
    }

    /* renamed from: a */
    public static C37415a m147241a(IBadgeable iBadgeable, boolean z, boolean z2, boolean z3) {
        return m147242a(iBadgeable, z, z2, z3, C37394h.f95936b);
    }

    /* renamed from: a */
    private static int m147239a(boolean z, boolean z2, boolean z3, IBadgeable iBadgeable) {
        int i;
        boolean isRemind = iBadgeable.isRemind();
        int abs = Math.abs(iBadgeable.getBadgeCount());
        int i2 = 0;
        if (!isRemind && ((!z2 && z) || z2)) {
            i = 0;
        } else if (abs < 10) {
            i = 1;
        } else if (abs < 1000) {
            i = 2;
        } else {
            i = 3;
        }
        if (z2) {
            if (isRemind) {
                i2 = 1;
            }
        } else if (isRemind || z) {
            i2 = 2;
        }
        return i + (i2 * 10) + ((!z3 ? 1 : 0) * 100);
    }

    /* renamed from: a */
    private static void m147243a(int i, IBadgeable iBadgeable, C37415a aVar, boolean z) {
        String valueOf = String.valueOf(Math.abs(iBadgeable.getBadgeCount()));
        if (i != 0) {
            if (i == 1) {
                aVar.mo137301a(valueOf);
                aVar.mo137300a(R.drawable.badge_gray_single_count_bg_stroke);
                aVar.mo137303b(-1);
            } else if (i == 2) {
                aVar.mo137301a(valueOf);
                aVar.mo137300a(R.drawable.badge_gray_multi_count_bg_stroke);
                aVar.mo137303b(-1);
            } else if (i != 3) {
                switch (i) {
                    case 11:
                        aVar.mo137301a(valueOf);
                        aVar.mo137300a(R.drawable.badge_pink_single_count_bg_stroke);
                        aVar.mo137303b(UIHelper.getColor(R.color.lkui_R500));
                        return;
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                        aVar.mo137301a(valueOf);
                        aVar.mo137300a(R.drawable.badge_pink_multi_count_bg_stroke);
                        aVar.mo137303b(UIHelper.getColor(R.color.lkui_R500));
                        return;
                    case 13:
                        aVar.mo137300a(R.drawable.badge_pink_bg_etc_count_stroke);
                        return;
                    default:
                        switch (i) {
                            case 20:
                                if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
                                    aVar.mo137300a(R.drawable.badge_orange_bg_no_count_stroke);
                                    return;
                                } else {
                                    aVar.mo137300a(R.drawable.badge_orange_bg_no_count_stroke_desktop);
                                    return;
                                }
                            case 21:
                                aVar.mo137301a(valueOf);
                                if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
                                    aVar.mo137300a(R.drawable.badge_orange_single_count_bg_stroke);
                                } else {
                                    aVar.mo137300a(R.drawable.badge_orange_single_count_bg_stroke_desktop);
                                }
                                aVar.mo137303b(-1);
                                return;
                            case 22:
                                aVar.mo137301a(valueOf);
                                aVar.mo137300a(R.drawable.badge_orange_multi_count_bg_stroke);
                                aVar.mo137303b(-1);
                                return;
                            case 23:
                                if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
                                    aVar.mo137300a(R.drawable.badge_orange_bg_etc_count_stroke);
                                    return;
                                } else {
                                    aVar.mo137300a(R.drawable.badge_orange_bg_etc_count_stroke_desktop);
                                    return;
                                }
                            default:
                                switch (i) {
                                    case 100:
                                        aVar.mo137300a(R.drawable.badge_gray_bg_no_count_no_stroke);
                                        return;
                                    case 101:
                                        aVar.mo137301a(valueOf);
                                        aVar.mo137300a(R.drawable.badge_gray_single_count_bg_no_stroke);
                                        aVar.mo137303b(-1);
                                        return;
                                    case 102:
                                        aVar.mo137301a(valueOf);
                                        aVar.mo137300a(R.drawable.badge_gray_multi_count_bg_no_stroke);
                                        aVar.mo137303b(-1);
                                        return;
                                    case 103:
                                        aVar.mo137300a(R.drawable.badge_gray_bg_etc_count);
                                        return;
                                    default:
                                        switch (i) {
                                            case SmEvents.EVENT_NT /*{ENCODED_INT: 111}*/:
                                                aVar.mo137301a(valueOf);
                                                aVar.mo137300a(R.drawable.badge_pink_single_count_bg_no_stroke);
                                                aVar.mo137303b(UIHelper.getColor(R.color.lkui_R500));
                                                return;
                                            case SmEvents.EVENT_NE_RR /*{ENCODED_INT: 112}*/:
                                                aVar.mo137301a(valueOf);
                                                aVar.mo137300a(R.drawable.badge_pink_multi_count_bg_no_stroke);
                                                aVar.mo137303b(UIHelper.getColor(R.color.lkui_R500));
                                                return;
                                            case SmEvents.EVENT_RE /*{ENCODED_INT: 113}*/:
                                                aVar.mo137300a(R.drawable.badge_pink_bg_etc_count);
                                                return;
                                            default:
                                                switch (i) {
                                                    case SmEvents.EVENT_NW /*{ENCODED_INT: 120}*/:
                                                        aVar.mo137300a(R.drawable.badge_orange_bg_no_count_no_stroke);
                                                        return;
                                                    case SmActions.ACTION_INIT_ENTRY /*{ENCODED_INT: 121}*/:
                                                        aVar.mo137301a(valueOf);
                                                        aVar.mo137300a(R.drawable.badge_orange_single_count_bg_no_stroke);
                                                        aVar.mo137303b(-1);
                                                        return;
                                                    case SmActions.ACTION_INIT_EXIT /*{ENCODED_INT: 122}*/:
                                                        aVar.mo137301a(valueOf);
                                                        aVar.mo137300a(R.drawable.badge_orange_multi_count_bg_no_stroke);
                                                        aVar.mo137303b(-1);
                                                        return;
                                                    case SmActions.ACTION_CALLING_ENTRY /*{ENCODED_INT: 123}*/:
                                                        aVar.mo137300a(R.drawable.badge_orange_bg_etc_count);
                                                        return;
                                                    default:
                                                        return;
                                                }
                                        }
                                }
                        }
                }
            } else if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
                aVar.mo137300a(R.drawable.badge_gray_bg_etc_count_stroke);
            } else {
                aVar.mo137300a(R.drawable.badge_gray_bg_etc_count_stroke_desktop);
            }
        } else if (!DesktopUtil.m144301a(C37262a.m146726a().mo139170a())) {
            aVar.mo137300a(R.drawable.badge_gray_bg_no_count_stroke);
        } else {
            aVar.mo137300a(R.drawable.badge_gray_bg_no_count_stroke_desktop);
        }
    }

    /* renamed from: a */
    public static C37415a m147242a(IBadgeable iBadgeable, boolean z, boolean z2, boolean z3, boolean z4) {
        C37415a aVar = f95989a.get();
        if (aVar == null) {
            aVar = new C37415a();
            f95989a.set(aVar);
        }
        aVar.mo137308f();
        if (iBadgeable.getBadgeCount() == 0) {
            aVar.mo137305c(8);
            return aVar;
        }
        aVar.mo137305c(0);
        if (z2) {
            aVar.mo137299a(2.5f);
        } else {
            aVar.mo137299a(1.0f);
        }
        m147243a(m147239a(z4, z, z2, iBadgeable), iBadgeable, aVar, z3);
        return aVar;
    }
}
