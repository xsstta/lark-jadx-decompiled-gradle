package com.ss.android.vc.meeting.module.preview.guest;

import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.module.preview.AbstractC62684c;
import com.ss.android.vc.meeting.module.preview.AbstractC62746h;
import com.ss.android.vc.statistics.event.bq;
import com.ss.android.vc.statistics.event2.MeetingPreEvent;
import java.util.UUID;

/* renamed from: com.ss.android.vc.meeting.module.preview.guest.b */
public class C62738b extends AbstractC62684c<C62739c> {

    /* renamed from: f */
    private String f157875f;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: e */
    public String mo216564e() {
        return "会议 ID";
    }

    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public String mo216561a() {
        return ((C62739c) this.f157735b).mo216736q();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: d */
    public void mo216563d() {
        bq.m250210b(this.f157738e, this.f157875f, this.f157736c);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.vc.meeting.module.preview.AbstractC62684c
    public void onResume() {
        super.onResume();
        ((C62739c) this.f157735b).mo216738s();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.vc.meeting.module.preview.AbstractC62684c
    /* renamed from: a */
    public boolean mo216587a(Bundle bundle) {
        if (bundle.getInt("param_start_source", 0) == 0) {
            C60700b.m235864f("MeetingPreviewGuestFragment", "[parseParams]", "Start activity illegally.");
            return false;
        }
        String string = bundle.getString("param_env_id");
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
        }
        this.f157736c = string;
        this.f157875f = bundle.getString("param_web_id");
        this.f157734a = bundle.getInt("param_preview_type", Integer.MIN_VALUE);
        if (this.f157734a == Integer.MIN_VALUE) {
            C60700b.m235864f("MeetingPreviewGuestFragment", "[parseParams2]", "Param error. [type]" + this.f157734a);
            return false;
        }
        this.f157737d = VideoChat.VendorType.valueOf(bundle.getInt("param_vendor_type"));
        this.f157738e = bundle.getBoolean("param_enter_from_url");
        mo216563d();
        MeetingPreEvent.m249851a().mo220333a(this.f157736c, true, true, false, this.f157738e);
        return true;
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.vc.meeting.module.preview.AbstractC62684c
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C60700b.m235851b("MeetingPreviewGuestFragment", "[onConfigurationChanged]", "orientation:" + configuration.toString());
        if (!C60776r.m236157o() && (getActivity() == null || configuration.orientation != 2 || getActivity().getRequestedOrientation() != 1)) {
            C61237h.m238223a().mo210544g(-1);
        } else if (configuration.orientation == 2) {
            C61237h.m238223a().mo210544g(270);
        } else {
            C61237h.m238223a().mo210544g(-1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C62739c mo216560a(BaseFragment baseFragment, AbstractC62746h hVar) {
        return new C62739c(baseFragment, hVar);
    }
}
