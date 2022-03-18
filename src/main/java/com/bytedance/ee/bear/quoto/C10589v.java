package com.bytedance.ee.bear.quoto;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bizwidget.at.AtUserSupportTextView;
import com.bytedance.ee.bear.bizwidget.at.C4863a;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.quoto.AbstractC10577m;
import com.bytedance.ee.bear.quoto.BusinessInfoRequester;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p714p.C13719a;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.quoto.v */
public class C10589v implements AbstractC10577m {

    /* renamed from: a */
    public final SingleFileExceedQuotaFragment f28393a;

    /* renamed from: b */
    private final View f28394b;

    /* renamed from: c */
    private final Context f28395c;

    /* renamed from: d */
    private final SingleFileQuotaConfig f28396d;

    /* renamed from: e */
    private View f28397e;

    /* renamed from: f */
    private ImageView f28398f;

    /* renamed from: g */
    private TextView f28399g;

    /* renamed from: h */
    private RecyclerView f28400h;

    /* renamed from: i */
    private AtUserSupportTextView f28401i;

    /* renamed from: j */
    private Button f28402j;

    /* renamed from: k */
    private C10587u f28403k;

    /* renamed from: a */
    public void setViewDelegate(AbstractC10577m.AbstractC10578a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m43850b();
    }

    /* renamed from: c */
    private int m43851c() {
        SingleFileQuotaConfig singleFileQuotaConfig = this.f28396d;
        if (singleFileQuotaConfig == null) {
            return R.drawable.illustration_ccm_empty_positive_storage_limit;
        }
        return singleFileQuotaConfig.getPlaceHolderId();
    }

