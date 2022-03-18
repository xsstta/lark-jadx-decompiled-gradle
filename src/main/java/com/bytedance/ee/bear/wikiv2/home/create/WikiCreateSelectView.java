package com.bytedance.ee.bear.wikiv2.home.create;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p702e.C13657b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.C20923c;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0002J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "delegate", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$ViewDelegate;", "getDelegate", "()Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$ViewDelegate;", "setDelegate", "(Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$ViewDelegate;)V", "initRecycler", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$SelectItem;", "initView", "setEnable", "enable", "", "SelectAdapter", "SelectItem", "ViewDelegate", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiCreateSelectView extends LinearLayout {

    /* renamed from: a */
    private ViewDelegate f32976a;

    /* renamed from: b */
    private HashMap f32977b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$ViewDelegate;", "", "onCancelClick", "", "onSelected", "indexId", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView$c */
    public interface ViewDelegate {
        /* renamed from: a */
        void mo46861a();

        /* renamed from: a */
        void mo46862a(int i);
    }

    /* renamed from: a */
    public View mo46852a(int i) {
        if (this.f32977b == null) {
            this.f32977b = new HashMap();
        }
        View view = (View) this.f32977b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f32977b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$SelectItem;", "", "selectIndex", "Lcom/bytedance/ee/bear/wikiv2/home/create/SelectIndex;", "iconRes", "", "textRes", "(Lcom/bytedance/ee/bear/wikiv2/home/create/SelectIndex;II)V", "getIconRes", "()I", "getSelectIndex", "()Lcom/bytedance/ee/bear/wikiv2/home/create/SelectIndex;", "getTextRes", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView$b */
    public static final class SelectItem {

        /* renamed from: a */
        private final SelectIndex f32979a;

        /* renamed from: b */
        private final int f32980b;

        /* renamed from: c */
        private final int f32981c;

        /* renamed from: a */
        public final SelectIndex mo46858a() {
            return this.f32979a;
        }

        /* renamed from: b */
        public final int mo46859b() {
            return this.f32980b;
        }

        /* renamed from: c */
        public final int mo46860c() {
            return this.f32981c;
        }

        public SelectItem(SelectIndex selectIndex, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(selectIndex, "selectIndex");
            this.f32979a = selectIndex;
            this.f32980b = i;
            this.f32981c = i2;
        }
    }

    public final ViewDelegate getDelegate() {
        return this.f32976a;
    }

    /* renamed from: a */
    private final void m51129a() {
        int i;
        RecyclerView recyclerView = (RecyclerView) mo46852a(R.id.select_recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "select_recycler");
        m51130a(recyclerView, C12282a.m51141a());
        RecyclerView recyclerView2 = (RecyclerView) mo46852a(R.id.upload_recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "upload_recycler");
        m51130a(recyclerView2, C12282a.m51142b());
        if (C13657b.m55421a(C12282a.m51142b())) {
            i = 8;
        } else {
            i = 0;
        }
        TextView textView = (TextView) mo46852a(R.id.upload_title);
        Intrinsics.checkExpressionValueIsNotNull(textView, "upload_title");
        textView.setVisibility(i);
        RecyclerView recyclerView3 = (RecyclerView) mo46852a(R.id.upload_recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "upload_recycler");
        recyclerView3.setVisibility(i);
        ((TextView) mo46852a(R.id.cancel)).setOnClickListener(new C12281e(this));
    }

    public final void setDelegate(ViewDelegate cVar) {
        this.f32976a = cVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$initView$1", "Lcom/bytedance/ee/bear/widgets/SafeClickListener;", "onClicked", "", "v", "Landroid/view/View;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView$e */
    public static final class C12281e extends AbstractView$OnClickListenerC11839e {

        /* renamed from: a */
        final /* synthetic */ WikiCreateSelectView f32984a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C12281e(WikiCreateSelectView wikiCreateSelectView) {
            this.f32984a = wikiCreateSelectView;
        }

        /* access modifiers changed from: protected */
        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
        /* renamed from: a */
        public void mo16698a(View view) {
            ViewDelegate delegate = this.f32984a.getDelegate();
            if (delegate != null) {
                delegate.mo46861a();
            }
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0002H\u0014R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$SelectAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$SelectItem;", "Lcom/chad/library/adapter/base/BaseViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "(Ljava/util/List;)V", "value", "", "enable", "getEnable", "()Z", "setEnable", "(Z)V", "convert", "", "helper", "item", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView$a */
    public static final class SelectAdapter extends BaseQuickAdapter<SelectItem, C20923c> {

        /* renamed from: a */
        private boolean f32978a = true;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SelectAdapter(List<SelectItem> list) {
            super(R.layout.wiki_create_select_item, list);
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }

        /* renamed from: a */
        public final void mo46857a(boolean z) {
            this.f32978a = z;
            notifyDataSetChanged();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo16806a(C20923c cVar, SelectItem bVar) {
            float f;
            Intrinsics.checkParameterIsNotNull(cVar, "helper");
            Intrinsics.checkParameterIsNotNull(bVar, "item");
            AppCompatTextView appCompatTextView = (AppCompatTextView) cVar.mo70740b(R.id.select_item);
            appCompatTextView.setText(bVar.mo46860c());
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(0, bVar.mo46859b(), 0, 0);
            appCompatTextView.setEnabled(this.f32978a);
            if (this.f32978a) {
                f = 1.0f;
            } else {
                f = 0.3f;
            }
            appCompatTextView.setAlpha(f);
        }
    }

    public final void setEnable(boolean z) {
        RecyclerView recyclerView = (RecyclerView) mo46852a(R.id.select_recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "select_recycler");
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        SelectAdapter aVar = null;
        if (!(adapter instanceof SelectAdapter)) {
            adapter = null;
        }
        SelectAdapter aVar2 = (SelectAdapter) adapter;
        if (aVar2 != null) {
            aVar2.mo46857a(z);
        }
        RecyclerView recyclerView2 = (RecyclerView) mo46852a(R.id.upload_recycler);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "upload_recycler");
        RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
        if (adapter2 instanceof SelectAdapter) {
            aVar = adapter2;
        }
        SelectAdapter aVar3 = aVar;
        if (aVar3 != null) {
            aVar3.mo46857a(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WikiCreateSelectView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attrs");
        LayoutInflater.from(context).inflate(R.layout.wiki_create_select_view, this);
        m51129a();
    }

    /* renamed from: a */
    private final void m51130a(RecyclerView recyclerView, List<SelectItem> list) {
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 4));
        SelectAdapter aVar = new SelectAdapter(list);
        aVar.mo70668a((BaseQuickAdapter.AbstractC20911a) new C12280d(this, list));
        recyclerView.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000128\u0010\u0002\u001a4\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0003¨\u0006\u00010\u0003¨\u0006\u00012\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b¨\u0006\f"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "", "kotlin.jvm.PlatformType", "Lcom/chad/library/adapter/base/BaseViewHolder;", "<anonymous parameter 1>", "Landroid/view/View;", "pos", "", "onItemClick", "com/bytedance/ee/bear/wikiv2/home/create/WikiCreateSelectView$initRecycler$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.create.WikiCreateSelectView$d */
    public static final class C12280d implements BaseQuickAdapter.AbstractC20911a {

        /* renamed from: a */
        final /* synthetic */ WikiCreateSelectView f32982a;

        /* renamed from: b */
        final /* synthetic */ List f32983b;

        C12280d(WikiCreateSelectView wikiCreateSelectView, List list) {
            this.f32982a = wikiCreateSelectView;
            this.f32983b = list;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.AbstractC20911a
        public final void onItemClick(BaseQuickAdapter<Object, C20923c> baseQuickAdapter, View view, int i) {
            ViewDelegate delegate = this.f32982a.getDelegate();
            if (delegate != null) {
                delegate.mo46862a(((SelectItem) this.f32983b.get(i)).mo46858a().id());
            }
        }
    }
}
