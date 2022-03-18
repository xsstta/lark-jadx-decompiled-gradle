package com.lynx.jsbridge;

import com.lynx.tasm.behavior.AbstractC26684l;

public class LynxContextModule extends LynxModule {
    protected AbstractC26684l mLynxContext;

    public LynxContextModule(AbstractC26684l lVar) {
        super(lVar);
        this.mLynxContext = lVar;
    }

    public LynxContextModule(AbstractC26684l lVar, Object obj) {
        super(lVar, obj);
        this.mLynxContext = lVar;
    }
}
