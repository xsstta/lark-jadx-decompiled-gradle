package com.ss.android.lark.calendar.impl.features.calendarview.list.view;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.list.AbstractC30813a;
import com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener;
import com.ss.android.lark.calendar.impl.features.calendarview.list.model.DateInstanceUnit;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.p1493a.C31101a;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 :2\u00020\u0001:\u0001:B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006JH\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\rH\u0002J \u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0002J\u001c\u0010+\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\r0\u0014J(\u0010-\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u00100\u001a\u00020\rH\u0002J.\u00101\u001a\u00020#2\u0006\u0010.\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010'\u001a\u00020(J0\u00102\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\u0006\u00103\u001a\u00020\r2\u0006\u00104\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0005H\u0002J\u000e\u00105\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0019J>\u00106\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u0005J\u0018\u00107\u001a\u00020#2\u0006\u00108\u001a\u0002092\u0006\u0010%\u001a\u00020\rH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fX\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListEventDateLogic;", "", "context", "Landroid/content/Context;", "isFromSearch", "", "(Landroid/content/Context;Z)V", "mChipTopLocation", "", "mContainerTopPosition", "mContext", "mDateInstanceMap", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/model/DateInstanceUnit;", "mDateTopMargin", "mDinaIternateBold", "Landroid/graphics/Typeface;", "mIsFromSearch", "mJulianDayList", "Ljava/util/ArrayList;", "mMidPositionInstanceMap", "addListDateView", "Landroid/widget/LinearLayout;", "listEventContainer", "Landroid/widget/FrameLayout;", "weekDayText", "", "monthDayText", "textColor", "viewTag", "locationY", "isReserveMargin", "isShowLunarDay", "addLunarDay", "", "linearLayout", "julianDay", "addNeedShowDate", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "firstVisiblePos", "lastVisiblePos", "hideNotShowDateView", "julianDayList", "notifyDateShow", "listener", "Lcom/ss/android/lark/calendar/impl/features/calendarview/list/IListDateShowListener;", "firstCompletePos", "notifyDateShowOnPosition", "notifyListenerToShow", "positionIndex", "dateUnit", "removeAllDateView", "showListDateView", "updateLunarDateTextColor", "lunarDayTv", "Landroid/widget/TextView;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.c */
public final class ListEventDateLogic {

    /* renamed from: c */
    public static final Companion f77715c = new Companion(null);

    /* renamed from: a */
    public ArrayList<Integer> f77716a = new ArrayList<>();

    /* renamed from: b */
    public boolean f77717b;

    /* renamed from: d */
    private int f77718d;

    /* renamed from: e */
    private Context f77719e;

    /* renamed from: f */
    private Typeface f77720f;

    /* renamed from: g */
    private HashMap<Integer, DateInstanceUnit> f77721g = new HashMap<>();

    /* renamed from: h */
    private HashMap<Integer, DateInstanceUnit> f77722h = new HashMap<>();

    /* renamed from: i */
    private final int[] f77723i = new int[2];

    /* renamed from: j */
    private int[] f77724j = new int[2];

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/list/view/ListEventDateLogic$Companion;", "", "()V", "DATE_SHOW_TOP_MARGIN", "", "DATE_VIEW_HEIGHT", "DATE_VIEW_WIDTH", "LUNAR_DATE_VIEW_HEIGHT", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo111803a(IListDateShowListener cVar, int i, int i2, int i3, RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        this.f77716a.clear();
        this.f77721g.clear();
        this.f77722h.clear();
        m115146a(recyclerView, i, i3);
        recyclerView.post(new RunnableC30862b(this, cVar));
        m115147a(recyclerView, cVar, i, i2);
    }

    /* renamed from: a */
    public final void mo111801a(FrameLayout frameLayout, int i, int i2, String str, String str2, int i3, boolean z) {
        boolean z2;
        int i4;
        Intrinsics.checkParameterIsNotNull(frameLayout, "listEventContainer");
        Intrinsics.checkParameterIsNotNull(str, "weekDayText");
        Intrinsics.checkParameterIsNotNull(str2, "monthDayText");
        frameLayout.getLocationInWindow(this.f77723i);
        int childCount = frameLayout.getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                z2 = false;
                break;
            }
            View childAt = frameLayout.getChildAt(i5);
            int i6 = -1;
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            if (childAt.getTag() != null) {
                Object tag = childAt.getTag();
                if (tag != null) {
                    i6 = ((Integer) tag).intValue();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            }
            if (i6 == i) {
                int i7 = i2 - this.f77723i[1];
                if (z && i7 < (i4 = this.f77718d)) {
                    i7 = i4;
                }
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.setMargins(0, i7, 0, 0);
                    childAt.setLayoutParams(layoutParams2);
                    z2 = true;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            } else {
                i5++;
            }
        }
        if (!z2) {
            boolean z3 = !this.f77717b && C30022a.f74884c.mo108456c().isShowLunarCalendar();
            C30022a.f74884c.mo108450a(new C30863c(this, z3, frameLayout, mo111799a(frameLayout, str, str2, i3, i, i2, z, z3), str, str2, i3, i, i2, z));
        }
    }

    /* renamed from: a */
    public final void mo111802a(FrameLayout frameLayout, ArrayList<Integer> arrayList) {
        int i;
        Intrinsics.checkParameterIsNotNull(frameLayout, "listEventContainer");
        Intrinsics.checkParameterIsNotNull(arrayList, "julianDayList");
        int i2 = 0;
        while (i2 < frameLayout.getChildCount()) {
            View childAt = frameLayout.getChildAt(i2);
            if ((childAt != null ? childAt.getTag() : null) != null) {
                Object tag = childAt.getTag();
                if (tag != null) {
                    i = ((Integer) tag).intValue();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                i = -1;
            }
            if (i == -1 || arrayList.contains(Integer.valueOf(i))) {
                i2++;
            } else {
                frameLayout.removeView(childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.c$b */
    public static final class RunnableC30862b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ListEventDateLogic f77725a;

        /* renamed from: b */
        final /* synthetic */ IListDateShowListener f77726b;

        RunnableC30862b(ListEventDateLogic cVar, IListDateShowListener cVar2) {
            this.f77725a = cVar;
            this.f77726b = cVar2;
        }

        public final void run() {
            this.f77726b.mo111712a(this.f77725a.f77716a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.c$c */
    static final class C30863c implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ListEventDateLogic f77727a;

        /* renamed from: b */
        final /* synthetic */ boolean f77728b;

        /* renamed from: c */
        final /* synthetic */ FrameLayout f77729c;

        /* renamed from: d */
        final /* synthetic */ LinearLayout f77730d;

        /* renamed from: e */
        final /* synthetic */ String f77731e;

        /* renamed from: f */
        final /* synthetic */ String f77732f;

        /* renamed from: g */
        final /* synthetic */ int f77733g;

        /* renamed from: h */
        final /* synthetic */ int f77734h;

        /* renamed from: i */
        final /* synthetic */ int f77735i;

        /* renamed from: j */
        final /* synthetic */ boolean f77736j;

        C30863c(ListEventDateLogic cVar, boolean z, FrameLayout frameLayout, LinearLayout linearLayout, String str, String str2, int i, int i2, int i3, boolean z2) {
            this.f77727a = cVar;
            this.f77728b = z;
            this.f77729c = frameLayout;
            this.f77730d = linearLayout;
            this.f77731e = str;
            this.f77732f = str2;
            this.f77733g = i;
            this.f77734h = i2;
            this.f77735i = i3;
            this.f77736j = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGetSucceed(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting r10) {
            /*
                r9 = this;
                com.ss.android.lark.calendar.impl.features.calendarview.list.view.c r0 = r9.f77727a
                boolean r0 = r0.f77717b
                if (r0 != 0) goto L_0x0014
                java.lang.String r0 = "setting"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r0)
                boolean r10 = r10.isShowLunarCalendar()
                if (r10 == 0) goto L_0x0014
                r10 = 1
                r8 = 1
                goto L_0x0016
            L_0x0014:
                r10 = 0
                r8 = 0
            L_0x0016:
                boolean r10 = r9.f77728b
                if (r8 == r10) goto L_0x0036
                android.widget.FrameLayout r10 = r9.f77729c
                android.widget.LinearLayout r0 = r9.f77730d
                android.view.View r0 = (android.view.View) r0
                r10.removeView(r0)
                com.ss.android.lark.calendar.impl.features.calendarview.list.view.c r0 = r9.f77727a
                android.widget.FrameLayout r1 = r9.f77729c
                java.lang.String r2 = r9.f77731e
                java.lang.String r3 = r9.f77732f
                int r4 = r9.f77733g
                int r5 = r9.f77734h
                int r6 = r9.f77735i
                boolean r7 = r9.f77736j
                r0.mo111799a(r1, r2, r3, r4, r5, r6, r7, r8)
            L_0x0036:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListEventDateLogic.C30863c.onGetSucceed(com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting):void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111800a(android.widget.FrameLayout r6) {
        /*
            r5 = this;
            java.lang.String r0 = "listEventContainer"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r6, r0)
            r0 = 0
        L_0x0006:
            int r1 = r6.getChildCount()
            if (r0 >= r1) goto L_0x0045
            android.view.View r1 = r6.getChildAt(r0)
            boolean r2 = r1 instanceof android.widget.LinearLayout
            r3 = -1
            if (r2 == 0) goto L_0x003b
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.Object r4 = r2.getTag()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r2.getTag()
            boolean r4 = r4 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x003b
            java.lang.Object r2 = r2.getTag()
            if (r2 == 0) goto L_0x0033
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x003c
        L_0x0033:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r6.<init>(r0)
            throw r6
        L_0x003b:
            r2 = -1
        L_0x003c:
            if (r2 == r3) goto L_0x0042
            r6.removeView(r1)
            goto L_0x0006
        L_0x0042:
            int r0 = r0 + 1
            goto L_0x0006
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListEventDateLogic.mo111800a(android.widget.FrameLayout):void");
    }

    /* renamed from: a */
    private final void m115144a(LinearLayout linearLayout, int i) {
        String a = C31101a.m116087a(i);
        TextView textView = new TextView(this.f77719e);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, C57582a.m223601a(this.f77719e, 15.0f)));
        textView.setGravity(17);
        textView.setTextSize(1, 11.0f);
        m115145a(textView, i);
        textView.setText(a);
        linearLayout.addView(textView);
    }

    public ListEventDateLogic(Context context, boolean z) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f77719e = context;
        this.f77718d = UIUtils.dp2px(context, (float) 6);
        Typeface createFromAsset = Typeface.createFromAsset(this.f77719e.getAssets(), "fonts/DINPro-Bold.ttf");
        Intrinsics.checkExpressionValueIsNotNull(createFromAsset, "Typeface.createFromAsset…PE_FACE_DINPRO_BOLD_PATH)");
        this.f77720f = createFromAsset;
        this.f77717b = z;
    }

    /* renamed from: a */
    private final void m115145a(TextView textView, int i) {
        int i2;
        int julianDay = new CalendarDate().getJulianDay();
        if (i < julianDay) {
            i2 = C57582a.m223616d(this.f77719e, R.color.lkui_N400);
        } else if (i == julianDay) {
            i2 = C57582a.m223616d(this.f77719e, R.color.lkui_B500);
        } else {
            i2 = C57582a.m223616d(this.f77719e, R.color.lkui_N500);
        }
        textView.setTextColor(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01c5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m115146a(androidx.recyclerview.widget.RecyclerView r20, int r21, int r22) {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendarview.list.view.ListEventDateLogic.m115146a(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: a */
    private final void m115147a(RecyclerView recyclerView, IListDateShowListener cVar, int i, int i2) {
        boolean z;
        boolean z2;
        Set<Integer> keySet = this.f77721g.keySet();
        Intrinsics.checkExpressionValueIsNotNull(keySet, "mDateInstanceMap.keys");
        for (Integer num : keySet) {
            DateInstanceUnit aVar = this.f77721g.get(num);
            if (aVar == null) {
                Intrinsics.throwNpe();
            }
            if (aVar.mo111666d() != -1) {
                if (aVar.mo111666d() != aVar.mo111667e() || aVar.mo111666d() >= i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m115148a(recyclerView, cVar, aVar.mo111666d(), aVar, z2);
            } else {
                if (aVar.mo111667e() == -1 || aVar.mo111667e() >= i2) {
                    z = true;
                } else {
                    z = false;
                }
                m115148a(recyclerView, cVar, i, aVar, z);
            }
        }
    }

    /* renamed from: a */
    private final void m115148a(RecyclerView recyclerView, IListDateShowListener cVar, int i, DateInstanceUnit aVar, boolean z) {
        View view;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            view = layoutManager.findViewByPosition(i);
        } else {
            view = null;
        }
        if (view != null && recyclerView.getChildViewHolder(view) != null) {
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
            if (childViewHolder instanceof AbstractC30813a) {
                ((AbstractC30813a) childViewHolder).mo111653a().getLocationInWindow(this.f77724j);
                cVar.mo111711a(aVar.mo111669f(), this.f77724j[1], aVar.mo111661a(), aVar.mo111663b(), aVar.mo111665c(), z);
            }
        }
    }

    /* renamed from: a */
    public final LinearLayout mo111799a(FrameLayout frameLayout, String str, String str2, int i, int i2, int i3, boolean z, boolean z2) {
        int i4;
        frameLayout.getLocationInWindow(this.f77723i);
        LinearLayout linearLayout = new LinearLayout(this.f77719e);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C57582a.m223601a(this.f77719e, (float) 57), C57582a.m223601a(this.f77719e, (float) 50));
        if (z2) {
            layoutParams.height = C57582a.m223601a(this.f77719e, (float) 62);
        }
        int i5 = i3 - this.f77723i[1];
        if (z && i5 < (i4 = this.f77718d)) {
            i5 = i4;
        }
        layoutParams.setMargins(0, i5, 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setTag(Integer.valueOf(i2));
        TextView textView = new TextView(this.f77719e);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        textView.setTextSize(1, 12.0f);
        textView.setTextColor(i);
        textView.setText(str);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(this.f77719e);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView2.setGravity(17);
        if (z2) {
            textView2.setTextSize(1, 20.0f);
        } else {
            textView2.setTextSize(1, 26.0f);
        }
        textView2.setTextColor(i);
        textView2.setText(str2);
        textView2.setTypeface(this.f77720f);
        linearLayout.addView(textView2);
        if (z2) {
            m115144a(linearLayout, i2);
        }
        frameLayout.addView(linearLayout);
        return linearLayout;
    }
}
