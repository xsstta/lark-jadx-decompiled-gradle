package com.bytedance.ee.bear.templates;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DefaultDocPublicPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.doc.DocPermission;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10159e;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.templates.center.TemplateCenterViewModel;
import com.bytedance.ee.bear.templates.center.list.Category;
import com.bytedance.ee.bear.templates.center.list.CategoryTab;
import com.bytedance.ee.bear.templates.preview.data.CommonPreviewTemplateData;
import com.bytedance.ee.bear.templates.preview.data.Item;
import com.bytedance.ee.bear.widgets.C11811a;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002J*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0004JH\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/templates/TemplateUtils;", "", "()V", "TAG", "", "deleteCustomTemplate", "", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "objType", "", "objToken", "deleteSuccessListener", "Lkotlin/Function0;", "handlePreviewTemplate", "template", "Lcom/bytedance/ee/bear/templates/TemplateV4;", "templateCenterViewModel", "Lcom/bytedance/ee/bear/templates/center/TemplateCenterViewModel;", "category", "Lcom/bytedance/ee/bear/templates/center/list/CategoryTab;", "templateCenterSource", "showBottomActionSheet", "context", "Landroid/content/Context;", "shareClickListener", "deleteClickListener", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.g */
public final class TemplateUtils {

    /* renamed from: a */
    public static final TemplateUtils f31021a = new TemplateUtils();

    private TemplateUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "json", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.g$a */
    public static final class C11518a<T extends NetService.Result<Serializable>> implements NetService.AbstractC5074c<NetService.Result<Serializable>> {

        /* renamed from: a */
        public static final C11518a f31022a = new C11518a();

