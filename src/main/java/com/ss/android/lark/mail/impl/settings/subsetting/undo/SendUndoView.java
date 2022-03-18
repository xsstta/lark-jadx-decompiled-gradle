package com.ss.android.lark.mail.impl.settings.subsetting.undo;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.C42101o;
import com.ss.android.lark.mail.impl.entity.C42105q;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.settings.subsetting.undo.AbstractC43618a;
import com.ss.android.lark.mail.impl.settings.subsetting.undo.UndoDurationSelectAdapter;
import java.util.ArrayList;

public class SendUndoView implements AbstractC43618a.AbstractC43620b {

    /* renamed from: a */
    public long f110658a = 5000;

    /* renamed from: b */
    public AbstractC43618a.AbstractC43620b.AbstractC43621a f110659b;

    /* renamed from: c */
    private UndoDurationSelectAdapter f110660c;

    /* renamed from: d */
    private Context f110661d;

    /* renamed from: e */
    private AbstractC43615a f110662e;
    @BindView(9309)
    View mDurationLayout;
    @BindView(9579)
    RecyclerView mDurationRV;
    @BindView(9586)
    UDSwitch mSendUndoSwitch;
    @BindView(9587)
    TextView mSendUndoSwitchText;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.undo.SendUndoView$a */
    public interface AbstractC43615a {
        /* renamed from: a */
        void mo155630a(SendUndoView sendUndoView);
    }

    /* renamed from: a */
    public void mo155631a() {
        ((Activity) this.f110661d).finish();
    }

    /* renamed from: b */
    public LifecycleOwner mo155634b() {
        return (ComponentActivity) this.f110661d;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110659b = null;
        this.f110662e = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110662e.mo155630a(this);
        this.mSendUndoSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.undo.$$Lambda$SendUndoView$qXdMsYk3QY3L0guSUEBYWfKoGt8 */

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SendUndoView.this.m173097a(compoundButton, z);
            }
        });
        m173099d();
        m173098c();
    }

    /* renamed from: c */
    private void m173098c() {
        ArrayList arrayList = new ArrayList();
        for (Long l : C42101o.f107119a) {
            arrayList.add(new C42105q(R.string.Mail_Setting_UndoCancellationSeconds, l.longValue()));
        }
        this.f110660c.resetAll(arrayList);
    }

    /* renamed from: d */
    private void m173099d() {
        this.mDurationRV.setLayoutManager(new LinearLayoutManager(this.f110661d, 1, false));
        UndoDurationSelectAdapter undoDurationSelectAdapter = new UndoDurationSelectAdapter();
        this.f110660c = undoDurationSelectAdapter;
        undoDurationSelectAdapter.mo155641a(new UndoDurationSelectAdapter.AbstractC43617a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.undo.SendUndoView.C436141 */

            @Override // com.ss.android.lark.mail.impl.settings.subsetting.undo.UndoDurationSelectAdapter.AbstractC43617a
            /* renamed from: a */
            public void mo155635a(C42105q qVar) {
                SendUndoView.this.f110658a = qVar.mo152029b();
                SendUndoView.this.f110659b.mo155645a(new C42101o.C42103a().mo152008a(SendUndoView.this.mSendUndoSwitch.isChecked()).mo152007a(SendUndoView.this.f110658a).mo152009a());
            }
        });
        this.mDurationRV.setAdapter(this.f110660c);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43618a.AbstractC43620b.AbstractC43621a aVar) {
        this.f110659b = aVar;
    }

    /* renamed from: a */
    public void mo155632a(C42101o oVar) {
        int i;
        this.mSendUndoSwitch.setCheckedIgnoreEvent(oVar.mo152005a());
        this.f110658a = oVar.mo152006b();
        View view = this.mDurationLayout;
        if (oVar.mo152005a()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        UndoDurationSelectAdapter undoDurationSelectAdapter = this.f110660c;
        if (undoDurationSelectAdapter != null) {
            undoDurationSelectAdapter.mo155638a(oVar.mo152006b());
        }
    }

    public SendUndoView(Context context, AbstractC43615a aVar) {
        this.f110661d = context;
        this.f110662e = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m173097a(CompoundButton compoundButton, boolean z) {
        int i;
        C42187a.m168533f(z);
        C42101o.C42103a a = new C42101o.C42103a().mo152008a(z).mo152007a(this.f110658a);
        View view = this.mDurationLayout;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        this.f110659b.mo155645a(a.mo152009a());
    }
}
