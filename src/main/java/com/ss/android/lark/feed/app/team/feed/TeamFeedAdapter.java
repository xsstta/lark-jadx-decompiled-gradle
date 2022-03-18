package com.ss.android.lark.feed.app.team.feed;

import android.view.ViewGroup;
import com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23274g;
import com.h6ah4i.android.widget.advrecyclerview.expandable.RecyclerViewExpandableItemManager;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.AbstractC23277a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23278b;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23279c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.p1008a.C23280d;
import com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a;
import com.larksuite.framework.utils.C26256ah;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.entity.C37878g;
import com.ss.android.lark.feed.app.team.widget.BaseTeamChatViewHolder;
import com.ss.android.lark.feed.app.team.widget.C37894d;
import com.ss.android.lark.feed.app.team.widget.C37898e;
import com.ss.android.lark.feed.app.team.widget.C37899f;
import com.ss.android.lark.feed.app.team.widget.C37904g;
import com.ss.android.lark.feed.app.team.widget.TeamHiddenChatBinder;
import com.ss.android.lark.feed.app.team.widget.TeamHiddenChatViewHolder;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.team.entity.Team;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004:\u0001fB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0%H\u0002J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!H\u0016J\u0018\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0016J\u0018\u0010*\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0016J\b\u0010+\u001a\u00020!H\u0016J\u0010\u0010,\u001a\u00020\r2\u0006\u0010'\u001a\u00020!H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010'\u001a\u00020!H\u0016J\u0010\u0010/\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0002J\u0010\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\rH\u0002J\u0010\u00102\u001a\u00020\r2\u0006\u00103\u001a\u00020\nH\u0002J\u000e\u00104\u001a\u00020!2\u0006\u00101\u001a\u00020\rJ\u0018\u00105\u001a\u00020.2\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0002J\u0010\u00106\u001a\u00020.2\u0006\u0010'\u001a\u00020!H\u0002J\u0010\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020\nH\u0002J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020!J(\u0010=\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010?\u001a\u00020!H\u0016J \u0010@\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010'\u001a\u00020!2\u0006\u0010?\u001a\u00020!H\u0016J\u000e\u0010A\u001a\u00020:2\u0006\u00108\u001a\u00020\nJ0\u0010B\u001a\u00020.2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010'\u001a\u00020!2\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020!2\u0006\u0010E\u001a\u00020.H\u0016J\u0018\u0010F\u001a\u00020\u00032\u0006\u0010G\u001a\u00020H2\u0006\u0010?\u001a\u00020!H\u0016J\u0018\u0010I\u001a\u00020\u00022\u0006\u0010G\u001a\u00020H2\u0006\u0010?\u001a\u00020!H\u0016J2\u0010J\u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020!H\u0016J(\u0010K\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010'\u001a\u00020!2\u0006\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020!H\u0016J\u0018\u0010L\u001a\u00020.2\u0006\u0010'\u001a\u00020!2\u0006\u0010M\u001a\u00020.H\u0016J\"\u0010L\u001a\u00020.2\u0006\u0010'\u001a\u00020!2\u0006\u0010M\u001a\u00020.2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0018\u0010P\u001a\u00020.2\u0006\u0010'\u001a\u00020!2\u0006\u0010M\u001a\u00020.H\u0016J\"\u0010P\u001a\u00020.2\u0006\u0010'\u001a\u00020!2\u0006\u0010M\u001a\u00020.2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u0016\u0010Q\u001a\u00020:2\u0006\u00101\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#J\u000e\u0010R\u001a\u00020:2\u0006\u00101\u001a\u00020\rJ(\u0010S\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010T\u001a\u00020!H\u0016J \u0010U\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010'\u001a\u00020!2\u0006\u0010T\u001a\u00020!H\u0016J*\u0010V\u001a\u00020W2\b\u0010>\u001a\u0004\u0018\u00010\u00032\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010X\u001a\u00020!H\u0016J \u0010Y\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00032\u0006\u0010'\u001a\u00020!2\u0006\u0010)\u001a\u00020!H\u0016J\"\u0010Z\u001a\u00020W2\b\u0010>\u001a\u0004\u0018\u00010\u00022\u0006\u0010'\u001a\u00020!2\u0006\u0010X\u001a\u00020!H\u0016J\u0018\u0010[\u001a\u00020:2\u0006\u0010>\u001a\u00020\u00022\u0006\u0010'\u001a\u00020!H\u0016J\u000e\u0010\\\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001eJ\u0016\u0010]\u001a\u00020:2\u0006\u0010^\u001a\u00020!2\u0006\u0010_\u001a\u00020!J\u001c\u0010`\u001a\u00020:2\u0006\u00101\u001a\u00020\r2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0%J\u0014\u0010b\u001a\u00020:2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0%J\u0010\u0010c\u001a\u00020:2\b\u0010d\u001a\u0004\u0018\u00010\u0019J\u001e\u0010e\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001e2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\n0%H\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bX\u0004¢\u0006\u0002\n\u0000R \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\fX\u0004¢\u0006\u0002\n\u0000¨\u0006g"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedAdapter;", "Lcom/h6ah4i/android/widget/advrecyclerview/utils/AbstractExpandableItemAdapter;", "Lcom/ss/android/lark/feed/app/team/widget/TeamItemViewHolder;", "Lcom/ss/android/lark/feed/app/team/widget/BaseTeamChatViewHolder;", "Lcom/h6ah4i/android/widget/advrecyclerview/expandable/ExpandableSwipeableItemAdapter;", "layoutManager", "Lcom/h6ah4i/android/widget/advrecyclerview/expandable/RecyclerViewExpandableItemManager;", "(Lcom/h6ah4i/android/widget/advrecyclerview/expandable/RecyclerViewExpandableItemManager;)V", "chatComparator", "Ljava/util/Comparator;", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "chatId2ChildIdMap", "", "", "hiddenChatBinder", "Lcom/ss/android/lark/feed/app/team/widget/TeamHiddenChatBinder;", "lastChildId", "lastGroupId", "layoutManagerRef", "Ljava/lang/ref/WeakReference;", "shownChatBinder", "Lcom/ss/android/lark/feed/app/team/widget/TeamShownChatBinder;", "teamBinder", "Lcom/ss/android/lark/feed/app/team/widget/TeamItemBinder;", "teamFeedActionHandler", "Lcom/ss/android/lark/feed/app/team/feed/ITeamFeedActionHandler;", "teamHiddenChatListMap", "", "teamId2GroupIdMap", "teamList", "Lcom/ss/android/lark/feed/app/team/entity/TeamVO;", "teamShownChatListMap", "getChatIndex", "", "chatId", "", "list", "", "getChildCount", "groupPosition", "getChildId", "childPosition", "getChildItemViewType", "getGroupCount", "getGroupId", "getInitialGroupExpandedState", "", "getMappedChildId", "getMappedGroupId", "teamId", "getTeamChatId", "preview", "getTeamIndex", "isChildPositionValid", "isGroupPositionValid", "needHideChatFromList", "chat", "onAddTeam", "", "team", "position", "onBindChildViewHolder", "holder", "viewType", "onBindGroupViewHolder", "onChatChanged", "onCheckCanExpandOrCollapseGroup", "x", "y", "expand", "onCreateChildViewHolder", "parent", "Landroid/view/ViewGroup;", "onCreateGroupViewHolder", "onGetChildItemSwipeReactionType", "onGetGroupItemSwipeReactionType", "onHookGroupCollapse", "fromUser", "payload", "", "onHookGroupExpand", "onRemoveChat", "onRemoveTeam", "onSetChildItemSwipeBackground", ShareHitPoint.f121869d, "onSetGroupItemSwipeBackground", "onSwipeChildItem", "Lcom/h6ah4i/android/widget/advrecyclerview/swipeable/action/SwipeResultAction;", "result", "onSwipeChildItemStarted", "onSwipeGroupItem", "onSwipeGroupItemStarted", "onTeamChanged", "onTeamPositionChanged", "fromPosition", "toPosition", "resetChatList", "chatList", "resetTeamList", "setTeamActionHandler", "handler", "updateTeamBadgeCount", "Companion", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.a.b */
public final class TeamFeedAdapter extends AbstractC23302a<C37898e, BaseTeamChatViewHolder> implements AbstractC23274g<C37898e, BaseTeamChatViewHolder> {

