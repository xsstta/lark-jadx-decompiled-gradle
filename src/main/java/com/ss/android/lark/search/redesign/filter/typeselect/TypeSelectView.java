package com.ss.android.lark.search.redesign.filter.typeselect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001dJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\f\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "singleMode", "", "(Landroid/content/Context;Z)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;ZLandroid/util/AttributeSet;)V", "mContext", "mOnTypeFilterClick", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "getMOnTypeFilterClick", "()Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "setMOnTypeFilterClick", "(Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;)V", "mTypeSelectAdapter", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter;", "mTypeSelectRv", "Landroidx/recyclerview/widget/RecyclerView;", "addAll", "", "collection", "", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectData;", "getItems", "", "initView", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TypeSelectView extends FrameLayout {

    /* renamed from: a */
    private final Context f132716a;

    /* renamed from: b */
    private RecyclerView f132717b;

    /* renamed from: c */
    private TypeSelectAdapter f132718c;

    /* renamed from: d */
    private TypeSelectAdapter.IOnTypeFilterClickListener f132719d;

    public final TypeSelectAdapter.IOnTypeFilterClickListener getMOnTypeFilterClick() {
        return this.f132719d;
    }

    public final List<TypeSelectData> getItems() {
        TypeSelectAdapter aVar = this.f132718c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeSelectAdapter");
        }
        List<TypeSelectData> items = aVar.getItems();
        Intrinsics.checkExpressionValueIsNotNull(items, "mTypeSelectAdapter.items");
        return items;
    }

    public final void setMOnTypeFilterClick(TypeSelectAdapter.IOnTypeFilterClickListener aVar) {
        this.f132719d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/search/redesign/filter/typeselect/TypeSelectView$initView$1$1", "Lcom/ss/android/lark/search/redesign/filter/typeselect/TypeSelectAdapter$IOnTypeFilterClickListener;", "onTypeFilterClick", "", "position", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectView$a */
    public static final class C53754a implements TypeSelectAdapter.IOnTypeFilterClickListener {

        /* renamed from: a */
        final /* synthetic */ TypeSelectView f132720a;

        C53754a(TypeSelectView typeSelectView) {
            this.f132720a = typeSelectView;
        }

        @Override // com.ss.android.lark.search.redesign.filter.typeselect.TypeSelectAdapter.IOnTypeFilterClickListener
        /* renamed from: a */
        public void mo183328a(int i) {
            TypeSelectAdapter.IOnTypeFilterClickListener mOnTypeFilterClick = this.f132720a.getMOnTypeFilterClick();
            if (mOnTypeFilterClick != null) {
                mOnTypeFilterClick.mo183328a(i);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TypeSelectView(Context context) {
        this(context, false, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo183380a(Collection<TypeSelectData> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "collection");
        if (!collection.isEmpty()) {
            TypeSelectAdapter aVar = this.f132718c;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTypeSelectAdapter");
            }
            aVar.addAll(collection);
        }
    }

    /* renamed from: a */
    private final void m208164a(boolean z) {
        View findViewById = findViewById(R.id.type_select_rv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.type_select_rv)");
        this.f132717b = (RecyclerView) findViewById;
        TypeSelectAdapter aVar = new TypeSelectAdapter(z);
        RecyclerView recyclerView = this.f132717b;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeSelectRv");
        }
        recyclerView.setAdapter(aVar);
        aVar.mo183386a(new C53754a(this));
        this.f132718c = aVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f132716a, 1, false);
        linearLayoutManager.setOrientation(1);
        RecyclerView recyclerView2 = this.f132717b;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTypeSelectRv");
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TypeSelectView(Context context, AttributeSet attributeSet) {
        this(context, false, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TypeSelectView(Context context, boolean z) {
        this(context, z, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeSelectView(Context context, boolean z, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Context context2 = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context2, "context");
        this.f132716a = context2;
        LayoutInflater.from(context2).inflate(R.layout.type_select_view, (ViewGroup) this, true);
        m208164a(z);
    }
}
