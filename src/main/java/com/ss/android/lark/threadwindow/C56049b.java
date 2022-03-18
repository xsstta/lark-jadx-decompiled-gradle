package com.ss.android.lark.threadwindow;

import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.core.model.AbstractC33964i;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.threadwindow.C56119j;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.threadwindow.b */
public class C56049b {

    /* renamed from: a */
    Map<Integer, C33955c<ThreadMessageVO, ThreadInfo>> f138589a = new HashMap();

    /* renamed from: a */
    public C33955c<ThreadMessageVO, ThreadInfo> mo191104a(int i) {
        return this.f138589a.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C33955c<ThreadMessageVO, ThreadInfo> mo191105a(AbstractC33964i<ThreadInfo> iVar, C56119j.C56144b bVar, List<C33955c.AbstractC33956a<ThreadMessageVO<?>>> list) {
        C33955c<ThreadMessageVO, ThreadInfo> cVar = new C33955c<>(iVar, bVar, list);
        this.f138589a.put(Integer.valueOf(bVar.mo191456a()), cVar);
        return cVar;
    }
}
