package com.ss.android.lark.member_manage.impl.show_member.team_group;

import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0014J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0007H&J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment;", "", "asFragment", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "changeItemSelectedStatus", "", "itemId", "", "isSelected", "", "changeSelectableStatus", "isSelectable", "getName", "", "loadFirstPageMembers", "onSearch", "key", "removeItems", "itemList", "", "ItemClickListener", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IBaseFragment {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "Ljava/io/Serializable;", "onItemClick", "", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface ItemClickListener extends Serializable {
        void onItemClick(C45084c cVar);
    }

    /* renamed from: a */
    BaseFragment mo159813a();

    /* renamed from: a */
    void mo159814a(String str);

    /* renamed from: a */
    void mo159815a(String str, boolean z);

    /* renamed from: a */
    void mo159816a(List<String> list);

    /* renamed from: a */
    void mo159817a(boolean z);

    /* renamed from: b */
    int mo159818b();

    /* renamed from: c */
    void mo159819c();
}
