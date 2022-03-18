package com.bytedance.ee.bear.list.folder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.facade.common.widget.recyclerview.DocsLinearLayoutManager;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8551k;
import com.bytedance.ee.bear.list.list.C8553m;
import com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.j */
public class C8364j extends View$OnClickListenerC8546j {

    /* renamed from: a */
    public ao f22585a;

    /* renamed from: j */
    private boolean f22586j;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public boolean mo18916a() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public boolean mo32806a(Document document) {
        if (this.f22586j) {
            return false;
        }
        return super.mo32806a(document);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32802a(ao aoVar) {
        this.f22585a = aoVar;
    }

    /* renamed from: b */
    private int m34612b(Document document) {
        if (C8292f.m34176b(document, this.f23160c)) {
            return R.color.primary_pri_500;
        }
        return R.color.icon_disable;
    }

    /* access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public int mo32796a(int i) {
        Document document = (Document) mo70685d(i);
        if (document == null) {
            C13479a.m54764b("FolderDetailListStyleAdapter", "getDefItemViewType()...document is null, position = " + i);
            return 0;
        } else if (document.ah()) {
            return 11;
        } else {
            return 33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32805a(boolean z) {
        this.f22586j = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j, com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        if (i == 33) {
            return new C8553m(LayoutInflater.from(this.f51211q).inflate(R.layout.list_no_permission_item_content_list_style, viewGroup, false));
        }
        return super.mo32344a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32727a(C8551k kVar, Document document) {
        if (this.f23164g == FolderSort.CREATED_TIME.getRank()) {
            kVar.f23184d.setText(C8292f.m34184d(this.f51211q, document));
        } else {
            kVar.f23184d.setText(C8292f.m34130a(this.f51211q, document));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo16806a(final C20923c cVar, final Document document) {
        super.mo16806a(cVar, document);
        if (cVar instanceof C8553m) {
            C8553m mVar = (C8553m) cVar;
            mVar.f23199a.setVisibility(0);
            mVar.f23199a.setTag(document);
            mVar.f23199a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.list.folder.C8364j.C83673 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (C8364j.this.f23161d != null) {
                        C8364j.this.f23161d.mo33341e(view, cVar.getLayoutPosition() - C8364j.this.mo70678c(), document, false);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32803a(C8551k kVar, Document document, int i) {
        super.mo32803a(kVar, document, i);
        m34611a(kVar.f23192l, document, i);
    }

    /* renamed from: a */
    private void m34611a(AppCompatImageView appCompatImageView, final Document document, final int i) {
        int i2;
        if (C8292f.m34165a(this.f23163f, document)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        appCompatImageView.setVisibility(i2);
        appCompatImageView.setImageResource(R.drawable.ud_icon_warning_outlined);
        C13747j.m55728a((ImageView) appCompatImageView, m34612b(document));
        appCompatImageView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.C8364j.C83662 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8364j.this.f22585a != null) {
                    C8364j.this.f22585a.mo32738c(view, i, document, false);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.View$OnClickListenerC8546j
    /* renamed from: a */
    public void mo32586a(C8551k kVar, int i, Document document) {
        super.mo32586a(kVar, i, document);
        if (C8292f.m34175b(document)) {
            kVar.f23189i.setAlpha(1.0f);
            return;
        }
        kVar.f23189i.setAlpha(0.3f);
        kVar.f23189i.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.C8364j.C83651 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                Toast.showText(C8364j.this.f51211q, (int) R.string.Doc_Permission_DeleteNoPermission);
                C8364j.this.mo33387e();
            }
        });
    }

    C8364j(C10917c cVar, String str, String str2, DocsLinearLayoutManager docsLinearLayoutManager, boolean z) {
        super(cVar, str, str2, docsLinearLayoutManager);
        this.f22586j = z;
    }
}
