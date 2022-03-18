package com.ss.android.lark.team.common.piece;

import androidx.lifecycle.LiveData;
import com.ss.android.lark.piece.core.IPieceExport;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/team/common/piece/TeamNameInputExport;", "Lcom/ss/android/lark/piece/core/IPieceExport;", "clearFocus", "", "focusChangeLiveData", "Landroidx/lifecycle/LiveData;", "", "inputContentLiveData", "", "onNameDuplicated", "updateInputContent", "content", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.common.piece.h */
public interface TeamNameInputExport extends IPieceExport {
    /* renamed from: a */
    LiveData<String> mo189033a();

    /* renamed from: a */
    void mo189034a(String str);

    /* renamed from: b */
    LiveData<Boolean> mo189035b();

    void bm_();

    /* renamed from: d */
    void mo189039d();
}
