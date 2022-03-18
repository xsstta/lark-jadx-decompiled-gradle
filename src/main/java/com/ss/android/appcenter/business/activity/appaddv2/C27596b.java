package com.ss.android.appcenter.business.activity.appaddv2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appaddv2.view.AppBar;
import com.ss.android.appcenter.business.activity.appsort.AppSortActivity;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.tagsandrecent.Tag;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.view.DrawerLayout;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.view.biz.WorkplaceLoadingView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.activity.appaddv2.b */
public class C27596b extends Fragment {

    /* renamed from: a */
    public WorkplaceLoadingView f68825a;

    /* renamed from: b */
    public List<C27607e> f68826b = new ArrayList();

    /* renamed from: c */
    public List<String> f68827c = new ArrayList();

    /* renamed from: d */
    public boolean f68828d;

    /* renamed from: e */
    public boolean f68829e;

    /* renamed from: f */
    private ViewPager f68830f;

    /* renamed from: g */
    private UDTabLayout f68831g;

    /* renamed from: h */
    private View f68832h;

    /* renamed from: i */
    private AppBar f68833i;

    /* renamed from: j */
    private ImageView f68834j;

    /* renamed from: k */
    private List<Tag> f68835k = new ArrayList();

    /* renamed from: l */
    private StatusController f68836l;

    /* renamed from: m */
    private C27584a f68837m;

    /* renamed from: n */
    private boolean f68838n = true;

    /* renamed from: a */
    public static C27596b m100704a() {
        return new C27596b();
    }

    /* renamed from: e */
    private void m100711e() {
        this.f68836l.mo100033a(StatusController.Status.LOADING);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f68837m.unbindTagsAndRecentLiveData();
        this.f68837m.unbindUserItemListLiveData();
        super.onDestroyView();
    }

    /* renamed from: f */
    private void m100713f() {
        if (!this.f68829e) {
            C28184h.m103250d("App_Add_Page", "retry requestTagListFromNet");
            this.f68837m.requestTagListFromNet();
        }
        if (!this.f68828d) {
            C28184h.m103250d("App_Add_Page", "retry requestUserItemListFromNet");
            this.f68837m.requestUserItemListFromNet();
        }
    }

