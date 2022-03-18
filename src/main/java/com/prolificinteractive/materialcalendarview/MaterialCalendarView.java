package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26988e;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26990g;
import com.prolificinteractive.materialcalendarview.p1228a.AbstractC26991h;
import com.prolificinteractive.materialcalendarview.p1228a.C26984a;
import com.prolificinteractive.materialcalendarview.p1228a.C26987d;
import com.prolificinteractive.materialcalendarview.p1228a.C26989f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MaterialCalendarView extends ViewGroup {

    /* renamed from: h */
    private static final AbstractC26990g f66948h = new C26987d();
    @SelectionMode

    /* renamed from: A */
    private int f66949A;

    /* renamed from: B */
    private boolean f66950B;

    /* renamed from: C */
    private int f66951C;

    /* renamed from: D */
    private C26981b f66952D;

    /* renamed from: a */
    public final C27010q f66953a;

    /* renamed from: b */
    public final C27003k f66954b;

    /* renamed from: c */
    public final C27003k f66955c;

    /* renamed from: d */
    public final C26992b f66956d;

    /* renamed from: e */
    public AbstractC26993c<?> f66957e;

    /* renamed from: f */
    public CalendarDay f66958f;

    /* renamed from: g */
    CharSequence f66959g;

    /* renamed from: i */
    private final TextView f66960i;

    /* renamed from: j */
    private LinearLayout f66961j;

    /* renamed from: k */
    private CalendarMode f66962k;

    /* renamed from: l */
    private boolean f66963l;

    /* renamed from: m */
    private final ArrayList<AbstractC26999h> f66964m;

    /* renamed from: n */
    private final View.OnClickListener f66965n;

    /* renamed from: o */
    private final ViewPager.OnPageChangeListener f66966o;

    /* renamed from: p */
    private CalendarDay f66967p;

    /* renamed from: q */
    private CalendarDay f66968q;

    /* renamed from: r */
    private AbstractC27007n f66969r;

    /* renamed from: s */
    private AbstractC27008o f66970s;

    /* renamed from: t */
    private AbstractC27009p f66971t;

    /* renamed from: u */
    private int f66972u;

    /* renamed from: v */
    private int f66973v;

    /* renamed from: w */
    private Drawable f66974w;

    /* renamed from: x */
    private Drawable f66975x;

    /* renamed from: y */
    private int f66976y;

    /* renamed from: z */
    private int f66977z;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface SelectionMode {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ShowOtherDates {
    }

    /* renamed from: a */
    public static boolean m98041a(@ShowOtherDates int i) {
        return (i & 1) != 0;
    }

    /* renamed from: b */
    public static boolean m98043b(@ShowOtherDates int i) {
        return (i & 2) != 0;
    }

    /* renamed from: c */
    public static boolean m98044c(@ShowOtherDates int i) {
        return (i & 4) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: g */
    public boolean mo95924g() {
        return this.f66950B;
    }

    public int getArrowColor() {
        return this.f66973v;
    }

    public int getFirstDayOfWeek() {
        return this.f66951C;
    }

    public Drawable getLeftArrowMask() {
        return this.f66974w;
    }

    public CalendarDay getMaximumDate() {
        return this.f66968q;
    }

    public CalendarDay getMinimumDate() {
        return this.f66967p;
    }

    public Drawable getRightArrowMask() {
        return this.f66975x;
    }

    public int getSelectionColor() {
        return this.f66972u;
    }

    @SelectionMode
    public int getSelectionMode() {
        return this.f66949A;
    }

    public int getTileHeight() {
        return this.f66976y;
    }

    public int getTileWidth() {
        return this.f66977z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95911a(C26998g gVar) {
        CalendarDay currentDate = getCurrentDate();
        CalendarDay b = gVar.mo96084b();
        int c = currentDate.mo95892c();
        int c2 = b.mo95892c();
        if (this.f66962k == CalendarMode.MONTHS && this.f66950B && c != c2) {
            if (currentDate.mo95891b(b)) {
                mo95912b();
            } else if (currentDate.mo95887a(b)) {
                mo95915c();
            }
        }
        mo95918d(gVar.mo96084b(), !gVar.isChecked());
    }

    public List<CalendarDay> getSelectedDates() {
        return this.f66957e.mo96037e();
    }

    @ShowOtherDates
    public int getShowOtherDates() {
        return this.f66957e.mo96030b();
    }

    public int getTitleAnimationOrientation() {
        return this.f66953a.mo96107a();
    }

    /* renamed from: h */
    public void mo95946h() {
        this.f66957e.mo96023a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C26980a generateDefaultLayoutParams() {
        return new C26980a(1);
    }

    /* renamed from: j */
    public C26982c mo95948j() {
        return new C26982c();
    }

    /* renamed from: e */
    public boolean mo95922e() {
        if (this.f66956d.getCurrentItem() > 0) {
            return true;
        }
        return false;
    }

    public CalendarDay getCurrentDate() {
        return this.f66957e.mo96040f(this.f66956d.getCurrentItem());
    }

    public int getTileSize() {
        return Math.max(this.f66976y, this.f66977z);
    }

    public boolean getTopbarVisible() {
        if (this.f66961j.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$4 */
    public static /* synthetic */ class C269784 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66981a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.prolificinteractive.materialcalendarview.CalendarMode[] r0 = com.prolificinteractive.materialcalendarview.CalendarMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.prolificinteractive.materialcalendarview.MaterialCalendarView.C269784.f66981a = r0
                com.prolificinteractive.materialcalendarview.CalendarMode r1 = com.prolificinteractive.materialcalendarview.CalendarMode.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.prolificinteractive.materialcalendarview.MaterialCalendarView.C269784.f66981a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.prolificinteractive.materialcalendarview.CalendarMode r1 = com.prolificinteractive.materialcalendarview.CalendarMode.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.C269784.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo95912b() {
        if (mo95922e()) {
            C26992b bVar = this.f66956d;
            bVar.setCurrentItem(bVar.getCurrentItem() - 1, true);
        }
    }

    /* renamed from: c */
    public void mo95915c() {
        if (mo95919d()) {
            C26992b bVar = this.f66956d;
            bVar.setCurrentItem(bVar.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: d */
    public boolean mo95919d() {
        if (this.f66956d.getCurrentItem() < this.f66957e.getCount() - 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo95923f() {
        List<CalendarDay> selectedDates = getSelectedDates();
        this.f66957e.mo96035d();
        for (CalendarDay calendarDay : selectedDates) {
            mo95916c(calendarDay, false);
        }
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.f66959g;
        if (charSequence != null) {
            return charSequence;
        }
        return getContext().getString(R.string.calendar);
    }

    public CalendarDay getSelectedDate() {
        List<CalendarDay> e = this.f66957e.mo96037e();
        if (e.isEmpty()) {
            return null;
        }
        return e.get(e.size() - 1);
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$c */
    public class C26982c {

        /* renamed from: a */
        public CalendarMode f67006a = CalendarMode.MONTHS;

        /* renamed from: b */
        public int f67007b = Calendar.getInstance().getFirstDayOfWeek();

        /* renamed from: c */
        public boolean f67008c = false;

        /* renamed from: d */
        public CalendarDay f67009d = null;

        /* renamed from: e */
        public CalendarDay f67010e = null;

        /* renamed from: a */
        public void mo96007a() {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.mo95910a(new C26981b(this));
        }

        /* renamed from: a */
        public C26982c mo96003a(int i) {
            this.f67007b = i;
            return this;
        }

        /* renamed from: b */
        public C26982c mo96008b(CalendarDay calendarDay) {
            this.f67010e = calendarDay;
            return this;
        }

        /* renamed from: a */
        public C26982c mo96004a(CalendarDay calendarDay) {
            this.f67009d = calendarDay;
            return this;
        }

        /* renamed from: a */
        public C26982c mo96005a(CalendarMode calendarMode) {
            this.f67006a = calendarMode;
            return this;
        }

        public C26982c() {
        }

        /* renamed from: a */
        public C26982c mo96006a(boolean z) {
            this.f67008c = z;
            return this;
        }
    }

    private int getWeekCountBasedOnMode() {
        AbstractC26993c<?> cVar;
        C26992b bVar;
        int i = this.f66962k.visibleWeeksCount;
        if (this.f66962k.equals(CalendarMode.MONTHS) && this.f66963l && (cVar = this.f66957e) != null && (bVar = this.f66956d) != null) {
            Calendar calendar = (Calendar) cVar.mo96040f(bVar.getCurrentItem()).mo95897f().clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.setFirstDayOfWeek(getFirstDayOfWeek());
            i = calendar.get(4);
        }
        return i + 1;
    }

    /* renamed from: k */
    private void m98046k() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f66961j = linearLayout;
        linearLayout.setOrientation(0);
        this.f66961j.setClipChildren(false);
        this.f66961j.setClipToPadding(false);
        addView(this.f66961j, new C26980a(1));
        this.f66954b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f66961j.addView(this.f66954b, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f66960i.setGravity(17);
        this.f66961j.addView(this.f66960i, new LinearLayout.LayoutParams(0, -1, 5.0f));
        this.f66955c.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f66961j.addView(this.f66955c, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f66956d.setId(R.id.mcv_pager);
        this.f66956d.setOffscreenPageLimit(1);
        addView(this.f66956d, new C26980a(this.f66962k.visibleWeeksCount + 1));
    }

    /* renamed from: a */
    public void mo95906a() {
        this.f66953a.mo96110a(this.f66958f);
        this.f66954b.setEnabled(mo95922e());
        this.f66955c.setEnabled(mo95919d());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f66982a = getSelectionColor();
        savedState.f66983b = this.f66957e.mo96039f();
        savedState.f66984c = this.f66957e.mo96041g();
        savedState.f66985d = getShowOtherDates();
        savedState.f66986e = mo95924g();
        savedState.f66987f = getMinimumDate();
        savedState.f66988g = getMaximumDate();
        savedState.f66989h = getSelectedDates();
        savedState.f66990i = getFirstDayOfWeek();
        savedState.f66991j = getTitleAnimationOrientation();
        savedState.f66995n = getSelectionMode();
        savedState.f66992k = getTileWidth();
        savedState.f66993l = getTileHeight();
        savedState.f66994m = getTopbarVisible();
        savedState.f66997p = this.f66962k;
        savedState.f66996o = this.f66963l;
        savedState.f66998q = this.f66958f;
        savedState.f66999r = this.f66952D.f67004e;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C26980a;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z) {
        this.f66950B = z;
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.f66959g = charSequence;
    }

    public void setDynamicHeightEnabled(boolean z) {
        this.f66963l = z;
    }

    public void setOnDateChangedListener(AbstractC27007n nVar) {
        this.f66969r = nVar;
    }

    public void setOnMonthChangedListener(AbstractC27008o oVar) {
        this.f66970s = oVar;
    }

    public void setOnRangeSelectedListener(AbstractC27009p pVar) {
        this.f66971t = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$a */
    public static class C26980a extends ViewGroup.MarginLayoutParams {
        public C26980a(int i) {
            super(-1, i);
        }
    }

    public MaterialCalendarView(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f66956d.dispatchTouchEvent(motionEvent);
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f66955c.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f66954b.setContentDescription(charSequence);
    }

    public void setCurrentDate(CalendarDay calendarDay) {
        mo95914b(calendarDay, true);
    }

    public void setDateTextAppearance(int i) {
        this.f66957e.mo96034c(i);
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.f66974w = drawable;
        this.f66954b.setImageDrawable(drawable);
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.f66960i.setOnClickListener(onClickListener);
    }

    public void setRightArrowMask(Drawable drawable) {
        this.f66975x = drawable;
        this.f66955c.setImageDrawable(drawable);
    }

    public void setSelectedDate(Calendar calendar) {
        setSelectedDate(CalendarDay.m98025a(calendar));
    }

    public void setShowOtherDates(@ShowOtherDates int i) {
        this.f66957e.mo96036d(i);
    }

    public void setTileHeight(int i) {
        this.f66976y = i;
        requestLayout();
    }

    public void setTileHeightDp(int i) {
        setTileHeight(m98045d(i));
    }

    public void setTileSize(int i) {
        this.f66977z = i;
        this.f66976y = i;
        requestLayout();
    }

    public void setTileSizeDp(int i) {
        setTileSize(m98045d(i));
    }

    public void setTileWidth(int i) {
        this.f66977z = i;
        requestLayout();
    }

    public void setTileWidthDp(int i) {
        setTileWidth(m98045d(i));
    }

    public void setTitleAnimationOrientation(int i) {
        this.f66953a.mo96108a(i);
    }

    public void setWeekDayTextAppearance(int i) {
        this.f66957e.mo96038e(i);
    }

    /* renamed from: d */
    private int m98045d(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public C26980a generateLayoutParams(AttributeSet attributeSet) {
        return new C26980a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo95913b(CalendarDay calendarDay) {
        mo95916c(calendarDay, false);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C26980a(1);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    public void setCurrentDate(Calendar calendar) {
        setCurrentDate(CalendarDay.m98025a(calendar));
    }

    public void setDayFormatter(AbstractC26988e eVar) {
        AbstractC26993c<?> cVar = this.f66957e;
        if (eVar == null) {
            eVar = AbstractC26988e.f67016a;
        }
        cVar.mo96025a(eVar);
    }

    public void setHeaderTextAppearance(int i) {
        this.f66960i.setTextAppearance(getContext(), i);
    }

    public void setPagingEnabled(boolean z) {
        this.f66956d.mo96016a(z);
        mo95906a();
    }

    public void setSelectedDate(CalendarDay calendarDay) {
        mo95923f();
        if (calendarDay != null) {
            mo95909a(calendarDay, true);
        }
    }

    public void setTitleMonths(int i) {
        setTitleMonths(getResources().getTextArray(i));
    }

    public void setTopbarVisible(boolean z) {
        int i;
        LinearLayout linearLayout = this.f66961j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
        requestLayout();
    }

    public void setWeekDayFormatter(AbstractC26991h hVar) {
        AbstractC26993c<?> cVar = this.f66957e;
        if (hVar == null) {
            hVar = AbstractC26991h.f67018a;
        }
        cVar.mo96027a(hVar);
    }

    public void setWeekDayLabels(int i) {
        setWeekDayLabels(getResources().getTextArray(i));
    }

    public void setArrowColor(int i) {
        if (i != 0) {
            this.f66973v = i;
            this.f66954b.mo96099a(i);
            this.f66955c.mo96099a(i);
            invalidate();
        }
    }

    public void setCurrentDate(Date date) {
        setCurrentDate(CalendarDay.m98026a(date));
    }

    public void setSelectedDate(Date date) {
        setSelectedDate(CalendarDay.m98026a(date));
    }

    public void setSelectionColor(int i) {
        if (i == 0) {
            if (isInEditMode()) {
                i = -7829368;
            } else {
                return;
            }
        }
        this.f66972u = i;
        this.f66957e.mo96031b(i);
        invalidate();
    }

    public void setTitleFormatter(AbstractC26990g gVar) {
        if (gVar == null) {
            gVar = f66948h;
        }
        this.f66953a.mo96111a(gVar);
        this.f66957e.mo96026a(gVar);
        mo95906a();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new C26989f(charSequenceArr));
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new C26984a(charSequenceArr));
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.prolificinteractive.materialcalendarview.MaterialCalendarView.SavedState.C269791 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        int f66982a;

        /* renamed from: b */
        int f66983b;

        /* renamed from: c */
        int f66984c;

        /* renamed from: d */
        int f66985d;

        /* renamed from: e */
        boolean f66986e;

        /* renamed from: f */
        CalendarDay f66987f;

        /* renamed from: g */
        CalendarDay f66988g;

        /* renamed from: h */
        List<CalendarDay> f66989h;

        /* renamed from: i */
        int f66990i;

        /* renamed from: j */
        int f66991j;

        /* renamed from: k */
        int f66992k;

        /* renamed from: l */
        int f66993l;

        /* renamed from: m */
        boolean f66994m;

        /* renamed from: n */
        int f66995n;

        /* renamed from: o */
        boolean f66996o;

        /* renamed from: p */
        CalendarMode f66997p;

        /* renamed from: q */
        CalendarDay f66998q;

        /* renamed from: r */
        boolean f66999r;

        SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f66985d = 4;
            this.f66986e = true;
            this.f66989h = new ArrayList();
            this.f66990i = 1;
            this.f66991j = 0;
            this.f66992k = -1;
            this.f66993l = -1;
            this.f66994m = true;
            this.f66995n = 1;
            this.f66996o = false;
            this.f66997p = CalendarMode.MONTHS;
            this.f66998q = null;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            boolean z2;
            boolean z3;
            CalendarMode calendarMode;
            this.f66985d = 4;
            boolean z4 = true;
            this.f66986e = true;
            this.f66989h = new ArrayList();
            this.f66990i = 1;
            this.f66991j = 0;
            this.f66992k = -1;
            this.f66993l = -1;
            this.f66994m = true;
            this.f66995n = 1;
            this.f66996o = false;
            this.f66997p = CalendarMode.MONTHS;
            this.f66998q = null;
            this.f66982a = parcel.readInt();
            this.f66983b = parcel.readInt();
            this.f66984c = parcel.readInt();
            this.f66985d = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f66986e = z;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f66987f = (CalendarDay) parcel.readParcelable(classLoader);
            this.f66988g = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f66989h, CalendarDay.CREATOR);
            this.f66990i = parcel.readInt();
            this.f66991j = parcel.readInt();
            this.f66992k = parcel.readInt();
            this.f66993l = parcel.readInt();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f66994m = z2;
            this.f66995n = parcel.readInt();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f66996o = z3;
            if (parcel.readInt() == 1) {
                calendarMode = CalendarMode.WEEKS;
            } else {
                calendarMode = CalendarMode.MONTHS;
            }
            this.f66997p = calendarMode;
            this.f66998q = (CalendarDay) parcel.readParcelable(classLoader);
            this.f66999r = parcel.readByte() == 0 ? false : z4;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f66982a);
            parcel.writeInt(this.f66983b);
            parcel.writeInt(this.f66984c);
            parcel.writeInt(this.f66985d);
            parcel.writeByte(this.f66986e ? (byte) 1 : 0);
            parcel.writeParcelable(this.f66987f, 0);
            parcel.writeParcelable(this.f66988g, 0);
            parcel.writeTypedList(this.f66989h);
            parcel.writeInt(this.f66990i);
            parcel.writeInt(this.f66991j);
            parcel.writeInt(this.f66992k);
            parcel.writeInt(this.f66993l);
            parcel.writeInt(this.f66994m ? 1 : 0);
            parcel.writeInt(this.f66995n);
            parcel.writeInt(this.f66996o ? 1 : 0);
            if (this.f66997p == CalendarMode.WEEKS) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            parcel.writeParcelable(this.f66998q, 0);
            parcel.writeByte(this.f66999r ? (byte) 1 : 0);
        }
    }

    /* renamed from: a */
    private static int m98040a(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            i = 16843829;
        } else {
            i = context.getResources().getIdentifier("colorAccent", "attr", context.getPackageName());
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public void setSelectionMode(@SelectionMode int i) {
        int i2 = this.f66949A;
        this.f66949A = i;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.f66949A = 0;
                    if (i2 != 0) {
                        mo95923f();
                    }
                } else {
                    mo95923f();
                }
            }
        } else if ((i2 == 2 || i2 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        AbstractC26993c<?> cVar = this.f66957e;
        if (this.f66949A != 0) {
            z = true;
        }
        cVar.mo96028a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95907a(CalendarDay calendarDay) {
        AbstractC27008o oVar = this.f66970s;
        if (oVar != null) {
            oVar.mo96105a(this, calendarDay);
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        mo95948j().mo96003a(savedState.f66990i).mo96005a(savedState.f66997p).mo96004a(savedState.f66987f).mo96008b(savedState.f66988g).mo96006a(savedState.f66999r).mo96007a();
        setSelectionColor(savedState.f66982a);
        setDateTextAppearance(savedState.f66983b);
        setWeekDayTextAppearance(savedState.f66984c);
        setShowOtherDates(savedState.f66985d);
        setAllowClickDaysOutsideCurrentMonth(savedState.f66986e);
        mo95923f();
        for (CalendarDay calendarDay : savedState.f66989h) {
            mo95909a(calendarDay, true);
        }
        setTitleAnimationOrientation(savedState.f66991j);
        setTileWidth(savedState.f66992k);
        setTileHeight(savedState.f66993l);
        setTopbarVisible(savedState.f66994m);
        setSelectionMode(savedState.f66995n);
        setDynamicHeightEnabled(savedState.f66996o);
        setCurrentDate(savedState.f66998q);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r3.mo95887a(r4) == false) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95910a(com.prolificinteractive.materialcalendarview.MaterialCalendarView.C26981b r8) {
        /*
        // Method dump skipped, instructions count: 270
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.mo95910a(com.prolificinteractive.materialcalendarview.MaterialCalendarView$b):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo95916c(CalendarDay calendarDay, boolean z) {
        AbstractC27007n nVar = this.f66969r;
        if (nVar != null) {
            nVar.mo96104a(this, calendarDay, z);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$b */
    public class C26981b {

        /* renamed from: a */
        public final CalendarMode f67000a;

        /* renamed from: b */
        public final int f67001b;

        /* renamed from: c */
        public final CalendarDay f67002c;

        /* renamed from: d */
        public final CalendarDay f67003d;

        /* renamed from: e */
        public final boolean f67004e;

        private C26981b(C26982c cVar) {
            this.f67000a = cVar.f67006a;
            this.f67001b = cVar.f67007b;
            this.f67002c = cVar.f67009d;
            this.f67003d = cVar.f67010e;
            this.f67004e = cVar.f67008c;
        }
    }

    /* renamed from: a */
    private static int m98039a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* renamed from: b */
    private void m98042b(CalendarDay calendarDay, CalendarDay calendarDay2) {
        CalendarDay calendarDay3 = this.f66958f;
        this.f66957e.mo96032b(calendarDay, calendarDay2);
        this.f66958f = calendarDay3;
        if (calendarDay != null) {
            if (!calendarDay.mo95891b(calendarDay3)) {
                calendarDay = this.f66958f;
            }
            this.f66958f = calendarDay;
        }
        this.f66956d.setCurrentItem(this.f66957e.mo96018a(calendarDay3), false);
        mo95906a();
    }

    /* renamed from: b */
    public void mo95914b(CalendarDay calendarDay, boolean z) {
        if (calendarDay != null) {
            this.f66956d.setCurrentItem(this.f66957e.mo96018a(calendarDay), z);
            mo95906a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo95918d(CalendarDay calendarDay, boolean z) {
        int i = this.f66949A;
        if (i == 2) {
            this.f66957e.mo96024a(calendarDay, z);
            mo95916c(calendarDay, z);
        } else if (i != 3) {
            this.f66957e.mo96035d();
            this.f66957e.mo96024a(calendarDay, true);
            mo95916c(calendarDay, true);
        } else {
            this.f66957e.mo96024a(calendarDay, z);
            if (this.f66957e.mo96037e().size() > 2) {
                this.f66957e.mo96035d();
                this.f66957e.mo96024a(calendarDay, z);
                mo95916c(calendarDay, z);
            } else if (this.f66957e.mo96037e().size() == 2) {
                List<CalendarDay> e = this.f66957e.mo96037e();
                if (e.get(0).mo95891b(e.get(1))) {
                    mo95908a(e.get(1), e.get(0));
                } else {
                    mo95908a(e.get(0), e.get(1));
                }
            } else {
                this.f66957e.mo96024a(calendarDay, z);
                mo95916c(calendarDay, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        int i4 = paddingLeft / 7;
        int i5 = paddingTop / weekCountBasedOnMode;
        int i6 = this.f66977z;
        int i7 = -1;
        if (i6 == -10 && this.f66976y == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    i4 = Math.min(i4, i5);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                i4 = i5;
            } else {
                i4 = -1;
            }
            i5 = -1;
        } else {
            if (i6 > 0) {
                i4 = i6;
            }
            int i8 = this.f66976y;
            if (i8 > 0) {
                i7 = i4;
                i5 = i8;
            } else {
                i7 = i4;
            }
            i4 = -1;
        }
        if (i4 > 0) {
            i5 = i4;
        } else if (i4 <= 0) {
            if (i7 <= 0) {
                i3 = m98045d(44);
            } else {
                i3 = i7;
            }
            if (i5 <= 0) {
                i5 = m98045d(44);
            }
            i4 = i3;
        } else {
            i4 = i7;
        }
        int i9 = i4 * 7;
        setMeasuredDimension(m98039a(getPaddingLeft() + getPaddingRight() + i9, i), m98039a((weekCountBasedOnMode * i5) + getPaddingTop() + getPaddingBottom(), i2));
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(((C26980a) childAt.getLayoutParams()).height * i5, 1073741824));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo95908a(CalendarDay calendarDay, CalendarDay calendarDay2) {
        AbstractC27009p pVar = this.f66971t;
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTime(calendarDay.mo95895e());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(calendarDay2.mo95895e());
        while (true) {
            if (!instance.before(instance2) && !instance.equals(instance2)) {
                break;
            }
            CalendarDay a = CalendarDay.m98025a(instance);
            this.f66957e.mo96024a(a, true);
            arrayList.add(a);
            instance.add(5, 1);
        }
        if (pVar != null) {
            pVar.mo96106a(this, arrayList);
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f66964m = new ArrayList<>();
        View$OnClickListenerC269751 r0 = new View.OnClickListener() {
            /* class com.prolificinteractive.materialcalendarview.MaterialCalendarView.View$OnClickListenerC269751 */

            public void onClick(View view) {
                if (view == MaterialCalendarView.this.f66955c) {
                    MaterialCalendarView.this.f66956d.setCurrentItem(MaterialCalendarView.this.f66956d.getCurrentItem() + 1, true);
                } else if (view == MaterialCalendarView.this.f66954b) {
                    MaterialCalendarView.this.f66956d.setCurrentItem(MaterialCalendarView.this.f66956d.getCurrentItem() - 1, true);
                }
            }
        };
        this.f66965n = r0;
        C269762 r1 = new ViewPager.OnPageChangeListener() {
            /* class com.prolificinteractive.materialcalendarview.MaterialCalendarView.C269762 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                MaterialCalendarView.this.f66953a.mo96112b(MaterialCalendarView.this.f66958f);
                MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
                materialCalendarView.f66958f = materialCalendarView.f66957e.mo96040f(i);
                MaterialCalendarView.this.mo95906a();
                MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
                materialCalendarView2.mo95907a(materialCalendarView2.f66958f);
            }
        };
        this.f66966o = r1;
        this.f66967p = null;
        this.f66968q = null;
        this.f66972u = 0;
        this.f66973v = -16777216;
        this.f66976y = -10;
        this.f66977z = -10;
        this.f66949A = 1;
        this.f66950B = true;
        if (Build.VERSION.SDK_INT >= 19) {
            setClipToPadding(false);
            setClipChildren(false);
        } else {
            setClipChildren(true);
            setClipToPadding(true);
        }
        C27003k kVar = new C27003k(getContext());
        this.f66954b = kVar;
        kVar.setContentDescription(getContext().getString(R.string.previous));
        TextView textView = new TextView(getContext());
        this.f66960i = textView;
        C27003k kVar2 = new C27003k(getContext());
        this.f66955c = kVar2;
        kVar2.setContentDescription(getContext().getString(R.string.next));
        C26992b bVar = new C26992b(getContext());
        this.f66956d = bVar;
        kVar.setOnClickListener(r0);
        kVar2.setOnClickListener(r0);
        C27010q qVar = new C27010q(textView);
        this.f66953a = qVar;
        qVar.mo96111a(f66948h);
        bVar.setOnPageChangeListener(r1);
        bVar.setPageTransformer(false, new ViewPager.AbstractC1579d() {
            /* class com.prolificinteractive.materialcalendarview.MaterialCalendarView.C269773 */

            @Override // androidx.viewpager.widget.ViewPager.AbstractC1579d
            /* renamed from: a */
            public void mo8241a(View view, float f) {
                view.setAlpha((float) Math.sqrt((double) (1.0f - Math.abs(f))));
            }
        });
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.mcv_allowClickDaysOutsideCurrentMonth, R.attr.mcv_arrowColor, R.attr.mcv_calendarMode, R.attr.mcv_dateTextAppearance, R.attr.mcv_firstDayOfWeek, R.attr.mcv_headerTextAppearance, R.attr.mcv_leftArrowMask, R.attr.mcv_monthLabels, R.attr.mcv_rightArrowMask, R.attr.mcv_selectionColor, R.attr.mcv_showOtherDates, R.attr.mcv_tileHeight, R.attr.mcv_tileSize, R.attr.mcv_tileWidth, R.attr.mcv_titleAnimationOrientation, R.attr.mcv_weekDayLabels, R.attr.mcv_weekDayTextAppearance}, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(2, 0);
            this.f66951C = obtainStyledAttributes.getInteger(4, -1);
            qVar.mo96108a(obtainStyledAttributes.getInteger(14, 0));
            if (this.f66951C < 0) {
                this.f66951C = Calendar.getInstance().getFirstDayOfWeek();
            }
            mo95948j().mo96003a(this.f66951C).mo96005a(CalendarMode.values()[integer]).mo96007a();
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(12, -10);
            if (layoutDimension > -10) {
                setTileSize(layoutDimension);
            }
            int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(13, -10);
            if (layoutDimension2 > -10) {
                setTileWidth(layoutDimension2);
            }
            int layoutDimension3 = obtainStyledAttributes.getLayoutDimension(11, -10);
            if (layoutDimension3 > -10) {
                setTileHeight(layoutDimension3);
            }
            setArrowColor(obtainStyledAttributes.getColor(1, -16777216));
            Drawable drawable = obtainStyledAttributes.getDrawable(6);
            setLeftArrowMask(drawable == null ? getResources().getDrawable(R.drawable.mcv_action_previous) : drawable);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(8);
            setRightArrowMask(drawable2 == null ? getResources().getDrawable(R.drawable.mcv_action_next) : drawable2);
            setSelectionColor(obtainStyledAttributes.getColor(9, m98040a(context)));
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(15);
            if (textArray != null) {
                setWeekDayFormatter(new C26984a(textArray));
            }
            CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(7);
            if (textArray2 != null) {
                setTitleFormatter(new C26989f(textArray2));
            }
            setHeaderTextAppearance(obtainStyledAttributes.getResourceId(5, 2131886894));
            setWeekDayTextAppearance(obtainStyledAttributes.getResourceId(16, 2131886895));
            setDateTextAppearance(obtainStyledAttributes.getResourceId(3, 2131886893));
            setShowOtherDates(obtainStyledAttributes.getInteger(10, 4));
            setAllowClickDaysOutsideCurrentMonth(obtainStyledAttributes.getBoolean(0, true));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        this.f66957e.mo96026a(f66948h);
        m98046k();
        CalendarDay a = CalendarDay.m98023a();
        this.f66958f = a;
        setCurrentDate(a);
        if (isInEditMode()) {
            removeView(this.f66956d);
            C27006m mVar = new C27006m(this, this.f66958f, getFirstDayOfWeek());
            mVar.setSelectionColor(getSelectionColor());
            mVar.setDateTextAppearance(this.f66957e.mo96039f());
            mVar.setWeekDayTextAppearance(this.f66957e.mo96041g());
            mVar.setShowOtherDates(getShowOtherDates());
            addView(mVar, new C26980a(this.f66962k.visibleWeeksCount + 1));
        }
    }

    /* renamed from: a */
    public void mo95909a(CalendarDay calendarDay, boolean z) {
        if (calendarDay != null) {
            this.f66957e.mo96024a(calendarDay, z);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i3 - i) - paddingLeft) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i6 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(i6, paddingTop, measuredWidth + i6, measuredHeight);
                paddingTop = measuredHeight;
            }
        }
    }
}
