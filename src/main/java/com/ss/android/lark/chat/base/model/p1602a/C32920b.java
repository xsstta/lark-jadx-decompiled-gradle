package com.ss.android.lark.chat.base.model.p1602a;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.aj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.base.model.a.b */
public class C32920b extends AbstractC1142af {
    private List<AbstractC32921a> mActionHandlers = new ArrayList();

    /* renamed from: com.ss.android.lark.chat.base.model.a.b$a */
    public interface AbstractC32921a {
        boolean onAction(AbstractC32919a aVar);
    }

    public void unregisterActionHandler(AbstractC32921a aVar) {
        this.mActionHandlers.remove(aVar);
    }

    public static C32920b from(FragmentActivity fragmentActivity) {
        return (C32920b) aj.m5366a(fragmentActivity).mo6005a(C32920b.class);
    }

    public void registerActionListener(AbstractC32921a aVar) {
        if (!this.mActionHandlers.contains(aVar)) {
            this.mActionHandlers.add(aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatch(com.ss.android.lark.chat.base.model.p1602a.AbstractC32919a r3) {
        /*
            r2 = this;
            java.util.List<com.ss.android.lark.chat.base.model.a.b$a> r0 = r2.mActionHandlers
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0020
            java.util.List<com.ss.android.lark.chat.base.model.a.b$a> r0 = r2.mActionHandlers
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            com.ss.android.lark.chat.base.model.a.b$a r1 = (com.ss.android.lark.chat.base.model.p1602a.C32920b.AbstractC32921a) r1
            boolean r1 = r1.onAction(r3)
            if (r1 == 0) goto L_0x000e
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.base.model.p1602a.C32920b.dispatch(com.ss.android.lark.chat.base.model.a.a):void");
    }

    public <Result> Result dispatchSyncQuery(AbstractC32924e<?, Result> eVar) {
        if (this.mActionHandlers.isEmpty()) {
            return null;
        }
        for (AbstractC32921a aVar : this.mActionHandlers) {
            if (aVar.onAction(eVar)) {
                return eVar.mo121564b();
            }
        }
        return null;
    }
}
