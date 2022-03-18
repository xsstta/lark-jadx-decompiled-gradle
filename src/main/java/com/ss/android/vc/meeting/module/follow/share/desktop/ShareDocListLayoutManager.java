package com.ss.android.vc.meeting.module.follow.share.desktop;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/meeting/module/follow/share/desktop/ShareDocListLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "isScrollEnabled", "()Z", "setScrollEnabled", "(Z)V", "canScrollHorizontally", "canScrollVertically", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ShareDocListLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private boolean f155199a = true;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        if (!this.f155199a || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        if (!this.f155199a || !super.canScrollVertically()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo214184a(boolean z) {
        this.f155199a = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareDocListLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }
}
