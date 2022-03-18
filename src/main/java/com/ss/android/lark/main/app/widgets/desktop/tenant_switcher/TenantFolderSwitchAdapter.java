package com.ss.android.lark.main.app.widgets.desktop.tenant_switcher;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.BaseItemViewData;
import com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.entity.C44487b;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TenantFolderSwitchAdapter extends LarkRecyclerViewBaseAdapter<TenantItemHolder, BaseItemViewData> {

    /* renamed from: a */
    public AbstractC44461b f112796a;

    /* renamed from: b */
    public Map<String, Boolean> f112797b = new HashMap();

    /* renamed from: c */
    private int f112798c;

    /* renamed from: d */
    private Context f112799d;

    /* renamed from: e */
    private C36592a f112800e;

    /* renamed from: f */
    private AbstractC44136a.AbstractC44148d f112801f;

    public @interface Status {
    }

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter$b */
    public interface AbstractC44461b {
        /* renamed from: a */
        void mo157864a();

        /* renamed from: a */
        void mo157865a(C44487b bVar);

        /* renamed from: b */
        void mo157866b();
    }

    /* renamed from: b */
    public int mo157876b() {
        return this.f112798c;
    }

    /* renamed from: a */
    public void onBindViewHolder(TenantItemHolder tenantItemHolder, int i) {
        BaseItemViewData baseItemViewData = (BaseItemViewData) getItem(i);
        if (baseItemViewData.mo157906a() != 0) {
            m176407a(tenantItemHolder, baseItemViewData);
        } else {
            m176408a(tenantItemHolder, (C44487b) baseItemViewData);
        }
    }

    /* renamed from: a */
    public void mo157875a(Collection<? extends BaseItemViewData> collection, int i) {
        this.f112798c = i;
        ArrayList arrayList = new ArrayList(collection);
        if (this.items.size() == 0) {
            this.items.addAll(arrayList);
            notifyDataSetChanged();
            return;
        }
        C1374g.m6298a(new C44460a(this.items, arrayList), false).mo7412a(this);
        this.items.clear();
        this.items.addAll(arrayList);
    }

    /* renamed from: com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter$a */
    public class C44460a extends C1374g.AbstractC1376a {

        /* renamed from: b */
        private List<BaseItemViewData> f112810b;

        /* renamed from: c */
        private List<BaseItemViewData> f112811c;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f112810b.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f112811c.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            return this.f112810b.get(i).equals(this.f112811c.get(i2));
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return this.f112810b.get(i).mo157907a(this.f112811c.get(i2));
        }

        public C44460a(List<BaseItemViewData> list, List<BaseItemViewData> list2) {
            TenantFolderSwitchAdapter.this = r1;
            this.f112810b = list;
            this.f112811c = list2;
            if (list == null) {
                this.f112810b = new ArrayList();
            }
            if (this.f112811c == null) {
                this.f112811c = new ArrayList();
            }
        }
    }

    /* renamed from: a */
    public void mo157871a() {
        C36592a aVar = this.f112800e;
        if (aVar != null) {
            aVar.dismiss();
            this.f112800e = null;
        }
    }

    /* renamed from: a */
    public void mo157873a(AbstractC44461b bVar) {
        this.f112796a = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return ((BaseItemViewData) getItem(i)).mo157908b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f112799d = recyclerView.getContext();
        this.f112801f = C44134a.m174959a().mo133261q();
    }

    /* renamed from: a */
    public String mo157870a(C44487b bVar) {
        if ("0".equals(bVar.mo157915h())) {
            return this.f112801f.mo133326a(bVar.mo157912e(), bVar.mo157913f());
        }
        return bVar.mo157916i();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m176409a(BaseItemViewData baseItemViewData, View view) {
        AbstractC44461b bVar;
        if (baseItemViewData.mo157906a() == 1) {
            AbstractC44461b bVar2 = this.f112796a;
            if (bVar2 != null) {
                bVar2.mo157864a();
            }
        } else if (baseItemViewData.mo157906a() == 2 && (bVar = this.f112796a) != null) {
            bVar.mo157866b();
        }
    }

    /* renamed from: b */
    private void m176411b(final TenantItemHolder tenantItemHolder, final C44487b bVar) {
        tenantItemHolder.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter.View$OnClickListenerC444571 */

            /* renamed from: lambda$OQyVU3qR7P1rGVl3sJA-cPzxCiE */
            public static /* synthetic */ void m270798lambda$OQyVU3qR7P1rGVl3sJAcPzxCiE(View$OnClickListenerC444571 r0) {
                r0.m176420a();
            }

            /* renamed from: a */
            private /* synthetic */ void m176420a() {
                TenantFolderSwitchAdapter.this.mo157871a();
            }

            public void onClick(View view) {
                UICallbackExecutor.executeDelayed(new Runnable() {
                    /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.$$Lambda$TenantFolderSwitchAdapter$1$OQyVU3qR7P1rGVl3sJAcPzxCiE */

                    public final void run() {
                        TenantFolderSwitchAdapter.View$OnClickListenerC444571.m270798lambda$OQyVU3qR7P1rGVl3sJAcPzxCiE(TenantFolderSwitchAdapter.View$OnClickListenerC444571.this);
                    }
                }, 200);
                if (TenantFolderSwitchAdapter.this.f112796a != null && !bVar.mo157911d()) {
                    TenantFolderSwitchAdapter.this.f112796a.mo157865a(bVar);
                }
            }
        });
        tenantItemHolder.itemView.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter.View$OnHoverListenerC444582 */

            public boolean onHover(View view, MotionEvent motionEvent) {
                final String str = (String) tenantItemHolder.itemView.getTag();
                int action = motionEvent.getAction();
                if (action == 9) {
                    TenantFolderSwitchAdapter.this.f112797b.put(str, true);
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.TenantFolderSwitchAdapter.View$OnHoverListenerC444582.RunnableC444591 */

                        public void run() {
                            Boolean bool = TenantFolderSwitchAdapter.this.f112797b.get(str);
                            if (bool != null && bool.booleanValue()) {
                                TenantFolderSwitchAdapter.this.mo157872a((View) tenantItemHolder.mAvatar, TenantFolderSwitchAdapter.this.mo157870a(bVar));
                            }
                        }
                    }, 200);
                } else if (action == 10) {
                    TenantFolderSwitchAdapter.this.f112797b.remove(str);
                    TenantFolderSwitchAdapter.this.mo157871a();
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    private void m176406a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            ((C2124f) ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f112799d).mo10415a(str).mo11144c(UIHelper.dp2px(28.0f), UIHelper.dp2px(28.0f))).mo11150h()).mo11143c(R.drawable.tenant_avatar_bg)).mo11129a(AbstractC2354j.f7811a)).mo11157n()).mo10399a(imageView);
        }
    }

    /* renamed from: a */
    private void m176407a(TenantItemHolder tenantItemHolder, BaseItemViewData baseItemViewData) {
        int i;
        tenantItemHolder.mCurrentUserIndicator.setVisibility(4);
        LKUIRoundedImageView lKUIRoundedImageView = tenantItemHolder.mAvatar;
        if (baseItemViewData.mo157906a() == 1) {
            i = R.drawable.icon_tenant_fold;
        } else {
            i = R.drawable.icon_tenant_unfold;
        }
        lKUIRoundedImageView.setImageResource(i);
        tenantItemHolder.mAvatar.setBackground(null);
        tenantItemHolder.mAvatar.setAlpha(0.2f);
        tenantItemHolder.mMaskView.setVisibility(8);
        tenantItemHolder.itemView.setOnClickListener(new View.OnClickListener(baseItemViewData) {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.$$Lambda$TenantFolderSwitchAdapter$3bxBaSLCkfxlzvvIpST73nFDY4M */
            public final /* synthetic */ BaseItemViewData f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                TenantFolderSwitchAdapter.lambda$3bxBaSLCkfxlzvvIpST73nFDY4M(TenantFolderSwitchAdapter.this, this.f$1, view);
            }
        });
        tenantItemHolder.itemView.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.main.app.widgets.desktop.tenant_switcher.$$Lambda$TenantFolderSwitchAdapter$O7ykJA52gKwuprp7HhMlxA6qNPs */

            public final boolean onHover(View view, MotionEvent motionEvent) {
                return TenantFolderSwitchAdapter.lambda$O7ykJA52gKwuprp7HhMlxA6qNPs(TenantItemHolder.this, view, motionEvent);
            }
        });
    }

    /* renamed from: a */
    private void m176408a(TenantItemHolder tenantItemHolder, C44487b bVar) {
        int i;
        View view = tenantItemHolder.mCurrentUserIndicator;
        int i2 = 0;
        if (bVar.mo157911d()) {
            i = 0;
        } else {
            i = 4;
        }
        view.setVisibility(i);
        m176406a((ImageView) tenantItemHolder.mAvatar, bVar.mo157918k());
        View view2 = tenantItemHolder.mMaskView;
        if (bVar.mo157911d()) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        View view3 = tenantItemHolder.itemView;
        view3.setTag(bVar.mo157908b() + "");
        m176411b(tenantItemHolder, bVar);
    }

    /* renamed from: a */
    public TenantItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TenantItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tenant_switch_item_layout, viewGroup, false));
    }

    /* renamed from: a */
    public void mo157872a(View view, String str) {
        if (str != null) {
            if (this.f112800e == null) {
                this.f112800e = new C36592a.C36593a().mo135002a(str).mo135003a(this.f112799d);
            }
            this.f112800e.mo134998a(view, 28, 28, 10, -2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m176410a(TenantItemHolder tenantItemHolder, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            tenantItemHolder.mAvatar.setAlpha(0.4f);
            return false;
        } else if (motionEvent.getAction() != 10) {
            return false;
        } else {
            tenantItemHolder.mAvatar.setAlpha(0.2f);
            return false;
        }
    }
}
