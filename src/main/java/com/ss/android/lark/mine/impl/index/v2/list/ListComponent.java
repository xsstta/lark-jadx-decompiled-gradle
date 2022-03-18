package com.ss.android.lark.mine.impl.index.v2.list;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import com.ss.android.lark.framework.larkwidget.Widget;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mine.impl.index.v2.ICommonWidget;
import com.ss.android.lark.mine.impl.index.v2.IComponent;
import com.ss.android.lark.mine.impl.index.v2.container.HostViewModel;
import com.ss.android.lark.mine.impl.index.v2.list.admin.AdminSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.favourite.FavouriteSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.feishu_event.FeishuEventSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.index.IndexSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent;
import com.ss.android.lark.mine.impl.index.v2.list.wallet.WalletSubComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0019\u001aB%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lcom/ss/android/lark/mine/impl/index/v2/IComponent;", "Lcom/ss/android/lark/mine/impl/index/v2/ICommonWidget;", "mContext", "Landroid/app/Activity;", "mHostVM", "Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;", "mContainer", "Landroid/widget/LinearLayout;", "mListDependency", "Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent$IListDependency;", "(Landroid/app/Activity;Lcom/ss/android/lark/mine/impl/index/v2/container/HostViewModel;Landroid/widget/LinearLayout;Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent$IListDependency;)V", "getMContext", "()Landroid/app/Activity;", "mSubComponentManager", "Lcom/ss/android/lark/mine/impl/index/v2/list/SubComponentManager;", "getComponentType", "", "onCreate", "", "onDestroy", "onShow", "onStart", "reload", "Companion", "IListDependency", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListComponent extends Widget implements IComponent, ICommonWidget {

    /* renamed from: b */
    public static final Companion f115340b = new Companion(null);

    /* renamed from: a */
    public final IListDependency f115341a;

    /* renamed from: c */
    private SubComponentManager f115342c;

    /* renamed from: d */
    private final Activity f115343d;

    /* renamed from: e */
    private final HostViewModel f115344e;

    /* renamed from: f */
    private final LinearLayout f115345f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent$IListDependency;", "", "onGotoOtherPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$b */
    public interface IListDependency {
        /* renamed from: a */
        void mo160808a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mine/impl/index/v2/list/ListComponent$Companion;", "", "()V", "TAG", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$1", "Lcom/ss/android/lark/mine/impl/index/v2/list/index/IndexSubComponent$IDependency;", "onOpenMineIndex", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$c */
    public static final class C45677c implements IndexSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115346a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.index.IndexSubComponent.IDependency
        /* renamed from: a */
        public void mo160812a() {
            this.f115346a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45677c(ListComponent listComponent) {
            this.f115346a = listComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$3", "Lcom/ss/android/lark/mine/impl/index/v2/list/favourite/FavouriteSubComponent$IDependency;", "openFavourite", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$e */
    public static final class C45679e implements FavouriteSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115348a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.favourite.FavouriteSubComponent.IDependency
        /* renamed from: a */
        public void mo160814a() {
            this.f115348a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45679e(ListComponent listComponent) {
            this.f115348a = listComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$4", "Lcom/ss/android/lark/mine/impl/index/v2/list/admin/AdminSubComponent$IDependency;", "openUrlLink", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$f */
    public static final class C45680f implements AdminSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115349a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.admin.AdminSubComponent.IDependency
        /* renamed from: a */
        public void mo160815a() {
            this.f115349a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45680f(ListComponent listComponent) {
            this.f115349a = listComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$5", "Lcom/ss/android/lark/mine/impl/index/v2/list/join_team/JoinTeamSubComponent$IDependency;", "openJoinTeamPage", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$g */
    public static final class C45681g implements JoinTeamSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115350a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.join_team.JoinTeamSubComponent.IDependency
        /* renamed from: a */
        public void mo160816a() {
            this.f115350a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45681g(ListComponent listComponent) {
            this.f115350a = listComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$6", "Lcom/ss/android/lark/mine/impl/index/v2/list/contact_us/FeedHelpSubComponent$IDependency;", "openCustomServiceChat", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$h */
    public static final class C45682h implements FeedHelpSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115351a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.contact_us.FeedHelpSubComponent.IDependency
        /* renamed from: a */
        public void mo160817a() {
            this.f115351a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45682h(ListComponent listComponent) {
            this.f115351a = listComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$7", "Lcom/ss/android/lark/mine/impl/index/v2/list/devices/DevicesSubComponent$IDependency;", "openDeviceManager", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$i */
    public static final class C45683i implements DevicesSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115352a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.devices.DevicesSubComponent.IDependency
        /* renamed from: a */
        public void mo160818a() {
            this.f115352a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45683i(ListComponent listComponent) {
            this.f115352a = listComponent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$8", "Lcom/ss/android/lark/mine/impl/index/v2/list/setting/SettingSubComponent$IDependency;", "openSettings", "", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$j */
    public static final class C45684j implements SettingSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115353a;

        @Override // com.ss.android.lark.mine.impl.index.v2.list.setting.SettingSubComponent.IDependency
        /* renamed from: a */
        public void mo160819a() {
            this.f115353a.f115341a.mo160808a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45684j(ListComponent listComponent) {
            this.f115353a = listComponent;
        }
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void ba_() {
        SubComponentManager aVar = this.f115342c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar.mo160824c();
    }

    @Override // com.ss.android.lark.mine.impl.index.v2.ICommonWidget
    public void bb_() {
        SubComponentManager aVar = this.f115342c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar.mo160825d();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: r */
    public void mo122001r() {
        super.mo122001r();
        SubComponentManager aVar = this.f115342c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar.mo160823b();
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: A */
    public void mo123661A() {
        super.mo123661A();
        SubComponentManager aVar = this.f115342c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar.mo160820a();
        Log.m165389i("Mine_ListComponent", "init list component on " + getLifecycle().getCurrentState().name());
    }

    @Override // com.ss.android.lark.framework.larkwidget.Widget
    /* renamed from: e */
    public void mo121987e() {
        super.mo121987e();
        SubComponentManager aVar = new SubComponentManager(this, this.f115345f);
        this.f115342c = aVar;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar.mo160822a(new IndexSubComponent(this.f115343d, new C45677c(this)));
        SubComponentManager aVar2 = this.f115342c;
        if (aVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar2.mo160822a(new FeishuEventSubComponent(this.f115343d));
        SubComponentManager aVar3 = this.f115342c;
        if (aVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar3.mo160822a(new WalletSubComponent(this.f115343d, new C45678d(this)));
        SubComponentManager aVar4 = this.f115342c;
        if (aVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar4.mo160822a(new FavouriteSubComponent(this.f115343d, new C45679e(this)));
        SubComponentManager aVar5 = this.f115342c;
        if (aVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar5.mo160822a(new AdminSubComponent(this.f115343d, this.f115344e, new C45680f(this)));
        SubComponentManager aVar6 = this.f115342c;
        if (aVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar6.mo160822a(new JoinTeamSubComponent(this.f115343d, this.f115344e, new C45681g(this)));
        SubComponentManager aVar7 = this.f115342c;
        if (aVar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar7.mo160822a(new FeedHelpSubComponent(this.f115343d, new C45682h(this)));
        SubComponentManager aVar8 = this.f115342c;
        if (aVar8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar8.mo160822a(new DevicesSubComponent(this.f115343d, new C45683i(this)));
        SubComponentManager aVar9 = this.f115342c;
        if (aVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSubComponentManager");
        }
        aVar9.mo160822a(new SettingSubComponent(this.f115343d, new C45684j(this)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mine/impl/index/v2/list/ListComponent$onCreate$2", "Lcom/ss/android/lark/mine/impl/index/v2/list/wallet/WalletSubComponent$IDependency;", "openWallet", "", "context", "Landroid/content/Context;", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mine.impl.index.v2.list.ListComponent$d */
    public static final class C45678d implements WalletSubComponent.IDependency {

        /* renamed from: a */
        final /* synthetic */ ListComponent f115347a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45678d(ListComponent listComponent) {
            this.f115347a = listComponent;
        }

        @Override // com.ss.android.lark.mine.impl.index.v2.list.wallet.WalletSubComponent.IDependency
        /* renamed from: a */
        public void mo160813a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f115347a.f115341a.mo160808a();
        }
    }

    public ListComponent(Activity activity, HostViewModel aVar, LinearLayout linearLayout, IListDependency bVar) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        Intrinsics.checkParameterIsNotNull(aVar, "mHostVM");
        Intrinsics.checkParameterIsNotNull(linearLayout, "mContainer");
        Intrinsics.checkParameterIsNotNull(bVar, "mListDependency");
        this.f115343d = activity;
        this.f115344e = aVar;
        this.f115345f = linearLayout;
        this.f115341a = bVar;
    }
}
