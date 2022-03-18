package com.ss.android.lark.member_manage.impl.show_member.team_group;

import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract;", "", "ITeamGroupShowMemberModel", "ITeamGroupShowMemberView", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.b */
public interface ITeamGroupShowMemberContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&J\u001c\u0010\r\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\f0\tH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberModel;", "Lcom/larksuite/framework/mvp/IModel;", "addSelectedItem", "", "selectBean", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "clearSelectedData", "getChatById", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getSelectedItems", "", "removeMembers", "", "removeSelectedItem", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.b$a */
    public interface ITeamGroupShowMemberModel extends IModel {
        /* renamed from: a */
        List<C45084c> mo159841a();

        /* renamed from: a */
        void mo159842a(IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo159843a(C45084c cVar);

        /* renamed from: b */
        void mo159844b();

        /* renamed from: b */
        void mo159845b(IGetDataCallback<List<String>> iGetDataCallback);

        /* renamed from: b */
        void mo159846b(C45084c cVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00110\rH&¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView$ITeamGroupShowMemberDelegate;", "changeViewSelectableStatus", "", "isSelectable", "", "reloadFirstPageMembers", "reloadTitle", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "removeItems", "items", "", "", "showInitData", "updateView", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "ITeamGroupShowMemberDelegate", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.b$b */
    public interface ITeamGroupShowMemberView extends IView<ITeamGroupShowMemberDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/ITeamGroupShowMemberContract$ITeamGroupShowMemberView$ITeamGroupShowMemberDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "onConfirmBtnClick", "", "onItemClick", "item", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onRemoveBtnClick", "onTitleLeftBtnClick", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.b$b$a */
        public interface ITeamGroupShowMemberDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo159853a();

            /* renamed from: a */
            void mo159854a(C45084c cVar);

            /* renamed from: b */
            void mo159855b();

            /* renamed from: c */
            void mo159856c();
        }

        /* renamed from: a */
        void mo159847a();

        /* renamed from: a */
        void mo159848a(Chat chat);

        /* renamed from: a */
        void mo159849a(List<? extends C45084c> list);

        /* renamed from: a */
        void mo159850a(boolean z);

        /* renamed from: b */
        void mo159851b(Chat chat);

        /* renamed from: b */
        void mo159852b(List<String> list);
    }
}
