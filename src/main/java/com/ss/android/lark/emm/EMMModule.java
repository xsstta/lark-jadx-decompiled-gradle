package com.ss.android.lark.emm;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.ss.android.lark.emm.p1827a.AbstractC37003a;
import com.ss.android.lark.emm.p1827a.AbstractC37004b;
import com.ss.android.lark.emm.p1827a.AbstractC37005c;
import com.ss.android.lark.emm.p1827a.AbstractC37006d;

@ClaymoreImpl(AbstractC37005c.class)
public class EMMModule implements AbstractC37005c {
    @Override // com.ss.android.lark.emm.p1827a.AbstractC37005c
    public AbstractC37003a getEMMApplication() {
        return new C37002a();
    }

    @Override // com.ss.android.lark.emm.p1827a.AbstractC37005c
    public AbstractC37006d getEMMService() {
        return new C37007b();
    }

    public static AbstractC37004b getDependency() {
        return (AbstractC37004b) ClaymoreServiceLoader.loadFirst(AbstractC37004b.class);
    }
}
