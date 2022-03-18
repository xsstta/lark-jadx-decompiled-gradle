package com.ss.android.lark.chatsetting.p1693a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatApplyInfo;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33991a;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.AbstractC34496c;
import com.ss.android.lark.chatsetting.dto.AbstractC34497d;
import com.ss.android.lark.chatsetting.dto.AbstractC34498e;
import com.ss.android.lark.chatsetting.dto.AbstractC34499f;
import com.ss.android.lark.chatsetting.dto.AbstractC34500g;
import com.ss.android.lark.chatsetting.dto.C34495a;
import com.ss.android.lark.chatsetting.dto.ChatLinkInfoResponse;
import com.ss.android.lark.chatsetting.dto.ChatLinkTokenResponse;
import com.ss.android.lark.chatsetting.dto.ChatQRCodeTokenResponse;
import com.ss.android.lark.chatsetting.dto.GetChatJoinLeaveHistoryResponse;
import com.ss.android.lark.chatsetting.dto.Profile;
import com.ss.android.lark.chatsetting.dto.PullChatShareHistoryResponse;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.dto.SelectChatterDTO;
import com.ss.android.lark.chatsetting.dto.Shortcut;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.Team;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.chatsetting.a.c */
public interface AbstractC34461c {

    /* renamed from: com.ss.android.lark.chatsetting.a.c$a */
    public interface AbstractC34462a {
        /* renamed from: a */
        boolean mo127297a(String str);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$b */
    public interface AbstractC34463b {
        /* renamed from: a */
        int mo127298a();

        /* renamed from: a */
        void mo127299a(Context context, String str, String str2, String str3, View view);

        /* renamed from: a */
        void mo127300a(Fragment fragment, Activity activity, ImageView imageView, String str, int i);

