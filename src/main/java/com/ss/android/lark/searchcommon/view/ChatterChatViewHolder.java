package com.ss.android.lark.searchcommon.view;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "avatarItemView", "Lcom/ss/android/lark/searchcommon/view/AvatarItemViewWithMask;", "itemType", "", "(Lcom/ss/android/lark/searchcommon/view/AvatarItemViewWithMask;I)V", "getAvatarItemView", "()Lcom/ss/android/lark/searchcommon/view/AvatarItemViewWithMask;", "getItemType", "()I", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.a */
public final class ChatterChatViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final AvatarItemViewWithMask f133481a;

    /* renamed from: b */
    private final int f133482b;

    /* renamed from: a */
    public final AvatarItemViewWithMask mo184645a() {
        return this.f133481a;
    }

    /* renamed from: b */
    public final int mo184646b() {
        return this.f133482b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatterChatViewHolder(AvatarItemViewWithMask avatarItemViewWithMask, int i) {
        super(avatarItemViewWithMask);
        Intrinsics.checkParameterIsNotNull(avatarItemViewWithMask, "avatarItemView");
        this.f133481a = avatarItemViewWithMask;
        this.f133482b = i;
    }
}
