package com.ss.android.vc.lark.setting;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.response.C60987v;
import com.ss.android.vc.lark.setting.AbstractC61183a;
import com.ss.android.vc.meeting.module.admin.VideoChatAdminSettings;
import com.ss.android.vc.service.C63634c;

/* renamed from: com.ss.android.vc.lark.setting.g */
public class C61207g implements AbstractC61183a.AbstractC61186b {

    /* renamed from: a */
    UDSwitch f153271a;

    /* renamed from: b */
    UDSwitch f153272b;

    /* renamed from: c */
    UDSwitch f153273c;

    /* renamed from: d */
    View f153274d;

    /* renamed from: e */
    UDSwitch f153275e;

    /* renamed from: f */
    CommonTitleBar f153276f;

    /* renamed from: g */
    View f153277g;

    /* renamed from: h */
    private final Context f153278h;

    /* renamed from: i */
    private View f153279i;

    /* renamed from: j */
    private AbstractC61183a.AbstractC61186b.AbstractC61187a f153280j;

    /* renamed from: k */
    private boolean f153281k = true;

    /* renamed from: c */
    private boolean m238007c() {
        return C63634c.m249496b("byteview.meeting.android.simu_interpretation");
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f153280j = null;
        this.f153279i = null;
    }

    /* renamed from: b */
    private boolean m238005b() {
        if (!C63634c.m249496b("byteview.asr.subtitle") || !VideoChatAdminSettings.m239417e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m238002a() {
        this.f153271a = (UDSwitch) this.f153279i.findViewById(R.id.notification_switcher);
        this.f153272b = (UDSwitch) this.f153279i.findViewById(R.id.play_chimes_switcher);
        this.f153273c = (UDSwitch) this.f153279i.findViewById(R.id.subtitle_switcher);
        this.f153274d = this.f153279i.findViewById(R.id.subtitle_container);
        this.f153275e = (UDSwitch) this.f153279i.findViewById(R.id.language_interpretation_switcher);
        this.f153276f = (CommonTitleBar) this.f153279i.findViewById(R.id.titlebar);
        this.f153277g = this.f153279i.findViewById(R.id.language_interpretation_container);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m238002a();
        C61189c.m237973a();
        if (!m238005b()) {
            this.f153274d.setVisibility(8);
        } else {
            this.f153274d.setVisibility(0);
        }
        if (!m238007c()) {
            this.f153277g.setVisibility(8);
        } else {
            this.f153277g.setVisibility(0);
        }
        this.f153271a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.lark.setting.$$Lambda$g$JVTV9vswOomsER69Dpefe7Eh9I */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C61207g.this.m238008d(compoundButton, z);
            }
        });
        this.f153272b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.lark.setting.$$Lambda$g$oK2Sz4n4YWb3rU3yvVgBaqDFT14 */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C61207g.this.m238006c(compoundButton, z);
            }
        });
        this.f153273c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.lark.setting.$$Lambda$g$lLSckXmnbEkoOR8GAJGx1cJ9nYs */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C61207g.this.m238004b(compoundButton, z);
            }
        });
        this.f153275e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.vc.lark.setting.$$Lambda$g$FBTGcL3PFTeowRLukrp5B45xw5I */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C61207g.this.m238003a(compoundButton, z);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC61183a.AbstractC61186b.AbstractC61187a aVar) {
        this.f153280j = aVar;
    }

    /* renamed from: a */
    public void mo211599a(C60987v vVar) {
        if (vVar != null) {
            C60700b.m235851b("VideoChatSettingView", "[updateSuiteQuotaSetting]", "GetSuiteQuotaEntity.interpretation : " + vVar.f152724b);
            if (!vVar.f152724b || !m238007c()) {
                this.f153277g.setVisibility(8);
            } else {
                this.f153277g.setVisibility(0);
            }
        } else {
            C60700b.m235851b("VideoChatSettingView", "[updateSuiteQuotaSetting2]", "GetSuiteQuotaEntity = null");
        }
    }

    /* renamed from: a */
    public void mo211601a(C61188b bVar) {
        this.f153271a.setChecked(bVar.mo211576a());
        this.f153272b.setChecked(bVar.mo211578b());
        this.f153273c.setChecked(bVar.mo211580c());
        this.f153275e.setChecked(bVar.mo211582d());
        if (this.f153281k) {
            this.f153281k = false;
        }
    }

    public C61207g(Context context, View view) {
        this.f153278h = context;
        this.f153279i = view;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m238003a(CompoundButton compoundButton, boolean z) {
        AbstractC61183a.AbstractC61186b.AbstractC61187a aVar = this.f153280j;
        if (aVar != null && !this.f153281k) {
            aVar.mo211574d(z);
            this.f153275e.setChecked(z);
            C61189c.m237978d(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m238004b(CompoundButton compoundButton, boolean z) {
        AbstractC61183a.AbstractC61186b.AbstractC61187a aVar = this.f153280j;
        if (aVar != null && !this.f153281k) {
            aVar.mo211573c(z);
            this.f153273c.setChecked(z);
            C61189c.m237977c(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m238006c(CompoundButton compoundButton, boolean z) {
        AbstractC61183a.AbstractC61186b.AbstractC61187a aVar = this.f153280j;
        if (aVar != null && !this.f153281k) {
            aVar.mo211572b(z);
            this.f153272b.setChecked(z);
            C61189c.m237976b(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m238008d(CompoundButton compoundButton, boolean z) {
        AbstractC61183a.AbstractC61186b.AbstractC61187a aVar = this.f153280j;
        if (aVar != null && !this.f153281k) {
            aVar.mo211571a(z);
            this.f153271a.setChecked(z);
            C61189c.m237975a(z);
        }
    }
}
