package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0844e;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import androidx.recyclerview.widget.C1395n;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.android.material.button.MaterialButton;
import com.larksuite.suite.R;
import java.util.Calendar;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.f */
public final class C22241f<S> extends AbstractC22261l<S> {

    /* renamed from: a */
    static final Object f54390a = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: b */
    static final Object f54391b = "NAVIGATION_PREV_TAG";

    /* renamed from: c */
    static final Object f54392c = "NAVIGATION_NEXT_TAG";

    /* renamed from: d */
    static final Object f54393d = "SELECTOR_TOGGLE_TAG";

    /* renamed from: e */
    public DateSelector<S> f54394e;

    /* renamed from: f */
    public CalendarConstraints f54395f;

    /* renamed from: g */
    public Month f54396g;

    /* renamed from: h */
    public C22237b f54397h;

    /* renamed from: i */
    public RecyclerView f54398i;

    /* renamed from: j */
    public RecyclerView f54399j;

    /* renamed from: k */
    public View f54400k;

    /* renamed from: m */
    private int f54401m;

    /* renamed from: n */
    private EnumC22251a f54402n;

    /* renamed from: o */
    private View f54403o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.f$a */
    public enum EnumC22251a {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.f$b */
    interface AbstractC22252b {
        /* renamed from: a */
        void mo77412a(long j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Month mo77402a() {
        return this.f54396g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public CalendarConstraints mo77405b() {
        return this.f54395f;
    }

    /* renamed from: c */
    public DateSelector<S> mo77406c() {
        return this.f54394e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C22237b mo77407d() {
        return this.f54397h;
    }

    /* renamed from: h */
    private RecyclerView.AbstractC1335d m80497h() {
        return new RecyclerView.AbstractC1335d() {
            /* class com.google.android.material.datepicker.C22241f.C222465 */

            /* renamed from: b */
            private final Calendar f54413b = C22265o.m80550c();

            /* renamed from: c */
            private final Calendar f54414c = C22265o.m80550c();

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
            public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
                int i;
                int i2;
                if ((recyclerView.getAdapter() instanceof C22266p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    C22266p pVar = (C22266p) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (C0844e<Long, Long> eVar : C22241f.this.f54394e.mo77321d()) {
                        if (!(eVar.f3317a == null || eVar.f3318b == null)) {
                            this.f54413b.setTimeInMillis(eVar.f3317a.longValue());
                            this.f54414c.setTimeInMillis(eVar.f3318b.longValue());
                            int a = pVar.mo77440a(this.f54413b.get(1));
                            int a2 = pVar.mo77440a(this.f54414c.get(1));
                            View findViewByPosition = gridLayoutManager.findViewByPosition(a);
                            View findViewByPosition2 = gridLayoutManager.findViewByPosition(a2);
                            int b = a / gridLayoutManager.mo6502b();
                            int b2 = a2 / gridLayoutManager.mo6502b();
                            for (int i3 = b; i3 <= b2; i3++) {
                                View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.mo6502b() * i3);
                                if (findViewByPosition3 != null) {
                                    int top = findViewByPosition3.getTop() + C22241f.this.f54397h.f54376d.mo77391a();
                                    int bottom = findViewByPosition3.getBottom() - C22241f.this.f54397h.f54376d.mo77393b();
                                    if (i3 == b) {
                                        i = findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2);
                                    } else {
                                        i = 0;
                                    }
                                    if (i3 == b2) {
                                        i2 = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                    } else {
                                        i2 = recyclerView.getWidth();
                                    }
                                    canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, C22241f.this.f54397h.f54380h);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public LinearLayoutManager mo77409f() {
        return (LinearLayoutManager) this.f54399j.getLayoutManager();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo77408e() {
        if (this.f54402n == EnumC22251a.YEAR) {
            mo77404a(EnumC22251a.DAY);
        } else if (this.f54402n == EnumC22251a.DAY) {
            mo77404a(EnumC22251a.YEAR);
        }
    }

    /* renamed from: a */
    static int m80492a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: a */
    private void m80495a(final int i) {
        this.f54399j.post(new Runnable() {
            /* class com.google.android.material.datepicker.C22241f.RunnableC222432 */

            public void run() {
                C22241f.this.f54399j.smoothScrollToPosition(i);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f54401m);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f54394e);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f54395f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f54396g);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f54401m = bundle.getInt("THEME_RES_ID_KEY");
        this.f54394e = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f54395f = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f54396g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77403a(Month month) {
        boolean z;
        C22257j jVar = (C22257j) this.f54399j.getAdapter();
        int a = jVar.mo77430a(month);
        int a2 = a - jVar.mo77430a(this.f54396g);
        boolean z2 = true;
        if (Math.abs(a2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (a2 <= 0) {
            z2 = false;
        }
        this.f54396g = month;
        if (z && z2) {
            this.f54399j.scrollToPosition(a - 3);
            m80495a(a);
        } else if (z) {
            this.f54399j.scrollToPosition(a + 3);
            m80495a(a);
        } else {
            m80495a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo77404a(EnumC22251a aVar) {
        this.f54402n = aVar;
        if (aVar == EnumC22251a.YEAR) {
            this.f54398i.getLayoutManager().scrollToPosition(((C22266p) this.f54398i.getAdapter()).mo77440a(this.f54396g.f54344b));
            this.f54403o.setVisibility(0);
            this.f54400k.setVisibility(8);
        } else if (aVar == EnumC22251a.DAY) {
            this.f54403o.setVisibility(8);
            this.f54400k.setVisibility(0);
            mo77403a(this.f54396g);
        }
    }

    /* renamed from: a */
    public static int m80493a(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }

    /* renamed from: a */
    private void m80496a(View view, final C22257j jVar) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(R.id.month_navigation_fragment_toggle);
        materialButton.setTag(f54393d);
        ViewCompat.m4043a(materialButton, new C0859a() {
            /* class com.google.android.material.datepicker.C22241f.C222476 */

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                String str;
                super.mo4535a(view, dVar);
                if (C22241f.this.f54400k.getVisibility() == 0) {
                    str = C22241f.this.getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    str = C22241f.this.getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                dVar.mo4585f(str);
            }
        });
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(R.id.month_navigation_previous);
        materialButton2.setTag(f54391b);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(R.id.month_navigation_next);
        materialButton3.setTag(f54392c);
        this.f54403o = view.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f54400k = view.findViewById(R.id.mtrl_calendar_day_selector_frame);
        mo77404a(EnumC22251a.DAY);
        materialButton.setText(this.f54396g.mo77364d());
        this.f54399j.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.google.android.material.datepicker.C22241f.C222487 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 0) {
                    CharSequence text = materialButton.getText();
                    if (Build.VERSION.SDK_INT >= 16) {
                        recyclerView.announceForAccessibility(text);
                    } else {
                        recyclerView.sendAccessibilityEvent(2048);
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                int i3;
                if (i < 0) {
                    i3 = C22241f.this.mo77409f().findFirstVisibleItemPosition();
                } else {
                    i3 = C22241f.this.mo77409f().findLastVisibleItemPosition();
                }
                C22241f.this.f54396g = jVar.mo77434b(i3);
                materialButton.setText(jVar.mo77432a(i3));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.datepicker.C22241f.View$OnClickListenerC222498 */

            public void onClick(View view) {
                C22241f.this.mo77408e();
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.datepicker.C22241f.View$OnClickListenerC222509 */

            public void onClick(View view) {
                int findFirstVisibleItemPosition = C22241f.this.mo77409f().findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < C22241f.this.f54399j.getAdapter().getItemCount()) {
                    C22241f.this.mo77403a(jVar.mo77434b(findFirstVisibleItemPosition));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() {
            /* class com.google.android.material.datepicker.C22241f.AnonymousClass10 */

            public void onClick(View view) {
                int findLastVisibleItemPosition = C22241f.this.mo77409f().findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    C22241f.this.mo77403a(jVar.mo77434b(findLastVisibleItemPosition));
                }
            }
        });
    }

    /* renamed from: a */
    static <T> C22241f<T> m80494a(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C22241f<T> fVar = new C22241f<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.mo77292d());
        fVar.setArguments(bundle);
        return fVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f54401m);
        this.f54397h = new C22237b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month b = this.f54395f.mo77290b();
        if (MaterialDatePicker.m80412a(contextThemeWrapper)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        ViewCompat.m4043a(gridView, new C0859a() {
            /* class com.google.android.material.datepicker.C22241f.C222421 */

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                super.mo4535a(view, dVar);
                dVar.mo4559a((Object) null);
            }
        });
        gridView.setAdapter((ListAdapter) new C22240e());
        gridView.setNumColumns(b.f54345c);
        gridView.setEnabled(false);
        this.f54399j = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.f54399j.setLayoutManager(new C22262m(getContext(), false, i) {
            /* class com.google.android.material.datepicker.C22241f.C222443 */

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr) {
                if (i == 0) {
                    iArr[0] = C22241f.this.f54399j.getWidth();
                    iArr[1] = C22241f.this.f54399j.getWidth();
                    return;
                }
                iArr[0] = C22241f.this.f54399j.getHeight();
                iArr[1] = C22241f.this.f54399j.getHeight();
            }
        });
        this.f54399j.setTag(f54390a);
        C22257j jVar = new C22257j(contextThemeWrapper, this.f54394e, this.f54395f, new AbstractC22252b() {
            /* class com.google.android.material.datepicker.C22241f.C222454 */

            @Override // com.google.android.material.datepicker.C22241f.AbstractC22252b
            /* renamed from: a */
            public void mo77412a(long j) {
                if (C22241f.this.f54395f.mo77287a().mo77303a(j)) {
                    C22241f.this.f54394e.mo77317a(j);
                    Iterator it = C22241f.this.f54439l.iterator();
                    while (it.hasNext()) {
                        ((AbstractC22260k) it.next()).mo77355a(C22241f.this.f54394e.mo77315a());
                    }
                    C22241f.this.f54399j.getAdapter().notifyDataSetChanged();
                    if (C22241f.this.f54398i != null) {
                        C22241f.this.f54398i.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.f54399j.setAdapter(jVar);
        int a = m80493a(contextThemeWrapper.getResources(), (int) R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f54398i = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f54398i.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, a, 1, false));
            this.f54398i.setAdapter(new C22266p(this));
            this.f54398i.addItemDecoration(m80497h());
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            m80496a(inflate, jVar);
        }
        if (!MaterialDatePicker.m80412a(contextThemeWrapper)) {
            new C1395n().attachToRecyclerView(this.f54399j);
        }
        this.f54399j.scrollToPosition(jVar.mo77430a(this.f54396g));
        return inflate;
    }
}
