package com.bytedance.ee.bear.todocenter.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.larksuite.suite.R;

public class TodoEmptyView extends FrameLayout {

    /* renamed from: a */
    private C11748b f31577a;

    /* renamed from: b */
    private C11749c f31578b;

    /* renamed from: c */
    private C11747a f31579c;

    public enum EmptyState {
        LOADING,
        NO_NET,
        EMPTY_CONTENT
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.TodoEmptyView$a */
    public class C11747a {

        /* renamed from: b */
        private SpaceEmptyState f31581b;

        /* renamed from: a */
        public void mo44971a() {
            this.f31581b.setVisibility(8);
        }

        /* renamed from: a */
        public void mo44972a(View.OnClickListener onClickListener) {
            this.f31581b.setVisibility(0);
            this.f31581b.setPrimaryClickListener(onClickListener);
        }

        public C11747a() {
            Context context = TodoEmptyView.this.getContext();
            this.f31581b = new SpaceEmptyState(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 1;
            this.f31581b.setLayoutParams(layoutParams);
            this.f31581b.setImageSizeResource(R.dimen.space_kit_emptystate_image_size_middle);
            this.f31581b.setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_positive_no_data));
            this.f31581b.setTitle(context.getString(R.string.CreationMobile_Docs_TaskCenter_NoTask_Title_Tooltip));
            this.f31581b.setDesc(context.getString(R.string.CreationMobile_Docs_TaskCenter_NoTask_Subtitle_Tooltip));
            this.f31581b.setPrimaryText(context.getString(R.string.CreationMobile_Docs_TaskCenter_NewDoc_Button));
            TodoEmptyView.this.addView(this.f31581b, layoutParams);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.TodoEmptyView$b */
    public class C11748b {

        /* renamed from: b */
        private View f31583b;

        /* renamed from: a */
        public void mo44973a() {
            this.f31583b.setVisibility(0);
        }

        /* renamed from: b */
        public void mo44974b() {
            this.f31583b.setVisibility(8);
        }

        C11748b() {
            View inflate = View.inflate(TodoEmptyView.this.getContext(), R.layout.todo_empty_view_loading_layout, null);
            this.f31583b = inflate;
            TodoEmptyView.this.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.ui.widget.TodoEmptyView$c */
    public class C11749c {

        /* renamed from: a */
        private View f31584a;

        /* renamed from: a */
        public void mo44975a() {
            this.f31584a.setVisibility(8);
        }
    }

    /* renamed from: b */
    public void mo44967b() {
        C11748b bVar = this.f31577a;
        if (bVar != null) {
            bVar.mo44974b();
        }
    }

    /* renamed from: d */
    public void mo44969d() {
        C11749c cVar = this.f31578b;
        if (cVar != null) {
            cVar.mo44975a();
        }
    }

    /* renamed from: e */
    public void mo44970e() {
        C11747a aVar = this.f31579c;
        if (aVar != null) {
            aVar.mo44971a();
        }
    }

    /* renamed from: c */
    public void mo44968c() {
        mo44969d();
        mo44967b();
        mo44970e();
    }

    /* renamed from: a */
    public void mo44965a() {
        if (this.f31577a == null) {
            this.f31577a = new C11748b();
        }
        this.f31577a.mo44973a();
        mo44970e();
        mo44969d();
    }

    public TodoEmptyView(Context context) {
        super(context, null);
    }

    /* renamed from: a */
    public void mo44966a(View.OnClickListener onClickListener) {
        if (this.f31579c == null) {
            this.f31579c = new C11747a();
        }
        this.f31579c.mo44972a(onClickListener);
        mo44967b();
        mo44969d();
    }

    public TodoEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TodoEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
