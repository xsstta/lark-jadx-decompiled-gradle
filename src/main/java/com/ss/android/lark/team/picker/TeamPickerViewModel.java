package com.ss.android.lark.team.picker;

import androidx.lifecycle.C1177w;
import com.ss.android.lark.piece.data.PieceViewModel;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.team.entity.PickEntities;
import com.ss.android.lark.team.entity.Team;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0018J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004J\u0006\u0010%\u001a\u00020&J\"\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R)\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00180\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/ss/android/lark/team/picker/TeamPickerViewModel;", "Lcom/ss/android/lark/piece/data/PieceViewModel;", "()V", "chatId", "", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "preSelectedIdList", "", "preSelectedList", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "getPreSelectedList", "()Ljava/util/List;", "setPreSelectedList", "(Ljava/util/List;)V", "selectedCount", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Triple;", "", "getSelectedCount", "()Landroidx/lifecycle/MutableLiveData;", "selectedItems", "", "getSelectedItems", "team", "Lcom/ss/android/lark/team/entity/Team;", "getTeam", "()Lcom/ss/android/lark/team/entity/Team;", "setTeam", "(Lcom/ss/android/lark/team/entity/Team;)V", "getSelectedPickEntities", "Lcom/ss/android/lark/team/entity/PickEntities;", "isPreSelected", "", "id", "setup", "", "updateListChanged", "ids", "infoList", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.picker.b */
public final class TeamPickerViewModel extends PieceViewModel {
    private String chatId;
    private final List<String> preSelectedIdList = new ArrayList();
    private List<SearchBaseInfo> preSelectedList = new ArrayList();
    private final C1177w<Triple<Integer, Integer, Integer>> selectedCount = new C1177w<>(new Triple(0, 0, 0));
    private final C1177w<List<SearchBaseInfo>> selectedItems = new C1177w<>();
    private Team team;

    public final String getChatId() {
        return this.chatId;
    }

    public final List<SearchBaseInfo> getPreSelectedList() {
        return this.preSelectedList;
    }

    public final C1177w<Triple<Integer, Integer, Integer>> getSelectedCount() {
        return this.selectedCount;
    }

    public final C1177w<List<SearchBaseInfo>> getSelectedItems() {
        return this.selectedItems;
    }

    public final Team getTeam() {
        return this.team;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        if ((r0 instanceof com.ss.android.lark.team.entity.Team) != false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setup() {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.team.picker.TeamPickerViewModel.setup():void");
    }

    public final List<PickEntities> getSelectedPickEntities() {
        PickEntities pickEntities = new PickEntities();
        pickEntities.setPickType(PickEntities.PickType.USER);
        pickEntities.setPickIds(new ArrayList());
        PickEntities pickEntities2 = new PickEntities();
        pickEntities2.setPickType(PickEntities.PickType.CHAT);
        pickEntities2.setPickIds(new ArrayList());
        PickEntities pickEntities3 = new PickEntities();
        pickEntities3.setPickType(PickEntities.PickType.DEPT);
        pickEntities3.setPickIds(new ArrayList());
        List<SearchBaseInfo> b = this.selectedItems.mo5927b();
        if (b != null) {
            for (SearchBaseInfo searchBaseInfo : b) {
                if (searchBaseInfo instanceof SearchChatterInfo) {
                    pickEntities.getPickIds().add(searchBaseInfo.getId());
                } else if (searchBaseInfo instanceof SearchChatInfo) {
                    pickEntities2.getPickIds().add(searchBaseInfo.getId());
                } else if (searchBaseInfo instanceof SearchDepartmentInfo) {
                    pickEntities3.getPickIds().add(searchBaseInfo.getId());
                }
            }
        }
        return CollectionsKt.listOf((Object[]) new PickEntities[]{pickEntities, pickEntities2, pickEntities3});
    }

    public final void setChatId(String str) {
        this.chatId = str;
    }

    public final void setTeam(Team team2) {
        this.team = team2;
    }

    public final void setPreSelectedList(List<SearchBaseInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.preSelectedList = list;
    }

    public final boolean isPreSelected(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        return this.preSelectedIdList.contains(str);
    }

    public final void updateListChanged(List<String> list, List<SearchBaseInfo> list2) {
        Intrinsics.checkParameterIsNotNull(list, "ids");
        Intrinsics.checkParameterIsNotNull(list2, "infoList");
        this.selectedItems.mo5926a(list2);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (SearchBaseInfo searchBaseInfo : list2) {
            int type = searchBaseInfo.getType();
            if (type == 1) {
                i++;
            } else if (type == 2) {
                i2++;
            } else if (type == 17) {
                i3++;
            }
        }
        this.selectedCount.mo5926a(new Triple<>(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }
}
