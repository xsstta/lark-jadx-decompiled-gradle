package com.ss.android.lark.thirdshare.base.impl;

import android.content.Context;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b;

@ClaymoreImpl(AbstractC55699a.class)
public class ThirdShareBaseApiImpl implements AbstractC55699a {
    private AbstractC55700b mDep;

    @Override // com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a
    public AbstractC55700b getDep() {
        return this.mDep;
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a
    public void init(AbstractC55700b bVar) {
        if (bVar != null) {
            this.mDep = bVar;
        }
    }

    @Override // com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a
    public void share(Context context, ShareEntity shareEntity) {
        C55680a.m215699a(context, shareEntity);
    }
}
