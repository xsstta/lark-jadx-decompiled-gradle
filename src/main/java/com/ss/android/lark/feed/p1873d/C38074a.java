package com.ss.android.lark.feed.p1873d;

import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.feed.d.a */
public class C38074a {

    /* renamed from: a */
    public static volatile RecyclerView f97696a;

    /* renamed from: b */
    public static final ConcurrentHashMap<String, Runnable> f97697b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final RecyclerView.OnScrollListener f97698c = new RecyclerView.OnScrollListener() {
        /* class com.ss.android.lark.feed.p1873d.C38074a.C380751 */

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                C38074a.m149793b();
            }
        }
    };

    /* renamed from: a */
    public static void m149790a() {
        if (f97696a != null) {
            f97696a.removeOnScrollListener(f97698c);
            f97696a = null;
        }
    }

    /* renamed from: b */
    public static void m149793b() {
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.feed.p1873d.C38074a.RunnableC380762 */

            public void run() {
                if (C38074a.f97696a == null) {
                    C38074a.f97697b.clear();
                    return;
                }
                for (Map.Entry<String, Runnable> entry : C38074a.f97697b.entrySet()) {
                    Log.m165379d("FeedCallbackExecutor", "flush Runnable " + entry.getKey());
                    entry.getValue().run();
                }
                C38074a.f97697b.clear();
            }
        });
    }

    /* renamed from: a */
    public static void m149791a(RecyclerView recyclerView) {
        f97696a = recyclerView;
        f97696a.addOnScrollListener(f97698c);
    }

    /* renamed from: a */
    public static void m149792a(String str, Runnable runnable) {
        if (f97696a == null || f97696a.getScrollState() == 0) {
            UICallbackExecutor.execute(runnable);
        } else {
            f97697b.put(str, runnable);
        }
    }
}
