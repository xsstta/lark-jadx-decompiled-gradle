package com.ss.android.lark.member_manage.dependency;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dto.C44893a;
import com.ss.android.lark.member_manage.dto.C44895d;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.dto.SelectedData;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.team.entity.Team;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public interface IGroupMemberManageModuleDependency {

    public interface IChatDependency {

        @Retention(RetentionPolicy.SOURCE)
        public @interface Condition {
        }

        /* renamed from: a */
        RichText mo143742a(com.ss.android.lark.widget.richtext.RichText richText);

        /* renamed from: a */
        Chat mo143743a(String str);

        /* renamed from: a */
        GroupManageChatChatterResponse mo143744a(String str, String str2, int i, int i2);

        /* renamed from: a */
        C44895d mo143745a(String str, String str2, String str3, boolean z);

        /* renamed from: a */
        Map<String, ChatChatter> mo143746a(String str, List<String> list);

        /* renamed from: a */
        void mo143747a(Intent intent, List<ChatChatter> list);

        /* renamed from: a */
        void mo143748a(String str, int i, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo143749a(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo143750a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo143751a(String str, String str2, int i, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback);

        /* renamed from: a */
        void mo143752a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback);

        /* renamed from: a */
        void mo143753a(String str, String str2, GroupMemberManageModule.AbstractC44877b bVar);

        /* renamed from: a */
        void mo143754a(String str, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo143755a(String str, String str2, String str3, boolean z, IGetDataCallback<C44895d> iGetDataCallback);

        /* renamed from: a */
        void mo143756a(String str, String str2, boolean z, int i, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback, int i2, int i3);

        /* renamed from: a */
        void mo143757a(String str, List<PickChatEntity> list, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo143758a(String str, List<String> list, String str2, String str3, String str4, int i, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo143759a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo143760a(String str, List<String> list, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo143761a(boolean z);

        /* renamed from: a */
        boolean mo143762a(Chat chat);

        /* renamed from: b */
        Chat mo143763b(String str);

        /* renamed from: b */
        void mo143764b(String str, IGetDataCallback<Integer> iGetDataCallback);

        /* renamed from: b */
        void mo143765b(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo143766b(String str, String str2, GroupMemberManageModule.AbstractC44877b bVar);

        /* renamed from: b */
        void mo143767b(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback);

        /* renamed from: b */
        void mo143768b(boolean z);

        /* renamed from: c */
        void mo143769c(String str, IGetDataCallback<List<Chatter>> iGetDataCallback);

        /* renamed from: c */
        void mo143770c(String str, String str2, IGetDataCallback<MessageUnReadInfo> iGetDataCallback);

        /* renamed from: d */
        void mo143771d(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$a */
    public interface AbstractC44878a {
        /* renamed from: a */
        boolean mo143792a();

        /* renamed from: a */
        boolean mo143793a(String str);

        /* renamed from: a */
        boolean mo143794a(List<String> list);

        /* renamed from: b */
        String mo143795b();
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$b */
    public interface AbstractC44879b {
        /* renamed from: a */
        int mo143802a();

        /* renamed from: b */
        int mo143803b();
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$c */
    public interface AbstractC44880c {
        /* renamed from: a */
        void mo143809a(Activity activity, Chat chat);

        /* renamed from: a */
        void mo143810a(Activity activity, Chat chat, String str, int i);

        /* renamed from: a */
        void mo143811a(Chat.ChatMode chatMode, List<PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback);

        /* renamed from: a */
        void mo143812a(Chat chat, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo143813a(String str, String str2);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$d */
    public interface AbstractC44881d {
        /* renamed from: a */
        Chatter mo143779a();

        /* renamed from: a */
        List<Chatter> mo143780a(List<String> list);

        /* renamed from: a */
        Map<String, ChatChatter> mo143781a(String str, List<String> list);

        /* renamed from: a */
        void mo143782a(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: a */
        void mo143783a(String str, List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback);

        /* renamed from: a */
        void mo143784a(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

        /* renamed from: a */
        boolean mo143785a(Chatter chatter);

        /* renamed from: b */
        Map<String, ChatChatter> mo143786b(String str, List<String> list);

        /* renamed from: b */
        Map<String, Chatter> mo143787b(List<String> list);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$e */
    public interface AbstractC44882e {
        /* renamed from: a */
        char mo143788a(Chatter chatter, Locale locale);

        /* renamed from: a */
        String mo143789a(Chatter chatter);

        /* renamed from: a */
        void mo143790a(List<Chatter> list);

        /* renamed from: b */
        void mo143791b(List<ChatChatter> list);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$f */
    public interface AbstractC44883f {

        /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$f$a */
        public interface AbstractC44884a {
            /* renamed from: a */
            void mo158814a();

            /* renamed from: a */
            void mo158815a(boolean z, String str);

            /* renamed from: b */
            void mo158816b();
        }

        /* renamed from: a */
        List<String> mo143737a(Intent intent);

        /* renamed from: a */
        void mo143738a(Activity activity, List<SelectedData> list, int i);

        /* renamed from: a */
        void mo143739a(Context context, String str, List<Contact> list, boolean z, AbstractC44884a aVar);

        /* renamed from: a */
        void mo143740a(C36516a aVar, List<SelectedData> list, int i);

        /* renamed from: b */
        List<SelectedData> mo143741b(Intent intent);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$g */
    public interface AbstractC44885g {
        /* renamed from: a */
        void mo143814a(Context context, boolean z, boolean z2, List<SearchBaseInfo> list, String str, IGetDataCallback<Chat> iGetDataCallback, boolean z3);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$h */
    public interface AbstractC44886h {
        /* renamed from: a */
        void mo143815a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$i */
    public interface AbstractC44887i {
        /* renamed from: a */
        Boolean mo143801a();
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$j */
    public interface AbstractC44888j {
        /* renamed from: a */
        MessageInfo mo143796a(String str);

        /* renamed from: a */
        com.ss.android.lark.widget.richtext.RichText mo143797a(Message message);

        /* renamed from: a */
        List<String> mo143798a(boolean z, Message message);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$k */
    public interface AbstractC44889k {
        /* renamed from: a */
        void mo143799a(String str, String str2, List<C44893a> list, IGetDataCallback<Void> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$l */
    public interface AbstractC44890l {
        /* renamed from: a */
        boolean mo143800a();
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$m */
    public interface AbstractC44891m {
        /* renamed from: a */
        void mo143777a(long j, IGetDataCallback<Team> iGetDataCallback);

        /* renamed from: a */
        boolean mo143778a();
    }

    /* renamed from: com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency$n */
    public interface AbstractC44892n {
        /* renamed from: a */
        int mo143804a();

        /* renamed from: a */
        void mo143805a(Context context, String str);

        /* renamed from: b */
        int mo143806b();

        /* renamed from: c */
        int mo143807c();

        /* renamed from: d */
        String mo143808d();
    }

    AbstractC44878a getAccountDependency();

    AbstractC44879b getAppConfigDependency();

    IChatDependency getChatDependency();

    AbstractC44880c getChatSettingDependency();

    AbstractC44881d getChatterDependency();

    AbstractC44882e getChatterNameDependency();

    AbstractC44883f getContactDependency();

    AbstractC44885g getCreateGroupDependency();

    AbstractC44886h getImageDependency();

    AbstractC44887i getLanguageDependency();

    Locale getLanguageSetting();

    AbstractC44888j getMessageDependency();

    String getOpenedStatus(List<ChatterCustomStatus> list);

    AbstractC44889k getSearchDependency();

    AbstractC44890l getSettingDependency();

    AbstractC44891m getTeamDependency();

    AbstractC44892n getUserAuthorityDependency();

    boolean isCheckSecretPermission();

    boolean isFeatureGatingEnable(String str);

    boolean isInZenMode(long j);

    void openSendDingActivity(Context context, C36516a aVar, Message message, List<String> list, int i);

    void setInSecretMode(boolean z);

    void startAppProfileByBotId(Context context, String str);

    void startContactsProfileActivity(Context context, Chatter chatter);

    void startContactsProfileActivityFromChatContact(Context context, Chatter chatter, String str, String str2);

    void startInviteInactiveParentListActivity(Context context, String str, int i);
}
