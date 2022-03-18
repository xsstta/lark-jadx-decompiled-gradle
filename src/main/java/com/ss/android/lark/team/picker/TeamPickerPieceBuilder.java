package com.ss.android.lark.team.picker;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.team.picker.add_group.AddGroupPickerPiece;
import com.ss.android.lark.team.picker.add_group.AddGroupPickerTitlePiece;
import com.ss.android.lark.team.picker.add_member.AddMemberPickerPiece;
import com.ss.android.lark.team.picker.add_member.AddMemberPickerTitlePiece;
import com.ss.android.lark.team.picker.base.BaseTeamPickerPiece;
import com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece;
import com.ss.android.lark.team.picker.create_team.CreateTeamPickerPiece;
import com.ss.android.lark.team.picker.create_team.CreateTeamPickerTitlePiece;
import com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerPiece;
import com.ss.android.lark.team.picker.upgrade_group.UpgradeGroupPickerTitlePiece;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/team/picker/TeamPickerPieceBuilder;", "", "()V", "build", "Lkotlin/Pair;", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerTitlePiece;", "Lcom/ss/android/lark/team/picker/base/BaseTeamPickerPiece;", ShareHitPoint.f121869d, "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.picker.a */
public final class TeamPickerPieceBuilder {

    /* renamed from: a */
    public static final TeamPickerPieceBuilder f137272a = new TeamPickerPieceBuilder();

    private TeamPickerPieceBuilder() {
    }

    /* renamed from: a */
    public final Pair<BaseTeamPickerTitlePiece, BaseTeamPickerPiece> mo189633a(int i) {
        if (i == 0) {
            return TuplesKt.to(new CreateTeamPickerTitlePiece(), new CreateTeamPickerPiece());
        }
        if (i == 1) {
            return TuplesKt.to(new AddGroupPickerTitlePiece(), new AddGroupPickerPiece());
        }
        if (i == 2) {
            return TuplesKt.to(new UpgradeGroupPickerTitlePiece(), new UpgradeGroupPickerPiece());
        }
        if (i != 3) {
            return null;
        }
        return TuplesKt.to(new AddMemberPickerTitlePiece(), new AddMemberPickerPiece());
    }
}
