package com.ss.android.lark.team.picker.confirm;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.ui.p2892a.C57582a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/team/picker/confirm/ConfirmChatInfoPiece;", "Lcom/ss/android/lark/piece/core/Piece;", "()V", "mObserver", "com/ss/android/lark/team/picker/confirm/ConfirmChatInfoPiece$mObserver$1", "Lcom/ss/android/lark/team/picker/confirm/ConfirmChatInfoPiece$mObserver$1;", "mSubtitleView", "Landroid/widget/TextView;", "getView", "Landroid/view/View;", "context", "Landroid/content/Context;", "layoutConfig", "Landroid/view/ViewGroup$MarginLayoutParams;", "onCreate", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ConfirmChatInfoPiece extends Piece<ConfirmChatInfoPiece> {

    /* renamed from: a */
    public TextView f137302a;

    /* renamed from: b */
    private final C55658a f137303b = new C55658a(this, true);

    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177190a("intent_search_info", this.f137303b);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/picker/confirm/ConfirmChatInfoPiece$mObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.picker.confirm.ConfirmChatInfoPiece$a */
    public static final class C55658a extends DataObserver<SearchChatInfo> {

        /* renamed from: a */
        final /* synthetic */ ConfirmChatInfoPiece f137304a;

        /* renamed from: a */
        public void mo127664a(SearchChatInfo searchChatInfo) {
            TextView textView;
            if (searchChatInfo != null && (textView = this.f137304a.f137302a) != null) {
                textView.setText(searchChatInfo.getTitle());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55658a(ConfirmChatInfoPiece confirmChatInfoPiece, boolean z) {
            super(z);
            this.f137304a = confirmChatInfoPiece;
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public View mo127619a(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(marginLayoutParams, "layoutConfig");
        int a = C51468a.m199485a(0.5f, context);
        int a2 = C51468a.m199487a((int) R.color.line_divider_default, context);
        marginLayoutParams.width = -1;
        marginLayoutParams.height = -2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setBackground(C51468a.m199492b(R.drawable.item_bg_selector_c11, context));
        ConstraintLayout constraintLayout2 = constraintLayout;
        View view = new View(constraintLayout2.getContext());
        view.setId(R.id.top_divider);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, a);
        layoutParams.f2825q = 0;
        layoutParams.f2827s = 0;
        layoutParams.f2816h = 0;
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(a2);
        constraintLayout2.addView(view);
        View view2 = new View(constraintLayout2.getContext());
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams(0, a);
        layoutParams2.f2825q = 0;
        layoutParams2.f2827s = 0;
        layoutParams2.f2817i = R.id.setting_jump_subtitle;
        layoutParams2.topMargin = C51468a.m199486a(13);
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(a2);
        constraintLayout2.addView(view2);
        TextView textView = new TextView(constraintLayout2.getContext());
        textView.setId(R.id.setting_jump_title);
        int a3 = C51468a.m199486a(16);
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams3.f2825q = 0;
        layoutParams3.f2827s = 0;
        layoutParams3.f2817i = R.id.top_divider;
        layoutParams3.setMarginStart(a3);
        layoutParams3.setMarginEnd(a3);
        layoutParams3.topMargin = C51468a.m199486a(13);
        textView.setLayoutParams(layoutParams3);
        textView.setTextColor(C57582a.m223616d(context, R.color.text_title));
        textView.setTextSize(14.0f);
        textView.setText(R.string.Project_MV_AddGroupsRightNow);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(constraintLayout2.getContext());
        textView2.setId(R.id.setting_jump_subtitle);
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams4.f2825q = R.id.setting_jump_title;
        layoutParams4.f2827s = R.id.setting_jump_title;
        layoutParams4.f2817i = R.id.setting_jump_title;
        layoutParams4.topMargin = C51468a.m199486a(8);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(C57582a.m223616d(context, R.color.text_title));
        textView2.setTextSize(16.0f);
        this.f137302a = textView2;
        constraintLayout2.addView(textView2);
        return constraintLayout;
    }
}
