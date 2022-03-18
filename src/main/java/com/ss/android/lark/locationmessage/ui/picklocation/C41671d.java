package com.ss.android.lark.locationmessage.ui.picklocation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.locationmessage.C41597c;
import com.ss.android.lark.locationmessage.p2148a.C41588a;
import com.ss.android.lark.locationmessage.statistics.LocationHitPoint;
import com.ss.android.lark.locationmessage.ui.picklocation.C41663a;
import com.ss.android.lark.util.share_preference.UserSP;

/* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.d */
public class C41671d extends BaseFragment {

    /* renamed from: a */
    public View f105832a;

    /* renamed from: b */
    LocationView f105833b;

    /* renamed from: c */
    C41681f f105834c;

    /* renamed from: d */
    public POIConfig f105835d;

    /* renamed from: e */
    private C41663a.AbstractC41664a f105836e = new C41663a.AbstractC41664a() {
        /* class com.ss.android.lark.locationmessage.ui.picklocation.C41671d.C416721 */

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41663a.AbstractC41664a
        /* renamed from: a */
        public void mo149826a(IView iView) {
            ButterKnife.bind(iView, C41671d.this.f105832a);
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41663a.AbstractC41664a
        /* renamed from: a */
        public void mo149827a(POIInfo pOIInfo) {
            boolean z;
            if (pOIInfo != null) {
                z = C41597c.m165069a().mo143916i().mo143931b(pOIInfo.getLatitude(), pOIInfo.getLongitude());
            } else {
                z = false;
            }
            C41671d dVar = C41671d.this;
            dVar.mo149858a(C41586e.m165037a(pOIInfo, dVar.f105835d, z));
            C41671d.this.mo149860b();
        }
    };

    /* renamed from: a */
    public boolean mo149859a() {
        return this.f105834c.mo149866b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f105834c.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f105833b.mo149808g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f105833b.mo149807f();
    }

    /* renamed from: c */
    private void m165337c() {
        this.f105835d = (POIConfig) getArguments().getSerializable("location_request_config");
        C41673e eVar = new C41673e();
        LocationView locationView = new LocationView(getActivity(), this.f105836e, this.f105835d);
        this.f105833b = locationView;
        C41681f fVar = new C41681f(eVar, locationView);
        this.f105834c = fVar;
        fVar.create();
    }

    /* renamed from: b */
    public void mo149860b() {
        if (!this.f105835d.isSelfDefine()) {
            LocationHitPoint.m165167a("message_location_sent", UserSP.getInstance().getString("name_type", "building"), UserSP.getInstance().getString("result_type", "default"));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        this.f105833b.mo149795a(bundle);
    }

    /* renamed from: a */
    public void mo149858a(POIInfo pOIInfo) {
        String string = getArguments().getString("location_unique_key");
        C41588a.m165048b(string).mo149704a(getActivity(), pOIInfo);
        C41588a.m165047a(string);
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f105833b.mo149794a(i, i2, intent);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f105832a = layoutInflater.inflate(R.layout.fragment_location, viewGroup, false);
        m165337c();
        return this.f105832a;
    }
}
