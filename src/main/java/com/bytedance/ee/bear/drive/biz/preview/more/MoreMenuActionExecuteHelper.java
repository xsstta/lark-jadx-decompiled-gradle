package com.bytedance.ee.bear.drive.biz.preview.more;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/MoreMenuActionExecuteHelper;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.c */
public final class MoreMenuActionExecuteHelper {

    /* renamed from: a */
    public static final Companion f18177a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/more/MoreMenuActionExecuteHelper$Companion;", "", "()V", "executeDownloadMenuWithPermissionCheck", "", "cd", "Lio/reactivex/disposables/CompositeDisposable;", "context", "Landroid/content/Context;", "downloadMenu", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "defaultAction", "Lcom/bytedance/ee/bear/drive/biz/preview/more/Action;", "executeMenuActionInBg", "moreMenuAction", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.c$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.c$a$d */
        public static final class C6663d<T> implements Consumer<Throwable> {

            /* renamed from: a */
            public static final C6663d f18184a = new C6663d();

            C6663d() {
            }

            /* renamed from: a */
            public final void accept(Throwable th) {
                C13479a.m54759a("DriveComponent", "DriveSdkTitleBarPlugin#executeMenuActionInBg() error", th);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.c$a$c */
        public static final class C6662c<T> implements Consumer<BaseMoreMenuAction> {

            /* renamed from: a */
            final /* synthetic */ long f18183a;

            C6662c(long j) {
                this.f18183a = j;
            }

            /* renamed from: a */
            public final void accept(BaseMoreMenuAction baseMoreMenuAction) {
                C13479a.m54764b("DriveComponent", "executeMenuActionInBg#executeMenuActionInBg() execute menu action done, cost time=" + (SystemClock.uptimeMillis() - this.f18183a));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGrant", "", "onCheckResult"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.c$a$a */
        static final class C6660a implements AbstractC13707b {

            /* renamed from: a */
            final /* synthetic */ C68289a f18178a;

            /* renamed from: b */
            final /* synthetic */ BaseMoreMenuAction f18179b;

            /* renamed from: c */
            final /* synthetic */ Action f18180c;

            C6660a(C68289a aVar, BaseMoreMenuAction baseMoreMenuAction, Action aVar2) {
                this.f18178a = aVar;
                this.f18179b = baseMoreMenuAction;
                this.f18180c = aVar2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                C13479a.m54764b("DriveComponent", "DriveSdkTitleBarPlugin#checkRequestedPermissions : isGrant=" + z);
                if (z) {
                    MoreMenuActionExecuteHelper.f18177a.mo26322a(this.f18178a, this.f18179b, this.f18180c);
                } else {
                    C13479a.m54775e("DriveComponent", "executeDownloadMenuWithPermissionCheck() isGrant=false");
                }
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/contract/drive/sdk/entity/menu/BaseMoreMenuAction;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.drive.biz.preview.more.c$a$b */
        public static final class C6661b<T> implements Consumer<BaseMoreMenuAction> {

            /* renamed from: a */
            final /* synthetic */ Action f18181a;

            /* renamed from: b */
            final /* synthetic */ BaseMoreMenuAction f18182b;

            C6661b(Action aVar, BaseMoreMenuAction baseMoreMenuAction) {
                this.f18181a = aVar;
                this.f18182b = baseMoreMenuAction;
            }

            /* renamed from: a */
            public final void accept(BaseMoreMenuAction baseMoreMenuAction) {
                Intrinsics.checkExpressionValueIsNotNull(baseMoreMenuAction, "it");
                if (baseMoreMenuAction.mo20438b() != null) {
                    C13479a.m54764b("DriveComponent", "executeMenuActionInBg() execute");
                    baseMoreMenuAction.mo20440c();
                } else if (this.f18181a != null) {
                    C13479a.m54764b("DriveComponent", "executeMenuActionInBg() run default implements");
                    Action aVar = this.f18181a;
                    if (aVar != null) {
                        aVar.mo26262a(this.f18182b);
                    }
                } else {
                    C13479a.m54758a("DriveComponent", "executeMenuActionInBg() mistake, no action found");
                }
            }
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo26322a(C68289a aVar, BaseMoreMenuAction baseMoreMenuAction, Action aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "cd");
            Intrinsics.checkParameterIsNotNull(baseMoreMenuAction, "moreMenuAction");
            aVar.mo237937a(AbstractC68307f.m265083a(baseMoreMenuAction).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48479c()).mo238005b((Consumer) new C6661b(aVar2, baseMoreMenuAction)).mo238001b(new C6662c(SystemClock.uptimeMillis()), C6663d.f18184a));
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo26321a(C68289a aVar, Context context, BaseMoreMenuAction baseMoreMenuAction, Action aVar2) {
            Intrinsics.checkParameterIsNotNull(aVar, "cd");
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(baseMoreMenuAction, "downloadMenu");
            HashMap hashMap = new HashMap(1);
            String string = context.getResources().getString(R.string.Doc_Facade_PermissionStorage);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…Facade_PermissionStorage)");
            hashMap.put("android.permission.WRITE_EXTERNAL_STORAGE", string);
            C13479a.m54764b("DriveComponent", "DriveSdkTitleBarPlugin#checkRequestedPermissions");
            C13708c.m55601a(context, (HashMap<String, String>) hashMap, true, (AbstractC13707b) new C6660a(aVar, baseMoreMenuAction, aVar2));
        }
    }
}
