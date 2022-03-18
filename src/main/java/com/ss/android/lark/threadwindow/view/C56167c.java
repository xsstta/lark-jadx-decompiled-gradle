package com.ss.android.lark.threadwindow.view;

import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC58999a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.view.c */
public class C56167c extends AbstractView$OnClickListenerC58999a<ThreadMessageVO> implements AbstractC56149a {

    /* renamed from: a */
    private final C1356d<ThreadMessageVO> f138948a = new C1356d<>(this, new C1374g.AbstractC1378c<ThreadMessageVO>() {
        /* class com.ss.android.lark.threadwindow.view.C56167c.C561681 */

        /* renamed from: a */
        public boolean areItemsTheSame(ThreadMessageVO threadMessageVO, ThreadMessageVO threadMessageVO2) {
            return C26247a.m94980a((AbstractC26248b) threadMessageVO, (AbstractC26248b) threadMessageVO2);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(ThreadMessageVO threadMessageVO, ThreadMessageVO threadMessageVO2) {
            return C26247a.m94983b(threadMessageVO, threadMessageVO2);
        }
    });

    @Override // com.ss.android.lark.threadwindow.view.AbstractC56149a
    /* renamed from: a */
    public List<ThreadMessageVO> mo191465a() {
        return this.f138948a.mo7374a();
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.threadwindow.view.AbstractC56149a
    public int getItemCount() {
        return this.f138948a.mo7374a().size();
    }

    @Override // com.ss.android.lark.threadwindow.view.AbstractC56149a
    /* renamed from: b */
    public void mo191469b() {
        List<ThreadMessageVO> a = mo191465a();
        int size = a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            ThreadMessageVO threadMessageVO = a.get(i);
            if (threadMessageVO.mo121667M()) {
                threadMessageVO.mo121693b(false);
                break;
            }
            i++;
        }
        if (i != -1) {
            notifyItemChanged(i);
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.AbstractC56149a
    /* renamed from: b */
    public ThreadMessageVO mo31276a(int i) {
        return this.f138948a.mo7374a().get(i);
    }

    @Override // com.ss.android.lark.threadwindow.view.AbstractC56149a
    /* renamed from: a */
    public void mo191467a(List<ThreadMessageVO> list) {
        this.f138948a.mo7376a(list);
    }

    @Override // com.ss.android.lark.threadwindow.view.AbstractC56149a
    /* renamed from: c */
    public int mo191470c(int i) {
        List<ThreadMessageVO> a = mo191465a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (a.get(i2).mo121717y() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.ss.android.lark.threadwindow.view.AbstractC56149a
    /* renamed from: a */
    public List<ThreadMessageVO> mo191466a(int i, int i2, boolean z) {
        List<ThreadMessageVO> a = mo191465a();
        ArrayList arrayList = new ArrayList();
        if (i < 0 || i2 < 0) {
            return arrayList;
        }
        if (z) {
            i2++;
        }
        if (i2 >= a.size()) {
            i2 = a.size();
        }
        if (i <= i2) {
            return a.subList(i, i2);
        }
        Log.m165382e("error in putMessageReadState, startIndex = [" + i + "], endIndex = [" + i2 + "]");
        return arrayList;
    }
}
