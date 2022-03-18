package com.bytedance.ee.bear.bitable.card.view.cell.link;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.bitable.card.model.enums.EFieldType;
import com.bytedance.ee.bear.bitable.card.model.stmodel.C4525a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.cell.C4537a;
import com.bytedance.ee.bear.bitable.card.model.stmodel.p257a.C4533g;
import com.bytedance.ee.bear.bitable.card.view.AbstractC4712d;
import com.bytedance.ee.bear.bitable.card.view.title.BitableCardTitleView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p701d.C13630j;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002*+B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00122\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\rJ\u0014\u0010 \u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\tJ \u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$ViewHolder;", "delegate", "Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;", "(Lcom/bytedance/ee/bear/bitable/card/view/IBitableCardDelegate;)V", "mActionMode", "Landroid/view/ActionMode;", "mDeleteMenuClickListener", "Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$OnDeleteMenuClickListener;", "mEnableShowDeleteMenu", "", "mLinkField", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/field/STField;", "mLinkRecordList", "", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "destroyCustomMenuIfNeed", "", "enableShowDeleteMenu", "enable", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setLinkField", "linkField", "setLinkRecordList", "linkRecordList", "setOnDeleteMenuClickListener", "listener", "startActionMode", "view", "Landroid/view/View;", "highlightBorder", "linkRecordId", "", "OnDeleteMenuClickListener", "ViewHolder", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.c */
public final class LinkRecordAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public C4533g f13632a;

    /* renamed from: b */
    public List<? extends C4525a> f13633b = new ArrayList();

    /* renamed from: c */
    public boolean f13634c;

    /* renamed from: d */
    public OnDeleteMenuClickListener f13635d;

    /* renamed from: e */
    public final AbstractC4712d f13636e;

    /* renamed from: f */
    private ActionMode f13637f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$OnDeleteMenuClickListener;", "", "onDeleteMenuClicked", "", "linkRecordId", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.c$a */
    public interface OnDeleteMenuClickListener {
        void onDeleteMenuClicked(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "rootView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter;Landroid/view/View;)V", "highlightBorder", "getHighlightBorder", "()Landroid/view/View;", "setHighlightBorder", "(Landroid/view/View;)V", "titleView", "Lcom/bytedance/ee/bear/bitable/card/view/title/BitableCardTitleView;", "setData", "", "record", "Lcom/bytedance/ee/bear/bitable/card/model/stmodel/STRecord;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.c$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ LinkRecordAdapter f13638a;

        /* renamed from: b */
        private BitableCardTitleView f13639b;

        /* renamed from: c */
        private View f13640c;

        /* renamed from: a */
        public final View mo18160a() {
            return this.f13640c;
        }

        /* renamed from: a */
        public final void mo18161a(C4525a aVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(aVar, "record");
            List<C4537a> h = aVar.mo17714h();
            Intrinsics.checkExpressionValueIsNotNull(h, "record.cells");
            for (T t : h) {
                Intrinsics.checkExpressionValueIsNotNull(t, "it");
                C4533g a = t.mo17829a();
                if (a != null) {
                    str = a.mo17749g();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, aVar.mo17708c())) {
                    this.f13639b.setData(t);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(LinkRecordAdapter cVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f13638a = cVar;
            View findViewById = view.findViewById(R.id.link_record_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.link_record_title)");
            this.f13639b = (BitableCardTitleView) findViewById;
            View findViewById2 = view.findViewById(R.id.highlight_border);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.highlight_border)");
            this.f13640c = findViewById2;
            BitableCardTitleView bitableCardTitleView = this.f13639b;
            bitableCardTitleView.setDefaultTitle(bitableCardTitleView.getResources().getString(R.string.Doc_Block_UnnamedRecord));
            bitableCardTitleView.setTypeface(Typeface.DEFAULT);
            bitableCardTitleView.setTitleSize((float) this.f13639b.getResources().getDimensionPixelSize(R.dimen.bitable_field_link_title_size));
            bitableCardTitleView.setShouldFormatRichText(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13633b.size();
    }

    /* renamed from: a */
    public final void mo18153a() {
        ActionMode actionMode = this.f13637f;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f13637f = null;
    }

    /* renamed from: a */
    public final void mo18159a(boolean z) {
        this.f13634c = z;
    }

    /* renamed from: a */
    public final void mo18155a(C4533g gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "linkField");
        this.f13632a = gVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$startActionMode$1", "Landroid/view/ActionMode$Callback;", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onPrepareActionMode", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.c$e */
    public static final class ActionMode$CallbackC4618e implements ActionMode.Callback {

        /* renamed from: a */
        final /* synthetic */ LinkRecordAdapter f13647a;

        /* renamed from: b */
        final /* synthetic */ View f13648b;

        /* renamed from: c */
        final /* synthetic */ View f13649c;

        /* renamed from: d */
        final /* synthetic */ String f13650d;

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Intrinsics.checkParameterIsNotNull(actionMode, "mode");
            Intrinsics.checkParameterIsNotNull(menu, "menu");
            return false;
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            Intrinsics.checkParameterIsNotNull(actionMode, "mode");
            this.f13649c.setVisibility(8);
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            Intrinsics.checkParameterIsNotNull(actionMode, "mode");
            Intrinsics.checkParameterIsNotNull(menuItem, "item");
            this.f13647a.mo18153a();
            OnDeleteMenuClickListener aVar = this.f13647a.f13635d;
            if (aVar == null) {
                return true;
            }
            aVar.onDeleteMenuClicked(this.f13650d);
            return true;
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            Intrinsics.checkParameterIsNotNull(actionMode, "mode");
            Intrinsics.checkParameterIsNotNull(menu, "menu");
            C13630j.m55310a(this.f13648b.getContext(), 10, 50);
            this.f13649c.setVisibility(0);
            menu.add(R.string.Doc_Facade_Delete);
            return true;
        }

        ActionMode$CallbackC4618e(LinkRecordAdapter cVar, View view, View view2, String str) {
            this.f13647a = cVar;
            this.f13648b = view;
            this.f13649c = view2;
            this.f13650d = str;
        }
    }

    public LinkRecordAdapter(AbstractC4712d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "delegate");
        this.f13636e = dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick", "com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$onBindViewHolder$1$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.c$d */
    public static final class View$OnLongClickListenerC4617d implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ LinkRecordAdapter f13644a;

        /* renamed from: b */
        final /* synthetic */ int f13645b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f13646c;

        View$OnLongClickListenerC4617d(LinkRecordAdapter cVar, int i, ViewHolder bVar) {
            this.f13644a = cVar;
            this.f13645b = i;
            this.f13646c = bVar;
        }

        public final boolean onLongClick(View view) {
            if (!this.f13644a.f13634c) {
                return true;
            }
            LinkRecordAdapter cVar = this.f13644a;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            View a = this.f13646c.mo18160a();
            String b = ((C4525a) this.f13644a.f13633b.get(this.f13645b)).mo17707b();
            Intrinsics.checkExpressionValueIsNotNull(b, "mLinkRecordList[position].recordId");
            cVar.mo18154a(view, a, b);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/bytedance/ee/bear/bitable/card/view/cell/link/LinkRecordAdapter$onBindViewHolder$1$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.e.c$c */
    public static final class C4616c extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ LinkRecordAdapter f13641a;

        /* renamed from: b */
        final /* synthetic */ int f13642b;

        /* renamed from: c */
        final /* synthetic */ ViewHolder f13643c;

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            EFieldType eFieldType;
            String[] strArr = new String[this.f13641a.f13633b.size()];
            List<? extends C4525a> list = this.f13641a.f13633b;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            boolean z = false;
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                strArr[i] = t.mo17707b();
                arrayList.add(Unit.INSTANCE);
                i = i2;
            }
            AbstractC4712d dVar = this.f13641a.f13636e;
            C4525a aVar = (C4525a) this.f13641a.f13633b.get(this.f13642b);
            EFieldType eFieldType2 = EFieldType.DUPLEX_LINK;
            C4533g gVar = this.f13641a.f13632a;
            if (gVar != null) {
                eFieldType = gVar.mo17752i();
            } else {
                eFieldType = null;
            }
            if (eFieldType2 == eFieldType) {
                z = true;
            }
            dVar.mo17865a(strArr, aVar, z);
        }

        C4616c(LinkRecordAdapter cVar, int i, ViewHolder bVar) {
            this.f13641a = cVar;
            this.f13642b = i;
            this.f13643c = bVar;
        }
    }

    /* renamed from: a */
    public final void mo18156a(OnDeleteMenuClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f13635d = aVar;
    }

    /* renamed from: a */
    public final void mo18158a(List<? extends C4525a> list) {
        Intrinsics.checkParameterIsNotNull(list, "linkRecordList");
        this.f13633b = list;
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bitable_card_link_rv_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        if (i >= 0 && i < getItemCount()) {
            bVar.mo18161a((C4525a) this.f13633b.get(i));
            View view = bVar.itemView;
            view.setOnClickListener(new C4616c(this, i, bVar));
            view.setOnLongClickListener(new View$OnLongClickListenerC4617d(this, i, bVar));
        }
    }

    /* renamed from: a */
    public final void mo18154a(View view, View view2, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f13637f = view.startActionMode(new ActionMode$CallbackC4618e(this, view, view2, str), 1);
        }
    }
}
