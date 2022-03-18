package com.ss.android.lark.feed.app.team.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.feed.app.team.entity.C37874d;
import com.ss.android.lark.feed.app.team.feed.ITeamFeedActionHandler;
import com.ss.android.lark.utils.UIHelper;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/feed/app/team/widget/TeamHiddenChatBinder;", "", "comparator", "Ljava/util/Comparator;", "Lcom/ss/android/lark/feed/app/team/entity/TeamChatVO;", "Lkotlin/Comparator;", "(Ljava/util/Comparator;)V", "getComparator", "()Ljava/util/Comparator;", "onBindViewHolder", "", "viewHolder", "Lcom/ss/android/lark/feed/app/team/widget/TeamHiddenChatViewHolder;", "hiddenChatList", "", "handler", "Lcom/ss/android/lark/feed/app/team/feed/ITeamFeedActionHandler;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.team.widget.b */
public final class TeamHiddenChatBinder {

    /* renamed from: a */
    private final Comparator<C37874d> f97202a;

    /* renamed from: a */
    public final Comparator<C37874d> mo138824a() {
        return this.f97202a;
    }

    public TeamHiddenChatBinder(Comparator<C37874d> comparator) {
        Intrinsics.checkParameterIsNotNull(comparator, "comparator");
        this.f97202a = comparator;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.feed.app.team.widget.b$a */
    static final class View$OnClickListenerC37893a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamHiddenChatBinder f97203a;

        /* renamed from: b */
        final /* synthetic */ ITeamFeedActionHandler f97204b;

        /* renamed from: c */
        final /* synthetic */ List f97205c;

        View$OnClickListenerC37893a(TeamHiddenChatBinder bVar, ITeamFeedActionHandler aVar, List list) {
            this.f97203a = bVar;
            this.f97204b = aVar;
            this.f97205c = list;
        }

        public final void onClick(View view) {
            ITeamFeedActionHandler aVar = this.f97204b;
            if (aVar != null) {
                aVar.mo138619a(CollectionsKt.sortedWith(this.f97205c, this.f97203a.mo138824a()));
            }
        }
    }

    /* renamed from: a */
    public final TeamHiddenChatViewHolder mo138823a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Context context = viewGroup.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
        TeamHiddenChatView teamHiddenChatView = new TeamHiddenChatView(context);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        frameLayout.addView(teamHiddenChatView);
        return new TeamHiddenChatViewHolder(frameLayout);
    }

    /* renamed from: a */
    public final void mo138825a(TeamHiddenChatViewHolder cVar, List<C37874d> list, ITeamFeedActionHandler aVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(list, "hiddenChatList");
        cVar.mo138827l().setText(UIHelper.mustacheFormat((int) R.string.Project_MV_NumberHiddenGroups, "number", String.valueOf(list.size())));
        cVar.mo138827l().setOnClickListener(new View$OnClickListenerC37893a(this, aVar, list));
    }
}
