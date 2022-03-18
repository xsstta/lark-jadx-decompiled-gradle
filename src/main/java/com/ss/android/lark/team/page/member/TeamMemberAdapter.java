package com.ss.android.lark.team.page.member;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.team.bean.TeamMemberVO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0014\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012J\u0014\u0010\"\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0012J\u0006\u0010#\u001a\u00020\u0010J\u001c\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\n2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u0012J\u0016\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\n2\u0006\u0010)\u001a\u00020\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dependency", "Lcom/ss/android/lark/team/page/member/TeamMemberAdapterDependency;", "(Lcom/ss/android/lark/team/page/member/TeamMemberAdapterDependency;)V", "footerSearchTipViewBinder", "Lcom/ss/android/lark/team/page/member/FooterSearchTipViewBinder;", "memberList", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "showFooterSearchTip", "", "teamMemberViewBinder", "Lcom/ss/android/lark/team/page/member/TeamMemberViewBinder;", "appendMemberList", "", "list", "", "clearMemberList", "getItemCount", "", "getItemViewType", "position", "isFooterSearchTip", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onMemberRemoved", "ids", "", "resetMemberList", "showSearchTip", "updateMemberTagInfoList", "member", "tagInfoList", "Lcom/ss/android/lark/chat/entity/chatter/TagInfo;", "updateSelection", "selected", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.l */
public final class TeamMemberAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final TeamMemberVO f137152a;

    /* renamed from: b */
    public static final Companion f137153b = new Companion(null);

    /* renamed from: c */
    private final TeamMemberViewBinder f137154c;

    /* renamed from: d */
    private final FooterSearchTipViewBinder f137155d = new FooterSearchTipViewBinder();

    /* renamed from: e */
    private boolean f137156e;

    /* renamed from: f */
    private final List<TeamMemberVO> f137157f = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberAdapter$Companion;", "", "()V", "FOOTER_SEARCH_TIP", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "getFOOTER_SEARCH_TIP", "()Lcom/ss/android/lark/team/bean/TeamMemberVO;", "VIEW_TYPE_FOOTER_TIP", "", "VIEW_TYPE_MEMBER", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f137157f.size();
    }

    static {
        Chatter chatter = new Chatter();
        chatter.setId("FOOTER_SEARCH_TIP");
        f137152a = new TeamMemberVO(new ChatChatter(chatter));
    }

    /* renamed from: a */
    public final void mo189520a() {
        this.f137157f.clear();
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo189524b() {
        this.f137156e = true;
        TeamMemberVO dVar = f137152a;
        if (true ^ Intrinsics.areEqual((TeamMemberVO) CollectionsKt.last((List) this.f137157f), dVar)) {
            this.f137157f.add(dVar);
            notifyItemInserted(CollectionsKt.getLastIndex(this.f137157f));
        }
    }

    /* renamed from: a */
    private final boolean m215467a(int i) {
        if (!this.f137156e || i != CollectionsKt.getLastIndex(this.f137157f)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m215467a(i)) {
            return 2;
        }
        return 1;
    }

    public TeamMemberAdapter(TeamMemberAdapterDependency mVar) {
        Intrinsics.checkParameterIsNotNull(mVar, "dependency");
        this.f137154c = new TeamMemberViewBinder(mVar);
    }

    /* renamed from: c */
    public final void mo189526c(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        Iterator<TeamMemberVO> it = this.f137157f.iterator();
        while (it.hasNext()) {
            if (list.contains(it.next().mo188945a())) {
                it.remove();
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final void mo189525b(List<TeamMemberVO> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        List<TeamMemberVO> list2 = list;
        if (!list2.isEmpty()) {
            int size = this.f137157f.size();
            this.f137157f.addAll(list2);
            notifyItemRangeChanged(size, list.size());
        }
    }

    /* renamed from: a */
    public final void mo189523a(List<TeamMemberVO> list) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        this.f137157f.clear();
        this.f137157f.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo189522a(TeamMemberVO dVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        int i = 0;
        for (T t : this.f137157f) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(t.mo188945a(), dVar.mo188945a())) {
                notifyItemChanged(i);
            }
            i = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        TeamMemberVO dVar = this.f137157f.get(i);
        if (viewHolder instanceof TeamMemberViewHolder) {
            this.f137154c.mo189528a((TeamMemberViewHolder) viewHolder, dVar);
        } else if (viewHolder instanceof FooterSearchTipViewHolder) {
            this.f137155d.mo189508a((FooterSearchTipViewHolder) viewHolder, dVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            FooterSearchTipViewBinder dVar = this.f137155d;
            Intrinsics.checkExpressionValueIsNotNull(from, "inflater");
            return dVar.mo189507a(from);
        }
        TeamMemberViewBinder vVar = this.f137154c;
        Intrinsics.checkExpressionValueIsNotNull(from, "inflater");
        return vVar.mo189527a(from);
    }

    /* renamed from: a */
    public final void mo189521a(TeamMemberVO dVar, List<TagInfo> list) {
        Intrinsics.checkParameterIsNotNull(dVar, "member");
        Intrinsics.checkParameterIsNotNull(list, "tagInfoList");
        int i = 0;
        for (T t : this.f137157f) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (Intrinsics.areEqual(t2.mo188945a(), dVar.mo188945a())) {
                t2.mo188959i().setTagInfos(list);
                notifyItemChanged(i);
            }
            i = i2;
        }
    }
}
