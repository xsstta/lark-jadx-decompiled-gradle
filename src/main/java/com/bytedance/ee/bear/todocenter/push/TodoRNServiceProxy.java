package com.bytedance.ee.bear.todocenter.push;

import android.os.IBinder;
import com.bytedance.ee.bear.service.remote.AbstractC10952a;
import com.bytedance.ee.bear.todocenter.push.BinderTodoRNService;

public class TodoRNServiceProxy implements AbstractC10952a<AbstractC11711d> {
    /* renamed from: a */
    public AbstractC11711d mo16349b(IBinder iBinder) {
        return BinderTodoRNService.Stub.asInterface(iBinder);
    }
}
