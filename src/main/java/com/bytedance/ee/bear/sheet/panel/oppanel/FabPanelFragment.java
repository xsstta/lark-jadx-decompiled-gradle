package com.bytedance.ee.bear.sheet.panel.oppanel;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.bear.sheet.common.SheetDragView;
import com.bytedance.ee.bear.sheet.common.SheetPanelRouter;
import com.bytedance.ee.bear.sheet.fab.C11143b;
import com.bytedance.ee.bear.sheet.fab.FabItemEnum;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.oppanel.C11271b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedence.ee.bear.fabview.FabView;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.suite.R;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Arrays;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69633c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge.BadgeAnchor;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge.C69631a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.badge.C69632b;

public class FabPanelFragment extends C7667e {

    /* renamed from: a */
    public C11271b f30288a;

    /* renamed from: b */
    public C1177w<SheetItem[]> f30289b;

    /* renamed from: c */
    public AvailableItem[] f30290c;

    /* renamed from: d */
    public SheetDragView f30291d;

    /* renamed from: e */
    public MagicIndicator f30292e;

    /* renamed from: f */
    public int f30293f;

    /* renamed from: g */
    public Runnable f30294g;

    /* renamed from: h */
    private C11088a f30295h;

    /* renamed from: i */
    private DocViewModel f30296i;

    /* renamed from: j */
    private C69619a f30297j;

    /* renamed from: k */
    private ViewPager f30298k;

    /* renamed from: l */
    private PagerAdapter f30299l;

    /* renamed from: m */
    private boolean f30300m;

    /* renamed from: n */
    private boolean f30301n;

    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelFragment$a */
    class C11264a extends FragmentPagerAdapter {
        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return FabPanelFragment.this.f30290c.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public long getItemId(int i) {
            return (long) FabPanelFragment.this.f30290c[i].getId().hashCode();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            String name = SubPanelEnum.style.name();
            if (i < FabPanelFragment.this.f30290c.length) {
                name = FabPanelFragment.this.f30290c[i].getId();
            }
            Bundle bundle = new Bundle();
            C4943e.m20406a(FabPanelFragment.this, bundle);
            bundle.putString("sub_fragment_id", name);
            return Fragment.instantiate(FabPanelFragment.this.getContext(), SubPanelEnum.valueOf(name).fragment, bundle);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            Bundle arguments = ((Fragment) obj).getArguments();
            if (arguments == null) {
                return -2;
            }
            String string = arguments.getString("sub_fragment_id", SubPanelEnum.style.name());
            int i = arguments.getInt("sub_fragment_index", -1);
            for (int i2 = 0; i2 < FabPanelFragment.this.f30290c.length; i2++) {
                if (TextUtils.equals(string, FabPanelFragment.this.f30290c[i2].getId())) {
                    if (i2 == i) {
                        return -1;
                    } else {
                        arguments.putInt("sub_fragment_index", i2);
                        return i2;
                    }
                }
            }
            return -2;
        }

