package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.TagFilterRule;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.WorkStatus;
import com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView;
import com.ss.android.lark.searchcommon.view.avataritem.checkbox.CheckBoxModel;
import com.ss.android.lark.searchcommon.view.avataritem.title.TitleModel;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/team/page/member/TeamMemberViewBinder;", "Lcom/ss/android/lark/team/common/ItemViewBinder;", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "Lcom/ss/android/lark/team/page/member/TeamMemberViewHolder;", "dependency", "Lcom/ss/android/lark/team/page/member/TeamMemberViewDependency;", "(Lcom/ss/android/lark/team/page/member/TeamMemberViewDependency;)V", "onCheckedChangeListener", "com/ss/android/lark/team/page/member/TeamMemberViewBinder$onCheckedChangeListener$1", "Lcom/ss/android/lark/team/page/member/TeamMemberViewBinder$onCheckedChangeListener$1;", "onClickListener", "Landroid/view/View$OnClickListener;", "onLongClickListener", "Landroid/view/View$OnLongClickListener;", "onSelectionItemClickListener", "bindViewHolder", "", "viewHolder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "inflater", "Landroid/view/LayoutInflater;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.v */
public final class TeamMemberViewBinder {

    /* renamed from: a */
    public final C55597a f137164a = new C55597a(this);

    /* renamed from: b */
    public final TeamMemberViewDependency f137165b;

    /* renamed from: c */
    private final View.OnClickListener f137166c = new View$OnClickListenerC55598b(this);

    /* renamed from: d */
    private final View.OnLongClickListener f137167d = new View$OnLongClickListenerC55599c(this);

    /* renamed from: e */
    private final View.OnClickListener f137168e = new View$OnClickListenerC55600d(this);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/team/page/member/TeamMemberViewBinder$onCheckedChangeListener$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.v$a */
    public static final class C55597a implements UDCheckBox.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberViewBinder f137169a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55597a(TeamMemberViewBinder vVar) {
            this.f137169a = vVar;
        }

