package com.bytedance.ee.bear.drive.common;

import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.middleground.drive.export.NetworkLevel;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/common/DriveNetUtils;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.common.c */
public final class DriveNetUtils {

    /* renamed from: a */
    public static final Companion f18670a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m27237a() {
        return f18670a.mo27132a();
    }

    @JvmStatic
    /* renamed from: b */
    public static final boolean m27238b() {
        return f18670a.mo27133b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/drive/common/DriveNetUtils$Companion;", "", "()V", "isUnUsableNetState", "", "isWeakNetState", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.common.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean mo27133b() {
            NetworkLevel j = ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35644j();
            Intrinsics.checkExpressionValueIsNotNull(j, "get(IMGDriveInterfaces::class.java).networkLevel");
            int value = j.getValue();
            if (value != NetworkLevel.WEAK.getValue()) {
                return false;
            }
            C13479a.m54764b("DriveComponent", "isWeakNetState() true, because netLevel=" + value);
            return true;
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo27132a() {
            NetworkLevel j = ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35644j();
            Intrinsics.checkExpressionValueIsNotNull(j, "get(IMGDriveInterfaces::class.java).networkLevel");
            int value = j.getValue();
            ConnectionService d = C5084ad.m20847d();
            Intrinsics.checkExpressionValueIsNotNull(d, "ConnectionServiceImp.getInstance()");
            ConnectionService.NetworkState b = d.mo20038b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ConnectionServiceImp.getInstance().networkState");
            if (b.mo20041b() && value != NetworkLevel.UNKNOWN.getValue() && value != NetworkLevel.NET_UNAVAILABLE.getValue() && value != NetworkLevel.SERVICE_UNAVAILABLE.getValue() && value != NetworkLevel.OFFLINE.getValue()) {
                return false;
            }
            C13479a.m54764b("DriveComponent", "isUnUsableNetState() true, because netLevel=" + value);
            return true;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
