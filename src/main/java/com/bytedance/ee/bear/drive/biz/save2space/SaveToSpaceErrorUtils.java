package com.bytedance.ee.bear.drive.biz.save2space;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.quoto.SingleFileQuotaConfig;
import com.bytedance.ee.util.p718t.C13726a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/save2space/SaveToSpaceErrorUtils;", "", "()V", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.drive.biz.save2space.b */
public final class SaveToSpaceErrorUtils {

    /* renamed from: a */
    public static final Companion f18351a = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final boolean m26561a(Throwable th, FragmentActivity fragmentActivity, Long l) {
        return f18351a.mo26540a(th, fragmentActivity, l);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/save2space/SaveToSpaceErrorUtils$Companion;", "", "()V", "showQuoutDialogIfNeed", "", "throwable", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "fileSize", "", "(Ljava/lang/Throwable;Landroidx/fragment/app/FragmentActivity;Ljava/lang/Long;)Z", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.save2space.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean mo26540a(Throwable th, FragmentActivity fragmentActivity, Long l) {
            if ((th instanceof NetService.ServerErrorException) && C13726a.m55676b(fragmentActivity)) {
                int code = ((NetService.ServerErrorException) th).getCode();
                if (code == 11001 || code == 13001) {
                    AbstractC10575k kVar = (AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null);
                    if (fragmentActivity == null) {
                        Intrinsics.throwNpe();
                    }
                    kVar.mo40012a(fragmentActivity, FullQuotoConfig.SAVE_TO_DRIVE);
                    return true;
                } else if (code == 90001061 || code == 90003061) {
                    AbstractC10575k kVar2 = (AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null);
                    if (fragmentActivity == null) {
                        Intrinsics.throwNpe();
                    }
                    kVar2.mo40013a(fragmentActivity, null, null, false);
                    return true;
                } else if (((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40015a(code)) {
                    AbstractC10575k kVar3 = (AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null);
                    if (fragmentActivity == null) {
                        Intrinsics.throwNpe();
                    }
                    kVar3.mo40011a(fragmentActivity, SingleFileQuotaConfig.SAVE, l);
                    return true;
                }
            }
            return false;
        }
    }
}
