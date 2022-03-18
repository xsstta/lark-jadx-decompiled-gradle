package com.bytedance.ee.bear.list.create;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.C5205f;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J(\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/list/create/CreateErrorDialogUtils;", "", "()V", "API_REMIND_ADMIN", "", "CODE_EXCEED_CAPACITY", "", "TAG", "executeRemindAdmin", "", "context", "Landroid/content/Context;", "netService", "Lcom/bytedance/ee/bear/contract/NetService;", "isExceedCapacity", "", "code", "reportCreateExceedQuotaEvent", "createInfo", "Lcom/bytedance/ee/bear/list/create/CreateInfo;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "action", "showCreateExceedCapacityDialog", "showCreateExceedQuotaDialog", "activity", "Landroid/app/Activity;", "msg", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.list.create.d */
public final class CreateErrorDialogUtils {

    /* renamed from: a */
    public static final CreateErrorDialogUtils f22202a = new CreateErrorDialogUtils();

    private CreateErrorDialogUtils() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$d */
    public static final class C8233d<T> implements Consumer<Throwable> {

        /* renamed from: a */
        public static final C8233d f22207a = new C8233d();

        C8233d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13479a.m54773d("CreateErrorDialogUtils", "reportCreateExceedQuotaEvent ", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "throwable", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$b */
    public static final class C8231b<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Context f22204a;

        C8231b(Context context) {
            this.f22204a = context;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.showFailureText(this.f22204a, (int) R.string.Doc_Facade_OperateFailed);
            C13479a.m54759a("CreateErrorDialogUtils", "executeRemindAdmin() error:", th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lcom/bytedance/ee/bear/contract/net/SimpleRequestResult;", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$a */
    public static final class C8230a<T> implements Consumer<SimpleRequestResult> {

        /* renamed from: a */
        final /* synthetic */ Context f22203a;

        C8230a(Context context) {
            this.f22203a = context;
        }

        /* renamed from: a */
        public final void accept(SimpleRequestResult simpleRequestResult) {
            Intrinsics.checkParameterIsNotNull(simpleRequestResult, "result");
            if (simpleRequestResult.code == 0) {
                Toast.showSuccessText(this.f22203a, (int) R.string.Doc_Facade_Reminded);
            } else {
                Toast.showFailureText(this.f22203a, (int) R.string.Doc_Facade_OperateFailed);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "s", "", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$c */
    public static final class C8232c<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ String f22205a;

        /* renamed from: b */
        final /* synthetic */ C8237e f22206b;

        C8232c(String str, C8237e eVar) {
            this.f22205a = str;
            this.f22206b = eVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            AbstractC5233x b = C5234y.m21391b();
            HashMap hashMap = new HashMap();
            hashMap.put("action", this.f22205a);
            hashMap.put("item", "create");
            hashMap.put("sub_item", "create_new_objs");
            hashMap.put(ShareHitPoint.f121868c, this.f22206b.mo32336d());
            if (!TextUtils.isEmpty(this.f22206b.mo32335c())) {
                hashMap.put("module", this.f22206b.mo32335c());
            }
            b.mo21079a("client_commerce", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$g */
    public static final class DialogInterface$OnClickListenerC8236g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8237e f22212a;

        /* renamed from: b */
        final /* synthetic */ C10917c f22213b;

        DialogInterface$OnClickListenerC8236g(C8237e eVar, C10917c cVar) {
            this.f22212a = eVar;
            this.f22213b = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CreateErrorDialogUtils.m33810a(this.f22212a, this.f22213b, "cancel");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$e */
    public static final class DialogInterface$OnClickListenerC8234e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f22208a;

        DialogInterface$OnClickListenerC8234e(Context context) {
            this.f22208a = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CreateErrorDialogUtils.f22202a.mo32325a(this.f22208a, (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.create.d$f */
    public static final class DialogInterface$OnClickListenerC8235f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Activity f22209a;

        /* renamed from: b */
        final /* synthetic */ C8237e f22210b;

        /* renamed from: c */
        final /* synthetic */ C10917c f22211c;

        DialogInterface$OnClickListenerC8235f(Activity activity, C8237e eVar, C10917c cVar) {
            this.f22209a = activity;
            this.f22210b = eVar;
            this.f22211c = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            CreateErrorDialogUtils.f22202a.mo32325a(this.f22209a, (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null));
            CreateErrorDialogUtils.m33810a(this.f22210b, this.f22211c, "notify_admin");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m33809a(Context context, C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        C13479a.m54764b("CreateErrorDialogUtils", "showCreateExceedCapacityDialog()");
        new BearUDDialogBuilder(context).mo45344a(R.string.Doc_List_StorageLimitTitle).mo45362d(R.string.Doc_List_StorageLimitDesc).mo45360c(8388611).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_NotifyAdminUpgrade, new DialogInterface$OnClickListenerC8234e(context)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null).mo45355a().show();
    }

    /* renamed from: a */
    public final void mo32325a(Context context, NetService netService) {
        C13479a.m54764b("CreateErrorDialogUtils", "executeRemindAdmin()");
        NetService.AbstractC5075d a = netService.mo20117a(new C5205f());
        NetService.C5077f fVar = new NetService.C5077f("/api/explorer/lark/notifysuitebot/");
        fVar.mo20143a(2);
        a.mo20141a(fVar).mo238001b(new C8230a(context), new C8231b(context));
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m33810a(C8237e eVar, C10917c cVar, String str) {
        Intrinsics.checkParameterIsNotNull(eVar, "createInfo");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(str, "action");
        AbstractC68307f.m265083a("").mo237985a(C11678b.m48480d()).mo238001b(new C8232c(str, eVar), C8233d.f22207a);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m33808a(Activity activity, C10917c cVar, C8237e eVar, String str) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        Intrinsics.checkParameterIsNotNull(eVar, "createInfo");
        Intrinsics.checkParameterIsNotNull(str, "msg");
        new BearUDDialogBuilder(activity).mo45344a(R.string.Doc_List_CreateDocumentExceedLimit).mo45357b(str).mo45360c(8388611).mo45351a(BearUDDialogBuilder.ActionBottomOrientation.VERTICAL).mo45346a(R.id.ud_dialog_btn_primary, R.string.Doc_Facade_NotifyAdminUpgrade, new DialogInterface$OnClickListenerC8235f(activity, eVar, cVar)).mo45346a(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, new DialogInterface$OnClickListenerC8236g(eVar, cVar)).mo45355a().show();
    }
}
