package com.ss.android.vc.meeting.module.presetting;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.switch_button.SwitchButton;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.entity.response.CalendarVCSettingsEntity;
import com.ss.android.vc.meeting.module.presetting.AbstractC62625a;
import com.ss.android.vc.meeting.module.presetting.C62645f;
import com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent;
import com.ss.android.vc.meeting.utils.SpanUtil;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import com.ss.android.vc.statistics.event2.MeetingPreSettingEvent2;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ss.android.vc.meeting.module.presetting.e */
public class C62643e implements AbstractC62625a.AbstractC62627b, C62645f.AbstractC62648a {

    /* renamed from: a */
    SwitchButton f157688a;

    /* renamed from: b */
    SwitchButton f157689b;

    /* renamed from: c */
    SwitchButton f157690c;

    /* renamed from: d */
    RecyclerView f157691d;

    /* renamed from: e */
    CommonTitleBar f157692e;

    /* renamed from: f */
    SwitchButton f157693f;

    /* renamed from: g */
    ConstraintLayout f157694g;

    /* renamed from: h */
    TextView f157695h;

    /* renamed from: i */
    public final Context f157696i;

    /* renamed from: j */
    private View f157697j;

    /* renamed from: k */
    private AbstractC62625a.AbstractC62627b.AbstractC62628a f157698k;

    /* renamed from: l */
    private boolean f157699l = true;

    /* renamed from: m */
    private C62645f f157700m;

    /* renamed from: n */
    private final String f157701n;

    /* renamed from: o */
    private MeetingPreSettingEvent.SecurityLevel f157702o;

