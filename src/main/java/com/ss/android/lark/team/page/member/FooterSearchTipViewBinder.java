package com.ss.android.lark.team.page.member;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.bean.TeamMemberVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/team/page/member/FooterSearchTipViewBinder;", "Lcom/ss/android/lark/team/common/ItemViewBinder;", "Lcom/ss/android/lark/team/bean/TeamMemberVO;", "Lcom/ss/android/lark/team/page/member/FooterSearchTipViewHolder;", "()V", "bindViewHolder", "", "viewHolder", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "createViewHolder", "inflater", "Landroid/view/LayoutInflater;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.page.member.d */
public final class FooterSearchTipViewBinder {
    /* renamed from: a */
    public void mo189508a(FooterSearchTipViewHolder eVar, TeamMemberVO dVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "viewHolder");
        Intrinsics.checkParameterIsNotNull(dVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* renamed from: a */
    public FooterSearchTipViewHolder mo189507a(LayoutInflater layoutInflater) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        TextView textView = new TextView(context);
        textView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        textView.setPadding(C51468a.m199486a(16), C51468a.m199486a(16), C51468a.m199486a(16), C51468a.m199486a(20));
        textView.setGravity(1);
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        textView.setText(C51468a.m199493c(R.string.Lark_Group_HugeGroup_MemberList_Bottom, context));
        textView.setTextColor(C51468a.m199487a((int) R.color.text_placeholder, context));
        textView.setTextSize(12.0f);
        return new FooterSearchTipViewHolder(textView);
    }
}
