package com.larksuite.component.ui.dependence;

import com.larksuite.component.ui.avatar.AvatarType;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\rJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/larksuite/component/ui/dependence/IChatterAvatarService;", "", "checkAvatar", "", "id", "", "avatarKey", ShareHitPoint.f121869d, "Lcom/larksuite/component/ui/avatar/AvatarType;", "registerAvatarChangeListener", "callback", "Lcom/larksuite/component/ui/dependence/IChatterAvatarService$OnAvatarChangeListener;", "unRegisterAvatarChangeListener", "OnAvatarChangeListener", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.ui.d.b */
public interface IChatterAvatarService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/larksuite/component/ui/dependence/IChatterAvatarService$OnAvatarChangeListener;", "", "isValid", "", "onPushChange", "", "id", "", "avatarKey", "avatar-badge_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.ui.d.b$a */
    public interface OnAvatarChangeListener {
        /* renamed from: a */
        void mo89088a(String str, String str2);

        /* renamed from: a */
        boolean mo89089a();
    }

    /* renamed from: a */
    void mo89176a(String str, OnAvatarChangeListener aVar);

    /* renamed from: a */
    void mo89177a(String str, String str2, AvatarType avatarType);

    /* renamed from: b */
    void mo89178b(String str, OnAvatarChangeListener aVar);
}
