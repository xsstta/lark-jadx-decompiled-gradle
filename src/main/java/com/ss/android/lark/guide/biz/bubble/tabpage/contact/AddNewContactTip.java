package com.ss.android.lark.guide.biz.bubble.tabpage.contact;

import android.app.Activity;
import android.content.Intent;
import android.util.Size;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.p1911a.AbstractC38549a;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.ug.feat.add_friends.AddRecFriendsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/AddNewContactTip;", "", "()V", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.a.b.b.a */
public final class AddNewContactTip {

    /* renamed from: a */
    public static final Companion f99101a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/guide/biz/bubble/tabpage/contact/AddNewContactTip$Companion;", "", "()V", "openAddRecFriendsPage", "", "activity", "Landroid/app/Activity;", "show", "anchorView", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.a.b.b.a$a */
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/biz/bubble/tabpage/contact/AddNewContactTip$Companion$show$leftBtn$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.a.b.b.a$a$a */
        public static final class C38571a implements ButtonConfig.ButtonAction {
            C38571a() {
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                gVar.mo141659b();
            }
        }

        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/guide/biz/bubble/tabpage/contact/AddNewContactTip$Companion$show$rightBtn$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.a.b.b.a$a$b */
        public static final class C38572b implements ButtonConfig.ButtonAction {

            /* renamed from: a */
            final /* synthetic */ Activity f99102a;

            C38572b(Activity activity) {
                this.f99102a = activity;
            }

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                Intrinsics.checkParameterIsNotNull(view, "view");
                Intrinsics.checkParameterIsNotNull(gVar, "delegate");
                gVar.mo141659b();
                AddNewContactTip.f99101a.mo141311a(this.f99102a);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo141311a(Activity activity) {
            activity.startActivity(new Intent(activity, AddRecFriendsActivity.class));
        }

        /* renamed from: a */
        public final void mo141312a(Activity activity, View view, View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(view, "anchorView");
            AbstractC38549a a = C38548a.m152027a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GuideModule.getDependency()");
            if (a.mo141264n().mo141271a("mobile_contact_add_friends")) {
                AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.BOTTOM, null, 4, null);
                int dp2px = UIUtils.dp2px(activity, 40.0f);
                MaskConfig maskConfig = new MaskConfig(76, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.CIRCLE, null, new Size(dp2px, dp2px), 10, null);
                String string = activity.getString(R.string.Lark_Guide_SpotlightFindContactsTitle);
                Intrinsics.checkExpressionValueIsNotNull(string, "activity.getString(R.str…otlightFindContactsTitle)");
                String string2 = activity.getString(R.string.Lark_Guide_SpotlightFindContactsDesc);
                Intrinsics.checkExpressionValueIsNotNull(string2, "activity.getString(R.str…potlightFindContactsDesc)");
                String string3 = activity.getString(R.string.Lark_Guide_SpotlightButtonKnow);
                Intrinsics.checkExpressionValueIsNotNull(string3, "activity.getString(R.str…uide_SpotlightButtonKnow)");
                String string4 = activity.getString(R.string.Lark_Guide_SpotlightFindContactsAddButton);
                Intrinsics.checkExpressionValueIsNotNull(string4, "activity.getString(R.str…ghtFindContactsAddButton)");
                C38708a aVar = new C38708a(activity, (AbstractC38707a) null, new ButtonBubbleConfig(anchorConfig, maskConfig, string, string2, null, new ButtonConfig(string3, new C38571a()), new ButtonConfig(string4, new C38572b(activity))));
                AbstractC38549a a2 = C38548a.m152027a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "GuideModule.getDependency()");
                a2.mo141264n().mo141272a("mobile_contact_add_friends", aVar);
            }
        }
    }
}
