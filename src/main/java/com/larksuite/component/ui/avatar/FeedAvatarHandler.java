package com.larksuite.component.ui.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J0\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/larksuite/component/ui/avatar/FeedAvatarHandler;", "Lcom/larksuite/component/ui/avatar/AvatarModelHandler;", "Lcom/larksuite/component/ui/avatar/FeedAvatarModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "handle", "", "model", "avatarVO", "Lcom/larksuite/component/ui/avatar/AvatarIconViewData;", "badgeVO", "Lcom/larksuite/component/ui/avatar/BadgeViewData;", "miniIconVO", "Lcom/larksuite/component/ui/avatar/MiniIconViewData;", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.f */
public final class FeedAvatarHandler implements AvatarModelHandler<FeedAvatarModel> {

    /* renamed from: a */
    private final Context f62429a;

    public FeedAvatarHandler(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f62429a = context;
    }

    @Override // com.larksuite.component.ui.avatar.AvatarModelHandler
    /* renamed from: a */
    public void mo88998a(Context context, FeedAvatarModel gVar, AvatarIconViewData aVar, BadgeViewData cVar, MiniIconViewData vVar) {
        Drawable drawable;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(gVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar, "avatarVO");
        Intrinsics.checkParameterIsNotNull(cVar, "badgeVO");
        Intrinsics.checkParameterIsNotNull(vVar, "miniIconVO");
        if (gVar.mo89009c() != null && gVar.mo89013e() == ImageKeyType.IMAGE) {
            aVar.mo88985a(gVar.mo89009c());
            aVar.mo88989b(gVar.mo89012d());
            aVar.mo88983a(gVar.mo89015g());
            aVar.mo88987b(gVar.mo89016h());
        }
        aVar.mo88988b(gVar.mo89014f());
        if (gVar.mo89018j()) {
            drawable = C0215a.m655b(context, R.drawable.shortcut_bg_urgent);
        } else {
            drawable = null;
        }
        aVar.mo88991c(drawable);
    }
}
