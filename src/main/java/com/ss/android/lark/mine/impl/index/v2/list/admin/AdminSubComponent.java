package com.ss.android.lark.mine.impl.index.v2.list.admin;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.ui.list.iconitem.IconItemModel;
import com.larksuite.component.ui.list.iconitem.IconItemView;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.dto.SidebarInfo;
import com.ss.android.lark.mine.impl.index.v2.container.HostViewModel;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseAsyncSubComponent;
import com.ss.android.lark.mine.p2270a.AbstractC45399a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseAsyncSubComponent;", "mContext", "Landroid/content/Context;", "mHostVM", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$IDependency;)V", "mAdminSidebarInfo", "Lcom/ss/android/lark/mine/dto/SidebarInfo;", "getMContext", "()Landroid/content/Context;", "getMDependency", "()Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$IDependency;", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "newItemView", "Lcom/larksuite/component/ui/list/iconitem/IconItemView;", "uri", "", "onCreate", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AdminSubComponent extends BaseAsyncSubComponent {

    /* renamed from: b */
    public static final Companion f115363b = new Companion(null);

    /* renamed from: a */
    public SidebarInfo f115364a;

    /* renamed from: c */
    private final Context f115365c;

    /* renamed from: d */
    private final HostViewModel f115366d;

    /* renamed from: e */
    private final IDependency f115367e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$IDependency;", "", "openUrlLink", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.admin.AdminSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160815a();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$Companion;", "", "()V", "ICON_WIDTH", "", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.admin.AdminSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final Context mo121985c() {
        return this.f115365c;
    }

    /* renamed from: f */
    public final IDependency mo160830f() {
        return this.f115367e;
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        m181121i();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        SidebarInfo fVar = this.f115364a;
        if (fVar == null) {
            return false;
        }
        if (fVar == null) {
            Intrinsics.throwNpe();
        }
        return fVar.mo160307b();
    }

    /* renamed from: i */
    private final void m181121i() {
        AbstractC45399a a = C45421b.m180420a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
        a.mo133456o().mo133485a();
        this.f115366d.getSidebarInfoList().mo5923a(this, new C45686c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$newItemView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.admin.AdminSubComponent$d */
    public static final class View$OnClickListenerC45687d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AdminSubComponent f115369a;

        /* renamed from: b */
        final /* synthetic */ String f115370b;

        View$OnClickListenerC45687d(AdminSubComponent adminSubComponent, String str) {
            this.f115369a = adminSubComponent;
            this.f115370b = str;
        }

        public final void onClick(View view) {
            AbstractC45399a a = C45421b.m180420a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MineModule.getDependency()");
            a.mo133465x().mo133474a(this.f115370b, this.f115369a.mo121985c());
            this.f115369a.mo160830f().mo160815a();
        }
    }

    /* renamed from: a */
    public final IconItemView mo160828a(String str) {
        IconItemView iconItemView = new IconItemView(this.f115365c);
        iconItemView.setOnClickListener(new View$OnClickListenerC45687d(this, str));
        iconItemView.setBackgroundResource(R.drawable.item_bg_selector_c11);
        if (DesktopUtil.m144307b()) {
            iconItemView.mo89823a(R.style.IconItemDesktop);
        } else {
            iconItemView.mo89823a(R.style.IconItemMine);
        }
        return iconItemView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/ss/android/lark/mine/dto/SidebarInfo;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.admin.AdminSubComponent$c */
    public static final class C45686c<T> implements AbstractC1178x<List<SidebarInfo>> {

        /* renamed from: a */
        final /* synthetic */ AdminSubComponent f115368a;

        C45686c(AdminSubComponent adminSubComponent) {
            this.f115368a = adminSubComponent;
        }

        /* renamed from: a */
        public final void onChanged(List<SidebarInfo> list) {
            float f;
            boolean z;
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                if (!t.mo160307b() || TextUtils.isEmpty(t.mo160306a())) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                AdminSubComponent adminSubComponent = this.f115368a;
                ArrayList arrayList3 = new ArrayList();
                for (T t2 : arrayList2) {
                    if (this.f115368a.mo160827a() == SidebarInfo.f115020c.mo160311a()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList3.add(t2);
                    }
                }
                adminSubComponent.f115364a = (SidebarInfo) arrayList3.get(0);
                AdminSubComponent adminSubComponent2 = this.f115368a;
                SidebarInfo fVar = adminSubComponent2.f115364a;
                String a = fVar != null ? fVar.mo160306a() : null;
                if (a == null) {
                    Intrinsics.throwNpe();
                }
                IconItemView a2 = adminSubComponent2.mo160828a(a);
                Drawable iconDrawable = UDIconUtils.getIconDrawable(this.f115368a.mo121985c(), (int) R.drawable.ud_icon_admin_outlined, new UDDimension.Dp(20));
                if (iconDrawable != null) {
                    iconDrawable.mutate();
                }
                if (iconDrawable != null) {
                    iconDrawable.setTint(ContextCompat.getColor(this.f115368a.mo121985c(), R.color.ud_B500));
                }
                String string = this.f115368a.mo121985c().getString(R.string.Lark_Profile_SuiteAdminEntry);
                Context c = this.f115368a.mo121985c();
                if (DesktopUtil.m144307b()) {
                    f = 12.0f;
                } else {
                    f = 10.0f;
                }
                a2.mo89824a(new IconItemModel(iconDrawable, string, null, Integer.valueOf((int) C25653b.m91892a(c, f))));
                this.f115368a.mo141188a((View) a2);
                this.f115368a.mo160835g();
                Log.m165389i("Mine_AdminSubComponent", "init admin sub component on " + this.f115368a.getLifecycle().getCurrentState().name() + " is enable: " + this.f115368a.mo160829b());
            }
        }
    }

    public AdminSubComponent(Context context, HostViewModel aVar, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mHostVM");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f115365c = context;
        this.f115366d = aVar;
        this.f115367e = bVar;
    }
}