    /* renamed from: a */
    public static final Companion f97030a = new Companion(null);

    /* renamed from: b */
    private final Comparator<C37874d> f97031b;

    /* renamed from: c */
    private final C37894d f97032c = new C37894d();

    /* renamed from: d */
    private final C37899f f97033d = new C37899f();

    /* renamed from: e */
    private final TeamHiddenChatBinder f97034e;

    /* renamed from: f */
    private final List<C37878g> f97035f;

    /* renamed from: g */
    private final Map<Long, List<C37874d>> f97036g;

    /* renamed from: h */
    private final Map<Long, List<C37874d>> f97037h;

    /* renamed from: i */
    private long f97038i;

    /* renamed from: j */
    private final Map<Long, Long> f97039j;

    /* renamed from: k */
    private long f97040k;

    /* renamed from: l */
    private final Map<Long, Long> f97041l;

    /* renamed from: m */
    private ITeamFeedActionHandler f97042m;

    /* renamed from: n */
    private WeakReference<RecyclerViewExpandableItemManager> f97043n;

    /* renamed from: a */
    public int mo80713a(C37898e eVar, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        return 0;
    }

    /* renamed from: a */
    public void mo80716a(BaseTeamChatViewHolder aVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
    }

    /* renamed from: a */
    public void mo80715a(C37898e eVar, int i) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a
    /* renamed from: a */
    public boolean mo80864a(int i, boolean z) {
        return true;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a, com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public boolean mo80725a(int i, boolean z, Object obj) {
        return true;
    }

    /* renamed from: b */
    public void mo80717b(C37898e eVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a
    /* renamed from: b */
    public boolean mo80865b(int i, boolean z) {
        return true;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a, com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: b */
    public boolean mo80730b(int i, boolean z, Object obj) {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/feed/app/team/feed/TeamFeedAdapter$Companion;", "", "()V", "TAG", "", "VIEW_TYPE_HIDDEN_CHAT", "", "VIEW_TYPE_SHOWN_CHAT", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo138633a(List<? extends C37878g> list) {
        Intrinsics.checkParameterIsNotNull(list, "teamList");
        this.f97035f.clear();
        this.f97035f.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo138624a(long j, List<? extends C37874d> list) {
        WeakReference<RecyclerViewExpandableItemManager> weakReference;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        Intrinsics.checkParameterIsNotNull(list, "chatList");
        int b = mo138635b(j);
        if (!(b < 0 || (weakReference = this.f97043n) == null || (recyclerViewExpandableItemManager = weakReference.get()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(recyclerViewExpandableItemManager, "layoutManagerRef?.get() ?: return");
            ArrayList arrayList = this.f97036g.get(Long.valueOf(j));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = this.f97037h.get(Long.valueOf(j));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            this.f97036g.put(Long.valueOf(j), arrayList);
            this.f97037h.put(Long.valueOf(j), arrayList2);
            int size = arrayList.size();
            int size2 = arrayList2.size();
            arrayList.clear();
            arrayList2.clear();
            int i = 1;
            int i2 = size + (size2 > 0 ? 1 : 0);
            if (i2 > 0) {
                recyclerViewExpandableItemManager.mo80696b(b, 0, i2);
            }
            for (T t : list) {
                if (m148882b(t)) {
                    arrayList2.add(t);
                } else {
                    arrayList.add(t);
                }
            }
            CollectionsKt.sortWith(arrayList, this.f97031b);
            CollectionsKt.sortWith(arrayList2, this.f97031b);
            int size3 = arrayList.size();
            if (arrayList2.size() <= 0) {
                i = 0;
            }
            recyclerViewExpandableItemManager.mo80688a(b, 0, size3 + i);
            C37878g gVar = this.f97035f.get(b);
            if (gVar.mo138777d() != recyclerViewExpandableItemManager.mo80701c(b)) {
                if (gVar.mo138777d()) {
                    recyclerViewExpandableItemManager.mo80692a(b);
                } else {
                    recyclerViewExpandableItemManager.mo80698b(b);
                }
            }
            m148881a(gVar, arrayList);
        }
    }

    /* renamed from: a */
    public final void mo138627a(C37878g gVar) {
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        Intrinsics.checkParameterIsNotNull(gVar, "team");
        int b = mo138635b(gVar.mo138776c());
        if (b >= 0) {
            this.f97035f.set(b, gVar);
            WeakReference<RecyclerViewExpandableItemManager> weakReference = this.f97043n;
            if (weakReference != null && (recyclerViewExpandableItemManager = weakReference.get()) != null) {
                recyclerViewExpandableItemManager.mo80702d(b);
            }
        }
    }

    /* renamed from: a */
    public final void mo138626a(C37874d dVar) {
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        WeakReference<RecyclerViewExpandableItemManager> weakReference;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager2;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager3;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager4;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager5;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager6;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager7;
        WeakReference<RecyclerViewExpandableItemManager> weakReference2;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager8;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager9;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager10;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager11;
        Intrinsics.checkParameterIsNotNull(dVar, "chat");
        Log.m165379d("TeamFeedAdapter", "onChatChanged, chat id: " + dVar.mo138742b() + ", chat name: " + dVar.mo138746c());
        long g = dVar.mo138750g();
        int b = mo138635b(g);
        if (g >= 0) {
            ArrayList arrayList = this.f97036g.get(Long.valueOf(g));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = this.f97037h.get(Long.valueOf(g));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            this.f97036g.put(Long.valueOf(g), arrayList);
            this.f97037h.put(Long.valueOf(g), arrayList2);
            int size = arrayList.size();
            int size2 = arrayList2.size();
            String b2 = dVar.mo138742b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "chat.id");
            int a = m148880a(b2, arrayList);
            String b3 = dVar.mo138742b();
            Intrinsics.checkExpressionValueIsNotNull(b3, "chat.id");
            int a2 = m148880a(b3, arrayList2);
            if (a >= 0 || a2 >= 0) {
                boolean b4 = m148882b(dVar);
                Log.m165379d("TeamFeedAdapter", "onChatChanged, chat id: " + dVar.mo138742b() + ", needHideChat: " + b4);
                int i = 1;
                if (a >= 0 && a2 >= 0) {
                    Log.m165379d("TeamFeedAdapter", "onChatChanged, chat id: " + dVar.mo138742b() + ", exists in both two lists");
                    arrayList.remove(a);
                    WeakReference<RecyclerViewExpandableItemManager> weakReference3 = this.f97043n;
                    if (!(weakReference3 == null || (recyclerViewExpandableItemManager11 = weakReference3.get()) == null)) {
                        recyclerViewExpandableItemManager11.mo80700c(b, a);
                    }
                    arrayList2.remove(a2);
                    if (b4) {
                        arrayList2.add(dVar);
                        CollectionsKt.sortWith(arrayList2, this.f97031b);
                        if (arrayList2.size() == 1) {
                            WeakReference<RecyclerViewExpandableItemManager> weakReference4 = this.f97043n;
                            if (!(weakReference4 == null || (recyclerViewExpandableItemManager10 = weakReference4.get()) == null)) {
                                recyclerViewExpandableItemManager10.mo80695b(b, arrayList.size());
                            }
                        } else {
                            WeakReference<RecyclerViewExpandableItemManager> weakReference5 = this.f97043n;
                            if (!(weakReference5 == null || (recyclerViewExpandableItemManager9 = weakReference5.get()) == null)) {
                                recyclerViewExpandableItemManager9.mo80687a(b, arrayList.size());
                            }
                        }
                    } else {
                        arrayList.add(dVar);
                        CollectionsKt.sortWith(arrayList, this.f97031b);
                        int i2 = (size - 1) + (size2 > 0 ? 1 : 0);
                        if (!(i2 <= 0 || (weakReference2 = this.f97043n) == null || (recyclerViewExpandableItemManager8 = weakReference2.get()) == null)) {
                            recyclerViewExpandableItemManager8.mo80696b(b, 0, i2);
                        }
                        int size3 = arrayList.size();
                        if (arrayList2.size() <= 0) {
                            i = 0;
                        }
                        int i3 = size3 + i;
                        WeakReference<RecyclerViewExpandableItemManager> weakReference6 = this.f97043n;
                        if (!(weakReference6 == null || (recyclerViewExpandableItemManager7 = weakReference6.get()) == null)) {
                            recyclerViewExpandableItemManager7.mo80688a(b, 0, i3);
                        }
                    }
                } else if (a >= 0) {
                    Log.m165379d("TeamFeedAdapter", "onChatChanged, chat id: " + dVar.mo138742b() + ", was shown previously");
                    if (b4) {
                        arrayList.remove(a);
                        WeakReference<RecyclerViewExpandableItemManager> weakReference7 = this.f97043n;
                        if (!(weakReference7 == null || (recyclerViewExpandableItemManager6 = weakReference7.get()) == null)) {
                            recyclerViewExpandableItemManager6.mo80700c(b, a);
                        }
                        arrayList2.add(dVar);
                        CollectionsKt.sortWith(arrayList2, this.f97031b);
                        if (arrayList2.size() == 1) {
                            WeakReference<RecyclerViewExpandableItemManager> weakReference8 = this.f97043n;
                            if (!(weakReference8 == null || (recyclerViewExpandableItemManager5 = weakReference8.get()) == null)) {
                                recyclerViewExpandableItemManager5.mo80695b(b, arrayList.size());
                            }
                        } else {
                            WeakReference<RecyclerViewExpandableItemManager> weakReference9 = this.f97043n;
                            if (!(weakReference9 == null || (recyclerViewExpandableItemManager4 = weakReference9.get()) == null)) {
                                recyclerViewExpandableItemManager4.mo80687a(b, arrayList.size());
                            }
                        }
                    } else {
                        arrayList.set(a, dVar);
                        WeakReference<RecyclerViewExpandableItemManager> weakReference10 = this.f97043n;
                        if (!(weakReference10 == null || (recyclerViewExpandableItemManager3 = weakReference10.get()) == null)) {
                            recyclerViewExpandableItemManager3.mo80687a(b, a);
                        }
                    }
                } else {
                    Log.m165379d("TeamFeedAdapter", "onChatChanged, chat_id: " + dVar.mo138742b() + ", was hidden previously");
                    if (b4) {
                        arrayList2.set(a2, dVar);
                        CollectionsKt.sortWith(arrayList2, this.f97031b);
                    } else {
                        arrayList2.remove(a2);
                        arrayList.add(dVar);
                        CollectionsKt.sortWith(arrayList, this.f97031b);
                        int i4 = size + (size2 > 0 ? 1 : 0);
                        if (!(i4 <= 0 || (weakReference = this.f97043n) == null || (recyclerViewExpandableItemManager2 = weakReference.get()) == null)) {
                            recyclerViewExpandableItemManager2.mo80696b(b, 0, i4);
                        }
                        int size4 = arrayList.size();
                        if (arrayList2.size() <= 0) {
                            i = 0;
                        }
                        int i5 = size4 + i;
                        WeakReference<RecyclerViewExpandableItemManager> weakReference11 = this.f97043n;
                        if (!(weakReference11 == null || (recyclerViewExpandableItemManager = weakReference11.get()) == null)) {
                            recyclerViewExpandableItemManager.mo80688a(b, 0, i5);
                        }
                    }
                }
                m148881a(this.f97035f.get(b), arrayList);
                return;
            }
            Log.m165397w("TeamFeedAdapter", "chat id " + dVar.mo138742b() + " not found in neither shown list nor hidden list when onChatChanged called");
        }
    }

    /* renamed from: a */
    public final void mo138628a(C37878g gVar, int i) {
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        Intrinsics.checkParameterIsNotNull(gVar, "team");
        if (i > this.f97035f.size() || i < 0) {
            i = this.f97035f.size();
        }
        this.f97035f.add(i, gVar);
        WeakReference<RecyclerViewExpandableItemManager> weakReference = this.f97043n;
        if (weakReference != null && (recyclerViewExpandableItemManager = weakReference.get()) != null) {
            recyclerViewExpandableItemManager.mo80703e(i);
        }
    }

    /* renamed from: a */
    public final void mo138622a(long j) {
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        this.f97036g.remove(Long.valueOf(j));
        this.f97037h.remove(Long.valueOf(j));
        int b = mo138635b(j);
        if (b >= 0) {
            this.f97035f.remove(b);
            WeakReference<RecyclerViewExpandableItemManager> weakReference = this.f97043n;
            if (weakReference != null && (recyclerViewExpandableItemManager = weakReference.get()) != null) {
                recyclerViewExpandableItemManager.mo80704f(b);
            }
        }
    }

    /* renamed from: a */
    public final void mo138623a(long j, String str) {
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager2;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager3;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager4;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager5;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager6;
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        int b = mo138635b(j);
        if (b >= 0) {
            ArrayList arrayList = this.f97036g.get(Long.valueOf(j));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = this.f97037h.get(Long.valueOf(j));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            this.f97036g.put(Long.valueOf(j), arrayList);
            this.f97037h.put(Long.valueOf(j), arrayList2);
            int a = m148880a(str, arrayList);
            int a2 = m148880a(str, arrayList2);
            if (a >= 0 || a2 >= 0) {
                if (a >= 0 && a2 >= 0) {
                    arrayList.remove(a);
                    WeakReference<RecyclerViewExpandableItemManager> weakReference = this.f97043n;
                    if (!(weakReference == null || (recyclerViewExpandableItemManager6 = weakReference.get()) == null)) {
                        recyclerViewExpandableItemManager6.mo80700c(b, a);
                    }
                    arrayList2.remove(a2);
                    if (arrayList2.size() > 0) {
                        WeakReference<RecyclerViewExpandableItemManager> weakReference2 = this.f97043n;
                        if (!(weakReference2 == null || (recyclerViewExpandableItemManager5 = weakReference2.get()) == null)) {
                            recyclerViewExpandableItemManager5.mo80687a(b, arrayList.size());
                        }
                    } else {
                        WeakReference<RecyclerViewExpandableItemManager> weakReference3 = this.f97043n;
                        if (!(weakReference3 == null || (recyclerViewExpandableItemManager4 = weakReference3.get()) == null)) {
                            recyclerViewExpandableItemManager4.mo80700c(b, arrayList.size());
                        }
                    }
                } else if (a >= 0) {
                    arrayList.remove(a);
                    WeakReference<RecyclerViewExpandableItemManager> weakReference4 = this.f97043n;
                    if (!(weakReference4 == null || (recyclerViewExpandableItemManager3 = weakReference4.get()) == null)) {
                        recyclerViewExpandableItemManager3.mo80700c(b, a);
                    }
                } else {
                    arrayList2.remove(a2);
                    if (arrayList2.size() > 0) {
                        WeakReference<RecyclerViewExpandableItemManager> weakReference5 = this.f97043n;
                        if (!(weakReference5 == null || (recyclerViewExpandableItemManager2 = weakReference5.get()) == null)) {
                            recyclerViewExpandableItemManager2.mo80687a(b, arrayList.size());
                        }
                    } else {
                        WeakReference<RecyclerViewExpandableItemManager> weakReference6 = this.f97043n;
                        if (!(weakReference6 == null || (recyclerViewExpandableItemManager = weakReference6.get()) == null)) {
                            recyclerViewExpandableItemManager.mo80700c(b, arrayList.size());
                        }
                    }
                }
                m148881a(this.f97035f.get(b), arrayList);
                return;
            }
            Log.m165397w("TeamFeedAdapter", "chat id " + str + " not found in neither shown list nor hidden list when onRemoveChat called");
        }
    }

    /* renamed from: a */
    public void mo80732c(C37898e eVar, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        if (m148887e(i)) {
            this.f97032c.mo138831a(eVar, this.f97035f.get(i), this.f97042m, i, this.f97035f.size());
        }
    }

    /* renamed from: a */
    public void mo80733c(BaseTeamChatViewHolder aVar, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (m148887e(i) && i2 >= 0) {
            C37878g gVar = this.f97035f.get(i);
            ArrayList arrayList = this.f97036g.get(Long.valueOf(gVar.mo138776c()));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = this.f97037h.get(Long.valueOf(gVar.mo138776c()));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            if (arrayList2.size() <= 0 && i2 >= arrayList.size()) {
                return;
            }
            if (arrayList2.size() <= 0 || i2 != arrayList.size()) {
                this.f97033d.mo138834a((C37904g) aVar, arrayList.get(i2), this.f97042m);
                return;
            }
            this.f97034e.mo138825a((TeamHiddenChatViewHolder) aVar, arrayList2, this.f97042m);
        }
    }

    /* renamed from: a */
    public boolean mo80726a(C37898e eVar, int i, int i2, int i3, boolean z) {
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        return m148887e(i);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public int mo80719a() {
        return this.f97035f.size();
    }

    /* renamed from: a */
    public final void mo138625a(ITeamFeedActionHandler aVar) {
        this.f97042m = aVar;
    }

    /* renamed from: b */
    private final boolean m148882b(C37874d dVar) {
        if (!dVar.mo138753j() || dVar.mo138740a()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final boolean m148887e(int i) {
        if (i < 0 || i >= this.f97035f.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final long m148884c(C37874d dVar) {
        String b = dVar.mo138742b();
        long a = C26256ah.m95012a(b, -1);
        if (a == -1) {
            return (long) b.hashCode();
        }
        return a;
    }

    /* renamed from: c */
    private final long m148883c(long j) {
        Long l = this.f97039j.get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        long j2 = this.f97038i;
        this.f97038i = 1 + j2;
        this.f97039j.put(Long.valueOf(j), Long.valueOf(j2));
        return j2;
    }

    /* renamed from: d */
    private final long m148885d(long j) {
        Long l = this.f97041l.get(Long.valueOf(j));
        if (l != null) {
            return l.longValue();
        }
        long j2 = this.f97040k;
        this.f97040k = 1 + j2;
        this.f97041l.put(Long.valueOf(j), Long.valueOf(j2));
        return j2;
    }

    /* renamed from: b */
    public final int mo138635b(long j) {
        int i = 0;
        for (T t : this.f97035f) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (t.mo138776c() == j) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    public TeamFeedAdapter(RecyclerViewExpandableItemManager recyclerViewExpandableItemManager) {
        Intrinsics.checkParameterIsNotNull(recyclerViewExpandableItemManager, "layoutManager");
        C37818b bVar = C37818b.f97044a;
        this.f97031b = bVar;
        this.f97034e = new TeamHiddenChatBinder(bVar);
        this.f97035f = new ArrayList();
        this.f97036g = new LinkedHashMap();
        this.f97037h = new LinkedHashMap();
        this.f97039j = new LinkedHashMap();
        this.f97041l = new LinkedHashMap();
        this.f97043n = new WeakReference<>(recyclerViewExpandableItemManager);
        setHasStableIds(true);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public int mo80720a(int i) {
        boolean z = false;
        if (!m148887e(i)) {
            return 0;
        }
        C37878g gVar = this.f97035f.get(i);
        Map<Long, List<C37874d>> map = this.f97036g;
        Team a = gVar.mo138771a();
        Intrinsics.checkExpressionValueIsNotNull(a, "team.team");
        ArrayList arrayList = map.get(Long.valueOf(a.getId()));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Map<Long, List<C37874d>> map2 = this.f97037h;
        Team a2 = gVar.mo138771a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "team.team");
        List<C37874d> list = map2.get(Long.valueOf(a2.getId()));
        if (list == null || list.isEmpty()) {
            z = true;
        }
        if (!z) {
            return arrayList.size() + 1;
        }
        return arrayList.size();
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: b */
    public long mo80728b(int i) {
        if (!m148887e(i)) {
            return -1;
        }
        Team a = this.f97035f.get(i).mo138771a();
        Intrinsics.checkExpressionValueIsNotNull(a, "teamList[groupPosition].team");
        return m148883c(a.getId());
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a, com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: d */
    public boolean mo80734d(int i) {
        if (!m148887e(i)) {
            return true;
        }
        return this.f97035f.get(i).mo138777d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "kotlin.jvm.PlatformType", "o2", "compare"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.a.b$b */
    static final class C37818b<T> implements Comparator<C37874d> {

        /* renamed from: a */
        public static final C37818b f97044a = new C37818b();

        C37818b() {
        }

        /* renamed from: a */
        public final int compare(C37874d dVar, C37874d dVar2) {
            Intrinsics.checkExpressionValueIsNotNull(dVar, "o1");
            String i = dVar.mo138752i();
            Intrinsics.checkExpressionValueIsNotNull(dVar2, "o2");
            String i2 = dVar2.mo138752i();
            Intrinsics.checkExpressionValueIsNotNull(i2, "o2.nameWeight");
            return i.compareTo(i2);
        }
    }

    /* renamed from: d */
    public BaseTeamChatViewHolder mo80729b(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        if (i == 1) {
            return this.f97034e.mo138823a(viewGroup);
        }
        C37904g a = this.f97033d.mo138832a(viewGroup);
        Intrinsics.checkExpressionValueIsNotNull(a, "shownChatBinder.onCreateViewHolder(parent)");
        return a;
    }

    /* renamed from: a */
    private final int m148880a(String str, List<? extends C37874d> list) {
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t.mo138742b(), str)) {
                return i;
            }
            i = i2;
        }
        return -1;
    }

    /* renamed from: a */
    private final void m148881a(C37878g gVar, List<? extends C37874d> list) {
        int i;
        ArrayList<C37874d> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (next.getBadgeCount() > 0) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        int i2 = 0;
        for (C37874d dVar : arrayList) {
            if (dVar.isRemind()) {
                i2 += dVar.getBadgeCount();
            } else {
                i += dVar.getBadgeCount();
            }
        }
        gVar.mo138775b(i);
        gVar.mo138772a(i2);
        if (!gVar.mo138777d()) {
            mo138627a(gVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m148886d(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.m148887e(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            if (r7 >= 0) goto L_0x000b
            return r1
        L_0x000b:
            java.util.List<com.ss.android.lark.feed.app.team.entity.g> r0 = r5.f97035f
            java.lang.Object r6 = r0.get(r6)
            com.ss.android.lark.feed.app.team.entity.g r6 = (com.ss.android.lark.feed.app.team.entity.C37878g) r6
            java.util.Map<java.lang.Long, java.util.List<com.ss.android.lark.feed.app.team.entity.d>> r0 = r5.f97036g
            long r2 = r6.mo138776c()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0026
            goto L_0x002d
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
        L_0x002d:
            java.util.Map<java.lang.Long, java.util.List<com.ss.android.lark.feed.app.team.entity.d>> r2 = r5.f97037h
            long r3 = r6.mo138776c()
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.Object r6 = r2.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0040
            goto L_0x0047
        L_0x0040:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
        L_0x0047:
            int r6 = r6.size()
            r2 = 1
            if (r6 <= 0) goto L_0x0055
            int r6 = r0.size()
            if (r7 > r6) goto L_0x005c
            goto L_0x005b
        L_0x0055:
            int r6 = r0.size()
            if (r7 >= r6) goto L_0x005c
        L_0x005b:
            r1 = 1
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.feed.app.team.feed.TeamFeedAdapter.m148886d(int, int):boolean");
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.utils.AbstractC23302a, com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: b */
    public int mo80727b(int i, int i2) {
        if (!m148887e(i) || i2 < 0) {
            return super.mo80727b(i, i2);
        }
        C37878g gVar = this.f97035f.get(i);
        ArrayList arrayList = this.f97036g.get(Long.valueOf(gVar.mo138776c()));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = this.f97037h.get(Long.valueOf(gVar.mo138776c()));
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (arrayList2.size() <= 0 || i2 != arrayList.size()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public C37898e mo80722a(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        C37898e a = this.f97032c.mo138830a(viewGroup);
        Intrinsics.checkExpressionValueIsNotNull(a, "teamBinder.createViewHolder(parent)");
        return a;
    }

    /* renamed from: c */
    public final void mo138641c(int i, int i2) {
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager;
        RecyclerViewExpandableItemManager recyclerViewExpandableItemManager2;
        if (m148887e(i) && m148887e(i2)) {
            C37878g remove = this.f97035f.remove(i);
            WeakReference<RecyclerViewExpandableItemManager> weakReference = this.f97043n;
            if (!(weakReference == null || (recyclerViewExpandableItemManager2 = weakReference.get()) == null)) {
                recyclerViewExpandableItemManager2.mo80704f(i);
            }
            this.f97035f.add(i2, remove);
            WeakReference<RecyclerViewExpandableItemManager> weakReference2 = this.f97043n;
            if (weakReference2 != null && (recyclerViewExpandableItemManager = weakReference2.get()) != null) {
                recyclerViewExpandableItemManager.mo80703e(i2);
            }
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public long mo80721a(int i, int i2) {
        long j;
        if (!m148886d(i, i2) || i < 0) {
            return -1;
        }
        C37878g gVar = this.f97035f.get(i);
        ArrayList arrayList = this.f97036g.get(Long.valueOf(gVar.mo138776c()));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        ArrayList arrayList2 = this.f97037h.get(Long.valueOf(gVar.mo138776c()));
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        if (arrayList2.size() <= 0 || i2 != arrayList.size()) {
            j = m148884c(arrayList.get(i2));
        } else {
            j = m148884c(arrayList2.get(0));
        }
        return m148885d(j);
    }

    /* renamed from: c */
    public AbstractC23277a mo80775d(C37898e eVar, int i, int i2) {
        return new C23278b();
    }

    /* renamed from: c */
    public AbstractC23277a mo80776d(BaseTeamChatViewHolder aVar, int i, int i2, int i3) {
        if (i3 == 1) {
            return new C23280d();
        }
        if (i3 != 2) {
            return new C23278b();
        }
        return new C23279c();
    }

    /* renamed from: b */
    public void mo80718b(BaseTeamChatViewHolder aVar, int i, int i2, int i3) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        if (m148887e(i)) {
            ArrayList arrayList = this.f97036g.get(Long.valueOf(this.f97035f.get(i).mo138776c()));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (i2 >= 0 && i2 < arrayList.size()) {
                C37874d dVar = arrayList.get(i2);
                if (!dVar.mo138751h()) {
                    if (!(aVar instanceof C37904g)) {
                        aVar = null;
                    }
                    C37904g gVar = (C37904g) aVar;
                    if (gVar == null) {
                        return;
                    }
                    if (i3 == 0) {
                        gVar.mo138840l();
                    } else {
                        gVar.mo138839b(dVar.mo138753j());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public int mo80714a(BaseTeamChatViewHolder aVar, int i, int i2, int i3, int i4) {
        if (!m148887e(i) || i2 < 0) {
            return 0;
        }
        C37878g gVar = this.f97035f.get(i);
        ArrayList arrayList = this.f97036g.get(Long.valueOf(gVar.mo138776c()));
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (i2 >= arrayList.size()) {
            return 0;
        }
        Team a = gVar.mo138771a();
        Intrinsics.checkExpressionValueIsNotNull(a, "team.team");
        if (Intrinsics.areEqual(String.valueOf(a.getDefaultChatId()), arrayList.get(i2).mo138742b())) {
            return 0;
        }
        return 2;
    }
}