        C11518a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public final NetService.Result<Serializable> parse(String str) {
            return new NetService.Result<>();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/io/Serializable;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.g$b */
    public static final class C11519b<T> implements Consumer<NetService.Result<Serializable>> {

        /* renamed from: a */
        final /* synthetic */ Function0 f31023a;

        C11519b(Function0 function0) {
            this.f31023a = function0;
        }

        /* renamed from: a */
        public final void accept(NetService.Result<Serializable> result) {
            TemplateReport.f31011b.mo44231b("delete");
            Toast.showSuccessText(C13615c.f35773a, C13615c.f35773a.getText(R.string.Doc_Facade_DeleteSuccess));
            this.f31023a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.g$c */
    public static final class C11520c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C11520c f31024a = new C11520c();

        C11520c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54761a("TemplateUtils", th);
            Toast.showFailureText(C13615c.f35773a, C13615c.f35773a.getText(R.string.Doc_Facade_DeleteFailedNoNet));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.g$e */
    public static final class View$OnClickListenerC11522e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f31029a;

        /* renamed from: b */
        final /* synthetic */ Function0 f31030b;

        /* renamed from: c */
        final /* synthetic */ int f31031c;

        /* renamed from: d */
        final /* synthetic */ String f31032d;

        /* renamed from: e */
        final /* synthetic */ Function0 f31033e;

        View$OnClickListenerC11522e(Context context, Function0 function0, int i, String str, Function0 function02) {
            this.f31029a = context;
            this.f31030b = function0;
            this.f31031c = i;
            this.f31032d = str;
            this.f31033e = function02;
        }

        public final void onClick(View view) {
            new BearUDDialogBuilder(this.f31029a).mo45344a(R.string.Doc_List_CustomTemplateDeleteTitle).mo45362d(R.string.Doc_List_CustomTemplateDelete).mo45345a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_Delete, R.color.function_danger_500, new DialogInterface.OnClickListener(this) {
                /* class com.bytedance.ee.bear.templates.TemplateUtils.View$OnClickListenerC11522e.DialogInterface$OnClickListenerC115231 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC11522e f31034a;

                {
                    this.f31034a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f31034a.f31030b.invoke();
                    TemplateUtils.f31021a.mo44263a((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null), this.f31034a.f31031c, this.f31034a.f31032d, this.f31034a.f31033e);
                }
            }).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45355a().show();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/templates/TemplateUtils$showBottomActionSheet$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.g$d */
    public static final class View$OnClickListenerC11521d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f31025a;

        /* renamed from: b */
        final /* synthetic */ Context f31026b;

        /* renamed from: c */
        final /* synthetic */ String f31027c;

        /* renamed from: d */
        final /* synthetic */ Function0 f31028d;

        View$OnClickListenerC11521d(int i, Context context, String str, Function0 function0) {
            this.f31025a = i;
            this.f31026b = context;
            this.f31027c = str;
            this.f31028d = function0;
        }

        public final void onClick(View view) {
            DocPermSetInfo docPermSetInfo = new DocPermSetInfo(null, this.f31025a, this.f31027c, false, null, new DocPermission(new TemplateUtils$showBottomActionSheet$$inlined$also$lambda$1$1(), new DefaultDocPublicPermission()), null, false, false, false, 985, null);
            AbstractC10159e b = ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b();
            Context context = this.f31026b;
            if (context != null) {
                b.mo36671a((FragmentActivity) context, docPermSetInfo, new ArrayList<>(), "template", false);
                this.f31028d.invoke();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        }
    }

    /* renamed from: a */
    public final void mo44263a(NetService netService, int i, String str, Function0<Unit> function0) {
        TemplateReport.f31011b.mo44231b("click_delete");
        NetService.C5077f fVar = new NetService.C5077f("/space/api/obj_template/delete/");
        fVar.mo20143a(1);
        fVar.mo20145a("obj_type", String.valueOf(i));
        fVar.mo20145a("obj_token", str);
        netService.mo20117a(C11518a.f31022a).mo20141a(fVar).mo238001b(new C11519b(function0), C11520c.f31024a);
    }

    /* renamed from: a */
    public final void mo44264a(TemplateV4 templateV4, TemplateCenterViewModel hVar, CategoryTab categoryTab, String str) {
        int i;
        List<Category> categoryList;
        Intrinsics.checkParameterIsNotNull(templateV4, "template");
        Intrinsics.checkParameterIsNotNull(hVar, "templateCenterViewModel");
        Intrinsics.checkParameterIsNotNull(str, "templateCenterSource");
        StringBuilder sb = new StringBuilder();
        C6313i a = C6313i.m25327a();
        C8275a b = C8275a.m34052b(templateV4.getObjType());
        Intrinsics.checkExpressionValueIsNotNull(b, "DocumentType.getDocumentType(template.objType)");
        sb.append(a.mo25382a(b.mo32553a(), templateV4.getObjToken(), ""));
        sb.append("?from=template_preview&template_preview_source=");
        sb.append(hVar.getCurrentTabTag());
        String sb2 = sb.toString();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (categoryTab == null || (categoryList = categoryTab.getCategoryList()) == null) {
            i = 0;
        } else {
            Iterator<T> it = categoryList.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                for (T t : it.next().getTemplates()) {
                    if (!t.isSceneTemplate() && !TextUtils.isEmpty(t.getObjToken())) {
                        arrayList.add(new Item(t.getObjToken(), t.getName(), t.getObjType(), t.getSource(), i3));
                        if (templateV4 == t) {
                            i2 = i3;
                        }
                        i3++;
                    }
                }
            }
            i = i2;
        }
        CommonPreviewTemplateData commonPreviewTemplateData = new CommonPreviewTemplateData(TemplateReportV2.f31015b.mo44235a(), str, TemplateReportV2.f31015b.mo44245b(), hVar.getCurrentTabTag(), hVar.getParentToken(), hVar.getModule(), i, arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String jSONString = JSON.toJSONString(commonPreviewTemplateData);
        Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSON.toJSONString(commonPreviewTemplateData)");
        linkedHashMap.put("template_preview_list", jSONString);
        RouteBean routeBean = new RouteBean();
        routeBean.mo40620g(1);
        routeBean.mo40612a(linkedHashMap);
        ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17293a(sb2, routeBean);
    }

    /* renamed from: a */
    public final void mo44262a(Context context, int i, String str, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "objToken");
        Intrinsics.checkParameterIsNotNull(function0, "shareClickListener");
        Intrinsics.checkParameterIsNotNull(function02, "deleteClickListener");
        Intrinsics.checkParameterIsNotNull(function03, "deleteSuccessListener");
        C11811a a = C11811a.m48976a(context);
        boolean a2 = C4211a.m17514a().mo16536a("spacekit.mobile.template_mindnote_share_enable", false);
        C13479a.m54764b("TemplateUtils", "mindnote shared enable " + a2);
        if (a2 || i != 11) {
            a.mo45221a(context.getText(R.string.Doc_Facade_Share), new View$OnClickListenerC11521d(i, context, str, function0));
        }
        a.mo45227b(context.getText(R.string.Doc_Facade_Delete), new View$OnClickListenerC11522e(context, function02, i, str, function03)).mo45213a().mo45231c();
    }

    /* renamed from: a */
    public static /* synthetic */ void m48001a(TemplateUtils gVar, TemplateV4 templateV4, TemplateCenterViewModel hVar, CategoryTab categoryTab, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = "";
        }
        gVar.mo44264a(templateV4, hVar, categoryTab, str);
    }
}
