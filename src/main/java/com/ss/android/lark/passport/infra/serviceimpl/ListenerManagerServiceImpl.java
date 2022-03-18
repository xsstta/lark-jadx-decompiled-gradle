package com.ss.android.lark.passport.infra.serviceimpl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.passport.infra.listenermanage.UserListChangeListenerManager;
import com.ss.android.lark.passport.infra.listenermanage.UserSwitchListenerManager;
import com.ss.android.lark.passport.infra.service.IListenerManagerService;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.AbstractC49372a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import kotlin.Metadata;

@ClaymoreImpl(IListenerManagerService.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/passport/infra/serviceimpl/ListenerManagerServiceImpl;", "Lcom/ss/android/lark/passport/infra/service/IListenerManagerService;", "()V", "registerUserListChangeListener", "", "listener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/OnUserListChangeListener;", "registerUserSwitchListener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "unregisterUserListChangeListener", "unregisterUserSwitchListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ListenerManagerServiceImpl implements IListenerManagerService {
    @Override // com.ss.android.lark.passport.infra.service.IListenerManagerService
    public void registerUserListChangeListener(AbstractC49372a aVar) {
        UserListChangeListenerManager.m193639a(aVar);
    }

    public void registerUserSwitchListener(AbstractC49379a aVar) {
        UserSwitchListenerManager.m193648a(aVar);
    }

    @Override // com.ss.android.lark.passport.infra.service.IListenerManagerService
    public void unregisterUserListChangeListener(AbstractC49372a aVar) {
        UserListChangeListenerManager.m193641b(aVar);
    }

    public void unregisterUserSwitchListener(AbstractC49379a aVar) {
        UserSwitchListenerManager.m193650b(aVar);
    }
}
