package com.ss.android.lark.chatsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.applink.AbstractC29186b;
import com.ss.android.lark.biz.im.api.AbstractC29611c;
import com.ss.android.lark.biz.im.api.ChatSettingApplyWay;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatAnnouncement;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionController;
import com.ss.android.lark.chatsetting.impl.chat_function.ChatFunctionItemFactory;
import com.ss.android.lark.chatsetting.impl.group.announcement.LarkGroupAnnouncementEditActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListActivity;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplicantListFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.applicant.ApplyDialogUtil;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.applink.ApplyGroupLimitAppLinkHandler;
import com.ss.android.lark.chatsetting.impl.group.setting.C34945e;
import com.ss.android.lark.chatsetting.impl.group.share.C34988a;
import com.ss.android.lark.chatsetting.impl.group.share.C34990b;
import com.ss.android.lark.chatsetting.impl.statistics.group.GroupHitPoint;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.chatsetting.p1693a.C34457a;
import com.ss.android.lark.chatsetting.p1693a.C34460b;
import com.ss.android.lark.chatsetting.service.ChatSettingService;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.widget.chat_function_view.ChatFunctionView;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionBinder;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionController;
import com.ss.android.lark.widget.chat_function_view.IChatFunctionItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatSettingModule {

    /* renamed from: a */
    private static AbstractC34461c f88983a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShareMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SourceToChatSetting {
    }

    /* renamed from: com.ss.android.lark.chatsetting.ChatSettingModule$a */
    public interface AbstractC34454a {
        /* renamed from: a */
        void mo127247a(ChatAnnouncement chatAnnouncement);

        /* renamed from: a */
        void mo127248a(String str, boolean z);

        /* renamed from: b */
        void mo127249b(String str, boolean z);
    }

    /* renamed from: com.ss.android.lark.chatsetting.ChatSettingModule$b */
    public interface AbstractC34455b {
        /* renamed from: a */
        void mo127250a();
    }

    /* renamed from: b */
    public void mo127240b() {
    }

    public enum HideSettingItemMask {
        HIDE_SHORTCUT_ITEM(2),
        HIDE_NOTICE_ITEM(4),
        HIDE_CONVERSATION_BOX_ITEM(8);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        private HideSettingItemMask(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static AbstractC34461c m133639a() {
        return f88983a;
    }

    /* renamed from: a */
    public void mo127229a(Activity activity, C36516a aVar, Chatter chatter, Chat chat, int i, int i2, String str) {
        C34456a.m133676a(activity, aVar, chat, chatter, i, i2, str);
    }

    /* renamed from: a */
    public void mo127235a(Context context, String str, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        C34456a.m133682a(context, str, i, z, z2, z3, z4, "more_mobile");
    }

    /* renamed from: a */
    public void mo127234a(Context context, String str, int i, boolean z, boolean z2, boolean z3) {
        C34456a.m133682a(context, str, i, z, z2, false, z3, "");
    }

    /* renamed from: a */
    public void mo127232a(Context context, C36516a aVar, String str, int i, boolean z, int i2, String str2) {
        C34456a.m133681a(context, aVar, str, i, z, i2, str2);
    }

    /* renamed from: a */
    public void mo127233a(Context context, String str) {
        Intent intent = new Intent(context, LarkGroupAnnouncementEditActivity.class);
        intent.putExtra("chatID", str);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public void mo127231a(Context context, Chat chat, int i, String str) {
        C34456a.m133680a(context, chat, i, str);
    }

    /* renamed from: a */
    public void mo127238a(String str, String str2) {
        GroupHitPoint.f90519a.mo129237e(str, str2);
    }

    /* renamed from: a */
    public synchronized void mo127237a(AbstractC34454a aVar) {
        C34457a.m133685a().mo127252a(aVar);
    }

    /* renamed from: a */
    public void mo127230a(Context context, ChatSettingApplyWay chatSettingApplyWay, AbstractC29611c cVar) {
        ApplyDialogUtil.f89614a.mo128146a(context, chatSettingApplyWay, cVar);
    }

    /* renamed from: a */
    public boolean mo127239a(OpenChat openChat) {
        return !m133639a().mo127268a("im.chat.setting.only.admin.can.vc") || (openChat != null && !openChat.isOnlyManagerCreateVC()) || (openChat != null && openChat.isOnlyManagerCreateVC() && m133640b(openChat));
    }

    /* renamed from: a */
    public void mo127236a(Chat chat, IGetDataCallback<Boolean> iGetDataCallback) {
        ChatSettingService.f88988a.mo127458a(chat, iGetDataCallback);
    }

    /* renamed from: c */
    public static Map<String, Boolean> m133641c() {
        return C34460b.m133691a();
    }

    /* renamed from: d */
    public int mo127245d() {
        return C34945e.m136037c();
    }

    public ChatSettingModule(AbstractC34461c cVar) {
        f88983a = cVar;
    }

    /* renamed from: b */
    public synchronized void mo127242b(AbstractC34454a aVar) {
        C34457a.m133685a().mo127254b(aVar);
    }

    /* renamed from: b */
    private boolean m133640b(OpenChat openChat) {
        boolean z;
        boolean z2;
        String a = m133639a().mo127277g().mo127412a();
        if (openChat == null || TextUtils.isEmpty(openChat.getGroupOwnerId()) || !openChat.getGroupOwnerId().equals(a)) {
            z = false;
        } else {
            z = true;
        }
        if (openChat == null || !openChat.isAdmin()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public List<IChatFunctionItem> mo127223a(Chat chat) {
        return ChatFunctionItemFactory.f89092a.mo127583a(chat);
    }

    /* renamed from: c */
    public boolean mo127244c(Chat chat) {
        if (!m133639a().mo127268a("im.chat.only.admin.can.pin.vc.buzz") || ((chat != null && chat.getBuzzPermissionSetting() != Chat.BuzzPermissionSetting.ONLY_MANAGER) || (chat != null && chat.getBuzzPermissionSetting() == Chat.BuzzPermissionSetting.ONLY_MANAGER && m133640b((OpenChat) chat)))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public Map<String, AbstractC29186b> mo127225a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("/client/chat/chatter/add_by_link", new C34988a());
        hashMap.put("/client/chat/chatter/add", new C34990b());
        hashMap.put("/client/group/apply_member_limit/open", new ApplyGroupLimitAppLinkHandler());
        return hashMap;
    }

    /* renamed from: b */
    public boolean mo127243b(Chat chat) {
        if (!m133639a().mo127268a("im.chat.only.admin.can.pin.vc.buzz") || ((chat != null && chat.getPinPermissionSetting() != Chat.PinPermissionSetting.ONLY_MANAGER) || (chat != null && chat.getPinPermissionSetting() == Chat.PinPermissionSetting.ONLY_MANAGER && m133640b((OpenChat) chat)))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo127241b(Context context, String str) {
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, ApplicantListActivity.class);
            intent.putExtra("key_params_chat_id", str);
            context.startActivity(intent);
            return;
        }
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("ApplicantListActivity").mo134930b();
        ApplicantListFragment cVar = new ApplicantListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("key_params_chat_id", str);
        cVar.setArguments(bundle);
        C36512a.m144041a().mo134762a(cVar, a);
    }

    /* renamed from: a */
    public void mo127226a(Activity activity, Chat chat) {
        C34456a.m133684b(activity, chat);
    }

    /* renamed from: a */
    public void mo127227a(Activity activity, Chat chat, int i) {
        C34456a.m133674a(activity, chat, i);
    }

    /* renamed from: a */
    public IChatFunctionController mo127222a(Activity activity, Chat chat, Chatter chatter, List<IChatFunctionItem> list) {
        return ChatFunctionController.f89013f.mo127567a(activity, chat, chatter, list);
    }

    /* renamed from: a */
    public List<IChatFunctionItem> mo127224a(ChatChatter chatChatter, ChatChatter chatChatter2, Chat chat, boolean z) {
        return ChatFunctionItemFactory.f89092a.mo127585a(chat, chatChatter, chatChatter2, z);
    }

    /* renamed from: a */
    public void mo127228a(Activity activity, Chat chat, int i, String str, int i2) {
        C34456a.m133675a(activity, chat, i, str, i2);
    }

    /* renamed from: a */
    public Intent mo127220a(Context context, String str, String str2, Team team, AvatarMeta avatarMeta, boolean z) {
        return C34456a.m133672a(context, str, str2, team, avatarMeta, z);
    }

    /* renamed from: a */
    public <VH extends RecyclerView.ViewHolder, B extends IChatFunctionBinder<VH>> IChatFunctionController mo127221a(Activity activity, Chat chat, Chatter chatter, ChatFunctionView chatFunctionView, B b, RecyclerView.LayoutManager layoutManager, List<IChatFunctionItem> list) {
        return ChatFunctionController.f89013f.mo127566a(activity, chat, chatter, chatFunctionView, b, layoutManager, list);
    }
}
