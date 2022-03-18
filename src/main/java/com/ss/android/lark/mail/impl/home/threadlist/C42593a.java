package com.ss.android.lark.mail.impl.home.threadlist;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.C42038d;
import com.ss.android.lark.mail.impl.action.CustomLabelThreadListMailAction;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.entity.SearchRet;
import com.ss.android.lark.mail.impl.home.C42444d;
import com.ss.android.lark.mail.impl.home.aggregation.C42409b;
import com.ss.android.lark.mail.impl.home.p2182b.AbstractC42436a;
import com.ss.android.lark.mail.impl.home.p2182b.C42437b;
import com.ss.android.lark.mail.impl.home.p2183c.C42441c;
import com.ss.android.lark.mail.impl.home.threadlist.listitem.C42697a;
import com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView;
import com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b;
import com.ss.android.lark.mail.impl.home.threadlist.p2188c.C42638c;
import com.ss.android.lark.mail.impl.home.threadlist.refresh_header.RefreshComponent;
import com.ss.android.lark.mail.impl.lark.C42723b;
import com.ss.android.lark.mail.impl.message.p2204d.C42879j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42207i;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42322x;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionConfig;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionUtil;
import com.ss.android.lark.mail.impl.utils.C43762e;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.C44032c;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.C44024c;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.C44025d;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.C44026e;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.compress.p3493a.C69755i;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a */
public class C42593a extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AbstractC44040g<RecyclerView.ViewHolder> {

    /* renamed from: o */
    private static final HashSet<String> f108395o = new HashSet<>(Arrays.asList("DRAFT", "SENT", "SCHEDULED", "OUTBOX"));

    /* renamed from: a */
    List<AbstractC42436a> f108396a = new ArrayList();

    /* renamed from: b */
    Context f108397b;

    /* renamed from: c */
    AbstractC42603c f108398c;

    /* renamed from: d */
    public String f108399d;

    /* renamed from: e */
    public boolean f108400e;

    /* renamed from: f */
    public int f108401f;

    /* renamed from: g */
    public int f108402g = 1;

    /* renamed from: h */
    public final List<MailThread> f108403h;

    /* renamed from: i */
    public RefreshComponent f108404i;

    /* renamed from: j */
    public MailThread f108405j;

    /* renamed from: k */
    public C42697a f108406k;

    /* renamed from: l */
    public C44032c f108407l;

    /* renamed from: m */
    public AbstractC42601a f108408m;

    /* renamed from: n */
    public AbstractC42602b f108409n;

    /* renamed from: p */
    private final Paint f108410p = new Paint();

    /* renamed from: q */
    private AbstractC42604d f108411q;

    /* renamed from: r */
    private AbstractC42637b f108412r;

    /* renamed from: s */
    private String f108413s;

    /* renamed from: t */
    private int f108414t;

    /* renamed from: u */
    private final ThreadActionManager f108415u = new ThreadActionManager();

    /* renamed from: v */
    private boolean f108416v;

    /* renamed from: w */
    private boolean f108417w = false;

    /* renamed from: x */
    private float f108418x = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$a */
    public interface AbstractC42601a {
        /* renamed from: a */
        void mo152940a();

        /* renamed from: a */
        void mo152941a(MailThread mailThread);

        /* renamed from: b */
        void mo152942b();
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$b */
    public interface AbstractC42602b {
        /* renamed from: a */
        void mo153144a();

        /* renamed from: a */
        void mo153145a(MailThread mailThread, int i);
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$c */
    public interface AbstractC42603c {
        /* renamed from: a */
        void mo152988a(MailThread mailThread, String str);

        /* renamed from: h */
        void mo152999h();
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$d */
    public interface AbstractC42604d {
        /* renamed from: a */
        void mo152935a();
    }

    /* renamed from: a */
    public long mo153100a(int i) {
        return (long) (i + 9999);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
    /* renamed from: a */
    public void mo153098a(RecyclerView.ViewHolder viewHolder, int i, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return 1;
    }

    /* renamed from: i */
    public void mo153127i() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    /* renamed from: r */
    public void mo153136r() {
        this.f108416v = false;
    }

    /* renamed from: b */
    public List<AbstractC42436a> mo153117b() {
        return this.f108396a;
    }

    /* renamed from: d */
    public List<MailThread> mo153122d() {
        return this.f108403h;
    }

    /* renamed from: g */
    public boolean mo153125g() {
        return this.f108400e;
    }

    /* renamed from: h */
    public int mo153126h() {
        return this.f108401f;
    }

    /* renamed from: q */
    public Context mo153135q() {
        return this.f108397b;
    }

    /* renamed from: a */
    public void mo153110a(List<MailThread> list, String str, String str2, boolean z) {
        mo153111a(list, str, str2, z, false);
    }

    /* renamed from: a */
    public void mo153111a(List<MailThread> list, String str, String str2, boolean z, boolean z2) {
        this.f108399d = str;
        this.f108413s = str2;
        this.f108396a.clear();
        if (list == null || list.isEmpty()) {
            notifyDataSetChanged();
            if (this.f108402g == 1) {
                this.f108412r = new C42638c();
                C42226b.m168638a().mo152309a("mail_dev_thread_list_cost_time", new JSONObject());
            }
            m169902x();
            m169898t();
            return;
        }
        this.f108396a.addAll(list);
        if (this.f108402g == 1) {
            m169903y();
        }
        m169902x();
        notifyDataSetChanged();
        if (this.f108402g == 1) {
            this.f108412r = new C42638c();
            C42226b.m168638a().mo152309a("mail_dev_thread_list_cost_time", new JSONObject());
            m169898t();
        }
        C43849u.m173827a(new Runnable(list) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.$$Lambda$a$YvWNBe89FL0AUA55ooNCZ8_7an0 */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C42593a.this.m169894b((C42593a) this.f$1);
            }
        }, 500);
    }

