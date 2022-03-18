package com.ss.android.lark.search.impl.func.chatinside.detail.p2612c;

import android.graphics.Bitmap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.impl.entity.viewdata.filter.SearchFilterViewData;
import com.ss.android.lark.search.impl.func.chatinside.cache.ChatInsideFilterCacheBean;
import com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53542d;
import com.ss.android.lark.search.impl.func.chatinside.view.filter.C53537a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.timepicker.TimeSelectDialog;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.c.b */
public class C53463b extends BaseChatInsideSearchView implements AbstractC53472g {

    /* renamed from: d */
    public Pair<Date, Date> f132100d;

    /* renamed from: e */
    public C53537a f132101e;

    /* renamed from: f */
    private RecyclerView f132102f;

    /* renamed from: g */
    private TextView f132103g;

    /* renamed from: h */
    private Map<String, AbstractC53542d> f132104h = new HashMap();

    /* renamed from: i */
    private TimeSelectDialog.AbstractC59218a f132105i = new TimeSelectDialog.AbstractC59218a() {
        /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.C53463b.C534641 */

        @Override // com.ss.android.lark.widget.timepicker.TimeSelectDialog.AbstractC59218a
        /* renamed from: a */
        public void mo182573a(Date date, Date date2) {
            C53463b.this.f132100d = Pair.create(date, date2);
            SearchFilterViewData searchFilterViewData = (SearchFilterViewData) C53463b.this.f132101e.getItem(1);
            searchFilterViewData.mo182348a(Pair.create(date, date2));
            C53463b.this.f132101e.notifyItemChanged(searchFilterViewData);
            C53463b.this.mo182570a(true);
            if (C53463b.this.f132046c instanceof C53466c) {
                ((C53466c) C53463b.this.f132046c).mo182576a(date, date2);
            }
        }
    };

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.c.b$a */
    public interface AbstractC53465a extends BaseChatInsideSearchView.AbstractC53442a {
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: a */
    public void mo182467a() {
        m207042m();
    }

    /* access modifiers changed from: public */
    /* renamed from: q */
    private /* synthetic */ void m207046q() {
        m207036a(this.f132100d);
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f132046c = null;
    }

    /* renamed from: m */
    private void m207042m() {
        m207041l();
        m207044o();
        m207043n();
    }

