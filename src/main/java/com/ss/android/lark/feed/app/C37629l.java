package com.ss.android.lark.feed.app;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.app.l */
public class C37629l implements UIFeedCard.DataObserver {

    /* renamed from: b */
    private static final Object f96471b = new Object();

    /* renamed from: a */
    public WeakReference<FeedListAdapter> f96472a;

    /* renamed from: c */
    private ConcurrentHashMap<String, Object> f96473c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private Handler f96474d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138042a() {
        Iterator<String> it = this.f96473c.keySet().iterator();
        final HashSet hashSet = new HashSet();
        while (it.hasNext()) {
            hashSet.add(it.next());
            it.remove();
        }
        this.f96474d.post(new Runnable() {
            /* class com.ss.android.lark.feed.app.C37629l.RunnableC376301 */

            public void run() {
                C37629l.this.f96472a.get().mo138938a(hashSet);
            }
        });
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard.DataObserver
    public void onChanged(String str) {
        this.f96473c.put(str, f96471b);
        mo138042a();
    }

    public C37629l(FeedListAdapter feedListAdapter) {
        this.f96472a = new WeakReference<>(feedListAdapter);
        this.f96474d = new Handler(Looper.getMainLooper());
    }
}
