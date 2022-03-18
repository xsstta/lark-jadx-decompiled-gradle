package com.ss.android.lark.moments.impl.notice.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.moments.impl.notice.vo.IMomentsNotificationEmptyVM;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/holder/MomentsNotificationEmptyHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/ss/android/lark/moments/impl/notice/vo/IMomentsNotificationEmptyVM;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.notice.a.a */
public final class MomentsNotificationEmptyHolder extends AbstractC58967a<IMomentsNotificationEmptyVM, View> {

    /* renamed from: a */
    public static final Companion f120384a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/notice/holder/MomentsNotificationEmptyHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/notice/holder/MomentsNotificationEmptyHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.notice.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsNotificationEmptyHolder mo167525a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, UIUtils.dp2px(viewGroup.getContext(), 80.0f)));
            return new MomentsNotificationEmptyHolder(frameLayout);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsNotificationEmptyHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }
}
