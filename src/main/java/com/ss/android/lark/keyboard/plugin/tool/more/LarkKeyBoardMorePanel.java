package com.ss.android.lark.keyboard.plugin.tool.more;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;

public class LarkKeyBoardMorePanel extends LinearLayout {

    /* renamed from: a */
    private RecyclerView f104152a;

    /* renamed from: b */
    private LarkRecyclerViewBaseAdapter f104153b;

    public LarkRecyclerViewBaseAdapter getAdapter() {
        return this.f104153b;
    }

    public LarkKeyBoardMorePanel(Context context) {
        this(context, null);
    }

    public void setAdapter(LarkRecyclerViewBaseAdapter larkRecyclerViewBaseAdapter) {
        if (larkRecyclerViewBaseAdapter != null) {
            this.f104153b = larkRecyclerViewBaseAdapter;
            this.f104152a.setAdapter(larkRecyclerViewBaseAdapter);
        }
    }

    /* renamed from: a */
    private void m162263a(Context context) {
        addView(View.inflate(context, R.layout.kb_chat_keyboard_more_panel, null));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_items);
        this.f104152a = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 4));
    }

    public LarkKeyBoardMorePanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public LarkKeyBoardMorePanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m162263a(context);
    }
}
