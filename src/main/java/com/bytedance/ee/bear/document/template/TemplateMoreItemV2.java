package com.bytedance.ee.bear.document.template;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.more.AbstractC10194a;
import com.bytedance.ee.bear.more.export.DocMoreInfo;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.WikiMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.component.universe_design.toast.UDToastImpl;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.am;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/document/template/TemplateMoreItemV2;", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "Lcom/bytedance/ee/bear/more/moreprotocol/ITextMoreItem;", "activity", "Landroid/app/Activity;", "pluginHost", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "(Landroid/app/Activity;Lcom/bytedance/ee/bear/document/DocumentPluginHost;)V", "getIcon", "", "getIconTint", "getId", "", "getTitle", "getUnableTips", "isEnable", "", "isVisible", "needShowBadge", "onClick", "", "reportEnterCustomTmplCenter", "reportSaveAsCustomTmpl", "onlyClick", "saveToCustomTemplate", "templateName", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplateMoreItemV2 extends BaseMoreItem implements ITextMoreItem {
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> sSupportDocumentTypes;
    public final Activity activity;
    public final C6095s pluginHost;

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIcon() {
        return R.drawable.ud_icon_template_outlined;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public int getIconTint() {
        return R.color.icon_n1;
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    public String getId() {
        return "template";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/template/TemplateMoreItemV2$Companion;", "", "()V", "NAME", "", "TAG", "sSupportDocumentTypes", "", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.template.TemplateMoreItemV2$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.IIconFontMoreItem
    public String getTitle() {
        return getString(R.string.Doc_List_SaveAsTmpl);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean needShowBadge() {
        return new PersistenceSharedPreference("TemplateMoreItem").getBoolean("TemplateMoreItem", true);
    }

    public final void reportEnterCustomTmplCenter() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ShareHitPoint.f121868c, (Object) "from_saveas_customtempl");
        C5234y.m21391b().mo21079a("enter_template_center", jSONObject);
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public boolean isEnable() {
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null || !((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36545d(moreInfo.mo39036e(), moreInfo.mo39041h()) || isItemDisabledByJSMsg()) {
            return false;
        }
        return moreInfo.mo39050q();
    }

    static {
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        C8275a aVar2 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
        C8275a aVar3 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
        C8275a aVar4 = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.DOCX");
        sSupportDocumentTypes = am.m265689a((Object[]) new Integer[]{Integer.valueOf(aVar.mo32555b()), Integer.valueOf(aVar2.mo32555b()), Integer.valueOf(aVar3.mo32555b()), 8, Integer.valueOf(aVar4.mo32555b())});
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public String getUnableTips() {
        IMoreInfo moreInfo;
        IMoreInfo moreInfo2 = getMoreInfo();
        if (moreInfo2 == null) {
            String string = this.activity.getString(R.string.Doc_List_SaveCustomTemplFailed);
            Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.str…st_SaveCustomTemplFailed)");
            return string;
        } else if (isItemDisabledByJSMsg() && (moreInfo = getMoreInfo()) != null && moreInfo.mo39036e() == 8) {
            String string2 = this.activity.getString(R.string.Bitable_AdvancedPermission_UnableToSaveAsTemplate);
            Intrinsics.checkExpressionValueIsNotNull(string2, "activity.getString(R.str…n_UnableToSaveAsTemplate)");
            return string2;
        } else if (!((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36545d(moreInfo2.mo39036e(), moreInfo2.mo39041h())) {
            String string3 = this.activity.getString(R.string.CreationMobile_ECM_AdminDisableToast);
            Intrinsics.checkExpressionValueIsNotNull(string3, "activity.getString(R.str…le_ECM_AdminDisableToast)");
            return string3;
        } else {
            String string4 = this.activity.getString(R.string.Doc_List_SaveCustomTemplFailed);
            Intrinsics.checkExpressionValueIsNotNull(string4, "activity.getString(R.str…st_SaveCustomTemplFailed)");
            return string4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00da A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isVisible() {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.document.template.TemplateMoreItemV2.isVisible():boolean");
    }

    @Override // com.bytedance.ee.bear.more.moreprotocol.ITextMoreItem
    public void onClick() {
        String str;
        new PersistenceSharedPreference("TemplateMoreItem").mo34037a("TemplateMoreItem", false);
        getHost().mo39166c();
        BearUDInputDialogBuilder b = ((BearUDInputDialogBuilder) new BearUDInputDialogBuilder(this.activity).title(R.string.Doc_List_SaveAsTmpl)).mo45395b(R.string.Doc_More_RenameSheetPlaceholder);
        IMoreInfo moreInfo = getMoreInfo();
        if (moreInfo == null || (str = moreInfo.mo39042i()) == null) {
            str = "";
        }
        b.mo45397b(str).mo45399c(R.string.Doc_Facade_Save).mo45391a(new C6159b(this)).mo45402d(R.string.Doc_Facade_Cancel).mo45393a(true).show();
        if (getMoreInfo() instanceof DocMoreInfo) {
            IMoreInfo moreInfo2 = getMoreInfo();
            if (moreInfo2 != null) {
                DocMoreInfo aVar = (DocMoreInfo) moreInfo2;
                ((AbstractC10194a) KoinJavaComponent.m268613a(AbstractC10194a.class, null, null, 6, null)).mo38968a(getHost().mo39165b().getArguments(), aVar.mo39041h(), aVar.mo39036e(), aVar.mo39009E(), aVar.mo39038f(), "save_as_template", "ccm_template_usercenter_view", "", "", "", aVar instanceof WikiMoreInfo, aVar.mo39008D());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.more.export.DocMoreInfo");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/template/TemplateMoreItemV2$onClick$1", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "onClick", "", "text", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.template.TemplateMoreItemV2$b */
    public static final class C6159b implements BearUDInputDialogBuilder.OnBtnClickListener {

        /* renamed from: a */
        final /* synthetic */ TemplateMoreItemV2 f17170a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6159b(TemplateMoreItemV2 templateMoreItemV2) {
            this.f17170a = templateMoreItemV2;
        }

        @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
        public void onClick(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            this.f17170a.saveToCustomTemplate(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "json", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.template.TemplateMoreItemV2$c */
    public static final class C6160c<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<NetService.Result<Serializable>> {

        /* renamed from: a */
        public static final C6160c f17171a = new C6160c();

        C6160c() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public final NetService.Result<Serializable> parse(String str) {
            return new NetService.Result<>();
        }
    }

    public final void reportSaveAsCustomTmpl(boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "click_save_as";
        } else {
            str = "save";
        }
        jSONObject.put("action", (Object) str);
        C5234y.m21391b().mo21079a("management_template_by_user", jSONObject);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.template.TemplateMoreItemV2$d */
    public static final class C6161d<T> implements Consumer<NetService.Result<Serializable>> {

        /* renamed from: a */
        final /* synthetic */ TemplateMoreItemV2 f17172a;

        C6161d(TemplateMoreItemV2 templateMoreItemV2) {
            this.f17172a = templateMoreItemV2;
        }

        /* renamed from: a */
        public final void accept(NetService.Result<Serializable> result) {
            C13479a.m54764b("TemplateMoreItem", "saveToCustomTemplate success");
            this.f17172a.reportSaveAsCustomTmpl(false);
            UDToast.build(this.f17172a.activity).mo91637a(R.string.Doc_List_SaveCustomTemplSuccess).mo91647b(R.drawable.icon_template_ok).mo91639a(R.string.Doc_List_GoCheckCustomTempl, new UDToast.OnActionClickListener(this) {
                /* class com.bytedance.ee.bear.document.template.TemplateMoreItemV2.C6161d.C61621 */

                /* renamed from: a */
                final /* synthetic */ C6161d f17173a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f17173a = r1;
                }

                @Override // com.larksuite.component.universe_design.toast.UDToast.OnActionClickListener
                public void onActionClick(UDToastImpl dVar) {
                    Intrinsics.checkParameterIsNotNull(dVar, "toast");
                    this.f17173a.f17172a.reportEnterCustomTmplCenter();
                    ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17295b("/list/template4/activity").mo17314a("openTemplateCenter", "custom").mo17309a("templateCategory", 5L).mo17317a();
                }
            }).mo91656k();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.template.TemplateMoreItemV2$e */
    public static final class C6163e<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ TemplateMoreItemV2 f17174a;

        C6163e(TemplateMoreItemV2 templateMoreItemV2) {
            this.f17174a = templateMoreItemV2;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Throwable th2;
            int i;
            if (!(th instanceof NetService.ServerErrorException)) {
                th2 = null;
            } else {
                th2 = th;
            }
            NetService.ServerErrorException serverErrorException = (NetService.ServerErrorException) th2;
            if (serverErrorException != null) {
                i = serverErrorException.getCode();
            } else {
                i = -1;
            }
            if (i == 11001) {
                ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40012a(this.f17174a.pluginHost.mo19564f(), FullQuotoConfig.SAVE_TO_TEMPLATE);
            } else if (i == 4000080) {
                Toast.showFailureText(C13615c.f35773a, (int) R.string.CreationMobile_Docs_duplicate_inProgress_toast);
            } else if (i != 900011002) {
                Toast.showFailureText(C13615c.f35773a, (int) R.string.Drive_Drive_LikeFail);
            } else {
                ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40013a(this.f17174a.pluginHost.mo19564f(), null, null, false);
            }
            C13479a.m54761a("TemplateMoreItem", th);
        }
    }

    public final void saveToCustomTemplate(String str) {
        if (str != null) {
            reportSaveAsCustomTmpl(true);
            int documentTypeValue = this.pluginHost.mo24598m().getDocumentTypeValue();
            String token = this.pluginHost.mo24598m().getToken();
            Intrinsics.checkExpressionValueIsNotNull(token, "pluginHost.docViewModel.token");
            NetService.C5077f fVar = new NetService.C5077f("/api/obj_template/create/");
            fVar.mo20143a(1);
            fVar.mo20145a("obj_type", String.valueOf(documentTypeValue));
            fVar.mo20145a("obj_token", token);
            fVar.mo20145a("obj_template_name", str);
            ((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).mo20117a(C6160c.f17171a).mo20141a(fVar).mo238001b(new C6161d(this), new C6163e(this));
        }
    }

    public TemplateMoreItemV2(Activity activity2, C6095s sVar) {
        Intrinsics.checkParameterIsNotNull(activity2, "activity");
        Intrinsics.checkParameterIsNotNull(sVar, "pluginHost");
        this.activity = activity2;
        this.pluginHost = sVar;
    }
}
