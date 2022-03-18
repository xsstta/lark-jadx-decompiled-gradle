package com.ss.android.lark.share_group;

import android.content.Context;
import android.content.DialogInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chatwindow.C35212a;
import com.ss.android.lark.dto.group.GroupRecallEntity;
import com.ss.android.lark.share_group.AbstractC54803a;
import com.ss.android.lark.share_group.RecallChatterAdapter;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.dialog.loadingdialog.LoadingDialog;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class RecallGroupChatterView implements AbstractC54803a.AbstractC54805b {

    /* renamed from: a */
    public AbstractC54800a f135294a;

    /* renamed from: b */
    public AbstractC54803a.AbstractC54805b.AbstractC54806a f135295b;

    /* renamed from: c */
    private RecallChatterAdapter f135296c;

    /* renamed from: d */
    private LoadingDialog f135297d;

    /* renamed from: e */
    private Context f135298e;

    /* renamed from: f */
    private List<RecallItemViewData> f135299f = new ArrayList();
    @BindView(8497)
    public RecyclerView mRecallChatterRV;
    @BindView(8501)
    public CommonTitleBar mRecallTitleBar;

    /* renamed from: com.ss.android.lark.share_group.RecallGroupChatterView$a */
    public interface AbstractC54800a {
        /* renamed from: a */
        void mo186988a();

        /* renamed from: a */
        void mo186989a(RecallGroupChatterView recallGroupChatterView);

        /* renamed from: a */
        void mo186990a(String str);

        /* renamed from: b */
        void mo186991b(String str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m212578a(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: a */
    public void mo186992a() {
        AbstractC54800a aVar = this.f135294a;
        if (aVar != null) {
            aVar.mo186988a();
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f135295b = null;
        this.f135294a = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f135294a.mo186989a(this);
        m212579b();
    }

    /* renamed from: b */
    private void m212579b() {
        if (this.f135295b.mo187017a()) {
            this.mRecallTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_RevokeCircleInviteTitle));
        }
        this.mRecallChatterRV.setLayoutManager(new LinearLayoutManager(this.f135298e, 1, false));
        RecallChatterAdapter recallChatterAdapter = new RecallChatterAdapter(this.f135298e);
        this.f135296c = recallChatterAdapter;
        this.mRecallChatterRV.setAdapter(recallChatterAdapter);
        this.mRecallChatterRV.setItemAnimator(null);
        this.f135296c.mo186978a(new RecallChatterAdapter.AbstractC54796a() {
            /* class com.ss.android.lark.share_group.RecallGroupChatterView.C547981 */

            @Override // com.ss.android.lark.share_group.RecallChatterAdapter.AbstractC54796a
            /* renamed from: b */
            public void mo186980b(RecallItemViewData eVar) {
                RecallGroupChatterView.this.mo186995a(eVar);
            }

            @Override // com.ss.android.lark.share_group.RecallChatterAdapter.AbstractC54796a
            /* renamed from: a */
            public void mo186979a(RecallItemViewData eVar) {
                if (eVar.mo187038a() == 2) {
                    RecallGroupChatterView.this.f135294a.mo186991b(eVar.mo187047f());
                } else {
                    RecallGroupChatterView.this.f135294a.mo186990a(eVar.mo187047f());
                }
            }
        });
    }

    /* renamed from: b */
    public void mo187000b(int i) {
        LKUIToast.show(this.f135298e, i);
    }

    /* renamed from: c */
    public void mo187001c(int i) {
        LKUIToast.loadSuccess(this.f135298e, i);
    }

    /* renamed from: a */
    public void mo186993a(int i) {
        mo186996a(UIUtils.getString(this.f135298e, i));
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC54803a.AbstractC54805b.AbstractC54806a aVar) {
        this.f135295b = aVar;
    }

    /* renamed from: a */
    public void mo186995a(final RecallItemViewData eVar) {
        C547992 r0 = new C35212a.AbstractC35215a() {
            /* class com.ss.android.lark.share_group.RecallGroupChatterView.C547992 */

            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
            /* renamed from: b */
            public void mo122373b() {
            }

            @Override // com.ss.android.lark.chatwindow.C35212a.AbstractC35215a
            /* renamed from: a */
            public void mo122372a() {
                RecallGroupChatterView.this.f135295b.mo187016a(new GroupRecallEntity(eVar.mo187038a(), eVar.mo187047f()));
            }
        };
        if (eVar.mo187038a() == 1) {
            C35212a.m137532a(this.f135298e, eVar.mo187046e(), this.f135295b.mo187017a(), r0);
        } else {
            C35212a.m137529a(this.f135298e, r0);
        }
    }

    /* renamed from: a */
    public void mo186996a(String str) {
        new C25639g(this.f135298e).mo89242c(str).mo89253l(8388611).mo89245d(0.3f).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Group_RevokeIKnow, $$Lambda$RecallGroupChatterView$SDsFtjvP674brSwgYQC6kBKYKGk.INSTANCE).mo89239c();
    }

    /* renamed from: a */
    public void mo186998a(List<RecallItemViewData> list) {
        this.f135299f.clear();
        this.f135299f.addAll(list);
        this.f135296c.resetAll(list);
    }

    /* renamed from: a */
    public void mo186999a(boolean z) {
        if (this.f135297d == null) {
            this.f135297d = LoadingDialog.m226492a(this.f135298e).mo197784a(LoadingDialog.Style.SPIN_INDETERMINATE).mo197789b(28, 28).mo197785a(this.f135298e.getString(R.string.Lark_Legacy_Loading)).mo197791c(14.0f).mo197783a(SmEvents.EVENT_NW, SmEvents.EVENT_NW).mo197787b(5.0f).mo197788b(2).mo197782a(UIUtils.getColor(this.f135298e, R.color.loading_dialog_background_color)).mo197781a(BitmapDescriptorFactory.HUE_RED);
        }
        if (z && !this.f135297d.mo197790b()) {
            this.f135297d.mo197780a();
        } else if (!z) {
            this.f135297d.mo197792c();
        }
    }

    public RecallGroupChatterView(Context context, AbstractC54800a aVar) {
        this.f135298e = context;
        this.f135294a = aVar;
    }

    /* renamed from: a */
    public void mo186997a(String str, int i) {
        RecallItemViewData eVar;
        Iterator<RecallItemViewData> it = this.f135299f.iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = null;
                break;
            }
            eVar = it.next();
            if (Objects.equals(eVar.mo187047f(), str) && eVar.mo187038a() == i) {
                break;
            }
        }
        this.f135299f.remove(eVar);
        this.f135296c.diff(this.f135299f);
    }
}
