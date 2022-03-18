package com.ss.android.lark.team.util;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import com.larksuite.suite.R;
import com.ss.android.lark.piece.p2465b.C51468a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/team/util/TeamMenuAdapter;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "context", "Landroid/content/Context;", "menuItemStateChecker", "Lkotlin/Function1;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "", "holder", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "position", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.f.f */
public final class TeamMenuAdapter extends UDBaseListDialogAdapter {

    /* renamed from: a */
    private final Context f136872a;

    /* renamed from: c */
    private final Function1<Integer, Boolean> f136873c;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TeamMenuAdapter(Context context, Function1<? super Integer, Boolean> function1) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(function1, "menuItemStateChecker");
        this.f136872a = context;
        this.f136873c = function1;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
    /* renamed from: a */
    public void onBindViewHolder(UDBaseListDialogAdapter.UDDialogListItemViewHolder aVar, int i) {
        int i2;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onBindViewHolder(aVar, i);
        if (this.f136873c.invoke(Integer.valueOf(i)).booleanValue()) {
            i2 = R.color.text_title;
        } else {
            i2 = R.color.text_link_disable;
        }
        aVar.mo90865a().setTextColor(C51468a.m199487a(i2, this.f136872a));
    }
}
