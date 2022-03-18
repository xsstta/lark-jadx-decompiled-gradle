package com.larksuite.component.ui.avatar;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/larksuite/component/ui/avatar/FeedBadgeHandler;", "Lcom/larksuite/component/ui/avatar/IFeedBadgeHandler;", "Lcom/larksuite/component/ui/avatar/FeedBadgeModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "handle", "", "model", "viewData", "Lcom/larksuite/component/ui/avatar/BadgeViewData;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.h */
public final class FeedBadgeHandler {

    /* renamed from: a */
    private final Context f62438a;

    public FeedBadgeHandler(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62438a = context;
    }

    /* renamed from: a */
    public void mo89019a(Context context, FeedBadgeModel iVar, BadgeViewData cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iVar, "model");
        Intrinsics.checkParameterIsNotNull(cVar, "viewData");
        if (iVar.mo89020a() <= 0) {
            cVar.mo89000a((String) null);
        } else if (iVar.mo89020a() > 999) {
            cVar.mo89000a((String) null);
            cVar.mo88999a(ContextCompat.getDrawable(context, R.drawable.lkui_button_blue_bg));
        } else {
            cVar.mo89000a(String.valueOf(iVar.mo89020a()));
        }
    }
}
