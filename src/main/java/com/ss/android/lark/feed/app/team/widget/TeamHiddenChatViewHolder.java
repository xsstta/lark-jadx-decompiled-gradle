package com.ss.android.lark.feed.app.team.widget;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/feed/app/team/widget/TeamHiddenChatViewHolder;", "Lcom/ss/android/lark/feed/app/team/widget/BaseTeamChatViewHolder;", "containerView", "Landroid/widget/FrameLayout;", "(Landroid/widget/FrameLayout;)V", "getContainerView", "()Landroid/widget/FrameLayout;", "textView", "Lcom/ss/android/lark/feed/app/team/widget/TeamHiddenChatView;", "getTextView", "()Lcom/ss/android/lark/feed/app/team/widget/TeamHiddenChatView;", "getSwipeableContainerView", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.widget.c */
public final class TeamHiddenChatViewHolder extends BaseTeamChatViewHolder {

    /* renamed from: a */
    private final TeamHiddenChatView f97206a;

    /* renamed from: b */
    private final FrameLayout f97207b;

    /* renamed from: l */
    public final TeamHiddenChatView mo138827l() {
        return this.f97206a;
    }

    /* renamed from: m */
    public TeamHiddenChatView mo80851k() {
        return this.f97206a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamHiddenChatViewHolder(FrameLayout frameLayout) {
        super(frameLayout);
        Intrinsics.checkParameterIsNotNull(frameLayout, "containerView");
        this.f97207b = frameLayout;
        View childAt = frameLayout.getChildAt(0);
        if (childAt != null) {
            this.f97206a = (TeamHiddenChatView) childAt;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.feed.app.team.widget.TeamHiddenChatView");
    }
}
