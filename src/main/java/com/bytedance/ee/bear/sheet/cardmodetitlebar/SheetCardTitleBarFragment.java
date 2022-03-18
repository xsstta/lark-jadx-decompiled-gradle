package com.bytedance.ee.bear.sheet.cardmodetitlebar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.sheet.cardmodetitlebar.SheetCardTitleBarViewModel;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.C69043h;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\u001a\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "statusBar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "titleBar", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar;", "viewModel", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarViewModel;", "addNavBarItem", "", "item", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/NavBarItem;", "clearNavBarItems", "close", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onViewCreated", "view", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.a */
public final class SheetCardTitleBarFragment extends C7667e {

    /* renamed from: d */
    public static final String f29736d;

    /* renamed from: e */
    public static final Companion f29737e = new Companion(null);

    /* renamed from: f */
    private static final Map<String, Integer> f29738f = MapsKt.mapOf(TuplesKt.to("card", Integer.valueOf((int) R.drawable.ud_icon_sheet_cardmodel_outlined)), TuplesKt.to("list", Integer.valueOf((int) R.drawable.ud_icon_disorder_list_outlined)), TuplesKt.to("more", Integer.valueOf((int) R.drawable.ud_icon_more_outlined)));

    /* renamed from: a */
    public BaseTitleBar f29739a;

    /* renamed from: b */
    public SheetCardTitleBarViewModel f29740b;

    /* renamed from: c */
    public IStatusBar f29741c;

    /* renamed from: g */
    private HashMap f29742g;

    /* renamed from: c */
    public void mo42179c() {
        HashMap hashMap = this.f29742g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarFragment$Companion;", "", "()V", "BACK", "", "CARD", "LIST", "MORE", "TAG", "getTAG", "()Ljava/lang/String;", "navBarRightItemMap", "", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo42180a() {
            return SheetCardTitleBarFragment.f29736d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        mo42178b();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        IStatusBar aVar = this.f29741c;
        if (aVar != null) {
            aVar.mo50689b();
        }
        mo42179c();
    }

