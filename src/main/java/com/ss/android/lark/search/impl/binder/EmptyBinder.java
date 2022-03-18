package com.ss.android.lark.search.impl.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.search.impl.entity.viewdata.SearchBaseViewData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J$\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/impl/binder/EmptyBinder;", "Lcom/ss/android/lark/search/impl/binder/BaseSearchBinder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/lark/search/impl/entity/viewdata/SearchBaseViewData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "createViewHolder", "parent", "Landroid/view/ViewGroup;", "onItemHovered", "", "holder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "isHovered", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.binder.b */
public final class EmptyBinder extends AbstractC53349a<RecyclerView.ViewHolder, SearchBaseViewData> {

    /* renamed from: d */
    private final Context f131864d;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.search.impl.binder.AbstractC53349a
    /* renamed from: a */
    public void mo181987a(RecyclerView.ViewHolder viewHolder, SearchBaseViewData searchBaseViewData, boolean z) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyBinder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f131864d = context;
    }

    @Override // com.ss.android.lark.search.impl.binder.AbstractC53349a
    /* renamed from: a */
    public RecyclerView.ViewHolder mo181985a(ViewGroup viewGroup) {
        return new C53353a(this, new View(this.f131864d));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/lark/search/impl/binder/EmptyBinder$createViewHolder$1", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.binder.b$a */
    public static final class C53353a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ EmptyBinder f131865a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53353a(EmptyBinder bVar, View view) {
            super(view);
            this.f131865a = bVar;
        }
    }
}
