package com.bytedance.ee.bear.wiki.wikitree;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import androidx.p034e.p035a.C0978a;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p716r.C13721c;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.h */
public class C12113h extends AbstractC1142af implements AbstractC12148g {
    private C0978a mLocalBroadcastManager;
    public AbstractC12115a mOnClosePageListener;
    public AbstractC12116b mOnTreeDataChangedListener;
    private BroadcastReceiver mReceiver;
    public String mSpaceId = "";
    private C1177w<TreeSyncEntity> mTreeSyncEntityLiveData = new C1177w<>();
    public String mWikiToken = "";

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.h$a */
    public interface AbstractC12115a {
        void onClosePage();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.h$b */
    public interface AbstractC12116b {
        void onTreeDataChanged(TreeSyncEntity treeSyncEntity);
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g
    public String getSpaceId() {
        return this.mSpaceId;
    }

    public C1177w<TreeSyncEntity> getTreeSyncEntityLiveData() {
        return this.mTreeSyncEntityLiveData;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g
    public String getWikiToken() {
        return this.mWikiToken;
    }

    public void unRegisterTreeDataChange() {
        BroadcastReceiver broadcastReceiver;
        C0978a aVar = this.mLocalBroadcastManager;
        if (aVar != null && (broadcastReceiver = this.mReceiver) != null) {
            aVar.mo4990a(broadcastReceiver);
        }
    }

    public void setOnClosePageListener(AbstractC12115a aVar) {
        this.mOnClosePageListener = aVar;
    }

    public void setOnTreeDataChangedListener(AbstractC12116b bVar) {
        this.mOnTreeDataChangedListener = bVar;
    }

    public void setSpaceId(String str) {
        this.mSpaceId = str;
    }

    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12148g
    public void setWikiToken(String str) {
        this.mWikiToken = str;
    }

    public void registerTreeDataChange(Context context) {
        if (this.mLocalBroadcastManager == null) {
            this.mLocalBroadcastManager = C0978a.m4782a(context);
        }
        if (this.mReceiver == null) {
            this.mReceiver = new BroadcastReceiver() {
                /* class com.bytedance.ee.bear.wiki.wikitree.C12113h.C121141 */

                public void onReceive(Context context, Intent intent) {
                    if (intent == null) {
                        C13479a.m54764b("WikiTreeHomeViewModel", "receive tree data change, check failed, ignore this event");
                    } else if (TextUtils.equals(intent.getAction(), "com.bytedance.ee.bear.wiki.pageclose")) {
                        C13479a.m54764b("WikiTreeHomeViewModel", "receive close page");
                        if (C12113h.this.mOnClosePageListener != null) {
                            C12113h.this.mOnClosePageListener.onClosePage();
                        }
                    } else {
                        TreeSyncEntity treeSyncEntity = (TreeSyncEntity) intent.getSerializableExtra("extra_tree_sync_entity");
                        if (treeSyncEntity == null) {
                            C13479a.m54764b("WikiTreeHomeViewModel", "receive tree data change, entity == null");
                            return;
                        }
                        C13479a.m54764b("WikiTreeHomeViewModel", "mSpaceId " + C12113h.this.mSpaceId + "; getSpaceId " + C13721c.m55650d(treeSyncEntity.getSpaceId()));
                        if (TextUtils.isEmpty(treeSyncEntity.getSpaceId())) {
                            C13479a.m54764b("WikiTreeHomeViewModel", "receive tree data change, space is empty");
                        } else if (!TextUtils.equals(C12113h.this.mSpaceId, treeSyncEntity.getSpaceId())) {
                            C13479a.m54764b("WikiTreeHomeViewModel", "receive tree data change, space changed");
                        } else {
                            String action = intent.getAction();
                            if (TextUtils.equals(action, "com.bytedance.ee.bear.wiki.treeFocusChanged")) {
                                C13479a.m54764b("WikiTreeHomeViewModel", "receive tree change");
                                if (TextUtils.isEmpty(treeSyncEntity.getWikiToken()) || TextUtils.equals(treeSyncEntity.getWikiToken(), C12113h.this.mWikiToken)) {
                                    C13479a.m54758a("WikiTreeHomeViewModel", "ignore tree focus changed");
                                    return;
                                }
                                C12113h.this.setWikiToken(treeSyncEntity.getWikiToken());
                                if (C12113h.this.mOnTreeDataChangedListener != null) {
                                    C12113h.this.mOnTreeDataChangedListener.onTreeDataChanged(treeSyncEntity);
                                }
                            } else if (TextUtils.equals(action, "com.bytedance.ee.bear.wiki.treeTitleChanged")) {
                                C13479a.m54764b("WikiTreeHomeViewModel", "receive tree title change");
                                if (C12113h.this.mOnTreeDataChangedListener != null) {
                                    C12113h.this.mOnTreeDataChangedListener.onTreeDataChanged(treeSyncEntity);
                                }
                            } else if (TextUtils.equals(action, "com.bytedance.ee.bear.wiki.treeNodeRemoved")) {
                                C13479a.m54764b("WikiTreeHomeViewModel", "receive tree node removed");
                                if (C12113h.this.mOnTreeDataChangedListener != null) {
                                    C12113h.this.mOnTreeDataChangedListener.onTreeDataChanged(treeSyncEntity);
                                }
                            } else {
                                C13479a.m54764b("WikiTreeHomeViewModel", "receive tree data change, token is equals, ignore");
                            }
                        }
                    }
                }
            };
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.bytedance.ee.bear.wiki.treeFocusChanged");
        intentFilter.addAction("com.bytedance.ee.bear.wiki.treeTitleChanged");
        intentFilter.addAction("com.bytedance.ee.bear.wiki.treeNodeRemoved");
        intentFilter.addAction("com.bytedance.ee.bear.wiki.pageclose");
        this.mLocalBroadcastManager.mo4991a(this.mReceiver, intentFilter);
    }
}
