package com.bytedance.ee.bear.more.itemv2;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.middleground_permission_export.model.folder.ShareFolderUserPermission;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.C10582o;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.quoto.SingleFileQuotaConfig;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020&H\u0016J\u0012\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u001fH\u0002J\u0018\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001cH\u0002J\u001a\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u001fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/MakeCopyItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "mActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "mDisposable", "Lio/reactivex/disposables/Disposable;", "mLoadingDialog", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "getMLoadingDialog", "()Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "mLoadingDialog$delegate", "Lkotlin/Lazy;", "mRouterService", "Lcom/bytedance/ee/bear/route/RouteService;", "getMRouterService", "()Lcom/bytedance/ee/bear/route/RouteService;", "mRouterService$delegate", "mServiceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getMServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "mServiceContext$delegate", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "", "isVisible", "onClick", "", "onMakeCopySuccess", "url", "showFailedToast", "code", ShareHitPoint.f121869d, "startMakeCopy", "moreInfo", "Lcom/bytedance/ee/bear/more/export/IMoreInfo;", "title", "Companion", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class MakeCopyItemV2 extends BaseMoreItem implements ITextMoreItem {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MakeCopyItemV2.class), "mServiceContext", "getMServiceContext()Lcom/bytedance/ee/bear/service/ServiceContext;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MakeCopyItemV2.class), "mRouterService", "getMRouterService()Lcom/bytedance/ee/bear/route/RouteService;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(MakeCopyItemV2.class), "mLoadingDialog", "getMLoadingDialog()Lcom/bytedance/ee/bear/widgets/LoadingDialog;"))};
    public static final Companion Companion = new Companion(null);
    private Activity mActivity;
    public Disposable mDisposable;
    private final Lazy mLoadingDialog$delegate = LazyKt.lazy(new C10214b(this));
    private final Lazy mRouterService$delegate = LazyKt.lazy(C10215c.INSTANCE);
    private final Lazy mServiceContext$delegate = LazyKt.lazy(C10216d.INSTANCE);

    private final C10917c getMServiceContext() {
        Lazy lazy = this.mServiceContext$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (C10917c) lazy.getValue();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_copy_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    public final C11824c getMLoadingDialog() {
        Lazy lazy = this.mLoadingDialog$delegate;
        KProperty kProperty = $$delegatedProperties[2];
        return (C11824c) lazy.getValue();
    }

    public final AbstractC10740f getMRouterService() {
        Lazy lazy = this.mRouterService$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return (AbstractC10740f) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/more/itemv2/MakeCopyItemV2$Companion;", "", "()V", "TAG", "", "more_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Activity getMActivity() {
        return this.mActivity;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return CommonMoreItemId.MAKE_COPY.getId();
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_Facade_MakeCopy);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return ITextMoreItem.C10238a.m42707c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/widgets/LoadingDialog;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$b */
    static final class C10214b extends Lambda implements Function0<C11824c> {
        final /* synthetic */ MakeCopyItemV2 this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10214b(MakeCopyItemV2 makeCopyItemV2) {
            super(0);
            this.this$0 = makeCopyItemV2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11824c invoke() {
            return new C11824c(this.this$0.getMActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/route/RouteService;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$c */
    static final class C10215c extends Lambda implements Function0<AbstractC10740f> {
        public static final C10215c INSTANCE = new C10215c();

        C10215c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final AbstractC10740f invoke() {
            return (AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/service/ServiceContext;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$d */
    static final class C10216d extends Lambda implements Function0<C10917c> {
        public static final C10216d INSTANCE = new C10216d();

        C10216d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C10917c invoke() {
            return new C10917c(new C10929e());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$e */
    static final class RunnableC10217e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MakeCopyItemV2 f27596a;

        RunnableC10217e(MakeCopyItemV2 makeCopyItemV2) {
            this.f27596a = makeCopyItemV2;
        }

        public final void run() {
            this.f27596a.getMLoadingDialog().mo45304d();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public boolean isVisible() {
        IMoreInfo moreInfo;
        if (isItemInvisibleByJSMsg() || (moreInfo = getMoreInfo()) == null) {
            return false;
        }
        int e = moreInfo.mo39036e();
        C8275a aVar = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOCX");
        if (e == aVar.mo32555b()) {
            return C4211a.m17514a().mo16536a("spacekit.mobile.docx_copyfile_enable", false);
        }
        return C8275a.m34054c(moreInfo.mo39036e());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$i */
    public static final class RunnableC10221i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MakeCopyItemV2 f27604a;

        /* renamed from: b */
        final /* synthetic */ String f27605b;

        RunnableC10221i(MakeCopyItemV2 makeCopyItemV2, String str) {
            this.f27604a = makeCopyItemV2;
            this.f27605b = str;
        }

        public final void run() {
            int i;
            int i2;
            this.f27604a.getMLoadingDialog().mo45303c();
            IMoreInfo moreInfo = this.f27604a.getMoreInfo();
            if (moreInfo != null) {
                i = moreInfo.mo39036e();
            } else {
                C8275a aVar = C8275a.f22371d;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
                i = aVar.mo32555b();
            }
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            boolean z = false;
            if (i == aVar2.mo32555b() && C4211a.m17514a().mo16536a("ccm.sheet.async_make_copy", false)) {
                z = true;
            }
            if (z) {
                i2 = R.string.CreationMobile_Sheets_MakeCopying_Toast;
            } else {
                i2 = R.string.Doc_Facade_MakeCopySucceed;
            }
            UDToast.build(this.f27604a.getMActivity()).mo91637a(i2).mo91639a(R.string.CreationMobile_Doc_Facade_MakeCopySucceed_open_btn, new UDToast.OnActionClickListener(this) {
                /* class com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2.RunnableC10221i.C102221 */

                /* renamed from: a */
                final /* synthetic */ RunnableC10221i f27606a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f27606a = r1;
                }

                @Override // com.larksuite.component.universe_design.toast.UDToast.OnActionClickListener
                public void onActionClick(UDToastImpl dVar) {
                    int i;
                    String str;
                    Intrinsics.checkParameterIsNotNull(dVar, "toast");
                    this.f27606a.f27604a.getMRouterService().mo17292a(this.f27606a.f27605b);
                    BearUrl g = C6313i.m25327a().mo25399g(this.f27606a.f27605b);
                    IMoreInfo moreInfo = this.f27606a.f27604a.getMoreInfo();
                    if (moreInfo != null) {
                        i = moreInfo.mo39036e();
                    } else {
                        i = 0;
                    }
                    if (g != null) {
                        str = g.f17447b;
                    } else {
                        str = null;
                    }
                    C10196b.m42462a(i, str);
                }
            }).mo91656k();
            this.f27604a.getHost().mo39166c();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        String str;
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null) {
            return getString(R.string.Doc_Facade_MakeCopyForbidden);
        }
        boolean d = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36545d(moreInfo.mo39057x(), moreInfo.mo39041h());
        if (!isItemDisabledByJSMsg() || moreInfo.mo39036e() != 8) {
            if (!d) {
                str = this.mActivity.getString(R.string.CreationMobile_ECM_AdminDisableToast);
            } else {
                str = this.mActivity.getString(R.string.Doc_Facade_MakeCopyForbidden);
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "if (!adminCanCopy) {\n   …eCopyForbidden)\n        }");
            return str;
        }
        String string = this.mActivity.getString(R.string.Bitable_AdvancedPermission_UnableToMakeCopy);
        Intrinsics.checkExpressionValueIsNotNull(string, "mActivity.getString(R.st…mission_UnableToMakeCopy)");
        return string;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        boolean z;
        if (isItemDisabledByJSMsg() || !(getMoreInfo() instanceof DocMoreInfo)) {
            return false;
        }
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo != null) {
            DocMoreInfo aVar = (DocMoreInfo) moreInfo;
            if ((aVar.mo39010F() && aVar.mo39006B()) || !C8275a.m34054c(aVar.mo39036e())) {
                return false;
            }
            boolean d = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36545d(aVar.mo39057x(), aVar.mo39041h());
            boolean q = aVar.mo39050q();
            ShareFolderUserPermission K = aVar.mo39015K();
            if (K != null) {
                z = K.canCreateSubNode();
            } else {
                z = true;
            }
            C13479a.m54764b("MakeCopyItemV2", "adminCanCopy:" + d + ", ownerCanCopy:" + q + ',' + " hasParentPermission:" + z);
            if (!d || !q || !z) {
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.export.DocMoreInfo");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick() {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2.onClick():void");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$j */
    public static final class RunnableC10223j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MakeCopyItemV2 f27607a;

        /* renamed from: b */
        final /* synthetic */ int f27608b;

        /* renamed from: c */
        final /* synthetic */ int f27609c;

        RunnableC10223j(MakeCopyItemV2 makeCopyItemV2, int i, int i2) {
            this.f27607a = makeCopyItemV2;
            this.f27608b = i;
            this.f27609c = i2;
        }

        public final void run() {
            String str;
            int i;
            this.f27607a.getMLoadingDialog().mo45303c();
            AbstractC8149a aVar = (AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null);
            IMoreInfo moreInfo = this.f27607a.getMoreInfo();
            int i2 = this.f27608b;
            if (i2 == 4) {
                Toast.showFailureText(this.f27607a.getMActivity(), (int) R.string.Doc_Facade_OperateFailedNoPermission);
            } else if (i2 == 4007) {
                int i3 = this.f27609c;
                C8275a aVar2 = C8275a.f22375h;
                Intrinsics.checkExpressionValueIsNotNull(aVar2, "FILE");
                if (i3 == aVar2.mo32555b()) {
                    i = R.string.Doc_Facade_DriveMakeCopyCrossUnitTips;
                } else {
                    i = R.string.Doc_Facade_DocMakeCopyCrossUnitTips;
                }
                Toast.showFailureText(this.f27607a.getMActivity(), i);
            } else if (i2 == 11001) {
                al d = C4511g.m18594d();
                Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
                if (d.mo17345F()) {
                    aVar.mo31492a(this.f27607a.getMActivity());
                } else {
                    AbstractC10575k kVar = (AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null);
                    Activity mActivity = this.f27607a.getMActivity();
                    if (mActivity != null) {
                        kVar.mo40012a((FragmentActivity) mActivity, FullQuotoConfig.MAKE_COPY);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    }
                }
            } else if (i2 == 900011002) {
                AbstractC10575k kVar2 = (AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null);
                Activity mActivity2 = this.f27607a.getMActivity();
                if (mActivity2 != null) {
                    FragmentActivity fragmentActivity = (FragmentActivity) mActivity2;
                    IMoreInfo moreInfo2 = this.f27607a.getMoreInfo();
                    if (moreInfo2 != null) {
                        str = moreInfo2.mo39047n();
                    } else {
                        str = null;
                    }
                    kVar2.mo40013a(fragmentActivity, null, null, !TextUtils.isEmpty(str));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                }
            } else {
                if (((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40015a(this.f27608b) && (moreInfo instanceof DocMoreInfo)) {
                    int e = moreInfo.mo39036e();
                    C8275a aVar3 = C8275a.f22375h;
                    Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.FILE");
                    if (e == aVar3.mo32555b()) {
                        this.f27607a.mDisposable = ((AbstractC4967c) KoinJavaComponent.m268613a(AbstractC4967c.class, null, null, 6, null)).mo19648a(moreInfo.mo39041h(), "explorer").mo238001b(new Consumer<Long>(this) {
                            /* class com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2.RunnableC10223j.C102241 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC10223j f27610a;

                            {
                                this.f27610a = r1;
                            }

                            /* renamed from: a */
                            public final void accept(Long l) {
                                ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40011a(this.f27610a.f27607a.getMActivity(), SingleFileQuotaConfig.DUPLICATE, l);
                            }
                        }, new Consumer<Throwable>(this) {
                            /* class com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2.RunnableC10223j.C102252 */

                            /* renamed from: a */
                            final /* synthetic */ RunnableC10223j f27611a;

                            {
                                this.f27611a = r1;
                            }

                            /* renamed from: a */
                            public final void accept(Throwable th) {
                                C13479a.m54758a("MakeCopyItemV2", "showFailedToast pullFileSize fail: " + th);
                                ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40011a(this.f27611a.f27607a.getMActivity(), SingleFileQuotaConfig.DUPLICATE, 0L);
                            }
                        });
                    }
                }
                int i4 = this.f27608b;
                if (i4 == 4000080) {
                    Toast.showFailureText(this.f27607a.getMActivity(), (int) R.string.CreationMobile_Docs_duplicate_inProgress_toast);
                } else if (i4 == 4202) {
                    Toast.showFailureText(this.f27607a.getMActivity(), (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
                } else {
                    Toast.showFailureText(this.f27607a.getMActivity(), (int) R.string.Doc_Facade_OperateFailed);
                }
            }
            this.f27607a.getHost().mo39166c();
        }
    }

    public final void setMActivity(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "<set-?>");
        this.mActivity = activity;
    }

    public final void onMakeCopySuccess(String str) {
        C13748k.m55732a(new RunnableC10221i(this, str));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/quoto/SingleFileCheckResult;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Long;)Lio/reactivex/Flowable;"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$f */
    static final class C10218f<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        public static final C10218f f27597a = new C10218f();

        C10218f() {
        }

        /* renamed from: a */
        public final AbstractC68307f<C10582o> apply(Long l) {
            Intrinsics.checkParameterIsNotNull(l, "it");
            return ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40010a(l);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$h */
    static final class C10220h<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ MakeCopyItemV2 f27601a;

        /* renamed from: b */
        final /* synthetic */ IMoreInfo f27602b;

        /* renamed from: c */
        final /* synthetic */ String f27603c;

        C10220h(MakeCopyItemV2 makeCopyItemV2, IMoreInfo dVar, String str) {
            this.f27601a = makeCopyItemV2;
            this.f27602b = dVar;
            this.f27603c = str;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54758a("MakeCopyItemV2", "showFailedToast pullFileSize fail: " + th);
            this.f27601a.startMakeCopy(this.f27602b, this.f27603c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/quoto/SingleFileCheckResult;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.more.itemv2.MakeCopyItemV2$g */
    static final class C10219g<T> implements Consumer<C10582o> {

        /* renamed from: a */
        final /* synthetic */ MakeCopyItemV2 f27598a;

        /* renamed from: b */
        final /* synthetic */ IMoreInfo f27599b;

        /* renamed from: c */
        final /* synthetic */ String f27600c;

        C10219g(MakeCopyItemV2 makeCopyItemV2, IMoreInfo dVar, String str) {
            this.f27598a = makeCopyItemV2;
            this.f27599b = dVar;
            this.f27600c = str;
        }

        /* renamed from: a */
        public final void accept(C10582o oVar) {
            if (oVar.f28368a) {
                ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40011a(this.f27598a.getMActivity(), SingleFileQuotaConfig.DUPLICATE, oVar.f28369b);
                this.f27598a.getMLoadingDialog().mo45303c();
                this.f27598a.getHost().mo39166c();
                return;
            }
            this.f27598a.startMakeCopy(this.f27599b, this.f27600c);
        }
    }

    public MakeCopyItemV2(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mActivity");
        this.mActivity = activity;
    }

    public final void showFailedToast(int i, int i2) {
        C13748k.m55732a(new RunnableC10223j(this, i, i2));
    }

    public final void startMakeCopy(IMoreInfo dVar, String str) {
        ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31499a(dVar.mo39041h(), dVar.mo39036e(), dVar.mo39038f(), dVar.mo39047n(), str, "", "innerpage_more", dVar.mo39031c(), new MakeCopyItemV2$startMakeCopy$1(this, dVar));
    }
}
