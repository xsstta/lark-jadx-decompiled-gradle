package com.bytedance.ee.bear.wiki.wikitree;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wiki.mvpframework.WikiBaseActivity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;

public class WikiTreeActivity extends WikiBaseActivity {

    /* renamed from: a */
    private String f32535a;

    /* renamed from: b */
    private String f32536b;

    /* renamed from: c */
    private String f32537c;

    /* renamed from: d */
    private int f32538d;

    /* renamed from: e */
    private String f32539e;

    /* renamed from: f */
    private String f32540f;

    /* renamed from: g */
    private String f32541g;

    /* renamed from: h */
    private int f32542h;

    /* renamed from: i */
    private WikiDocument f32543i;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        C13479a.m54764b("Wiki_WikiTreeActivity", "WikiTreeActivity.onDestroy. ");
        super.onDestroy();
    }

    /* renamed from: a */
    private Fragment mo46162a() {
        int i = this.f32538d;
        if (i == 0) {
            return C12105g.m50041a(this.f32535a, this.f32536b, this.f32537c, this.f32543i);
        }
        if (i == 1) {
            return C12101f.m50020a(this.f32535a, this.f32536b, this.f32537c, this.f32542h);
        }
        if (i == 2) {
            return C12097e.m50003a(this.f32535a, this.f32536b, this.f32537c, this.f32539e, this.f32540f, this.f32541g);
        }
        throw new IllegalArgumentException("WikiTreeActivity.provideTypeFragment, invalid page mode. ");
    }

    /* renamed from: b */
    private void mo46164b() {
        try {
            this.f32538d = getIntent().getIntExtra("EXTRA_PAGE_MODE", 0);
            this.f32535a = (String) C13657b.m55418a(getIntent().getStringExtra("space_id"), "");
            this.f32536b = (String) C13657b.m55418a(getIntent().getStringExtra("obj_token"), "");
            this.f32537c = (String) C13657b.m55418a(getIntent().getStringExtra("node_name"), "");
            this.f32541g = (String) C13657b.m55418a(getIntent().getStringExtra("EXTRA_MOVETO_SRC_PARENT_TOKEN"), "");
            this.f32539e = (String) C13657b.m55418a(getIntent().getStringExtra("EXTRA_MOVETO_SRC_TOKEN"), "");
            this.f32540f = (String) C13657b.m55418a(getIntent().getStringExtra("EXTRA_MOVETO_SRC_AREA_ID"), "");
            this.f32543i = (WikiDocument) getIntent().getParcelableExtra("EXTRA_WIKI_DOCUMENT");
            this.f32542h = getIntent().getIntExtra("createDocumentType", C8275a.f22371d.mo32555b());
            C13479a.m54764b("Wiki_WikiTreeActivity", String.format("WikiTreeActivity.parseIntent, pageMode: %s, spaceId: %s, documentToken: %s", String.valueOf(this.f32538d), C13721c.m55650d(this.f32535a), C13721c.m55650d(this.f32536b)));
        } catch (Exception e) {
            C13479a.m54759a("Wiki_WikiTreeActivity", "WikiTreeActivity.parseIntent, parse intent fail. ", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        C13479a.m54764b("Wiki_WikiTreeActivity", "WikiTreeActivity.onDoCreate. ");
        setContentView(R.layout.wiki_tree_activity);
        mo46164b();
        mo46159c(bundle);
    }

    /* renamed from: c */
    public void mo46159c(Bundle bundle) {
        if (bundle == null) {
            Fragment a = mo46162a();
            getSupportFragmentManager().beginTransaction().replace(R.id.wiki_tree_activity_container, a, a.getClass().getSimpleName()).commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13659d.m55432a(getSupportFragmentManager().getFragments(), new C13659d.AbstractC13661b(i, i2, intent) {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$WikiTreeActivity$2PIiCtlNl2baH5cumh9gI51ck7Y */
            public final /* synthetic */ int f$0;
            public final /* synthetic */ int f$1;
            public final /* synthetic */ Intent f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
            public final void accept(Object obj) {
                ((Fragment) obj).onActivityResult(this.f$0, this.f$1, this.f$2);
            }
        });
    }
}
