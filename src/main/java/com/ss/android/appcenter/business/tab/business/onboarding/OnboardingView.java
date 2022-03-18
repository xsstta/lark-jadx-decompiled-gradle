package com.ss.android.appcenter.business.tab.business.onboarding;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.SendHttpResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.dto.OnboardingAppInfo;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.operationconfig.OperationalConfigData;
import com.ss.android.appcenter.business.net.p1270a.C27714b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.C27988a;
import com.ss.android.appcenter.common.util.C28176a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28193m;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class OnboardingView extends RelativeLayout {

    /* renamed from: a */
    public UDButton f69599a;

    /* renamed from: b */
    public List<OnboardingAppInfo> f69600b;

    /* renamed from: c */
    public boolean f69601c;

    /* renamed from: d */
    public boolean f69602d;

    /* renamed from: e */
    private TextView f69603e;

    /* renamed from: f */
    private TextView f69604f;

    /* renamed from: g */
    private TextView f69605g;

    /* renamed from: h */
    private TextView f69606h;

    /* renamed from: i */
    private ImageView f69607i;

    /* renamed from: j */
    private RecyclerView f69608j;

    /* renamed from: k */
    private C27988a f69609k;

    /* renamed from: l */
    private List<OnboardingAppInfo> f69610l;

    /* renamed from: m */
    private AbstractC27851b f69611m;

    /* renamed from: com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView$a */
    public interface AbstractC27850a {
        /* renamed from: a */
        void mo99346a(OnboardingAppInfo onboardingAppInfo);

        /* renamed from: a */
        void mo99347a(String str);

        /* renamed from: b */
        void mo99348b(OnboardingAppInfo onboardingAppInfo);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView$b */
    public interface AbstractC27851b {
        /* renamed from: a */
        void mo99352a(List<OnboardingAppInfo> list);

        /* renamed from: a */
        void mo99353a(boolean z);
    }

    /* renamed from: e */
    private void m101704e() {
        this.f69600b = new ArrayList();
        this.f69607i.setActivated(false);
        this.f69609k.mo99747b(this.f69600b);
    }

    /* renamed from: d */
    private void m101702d() {
        List<OnboardingAppInfo> list = this.f69600b;
        if (list != null && !this.f69601c) {
            this.f69601c = true;
            if (this.f69602d) {
                C27710b.m101279b(mo99339a(list));
            } else {
                C27710b.m101291d(mo99339a(list));
            }
            C27711a.m101333a(this.f69600b, C28176a.m103219a(), new C27714b.AbstractC27716a() {
                /* class com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.C278462 */

                @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
                /* renamed from: a */
                public void mo98364a(ErrorResult errorResult, C27714b.C27717b bVar) {
                    OnboardingView.this.f69601c = false;
                    OnboardingView.this.mo99340a();
                    C28184h.m103248b("AsyncInstallApps", "onboarding install error " + errorResult);
                }

                @Override // com.ss.android.appcenter.business.net.p1270a.C27714b.AbstractC27716a
                /* renamed from: a */
                public void mo98363a(SendHttpResponse sendHttpResponse, C27714b.C27717b bVar) {
                    try {
                        int optInt = new JSONObject(sendHttpResponse.json_body).optInt("code");
                        C28184h.m103250d("AsyncInstallApps", "onboarding  code " + optInt + " requestId:" + bVar.f69283b);
                        if (optInt == 0) {
                            if (OnboardingView.this.f69602d) {
                                OnboardingView onboardingView = OnboardingView.this;
                                C27710b.m101286c(onboardingView.mo99339a(onboardingView.f69600b));
                            } else {
                                OnboardingView onboardingView2 = OnboardingView.this;
                                C27710b.m101295e(onboardingView2.mo99339a(onboardingView2.f69600b));
                            }
                            OnboardingView.this.mo99343b();
                        } else {
                            OnboardingView.this.mo99340a();
                        }
                    } catch (JSONException e) {
                        OnboardingView.this.mo99340a();
                        C28184h.m103247a("AsyncInstallApps", "onboarding install error requestId:" + bVar.f69283b, e);
                    }
                    OnboardingView.this.f69601c = false;
                }
            });
        }
    }

    /* renamed from: b */
    public void mo99343b() {
        C28184h.m103250d("Workplace_Page", "onboarding showSuccess");
        LKUIToast.showLoading(getContext(), getContext().getString(R.string.Onboarding_Wait_Install__Tips));
        post(new Runnable() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.RunnableC278484 */

            public void run() {
                OnboardingView.this.f69600b.clear();
                OnboardingView.this.mo99345c();
            }
        });
        postDelayed(new Runnable() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.RunnableC278495 */

            public void run() {
                LKUIToast.cancelLoading();
            }
        }, 3000);
        AbstractC27851b bVar = this.f69611m;
        if (bVar != null) {
            bVar.mo99353a(true);
        }
    }

    /* renamed from: a */
    public void mo99340a() {
        C28184h.m103250d("Workplace_Page", "onboarding showErr");
        LKUIToast.show(getContext(), (int) R.drawable.appcenter_show_toast_err, getContext().getString(R.string.Onboarding_Install_Apps_Fail_Tips));
        post(new Runnable() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.RunnableC278473 */

            public void run() {
                OnboardingView.this.f69599a.setText(OnboardingView.this.getContext().getString(R.string.Onboarding_Install_Apps_Aagin));
            }
        });
    }

    /* renamed from: c */
    public void mo99345c() {
        int size = this.f69600b.size();
        boolean z = true;
        this.f69605g.setText(getContext().getString(R.string.Onboarding_Selected_App_Count, Integer.valueOf(size)));
        UDButton uDButton = this.f69599a;
        if (size <= 0) {
            z = false;
        }
        uDButton.setEnabled(z);
        if (size > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C28193m.AbstractC28195a() {
                /* class com.ss.android.appcenter.business.tab.business.onboarding.$$Lambda$OnboardingView$0dLGlVw_XdNSZNk9RXNnFr7UAQ */

                @Override // com.ss.android.appcenter.common.util.C28193m.AbstractC28195a
                public final void onClick(View view) {
                    OnboardingView.m270204lambda$0dLGlVw_XdNSZNk9RXNnFr7UAQ(OnboardingView.this, view);
                }
            });
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(getContext().getString(R.string.Onboarding_Permission_Statement_key));
            this.f69606h.setTextColor(ContextCompat.getColor(getContext(), R.color.text_title));
            this.f69606h.setText(C28193m.m103266a(getContext().getString(R.string.Onboarding_User_Permission_Statement), arrayList2, ContextCompat.getColor(getContext(), R.color.text_link_hover), arrayList));
            this.f69606h.setMovementMethod(LinkMovementMethod.getInstance());
            this.f69606h.setHighlightColor(ContextCompat.getColor(getContext(), 17170445));
            return;
        }
        this.f69606h.setText(C28193m.m103264a(getContext().getString(R.string.Onboarding_User_Permission_Statement), getContext().getString(R.string.Onboarding_User_Permission_Statement), ContextCompat.getColor(getContext(), R.color.text_placeholder)));
    }

    public OnboardingView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m101703d(View view) {
        C28184h.m103250d("Workplace_Page", "onboarding view click install");
        m101702d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101699a(View view) {
        List<OnboardingAppInfo> list = this.f69600b;
        if (list != null && list.size() > 0) {
            this.f69611m.mo99352a(this.f69600b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101700b(View view) {
        C28184h.m103250d("Workplace_Page", "onboarding view click passInstall");
        AbstractC27851b bVar = this.f69611m;
        if (bVar != null) {
            bVar.mo99353a(false);
        }
        if (this.f69602d) {
            C27710b.m101300h();
        } else {
            C27710b.m101302i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m101701c(View view) {
        boolean isActivated = this.f69607i.isActivated();
        this.f69607i.setActivated(!isActivated);
        this.f69609k.mo99748b(!isActivated);
        mo99345c();
    }

    /* renamed from: a */
    public List<String> mo99339a(List<OnboardingAppInfo> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (OnboardingAppInfo onboardingAppInfo : list) {
            arrayList.add(onboardingAppInfo.getAppId());
        }
        return arrayList;
    }

    /* renamed from: b */
    public void mo99344b(OnboardingAppInfo onboardingAppInfo) {
        if (this.f69600b.contains(onboardingAppInfo)) {
            this.f69600b.remove(onboardingAppInfo);
            if (this.f69607i.isActivated()) {
                this.f69607i.setActivated(false);
            }
            mo99345c();
        }
    }

    /* renamed from: a */
    private void m101698a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.appcenter_select_install, (ViewGroup) this, true);
        this.f69603e = (TextView) inflate.findViewById(R.id.pass_install);
        this.f69604f = (TextView) inflate.findViewById(R.id.tips);
        this.f69605g = (TextView) inflate.findViewById(R.id.select_app_count);
        this.f69599a = (UDButton) inflate.findViewById(R.id.submit);
        this.f69606h = (TextView) inflate.findViewById(R.id.permission_tips);
        this.f69607i = (ImageView) inflate.findViewById(R.id.check_all_icon);
        this.f69608j = (RecyclerView) inflate.findViewById(R.id.recycler);
        this.f69610l = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f69600b = arrayList;
        this.f69609k = new C27988a(context, this.f69610l, arrayList, new AbstractC27850a() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.C278451 */

            @Override // com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.AbstractC27850a
            /* renamed from: a */
            public void mo99346a(OnboardingAppInfo onboardingAppInfo) {
                OnboardingView.this.mo99342a(onboardingAppInfo);
            }

            @Override // com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.AbstractC27850a
            /* renamed from: b */
            public void mo99348b(OnboardingAppInfo onboardingAppInfo) {
                OnboardingView.this.mo99344b(onboardingAppInfo);
            }

            @Override // com.ss.android.appcenter.business.tab.business.onboarding.OnboardingView.AbstractC27850a
            /* renamed from: a */
            public void mo99347a(String str) {
                C27548m.m100547m().mo98222f().mo98205b(OnboardingView.this.getContext(), str);
            }
        });
        this.f69608j.setLayoutManager(new LinearLayoutManager(context));
        this.f69608j.setAdapter(this.f69609k);
        this.f69599a.setEnabled(!this.f69600b.isEmpty());
        this.f69599a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.$$Lambda$OnboardingView$AMbh5LmgwilJyoyqpthhe4KuVUQ */

            public final void onClick(View view) {
                OnboardingView.lambda$AMbh5LmgwilJyoyqpthhe4KuVUQ(OnboardingView.this, view);
            }
        });
        this.f69607i.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.$$Lambda$OnboardingView$upqOry6bJRKrmjWYcfQs12OkJg */

            public final void onClick(View view) {
                OnboardingView.m270206lambda$upqOry6bJRKrmjWYcfQs12OkJg(OnboardingView.this, view);
            }
        });
        this.f69603e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.onboarding.$$Lambda$OnboardingView$ndRv2n68kYK_MlCVWrKNPXVxyw */

            public final void onClick(View view) {
                OnboardingView.m270205lambda$ndRv2n68kYK_MlCVWrKNPXVxyw(OnboardingView.this, view);
            }
        });
    }

    /* renamed from: a */
    public void mo99342a(OnboardingAppInfo onboardingAppInfo) {
        if (!this.f69600b.contains(onboardingAppInfo)) {
            this.f69600b.add(onboardingAppInfo);
            if (this.f69610l.size() == this.f69600b.size() && !this.f69607i.isActivated()) {
                this.f69607i.setActivated(true);
            }
            mo99345c();
        }
    }

    public OnboardingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OnboardingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m101698a(context);
    }

    /* renamed from: a */
    public void mo99341a(Context context, boolean z, OperationalConfigData operationalConfigData, AbstractC27851b bVar) {
        this.f69602d = z;
        if (z) {
            this.f69603e.setText(R.string.Onboarding_Pass_Install_App);
        } else {
            this.f69603e.setText(R.string.OpenPlatform_AppCenter_CloseBttn);
        }
        this.f69611m = bVar;
        if (context != null) {
            if (operationalConfigData.isAdmin()) {
                this.f69604f.setText(C28193m.m103264a(context.getString(R.string.Onboarding_Recommend_Admin_Tips), context.getString(R.string.Onboarding_Recommend_Free_Tips), UDColorUtils.getColor(getContext(), R.color.text_link_hover)));
            } else {
                this.f69604f.setText(C28193m.m103264a(context.getString(R.string.Onboarding_Recommend_User_Tips), context.getString(R.string.Onboarding_Recommend_Free_Tips), UDColorUtils.getColor(getContext(), R.color.text_link_hover)));
            }
            this.f69606h.setText(context.getString(R.string.Onboarding_User_Permission_Statement));
            this.f69599a.setText(R.string.Onboarding_Install_Apps);
            m101704e();
            mo99345c();
            this.f69610l = operationalConfigData.getOnboardingApps();
            this.f69609k.mo99746a(z);
            this.f69609k.mo99745a(this.f69610l);
        }
        if (z) {
            C27710b.m101267a(mo99339a(this.f69610l));
        }
    }
}
