package com.bytedance.ee.bear.sheet.reminder;

import com.bytedance.ee.bear.reminder.model.C10621b;
import com.bytedance.ee.bear.reminder.model.EAlertTimeEvent;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.sheet.reminder.b */
public class C11293b extends C10621b {
    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a, com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: a */
    public boolean mo40205a() {
        return true;
    }

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a, com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: b */
    public boolean mo40206b() {
        return true;
    }

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a, com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: c */
    public int mo40207c() {
        return 1000;
    }

    @Override // com.bytedance.ee.bear.reminder.model.AbstractC10620a, com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: d */
    public int mo40208d() {
        return ParticipantRepo.f117150c;
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: t */
    public int mo40233t() {
        return R.color.space_kit_b500;
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: u */
    public int mo40234u() {
        return R.color.space_kit_b500;
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: v */
    public int mo40235v() {
        return R.color.space_kit_b500;
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: w */
    public boolean mo40236w() {
        return true;
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: x */
    public boolean mo40237x() {
        return true;
    }

    public C11293b() {
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: p */
    public List<EAlertTimeEvent> mo40229p() {
        return Arrays.asList(EAlertTimeEvent.noAlert, EAlertTimeEvent.onDayOfEvent, EAlertTimeEvent.oneDayBefore, EAlertTimeEvent.twoDaysBefore, EAlertTimeEvent.oneWeekBefore);
    }

    @Override // com.bytedance.ee.bear.reminder.model.C10621b
    /* renamed from: r */
    public List<EAlertTimeEvent> mo40231r() {
        return Arrays.asList(EAlertTimeEvent.noAlert, EAlertTimeEvent.atTimeOfEvent, EAlertTimeEvent.before5Mins, EAlertTimeEvent.before15Mins, EAlertTimeEvent.before30Mins, EAlertTimeEvent.before1Hour, EAlertTimeEvent.before2Hours, EAlertTimeEvent.before1Day, EAlertTimeEvent.before2Days, EAlertTimeEvent.before1Week);
    }

    public C11293b(C10621b bVar) {
        super(bVar);
    }
}
