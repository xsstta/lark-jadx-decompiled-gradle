package com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.p078b.p079a.C2052c;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.C27711a;
import com.ss.android.appcenter.business.net.dto.AppBadgeNode;
import com.ss.android.appcenter.business.net.dto.ItemInfo;
import com.ss.android.appcenter.business.net.subtaginfo.C27747a;
import com.ss.android.appcenter.business.net.subtaginfo.SubTagData;
import com.ss.android.appcenter.business.net.workplacehome.C27771a;
import com.ss.android.appcenter.business.net.workplacehome.TagChild;
import com.ss.android.appcenter.business.p1265a.C27575d;
import com.ss.android.appcenter.business.p1265a.C27577f;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27902a;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter;
import com.ss.android.appcenter.business.tab.business.view.itemmenu.p1278b.C27919d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C27999a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.model.C28000b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27990a;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27992c;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27994e;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b;
import com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.CategoryGroupData;
import com.ss.android.appcenter.business.tab.fragmentv2.p1280a.C27986a;
import com.ss.android.appcenter.business.view.C28108a;
import com.ss.android.appcenter.business.view.DrawerLayout;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.adapter.groupadapter.UpdateActionType;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.b */
public class C28015b extends AbstractC27990a implements AbstractC27991b, AbstractC27992c, AbstractC27993d {

