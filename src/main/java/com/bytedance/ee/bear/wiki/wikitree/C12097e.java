package com.bytedance.ee.bear.wiki.wikitree;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.DialogC0259b;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wiki.wikitree.C12053a;
import com.bytedance.ee.bear.wiki.wikitree.C12097e;
import com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f;
import com.bytedance.ee.bear.wiki.wikitree.tree.C12164q;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.bytedance.ee.bear.wiki.wikitree.tree.p586a.C12139h;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12177b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p718t.C13726a;
import com.bytedance.ee.util.p718t.C13727b;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.e */
public class C12097e extends C7667e {

    /* renamed from: a */
    public String f32570a;

    /* renamed from: b */
    public String f32571b;

    /* renamed from: c */
    public C12164q f32572c;

    /* renamed from: d */
    public AppBarLayout f32573d;

    /* renamed from: e */
    public int f32574e;

    /* renamed from: f */
    private String f32575f;

    /* renamed from: g */
    private String f32576g;

    /* renamed from: h */
    private String f32577h;

    /* renamed from: i */
    private String f32578i;

    /* renamed from: j */
    private C12113h f32579j;

    /* renamed from: k */
    private View f32580k;

    /* renamed from: l */
    private C12117i f32581l;

    /* renamed from: m */
    private C12053a f32582m;

    /* renamed from: n */
    private DialogC0259b f32583n;

    /* renamed from: o */
    private AbstractC1178x<ConnectionService.NetworkState> f32584o;

    /* renamed from: a */
    public void mo46261a(String str, String str2, boolean z) {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.putExtra("RESULT_MOVETO_FOLLOW_PARENT_PERM", z ? 1 : 0);
            intent.putExtra("RESULT_MOVETO_SRC_TOKEN", str);
            intent.putExtra("RESULT_MOVETO_DEST_TOKEN", str2);
            getActivity().setResult(1, intent);
            getActivity().finish();
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        return this.f32572c.mo46349e();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f32572c.mo46347c();
        this.f32572c.mo46348d();
    }

    /* renamed from: a */
    private void m50004a() {
        C12113h hVar = (C12113h) aj.m5364a(this).mo6005a(C12113h.class);
        this.f32579j = hVar;
        hVar.setSpaceId(this.f32575f);
        this.f32579j.setWikiToken(this.f32576g);
    }

