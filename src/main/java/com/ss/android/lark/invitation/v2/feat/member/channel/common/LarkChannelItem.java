package com.ss.android.lark.invitation.v2.feat.member.channel.common;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/invitation/v2/feat/member/channel/common/LarkChannelItem;", "Lcom/ss/android/lark/invitation/v2/feat/member/channel/common/ChannelItem;", "iconId", "", "colorTintRes", "title", "", "subTitle", "listener", "Landroid/view/View$OnClickListener;", "(IILjava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;)V", "bind", "", "holder", "Lcom/ss/android/lark/widget/recyclerview/item/ItemViewHolder;", "position", "core_invitation_v2_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.invitation.v2.feat.member.channel.a.b */
public final class LarkChannelItem extends C40327a {
    @Override // com.ss.android.lark.invitation.v2.feat.member.channel.p2059a.C40327a, com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        super.mo101671a(cVar, i);
        if (mo200061a(R.layout.inv_invite_member_channel_lark_content_item)) {
            mo146219b(cVar, i);
        }
    }

    public LarkChannelItem(int i, int i2, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        super(R.layout.inv_invite_member_channel_lark_content_item, i, i2, charSequence, charSequence2, onClickListener);
    }
}
