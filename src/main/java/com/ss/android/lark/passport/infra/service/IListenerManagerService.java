package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.signinsdk_api.feature.listener.AbstractC49372a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/IListenerManagerService;", "", "registerUserListChangeListener", "", "listener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/OnUserListChangeListener;", "registerUserSwitchListener", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "unregisterUserListChangeListener", "unregisterUserSwitchListener", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.f */
public interface IListenerManagerService {
    void registerUserListChangeListener(AbstractC49372a aVar);

    void unregisterUserListChangeListener(AbstractC49372a aVar);
}