    /* renamed from: n */
    private void m207043n() {
        this.f132103g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.$$Lambda$b$IWJCZ4YjxyTt6RUi3Pin8hjGHzo */

            public final void onClick(View view) {
                C53463b.lambda$IWJCZ4YjxyTt6RUi3Pin8hjGHzo(C53463b.this, view);
            }
        });
    }

    /* renamed from: k */
    private void m207040k() {
        this.f132104h.put("chat_inside_search_message/filter/sender", new AbstractC53542d() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.$$Lambda$b$vQNiUrtbaQ1I4ULTogbWGuVOHd8 */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53542d
            public final void onFilterClick() {
                C53463b.lambda$vQNiUrtbaQ1I4ULTogbWGuVOHd8(C53463b.this);
            }
        });
        this.f132104h.put("chat_inside_search_message/filter/time", new AbstractC53542d() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.$$Lambda$b$nXEcm9xiYVmt38nEt4nplkIYtI */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53542d
            public final void onFilterClick() {
                C53463b.m270946lambda$nXEcm9xiYVmt38nEt4nplkIYtI(C53463b.this);
            }
        });
    }

    /* renamed from: p */
    private List<SearchFilterViewData> m207045p() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m207038b("chat_inside_search_message/filter/sender"));
        arrayList.add(m207038b("chat_inside_search_message/filter/time"));
        return arrayList;
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.detail.base.BaseChatInsideSearchView
    /* renamed from: d */
    public void mo182470d() {
        super.mo182470d();
        this.mDefaultTV.setText(UIHelper.getString(R.string.Lark_Legacy_SearchMarkTips));
        this.mDefaultIV.setImageResource(R.drawable.illustration_empty_neutral_no_message_logging);
    }

    /* renamed from: j */
    public void mo182572j() {
        this.f132100d = null;
        this.f132101e.resetAll(m207045p());
        mo182570a(false);
    }

    /* renamed from: l */
    private void m207041l() {
        View inflate = LayoutInflater.from(this.f132044a).inflate(R.layout.view_chat_inside_filter_msg, (ViewGroup) this.mFilterFL, false);
        this.f132102f = (RecyclerView) inflate.findViewById(R.id.filter_msg_rv);
        this.f132103g = (TextView) inflate.findViewById(R.id.filter_msg_reset_tv);
        this.mFilterFL.addView(inflate);
        this.mFilterFL.setVisibility(0);
    }

    /* renamed from: o */
    private void m207044o() {
        this.f132102f.setLayoutManager(new LinearLayoutManager(this.f132044a, 0, false));
        C53537a aVar = new C53537a();
        this.f132101e = aVar;
        aVar.mo182771a(new C53537a.AbstractC53539a() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.p2612c.$$Lambda$b$nI1HTy6cmOLaYa_bBHy5FOpoau8 */

            @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.C53537a.AbstractC53539a
            public final void onItemClick(String str) {
                C53463b.lambda$nI1HTy6cmOLaYa_bBHy5FOpoau8(C53463b.this, str);
            }
        });
        this.f132102f.setAdapter(this.f132101e);
        this.f132101e.addAll(m207045p());
    }

    /* access modifiers changed from: public */
    /* renamed from: r */
    private /* synthetic */ void m207047r() {
        BaseFragment baseFragment;
        if (this.f132046c instanceof C53466c) {
            if (this.f132045b.getParentFragment() instanceof BaseFragment) {
                baseFragment = (BaseFragment) this.f132045b.getParentFragment();
            } else {
                baseFragment = this.f132045b;
            }
            ((C53466c) this.f132046c).mo182574a(baseFragment, 161);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: a */
    public void mo182570a(boolean z) {
        this.f132103g.setEnabled(z);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207037a(View view) {
        if (this.f132046c instanceof C53466c) {
            ((C53466c) this.f132046c).mo182577i();
        }
    }

    /* renamed from: b */
    private SearchFilterViewData m207038b(String str) {
        SearchFilterViewData searchFilterViewData = new SearchFilterViewData();
        searchFilterViewData.mo182350a(str);
        return searchFilterViewData;
    }

    /* renamed from: a */
    private Date m207035a(long j) {
        if (j == 0) {
            return null;
        }
        return new Date(j * 1000);
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m207039c(String str) {
        AbstractC53542d dVar = this.f132104h.get(str);
        if (dVar == null) {
            Log.m165383e("LarkSearch.Search.ChatSearchMessage", "filter type is unknown");
        } else {
            dVar.onFilterClick();
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: b */
    public void mo182571b(List<Bitmap> list) {
        SearchFilterViewData searchFilterViewData = (SearchFilterViewData) this.f132101e.getItem(0);
        searchFilterViewData.mo182351a(list);
        searchFilterViewData.mo182353c();
        this.f132101e.notifyItemChanged(searchFilterViewData);
        mo182570a(true);
    }

    /* renamed from: a */
    private void m207036a(Pair<Date, Date> pair) {
        TimeSelectDialog timeSelectDialog = new TimeSelectDialog(this.f132044a);
        timeSelectDialog.mo201294a(this.f132105i);
        if (pair != null) {
            timeSelectDialog.mo201293a(pair);
        }
        if (UIUtils.isActivityRunning(this.f132044a)) {
            timeSelectDialog.show();
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: a */
    public void mo182568a(int i) {
        if (i == 1) {
            SearchFilterViewData searchFilterViewData = (SearchFilterViewData) this.f132101e.getItem(0);
            searchFilterViewData.mo182352b();
            this.f132101e.notifyItemChanged(searchFilterViewData);
        } else if (i == 2) {
            SearchFilterViewData searchFilterViewData2 = (SearchFilterViewData) this.f132101e.getItem(1);
            searchFilterViewData2.mo182348a((Pair<Date, Date>) null);
            this.f132101e.notifyItemChanged(searchFilterViewData2);
        }
    }

    @Override // com.ss.android.lark.search.impl.func.chatinside.view.filter.AbstractC53541c
    /* renamed from: a */
    public void mo182569a(ChatInsideFilterCacheBean aVar) {
        if (this.f132101e != null) {
            Date a = m207035a(aVar.mo182422a().messageStartTime);
            Date a2 = m207035a(aVar.mo182422a().messageEndTime);
            if (a2 != null) {
                this.f132100d = Pair.create(a, a2);
                SearchFilterViewData searchFilterViewData = (SearchFilterViewData) this.f132101e.getItem(1);
                searchFilterViewData.mo182348a(Pair.create(a, a2));
                this.f132101e.notifyItemChanged(searchFilterViewData);
                mo182570a(true);
            }
        }
    }

    public C53463b(BaseFragment baseFragment, AbstractC53465a aVar) {
        super(baseFragment, aVar);
        m207040k();
    }
}
