package com.bytedance.ee.bear.wikiv2.spacedetail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.common.widget.ExpandableTextView;
import com.bytedance.ee.bear.wikiv2.spacedetail.C12387c;
import com.bytedance.ee.bear.wikiv2.spacedetail.SpaceBean;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public class WikiSpaceDetailActivity extends BaseActivity {

    /* renamed from: a */
    private BaseTitleBar f33228a;

    /* renamed from: b */
    private ExpandableTextView f33229b;

    /* renamed from: c */
    private RecyclerView f33230c;

    /* renamed from: d */
    private C12387c f33231d;

    /* renamed from: e */
    private View f33232e;

    /* renamed from: f */
    private TextView f33233f;

    /* renamed from: g */
    private String f33234g;

    /* renamed from: h */
    private String f33235h;

    /* renamed from: i */
    private String f33236i;

    /* renamed from: j */
    private Disposable f33237j;

    /* renamed from: k */
    private C12384a f33238k;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        Disposable disposable = this.f33237j;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    private List<SpaceBean.MembersBean> mo47190c() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(new SpaceBean.MembersBean());
        }
        return arrayList;
    }

    /* renamed from: d */
    private void m51514d() {
        this.f33237j = this.f33238k.mo47193a(this.f33234g).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.spacedetail.$$Lambda$WikiSpaceDetailActivity$geo2HM6g2tNrjdd1duLs6qlPc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceDetailActivity.this.m51507a((WikiSpaceDetailActivity) ((WikiSpaceInfo) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wikiv2.spacedetail.$$Lambda$WikiSpaceDetailActivity$43b5qbwoFwypI4SSXPHXEvpE1Xs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceDetailActivity.this.m51509a((WikiSpaceDetailActivity) ((Throwable) obj));
            }
        });
    }

    /* renamed from: a */
    private void mo47187a() {
        if (getIntent() == null) {
            C13479a.m54758a("WikiSpaceDetailActivity", "getIntent is null");
            finish();
            return;
        }
        this.f33234g = getIntent().getStringExtra("space_id");
        this.f33235h = getIntent().getStringExtra("EXTRA_WIKI_DESCRIPTION");
        this.f33236i = getIntent().getStringExtra("node_name");
    }

    /* renamed from: b */
    private void mo47189b() {
        this.f33238k = new C12384a(mo30076n());
        this.f33228a = (BaseTitleBar) findViewById(R.id.wiki_space_detail_title_bar);
        this.f33229b = (ExpandableTextView) findViewById(R.id.expand_text_view);
        this.f33230c = (RecyclerView) findViewById(R.id.wiki_member_recycler_view);
        this.f33233f = (TextView) findViewById(R.id.tv_member_list_name);
        this.f33232e = findViewById(R.id.layout_loading_empty_state);
        this.f33231d = new C12387c(this);
        this.f33230c.setLayoutManager(new LinearLayoutManager(this));
        this.f33230c.setAdapter(this.f33231d);
        this.f33231d.mo47197a(mo47190c(), true);
        this.f33231d.notifyDataSetChanged();
        this.f33231d.mo47195a(new C12387c.AbstractC12389a() {
            /* class com.bytedance.ee.bear.wikiv2.spacedetail.$$Lambda$WikiSpaceDetailActivity$eGPled2PZEoydQeZDmy_LNROGKY */

            @Override // com.bytedance.ee.bear.wikiv2.spacedetail.C12387c.AbstractC12389a
            public final void onClickUser(String str) {
                WikiSpaceDetailActivity.this.m51512b((WikiSpaceDetailActivity) str);
            }
        });
        this.f33232e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.wikiv2.spacedetail.$$Lambda$WikiSpaceDetailActivity$5wBCjpYPaihoYNJ2c02lZRrxxgk */

            public final void onClick(View view) {
                WikiSpaceDetailActivity.this.m51506a((WikiSpaceDetailActivity) view);
            }
        });
        this.f33228a.setTitle(R.string.Doc_Wiki_SpaceDetail_Title);
        m51508a(this.f33235h);
        m51514d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51506a(View view) {
        m51510a(false);
        m51514d();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51509a(Throwable th) throws Exception {
        C13479a.m54761a("WikiSpaceDetailActivity", th);
        m51510a(true);
    }

    /* renamed from: a */
    private List<SpaceBean.MembersBean> m51504a(List<SpaceBean.MembersBean> list) {
        Iterator<SpaceBean.MembersBean> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getMember_role() != SpaceBean.MembersBean.MEMBER_ADMIN) {
                it.remove();
            }
        }
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m51512b(String str) {
        String str2;
        if (TextUtils.isEmpty(this.f33236i)) {
            str2 = null;
        } else {
            str2 = this.f33236i;
        }
        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(str, str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51507a(WikiSpaceInfo wikiSpaceInfo) {
        if (wikiSpaceInfo == null) {
            C13479a.m54758a("WikiSpaceDetailActivity", "wikiSpaceInfo is null or content is null");
            return;
        }
        this.f33233f.setText(R.string.Doc_Wiki_SpaceDetail_MemberListHeader);
        if (wikiSpaceInfo.members != null) {
            this.f33231d.mo47197a(m51504a(wikiSpaceInfo.members), false);
            this.f33231d.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m51508a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f33229b.setText(str);
        } else {
            this.f33229b.setText(getResources().getString(R.string.Doc_Wiki_SpaceDetail_IntroductionPlaceholder));
        }
    }

    /* renamed from: a */
    private void m51510a(boolean z) {
        if (z) {
            this.f33232e.setVisibility(0);
            this.f33230c.setVisibility(8);
            return;
        }
        this.f33232e.setVisibility(8);
        this.f33230c.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        mo47187a();
        setContentView(R.layout.wiki_space_detail_activity_v2);
        mo47189b();
    }
}
