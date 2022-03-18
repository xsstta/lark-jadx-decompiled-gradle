package com.ss.android.lark.mail.impl.mulprocess.mainprocess.imp;

import android.content.Context;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.mulprocess.C43214c;
import com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle;
import com.ss.android.lark.mail.impl.mulprocess.webprocess.C43227b;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;

@RemoteServiceImpl(service = IWebProcessLifecycle.class)
public class WebProcessLifecycleImp implements IWebProcessLifecycle {
    private Context mContext;

    @Override // com.ss.android.lark.mail.impl.mulprocess.mainprocess.IWebProcessLifecycle
    public void onProcessCreated() {
        C43227b.f109992b = true;
        C43214c.m171784a();
        Log.m165388i("onProcessCreated");
    }

    public WebProcessLifecycleImp(Context context) {
        this.mContext = context;
    }
}
