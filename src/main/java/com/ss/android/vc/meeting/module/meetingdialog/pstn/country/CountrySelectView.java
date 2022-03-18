package com.ss.android.vc.meeting.module.meetingdialog.pstn.country;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.EfficientLoadingLottieView;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62405a;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.AbstractC62418b;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.C62417a;
import com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.QuickSideBarView;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CountrySelectView extends RelativeLayout implements C62405a.AbstractC62408c {

    /* renamed from: a */
    protected View f156949a;

    /* renamed from: b */
    protected QuickSideBarView f156950b;

    /* renamed from: c */
    protected RecyclerView f156951c;

    /* renamed from: d */
    protected C62405a f156952d;

    /* renamed from: e */
    protected C26198f f156953e;

    /* renamed from: f */
    protected ViewGroup f156954f;

    /* renamed from: g */
    protected ViewGroup f156955g;

    /* renamed from: h */
    protected ViewGroup f156956h;

    /* renamed from: i */
    protected EfficientLoadingLottieView f156957i;

    /* renamed from: j */
    protected View f156958j;

    /* renamed from: k */
    protected CountryListManifest f156959k;

    /* renamed from: l */
    protected AdminSettings f156960l;

    /* renamed from: m */
    protected boolean f156961m;

    /* renamed from: n */
    private C61303k f156962n;

    /* renamed from: o */
    private AbstractC62403a f156963o;

    /* renamed from: p */
    private String f156964p;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView$a */
    public interface AbstractC62403a {
        /* renamed from: a */
        void mo215786a(CountryInfo countryInfo);

        /* renamed from: k */
        void mo215787k();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m243883k() {
        mo215772b();
        m243881i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo215773c() {
        AbstractC62403a aVar = this.f156963o;
        if (aVar != null) {
            aVar.mo215787k();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo215775e() {
        mo215774d();
        mo215776f();
    }

    /* renamed from: i */
    private void m243881i() {
        this.f156957i.setVisibility(4);
        this.f156954f.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m243882j() {
        this.f156954f.setVisibility(0);
        this.f156957i.setVisibility(4);
        this.f156955g.setVisibility(8);
        this.f156956h.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo215774d() {
        this.f156954f.setVisibility(0);
        this.f156955g.setVisibility(0);
        this.f156957i.setVisibility(0);
        this.f156956h.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo215777g() {
        C60700b.m235851b("CountrySelectView", "[loadAdminSettings]", "start");
        this.f156962n.mo212091I().mo212496c().mo212426a(new AbstractC63598b<AdminSettings>() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.C624023 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                CountrySelectView.this.mo215768a(eVar.f160599b);
            }

            /* renamed from: a */
            public void onSuccess(AdminSettings adminSettings) {
                synchronized (CountrySelectView.this) {
                    CountrySelectView.this.f156960l = adminSettings;
                }
                CountrySelectView.this.mo215778h();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo215778h() {
        C60700b.m235851b("CountrySelectView", "[onLoadSucceed]", "show success data");
        this.f156961m = false;
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$CountrySelectView$Tx_06QHlasc_eUDuyVgaTHefBo */

            public final void run() {
                CountrySelectView.m271333lambda$Tx_06QHlasc_eUDuyVgaTHefBo(CountrySelectView.this);
            }
        });
    }

    /* renamed from: f */
    public void mo215776f() {
        C60700b.m235851b("CountrySelectView", "[loadData]", "loadData");
        if (this.f156961m) {
            C60700b.m235861e("CountrySelectView", "[loadData2]", "already loading, abort");
            return;
        }
        this.f156961m = true;
        mo215774d();
        C57865c.m224576a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$CountrySelectView$f2IqUlcwdPBwosfR4VXVv8c4iok */

            public final void run() {
                CountrySelectView.lambda$f2IqUlcwdPBwosfR4VXVv8c4iok(CountrySelectView.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m243884l() {
        boolean z;
        synchronized (this) {
            this.f156959k = C62413e.m243942a().mo215805b(getContext());
            StringBuilder sb = new StringBuilder();
            sb.append("load country manifest succeed  ");
            if (this.f156959k == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C60700b.m235851b("CountrySelectView", "[loadData3]", sb.toString());
            if (this.f156959k == null) {
                mo215768a(new ErrorResult("load country manifest failed"));
            } else {
                mo215777g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215767a() {
        LayoutInflater.from(getContext()).inflate(R.layout.country_select_layout, (ViewGroup) this, true);
        setBackgroundColor(C60773o.m236126d(R.color.bg_body));
        View findViewById = findViewById(R.id.country_select_close);
        this.f156949a = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$CountrySelectView$hD1EfueiVGl4JP_aEfpW7IHzDM */

            public final void onClick(View view) {
                CountrySelectView.m271334lambda$hD1EfueiVGl4JP_aEfpW7IHzDM(CountrySelectView.this, view);
            }
        });
        this.f156950b = (QuickSideBarView) findViewById(R.id.country_index);
        this.f156951c = (RecyclerView) findViewById(R.id.country_recycler);
        this.f156951c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C62405a aVar = new C62405a();
        this.f156952d = aVar;
        aVar.mo215791a((C62405a.AbstractC62408c) this);
        this.f156951c.setAdapter(this.f156952d);
        this.f156953e = new C26198f(this.f156952d);
        this.f156954f = (ViewGroup) findViewById(R.id.load_status_container);
        this.f156955g = (ViewGroup) findViewById(R.id.loading_container);
        this.f156956h = (ViewGroup) findViewById(R.id.error_container);
        this.f156957i = (EfficientLoadingLottieView) findViewById(R.id.loading_anim_view);
        View findViewById2 = findViewById(R.id.error_retry);
        this.f156958j = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$CountrySelectView$wpUgATlWyWJ0DJTdmQxHGjPQPRg */

            public final void onClick(View view) {
                CountrySelectView.lambda$wpUgATlWyWJ0DJTdmQxHGjPQPRg(CountrySelectView.this, view);
            }
        });
    }

    /* renamed from: b */
    public void mo215772b() {
        boolean z;
        LinkedHashMap<String, CountryInfo> data;
        List<String> list;
        List<String> list2;
        boolean z2 = true;
        if (this.f156959k == null || this.f156960l == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("data empty: [manifest]");
            if (this.f156959k == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            sb.append("  [admin]");
            if (this.f156960l != null) {
                z2 = false;
            }
            sb.append(z2);
            C60700b.m235864f("CountrySelectView", "[showData]", sb.toString());
            this.f156952d.mo215790a();
            return;
        }
        synchronized (this) {
            data = this.f156959k.getData();
            list = this.f156960l.pstnOutgoingCallCountryList;
            list2 = this.f156960l.pstnOutgoingCallCountryDefault;
        }
        C60700b.m235851b("CountrySelectView", "[showData2]", "[top]" + list2 + "  [normal]" + list);
        if (data == null || data.size() < 1) {
            this.f156952d.mo215790a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Map.Entry<String, CountryInfo> entry : data.entrySet()) {
                if (list.contains(entry.getKey())) {
                    arrayList.add(entry.getValue());
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            for (String str : list2) {
                if (data.containsKey(str)) {
                    CountryInfo countryInfo = new CountryInfo(data.get(str));
                    countryInfo.setHeadIndex("-1");
                    arrayList2.add(countryInfo);
                }
            }
        }
        this.f156952d.mo215793a(arrayList2, arrayList);
        this.f156952d.mo215792a(this.f156964p);
        boolean b = this.f156952d.mo215795b();
        this.f156951c.removeItemDecoration(this.f156953e);
        if (b) {
            this.f156951c.addItemDecoration(this.f156953e);
            this.f156953e.mo93182a();
        } else {
            this.f156951c.removeItemDecoration(this.f156953e);
        }
        if (b) {
            C62417a.m243949a(this.f156952d.mo215796c());
            C624001 r0 = new AbstractC62418b() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.C624001 */

                @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.AbstractC62418b
                /* renamed from: a */
                public void mo215782a(boolean z) {
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.quickbar.AbstractC62418b
                /* renamed from: a */
                public void mo215781a(String str, int i, float f) {
                    if (C62417a.m243950a().containsKey(str)) {
                        ((LinearLayoutManager) CountrySelectView.this.f156951c.getLayoutManager()).scrollToPositionWithOffset(C62417a.m243950a().get(str).intValue(), 0);
                    }
                }
            };
            ArrayList arrayList3 = new ArrayList(C62417a.m243950a().keySet());
            Collections.sort(arrayList3, new Comparator<String>() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.CountrySelectView.C624012 */

                /* renamed from: a */
                public int compare(String str, String str2) {
                    return str.compareTo(str2);
                }
            });
            this.f156950b.setLetters(arrayList3);
            this.f156950b.setOnQuickSideBarTouchListener(r0);
            this.f156950b.setVisibility(0);
        } else {
            this.f156950b.setVisibility(8);
        }
        this.f156952d.notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m243879a(View view) {
        mo215775e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m243880b(View view) {
        mo215773c();
    }

    public void setActionListener(AbstractC62403a aVar) {
        this.f156963o = aVar;
    }

    public void setSelectedCountryCode(String str) {
        this.f156964p = str;
    }

    public CountrySelectView(Context context) {
        super(context);
        mo215767a();
    }

    /* renamed from: a */
    public void mo215769a(C61303k kVar) {
        this.f156962n = kVar;
        mo215776f();
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.pstn.country.C62405a.AbstractC62408c
    /* renamed from: a */
    public void mo215770a(CountryInfo countryInfo) {
        AbstractC62403a aVar = this.f156963o;
        if (aVar != null) {
            aVar.mo215786a(countryInfo);
        }
    }

    /* renamed from: a */
    public void mo215771a(boolean z) {
        this.f156953e.mo93182a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo215768a(ErrorResult errorResult) {
        C60700b.m235851b("CountrySelectView", "[onLoadError]", "err = " + errorResult);
        this.f156961m = false;
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.pstn.country.$$Lambda$CountrySelectView$2vxZlf4FLefpNBp9PgfCltEYCk */

            public final void run() {
                CountrySelectView.m271332lambda$2vxZlf4FLefpNBp9PgfCltEYCk(CountrySelectView.this);
            }
        });
    }

    public CountrySelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo215767a();
    }

    public CountrySelectView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo215767a();
    }
}
