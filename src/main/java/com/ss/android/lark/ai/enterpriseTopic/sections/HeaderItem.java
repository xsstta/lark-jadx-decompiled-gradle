package com.ss.android.lark.ai.enterpriseTopic.sections;

import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/sections/HeaderItem;", "Lcom/ss/android/lark/ai/enterpriseTopic/sections/ElementItem;", "sectionName", "", "(Ljava/lang/String;)V", "bind", "", "holder", "Lcom/ss/android/lark/widget/recyclerview/item/ItemViewHolder;", "position", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.b.d */
public final class HeaderItem extends ElementItem {

    /* renamed from: a */
    private final String f71787a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderItem(String str) {
        super(R.layout.section_header);
        Intrinsics.checkParameterIsNotNull(str, "sectionName");
        this.f71787a = str;
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        TextView textView = (TextView) cVar.mo200081a(R.id.tv_title);
        if (textView != null) {
            textView.setText(this.f71787a);
        }
    }
}
