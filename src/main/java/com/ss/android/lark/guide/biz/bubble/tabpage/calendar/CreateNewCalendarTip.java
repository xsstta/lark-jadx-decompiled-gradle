package com.ss.android.lark.guide.biz.bubble.tabpage.calendar;

import android.app.Activity;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/calendar/CreateNewCalendarTip;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.b.a.a */
public final class CreateNewCalendarTip {

    /* renamed from: a */
    public static final Companion f99100a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/calendar/CreateNewCalendarTip$Companion;", "", "()V", "show", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.b.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141310a(Activity activity, View view, View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(view, "anchorView");
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            if (a.mo141264n().mo141271a("all_calendar_create_button")) {
                AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.TOP, null, 4, null);
                MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, null, null, null, 31, null);
                String string = activity.getString(R.string.Lark_Guide_SpotlightCalenarTabCreateTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.str…ghtCalenarTabCreateTitle)");
                String string2 = activity.getString(R.string.Lark_Guide_SpotlightCalenarTabCreateDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "activity.getString(R.str…ightCalenarTabCreateDesc)");
                C38708a aVar = new C38708a(activity, (AbstractC38707a) null, new TextBubbleConfig(anchorConfig, maskConfig, string, string2));
                AbstractC38549a a2 = C38548a.m152027a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "GuideModule.getDependency()");
                a2.mo141264n().mo141272a("all_calendar_create_button", aVar);
            }
        }
    }
}
