package com.ss.android.lark.guide.biz;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH&J:\u0010\u000e\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J:\u0010\u0014\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH&¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/guide/biz/IBubbleFacade;", "", "showAddNewContactTipIfNeed", "", "activity", "Landroid/app/Activity;", "anchorView", "Landroid/view/View;", "clickListener", "Landroid/view/View$OnClickListener;", "showChatInputTip", "", "chatType", "", "showClickAvatarTip", "tipContent", "", "btnName", "listener", "showCreateNewCalendarTipIfNeed", "showTenantPickTip", "highLightRect", "Landroid/graphics/Rect;", "showTenantSwitchGuidanceV3", "showUpgradeToBigTeamUserTip", "showWebTranslateTip", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "closeClick", "openClick", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.b */
public interface IBubbleFacade {
    /* renamed from: a */
    GuideDelegate mo141291a(View view, View.OnClickListener onClickListener, View.OnClickListener onClickListener2);

    /* renamed from: a */
    void mo141292a(Activity activity, View view, View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo141293a(View view);

    /* renamed from: a */
    void mo141294a(View view, Activity activity, View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo141295a(View view, Activity activity, String str, String str2, View.OnClickListener onClickListener);

    /* renamed from: a */
    void mo141296a(View view, Rect rect, String str, String str2, View.OnClickListener onClickListener);

    /* renamed from: a */
    boolean mo141297a(View view, int i);

    /* renamed from: b */
    void mo141298b(Activity activity, View view, View.OnClickListener onClickListener);
}
