package com.ss.android.lark.chatsetting.impl.group.setting;

import com.ss.android.eventbus.BaseEvent;
import com.ss.android.eventbus.BaseEventListener;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.ThreadMode;

public final class GroupSettingModel_Subscriber {
    public static void register(final Object obj) {
        EventBus.getDefault().register(obj, C34973m.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel_Subscriber.C349191 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupSettingModel) obj).onOnlyOwnerEditGroupInfoStateUpdated((C34973m) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C34971k.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel_Subscriber.C349202 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupSettingModel) obj).onOnlyOwnerAddMemberPermissionUpdated((C34971k) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C34972l.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel_Subscriber.C349213 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupSettingModel) obj).onOnlyOwnerAtAllPermissionUpdated((C34972l) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C34970j.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel_Subscriber.C349224 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupSettingModel) obj).onShareCardPermissionUpdated((C34970j) baseEvent);
            }
        }, ThreadMode.MAIN);
        EventBus.getDefault().register(obj, C34941c.class, new BaseEventListener() {
            /* class com.ss.android.lark.chatsetting.impl.group.setting.GroupSettingModel_Subscriber.C349235 */

            @Override // com.ss.android.eventbus.IEventListener, com.ss.android.eventbus.BaseEventListener
            public void onEvent(BaseEvent baseEvent) {
                ((GroupSettingModel) obj).onGroupAllowAnonymityUpdated((C34941c) baseEvent);
            }
        }, ThreadMode.MAIN);
    }
}
