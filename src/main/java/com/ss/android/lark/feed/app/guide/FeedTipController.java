package com.ss.android.lark.feed.app.guide;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.guide.FeedTipGuideHelper;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.maincore.AbstractC44546c;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\u000bJ:\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J(\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J6\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J8\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/feed/app/guide/FeedTipController;", "", "()V", "ALL_BADGE_CHANGE_SETTING", "", "ALL_FEED_MENTION_ALL", "ALL_FEED_MENTION_YOU", "MASK_SIZE_IN_DP", "", "TAG", "needShowAtAll", "", "needShowAtMe", "needShowBadgeStyle", "showAtMeTip", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "anchorView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "info", "Lcom/ss/android/lark/feed/app/entity/FeedPreview$AtInfo;", "atAll", "listener", "Lcom/ss/android/lark/feed/app/guide/FeedTipController$OnClickListener;", "showBadgeTip", "showGuideTip", "", "guideType", "Lcom/ss/android/lark/feed/app/guide/FeedTipGuideHelper$GuideType;", "showGuideTipReal", "OnClickListener", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.guide.a */
public final class FeedTipController {

    /* renamed from: a */
    public static final FeedTipController f96436a = new FeedTipController();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/feed/app/guide/FeedTipController$OnClickListener;", "", "onClose", "", "onConfirm", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.guide.a$a */
    public interface OnClickListener {
        /* renamed from: a */
        void mo137995a();

        /* renamed from: b */
        void mo137996b();
    }

    private FeedTipController() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "showGuide"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.guide.a$d */
    public static final class C37607d implements AbstractC44546c {

        /* renamed from: a */
        final /* synthetic */ View f96441a;

        /* renamed from: b */
        final /* synthetic */ Activity f96442b;

        /* renamed from: c */
        final /* synthetic */ FeedPreview.AtInfo f96443c;

        /* renamed from: d */
        final /* synthetic */ FeedTipGuideHelper.GuideType f96444d;

        /* renamed from: e */
        final /* synthetic */ OnClickListener f96445e;

        C37607d(View view, Activity activity, FeedPreview.AtInfo atInfo, FeedTipGuideHelper.GuideType guideType, OnClickListener aVar) {
            this.f96441a = view;
            this.f96442b = activity;
            this.f96443c = atInfo;
            this.f96444d = guideType;
            this.f96445e = aVar;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44546c
        /* renamed from: a */
        public final void mo137997a() {
            FeedTipController.f96436a.mo137992b(this.f96441a, this.f96442b, this.f96443c, this.f96444d, this.f96445e);
        }
    }

    /* renamed from: a */
    public final boolean mo137991a() {
        AbstractC38037a a = C37262a.m146726a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
        return a.mo139181b().mo139260a("all_feed_mention_you");
    }

    /* renamed from: b */
    public final boolean mo137993b() {
        AbstractC38037a a = C37262a.m146726a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
        return a.mo139181b().mo139260a("all_feed_mention_all");
    }

    /* renamed from: c */
    public final boolean mo137994c() {
        AbstractC38037a a = C37262a.m146726a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
        return a.mo139181b().mo139260a("all_badge_change_setting");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/feed/app/guide/FeedTipController$showAtMeTip$rightBtn$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.guide.a$b */
    public static final class C37605b implements ButtonConfig.ButtonAction {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f96437a;

        /* renamed from: b */
        final /* synthetic */ String f96438b;

        C37605b(OnClickListener aVar, String str) {
            this.f96437a = aVar;
            this.f96438b = str;
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            OnClickListener aVar = this.f96437a;
            if (aVar != null) {
                aVar.mo137995a();
            }
            AbstractC38037a a = C37262a.m146726a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
            a.mo139181b().mo139261b(this.f96438b);
            gVar.mo141659b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/feed/app/guide/FeedTipController$showBadgeTip$rightBtn$1", "Lcom/ss/android/lark/guide/ui/config/ButtonConfig$ButtonAction;", "onClick", "", "view", "Landroid/view/View;", "delegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.guide.a$c */
    public static final class C37606c implements ButtonConfig.ButtonAction {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f96439a;

        /* renamed from: b */
        final /* synthetic */ String f96440b;

        C37606c(OnClickListener aVar, String str) {
            this.f96439a = aVar;
            this.f96440b = str;
        }

        @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
        public void onClick(View view, GuideDelegate gVar) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Intrinsics.checkParameterIsNotNull(gVar, "delegate");
            OnClickListener aVar = this.f96439a;
            if (aVar != null) {
                aVar.mo137995a();
            }
            AbstractC38037a a = C37262a.m146726a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
            a.mo139181b().mo139261b(this.f96440b);
            gVar.mo141659b();
        }
    }

    /* renamed from: a */
    private final GuideDelegate m147857a(View view, Activity activity, OnClickListener aVar) {
        if (view != null && activity != null) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
            AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.TOP, null, 4, null);
            MaskConfig maskConfig = new MaskConfig(76, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.CIRCLE, rect, null, 18, null);
            String string = UIUtils.getString(view.getContext(), R.string.Lark_Legacy_HintIHadKnow);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(anchor…Lark_Legacy_HintIHadKnow)");
            ButtonConfig eVar = new ButtonConfig(string, new C37606c(aVar, "all_badge_change_setting"));
            String string2 = UIUtils.getString(view.getContext(), R.string.Lark_Settings_Badgestyleguide);
            Intrinsics.checkExpressionValueIsNotNull(string2, "detail");
            GuideDelegate b = GuideComponent.f99382a.mo141645b(activity, new ButtonBubbleConfig(anchorConfig, maskConfig, null, string2, null, null, eVar));
            AbstractC38037a a = C37262a.m146726a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
            a.mo139181b().mo139261b("all_badge_change_setting");
            return b;
        } else if (aVar == null) {
            return null;
        } else {
            aVar.mo137996b();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo137990a(View view, Activity activity, FeedPreview.AtInfo atInfo, FeedTipGuideHelper.GuideType guideType, OnClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(guideType, "guideType");
        AbstractC38037a a = C37262a.m146726a();
        Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
        a.mo139166M().mo139282a(new C37607d(view, activity, atInfo, guideType, aVar));
    }

    /* renamed from: b */
    public final void mo137992b(View view, Activity activity, FeedPreview.AtInfo atInfo, FeedTipGuideHelper.GuideType guideType, OnClickListener aVar) {
        int i = C37608b.f96446a[guideType.ordinal()];
        if (i == 1) {
            m147857a(view, activity, aVar);
        } else if (i == 2) {
            m147856a(view, activity, atInfo, true, aVar);
        } else if (i == 3) {
            m147856a(view, activity, atInfo, false, aVar);
        }
    }

    /* renamed from: a */
    private final GuideDelegate m147856a(View view, Activity activity, FeedPreview.AtInfo atInfo, boolean z, OnClickListener aVar) {
        String str;
        String str2;
        if (view != null && atInfo != null && activity != null) {
            if (z) {
                str = "all_feed_mention_all";
            } else {
                str = "all_feed_mention_you";
            }
            AnchorConfig anchorConfig = new AnchorConfig(view, AnchorConfig.AnchorGravity.START, null, 4, null);
            MaskConfig maskConfig = new MaskConfig(76, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.CIRCLE, null, new Size(12, 12), 10, null);
            String string = UIUtils.getString(view.getContext(), R.string.Lark_Legacy_HintIHadKnow);
            Intrinsics.checkExpressionValueIsNotNull(string, "UIUtils.getString(anchor…Lark_Legacy_HintIHadKnow)");
            ButtonConfig eVar = new ButtonConfig(string, new C37605b(aVar, str));
            if (z) {
                str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedAtAllGuideTip, "user_name", atInfo.getLocalizedUserName());
            } else {
                str2 = UIHelper.mustacheFormat((int) R.string.Lark_Legacy_FeedAtYouGuideTip, "user_name", atInfo.getLocalizedUserName());
            }
            Intrinsics.checkExpressionValueIsNotNull(str2, "detail");
            GuideDelegate b = GuideComponent.f99382a.mo141645b(activity, new ButtonBubbleConfig(anchorConfig, maskConfig, null, str2, null, null, eVar));
            AbstractC38037a a = C37262a.m146726a();
            Intrinsics.checkExpressionValueIsNotNull(a, "FeedModule.getDependency()");
            a.mo139181b().mo139261b(str);
            return b;
        } else if (aVar == null) {
            return null;
        } else {
            aVar.mo137996b();
            return null;
        }
    }
}