    /* renamed from: b */
    private void m43850b() {
        this.f28397e = this.f28394b.findViewById(R.id.root_container);
        this.f28398f = (ImageView) this.f28394b.findViewById(R.id.placeHolder);
        this.f28399g = (TextView) this.f28394b.findViewById(R.id.mainTitle);
        this.f28400h = (RecyclerView) this.f28394b.findViewById(R.id.gridRecycler);
        this.f28401i = (AtUserSupportTextView) this.f28394b.findViewById(R.id.subTitle);
        this.f28402j = (Button) this.f28394b.findViewById(R.id.done);
        this.f28400h.setLayoutManager(new LinearLayoutManager(this.f28395c, 0, false));
        C10587u uVar = new C10587u();
        this.f28403k = uVar;
        this.f28400h.setAdapter(uVar);
        this.f28400h.addItemDecoration(new SingleFileExceedQuotaItemDecoration());
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10577m
    /* renamed from: a */
    public void mo40028a() {
        this.f28398f.setImageResource(m43851c());
        this.f28397e.setVisibility(0);
        this.f28399g.setText(SingleFileQuotaTypeHelper.m43864a(this.f28395c, this.f28396d));
        this.f28400h.setVisibility(8);
        this.f28401i.setText(SingleFileQuotaTypeHelper.m43866b(this.f28395c, this.f28396d));
        this.f28402j.setText(m43845a(R.string.CreationMobile_Docs_StorageFull_ContactSupport_btn));
        this.f28402j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.quoto.C10589v.C105901 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10589v.this.f28393a.mo40035f();
                C10583p.m43821a(C5234y.m21391b(), null, false, "暂无", "contact_service");
            }
        });
        C10583p.m43820a(C5234y.m21391b(), null, false, "暂无");
    }

    /* renamed from: a */
    private String m43845a(int i) {
        return this.f28395c.getString(i);
    }

    /* renamed from: a */
    private List<C10597y> m43848a(Map<String, Long> map) {
        ArrayList arrayList = new ArrayList();
        String a = m43847a(map, "4");
        if (a != null) {
            arrayList.add(new C10597y("4", a, m43845a(R.string.CreationMobile_version_standard)));
        }
        String a2 = m43847a(map, "5");
        if (a2 != null) {
            arrayList.add(new C10597y("5", a2, m43845a(R.string.CreationMobile_version_business)));
        }
        String a3 = m43847a(map, "6");
        if (a3 != null) {
            arrayList.add(new C10597y("6", a3, m43845a(R.string.CreationMobile_version_enterprise)));
        }
        return arrayList;
    }

    /* renamed from: a */
    private String m43846a(int i, Map<String, String> map) {
        return C10539a.m43640a(this.f28395c, i, map);
    }

    /* renamed from: a */
    private String m43847a(Map<String, Long> map, String str) {
        if (map.get(str) == null) {
            return null;
        }
        return C13719a.m55620a(map.get(str));
    }

    /* renamed from: a */
    private C4863a.AbstractC4864a m43844a(String str, boolean z, String str2) {
        return new C4863a.AbstractC4864a(str, z, str2) {
            /* class com.bytedance.ee.bear.quoto.$$Lambda$v$SZR3oHTk5BaRqh29awp_aMGOOck */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ boolean f$2;
            public final /* synthetic */ String f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.bytedance.ee.bear.bizwidget.at.C4863a.AbstractC4864a
            public final void onClick(View view, String str) {
                C10589v.lambda$SZR3oHTk5BaRqh29awp_aMGOOck(C10589v.this, this.f$1, this.f$2, this.f$3, view, str);
            }
        };
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10577m
    /* renamed from: a */
    public void mo40029a(Map<String, Long> map, final String str, final boolean z) {
        this.f28398f.setImageResource(m43851c());
        this.f28397e.setVisibility(0);
        this.f28399g.setText(SingleFileQuotaTypeHelper.m43864a(this.f28395c, this.f28396d));
        this.f28400h.setVisibility(8);
        final String b = C13719a.m55622b(map.get("3"));
        String b2 = C13719a.m55622b(map.get("4"));
        HashMap hashMap = new HashMap();
        hashMap.put("max_statement", SingleFileQuotaTypeHelper.m43865a(this.f28395c, this.f28396d, b));
        hashMap.put("max_size", b2);
        StringBuilder sb = new StringBuilder(m43846a(R.string.CreationMobile_Drive_Upload_Max_unverified, hashMap));
        int indexOf = sb.indexOf("<a>");
        int indexOf2 = sb.indexOf("</a>");
        if (indexOf >= 0 && indexOf2 >= 0 && indexOf <= indexOf2) {
            sb.replace(indexOf, indexOf + 3, "");
            int i = indexOf2 - 3;
            sb.replace(i, i + 4, "");
            this.f28401i.mo19032a(sb.toString(), indexOf, i, new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.quoto.C10589v.C105912 */

                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C10589v.this.f28393a.mo40036g();
                    C10583p.m43821a(C5234y.m21391b(), str, Boolean.valueOf(z), b, "lark_certification");
                }
            });
            this.f28402j.setText(m43845a(R.string.Doc_Facade_GotIt));
            this.f28402j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.quoto.C10589v.C105923 */

                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    C10589v.this.f28393a.mo40037h();
                    C10583p.m43821a(C5234y.m21391b(), str, Boolean.valueOf(z), b, "already_know");
                }
            });
            C10583p.m43820a(C5234y.m21391b(), str, Boolean.valueOf(z), b);
        }
    }

    public C10589v(View view, SingleFileExceedQuotaFragment qVar, Context context, SingleFileQuotaConfig singleFileQuotaConfig) {
        this.f28394b = view;
        this.f28393a = qVar;
        this.f28395c = context;
        this.f28396d = singleFileQuotaConfig;
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10577m
    /* renamed from: b */
    public void mo40032b(Map<String, Long> map, final String str, final boolean z, List<BusinessInfoRequester.BusinessAdminInfo> list) {
        boolean z2;
        this.f28398f.setImageResource(m43851c());
        this.f28397e.setVisibility(0);
        this.f28399g.setText(SingleFileQuotaTypeHelper.m43864a(this.f28395c, this.f28396d));
        if (SuiteTypeVersion.m43881b(str) || SuiteTypeVersion.m43882c(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f28400h.setVisibility(8);
        } else {
            this.f28400h.setVisibility(0);
            this.f28403k.mo40047a(m43848a(map));
        }
        final String b = C13719a.m55622b(map.get(str));
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, SuiteTypeVersion.m43879a(this.f28395c, str));
        hashMap.put("max_statement", SingleFileQuotaTypeHelper.m43865a(this.f28395c, this.f28396d, b));
        hashMap.put("admin", "default_name");
        StringBuilder sb = new StringBuilder(m43846a(R.string.CreationMobile_Drive_Upload_Max_content2, hashMap));
        ArrayList arrayList = new ArrayList();
        int indexOf = sb.indexOf("default_name");
        if (list.size() == 1) {
            sb.replace(indexOf, indexOf + 12, "@" + list.get(0).name);
            arrayList.add(new C4863a(this.f28395c, list.get(0).uid, list.get(0).name, m43844a(str, z, b)));
        } else if (list.size() == 2) {
            sb.replace(indexOf, indexOf + 12, "@" + list.get(0).name + "、@" + list.get(1).name);
            C4863a aVar = new C4863a(this.f28395c, list.get(0).uid, list.get(0).name, m43844a(str, z, b));
            C4863a aVar2 = new C4863a(this.f28395c, list.get(1).uid, list.get(1).name, m43844a(str, z, b));
            arrayList.add(aVar);
            arrayList.add(aVar2);
        } else {
            sb.replace(indexOf, indexOf + 12, "@" + list.get(0).name + "、@" + list.get(1).name + "、@" + list.get(2).name);
            C4863a aVar3 = new C4863a(this.f28395c, list.get(0).uid, list.get(0).name, m43844a(str, z, b));
            C4863a aVar4 = new C4863a(this.f28395c, list.get(1).uid, list.get(1).name, m43844a(str, z, b));
            C4863a aVar5 = new C4863a(this.f28395c, list.get(2).uid, list.get(2).name, m43844a(str, z, b));
            arrayList.add(aVar3);
            arrayList.add(aVar4);
            arrayList.add(aVar5);
        }
        this.f28401i.mo19033a(sb.toString(), arrayList);
        this.f28402j.setText(m43845a(R.string.Doc_Facade_GotIt));
        this.f28402j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.quoto.C10589v.C105945 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10589v.this.f28393a.mo40037h();
                C10583p.m43821a(C5234y.m21391b(), str, Boolean.valueOf(z), b, "already_know");
            }
        });
        C10583p.m43820a(C5234y.m21391b(), str, Boolean.valueOf(z), b);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10577m
    /* renamed from: a */
    public void mo40030a(Map<String, Long> map, final String str, final boolean z, Long l) {
        this.f28398f.setImageResource(m43851c());
        this.f28397e.setVisibility(0);
        this.f28399g.setText(SingleFileQuotaTypeHelper.m43864a(this.f28395c, this.f28396d));
        this.f28400h.setVisibility(8);
        final String b = C13719a.m55622b(l);
        this.f28401i.setText(SingleFileQuotaTypeHelper.m43867b(this.f28395c, this.f28396d, b));
        this.f28402j.setText(m43845a(R.string.Doc_Facade_GotIt));
        this.f28402j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.quoto.C10589v.C105956 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10589v.this.f28393a.mo40037h();
                C10583p.m43821a(C5234y.m21391b(), str, Boolean.valueOf(z), b, "already_know");
            }
        });
        C10583p.m43820a(C5234y.m21391b(), str, Boolean.valueOf(z), b);
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10577m
    /* renamed from: a */
    public void mo40031a(Map<String, Long> map, final String str, final boolean z, List<BusinessInfoRequester.BusinessAdminInfo> list) {
        boolean z2;
        this.f28398f.setImageResource(m43851c());
        this.f28397e.setVisibility(0);
        this.f28399g.setText(SingleFileQuotaTypeHelper.m43864a(this.f28395c, this.f28396d));
        if (SuiteTypeVersion.m43881b(str) || SuiteTypeVersion.m43882c(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.f28400h.setVisibility(8);
        } else {
            this.f28400h.setVisibility(0);
            this.f28403k.mo40047a(m43848a(map));
        }
        final String b = C13719a.m55622b(map.get(str));
        HashMap hashMap = new HashMap();
        hashMap.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, SuiteTypeVersion.m43879a(this.f28395c, str));
        hashMap.put("max_statement", SingleFileQuotaTypeHelper.m43865a(this.f28395c, this.f28396d, b));
        this.f28401i.setText(m43846a(R.string.CreationMobile_Drive_Upload_Max_content1, hashMap));
        this.f28402j.setText(m43845a(R.string.CreationMobile_Docs_StorageFull_ContactSupport_btn));
        this.f28402j.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.quoto.C10589v.C105934 */

            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C10589v.this.f28393a.mo40035f();
                C10583p.m43821a(C5234y.m21391b(), str, Boolean.valueOf(z), b, "contact_service");
            }
        });
        C10583p.m43820a(C5234y.m21391b(), str, Boolean.valueOf(z), b);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m43849a(String str, boolean z, String str2, View view, String str3) {
        C10583p.m43821a(C5234y.m21391b(), str, Boolean.valueOf(z), str2, "contact_administrator");
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str3, "");
        this.f28393a.mo40037h();
    }
}
