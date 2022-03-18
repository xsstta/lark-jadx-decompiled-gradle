package com.bytedance.ee.bear.wiki.wikitree;

import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12136e;
import java.io.Serializable;

public class TreeSyncEntity implements Serializable {
    private String mAction;
    private String mNewTitle;
    private C12136e mSpaceCore;
    private String mSpaceId;
    private String mWikiToken;

    public String getAction() {
        return this.mAction;
    }

    public String getNewTitle() {
        return this.mNewTitle;
    }

    public C12136e getSpaceCore() {
        return this.mSpaceCore;
    }

    public String getSpaceId() {
        return this.mSpaceId;
    }

    public String getWikiToken() {
        return this.mWikiToken;
    }

    public static TreeSyncEntity createNodeRemovedEntity(String str, String str2) {
        return new TreeSyncEntity("com.bytedance.ee.bear.wiki.treeNodeRemoved", str, str2, null, null);
    }

    public static TreeSyncEntity createFocusChangedEntity(String str, String str2, C12136e eVar) {
        return new TreeSyncEntity("com.bytedance.ee.bear.wiki.treeFocusChanged", str, str2, null, eVar);
    }

    public static TreeSyncEntity createTitleChangedEntity(String str, String str2, String str3) {
        return new TreeSyncEntity("com.bytedance.ee.bear.wiki.treeTitleChanged", str, str2, str3, null);
    }

    public TreeSyncEntity(String str, String str2, String str3, String str4, C12136e eVar) {
        this.mAction = str;
        this.mSpaceId = str2;
        this.mWikiToken = str3;
        this.mNewTitle = str4;
        this.mSpaceCore = eVar;
    }
}
