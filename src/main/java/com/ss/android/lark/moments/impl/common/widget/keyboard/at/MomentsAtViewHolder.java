package com.ss.android.lark.moments.impl.common.widget.keyboard.at;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lark.pb.moments.v1.MomentUser;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.suite.R;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.subtitle.SubtitleModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.widget.recyclerview.AbstractC58967a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/BaseRecyclerViewHolder;", "Lcom/bytedance/lark/pb/moments/v1/MomentUser;", "Landroid/view/View;", "itemView", "(Landroid/view/View;)V", "onBind", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.f */
public final class MomentsAtViewHolder extends AbstractC58967a<MomentUser, View> {

    /* renamed from: a */
    public static final Companion f119326a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtViewHolder$Companion;", "", "()V", "create", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtViewHolder;", "parent", "Landroid/view/ViewGroup;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MomentsAtViewHolder mo166289a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_moments_at, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "it");
            return new MomentsAtViewHolder(inflate);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MomentsAtViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
    }

    /* renamed from: a */
    public void mo165944a(MomentUser momentUser) {
        Intrinsics.checkParameterIsNotNull(momentUser, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        View view = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
        ((AvatarItemView) view.findViewById(R.id.avatar)).mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(momentUser.user_id).mo88962a(momentUser.avatar_key)).mo88967b(momentUser.user_id)).mo88976k());
        View view2 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
        ((AvatarItemView) view2.findViewById(R.id.avatar)).mo184670a(new TitleModel(momentUser.name, false, null, 0, 14, null));
        View view3 = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(view3, "itemView");
        ((AvatarItemView) view3.findViewById(R.id.avatar)).mo184668a(new SubtitleModel(""));
        MomentUser.LarkUser larkUser = momentUser.lark_user;
        if (larkUser != null) {
            View view4 = this.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "itemView");
            ((AvatarItemView) view4.findViewById(R.id.avatar)).mo184668a(new SubtitleModel(larkUser.full_department_path));
        }
    }
}
