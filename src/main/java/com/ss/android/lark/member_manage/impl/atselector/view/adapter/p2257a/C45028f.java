package com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.chatter.TagFilterRule;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.BaseAtBean;
import com.ss.android.lark.member_manage.impl.atselector.bean.C44977a;
import com.ss.android.lark.member_manage.impl.atselector.bean.GroupMemAtBean;
import com.ss.android.lark.member_manage.impl.atselector.view.adapter.holder.AtSelectableViewHolder;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UserStatusHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.member_manage.impl.atselector.view.adapter.a.f */
public class C45028f implements AbstractC45030g<C44977a, AtSelectableViewHolder> {
    /* renamed from: d */
    public void mo159292a(C44977a aVar, AtSelectableViewHolder atSelectableViewHolder) {
        String j = aVar.mo159194j();
        if (j == null) {
            atSelectableViewHolder.mCustomStatus.setVisibility(8);
            return;
        }
        atSelectableViewHolder.mCustomStatus.setVisibility(0);
        C52977a.m205190a().mo180995a(atSelectableViewHolder.mCustomStatus, j);
    }

    /* renamed from: b */
    public void mo159296c(C44977a aVar, AtSelectableViewHolder atSelectableViewHolder) {
        WorkStatus h = aVar.mo159192h();
        if (WorkStatus.isInvalid(h)) {
            atSelectableViewHolder.mWorkStatus.setVisibility(8);
            return;
        }
        atSelectableViewHolder.mWorkStatus.setVisibility(0);
        atSelectableViewHolder.mWorkStatus.setText(h.getDisplayTextNoDuration(atSelectableViewHolder.mWorkStatus.getContext()));
    }

    /* renamed from: c */
    public void mo159294b(C44977a aVar, AtSelectableViewHolder atSelectableViewHolder) {
        boolean z;
        Context context = atSelectableViewHolder.itemView.getContext();
        boolean isInZenMode = GroupMemberManageModule.m177902a().isInZenMode(aVar.mo159193i());
        boolean k = aVar.mo159195k();
        if (aVar.mo159189e() == Chatter.ChatterType.BOT) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !aVar.mo159196l().isEmpty();
        if (z || isInZenMode || k || z2) {
            atSelectableViewHolder.mTagWrapper.setVisibility(0);
        }
        LarkNameTag.ChatTagBuilder h = new LarkNameTag.ChatTagBuilder(context).mo90042m(isInZenMode).mo90036g(z).mo90037h(aVar.mo159195k());
        TagInfo.apply(h, aVar.mo159196l(), TagFilterRule.m131801b());
        h.mo90027e().mo90004a(atSelectableViewHolder.mTagWrapper);
    }

    /* renamed from: a */
    public void mo159298d(C44977a aVar, AtSelectableViewHolder atSelectableViewHolder) {
        ChatterDescription f = aVar.mo159190f();
        if (!TextUtils.isEmpty(f.description) || f.type != ChatterDescription.Type.DEFAULT) {
            atSelectableViewHolder.mUserStatus.setVisibility(0);
            atSelectableViewHolder.mUserStatus.mo201154a(f.description, UIUtils.getDrawable(atSelectableViewHolder.mUserStatus.getContext(), UserStatusHelper.m224138a().mo195998a(f.type.getNumber())));
            return;
        }
        atSelectableViewHolder.mUserStatus.setVisibility(8);
    }

    /* renamed from: a */
    public void mo159286a(BaseAtBean baseAtBean, AtSelectableViewHolder atSelectableViewHolder, int i) {
        if (i == 0) {
            atSelectableViewHolder.mAtSelectCheckBox.setVisibility(8);
            return;
        }
        atSelectableViewHolder.mAtSelectCheckBox.setVisibility(0);
        atSelectableViewHolder.mAtSelectCheckBox.setChecked(baseAtBean.isSelected());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List, int] */
    @Override // com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.AbstractC45030g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo159285a(AtSelectableViewHolder atSelectableViewHolder, int i, List list, int i2) {
        mo159291a(atSelectableViewHolder, i, (List<BaseAtBean>) list, i2);
    }

    /* renamed from: a */
    public void mo159287a(final BaseAtBean baseAtBean, AtSelectableViewHolder atSelectableViewHolder, final GroupMemberManageModule.IItemContainer iItemContainer, int i) {
        View$OnClickListenerC450291 r4 = new View.OnClickListener() {
            /* class com.ss.android.lark.member_manage.impl.atselector.view.adapter.p2257a.C45028f.View$OnClickListenerC450291 */

            public void onClick(View view) {
                GroupMemberManageModule.IItemContainer.AbstractC44875a b = iItemContainer.mo158807b();
                int a = iItemContainer.mo158806a();
                if (b != null) {
                    if (a == 0) {
                        b.mo158812c(baseAtBean);
                    } else if (baseAtBean.isSelected()) {
                        baseAtBean.setSelected(false);
                        b.mo158811b(baseAtBean);
                    } else {
                        baseAtBean.setSelected(true);
                        b.mo158810a(baseAtBean);
                    }
                }
            }
        };
        atSelectableViewHolder.itemView.setOnClickListener(r4);
        atSelectableViewHolder.mAtSelectCheckBox.setOnClickListener(r4);
    }

    /* renamed from: a */
    public void mo159291a(AtSelectableViewHolder atSelectableViewHolder, int i, List<BaseAtBean> list, int i2) {
        int i3 = i - 1;
        if (i2 == i3) {
            atSelectableViewHolder.mDividerView.setVisibility(8);
        } else if (i2 < i3 && i2 > 0) {
            BaseAtBean baseAtBean = list.get(i2 + 1);
            BaseAtBean baseAtBean2 = list.get(i2);
            if (baseAtBean.getType() == 3 || baseAtBean.getType() == 1) {
                atSelectableViewHolder.mDividerView.setVisibility(8);
            } else if (baseAtBean.getType() != 0) {
                atSelectableViewHolder.mDividerView.setVisibility(0);
            } else if (((GroupMemAtBean) baseAtBean).getChatterInfo().mo159191g().charAt(0) != ((GroupMemAtBean) baseAtBean2).getChatterInfo().mo159191g().charAt(0)) {
                atSelectableViewHolder.mDividerView.setVisibility(8);
            } else {
                atSelectableViewHolder.mDividerView.setVisibility(0);
            }
        }
    }
}
