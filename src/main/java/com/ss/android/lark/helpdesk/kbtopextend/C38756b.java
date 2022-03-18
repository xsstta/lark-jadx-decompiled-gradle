package com.ss.android.lark.helpdesk.kbtopextend;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;

/* renamed from: com.ss.android.lark.helpdesk.kbtopextend.b */
public class C38756b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private int f99684a;

    public C38756b(Context context, int i) {
        this.f99684a = UIUtils.dp2px(context, (float) i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) > 0) {
            rect.left = this.f99684a;
        }
    }
}