    /* renamed from: c */
    private void m50011c() {
        C12053a aVar = new C12053a(this.f32581l.mo46291a(new BaseTitleBar.C11804e(getText(R.string.Doc_Wiki_ConfirmMove), (int) R.color.primary_pri_500)), new C12053a.AbstractC12055a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12097e.C120981 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.C12053a.AbstractC12055a
            /* renamed from: b */
            public void mo46172b(View view) {
                if (C12097e.this.f32572c.mo46513u()) {
                    Toast.showFailureText(C12097e.this.getContext(), (int) R.string.Doc_Wiki_Move_SelectFather);
                }
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.C12053a.AbstractC12055a
            /* renamed from: a */
            public void mo46171a(View view) {
                if (C12097e.this.f32572c.mo46513u()) {
                    String v = C12097e.this.f32572c.mo46514v();
                    String c = C12097e.this.f32572c.mo46508c(v);
                    boolean z = true;
                    if (!TextUtils.isEmpty(c) && !TextUtils.isEmpty(C12097e.this.f32571b)) {
                        z = true ^ TextUtils.equals(c, C12097e.this.f32571b);
                    }
                    if (!C13726a.m55674a(C12097e.this.getContext())) {
                        return;
                    }
                    if (z) {
                        C12097e eVar = C12097e.this;
                        eVar.mo46260a(eVar.getContext(), new C13659d.AbstractC13661b(v) {
                            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$e$1$pW5gHyynZfxR7iusfpXMUvQU */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13661b
                            public final void accept(Object obj) {
                                C12097e.C120981.this.m50015a(this.f$1, (Boolean) obj);
                            }
                        });
                        return;
                    }
                    C12097e eVar2 = C12097e.this;
                    eVar2.mo46261a(eVar2.f32570a, v, false);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m50015a(String str, Boolean bool) {
                C12097e eVar = C12097e.this;
                eVar.mo46261a(eVar.f32570a, str, bool.booleanValue());
            }
        });
        this.f32582m = aVar;
        aVar.mo46170b(false);
        LiveData<ConnectionService.NetworkState> a = C5084ad.m20847d().mo20037a();
        $$Lambda$e$wD8862q3UXzsIlV3nXxPcMX9nTk r1 = new AbstractC1178x() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$e$wD8862q3UXzsIlV3nXxPcMX9nTk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C12097e.this.m50007a((C12097e) ((ConnectionService.NetworkState) obj));
            }
        };
        this.f32584o = r1;
        a.mo5923a(this, r1);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onDestroy() {
        super.onDestroy();
        C12113h hVar = this.f32579j;
        if (hVar != null) {
            hVar.unRegisterTreeDataChange();
        }
        if (this.f32584o != null) {
            C5084ad.m20847d().mo20037a().mo5928b(this.f32584o);
        }
        DialogC0259b bVar = this.f32583n;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: b */
    private void m50010b() {
        try {
            this.f32575f = getArguments().getString("space_id");
            this.f32576g = getArguments().getString("obj_token");
            this.f32577h = getArguments().getString("node_name");
            this.f32578i = getArguments().getString("EXTRA_MOVETO_SRC_PARENT_TOKEN");
            this.f32570a = getArguments().getString("EXTRA_MOVETO_SRC_TOKEN");
            this.f32571b = getArguments().getString("EXTRA_MOVETO_SRC_AREA_ID");
        } catch (Exception e) {
            C13479a.m54759a("Wiki_WikiMovToFragment", "WikiMovToFragment.parseArgs, parse args fail. ", e);
            if (getActivity() != null) {
                getActivity().finish();
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m50010b();
        m50004a();
    }

    /* renamed from: a */
    private void m50006a(View view) {
        this.f32573d = (AppBarLayout) view.findViewById(R.id.wiki_appbar_layout);
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.wiki_main_title);
        HashMap hashMap = new HashMap();
        hashMap.put("module", "wiki");
        baseTitleBar.setTag(R.id.title_bar_common_params, hashMap);
        C12117i iVar = new C12117i(baseTitleBar);
        this.f32581l = iVar;
        iVar.mo46293a(this.f32577h);
        this.f32581l.mo46294a(false);
        this.f32580k = view.findViewById(R.id.wiki_tree_view_ctrl);
        C12164q qVar = new C12164q(getActivity(), ar.m20936a(), this, (AbstractC12177b) this.f32580k, C12139h.m50258a(ar.m20936a()), this.f32579j, WikiTreeType.MOV_TO);
        this.f32572c = qVar;
        qVar.mo46501a(new AbstractC12144f.AbstractC12146b() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12097e.C120992 */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public void mo46262a() {
                C12097e eVar = C12097e.this;
                eVar.mo46259a(0, eVar.f32574e);
            }

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12146b
            /* renamed from: a */
            public boolean mo46263a(boolean z) {
                if (z) {
                    C12097e eVar = C12097e.this;
                    eVar.f32574e = eVar.f32573d.getHeight();
                    C12097e eVar2 = C12097e.this;
                    eVar2.mo46259a(eVar2.f32574e, 0);
                    return true;
                }
                C12097e eVar3 = C12097e.this;
                eVar3.mo46259a(0, eVar3.f32574e);
                return true;
            }
        });
        this.f32572c.mo46500a(new AbstractC12144f.AbstractC12145a() {
            /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$e$0Og3AKSxsdI8or2BT66tpxKDcQs */

            @Override // com.bytedance.ee.bear.wiki.wikitree.tree.AbstractC12144f.AbstractC12145a
            public final void onFocusChange(String str) {
                C12097e.this.m50009a((C12097e) str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50007a(ConnectionService.NetworkState networkState) {
        boolean z;
        if (networkState == null || !networkState.mo20041b()) {
            z = false;
        } else {
            z = true;
        }
        C13479a.m54764b("Wiki_WikiMovToFragment", "WikiMovToFragment.onNetworkChanged, network connection: " + z);
        this.f32582m.mo46169a(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50009a(String str) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str, this.f32578i)) {
            this.f32582m.mo46170b(true);
        } else {
            this.f32582m.mo46170b(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m50005a(DialogInterface dialogInterface, int i) {
        this.f32583n.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f32572c.mo46344a();
        this.f32572c.mo46346b();
    }

    /* renamed from: a */
    public void mo46259a(int i, final int i2) {
        ValueAnimator a = C13727b.m55679a((View) this.f32573d, i, i2, (int) LocationRequest.PRIORITY_HD_ACCURACY);
        a.addListener(new Animator.AnimatorListener() {
            /* class com.bytedance.ee.bear.wiki.wikitree.C12097e.C121003 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (i2 == 0) {
                    C12097e.this.f32572c.mo46494A();
                    return;
                }
                C12097e.this.f32572c.mo46507b(true);
                C12097e.this.f32572c.mo46495B();
            }
        });
        a.start();
    }

    /* renamed from: a */
    public void mo46260a(Context context, C13659d.AbstractC13661b<Boolean> bVar) {
        if (context != null) {
            MoveToDigContentView moveToDigContentView = new MoveToDigContentView(context);
            DialogC25637f b = new C25639g(context).mo89256o(R.color.text_title).mo89253l(8388611).mo89251j(Integer.MAX_VALUE).mo89248g(R.string.Doc_Wiki_MoveToNewAreaTitle).mo89250i(R.color.text_title).mo89238b(true).mo89247e(false).mo89245d(0.3f).mo89236b(moveToDigContentView).mo89257p(17).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_left).mo89269b(R.string.Doc_Wiki_Cancel).mo89267a(new DialogInterface.OnClickListener() {
                /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$e$foY1h80MR22DmoxYYVzZjNWZi4Y */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C12097e.this.m50005a((C12097e) dialogInterface, (DialogInterface) i);
                }
            }).mo89271d(R.color.text_title)).mo89229a(new C25639g.C25640a().mo89266a(R.id.lkui_dialog_btn_right).mo89269b(R.string.Doc_Wiki_Confirm).mo89267a(new DialogInterface.OnClickListener(moveToDigContentView) {
                /* class com.bytedance.ee.bear.wiki.wikitree.$$Lambda$e$aBt3Jym0PQItvQaXfR8gx9r07HU */
                public final /* synthetic */ MoveToDigContentView f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C12097e.m50008a(C13659d.AbstractC13661b.this, this.f$1, dialogInterface, i);
                }
            }).mo89271d(R.color.primary_pri_500)).mo89233b();
            this.f32583n = b;
            b.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.wiki_tree_home_activity, viewGroup, false);
        m50006a(inflate);
        m50011c();
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m50008a(C13659d.AbstractC13661b bVar, MoveToDigContentView moveToDigContentView, DialogInterface dialogInterface, int i) {
        bVar.accept(Boolean.valueOf(moveToDigContentView.mo46149a()));
    }

    /* renamed from: a */
    public static C12097e m50003a(String str, String str2, String str3, String str4, String str5, String str6) {
        C12097e eVar = new C12097e();
        Bundle bundle = new Bundle();
        bundle.putString("space_id", str);
        bundle.putString("obj_token", str2);
        bundle.putString("node_name", str3);
        bundle.putString("EXTRA_MOVETO_SRC_PARENT_TOKEN", str6);
        bundle.putString("EXTRA_MOVETO_SRC_TOKEN", str4);
        bundle.putString("EXTRA_MOVETO_SRC_AREA_ID", str5);
        eVar.setArguments(bundle);
        return eVar;
    }
}
