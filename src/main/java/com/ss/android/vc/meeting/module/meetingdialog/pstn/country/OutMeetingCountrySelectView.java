package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60754h;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.EfficientLoadingLottieView;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62405a;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.QuickSideBarView;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;

public class OutMeetingCountrySelectView extends CountrySelectView {

    /* renamed from: n */
    private TextView f156968n;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView
    /* renamed from: g */
    public void mo215777g() {
        C60700b.m235851b("OutMeetingCountrySelectView", "[loadAdminSettings]", "start");
        String d = VideoChatModuleDependency.m236631d();
        if (TextUtils.isEmpty(d)) {
            d = "0";
        }
        VcBizSender.m249290i(d).mo219893b(new AbstractC63598b<AdminSettings>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.OutMeetingCountrySelectView.C624041 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("OutMeetingCountrySelectView", "[getTenantAdminSettings2]", "loadTenantAdminSettings error" + eVar);
                OutMeetingCountrySelectView.this.mo215768a(eVar.f160599b);
            }

            /* renamed from: a */
            public void onSuccess(AdminSettings adminSettings) {
                if (adminSettings != null) {
                    C60700b.m235851b("OutMeetingCountrySelectView", "[getTenantAdminSettings]", "succeed: " + adminSettings);
                    synchronized (OutMeetingCountrySelectView.this) {
                        OutMeetingCountrySelectView.this.f156960l = adminSettings;
                    }
                    OutMeetingCountrySelectView.this.mo215778h();
                    return;
                }
                OutMeetingCountrySelectView.this.mo215768a(new ErrorResult("[getTenantAdminSettings] parse admin settings failed"));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView
    /* renamed from: a */
    public void mo215767a() {
        LayoutInflater.from(getContext()).inflate(R.layout.outmeeting_country_select_layout, (ViewGroup) this, true);
        setBackgroundColor(C60773o.m236126d(R.color.lkui_N00));
        this.f156949a = findViewById(R.id.country_select_close);
        this.f156949a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$OutMeetingCountrySelectView$MFhOFcyq6Bdo1gu1rgpSpqMoIQg */

            public final void onClick(View view) {
                OutMeetingCountrySelectView.lambda$MFhOFcyq6Bdo1gu1rgpSpqMoIQg(OutMeetingCountrySelectView.this, view);
            }
        });
        this.f156950b = (QuickSideBarView) findViewById(R.id.country_index);
        this.f156951c = (RecyclerView) findViewById(R.id.country_recycler);
        this.f156951c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f156952d = new C62405a();
        this.f156952d.mo215791a((C62405a.AbstractC62408c) this);
        this.f156951c.setAdapter(this.f156952d);
        this.f156953e = new C26198f(this.f156952d);
        this.f156954f = (ViewGroup) findViewById(R.id.load_status_container);
        this.f156955g = (ViewGroup) findViewById(R.id.loading_container);
        this.f156956h = (ViewGroup) findViewById(R.id.error_container);
        this.f156957i = (EfficientLoadingLottieView) findViewById(R.id.loading_anim_view);
        this.f156958j = findViewById(R.id.error_retry);
        this.f156958j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$OutMeetingCountrySelectView$s29HUb0vHQQUKUzOE_0BFqiiZ8M */

            public final void onClick(View view) {
                OutMeetingCountrySelectView.lambda$s29HUb0vHQQUKUzOE_0BFqiiZ8M(OutMeetingCountrySelectView.this, view);
            }
        });
        this.f156968n = (TextView) findViewById(R.id.meeting_id_tv);
    }

    public OutMeetingCountrySelectView(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView
    /* renamed from: a */
    public /* synthetic */ void m243903a(View view) {
        mo215775e();
    }

    /* access modifiers changed from: private */
    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView
    /* renamed from: b */
    public /* synthetic */ void m243904b(View view) {
        mo215773c();
    }

    public void setMeetingId(String str) {
        this.f156968n.setText(C60773o.m236119a((int) R.string.Lark_View_MeetingIdColon));
        if (!TextUtils.isEmpty(str)) {
            this.f156968n.append(C60754h.m236085a(str));
        }
    }

    public OutMeetingCountrySelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OutMeetingCountrySelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
