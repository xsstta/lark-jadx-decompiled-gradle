package com.ss.android.lark.calendar.impl.features.remind.reminder;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.remind.notification.NotificationHelper;
import com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.C32609u;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32663p;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.ding.helper.C36644b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.a */
public class C32266a {

    /* renamed from: a */
    public AbstractC32269a f82544a;

    /* renamed from: b */
    public Activity f82545b;

    /* renamed from: c */
    private List<C32609u> f82546c = new ArrayList();

    /* renamed from: d */
    private List<C32270b> f82547d = new ArrayList();

    /* renamed from: com.ss.android.lark.calendar.impl.features.remind.reminder.a$a */
    interface AbstractC32269a {
        /* renamed from: a */
        void mo117927a(C32609u uVar);
    }

    /* renamed from: c */
    private int m123040c(C32609u uVar) {
        for (int i = 0; i < this.f82546c.size(); i++) {
            if (uVar.mo120224a(this.f82546c.get(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo117923a(C32609u uVar) {
        int indexOf = this.f82546c.indexOf(uVar);
        if (indexOf != -1) {
            C36644b.m144618a().mo135215a(this.f82547d.get(indexOf).mo117929a());
            mo117925b(uVar);
        }
    }

    /* renamed from: b */
    public void mo117925b(C32609u uVar) {
        int indexOf = this.f82546c.indexOf(uVar);
        if (indexOf != -1) {
            this.f82546c.remove(indexOf);
            this.f82547d.remove(indexOf);
        }
    }

    /* renamed from: b */
    public C32609u mo117924b(OverallReminderData overallReminderData) {
        C32609u uVar = new C32609u();
        uVar.mo120223a(overallReminderData.getCalendarId());
        uVar.mo120227b(overallReminderData.getKey());
        uVar.mo120221a(overallReminderData.getMinutes());
        uVar.mo120222a(overallReminderData.getOriginalTime());
        uVar.mo120226b(overallReminderData.getStartTime());
        return uVar;
    }

    /* renamed from: a */
    public void mo117922a(OverallReminderData overallReminderData) {
        String str;
        final C32609u b = mo117924b(overallReminderData);
        C32270b bVar = new C32270b(new OverallReminderView.AbstractC32265a() {
            /* class com.ss.android.lark.calendar.impl.features.remind.reminder.C32266a.C322671 */

            @Override // com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView.AbstractC32265a
            /* renamed from: a */
            public void mo117920a(OverallReminderData overallReminderData) {
                C32266a aVar = C32266a.this;
                aVar.mo117925b(aVar.mo117924b(overallReminderData));
                if (C32266a.this.f82544a != null) {
                    C32266a.this.f82544a.mo117927a(b);
                }
            }

            @Override // com.ss.android.lark.calendar.impl.features.remind.reminder.OverallReminderView.AbstractC32265a
            /* renamed from: b */
            public void mo117921b(final OverallReminderData overallReminderData) {
                C32266a aVar = C32266a.this;
                aVar.mo117925b(aVar.mo117924b(overallReminderData));
                if (C32266a.this.f82544a != null) {
                    C32266a.this.f82544a.mo117927a(b);
                }
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.calendar.impl.features.remind.reminder.C32266a.C322671.RunnableC322681 */

                    public void run() {
                        C31238b.m116872a(C32266a.this.f82545b, overallReminderData);
                    }
                }, 300);
            }
        });
        bVar.mo117930a(overallReminderData);
        if (C36644b.m144618a().mo135221d() == 0) {
            this.f82546c.clear();
            this.f82547d.clear();
        }
        if (this.f82546c.isEmpty() || !this.f82546c.contains(b)) {
            C36644b.m144618a().mo135214a(bVar);
            int c = m123040c(b);
            if (!this.f82546c.isEmpty() && c != -1) {
                C36644b.m144618a().mo135215a(this.f82547d.get(c).mo117929a());
                this.f82546c.remove(c);
                this.f82547d.remove(c);
            }
            this.f82546c.add(b);
            this.f82547d.add(bVar);
            String eventId = overallReminderData.getEventId();
            String str2 = C32663p.m125353b(overallReminderData) + C32663p.m125354c(overallReminderData);
            if (TextUtils.isEmpty(overallReminderData.getTitle())) {
                str = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
            } else {
                str = overallReminderData.getTitle();
            }
            C30022a.f74882a.pushDependency().mo108293a(NotificationHelper.m123033a(overallReminderData), eventId, str2, str);
            GeneralHitPoint.m124193a(overallReminderData.getEventId(), overallReminderData.getMinutes());
        }
    }

    public C32266a(Activity activity, AbstractC32269a aVar) {
        this.f82545b = activity;
        this.f82544a = aVar;
    }
}
