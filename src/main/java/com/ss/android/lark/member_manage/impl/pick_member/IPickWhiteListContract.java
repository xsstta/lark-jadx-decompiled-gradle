package com.ss.android.lark.member_manage.impl.pick_member;

import com.ss.android.lark.member_manage.dto.SelectChatterDTO;
import com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract;", "", "IModel", "IView", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.pick_member.a */
public interface IPickWhiteListContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IModel;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseModel;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.a$a */
    public interface IModel extends IGroupMemberBaseContract.AbstractC45065a {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010J\u0016\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J \u0010\b\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH&J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView;", "Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView$Delegate;", "cancelSelect", "", "cancelList", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "closeForResult", "selectChatters", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/member_manage/dto/SelectChatterDTO;", "Lkotlin/collections/ArrayList;", "startSelected", "list", "", "Delegate", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.a$b */
    public interface IView extends IGroupMemberBaseContract.AbstractC45066b<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/pick_member/IPickWhiteListContract$IView$Delegate;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/IGroupMemberBaseContract$IBaseView$Delegate;", "onSelectedNumClick", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.pick_member.a$b$a */
        public interface Delegate extends IGroupMemberBaseContract.AbstractC45066b.AbstractC45067a {
            /* renamed from: g */
            void mo159662g();
        }

        /* renamed from: a */
        void mo159659a(ArrayList<SelectChatterDTO> arrayList);

        void a_(List<? extends C45084c> list);

        /* renamed from: c */
        void mo159661c(List<C45084c> list);
    }
}
