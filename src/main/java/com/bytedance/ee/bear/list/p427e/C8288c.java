package com.bytedance.ee.bear.list.p427e;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.ee.bear.list.e.c */
public class C8288c {

    /* renamed from: a */
    public static Queue<AbstractC8287b> f22422a = new LinkedList();

    /* renamed from: b */
    public static AbstractC8290a f22423b = new AbstractC8290a() {
        /* class com.bytedance.ee.bear.list.p427e.C8288c.C82891 */

        @Override // com.bytedance.ee.bear.list.p427e.C8288c.AbstractC8290a
        /* renamed from: a */
        public void mo32583a() {
            C13479a.m54764b("SpaceGuideManager", "onGuideFinish()...");
            AbstractC8287b poll = C8288c.f22422a.poll();
            if (poll == null) {
                C8288c.m34116b();
                return;
            }
            poll.mo32568a(C8288c.f22423b);
            poll.mo32576b();
        }
    };

    /* renamed from: c */
    static final /* synthetic */ boolean f22424c = true;

    /* renamed from: d */
    private static Activity f22425d;

    /* renamed from: e */
    private static View f22426e;

    /* renamed from: f */
    private static AbstractC8291b f22427f;

    /* renamed from: g */
    private static C1177w<AbstractC8287b> f22428g = new C1177w<>();

    /* renamed from: h */
    private static C1177w<Boolean> f22429h = new C1177w<>();

    /* renamed from: i */
    private static C1177w<Boolean> f22430i = new C1177w<>();

    /* renamed from: com.bytedance.ee.bear.list.e.c$a */
    public interface AbstractC8290a {
        /* renamed from: a */
        void mo32583a();
    }

    /* renamed from: com.bytedance.ee.bear.list.e.c$b */
    public interface AbstractC8291b {
        void onAllGuideFinish();
    }

    /* renamed from: a */
    public static void m34110a() {
        C13479a.m54764b("SpaceGuideManager", "beginGuide()");
        if (f22425d == null || f22422a.size() == 0) {
            m34116b();
            return;
        }
        f22426e = m34115b(f22425d);
        AbstractC8287b poll = f22422a.poll();
        if (f22424c || poll != null) {
            poll.mo32568a(f22423b);
            poll.mo32576b();
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    public static void m34117c() {
        C13479a.m54764b("SpaceGuideManager", "destroy()...");
        f22425d = null;
        f22422a.clear();
        f22428g.mo5929b((AbstractC8287b) null);
        f22429h.mo5929b((Boolean) false);
        f22430i.mo5929b((Boolean) false);
    }

    /* renamed from: b */
    public static void m34116b() {
        C13479a.m54764b("SpaceGuideManager", "finishGuide()...");
        AbstractC8291b bVar = f22427f;
        if (bVar != null) {
            bVar.onAllGuideFinish();
        }
        f22427f = null;
        f22428g.mo5926a((AbstractC8287b) null);
        Activity activity = f22425d;
        if (activity == null) {
            C13479a.m54758a("SpaceGuideManager", "Activity == null not remove transBg!!!!");
            return;
        }
        ((ViewGroup) activity.getWindow().getDecorView()).removeView(f22426e);
        f22426e = null;
        f22425d = null;
    }

    /* renamed from: a */
    public static void m34114a(AbstractC8291b bVar) {
        f22427f = bVar;
    }

    /* renamed from: a */
    public static void m34111a(Activity activity) {
        f22425d = activity;
        f22427f = null;
        f22422a.clear();
        f22428g.mo5929b((AbstractC8287b) null);
        f22429h.mo5929b((Boolean) false);
        f22430i.mo5929b((Boolean) false);
    }

    /* renamed from: b */
    private static View m34115b(Activity activity) {
        if (activity == null) {
            return null;
        }
        View view = new View(activity);
        view.setBackground(new ColorDrawable(activity.getResources().getColor(R.color.space_kit_trans)));
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ((ViewGroup) activity.getWindow().getDecorView()).addView(view);
        view.setOnClickListener($$Lambda$c$Y_yDaRY0fVblPzkXtq681ObA5Hs.INSTANCE);
        return view;
    }

    /* renamed from: a */
    public static void m34113a(AbstractC8287b bVar) {
        if (!f22422a.contains(bVar)) {
            f22422a.add(bVar);
            if (f22428g.mo5927b() == null) {
                f22428g.mo5929b(bVar);
            }
        }
    }
}
