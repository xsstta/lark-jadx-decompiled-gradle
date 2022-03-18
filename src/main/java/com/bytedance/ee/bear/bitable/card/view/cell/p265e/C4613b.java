package com.bytedance.ee.bear.bitable.card.view.cell.p265e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldUneditableReason;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4535b;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4528c;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b;
import com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d;
import com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView;
import com.bytedance.ee.bear.bitable.card.view.cell.link.BitableLinkRecordsFetchManager;
import com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordAdapter;
import com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordPickerPanel;
import com.bytedance.ee.bear.bitable.card.view.p258a.AbstractC4548e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.p2892a.C57582a;
import io.reactivex.functions.Consumer;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.b */
public class C4613b extends AbstractC4597b<List<C4525a>, List<C4525a>> implements AbstractC4607d, BitableLinkRecordsFetchManager.OnLinkTableListener, LinkRecordPickerPanel.OnActionListener, AbstractC7720n {

    /* renamed from: g */
    public View f13617g;

    /* renamed from: h */
    public LinkRecordPickerPanel f13618h;

    /* renamed from: i */
    public AbstractC4548e f13619i;

    /* renamed from: j */
    private RecyclerView f13620j;

    /* renamed from: k */
    private LinkRecordAdapter f13621k;

    /* renamed from: l */
    private View f13622l;

    /* renamed from: m */
    private ImageView f13623m;

    /* renamed from: n */
    private View f13624n;

    /* renamed from: o */
    private BitableLinkRecordsFetchManager f13625o;

    /* renamed from: p */
    private C4525a f13626p;

    /* renamed from: q */
    private C4528c f13627q;

