package com.bytedance.ee.bear.wikiv2.trash;

import android.os.Bundle;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.larksuite.suite.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/trash/WikiTrashActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "space_Id", "", "onDoCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "parseArgs", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public class WikiTrashActivity extends BaseActivity {

    /* renamed from: a */
    private String f33250a;

    /* renamed from: a */
    private final void mo47200a() {
        this.f33250a = getIntent().getStringExtra("space_id");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.wiki_trash_activity);
        mo47200a();
        WikiReportV2.m50918b(this.f33250a);
    }
}