        @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
        public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
            Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
            Object tag = uDCheckBox.getTag(R.id.tag_chat_chatter);
            if (!(tag instanceof TeamMemberVO)) {
                tag = null;
            }
            TeamMemberVO dVar = (TeamMemberVO) tag;
            if (dVar != null) {
                this.f137169a.f137165b.mo189341b(dVar, z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.v$b */
    static final class View$OnClickListenerC55598b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberViewBinder f137170a;

        View$OnClickListenerC55598b(TeamMemberViewBinder vVar) {
            this.f137170a = vVar;
        }

        public final void onClick(View view) {
            Object tag = view.getTag(R.id.tag_chat_chatter);
            if (!(tag instanceof TeamMemberVO)) {
                tag = null;
            }
            TeamMemberVO dVar = (TeamMemberVO) tag;
            if (dVar != null) {
                TeamMemberViewDependency wVar = this.f137170a.f137165b;
                Intrinsics.checkExpressionValueIsNotNull(view, "it");
                wVar.mo189334a(view, dVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.v$c */
    static final class View$OnLongClickListenerC55599c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberViewBinder f137171a;

        View$OnLongClickListenerC55599c(TeamMemberViewBinder vVar) {
            this.f137171a = vVar;
        }

        public final boolean onLongClick(View view) {
            Object tag = view.getTag(R.id.tag_chat_chatter);
            if (!(tag instanceof TeamMemberVO)) {
                tag = null;
            }
            TeamMemberVO dVar = (TeamMemberVO) tag;
            if (dVar == null) {
                return false;
            }
            TeamMemberViewDependency wVar = this.f137171a.f137165b;
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            wVar.mo189340b(view, dVar);
            return true;
        }
    }

    public TeamMemberViewBinder(TeamMemberViewDependency wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "dependency");
        this.f137165b = wVar;
    }

    /* renamed from: a */
    public TeamMemberViewHolder mo189527a(LayoutInflater layoutInflater) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "inflater.context");
        AvatarItemView avatarItemView = new AvatarItemView(context, null, 0, null, 14, null);
        avatarItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new TeamMemberViewHolder(avatarItemView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.member.v$d */
    static final class View$OnClickListenerC55600d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamMemberViewBinder f137172a;

        View$OnClickListenerC55600d(TeamMemberViewBinder vVar) {
            this.f137172a = vVar;
        }

        public final void onClick(View view) {
            Object tag = view.getTag(R.id.tag_chat_chatter);
            if (!(tag instanceof TeamMemberVO)) {
                tag = null;
            }
            TeamMemberVO dVar = (TeamMemberVO) tag;
            if (dVar != null && this.f137172a.f137165b.mo189343c(dVar)) {
                if (view != null) {
                    AvatarItemView avatarItemView = (AvatarItemView) view;
                    UDCheckBox uDCheckBox = (UDCheckBox) avatarItemView.findViewById(R.id.avatar_item_checkbox);
                    Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "checkBox");
                    boolean isChecked = uDCheckBox.isChecked();
                    uDCheckBox.setOnCheckedChangeListener(null);
                    avatarItemView.mo184676a(!isChecked);
                    this.f137172a.f137165b.mo189341b(dVar, !isChecked);
                    uDCheckBox.setOnCheckedChangeListener(this.f137172a.f137164a);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.view.avataritem.AvatarItemView");
            }
        }
    }

    /* renamed from: a */
    public void mo189528a(TeamMemberViewHolder xVar, TeamMemberVO dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(xVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Context context = xVar.mo189532a().getContext();
        AvatarItemView a = xVar.mo189532a();
        a.mo184662a(((ChatterAvatar.Builder) ((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo89081c(dVar.mo188945a()).mo88962a(dVar.mo188947b())).mo88967b(dVar.mo188945a())).mo88976k());
        a.mo184670a(new TitleModel(dVar.mo188949c(), false, null, 0, 14, null));
        Chatter chatter = dVar.mo188959i().getChatter();
        Intrinsics.checkExpressionValueIsNotNull(chatter, "data.chatter.chatter");
        boolean a2 = C55356a.m214819a().mo144128g().mo144152a(chatter.getZenModeEndTime());
        LarkNameTag.Companion fVar = LarkNameTag.f62897a;
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        LarkNameTag.ChatterTagBuilder b = fVar.mo90054c(context).mo90051i(dVar.mo188956g()).mo90046b(a2);
        boolean z4 = true;
        if (chatter.getType() == Chatter.ChatterType.BOT) {
            z = true;
        } else {
            z = false;
        }
        LarkNameTag.ChatterTagBuilder a3 = b.mo90045a(z);
        if (chatter.isRegistered() || chatter.getType() != Chatter.ChatterType.USER) {
            z2 = false;
        } else {
            z2 = true;
        }
        LarkNameTag.ChatterTagBuilder h = a3.mo90048f(z2).mo90047e(chatter.isFrozen()).mo90049g(dVar.mo188953e()).mo90050h(dVar.mo188955f());
        if (!WorkStatus.isInvalid(chatter.getWorkStatus())) {
            TextTag.Companion bVar = TextTag.f62987a;
            TextTag.Builder aVar = new TextTag.Builder();
            aVar.mo90139b(0);
            aVar.mo90136a(chatter.getWorkStatus().getDisplayTextNoDuration(context));
            aVar.mo90145d(R.color.function_danger_500);
            aVar.mo90147e(R.color.function_danger_100);
            LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) h, aVar.mo90154l(), false, 2, (Object) null);
        }
        List<TagInfo> tagInfos = dVar.mo188959i().getTagInfos();
        if (tagInfos != null) {
            TagInfo.Companion.mo124877a(h, tagInfos, TagFilterRule.m131800a());
        }
        a.setTag(h);
        a.setTag(R.id.tag_chat_chatter, dVar);
        if (!this.f137165b.mo189347g()) {
            a.setOnClickListener(this.f137166c);
            a.setOnLongClickListener(this.f137167d);
        } else {
            a.setOnClickListener(this.f137168e);
            a.setOnLongClickListener(null);
        }
        UDCheckBox uDCheckBox = (UDCheckBox) a.findViewById(R.id.avatar_item_checkbox);
        uDCheckBox.setOnCheckedChangeListener(null);
        if (!this.f137165b.mo189347g()) {
            a.mo184665a(new CheckBoxModel(false, true, false));
            return;
        }
        boolean a4 = this.f137165b.mo189338a(dVar);
        if (a4) {
            z3 = this.f137165b.mo189342b(dVar);
            z4 = this.f137165b.mo189343c(dVar);
        } else {
            z3 = false;
        }
        a.mo184665a(new CheckBoxModel(z3, z4, a4));
        uDCheckBox.setTag(R.id.tag_chat_chatter, dVar);
        Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "checkBox");
        uDCheckBox.setClickable(false);
        uDCheckBox.setOnCheckedChangeListener(this.f137164a);
    }
}
