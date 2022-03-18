package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer;
import com.ss.android.lark.calendar.impl.features.events.edit.p1517b.p1520c.AbstractC31541a;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.ControlChildViewClickableLayout;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.WheelView;
import com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.p1536a.C31909g;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.RepeatMode;
import com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30039ah;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CustomRepeatBottomContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f80925a = true;

    /* renamed from: b */
    public C31823g f80926b;

    /* renamed from: c */
    public C31822f f80927c;

    /* renamed from: d */
    public C31909g f80928d;

    /* renamed from: e */
    public C31909g f80929e;

    /* renamed from: f */
    public String f80930f;

    /* renamed from: g */
    public String f80931g;

    /* renamed from: h */
    public AbstractC31541a f80932h;

    /* renamed from: i */
    public String[] f80933i;

    /* renamed from: j */
    public String[] f80934j;

    /* renamed from: k */
    public CalendarDate f80935k;

    /* renamed from: l */
    public AbstractC31807a f80936l = new AbstractC31807a() {
        /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C317981 */

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.AbstractC31807a
        /* renamed from: a */
        public String mo115939a(String str) {
            try {
                int parseInt = Integer.parseInt(str) - 1;
                if (parseInt < 0 || parseInt >= CustomRepeatBottomContainer.this.f80933i.length) {
                    return str;
                }
                return CustomRepeatBottomContainer.this.f80933i[parseInt];
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.AbstractC31807a
        /* renamed from: a */
        public void mo115940a(boolean z, int i) {
            if (z) {
                CustomRepeatBottomContainer.this.f80932h.mo114655c(i + 1);
            } else {
                CustomRepeatBottomContainer.this.f80932h.mo114657d(i + 1);
            }
        }
    };

    /* renamed from: m */
    public AbstractC31807a f80937m = new AbstractC31807a() {
        /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C318003 */

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.AbstractC31807a
        /* renamed from: a */
        public String mo115939a(String str) {
            return str;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.AbstractC31807a
        /* renamed from: a */
        public void mo115940a(boolean z, int i) {
            C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(i, z) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.$$Lambda$CustomRepeatBottomContainer$3$HXE03pQq4WVcQxBjPAQs5Wdq58Q */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
                public final void onGetSucceed(CalendarSetting calendarSetting) {
                    CustomRepeatBottomContainer.C318003.this.m120703a(this.f$1, this.f$2, calendarSetting);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m120703a(int i, boolean z, CalendarSetting calendarSetting) {
            int i2 = C317992.f80944a[calendarSetting.getWeekStartDay().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i >= 0 && i < 7) {
                        if (z) {
                            CustomRepeatBottomContainer.this.f80932h.mo114650a(i % 7);
                        } else {
                            CustomRepeatBottomContainer.this.f80932h.mo114653b(i % 7);
                        }
                    }
                } else if (i >= 0 && i < 7) {
                    if (z) {
                        CustomRepeatBottomContainer.this.f80932h.mo114650a((i + 6) % 7);
                    } else {
                        CustomRepeatBottomContainer.this.f80932h.mo114653b((i + 6) % 7);
                    }
                }
            } else if (i >= 0 && i < 7) {
                if (z) {
                    CustomRepeatBottomContainer.this.f80932h.mo114650a((i + 1) % 7);
                } else {
                    CustomRepeatBottomContainer.this.f80932h.mo114653b((i + 1) % 7);
                }
            }
        }
    };
    @BindView(9051)
    ControlChildViewClickableLayout mChooseRepeatWeeksViewGroup;
    @BindView(9181)
    GridView mCustomRepeatMonthly;
    @BindView(9183)
    GridView mCustomRepeatWeekly;
    @BindView(10343)
    View mMonthlyTabContainer;
    @BindView(11804)
    WheelView mRepeatWeekNoWheelView;
    @BindView(11805)
    WheelView mRepeatWeeksWheelView;
    @BindView(11138)
    TextView mSwitchDate;
    @BindView(11148)
    TextView mSwitchWeek;

    /* renamed from: n */
    private Boolean f80938n = false;

    /* renamed from: o */
    private int f80939o = 1;

    /* renamed from: p */
    private int f80940p = 1;

    /* renamed from: q */
    private DebounceAction f80941q;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer$a */
    public interface AbstractC31807a {
        /* renamed from: a */
        String mo115939a(String str);

        /* renamed from: a */
        void mo115940a(boolean z, int i);
    }

    public Boolean getMonthDaySingle() {
        return this.f80938n;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ButterKnife.bind(this, this);
        m120690e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer$2 */
    public static /* synthetic */ class C317992 {

        /* renamed from: a */
        static final /* synthetic */ int[] f80944a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C317992.f80944a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C317992.f80944a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting$DayOfWeek r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C317992.<clinit>():void");
        }
    }

    /* renamed from: f */
    private void m120691f() {
        if (this.f80941q == null) {
            AnonymousClass10 r0 = new DebounceAction() {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.AnonymousClass10 */

                @Override // com.ss.android.lark.calendar.impl.utils.debounce.DebounceAction
                /* renamed from: a */
                public void mo115941a() {
                    String str;
                    if (CustomRepeatBottomContainer.this.f80935k == null || CustomRepeatBottomContainer.this.f80934j == null) {
                        str = "";
                    } else {
                        str = CustomRepeatBottomContainer.this.f80934j[CustomRepeatBottomContainer.this.f80935k.getWeekDay() - 1];
                    }
                    LKUIToast.show(CustomRepeatBottomContainer.this.getContext(), C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_RRule_NoSlide, "WeekType", str));
                }
            };
            this.f80941q = r0;
            r0.mo120294a(2000);
        }
        this.f80941q.mo120295b();
    }

    /* renamed from: b */
    public void mo115932b() {
        this.mCustomRepeatWeekly.setVisibility(0);
        this.mMonthlyTabContainer.setVisibility(8);
        mo115931a(this.f80926b, this.f80937m);
    }

    /* renamed from: c */
    public void mo115933c() {
        this.mMonthlyTabContainer.setVisibility(0);
        this.mCustomRepeatWeekly.setVisibility(8);
        if (this.f80925a) {
            AbstractC31541a aVar = this.f80932h;
            if (aVar != null) {
                aVar.mo114649a();
            }
            mo115931a(this.f80927c, this.f80936l);
            return;
        }
        mo115934d();
        AbstractC31541a aVar2 = this.f80932h;
        if (aVar2 != null) {
            aVar2.mo114652b();
        }
        mo115931a(this.f80927c, this.f80936l);
    }

    /* renamed from: d */
    public void mo115934d() {
        AbstractC31541a aVar = this.f80932h;
        if (aVar != null) {
            aVar.mo114654b(this.f80930f);
            this.f80932h.mo114656c(this.f80931g);
            AbstractC31541a aVar2 = this.f80932h;
            aVar2.mo114651a(this.f80930f + this.f80931g);
        }
    }

    /* renamed from: e */
    private void m120690e() {
        C31823g gVar = new C31823g(getContext(), 3, (int) getResources().getDimension(R.dimen.dp_225));
        this.f80926b = gVar;
        this.mCustomRepeatWeekly.setAdapter((ListAdapter) gVar);
        this.mCustomRepeatWeekly.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C318014 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (CustomRepeatBottomContainer.this.f80926b.mo116025a() == i) {
                    LKUIToast.show(CustomRepeatBottomContainer.this.getContext(), C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_RRule_Unselect, "Type", CustomRepeatBottomContainer.this.f80926b.getItem(i)));
                    return;
                }
                CustomRepeatBottomContainer.this.f80926b.mo116028b(i);
                CustomRepeatBottomContainer customRepeatBottomContainer = CustomRepeatBottomContainer.this;
                customRepeatBottomContainer.mo115931a(customRepeatBottomContainer.f80926b, CustomRepeatBottomContainer.this.f80937m);
            }
        });
        this.f80933i = getContext().getResources().getStringArray(R.array.custom_repeat_days);
        this.f80934j = getContext().getResources().getStringArray(R.array.weekly);
        C31822f fVar = new C31822f(getContext(), 7, (int) getResources().getDimension(R.dimen.dp_250));
        this.f80927c = fVar;
        this.mCustomRepeatMonthly.setAdapter((ListAdapter) fVar);
        this.mCustomRepeatMonthly.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C318025 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (CustomRepeatBottomContainer.this.f80927c.mo116025a() == i) {
                    LKUIToast.show(CustomRepeatBottomContainer.this.getContext(), C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_RRule_Unselect, "Type", CustomRepeatBottomContainer.this.mo115928a(i)));
                } else if (!CustomRepeatBottomContainer.this.f80927c.mo116037d().booleanValue()) {
                    CustomRepeatBottomContainer.this.f80927c.mo116028b(i);
                    CustomRepeatBottomContainer customRepeatBottomContainer = CustomRepeatBottomContainer.this;
                    customRepeatBottomContainer.mo115931a(customRepeatBottomContainer.f80927c, CustomRepeatBottomContainer.this.f80936l);
                } else if (CustomRepeatBottomContainer.this.f80935k != null) {
                    AbstractC30039ah utilsDependency = C30022a.f74882a.utilsDependency();
                    CustomRepeatBottomContainer customRepeatBottomContainer2 = CustomRepeatBottomContainer.this;
                    LKUIToast.show(CustomRepeatBottomContainer.this.getContext(), utilsDependency.mo108195a(R.string.Calendar_RRule_NoSlide, "WeekType", customRepeatBottomContainer2.mo115928a(customRepeatBottomContainer2.f80935k.getMonthDay() - 1)));
                }
            }
        });
        this.mSwitchDate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.View$OnClickListenerC318036 */

            public void onClick(View view) {
                CustomRepeatBottomContainer.this.mSwitchDate.setTextColor(C32634ae.m125178a(R.color.lkui_B500));
                CustomRepeatBottomContainer.this.mSwitchWeek.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
                CustomRepeatBottomContainer.this.mCustomRepeatMonthly.setVisibility(0);
                CustomRepeatBottomContainer customRepeatBottomContainer = CustomRepeatBottomContainer.this;
                customRepeatBottomContainer.mo115931a(customRepeatBottomContainer.f80927c, CustomRepeatBottomContainer.this.f80936l);
                CustomRepeatBottomContainer.this.mChooseRepeatWeeksViewGroup.setVisibility(8);
                CustomRepeatBottomContainer.this.f80925a = true;
                if (CustomRepeatBottomContainer.this.f80932h != null) {
                    CustomRepeatBottomContainer.this.f80932h.mo114649a();
                    CustomRepeatBottomContainer customRepeatBottomContainer2 = CustomRepeatBottomContainer.this;
                    customRepeatBottomContainer2.mo115931a(customRepeatBottomContainer2.f80927c, CustomRepeatBottomContainer.this.f80936l);
                }
            }
        });
        this.mSwitchWeek.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.View$OnClickListenerC318047 */

            public void onClick(View view) {
                CustomRepeatBottomContainer.this.mSwitchDate.setTextColor(C32634ae.m125178a(R.color.lkui_N400));
                CustomRepeatBottomContainer.this.mSwitchWeek.setTextColor(C32634ae.m125178a(R.color.lkui_B500));
                CustomRepeatBottomContainer.this.mCustomRepeatMonthly.setVisibility(8);
                CustomRepeatBottomContainer.this.mChooseRepeatWeeksViewGroup.setVisibility(0);
                CustomRepeatBottomContainer.this.mo115934d();
                CustomRepeatBottomContainer.this.f80925a = false;
                if (CustomRepeatBottomContainer.this.f80932h != null) {
                    CustomRepeatBottomContainer.this.f80932h.mo114652b();
                    CustomRepeatBottomContainer customRepeatBottomContainer = CustomRepeatBottomContainer.this;
                    customRepeatBottomContainer.mo115931a(customRepeatBottomContainer.f80927c, CustomRepeatBottomContainer.this.f80936l);
                }
            }
        });
        this.mRepeatWeekNoWheelView.setLineSpacingMultiplier(3.0f);
        this.mRepeatWeekNoWheelView.setTextColorCenter(getContext().getResources().getColor(R.color.text_caption));
        this.mRepeatWeekNoWheelView.setTextColorOut(getContext().getResources().getColor(R.color.text_disable));
        C31909g gVar2 = new C31909g(Arrays.asList(C32634ae.m125183c(R.array.week_no)));
        this.f80928d = gVar2;
        this.mRepeatWeekNoWheelView.setAdapter(gVar2);
        this.mRepeatWeekNoWheelView.setOnItemSelectedListener(new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C318058 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                CustomRepeatBottomContainer customRepeatBottomContainer = CustomRepeatBottomContainer.this;
                customRepeatBottomContainer.f80930f = customRepeatBottomContainer.f80928d.mo116507b(i);
                CustomRepeatBottomContainer.this.mo115934d();
            }
        });
        this.mRepeatWeeksWheelView.setLineSpacingMultiplier(3.0f);
        this.mRepeatWeeksWheelView.setTextColorCenter(getContext().getResources().getColor(R.color.text_caption));
        this.mRepeatWeeksWheelView.setTextColorOut(getContext().getResources().getColor(R.color.text_disable));
        C31909g gVar3 = new C31909g(Arrays.asList(C32634ae.m125183c(R.array.weekly)));
        this.f80929e = gVar3;
        this.mRepeatWeeksWheelView.setAdapter(gVar3);
        this.mRepeatWeeksWheelView.setOnItemSelectedListener(new AbstractC31917h() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.CustomRepeatBottomContainer.C318069 */

            @Override // com.ss.android.lark.calendar.impl.features.events.edit.widget.pickerview.AbstractC31917h
            /* renamed from: a */
            public void mo115161a(int i) {
                CustomRepeatBottomContainer customRepeatBottomContainer = CustomRepeatBottomContainer.this;
                customRepeatBottomContainer.f80931g = customRepeatBottomContainer.f80929e.mo116507b(i);
                CustomRepeatBottomContainer.this.mo115934d();
            }
        });
        this.mChooseRepeatWeeksViewGroup.setChildViewClickable(false);
        this.mChooseRepeatWeeksViewGroup.setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.$$Lambda$CustomRepeatBottomContainer$C4zNGpRCRQRu0umAL_ufRM5J2UA */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return CustomRepeatBottomContainer.this.m120688a(view, motionEvent);
            }
        });
    }

    /* renamed from: a */
    public void mo115929a() {
        C31823g gVar = this.f80926b;
        if (gVar != null) {
            gVar.mo116027b();
        }
        C31822f fVar = this.f80927c;
        if (fVar != null) {
            fVar.mo116027b();
        }
        WheelView wheelView = this.mRepeatWeekNoWheelView;
        if (wheelView != null) {
            wheelView.setCurrentItem(this.f80939o);
        }
        WheelView wheelView2 = this.mRepeatWeeksWheelView;
        if (wheelView2 != null) {
            wheelView2.setCurrentItem(this.f80940p);
        }
        this.f80931g = this.f80929e.mo116507b(this.f80940p);
        this.f80930f = this.f80928d.mo116507b(this.f80939o);
    }

    public void setOnCheckedListener(AbstractC31541a aVar) {
        this.f80932h = aVar;
    }

    public void setMonthDaySingle(Boolean bool) {
        this.f80938n = bool;
        this.f80927c.mo116036a(bool);
    }

    public CustomRepeatBottomContainer(Context context) {
        super(context);
    }

    /* renamed from: a */
    public String mo115928a(int i) {
        String[] strArr = this.f80933i;
        if (strArr == null || strArr.length <= 0 || i >= strArr.length || i < 0) {
            return "";
        }
        return strArr[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m120688a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return true;
        }
        m120691f();
        return true;
    }

    /* renamed from: a */
    public int mo115927a(int i, CalendarSetting.DayOfWeek dayOfWeek) {
        int i2 = C317992.f80944a[dayOfWeek.ordinal()];
        if (i2 == 1) {
            return (i + 6) % 7;
        }
        if (i2 != 2) {
            return i;
        }
        return (i + 1) % 7;
    }

    public CustomRepeatBottomContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m120686a(RepeatMode repeatMode, int i) {
        if (this.f80926b != null && repeatMode != null && repeatMode.getRepeatType() == 8 && CollectionUtils.isNotEmpty(repeatMode.getCustomerByWeekList())) {
            C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(repeatMode, i) {
                /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.$$Lambda$CustomRepeatBottomContainer$kd9uJs4vCnIUUdkgxp24dYn3YvI */
                public final /* synthetic */ RepeatMode f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
                public final void onGetSucceed(CalendarSetting calendarSetting) {
                    CustomRepeatBottomContainer.this.m120687a((CustomRepeatBottomContainer) this.f$1, (RepeatMode) this.f$2, (int) calendarSetting);
                }
            });
        }
    }

    /* renamed from: b */
    private void m120689b(RepeatMode repeatMode, int i) {
        if (this.f80927c != null && repeatMode != null && repeatMode.getRepeatType() == 9 && CollectionUtils.isNotEmpty(repeatMode.getCustomerByMonthDayList())) {
            for (Integer num : repeatMode.getCustomerByMonthDayList()) {
                int intValue = num.intValue() - 1;
                if (intValue != i) {
                    this.f80927c.mo116028b(intValue);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo115930a(CalendarDate calendarDate, RepeatMode repeatMode) {
        this.f80935k = calendarDate;
        C30022a.f74884c.mo108450a(new C30086b.AbstractC30090a(calendarDate, repeatMode) {
            /* class com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.$$Lambda$CustomRepeatBottomContainer$44GaL0S4C_1zHOoKB6B6EQQ06Y */
            public final /* synthetic */ CalendarDate f$1;
            public final /* synthetic */ RepeatMode f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
            public final void onGetSucceed(CalendarSetting calendarSetting) {
                CustomRepeatBottomContainer.this.m120685a((CustomRepeatBottomContainer) this.f$1, (CalendarDate) this.f$2, (RepeatMode) calendarSetting);
            }
        });
    }

    /* renamed from: a */
    public void mo115931a(AbstractC31820d dVar, AbstractC31807a aVar) {
        if (this.f80932h != null) {
            int count = dVar.getCount();
            ArrayList<Integer> arrayList = new ArrayList();
            for (int i = 0; i < count; i++) {
                if (dVar.mo116030c(i)) {
                    arrayList.add(Integer.valueOf(i));
                    aVar.mo115940a(true, i);
                } else {
                    aVar.mo115940a(false, i);
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            for (Integer num : arrayList) {
                int intValue = num.intValue();
                if (aVar != null) {
                    sb.append(aVar.mo115939a(dVar.getItem(intValue)));
                    sb.append(" ");
                } else {
                    sb.append(dVar.getItem(intValue));
                    sb.append(" ");
                }
            }
            this.f80932h.mo114651a(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m120685a(CalendarDate calendarDate, RepeatMode repeatMode, CalendarSetting calendarSetting) {
        CalendarSetting.DayOfWeek weekStartDay = calendarSetting.getWeekStartDay();
        if (this.f80926b != null) {
            int weeklyDayIndex = calendarDate.getWeeklyDayIndex(weekStartDay);
            this.f80926b.mo116031d(weeklyDayIndex);
            this.f80926b.mo116028b(weeklyDayIndex);
            m120686a(repeatMode, weeklyDayIndex);
        }
        if (this.f80927c != null) {
            int monthDay = calendarDate.getMonthDay() - 1;
            this.f80927c.mo116031d(monthDay);
            this.f80927c.mo116028b(monthDay);
            if (!this.f80938n.booleanValue()) {
                m120689b(repeatMode, monthDay);
            }
        }
        if (this.mRepeatWeekNoWheelView != null) {
            int ceil = ((int) Math.ceil((double) (((float) calendarDate.getMonthDay()) / 7.0f))) - 1;
            this.f80939o = ceil;
            this.mRepeatWeekNoWheelView.setCurrentItem(ceil);
        }
        if (this.mRepeatWeeksWheelView != null) {
            int weekDay = calendarDate.getWeekDay() - 1;
            this.f80940p = weekDay;
            this.mRepeatWeeksWheelView.setCurrentItem(weekDay);
        }
        this.f80931g = this.f80929e.mo116507b(this.f80940p);
        this.f80930f = this.f80928d.mo116507b(this.f80939o);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m120687a(RepeatMode repeatMode, int i, CalendarSetting calendarSetting) {
        CalendarSetting.DayOfWeek weekStartDay = calendarSetting.getWeekStartDay();
        for (Integer num : repeatMode.getCustomerByWeekList()) {
            int a = mo115927a(num.intValue(), weekStartDay);
            if (a != i) {
                this.f80926b.mo116028b(a);
            }
        }
    }
}
