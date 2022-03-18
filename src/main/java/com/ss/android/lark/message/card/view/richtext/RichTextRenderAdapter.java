package com.ss.android.lark.message.card.view.richtext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.ui.dialog.C25645r;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/message/card/view/richtext/RichTextRenderAdapter;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter;", "context", "Landroid/content/Context;", "itemLayout", "", "checkIndex", "(Landroid/content/Context;II)V", "getContext", "()Landroid/content/Context;", "getItemLayout", "()I", "onBindViewHolder", "", "holder", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RichTextRenderViewHolder", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.card.view.richtext.e */
public final class RichTextRenderAdapter extends UDBaseListDialogAdapter {

    /* renamed from: a */
    private final Context f114919a;

    /* renamed from: c */
    private final int f114920c;

    /* renamed from: d */
    private final int f114921d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/message/card/view/richtext/RichTextRenderAdapter$RichTextRenderViewHolder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseListDialogAdapter$UDDialogListItemViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "checkBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getCheckBox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.message.card.view.richtext.e$a */
    public static final class RichTextRenderViewHolder extends UDBaseListDialogAdapter.UDDialogListItemViewHolder {

        /* renamed from: a */
        private final UDCheckBox f114922a;

        /* renamed from: b */
        public final UDCheckBox mo160201b() {
            return this.f114922a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RichTextRenderViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            UDCheckBox uDCheckBox = (UDCheckBox) view.findViewById(R.id.lkui_dialog_content_item_cb);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "itemView.lkui_dialog_content_item_cb");
            this.f114922a = uDCheckBox;
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
    /* renamed from: a */
    public void onBindViewHolder(UDBaseListDialogAdapter.UDDialogListItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        super.onBindViewHolder(aVar, i);
        UDCheckBox uDCheckBox = null;
        if (!(aVar instanceof RichTextRenderViewHolder)) {
            aVar = null;
        }
        RichTextRenderViewHolder aVar2 = (RichTextRenderViewHolder) aVar;
        if (i == this.f114921d) {
            if (aVar2 != null) {
                uDCheckBox = aVar2.mo160201b();
            }
            if (uDCheckBox != null) {
                uDCheckBox.setVisibility(0);
            }
            if (uDCheckBox != null) {
                uDCheckBox.setChecked(true);
                return;
            }
            return;
        }
        if (aVar2 != null) {
            uDCheckBox = aVar2.mo160201b();
        }
        if (uDCheckBox != null) {
            uDCheckBox.setVisibility(8);
        }
        if (uDCheckBox != null) {
            uDCheckBox.setChecked(false);
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
    /* renamed from: b */
    public UDBaseListDialogAdapter.UDDialogListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f114919a).inflate(this.f114920c, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…temLayout, parent, false)");
        C25645r.m91841a(inflate);
        return new RichTextRenderViewHolder(inflate);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RichTextRenderAdapter(Context context, int i, int i2) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f114919a = context;
        this.f114920c = i;
        this.f114921d = i2;
    }
}
