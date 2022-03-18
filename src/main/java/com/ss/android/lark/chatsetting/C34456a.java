package com.ss.android.lark.chatsetting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chatsetting.impl.group.avatar.AvatarEditActivity;
import com.ss.android.lark.chatsetting.impl.group.info.edit.C34652e;
import com.ss.android.lark.chatsetting.impl.group.info.edit.LarkGroupInfoEditActivity;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeActivity;
import com.ss.android.lark.chatsetting.impl.group.info.qrcode.GroupQRCodeFragment;
import com.ss.android.lark.chatsetting.impl.group.info.time.GroupShareTimeActivity;
import com.ss.android.lark.chatsetting.impl.group.info.time.GroupShareTimeFragment;
import com.ss.android.lark.chatsetting.impl.group.ownership.memberlimit.ApplyGroupMemberLimitActivity;
import com.ss.android.lark.chatsetting.impl.group.setting.C34937a;
import com.ss.android.lark.chatsetting.impl.group.setting.ChatGroupSettingActivity;
import com.ss.android.lark.chatsetting.impl.group.share.C34992c;
import com.ss.android.lark.chatsetting.impl.group.share.GroupShareActivity;
import com.ss.android.lark.chatsetting.impl.p2p.C35018a;
import com.ss.android.lark.chatsetting.impl.p2p.ChatP2pSettingActivity;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.base.FloatWindowParams;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.team.entity.Team;

