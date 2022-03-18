package com.ss.android.lark.contact.feat.contact_recommend.mvp.list;

import android.view.View;
import com.larksuite.component.ui.button.LKUIButton;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.feat.common.ItemViewHolder;
import com.ss.android.lark.contact.feat.contact_recommend.entity.EmptyData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/list/EmptyViewHolder;", "Lcom/ss/android/lark/contact/feat/common/ItemViewHolder;", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/EmptyData;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "inviteBtn", "Lcom/larksuite/component/ui/button/LKUIButton;", "getInviteBtn", "()Lcom/larksuite/component/ui/button/LKUIButton;", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a.f */
public final class EmptyViewHolder extends ItemViewHolder<EmptyData> {

    /* renamed from: a */
    private final LKUIButton f91535a;

    /* renamed from: b */
    public final LKUIButton mo130693b() {
        return this.f91535a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyViewHolder(View view) {
        super(view);
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        this.f91535a = (LKUIButton) view.findViewById(R.id.contact_rec_empty_invite);
    }
}