    /* renamed from: r */
    private List<C4525a> f13628r;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public View mo17991a() {
        return this.f13617g;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: a */
    public void mo17995a(boolean z, EFieldUneditableReason eFieldUneditableReason) {
        super.mo17995a(z, eFieldUneditableReason);
        View a = mo17991a();
        List<C4525a> list = this.f13628r;
        boolean z2 = list == null || list.isEmpty();
        if (a != null && z && z2) {
            a.setBackgroundResource(R.drawable.bitable_card_field_attachment_bg);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordPickerPanel.OnActionListener
    /* renamed from: a */
    public void mo18150a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            C13479a.m54772d("LinkCellViewHolder", "onSelectedItemsChanged()... recordId = " + str + ", isChecked = " + z);
            C4528c cVar = this.f13627q;
            String str2 = "delete";
            if (cVar == null || cVar.mo17725e()) {
                String[] strArr = {str};
                if (z) {
                    str2 = "add";
                }
                mo18111a(strArr, str2);
            } else {
                String[] strArr2 = {str};
                if (z) {
                    str2 = "cover";
                }
                mo18111a(strArr2, str2);
                mo17997i();
            }
            this.f13588e.mo17876i().mo18681a(z, mo18017l());
        }
    }

    /* renamed from: m */
    private void m19162m() {
        C13742g.m55711d(new Runnable() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.$$Lambda$b$Np5qHpQtYT8mGzVQexmcqk7D7RE */

            public final void run() {
                C4613b.this.m19166q();
            }
        });
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: k */
    public void mo18016k() {
        super.mo18016k();
        this.f13588e.mo17868b(this);
    }

    /* renamed from: l */
    public boolean mo18017l() {
        if (this.f13627q == null || EFieldType.DUPLEX_LINK != this.f13627q.mo17752i()) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m19163n() {
        if (this.f13618h == null) {
            LinkRecordPickerPanel dVar = new LinkRecordPickerPanel(this.itemView.getContext());
            this.f13618h = dVar;
            dVar.mo17976a(new AbstractC4565a.AbstractC4568a() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.$$Lambda$vMHHD9Fv4l_RSSj4qZG1YNf3reQ */

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4565a.AbstractC4568a
                public final void onDismiss() {
                    C4613b.this.mo17997i();
                }
            });
            this.f13618h.mo18169a(this);
            this.f13618h.mo18173h().setOnPositionChangeListener(new CellEditDragView.AbstractC4564b() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.C4613b.C46152 */

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
                /* renamed from: a */
                public void mo17969a() {
                    C4613b.this.f13618h.mo17978b();
                }

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
                /* renamed from: c */
                public void mo17971c() {
                    C4613b.this.f13619i.mo17908a(C4613b.this.f13617g, C4613b.this);
                }

                @Override // com.bytedance.ee.bear.bitable.card.view.cell.CellEditDragView.AbstractC4564b
                /* renamed from: b */
                public void mo17970b() {
                    C4613b.this.f13619i.mo17908a(C4613b.this.f13617g, C4613b.this);
                    C4613b.this.f13618h.mo17982f();
                }
            });
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: p */
    private String[] m19165p() {
        List<C4525a> list = this.f13628r;
        if (list == null || list.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[this.f13628r.size()];
        for (int i = 0; i < this.f13628r.size(); i++) {
            strArr[i] = this.f13628r.get(i).mo17707b();
        }
        return strArr;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: i */
    public void mo17997i() {
        super.mo17997i();
        C4528c cVar = this.f13627q;
        if (cVar != null) {
            this.f13625o.backwardLinkTable(cVar.mo17748f(), this.f13627q.mo17721a());
            this.f13625o.unregisterLinkTableListener(this);
        }
        LinkRecordPickerPanel dVar = this.f13618h;
        if (dVar != null && dVar.mo17980d()) {
            this.f13618h.mo17978b();
        }
        this.f13619i.mo17910b(this.f13617g, this);
    }

    /* renamed from: o */
    private void m19164o() {
        C13479a.m54764b("LinkCellViewHolder", "fetchLinkTableRecordIds()...");
        C4528c cVar = this.f13627q;
        if (cVar == null || TextUtils.isEmpty(cVar.mo17723c()) || TextUtils.isEmpty(this.f13627q.mo17724d())) {
            C13479a.m54758a("LinkCellViewHolder", "fetchLinkTableRecordIds()... failed, meta params error");
        }
        this.f13625o.fetchTableRecordIds(this.f13627q.mo17723c(), this.f13627q.mo17724d()).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.$$Lambda$b$LZr1CAE3JxG4__v2qmKEX6zCvE */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4613b.this.m19159b((C4613b) ((String[]) obj));
            }
        }, $$Lambda$b$HrcmtqpYnZqTiy5rwh7AwP47Ms.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b
    /* renamed from: h */
    public void mo17996h() {
        super.mo17996h();
        m19163n();
        this.f13618h.mo17973a();
        this.f13618h.mo18171a(m19165p());
        this.f13619i.mo17908a(this.f13617g, this);
        C4528c cVar = this.f13627q;
        if (cVar != null) {
            this.f13625o.forwardLinkTable(cVar.mo17748f(), this.f13627q.mo17721a());
            this.f13625o.registerLinkTableListener(this);
            if (!this.f13627q.f13312a) {
                C13479a.m54764b("LinkCellViewHolder", "enterEditMode()... linkTable has no permission");
                this.f13618h.mo18167a(R.drawable.illustration_empty_neutral_no_access, R.string.Bitable_Relation_NoPermissionToViewLinkedTable);
            } else if (this.f13627q.mo17721a().mo17777f().size() <= 0) {
                C13479a.m54764b("LinkCellViewHolder", "enterEditMode()... linkTable has been deleted");
                this.f13618h.mo18167a(R.drawable.illustration_vc_empty_neutral_recycle_bin, R.string.Bitable_Relation_LinkedTableWasDeleted);
            }
        }
        this.f13588e.mo17876i().mo18671a(m19165p().length, mo18017l());
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m19166q() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.f13585b || mo18116e() || this.f13587d) {
            this.f13620j.setVisibility(0);
            this.f13622l.setVisibility(8);
            this.f13624n.setVisibility(0);
            return;
        }
        List<C4525a> list = this.f13628r;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f13617g;
        if (z) {
            i = R.drawable.bitable_card_field_attachment_bg;
        } else {
            i = R.drawable.bitable_card_field_item_bg_selector;
        }
        view.setBackgroundResource(i);
        RecyclerView recyclerView = this.f13620j;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        recyclerView.setVisibility(i2);
        this.f13622l.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13622l.getLayoutParams();
        if (z) {
            i3 = 0;
        } else {
            i3 = C57582a.m223600a(8);
        }
        marginLayoutParams.setMargins(i3, 0, i3, i3);
        if (z) {
            i4 = mo17991a().getResources().getDimensionPixelSize(R.dimen.bitable_cell_min_height);
        } else {
            i4 = C57582a.m223600a(36);
        }
        marginLayoutParams.height = i4;
        this.f13622l.setLayoutParams(marginLayoutParams);
        View view2 = this.f13622l;
        if (z) {
            i5 = R.drawable.bitable_card_field_attachment_add_button_bg_empty;
        } else {
            i5 = R.drawable.bitable_card_field_link_add_button_bg;
        }
        view2.setBackgroundResource(i5);
        ImageView imageView = this.f13623m;
        imageView.setImageDrawable(m19157b(imageView.getContext()));
        this.f13624n.setVisibility(8);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
    public boolean onTouchStartIntercept(MotionEvent motionEvent) {
        this.f13621k.mo18153a();
        return false;
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4607d
    /* renamed from: a */
    public int mo17990a(Context context) {
        LinkRecordPickerPanel dVar = this.f13618h;
        if (dVar != null) {
            return dVar.mo17983g();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19152a(C4535b bVar) throws Exception {
        C13479a.m54764b("LinkCellViewHolder", "fetchLinkTableData()... success, linkTable = " + bVar);
        if (bVar != null) {
            this.f13618h.mo18168a(bVar);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: b */
    public void mo18015b(boolean z) {
        super.mo18015b(z);
        m19162m();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m19159b(String[] strArr) throws Exception {
        if (strArr != null) {
            C13479a.m54764b("LinkCellViewHolder", "fetchLinkTableRecordIds()... success, size = " + strArr.length);
            m19154a(this.f13627q.mo17723c(), this.f13627q.mo17724d(), strArr);
        }
    }

    /* renamed from: b */
    private Drawable m19157b(Context context) {
        Drawable mutate = context.getDrawable(R.drawable.ud_icon_add_outlined).mutate();
        mutate.setTint(context.getResources().getColor(R.color.fill_pressed));
        Drawable mutate2 = context.getDrawable(R.drawable.ud_icon_add_outlined).mutate();
        mutate2.setTint(context.getResources().getColor(R.color.icon_n3));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, mutate);
        stateListDrawable.addState(new int[]{-16842919}, mutate2);
        return stateListDrawable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19156a(String[] strArr) throws Exception {
        if (strArr == null) {
            strArr = new String[0];
        }
        C13479a.m54764b("LinkCellViewHolder", "fetchTableRecordIdsByKeyword()... success, size = " + strArr.length);
        LinkRecordPickerPanel dVar = this.f13618h;
        if (dVar != null) {
            dVar.mo18172b(strArr);
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordPickerPanel.OnActionListener
    /* renamed from: b */
    public void mo18151b(String str) {
        if (this.f13626p != null && this.f13627q != null) {
            C13479a.m54772d("LinkCellViewHolder", "onAddNewRecordBtnClicked()... recordTitle = " + str);
            this.f13625o.addLinkedRecord(this.f13626p.mo17705a(), this.f13626p.mo17707b(), this.f13627q.mo17749g(), this.f13627q.mo17721a(), this.f13627q.mo17721a().mo17780g(), new C7827a(str, new C4517a[0], new C7838i[0]));
            if (!this.f13627q.mo17725e()) {
                mo17997i();
            }
            this.f13588e.mo17876i().mo18678a("create_record", mo18017l());
        }
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4609e
    /* renamed from: a */
    public void mo17993a(C4537a<List<C4525a>> aVar) {
        List<C4525a> list;
        super.mo17993a((C4537a) aVar);
        C4528c cVar = this.f13627q;
        if (aVar.mo17829a() instanceof C4528c) {
            C4528c cVar2 = (C4528c) aVar.mo17829a();
            this.f13627q = cVar2;
            this.f13621k.mo18155a(cVar2);
        }
        this.f13626p = aVar.mo17834b();
        if (aVar.mo17835c() != null) {
            list = aVar.mo17835c();
        } else {
            list = Collections.emptyList();
        }
        this.f13628r = list;
        boolean z = true;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (!this.f13628r.get(size).mo17713g()) {
                this.f13628r.remove(size);
            }
        }
        this.f13621k.mo18158a(this.f13628r);
        LinkRecordAdapter cVar3 = this.f13621k;
        if (!this.f13585b || mo18116e()) {
            z = false;
        }
        cVar3.mo18159a(z);
        this.f13621k.notifyDataSetChanged();
        m19162m();
        if (!this.f13586c) {
            return;
        }
        if (cVar == null || this.f13627q == null || !TextUtils.equals(cVar.mo17723c(), this.f13627q.mo17723c()) || !TextUtils.equals(cVar.mo17724d(), this.f13627q.mo17724d())) {
            C13479a.m54764b("LinkCellViewHolder", "close mLinkRecordPickerPanel when link table relationship has changed");
            mo17997i();
            return;
        }
        this.f13619i.mo17908a(this.f13617g, this);
        this.f13618h.mo18171a(m19165p());
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordPickerPanel.OnActionListener
    /* renamed from: a */
    public void mo18149a(String str) {
        C13479a.m54772d("LinkCellViewHolder", "onSearchKeywordChanged()... keyword = " + str);
        C4528c cVar = this.f13627q;
        if (cVar == null || TextUtils.isEmpty(cVar.mo17723c()) || TextUtils.isEmpty(this.f13627q.mo17724d())) {
            C13479a.m54758a("LinkCellViewHolder", "fetchTableRecordIdsByKeyword()... failed, meta params error");
        }
        this.f13625o.fetchTableRecordIdsByKeyword(this.f13627q.mo17723c(), this.f13627q.mo17724d(), str).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.$$Lambda$b$mbdeeQo8zvIfFh5yLMQ93jw0QdQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4613b.this.m19156a((C4613b) ((String[]) obj));
            }
        }, $$Lambda$b$IejuUtw231EM7nxxnRvMuDFYoY.INSTANCE);
        this.f13588e.mo17876i().mo18678a("search", mo18017l());
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.BitableLinkRecordsFetchManager.OnLinkTableListener
    /* renamed from: b */
    public void mo18146b(String str, String str2) {
        C13479a.m54764b("LinkCellViewHolder", "onLinkTableChanged()...");
        m19160c(str, str2);
    }

    /* renamed from: c */
    private void m19160c(String str, String str2) {
        C4528c cVar = this.f13627q;
        if (cVar != null && TextUtils.equals(cVar.mo17723c(), str) && TextUtils.equals(this.f13627q.mo17724d(), str2)) {
            m19164o();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m19153a(AbstractC4712d dVar, String str) {
        mo18111a(new String[]{str}, "delete");
        dVar.mo17876i().mo18678a("delete", mo18017l());
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.BitableLinkRecordsFetchManager.OnLinkTableListener
    /* renamed from: a */
    public void mo18145a(String str, String str2) {
        C13479a.m54764b("LinkCellViewHolder", "onLinkTableDataLoaded()...");
        m19160c(str, str2);
    }

    @Override // com.bytedance.ee.bear.bitable.card.view.cell.AbstractC4597b, com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        super.onKeyboardHeightChanged(fVar, i, i2);
        LinkRecordPickerPanel dVar = this.f13618h;
        if (dVar != null && dVar.mo17980d()) {
            this.f13618h.mo17974a(i);
        }
    }

    public C4613b(View view, final AbstractC4712d dVar, AbstractC4548e eVar) {
        super(view, dVar);
        dVar.mo17862a(this);
        this.f13619i = eVar;
        this.f13625o = (BitableLinkRecordsFetchManager) C4950k.m20474a(dVar.mo17874g(), BitableLinkRecordsFetchManager.class);
        this.f13617g = view.findViewById(R.id.container);
        this.f13624n = view.findViewById(R.id.bottom_space_holder);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.link_field_recycler_view);
        this.f13620j = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        LinkRecordAdapter cVar = new LinkRecordAdapter(dVar);
        this.f13621k = cVar;
        cVar.mo18156a(new LinkRecordAdapter.OnDeleteMenuClickListener(dVar) {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.$$Lambda$b$CC5V0TslOXtVNZW8I29zDzHVudw */
            public final /* synthetic */ AbstractC4712d f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.bear.bitable.card.view.cell.link.LinkRecordAdapter.OnDeleteMenuClickListener
            public final void onDeleteMenuClicked(String str) {
                C4613b.this.m19153a((C4613b) this.f$1, (AbstractC4712d) str);
            }
        });
        this.f13620j.setAdapter(this.f13621k);
        View findViewById = view.findViewById(R.id.add_link_record_button_fl);
        this.f13622l = findViewById;
        findViewById.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.C4613b.C46141 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C4613b.this.f13617g.requestFocus();
                dVar.mo17876i().mo18678a("add_record", C4613b.this.mo18017l());
            }
        });
        this.f13623m = (ImageView) view.findViewById(R.id.add_link_record_button);
    }

    /* renamed from: a */
    private void m19154a(String str, String str2, String[] strArr) {
        C13479a.m54764b("LinkCellViewHolder", "fetchLinkTableData()...");
        this.f13625o.fetchTableData(str, str2, strArr).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.bitable.card.view.cell.p265e.$$Lambda$b$vhxrObXVAqPoA4sz4bhMS8IEb5k */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C4613b.this.m19152a((C4613b) ((C4535b) obj));
            }
        }, $$Lambda$b$_20e1cjqrLiqVQ9rT22UxFJDw7M.INSTANCE);
    }
}
