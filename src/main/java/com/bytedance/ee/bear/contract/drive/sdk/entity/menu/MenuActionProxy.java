package com.bytedance.ee.bear.contract.drive.sdk.entity.menu;

import android.os.IBinder;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BaseMoreMenuAction;
import com.bytedance.ee.bear.contract.drive.sdk.entity.menu.BinderMenuAction;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;

public class MenuActionProxy implements AbstractC10952a<BaseMoreMenuAction.AbstractC5143a> {
    /* renamed from: a */
    public BaseMoreMenuAction.AbstractC5143a mo16349b(IBinder iBinder) {
        return BinderMenuAction.Stub.asInterface(iBinder);
    }
}
