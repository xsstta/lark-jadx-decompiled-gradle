package com.ss.android.vc.meeting.module.tab3.list.view;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.ui.p1198b.AbstractC26197e;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.tab.VCMeetingJoinInfoEntity;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.entity.tab.VCTabMeetingJoinInfo;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.utils.MeetingListUtil;
import com.ss.android.vc.meeting.module.tab3.list.view.MeetingListView;
import com.ss.android.vc.meeting.module.tab3.list.view.p3177b.AbstractC63411a;
import com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63415c;
import com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63425d;
import com.ss.android.vc.meeting.module.tab3.list.view.p3177b.C63431e;
import com.ss.android.vc.meeting.module.tab3.list.view.utils.DataUtil;
import com.ss.android.vc.meeting.module.tab3.widgets.C63436a;
import com.ss.android.vc.meeting.module.tab3.widgets.StickyHeaderView;
import com.ss.android.vc.meeting.module.tab3.widgets.StickyRecyclerView;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.statistics.event2.VCTabEvent3;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.a */
public class C63404a extends LarkRecyclerViewBaseAdapter<AbstractC63411a, VCTabListItem> implements AbstractC26197e<RecyclerView.ViewHolder>, VideoChatPush.AbstractC63568h {

    /* renamed from: a */
    public VCTabMeetingJoinInfo f160093a;

    /* renamed from: b */
    private String f160094b;

    /* renamed from: c */
    private String f160095c;

    /* renamed from: d */
    private boolean f160096d;

    /* renamed from: e */
    private MeetingListView.AbstractC63402a f160097e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter
    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public void mo219412a(List<VCTabListItem> list, boolean z, String str) {
        this.f160096d = z;
        this.f160095c = str;
        m248449a();
        resetAll(list);
    }

    /* renamed from: a */
    public void mo219411a(List<VCTabListItem> list, boolean z) {
        this.f160096d = z;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            VCTabListItem vCTabListItem = (VCTabListItem) this.items.get(size);
            if (vCTabListItem.isUpcoming()) {
                this.items.remove(vCTabListItem);
            }
        }
        this.items.addAll(0, list);
        MeetingListUtil.f160042a.mo219356a(this.items);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m248449a() {
        VcBizService.getVCMeetingJoinStatus(new AbstractC63598b<VCMeetingJoinInfoEntity>() {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634051 */

            /* renamed from: a */
            public void onSuccess(VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
                if (vCMeetingJoinInfoEntity != null) {
                    C63404a.this.f160093a = vCMeetingJoinInfoEntity.joinInfo;
                }
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("VideoChatTab_MeetingListAdapter", "[getVCMeetingJoinStatus]", "fail" + eVar.toString());
            }
        });
    }

