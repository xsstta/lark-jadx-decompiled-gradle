package com.ss.android.lark.threadwindow.p2760a.p2761a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.chatwindow.chat.data.convert.textprocess.TextLayoutProcessor;
import com.ss.android.lark.chat.core.model.C33952a;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.BaseTextContent;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.threadwindow.p2760a.p2763c.C56029a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.a.a.h */
public class C56015h extends AbstractC34417b<ThreadInfo, C56029a> {

    /* renamed from: a */
    public List<MessageInfo> f138497a = new ArrayList();

    /* renamed from: i */
    public int f138498i = 0;

    /* renamed from: j */
    public int f138499j = 0;

    /* renamed from: k */
    private final AbstractC56017a f138500k;

    /* renamed from: l */
    private String f138501l;

    /* renamed from: m */
    private Context f138502m;

    /* renamed from: n */
    private int f138503n = Integer.MAX_VALUE;

    /* renamed from: o */
    private final boolean f138504o;

    /* renamed from: p */
    private boolean f138505p = true;

    /* renamed from: com.ss.android.lark.threadwindow.a.a.h$a */
    public interface AbstractC56017a {
        /* renamed from: a */
        int mo191045a();

        /* renamed from: b */
        void mo191046b();

        /* renamed from: c */
        void mo191047c();

        /* renamed from: d */
        int mo191048d();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: c */
    public String mo122942c() {
        return "ThreadWindowDataStore";
    }

    /* renamed from: b */
    public int mo122940b() {
        return this.f138503n;
    }

