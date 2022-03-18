package com.ss.android.lark.calendar.impl.features.events.detail.share.handle;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/share/handle/SaveImageShareHandler$shareImage$shareEntity$1", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback;", "onFailed", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/thirdshare/base/export/ShareActionType;", "error", "Lcom/ss/android/lark/thirdshare/base/export/OnShareCallback$ShareError;", "onSuccess", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SaveImageShareHandler$shareImage$shareEntity$1 extends OnShareCallback {
    final /* synthetic */ Context $context;

    SaveImageShareHandler$shareImage$shareEntity$1(Context context) {
        this.$context = context;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onSuccess(ShareActionType shareActionType) {
        Context context = this.$context;
        new UDToast.Builder(this.$context).mo91641a(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_yes_outlined, UDColorUtils.getColor(context, R.color.static_white))).mo91637a(R.string.Calendar_Share_AlbumSaved).mo91655j().show();
    }

    @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
    public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
        Drawable d = C32634ae.m125184d(R.drawable.ud_icon_more_close_outlined);
        d.setTint(C32634ae.m125178a(R.color.static_white));
        UDToast.Builder aVar = new UDToast.Builder(this.$context);
        Intrinsics.checkExpressionValueIsNotNull(d, "drawable");
        aVar.mo91641a(d).mo91637a(R.string.Calendar_Share_SavedFailed).mo91655j().show();
    }
}