/* renamed from: com.ss.android.lark.chatsetting.a */
public class C34456a {
    /* renamed from: a */
    public static void m133682a(Context context, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        Bundle a = m133673a(str, i, z, z2, z3, z4, str2);
        if (DesktopUtil.m144301a(context)) {
            C34937a aVar = new C34937a();
            aVar.setArguments(a);
            DrawerParams a2 = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_MAX_C2).mo134930b();
            aVar.setFragmentParams(a2);
            C36512a.m144041a().mo134761a(aVar, a2);
            return;
        }
        Intent intent = new Intent(context, ChatGroupSettingActivity.class);
        intent.putExtras(a);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m133681a(Context context, C36516a aVar, String str, int i, boolean z, int i2, String str2) {
        if (!(context instanceof Activity)) {
            m133682a(context, str, i, z, false, false, false, str2);
            return;
        }
        Bundle a = m133673a(str, i, z, false, false, false, str2);
        if (DesktopUtil.m144301a(context)) {
            C34937a aVar2 = new C34937a();
            aVar2.setArguments(a);
            DrawerParams a2 = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_MAX_C2).mo134930b();
            aVar2.setFragmentParams(a2);
            C36512a.m144041a().mo134759a(aVar, aVar2, a2, i2);
            return;
        }
        Intent intent = new Intent(context, ChatGroupSettingActivity.class);
        intent.putExtras(a);
        ((Activity) context).startActivityForResult(intent, i2);
    }

    /* renamed from: a */
    public static void m133679a(Context context, Chat chat) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("extra_key_chat", chat);
        if (DesktopUtil.m144301a(context)) {
            FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("LarkGroupInfoActivity").mo134930b();
            GroupQRCodeFragment groupQRCodeFragment = new GroupQRCodeFragment();
            groupQRCodeFragment.setArguments(bundle);
            C36512a.m144041a().mo134762a(groupQRCodeFragment, a);
            return;
        }
        context.startActivity(new Intent(context, GroupQRCodeActivity.class).putExtras(bundle));
    }

    /* renamed from: a */
    public static void m133680a(Context context, Chat chat, int i, String str) {
        Bundle b = m133683b(context, chat, i, str);
        if (DesktopUtil.m144301a(context)) {
            C34992c cVar = new C34992c();
            cVar.setArguments(b);
            C36512a.m144041a().mo134762a(cVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("GroupShareFragment").mo134930b());
            return;
        }
        Intent intent = new Intent(context, GroupShareActivity.class);
        intent.putExtras(b);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m133678a(Activity activity, C36516a aVar, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("key_params_chat_id", str);
        bundle.putString("key_params_share_source", str2);
        if (DesktopUtil.m144301a((Context) activity)) {
            GroupShareTimeFragment cVar = new GroupShareTimeFragment();
            cVar.setArguments(bundle);
            C36512a.m144041a().mo134760a(aVar, cVar, new FloatWindowParams.C36567a().mo134945a("GroupShareTimeFragment").mo134930b(), 2020);
            return;
        }
        Intent intent = new Intent(activity, GroupShareTimeActivity.class);
        intent.putExtras(bundle);
        aVar.startActivityForResult(intent, 2020);
    }

    /* renamed from: b */
    public static void m133684b(Context context, Chat chat) {
        Intent intent = new Intent(context, ApplyGroupMemberLimitActivity.class);
        intent.putExtra("applyGroupMemberLimitActivity:key:chat", chat);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m133674a(Activity activity, Chat chat, int i) {
        if (chat.isSecret() || !chat.isCrossTenant()) {
            ChatSettingModule.m133639a().mo127281k().mo127400a(activity, chat, chat.isEdu(), i, "section_add_mobile");
        } else {
            m133680a(activity, chat, 2, "section_add_mobile");
        }
    }

    /* renamed from: b */
    public static Bundle m133683b(Context context, Chat chat, int i, String str) {
        int i2;
        Bundle bundle = new Bundle();
        bundle.putInt("extra_key_contact_mode", i);
        bundle.putSerializable("extra_key_chat", chat);
        if (chat.isThread()) {
            i2 = R.string.Lark_Groups_ShareCircle;
        } else {
            i2 = R.string.Lark_Legacy_ShareGroup;
        }
        if (i != 1) {
            i2 = R.string.Lark_Legacy_AddContactNow;
        }
        bundle.putString("extra_key_title", UIUtils.getString(context, i2));
        bundle.putString("extra_key_source", str);
        return bundle;
    }

    /* renamed from: a */
    public static void m133675a(Activity activity, Chat chat, int i, String str, int i2) {
        Bundle b = m133683b(activity, chat, i, str);
        if (DesktopUtil.m144301a((Context) activity)) {
            C34992c cVar = new C34992c();
            cVar.setArguments(b);
            C36512a.m144041a().mo134762a(cVar, new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("GroupShareFragment").mo134930b());
            return;
        }
        Intent intent = new Intent(activity, GroupShareActivity.class);
        intent.putExtras(b);
        activity.startActivityForResult(intent, i2);
    }

    /* renamed from: a */
    public static void m133677a(Activity activity, C36516a aVar, String str, int i, String str2) {
        if (!DesktopUtil.m144301a((Context) activity)) {
            Intent intent = new Intent(activity, LarkGroupInfoEditActivity.class);
            intent.putExtra("chatID", str).putExtra("edit_info_type", i).putExtra("nickname", str2);
            activity.startActivityForResult(intent, 10004);
            return;
        }
        FloatWindowParams a = new FloatWindowParams.C36567a(DesktopConstants.UIType.FLOAT_MODAL_THIN_M2).mo134945a("LarkGroupInfoActivity").mo134930b();
        C34652e eVar = new C34652e();
        Bundle bundle = new Bundle();
        bundle.putString("chatID", str);
        bundle.putInt("edit_info_type", i);
        bundle.putString("nickname", str2);
        eVar.setArguments(bundle);
        C36512a.m144041a().mo134760a(aVar, eVar, a, 10004);
    }

    /* renamed from: a */
    public static Intent m133672a(Context context, String str, String str2, Team team, AvatarMeta avatarMeta, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("intent_avatar_key", str);
        bundle.putString("intent_team_name", str2);
        bundle.putSerializable("intent_team", team);
        bundle.putSerializable("intent_avatar_meta", avatarMeta);
        bundle.putInt("intent_avatar_edit_type", z ? 1 : 0);
        Intent intent = new Intent(context, AvatarEditActivity.class);
        intent.putExtras(bundle);
        return intent;
    }

    /* renamed from: a */
    private static Bundle m133673a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("chatID", str);
        bundle.putInt("calendar_meeting_setting_role", i);
        bundle.putBoolean("key_params_is_oncall", z);
        bundle.putBoolean("key_params_is_group_observer", z2);
        bundle.putBoolean("key_params_is_default_group", z3);
        bundle.putBoolean("key_params_is_from_topic_tab", z4);
        bundle.putString("key_params_source_to_setting", str2);
        return bundle;
    }

    /* renamed from: a */
    public static void m133676a(Activity activity, C36516a aVar, Chat chat, Chatter chatter, int i, int i2, String str) {
        if (chatter != null && chat != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("chatter_info", chatter);
            bundle.putSerializable("key_chat", chat);
            bundle.putInt("key_params_hide_setting_item", i);
            bundle.putString("key_params_source_to_setting", str);
            if (DesktopUtil.m144301a((Context) activity)) {
                C35018a aVar2 = new C35018a();
                aVar2.setArguments(bundle);
                DrawerParams a = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
                aVar2.setFragmentParams(a);
                C36512a.m144041a().mo134759a(aVar, aVar2, a, i2);
                return;
            }
            Intent intent = new Intent(activity, ChatP2pSettingActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, i2);
        }
    }
}
