package com.ss.android.lark.calendar.impl.features.events.detail.share.util;

import com.ss.android.lark.calendar.impl.features.events.detail.share.Interface.InnerShareDependency;
import com.ss.android.lark.calendar.impl.features.events.detail.share.entity.ShareType;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.BaseShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.CopyShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.CreateImageShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.LarkShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.QQShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.SaveImageShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.SysShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.WXShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.WXTimeLineShareHandler;
import com.ss.android.lark.calendar.impl.features.events.detail.share.handle.WeiBoShareHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/util/ShareActionFactory;", "", "()V", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.c */
public final class ShareActionFactory {

    /* renamed from: a */
    public static final Companion f79501a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/share/util/ShareActionFactory$Companion;", "", "()V", "createHandler", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/handle/BaseShareHandler;", "shareType", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/entity/ShareType;", "dependency", "Lcom/ss/android/lark/calendar/impl/features/events/detail/share/Interface/InnerShareDependency;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.share.b.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final BaseShareHandler mo113952a(ShareType shareType, InnerShareDependency aVar) {
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            switch (C31380d.f79502a[shareType.ordinal()]) {
                case 1:
                    return new LarkShareHandler(aVar);
                case 2:
                    return new CopyShareHandler(null, 1, null);
                case 3:
                    return new CreateImageShareHandler(aVar);
                case 4:
                    return new WXShareHandler(null, 1, null);
                case 5:
                    return new WXTimeLineShareHandler(aVar);
                case 6:
                    return new QQShareHandler(null, 1, null);
                case 7:
                    return new WeiBoShareHandler(null, 1, null);
                case 8:
                    return new SaveImageShareHandler(null, 1, null);
                case 9:
                    return new SysShareHandler(null, 1, null);
                default:
                    return null;
            }
        }

        /* renamed from: a */
        public static /* synthetic */ BaseShareHandler m118087a(Companion aVar, ShareType shareType, InnerShareDependency aVar2, int i, Object obj) {
            if ((i & 2) != 0) {
                aVar2 = null;
            }
            return aVar.mo113952a(shareType, aVar2);
        }
    }
}