    /* renamed from: a */
    public boolean mo153114a() {
        return this.f108416v;
    }

    /* renamed from: a */
    public void mo153112a(List<MailThread> list, boolean z) {
        Log.m165389i("MailList", "addMoreList");
        ((C42322x) C42344d.m169091a(C42322x.class, this.f108397b)).mo152372a("success", (long) C42038d.C42039a.m167221a());
        if (CollectionUtils.isEmpty(list)) {
            Log.m165389i("MailList", "addMoreList return");
            return;
        }
        Log.m165389i("MailList", "addMoreList threadList:" + list.size());
        this.f108396a.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public boolean mo153115a(MailThread mailThread) {
        if (this.f108396a.size() <= 0) {
            return false;
        }
        boolean a = m169892a(mo153130l(), mailThread);
        notifyDataSetChanged();
        return a;
    }

    /* renamed from: a */
    public void mo153109a(List<AbstractC42436a> list) {
        AbstractC42604d dVar;
        if (list != null) {
            if (list.size() > 1 && this.f108396a.size() > 1 && (this.f108396a.get(1) instanceof C42437b) && !(list.get(1) instanceof C42437b)) {
                list.add(1, this.f108396a.get(1));
            }
            this.f108396a = list;
            m169902x();
            notifyDataSetChanged();
            if (m169901w() <= 0 && (dVar = this.f108411q) != null) {
                dVar.mo152935a();
            }
        }
    }

    /* renamed from: a */
    public void mo153107a(RefreshComponent cVar) {
        this.f108404i = cVar;
    }

    /* renamed from: a */
    public void mo153105a(AbstractC42603c cVar) {
        this.f108398c = cVar;
    }

    /* renamed from: a */
    public void mo153106a(AbstractC42604d dVar) {
        this.f108411q = dVar;
    }

    /* renamed from: a */
    public void mo153103a(AbstractC42601a aVar) {
        this.f108408m = aVar;
    }

    /* renamed from: a */
    public void mo153104a(AbstractC42602b bVar) {
        this.f108409n = bVar;
    }

    /* renamed from: a */
    public void mo153108a(C44032c cVar) {
        this.f108407l = cVar;
    }

    /* renamed from: a */
    public void mo153113a(boolean z) {
        this.f108417w = z;
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$f */
    public class C42606f extends C44025d {

        /* renamed from: b */
        private C42593a f108439b;

        /* renamed from: c */
        private final int f108440c;

        /* renamed from: d */
        private C42697a f108441d;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: c */
        public void mo153148c() {
            super.mo153148c();
            this.f108439b = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: a */
        public void mo153146a() {
            super.mo153146a();
            MailThread b = C42593a.this.mo153116b(this.f108440c);
            if (b != null) {
                b.mo151713h(false);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: b */
        public void mo153147b() {
            super.mo153147b();
            C42593a.this.mo153101a(this.f108440c, this.f108441d);
            C42697a aVar = this.f108441d;
            if (aVar != null) {
                aVar.mo153369f();
            }
        }

        public C42606f(C42593a aVar, int i, C42697a aVar2) {
            this.f108439b = aVar;
            this.f108440c = i;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$i */
    private class C42609i extends AbstractC44022a {

        /* renamed from: b */
        private final int f108449b;

        /* renamed from: c */
        private C42593a f108450c;

        /* renamed from: d */
        private final C42697a f108451d;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: c */
        public void mo153148c() {
            super.mo153148c();
            this.f108450c = null;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: a */
        public void mo153146a() {
            super.mo153146a();
            MailThread b = C42593a.this.mo153116b(this.f108449b);
            if (b != null) {
                b.mo151713h(false);
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: b */
        public void mo153147b() {
            super.mo153147b();
            C42593a.this.mo153118b(this.f108449b, this.f108451d);
            C42697a aVar = this.f108451d;
            if (aVar != null) {
                aVar.mo153369f();
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        C42609i(com.ss.android.lark.mail.impl.home.threadlist.C42593a r3, int r4, com.ss.android.lark.mail.impl.home.threadlist.listitem.C42697a r5) {
            /*
                r1 = this;
                com.ss.android.lark.mail.impl.home.threadlist.C42593a.this = r2
                com.ss.android.lark.mail.impl.service.f r2 = com.ss.android.lark.mail.impl.service.C43374f.m172264f()
                java.lang.String r2 = r2.mo155129q()
                java.lang.String r0 = "FLAGGED"
                boolean r2 = com.ss.android.lark.utils.C57782ag.m224242a(r2, r0)
                if (r2 != 0) goto L_0x0041
                com.ss.android.lark.mail.impl.service.f r2 = com.ss.android.lark.mail.impl.service.C43374f.m172264f()
                java.lang.String r2 = r2.mo155129q()
                java.lang.String r0 = "SENT"
                boolean r2 = com.ss.android.lark.utils.C57782ag.m224242a(r2, r0)
                if (r2 != 0) goto L_0x0041
                com.ss.android.lark.mail.impl.service.f r2 = com.ss.android.lark.mail.impl.service.C43374f.m172264f()
                com.ss.android.lark.mail.impl.entity.MailLabelEntity r2 = r2.mo155130r()
                boolean r2 = r2.mo151529m()
                if (r2 != 0) goto L_0x003f
                com.ss.android.lark.mail.impl.service.f r2 = com.ss.android.lark.mail.impl.service.C43374f.m172264f()
                com.ss.android.lark.mail.impl.entity.MailLabelEntity r2 = r2.mo155130r()
                int r2 = r2.mo151494a()
                r0 = 2
                if (r2 != r0) goto L_0x0041
            L_0x003f:
                r2 = 1
                goto L_0x0042
            L_0x0041:
                r2 = 0
            L_0x0042:
                r1.<init>(r2)
                r1.f108450c = r3
                r1.f108449b = r4
                r1.f108451d = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.C42593a.C42609i.<init>(com.ss.android.lark.mail.impl.home.threadlist.a, com.ss.android.lark.mail.impl.home.threadlist.a, int, com.ss.android.lark.mail.impl.home.threadlist.listitem.a):void");
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$e */
    public class C42605e extends C44024c {

        /* renamed from: a */
        int f108435a;

        /* renamed from: c */
        private final C42697a f108437c;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: b */
        public void mo153147b() {
            super.mo153147b();
            C42697a aVar = this.f108437c;
            if (aVar != null) {
                aVar.mo153369f();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: a */
        public void mo153146a() {
            super.mo153146a();
            MailThread b = C42593a.this.mo153116b(this.f108435a);
            if (b != null) {
                if (C42593a.this.f108405j != null && !TextUtils.equals(C42593a.this.f108405j.mo151676a(), b.mo151676a())) {
                    C42593a.this.f108405j.mo151713h(false);
                }
                C42593a.this.f108405j = b;
                C42593a.this.f108406k = this.f108437c;
                C42593a.this.f108406k.mo156695a(-C42697a.f108637a);
                b.mo151713h(true);
                C42593a.this.notifyItemChanged(this.f108435a);
            }
        }

        public C42605e(C42697a aVar, int i) {
            this.f108437c = aVar;
            this.f108435a = i;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$g */
    public class C42607g extends C44025d {

        /* renamed from: b */
        private final C42697a f108443b;

        /* renamed from: c */
        private final int f108444c;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: b */
        public void mo153147b() {
            super.mo153147b();
            C42697a aVar = this.f108443b;
            if (aVar != null) {
                aVar.mo153369f();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: a */
        public void mo153146a() {
            super.mo153146a();
            MailThread b = C42593a.this.mo153116b(this.f108444c);
            if (b != null) {
                b.mo151713h(false);
                C42593a.this.notifyItemChanged(this.f108444c);
            }
        }

        public C42607g(C42697a aVar, int i) {
            this.f108443b = aVar;
            this.f108444c = i;
        }
    }

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.a$h */
    public class C42608h extends C44026e {

        /* renamed from: a */
        int f108445a;

        /* renamed from: c */
        private final C42697a f108447c;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: b */
        public void mo153147b() {
            super.mo153147b();
            C42697a aVar = this.f108447c;
            if (aVar != null) {
                aVar.mo153369f();
            }
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.p2229a.AbstractC44022a
        /* renamed from: a */
        public void mo153146a() {
            super.mo153146a();
            MailThread b = C42593a.this.mo153116b(this.f108445a);
            if (b != null) {
                if (C42593a.this.f108405j != null && !TextUtils.equals(C42593a.this.f108405j.mo151676a(), b.mo151676a())) {
                    C42593a.this.f108405j.mo151713h(false);
                }
                C42593a.this.f108405j = b;
                C42593a.this.f108406k = this.f108447c;
                b.mo151713h(true);
                C42593a.this.notifyItemChanged(this.f108445a);
            }
        }

        public C42608h(C42697a aVar, int i) {
            this.f108447c = aVar;
            this.f108445a = i;
        }
    }

    /* renamed from: m */
    public int mo153131m() {
        if (this.f108414t == 0) {
            this.f108414t = UIHelper.getDimens(R.dimen.mail_home_thread_list_item_height);
        }
        return this.f108414t;
    }

    /* renamed from: c */
    public int mo153120c() {
        List<AbstractC42436a> list = this.f108396a;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f108396a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<AbstractC42436a> list = this.f108396a;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f108396a.size();
    }

    /* renamed from: l */
    public int mo153130l() {
        for (int i = 0; i < this.f108396a.size(); i++) {
            if (this.f108396a.get(i) instanceof MailThread) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: n */
    public boolean mo153132n() {
        if (!MailLabelEntity.m167586e(this.f108399d) || this.f108400e) {
            return false;
        }
        this.f108403h.clear();
        this.f108400e = true;
        mo153137s();
        notifyDataSetChanged();
        return true;
    }

    /* renamed from: p */
    public void mo153134p() {
        MailToast.m173704a(this.f108397b.getString(R.string.Mail_Toast_Select_more_label).replace("{{limitCount}}", "100"), MailToast.Type.UNSPECIFIC);
    }

    /* renamed from: s */
    public void mo153137s() {
        MailThread mailThread = this.f108405j;
        if (mailThread != null) {
            mailThread.mo151713h(false);
            C42697a aVar = this.f108406k;
            if (aVar != null) {
                this.f108407l.mo156670a(aVar, 1);
            }
            notifyItemChanged(this.f108396a.indexOf(this.f108405j));
        }
    }

    /* renamed from: t */
    private void m169898t() {
        if (!this.f108416v) {
            this.f108416v = true;
            Log.m165388i(" EMAIL_CLICKTAB_AND_SHOWDONE stopEvent");
            C42226b.m168638a().mo152309a("email_clicktab_and_showdone", new JSONObject());
        }
        ((C42322x) C42344d.m169091a(C42322x.class, this.f108397b)).mo152372a("success", (long) C42038d.C42039a.m167221a());
    }

    /* renamed from: u */
    private MailItemView m169899u() {
        MailItemView mailItemView = (MailItemView) C42723b.m170356a().mo153408a(MailItemView.class, mo153135q());
        if (mailItemView != null) {
            return mailItemView;
        }
        MailItemView mailItemView2 = new MailItemView(this.f108397b);
        mailItemView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return mailItemView2;
    }

    /* renamed from: v */
    private void m169900v() {
        if (this.f108403h.size() == 0) {
            AbstractC42601a aVar = this.f108408m;
            if (aVar != null) {
                aVar.mo152940a();
            }
        } else if (this.f108402g == 2) {
            AbstractC42602b bVar = this.f108409n;
            if (bVar != null) {
                bVar.mo153144a();
            }
        } else {
            AbstractC42603c cVar = this.f108398c;
            if (cVar != null) {
                cVar.mo152999h();
            }
        }
    }

    /* renamed from: w */
    private int m169901w() {
        int size = this.f108396a.size();
        int i = 0;
        while (i < this.f108396a.size() && !(this.f108396a.get(i) instanceof MailThread)) {
            size--;
            i++;
        }
        if (size < 0) {
            return 0;
        }
        return size;
    }

    /* renamed from: e */
    public ArrayList<String> mo153123e() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < this.f108403h.size(); i++) {
            arrayList.add(this.f108403h.get(i).mo151676a());
        }
        return arrayList;
    }

    /* renamed from: f */
    public void mo153124f() {
        this.f108400e = false;
        for (int i = 0; i < this.f108396a.size(); i++) {
            AbstractC42436a aVar = this.f108396a.get(i);
            if (aVar instanceof MailThread) {
                ((MailThread) aVar).mo151695c(false);
            }
        }
        this.f108401f = 0;
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public long mo153128j() {
        if (!CollectionUtils.isEmpty(this.f108396a) && this.f108396a.size() > 2) {
            List<AbstractC42436a> list = this.f108396a;
            AbstractC42436a aVar = list.get(list.size() - 2);
            if (aVar instanceof MailThread) {
                return ((MailThread) aVar).mo151719n();
            }
        }
        return 0;
    }

    /* renamed from: k */
    public long mo153129k() {
        if (CollectionUtils.isEmpty(this.f108396a)) {
            return 0;
        }
        for (int i = 0; i < this.f108396a.size(); i++) {
            AbstractC42436a aVar = this.f108396a.get(i);
            if (aVar instanceof MailThread) {
                return ((MailThread) aVar).mo151719n();
            }
        }
        return 0;
    }

    /* renamed from: o */
    public void mo153133o() {
        for (int i = 0; i < this.f108396a.size(); i++) {
            AbstractC42436a aVar = this.f108396a.get(i);
            if (aVar instanceof MailThread) {
                ((MailThread) aVar).mo151690b(true);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: x */
    private void m169902x() {
        List<MailThread> list;
        if (mo153125g() && (list = this.f108403h) != null && list.size() > 0) {
            ArrayList a = C69755i.m267727a();
            for (int i = 0; i < this.f108403h.size(); i++) {
                String a2 = this.f108403h.get(i).mo151676a();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f108396a.size()) {
                        break;
                    }
                    if (this.f108396a.get(i2) instanceof MailThread) {
                        MailThread mailThread = (MailThread) this.f108396a.get(i2);
                        if (mailThread.mo151676a().equals(a2)) {
                            mailThread.mo151695c(true);
                            a.add(mailThread);
                            break;
                        }
                    }
                    i2++;
                }
            }
            this.f108403h.clear();
            this.f108403h.addAll(a);
            this.f108401f = this.f108403h.size();
            m169900v();
        }
    }

    /* renamed from: y */
    private void m169903y() {
        boolean z = false;
        mo153113a(false);
        Boolean b = C43350d.m172098a().mo155055u().mo5927b();
        if ((C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode") || C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.non_conversation_mode_internal")) && C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.conversation_onboarding")) {
            z = true;
        }
        if (z && b != null && b.booleanValue() && C41816b.m166115a().mo150138e()) {
            mo153113a(true);
        }
    }

    /* renamed from: b */
    public MailThread mo153116b(int i) {
        AbstractC42436a d = m169896d(i);
        if (d instanceof MailThread) {
            return (MailThread) d;
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo153121c(int i) {
        C42697a aVar = this.f108406k;
        if (aVar == null || !aVar.mo153368e()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private AbstractC42436a m169896d(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return this.f108396a.get(i);
    }

    /* renamed from: a */
    private String m169888a(MailAddress mailAddress) {
        if (mailAddress == null) {
            return "";
        }
        String e = mailAddress.mo151182e();
        String a = mailAddress.mo151176a();
        if (C43350d.m172098a().mo155037b(e)) {
            return C43819s.m173684a((int) R.string.Mail_ThreadList_Me);
        }
        return TextUtils.isEmpty(a) ? e : a;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m169894b(List list) {
        C41988g.m166971b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC42436a aVar = (AbstractC42436a) it.next();
            if (aVar instanceof MailThread) {
                arrayList.add((MailThread) aVar);
            }
        }
        C42879j.m170799a().mo153871a(arrayList, this.f108397b);
    }

    /* renamed from: d */
    private boolean m169897d(MailThread mailThread) {
        MailLabelEntity r = C43374f.m172264f().mo155130r();
        if (this.f108400e || r == null || r.mo151527k().equals("OUTBOX")) {
            return true;
        }
        if (!C43374f.m172264f().mo155130r().mo151527k().equals("DRAFT") || !mailThread.mo151730x()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        String str;
        MailThread b = mo153116b(i);
        if (b == null) {
            return mo153100a(getItemViewType(i));
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (b.mo151676a() != null) {
            str = b.mo151676a();
        } else {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append("_");
        stringBuffer.append(i);
        String stringBuffer2 = stringBuffer.toString();
        if (b.mo151728w() == 0) {
            b.mo151677a(stringBuffer2.hashCode());
        }
        return (long) b.mo151728w();
    }

    /* renamed from: c */
    private boolean m169895c(MailThread mailThread) {
        if ("OUTBOX".equals(C43374f.m172264f().mo155129q())) {
            return false;
        }
        if (this.f108402g == 2) {
            for (int i = 0; i < mailThread.mo151723r().size(); i++) {
                if ("SHARE".equals(mailThread.mo151723r().get(i).mo151527k()) && (mailThread.mo151725t() == PermissionCode.VIEW || mailThread.mo151725t() == PermissionCode.EDIT)) {
                    return false;
                }
            }
            return true;
        }
        if (mailThread.mo151723r() != null) {
            if ("SHARE".equals(C43374f.m172264f().mo155129q())) {
                return false;
            }
            for (int i2 = 0; i2 < mailThread.mo151723r().size(); i2++) {
                String k = mailThread.mo151723r().get(i2).mo151527k();
                if ("SPAM".equals(k) || "TRASH".equals(k) || "OUTBOX".equals(k)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo153119b(MailThread mailThread) {
        AbstractC42604d dVar;
        this.f108396a.remove(mailThread);
        m169902x();
        notifyDataSetChanged();
        if (m169901w() <= 0 && (dVar = this.f108411q) != null) {
            dVar.mo152935a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C42697a) {
            m169893b(viewHolder, i);
        }
    }

    /* renamed from: a */
    public void mo153102a(MailThread mailThread, boolean z) {
        mailThread.mo151695c(z);
        m169900v();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C42697a(m169899u(), new C42697a.AbstractC42698a() {
            /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.C425941 */
        });
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
    /* renamed from: a */
    public void mo153097a(RecyclerView.ViewHolder viewHolder, int i) {
        AbstractC42601a aVar;
        if (this.f108400e && (aVar = this.f108408m) != null) {
            aVar.mo152942b();
        }
        MailThread b = mo153116b(i);
        if (b != null) {
            C42697a aVar2 = (C42697a) viewHolder;
            aVar2.mo153362a(true);
            aVar2.mo153360a(this.f108412r, b);
        }
    }

    /* renamed from: b */
    public void mo153118b(int i, C42697a aVar) {
        AbstractC42637b bVar;
        MailThread b = mo153116b(i);
        if (b != null && (bVar = this.f108412r) != null) {
            bVar.mo153205b(b, this.f108399d);
        }
    }

    public C42593a(Context context, int i) {
        this.f108397b = context;
        this.f108402g = i;
        setHasStableIds(true);
        this.f108403h = new ArrayList();
    }

    /* renamed from: a */
    private String m169889a(MailAddress mailAddress, boolean z) {
        String str;
        if (mailAddress == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        if (z) {
            str = mailAddress.mo151182e().toLowerCase();
        } else {
            str = mailAddress.mo151182e();
        }
        sb.append(str);
        sb.append(">");
        if (!TextUtils.isEmpty(mailAddress.mo151176a())) {
            sb.append(mailAddress.mo151176a());
        }
        return sb.toString();
    }

    /* renamed from: a */
    private boolean m169892a(int i, MailThread mailThread) {
        if (this.f108396a.size() <= i) {
            return false;
        }
        while (i < this.f108396a.size()) {
            MailThread b = mo153116b(i);
            if (b == null || mailThread.mo151719n() <= b.mo151719n()) {
                i++;
            } else {
                this.f108396a.add(i, mailThread);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private String m169890a(List<MailAddress> list, int i) {
        boolean z;
        if (CollectionUtils.isEmpty(list)) {
            return C43819s.m173684a((int) R.string.Mail_ThreadAction_RecipientUnFilled);
        }
        boolean z2 = true;
        MailAddress mailAddress = list.get(list.size() - 1);
        MailAddress a = mailAddress.mo151199t().mo151217g(m169888a(mailAddress)).mo151210a();
        HashSet hashSet = new HashSet();
        hashSet.add(m169889a(a, true));
        MailAddress mailAddress2 = null;
        int i2 = Integer.MAX_VALUE;
        int measureText = i - ((int) (this.f108410p.measureText(a.mo151184f() + ", ") + 0.5f));
        if (measureText > 0) {
            int i3 = 0;
            while (true) {
                if (i3 >= list.size() - 1) {
                    break;
                }
                MailAddress mailAddress3 = list.get(i3);
                MailAddress a2 = mailAddress3.mo151199t().mo151217g(m169888a(mailAddress3)).mo151210a();
                if (hashSet.add(m169889a(a2, true))) {
                    measureText -= (int) (this.f108410p.measureText(a2.mo151184f()) + 0.5f);
                    i2 = i3;
                    mailAddress2 = a2;
                    break;
                }
                i3++;
            }
        }
        StringBuilder sb = new StringBuilder(a.mo151184f());
        int size = list.size() - 2;
        while (true) {
            if (size <= i2) {
                z = true;
                break;
            }
            MailAddress mailAddress4 = list.get(size);
            MailAddress a3 = mailAddress4.mo151199t().mo151217g(m169888a(mailAddress4)).mo151210a();
            if (hashSet.add(m169889a(a3, z2))) {
                if (this.f108418x == BitmapDescriptorFactory.HUE_RED) {
                    this.f108418x = this.f108410p.measureText("…");
                }
                int measureText2 = (int) (this.f108410p.measureText(", " + a3.mo151184f()) + 0.5f);
                if (((float) measureText2) + this.f108418x >= ((float) measureText)) {
                    sb.append("…");
                    z = false;
                    break;
                }
                sb.append(", ");
                sb.append(a3.mo151184f());
                measureText -= measureText2;
            }
            size--;
            z2 = true;
        }
        if (mailAddress2 != null) {
            if (z) {
                sb.append(", ");
            }
            sb.append(mailAddress2.mo151184f());
        }
        return sb.toString();
    }

    /* renamed from: b */
    private void m169893b(RecyclerView.ViewHolder viewHolder, final int i) {
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        String str;
        String str2;
        String str3;
        boolean z3;
        String str4;
        String str5;
        final C42697a aVar = (C42697a) viewHolder;
        final MailThread b = mo153116b(i);
        if (b != null) {
            aVar.mo153365c(b.mo151675B());
            aVar.mo153361a(new MailItemView.AbstractC42696a() {
                /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.C425952 */

                @Override // com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView.AbstractC42696a
                /* renamed from: a */
                public void mo153138a() {
                    aVar.mo153363b(true);
                    C42593a.this.f108407l.mo156670a(aVar, 2);
                }

                @Override // com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView.AbstractC42696a
                /* renamed from: b */
                public void mo153139b() {
                    aVar.mo153363b(true);
                    C42593a.this.f108407l.mo156670a(aVar, 4);
                }
            });
            if (this.f108405j == b) {
                this.f108406k = aVar;
            }
            if (this.f108400e) {
                aVar.f108652o.setVisibility(0);
                aVar.f108652o.setChecked(b.mo151724s());
                aVar.f108644g.mo153351a();
                aVar.f108644g.setVisibleBehindSwipe(4);
                aVar.mo153365c(false);
            } else {
                aVar.f108644g.mo153352a(b.mo151716k());
                aVar.f108652o.setVisibility(8);
                aVar.f108644g.setVisibleBehindSwipe(0);
            }
            aVar.f108655r.setBackgroundColor(mo153135q().getResources().getColor(R.color.line_divider_default));
            aVar.f108647j.setVisibility(8);
            boolean equals = "DRAFT".equals(this.f108399d);
            int i7 = this.f108402g;
            if (i7 == 1) {
                if (!TextUtils.isEmpty(b.mo151710g())) {
                    str4 = b.mo151714i();
                    z3 = true;
                } else {
                    if (!TextUtils.isEmpty(b.mo151707f())) {
                        str5 = b.mo151712h();
                    } else {
                        str5 = this.f108397b.getString(R.string.Mail_ThreadList_EmptyBody);
                    }
                    z3 = equals;
                    str4 = str5;
                }
                aVar.f108641d.setText(str4);
                equals = z3;
            } else if (i7 == 2) {
                SearchRet searchRet = (SearchRet) b;
                Spannable D = searchRet.mo151752D();
                D.toString();
                boolean F = searchRet.mo151754F();
                aVar.f108641d.setText(D);
                String J = searchRet.mo151758J();
                if (!(this.f108397b == null || J == null)) {
                    aVar.f108647j.setText(String.format("[%s]", TextUtils.ellipsize(J, aVar.f108647j.getPaint(), (float) UIHelper.dp2px(94.0f), TextUtils.TruncateAt.END).toString()));
                    aVar.f108647j.setVisibility(0);
                }
                equals = F;
            }
            TextView textView = aVar.f108646i;
            if (equals) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            if (!CollectionUtils.isEmpty(b.mo151723r())) {
                if (this.f108402g == 2) {
                    str3 = "SEARCH";
                } else {
                    str3 = C43374f.m172264f().mo155129q();
                }
                C42409b.m169267a(b, str3, aVar.f108641d, this.f108397b);
            } else {
                C42409b.m169266a(aVar.f108641d);
            }
            if (!m169895c(b) || !C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.quicklabel")) {
                aVar.f108653p.setVisibility(4);
                aVar.f108654q.setVisibility(4);
            } else {
                aVar.f108653p.setVisibility(0);
                aVar.f108654q.setVisibility(0);
                if (b.mo151727v()) {
                    aVar.f108653p.setImageResource(R.drawable.ud_icon_flag_filled);
                    aVar.f108653p.setImageTintList(C0215a.m652a(this.f108397b, R.color.mail_icon_unflag_tint));
                } else {
                    aVar.f108653p.setImageResource(R.drawable.ud_icon_flag_outlined);
                    aVar.f108653p.setImageTintList(C0215a.m652a(mo153135q(), R.color.mail_icon_flag_tint));
                }
                aVar.f108654q.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.View$OnClickListenerC425963 */

                    public void onClick(View view) {
                        String str;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (b.mo151727v()) {
                            b.mo151705e(false);
                            arrayList2.add("FLAGGED");
                            aVar.f108653p.setImageResource(R.drawable.ud_icon_flag_outlined);
                            aVar.f108653p.setImageTintList(C0215a.m652a(C42593a.this.f108397b, R.color.mail_icon_flag_tint));
                            C42330c.m169059a(false, C42330c.C42332a.f107635c, C42330c.C42333b.f107660m);
                        } else {
                            b.mo151705e(true);
                            arrayList.add("FLAGGED");
                            aVar.f108653p.setImageResource(R.drawable.ud_icon_flag_filled);
                            aVar.f108653p.setImageTintList(C0215a.m652a(C42593a.this.f108397b, R.color.mail_icon_unflag_tint));
                            C42187a.m168535g(C42187a.C42191c.f107435L);
                            C42330c.m169059a(false, C42330c.C42332a.f107635c, C42330c.C42333b.f107659l);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(b.mo151676a());
                        if (C42593a.this.f108402g == 2) {
                            str = "SEARCH";
                        } else {
                            str = C43374f.m172264f().mo155129q();
                        }
                        C43307b.m172030a().mo154977a(new CustomLabelThreadListMailAction(arrayList3, str, arrayList, arrayList2));
                    }
                });
            }
            boolean b2 = C41816b.m166115a().mo150116F().mo150192b();
            if (!"SHARE".equals(this.f108399d)) {
                aVar.f108642e.setVisibility(0);
                Locale m = C41816b.m166115a().mo150146m();
                if (!(m == null || m.getLanguage() == null)) {
                    "en".equals(m.getLanguage().toLowerCase());
                }
                aVar.f108642e.setText(C43762e.m173474a(b.mo151719n(), b2));
            } else {
                aVar.f108642e.setVisibility(8);
            }
            if (!"SCHEDULED".equals(this.f108399d) || b.mo151732z() <= 0 || b.mo151731y() <= 0) {
                z = false;
            } else {
                z = true;
            }
            ImageView imageView = aVar.f108649l;
            if ("SCHEDULED".equals(this.f108399d) || b.mo151732z() <= 0) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            imageView.setVisibility(i3);
            if (z) {
                aVar.f108642e.setText(C43762e.m173474a(b.mo151731y(), b2));
                aVar.f108642e.setTextColor(this.f108397b.getResources().getColor(R.color.lkui_B500));
                aVar.f108650m.setVisibility(0);
            } else {
                aVar.f108642e.setTextColor(this.f108397b.getResources().getColor(R.color.lkui_N500));
                aVar.f108650m.setVisibility(8);
            }
            int i8 = this.f108402g;
            if (i8 == 1) {
                z2 = b.mo151715j();
            } else if (i8 == 2) {
                z2 = ((SearchRet) b).mo151715j();
            } else {
                z2 = false;
            }
            ImageView imageView2 = aVar.f108648k;
            if (z2) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            imageView2.setVisibility(i4);
            int i9 = this.f108402g;
            if (i9 == 1) {
                int windowWidth = UIHelper.getWindowWidth(this.f108397b);
                if (this.f108400e) {
                    i6 = UIHelper.getDimens(R.dimen.mail_thread_item_front_checkbox_margin_left) + UIHelper.getDimens(R.dimen.mail_thread_item_front_checkbox_margin_right) + UIHelper.getDimens(R.dimen.mail_thread_item_front_checkbox_size);
                } else {
                    i6 = UIHelper.getDimens(R.dimen.mail_thread_item_front_min_width);
                }
                int i10 = windowWidth - i6;
                if (equals) {
                    this.f108410p.setTextSize(aVar.f108646i.getTextSize());
                    i10 = (int) (((float) i10) - this.f108410p.measureText(aVar.f108646i.getText().toString()));
                }
                int dimens = i10 - UIHelper.getDimens(R.dimen.mail_thread_container_padding_right);
                this.f108410p.setTextSize(aVar.f108642e.getTextSize());
                int measureText = (int) (((float) dimens) - (this.f108410p.measureText(aVar.f108642e.getText().toString()) + ((float) UIHelper.getDimens(R.dimen.mail_thread_label_margin))));
                if (!(aVar.f108649l.getVisibility() == 8 && aVar.f108650m.getVisibility() == 8)) {
                    measureText -= UIHelper.getDimens(R.dimen.mail_thread_label_margin) + UIHelper.getDimens(R.dimen.mail_thread_label_size);
                }
                if (aVar.f108648k.getVisibility() != 8) {
                    measureText -= UIHelper.getDimens(R.dimen.mail_thread_label_margin) + UIHelper.getDimens(R.dimen.mail_thread_label_size);
                }
                this.f108410p.setTextSize(aVar.f108639b.getTextSize());
                if (f108395o.contains(this.f108399d)) {
                    str = m169891a(b.mo151696d(), b.mo151720o(), measureText);
                } else {
                    str = m169890a(b.mo151696d(), measureText);
                }
                aVar.f108639b.setText(str);
                if (TextUtils.isEmpty(b.mo151702e())) {
                    str2 = this.f108397b.getString(R.string.Mail_ThreadList_TitleEmpty);
                } else {
                    str2 = b.mo151702e();
                }
                aVar.f108640c.setText(str2);
            } else if (i9 == 2) {
                SearchRet searchRet2 = (SearchRet) b;
                aVar.f108640c.setText(searchRet2.mo151751C());
                aVar.f108639b.setText(searchRet2.mo151753E());
            }
            if (b.mo151716k()) {
                aVar.f108639b.setTypeface(Typeface.DEFAULT);
                aVar.f108640c.setTypeface(Typeface.DEFAULT);
            } else {
                aVar.f108639b.setTypeface(Typeface.DEFAULT_BOLD);
                aVar.f108640c.setTypeface(Typeface.DEFAULT_BOLD);
            }
            UDBadgeView uDBadgeView = aVar.f108651n;
            if (b.mo151716k() || this.f108400e) {
                i5 = 8;
            } else {
                i5 = 0;
            }
            uDBadgeView.setVisibility(i5);
            if (b.mo151686b() > 1) {
                aVar.f108645h.setText(b.mo151718m());
                aVar.f108645h.setVisibility(0);
            } else {
                aVar.f108645h.setVisibility(8);
            }
            aVar.f108643f.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.C425974 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (C42593a.this.f108400e) {
                        boolean z = !b.mo151724s();
                        if (!z) {
                            C42593a aVar = C42593a.this;
                            aVar.f108401f--;
                            C42593a.this.f108403h.remove(b);
                            if (C42593a.this.f108403h.size() == 0 && C42593a.this.f108408m != null) {
                                C42593a.this.f108408m.mo152940a();
                            }
                        } else if (C42593a.this.f108401f < 100) {
                            C42593a.this.f108401f++;
                            C42593a.this.f108403h.add(b);
                        } else {
                            C42593a.this.mo153134p();
                            return;
                        }
                        C42593a.this.mo153102a(b, z);
                    } else if (C42593a.this.f108402g == 2) {
                        if (C42593a.this.f108409n != null) {
                            C42593a.this.f108409n.mo153145a(b, i);
                        }
                    } else if (C42593a.this.f108398c != null) {
                        C42441c.m169464a().mo152737a(b.mo151676a());
                        C42593a.this.f108398c.mo152988a(b, C42593a.this.f108399d);
                    }
                }
            });
            if (this.f108400e) {
                aVar.f108652o.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.View$OnClickListenerC425985 */

                    public void onClick(View view) {
                        boolean z = !b.mo151724s();
                        if (!z) {
                            C42593a aVar = C42593a.this;
                            aVar.f108401f--;
                            C42593a.this.f108403h.remove(b);
                        } else if (C42593a.this.f108401f < 100) {
                            C42593a.this.f108401f++;
                            C42593a.this.f108403h.add(b);
                        } else {
                            aVar.f108652o.setChecked(false);
                            C42593a.this.mo153134p();
                            return;
                        }
                        C42593a.this.mo153102a(b, z);
                    }
                });
            }
            aVar.f108643f.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.View$OnLongClickListenerC425996 */

                public boolean onLongClick(View view) {
                    if (!MailLabelEntity.m167586e(C42593a.this.f108399d) || C42593a.this.f108400e) {
                        return false;
                    }
                    if (C42593a.this.f108404i != null && C42593a.this.f108404i.mo153199b()) {
                        return false;
                    }
                    C42593a.this.f108403h.clear();
                    C42593a.this.f108401f++;
                    C42593a.this.f108403h.add(b);
                    C42593a.this.f108400e = true;
                    C42593a.this.mo153137s();
                    b.mo151695c(true);
                    if (C42593a.this.f108408m != null) {
                        C42593a.this.f108408m.mo152941a(b);
                    }
                    C42593a.this.mo153102a(b, true);
                    return true;
                }
            });
            if (this.f108417w && b.mo151686b() >= 3) {
                aVar.itemView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.C42593a.ViewTreeObserver$OnGlobalLayoutListenerC426007 */

                    public void onGlobalLayout() {
                        aVar.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        Rect rect = new Rect();
                        if (aVar.itemView.getGlobalVisibleRect(rect) && Math.abs(UIHelper.getDimens(R.dimen.mail_home_thread_list_item_height) - Math.abs(rect.top - rect.bottom)) <= 10) {
                            C42444d.m169478a(C42593a.this.f108397b);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo153101a(int i, C42697a aVar) {
        AbstractC42637b bVar;
        MailThread b = mo153116b(i);
        if (b != null && (bVar = this.f108412r) != null) {
            bVar.mo153203a(b, this.f108399d);
            if (b.mo151716k()) {
                C42207i.m168608a(202105242, b.mo151676a(), 1000);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
    /* renamed from: b */
    public AbstractC44022a mo153099b(RecyclerView.ViewHolder viewHolder, int i, int i2) {
        C42697a aVar = (C42697a) viewHolder;
        aVar.mo153369f();
        aVar.mo153362a(false);
        if (!aVar.mo153366c()) {
            if (aVar.mo153368e() || (i2 != 2 && i2 != 4)) {
                return new C42607g(aVar, i);
            }
            if (aVar.mo153367d()) {
                aVar.mo156722d(C42697a.f108637a);
                aVar.mo156721c(BitmapDescriptorFactory.HUE_RED);
                return new C42608h(aVar, i);
            }
            aVar.mo156722d(BitmapDescriptorFactory.HUE_RED);
            aVar.mo156721c(-C42697a.f108637a);
            return new C42605e(aVar, i);
        } else if (aVar.mo153367d()) {
            if (i2 == 1) {
                return null;
            }
            return new C42609i(this, i, aVar);
        } else if (i2 == 1) {
            return null;
        } else {
            return new C42606f(this, i, aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0134 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0281 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m169891a(java.util.List<com.ss.android.lark.mail.impl.entity.MailAddress> r18, java.util.List<com.ss.android.lark.mail.impl.entity.MailAddress> r19, int r20) {
        /*
        // Method dump skipped, instructions count: 661
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.home.threadlist.C42593a.m169891a(java.util.List, java.util.List, int):java.lang.String");
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44040g
    /* renamed from: a */
    public int mo153096a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3) {
        ArrayList<String> arrayList;
        MailThread b = mo153116b(i);
        int i4 = 0;
        if (b == null || m169897d(b)) {
            return 0;
        }
        ThreadActionConfig singleThreadActionConfig = this.f108415u.getSingleThreadActionConfig(null, b.mo151723r(), this.f108399d, b.mo151674A());
        if (singleThreadActionConfig == null) {
            arrayList = null;
        } else {
            arrayList = singleThreadActionConfig.getAllActionList();
        }
        Map<String, Boolean> actionMap = ThreadActionUtil.getActionMap(arrayList);
        if (actionMap.containsKey("ARCHIVE") && C43374f.m172264f().mo155133u()) {
            i4 = 8192;
        }
        if (actionMap.containsKey("MARK_AS_READ") || actionMap.containsKey("MARK_AS_UNREAD")) {
            i4 |= 2;
        }
        if (!(i4 == 0 || b == null || this.f108405j == null || TextUtils.equals(b.mo151676a(), this.f108405j.mo151676a()))) {
            mo153137s();
            this.f108405j = null;
            this.f108406k = null;
        }
        return i4;
    }
}
