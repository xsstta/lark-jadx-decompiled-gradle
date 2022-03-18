package com.ss.android.lark.team.picker.confirm;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/team/picker/confirm/ConfirmChatTypePiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "mClickListener", "Landroid/view/View$OnClickListener;", "mHintView", "Landroid/widget/TextView;", "mObserver", "com/ss/android/lark/team/picker/confirm/ConfirmChatTypePiece$mObserver$1", "Lcom/ss/android/lark/team/picker/confirm/ConfirmChatTypePiece$mObserver$1;", "getTeamChatTypeTextRes", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onActivityResult", "", "requestCode", "resultCode", "Landroid/content/Intent;", "onCreate", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ConfirmChatTypePiece extends Piece<ConfirmChatTypePiece> {

    /* renamed from: a */
    public TextView f137305a;

    /* renamed from: b */
    private final C55660b f137306b = new C55660b(this, true);

    /* renamed from: g */
    private final View.OnClickListener f137307g = new View$OnClickListenerC55659a(this);

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_team_chat_type", this.f137306b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/picker/confirm/ConfirmChatTypePiece$mObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/chat/entity/chat/TeamChatType;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece$b */
    public static final class C55660b extends DataObserver<TeamChatType> {

        /* renamed from: a */
        final /* synthetic */ ConfirmChatTypePiece f137309a;

        /* renamed from: a */
        public void mo127664a(TeamChatType teamChatType) {
            TextView textView = this.f137309a.f137305a;
            if (textView != null) {
                textView.setText(this.f137309a.mo189673a(teamChatType));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55660b(ConfirmChatTypePiece confirmChatTypePiece, boolean z) {
            super(z);
            this.f137309a = confirmChatTypePiece;
        }
    }

    /* renamed from: a */
    public final int mo189673a(TeamChatType teamChatType) {
        if (teamChatType != null) {
            int i = C55668a.f137330a[teamChatType.ordinal()];
            if (i == 1) {
                return R.string.Project_MV_GroupPrivacyPrivate;
            }
            if (i != 2) {
                return R.string.Project_T_SelectGroupsCanSee;
            }
            return R.string.Project_MV_GroupPrivacyStandard;
        }
        return R.string.Project_T_SelectGroupsCanSee;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece$a */
    static final class View$OnClickListenerC55659a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ConfirmChatTypePiece f137308a;

        View$OnClickListenerC55659a(ConfirmChatTypePiece confirmChatTypePiece) {
            this.f137308a = confirmChatTypePiece;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
            if ((r5 instanceof com.ss.android.lark.chat.entity.chat.TeamChatType) != false) goto L_0x001e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece r5 = r4.f137308a
                com.ss.android.lark.piece.a.c r5 = r5.mo177203q()
                java.util.concurrent.ConcurrentHashMap r5 = r5.mo177165a()
                java.lang.String r0 = "intent_team_chat_type"
                java.lang.Object r5 = r5.get(r0)
                r1 = 0
                if (r5 == 0) goto L_0x001d
                java.lang.String r2 = "dataMap[key] ?: return null"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r2)
                boolean r2 = r5 instanceof com.ss.android.lark.chat.entity.chat.TeamChatType
                if (r2 == 0) goto L_0x001d
                goto L_0x001e
            L_0x001d:
                r5 = r1
            L_0x001e:
                com.ss.android.lark.chat.entity.chat.TeamChatType r5 = (com.ss.android.lark.chat.entity.chat.TeamChatType) r5
                if (r5 == 0) goto L_0x003b
                android.content.Intent r1 = new android.content.Intent
                com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece r2 = r4.f137308a
                android.content.Context r2 = r2.mo177180C()
                java.lang.Class<com.ss.android.lark.team.page.TeamChatTypeSelectActivity> r3 = com.ss.android.lark.team.page.TeamChatTypeSelectActivity.class
                r1.<init>(r2, r3)
                java.io.Serializable r5 = (java.io.Serializable) r5
                r1.putExtra(r0, r5)
                com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece r5 = r4.f137308a
                r0 = 16
                r5.mo177187a(r1, r0)
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece.View$OnClickListenerC55659a.onClick(android.view.View):void");
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackground(C51468a.m199492b(R.drawable.item_bg_selector_c11, context));
        constraintLayout.setOnClickListener(this.f137307g);
        int a = C51468a.m199486a(16);
        int a2 = C51468a.m199485a(0.5f, context);
        int a3 = C51468a.m199487a((int) R.color.line_divider_default, context);
        ConstraintLayout constraintLayout2 = constraintLayout;
        View view = new View(constraintLayout2.getContext());
        view.setId(R.id.top_divider);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, a2);
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        layoutParams.f2816h = 0;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a3);
        constraintLayout2.addView(view);
        View view2 = new View(constraintLayout2.getContext());
        view2.setId(R.id.bottom_divider);
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, a2);
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        layoutParams2.f2817i = R.id.top_divider;
        layoutParams2.topMargin = C51468a.m199486a(54);
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(a3);
        constraintLayout2.addView(view2);
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setId(R.id.setting_jump_title);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams3.f2825q = 0;
        layoutParams3.f2816h = 0;
        layoutParams3.f2819k = 0;
        layoutParams3.setMarginStart(a);
        textView.setLayoutParams(layoutParams3);
        textView.setTextColor(C57582a.m223616d(context, R.color.text_title));
        textView.setTextSize(16.0f);
        textView.setText(R.string.Project_MV_PrivacySettings);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams4.f2824p = R.id.setting_jump_title;
        layoutParams4.f2816h = R.id.setting_jump_title;
        layoutParams4.f2819k = R.id.setting_jump_title;
        layoutParams4.setMarginStart(C51468a.m199486a(2));
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(C57582a.m223616d(context, R.color.function_danger_500));
        textView2.setTextSize(14.0f);
        textView2.setText("*");
        constraintLayout2.addView(textView2);
        TextView textView3 = new TextView(constraintLayout2.getContext());
        textView3.setId(R.id.setting_jump_hint);
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams5.f2816h = 0;
        layoutParams5.f2819k = 0;
        layoutParams5.f2826r = R.id.setting_jump_arrow;
        layoutParams5.setMarginEnd(C51468a.m199486a(8));
        textView3.setLayoutParams(layoutParams5);
        textView3.setTextColor(C57582a.m223616d(context, R.color.text_placeholder));
        textView3.setTextSize(14.0f);
        this.f137305a = textView3;
        constraintLayout2.addView(textView3);
        ImageView imageView = new ImageView(constraintLayout2.getContext());
        imageView.setId(R.id.setting_jump_arrow);
        ConstraintLayout.LayoutParams layoutParams6 = new ConstraintLayout.LayoutParams(a, a);
        layoutParams6.setMarginEnd(a);
        layoutParams6.f2816h = 0;
        layoutParams6.f2819k = 0;
        layoutParams6.f2827s = 0;
        imageView.setLayoutParams(layoutParams6);
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_right_outlined, C57582a.m223616d(context, R.color.icon_n3)));
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        constraintLayout2.addView(imageView);
        return constraintLayout;
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Serializable serializable;
        if (16 != i) {
            return super.mo128689a(i, i2, intent);
        }
        if (-1 != i2) {
            return true;
        }
        TeamChatType teamChatType = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("result_team_chat_type");
        } else {
            serializable = null;
        }
        if (serializable instanceof TeamChatType) {
            teamChatType = serializable;
        }
        TeamChatType teamChatType2 = teamChatType;
        if (teamChatType2 == null) {
            return true;
        }
        mo177203q().mo177168a("intent_team_chat_type", teamChatType2);
        return true;
    }
}
