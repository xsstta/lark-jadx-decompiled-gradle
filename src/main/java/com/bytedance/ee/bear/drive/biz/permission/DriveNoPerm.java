package com.bytedance.ee.bear.drive.biz.permission;

import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.drive.biz.permission.model.C6522b;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.p499a.AbstractC10157c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.share.export.OwnerInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p705h.C13666a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveNoPerm;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.permission.b */
public final class DriveNoPerm {

    /* renamed from: a */
    public static final Companion f17950a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0002\u0010\u0014JT\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J=\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u001dJ2\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/permission/DriveNoPerm$Companion;", "", "()V", "DEFAULT_BACK_VISIBLE", "", "DEFAULT_CONTAINER_ID", "", "TAG", "", "showNoPermissionView", "", "fm", "Landroidx/fragment/app/FragmentManager;", "canApply", "ownName", "objToken", "containerId", "backVisible", "subType", "fromVC", "(Landroidx/fragment/app/FragmentManager;ZLjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/Boolean;)V", "showPermApplyView", "services", "Lcom/bytedance/ee/bear/service/ServiceContext;", "permission", "Lcom/bytedance/ee/bear/drive/biz/permission/model/DrivePermissionInfo;", "onVerifiedCallback", "Ljava/lang/Runnable;", "showPermForbidView", "(Landroidx/fragment/app/FragmentManager;IZLjava/lang/String;Ljava/lang/Boolean;)V", "showRequestPasswordView", "token", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.permission.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final void m26133a(FragmentManager fragmentManager, String str, int i, boolean z, Runnable runnable) {
            C13479a.m54764b("DriveNoPerm", "showRequestPasswordView");
            ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36678b(fragmentManager, str, 12, i, z, runnable);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo26020a(FragmentManager fragmentManager, int i, boolean z, String str, Boolean bool) {
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            m26134a(fragmentManager, false, "", "", i, z, str, bool);
        }

        /* renamed from: a */
        private final void m26134a(FragmentManager fragmentManager, boolean z, String str, String str2, int i, boolean z2, String str3, Boolean bool) {
            C13479a.m54764b("DriveNoPerm", "showNoPermissionView");
            ((AbstractC10157c) KoinJavaComponent.m268613a(AbstractC10157c.class, null, null, 6, null)).mo36639b().mo36675a(fragmentManager, i, str2, C8275a.f22375h, str, z, z2, str3, Intrinsics.areEqual((Object) bool, (Object) true), false, "", "forbidden", "");
        }

        /* renamed from: a */
        public static /* synthetic */ void m26135a(Companion aVar, FragmentManager fragmentManager, int i, boolean z, String str, Boolean bool, int i2, Object obj) {
            int i3;
            boolean z2;
            if ((i2 & 2) != 0) {
                i3 = -1;
            } else {
                i3 = i;
            }
            if ((i2 & 4) != 0) {
                z2 = true;
            } else {
                z2 = z;
            }
            aVar.mo26020a(fragmentManager, i3, z2, str, bool);
        }

        @JvmStatic
        /* renamed from: a */
        public final void mo26021a(C10917c cVar, FragmentManager fragmentManager, C6522b bVar, Runnable runnable, int i, boolean z, String str, boolean z2) {
            Intrinsics.checkParameterIsNotNull(cVar, "services");
            Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
            Intrinsics.checkParameterIsNotNull(bVar, "permission");
            int k = bVar.mo26065k();
            OwnerInfo h = bVar.mo26062h();
            if (k == 10016) {
                String a = bVar.mo26055a();
                Intrinsics.checkExpressionValueIsNotNull(a, "permission.objToken");
                m26133a(fragmentManager, a, i, z, runnable);
            } else if (h == null || !h.isAdmin_can_cross()) {
                m26134a(fragmentManager, false, "", "", i, z, str, Boolean.valueOf(z2));
            } else {
                String a2 = C13666a.m55443a(C4484g.m18494b().mo17252c(), h.getName(), h.getEn_name());
                Intrinsics.checkExpressionValueIsNotNull(a2, "ownerName");
                String a3 = bVar.mo26055a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "permission.objToken");
                m26134a(fragmentManager, true, a2, a3, i, z, str, Boolean.valueOf(z2));
            }
        }
    }
}