    /* renamed from: a */
    private UDTabLayout.OnTabSelectedListener f70097a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m102383a(View view) {
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b
    /* renamed from: a */
    public void mo99750a(AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar, UpdateActionType updateActionType) {
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d
    /* renamed from: a */
    public void mo99752a(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar, UpdateActionType updateActionType) {
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27991b
    /* renamed from: a */
    public void mo99749a(AbstractC27994e eVar, C28118a aVar, int i, int i2, C28000b bVar) {
        CategoryGroupData a = m102382a(bVar, i);
        if (a == null) {
            C28184h.m103248b("Workplace_Page", "onBindChildView getCategoryGroupData null. groupPosition:" + i);
            return;
        }
        Context a2 = eVar.mo99754a();
        if (a.mo99835p()) {
            m102391c(eVar, aVar, i, bVar);
        } else if (a.mo99837r()) {
            m102389a(a, eVar, aVar, i, bVar);
        } else if (a.mo99838s()) {
            m102392d(eVar, aVar, i, bVar);
        } else {
            List<ItemInfo> u = a.mo99840u();
            ItemInfo itemInfo = (ItemInfo) C28182f.m103235a(u, i2, null);
            if (itemInfo == null) {
                C28184h.m103248b("Workplace_Page", "onBindChildView>>> itemInfo is null. index:" + i2 + " list size:" + u.size());
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.itemView.getLayoutParams();
            int i3 = 4;
            int i4 = 0;
            if (i2 < 4) {
                marginLayoutParams.topMargin = C28209p.m103293a(a2, 16.0f);
            } else {
                marginLayoutParams.topMargin = 0;
            }
            if (!a.mo99841v()) {
                int j = a.mo99793j();
                int i5 = j % 4;
                if (i5 != 0) {
                    i3 = i5;
                }
                if (i2 >= j - i3) {
                    marginLayoutParams.bottomMargin = C28209p.m103293a(a2, 40.0f);
                } else {
                    marginLayoutParams.bottomMargin = 0;
                }
            } else {
                marginLayoutParams.bottomMargin = 0;
            }
            aVar.itemView.setLayoutParams(marginLayoutParams);
            boolean isSingleBot = itemInfo.isSingleBot();
            SquircleImageView squircleImageView = (SquircleImageView) aVar.mo100089a(R.id.icon);
            if (squircleImageView == null) {
                C28184h.m103248b("Workplace_Page", "category view error.");
                return;
            }
            TextView textView = (TextView) aVar.mo100089a(R.id.name);
            squircleImageView.setBorderWidth((int) eVar.mo99754a().getResources().getDimension(R.dimen.workplace_common_icon_border_width));
            C27688a.m101210a(a2, itemInfo.getName(), itemInfo.getIconKey(), squircleImageView);
            textView.setText(itemInfo.getName());
            boolean z = itemInfo.isNew() && i2 < 5;
            if (z) {
                Drawable drawable = a2.getDrawable(R.drawable.appcenter_new_bg);
                int a3 = C28209p.m103293a(a2, 6.0f);
                drawable.setBounds(0, 0, a3, a3);
                C28108a aVar2 = new C28108a(drawable);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) ("  " + itemInfo.getName()));
                spannableStringBuilder.setSpan(aVar2, 0, 1, 33);
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(itemInfo.getName());
            }
            View a4 = aVar.mo100089a(R.id.bot_icon);
            if (!isSingleBot) {
                i4 = 8;
            }
            a4.setVisibility(i4);
            m102384a(eVar, aVar, itemInfo, bVar, i, i2, z);
        }
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27992c
    /* renamed from: a */
    public void mo99751a(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        int i2;
        CategoryGroupData a = m102382a(bVar, i);
        if (a == null) {
            C28184h.m103248b("Workplace_Page", "onBindFooterView getCategoryGroupData null. groupPosition:" + i);
        } else if (a.mo99841v()) {
            aVar.mo100089a(R.id.hint_wrapper).setVisibility(0);
            ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
            layoutParams.height = C28209p.m103293a(eVar.mo99754a(), 74.0f);
            aVar.itemView.setLayoutParams(layoutParams);
        } else {
            aVar.mo100089a(R.id.hint_wrapper).setVisibility(8);
            List<ItemInfo> u = a.mo99840u();
            if (a.mo99836q()) {
                i2 = (m102381a(eVar, i, bVar) - C28209p.m103293a(eVar.mo99754a(), 40.0f)) - (C28209p.m103293a(eVar.mo99754a(), 103.0f) * ((int) Math.ceil(((double) u.size()) / 4.0d)));
            } else {
                i2 = 0;
            }
            ViewGroup.LayoutParams layoutParams2 = aVar.itemView.getLayoutParams();
            layoutParams2.height = Math.max(0, i2);
            aVar.itemView.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: a */
    public void mo99858a(CategoryGroupData categoryGroupData, AbstractC27994e eVar, int i, int i2, boolean z) {
        C28184h.m103250d("CategoryViewBinder", "changeTag position:" + i2 + " cur:" + CategoryGroupData.f70088a);
        if (z || CategoryGroupData.f70088a != i2) {
            C28184h.m103250d("CategoryViewBinder", "real changeTag position:" + i2);
            categoryGroupData.mo99833b(i2);
            eVar.mo99762c();
            eVar.mo99763c(i);
            m102386a(categoryGroupData, eVar, i2);
        }
    }

    /* renamed from: a */
    private boolean m102390a(UDTabLayout uDTabLayout, List<String> list, int i) {
        int tabCount = uDTabLayout.getTabCount();
        if (!(tabCount != 0 && tabCount == list.size() && uDTabLayout.getSelectPosition() == i)) {
            return true;
        }
        for (int i2 = 0; i2 < tabCount; i2++) {
            if (!TextUtils.equals(uDTabLayout.getTabAt(i2).mo91339b(), list.get(i2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private CategoryGroupData m102382a(C28000b bVar, int i) {
        C27999a o = bVar.mo99821o(i);
        if (!(o instanceof CategoryGroupData)) {
            return null;
        }
        return (CategoryGroupData) o;
    }

    /* renamed from: a */
    private int m102381a(AbstractC27994e eVar, int i, C28000b bVar) {
        int i2;
        int d = eVar.mo99764d() - C28209p.m103293a(eVar.mo99754a(), 54.0f);
        CategoryGroupData a = m102382a(bVar, i);
        if (a == null) {
            C28184h.m103248b("Workplace_Page", "getTagContentHeight getCategoryGroupData null. groupPosition:" + i);
            return d;
        }
        if (a.mo99834o().size() != 0) {
            i2 = C28209p.m103293a(eVar.mo99754a(), 36.0f);
        } else {
            i2 = 0;
        }
        return d - i2;
    }

    /* renamed from: a */
    private void m102386a(final CategoryGroupData categoryGroupData, final AbstractC27994e eVar, final int i) {
        final CategoryGroupData.C28011a a = categoryGroupData.mo99831a(i);
        if (a == null) {
            C28184h.m103250d("CategoryViewBinder", String.format("get position %d CategoryTag is null", Integer.valueOf(i)));
            return;
        }
        C27747a.m101450a(a.mo99851f(), new C27747a.AbstractC27749a() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.C280225 */

            @Override // com.ss.android.appcenter.business.net.subtaginfo.C27747a.AbstractC27749a
            /* renamed from: a */
            public void mo99045a(SubTagData subTagData) {
                if (subTagData != null) {
                    Map<String, ItemInfo> allItemInfos = subTagData.getAllItemInfos();
                    ArrayList arrayList = new ArrayList();
                    for (TagChild tagChild : subTagData.getChildren()) {
                        ItemInfo itemInfo = allItemInfos.get(tagChild.getItemId());
                        if (itemInfo != null) {
                            arrayList.add(itemInfo);
                        }
                        if (tagChild.isWidget()) {
                            itemInfo.setWidget(true);
                        }
                        if (tagChild.isBlock()) {
                            itemInfo.setBlock(true);
                        }
                    }
                    a.mo99844a(arrayList);
                    a.mo99845a(subTagData.isHasMore());
                    if (eVar.mo99760b() != null && eVar.mo99760b().isAdded()) {
                        ((C27986a) aj.m5364a(eVar.mo99760b()).mo6005a(C27986a.class)).updateCategoryCache(a);
                    }
                    categoryGroupData.mo99842w();
                } else if (!a.mo99846a()) {
                    a.mo99843a(2);
                } else {
                    return;
                }
                int i = CategoryGroupData.f70088a;
                int i2 = i;
                if (i == i2) {
                    categoryGroupData.mo99833b(i2);
                    UICallbackExecutor.post(new Runnable() {
                        /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.$$Lambda$b$5$pahgXDEyjciYsNZsHNkJrWwjO5A */

                        public final void run() {
                            C28015b.C280225.m102406a(AbstractC27994e.this);
                        }
                    });
                }
            }
        });
    }

    /* renamed from: d */
    private void m102392d(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        View a = aVar.mo100089a(R.id.guide_wrapper);
        if (a == null) {
            C28184h.m103250d("CategoryViewBinder", "showGuide>>> find view error. return bind.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = m102381a(eVar, i, bVar);
        aVar.mo100089a(R.id.guide_wrapper).setLayoutParams(layoutParams);
        ((Guideline) aVar.mo100089a(R.id.start_line)).setGuidelinePercent(0.17f);
    }

    /* renamed from: c */
    private void m102391c(AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        View a = aVar.mo100089a(R.id.category_loading_wrapper);
        if (a == null) {
            C28184h.m103250d("CategoryViewBinder", "showLoading>>> find view error. return bind.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = m102381a(eVar, i, bVar);
        aVar.mo100089a(R.id.category_loading_wrapper).setLayoutParams(layoutParams);
        RecyclerView recyclerView = (RecyclerView) aVar.mo100089a(R.id.category_loading);
        C28023c cVar = new C28023c();
        recyclerView.setAdapter(cVar);
        recyclerView.setLayoutManager(new GridLayoutManager(eVar.mo99754a(), 4));
        C2052c.m8960a(recyclerView).mo10132a(cVar).mo10139e(R.layout.workplace_fragment_adapter_app_skeleton_item).mo10133a(UIUtils.canShowSkeleton()).mo10131a(12).mo10134a();
    }

    @Override // com.ss.android.appcenter.business.tab.fragmentv2.adapter.p1281a.AbstractC27993d
    /* renamed from: b */
    public void mo99753b(final AbstractC27994e eVar, C28118a aVar, final int i, C28000b bVar) {
        boolean z;
        final CategoryGroupData a = m102382a(bVar, i);
        if (a == null) {
            C28184h.m103248b("Workplace_Page", "onBindHeaderView getCategoryGroupData null. groupPosition:" + i);
            return;
        }
        List<String> o = a.mo99834o();
        if (o.size() <= 0) {
            aVar.mo100089a(R.id.category).setVisibility(8);
            aVar.mo100089a(R.id.taglayout_wrapper).setVisibility(8);
            return;
        }
        aVar.mo100089a(R.id.taglayout_wrapper).setVisibility(0);
        aVar.mo100089a(R.id.category).setVisibility(0);
        final UDTabLayout uDTabLayout = (UDTabLayout) aVar.mo100089a(R.id.tagLayout);
        if (m102390a(uDTabLayout, o, CategoryGroupData.f70088a)) {
            C28184h.m103250d("CategoryViewBinder", "reAddTab>>>");
            uDTabLayout.removeAllTabs();
            for (int i2 = 0; i2 < o.size(); i2++) {
                UDTab newTab = uDTabLayout.newTab();
                newTab.mo91335a((CharSequence) o.get(i2));
                if (i2 == CategoryGroupData.f70088a) {
                    z = true;
                } else {
                    z = false;
                }
                uDTabLayout.addTab(newTab, z);
            }
            ViewTreeObserver viewTreeObserver = uDTabLayout.getViewTreeObserver();
            C28184h.m103248b("CategoryViewBinder", "before getViewTreeObserver=" + viewTreeObserver);
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.ViewTreeObserver$OnGlobalLayoutListenerC280161 */

                public void onGlobalLayout() {
                    uDTabLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    C28184h.m103250d("CategoryViewBinder", "onGlobalLayout>>>");
                    uDTabLayout.selectTabAt(CategoryGroupData.f70088a);
                }
            });
        }
        UDTabLayout.OnTabSelectedListener bVar2 = this.f70097a;
        if (bVar2 != null) {
            uDTabLayout.removeOnTabSelectedListener(bVar2);
        }
        C28184h.m103250d("CategoryViewBinder", "addOnTabSelectedListener>>>");
        C280172 r0 = new UDTabLayout.OnTabSelectedListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.C280172 */

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: a */
            public void mo53906a(UDTab bVar) {
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: b */
            public void mo53907b(UDTab bVar) {
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: c */
            public void mo53908c(UDTab bVar) {
                C28184h.m103250d("CategoryViewBinder", "onTabSelected>>>");
                C28015b.this.mo99858a(a, eVar, i, bVar.mo91343d(), false);
            }
        };
        this.f70097a = r0;
        uDTabLayout.addOnTabSelectedListener(r0);
        aVar.itemView.setOnClickListener($$Lambda$b$F3BfhhPA1ybce6OFxlMm4Ul7FS4.INSTANCE);
        aVar.mo100089a(R.id.category).setOnClickListener(new View.OnClickListener(eVar, o, a, i) {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.$$Lambda$b$yfFnALnquXCGEuXgyhanefHEpk */
            public final /* synthetic */ AbstractC27994e f$1;
            public final /* synthetic */ List f$2;
            public final /* synthetic */ CategoryGroupData f$3;
            public final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onClick(View view) {
                C28015b.this.m102385a((C28015b) this.f$1, (AbstractC27994e) this.f$2, (List) this.f$3, (CategoryGroupData) this.f$4, (int) view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m102387a(CategoryGroupData categoryGroupData, AbstractC27994e eVar, int i, int i2) {
        mo99858a(categoryGroupData, eVar, i, i2, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m102388a(CategoryGroupData categoryGroupData, AbstractC27994e eVar, int i, View view) {
        categoryGroupData.mo99839t();
        mo99858a(categoryGroupData, eVar, i, CategoryGroupData.f70088a, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m102385a(AbstractC27994e eVar, List list, CategoryGroupData categoryGroupData, int i, View view) {
        new DrawerLayout(eVar.mo99760b().getActivity(), list, new DrawerLayout.AbstractC28103b(categoryGroupData, eVar, i) {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.$$Lambda$b$xW2FR8dX_6j0mU3Pktthu09IgE */
            public final /* synthetic */ CategoryGroupData f$1;
            public final /* synthetic */ AbstractC27994e f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // com.ss.android.appcenter.business.view.DrawerLayout.AbstractC28103b
            public final void onTabSelected(int i) {
                C28015b.this.m102387a((C28015b) this.f$1, (CategoryGroupData) this.f$2, (AbstractC27994e) this.f$3, i);
            }
        }, CategoryGroupData.f70088a, null).mo100027a(view);
    }

    /* renamed from: a */
    private void m102389a(CategoryGroupData categoryGroupData, AbstractC27994e eVar, C28118a aVar, int i, C28000b bVar) {
        View a = aVar.mo100089a(R.id.error_wrapper);
        if (a == null) {
            C28184h.m103250d("CategoryViewBinder", "showError>>> find view error. return bind.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        layoutParams.height = m102381a(eVar, i, bVar);
        aVar.mo100089a(R.id.error_wrapper).setLayoutParams(layoutParams);
        ((Guideline) aVar.mo100089a(R.id.start_line)).setGuidelinePercent(0.17f);
        aVar.itemView.setOnClickListener(new View.OnClickListener(categoryGroupData, eVar, i) {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.$$Lambda$b$31plzMYtXS0vDWwrNlSZA1tT2fM */
            public final /* synthetic */ CategoryGroupData f$1;
            public final /* synthetic */ AbstractC27994e f$2;
            public final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onClick(View view) {
                C28015b.this.m102388a((C28015b) this.f$1, (CategoryGroupData) this.f$2, (AbstractC27994e) this.f$3, (int) view);
            }
        });
    }

    /* renamed from: a */
    private void m102384a(final AbstractC27994e eVar, final C28118a aVar, final ItemInfo itemInfo, final C28000b bVar, final int i, final int i2, final boolean z) {
        View view = aVar.itemView;
        view.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.View$OnClickListenerC280183 */

            public void onClick(View view) {
                String str;
                C28184h.m103250d("Workplace_Page", "click category app: " + itemInfo);
                C27577f.m100655a(eVar.mo99754a(), itemInfo);
                AppBadgeNode badgeNode = itemInfo.badgeNode();
                if (badgeNode == null) {
                    str = "null";
                } else if (badgeNode.needShow) {
                    str = "on";
                } else {
                    str = "off";
                }
                C27710b.m101264a(itemInfo.getName(), itemInfo.getAppId(), C27575d.m100643a(itemInfo), null, C27575d.m100644a(itemInfo.getItemUrl().getMobileAppLink()), str, itemInfo.badgeNum());
                C27710b.m101259a(itemInfo.getAppId(), itemInfo.getItemId());
                if (z) {
                    C27711a.m101329a(itemInfo.getItemId());
                    eVar.mo99758a(itemInfo.getItemId());
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.View$OnLongClickListenerC280194 */

            public boolean onLongClick(View view) {
                eVar.mo99756a(i, i2, aVar);
                eVar.mo99759a(false);
                String itemId = itemInfo.getItemId();
                new C27902a(eVar.mo99760b()).mo99487a(false).mo99489b(bVar.mo99803a(itemId)).mo99490c(false).mo99491d(C27577f.m100658b(itemInfo)).mo99486a(itemId).mo99483a(itemInfo).mo99481a(aVar.mo100089a(R.id.icon), eVar.mo99754a().getResources().getDimension(R.dimen.workplace_common_icon_radius)).mo99482a(aVar.mo100089a(R.id.bot_icon), new C27919d((float) C28209p.m103293a(eVar.mo99754a(), 40.0f))).mo99485a(new ItemMenuAdapter.AbstractC27933b() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.View$OnLongClickListenerC280194.C280212 */

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: d */
                    public void mo99571d() {
                    }

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: c */
                    public void mo99570c() {
                        C27710b.m101309l(itemInfo.getAppId());
                    }

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: a */
                    public void mo99568a() {
                        int a = bVar.mo99800a(itemInfo, itemInfo.isWidget());
                        if (a != -1) {
                            eVar.mo99755a(a);
                        }
                        C27771a.m101486a().mo99116a(itemInfo, true);
                        C27710b.m101305j(itemInfo.getAppId());
                    }

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.menu.ItemMenuAdapter.AbstractC27933b
                    /* renamed from: b */
                    public void mo99569b() {
                        int b = bVar.mo99805b(itemInfo, itemInfo.isWidget());
                        if (b != -1) {
                            eVar.mo99761b(b);
                        }
                        C27771a.m101486a().mo99116a(itemInfo, false);
                        C27710b.m101307k(itemInfo.getAppId());
                    }
                }).mo99484a(new C27913b.AbstractC27915a() {
                    /* class com.ss.android.appcenter.business.tab.fragmentv2.adapter.viewbinder.category.C28015b.View$OnLongClickListenerC280194.C280201 */

                    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.C27913b.AbstractC27915a
                    public void onDismiss() {
                        eVar.mo99759a(true);
                    }
                }).mo99488a();
                C27710b.m101285c(itemInfo.getAppId(), false);
                return true;
            }
        });
    }
}
