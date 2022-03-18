package com.ss.android.lark.notification.entity;

import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.sdk.C53241h;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/notification/entity/RomTipHelperV2;", "", "()V", "Companion", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.notification.c.c */
public final class RomTipHelperV2 {

    /* renamed from: a */
    public static final HashMap<RomUtils.RomType, String> f121891a;

    /* renamed from: b */
    public static final Companion f121892b = new Companion(null);

    @JvmStatic
    /* renamed from: a */
    public static final C48432a m191075a() {
        return f121892b.mo169439a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004`\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/notification/entity/RomTipHelperV2$Companion;", "", "()V", "HELP_EMUI", "", "HELP_FLYME", "HELP_OPPO", "HELP_SAMSUNG", "HELP_SMARTISAN", "HELP_VIVO", "HELP_XIAOMI", "TAG", "romConfigKeys", "Ljava/util/HashMap;", "Lcom/larksuite/framework/utils/RomUtils$RomType;", "Lkotlin/collections/HashMap;", "getRomNotifyGuidanceEntity", "Lcom/ss/android/lark/notification/entity/RomNotifyEntity;", "core_notification_notification_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.notification.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: a */
        public final C48432a mo169439a() {
            RomUtils.RomType j = RomUtils.m94955j();
            if (RomTipHelperV2.f121891a.get(j) != null) {
                AbstractC48407a a = C48398a.m190922a();
                Intrinsics.checkExpressionValueIsNotNull(a, "NotificationModule.getDependency()");
                if (a.mo169352o().mo169386a("lark.setting.notification_helpdocs")) {
                    return new C48432a(C48398a.m190922a().mo169336a(RomTipHelperV2.f121891a.get(j)));
                }
            }
            C53241h.m205894a("RomTipHelperV2", "rom name is empty");
            return null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        HashMap<RomUtils.RomType, String> hashMap = new HashMap<>();
        f121891a = hashMap;
        hashMap.put(RomUtils.RomType.ROM_EMUI, "help-android-emui");
        hashMap.put(RomUtils.RomType.ROM_OPPO, "help-android-oppo");
        hashMap.put(RomUtils.RomType.ROM_SAMSUNG, "help-android-samsung");
        hashMap.put(RomUtils.RomType.ROM_SMARTISAN, "help-android-smartisan");
        hashMap.put(RomUtils.RomType.ROM_VIVO, "help-android-vivo");
        hashMap.put(RomUtils.RomType.ROM_MIUI, "help-android-xiaomi");
        hashMap.put(RomUtils.RomType.ROM_FLYME, "help-android-flyme");
    }
}
