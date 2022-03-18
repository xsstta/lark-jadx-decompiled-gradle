package com.bytedance.ee.bear.lark.selector;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.bytedance.ee.bear.lark.selector.DocsConfirmAdapter;
import com.bytedance.ee.bear.lark.selector.base.AbstractC8101b;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class DocsConfirmView implements AbstractC8101b<DocSelectorViewData> {

    /* renamed from: a */
    public AbstractC8101b.AbstractC8103b f21614a;

    /* renamed from: b */
    public DocsConfirmAdapter f21615b;

    /* renamed from: c */
    private Context f21616c;
    @BindView(8430)
    RecyclerView mRecyclerView;
    @BindView(10082)
    CommonTitleBar mTitleBar;

    /* renamed from: a */
    public void setViewDelegate(AbstractC8101b.AbstractC8102a aVar) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    private void m32306a() {
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f21616c, 1, false));
        DocsConfirmAdapter docsConfirmAdapter = new DocsConfirmAdapter(this.f21616c);
        this.f21615b = docsConfirmAdapter;
        this.mRecyclerView.setAdapter(docsConfirmAdapter);
        this.f21615b.mo31202a(new DocsConfirmAdapter.AbstractC8069a() {
            /* class com.bytedance.ee.bear.lark.selector.DocsConfirmView.C80712 */

            @Override // com.bytedance.ee.bear.lark.selector.DocsConfirmAdapter.AbstractC8069a
            /* renamed from: a */
            public void mo31204a(int i) {
                if (i < 0) {
                    i = 0;
                }
                DocsConfirmView.this.mTitleBar.setTitle(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectedCountHint, "select_count", Integer.toString(i)));
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f21614a.mo31171a(this);
        this.mRecyclerView = (RecyclerView) ((Activity) this.f21616c).findViewById(R.id.content_rv);
        this.mTitleBar = (CommonTitleBar) ((Activity) this.f21616c).findViewById(R.id.titlebar);
        m32306a();
    }

    /* renamed from: a */
    public void mo31206a(List<DocSelectorViewData> list) {
        m32307a(list.size());
        this.f21615b.resetAll(list);
    }

    /* renamed from: a */
    private void m32307a(int i) {
        this.mTitleBar.setTitle(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_SelectedCountHint, "select_count", Integer.toString(i)));
        this.mTitleBar.setLeftImageResource(R.drawable.titlebar_back_bg_selector);
        this.mTitleBar.addAction(new IActionTitlebar.TextAction(UIUtils.getString(this.f21616c, R.string.Lark_Legacy_Save), R.color.lkui_B500) {
            /* class com.bytedance.ee.bear.lark.selector.DocsConfirmView.C80701 */

            @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
            public void performAction(View view) {
                DocsConfirmView.this.f21614a.mo31172a(DocsConfirmView.this.f21615b.getItems());
            }
        });
        this.mTitleBar.getRightText().setPadding(0, 0, UIUtils.dp2px(this.f21616c, 15.0f), 0);
    }

    public DocsConfirmView(Context context, AbstractC8101b.AbstractC8103b bVar) {
        this.f21614a = bVar;
        this.f21616c = context;
    }
}
