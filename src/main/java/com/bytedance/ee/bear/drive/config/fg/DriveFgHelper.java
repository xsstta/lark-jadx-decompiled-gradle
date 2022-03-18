package com.bytedance.ee.bear.drive.config.fg;

import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/fg/DriveFgHelper;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.config.fg.b */
public final class DriveFgHelper {

    /* renamed from: a */
    public static final Companion f18704a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m27375a() {
        return f18704a.mo27231a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/config/fg/DriveFgHelper$Companion;", "", "()V", "getWpsEnable", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.config.fg.b$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo27231a() {
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "infoProvideService");
            if (d.mo17342C() || d.mo17345F()) {
                return C4211a.m17514a().mo16536a("spacekit.mobile.wps_enable", false);
            }
            C13479a.m54764b("DriveComponent", "getWpsEnable() is not ka and notOverseaTenantBrand ");
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