        /* renamed from: a */
        void mo127301a(String str, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$c */
    public interface AbstractC34464c {
        /* renamed from: a */
        void mo127302a(Context context, String str);

        /* renamed from: a */
        void mo127303a(Context context, String str, String str2);

        /* renamed from: b */
        void mo127304b(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$d */
    public interface AbstractC34465d {
        /* renamed from: a */
        AbstractC33978b mo127305a(Activity activity, String str, String str2, AbstractC33980d dVar);

        /* renamed from: a */
        void mo127306a();

        /* renamed from: a */
        void mo127307a(Context context, Chat chat, ChatChatter chatChatter);

        /* renamed from: a */
        void mo127308a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo127309a(int i);

        /* renamed from: a */
        boolean mo127310a(Chat chat, ChatChatter chatChatter);

        /* renamed from: b */
        boolean mo127311b(int i);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$e */
    public interface AbstractC34466e {
        /* renamed from: a */
        Chat mo127312a(String str);

        /* renamed from: a */
        ChatChatter mo127313a(String str, String str2);

        /* renamed from: a */
        String mo127314a(Chatter chatter);

        /* renamed from: a */
        List<ChatChatter> mo127315a(String str, int i);

        /* renamed from: a */
        Map<String, ChatChatter> mo127316a(String str, List<String> list);

        /* renamed from: a */
        void mo127317a();

        /* renamed from: a */
        void mo127318a(Context context, String str);

        /* renamed from: a */
        void mo127319a(IGetDataCallback<Long> iGetDataCallback);

        /* renamed from: a */
        void mo127320a(Channel channel, String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo127321a(AbstractC34496c cVar);

        /* renamed from: a */
        void mo127322a(AbstractC34497d dVar);

        /* renamed from: a */
        void mo127323a(AbstractC34498e eVar);

        /* renamed from: a */
        void mo127324a(String str, int i, IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback);

        /* renamed from: a */
        void mo127325a(String str, int i, boolean z, IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback);

        /* renamed from: a */
        void mo127326a(String str, IGetDataCallback<ChatLinkInfoResponse> iGetDataCallback);

        /* renamed from: a */
        void mo127327a(String str, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127328a(String str, Chat.AtAllPermission atAllPermission, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127329a(String str, Chat.BuzzPermissionSetting buzzPermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127330a(String str, Chat.CreateVideoConferenceSetting createVideoConferenceSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127331a(String str, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127332a(String str, Chat.MessagePosition messagePosition, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127333a(String str, Chat.PinPermissionSetting pinPermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127334a(String str, Chat.PostType postType, List<String> list, List<String> list2, IGetDataCallback<Void> iGetDataCallback);

        /* renamed from: a */
        void mo127335a(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127336a(String str, Chat.TopNoticePermissionSetting topNoticePermissionSetting, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127337a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127338a(String str, String str2, int i, IGetDataCallback<PullChatShareHistoryResponse> iGetDataCallback);

        /* renamed from: a */
        void mo127339a(String str, String str2, IGetDataCallback<ChatApplyInfo> iGetDataCallback);

        /* renamed from: a */
        void mo127340a(String str, String str2, AvatarMeta avatarMeta, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127341a(String str, String str2, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127342a(String str, String str2, boolean z, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo127343a(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127344a(String str, boolean z, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127345a(String str, boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127346a(List<String> list, IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback);

        /* renamed from: a */
        void mo127347a(List<String> list, ChatShareInfo.ShareStatus shareStatus, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: b */
        IChatParser mo127348b();

        /* renamed from: b */
        Chat mo127349b(String str);

        /* renamed from: b */
        String mo127350b(Chatter chatter);

        /* renamed from: b */
        List<ChatChatter> mo127351b(String str, int i);

        /* renamed from: b */
        void mo127352b(AbstractC34496c cVar);

        /* renamed from: b */
        void mo127353b(AbstractC34497d dVar);

        /* renamed from: b */
        void mo127354b(AbstractC34498e eVar);

        /* renamed from: b */
        void mo127355b(String str, int i, IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback);

        /* renamed from: b */
        void mo127356b(String str, int i, boolean z, IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback);

        /* renamed from: b */
        void mo127357b(String str, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: b */
        void mo127358b(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo127359b(String str, String str2, int i, IGetDataCallback<GetChatJoinLeaveHistoryResponse> iGetDataCallback);

        /* renamed from: b */
        void mo127360b(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo127361b(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: b */
        void mo127362b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback);

        /* renamed from: c */
        TopicGroup mo127363c(String str);

        /* renamed from: c */
        String mo127364c(Chatter chatter);

        /* renamed from: c */
        void mo127365c(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: c */
        void mo127366c(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: c */
        void mo127367c(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: c */
        boolean mo127368c();

        /* renamed from: d */
        void mo127369d(String str, IGetDataCallback<Chatter> iGetDataCallback);

        /* renamed from: d */
        void mo127370d(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: d */
        void mo127371d(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: e */
        void mo127372e(String str, IGetDataCallback<AvatarMeta> iGetDataCallback);

        /* renamed from: e */
        void mo127373e(String str, String str2, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: e */
        void mo127374e(String str, boolean z, IGetDataCallback<ChatSetting> iGetDataCallback);

        /* renamed from: f */
        void mo127375f(String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: f */
        void mo127376f(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: g */
        void mo127377g(String str, IGetDataCallback<List<ChatChatter>> iGetDataCallback);

        /* renamed from: g */
        void mo127378g(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: h */
        void mo127379h(String str, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: i */
        void mo127380i(String str, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: j */
        void mo127381j(String str, IGetDataCallback<List<Chatter>> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$f */
    public interface AbstractC34467f {
        /* renamed from: a */
        void mo127382a(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback);

        /* renamed from: a */
        void mo127383a(Context context, String str, String str2, Contact contact);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$g */
    public interface AbstractC34468g {
        /* renamed from: a */
        int mo127384a(DocType docType);

        /* renamed from: a */
        void mo127385a(AbstractC33987b bVar);

        /* renamed from: a */
        void mo127386a(List<String> list);

        /* renamed from: b */
        void mo127387b(AbstractC33987b bVar);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$h */
    public interface AbstractC34469h {
        /* renamed from: a */
        boolean mo127388a();
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$i */
    public interface AbstractC34470i {
        /* renamed from: a */
        boolean mo127389a();
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$j */
    public interface AbstractC34471j {
        /* renamed from: a */
        List<Shortcut> mo127390a(List<String> list);

        /* renamed from: a */
        void mo127391a(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback);

        /* renamed from: a */
        void mo127392a(AbstractC34499f fVar);

        /* renamed from: a */
        void mo127393a(List<String> list, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: a */
        void mo127394a(List<String> list, boolean z, IGetDataCallback<Object> iGetDataCallback);

        /* renamed from: a */
        boolean mo127395a();

        /* renamed from: b */
        void mo127396b(Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback);

        /* renamed from: b */
        void mo127397b(AbstractC34499f fVar);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$k */
    public interface AbstractC34472k {
        /* renamed from: a */
        void mo127398a(Context context, ProfileContent profileContent);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$l */
    public interface AbstractC34473l {
        /* renamed from: a */
        List<SelectChatterDTO> mo127399a(Intent intent);

        /* renamed from: a */
        void mo127400a(Activity activity, Chat chat, boolean z, int i, String str);

        /* renamed from: a */
        void mo127401a(Activity activity, String str, int i);

        /* renamed from: a */
        void mo127402a(Activity activity, String str, int i, boolean z);

        /* renamed from: a */
        void mo127403a(Activity activity, String str, boolean z);

        /* renamed from: a */
        void mo127404a(Activity activity, String str, boolean z, boolean z2);

        /* renamed from: a */
        void mo127405a(Context context, String str, List<String> list, int i, AbstractC44896a aVar);

        /* renamed from: a */
        void mo127406a(C36516a aVar, String str, int i, boolean z);

        /* renamed from: a */
        void mo127407a(C36516a aVar, String str, ArrayList<String> arrayList, int i);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$m */
    public interface AbstractC34474m {
        /* renamed from: a */
        void mo127408a(Context context, String str, ImageView imageView, int i, int i2);

        /* renamed from: a */
        void mo127409a(Context context, String str, String str2, ImageView imageView, int i, int i2);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$n */
    public interface AbstractC34475n {
        /* renamed from: a */
        void mo127410a(Context context, String str, boolean z);

        /* renamed from: a */
        void mo127411a(String str, AbstractC33991a aVar);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$o */
    public interface AbstractC34476o {
        /* renamed from: a */
        String mo127412a();

        /* renamed from: a */
        boolean mo127413a(String str);

        /* renamed from: b */
        String mo127414b();

        /* renamed from: c */
        String mo127415c();
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$p */
    public interface AbstractC34477p {
        /* renamed from: a */
        boolean mo127416a();
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$q */
    public interface AbstractC34478q {
        /* renamed from: a */
        void mo127417a(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$r */
    public interface AbstractC34479r {
        /* renamed from: a */
        void mo127418a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        void mo127419a(String str, String str2, Context context, boolean z, int i);

        /* renamed from: a */
        void mo127420a(String str, String str2, Context context, boolean z, boolean z2, int i);

        /* renamed from: a */
        boolean mo127421a(Chat chat, Message message);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$s */
    public interface AbstractC34480s {
        /* renamed from: a */
        void mo127422a(Context context, Chatter chatter, String str, String str2, String str3);

        /* renamed from: a */
        void mo127423a(Context context, String str);

        /* renamed from: a */
        void mo127424a(Context context, String str, String str2, String str3);

        /* renamed from: a */
        void mo127425a(Context context, String str, String str2, String str3, String str4, boolean z);

        /* renamed from: a */
        void mo127426a(Context context, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6);

        /* renamed from: a */
        void mo127427a(String str, IGetDataCallback<Profile> iGetDataCallback);

        /* renamed from: b */
        void mo127428b(Context context, String str);

        /* renamed from: c */
        void mo127429c(Context context, String str);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$t */
    public interface AbstractC34481t {
        /* renamed from: a */
        void mo127430a(AbstractC34500g gVar);

        /* renamed from: a */
        void mo127431a(String str, String str2, PushChatRelationListener iVar);

        /* renamed from: b */
        void mo127432b(AbstractC34500g gVar);

        /* renamed from: b */
        void mo127433b(String str, String str2, PushChatRelationListener iVar);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$u */
    public interface AbstractC34482u {
        /* renamed from: a */
        void mo127434a(Context context, String str, boolean z);

        /* renamed from: a */
        void mo127435a(Context context, String str, boolean z, int i);

        /* renamed from: a */
        void mo127436a(String str);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$v */
    public interface AbstractC34483v {
        /* renamed from: a */
        Fragment mo127437a(Context context, Bundle bundle, Chat chat);

        /* renamed from: a */
        Fragment mo127438a(Bundle bundle);

        /* renamed from: a */
        void mo127439a(Context context, Bitmap bitmap, IGetDataCallback<String> iGetDataCallback);

        /* renamed from: a */
        void mo127440a(Context context, String str, String str2, String str3, IGetDataCallback<String> iGetDataCallback);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$w */
    public interface AbstractC34484w {
        /* renamed from: a */
        Map<Long, Team> mo127441a(GetTeamsByIdsResponse getTeamsByIdsResponse);

        /* renamed from: a */
        void mo127442a(long j, IGetDataCallback<Team> iGetDataCallback);

        /* renamed from: a */
        void mo127443a(long j, String str, IGetDataCallback<Chat> iGetDataCallback);

        /* renamed from: a */
        void mo127444a(long j, String str, AvatarMeta avatarMeta, IGetDataCallback<Team> iGetDataCallback);

        /* renamed from: a */
        void mo127445a(Activity activity, Team team, Chat chat);

        /* renamed from: a */
        void mo127446a(List<String> list, Item.Type type, IGetDataCallback<Map<String, Item>> iGetDataCallback);

        /* renamed from: a */
        boolean mo127447a();

        /* renamed from: b */
        void mo127448b(Activity activity, Team team, Chat chat);

        /* renamed from: c */
        void mo127449c(Activity activity, Team team, Chat chat);
    }

    /* renamed from: com.ss.android.lark.chatsetting.a.c$x */
    public interface AbstractC34485x {
        /* renamed from: a */
        void mo127450a(Context context, String str, boolean z);

        /* renamed from: a */
        void mo127451a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: a */
        boolean mo127452a();
    }

    /* renamed from: A */
    boolean mo127256A();

    /* renamed from: B */
    boolean mo127257B();

    /* renamed from: C */
    AbstractC34468g mo127258C();

    /* renamed from: D */
    AbstractC34477p mo127259D();

    /* renamed from: E */
    boolean mo127260E();

    /* renamed from: F */
    boolean mo127261F();

    /* renamed from: G */
    boolean mo127262G();

    /* renamed from: a */
    Bitmap mo127263a(String str, int i, int i2, int i3);

    /* renamed from: a */
    String mo127264a();

    /* renamed from: a */
    void mo127265a(Context context);

    /* renamed from: a */
    void mo127266a(Context context, String str);

    /* renamed from: a */
    void mo127267a(Context context, String str, String str2, ImageView imageView);

    /* renamed from: a */
    boolean mo127268a(String str);

    /* renamed from: b */
    ChatSettingModule.AbstractC34455b mo127269b();

    /* renamed from: b */
    C34495a mo127270b(String str);

    /* renamed from: b */
    void mo127271b(Context context, String str);

    /* renamed from: c */
    AbstractC34464c mo127272c();

    /* renamed from: c */
    boolean mo127273c(Context context, String str);

    /* renamed from: d */
    AbstractC34466e mo127274d();

    /* renamed from: e */
    AbstractC34481t mo127275e();

    /* renamed from: f */
    AbstractC34472k mo127276f();

    /* renamed from: g */
    AbstractC34476o mo127277g();

    /* renamed from: h */
    AbstractC34471j mo127278h();

    /* renamed from: i */
    AbstractC34474m mo127279i();

    /* renamed from: j */
    AbstractC34480s mo127280j();

    /* renamed from: k */
    AbstractC34473l mo127281k();

    /* renamed from: l */
    AbstractC34465d mo127282l();

    /* renamed from: m */
    AbstractC34470i mo127283m();

    /* renamed from: n */
    AbstractC34462a mo127284n();

    /* renamed from: o */
    AbstractC34483v mo127285o();

    /* renamed from: p */
    AbstractC34463b mo127286p();

    /* renamed from: q */
    AbstractC34478q mo127287q();

    /* renamed from: r */
    AbstractC34482u mo127288r();

    /* renamed from: s */
    AbstractC34475n mo127289s();

    /* renamed from: t */
    AbstractC34479r mo127290t();

    /* renamed from: u */
    AbstractC34485x mo127291u();

    /* renamed from: v */
    AbstractC34467f mo127292v();

    /* renamed from: w */
    AbstractC34469h mo127293w();

    /* renamed from: x */
    AbstractC34484w mo127294x();

    /* renamed from: y */
    Context mo127295y();

    /* renamed from: z */
    boolean mo127296z();
}
