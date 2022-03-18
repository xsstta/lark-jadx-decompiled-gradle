package com.ss.android.lark.team.page.member;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import com.ss.android.lark.team.util.ImageUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter$SelectionPreviewViewHolder;", "dependency", "Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter$Dependency;", "(Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter$Dependency;)V", "onClickListener", "Landroid/view/View$OnClickListener;", "selectionList", "", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "addSelection", "", "chatter", "clearAllSelections", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeSelection", "Dependency", "SelectionPreviewViewHolder", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.f */
public final class SelectionPreviewAdapter extends RecyclerView.Adapter<SelectionPreviewViewHolder> {

    /* renamed from: a */
    private final List<TeamMemberVO> f137132a = new ArrayList();

    /* renamed from: b */
    private final View.OnClickListener f137133b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter$Dependency;", "", "removeSelection", "", "chatter", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.f$a */
    public interface Dependency {
        /* renamed from: a */
        void mo189455a(TeamMemberVO dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/page/member/SelectionPreviewAdapter$SelectionPreviewViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "avatarView", "Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "(Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;)V", "getAvatarView", "()Lcom/larksuite/component/ui/avatar/v2/LarkAvatarView;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.f$b */
    public static final class SelectionPreviewViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final LarkAvatarView f137134a;

        /* renamed from: a */
        public final LarkAvatarView mo189514a() {
            return this.f137134a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SelectionPreviewViewHolder(LarkAvatarView larkAvatarView) {
            super(larkAvatarView);
            Intrinsics.checkParameterIsNotNull(larkAvatarView, "avatarView");
            this.f137134a = larkAvatarView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f137132a.size();
    }

    /* renamed from: a */
    public final void mo189510a() {
        this.f137132a.clear();
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.f$c */
    static final class View$OnClickListenerC55583c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SelectionPreviewAdapter f137135a;

        /* renamed from: b */
        final /* synthetic */ Dependency f137136b;

        View$OnClickListenerC55583c(SelectionPreviewAdapter fVar, Dependency aVar) {
            this.f137135a = fVar;
            this.f137136b = aVar;
        }

        public final void onClick(View view) {
            Object tag = view.getTag(R.id.tag_chat_chatter);
            if (!(tag instanceof TeamMemberVO)) {
                tag = null;
            }
            TeamMemberVO dVar = (TeamMemberVO) tag;
            if (dVar != null) {
                this.f137135a.mo189511a(dVar);
                this.f137136b.mo189455a(dVar);
            }
        }
    }

    public SelectionPreviewAdapter(Dependency aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f137133b = new View$OnClickListenerC55583c(this, aVar);
    }

    /* renamed from: a */
    public final void mo189511a(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatter");
        if (this.f137132a.indexOf(dVar) >= 0) {
            this.f137132a.remove(dVar);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final void mo189513b(TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "chatter");
        if (!this.f137132a.contains(dVar)) {
            this.f137132a.add(dVar);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public SelectionPreviewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LarkAvatarView larkAvatarView = new LarkAvatarView(viewGroup.getContext());
        int a = C51468a.m199486a(30);
        larkAvatarView.setLayoutParams(new RelativeLayout.LayoutParams(a, a));
        larkAvatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new SelectionPreviewViewHolder(larkAvatarView);
    }

    /* renamed from: a */
    public void onBindViewHolder(SelectionPreviewViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        TeamMemberVO dVar = this.f137132a.get(i);
        LarkAvatarView a = bVar.mo189514a();
        ChatterAvatar m = ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(dVar.mo188945a()).mo88962a(dVar.mo188947b())).mo88967b(dVar.mo188945a())).mo88966b(ImageUtil.m215113a(a.getContext(), a.getWidth(), a.getHeight()))).mo88976k();
        LarkAvatarView a2 = bVar.mo189514a();
        a2.mo89076a(m);
        a2.setTag(R.id.tag_chat_chatter, dVar);
        a2.setOnClickListener(this.f137133b);
    }
}