        C11264a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }
    }

    /* renamed from: com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelFragment$b */
    class C11265b extends AbstractC69621a {

        /* renamed from: a */
        static final /* synthetic */ boolean f30304a = true;

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            SheetItem[] b = FabPanelFragment.this.f30289b.mo5927b();
            if (b == null) {
                return 0;
            }
            return b.length;
        }

        C11265b() {
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(context);
            aVar.setMode(1);
            aVar.setColors(Integer.valueOf(context.getResources().getColor(R.color.space_kit_b500)));
            aVar.setLineHeight((float) context.getResources().getDimensionPixelSize(R.dimen.sheet_oppanel_indicator_height));
            aVar.setXOffset((float) (-C13749l.m55738a(7)));
            aVar.setStartInterpolator(new AccelerateInterpolator());
            aVar.setEndInterpolator(new DecelerateInterpolator(3.0f));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            int i2;
            final SheetItem[] b = FabPanelFragment.this.f30289b.mo5927b();
            if (f30304a || b != null) {
                C69631a aVar = new C69631a(context);
                aVar.setContentDescription(b[i].getId());
                C69633c cVar = new C69633c(context);
                cVar.setSelectedColor(context.getResources().getColor(R.color.sheet_oppanel_tab_select));
                if (b[i].isEnable()) {
                    i2 = context.getResources().getColor(R.color.sheet_oppanel_tab_unselect);
                } else {
                    i2 = context.getResources().getColor(R.color.sheet_oppanel_tab_disable);
                }
                cVar.setNormalColor(i2);
                cVar.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
                cVar.getPaint().setStrokeWidth(1.0f);
                cVar.setText(b[i].getTitle());
                cVar.setTextSize(17.0f);
                aVar.setInnerPagerTitleView(cVar);
                if (FabPanelFragment.this.f30288a.showBadges(b[i].getId())) {
                    UDBadgeView a = new UDBadgeView.Builder().mo90261a(2131887083).mo90262a(context);
                    aVar.setAutoCancelBadge(true);
                    aVar.setBadgeView(a);
                    aVar.setXBadgeRule(new C69632b(BadgeAnchor.CONTENT_RIGHT, 0));
                    aVar.setYBadgeRule(new C69632b(BadgeAnchor.CONTENT_TOP, C13749l.m55738a(-2)));
                }
                aVar.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelFragment.C11265b.C112661 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        if (b[i].isEnable()) {
                            FabPanelFragment.this.mo43192a(b[i].getId(), true);
                        }
                        if (!b[i].isEnable()) {
                            FabPanelFragment.this.f30288a.clickItem(b[i].getId(), null);
                        }
                    }
                });
                FabPanelFragment.this.f30291d.setSlideView(aVar);
                return aVar;
            }
            throw new AssertionError();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        if (super.onBackPressed()) {
            return true;
        }
        this.f30288a.setActive(false);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m46835a() {
        m46842b();
        this.f30299l.notifyDataSetChanged();
        this.f30297j.mo243194c();
        if (!this.f30300m) {
            AvailableItem[] availableItemArr = this.f30290c;
            if (availableItemArr.length != 0) {
                this.f30292e.mo243173a(availableItemArr[0].tabPosition);
                this.f30300m = true;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.f30289b.mo5927b() != null) {
            for (SheetItem sheetItem : this.f30289b.mo5927b()) {
                this.f30288a.clearBadges(sheetItem.getId());
            }
        }
        this.f30288a.setToolkitDelegate(null);
        this.f30288a.setActive(false);
        this.f30295h.mo42257C();
        C11090b.m46146a(this.f30301n);
        super.onDestroyView();
    }

    /* renamed from: b */
    private void m46842b() {
        C1177w<SheetItem[]> wVar = this.f30289b;
        if (wVar == null || wVar.mo5927b() == null) {
            this.f30290c = new AvailableItem[0];
            return;
        }
        SheetItem[] b = this.f30289b.mo5927b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b.length; i++) {
            if (b[i].isEnable()) {
                arrayList.add(new AvailableItem(i, b[i].getId(), b[i].getTitle(), b[i].getValue()));
            }
        }
        this.f30290c = (AvailableItem[]) arrayList.toArray(new AvailableItem[0]);
    }

    /* renamed from: a */
    public void mo43191a(String str) {
        mo43192a(str, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46836a(C11143b bVar) {
        bVar.clickItem(FabItemEnum.input.name(), null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46838a(FabView fabView) {
        this.f30301n = true;
        fabView.setVisibility(8);
        this.f30288a.setActive(false);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C11271b bVar = (C11271b) C4950k.m20474a(this, C11271b.class);
        this.f30288a = bVar;
        bVar.setToolkitDelegate(new C11271b.AbstractC11272a() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$xpaK7SlmCAmOU_YqKmxhygCSsVo */

            @Override // com.bytedance.ee.bear.sheet.panel.oppanel.C11271b.AbstractC11272a
            public final void openChildFragment(Class cls, Bundle bundle) {
                FabPanelFragment.this.m46840a((FabPanelFragment) cls, (Class) bundle);
            }
        });
        this.f30296i = (DocViewModel) C4950k.m20474a(this, DocViewModel.class);
        this.f30289b = this.f30288a.getTopItems();
        m46842b();
        this.f30289b.mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$PdsqRucPqLHFN2iGVczw8dxkqLM */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FabPanelFragment.this.m46841a((FabPanelFragment) ((SheetItem[]) obj));
            }
        });
        C11088a aVar = new C11088a();
        this.f30295h = aVar;
        aVar.mo42260a(this.f30296i.getBearUrl());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46841a(SheetItem[] sheetItemArr) {
        C13479a.m54772d("FabPanelFragment", "tabs change: " + Arrays.toString(sheetItemArr));
        if (sheetItemArr == null) {
            this.f30288a.setActive(false);
        } else if (this.f30293f == 0) {
            m46835a();
        } else {
            this.f30294g = new Runnable() {
                /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$S5yhtMop35YynFo1f03fXaf1Hes */

                public final void run() {
                    FabPanelFragment.this.m46835a();
                }
            };
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46837a(C11143b bVar, View view) {
        this.f30295h.mo42285i();
        this.f30288a.setActive(false);
        bVar.setFabHideTime(Integer.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
        C13742g.m55706a(new Runnable() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$6ymZNLyF4vmKgeyRiiw8D9xKT0 */

            public final void run() {
                FabPanelFragment.m46836a(C11143b.this);
            }
        }, 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46839a(FabView fabView, Boolean bool) {
        int i;
        if (Boolean.TRUE.equals(bool)) {
            i = 0;
        } else {
            i = 8;
        }
        fabView.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FabView fabView = (FabView) view.findViewById(R.id.sheet_keyboard_fab);
        this.f30288a.showKeyboardFab().mo5923a(getViewLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$3xTKBXsDDkIITQva308VtyPujJE */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FabPanelFragment.m46839a(FabView.this, (Boolean) obj);
            }
        });
        fabView.setOnClickListener(new View.OnClickListener((C11143b) C4950k.m20474a(this, C11143b.class)) {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$MNH1jrE2EgHRdSGDR3F8PiJBOgo */
            public final /* synthetic */ C11143b f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                FabPanelFragment.this.m46837a((FabPanelFragment) this.f$1, (C11143b) view);
            }
        });
        SheetDragView sheetDragView = (SheetDragView) view.findViewById(R.id.fab_dragview);
        this.f30291d = sheetDragView;
        sheetDragView.setSlideView(view.findViewById(R.id.oppanel_tab_layout));
        this.f30291d.setOnCloseListener(new SheetDragView.AbstractC11085a(fabView) {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.$$Lambda$FabPanelFragment$TAc4qBI5djNy5iVnMoCogFXhCU */
            public final /* synthetic */ FabView f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.sheet.common.SheetDragView.AbstractC11085a
            public final void onDragViewClose() {
                FabPanelFragment.this.m46838a((FabPanelFragment) this.f$1);
            }
        });
        this.f30291d.setSource("sheet_toolbar");
        this.f30291d.setDocumentUrl(this.f30296i.getBearUrl());
        this.f30292e = (MagicIndicator) view.findViewById(R.id.oppanel_tab_indicator);
        C69619a aVar = new C69619a(getContext());
        this.f30297j = aVar;
        aVar.setAdapter(new C11265b());
        this.f30297j.setAdjustMode(true);
        this.f30292e.setNavigator(this.f30297j);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.sub_fragment_vp);
        this.f30298k = viewPager;
        viewPager.setOffscreenPageLimit(2);
        ViewPager viewPager2 = this.f30298k;
        C11264a aVar2 = new C11264a(getChildFragmentManager());
        this.f30299l = aVar2;
        viewPager2.setAdapter(aVar2);
        this.f30298k.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelFragment.C112631 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                FabPanelFragment.this.f30292e.mo243175b(i);
                FabPanelFragment.this.f30293f = i;
                if (i == 0 && FabPanelFragment.this.f30294g != null) {
                    FabPanelFragment.this.f30294g.run();
                    FabPanelFragment.this.f30294g = null;
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                AvailableItem availableItem = FabPanelFragment.this.f30290c[i];
                FabPanelFragment.this.f30292e.mo243173a(availableItem.tabPosition);
                FabPanelFragment.this.f30288a.clickItem(availableItem.getId(), availableItem.getValue());
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                FabPanelFragment.this.f30292e.mo243174a(FabPanelFragment.this.f30290c[i].tabPosition, f, i2);
            }
        });
        SheetPanelRouter.f29786a.mo42307a(this, getChildFragmentManager(), Integer.valueOf((int) R.id.oppanel_container));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46840a(Class cls, Bundle bundle) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(cls.getName());
        if (findFragmentByTag == null) {
            C4943e.m20406a(this, bundle);
            findFragmentByTag = Fragment.instantiate(getContext(), cls.getName(), bundle);
        }
        childFragmentManager.beginTransaction().replace(R.id.oppanel_container, findFragmentByTag, cls.getName()).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public void mo43192a(String str, boolean z) {
        AvailableItem[] availableItemArr = this.f30290c;
        for (AvailableItem availableItem : availableItemArr) {
            if (TextUtils.equals(str, availableItem.getId())) {
                this.f30298k.setCurrentItem(availableItem.tabPosition, z);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_oppanel_fragment, viewGroup, false);
    }

    /* access modifiers changed from: private */
    public static class AvailableItem extends SheetItem {
        int tabPosition;

        AvailableItem(int i, String str, String str2, String str3) {
            this.tabPosition = i;
            this.id = str;
            this.title = str2;
            this.value = str3;
        }
    }
}
