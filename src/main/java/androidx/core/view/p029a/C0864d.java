package androidx.core.view.p029a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.p029a.AbstractC0873g;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.view.a.d */
public class C0864d {

    /* renamed from: d */
    private static int f3354d;

    /* renamed from: a */
    public int f3355a = -1;

    /* renamed from: b */
    private final AccessibilityNodeInfo f3356b;

    /* renamed from: c */
    private int f3357c = -1;

    /* renamed from: e */
    private static String m4180e(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case SmActions.ACTION_ONTHECALL_EXIT /*{ENCODED_INT: 128}*/:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case DynamicModule.f58006b /*{ENCODED_INT: 256}*/:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case MediaPlayer.MEDIA_PLAYER_OPTION_APPID /*{ENCODED_INT: 512}*/:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: a */
    public AccessibilityNodeInfo mo4551a() {
        return this.f3356b;
    }

    /* renamed from: a */
    public void mo4554a(View view, int i) {
        this.f3357c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3356b.setSource(view, i);
        }
    }

    /* renamed from: a */
    public void mo4555a(C0865a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3356b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3395L);
        }
    }

    /* renamed from: a */
    public boolean mo4561a(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3356b.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public void mo4560a(boolean z) {
        this.f3356b.setCheckable(z);
    }

    /* renamed from: a */
    public void mo4557a(CharSequence charSequence) {
        this.f3356b.setPackageName(charSequence);
    }

    /* renamed from: a */
    public void mo4558a(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 26) {
            m4168B();
            m4182g(view);
            ClickableSpan[] d = m4178d(charSequence);
            if (d != null && d.length > 0) {
                mo4621y().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> e = m4179e(view);
                int i = 0;
                while (d != null && i < d.length) {
                    int a = m4169a(d[i], e);
                    e.put(a, new WeakReference<>(d[i]));
                    m4175a(d[i], (Spanned) charSequence, a);
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4559a(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3356b;
            if (obj == null) {
                collectionInfo = null;
            } else {
                collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C0866b) obj).f3399a;
            }
            accessibilityNodeInfo.setCollectionInfo(collectionInfo);
        }
    }

    /* renamed from: a */
    public void mo4556a(C0868d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f3401a);
        }
    }

    /* renamed from: c */
    public int mo4570c() {
        return this.f3356b.getChildCount();
    }

    /* renamed from: d */
    public int mo4577d() {
        return this.f3356b.getActions();
    }

    /* renamed from: f */
    public boolean mo4587f() {
        return this.f3356b.isCheckable();
    }

    /* renamed from: l */
    public boolean mo4603l() {
        return this.f3356b.isSelected();
    }

    /* renamed from: m */
    public boolean mo4605m() {
        return this.f3356b.isClickable();
    }

    /* renamed from: n */
    public boolean mo4607n() {
        return this.f3356b.isLongClickable();
    }

    /* renamed from: o */
    public boolean mo4609o() {
        return this.f3356b.isEnabled();
    }

    /* renamed from: p */
    public boolean mo4611p() {
        return this.f3356b.isPassword();
    }

    /* renamed from: q */
    public boolean mo4612q() {
        return this.f3356b.isScrollable();
    }

    /* renamed from: r */
    public CharSequence mo4613r() {
        return this.f3356b.getPackageName();
    }

    /* renamed from: s */
    public CharSequence mo4614s() {
        return this.f3356b.getClassName();
    }

    /* renamed from: u */
    public CharSequence mo4617u() {
        return this.f3356b.getContentDescription();
    }

    /* renamed from: v */
    public void mo4618v() {
        this.f3356b.recycle();
    }

    /* renamed from: androidx.core.view.a.d$a */
    public static class C0865a {

        /* renamed from: A */
        public static final C0865a f3358A;

        /* renamed from: B */
        public static final C0865a f3359B;

        /* renamed from: C */
        public static final C0865a f3360C;

        /* renamed from: D */
        public static final C0865a f3361D;

        /* renamed from: E */
        public static final C0865a f3362E;

        /* renamed from: F */
        public static final C0865a f3363F;

        /* renamed from: G */
        public static final C0865a f3364G;

        /* renamed from: H */
        public static final C0865a f3365H;

        /* renamed from: I */
        public static final C0865a f3366I;

        /* renamed from: J */
        public static final C0865a f3367J;

        /* renamed from: K */
        public static final C0865a f3368K;

        /* renamed from: a */
        public static final C0865a f3369a = new C0865a(1, null);

        /* renamed from: b */
        public static final C0865a f3370b = new C0865a(2, null);

        /* renamed from: c */
        public static final C0865a f3371c = new C0865a(4, null);

        /* renamed from: d */
        public static final C0865a f3372d = new C0865a(8, null);

        /* renamed from: e */
        public static final C0865a f3373e = new C0865a(16, null);

        /* renamed from: f */
        public static final C0865a f3374f = new C0865a(32, null);

        /* renamed from: g */
        public static final C0865a f3375g = new C0865a(64, null);

        /* renamed from: h */
        public static final C0865a f3376h = new C0865a(SmActions.ACTION_ONTHECALL_EXIT, null);

        /* renamed from: i */
        public static final C0865a f3377i = new C0865a(DynamicModule.f58006b, null, AbstractC0873g.C0875b.class);

        /* renamed from: j */
        public static final C0865a f3378j = new C0865a(MediaPlayer.MEDIA_PLAYER_OPTION_APPID, null, AbstractC0873g.C0875b.class);

        /* renamed from: k */
        public static final C0865a f3379k = new C0865a(1024, null, AbstractC0873g.C0876c.class);

        /* renamed from: l */
        public static final C0865a f3380l = new C0865a(2048, null, AbstractC0873g.C0876c.class);

        /* renamed from: m */
        public static final C0865a f3381m = new C0865a(4096, null);

        /* renamed from: n */
        public static final C0865a f3382n = new C0865a(8192, null);

        /* renamed from: o */
        public static final C0865a f3383o = new C0865a(16384, null);

        /* renamed from: p */
        public static final C0865a f3384p = new C0865a(32768, null);

        /* renamed from: q */
        public static final C0865a f3385q = new C0865a(65536, null);

        /* renamed from: r */
        public static final C0865a f3386r = new C0865a(131072, null, AbstractC0873g.C0880g.class);

        /* renamed from: s */
        public static final C0865a f3387s = new C0865a(262144, null);

        /* renamed from: t */
        public static final C0865a f3388t = new C0865a(524288, null);

        /* renamed from: u */
        public static final C0865a f3389u = new C0865a(1048576, null);

        /* renamed from: v */
        public static final C0865a f3390v = new C0865a(2097152, null, AbstractC0873g.C0881h.class);

        /* renamed from: w */
        public static final C0865a f3391w;

        /* renamed from: x */
        public static final C0865a f3392x;

        /* renamed from: y */
        public static final C0865a f3393y;

        /* renamed from: z */
        public static final C0865a f3394z;

        /* renamed from: L */
        final Object f3395L;

        /* renamed from: M */
        protected final AbstractC0873g f3396M;

        /* renamed from: N */
        private final int f3397N;

        /* renamed from: O */
        private final Class<? extends AbstractC0873g.AbstractC0874a> f3398O;

        public int hashCode() {
            Object obj = this.f3395L;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        /* renamed from: a */
        public int mo4623a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3395L).getId();
            }
            return 0;
        }

        /* renamed from: b */
        public CharSequence mo4626b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f3395L).getLabel();
            }
            return null;
        }

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            f3391w = new C0865a(accessibilityAction, 16908342, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                accessibilityAction2 = null;
            }
            f3392x = new C0865a(accessibilityAction2, 16908343, null, null, AbstractC0873g.C0878e.class);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                accessibilityAction3 = null;
            }
            f3393y = new C0865a(accessibilityAction3, 16908344, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                accessibilityAction4 = null;
            }
            f3394z = new C0865a(accessibilityAction4, 16908345, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                accessibilityAction5 = null;
            }
            f3358A = new C0865a(accessibilityAction5, 16908346, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                accessibilityAction6 = null;
            }
            f3359B = new C0865a(accessibilityAction6, 16908347, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction7 = null;
            }
            f3360C = new C0865a(accessibilityAction7, 16908358, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction8 = null;
            }
            f3361D = new C0865a(accessibilityAction8, 16908359, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction9 = null;
            }
            f3362E = new C0865a(accessibilityAction9, 16908360, null, null, null);
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction10 = null;
            }
            f3363F = new C0865a(accessibilityAction10, 16908361, null, null, null);
            if (Build.VERSION.SDK_INT >= 23) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityAction11 = null;
            }
            f3364G = new C0865a(accessibilityAction11, 16908348, null, null, null);
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction12 = null;
            }
            f3365H = new C0865a(accessibilityAction12, 16908349, null, null, AbstractC0873g.C0879f.class);
            if (Build.VERSION.SDK_INT >= 26) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction13 = null;
            }
            f3366I = new C0865a(accessibilityAction13, 16908354, null, null, AbstractC0873g.C0877d.class);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction14 = null;
            }
            f3367J = new C0865a(accessibilityAction14, 16908356, null, null, null);
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f3368K = new C0865a(accessibilityAction15, 16908357, null, null, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0865a)) {
                return false;
            }
            C0865a aVar = (C0865a) obj;
            Object obj2 = this.f3395L;
            if (obj2 == null) {
                if (aVar.f3395L != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f3395L)) {
                return false;
            } else {
                return true;
            }
        }

        C0865a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public C0865a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        /* renamed from: a */
        public C0865a mo4624a(CharSequence charSequence, AbstractC0873g gVar) {
            return new C0865a(null, this.f3397N, charSequence, gVar, this.f3398O);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4625a(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                androidx.core.view.a.g r0 = r4.f3396M
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends androidx.core.view.a.g$a> r2 = r4.f3398O
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                androidx.core.view.a.g$a r1 = (androidx.core.view.p029a.AbstractC0873g.AbstractC0874a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo4641a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends androidx.core.view.a.g$a> r1 = r4.f3398O
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                androidx.core.view.a.g r6 = r4.f3396M
                boolean r5 = r6.mo4640a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.p029a.C0864d.C0865a.mo4625a(android.view.View, android.os.Bundle):boolean");
        }

        private C0865a(int i, CharSequence charSequence, Class<? extends AbstractC0873g.AbstractC0874a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C0865a(Object obj, int i, CharSequence charSequence, AbstractC0873g gVar, Class<? extends AbstractC0873g.AbstractC0874a> cls) {
            this.f3397N = i;
            this.f3396M = gVar;
            if (Build.VERSION.SDK_INT < 21 || obj != null) {
                this.f3395L = obj;
            } else {
                this.f3395L = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f3398O = cls;
        }
    }

    /* renamed from: A */
    private boolean m4167A() {
        return !m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: b */
    public static C0864d m4176b() {
        return m4171a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: e */
    public int mo4581e() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3356b.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: h */
    public boolean mo4593h() {
        return this.f3356b.isFocusable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3356b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public boolean mo4597i() {
        return this.f3356b.isFocused();
    }

    /* renamed from: j */
    public boolean mo4599j() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3356b.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo4601k() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f3356b.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: w */
    public String mo4619w() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f3356b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: g */
    public boolean mo4590g() {
        return this.f3356b.isChecked();
    }

    /* renamed from: y */
    public Bundle mo4621y() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f3356b.getExtras();
        }
        return new Bundle();
    }

    /* renamed from: z */
    public boolean mo4622z() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3356b.isShowingHintText();
        }
        return m4177d(4);
    }

    /* renamed from: B */
    private void m4168B() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f3356b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f3356b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f3356b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: x */
    public List<C0865a> mo4620x() {
        List<AccessibilityNodeInfo.AccessibilityAction> list;
        if (Build.VERSION.SDK_INT >= 21) {
            list = this.f3356b.getActionList();
        } else {
            list = null;
        }
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0865a(list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: t */
    public CharSequence mo4615t() {
        if (!m4167A()) {
            return this.f3356b.getText();
        }
        List<Integer> a = m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> a2 = m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> a3 = m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> a4 = m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3356b.getText(), 0, this.f3356b.getText().length()));
        for (int i = 0; i < a.size(); i++) {
            spannableString.setSpan(new C0861a(a4.get(i).intValue(), this, mo4621y().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), a.get(i).intValue(), a2.get(i).intValue(), a3.get(i).intValue());
        }
        return spannableString;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo4553a(rect);
        sb.append("; boundsInParent: " + rect);
        mo4572c(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo4613r());
        sb.append("; className: ");
        sb.append(mo4614s());
        sb.append("; text: ");
        sb.append(mo4615t());
        sb.append("; contentDescription: ");
        sb.append(mo4617u());
        sb.append("; viewId: ");
        sb.append(mo4619w());
        sb.append("; checkable: ");
        sb.append(mo4587f());
        sb.append("; checked: ");
        sb.append(mo4590g());
        sb.append("; focusable: ");
        sb.append(mo4593h());
        sb.append("; focused: ");
        sb.append(mo4597i());
        sb.append("; selected: ");
        sb.append(mo4603l());
        sb.append("; clickable: ");
        sb.append(mo4605m());
        sb.append("; longClickable: ");
        sb.append(mo4607n());
        sb.append("; enabled: ");
        sb.append(mo4609o());
        sb.append("; password: ");
        sb.append(mo4611p());
        sb.append("; scrollable: " + mo4612q());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0865a> x = mo4620x();
            for (int i = 0; i < x.size(); i++) {
                C0865a aVar = x.get(i);
                String e = m4180e(aVar.mo4623a());
                if (e.equals("ACTION_UNKNOWN") && aVar.mo4626b() != null) {
                    e = aVar.mo4626b().toString();
                }
                sb.append(e);
                if (i != x.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int d = mo4577d();
            while (d != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(d);
                d &= ~numberOfTrailingZeros;
                sb.append(m4180e(numberOfTrailingZeros));
                if (d != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: androidx.core.view.a.d$b */
    public static class C0866b {

        /* renamed from: a */
        final Object f3399a;

        C0866b(Object obj) {
            this.f3399a = obj;
        }

        /* renamed from: a */
        public static C0866b m4256a(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0866b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C0866b(null);
        }

        /* renamed from: a */
        public static C0866b m4257a(int i, int i2, boolean z, int i3) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new C0866b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0866b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new C0866b(null);
        }
    }

    /* renamed from: androidx.core.view.a.d$c */
    public static class C0867c {

        /* renamed from: a */
        final Object f3400a;

        C0867c(Object obj) {
            this.f3400a = obj;
        }

        /* renamed from: a */
        public static C0867c m4258a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (Build.VERSION.SDK_INT >= 21) {
                return new C0867c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0867c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0867c(null);
        }
    }

    /* renamed from: androidx.core.view.a.d$d */
    public static class C0868d {

        /* renamed from: a */
        final Object f3401a;

        C0868d(Object obj) {
            this.f3401a = obj;
        }

        /* renamed from: a */
        public static C0868d m4259a(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C0868d(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new C0868d(null);
        }
    }

    /* renamed from: a */
    public static C0864d m4171a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0864d(accessibilityNodeInfo);
    }

    /* renamed from: b */
    public void mo4563b(Rect rect) {
        this.f3356b.setBoundsInParent(rect);
    }

    /* renamed from: e */
    public void mo4582e(CharSequence charSequence) {
        this.f3356b.setContentDescription(charSequence);
    }

    /* renamed from: g */
    public void mo4589g(boolean z) {
        this.f3356b.setSelected(z);
    }

    /* renamed from: h */
    public void mo4592h(boolean z) {
        this.f3356b.setClickable(z);
    }

    /* renamed from: i */
    public void mo4596i(boolean z) {
        this.f3356b.setLongClickable(z);
    }

    /* renamed from: j */
    public void mo4598j(boolean z) {
        this.f3356b.setEnabled(z);
    }

    /* renamed from: k */
    public void mo4600k(boolean z) {
        this.f3356b.setScrollable(z);
    }

    private C0864d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3356b = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public static C0864d m4170a(View view) {
        return m4171a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: f */
    private SparseArray<WeakReference<ClickableSpan>> m4181f(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    /* renamed from: c */
    public void mo4571c(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3356b.setMaxTextLength(i);
        }
    }

    /* renamed from: d */
    public void mo4578d(Rect rect) {
        this.f3356b.setBoundsInScreen(rect);
    }

    /* renamed from: g */
    public void mo4588g(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3356b.setError(charSequence);
        }
    }

    /* renamed from: l */
    public void mo4602l(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.setCanOpenPopup(z);
        }
    }

    /* renamed from: m */
    public void mo4604m(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.setDismissable(z);
        }
    }

    /* renamed from: a */
    public static C0864d m4172a(C0864d dVar) {
        return m4171a(AccessibilityNodeInfo.obtain(dVar.f3356b));
    }

    /* renamed from: d */
    private boolean m4177d(int i) {
        Bundle y = mo4621y();
        if (y != null && (y.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private SparseArray<WeakReference<ClickableSpan>> m4179e(View view) {
        SparseArray<WeakReference<ClickableSpan>> f = m4181f(view);
        if (f != null) {
            return f;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: b */
    public void mo4562b(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3356b.setMovementGranularities(i);
        }
    }

    /* renamed from: c */
    public void mo4572c(Rect rect) {
        this.f3356b.getBoundsInScreen(rect);
    }

    /* renamed from: f */
    public void mo4585f(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3356b.setHintText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: h */
    public void mo4591h(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3356b.setPaneTitle(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: i */
    public void mo4595i(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3356b.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    /* renamed from: n */
    public void mo4606n(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3356b.setScreenReaderFocusable(z);
        } else {
            m4174a(1, z);
        }
    }

    /* renamed from: o */
    public void mo4608o(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3356b.setShowingHintText(z);
        } else {
            m4174a(4, z);
        }
    }

    /* renamed from: p */
    public void mo4610p(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3356b.setHeading(z);
        } else {
            m4174a(2, z);
        }
    }

    /* renamed from: d */
    public static ClickableSpan[] m4178d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: g */
    private void m4182g(View view) {
        SparseArray<WeakReference<ClickableSpan>> f = m4181f(view);
        if (f != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < f.size(); i++) {
                if (f.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                f.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: b */
    public void mo4564b(View view) {
        this.f3357c = -1;
        this.f3356b.setSource(view);
    }

    /* renamed from: c */
    public void mo4573c(View view) {
        this.f3356b.addChild(view);
    }

    /* renamed from: e */
    public void mo4583e(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3356b.setVisibleToUser(z);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0864d)) {
            return false;
        }
        C0864d dVar = (C0864d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3356b;
        if (accessibilityNodeInfo == null) {
            if (dVar.f3356b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f3356b)) {
            return false;
        }
        if (this.f3357c == dVar.f3357c && this.f3355a == dVar.f3355a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo4586f(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3356b.setAccessibilityFocused(z);
        }
    }

    /* renamed from: a */
    private List<Integer> m4173a(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f3356b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f3356b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: d */
    public void mo4579d(View view) {
        this.f3355a = -1;
        this.f3356b.setParent(view);
    }

    /* renamed from: b */
    public void mo4566b(CharSequence charSequence) {
        this.f3356b.setClassName(charSequence);
    }

    /* renamed from: c */
    public void mo4575c(CharSequence charSequence) {
        this.f3356b.setText(charSequence);
    }

    /* renamed from: d */
    public void mo4580d(boolean z) {
        this.f3356b.setFocused(z);
    }

    /* renamed from: b */
    public void mo4567b(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3356b;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((C0867c) obj).f3400a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: c */
    public void mo4576c(boolean z) {
        this.f3356b.setFocusable(z);
    }

    /* renamed from: a */
    public void mo4552a(int i) {
        this.f3356b.addAction(i);
    }

    /* renamed from: b */
    public void mo4568b(boolean z) {
        this.f3356b.setChecked(z);
    }

    /* renamed from: a */
    public void mo4553a(Rect rect) {
        this.f3356b.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public boolean mo4569b(C0865a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f3356b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3395L);
        }
        return false;
    }

    /* renamed from: a */
    private int m4169a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f3354d;
        f3354d = i2 + 1;
        return i2;
    }

    /* renamed from: b */
    public void mo4565b(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3356b.addChild(view, i);
        }
    }

    /* renamed from: c */
    public void mo4574c(View view, int i) {
        this.f3355a = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3356b.setParent(view, i);
        }
    }

    /* renamed from: a */
    private void m4174a(int i, boolean z) {
        Bundle y = mo4621y();
        if (y != null) {
            int i2 = y.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            y.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: a */
    private void m4175a(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m4173a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }
}
