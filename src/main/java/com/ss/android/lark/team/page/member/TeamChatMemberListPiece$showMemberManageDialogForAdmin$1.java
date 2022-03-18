package com.ss.android.lark.team.page.member;

import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003¨\u0006\u0004"}, d2 = {"com/ss/android/lark/team/page/member/TeamChatMemberListPiece$showMemberManageDialogForAdmin$1", "Ljava/util/ArrayList;", "Lcom/larksuite/component/ui/dialog/LKUIListItemData;", "Lkotlin/collections/ArrayList;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamChatMemberListPiece$showMemberManageDialogForAdmin$1 extends ArrayList<LKUIListItemData> {
    public int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    TeamChatMemberListPiece$showMemberManageDialogForAdmin$1() {
        String string = UIHelper.getString(R.string.Lark_Legacy_RemoveMember);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…Lark_Legacy_RemoveMember)");
        LKUIListItemData nVar = new LKUIListItemData(string);
        nVar.mo89289b(R.color.function_danger_500);
        add(nVar);
    }

    public /* bridge */ boolean contains(LKUIListItemData nVar) {
        return super.contains((Object) nVar);
    }

    public /* bridge */ int indexOf(LKUIListItemData nVar) {
        return super.indexOf((Object) nVar);
    }

    public /* bridge */ int lastIndexOf(LKUIListItemData nVar) {
        return super.lastIndexOf((Object) nVar);
    }

    @Override // java.util.List, java.util.AbstractList, java.util.ArrayList
    public final LKUIListItemData remove(int i) {
        return removeAt(i);
    }

    public LKUIListItemData removeAt(int i) {
        return (LKUIListItemData) super.remove(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof LKUIListItemData) {
            return contains((LKUIListItemData) obj);
        }
        return false;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof LKUIListItemData) {
            return indexOf((LKUIListItemData) obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof LKUIListItemData) {
            return lastIndexOf((LKUIListItemData) obj);
        }
        return -1;
    }

    public /* bridge */ boolean remove(LKUIListItemData nVar) {
        return super.remove((Object) nVar);
    }

    @Override // java.util.List, java.util.ArrayList
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof LKUIListItemData) {
            return remove((LKUIListItemData) obj);
        }
        return false;
    }
}
