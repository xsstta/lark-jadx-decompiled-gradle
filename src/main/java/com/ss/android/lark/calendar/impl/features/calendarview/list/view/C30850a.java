package com.ss.android.lark.calendar.impl.features.calendarview.list.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.C1363f;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.C30804f;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.SafeUITaskManager;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.CalendarListViewData;
import com.ss.android.lark.calendar.impl.features.calendarview.list.C30819b;
import com.ss.android.lark.calendar.impl.features.calendarview.list.IListDateShowListener;
import com.ss.android.lark.calendar.impl.features.calendarview.list.p1482a.C30814b;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.EventChipView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.performance.LaunchPerfMonitor;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.StableLinearLayoutManager;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.a */
public class C30850a {

    /* renamed from: a */
    public static int f77665a = 20;

    /* renamed from: b */
    public static int f77666b = 80;

    /* renamed from: A */
    private Runnable f77667A = new Runnable() {
        /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.RunnableC308511 */

        public void run() {
            if (!C30850a.this.f77688w) {
                try {
                    C30850a.this.f77669d.mo111705b();
                    C30850a.this.f77673h.mo111649a(this, 60000);
                } catch (Exception unused) {
                }
            }
        }
    };

    /* renamed from: c */
    public LKUIPtrClassicFrameLayout f77668c;

    /* renamed from: d */
    public C30819b f77669d;

    /* renamed from: e */
    public CalendarDate f77670e;

    /* renamed from: f */
    public AbstractC30861b f77671f;

    /* renamed from: g */
    public C30804f f77672g;

    /* renamed from: h */
    public SafeUITaskManager f77673h = new SafeUITaskManager();

    /* renamed from: i */
    public IListDateShowListener f77674i;

    /* renamed from: j */
    public ListEventDateLogic f77675j;

    /* renamed from: k */
    boolean f77676k;

    /* renamed from: l */
    int f77677l;

    /* renamed from: m */
    int f77678m;

    /* renamed from: n */
    int f77679n = -1;

    /* renamed from: o */
    long f77680o = 0;

    /* renamed from: p */
    boolean f77681p = false;

    /* renamed from: q */
    int f77682q = 0;

    /* renamed from: r */
    ArrayList<CalendarListViewData> f77683r = new ArrayList<>();

    /* renamed from: s */
    int f77684s;

    /* renamed from: t */
    int f77685t;

    /* renamed from: u */
    int f77686u = -1;

    /* renamed from: v */
    int f77687v;

    /* renamed from: w */
    boolean f77688w = false;

    /* renamed from: x */
    boolean f77689x = false;

    /* renamed from: y */
    private RecyclerView f77690y;

    /* renamed from: z */
    private ExecutorService f77691z;

    /* renamed from: f */
    public RecyclerView mo111791f() {
        return this.f77690y;
    }

    /* renamed from: e */
    public void mo111790e() {
        this.f77671f.mo111727a();
    }

    /* renamed from: c */
    public void mo111788c() {
        this.f77688w = true;
        this.f77691z.shutdown();
        this.f77673h.mo111646a();
    }

