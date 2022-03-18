package com.ss.android.vc.meeting.module.tab.history.mvp;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabListGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabListHistoryListEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63278a;
import com.ss.android.vc.meeting.module.tab.history.mvp.C63283b;
import com.ss.android.vc.meeting.module.tab.widgets.C63317b;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.b */
public class C63283b implements C63278a.AbstractC63279a, C63317b.AbstractC63322a, VideoChatPush.AbstractC63568h {

    /* renamed from: a */
    public String f159627a = "";

    /* renamed from: b */
    public String f159628b = "";

    /* renamed from: c */
    public boolean f159629c = true;

    /* renamed from: d */
    public final List<VCTabListItem> f159630d = new ArrayList();

    /* renamed from: e */
    private C63278a.AbstractC63281b f159631e;

    /* renamed from: f */
    private final long f159632f = 50;

    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63568h
    /* renamed from: a */
    public void mo211349a(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
    }

    @Override // com.ss.android.vc.meeting.module.tab.widgets.C63317b.AbstractC63322a
    /* renamed from: c */
    public void mo219015c() {
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63279a
    /* renamed from: a */
    public List<VCTabListItem> mo218997a() {
        return this.f159630d;
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63279a
    /* renamed from: b */
    public boolean mo219000b() {
        return this.f159629c;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m247868e() {
        C63278a.AbstractC63281b bVar = this.f159631e;
        if (bVar != null) {
            bVar.mo219009a(this.f159630d);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[create]", "create");
        C63317b.m248020b().mo219100a(this);
        VideoChatPush.m249004a().mo219716a(this);
    }

    @Override // com.ss.android.vc.meeting.module.tab.widgets.C63317b.AbstractC63322a
    /* renamed from: d */
    public void mo219016d() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[onOpenError]", "onOpenError");
        C63278a.AbstractC63281b bVar = this.f159631e;
        if (bVar != null) {
            bVar.mo219010b();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[destroy]", "destroy");
        C63317b.m248020b().mo219105c();
        VideoChatPush.m249004a().mo219739b(this);
        this.f159631e = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.tab.history.mvp.b$a */
    public class C63285a implements Comparator<VCTabListItem> {
        private C63285a() {
        }

        /* renamed from: a */
        public int compare(VCTabListItem vCTabListItem, VCTabListItem vCTabListItem2) {
            return vCTabListItem2.getHistoryId().compareTo(vCTabListItem.getHistoryId());
        }
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63279a
    /* renamed from: a */
    public void mo218998a(C63278a.AbstractC63281b bVar) {
        this.f159631e = bVar;
    }

    @Override // com.ss.android.vc.meeting.module.tab.widgets.C63317b.AbstractC63322a
    /* renamed from: b */
    public void mo219014b(List<GrootCell> list) {
        C60735ab.m236013c(new Runnable(list) {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$b$qaZ98UOJVlNqR77eW5T9o3n3Kk */
            public final /* synthetic */ List f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C63283b.m271436lambda$qaZ98UOJVlNqR77eW5T9o3n3Kk(C63283b.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public void mo219013a(List<VCTabListItem> list) {
        if (!CollectionUtils.isEmpty(list)) {
            Collections.sort(list, new C63285a());
        }
    }

    /* renamed from: a */
    private VCTabListItem m247865a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (int i = 0; i < this.f159630d.size(); i++) {
            VCTabListItem vCTabListItem = this.f159630d.get(i);
            if (vCTabListItem != null && vCTabListItem.getHistoryId().equals(str)) {
                return vCTabListItem;
            }
        }
        return null;
    }

    /* renamed from: e */
    private void m247869e(List<String> list) {
        VCTabListItem a;
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[doDelete]", "items= " + list.size());
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && (a = m247865a(str)) != null) {
                this.f159630d.remove(a);
            }
        }
    }

    /* renamed from: c */
    private void m247866c(List<VCTabListItem> list) {
        boolean z;
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[doInsert]", "items size= " + list.size());
        for (VCTabListItem vCTabListItem : list) {
            int i = 0;
            while (true) {
                if (i >= this.f159630d.size()) {
                    z = false;
                    break;
                }
                VCTabListItem vCTabListItem2 = this.f159630d.get(i);
                if (vCTabListItem2 != null && vCTabListItem2.getHistoryId().equals(vCTabListItem.getHistoryId())) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                this.f159630d.add(0, vCTabListItem);
            }
        }
    }

    /* renamed from: d */
    private void m247867d(List<VCTabListItem> list) {
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[doUpdate]", "items size= " + list.size());
        for (VCTabListItem vCTabListItem : list) {
            boolean z = false;
            for (int i = 0; i < this.f159630d.size(); i++) {
                VCTabListItem vCTabListItem2 = this.f159630d.get(i);
                if (vCTabListItem2 != null && vCTabListItem2.getHistoryId().equals(vCTabListItem.getHistoryId())) {
                    this.f159630d.remove(vCTabListItem2);
                    this.f159630d.add(i, vCTabListItem);
                    z = true;
                }
            }
            if (!z) {
                this.f159630d.add(vCTabListItem);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m247870f(List list) {
        C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[onPushHistoryListCells]", "process cells");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VCTabListGrootCellPayload vCTabListGrootCellPayload = ((GrootCell) it.next()).vcTabListHistoryChangeInfo;
            if (vCTabListGrootCellPayload != null) {
                if (!CollectionUtils.isEmpty(vCTabListGrootCellPayload.getDeleteHistoryIds())) {
                    m247869e(vCTabListGrootCellPayload.getDeleteHistoryIds());
                }
                if (!CollectionUtils.isEmpty(vCTabListGrootCellPayload.getInsertTopItems())) {
                    m247866c(vCTabListGrootCellPayload.getInsertTopItems());
                }
                if (!CollectionUtils.isEmpty(vCTabListGrootCellPayload.getUpdateItems())) {
                    m247867d(vCTabListGrootCellPayload.getUpdateItems());
                }
                mo219013a(this.f159630d);
                int size = this.f159630d.size();
                if (size > 0) {
                    String historyId = this.f159630d.get(0).getHistoryId();
                    if (!TextUtils.isEmpty(historyId) && historyId.compareTo(this.f159627a) > 0) {
                        this.f159627a = historyId;
                    }
                    String historyId2 = this.f159630d.get(size - 1).getHistoryId();
                    if (!TextUtils.isEmpty(historyId2) && historyId2.compareTo(this.f159628b) < 0) {
                        this.f159628b = historyId2;
                    }
                }
            }
        }
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$b$XuE_wx0oQgUBHqb17uc5ibwLsMM */

            public final void run() {
                C63283b.lambda$XuE_wx0oQgUBHqb17uc5ibwLsMM(C63283b.this);
            }
        });
    }

    @Override // com.ss.android.vc.meeting.module.tab.history.mvp.C63278a.AbstractC63279a
    /* renamed from: a */
    public void mo218999a(final boolean z, final boolean z2, final C63278a.AbstractC63279a.AbstractC63280a<VCTabListHistoryListEntity> aVar) {
        final String str;
        if (aVar != null) {
            aVar.mo219001a();
        }
        if (z2) {
            str = this.f159628b;
        } else {
            str = null;
        }
        VcBizService.getVCTabListHistory(str, 50L, false, new AbstractC63598b() {
            /* class com.ss.android.vc.meeting.module.tab.history.mvp.C63283b.C632841 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onSuccess(Object obj) {
                C60735ab.m236013c(new Runnable(obj, z2, z, str, aVar) {
                    /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$b$1$1CRMf4UNa2_clSWWLtw7OdGEb5g */
                    public final /* synthetic */ Object f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ boolean f$3;
                    public final /* synthetic */ String f$4;
                    public final /* synthetic */ C63278a.AbstractC63279a.AbstractC63280a f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    public final void run() {
                        C63283b.C632841.lambda$1CRMf4UNa2_clSWWLtw7OdGEb5g(C63283b.C632841.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                    }
                });
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_VCTabHistoryModel", "[getVCTabListHistory2]", "onError: " + eVar.mo219902b());
                C60735ab.m236001a(new Runnable(eVar) {
                    /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$b$1$WJOraAGWxyLfzjAAg87ENasR1Io */
                    public final /* synthetic */ C63602e f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C63283b.C632841.lambda$WJOraAGWxyLfzjAAg87ENasR1Io(C63278a.AbstractC63279a.AbstractC63280a.this, this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m247880a(C63278a.AbstractC63279a.AbstractC63280a aVar, VCTabListHistoryListEntity vCTabListHistoryListEntity) {
                if (aVar != null) {
                    aVar.mo219003a(vCTabListHistoryListEntity);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ void m247881a(C63278a.AbstractC63279a.AbstractC63280a aVar, C63602e eVar) {
                if (aVar != null) {
                    aVar.mo219002a(eVar);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m247882a(Object obj, boolean z, boolean z2, String str, C63278a.AbstractC63279a.AbstractC63280a aVar) {
                VCTabListHistoryListEntity vCTabListHistoryListEntity = (VCTabListHistoryListEntity) obj;
                C60700b.m235851b("VideoChatTab_VCTabHistoryModel", "[getVCTabListHistory]", "onSuccess entity= " + vCTabListHistoryListEntity.toString());
                C63283b.this.f159629c = vCTabListHistoryListEntity.hasMore;
                if (!z || CollectionUtils.isEmpty(C63283b.this.f159630d)) {
                    C63283b.this.f159630d.clear();
                    C63283b.this.f159630d.addAll(vCTabListHistoryListEntity.getTabListItems());
                } else {
                    C63283b.this.f159630d.addAll(vCTabListHistoryListEntity.getTabListItems());
                }
                C63283b bVar = C63283b.this;
                bVar.mo219013a(bVar.f159630d);
                int size = C63283b.this.f159630d.size();
                if (size > 0) {
                    String historyId = C63283b.this.f159630d.get(0).getHistoryId();
                    String historyId2 = C63283b.this.f159630d.get(size - 1).getHistoryId();
                    if (z2 || TextUtils.isEmpty(str)) {
                        C63283b.this.f159627a = historyId;
                        C63283b.this.f159628b = historyId2;
                    } else {
                        if (!TextUtils.isEmpty(historyId) && historyId.compareTo(C63283b.this.f159627a) > 0) {
                            C63283b.this.f159627a = historyId;
                        }
                        if (!TextUtils.isEmpty(historyId2) && historyId2.compareTo(C63283b.this.f159628b) < 0) {
                            C63283b.this.f159628b = historyId2;
                        }
                    }
                }
                C63317b.m248020b().mo219100a(C63283b.this);
                C63317b.m248020b().mo219099a(vCTabListHistoryListEntity.downVersion);
                C60735ab.m236001a(new Runnable(vCTabListHistoryListEntity) {
                    /* class com.ss.android.vc.meeting.module.tab.history.mvp.$$Lambda$b$1$ZIwZIklyVasGQWbneKTGCxSLfLk */
                    public final /* synthetic */ VCTabListHistoryListEntity f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C63283b.C632841.lambda$ZIwZIklyVasGQWbneKTGCxSLfLk(C63278a.AbstractC63279a.AbstractC63280a.this, this.f$1);
                    }
                });
            }
        }, true);
    }
}
