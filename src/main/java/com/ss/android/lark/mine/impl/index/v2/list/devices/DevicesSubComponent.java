package com.ss.android.lark.mine.impl.index.v2.list.devices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.framework.larkwidget.WidgetManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.C45421b;
import com.ss.android.lark.mine.impl.index.v2.ICommonWidget;
import com.ss.android.lark.mine.impl.index.v2.list.base.BaseSubComponent;
import com.ss.android.lark.mine.impl.statistics.MineHitPoint;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\"#B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/list/base/BaseSubComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/ICommonWidget;", "mContext", "Landroid/content/Context;", "mDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$IDependency;", "(Landroid/content/Context;Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$IDependency;)V", "getMContext", "()Landroid/content/Context;", "getMDependency", "()Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$IDependency;", "mDeviceInfo", "Landroid/widget/TextView;", "getMDeviceInfo", "()Landroid/widget/TextView;", "setMDeviceInfo", "(Landroid/widget/TextView;)V", "mModel", "Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesModel;", "mViewModel", "Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesViewModel;", "sidebarType", "", "getSidebarType", "()I", "enable", "", "init", "", "initModel", "onCreate", "onShow", "reload", "Companion", "IDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DevicesSubComponent extends BaseSubComponent implements ICommonWidget {

    /* renamed from: a */
    public static final Companion f115388a = new Companion(null);

    /* renamed from: b */
    private DevicesModel f115389b;

    /* renamed from: c */
    private DevicesViewModel f115390c;

    /* renamed from: d */
    private final Context f115391d;

    /* renamed from: e */
    private final IDependency f115392e;
    @BindView(6892)
    public TextView mDeviceInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$IDependency;", "", "openDeviceManager", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesSubComponent$b */
    public interface IDependency {
        /* renamed from: a */
        void mo160818a();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: a */
    public int mo160827a() {
        return 1006;
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.list.base.ISubComponent
    /* renamed from: b */
    public boolean mo160829b() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesSubComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    public final Context mo160844g() {
        return this.f115391d;
    }

    /* renamed from: i */
    public final IDependency mo160845i() {
        return this.f115392e;
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void ba_() {
        DevicesModel devicesModel = this.f115389b;
        if (devicesModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mModel");
        }
        devicesModel.mo121985c();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void bb_() {
        DevicesModel devicesModel = this.f115389b;
        if (devicesModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mModel");
        }
        devicesModel.mo160840b();
    }

    /* renamed from: f */
    public final TextView mo160843f() {
        TextView textView = this.mDeviceInfo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceInfo");
        }
        return textView;
    }

    /* renamed from: k */
    private final void m181165k() {
        View K = mo141184K();
        if (K != null) {
            K.setOnClickListener(new C45696c(this));
        }
        DevicesViewModel aVar = this.f115390c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
        }
        aVar.getDeviceCount().mo5923a(this, new C45697d(this));
    }

    /* renamed from: j */
    private final void m181164j() {
        Context context = this.f115391d;
        if (context != null) {
            AbstractC1142af a = aj.m5366a((FragmentActivity) context).mo6005a(DevicesViewModel.class);
            Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProviders.of(mC…cesViewModel::class.java)");
            DevicesViewModel aVar = (DevicesViewModel) a;
            this.f115390c = aVar;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            }
            this.f115389b = new DevicesModel(aVar);
            WidgetManager a2 = WidgetManager.f99047e.mo141220a(this);
            DevicesModel devicesModel = this.f115389b;
            if (devicesModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mModel");
            }
            a2.mo141214a(devicesModel);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        mo141188a(LayoutInflater.from(this.f115391d).inflate(R.layout.sidebar_devices, (ViewGroup) null));
        View K = mo141184K();
        if (K == null) {
            Intrinsics.throwNpe();
        }
        ButterKnife.bind(this, K);
        m181164j();
        m181165k();
        Log.m165389i("Mine_DevicesSubComponent", "init devices sub component on " + getLifecycle().getCurrentState().name() + " is enable: " + mo160829b());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$init$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesSubComponent$c */
    public static final class C45696c extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ DevicesSubComponent f115393a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45696c(DevicesSubComponent devicesSubComponent) {
            this.f115393a = devicesSubComponent;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            C45421b.m180420a().mo133444c(this.f115393a.mo160844g());
            this.f115393a.mo160845i().mo160818a();
            MineHitPoint.m181467a("device");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesSubComponent$d */
    public static final class C45697d<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DevicesSubComponent f115394a;

        C45697d(DevicesSubComponent devicesSubComponent) {
            this.f115394a = devicesSubComponent;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            this.f115394a.mo160843f().setText(String.valueOf(num.intValue()));
        }
    }

    public DevicesSubComponent(Context context, IDependency bVar) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mDependency");
        this.f115391d = context;
        this.f115392e = bVar;
    }
}
