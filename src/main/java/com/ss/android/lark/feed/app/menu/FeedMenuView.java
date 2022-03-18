package com.ss.android.lark.feed.app.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.feed.C37262a;
import com.ss.android.lark.feed.app.menu.AbstractC37663e;
import com.ss.android.lark.feed.app.menu.BaseMenuAdapter;
import com.ss.android.lark.feed.app.menu.entity.MenuItem;
import com.ss.android.lark.feed.p1847a.C37264a;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FeedMenuView implements AbstractC37663e.AbstractC37666b {

    /* renamed from: a */
    AbstractC38037a.AbstractC38052l f96495a = C37268c.m146766b().mo139198q();

    /* renamed from: b */
    AbstractC38037a.AbstractC38038a f96496b = C37268c.m146766b().mo139155B();

    /* renamed from: c */
    public AbstractC37641a f96497c;

    /* renamed from: d */
    public List<MenuItem> f96498d = new ArrayList();

    /* renamed from: e */
    public List<MenuItem> f96499e = new ArrayList();

    /* renamed from: f */
    private Context f96500f;

    /* renamed from: g */
    private FeedTypeMenuAdapter f96501g;

    /* renamed from: h */
    private MenuItem.MenuType f96502h = MenuItem.MenuType.INBOX;

    /* renamed from: i */
    private C37659c f96503i;

    /* renamed from: j */
    private MenuItem.MenuType f96504j = MenuItem.MenuType.FILTER_ALL;

    /* renamed from: k */
    private AbstractC37663e.AbstractC37666b.AbstractC37667a f96505k;
    @BindView(6441)
    View mBackGrayView;
    @BindView(6417)
    RecyclerView mDrawerFilterRV;
    @BindView(6408)
    ViewGroup mFeedTypeDrawer;
    @BindView(6410)
    RecyclerView mFeedTypeRV;

    /* renamed from: com.ss.android.lark.feed.app.menu.FeedMenuView$a */
    public interface AbstractC37641a {
        /* renamed from: a */
        void mo138054a();

        /* renamed from: a */
        void mo138055a(FeedMenuView feedMenuView);

        /* renamed from: a */
        void mo138056a(MenuItem.MenuType menuType);

        /* renamed from: a */
        void mo138057a(MenuItem.MenuType menuType, MenuItem.MenuType menuType2);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    public void mo138069b() {
        AbstractC37641a aVar = this.f96497c;
        if (aVar != null) {
            aVar.mo138054a();
        }
    }

    /* renamed from: c */
    private void m148039c() {
        m148043e();
        m148045f();
        m148046g();
    }

    /* renamed from: e */
    private void m148043e() {
        View view = this.mBackGrayView;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.feed.app.menu.FeedMenuView.View$OnClickListenerC376371 */

                public void onClick(View view) {
                    FeedMenuView.this.f96497c.mo138054a();
                }
            });
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f96497c.mo138055a(this);
        m148039c();
    }

    /* renamed from: h */
    private List<MenuItem> m148047h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuItem(MenuItem.MenuType.INBOX, 0));
        arrayList.add(new MenuItem(MenuItem.MenuType.DONE, 0));
        return arrayList;
    }

    @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37666b
    /* renamed from: a */
    public void mo138065a() {
        if (this.f96502h == MenuItem.MenuType.DONE) {
            m148044e(MenuItem.MenuType.INBOX);
            AbstractC37641a aVar = this.f96497c;
            if (aVar != null) {
                aVar.mo138056a(MenuItem.MenuType.INBOX);
            }
        }
    }

    /* renamed from: f */
    private void m148045f() {
        this.f96499e = m148041d();
        this.f96503i = new C37659c();
        MenuItem.MenuType menuType = MenuItem.MenuType.FILTER_ALL;
        this.f96504j = menuType;
        this.f96503i.mo138046a(menuType);
        this.f96503i.mo138047a(this.f96499e);
        this.f96503i.mo138045a(new BaseMenuAdapter.AbstractC37634a() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuView.C376382 */

            @Override // com.ss.android.lark.feed.app.menu.BaseMenuAdapter.AbstractC37634a
            /* renamed from: a */
            public void mo138050a(View view, int i) {
                MenuItem.MenuType menuType = FeedMenuView.this.f96499e.get(i).f96555a;
                FeedMenuView.this.mo138069b();
                FeedMenuView.this.mo138070b(menuType);
            }
        });
        this.mDrawerFilterRV.setLayoutManager(new GridLayoutManager(this.f96500f, 3, 1, false));
        this.mDrawerFilterRV.setAdapter(this.f96503i);
    }

    /* renamed from: g */
    private void m148046g() {
        this.f96498d = m148047h();
        FeedTypeMenuAdapter feedTypeMenuAdapter = new FeedTypeMenuAdapter();
        this.f96501g = feedTypeMenuAdapter;
        feedTypeMenuAdapter.mo138046a(this.f96502h);
        this.f96501g.mo138047a(this.f96498d);
        this.f96501g.mo138045a(new BaseMenuAdapter.AbstractC37634a() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuView.C376393 */

            @Override // com.ss.android.lark.feed.app.menu.BaseMenuAdapter.AbstractC37634a
            /* renamed from: a */
            public void mo138050a(View view, int i) {
                MenuItem.MenuType menuType = FeedMenuView.this.f96498d.get(i).f96555a;
                FeedMenuView.this.mo138069b();
                FeedMenuView.this.mo138067a(menuType);
            }
        });
        this.mFeedTypeRV.setLayoutManager(new LinearLayoutManager(this.f96500f, 1, false));
        this.mFeedTypeRV.setAdapter(this.f96501g);
    }

    /* renamed from: d */
    private List<MenuItem> m148041d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_ALL, 0));
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_MESSAGE, 0));
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_DOC, 0));
        if (C37264a.m146755d()) {
            if (C37262a.m146726a().mo139168O()) {
                if (C37262a.m146726a().mo139169P()) {
                    arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_SECRET, 0));
                }
            } else if (this.f96495a.mo139256a("secretchat.main")) {
                arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_SECRET, 0));
            }
        }
        if (!this.f96496b.mo139209b()) {
            arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_CROSS_TENANT, 0));
        }
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_THREAD, 0));
        return arrayList;
    }

    /* renamed from: e */
    private void m148044e(MenuItem.MenuType menuType) {
        this.f96502h = menuType;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC37663e.AbstractC37666b.AbstractC37667a aVar) {
        this.f96505k = aVar;
    }

    /* renamed from: c */
    private void m148040c(MenuItem.MenuType menuType) {
        this.f96502h = menuType;
        this.f96501g.mo138046a(menuType);
        this.f96501g.notifyDataSetChanged();
        AbstractC37641a aVar = this.f96497c;
        if (aVar != null) {
            aVar.mo138056a(menuType);
        }
    }

    /* renamed from: d */
    private void m148042d(MenuItem.MenuType menuType) {
        this.f96504j = menuType;
        this.f96503i.mo138046a(menuType);
        this.f96503i.notifyDataSetChanged();
        AbstractC37641a aVar = this.f96497c;
        if (aVar != null) {
            aVar.mo138056a(menuType);
            this.f96497c.mo138057a(this.f96502h, this.f96504j);
        }
        AbstractC37663e.AbstractC37666b.AbstractC37667a aVar2 = this.f96505k;
        if (aVar2 != null) {
            aVar2.mo138093a();
        }
    }

    /* renamed from: a */
    public void mo138067a(MenuItem.MenuType menuType) {
        if (menuType != this.f96502h) {
            int i = C376404.f96509a[menuType.ordinal()];
            if (i == 1) {
                m148040c(MenuItem.MenuType.INBOX);
            } else if (i == 2) {
                m148040c(MenuItem.MenuType.DONE);
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37666b
    /* renamed from: a */
    public void mo138068a(Map<Integer, Integer> map) {
        if (map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())) != null) {
            this.f96498d.get(0).f96556b = map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue();
            this.f96501g.notifyDataSetChanged();
        }
        if (map.get(Integer.valueOf(FeedCard.FeedType.DONE.getNumber())) != null) {
            this.f96498d.get(1).f96556b = map.get(Integer.valueOf(FeedCard.FeedType.DONE.getNumber())).intValue();
            this.f96501g.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo138070b(MenuItem.MenuType menuType) {
        if (menuType != this.f96504j) {
            switch (menuType) {
                case FILTER_ALL:
                    m148042d(MenuItem.MenuType.FILTER_ALL);
                    return;
                case FILTER_MESSAGE:
                    m148042d(MenuItem.MenuType.FILTER_MESSAGE);
                    return;
                case FILTER_DOC:
                    m148042d(MenuItem.MenuType.FILTER_DOC);
                    return;
                case FILTER_SECRET:
                    m148042d(MenuItem.MenuType.FILTER_SECRET);
                    return;
                case FILTER_CROSS_TENANT:
                    m148042d(MenuItem.MenuType.FILTER_CROSS_TENANT);
                    return;
                case FILTER_THREAD:
                    m148042d(MenuItem.MenuType.FILTER_THREAD);
                    return;
                default:
                    return;
            }
        }
    }

    public FeedMenuView(AbstractC37641a aVar, Context context) {
        this.f96497c = aVar;
        this.f96500f = context;
    }
}
