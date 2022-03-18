package com.bytedance.ee.bear.wiki.wikitree;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.bizwidget.C4878c;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wiki.AbstractC11940d;
import com.bytedance.ee.bear.wiki.common.p580b.C11933b;
import com.bytedance.ee.bear.wiki.wikitree.C12053a;
import com.bytedance.ee.bear.wiki.wikitree.api.C12061c;
import com.bytedance.ee.bear.wiki.wikitree.api.CreateWikiRelationPuller;
import com.bytedance.ee.bear.wiki.wikitree.bean.HomePage;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12158n;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12161p;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12164q;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12134c;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12139h;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13727b;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70022d;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.f */
public class C12101f extends C7667e {

    /* renamed from: a */
    public String f32589a;

    /* renamed from: b */
    public C12164q f32590b;

    /* renamed from: c */
    public AppBarLayout f32591c;

    /* renamed from: d */
    public int f32592d;

    /* renamed from: e */
    private String f32593e;

    /* renamed from: f */
    private String f32594f;

    /* renamed from: g */
    private int f32595g = C8275a.f22371d.mo32555b();

    /* renamed from: h */
    private C12113h f32596h;

    /* renamed from: i */
    private View f32597i;

    /* renamed from: j */
    private C12117i f32598j;

    /* renamed from: k */
    private C12053a f32599k;

    /* renamed from: l */
    private C68289a f32600l = new C68289a();

    /* renamed from: m */
    private C4878c f32601m;

    /* renamed from: n */
    private AbstractC1178x<ConnectionService.NetworkState> f32602n;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50025a(AbstractC11940d dVar) throws Exception {
    }

