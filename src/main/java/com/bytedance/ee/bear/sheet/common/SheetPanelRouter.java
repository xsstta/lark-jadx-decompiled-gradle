package com.bytedance.ee.bear.sheet.common;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.sheet.borderline.C11060a;
import com.bytedance.ee.bear.sheet.filter.FilterFragment;
import com.bytedance.ee.bear.sheet.filter.SubFilterColorFragment;
import com.bytedance.ee.bear.sheet.filter.SubFilterConditionFragment;
import com.bytedance.ee.bear.sheet.filter.SubFilterValueFragment;
import com.bytedance.ee.bear.sheet.panel.oppanel.FabPanelFragment;
import com.bytedance.ee.bear.sheet.panel.p547a.C11259a;
import com.bytedance.ee.bear.sheet.panel.p547a.C11260b;
import com.bytedance.ee.bear.sheet.selectcolor.C11303a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020\u001fH\u0002J\b\u0010(\u001a\u00020\u001fH\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u00042\u0006\u0010*\u001a\u00020\u0004H\u0002J9\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010-\u001a\u00020.H\u0002¢\u0006\u0002\u0010/J\u0010\u00100\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0004H\u0002J\u0010\u00101\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u0004H\u0002J)\u00102\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0002\u0010&J\u0018\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u00132\b\u00105\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/bytedance/ee/bear/sheet/common/SheetPanelRouter;", "", "()V", "BORDER", "", "COLOR", "DEFAULT_HOST", "DEFAULT_QUERY_NAME", "DEFAULT_SCHEME", "FILTER", "FILTER_COLOR", "FILTER_CONDITION", "FILTER_VALUE", "FREEZE", "OPPANEL", "TAG", "UPLOAD_IMAGE", "forceOpen", "Landroidx/lifecycle/MutableLiveData;", "", "host", "isForceSuccess", "panelMap", "", "pathList", "", "queryParam", "scheme", "uri", "Landroid/net/Uri;", "bind", "", "curFragment", "Landroidx/fragment/app/Fragment;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerResId", "", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;)V", "clearRouter", "forceSuccess", "getNextPageName", "curPanelName", "goNextPage", "panelName", "argument", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;Landroid/os/Bundle;)V", "isLastPage", "isTransitionPage", "managePageJump", "setUri", "isForceOpen", "uriStr", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.common.c */
public final class SheetPanelRouter {

    /* renamed from: a */
    public static final SheetPanelRouter f29786a = new SheetPanelRouter();

    /* renamed from: b */
    private static final Map<String, String> f29787b = MapsKt.mapOf(TuplesKt.to("oppanel", FabPanelFragment.class.getName()), TuplesKt.to("uploadImage", C11260b.class.getName()), TuplesKt.to("color", C11303a.class.getName()), TuplesKt.to("borderLine", C11060a.class.getName()), TuplesKt.to("freezeSheet", C11259a.class.getName()), TuplesKt.to("filter", FilterFragment.class.getName()), TuplesKt.to("filterValue", SubFilterValueFragment.class.getName()), TuplesKt.to("filterColor", SubFilterColorFragment.class.getName()), TuplesKt.to("filterCondition", SubFilterConditionFragment.class.getName()));

    /* renamed from: c */
    private static final C1177w<Boolean> f29788c = new C1177w<>();

    /* renamed from: d */
    private static Uri f29789d;

    /* renamed from: e */
    private static String f29790e;

    /* renamed from: f */
    private static String f29791f;

    /* renamed from: g */
    private static List<String> f29792g = new ArrayList();

    /* renamed from: h */
    private static String f29793h;

    /* renamed from: i */
    private static boolean f29794i = true;

    private SheetPanelRouter() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.common.c$b */
    public static final class RunnableC11093b implements Runnable {

        /* renamed from: a */
        public static final RunnableC11093b f29799a = new RunnableC11093b();

        RunnableC11093b() {
        }

        public final void run() {
            SheetPanelRouter cVar = SheetPanelRouter.f29786a;
            SheetPanelRouter.f29794i = true;
            SheetPanelRouter.f29786a.mo42306a();
        }
    }

    /* renamed from: b */
    private final void m46159b() {
        C13742g.m55706a(RunnableC11093b.f29799a, 500);
    }