    /* renamed from: h */
    private void m115122h() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f77690y.getContext());
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader2 = new ChatWindowPtrLoadingHeader(this.f77690y.getContext());
        this.f77668c.setKeepHeaderWhenRefresh(true);
        this.f77668c.setHeaderView(chatWindowPtrLoadingHeader);
        this.f77668c.setFooterView(chatWindowPtrLoadingHeader2);
        this.f77668c.setForceBackWhenComplete(true);
        this.f77668c.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.f77668c.addPtrUIHandler(chatWindowPtrLoadingHeader2);
        this.f77668c.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.C308588 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                C30850a.this.mo111784a(true);
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                C30850a.this.mo111784a(false);
            }
        });
    }

    /* renamed from: b */
    public void mo111785b() {
        this.f77674i.mo111710a();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f77690y.getLayoutManager();
        this.f77675j.mo111803a(this.f77674i, linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), this.f77690y);
    }

    /* renamed from: d */
    public void mo111789d() {
        for (int i = 0; i < this.f77690y.getChildCount(); i++) {
            View findViewById = this.f77690y.getChildAt(i).findViewById(R.id.calendar_list_data_chip);
            if (findViewById != null && (findViewById instanceof EventChipView)) {
                ((EventChipView) findViewById).mo112559b();
            }
        }
    }

    /* renamed from: a */
    public void mo111779a() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f77690y.getLayoutManager();
        this.f77675j.mo111803a(this.f77674i, linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), this.f77690y);
    }

    /* renamed from: g */
    public void mo111792g() {
        ArrayList<CalendarListViewData> arrayList;
        if (this.f77687v != this.f77679n && this.f77683r != null && this.f77689x) {
            ArrayList<C30860a> arrayList2 = new ArrayList<>();
            int i = this.f77686u;
            int i2 = this.f77679n;
            if (i2 >= this.f77677l && i2 <= this.f77678m) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f77683r.size()) {
                        break;
                    }
                    CalendarListViewData calendarListViewData = this.f77683r.get(i3);
                    int julianDay = calendarListViewData.getJulianDay();
                    int i4 = this.f77679n;
                    if (julianDay == i4) {
                        if (calendarListViewData.getViewType() == 0 || calendarListViewData.getViewType() == 3) {
                            this.f77687v = this.f77679n;
                            this.f77686u = -1;
                        }
                    } else if (julianDay > i4) {
                        arrayList = new ArrayList<>(this.f77683r);
                        arrayList.add(i3, m115120b(this.f77679n));
                        this.f77687v = this.f77679n;
                        this.f77686u = i3;
                        C30860a aVar = new C30860a();
                        aVar.f77712f = this.f77684s;
                        aVar.f77713g = this.f77685t;
                        aVar.f77707a = 2;
                        aVar.f77708b = i3;
                        aVar.f77709c = 1;
                        aVar.f77711e = arrayList;
                        arrayList2.add(aVar);
                        break;
                    }
                    i3++;
                }
            }
            arrayList = null;
            if (i >= 0) {
                int i5 = this.f77686u;
                if (i5 <= i) {
                    i++;
                } else {
                    this.f77686u = i5 - 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>(this.f77683r);
                }
                arrayList.remove(i);
                C30860a aVar2 = new C30860a();
                aVar2.f77712f = this.f77684s;
                aVar2.f77713g = this.f77685t;
                aVar2.f77707a = 3;
                aVar2.f77708b = i;
                aVar2.f77709c = 1;
                aVar2.f77711e = arrayList;
                arrayList2.add(aVar2);
            }
            if (arrayList != null) {
                this.f77683r = arrayList;
            }
            m115119a(arrayList2);
        }
    }

    /* renamed from: a */
    public void mo111782a(IListDateShowListener cVar) {
        this.f77674i = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.list.view.a$a */
    public class C30860a {

        /* renamed from: a */
        int f77707a;

        /* renamed from: b */
        int f77708b;

        /* renamed from: c */
        int f77709c;

        /* renamed from: d */
        C1374g.C1377b f77710d;

        /* renamed from: e */
        ArrayList<CalendarListViewData> f77711e;

        /* renamed from: f */
        int f77712f;

        /* renamed from: g */
        int f77713g;

        C30860a() {
        }
    }

    /* renamed from: a */
    public void mo111783a(AbstractC30861b bVar) {
        this.f77671f = bVar;
    }

    /* renamed from: a */
    public void mo111784a(boolean z) {
        this.f77671f.mo111728a(this.f77677l, this.f77678m, z);
    }

    /* renamed from: a */
    private void m115118a(int i) {
        this.f77680o = System.currentTimeMillis();
        this.f77690y.stopScroll();
        ((LinearLayoutManager) this.f77690y.getLayoutManager()).scrollToPositionWithOffset(i, 12);
    }

    /* renamed from: b */
    private CalendarListViewData m115120b(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setJulianDay(i);
        CalendarListViewData calendarListViewData = new CalendarListViewData(calendarDate, 3, new CalendarDate());
        calendarListViewData.setIsDayFirstInstance(true);
        calendarListViewData.setTempData(true);
        return calendarListViewData;
    }

    /* renamed from: a */
    private void m115119a(final ArrayList<C30860a> arrayList) {
        if (arrayList != null && arrayList.size() != 0) {
            this.f77673h.mo111651b(new Runnable() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.RunnableC308522 */

                public void run() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C30860a aVar = (C30860a) it.next();
                        C30850a.this.f77669d.mo111704a(aVar.f77711e);
                        C30850a.this.f77677l = aVar.f77712f;
                        C30850a.this.f77678m = aVar.f77713g;
                        C30850a.this.f77668c.refreshComplete();
                        if (C30850a.this.mo111787b(true)) {
                            C30850a.this.f77669d.notifyDataSetChanged();
                        } else if (aVar.f77707a == 0) {
                            C30850a.this.f77669d.notifyDataSetChanged();
                        } else if (aVar.f77707a == 1) {
                            aVar.f77710d.mo7412a(C30850a.this.f77669d);
                        } else if (aVar.f77707a == 2) {
                            C30850a.this.f77669d.notifyItemRangeInserted(aVar.f77708b, aVar.f77709c);
                        } else if (aVar.f77707a == 3) {
                            C30850a.this.f77669d.notifyItemRangeRemoved(aVar.f77708b, aVar.f77709c);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    private void m115121c(C30814b bVar) {
        if (this.f77679n >= bVar.mo111677c() || this.f77679n <= bVar.mo111679d()) {
            ArrayList<CalendarListViewData> e = bVar.mo111681e();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= e.size()) {
                    break;
                }
                CalendarListViewData calendarListViewData = e.get(i);
                int julianDay = calendarListViewData.getJulianDay();
                int i2 = this.f77679n;
                if (julianDay == i2) {
                    if (calendarListViewData.getViewType() == 0 || calendarListViewData.getViewType() == 3) {
                        this.f77686u = -1;
                    } else {
                        i++;
                    }
                } else if (julianDay > i2) {
                    this.f77686u = i;
                    e.add(i, m115120b(i2));
                    break;
                } else {
                    i++;
                }
            }
            this.f77686u = -1;
            z = true;
            if (z) {
                this.f77687v = this.f77679n;
                return;
            }
            this.f77686u = -1;
            this.f77687v = -1;
            return;
        }
        this.f77686u = -1;
        this.f77687v = -1;
    }

    /* renamed from: b */
    public void mo111786b(C30814b bVar) {
        ArrayList<C30860a> arrayList = new ArrayList<>();
        C30860a aVar = new C30860a();
        aVar.f77712f = bVar.mo111677c();
        aVar.f77713g = bVar.mo111679d();
        if (bVar.mo111683f() == 2) {
            final ArrayList<CalendarListViewData> e = bVar.mo111681e();
            m115121c(bVar);
            final int size = e.size();
            C1374g.C1377b a = C1374g.m6297a(new C1374g.AbstractC1376a() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.AnonymousClass10 */

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: b */
                public int mo7382b() {
                    return size;
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: a */
                public int mo7380a() {
                    return C30850a.this.f77683r.size();
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: a */
                public boolean mo7381a(int i, int i2) {
                    return C26247a.m94980a((AbstractC26248b) C30850a.this.f77683r.get(i), (AbstractC26248b) ((CalendarListViewData) e.get(i2)));
                }

                @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
                /* renamed from: b */
                public boolean mo7383b(int i, int i2) {
                    if (i == C30850a.this.f77683r.size() - 1) {
                        return false;
                    }
                    return C26247a.m94983b(C30850a.this.f77683r.get(i), (CalendarListViewData) e.get(i2));
                }
            });
            aVar.f77707a = 1;
            aVar.f77710d = a;
            aVar.f77711e = e;
            arrayList.add(aVar);
        } else if (bVar.mo111683f() == 1) {
            aVar.f77707a = 2;
            aVar.f77708b = bVar.mo111672a();
            aVar.f77709c = bVar.mo111675b();
            int i = this.f77686u;
            if (i >= 0) {
                CalendarListViewData calendarListViewData = this.f77683r.get(i);
                int a2 = bVar.mo111672a();
                int i2 = this.f77686u;
                if (a2 < i2) {
                    this.f77686u = i2 + bVar.mo111675b();
                    bVar.mo111681e().add(this.f77686u, calendarListViewData);
                } else {
                    bVar.mo111681e().add(this.f77686u, calendarListViewData);
                    aVar.f77708b = bVar.mo111672a() + 1;
                }
            }
            if (aVar.f77708b > 0) {
                aVar.f77708b--;
            }
            aVar.f77711e = bVar.mo111681e();
            arrayList.add(aVar);
        } else if (bVar.mo111683f() == 0) {
            ArrayList<CalendarListViewData> e2 = bVar.mo111681e();
            m115121c(bVar);
            aVar.f77707a = 0;
            aVar.f77711e = e2;
            arrayList.add(aVar);
        }
        if (aVar.f77711e != null) {
            this.f77683r = aVar.f77711e;
            this.f77684s = aVar.f77712f;
            this.f77685t = aVar.f77713g;
        }
        m115119a(arrayList);
    }

    /* renamed from: a */
    public void mo111781a(final C30814b bVar) {
        LaunchPerfMonitor.m124428c("show_chip");
        if (bVar.mo111681e() != null) {
            if (!this.f77689x) {
                this.f77689x = true;
                this.f77683r = bVar.mo111681e();
                this.f77684s = bVar.mo111677c();
                this.f77685t = bVar.mo111679d();
                this.f77669d.mo111704a(bVar.mo111681e());
                this.f77677l = bVar.mo111677c();
                this.f77678m = bVar.mo111679d();
                this.f77668c.refreshComplete();
                mo111787b(true);
                this.f77669d.notifyDataSetChanged();
                return;
            }
            this.f77691z.execute(new Runnable() {
                /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.RunnableC308577 */

                public void run() {
                    C30850a.this.mo111786b(bVar);
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo111787b(boolean z) {
        boolean z2;
        if (!this.f77676k) {
            return false;
        }
        int julianDay = new CalendarDate().getJulianDay();
        int i = this.f77679n;
        if (julianDay == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = -1;
        if (i >= this.f77677l && i <= this.f77678m) {
            int i3 = -1;
            int i4 = 0;
            boolean z3 = false;
            while (true) {
                if (i4 >= this.f77669d.getItemCount()) {
                    break;
                }
                CalendarListViewData a = this.f77669d.mo111700a(i4);
                int julianDay2 = a.getJulianDay();
                int i5 = this.f77679n;
                if (julianDay2 == i5) {
                    if (i2 < 0) {
                        i2 = i4;
                    }
                    if (a.getViewType() == 0 || a.getViewType() == 3) {
                        if (z2 && z) {
                            i2 = this.f77669d.mo111706c();
                            if (i3 < 0) {
                                i3 = i4;
                            }
                        }
                        z3 = true;
                    }
                } else if (julianDay2 > i5) {
                    if (!z3) {
                        this.f77691z.execute(new Runnable() {
                            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.RunnableC308599 */

                            public void run() {
                                C30850a.this.mo111792g();
                            }
                        });
                        if (i2 < 0 && i4 - 1 < 0) {
                            i2 = 0;
                        }
                    }
                }
                i4++;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (z2 && z && i2 < i3) {
                i2 = i3;
            }
        }
        if (i2 >= 0) {
            if (this.f77669d.getItemCount() - i2 > 8) {
                m115118a(i2);
                this.f77676k = false;
                return true;
            }
            mo111784a(true);
        }
        return false;
    }

    /* renamed from: a */
    public void mo111780a(int i, boolean z) {
        this.f77690y.stopScroll();
        this.f77680o = System.currentTimeMillis();
        this.f77681p = false;
        this.f77679n = i;
        this.f77676k = true;
        mo111787b(z);
    }

    public C30850a(final RecyclerView recyclerView, LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout, ListEventDateLogic cVar) {
        this.f77690y = recyclerView;
        this.f77668c = lKUIPtrClassicFrameLayout;
        this.f77675j = cVar;
        this.f77691z = CoreThreadPool.getDefault().newSerialCpuDensityThreadPool("CalendarListViewUIDiff");
        m115122h();
        recyclerView.setLayoutManager(new StableLinearLayoutManager(recyclerView.getContext(), 1, false));
        this.f77669d = new C30819b(this, recyclerView.getContext());
        this.f77672g = new C30804f();
        recyclerView.addItemDecoration(this.f77669d.mo111702a());
        recyclerView.setAdapter(this.f77669d);
        recyclerView.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.View$OnTouchListenerC308533 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                C30850a.this.f77681p = true;
                return false;
            }
        });
        this.f77673h.mo111649a(this.f77667A, 60000);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.C308544 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                C30850a.this.f77682q = i;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                int c = C30850a.this.f77669d.mo111706c();
                if (c >= findFirstVisibleItemPosition && c <= findLastVisibleItemPosition) {
                    for (int i3 = 0; i3 < recyclerView.getChildCount(); i3++) {
                        View childAt = recyclerView.getChildAt(i3);
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                        if (childAdapterPosition >= 0 && c == childAdapterPosition) {
                            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                            int height = childAt.getHeight();
                            if (C30850a.this.f77681p) {
                                C30850a.this.f77672g.mo111610c(((float) (height - bottom)) / ((float) recyclerView.getHeight()));
                            }
                        }
                    }
                } else if (C30850a.this.f77681p) {
                    C30850a.this.f77672g.mo111604a(((float) i2) / ((float) recyclerView.getHeight()));
                }
                if (C30850a.this.f77669d.getItemCount() - findLastVisibleItemPosition < C30850a.f77665a) {
                    C30850a.this.mo111784a(true);
                } else if (findFirstVisibleItemPosition < C30850a.f77665a) {
                    C30850a.this.mo111784a(false);
                }
                CalendarListViewData a = C30850a.this.f77669d.mo111700a(findFirstVisibleItemPosition);
                if (a != null && C30850a.this.f77681p && System.currentTimeMillis() - C30850a.this.f77680o > ((long) C30850a.f77666b) && C30850a.this.f77682q != 0) {
                    C30850a.this.f77676k = false;
                    CalendarDate viewDate = a.getViewDate();
                    if (C30850a.this.f77670e == null || C30850a.this.f77670e.getJulianDay() != viewDate.getJulianDay()) {
                        C30850a.this.f77671f.mo111729a(a.getViewDate());
                    }
                }
                C30850a.this.f77675j.mo111803a(C30850a.this.f77674i, findFirstVisibleItemPosition, findFirstCompletelyVisibleItemPosition, findLastVisibleItemPosition, recyclerView);
            }
        });
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.ViewTreeObserver$OnGlobalLayoutListenerC308555 */

            public void onGlobalLayout() {
                C30850a.this.mo111779a();
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        recyclerView.setItemAnimator(new C1363f() {
            /* class com.ss.android.lark.calendar.impl.features.calendarview.list.view.C30850a.C308566 */

            @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
            public void onAnimationFinished(RecyclerView.ViewHolder viewHolder) {
                C30850a.this.mo111779a();
            }
        });
    }
}
