package com.ss.android.lark.contact.impl.contacts_group.manage;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.core.api.PickType;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_group.AbstractC35602f;
import com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupAdapter;
import com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.util.C59252a;
import java.util.List;

public class MyManageGroupView implements AbstractC35623a.AbstractC35625b {

    /* renamed from: a */
    public AbstractC35623a.AbstractC35625b.AbstractC35626a f92113a;

    /* renamed from: b */
    public ContactsMyGroupAdapter f92114b;

    /* renamed from: c */
    private Context f92115c;

    /* renamed from: d */
    private AbstractC35622a f92116d;

    /* renamed from: e */
    private PickType f92117e;

    /* renamed from: f */
    private final boolean f92118f;

    /* renamed from: g */
    private final List<String> f92119g;

    /* renamed from: h */
    private final AbstractC35602f f92120h;
    View mEmptyLayout;
    RecyclerView mMyManageGroupRV;
    LKUIPtrClassicFrameLayout mPtrFrame;

    /* renamed from: com.ss.android.lark.contact.impl.contacts_group.manage.MyManageGroupView$a */
    public interface AbstractC35622a {
        void injectView(MyManageGroupView myManageGroupView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f92116d = null;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b
    /* renamed from: a */
    public void mo131298a() {
        this.mPtrFrame.refreshComplete();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f92116d.injectView(this);
        this.f92115c = this.mMyManageGroupRV.getContext();
        m139428b();
        m139429c();
    }

    /* renamed from: c */
    private void m139429c() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.f92115c);
        this.mPtrFrame.setKeepHeaderWhenRefresh(true);
        this.mPtrFrame.setFooterView(chatWindowPtrLoadingHeader);
        this.mPtrFrame.addPtrUIHandler(chatWindowPtrLoadingHeader);
        this.mPtrFrame.disableWhenHorizontalMove(true);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.contact.impl.contacts_group.manage.MyManageGroupView.C356212 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                MyManageGroupView.this.f92113a.mo131308b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !MyManageGroupView.this.f92113a.mo131307a()) {
                    return false;
                }
                return true;
            }
        });
    }

    /* renamed from: b */
    private void m139428b() {
        C58996h.m228981c(this.mMyManageGroupRV);
        this.mMyManageGroupRV.setLayoutManager(new LinearLayoutManager(this.f92115c));
        this.f92114b = new ContactsMyGroupAdapter(C35358a.m138143a().mo130163h().mo130229a());
        this.mMyManageGroupRV.setItemAnimator(null);
        this.mMyManageGroupRV.setAdapter(this.f92114b);
        C59252a.m230151a(this.f92115c, this.mPtrFrame, this.mMyManageGroupRV, new C59252a.AbstractC59254a() {
            /* class com.ss.android.lark.contact.impl.contacts_group.manage.MyManageGroupView.C356201 */

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: a */
            public int mo31266a() {
                return MyManageGroupView.this.f92114b.getItemCount() - 7;
            }

            @Override // com.ss.android.lark.widget.util.C59252a.AbstractC59254a
            /* renamed from: b */
            public boolean mo31267b() {
                if (MyManageGroupView.this.f92113a == null || !MyManageGroupView.this.f92113a.mo131307a()) {
                    return false;
                }
                return true;
            }
        });
        this.f92114b.mo131256a(new ContactsMyGroupAdapter.OnItemClickListener() {
            /* class com.ss.android.lark.contact.impl.contacts_group.manage.$$Lambda$MyManageGroupView$nTfmiFEYeo04kI0HAPXxNn7OFyM */

            @Override // com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupAdapter.OnItemClickListener
            public final void onItemClick(Chat chat, int i) {
                MyManageGroupView.lambda$nTfmiFEYeo04kI0HAPXxNn7OFyM(MyManageGroupView.this, chat, i);
            }
        });
        if (this.f92118f) {
            ContactsMyGroupAdapter aVar = this.f92114b;
            PickType pickType = this.f92117e;
            List<String> list = this.f92119g;
            AbstractC35602f fVar = this.f92120h;
            fVar.getClass();
            aVar.mo131254a(pickType, list, new ContactsMyGroupAdapter.OnItemSelectListener() {
                /* class com.ss.android.lark.contact.impl.contacts_group.manage.$$Lambda$c0056sIT5pN6Up_ErKBS1Csc */

                @Override // com.ss.android.lark.contact.impl.contacts_group.ContactsMyGroupAdapter.OnItemSelectListener
                public final boolean onItemSelected(Chat chat, boolean z, int i) {
                    return AbstractC35602f.this.onItemSelected(chat, z, i);
                }
            });
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35623a.AbstractC35625b.AbstractC35626a aVar) {
        this.f92113a = aVar;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b
    /* renamed from: c */
    public void mo131303c(List<String> list) {
        this.f92114b.mo131258a(list);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b
    /* renamed from: d */
    public void mo131304d(List<String> list) {
        this.f92114b.mo131260b(list);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b
    /* renamed from: a */
    public void mo131299a(PickType pickType) {
        this.f92117e = pickType;
        this.f92114b.mo131253a(pickType);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b
    /* renamed from: b */
    public void mo131302b(List<Chat> list) {
        this.f92114b.diff(list);
        this.mMyManageGroupRV.getRootView().requestLayout();
    }

    /* renamed from: a */
    private void m139427a(String str) {
        C35358a.m138143a().mo130165j().mo130205b(str, "contact_mygroup_created");
        if (DesktopUtil.m144301a(this.f92115c)) {
            C35358a.m138143a().mo130152b(str);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_group.manage.AbstractC35623a.AbstractC35625b
    /* renamed from: a */
    public void mo131301a(List<Chat> list) {
        if (CollectionUtils.isEmpty(list)) {
            this.mMyManageGroupRV.setVisibility(8);
            this.mEmptyLayout.setVisibility(0);
            C57582a.m223615c(this.mEmptyLayout);
        } else {
            this.mMyManageGroupRV.setVisibility(0);
            this.mEmptyLayout.setVisibility(8);
            this.f92114b.diff(list);
        }
        C48211b.m190251a().mo168687a(this.mMyManageGroupRV);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m139426a(Chat chat, int i) {
        AbstractC35602f fVar = this.f92120h;
        if (fVar == null || !fVar.onItemSelected(chat, true, i)) {
            m139427a(chat.getId());
        }
        ContactHitPoint.m140798d(chat.getId());
        ContactHitPoint.m140808i("group_avatar");
    }

    public MyManageGroupView(AbstractC35622a aVar, boolean z, List<String> list, AbstractC35602f fVar, PickType pickType) {
        this.f92116d = aVar;
        this.f92118f = z;
        this.f92119g = list;
        this.f92120h = fVar;
        this.f92117e = pickType;
    }
}
