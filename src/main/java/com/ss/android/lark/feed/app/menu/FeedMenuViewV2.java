package com.ss.android.lark.feed.app.menu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

public class FeedMenuViewV2 implements AbstractC37663e.AbstractC37666b {

    /* renamed from: a */
    AbstractC38037a.AbstractC38052l f96510a = C37268c.m146766b().mo139198q();

    /* renamed from: b */
    AbstractC38037a.AbstractC38038a f96511b = C37268c.m146766b().mo139155B();

    /* renamed from: c */
    public AbstractC37646a f96512c;

    /* renamed from: d */
    public List<MenuItem> f96513d = new ArrayList();

    /* renamed from: e */
    public List<MenuItem> f96514e = new ArrayList();

    /* renamed from: f */
    private Context f96515f;

    /* renamed from: g */
    private FeedTypeMenuAdapterV2 f96516g;

    /* renamed from: h */
    private MenuItem.MenuType f96517h = MenuItem.MenuType.INBOX;

    /* renamed from: i */
    private MenuItem.MenuType f96518i = MenuItem.MenuType.INBOX;

    /* renamed from: j */
    private MenuItem.MenuType f96519j = MenuItem.MenuType.FILTER_ALL;

    /* renamed from: k */
    private FilterTypeMenuAdapterV2 f96520k;

    /* renamed from: l */
    private MenuItem.MenuType f96521l = MenuItem.MenuType.FILTER_ALL;

    /* renamed from: m */
    private AbstractC37663e.AbstractC37666b.AbstractC37667a f96522m;
    @BindView(6441)
    View mBackGrayView;
    @BindView(6417)
    RecyclerView mDrawerFilterRV;
    @BindView(6408)
    ViewGroup mFeedTypeDrawer;
    @BindView(6410)
    RecyclerView mFeedTypeRV;

    /* renamed from: com.ss.android.lark.feed.app.menu.FeedMenuViewV2$a */
    public interface AbstractC37646a {
        /* renamed from: a */
        void mo138061a();

        /* renamed from: a */
        void mo138062a(FeedMenuViewV2 feedMenuViewV2);

        /* renamed from: a */
        void mo138063a(MenuItem.MenuType menuType, MenuItem.MenuType menuType2);

        /* renamed from: b */
        void mo138064b(MenuItem.MenuType menuType, MenuItem.MenuType menuType2);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: b */
    public void mo138074b() {
        AbstractC37646a aVar = this.f96512c;
        if (aVar != null) {
            aVar.mo138061a();
        }
    }

    /* renamed from: c */
    private void m148060c() {
        m148064e();
        m148066f();
        m148067g();
    }

    /* renamed from: e */
    private void m148064e() {
        this.mBackGrayView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuViewV2.View$OnClickListenerC376421 */

            public void onClick(View view) {
                FeedMenuViewV2.this.f96512c.mo138061a();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f96512c.mo138062a(this);
        m148060c();
    }

    /* renamed from: h */
    private List<MenuItem> m148068h() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuItem(MenuItem.MenuType.INBOX, 0));
        arrayList.add(new MenuItem(MenuItem.MenuType.DONE, 0));
        return arrayList;
    }

    @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37666b
    /* renamed from: a */
    public void mo138065a() {
        if (this.f96517h == MenuItem.MenuType.DONE) {
            m148065e(MenuItem.MenuType.INBOX);
            AbstractC37646a aVar = this.f96512c;
            if (aVar != null) {
                aVar.mo138063a(MenuItem.MenuType.INBOX, MenuItem.MenuType.FILTER_ALL);
            }
        }
    }