    /* renamed from: a */
    public final void mo42176a() {
        BaseTitleBar baseTitleBar = this.f29739a;
        if (baseTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        baseTitleBar.mo45084b();
        BaseTitleBar baseTitleBar2 = this.f29739a;
        if (baseTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        baseTitleBar2.mo45073a();
    }

    /* renamed from: b */
    public final void mo42178b() {
        SheetCardTitleBarViewModel bVar = this.f29740b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.getActive().mo5929b((Boolean) false);
        SheetCardTitleBarViewModel bVar2 = this.f29740b;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        SheetCardTitleBarViewModel.Delegate delegate = bVar2.getDelegate();
        if (delegate != null) {
            delegate.mo42175a("back");
        }
    }

    static {
        String simpleName = SheetCardTitleBarFragment.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "SheetCardTitleBarFragment::class.java.simpleName");
        f29736d = simpleName;
    }

    /* renamed from: a */
    public static final /* synthetic */ BaseTitleBar m46033a(SheetCardTitleBarFragment aVar) {
        BaseTitleBar baseTitleBar = aVar.f29739a;
        if (baseTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        return baseTitleBar;
    }

    /* renamed from: b */
    public static final /* synthetic */ SheetCardTitleBarViewModel m46034b(SheetCardTitleBarFragment aVar) {
        SheetCardTitleBarViewModel bVar = aVar.f29740b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/sheet/cardmodetitlebar/SheetCardTitleBarFragment$addNavBarItem$1$imageAction$1", "Lcom/bytedance/ee/bear/widgets/BaseTitleBar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.a$b */
    public static final class C11069b extends BaseTitleBar.C11803d {

        /* renamed from: a */
        final /* synthetic */ int f29743a;

        /* renamed from: b */
        final /* synthetic */ SheetCardTitleBarFragment f29744b;

        /* renamed from: c */
        final /* synthetic */ NavBarItem f29745c;

        @Override // com.bytedance.ee.bear.widgets.BaseTitleBar.AbstractC11800a, com.bytedance.ee.bear.widgets.BaseTitleBar.C11801b
        /* renamed from: a */
        public void mo16854a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            SheetCardTitleBarViewModel.Delegate delegate = SheetCardTitleBarFragment.m46034b(this.f29744b).getDelegate();
            if (delegate != null) {
                String id = this.f29745c.getId();
                if (id == null) {
                    id = "";
                }
                delegate.mo42175a(id);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11069b(int i, int i2, SheetCardTitleBarFragment aVar, NavBarItem navBarItem) {
            super(i2);
            this.f29743a = i;
            this.f29744b = aVar;
            this.f29745c = navBarItem;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.a$c */
    static final class View$OnClickListenerC11070c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SheetCardTitleBarFragment f29746a;

        View$OnClickListenerC11070c(SheetCardTitleBarFragment aVar) {
            this.f29746a = aVar;
        }

        public final void onClick(View view) {
            C13479a.m54772d(SheetCardTitleBarFragment.f29737e.mo42180a(), "back view clicked...");
            C11090b.m46153f();
            this.f29746a.mo42178b();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1142af a = C4950k.m20474a(this, SheetCardTitleBarViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…BarViewModel::class.java)");
        this.f29740b = (SheetCardTitleBarViewModel) a;
    }

    /* renamed from: a */
    public final void mo42177a(NavBarItem navBarItem) {
        Integer num = f29738f.get(navBarItem.getId());
        if (num != null) {
            int intValue = num.intValue();
            C11069b bVar = new C11069b(intValue, intValue, this, navBarItem);
            BaseTitleBar baseTitleBar = this.f29739a;
            if (baseTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            View a = baseTitleBar.mo45070a(bVar);
            Intrinsics.checkExpressionValueIsNotNull(a, "titleBar.addRightAction(imageAction)");
            String id = navBarItem.getId();
            if (id == null) {
                id = "";
            }
            a.setTag(id);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/sheet/cardmodetitlebar/CardNavBarData;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.cardmodetitlebar.a$d */
    static final class C11071d<T> implements AbstractC1178x<CardNavBarData> {

        /* renamed from: a */
        final /* synthetic */ SheetCardTitleBarFragment f29747a;

        C11071d(SheetCardTitleBarFragment aVar) {
            this.f29747a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(CardNavBarData cardNavBarData) {
            NavBarItem[] right;
            NavBarItem[] left;
            if (!(cardNavBarData == null || cardNavBarData.getBgColor() == null)) {
                String bgColor = cardNavBarData.getBgColor();
                if (bgColor == null) {
                    Intrinsics.throwNpe();
                }
                int a = ColorUtils.m55697a(bgColor);
                SheetCardTitleBarFragment.m46033a(this.f29747a).setBackgroundColor(a);
                IStatusBar aVar = this.f29747a.f29741c;
                if (aVar != null) {
                    aVar.mo50688a(a, true);
                }
                String title = cardNavBarData.getTitle();
                if (title != null) {
                    SheetCardTitleBarFragment.m46033a(this.f29747a).setTitle(title);
                }
                CardNavBarItem items = cardNavBarData.getItems();
                String str = null;
                NavBarItem navBarItem = (items == null || (left = items.getLeft()) == null) ? null : (NavBarItem) C69043h.m265778d(left);
                if (navBarItem != null) {
                    str = navBarItem.getId();
                }
                if (!Intrinsics.areEqual(str, "back")) {
                    C13479a.m54758a(SheetCardTitleBarFragment.f29737e.mo42180a(), "setCardNavBar leftItem's id is not 'back'!!");
                }
                this.f29747a.mo42176a();
                CardNavBarItem items2 = cardNavBarData.getItems();
                if (!(items2 == null || (right = items2.getRight()) == null)) {
                    SheetCardTitleBarFragment aVar2 = this.f29747a;
                    for (NavBarItem navBarItem2 : right) {
                        aVar2.mo42177a(navBarItem2);
                    }
                }
                SheetCardTitleBarFragment.m46033a(this.f29747a).setActionIconTint(R.color.icon_n1);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View a = C13749l.m55744a(view, (int) R.id.card_title_bar);
        Intrinsics.checkExpressionValueIsNotNull(a, "UIUtils.findViewById(view, R.id.card_title_bar)");
        BaseTitleBar baseTitleBar = (BaseTitleBar) a;
        this.f29739a = baseTitleBar;
        if (baseTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        baseTitleBar.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        BaseTitleBar baseTitleBar2 = this.f29739a;
        if (baseTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleBar");
        }
        baseTitleBar2.setLeftClickListener(new View$OnClickListenerC11070c(this));
        C11090b.m46152e();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            this.f29741c = StatusBarManager.m55628a(activity);
        }
        IStatusBar aVar = this.f29741c;
        if (aVar != null) {
            aVar.mo50687a();
        }
        SheetCardTitleBarViewModel bVar = this.f29740b;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        bVar.getNavBar().mo5923a(this, new C11071d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.sheet_card_navbar_fragment, viewGroup, false);
    }
}