    /* renamed from: com.ss.android.vc.meeting.module.tab3.list.view.a$4 */
    static /* synthetic */ class C634084 {

        /* renamed from: a */
        static final /* synthetic */ int[] f160102a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus[] r0 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634084.f160102a = r0
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_UPCOMING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634084.f160102a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_ON_THE_CALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634084.f160102a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634084.f160102a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.tab.VCTabListItem$MeetingStatus r1 = com.ss.android.vc.entity.tab.VCTabListItem.MeetingStatus.MEETING_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634084.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo219409a(String str) {
        this.f160094b = str;
    }

    public C63404a(MeetingListView.AbstractC63402a aVar) {
        VideoChatPush.m249004a().mo219716a(this);
        this.f160097e = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return ((VCTabListItem) getItem(i)).getMeetingStatus().getNumber();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        VideoChatPush.m249004a().mo219739b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248450a(View view) {
        VCTabEvent3.f160816b.mo220252a("upcoming_view_more", "cal_calendar_main_view", (Map<String, String>) null);
        VideoChatModuleDependency.getDependency().getCalendarDependency().openCalendarTab(ar.m236694a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m248451a(AbstractC63411a aVar) {
        C63436a.m248525a().mo219464a(aVar.itemView);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public long mo93176a(int i) {
        int number;
        int i2 = C634084.f160102a[((VCTabListItem) getItem(i)).getMeetingStatus().ordinal()];
        if (i2 == 1) {
            number = VCTabListItem.MeetingStatus.MEETING_UPCOMING.getNumber();
        } else if (i2 != 2) {
            number = VCTabListItem.MeetingStatus.MEETING_END.getNumber();
        } else {
            number = VCTabListItem.MeetingStatus.MEETING_ON_THE_CALL.getNumber();
        }
        return (long) number;
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo93177a(ViewGroup viewGroup) {
        StickyHeaderView stickyHeaderView = new StickyHeaderView(viewGroup.getContext());
        stickyHeaderView.setParent((StickyRecyclerView) viewGroup);
        return new RecyclerView.ViewHolder(stickyHeaderView) {
            /* class com.ss.android.vc.meeting.module.tab3.list.view.C63404a.C634062 */
        };
    }

    @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63568h
    /* renamed from: a */
    public void mo211349a(final VCMeetingJoinInfoEntity vCMeetingJoinInfoEntity) {
        if (vCMeetingJoinInfoEntity != null && vCMeetingJoinInfoEntity.joinInfo != null && !TextUtils.isEmpty(vCMeetingJoinInfoEntity.joinInfo.getMeetingId())) {
            this.f160093a = vCMeetingJoinInfoEntity.joinInfo;
            C60735ab.m236001a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.C63404a.RunnableC634073 */

                public void run() {
                    for (VCTabListItem vCTabListItem : C63404a.this.items) {
                        if (TextUtils.equals(vCMeetingJoinInfoEntity.joinInfo.getMeetingId(), vCTabListItem.getMeetingId())) {
                            C63404a.this.notifyDataSetChanged();
                            return;
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo219410a(List<VCTabListItem> list) {
        this.items.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public AbstractC63411a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C63431e.m248500a(viewGroup, i);
    }

    @Override // com.larksuite.framework.ui.p1198b.AbstractC26197e
    /* renamed from: a */
    public void mo93178a(RecyclerView.ViewHolder viewHolder, int i) {
        StickyHeaderView stickyHeaderView = (StickyHeaderView) viewHolder.itemView;
        int i2 = C634084.f160102a[((VCTabListItem) getItem(i)).getMeetingStatus().ordinal()];
        if (i2 == 1) {
            stickyHeaderView.mo219461a(this.f160096d);
            stickyHeaderView.setOnMoreListener($$Lambda$a$8hYkJ0qUCtGOJwuMf6tZOJULe7g.INSTANCE);
        } else if (i2 != 2) {
            stickyHeaderView.mo219458a();
        } else {
            stickyHeaderView.mo219459a(i);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC63411a aVar, int i) {
        if (aVar instanceof C63415c) {
            ((C63415c) aVar).mo219425a((VCTabListItem) getItem(i), this.f160094b, this.f160093a);
        } else if (aVar instanceof C63425d) {
            C63425d dVar = (C63425d) aVar;
            dVar.mo219433a((VCTabListItem) getItem(i), this.f160094b, this.f160095c);
            dVar.mo219434a(this.f160097e);
        } else {
            aVar.mo219422a((VCTabListItem) getItem(i), this.f160094b);
        }
        if (i == 0) {
            C60735ab.m236002a(new Runnable() {
                /* class com.ss.android.vc.meeting.module.tab3.list.view.$$Lambda$a$sk5ugZWWlUOf0Mb2m1FC13wrPJw */

                public final void run() {
                    C63404a.m248451a(AbstractC63411a.this);
                }
            }, 300);
        }
        int i2 = 8;
        if (((VCTabListItem) getItem(i)).isHistory()) {
            aVar.mo219421a().setVisibility(8);
            return;
        }
        if (DataUtil.f160103a.mo219415a(getItems(), i)) {
            i2 = 0;
        }
        aVar.mo219421a().setVisibility(i2);
    }
}
