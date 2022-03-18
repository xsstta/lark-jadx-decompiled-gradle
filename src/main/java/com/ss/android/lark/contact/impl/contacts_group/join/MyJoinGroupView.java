package com.ss.android.lark.contact.impl.contacts_group.join;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f;
import com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupAdapter;
import com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.p1733b.AbstractC35361b;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;

public class MyJoinGroupView implements AbstractC35606a.AbstractC35608b {

    /* renamed from: a */
    AbstractC35361b.AbstractC35376o f92087a;

    /* renamed from: b */
    public AbstractC35606a.AbstractC35608b.AbstractC35609a f92088b;

    /* renamed from: c */
    public ContactsMyGroupAdapter f92089c;

    /* renamed from: d */
    private Context f92090d;

    /* renamed from: e */
    private AbstractC35605a f92091e;

    /* renamed from: f */
    private final AbstractC35602f f92092f;
    @BindView(7232)
    View mEmptyLayout;
    @BindView(7727)
    RecyclerView mMyJoinGroupRV;
    @BindView(7726)
    LKUIPtrClassicFrameLayout mPtrFrame;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.join.MyJoinGroupView$a */
    public interface AbstractC35605a {
        /* renamed from: a */
        void mo131280a(MyJoinGroupView myJoinGroupView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f92091e = null;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35608b
    /* renamed from: a */
    public void mo131276a() {
        this.mPtrFrame.refreshComplete();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92091e.mo131280a(this);
        this.f92090d = this.mMyJoinGroupRV.getContext();
        m139388b();
        m139389c();
    }

    /* renamed from: c */
    private void m139389c() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f92090d);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.contact.impl.contacts_group.join.MyJoinGroupView.C356042 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                MyJoinGroupView.this.f92088b.mo131285b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !MyJoinGroupView.this.f92088b.mo131284a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: b */
    private void m139388b() {
        C58996h.m228981c(this.mMyJoinGroupRV);
        this.mMyJoinGroupRV.setLayoutManager(new LinearLayoutManager(this.f92090d));
        AbstractC35361b.AbstractC35376o h = C35358a.m138143a().mo130163h();
        this.f92087a = h;
        ContactsMyGroupAdapter aVar = new ContactsMyGroupAdapter(h.mo130229a());
        this.f92089c = aVar;
        aVar.mo131256a(new ContactsMyGroupAdapter.OnItemClickListener() {
            /* class com.ss.android.lark.contact.impl.contacts_group.join.$$Lambda$MyJoinGroupView$NZQt0ey7Yuc_KTH5W5hBx83FvhQ */

            @Override // com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupAdapter.OnItemClickListener
            public final void onItemClick(Chat chat, int i) {
                MyJoinGroupView.this.m139386a(chat, i);
            }
        });
        this.mMyJoinGroupRV.setAdapter(this.f92089c);
        C59252a.m230151a(this.f92090d, this.mPtrFrame, this.mMyJoinGroupRV, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.contact.impl.contacts_group.join.MyJoinGroupView.C356031 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return MyJoinGroupView.this.f92089c.getItemCount() - 7;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (MyJoinGroupView.this.f92088b == null || !MyJoinGroupView.this.f92088b.mo131284a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35606a.AbstractC35608b.AbstractC35609a aVar) {
        this.f92088b = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35608b
    /* renamed from: b */
    public void mo131279b(List<Chat> list) {
        this.f92089c.diff(list);
    }

    /* renamed from: a */
    private void m139387a(String str) {
        C35358a.m138143a().mo130165j().mo130205b(str, "contact_mygroup_joined");
        if (DesktopUtil.m144301a(this.f92090d)) {
            C35358a.m138143a().mo130152b(str);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.join.AbstractC35606a.AbstractC35608b
    /* renamed from: a */
    public void mo131278a(List<Chat> list) {
        if (CollectionUtils.isEmpty(list)) {
            this.mMyJoinGroupRV.setVisibility(8);
            this.mEmptyLayout.setVisibility(0);
            C57582a.m223615c(this.mEmptyLayout);
            return;
        }
        this.mMyJoinGroupRV.setVisibility(0);
        this.mEmptyLayout.setVisibility(8);
        this.f92089c.diff(list);
    }

    public MyJoinGroupView(AbstractC35605a aVar, AbstractC35602f fVar) {
        this.f92091e = aVar;
        this.f92092f = fVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m139386a(Chat chat, int i) {
        AbstractC35602f fVar = this.f92092f;
        if (fVar == null || !fVar.onItemSelected(chat, true, i)) {
            m139387a(chat.getId());
        }
        ContactHitPoint.m140800e(chat.getId());
        ContactHitPoint.m140808i("group_avatar");
    }
}
