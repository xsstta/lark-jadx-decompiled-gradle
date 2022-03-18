package com.ss.android.lark.team.page.upgrade_chat;

import android.content.Intent;
import android.view.View;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.core.IPieceExport;
import com.ss.android.lark.piece.core.PieceContext;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.common.piece.SettingDividerExport;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.common.piece.TeamNameInputExport;
import com.ss.android.lark.team.picker.TeamPickerActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/page/upgrade_chat/PickGroupPiece;", "Lcom/ss/android/lark/team/common/piece/SettingJumpPiece;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "", "updateOtherPiece", "searchInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PickGroupPiece extends SettingJumpPiece {
    @Override // com.ss.android.lark.piece.core.Piece
    public void onCreate() {
        super.onCreate();
        mo177205s().setOnClickListener(new View$OnClickListenerC55638a(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.PickGroupPiece$a */
    static final class View$OnClickListenerC55638a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PickGroupPiece f137255a;

        View$OnClickListenerC55638a(PickGroupPiece pickGroupPiece) {
            this.f137255a = pickGroupPiece;
        }

        public final void onClick(View view) {
            Intrinsics.checkExpressionValueIsNotNull(view, "it");
            Intent intent = new Intent(view.getContext(), TeamPickerActivity.class);
            intent.putExtra("intent_picker_type", 2);
            this.f137255a.mo177187a(intent, 4);
        }
    }

    /* renamed from: a */
    private final void m215562a(SearchChatInfo searchChatInfo) {
        IPieceExport aVar;
        boolean z;
        String title = searchChatInfo.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, "searchInfo.title");
        mo189011c(title);
        mo177203q().mo177168a("intent_search_info", searchChatInfo);
        PickGroupPiece pickGroupPiece = this;
        PieceContext r = pickGroupPiece.mo177204r();
        IPieceExport aVar2 = null;
        if (r != null) {
            aVar = r.mo177221a(R.id.upgrade_to_team_name_bottom_divider, SettingDividerExport.class);
        } else {
            aVar = null;
        }
        SettingDividerExport eVar = (SettingDividerExport) aVar;
        if (eVar != null) {
            eVar.mo189008a(UIUtils.dp2px(mo177205s().getContext(), 16.0f));
        }
        PieceContext r2 = pickGroupPiece.mo177204r();
        if (r2 != null) {
            aVar2 = r2.mo177222a(TeamNameInputExport.class);
        }
        TeamNameInputExport hVar = (TeamNameInputExport) aVar2;
        if (hVar != null) {
            String b = hVar.mo189033a().mo5927b();
            if (b == null || b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String title2 = searchChatInfo.getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title2, "searchInfo.title");
                hVar.mo189034a(title2);
            }
        }
    }

    @Override // com.ss.android.lark.piece.core.Piece
    /* renamed from: a */
    public boolean mo128689a(int i, int i2, Intent intent) {
        Serializable serializableExtra;
        if (i != 4 || i2 != -1) {
            return false;
        }
        if (intent == null || (serializableExtra = intent.getSerializableExtra("intent_search_info")) == null) {
            return true;
        }
        if (serializableExtra != null) {
            m215562a((SearchChatInfo) serializableExtra);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.searchcommon.dto.info.SearchChatInfo");
    }
}
