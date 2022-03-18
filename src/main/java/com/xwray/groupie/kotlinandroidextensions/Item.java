package com.xwray.groupie.kotlinandroidextensions;

import android.view.View;
import com.p943f.p944a.AbstractC20975h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xwray/groupie/kotlinandroidextensions/Item;", "Lcom/xwray/groupie/Item;", "Lcom/xwray/groupie/kotlinandroidextensions/GroupieViewHolder;", "()V", "id", "", "(J)V", "createViewHolder", "itemView", "Landroid/view/View;", "groupie-kotlin-android-extensions_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.f.a.a.b */
public abstract class Item extends AbstractC20975h<GroupieViewHolder> {
    public Item(long j) {
        super(j);
    }

    /* renamed from: a */
    public GroupieViewHolder mo71003b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        return new GroupieViewHolder(view);
    }
}
