package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.C26256ah;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.AbstractC37628k;
import com.ss.android.lark.feed.app.C37284a;
import com.ss.android.lark.feed.app.C37629l;
import com.ss.android.lark.feed.app.binder.AbstractC37406i;
import com.ss.android.lark.feed.app.binder.BinderNotFoundException;
import com.ss.android.lark.feed.app.binder.C37367a;
import com.ss.android.lark.feed.app.binder.C37379b;
import com.ss.android.lark.feed.app.binder.C37382c;
import com.ss.android.lark.feed.app.binder.C37385d;
import com.ss.android.lark.feed.app.binder.C37388e;
import com.ss.android.lark.feed.app.binder.C37391f;
import com.ss.android.lark.feed.app.binder.C37393g;
import com.ss.android.lark.feed.app.binder.C37407j;
import com.ss.android.lark.feed.app.binder.C37410k;
import com.ss.android.lark.feed.app.binder.C37416m;
import com.ss.android.lark.feed.app.binder.C37422n;
import com.ss.android.lark.feed.app.binder.C37425o;
import com.ss.android.lark.feed.app.binder.SubscriptionsFeedPreview;
import com.ss.android.lark.feed.app.entity.BannerPreview;
import com.ss.android.lark.feed.app.entity.BoxFeedPreview;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.app.entity.DocFeedPreview;
import com.ss.android.lark.feed.app.entity.ExtraHeaderPreview;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.FilterPreview;
import com.ss.android.lark.feed.app.entity.LittleAppFeedPreview;
import com.ss.android.lark.feed.app.entity.NoticeHeaderPreview;
import com.ss.android.lark.feed.app.entity.ShortCutPreview;
import com.ss.android.lark.feed.app.entity.ThreadFeedPreview;
import com.ss.android.lark.feed.app.entity.UGBannerPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.FilterItemBinder;
import com.ss.android.lark.feed.app.model.cache.ICache;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.event.ChatStartEvent;
import com.ss.android.lark.feed.app.model.p1863c.C37712c;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.app.p1849b.C37295a;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class FeedListAdapter extends LarkRecyclerViewBaseAdapter<RecyclerView.ViewHolder, UIFeedCard> implements AbstractC37628k {

    /* renamed from: a */
    private AbstractC37929d f97285a;

    /* renamed from: b */
    private AbstractC37930e f97286b;

    /* renamed from: c */
    protected Context f97287c;

    /* renamed from: d */
    protected C37393g f97288d;

    /* renamed from: e */
    protected RecyclerView f97289e;

    /* renamed from: f */
    protected int f97290f;

    /* renamed from: g */
    protected C37284a f97291g;

    /* renamed from: h */
    protected C37629l f97292h;

    /* renamed from: i */
    protected AbstractC37934i f97293i;

    /* renamed from: j */
    protected AbstractC37933h f97294j;

    /* renamed from: k */
    protected AbstractC37935j f97295k;

    /* renamed from: l */
    protected AbstractC37931f f97296l;

    /* renamed from: m */
    public AbstractC37928c f97297m;

    /* renamed from: n */
    protected AbstractC37926a f97298n;

    /* renamed from: o */
    AbstractC37927b f97299o;

    /* renamed from: p */
    C37284a.AbstractC37287b f97300p = new C37284a.AbstractC37287b() {
        /* class com.ss.android.lark.feed.app.view.FeedListAdapter.C379221 */

        @Override // com.ss.android.lark.feed.app.C37284a.AbstractC37287b
        /* renamed from: a */
        public void mo137114a(C1374g.C1377b bVar, UpdateRecord updateRecord) {
            if (FeedListAdapter.this.f97298n != null) {
                FeedListAdapter.this.f97298n.mo137382a(updateRecord);
            }
            FeedListAdapter.this.items = updateRecord.mo138376c();
            bVar.mo7412a(FeedListAdapter.this);
            if (FeedListAdapter.this.f97298n != null) {
                FeedListAdapter.this.f97298n.mo137383b(updateRecord);
            }
        }
    };

    /* renamed from: q */
    public boolean f97301q = false;

    /* renamed from: r */
    private AbstractC37932g f97302r;

    /* renamed from: s */
    private AbstractC37305b f97303s;

    /* renamed from: t */
    private UpdateRecord f97304t;

    /* renamed from: u */
    private boolean f97305u;

    /* renamed from: v */
    private String f97306v = null;

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$a */
    public interface AbstractC37926a {
        /* renamed from: a */
        void mo137382a(UpdateRecord updateRecord);

        /* renamed from: b */
        void mo137383b(UpdateRecord updateRecord);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$b */
    public interface AbstractC37927b {
        /* renamed from: a */
        void mo137374a(int i, UIFeedCard uIFeedCard);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$c */
    public interface AbstractC37928c {
        /* renamed from: a */
        void mo137371a(FeedPreview feedPreview);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$d */
    public interface AbstractC37929d {
        /* renamed from: a */
        void mo137502a(C37968c cVar);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$e */
    public interface AbstractC37930e {
        /* renamed from: a */
        void mo138948a(int i, FeedPreview feedPreview);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$f */
    public interface AbstractC37931f {
        /* renamed from: a */
        void mo138949a();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$g */
    public interface AbstractC37932g {
        /* renamed from: a */
        void mo138950a(C37968c cVar, FeedPreview feedPreview, boolean z);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$h */
    public interface AbstractC37933h {
        /* renamed from: a */
        void mo137384a(FeedPreview feedPreview);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$i */
    public interface AbstractC37934i {
        /* renamed from: b */
        void mo138951b(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard);
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$j */
    public interface AbstractC37935j {
        /* renamed from: a */
        void mo137372a(FeedPreview feedPreview);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AbstractC37628k mo137348i() {
        return this;
    }

    /* renamed from: l */
    public void mo138942l() {
        this.f97305u = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: a */
    public AbstractC37934i mo138034a() {
        return this.f97293i;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: b */
    public AbstractC37933h mo138035b() {
        return this.f97294j;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: c */
    public AbstractC37935j mo138036c() {
        return this.f97295k;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: d */
    public AbstractC37931f mo138037d() {
        return this.f97296l;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: e */
    public AbstractC37929d mo138038e() {
        return this.f97285a;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: f */
    public int mo138039f() {
        return this.f97290f;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: g */
    public AbstractC37930e mo138040g() {
        return this.f97286b;
    }

    @Override // com.ss.android.lark.feed.app.AbstractC37628k
    /* renamed from: h */
    public AbstractC37932g mo138041h() {
        return this.f97302r;
    }

    /* renamed from: o */
    public String mo138945o() {
        return this.f97306v;
    }

    /* renamed from: a */
    public void mo138936a(AbstractC37934i iVar) {
        this.f97293i = iVar;
    }

    /* renamed from: a */
    public void mo138935a(AbstractC37933h hVar) {
        this.f97294j = hVar;
    }

    /* renamed from: a */
    public void mo138937a(AbstractC37935j jVar) {
        this.f97295k = jVar;
    }

    /* renamed from: a */
    public void mo138933a(AbstractC37931f fVar) {
        this.f97296l = fVar;
    }

    /* renamed from: a */
    public void mo138934a(AbstractC37932g gVar) {
        this.f97302r = gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo138939a(List<ICache.Operation> list) {
        for (ICache.Operation operation : list) {
            int i = C379254.f97310a[operation.f96685a.ordinal()];
            if (i == 1) {
                notifyDataSetChanged();
            } else if (i == 2) {
                notifyItemRangeInserted(operation.f96686b, operation.f96687c);
            } else if (i == 3) {
                notifyItemRangeRemoved(operation.f96686b, operation.f96687c);
            } else if (i == 4) {
                notifyItemMoved(operation.f96686b, operation.f96687c);
            } else if (i == 5) {
                notifyItemChanged(operation.f96686b);
            }
        }
    }

    /* renamed from: a */
    public void mo138938a(HashSet<String> hashSet) {
        RecyclerView recyclerView = this.f97289e;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition() - 2;
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition() + 3;
            if (findFirstVisibleItemPosition < 0) {
                findFirstVisibleItemPosition = 0;
            }
            if (findLastVisibleItemPosition > getItemCount()) {
                findLastVisibleItemPosition = getItemCount();
            }
            while (findFirstVisibleItemPosition < findLastVisibleItemPosition) {
                if (hashSet.contains(((UIFeedCard) getItem(findFirstVisibleItemPosition)).getId())) {
                    notifyItemChanged(findFirstVisibleItemPosition);
                }
                findFirstVisibleItemPosition++;
            }
        }
    }

    /* renamed from: j */
    private AbstractC37305b mo137349j() {
        if (this.f97303s == null) {
            this.f97303s = new C37295a();
        }
        return this.f97303s;
    }

    /* renamed from: k */
    public void mo138941k() {
        if (DesktopUtil.m144301a(this.f97287c)) {
            EventBus.getDefault().unregister(this);
        }
    }

    /* renamed from: m */
    public void mo138943m() {
        this.f97305u = false;
        UpdateRecord updateRecord = this.f97304t;
        if (updateRecord != null) {
            mo138927a(updateRecord);
            this.f97304t = null;
        }
    }

    /* renamed from: p */
    private void mo139055p() {
        if (DesktopUtil.m144301a(this.f97287c)) {
            mo138932a(new AbstractC37930e() {
                /* class com.ss.android.lark.feed.app.view.FeedListAdapter.C379243 */

                @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37930e
                /* renamed from: a */
                public void mo138948a(int i, FeedPreview feedPreview) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                C37268c.m146766b().mo139154A().mo139241a(feedPreview.getId(), !feedPreview.isRemind(), null);
                            } else if (i == 3 && FeedListAdapter.this.f97297m != null) {
                                FeedListAdapter.this.f97297m.mo137371a(feedPreview);
                            }
                        } else if (FeedListAdapter.this.mo138035b() != null) {
                            FeedListAdapter.this.mo138035b().mo137384a(feedPreview);
                        }
                    } else if (FeedListAdapter.this.mo138036c() != null) {
                        FeedListAdapter.this.mo138036c().mo137372a(feedPreview);
                    }
                }
            });
        }
    }

    /* renamed from: n */
    public void mo138944n() {
        C37393g gVar = this.f97288d;
        ((C37416m) gVar.mo137273a(gVar.mo137272a(ShortCutPreview.class))).mo137312a(true);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$4 */
    public static /* synthetic */ class C379254 {

        /* renamed from: a */
        static final /* synthetic */ int[] f97310a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.lark.feed.app.model.cache.ICache$Operation$Type[] r0 = com.ss.android.lark.feed.app.model.cache.ICache.Operation.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.feed.app.view.FeedListAdapter.C379254.f97310a = r0
                com.ss.android.lark.feed.app.model.cache.ICache$Operation$Type r1 = com.ss.android.lark.feed.app.model.cache.ICache.Operation.Type.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.feed.app.view.FeedListAdapter.C379254.f97310a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.feed.app.model.cache.ICache$Operation$Type r1 = com.ss.android.lark.feed.app.model.cache.ICache.Operation.Type.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.feed.app.view.FeedListAdapter.C379254.f97310a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.feed.app.model.cache.ICache$Operation$Type r1 = com.ss.android.lark.feed.app.model.cache.ICache.Operation.Type.REMOVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.feed.app.view.FeedListAdapter.C379254.f97310a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.feed.app.model.cache.ICache$Operation$Type r1 = com.ss.android.lark.feed.app.model.cache.ICache.Operation.Type.MOVE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.feed.app.view.FeedListAdapter.C379254.f97310a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.lark.feed.app.model.cache.ICache$Operation$Type r1 = com.ss.android.lark.feed.app.model.cache.ICache.Operation.Type.UPDATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.view.FeedListAdapter.C379254.<clinit>():void");
        }
    }

    public FeedListAdapter() {
        Object obj;
        C37393g gVar = new C37393g();
        this.f97288d = gVar;
        gVar.mo137274a(ExtraHeaderPreview.class, new C37391f());
        this.f97288d.mo137274a(ChatFeedPreview.class, new C37382c());
        this.f97288d.mo137274a(DocFeedPreview.class, new C37388e());
        this.f97288d.mo137274a(ShortCutPreview.class, new C37416m());
        this.f97288d.mo137274a(BoxFeedPreview.class, new C37379b());
        C37393g gVar2 = this.f97288d;
        if (DesktopUtil.m144301a(UIHelper.getContext())) {
            obj = new C37385d();
        } else {
            obj = new C37410k();
        }
        gVar2.mo137274a(NoticeHeaderPreview.class, obj);
        this.f97288d.mo137274a(ThreadFeedPreview.class, new C37422n());
        this.f97288d.mo137274a(BannerPreview.class, new C37367a());
        this.f97288d.mo137274a(UGBannerPreview.class, new C37425o());
        this.f97288d.mo137274a(LittleAppFeedPreview.class, new C37407j());
        this.f97288d.mo137274a(FilterPreview.class, new FilterItemBinder());
        this.f97288d.mo137274a(SubscriptionsFeedPreview.class, new C38005k());
        C37284a aVar = new C37284a(this);
        this.f97291g = aVar;
        aVar.mo137109a(this.f97300p);
        this.f97292h = new C37629l(this);
        if (DesktopUtil.m144301a(this.f97287c)) {
            EventBus.getDefault().register(this);
        }
    }

    /* renamed from: a */
    public void mo138924a(int i) {
        this.f97290f = i;
    }

    /* renamed from: b */
    public void mo138940b(int i) {
        C37712c.m148277a();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo138926a(AbstractC37305b bVar) {
        this.f97303s = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f97287c = recyclerView.getContext();
        this.f97289e = recyclerView;
        mo139055p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C37968c) {
            ((C37968c) viewHolder).mo139039n();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        UIFeedCard uIFeedCard = (UIFeedCard) getItem(i);
        int a = this.f97288d.mo137272a(uIFeedCard.getClass());
        if (a != -1) {
            return a;
        }
        throw new BinderNotFoundException(uIFeedCard.getClass());
    }

    /* renamed from: a */
    public void mo138928a(AbstractC37926a aVar) {
        this.f97298n = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        String id = ((UIFeedCard) this.items.get(i)).getId();
        long a = C26256ah.m95012a(((UIFeedCard) this.items.get(i)).getId(), -1);
        if (a == -1) {
            return UUID.fromString(id).getMostSignificantBits();
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onChatStart(ChatStartEvent aVar) {
        if (DesktopUtil.m144301a(this.f97287c) && !TextUtils.equals(aVar.mo138462a(), this.f97306v)) {
            String str = this.f97306v;
            this.f97306v = aVar.mo138462a();
            HashSet<String> hashSet = new HashSet<>(2);
            if (str != null) {
                hashSet.add(str);
            }
            String str2 = this.f97306v;
            if (str2 != null) {
                hashSet.add(str2);
            }
            mo138938a(hashSet);
        }
    }

    /* renamed from: a */
    public void mo138927a(UpdateRecord updateRecord) {
        if (this.f97305u) {
            Log.m165397w("FeedListAdapter", "update isPauseUpdate");
            this.f97304t = updateRecord;
        } else if (!FeedFgUtils.m146773b() && this.items.size() == 0) {
            this.items = updateRecord.mo138376c();
            notifyDataSetChanged();
        } else if (!CollectionUtils.isEmpty(updateRecord.mo138377d())) {
            this.items = updateRecord.mo138376c();
            mo138939a(updateRecord.mo138377d());
        } else {
            this.f97291g.mo137110a(updateRecord);
        }
    }

    /* renamed from: a */
    public void mo138929a(AbstractC37927b bVar) {
        this.f97299o = bVar;
    }

    /* renamed from: a */
    public void mo138930a(AbstractC37928c cVar) {
        this.f97297m = cVar;
    }

    /* renamed from: a */
    public void mo138931a(AbstractC37929d dVar) {
        this.f97285a = dVar;
    }

    /* renamed from: a */
    public void mo138932a(AbstractC37930e eVar) {
        this.f97286b = eVar;
    }

    /* renamed from: a */
    public void mo138925a(int i, int i2) {
        if (i > -1 && i < getItemCount()) {
            ((LinearLayoutManager) this.f97289e.getLayoutManager()).scrollToPositionWithOffset(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f97288d.mo137273a(i).mo137224a(LayoutInflater.from(viewGroup.getContext()), viewGroup, mo137349j());
    }

    /* renamed from: com.ss.android.lark.feed.app.view.FeedListAdapter$k */
    public static abstract class AbstractC37936k implements AbstractC37934i {

        /* renamed from: a */
        private long f97311a;

        /* renamed from: b */
        private final long f97312b = 500;

        /* renamed from: a */
        public abstract void mo137381a(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard);

        @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37934i
        /* renamed from: b */
        public void mo138951b(RecyclerView.ViewHolder viewHolder, UIFeedCard uIFeedCard) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f97311a < 500) {
                Log.m165389i("ClickThrottle", "click had been throttle");
                return;
            }
            if (DesktopUtil.m144301a(viewHolder.itemView.getContext())) {
                if (!viewHolder.itemView.isSelected()) {
                    EventBus.getDefault().trigger(new ChatStartEvent(uIFeedCard.getId()));
                } else {
                    return;
                }
            }
            this.f97311a = uptimeMillis;
            mo137381a(viewHolder, uIFeedCard);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        UIFeedCard uIFeedCard = (UIFeedCard) getItem(i);
        uIFeedCard.setDataObserver(this.f97292h);
        AbstractC37406i<?, ?, ?> a = this.f97288d.mo137273a(viewHolder.getItemViewType());
        if (DesktopUtil.m144301a(this.f97287c)) {
            viewHolder.itemView.setSelected(uIFeedCard.getId().equals(this.f97306v));
        }
        try {
            a.mo137226a(viewHolder, uIFeedCard, mo137348i(), i);
            AbstractC37927b bVar = this.f97299o;
            if (bVar != null) {
                bVar.mo137374a(i, uIFeedCard);
            }
        } catch (Exception e) {
            Log.m165385e("FeedListAdapter", "feed binder exception occurs! " + e.getMessage(), e, true);
            if (!this.f97301q) {
                viewHolder.itemView.post(new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.FeedListAdapter.RunnableC379232 */

                    public void run() {
                        FeedListAdapter.this.notifyDataSetChanged();
                        FeedListAdapter.this.f97301q = true;
                    }
                });
            }
        }
    }
}
