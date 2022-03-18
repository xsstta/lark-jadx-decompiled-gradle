package com.ss.android.lark.feed.app;

import android.os.Handler;
import androidx.recyclerview.widget.C1374g;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.app.a */
public class C37284a {

    /* renamed from: a */
    AbstractC37287b f95765a;

    /* renamed from: b */
    boolean f95766b;

    /* renamed from: c */
    public UpdateRecord f95767c;

    /* renamed from: d */
    public RunnableC37285a f95768d;

    /* renamed from: e */
    public FeedListAdapter f95769e;

    /* renamed from: f */
    public Handler f95770f = new Handler(CoreThreadPool.getSerialTaskHandler().getLooper());

    /* renamed from: com.ss.android.lark.feed.app.a$b */
    public interface AbstractC37287b {
        /* renamed from: a */
        void mo137114a(C1374g.C1377b bVar, UpdateRecord updateRecord);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.a$a */
    public class RunnableC37285a implements Runnable {

        /* renamed from: a */
        List<UIFeedCard> f95771a;

        /* renamed from: b */
        UpdateRecord f95772b;

        public void run() {
            final C1374g.C1377b a = C1374g.m6298a(new C37294b(this.f95771a, this.f95772b.mo138376c(), this.f95772b.mo138383j(), this.f95772b.mo138382i()), false);
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.feed.app.C37284a.RunnableC37285a.RunnableC372861 */

                public void run() {
                    if (C37284a.this.f95766b) {
                        C37284a.this.f95766b = false;
                    } else if (C37284a.this.f95765a != null) {
                        C37284a.this.f95765a.mo137114a(a, RunnableC37285a.this.f95772b);
                    }
                    if (C37284a.this.f95767c != null) {
                        ArrayList arrayList = new ArrayList();
                        new ArrayList();
                        arrayList.addAll(C37284a.this.f95769e.getItems());
                        C37284a.this.f95768d = new RunnableC37285a(arrayList, C37284a.this.f95767c);
                        C37284a.this.f95770f.post(C37284a.this.f95768d);
                        C37284a.this.f95767c = null;
                        return;
                    }
                    C37284a.this.f95768d = null;
                }
            });
        }

        public RunnableC37285a(List<UIFeedCard> list, UpdateRecord updateRecord) {
            this.f95771a = list;
            this.f95772b = updateRecord;
        }
    }

    /* renamed from: a */
    public void mo137109a(AbstractC37287b bVar) {
        this.f95765a = bVar;
    }

    /* renamed from: a */
    public void mo137111a(boolean z) {
        this.f95766b = z;
    }

    public C37284a(FeedListAdapter feedListAdapter) {
        this.f95769e = feedListAdapter;
    }

    /* renamed from: a */
    public void mo137110a(UpdateRecord updateRecord) {
        if (this.f95768d == null) {
            this.f95766b = false;
            this.f95767c = null;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f95769e.getItems());
            RunnableC37285a aVar = new RunnableC37285a(arrayList, updateRecord);
            this.f95768d = aVar;
            this.f95770f.post(aVar);
            return;
        }
        this.f95767c = updateRecord;
    }
}