    /* renamed from: c */
    public void mo98316c() {
        if (this.f68829e && this.f68828d) {
            if (this.f68838n) {
                C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69245p).flush();
            }
            this.f68838n = false;
            this.f68836l.mo100033a(StatusController.Status.CONTENT);
            this.f68834j.setVisibility(0);
        }
    }

    /* renamed from: d */
    private void m100709d() {
        C27584a aVar = (C27584a) aj.m5366a(getActivity()).mo6005a(C27584a.class);
        this.f68837m = aVar;
        aVar.getTagListLiveData().mo5923a(getActivity(), new AbstractC1178x<List<Tag>>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27596b.C275993 */

            /* renamed from: a */
            public void onChanged(List<Tag> list) {
                if (list == null) {
                    C28184h.m103250d("App_Add_Page", "tagList onChanged. value is null. try showError");
                    C27596b.this.mo98314b();
                    return;
                }
                C28184h.m103250d("App_Add_Page", "tagList onChanged. value ready. try showContent");
                C27596b.this.mo98315b(list);
                C27596b.this.f68829e = true;
                C27596b.this.mo98316c();
            }
        });
        this.f68837m.getUserItemListLiveData().mo5923a(getActivity(), new AbstractC1178x<List<ItemInfo>>() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27596b.C276004 */

            /* renamed from: a */
            public void onChanged(List<ItemInfo> list) {
                if (list == null) {
                    C28184h.m103250d("App_Add_Page", "itemInfoList onChanged. value is null. try showError");
                    C27596b.this.mo98314b();
                    return;
                }
                C28184h.m103250d("App_Add_Page", "itemInfoList onChanged. value ready. try showContent");
                C27596b.this.f68828d = true;
                C27596b.this.mo98313a(list);
                C27596b.this.mo98316c();
            }
        });
        this.f68837m.bindTagsAndRecentLiveData();
        this.f68837m.bindUserItemListLiveData();
        this.f68837m.requestTagListFromLocal();
        this.f68837m.requestUserItemListFromLocal();
        this.f68837m.requestTagListFromNet();
        this.f68837m.requestUserItemListFromNet();
    }

    /* renamed from: b */
    public void mo98314b() {
        if ((!this.f68829e) || (!this.f68828d)) {
            C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69246q).flush();
            this.f68838n = false;
            this.f68836l.mo100033a(StatusController.Status.ERROR);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m100714f(View view) {
        this.f68837m.showSearchFragment();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m100715g(View view) {
        getActivity().finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m100705a(int i) {
        this.f68830f.setCurrentItem(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m100712e(View view) {
        C28184h.m103250d("App_Add_Page", "click retry. AddFragment showLoading");
        m100711e();
        m100713f();
    }

    /* renamed from: a */
    private void m100706a(View view) {
        this.f68836l = new StatusController(view.findViewById(R.id.content), view.findViewById(R.id.error), new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27596b.C275971 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                C27596b.this.f68825a.setVisibility(0);
                C27582j.m100671a(true, C27596b.this.f68825a.getLottieAnimationView());
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                C27582j.m100671a(false, C27596b.this.f68825a.getLottieAnimationView());
                C27596b.this.f68825a.setVisibility(8);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m100710d(View view) {
        new DrawerLayout(getActivity(), this.f68827c, new DrawerLayout.AbstractC28103b() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$b$jTWZ09W7hr4sb3QlFKV4Ci3Sn88 */

            @Override // com.ss.android.appcenter.business.view.DrawerLayout.AbstractC28103b
            public final void onTabSelected(int i) {
                C27596b.this.m100705a((C27596b) i);
            }
        }, this.f68830f.getCurrentItem(), null).mo100027a(view);
    }

    /* renamed from: b */
    private void m100707b(View view) {
        view.findViewById(R.id.back).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$b$8oGmtebJl3HefRRMUFwJuky3udw */

            public final void onClick(View view) {
                C27596b.this.m100715g(view);
            }
        });
        this.f68834j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$b$hoZwiIoP8fimFzBmJtYcxieOFk */

            public final void onClick(View view) {
                C27596b.this.m100714f(view);
            }
        });
        view.findViewById(R.id.error).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$b$a2FcOPvAK4lhlBMYdfkU96UkFI */

            public final void onClick(View view) {
                C27596b.this.m100712e(view);
            }
        });
        this.f68833i.setOnClickListener(new AbstractView$OnClickListenerC28143a() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27596b.C275982 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a
            /* renamed from: a */
            public void mo98319a(View view) {
                AppSortActivity.m101114a(C27596b.this);
                C27710b.m101292e();
            }
        });
    }

    /* renamed from: a */
    public void mo98313a(List<ItemInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ItemInfo itemInfo : list) {
            arrayList.add(itemInfo.getIconKey());
        }
        this.f68833i.mo98344a(arrayList);
    }

    /* renamed from: c */
    private void m100708c(View view) {
        this.f68830f = (ViewPager) view.findViewById(R.id.view_pager);
        this.f68831g = (UDTabLayout) view.findViewById(R.id.tab_layout);
        this.f68832h = view.findViewById(R.id.category);
        this.f68833i = (AppBar) view.findViewById(R.id.app_bar);
        this.f68834j = (ImageView) view.findViewById(R.id.search);
        this.f68825a = (WorkplaceLoadingView) view.findViewById(R.id.loading);
    }

    /* renamed from: b */
    public void mo98315b(List<Tag> list) {
        if (C27602c.m100727a(list, this.f68835k)) {
            C28184h.m103250d("App_Add_Page", "handle the same tag list. return.");
            return;
        }
        this.f68835k = list;
        this.f68827c.clear();
        this.f68826b.clear();
        for (Tag tag : list) {
            String id = tag.getId();
            if (!TextUtils.isEmpty(id)) {
                this.f68826b.add(C27607e.m100745a(id, tag.getName()));
                this.f68827c.add(tag.getName());
            }
        }
        this.f68830f.setAdapter(new FragmentPagerAdapter(getChildFragmentManager(), 1) {
            /* class com.ss.android.appcenter.business.activity.appaddv2.C27596b.C276015 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return C27596b.this.f68826b.size();
            }

            /* renamed from: a */
            public C27607e getItem(int i) {
                return C27596b.this.f68826b.get(i);
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                return C27596b.this.f68827c.get(i);
            }
        });
        new UDTabLayoutCoordinator(this.f68831g, this.f68830f).attach();
        this.f68832h.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appaddv2.$$Lambda$b$3r9iAlrm8Uc_3AoDtzmOtLGEnw */

            public final void onClick(View view) {
                C27596b.this.m100710d(view);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 101 && i2 == -1) {
            C28184h.m103250d("App_Add_Page", "onActivityResult. requestUserItemListFromNet");
            this.f68837m.requestUserItemListFromNet();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.workplace_addapp_add_fragment, viewGroup, false);
        m100708c(inflate);
        m100706a(inflate);
        m100707b(inflate);
        m100709d();
        m100711e();
        C28184h.m103250d("App_Add_Page", "AddFragmentinit finish. showLoading");
        return inflate;
    }
}
