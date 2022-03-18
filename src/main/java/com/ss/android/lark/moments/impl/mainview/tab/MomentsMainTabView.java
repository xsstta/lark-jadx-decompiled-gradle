package com.ss.android.lark.moments.impl.mainview.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.mainview.MomentsAppNameHolder;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsBadgeView;
import com.ss.android.lark.moments.impl.mainview.badge.MomentsNotificationManager;
import com.ss.android.lark.pb.moments_entities.NotificationCount;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.MainTabItemView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/moments/impl/mainview/tab/MomentsMainTabView;", "Lcom/ss/android/lark/widget/tab/MainTabItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newPostObserver", "Landroidx/lifecycle/Observer;", "", "notificationObserver", "Lcom/ss/android/lark/pb/moments_entities/NotificationCount;", "redDotCount", "redDotView", "Lcom/ss/android/lark/moments/impl/mainview/badge/MomentsBadgeView;", "destroy", "", "init", "updateTabTitle", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsMainTabView extends MainTabItemView {

    /* renamed from: a */
    public int f120311a;

    /* renamed from: b */
    public MomentsBadgeView f120312b;

    /* renamed from: f */
    private final AbstractC1178x<NotificationCount> f120313f = new C47750c(this);

    /* renamed from: g */
    private final AbstractC1178x<Boolean> f120314g = new C47749b(this);

    /* renamed from: d */
    public final void mo153398d() {
        setTabTitle(MomentsAppNameHolder.m188686a());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "getDrawable"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.MomentsMainTabView$a */
    public static final class C47748a implements MainTabItemView.AbstractC59196a {

        /* renamed from: a */
        final /* synthetic */ MomentsMainTabView f120315a;

        C47748a(MomentsMainTabView momentsMainTabView) {
            this.f120315a = momentsMainTabView;
        }

        @Override // com.ss.android.lark.widget.tab.MainTabItemView.AbstractC59196a
        public final Drawable getDrawable() {
            return ContextCompat.getDrawable(this.f120315a.getContext(), R.drawable.ud_icon_tab_community_colorful);
        }
    }

    /* renamed from: e */
    public final void mo167444e() {
        MomentsNotificationManager.f120258a.mo167386b(this.f120313f);
        MomentsNotificationManager.f120258a.mo167391d(this.f120314g);
    }

    /* renamed from: c */
    public final void mo137108c() {
        setTabTitle(MomentsAppNameHolder.m188686a());
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        mo201235a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_tab_community_filled, UIHelper.getColor(R.color.ud_N500)), new C47748a(this));
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        MomentsBadgeView aVar = new MomentsBadgeView(context2);
        this.f120312b = aVar;
        setRedDotView(aVar);
        MomentsNotificationManager.f120258a.mo167380a(this.f120313f);
        MomentsNotificationManager.f120258a.mo167389c(this.f120314g);
    }

    public MomentsMainTabView(Context context) {
        super(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "count", "Lcom/ss/android/lark/pb/moments_entities/NotificationCount;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.MomentsMainTabView$c */
    static final class C47750c<T> implements AbstractC1178x<NotificationCount> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainTabView f120317a;

        C47750c(MomentsMainTabView momentsMainTabView) {
            this.f120317a = momentsMainTabView;
        }

        /* renamed from: a */
        public final void onChanged(NotificationCount notificationCount) {
            LKUIBadgeView lKUIBadgeView;
            MomentsMainTabView momentsMainTabView = this.f120317a;
            int intValue = notificationCount.mmessage_count.intValue();
            Integer num = notificationCount.mreaction_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "count.mreaction_count");
            momentsMainTabView.f120311a = intValue + num.intValue();
            MomentsMainTabView momentsMainTabView2 = this.f120317a;
            momentsMainTabView2.mo201233a(momentsMainTabView2.f120311a);
            MomentsBadgeView aVar = this.f120317a.f120312b;
            if (aVar != null && (lKUIBadgeView = (LKUIBadgeView) aVar.mo201282b()) != null) {
                lKUIBadgeView.invalidate();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "needShow", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.mainview.tab.MomentsMainTabView$b */
    static final class C47749b<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ MomentsMainTabView f120316a;

        C47749b(MomentsMainTabView momentsMainTabView) {
            this.f120316a = momentsMainTabView;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            LKUIBadgeView lKUIBadgeView;
            LKUIBadgeView lKUIBadgeView2;
            Intrinsics.checkExpressionValueIsNotNull(bool, "needShow");
            if (bool.booleanValue()) {
                this.f120316a.f120311a = -1;
                MomentsMainTabView momentsMainTabView = this.f120316a;
                momentsMainTabView.mo201233a(momentsMainTabView.f120311a);
                MomentsBadgeView aVar = this.f120316a.f120312b;
                if (aVar != null && (lKUIBadgeView2 = (LKUIBadgeView) aVar.mo201282b()) != null) {
                    lKUIBadgeView2.invalidate();
                }
            } else if (this.f120316a.f120311a == -1) {
                this.f120316a.f120311a = 0;
                MomentsMainTabView momentsMainTabView2 = this.f120316a;
                momentsMainTabView2.mo201233a(momentsMainTabView2.f120311a);
                MomentsBadgeView aVar2 = this.f120316a.f120312b;
                if (aVar2 != null && (lKUIBadgeView = (LKUIBadgeView) aVar2.mo201282b()) != null) {
                    lKUIBadgeView.invalidate();
                }
            }
        }
    }

    public MomentsMainTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MomentsMainTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
