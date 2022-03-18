package com.ss.android.lark.anonymous.plugin;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.suite.R;
import com.ss.android.lark.anonymous.model.C28694a;
import com.ss.android.lark.anonymous.widget.AnonymityPickAdapter;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

public class ThreadAnonymityPickPlugin implements IInputSupportAdditionPlugin {

    /* renamed from: a */
    private IInputSupportAdditionPlugin.IAdditionSupportContext f72221a;

    /* renamed from: b */
    private Activity f72222b;

    /* renamed from: c */
    private final boolean f72223c;

    /* renamed from: d */
    private final AbstractC28701a f72224d;

    /* renamed from: e */
    private View f72225e;

    /* renamed from: f */
    private AnonymityPickAdapter f72226f;

    /* renamed from: g */
    private final boolean f72227g;
    @BindView(7192)
    RecyclerView mAnonymityPickRv;
    @BindView(7193)
    TextView mAnonymityPickTitleTv;

    /* renamed from: com.ss.android.lark.anonymous.plugin.ThreadAnonymityPickPlugin$a */
    public interface AbstractC28701a {
        /* renamed from: a */
        void mo102094a();

        /* renamed from: a */
        void mo102095a(C28694a aVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public int mo102073a() {
        return R.layout.activity_thread_anonymity_pick;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: b */
    public void mo102080b() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: c */
    public void mo102082c() {
    }

    /* renamed from: f */
    private void m105228f() {
        m105229g();
        m105230h();
    }

    /* renamed from: d */
    public void mo102092d() {
        this.f72221a.mo146897a();
    }

    /* renamed from: e */
    public void mo102093e() {
        this.f72221a.mo146899b();
    }

    /* renamed from: g */
    private void m105229g() {
        if (this.f72227g) {
            this.mAnonymityPickTitleTv.setText(UIHelper.getString(R.string.Lark_Groups_ChoosePostIdentity));
        } else {
            this.mAnonymityPickTitleTv.setText(UIHelper.getString(R.string.Lark_Groups_ChooseReplyIdentity));
        }
    }

    /* renamed from: h */
    private void m105230h() {
        this.mAnonymityPickRv.setLayoutManager(new LinearLayoutManager(this.f72222b, 1, false));
        AnonymityPickAdapter anonymityPickAdapter = new AnonymityPickAdapter();
        this.f72226f = anonymityPickAdapter;
        anonymityPickAdapter.mo102107a(new AnonymityPickAdapter.AbstractC28708a() {
            /* class com.ss.android.lark.anonymous.plugin.$$Lambda$ThreadAnonymityPickPlugin$lHvak3EWwPGgz6ZB5g3yzzqh4c */

            @Override // com.ss.android.lark.anonymous.widget.AnonymityPickAdapter.AbstractC28708a
            public final void onItemSelect(C28694a aVar) {
                ThreadAnonymityPickPlugin.m270241lambda$lHvak3EWwPGgz6ZB5g3yzzqh4c(ThreadAnonymityPickPlugin.this, aVar);
            }
        });
        this.mAnonymityPickRv.setAdapter(this.f72226f);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102078a(IInputSupportAdditionPlugin.IAdditionSupportContext aVar) {
        this.f72221a = aVar;
    }

    /* renamed from: b */
    public void mo102091b(boolean z) {
        this.f72226f.mo102108a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m105227a(C28694a aVar) {
        this.f72224d.mo102095a(aVar);
        mo102093e();
    }

    /* renamed from: a */
    public void mo102090a(List<C28694a> list) {
        AnonymityPickAdapter anonymityPickAdapter = this.f72226f;
        if (anonymityPickAdapter != null) {
            anonymityPickAdapter.resetAll(list);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public void mo102079a(boolean z) {
        if (!z) {
            mo102093e();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102074a(Activity activity, View view) {
        this.f72225e = view;
        this.f72222b = activity;
        m105228f();
        this.f72224d.mo102094a();
        return this.f72225e;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin
    /* renamed from: a */
    public View mo102075a(Activity activity, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(activity).inflate(mo102073a(), viewGroup, false);
        ButterKnife.bind(this, inflate);
        return mo102074a(activity, inflate);
    }

    public ThreadAnonymityPickPlugin(boolean z, AbstractC28701a aVar, boolean z2) {
        this.f72224d = aVar;
        this.f72223c = z2;
        this.f72227g = z;
    }
}
