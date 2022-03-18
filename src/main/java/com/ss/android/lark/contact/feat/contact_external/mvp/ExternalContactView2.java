package com.ss.android.lark.contact.feat.contact_external.mvp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.feat.common.IndexBar;
import com.ss.android.lark.contact.feat.contact_external.data.ExternalContactViewData;
import com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c;
import com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2;
import com.ss.android.lark.contact.feat.contact_external.view.C35458a;
import com.ss.android.lark.contact.feat.contact_external.view.C35462b;
import com.ss.android.lark.contact.feat.contact_external.view.IndexDataOwner;
import com.ss.android.lark.contact.feat.contact_external.view.IndexRecyclerViewAdapter;
import com.ss.android.lark.contact.feat.statistics.ContactMobileHitPoint;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.aj;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ExternalContactView2 implements AbstractC35453c.AbstractC35456b {

    /* renamed from: a */
    public AbstractC35453c.AbstractC35456b.AbstractC35457a f91621a;

    /* renamed from: b */
    private Context f91622b;

    /* renamed from: c */
    private AbstractC35441c f91623c;

    /* renamed from: d */
    private C35458a f91624d;

    /* renamed from: e */
    private LKUIStatus f91625e;

    /* renamed from: f */
    private C35438b f91626f;

    /* renamed from: g */
    private C35436a f91627g;

    /* renamed from: h */
    private boolean f91628h;
    View mExternalAddLayout;
    TextView mExternalAddTv;
    ViewGroup mExternalContactContentLayout;
    View mExternalContactEmptyLayout;
    ViewGroup mExternalContactLayout;
    RecyclerView mExternalContactRV;
    LKUIPtrClassicFrameLayout mPtrFrame;
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2$c */
    public interface AbstractC35441c {
        /* renamed from: a */
        void mo130763a(Chatter chatter);

        /* renamed from: a */
        void mo130764a(ExternalContactView2 externalContactView2);
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: b */
    public void mo130798b() {
        this.f91625e.mo89838a(300);
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: c */
    public void mo130800c() {
        this.f91625e.mo89847d();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f91623c = null;
        this.f91621a = null;
    }

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2$b */
    public static class C35438b {

        /* renamed from: a */
        public final IndexBar f91635a;

        /* renamed from: b */
        private final FrameLayout f91636b;

        /* renamed from: c */
        private final TextView f91637c;

        /* renamed from: d */
        private Vibrator f91638d;

        /* renamed from: a */
        public void mo130806a() {
            FrameLayout frameLayout = this.f91636b;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
        }

        /* renamed from: b */
        public void mo130811b() {
            TextView textView = this.f91637c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }

        /* renamed from: c */
        public Vibrator mo130812c() {
            if (this.f91638d == null) {
                this.f91638d = (Vibrator) aj.m224263a().getSystemService("vibrator");
            }
            return this.f91638d;
        }

        /* renamed from: a */
        public void mo130807a(int i) {
            IndexBar indexBar = this.f91635a;
            if (indexBar != null) {
                indexBar.setFocusIndex(i);
            }
        }

        /* renamed from: b */
        public LinearLayoutManager mo130810b(RecyclerView recyclerView) {
            return (LinearLayoutManager) recyclerView.getLayoutManager();
        }

        /* renamed from: c */
        public IndexRecyclerViewAdapter<?, ?> mo130813c(RecyclerView recyclerView) {
            return (IndexRecyclerViewAdapter) recyclerView.getAdapter();
        }

        /* access modifiers changed from: public */
        /* renamed from: d */
        private /* synthetic */ void m138629d(RecyclerView recyclerView) {
            Map<Integer, String> c = mo130813c(recyclerView).mo130867c();
            IndexBar indexBar = this.f91635a;
            if (indexBar != null) {
                indexBar.setNavigators(new ArrayList(c.values()));
            }
        }

        /* renamed from: a */
        public void mo130808a(final RecyclerView recyclerView) {
            this.f91635a.setOnTouchingLetterChangedListener(new IndexBar.AbstractC35425a() {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2.C35438b.C354391 */

                /* renamed from: c */
                private IndexRecyclerViewAdapter.IndexSection f91641c;

                @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
                /* renamed from: a */
                public void mo130745a(String str) {
                    C35438b.this.mo130812c().vibrate(10);
                    m138638d(str);
                }

                @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
                /* renamed from: c */
                public void mo130747c(String str) {
                    C35438b.this.mo130811b();
                    this.f91641c = null;
                }

                @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
                /* renamed from: b */
                public void mo130746b(String str) {
                    C35438b.this.mo130812c().vibrate(10);
                    m138638d(str);
                    ContactMobileHitPoint.m138541i();
                }

                /* renamed from: d */
                private void m138638d(String str) {
                    IndexRecyclerViewAdapter.IndexSection bVar = this.f91641c;
                    if (bVar == null || !TextUtils.equals(str, bVar.mo130873b())) {
                        IndexRecyclerViewAdapter.IndexSection a = C35438b.this.mo130813c(recyclerView).mo130868d().mo130870a(str);
                        this.f91641c = a;
                        if (a != null) {
                            C35438b.this.mo130810b(recyclerView).scrollToPositionWithOffset(a.mo130874c(), 0);
                            int a2 = this.f91641c.mo130871a();
                            float d = (float) this.f91641c.mo130875d();
                            C35438b bVar2 = C35438b.this;
                            bVar2.mo130809a(str, ((((float) a2) + 0.5f) - (d / 2.0f)) * ((((float) C35438b.this.f91635a.getHeight()) * 1.0f) / d));
                        }
                    }
                }
            });
            mo130813c(recyclerView).mo130864a(new IndexDataOwner.IndexDataObserver(recyclerView) {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.$$Lambda$ExternalContactView2$b$FxIkwUsDOH9CreUSjejT_7XWKI */
                public final /* synthetic */ RecyclerView f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.contact.feat.contact_external.view.IndexDataOwner.IndexDataObserver
                public final void onDataSetChanged() {
                    ExternalContactView2.C35438b.m270480lambda$FxIkwUsDOH9CreUSjejT_7XWKI(ExternalContactView2.C35438b.this, this.f$1);
                }
            });
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2.C35438b.C354402 */

                /* renamed from: b */
                private IndexRecyclerViewAdapter.IndexSection f91643b;

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        this.f91643b = null;
                    }
                    int findFirstVisibleItemPosition = C35438b.this.mo130810b(recyclerView).findFirstVisibleItemPosition();
                    IndexRecyclerViewAdapter.IndexSection bVar = this.f91643b;
                    if (bVar == null || !bVar.mo130872a(findFirstVisibleItemPosition)) {
                        IndexRecyclerViewAdapter.IndexSection a = C35438b.this.mo130813c(recyclerView).mo130868d().mo130869a(findFirstVisibleItemPosition);
                        this.f91643b = a;
                        if (a != null) {
                            C35438b.this.mo130807a(a.mo130871a());
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                }
            });
        }

        public C35438b(ViewGroup viewGroup) {
            this.f91636b = (FrameLayout) viewGroup.findViewById(R.id.index_bar_layout);
            TextView textView = (TextView) viewGroup.findViewById(R.id.index_bar_tip);
            this.f91637c = textView;
            this.f91635a = (IndexBar) viewGroup.findViewById(R.id.index_bar);
            textView.setVisibility(8);
        }

        /* renamed from: a */
        public void mo130809a(String str, float f) {
            TextView textView = this.f91637c;
            if (textView != null) {
                textView.setVisibility(0);
                this.f91637c.setText(str);
                ViewGroup.LayoutParams layoutParams = this.f91637c.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) f;
                    this.f91637c.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: d */
    private void m138609d() {
        m138611f();
        m138610e();
        m138612g();
        m138613h();
    }

    /* renamed from: i */
    private void m138614i() {
        this.mPtrFrame.setVisibility(0);
        this.mExternalContactEmptyLayout.setVisibility(8);
    }

    /* renamed from: f */
    private void m138611f() {
        int i;
        if (C35358a.m138143a().mo130163h().mo130230b()) {
            i = R.string.Lark_Legacy_Contact;
        } else {
            i = R.string.Lark_Legacy_StructureExternal;
        }
        this.mTitleBar.setTitle(i);
    }

    /* renamed from: g */
    private void m138612g() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f91622b);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
    }

    /* renamed from: e */
    private void m138610e() {
        AbstractC35361b.AbstractC35374m e = C35358a.m138143a().mo130158e();
        if (e.mo130216a()) {
            this.mExternalAddLayout.setVisibility(0);
            this.mExternalAddTv.setText(e.mo130220c());
            C57832h.m224486a(this.mExternalAddLayout);
            this.mExternalAddLayout.setOnClickListener(new View.OnClickListener(e) {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.$$Lambda$ExternalContactView2$GlrRTzkIHnDPrRAOSPzTGd1aQkM */
                public final /* synthetic */ AbstractC35361b.AbstractC35374m f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    ExternalContactView2.lambda$GlrRTzkIHnDPrRAOSPzTGd1aQkM(ExternalContactView2.this, this.f$1, view);
                }
            });
            return;
        }
        this.mExternalAddLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: a */
    public void mo130792a() {
        this.mPtrFrame.setVisibility(8);
        this.mExternalContactEmptyLayout.setVisibility(0);
        C57582a.m223615c(this.mExternalContactEmptyLayout);
    }

    /* renamed from: h */
    private void m138613h() {
        this.mExternalContactRV.setLayoutManager(new LinearLayoutManager(this.f91622b, 1, false));
        if (this.f91624d == null) {
            this.f91624d = new C35458a();
        }
        this.f91624d.mo130851a(new C35458a.AbstractC35461a() {
            /* class com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2.C354351 */

            @Override // com.ss.android.lark.contact.feat.contact_external.view.C35458a.AbstractC35461a
            /* renamed from: a */
            public void mo130802a(ExternalContactViewData aVar) {
                ExternalContactView2.this.mo130795a(aVar);
            }

            @Override // com.ss.android.lark.contact.feat.contact_external.view.C35458a.AbstractC35461a
            /* renamed from: a */
            public void mo130803a(String str) {
                ExternalContactView2.this.f91621a.mo130836a(str);
            }
        });
        this.mExternalContactRV.setAdapter(this.f91624d);
        if (this.f91628h) {
            this.f91624d.mo130865a(true);
            C35438b bVar = new C35438b(this.mExternalContactLayout);
            this.f91626f = bVar;
            bVar.mo130808a(this.mExternalContactRV);
            C35436a aVar = new C35436a();
            this.f91627g = aVar;
            aVar.mo130805a(this.mExternalContactRV, this.f91624d.mo130867c());
        } else {
            this.f91624d.mo130865a(false);
            C35438b bVar2 = new C35438b(this.mExternalContactLayout);
            this.f91626f = bVar2;
            bVar2.mo130806a();
        }
        this.f91625e = new LKUIStatus.C25680a(this.mExternalContactContentLayout).mo89859a();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC35361b.AbstractC35375n c;
        boolean z;
        this.f91623c.mo130764a(this);
        this.f91622b = this.mTitleBar.getContext();
        boolean a = C35358a.m138143a().mo130150b().mo130208a("contact.external.alphabetic.group");
        if (a && (c = C35358a.m138143a().mo130153c()) != null) {
            if (c.mo130224b().booleanValue() || c.mo130225c().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            this.f91628h = z;
        }
        Log.m165389i("ExternalContactView2", "isGroupFgEnable=" + a);
        m138609d();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35453c.AbstractC35456b.AbstractC35457a aVar) {
        this.f91621a = aVar;
    }

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2$a */
    public static class C35436a {

        /* renamed from: a */
        public C35462b f91630a;

        /* renamed from: b */
        private RecyclerView f91631b;

        /* renamed from: c */
        private IndexDataOwner.IndexDataObserver f91632c;

        /* renamed from: a */
        public IndexRecyclerViewAdapter<?, ?> mo130804a(RecyclerView recyclerView) {
            return (IndexRecyclerViewAdapter) recyclerView.getAdapter();
        }

        /* renamed from: a */
        public void mo130805a(final RecyclerView recyclerView, Map<Integer, String> map) {
            this.f91631b = recyclerView;
            C35462b a = new C35462b.C35463a().mo130861a(map).mo130862a(recyclerView.getContext());
            this.f91630a = a;
            recyclerView.addItemDecoration(a);
            IndexRecyclerViewAdapter<?, ?> a2 = mo130804a(recyclerView);
            C354371 r0 = new IndexDataOwner.IndexDataObserver() {
                /* class com.ss.android.lark.contact.feat.contact_external.mvp.ExternalContactView2.C35436a.C354371 */

                @Override // com.ss.android.lark.contact.feat.contact_external.view.IndexDataOwner.IndexDataObserver
                public void onDataSetChanged() {
                    C35436a.this.f91630a.mo130857a(C35436a.this.mo130804a(recyclerView).mo130867c());
                }
            };
            this.f91632c = r0;
            a2.mo130864a(r0);
        }
    }

    public ExternalContactView2(AbstractC35441c cVar) {
        this.f91623c = cVar;
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: a */
    public void mo130793a(int i) {
        Context context = this.f91622b;
        if (context != null) {
            UDToast.show(context, i);
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: b */
    public void mo130799b(ExternalContactViewData aVar) {
        this.f91624d.remove(aVar);
        if (CollectionUtils.isEmpty(this.f91624d.getItems())) {
            mo130792a();
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: a */
    public void mo130794a(Chatter chatter) {
        this.f91623c.mo130763a(chatter);
    }

    /* renamed from: a */
    public void mo130795a(ExternalContactViewData aVar) {
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(this.f91622b).title(R.string.Lark_Contacts_DeleteNewContactHistory)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(aVar) {
            /* class com.ss.android.lark.contact.feat.contact_external.mvp.$$Lambda$ExternalContactView2$Xu7XCOM0OMLz8pYe2YMH8SMsKDk */
            public final /* synthetic */ ExternalContactViewData f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ExternalContactView2.lambda$Xu7XCOM0OMLz8pYe2YMH8SMsKDk(ExternalContactView2.this, this.f$1, dialogInterface, i);
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null)).show();
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: c */
    public void mo130801c(ExternalContactViewData aVar) {
        if (aVar != null) {
            String d = aVar.mo130776d();
            boolean h = aVar.mo130785h();
            if (TextUtils.isEmpty(d)) {
                Log.m165382e("remove external contact failed: chatter id is empty");
                return;
            }
            List items = this.f91624d.getItems();
            if (h) {
                Iterator it = items.iterator();
                while (true) {
                    if (it.hasNext()) {
                        ExternalContactViewData aVar2 = (ExternalContactViewData) it.next();
                        if (aVar2 != null && TextUtils.equals(d, aVar2.mo130776d())) {
                            this.f91624d.remove(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i < items.size()) {
                        ExternalContactViewData aVar3 = (ExternalContactViewData) items.get(i);
                        if (aVar3 != null && TextUtils.equals(d, aVar3.mo130776d())) {
                            items.set(i, aVar);
                            this.f91624d.notifyItemChanged(aVar);
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (!z) {
                    if (this.f91628h) {
                        ArrayList arrayList = new ArrayList(items);
                        arrayList.add(aVar);
                        Collections.sort(arrayList);
                        this.f91624d.diff(arrayList);
                    } else {
                        this.f91624d.add(aVar);
                    }
                }
            }
            if (CollectionUtils.isEmpty(items)) {
                mo130792a();
            } else {
                m138614i();
            }
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_external.mvp.AbstractC35453c.AbstractC35456b
    /* renamed from: a */
    public void mo130797a(List<ExternalContactViewData> list) {
        m138614i();
        if (this.f91628h && list != null) {
            Collections.sort(list);
        }
        this.f91624d.clear();
        this.f91624d.addAll(list);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m138607a(AbstractC35361b.AbstractC35374m mVar, View view) {
        ContactHitPoint.m140804g("add_external");
        ContactHitPoint.m140795c("external_contacts");
        mVar.mo130214a(this.f91622b, "contact_external");
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m138608a(ExternalContactViewData aVar, DialogInterface dialogInterface, int i) {
        this.f91621a.mo130835a(aVar);
    }
}
