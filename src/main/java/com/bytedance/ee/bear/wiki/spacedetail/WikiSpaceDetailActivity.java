package com.bytedance.ee.bear.wiki.spacedetail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wiki.common.widget.ExpandableTextView;
import com.bytedance.ee.bear.wiki.mvpframework.WikiBaseActivity;
import com.bytedance.ee.bear.wiki.spacedetail.C12045c;
import com.bytedance.ee.bear.wiki.spacedetail.SpaceBean;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public class WikiSpaceDetailActivity extends WikiBaseActivity {

    /* renamed from: a */
    private BaseTitleBar f32506a;

    /* renamed from: b */
    private ExpandableTextView f32507b;

    /* renamed from: c */
    private RecyclerView f32508c;

    /* renamed from: d */
    private C12045c f32509d;

    /* renamed from: e */
    private View f32510e;

    /* renamed from: f */
    private TextView f32511f;

    /* renamed from: g */
    private String f32512g;

    /* renamed from: h */
    private String f32513h;

    /* renamed from: i */
    private String f32514i;

    /* renamed from: j */
    private Disposable f32515j;

    /* renamed from: k */
    private C12042a f32516k;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        Disposable disposable = this.f32515j;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private List<SpaceBean.MembersBean> mo46125c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new SpaceBean.MembersBean());
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m49878d() {
        this.f32515j = this.f32516k.mo46130a(this.f32512g).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wiki.spacedetail.$$Lambda$WikiSpaceDetailActivity$ysKkwVTl3iMmAqIFMdrwapscs14 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceDetailActivity.this.m49871a((WikiSpaceDetailActivity) ((WikiSpaceInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.spacedetail.$$Lambda$WikiSpaceDetailActivity$KPXcYRHuXkx9L4_pvl16Uk48qEk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceDetailActivity.this.m49873a((WikiSpaceDetailActivity) ((Throwable) obj));
            }
        });
    }

    /* renamed from: a */
    private void mo46122a() {
        if (getIntent() == null) {
            C13479a.m54758a("WikiSpaceDetailActivity", "getIntent is null");
            finish();
            return;
        }
        this.f32512g = getIntent().getStringExtra("space_id");
        this.f32513h = getIntent().getStringExtra("EXTRA_WIKI_DESCRIPTION");
        this.f32514i = getIntent().getStringExtra("node_name");
    }

    /* renamed from: b */
    private void mo46124b() {
        this.f32516k = new C12042a(mo30076n());
        this.f32506a = (BaseTitleBar) findViewById(R.id.wiki_space_detail_title_bar);
        this.f32507b = (ExpandableTextView) findViewById(R.id.expand_text_view);
        this.f32508c = (RecyclerView) findViewById(R.id.wiki_member_recycler_view);
        this.f32511f = (TextView) findViewById(R.id.tv_member_list_name);
        this.f32510e = findViewById(R.id.layout_loading_empty_state);
        this.f32509d = new C12045c(this);
        this.f32508c.setLayoutManager(new LinearLayoutManager(this));
        this.f32508c.setAdapter(this.f32509d);
        this.f32509d.mo46134a(mo46125c(), true);
        this.f32509d.notifyDataSetChanged();
        this.f32509d.mo46132a(new C12045c.AbstractC12047a() {
            /* class com.bytedance.ee.bear.wiki.spacedetail.$$Lambda$WikiSpaceDetailActivity$A1_tSHsTd7NWAhs7ttXB6_xVXSU */

            @Override // com.bytedance.ee.bear.wiki.spacedetail.C12045c.AbstractC12047a
            public final void onClickUser(String str) {
                WikiSpaceDetailActivity.this.m49876b((WikiSpaceDetailActivity) str);
            }
        });
        this.f32510e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wiki.spacedetail.$$Lambda$WikiSpaceDetailActivity$qt7PNDs6lCyPCs4dzsreIJrwZbE */

            public final void onClick(View view) {
                WikiSpaceDetailActivity.this.m49870a((WikiSpaceDetailActivity) view);
            }
        });
        this.f32506a.setTitle(R.string.Doc_Wiki_SpaceDetail_Title);
        m49872a(this.f32513h);
        m49878d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49870a(View view) {
        m49874a(false);
        m49878d();
    }

    /* renamed from: a */
    private void m49872a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f32507b.setText(str);
        } else {
            this.f32507b.setText(getResources().getString(R.string.Doc_Wiki_SpaceDetail_IntroductionPlaceholder));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m49876b(String str) {
        String str2;
        if (TextUtils.isEmpty(this.f32514i)) {
            str2 = null;
        } else {
            str2 = this.f32514i;
        }
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49871a(WikiSpaceInfo wikiSpaceInfo) {
        if (wikiSpaceInfo == null || wikiSpaceInfo.getSpaceBean() == null || wikiSpaceInfo.getUserRole() == null) {
            C13479a.m54758a("WikiSpaceDetailActivity", "wikiSpaceInfo is null or content is null");
            return;
        }
        m49872a(wikiSpaceInfo.getSpaceBean().getDescription());
        if (wikiSpaceInfo.getUserRole().getRole() >= 4) {
            this.f32511f.setText(R.string.Doc_Wiki_SpaceDetail_AdminListHeader);
        } else {
            this.f32511f.setText(R.string.Doc_Wiki_SpaceDetail_MemberListHeader);
        }
        if (wikiSpaceInfo.getSpaceBean().getMembers() != null) {
            Collections.sort(wikiSpaceInfo.getSpaceBean().getMembers(), $$Lambda$WikiSpaceDetailActivity$g3R8yUCJW8UXvzL6dxQNJeFHPBY.INSTANCE);
            this.f32509d.mo46134a(wikiSpaceInfo.getSpaceBean().getMembers(), false);
            this.f32509d.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49873a(Throwable th) throws Exception {
        C13479a.m54761a("WikiSpaceDetailActivity", th);
        m49874a(true);
    }

    /* renamed from: a */
    private void m49874a(boolean z) {
        if (z) {
            this.f32510e.setVisibility(0);
            this.f32508c.setVisibility(8);
            return;
        }
        this.f32510e.setVisibility(8);
        this.f32508c.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        mo46122a();
        setContentView(R.layout.wiki_space_detail_activity);
        mo46124b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ int m49868a(SpaceBean.MembersBean membersBean, SpaceBean.MembersBean membersBean2) {
        return membersBean2.getMember_role() - membersBean.getMember_role();
    }
}
