package com.bytedance.ee.bear.reminder;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.reminder.calendar.ReminderMonthView;
import com.bytedance.ee.bear.reminder.model.C10621b;
import com.bytedance.ee.bear.reminder.model.EAlertTimeEvent;
import com.bytedance.ee.bear.reminder.model.ReminderUserEntity;
import com.bytedance.ee.bear.reminder.p527a.C10613a;
import com.bytedance.ee.bear.reminder.person.ReminderPersonView;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.wheelview.p574c.AbstractC11881b;
import com.bytedance.ee.bear.widgets.wheelview.view.WheelView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p717s.C13723a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.haibin.calendarview.Calendar;
import com.haibin.calendarview.CalendarView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.reminder.a */
public class View$OnClickListenerC10607a extends DialogInterface$OnCancelListenerC1021b implements View.OnClickListener, AbstractC10549e {

    /* renamed from: A */
    private TextView f28472A;

    /* renamed from: B */
    private TextView f28473B;

    /* renamed from: C */
    private TextView f28474C;

    /* renamed from: D */
    private UDTimePicker f28475D;

    /* renamed from: E */
    private WheelView f28476E;

    /* renamed from: F */
    private ReminderPersonView f28477F;

    /* renamed from: G */
    private ImageView f28478G;

    /* renamed from: H */
    private ImageView f28479H;

    /* renamed from: I */
    private AtEditText f28480I;

    /* renamed from: J */
    private Dialog f28481J;

    /* renamed from: K */
    private Dialog f28482K;

    /* renamed from: L */
    private Dialog f28483L;

    /* renamed from: M */
    private FrameLayout f28484M;

    /* renamed from: N */
    private C10613a f28485N;

    /* renamed from: O */
    private boolean f28486O;

    /* renamed from: P */
    private int f28487P;

    /* renamed from: Q */
    private int f28488Q = 1;

    /* renamed from: R */
    private String f28489R;

    /* renamed from: S */
    private AbstractC10550f f28490S;

    /* renamed from: T */
    private IStatusBar f28491T;

    /* renamed from: U */
    private int f28492U;

    /* renamed from: c */
    public View f28493c;

    /* renamed from: d */
    public View f28494d;

    /* renamed from: e */
    public CalendarView f28495e;

    /* renamed from: f */
    public TextView f28496f;

    /* renamed from: g */
    public ReminderViewModel f28497g;

    /* renamed from: h */
    protected C10621b f28498h;

    /* renamed from: i */
    protected C10621b f28499i;

    /* renamed from: j */
    public int f28500j;

    /* renamed from: k */
    protected BearUrl f28501k;

    /* renamed from: l */
    protected boolean f28502l;

    /* renamed from: m */
    private boolean f28503m = true;

    /* renamed from: n */
    private NestedScrollView f28504n;

    /* renamed from: o */
    private View f28505o;

    /* renamed from: p */
    private View f28506p;

    /* renamed from: q */
    private View f28507q;

    /* renamed from: r */
    private View f28508r;

    /* renamed from: s */
    private View f28509s;

    /* renamed from: t */
    private View f28510t;

    /* renamed from: u */
    private View f28511u;

    /* renamed from: v */
    private View f28512v;

    /* renamed from: w */
    private View f28513w;

    /* renamed from: x */
    private View f28514x;

    /* renamed from: y */
    private View f28515y;

    /* renamed from: z */
    private UDSwitch f28516z;

    /* renamed from: p */
    private void m43989p() {
        mo40111d(false);
        mo40114f(false);
    }

    /* access modifiers changed from: public */
    /* renamed from: x */
    private /* synthetic */ void m43997x() {
        KeyboardUtils.showKeyboard(getActivity());
    }

    /* renamed from: g */
    public boolean mo40115g() {
        m43992s();
        return true;
    }

    /* renamed from: f */
    public ReminderViewModel mo40113f() {
        return (ReminderViewModel) C4950k.m20474a(this, ReminderViewModel.class);
    }

