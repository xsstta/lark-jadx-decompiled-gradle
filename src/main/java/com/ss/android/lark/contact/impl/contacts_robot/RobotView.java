package com.ss.android.lark.contact.impl.contacts_robot;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a;
import com.ss.android.lark.contact.widget.DesktopContactsTitle;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;

public class RobotView implements AbstractC35717a.AbstractC35721b {

    /* renamed from: a */
    public LarkRobotAdapter f92357a;

    /* renamed from: b */
    public AbstractC35717a.AbstractC35721b.AbstractC35722a f92358b;

    /* renamed from: c */
    private AbstractC35716a f92359c;

    /* renamed from: d */
    private Activity f92360d;
    @BindView(7140)
    DesktopContactsTitle mDesktopTitleBar;
    @BindView(7597)
    View mLoadFailView;
    @BindView(7343)
    RecyclerView mRecyclerView;
    @BindView(7931)
    LKUIPtrClassicFrameLayout mRobotPtrLayout;
    @BindView(8250)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.contact.impl.contacts_robot.RobotView$a */
    public interface AbstractC35716a {
        /* renamed from: a */
        void mo131515a(RobotView robotView);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35721b
    /* renamed from: b */
    public void mo131513b() {
        this.mRobotPtrLayout.refreshComplete();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f92358b = null;
        this.f92359c = null;
    }

    /* renamed from: e */
    private void m139803e() {
        this.mRobotPtrLayout.setVisibility(0);
        this.mLoadFailView.setVisibility(8);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35721b
    /* renamed from: a */
    public void mo131509a() {
        this.mRobotPtrLayout.setVisibility(8);
        this.mLoadFailView.setVisibility(0);
        C57582a.m223615c(this.mLoadFailView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC35716a aVar = this.f92359c;
        if (aVar != null) {
            aVar.mo131515a(this);
        }
        m139804f();
        m139802d();
        m139801c();
    }

    /* renamed from: c */
    private void m139801c() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f92360d);
        this.mRobotPtrLayout.setKeepHeaderWhenRefresh(true);
        this.mRobotPtrLayout.setFooterView(chatWindowPtrLoadingHeader);
        this.mRobotPtrLayout.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mRobotPtrLayout.disableWhenHorizontalMove(true);
        this.mRobotPtrLayout.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.contact.impl.contacts_robot.RobotView.C357141 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                RobotView.this.f92358b.mo131525b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return RobotView.this.mo131512a(super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2));
            }
        });
    }

    /* renamed from: d */
    private void m139802d() {
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f92360d, 1, false));
        LarkRobotAdapter larkRobotAdapter = new LarkRobotAdapter();
        this.f92357a = larkRobotAdapter;
        this.mRecyclerView.setAdapter(larkRobotAdapter);
        C59252a.m230151a(this.f92360d, this.mRobotPtrLayout, this.mRecyclerView, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.contact.impl.contacts_robot.RobotView.C357152 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return RobotView.this.f92357a.getItemCount() - 7;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                return RobotView.this.f92358b.mo131524a();
            }
        });
    }

    /* renamed from: f */
    private void m139804f() {
        if (!DesktopUtil.m144301a((Context) this.f92360d)) {
            this.mTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_StructureRobot));
            this.mTitleBar.setVisibility(0);
            this.mDesktopTitleBar.setVisibility(8);
            return;
        }
        this.mDesktopTitleBar.setTitle(UIHelper.getString(R.string.Lark_Legacy_StructureRobot));
        this.mTitleBar.setVisibility(8);
        this.mDesktopTitleBar.setVisibility(0);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35717a.AbstractC35721b.AbstractC35722a aVar) {
        this.f92358b = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35721b
    /* renamed from: a */
    public void mo131511a(List<Chatter> list) {
        this.f92357a.addAll(list);
    }

    /* renamed from: a */
    public boolean mo131512a(boolean z) {
        if (!this.f92358b.mo131524a() || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_robot.AbstractC35717a.AbstractC35721b
    /* renamed from: b */
    public void mo131514b(List<Chatter> list) {
        this.f92357a.diff(list);
        m139803e();
    }

    public RobotView(AbstractC35716a aVar, Activity activity) {
        this.f92359c = aVar;
        this.f92360d = activity;
    }
}