    /* renamed from: a */
    public final void mo42306a() {
        f29788c.mo5929b((Boolean) false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.common.c$a */
    public static final class RunnableC11091a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Fragment f29795a;

        /* renamed from: b */
        final /* synthetic */ FragmentManager f29796b;

        /* renamed from: c */
        final /* synthetic */ Integer f29797c;

        RunnableC11091a(Fragment fragment, FragmentManager fragmentManager, Integer num) {
            this.f29795a = fragment;
            this.f29796b = fragmentManager;
            this.f29797c = num;
        }

        public final void run() {
            SheetPanelRouter cVar = SheetPanelRouter.f29786a;
            SheetPanelRouter.f29788c.mo5923a(this.f29795a, new AbstractC1178x<Boolean>(this) {
                /* class com.bytedance.ee.bear.sheet.common.SheetPanelRouter.RunnableC11091a.C110921 */

                /* renamed from: a */
                final /* synthetic */ RunnableC11091a f29798a;

                {
                    this.f29798a = r1;
                }

                /* renamed from: a */
                public final void onChanged(Boolean bool) {
                    if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.f29798a.f29795a);
                        sb.append(" observed a valid uri : ");
                        SheetPanelRouter cVar = SheetPanelRouter.f29786a;
                        sb.append(SheetPanelRouter.f29789d);
                        C13479a.m54772d("SheetPanelRouter", sb.toString());
                        SheetPanelRouter.f29786a.mo42309b(this.f29798a.f29795a, this.f29798a.f29796b, this.f29798a.f29797c);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private final boolean m46157a(String str) {
        if (!f29792g.contains(str) || m46160b(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m46160b(String str) {
        return Intrinsics.areEqual((String) CollectionsKt.lastOrNull((List) f29792g), str);
    }

    /* renamed from: c */
    private final String m46161c(String str) {
        int indexOf = f29792g.indexOf(str);
        int i = indexOf + 1;
        if (indexOf == f29792g.size()) {
            return null;
        }
        return f29787b.get(f29792g.get(i));
    }

    /* renamed from: a */
    public final void mo42308a(boolean z, String str) {
        boolean z2;
        if (f29794i) {
            if (!z || TextUtils.isEmpty(str)) {
                mo42306a();
                return;
            }
            Uri parse = Uri.parse(str);
            f29789d = parse;
            if (parse != null) {
                f29790e = parse.getScheme();
                f29791f = parse.getHost();
                List<String> pathSegments = parse.getPathSegments();
                Intrinsics.checkExpressionValueIsNotNull(pathSegments, "it.pathSegments");
                f29792g = pathSegments;
                f29793h = parse.getQueryParameter("oppanelIndex");
                C1177w<Boolean> wVar = f29788c;
                if (!Intrinsics.areEqual(f29790e, "sheetpanel") || !Intrinsics.areEqual(f29791f, "client")) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                wVar.mo5929b(Boolean.valueOf(z2));
            }
        }
    }

    /* renamed from: a */
    public final void mo42307a(Fragment fragment, FragmentManager fragmentManager, Integer num) {
        Intrinsics.checkParameterIsNotNull(fragment, "curFragment");
        View view = fragment.getView();
        if (view != null) {
            view.post(new RunnableC11091a(fragment, fragmentManager, num));
        }
    }

    /* renamed from: b */
    public final void mo42309b(Fragment fragment, FragmentManager fragmentManager, Integer num) {
        FabPanelFragment fabPanelFragment;
        Object obj;
        String str;
        String str2;
        Iterator a = MapsKt.asSequence(f29787b).mo4717a();
        while (true) {
            fabPanelFragment = null;
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (Intrinsics.areEqual((String) ((Map.Entry) obj).getValue(), fragment.getClass().getName())) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (str = (String) entry.getKey()) == null) {
            str = "";
        }
        f29794i = false;
        if (Intrinsics.areEqual(str, "oppanel") && (str2 = f29793h) != null) {
            if (fragment instanceof FabPanelFragment) {
                fabPanelFragment = fragment;
            }
            FabPanelFragment fabPanelFragment2 = fabPanelFragment;
            if (fabPanelFragment2 != null) {
                fabPanelFragment2.mo43191a(str2);
            }
        }
        if (m46160b(str)) {
            m46159b();
        } else if (m46157a(str)) {
            m46156a(str, fragment, fragmentManager, num, new Bundle());
        } else if (fragment instanceof AbstractC7666d) {
            ((AbstractC7666d) fragment).onBackPressed();
        }
    }

    /* renamed from: a */
    private final void m46156a(String str, Fragment fragment, FragmentManager fragmentManager, Integer num, Bundle bundle) {
        Fragment fragment2;
        FragmentTransaction beginTransaction;
        String c = m46161c(str);
        if (c != null) {
            if (fragmentManager != null) {
                fragment2 = fragmentManager.findFragmentByTag(c);
            } else {
                fragment2 = null;
            }
            if (fragmentManager != null && (beginTransaction = fragmentManager.beginTransaction()) != null) {
                if (fragment2 != null || num == null || fragment.getContext() == null) {
                    if (fragment2 == null) {
                        Intrinsics.throwNpe();
                    }
                    beginTransaction.show(fragment2).commitAllowingStateLoss();
                    return;
                }
                C4943e.m20406a(fragment, bundle);
                Context context = fragment.getContext();
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                Fragment instantiate = Fragment.instantiate(context, c, bundle);
                int intValue = num.intValue();
                if (instantiate == null) {
                    Intrinsics.throwNpe();
                }
                beginTransaction.add(intValue, instantiate, c).commitAllowingStateLoss();
            }
        }
    }
}
