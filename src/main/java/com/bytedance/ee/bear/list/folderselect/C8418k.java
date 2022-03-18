package com.bytedance.ee.bear.list.folderselect;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.route.parcelable.DocOperateBean;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folderselect.AbstractC8403e;
import com.bytedance.ee.bear.list.folderselect.C8397b;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.larksuite.suite.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.list.folderselect.k */
public class C8418k implements AbstractC8403e.AbstractC8405b {

    /* renamed from: a */
    public AbstractC8403e.AbstractC8405b.AbstractC8406a f22691a;

    /* renamed from: b */
    private final View f22692b;

    /* renamed from: c */
    private FrameLayout f22693c;

    /* renamed from: d */
    private LinearLayout f22694d;

    /* renamed from: e */
    private LinearLayout f22695e;

    /* renamed from: f */
    private Group f22696f;

    /* renamed from: g */
    private final String f22697g;

    /* renamed from: h */
    private final DocOperateBean f22698h;

    /* renamed from: i */
    private final Context f22699i;

    /* renamed from: j */
    private final C10917c f22700j;

    /* renamed from: k */
    private C8397b f22701k;

    public static /* synthetic */ void lambda$EeIbzXfMGwkplkblme3FXC1Mcec(C8418k kVar, View view, int i, Document document) {
        kVar.m34862a(view, i, document);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f22691a = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m34861a();
    }

    /* renamed from: b */
    private void m34863b() {
        this.f22693c.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8418k.C84191 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8418k.this.f22691a != null) {
                    C8418k.this.f22691a.mo32855a();
                }
            }
        });
        this.f22694d.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8418k.C84202 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8418k.this.f22691a != null) {
                    C8418k.this.f22691a.mo32857b();
                }
            }
        });
        this.f22695e.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folderselect.C8418k.C84213 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8418k.this.f22691a != null) {
                    C8418k.this.f22691a.mo32858c();
                }
            }
        });
        this.f22701k.mo32848a(new C8397b.AbstractC8399a() {
            /* class com.bytedance.ee.bear.list.folderselect.$$Lambda$k$EeIbzXfMGwkplkblme3FXC1Mcec */

            @Override // com.bytedance.ee.bear.list.folderselect.C8397b.AbstractC8399a
            public final void onItemClick(View view, int i, Document document) {
                C8418k.lambda$EeIbzXfMGwkplkblme3FXC1Mcec(C8418k.this, view, i, document);
            }
        });
    }

    /* renamed from: a */
    private void m34861a() {
        int i;
        BaseTitleBar baseTitleBar = (BaseTitleBar) this.f22692b.findViewById(R.id.list_folder_select_titlebar);
        if (!TextUtils.isEmpty(this.f22697g)) {
            baseTitleBar.setTitle(this.f22697g);
        } else {
            if (C4511g.m18594d().mo17344E() == 1) {
                i = R.string.Doc_List_Space;
            } else {
                i = R.string.Doc_List_FeishuDocSpace;
            }
            baseTitleBar.setTitle(i);
        }
        baseTitleBar.setLeftIconVisibility(false);
        baseTitleBar.setLeftText(this.f22699i.getString(R.string.Doc_Facade_Cancel));
        baseTitleBar.setLeftTextColor(this.f22699i.getResources().getColorStateList(R.color.facade_selector_icon_n1));
        this.f22693c = (FrameLayout) this.f22692b.findViewById(R.id.search_layout);
        this.f22694d = (LinearLayout) this.f22692b.findViewById(R.id.list_select_my_folder);
        this.f22695e = (LinearLayout) this.f22692b.findViewById(R.id.list_select_share_folder);
        this.f22696f = (Group) this.f22692b.findViewById(R.id.list_select_recent_group);
        ImageView imageView = (ImageView) this.f22692b.findViewById(R.id.list_iv_share_folder);
        TextView textView = (TextView) this.f22692b.findViewById(R.id.list_tv_share_folder);
        if (SpaceFeatureGatingV2.m32622a()) {
            imageView.setImageResource(R.drawable.ud_icon_sharedspace_colorful);
            textView.setText(R.string.CreationMobile_ECM_ShareWithMe_Tab);
        }
        RecyclerView recyclerView = (RecyclerView) this.f22692b.findViewById(R.id.list_select_recent_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f22699i));
        C8397b bVar = new C8397b(this.f22699i, this.f22698h, ((an) KoinJavaComponent.m268610a(an.class)).mo16408f());
        this.f22701k = bVar;
        recyclerView.setAdapter(bVar);
        m34863b();
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC8403e.AbstractC8405b.AbstractC8406a aVar) {
        this.f22691a = aVar;
    }

    @Override // com.bytedance.ee.bear.list.folderselect.AbstractC8403e.AbstractC8405b
    /* renamed from: a */
    public void mo32854a(List<Document> list) {
        this.f22696f.setVisibility(0);
        this.f22701k.mo32850a(list);
        this.f22701k.notifyDataSetChanged();
    }

    /* renamed from: a */
    private /* synthetic */ void m34862a(View view, int i, Document document) {
        AbstractC8403e.AbstractC8405b.AbstractC8406a aVar = this.f22691a;
        if (aVar != null) {
            aVar.mo32856a(view, i, document);
        }
    }

    public C8418k(Context context, View view, C10917c cVar, DocOperateBean docOperateBean, String str) {
        this.f22699i = context;
        this.f22692b = view;
        this.f22700j = cVar;
        this.f22698h = docOperateBean;
        this.f22697g = str;
    }
}