    /* renamed from: a */
    public void mo46269a(String str, String str2) {
        this.f32600l.mo237937a(C12061c.m49937a((NetService) KoinJavaComponent.m268610a(NetService.class)).mo46192a(new CreateWikiRelationPuller.Params(str, str2, "", this.f32595g, "")).mo237985a(C11678b.m48481e()).mo238013c(new Consumer(str2) {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$f$NDI0WNwzJIpL4Vn6j57T_dzdwPw */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12101f.this.m50028a((C12101f) this.f$1, (String) ((AbstractC70022d) obj));
            }
        }).mo237995a(new AbstractC68309a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$f$SfLG2DB87hjA623dEDlPijYALqk */

            @Override // io.reactivex.functions.AbstractC68309a
            public final void run() {
                C12101f.this.m50033d();
            }
        }).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$f$Hb6_3GSMpShEPMQpWZyO2q1E5Y */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12101f.this.m50027a((C12101f) this.f$1, (String) ((TreeNode) obj));
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$f$ndEvdD_FvhbJXhCewy2mu8N3i0A */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C12101f.this.m50029a((C12101f) ((Throwable) obj));
            }
        }));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50028a(String str, AbstractC70022d dVar) throws Exception {
        C11933b.m49477a(ar.m20936a(), "confirm_create_new", "", str, 0, false, C8275a.m34050a(this.f32595g));
        m50022a(R.string.Doc_Wiki_CreateDialog);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50029a(Throwable th) throws Exception {
        Toast.showFailureText(getContext(), C12161p.m50531a().mo46491a(1005, C12134c.m50187a(ar.m20936a(), th)));
    }

    /* renamed from: a */
    public void mo46268a(int i, final int i2) {
        ValueAnimator a = C13727b.m55679a((View) this.f32591c, i, i2, (int) LocationRequest.PRIORITY_HD_ACCURACY);
        a.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12101f.C121043 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (i2 == 0) {
                    C12101f.this.f32590b.mo46494A();
                    return;
                }
                C12101f.this.f32590b.mo46507b(true);
                C12101f.this.f32590b.mo46495B();
            }
        });
        a.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m50033d() {
        C4878c cVar = this.f32601m;
        if (cVar != null) {
            cVar.mo19130b();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        return this.f32590b.mo46349e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f32590b.mo46347c();
        this.f32590b.mo46348d();
    }

    /* renamed from: a */
    private void m50021a() {
        C12113h hVar = (C12113h) aj.m5364a(this).mo6005a(C12113h.class);
        this.f32596h = hVar;
        hVar.setSpaceId(this.f32589a);
        this.f32596h.setWikiToken(this.f32593e);
    }

    /* renamed from: c */
    private void m50032c() {
        this.f32599k = new C12053a(this.f32598j.mo46291a(new BaseTitleBar.C11804e(getText(R.string.Doc_Wiki_Create), (int) R.color.space_kit_b500)), new C12053a.AbstractC12055a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12101f.C121021 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.C12053a.AbstractC12055a
            /* renamed from: b */
            public void mo46172b(View view) {
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.C12053a.AbstractC12055a
            /* renamed from: a */
            public void mo46171a(View view) {
                String v = C12101f.this.f32590b.mo46514v();
                HomePage w = C12101f.this.f32590b.mo46515w();
                if (w != null && TextUtils.equals(v, w.getWikiToken())) {
                    v = "";
                }
                C12101f fVar = C12101f.this;
                fVar.mo46269a(fVar.f32589a, v);
            }
        });
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        $$Lambda$f$bXJlOwz8G3xh7tjLAEhC4uSARZY r1 = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$f$bXJlOwz8G3xh7tjLAEhC4uSARZY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12101f.this.m50024a((C12101f) ((ConnectionService.NetworkState) obj));
            }
        };
        this.f32602n = r1;
        a.mo5923a(this, r1);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C12113h hVar = this.f32596h;
        if (hVar != null) {
            hVar.unRegisterTreeDataChange();
        }
        C68289a aVar = this.f32600l;
        if (aVar != null) {
            aVar.mo237935a();
        }
        C4878c cVar = this.f32601m;
        if (cVar != null) {
            cVar.mo19130b();
        }
        if (this.f32602n != null) {
            C5084ad.m20847d().mo20037a().mo5928b(this.f32602n);
        }
    }

    /* renamed from: b */
    private void m50030b() {
        try {
            this.f32589a = getArguments().getString("space_id");
            this.f32593e = getArguments().getString("obj_token");
            this.f32594f = getArguments().getString("node_name");
            this.f32595g = getArguments().getInt("createDocumentType", C8275a.f22371d.mo32555b());
        } catch (Exception e) {
            C13479a.m54759a("Wiki_WikiNewToFragment", "WikiNewToFragment.parseArgs, parse args fail. ", e);
            if (getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m50030b();
        m50021a();
    }

    /* renamed from: a */
    private void m50022a(int i) {
        if (this.f32601m == null) {
            C4878c cVar = new C4878c(getContext());
            this.f32601m = cVar;
            cVar.mo19131b(i);
        }
        this.f32601m.mo19132c();
    }

    /* renamed from: a */
    private void m50023a(View view) {
        this.f32591c = (AppBarLayout) view.findViewById(R.id.wiki_appbar_layout);
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.wiki_main_title);
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki");
        baseTitleBar.setTag(R.id.title_bar_common_params, hashMap);
        C12117i iVar = new C12117i(baseTitleBar);
        this.f32598j = iVar;
        iVar.mo46293a(this.f32594f);
        this.f32598j.mo46294a(false);
        this.f32598j.mo46293a(C10539a.m43639a(getContext(), R.string.Doc_Wiki_CreateTo, "Workspace_Name", this.f32594f));
        this.f32597i = view.findViewById(R.id.wiki_tree_view_ctrl);
        C12164q qVar = new C12164q(getActivity(), ar.m20936a(), this, (AbstractC12177b) this.f32597i, C12139h.m50258a(ar.m20936a()), this.f32596h, WikiTreeType.NEW_TO);
        this.f32590b = qVar;
        qVar.mo46501a(new AbstractC12144f.AbstractC12146b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12101f.C121032 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public void mo46262a() {
                C12101f fVar = C12101f.this;
                fVar.mo46268a(0, fVar.f32592d);
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public boolean mo46263a(boolean z) {
                if (z) {
                    C12101f fVar = C12101f.this;
                    fVar.f32592d = fVar.f32591c.getHeight();
                    C12101f fVar2 = C12101f.this;
                    fVar2.mo46268a(fVar2.f32592d, 0);
                    return true;
                }
                C12101f fVar3 = C12101f.this;
                fVar3.mo46268a(0, fVar3.f32592d);
                return true;
            }
        });
        this.f32590b.mo46500a(new AbstractC12144f.AbstractC12145a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$f$Y5zW2OleVUSmy4irQnRqHDc6m8E */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12145a
            public final void onFocusChange(String str) {
                C12101f.this.m50026a((C12101f) str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50024a(ConnectionService.NetworkState networkState) {
        boolean z;
        boolean z2 = true;
        if (networkState == null || !networkState.mo20041b()) {
            z = false;
        } else {
            z = true;
        }
        String v = this.f32590b.mo46514v();
        C12053a aVar = this.f32599k;
        if (!z || TextUtils.isEmpty(v)) {
            z2 = false;
        }
        aVar.mo46169a(z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50026a(String str) {
        ConnectionService.NetworkState b = C5084ad.m20847d().mo20038b();
        boolean z = false;
        if (b != null) {
            C12053a aVar = this.f32599k;
            if (!TextUtils.isEmpty(str) && b.mo20041b()) {
                z = true;
            }
            aVar.mo46169a(z);
            return;
        }
        this.f32599k.mo46169a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f32590b.mo46344a();
        this.f32590b.mo46346b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50027a(String str, TreeNode treeNode) throws Exception {
        C12158n.m50510a(ar.m20936a(), str, treeNode.wiki_token, this.f32590b.mo46515w(), false);
        this.f32600l.mo237937a(ar.m20936a().mo41505a(AbstractC11940d.class, C11678b.m48479c()).mo238005b((Consumer) $$Lambda$pdyIDxrUUeahw_aq70CycIXlmNU.INSTANCE).mo238001b($$Lambda$f$Fb8YeQIqrcqMfZLgIIVOWSwoTiI.INSTANCE, $$Lambda$f$QS9zEfhRtlrx8DnMplnjpdV2pIc.INSTANCE));
        if (getActivity() != null) {
            getActivity().setResult(-1, null);
            getActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wiki_tree_home_activity, viewGroup, false);
        m50023a(inflate);
        m50032c();
        return inflate;
    }

    /* renamed from: a */
    public static C12101f m50020a(String str, String str2, String str3, int i) {
        C12101f fVar = new C12101f();
        Bundle bundle = new Bundle();
        bundle.putString("space_id", str);
        bundle.putString("obj_token", str2);
        bundle.putString("node_name", str3);
        bundle.putInt("createDocumentType", i);
        fVar.setArguments(bundle);
        return fVar;
    }
}
