package com.bytedance.ee.bear.wiki.wikitree;

import android.content.Context;
import android.content.Intent;
import androidx.p034e.p035a.C0978a;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.c */
public class C12076c {
    /* renamed from: a */
    public static void m49997a(Context context) {
        C13479a.m54764b("Wiki_TreeSyncHelper", "treeAdded");
        C0978a.m4782a(context).mo4992a(new Intent("com.bytedance.ee.bear.wiki.treeNodeAdded"));
    }

    /* renamed from: b */
    public static void m50001b(Context context) {
        C13479a.m54764b("Wiki_TreeSyncHelper", "pageClose");
        C0978a.m4782a(context).mo4992a(new Intent("com.bytedance.ee.bear.wiki.pageclose"));
    }

    /* renamed from: a */
    public static void m49998a(Context context, String str, String str2) {
        C13479a.m54764b("Wiki_TreeSyncHelper", "treeNodeRemoved");
        Intent intent = new Intent("com.bytedance.ee.bear.wiki.treeNodeRemoved");
        intent.putExtra("extra_tree_sync_entity", TreeSyncEntity.createNodeRemovedEntity(str, str2));
        C0978a.m4782a(context).mo4992a(intent);
    }

    /* renamed from: a */
    public static void m49999a(Context context, String str, String str2, C12136e eVar) {
        C13479a.m54764b("Wiki_TreeSyncHelper", "focusChanged");
        Intent intent = new Intent("com.bytedance.ee.bear.wiki.treeFocusChanged");
        intent.putExtra("extra_tree_sync_entity", TreeSyncEntity.createFocusChangedEntity(str, str2, eVar));
        C0978a.m4782a(context).mo4992a(intent);
    }

    /* renamed from: a */
    public static void m50000a(Context context, String str, String str2, String str3) {
        C13479a.m54764b("Wiki_TreeSyncHelper", "titleChanged");
        Intent intent = new Intent("com.bytedance.ee.bear.wiki.treeTitleChanged");
        intent.putExtra("extra_tree_sync_entity", TreeSyncEntity.createTitleChangedEntity(str, str2, str3));
        C0978a.m4782a(context).mo4992a(intent);
    }
}
