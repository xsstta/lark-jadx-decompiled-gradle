package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.content.Intent;
import com.larksuite.framework.mvp.BaseModel;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.d */
public class C61126d extends BaseModel implements C61116b.AbstractC61117a {

    /* renamed from: a */
    private String f153117a;

    /* renamed from: b */
    private String f153118b;

    /* renamed from: c */
    private List<String> f153119c;

    /* renamed from: d */
    private List<ParticipantType> f153120d;

    /* renamed from: e */
    private List<Boolean> f153121e;

    /* renamed from: f */
    private List<Participant.DeviceType> f153122f;

    /* renamed from: g */
    private List<Boolean> f153123g;

    /* renamed from: h */
    private String f153124h;

    /* renamed from: i */
    private String f153125i;

    /* renamed from: j */
    private AttendeeFromSource f153126j;

    /* renamed from: k */
    private boolean f153127k;

    /* renamed from: l */
    private long f153128l;

    /* renamed from: m */
    private String f153129m;

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: a */
    public AttendeeFromSource mo211399a() {
        return this.f153126j;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: b */
    public String mo211400b() {
        return this.f153117a;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: c */
    public String mo211401c() {
        return this.f153118b;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: d */
    public String mo211402d() {
        return this.f153124h;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: e */
    public String mo211403e() {
        return this.f153125i;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: f */
    public List<ParticipantType> mo211404f() {
        return this.f153120d;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: g */
    public List<Participant.DeviceType> mo211405g() {
        return this.f153122f;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: h */
    public List<String> mo211406h() {
        return this.f153119c;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: i */
    public List<Boolean> mo211407i() {
        return this.f153121e;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: j */
    public List<Boolean> mo211408j() {
        return this.f153123g;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: k */
    public boolean mo211409k() {
        return this.f153127k;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: l */
    public long mo211410l() {
        return this.f153128l;
    }

    @Override // com.ss.android.vc.lark.message.meeting.cardview.attendee.C61116b.AbstractC61117a
    /* renamed from: m */
    public String mo211411m() {
        return this.f153129m;
    }

    C61126d(Intent intent) {
        this.f153117a = intent.getStringExtra("extra.meeting_id");
        this.f153118b = intent.getStringExtra("extra.meeting.status");
        this.f153124h = intent.getStringExtra("extra.creator.id");
        this.f153129m = intent.getStringExtra("extra.chat.id");
        this.f153127k = intent.getBooleanExtra("extra.old.card.data", false);
        this.f153128l = intent.getLongExtra("extra.participant.number", 0);
        String stringExtra = intent.getStringExtra("extra.from.source");
        if (stringExtra != null) {
            stringExtra.hashCode();
            char c = 65535;
            switch (stringExtra.hashCode()) {
                case 1716066039:
                    if (stringExtra.equals("VC_CARD_ATTENDEE")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1808007875:
                    if (stringExtra.equals("VC_PREVIEW_ATTENDEE")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1930469014:
                    if (stringExtra.equals("VC_TAB_ATTENDEE")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f153126j = AttendeeFromSource.VC_CARD_ATTENDEE;
                    break;
                case 1:
                    this.f153126j = AttendeeFromSource.VC_PREVIEW_ATTENDEE;
                    break;
                case 2:
                    this.f153126j = AttendeeFromSource.VC_TAB_ATTENDEE;
                    break;
                default:
                    this.f153126j = AttendeeFromSource.UNKNOWN;
                    break;
            }
        }
        int[] intArrayExtra = intent.getIntArrayExtra("extra.participant_types");
        this.f153120d = new ArrayList();
        if (intArrayExtra != null && intArrayExtra.length > 0) {
            for (int i : intArrayExtra) {
                this.f153120d.add(ParticipantType.valueOf(i));
            }
        }
        int[] intArrayExtra2 = intent.getIntArrayExtra("extra.participant_device_types");
        this.f153122f = new ArrayList();
        if (intArrayExtra2 != null && intArrayExtra2.length > 0) {
            for (int i2 : intArrayExtra2) {
                this.f153122f.add(Participant.DeviceType.valueOf(i2));
            }
        }
        this.f153125i = intent.getStringExtra("extra.meeting.topic");
        String[] stringArrayExtra = intent.getStringArrayExtra("extra.participant_ids");
        if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
            this.f153119c = new ArrayList();
        } else {
            this.f153119c = Arrays.asList(stringArrayExtra);
        }
        boolean[] booleanArrayExtra = intent.getBooleanArrayExtra("extra.participant_external_types");
        if (booleanArrayExtra == null || booleanArrayExtra.length <= 0) {
            this.f153121e = Collections.emptyList();
        } else {
            this.f153121e = new ArrayList();
            for (boolean z : booleanArrayExtra) {
                this.f153121e.add(Boolean.valueOf(z));
            }
        }
        boolean[] booleanArrayExtra2 = intent.getBooleanArrayExtra("extra.participant_is_guests");
        if (booleanArrayExtra2 == null || booleanArrayExtra2.length <= 0) {
            this.f153123g = Collections.emptyList();
            return;
        }
        this.f153123g = new ArrayList();
        for (boolean z2 : booleanArrayExtra2) {
            this.f153123g.add(Boolean.valueOf(z2));
        }
    }
}
