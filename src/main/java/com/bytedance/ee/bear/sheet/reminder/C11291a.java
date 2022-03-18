package com.bytedance.ee.bear.sheet.reminder;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.UserEntity;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.user.MentionUserSelectPanel;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.reminder.ReminderViewModel;
import com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a;
import com.bytedance.ee.bear.reminder.model.C10621b;
import com.bytedance.ee.bear.reminder.model.EAlertTimeEvent;
import com.bytedance.ee.bear.reminder.model.ReminderUserEntity;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.bear.sheet.reminder.C11291a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.sheet.reminder.a */
public class C11291a extends View$OnClickListenerC10607a {

    /* renamed from: n */
    static final /* synthetic */ boolean f30363n = true;

    /* renamed from: m */
    public MentionUserSelectPanel f30364m;

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m46915i() {
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a
    /* renamed from: f */
    public ReminderViewModel mo40113f() {
        return (ReminderViewModel) C4950k.m20474a(this, C11294c.class);
    }

    @Override // com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a
    /* renamed from: g */
    public boolean mo40115g() {
        MentionUserSelectPanel bVar = this.f30364m;
        if (bVar == null || !bVar.mo17980d()) {
            return super.mo40115g();
        }
        this.f30364m.mo17978b();
        return f30363n;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment, com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a
    public void onDestroyView() {
        super.onDestroyView();
        MentionUserSelectPanel bVar = this.f30364m;
        if (bVar != null && bVar.mo17980d()) {
            this.f30364m.mo17978b();
        }
        m46914h();
    }

    /* renamed from: h */
    private void m46914h() {
        C10621b bVar;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f28502l) {
            bVar = this.f28498h;
        } else {
            bVar = this.f28499i;
        }
        boolean z4 = false;
        if (this.f28498h.mo40222i() != bVar.mo40222i()) {
            z = f30363n;
        } else {
            z = false;
        }
        boolean h = bVar.mo40221h();
        if (!h ? bVar.mo40227n() == EAlertTimeEvent.noAlert : bVar.mo40228o() == EAlertTimeEvent.noAlert) {
            z2 = false;
        } else {
            z2 = f30363n;
        }
        List<ReminderUserEntity> m = this.f28498h.mo40226m();
        List<ReminderUserEntity> m2 = bVar.mo40226m();
        if (m == null || m2 == null) {
            if (!(m == null && m2 == null)) {
                z4 = f30363n;
            }
            z3 = z4;
        } else {
            z3 = m.equals(m2) ^ f30363n;
        }
        C11090b.m46147a(z, h, z2, z3, TextUtils.equals(this.f28498h.mo40225l(), bVar.mo40225l()) ^ f30363n);
    }

    @Override // com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a
    /* renamed from: a */
    public C10621b mo40105a(C10621b bVar) {
        return new C11293b(bVar);
    }

    /* renamed from: d */
    private List<UserEntity> m46913d(List<ReminderUserEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                ReminderUserEntity reminderUserEntity = list.get(i);
                arrayList.add(new UserEntity(reminderUserEntity.getId(), reminderUserEntity.getName(), reminderUserEntity.getEnName(), reminderUserEntity.getAvatarUrl(), (String) null));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<ReminderUserEntity> mo43259c(List<UserEntity> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                UserEntity userEntity = list.get(i);
                arrayList.add(new ReminderUserEntity(userEntity.getUserId(), userEntity.getName(), userEntity.getEnName(), userEntity.getAvatarUrl()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.reminder.View$OnClickListenerC10607a
    /* renamed from: a */
    public void mo40107a(List<ReminderUserEntity> list) {
        super.mo40107a(list);
        MentionUserSelectPanel bVar = this.f30364m;
        if (bVar == null || !bVar.mo17980d()) {
            List<UserEntity> d = m46913d(list);
            if (getContext() instanceof FragmentActivity) {
                boolean z = f30363n;
                if (!z && this.f28501k == null) {
                    throw new AssertionError();
                } else if (z || this.f28501k.f17447b != null) {
                    MentionUserSelectPanel bVar2 = new MentionUserSelectPanel(getContext(), (FragmentActivity) getContext(), this.f28501k.f17447b, C10599b.m43898a(C8275a.m34055d(this.f28501k.f17446a)), false, false, false);
                    this.f30364m = bVar2;
                    bVar2.mo17977a(new AbstractC4565a.AbstractC4569b<List<UserEntity>>() {
                        /* class com.bytedance.ee.bear.sheet.reminder.C11291a.C112921 */

                        @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4569b
                        /* renamed from: a */
                        public void mo17987a(String str, Map<String, String> map) {
                        }

                        /* access modifiers changed from: private */
                        /* access modifiers changed from: public */
                        /* renamed from: b */
                        private /* synthetic */ void m46921b(List list) {
                            C11291a.this.f30364m.mo18378a(list.subList(0, C11291a.this.f28500j));
                        }

                        /* renamed from: a */
                        public void mo17986a(List<UserEntity> list) {
                            if (C11291a.this.f28500j < list.size()) {
                                C11291a.this.f28497g.onShowReminderPersonCountLimitToast();
                                Toast.showFailureText(C11291a.this.getContext(), C11291a.this.getString(R.string.Doc_Reminder_Toast_RecipientMax), 0);
                                C13742g.m55705a(new Runnable(list) {
                                    /* class com.bytedance.ee.bear.sheet.reminder.$$Lambda$a$1$nG63l04k69WzCJvZadmL56Ks4c */
                                    public final /* synthetic */ List f$1;

                                    {
                                        this.f$1 = r2;
                                    }

                                    public final void run() {
                                        C11291a.C112921.this.m46921b(this.f$1);
                                    }
                                });
                                return;
                            }
                            C11291a aVar = C11291a.this;
                            aVar.mo40109b(aVar.mo43259c(list));
                        }
                    });
                    this.f30364m.mo17976a($$Lambda$a$T2CFDnrh9I0tdsoL5lMwoUW9iY.INSTANCE);
                    this.f30364m.mo18377a(getString(R.string.Doc_Reminder_Notify_Person), f30363n, d);
                    this.f30364m.mo17975a(new FrameLayout.LayoutParams(-1, -1));
                    this.f30364m.mo17973a();
                } else {
                    throw new AssertionError();
                }
            } else {
                C13479a.m54758a("SheetReminderFragment", "context is not FragmentActivity");
            }
        }
    }
}