    /* renamed from: f */
    private void m148066f() {
        this.f96514e = m148062d();
        this.f96520k = new FilterTypeMenuAdapterV2();
        MenuItem.MenuType menuType = MenuItem.MenuType.FILTER_ALL;
        this.f96521l = menuType;
        this.f96520k.mo138046a(menuType);
        this.f96520k.mo138047a(this.f96514e);
        this.f96520k.mo138045a(new BaseMenuAdapter.AbstractC37634a() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuViewV2.C376432 */

            @Override // com.ss.android.lark.feed.app.menu.BaseMenuAdapter.AbstractC37634a
            /* renamed from: a */
            public void mo138050a(View view, int i) {
                MenuItem.MenuType menuType = FeedMenuViewV2.this.f96514e.get(i).f96555a;
                FeedMenuViewV2.this.mo138074b();
                FeedMenuViewV2.this.mo138075b(menuType);
            }
        });
        this.mDrawerFilterRV.setLayoutManager(new LinearLayoutManager(this.f96515f, 1, false));
        this.mDrawerFilterRV.setAdapter(this.f96520k);
    }

    /* renamed from: g */
    private void m148067g() {
        this.f96513d = m148068h();
        FeedTypeMenuAdapterV2 feedTypeMenuAdapterV2 = new FeedTypeMenuAdapterV2();
        this.f96516g = feedTypeMenuAdapterV2;
        feedTypeMenuAdapterV2.mo138046a(this.f96517h);
        this.f96516g.mo138047a(this.f96513d);
        this.f96516g.mo138045a(new BaseMenuAdapter.AbstractC37634a() {
            /* class com.ss.android.lark.feed.app.menu.FeedMenuViewV2.C376443 */

            @Override // com.ss.android.lark.feed.app.menu.BaseMenuAdapter.AbstractC37634a
            /* renamed from: a */
            public void mo138050a(View view, int i) {
                FeedMenuViewV2.this.mo138073a(FeedMenuViewV2.this.f96513d.get(i).f96555a);
            }
        });
        this.mFeedTypeRV.setLayoutManager(new LinearLayoutManager(this.f96515f, 1, false));
        this.mFeedTypeRV.setAdapter(this.f96516g);
    }

    /* renamed from: d */
    private List<MenuItem> m148062d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_ALL, 0));
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_MESSAGE, 0));
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_DOC, 0));
        if (C37264a.m146755d()) {
            if (C37262a.m146726a().mo139168O()) {
                if (C37262a.m146726a().mo139169P()) {
                    arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_SECRET, 0));
                }
            } else if (this.f96510a.mo139256a("secretchat.main")) {
                arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_SECRET, 0));
            }
        }
        if (!this.f96511b.mo139209b()) {
            arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_CROSS_TENANT, 0));
        }
        arrayList.add(new MenuItem(MenuItem.MenuType.FILTER_THREAD, 0));
        return arrayList;
    }

    /* renamed from: e */
    private void m148065e(MenuItem.MenuType menuType) {
        this.f96517h = menuType;
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC37663e.AbstractC37666b.AbstractC37667a aVar) {
        this.f96522m = aVar;
    }

    /* renamed from: c */
    private void m148061c(MenuItem.MenuType menuType) {
        this.f96517h = menuType;
        this.f96516g.mo138046a(menuType);
        this.f96516g.notifyDataSetChanged();
        if (this.f96517h == this.f96518i) {
            this.f96521l = this.f96519j;
        } else {
            this.f96521l = null;
        }
        this.f96520k.mo138046a(this.f96521l);
        this.f96520k.notifyDataSetChanged();
    }

    /* renamed from: d */
    private void m148063d(MenuItem.MenuType menuType) {
        this.f96521l = menuType;
        this.f96519j = menuType;
        this.f96518i = this.f96517h;
        this.f96520k.mo138046a(menuType);
        this.f96520k.notifyDataSetChanged();
        AbstractC37646a aVar = this.f96512c;
        if (aVar != null) {
            aVar.mo138063a(this.f96518i, this.f96519j);
            this.f96512c.mo138064b(this.f96517h, this.f96521l);
        }
        AbstractC37663e.AbstractC37666b.AbstractC37667a aVar2 = this.f96522m;
        if (aVar2 != null) {
            aVar2.mo138093a();
        }
    }

    /* renamed from: a */
    public void mo138073a(MenuItem.MenuType menuType) {
        if (menuType != this.f96517h) {
            int i = C376454.f96526a[menuType.ordinal()];
            if (i == 1) {
                m148061c(MenuItem.MenuType.INBOX);
            } else if (i == 2) {
                m148061c(MenuItem.MenuType.DONE);
            }
        }
    }

    @Override // com.ss.android.lark.feed.app.menu.AbstractC37663e.AbstractC37666b
    /* renamed from: a */
    public void mo138068a(Map<Integer, Integer> map) {
        if (map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())) != null) {
            this.f96513d.get(0).f96556b = map.get(Integer.valueOf(FeedCard.FeedType.INBOX.getNumber())).intValue();
            this.f96516g.notifyDataSetChanged();
        }
        if (map.get(Integer.valueOf(FeedCard.FeedType.DONE.getNumber())) != null) {
            this.f96513d.get(1).f96556b = map.get(Integer.valueOf(FeedCard.FeedType.DONE.getNumber())).intValue();
            this.f96516g.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo138075b(MenuItem.MenuType menuType) {
        if (menuType != this.f96521l) {
            switch (menuType) {
                case FILTER_ALL:
                    m148063d(MenuItem.MenuType.FILTER_ALL);
                    return;
                case FILTER_MESSAGE:
                    m148063d(MenuItem.MenuType.FILTER_MESSAGE);
                    return;
                case FILTER_DOC:
                    m148063d(MenuItem.MenuType.FILTER_DOC);
                    return;
                case FILTER_SECRET:
                    m148063d(MenuItem.MenuType.FILTER_SECRET);
                    return;
                case FILTER_CROSS_TENANT:
                    m148063d(MenuItem.MenuType.FILTER_CROSS_TENANT);
                    return;
                case FILTER_THREAD:
                    m148063d(MenuItem.MenuType.FILTER_THREAD);
                    return;
                default:
                    return;
            }
        }
    }

    public FeedMenuViewV2(AbstractC37646a aVar, Context context) {
        this.f96512c = aVar;
        this.f96515f = context;
    }
}