    /* renamed from: h */
    private int m43980h() {
        int i = this.f28492U;
        if (i != 0) {
            return i;
        }
        Rect rect = new Rect();
        requireActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        this.f28492U = height;
        return height;
    }

    /* renamed from: q */
    private void m43990q() {
        if (m43996w()) {
            m43995v();
            if (!m43991r()) {
                this.f28483L.show();
                return;
            }
            ReminderViewModel dVar = this.f28497g;
            if (dVar != null) {
                dVar.saveReminder(this.f28499i);
            }
        }
    }

    /* renamed from: s */
    private void m43992s() {
        m43995v();
        if (!this.f28499i.equals(this.f28498h)) {
            this.f28481J.show();
            return;
        }
        ReminderViewModel dVar = this.f28497g;
        if (dVar != null) {
            dVar.closeReminder();
        }
    }

    /* renamed from: u */
    private void m43994u() {
        boolean z;
        if (this.f28511u.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        mo40114f(z2);
        if (z2) {
            mo40111d(false);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f28490S.mo39928b(this);
        IStatusBar aVar = this.f28491T;
        if (aVar != null) {
            aVar.mo50689b();
        }
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40653b(this.f28484M);
    }

    /* renamed from: i */
    private void m43982i() {
        this.f28497g.getOriginReminderSettings().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$HqcT1FSRM711wzmO403cusrvW5g */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnClickListenerC10607a.lambda$HqcT1FSRM711wzmO403cusrvW5g(View$OnClickListenerC10607a.this, (C10621b) obj);
            }
        });
        this.f28497g.getBearUrl().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$0Zj06qkwxYwkqcCoAY2oHps4sy4 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnClickListenerC10607a.lambda$0Zj06qkwxYwkqcCoAY2oHps4sy4(View$OnClickListenerC10607a.this, (BearUrl) obj);
            }
        });
        this.f28490S.mo39924a(this);
    }

    /* renamed from: j */
    private void m43983j() {
        this.f28483L = new BearUDDialogBuilder(getContext()).mo45362d(R.string.Doc_Reminder_FillNotifyPerson).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Ok, (DialogInterface.OnClickListener) null).mo45355a();
    }

    /* renamed from: k */
    private void m43984k() {
        this.f28482K = new BearUDDialogBuilder(getContext()).mo45344a(R.string.Doc_Reminder_Note_Fail_Title).mo45362d(R.string.Doc_Reminder_Note_Max_BodyText).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Reminder_Button_Reedit, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$dINru110c4hSWqNpd5cxSsDM738 */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC10607a.lambda$dINru110c4hSWqNpd5cxSsDM738(View$OnClickListenerC10607a.this, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$2HyxMvWiLiVCPTz9Kv4Aw2NZI */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC10607a.m269900lambda$2HyxMvWiLiVCPTz9Kv4Aw2NZI(View$OnClickListenerC10607a.this, dialogInterface, i);
            }
        }).mo45355a();
    }

    /* renamed from: l */
    private void m43985l() {
        this.f28481J = new BearUDDialogBuilder(getContext()).mo45362d(R.string.Doc_Reminder_CloseConfirm).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Reminder_Cancel, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$lEobBTF3S9qf1S75fS2mZvJUdqk */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC10607a.lambda$lEobBTF3S9qf1S75fS2mZvJUdqk(View$OnClickListenerC10607a.this, dialogInterface, i);
            }
        }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Reminder_Confirm, new DialogInterface.OnClickListener() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$ShGE1reXLlQZZLQKI2icIYL7_uU */

            public final void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC10607a.lambda$ShGE1reXLlQZZLQKI2icIYL7_uU(View$OnClickListenerC10607a.this, dialogInterface, i);
            }
        }).mo45355a();
    }

    /* renamed from: m */
    private void m43986m() {
        Calendar a = C10615c.m44024a();
        HashMap hashMap = new HashMap();
        hashMap.put(a.toString(), a);
        this.f28495e.setSchemeDate(hashMap);
        this.f28495e.setOnCalendarSelectListener(new CalendarView.AbstractC23329e() {
            /* class com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a.C106081 */

            @Override // com.haibin.calendarview.CalendarView.AbstractC23329e
            /* renamed from: a */
            public void mo40117a(Calendar calendar) {
            }

            @Override // com.haibin.calendarview.CalendarView.AbstractC23329e
            /* renamed from: a */
            public void mo40118a(Calendar calendar, boolean z) {
                if (z) {
                    View$OnClickListenerC10607a.this.f28497g.onCalendarSelect();
                }
                View$OnClickListenerC10607a.this.mo40108b(calendar.getTimeInMillis());
            }
        });
        this.f28495e.setOnMonthChangeListener(new CalendarView.AbstractC23331g() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$R7Xx2eQ3YinO6oPLf_ctt_t7pNE */

            @Override // com.haibin.calendarview.CalendarView.AbstractC23331g
            public final void onMonthChange(int i, int i2) {
                View$OnClickListenerC10607a.lambda$R7Xx2eQ3YinO6oPLf_ctt_t7pNE(View$OnClickListenerC10607a.this, i, i2);
            }
        });
    }

    /* renamed from: n */
    private void m43987n() {
        this.f28475D.setDatePickerListener(new ITimePickerDelegate.TimePickerListener() {
            /* class com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a.C106092 */

            @Override // com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate.TimePickerListener
            /* renamed from: a */
            public void mo18000a(int i, int i2, int i3, int i4, int i5) {
                View$OnClickListenerC10607a aVar = View$OnClickListenerC10607a.this;
                View$OnClickListenerC10607a.this.f28496f.setText(C13723a.m55667g(View$OnClickListenerC10607a.this.getContext(), aVar.mo40104a(aVar.f28495e.getSelectedCalendar())));
                ReminderMonthView.updateExpireTime(i4, i5);
            }
        });
        this.f28476E.setOnItemSelectedListener(new AbstractC11881b() {
            /* class com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a.C106103 */

            @Override // com.bytedance.ee.bear.widgets.wheelview.p574c.AbstractC11881b
            /* renamed from: a */
            public void mo40119a(int i) {
                View$OnClickListenerC10607a.this.mo40110c(false);
            }
        });
        WheelView wheelView = this.f28476E;
        C10613a aVar = new C10613a(getContext());
        this.f28485N = aVar;
        wheelView.setAdapter(aVar);
    }

    /* renamed from: t */
    private void m43993t() {
        boolean z;
        if (this.f28512v.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        mo40111d(z2);
        if (z2) {
            mo40114f(false);
            return;
        }
        String str = (String) this.f28476E.getCurrentObject();
        if (getContext() != null && TextUtils.equals(getContext().getString(R.string.Doc_Reminder_NoAlert), str)) {
            this.f28497g.onClickNoReminder();
        }
    }

    /* renamed from: w */
    private boolean m43996w() {
        String str;
        if (this.f28480I.getText() == null) {
            str = "";
        } else {
            str = this.f28480I.getText().toString();
        }
        if (str.length() > this.f28487P) {
            this.f28482K.show();
            this.f28489R = str;
            return false;
        }
        this.f28499i.mo40211a(str);
        this.f28480I.setText(str);
        return true;
    }

    /* renamed from: r */
    private boolean m43991r() {
        boolean z;
        if (!this.f28499i.mo40236w()) {
            return true;
        }
        if ((!this.f28499i.mo40221h() || !EAlertTimeEvent.noAlert.equals(this.f28499i.mo40228o())) && (this.f28499i.mo40221h() || !EAlertTimeEvent.noAlert.equals(this.f28499i.mo40227n()))) {
            z = false;
        } else {
            z = true;
        }
        if (z || (this.f28499i.mo40226m() != null && !this.f28499i.mo40226m().isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ == null) {
            window = null;
        } else {
            window = v_.getWindow();
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = BitmapDescriptorFactory.HUE_RED;
            attributes.width = -1;
            attributes.gravity = 80;
            int h = m43980h();
            if (h == 0) {
                attributes.height = -1;
            } else {
                attributes.height = h;
            }
            window.clearFlags(2);
            attributes.windowAnimations = R.style.ActionSheetWindowStyle;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
            v_.setOnKeyListener(new DialogInterface.OnKeyListener() {
                /* class com.bytedance.ee.bear.reminder.$$Lambda$a$J62HUh8XgiLLiDMv3Emt8UPt9s */

                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    return View$OnClickListenerC10607a.m269902lambda$J62HUh8XgiLLiDMv3Emt8UPt9s(View$OnClickListenerC10607a.this, dialogInterface, i, keyEvent);
                }
            });
        }
        mo5512a(false);
    }

    /* renamed from: o */
    private void m43988o() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        this.f28503m = this.f28499i.mo40224k();
        this.f28487P = this.f28499i.mo40207c();
        this.f28500j = this.f28499i.mo40208d();
        ReminderMonthView.updateSelectDayColorResources(this.f28499i.mo40234u(), this.f28499i.mo40235v(), this.f28499i.mo40233t());
        View view = this.f28509s;
        int i5 = 8;
        if (this.f28503m) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (!this.f28499i.mo40221h() || !this.f28503m) {
            z = false;
        } else {
            z = true;
        }
        this.f28516z.setChecked(z);
        View view2 = this.f28493c;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        mo40106a(this.f28499i.mo40222i());
        Calendar a = C10615c.m44025a(this.f28499i.mo40222i());
        this.f28495e.mo80975a(a.getYear(), a.getMonth(), a.getDay());
        mo40108b(a.getTimeInMillis());
        boolean w = this.f28499i.mo40236w();
        View view3 = this.f28513w;
        if (w) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        view3.setVisibility(i3);
        if (w) {
            this.f28477F.setUserEntityList(this.f28499i.mo40226m());
        }
        boolean x = this.f28499i.mo40237x();
        View view4 = this.f28514x;
        if (x) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view4.setVisibility(i4);
        if (x) {
            String l = this.f28499i.mo40225l();
            AtEditText atEditText = this.f28480I;
            if (l == null) {
                l = "";
            }
            atEditText.setText(l);
        }
        mo43259c(this.f28499i.mo40218e());
        boolean j = this.f28499i.mo40223j();
        View view5 = this.f28510t;
        if (j) {
            i5 = 0;
        }
        view5.setVisibility(i5);
        mo40110c(true);
    }

    /* renamed from: v */
    private void m43995v() {
        boolean z;
        long j;
        Calendar selectedCalendar = this.f28495e.getSelectedCalendar();
        if (!this.f28499i.mo40221h() || !this.f28503m) {
            z = false;
        } else {
            z = true;
        }
        int currentItem = this.f28476E.getCurrentItem();
        if (z) {
            C10621b bVar = this.f28499i;
            bVar.mo40214b(bVar.mo40231r().get(currentItem));
        } else {
            C10621b bVar2 = this.f28499i;
            bVar2.mo40210a(bVar2.mo40229p().get(currentItem));
        }
        C10621b bVar3 = this.f28498h;
        if (bVar3 != null && bVar3.mo40222i() != 0 && this.f28498h.mo40221h() == z && this.f28499i.mo40205a()) {
            java.util.Calendar b = C10615c.m44027b(this.f28498h.mo40222i());
            b.set(13, 0);
            b.set(14, 0);
            if (z) {
                if (C10615c.m44023a(selectedCalendar, this.f28475D.getSelectedCalendar().get(10), this.f28475D.getSelectedCalendar().get(12), 0) / 1000 == b.getTimeInMillis() / 1000) {
                    this.f28499i.mo40209a(this.f28498h.mo40222i());
                    return;
                }
                this.f28499i.mo40209a(mo40104a(selectedCalendar));
                return;
            }
            b.set(11, 0);
            b.set(12, 0);
            if (C10615c.m44023a(selectedCalendar, 0, 0, 0) / 1000 == b.getTimeInMillis() / 1000) {
                this.f28499i.mo40209a(this.f28498h.mo40222i());
                return;
            }
            this.f28499i.mo40209a((C10615c.m44023a(selectedCalendar, 0, 0, 0) / 1000) * 1000);
        } else if (z) {
            this.f28499i.mo40209a(mo40104a(selectedCalendar));
        } else {
            if (this.f28499i.mo40206b()) {
                j = (C10615c.m44023a(selectedCalendar, 0, 0, 0) / 1000) * 1000;
            } else {
                j = C10615c.m44023a(selectedCalendar, 23, 59, 59);
            }
            this.f28499i.mo40209a(j);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43967a(BearUrl bearUrl) {
        this.f28501k = bearUrl;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43962a(int i) {
        this.f28504n.mo4742a(0, i);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m43969b(int i) {
        this.f28504n.mo4742a(0, i);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m43976c(View view) {
        mo40112e(false);
        C10548d.m43696a(getContext());
    }

    /* renamed from: g */
    private void m43979g(boolean z) {
        int i;
        View view = this.f28513w;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: h */
    private void m43981h(boolean z) {
        int i;
        View view = this.f28514x;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: e */
    public void mo40112e(boolean z) {
        if (z) {
            C13749l.m55756c(this.f28480I);
            C13742g.m55706a(new Runnable() {
                /* class com.bytedance.ee.bear.reminder.$$Lambda$a$Eg1FUfsyTzWrSNWfJDqfW96crQ */

                public final void run() {
                    View$OnClickListenerC10607a.m269901lambda$Eg1FUfsyTzWrSNWfJDqfW96crQ(View$OnClickListenerC10607a.this);
                }
            }, 200);
            return;
        }
        this.f28480I.clearFocus();
        C10548d.m43697a((View) this.f28480I);
    }

    /* renamed from: d */
    public void mo40111d(boolean z) {
        if (z) {
            this.f28497g.onSelectReminderTime();
            this.f28512v.setVisibility(0);
            m43966a(this.f28473B, this.f28478G);
            return;
        }
        this.f28512v.setVisibility(8);
        m43973b(this.f28473B, this.f28478G);
    }

    /* renamed from: f */
    public void mo40114f(boolean z) {
        if (z) {
            this.f28497g.onSelectTime();
            this.f28511u.setVisibility(0);
            m43966a(this.f28496f, this.f28479H);
            return;
        }
        this.f28511u.setVisibility(8);
        m43973b(this.f28496f, this.f28479H);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28490S = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
        this.f28497g = mo40113f();
        this.f28486O = TextUtils.equals(Locale.ENGLISH.getLanguage(), C4484g.m18494b().mo17252c());
    }

    /* renamed from: b */
    private void m43972b(View view) {
        this.f28507q.setOnClickListener(this);
        this.f28508r.setOnClickListener(this);
        this.f28493c.setOnClickListener(this);
        this.f28510t.setOnClickListener(this);
        this.f28505o.setOnClickListener(this);
        this.f28506p.setOnClickListener(this);
        this.f28513w.setOnClickListener(this);
        this.f28516z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a.C106114 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    View$OnClickListenerC10607a.this.f28497g.onSetAllDay();
                    View$OnClickListenerC10607a.this.f28499i.mo40213a(true);
                    View$OnClickListenerC10607a.this.f28499i.mo40214b(View$OnClickListenerC10607a.this.f28499i.mo40232s());
                    View$OnClickListenerC10607a.this.f28493c.setVisibility(0);
                    View$OnClickListenerC10607a.this.mo40114f(false);
                    View$OnClickListenerC10607a.this.mo40111d(false);
                    View$OnClickListenerC10607a.this.mo40112e(false);
                    View$OnClickListenerC10607a.this.mo40110c(true);
                    View$OnClickListenerC10607a.this.mo40106a(System.currentTimeMillis());
                    return;
                }
                View$OnClickListenerC10607a.this.f28497g.onCancelAllDay();
                View$OnClickListenerC10607a.this.f28499i.mo40213a(false);
                View$OnClickListenerC10607a.this.f28499i.mo40210a(View$OnClickListenerC10607a.this.f28499i.mo40230q());
                View$OnClickListenerC10607a.this.f28493c.setVisibility(8);
                View$OnClickListenerC10607a.this.mo40114f(false);
                View$OnClickListenerC10607a.this.mo40111d(false);
                View$OnClickListenerC10607a.this.mo40112e(false);
                View$OnClickListenerC10607a.this.mo40110c(true);
                ReminderMonthView.updateExpireTime(23, 59);
            }
        });
        this.f28480I.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$bcyhVc93S70IqlNc8M6vZBUrOKc */

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                View$OnClickListenerC10607a.lambda$bcyhVc93S70IqlNc8M6vZBUrOKc(View$OnClickListenerC10607a.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.reminder.$$Lambda$a$4vty3jzUgxDBI_tMQKKMFuYkg2o */

            public final void onClick(View view) {
                View$OnClickListenerC10607a.lambda$4vty3jzUgxDBI_tMQKKMFuYkg2o(View$OnClickListenerC10607a.this, view);
            }
        });
        this.f28504n.setOnScrollChangeListener(new NestedScrollView.AbstractC0934b() {
            /* class com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a.C106125 */

            @Override // androidx.core.widget.NestedScrollView.AbstractC0934b
            /* renamed from: a */
            public void mo742a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                if (i2 == 0) {
                    View$OnClickListenerC10607a.this.f28494d.setVisibility(4);
                } else {
                    View$OnClickListenerC10607a.this.f28494d.setVisibility(0);
                }
            }
        });
    }

    public void onClick(View view) {
        mo40112e(false);
        if (view.getId() == R.id.reminder_pick_previous) {
            this.f28495e.mo80982b(true);
        } else if (view.getId() == R.id.reminder_pick_next) {
            this.f28495e.mo80978a(true);
        } else if (view.getId() == R.id.reminder_expire_time_layout) {
            m43994u();
        } else if (view.getId() == R.id.reminder_alert_setting) {
            m43993t();
        } else if (view.getId() == R.id.reminder_close) {
            m43992s();
        } else if (view.getId() == R.id.reminder_save) {
            m43990q();
        } else if (view.getId() == R.id.rl_reminder_person) {
            mo40107a(this.f28499i.mo40226m());
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m43974b(C10621b bVar) {
        this.f28498h = bVar;
        this.f28499i = mo40105a(bVar);
        m43988o();
    }

    /* renamed from: c */
    private void mo43259c(List<String> list) {
        int i;
        if (list != null && list.size() > 0) {
            StringBuilder sb = new StringBuilder(getString(R.string.CreationMobile_DocX_remider_SendTo_part1));
            int size = list.size();
            if (size >= 7) {
                for (int i2 = 0; i2 < 6; i2++) {
                    sb.append(list.get(i2));
                    sb.append(getString(R.string.CreationMobile_DocX_common_punctuation_comma));
                }
                sb.append(list.get(6));
                sb.append(getString(R.string.CreationMobile_DocX_remider_SendTo_part2).replace("{{number}}", String.valueOf(size)));
            } else {
                int i3 = 0;
                while (true) {
                    i = size - 1;
                    if (i3 >= i) {
                        break;
                    }
                    sb.append(list.get(i3));
                    sb.append(getString(R.string.CreationMobile_DocX_common_punctuation_comma));
                    i3++;
                }
                sb.append(list.get(i));
            }
            this.f28474C.setText(sb.toString());
            this.f28474C.setVisibility(0);
        }
    }

    /* renamed from: a */
    public long mo40104a(Calendar calendar) {
        CalendarDate calendarDate = new CalendarDate(this.f28475D.getSelectedCalendar());
        this.f28475D.getSelectedCalendar();
        return C10615c.m44023a(calendar, calendarDate.getHour(), calendarDate.getMinute(), 0);
    }

    /* renamed from: a */
    private void m43964a(View view) {
        this.f28505o = view.findViewById(R.id.reminder_close);
        this.f28506p = view.findViewById(R.id.reminder_save);
        this.f28507q = view.findViewById(R.id.reminder_pick_previous);
        this.f28508r = view.findViewById(R.id.reminder_pick_next);
        this.f28493c = view.findViewById(R.id.reminder_expire_time_layout);
        this.f28510t = view.findViewById(R.id.reminder_alert_setting);
        this.f28511u = view.findViewById(R.id.reminder_time_picker);
        this.f28512v = view.findViewById(R.id.reminder_alert_picker);
        this.f28472A = (TextView) view.findViewById(R.id.reminder_calendar_date);
        this.f28496f = (TextView) view.findViewById(R.id.reminder_expire_time);
        this.f28473B = (TextView) view.findViewById(R.id.reminder_alert_time);
        this.f28475D = (UDTimePicker) view.findViewById(R.id.reminder_time_picker_view);
        this.f28476E = (WheelView) view.findViewById(R.id.reminder_alert_event_picker);
        this.f28516z = (UDSwitch) view.findViewById(R.id.reminder_setting_time_switch);
        this.f28495e = (CalendarView) view.findViewById(R.id.reminder_calendar);
        this.f28513w = view.findViewById(R.id.rl_reminder_person);
        this.f28477F = (ReminderPersonView) view.findViewById(R.id.edit_reminder_person_layout);
        this.f28514x = view.findViewById(R.id.ll_reminder_text);
        this.f28480I = (AtEditText) view.findViewById(R.id.et_reminder_text);
        this.f28515y = view.findViewById(R.id.keyboard_placeholder);
        this.f28504n = (NestedScrollView) view.findViewById(R.id.parent_scroll_view);
        this.f28479H = (ImageView) view.findViewById(R.id.iv_reminder_expire_time);
        this.f28478G = (ImageView) view.findViewById(R.id.iv_reminder_alert_time);
        this.f28509s = view.findViewById(R.id.reminder_setting_time);
        this.f28494d = view.findViewById(R.id.titlebar_divider);
        this.f28484M = (FrameLayout) view.findViewById(R.id.reminder_root);
        this.f28474C = (TextView) view.findViewById(R.id.tv_reminder_person_name);
        C13747j.m55728a((ImageView) this.f28505o, (int) R.color.icon_n1);
        m43985l();
        m43984k();
        m43983j();
        m43987n();
        m43986m();
        this.f28480I.setFocusable(true);
        this.f28480I.setFocusableInTouchMode(true);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40646a(this.f28484M);
    }

    /* renamed from: b */
    public void mo40108b(long j) {
        this.f28472A.setText(C13723a.m55665e(getContext(), j));
    }

    /* renamed from: c */
    public void mo40110c(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        List<EAlertTimeEvent> list;
        EAlertTimeEvent eAlertTimeEvent;
        boolean z5 = false;
        if (z) {
            if (!this.f28499i.mo40221h() || !this.f28503m) {
                z4 = false;
            } else {
                z4 = true;
            }
            C10613a aVar = this.f28485N;
            C10621b bVar = this.f28499i;
            if (z4) {
                list = bVar.mo40231r();
            } else {
                list = bVar.mo40229p();
            }
            aVar.mo40124a(list);
            this.f28476E.mo45703b();
            WheelView wheelView = this.f28476E;
            C10613a aVar2 = this.f28485N;
            if (z4) {
                eAlertTimeEvent = this.f28499i.mo40228o();
            } else {
                eAlertTimeEvent = this.f28499i.mo40227n();
            }
            wheelView.setCurrentItem(aVar2.mo40122a(eAlertTimeEvent));
        }
        String str = (String) this.f28476E.getCurrentObject();
        this.f28473B.setText(str);
        if (getContext() == null || !TextUtils.equals(getContext().getString(R.string.Doc_Reminder_NoAlert), str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !this.f28499i.mo40236w()) {
            z3 = false;
        } else {
            z3 = true;
        }
        m43981h(z3);
        if (z2 && this.f28499i.mo40237x()) {
            z5 = true;
        }
        m43979g(z5);
    }

    /* renamed from: a */
    public C10621b mo40105a(C10621b bVar) {
        return new C10621b(bVar);
    }

    /* renamed from: b */
    public void mo40109b(List<ReminderUserEntity> list) {
        if (this.f28500j < list.size()) {
            this.f28497g.onShowReminderPersonCountLimitToast();
            return;
        }
        this.f28477F.setUserEntityList(list);
        this.f28499i.mo40215b(list);
    }

    /* renamed from: a */
    public void mo40106a(long j) {
        java.util.Calendar instance = java.util.Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(2, instance.get(2) + 1);
        this.f28475D.setSelectedCalendar(instance);
        java.util.Calendar b = C10615c.m44027b(j);
        this.f28496f.setText(C13723a.m55667g(getContext(), j));
        ReminderMonthView.updateExpireTime(b.get(11), b.get(12));
    }

    /* renamed from: a */
    public void mo40107a(List<ReminderUserEntity> list) {
        mo40111d(false);
        mo40114f(false);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43963a(DialogInterface dialogInterface, int i) {
        this.f28497g.onClickConfirmQuit();
        this.f28502l = true;
        ReminderViewModel dVar = this.f28497g;
        if (dVar != null) {
            dVar.closeReminder();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m43971b(DialogInterface dialogInterface, int i) {
        this.f28497g.onClickContinueEdit();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m43970b(int i, int i2) {
        C13479a.m54772d("ReminderFragment", "onMonthChange");
        this.f28497g.onMonthChange();
        mo40108b(C10615c.m44026a(i, i2, 1).getTimeInMillis());
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m43975c(DialogInterface dialogInterface, int i) {
        String str;
        AtEditText atEditText = this.f28480I;
        if (this.f28499i.mo40225l() == null) {
            str = "";
        } else {
            str = this.f28499i.mo40225l();
        }
        atEditText.setText(str);
        mo40112e(false);
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m43978d(DialogInterface dialogInterface, int i) {
        if (!TextUtils.isEmpty(this.f28489R)) {
            this.f28480I.setText(this.f28489R);
        }
        m43989p();
        mo40112e(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            IStatusBar a = StatusBarManager.m55628a(getActivity());
            this.f28491T = a;
            a.mo50687a();
            this.f28491T.mo50690b(R.color.ud_N00, true);
        }
    }

    /* renamed from: a */
    private void m43966a(TextView textView, ImageView imageView) {
        textView.setSelected(true);
        if (!imageView.isSelected()) {
            imageView.animate().rotationBy(-180.0f).setDuration(200).start();
            imageView.setSelected(true);
        }
    }

    /* renamed from: b */
    private void m43973b(TextView textView, ImageView imageView) {
        textView.setSelected(false);
        if (imageView.isSelected()) {
            imageView.setSelected(false);
            imageView.animate().rotationBy(180.0f).setDuration(200).start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.reminder_layout, viewGroup, false);
        m43964a(inflate);
        m43972b(inflate);
        m43982i();
        return inflate;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        View view = this.f28515y;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = C13749l.m55738a(30);
            this.f28515y.setLayoutParams(layoutParams);
        }
        if (i > 0) {
            m43989p();
            C13742g.m55705a(new Runnable(i) {
                /* class com.bytedance.ee.bear.reminder.$$Lambda$a$JqC2sxmhgPDyVQeCmC8H1g2tKg */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    View$OnClickListenerC10607a.m269903lambda$JqC2sxmhgPDyVQeCmC8H1g2tKg(View$OnClickListenerC10607a.this, this.f$1);
                }
            });
            return;
        }
        m43996w();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m43968a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        return mo40115g();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43965a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int lineCount = this.f28480I.getLineCount();
        int i9 = this.f28488Q;
        if (lineCount > i9) {
            this.f28488Q = lineCount;
            C13742g.m55705a(new Runnable((lineCount - i9) * this.f28480I.getLineHeight()) {
                /* class com.bytedance.ee.bear.reminder.$$Lambda$a$wFiEA7q3m2KnRDyPCQZ8HV8QuoM */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    View$OnClickListenerC10607a.lambda$wFiEA7q3m2KnRDyPCQZ8HV8QuoM(View$OnClickListenerC10607a.this, this.f$1);
                }
            });
        }
    }
}
