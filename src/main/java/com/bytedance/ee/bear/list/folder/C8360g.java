package com.bytedance.ee.bear.list.folder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.list.C8534e;
import com.bytedance.ee.bear.list.list.C8537f;
import com.bytedance.ee.bear.list.list.C8552l;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.g */
public class C8360g extends C8534e {

    /* renamed from: a */
    public ao f22574a;

    /* renamed from: j */
    private boolean f22575j;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32797a(ao aoVar) {
        this.f22574a = aoVar;
    }

    /* renamed from: b */
    private int m34598b(Document document) {
        if (C8292f.m34176b(document, this.f23135c)) {
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
            C13479a.m54764b("FolderDetailGridStyleAdapter", "getDefItemViewType()...document is null, position = " + i);
            return 0;
        } else if (document.ah()) {
            return 11;
        } else {
            return 33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32800a(boolean z) {
        this.f22575j = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e
    /* renamed from: a */
    public boolean mo32801a(Document document) {
        if (this.f22575j) {
            return false;
        }
        return super.mo32801a(document);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e, com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: a */
    public C20923c mo32344a(ViewGroup viewGroup, int i) {
        if (i == 33) {
            return new C8552l(LayoutInflater.from(this.f51211q).inflate(R.layout.list_no_permission_item_content_grid_style, viewGroup, false));
        }
        return super.mo32344a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e
    /* renamed from: a */
    public void mo16806a(final C20923c cVar, final Document document) {
        super.mo16806a(cVar, document);
        if (cVar instanceof C8552l) {
            C8552l lVar = (C8552l) cVar;
            lVar.f23195a.setVisibility(0);
            lVar.f23195a.setTag(document);
            lVar.f23195a.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.list.folder.C8360g.C83622 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    if (C8360g.this.f23136d != null) {
                        C8360g.this.f23136d.mo33341e(view, cVar.getLayoutPosition() - C8360g.this.mo70678c(), document, true);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.list.C8534e
    /* renamed from: a */
    public void mo32798a(C8537f fVar, Document document, int i) {
        super.mo32798a(fVar, document, i);
        m34597a(fVar.f23157j, document, i);
    }

    /* renamed from: a */
    private void m34597a(AppCompatImageView appCompatImageView, final Document document, final int i) {
        int i2;
        if (C8292f.m34165a(this.f23138f, document)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        appCompatImageView.setVisibility(i2);
        appCompatImageView.setImageResource(R.drawable.ud_icon_warning_outlined);
        C13747j.m55728a((ImageView) appCompatImageView, m34598b(document));
        appCompatImageView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.list.folder.C8360g.C83611 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (C8360g.this.f22574a != null) {
                    C8360g.this.f22574a.mo32738c(view, i, document, true);
                }
            }
        });
    }

    C8360g(C10917c cVar, String str, String str2, boolean z) {
        super(cVar, str, str2);
        this.f22575j = z;
    }
}
