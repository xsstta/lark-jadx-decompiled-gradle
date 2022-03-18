package com.ss.android.appcenter.business.tab.fragmentv2;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.C27697d;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import com.ss.android.appcenter.business.dto.PrivacyGroupType;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28193m;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.b */
public class C28024b extends AbstractC28120c {

    /* renamed from: a */
    private List<C27697d> f70123a;

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public void mo98617a(C28118a aVar, int i) {
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: g */
    public int mo99775g(int i) {
        return R.layout.appcenter_privacy_foot_layout;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public int mo98377b() {
        return this.f70123a.size();
    }

    /* renamed from: e */
    public PrivacyGroupType mo99862e(int i) {
        return this.f70123a.get(i).mo98852c();
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: h */
    public int mo99776h(int i) {
        return mo99862e(i).getValue() + 100;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: i */
    public int mo99777i(int i) {
        return mo99862e(i).getValue() + LocationRequest.PRIORITY_HD_ACCURACY;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: c */
    public int mo98380c(int i) {
        PrivacyGroupType fromValue = PrivacyGroupType.fromValue(i - 100);
        if (PrivacyGroupType.NORMALLEVEL == fromValue || PrivacyGroupType.HIGHLEVEL == fromValue) {
            return R.layout.appcenter_privacy_header_layout;
        }
        return 0;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: d */
    public int mo98381d(int i) {
        PrivacyGroupType fromValue = PrivacyGroupType.fromValue(i - 0);
        if (fromValue == PrivacyGroupType.APPINFO) {
            return R.layout.appcenter_privacy_appinfo_item;
        }
        if (PrivacyGroupType.NORMALLEVEL == fromValue || PrivacyGroupType.HIGHLEVEL == fromValue) {
            return R.layout.appcenter_privacy_permission_item;
        }
        return 0;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: f */
    public boolean mo99774f(int i) {
        if (!this.f70123a.get(i).mo98850a() || i == this.f70123a.size() - 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98372a(int i) {
        PrivacyGroupType e = mo99862e(i);
        if (PrivacyGroupType.NORMALLEVEL == e) {
            return this.f70123a.get(i).mo98851b().getNormalLevelPermission().size();
        }
        if (PrivacyGroupType.HIGHLEVEL == e) {
            return this.f70123a.get(i).mo98851b().getHighLevelPermission().size();
        }
        return 1;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public boolean mo98379b(int i) {
        PrivacyGroupType e = mo99862e(i);
        if (PrivacyGroupType.NORMALLEVEL == e || PrivacyGroupType.HIGHLEVEL == e) {
            return true;
        }
        return false;
    }

    public C28024b(Context context, List<C27697d> list) {
        super(context);
        this.f70123a = list;
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public int mo98614a(int i, int i2) {
        return mo99862e(i).getValue() + 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102408a(OnboardingAppInfo onboardingAppInfo, View view) {
        C27548m.m100547m().mo98222f().mo98202a(this.f70428m, onboardingAppInfo.getClauseUrl(), null, false, null, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m102409b(OnboardingAppInfo onboardingAppInfo, View view) {
        C27548m.m100547m().mo98222f().mo98202a(this.f70428m, onboardingAppInfo.getPrivacyPolicyUrl(), null, false, null, null);
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: b */
    public void mo99772b(C28118a aVar, int i) {
        PrivacyGroupType e = mo99862e(i);
        if (e == PrivacyGroupType.NORMALLEVEL) {
            ((TextView) aVar.mo100089a(R.id.permission_type)).setText(this.f70428m.getString(R.string.Onboarding_Basic_Permission));
        } else if (e == PrivacyGroupType.HIGHLEVEL) {
            ((TextView) aVar.mo100089a(R.id.permission_type)).setText(this.f70428m.getString(R.string.Onboarding_Advance_Permission));
        }
    }

    @Override // com.ss.android.appcenter.common.adapter.groupadapter.AbstractC28120c
    /* renamed from: a */
    public void mo98375a(C28118a aVar, int i, int i2) {
        PrivacyGroupType e = mo99862e(i);
        OnboardingAppInfo b = this.f70123a.get(i).mo98851b();
        if (e == PrivacyGroupType.APPINFO) {
            C27688a.m101208a(this.f70428m, b.getIcon(), (ImageView) aVar.mo100089a(R.id.icon));
            ((TextView) aVar.mo100089a(R.id.app_name)).setText(b.getName());
            TextView textView = (TextView) aVar.mo100089a(R.id.app_provacy_tip);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f70428m.getString(R.string.Onboarding_APP_Privacy_Agreement));
            arrayList.add(this.f70428m.getString(R.string.Onboarding_APP_User_Agreement));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C28193m.AbstractC28195a(b) {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.$$Lambda$b$khGaDf6yiRs6bx74tOWfnVjPHCo */
                public final /* synthetic */ OnboardingAppInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.appcenter.common.util.C28193m.AbstractC28195a
                public final void onClick(View view) {
                    C28024b.this.m102409b((C28024b) this.f$1, (OnboardingAppInfo) view);
                }
            });
            arrayList2.add(new C28193m.AbstractC28195a(b) {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.$$Lambda$b$hbIIfm1YIGmLzv793pjprbfRGPg */
                public final /* synthetic */ OnboardingAppInfo f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.appcenter.common.util.C28193m.AbstractC28195a
                public final void onClick(View view) {
                    C28024b.this.m102408a((C28024b) this.f$1, (OnboardingAppInfo) view);
                }
            });
            textView.setText(C28193m.m103266a(this.f70428m.getString(R.string.Onboarding_APP_Privacy_Title_Tips), arrayList, ContextCompat.getColor(this.f70428m, R.color.text_link_hover), arrayList2));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (e == PrivacyGroupType.NORMALLEVEL) {
            ((ImageView) aVar.mo100089a(R.id.privacy_level_icon)).setImageResource(R.drawable.appcenter_normal_privacy);
            ((TextView) aVar.mo100089a(R.id.privacy_app_permission_text)).setText(b.getNormalLevelPermission().get(i2));
        } else if (e == PrivacyGroupType.HIGHLEVEL) {
            ((ImageView) aVar.mo100089a(R.id.privacy_level_icon)).setImageResource(R.drawable.appcenter_normal_privacy);
            ((TextView) aVar.mo100089a(R.id.privacy_app_permission_text)).setText(b.getHighLevelPermission().get(i2));
        }
    }
}
