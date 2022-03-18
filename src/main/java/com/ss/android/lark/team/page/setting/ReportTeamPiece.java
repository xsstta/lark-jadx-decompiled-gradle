package com.ss.android.lark.team.page.setting;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/team/page/setting/ReportTeamPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "reportTeam", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ReportTeamPiece extends Piece<ReportTeamPiece> {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo189546a() {
        /*
            r3 = this;
            com.ss.android.lark.piece.a.c r0 = r3.mo177203q()
            java.util.concurrent.ConcurrentHashMap r0 = r0.mo177165a()
            java.lang.String r1 = "intent_team"
            java.lang.Object r0 = r0.get(r1)
            r1 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "dataMap[key] ?: return null"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            boolean r2 = r0 instanceof com.ss.android.lark.team.entity.Team
            if (r2 == 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            com.ss.android.lark.team.entity.Team r0 = (com.ss.android.lark.team.entity.Team) r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.page.setting.ReportTeamPiece.mo189546a():void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/team/page/setting/ReportTeamPiece$getView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.setting.ReportTeamPiece$a */
    static final class View$OnClickListenerC55612a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ReportTeamPiece f137190a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup.MarginLayoutParams f137191b;

        /* renamed from: c */
        final /* synthetic */ Context f137192c;

        View$OnClickListenerC55612a(ReportTeamPiece reportTeamPiece, ViewGroup.MarginLayoutParams marginLayoutParams, Context context) {
            this.f137190a = reportTeamPiece;
            this.f137191b = marginLayoutParams;
            this.f137192c = context;
        }

        public final void onClick(View view) {
            this.f137190a.mo189546a();
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        TextView textView = new TextView(context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        textView.setGravity(1);
        textView.setTextSize(14.0f);
        textView.setTextColor(C57582a.m223616d(context, R.color.text_caption));
        textView.setText(C51468a.m199493c(R.string.Project_T_ReportMe, context));
        textView.setOnClickListener(new View$OnClickListenerC55612a(this, marginLayoutParams, context));
        return textView;
    }
}
