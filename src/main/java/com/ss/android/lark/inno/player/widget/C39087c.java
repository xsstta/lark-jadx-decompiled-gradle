package com.ss.android.lark.inno.player.widget;

import com.google.android.material.bottomsheet.C22184b;
import com.ss.android.lark.inno.player.widget.PlayerOptionBottomDialog;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"showPlayerOptionDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "title", "", "options", "", "selection", "", "onItemClickListener", "Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder$OnItemClickListener;", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Lcom/ss/android/lark/inno/player/widget/PlayerOptionBottomDialog$Builder$OnItemClickListener;)Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "mm_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.inno.player.widget.c */
public final class C39087c {
    /* renamed from: a */
    public static final C22184b m154330a(String str, List<String> list, Integer num, PlayerOptionBottomDialog.Builder.OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(list, "options");
        PlayerOptionBottomDialog.Builder aVar2 = new PlayerOptionBottomDialog.Builder();
        aVar2.mo142949a(str);
        aVar2.mo142950a(CollectionsKt.toMutableList((Collection) list));
        aVar2.mo142948a(num);
        aVar2.mo142947a(aVar);
        return aVar2.mo142954e();
    }
}
