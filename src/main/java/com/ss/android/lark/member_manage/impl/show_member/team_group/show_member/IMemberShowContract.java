package com.ss.android.lark.member_manage.impl.show_member.team_group.show_member;

import com.bytedance.ee.bear.document.tips.BottomDialog;
import com.larksuite.framework.callback.C25975i;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.IModel;
import com.larksuite.framework.mvp.IView;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract;", "", "IMemberShowContractModel", "IMemberShowContractView", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.b */
public interface IMemberShowContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\b\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH&J \u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\tH&¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractModel;", "Lcom/larksuite/framework/mvp/IModel;", "getCurrentChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "getItemChatter", "", BottomDialog.f17198f, "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "hasMore", "", "loadFirstPageMembers", "Lcom/larksuite/framework/callback/UIGetContinualDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "loadMoreMembers", "search", "key", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/SearchData;", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.b$a */
    public interface IMemberShowContractModel extends IModel {
        /* renamed from: a */
        void mo159890a(IGetDataCallback<SelectBeansResult> iGetDataCallback);

        /* renamed from: a */
        void mo159891a(C25975i<SelectBeansResult> iVar);

        /* renamed from: a */
        void mo159892a(String str, IGetDataCallback<SearchData> iGetDataCallback);

        /* renamed from: a */
        boolean mo159893a();

        /* renamed from: b */
        Chat mo159894b();

        /* renamed from: b */
        void mo159895b(String str, IGetDataCallback<Chatter> iGetDataCallback);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u0004H&J\b\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\tH&J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH&J\u0016\u0010\u0017\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0006H&J\b\u0010\u001f\u001a\u00020\u0004H&J\u001e\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0019H&J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\tH&¨\u0006'"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView;", "Lcom/larksuite/framework/mvp/IView;", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView$IMemberShowContractDelegate;", "addMemberPage", "", "selectBeansResult", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "changeItemSelectedStatus", "itemId", "", "isSelected", "", "changeSelectableStatus", "isSelectable", "closeSearch", "endMemberLoaderMore", "getFirstPageFail", ApiHandler.API_CALLBACK_ERRMSG, "goToProfile", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "chatId", "chatName", "removeItems", "itemIds", "", "setItemClickListener", "listener", "Lcom/ss/android/lark/member_manage/impl/show_member/team_group/IBaseFragment$ItemClickListener;", "showFirstPageData", "result", "showSearchFail", "showSearchResult", "key", "items", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "startAppProfileByBotId", BottomDialog.f17198f, "IMemberShowContractDelegate", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.b$b */
    public interface IMemberShowContractView extends IView<IMemberShowContractDelegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/show_member/team_group/show_member/IMemberShowContract$IMemberShowContractView$IMemberShowContractDelegate;", "Lcom/larksuite/framework/mvp/IView$IViewDelegate;", "canMemberLoadMore", "", "onItemClick", "", BottomDialog.f17198f, "", "onMemberLoadMore", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.show_member.team_group.show_member.b$b$a */
        public interface IMemberShowContractDelegate extends IView.IViewDelegate {
            /* renamed from: a */
            void mo159908a(String str);

            /* renamed from: a */
            boolean mo159909a();

            /* renamed from: b */
            void mo159910b();
        }

        /* renamed from: a */
        void mo159896a();

        /* renamed from: a */
        void mo159897a(Chatter chatter, String str, String str2);

        /* renamed from: a */
        void mo159898a(SelectBeansResult dVar);

        /* renamed from: a */
        void mo159899a(String str);

        /* renamed from: a */
        void mo159900a(String str, List<? extends C45084c> list);

        /* renamed from: a */
        void mo159901a(String str, boolean z);

        /* renamed from: a */
        void mo159902a(List<String> list);

        /* renamed from: a */
        void mo159903a(boolean z);

        /* renamed from: b */
        void mo159904b();

        /* renamed from: b */
        void mo159905b(SelectBeansResult dVar);

        /* renamed from: b */
        void mo159906b(String str);

        /* renamed from: c */
        void mo159907c();
    }
}
