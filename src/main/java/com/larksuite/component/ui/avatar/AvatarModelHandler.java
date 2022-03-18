package com.larksuite.component.ui.avatar;

import android.content.Context;
import com.larksuite.component.ui.avatar.FeedAvatarModel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/larksuite/component/ui/avatar/AvatarModelHandler;", "T", "Lcom/larksuite/component/ui/avatar/FeedAvatarModel;", "", "handle", "", "context", "Landroid/content/Context;", "model", "avatarVO", "Lcom/larksuite/component/ui/avatar/AvatarIconViewData;", "badgeVO", "Lcom/larksuite/component/ui/avatar/BadgeViewData;", "miniIconVO", "Lcom/larksuite/component/ui/avatar/MiniIconViewData;", "(Landroid/content/Context;Lcom/larksuite/component/ui/avatar/FeedAvatarModel;Lcom/larksuite/component/ui/avatar/AvatarIconViewData;Lcom/larksuite/component/ui/avatar/BadgeViewData;Lcom/larksuite/component/ui/avatar/MiniIconViewData;)V", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.avatar.b */
public interface AvatarModelHandler<T extends FeedAvatarModel> {
    /* renamed from: a */
    void mo88998a(Context context, T t, AvatarIconViewData aVar, BadgeViewData cVar, MiniIconViewData vVar);
}
