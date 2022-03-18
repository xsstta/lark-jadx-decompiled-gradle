package com.ss.android.lark.search.impl.func.chatinside;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.utils.ChatParamUtils;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.DesktopConstants;
import com.ss.android.lark.desktopmode.base.DrawerParams;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceActivity;
import com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.FolderInsideSearchActivity;
import com.ss.android.lark.search.impl.func.chatinside.detail.folderinside.FolderInsideSearchFragment;
import com.ss.android.lark.searchcommon.reporter.ChatInSideContext;
import com.ss.android.lark.searchcommon.reporter.SearchOpenReporter;
import com.ss.android.lark.searchcommon.utils.SessionManager;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.a */
public class C53406a {
    /* renamed from: a */
    private static String m206800a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "none" : "link" : "image" : "file" : "docs" : "messages";
    }

    /* renamed from: a */
    private static String m206799a() {
        Chat d = ChatParamUtils.m133151d();
        if (d == null) {
            return "group";
        }
        if (d.isP2PChat()) {
            return "p2p";
        }
        if (d.isThread()) {
            return "topicGroup";
        }
        return "group";
    }

    /* renamed from: a */
    public static void m206801a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.chat.id", str);
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, FolderInsideSearchActivity.class);
            intent.putExtras(bundle);
            context.startActivity(intent);
            return;
        }
        FolderInsideSearchFragment aVar = new FolderInsideSearchFragment();
        aVar.setArguments(bundle);
        DrawerParams a = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
        aVar.setFragmentParams(a);
        C36512a.m144041a().mo134761a(aVar, a);
    }

    /* renamed from: a */
    public static void m206802a(Context context, String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("chat_id", str);
        bundle.putBoolean("is_thread", z);
        Intent intent = new Intent(context, ChatImageResourceActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m206803a(Context context, String str, boolean z, boolean z2, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("extra.chat.id", str);
        bundle.putBoolean("extra.show.file", z);
        bundle.putBoolean("extra.is.thread", z2);
        bundle.putInt("extra.select.type", i);
        SessionManager.m209247c();
        ChatInSideContext.m208822c();
        ChatInSideContext.m208819a(str);
        ChatInSideContext.m208821b(m206799a());
        SearchOpenReporter.m208864a(m206800a(i), ChatInSideContext.m208818a(), ChatInSideContext.m208820b());
        if (!DesktopUtil.m144301a(context)) {
            Intent intent = new Intent(context, ChatInsideSearchActivity.class);
            intent.setFlags(268435456);
            intent.putExtras(bundle);
            context.startActivity(intent);
            return;
        }
        C53409b bVar = new C53409b();
        bVar.setArguments(bundle);
        DrawerParams a = new DrawerParams.C36565a(DesktopConstants.UIType.DRAWER_NORMAL_C1).mo134930b();
        bVar.setFragmentParams(a);
        C36512a.m144041a().mo134761a(bVar, a);
    }
}
