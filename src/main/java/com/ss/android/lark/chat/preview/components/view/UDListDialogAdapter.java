package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/UDListDialogAdapter;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "context", "Landroid/content/Context;", "selectItemPosition", "", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "getSelectItemPosition", "()I", "onBindViewHolder", "", "holder", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "position", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.g */
public final class UDListDialogAdapter extends UDBaseListDialogAdapter {

    /* renamed from: a */
    private final Context f88293a;

    /* renamed from: c */
    private final int f88294c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDListDialogAdapter(Context context, int i) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f88293a = context;
        this.f88294c = i;
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
    /* renamed from: a */
    public void onBindViewHolder(UDBaseListDialogAdapter.UDDialogListItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onBindViewHolder(aVar, i);
        if (i == this.f88294c) {
            aVar.mo90865a().setTextColor(this.f88293a.getResources().getColor(R.color.primary_pri_500));
        } else {
            aVar.mo90865a().setTextColor(this.f88293a.getResources().getColor(R.color.text_title));
        }
    }
}
