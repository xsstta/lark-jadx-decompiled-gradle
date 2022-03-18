package com.lynx.jsbridge;

import android.content.Context;

public abstract class LynxModule {
    protected Context mContext;
    protected Object mParam;

    public LynxModule(Context context) {
        this(context, null);
    }

    public LynxModule(Context context, Object obj) {
        this.mContext = context;
        this.mParam = obj;
    }
}