    /* renamed from: n */
    private boolean m217897n() {
        return !DesktopUtil.m144301a(UIHelper.getContext());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: a */
    public void mo122933a() {
        this.f88887g = new AbstractC34417b.AbstractC34420b<ThreadInfo, C56029a>() {
            /* class com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h.C560161 */

            /* renamed from: a */
            public void mo122953a(ThreadInfo threadInfo) {
            }

            /* renamed from: a */
            public void mo122955a(List<ThreadInfo> list, C56029a aVar) {
                if (aVar != null) {
                    if (CollectionUtils.isNotEmpty(aVar.mo191066e())) {
                        C56015h.this.f138497a = aVar.mo191066e();
                    }
                    if (aVar.mo191062a() > 0) {
                        C56015h.this.f138498i = aVar.mo191062a();
                    }
                    if (aVar.mo191067f() > 0) {
                        C56015h.this.f138499j = aVar.mo191067f();
                    }
                }
            }
        };
    }

    /* renamed from: p */
    private boolean m217899p() {
        mo127141m();
        Iterator it = this.f88882b.iterator();
        while (it.hasNext()) {
            ThreadInfo threadInfo = (ThreadInfo) it.next();
            if (threadInfo.canShow() && !threadInfo.isNoTraceDelete() && threadInfo.mo126021c().getType() != Message.Type.SYSTEM) {
                return false;
            }
        }
        Log.m165389i("ThreadWindowDataStore", "FirstScreenData is all system data");
        return true;
    }

    /* renamed from: o */
    private boolean m217898o() {
        boolean z;
        mo127141m();
        if (C29990c.m110930b().mo134586n().mo134685a("group.dynamic.request.count")) {
            return false;
        }
        Iterator it = this.f88882b.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((ThreadInfo) it.next()).canShow()) {
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FirstScreenData show count not enough：");
        if (i < this.f138500k.mo191048d()) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        Log.m165389i("ThreadWindowDataStore", sb.toString());
        if (i < this.f138500k.mo191048d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo191033a(boolean z) {
        this.f138505p = z;
    }

    /* renamed from: c */
    public synchronized void mo191038c(int i) {
        this.f138498i = i;
    }

    /* renamed from: d */
    public synchronized void mo191040d(int i) {
        this.f138499j = i;
    }

    /* renamed from: g */
    private void m217894g(C33952a<ThreadInfo> aVar) {
        this.f88909h.execute(new Runnable(aVar) {
            /* class com.ss.android.lark.threadwindow.p2760a.p2761a.$$Lambda$h$KxlRyile9ofi8VdSoMlIu32Sds */
            public final /* synthetic */ C33952a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C56015h.this.m217895h((C56015h) this.f$1);
            }
        });
    }

    /* renamed from: b */
    public void mo191034b(int i) {
        this.f138503n = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo122939b(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo122932a(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().getBadgeCount();
    }

    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: f */
    public void mo191042f(C33952a<ThreadInfo> aVar) {
        this.f88909h.execute(new Runnable(aVar) {
            /* class com.ss.android.lark.threadwindow.p2760a.p2761a.$$Lambda$h$MP4OhrRfOVvOLRInZVJTX_Wa5o */
            public final /* synthetic */ C33952a f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C56015h.this.m217896i((C56015h) this.f$1);
            }
        });
    }

    /* renamed from: b */
    public void mo191035b(String str) {
        this.f138501l = str;
    }

    /* renamed from: a */
    public void mo122936a(C56029a aVar) {
        if (this.f138504o) {
            m217894g(aVar);
        } else {
            mo191042f(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo122944c(ThreadInfo threadInfo) {
        if (this.f138500k.mo191045a() != 0) {
            return true;
        }
        String recallerId = threadInfo.mo126021c().getRecallerId();
        if (!TextUtils.isEmpty(recallerId)) {
            return recallerId.equals(this.f138501l);
        }
        return threadInfo.mo126021c().isFromMe();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122948e(ThreadInfo threadInfo) {
        int c = mo122939b(threadInfo);
        if (threadInfo.isPreMessage() || this.f88882b.size() == 0 || c > mo127117f()) {
            super.mo122948e((AbstractC34006a) threadInfo);
            return;
        }
        for (int i = 0; i < this.f88882b.size(); i++) {
            int c2 = mo122939b((ThreadInfo) this.f88882b.get(i));
            if (c2 > c) {
                Log.m165389i("ThreadWindowDataStore", "appendNewItem into position:" + i + ", newItemPosition is" + c + ", nextPosition is:" + c2);
                this.f88882b.add(i, threadInfo);
                return;
            }
        }
        Log.m165397w("ThreadWindowDataStore", "appendNewItem, can't find insert position, append to last position");
        super.mo122948e((AbstractC34006a) threadInfo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo122949f(ThreadInfo threadInfo) {
        super.mo122949f(threadInfo);
        if (m217897n() && this.f138505p) {
            if (threadInfo.getMessage().getType() == Message.Type.TEXT || threadInfo.getMessage().getType() == Message.Type.POST) {
                ((BaseTextContent) threadInfo.getMessage().getContent()).setContentLayout(TextLayoutProcessor.m128385a(threadInfo, TextLayoutProcessor.m128387a().mo122463a(18), this.f138502m));
                if (threadInfo.getTranslateInfo() != null) {
                    ((BaseTextContent) threadInfo.getTranslateInfo().getTranslateContent()).setContentLayout(TextLayoutProcessor.m128385a(threadInfo, TextLayoutProcessor.m128387a().mo122483i(true).mo122463a(18), this.f138502m));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m217895h(C33952a aVar) {
        boolean z;
        if (mo127116e(aVar)) {
            this.f88882b.beginUpdate();
            int size = this.f88882b.size() - 1;
            for (ThreadInfo threadInfo : aVar.mo124058b()) {
                int c = mo122939b(threadInfo);
                if (this.f88882b.containsKey(threadInfo.getId())) {
                    Log.m165389i(mo122942c(), "contains missing pos:" + c);
                } else {
                    this.f88883c = Math.min(c, this.f88883c);
                    this.f88884d = Math.max(c, this.f88884d);
                    int i = size;
                    while (true) {
                        if (i < 0) {
                            z = false;
                            break;
                        } else if (mo122939b((ThreadInfo) this.f88882b.get(i)) > c) {
                            this.f88882b.add(i + 1, threadInfo);
                            Log.m165389i(mo122942c(), "insert into:" + i);
                            size = i;
                            z = true;
                            break;
                        } else {
                            i--;
                        }
                    }
                    if (!z) {
                        this.f88882b.add(0, threadInfo);
                        Log.m165389i(mo122942c(), "insert into first pos");
                        size = -1;
                    }
                }
            }
            for (Integer num : aVar.mo124060c()) {
                this.f88883c = Math.min(num.intValue(), this.f88883c);
                this.f88884d = Math.max(num.intValue(), this.f88884d);
            }
            Log.m165389i(mo122942c(), "Merge Missing Message, current position range is:[" + this.f88883c + ", " + this.f88884d + "]");
            this.f88882b.finishUpdate();
            if (m217899p() || m217898o()) {
                this.f138500k.mo191046b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m217896i(C33952a aVar) {
        if (mo127116e(aVar)) {
            this.f88882b.beginUpdate();
            int i = 0;
            for (ThreadInfo threadInfo : aVar.mo124058b()) {
                int c = mo122939b(threadInfo);
                String id = threadInfo.getId();
                boolean z = true;
                if (this.f88882b.containsKey(id)) {
                    String c2 = mo122942c();
                    Log.m165389i(c2, "contains missing pos:" + c);
                } else {
                    this.f88883c = Math.min(c, this.f88883c);
                    this.f88884d = Math.max(c, this.f88884d);
                    int i2 = i;
                    while (true) {
                        if (i2 >= this.f88882b.size()) {
                            z = false;
                            break;
                        } else if (mo122939b((ThreadInfo) this.f88882b.get(i2)) > c) {
                            this.f88882b.add(i2, threadInfo);
                            String c3 = mo122942c();
                            Log.m165389i(c3, "insert into:" + i2);
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z) {
                        this.f88882b.add(threadInfo);
                        Log.m165389i(mo122942c(), "insert into last pos");
                        i = this.f88882b.size();
                    }
                }
            }
            for (Integer num : aVar.mo124060c()) {
                this.f88883c = Math.min(num.intValue(), this.f88883c);
                this.f88884d = Math.max(num.intValue(), this.f88884d);
            }
            String c4 = mo122942c();
            Log.m165389i(c4, "Merge Missing Message, current position range:[" + this.f88883c + ", " + this.f88884d + "]");
            this.f88882b.finishUpdate();
            if (m217899p()) {
                Log.m165389i("ThreadWindowDataStore", "FirstScreenData is all system data");
                this.f138500k.mo191047c();
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo122938a(List<MessageInfo> list) {
        this.f138497a = list;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: a */
    public void mo127104a(String str, C33952a<ThreadInfo> aVar) {
        int i;
        if (this.f138504o) {
            int size = this.f88882b.size();
            int i2 = 0;
            if (size > 0) {
                i = mo122932a((ThreadInfo) this.f88882b.get(size - 1));
            } else {
                i = 0;
            }
            if (size > 0) {
                i2 = mo122932a((ThreadInfo) this.f88882b.get(0));
            }
            String c = mo122942c();
            Log.m165389i(c, "DataStore " + str + ", size is:" + aVar.mo124058b().size() + "， current position range is:[" + this.f88883c + ", " + this.f88884d + "], current badge range is:[" + i + ", " + i2 + "]");
            return;
        }
        super.mo127104a(str, aVar);
    }

    public C56015h(C33958d dVar, AbstractC34417b.AbstractC34423e eVar, AbstractC56017a aVar, Context context) {
        super(dVar, eVar);
        this.f138500k = aVar;
        this.f138504o = C56145l.m218886a();
        this.f138502m = context;
    }
}