    /* renamed from: p */
    private final String f157703p = UUID.randomUUID().toString();

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f157698k = null;
        this.f157697j = null;
    }

    /* renamed from: b */
    private void m245061b() {
        this.f157688a = (SwitchButton) this.f157697j.findViewById(R.id.lobby_setting_switcher);
        this.f157689b = (SwitchButton) this.f157697j.findViewById(R.id.pre_join_meeting_setting_switcher);
        this.f157690c = (SwitchButton) this.f157697j.findViewById(R.id.microphone_setting_switcher);
        this.f157691d = (RecyclerView) this.f157697j.findViewById(R.id.security_setting_level);
        this.f157692e = (CommonTitleBar) this.f157697j.findViewById(R.id.titlebar);
        this.f157693f = (SwitchButton) this.f157697j.findViewById(R.id.record_settings_switcher);
        this.f157694g = (ConstraintLayout) this.f157697j.findViewById(R.id.auto_record_layout);
        this.f157695h = (TextView) this.f157697j.findViewById(R.id.lobby_setting_label);
    }

    /* renamed from: a */
    public void mo216479a() {
        MeetingPreSettingEvent.m245027a(this.f157690c.isChecked(), this.f157702o, this.f157688a.isChecked(), this.f157689b.isChecked(), this.f157693f.isChecked());
        MeetingPreSettingEvent2.m249878a("confirm", "cal_event_detail_view", MeetingPreSettingEvent2.m249875a(this.f157702o), this.f157688a.isChecked(), this.f157689b.isChecked(), this.f157690c.isChecked(), this.f157693f.isChecked(), null, null, this.f157703p);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m245061b();
        this.f157688a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.presetting.$$Lambda$e$Kzmrxl8NdKwbVipRjktuE_vnr4Q */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C62643e.lambda$Kzmrxl8NdKwbVipRjktuE_vnr4Q(C62643e.this, compoundButton, z);
            }
        });
        this.f157689b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.presetting.$$Lambda$e$_ahMq7Jf_vWeVSd6AbOeuPQirJo */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C62643e.lambda$_ahMq7Jf_vWeVSd6AbOeuPQirJo(C62643e.this, compoundButton, z);
            }
        });
        this.f157690c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.meeting.module.presetting.$$Lambda$e$HUbG3DKWufiq_4crHVTkEckqOY4 */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C62643e.lambda$HUbG3DKWufiq_4crHVTkEckqOY4(C62643e.this, compoundButton, z);
            }
        });
        this.f157692e.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.presetting.C62643e.View$OnClickListenerC626441 */

            public void onClick(View view) {
                C62643e.this.mo216479a();
                if (C62643e.this.f157696i != null && (C62643e.this.f157696i instanceof Activity)) {
                    ((Activity) C62643e.this.f157696i).finish();
                }
            }
        });
        if (C63634c.m249496b("byteview.meeting.android.auto_record")) {
            this.f157694g.setVisibility(0);
            this.f157693f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                /* class com.ss.android.vc.meeting.module.presetting.$$Lambda$e$ErIqH9kwLflkSv8jJZfTK4rHbg */

                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C62643e.m271364lambda$ErIqH9kwLflkSv8jJZfTK4rHbg(C62643e.this, compoundButton, z);
                }
            });
        } else {
            this.f157694g.setVisibility(8);
        }
        C62645f fVar = new C62645f(this);
        this.f157700m = fVar;
        List items = fVar.getItems();
        items.add(CalendarVCSettingsEntity.VCSecuritySetting.PUBLIC);
        items.add(CalendarVCSettingsEntity.VCSecuritySetting.SAME_TENANT);
        items.add(CalendarVCSettingsEntity.VCSecuritySetting.ONLY_CALENDAR_GUEST);
        this.f157691d.setAdapter(this.f157700m);
        MeetingPreSettingEvent.m245024a();
        MeetingPreSettingEvent2.m249876a(this.f157703p);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC62625a.AbstractC62627b.AbstractC62628a aVar) {
        this.f157698k = aVar;
    }

    /* renamed from: b */
    private MeetingPreSettingEvent.SecurityLevel m245060b(CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting) {
        if (vCSecuritySetting == CalendarVCSettingsEntity.VCSecuritySetting.PUBLIC) {
            return MeetingPreSettingEvent.SecurityLevel.ANYONE;
        }
        if (vCSecuritySetting == CalendarVCSettingsEntity.VCSecuritySetting.SAME_TENANT) {
            return MeetingPreSettingEvent.SecurityLevel.ORGANIZERCOMPANY;
        }
        if (vCSecuritySetting == CalendarVCSettingsEntity.VCSecuritySetting.ONLY_CALENDAR_GUEST) {
            return MeetingPreSettingEvent.SecurityLevel.EVENTGUEST;
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.presetting.C62645f.AbstractC62648a
    /* renamed from: a */
    public void mo216480a(CalendarVCSettingsEntity.VCSecuritySetting vCSecuritySetting) {
        this.f157698k.mo216458a(vCSecuritySetting);
        this.f157700m.mo216486a(vCSecuritySetting);
        MeetingPreSettingEvent.SecurityLevel b = m245060b(vCSecuritySetting);
        if (b != null) {
            this.f157702o = b;
            MeetingPreSettingEvent.m245025a(b, this.f157701n);
            MeetingPreSettingEvent2.m249877a("change_permission", "none", MeetingPreSettingEvent2.m249875a(this.f157702o), null, null, this.f157703p);
        }
    }

    /* renamed from: a */
    public void mo216481a(CalendarVCSettingsEntity calendarVCSettingsEntity) {
        if (calendarVCSettingsEntity != null) {
            this.f157688a.setChecked(calendarVCSettingsEntity.f152574d);
            this.f157690c.setChecked(calendarVCSettingsEntity.f152573c);
            this.f157689b.setChecked(calendarVCSettingsEntity.f152572b);
            this.f157700m.mo216486a(calendarVCSettingsEntity.f152571a);
            this.f157693f.setChecked(calendarVCSettingsEntity.f152575e);
            this.f157702o = m245060b(calendarVCSettingsEntity.f152571a);
            if (this.f157699l) {
                this.f157699l = false;
            }
        }
    }

    /* renamed from: a */
    public void mo216482a(C60987v vVar) {
        if (vVar != null) {
            C60700b.m235851b("MeetingPreSettingView", "[updateSuiteQuotaSetting]", "GetSuiteQuotaEntity.waitingRoom : " + vVar.f152723a);
            if (vVar.f152723a) {
                this.f157688a.setEnabled(true);
                return;
            }
            this.f157688a.setEnabled(false);
            SpanUtil.f160471a.mo219672a(this.f157695h, (Activity) this.f157696i, MeetingChargingEvent.Type.PRESETTING);
            return;
        }
        C60700b.m235851b("MeetingPreSettingView", "[updateSuiteQuotaSetting2]", "GetSuiteQuotaEntity = null");
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m245059a(CompoundButton compoundButton, boolean z) {
        String str;
        AbstractC62625a.AbstractC62627b.AbstractC62628a aVar = this.f157698k;
        if (aVar != null && !this.f157699l) {
            aVar.mo216462d(z);
            this.f157693f.setChecked(z);
            MeetingPreSettingEvent.m245029b(z, this.f157701n);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            MeetingPreSettingEvent2.m249877a("auto_record", "none", str, null, null, this.f157703p);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m245062b(CompoundButton compoundButton, boolean z) {
        String str;
        AbstractC62625a.AbstractC62627b.AbstractC62628a aVar = this.f157698k;
        if (aVar != null && !this.f157699l) {
            aVar.mo216461c(z);
            this.f157690c.setChecked(z);
            MeetingPreSettingEvent.m245028a(z, this.f157701n);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            MeetingPreSettingEvent2.m249877a("auto_mute", "none", str, null, null, this.f157703p);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m245063c(CompoundButton compoundButton, boolean z) {
        String str;
        AbstractC62625a.AbstractC62627b.AbstractC62628a aVar = this.f157698k;
        if (aVar != null && !this.f157699l) {
            aVar.mo216460b(z);
            this.f157689b.setChecked(z);
            MeetingPreSettingEvent.m245031d(z, this.f157701n);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            MeetingPreSettingEvent2.m249877a("permit_join_before_owner", "none", str, null, null, this.f157703p);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m245064d(CompoundButton compoundButton, boolean z) {
        String str;
        AbstractC62625a.AbstractC62627b.AbstractC62628a aVar = this.f157698k;
        if (aVar != null && !this.f157699l) {
            aVar.mo216459a(z);
            this.f157688a.setChecked(z);
            MeetingPreSettingEvent.m245030c(z, this.f157701n);
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            MeetingPreSettingEvent2.m249877a("enable_pre_waitingroom", "none", str, null, null, this.f157703p);
        }
    }

    public C62643e(Context context, String str, View view) {
        this.f157696i = context;
        this.f157697j = view;
        this.f157701n = str;
    }
}
