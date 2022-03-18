package com.ss.android.lark.mail.impl.settings.subsetting.autoreply;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ComponentActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.lark.pb.email.client.v1.MailUpdateAccountResponse;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.DraftMailAction;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.compose.C41969d;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.compose.C41988g;
import com.ss.android.lark.mail.impl.entity.EmailAutoReply;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42761a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42791e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42815b;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.settings.subsetting.autoreply.AbstractC43504f;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43713a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import java.util.ArrayList;
import java.util.List;

public class EditAutoReplyView implements C41970e.AbstractC41973b, AbstractC43504f.AbstractC43506b, AbstractC43719c {

    /* renamed from: a */
    public ComposeWebView f110433a;

    /* renamed from: b */
    public long f110434b;

    /* renamed from: c */
    public long f110435c;
    View container;

    /* renamed from: d */
    public final Context f110436d;

    /* renamed from: e */
    private Runnable f110437e;

    /* renamed from: f */
    private AbstractC43490a f110438f;

    /* renamed from: g */
    private AbstractC43504f.AbstractC43506b.AbstractC43507a f110439g;

    /* renamed from: h */
    private C43909a f110440h;

    /* renamed from: i */
    private C41923a f110441i;

    /* renamed from: j */
    private C42801c f110442j;

    /* renamed from: k */
    private final C43713a f110443k;
    View mCloseView;
    ScrollView mComposeScrollView;
    View mSaveView;
    View mToolbarHeightView;
    LinearLayout mWebviewContainer;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView$a */
    public interface AbstractC43490a {
        /* renamed from: a */
        void mo155320a(EditAutoReplyView editAutoReplyView);
    }

    /* renamed from: b */
    private void m172622b(EmailAutoReply emailAutoReply) {
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public Context getContext() {
        return this.f110436d;
    }

    /* renamed from: a */
    public void mo155335a(String str, String str2, String str3) {
        ArrayList<MailImage> a;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str3) && (a = C41969d.m166937a(str3)) != null && !a.isEmpty()) {
            arrayList.addAll(a);
        }
        if (str2.length() > 20000) {
            MailToast.m173697a((int) R.string.Mail_OOO_Body_Limit);
            C42209j.m168611a("send_discard_draft_fail", 40001, "toast", "", "", 1);
            mo155340d();
            return;
        }
        this.f110439g.mo155368a(new EmailAutoReply.C42059a(false, 0, 0, "").mo151156b(str).mo151159d(str2).mo151154a(), arrayList, new AbstractC41870b<MailUpdateAccountResponse>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.C434866 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                EditAutoReplyView.this.mo155340d();
                MailToast.m173697a((int) R.string.Mail_OOO_failed);
            }

            /* renamed from: a */
            public void mo150435a(MailUpdateAccountResponse mailUpdateAccountResponse) {
                EditAutoReplyView.this.mo155340d();
                MailToast.m173697a((int) R.string.Mail_OOO_Saved);
                EditAutoReplyView.this.mo155332a(C42187a.C42191c.f107433J);
            }
        });
    }

    /* renamed from: a */
    public void mo155332a(String str) {
        C42187a.m168546j(str);
        ((ComponentActivity) this.f110436d).finish();
    }

    /* renamed from: a */
    public void mo155334a(String str, String str2) {
        Log.m165389i("EditAutoReplyView", "retryUploadImage");
        this.f110433a.mo153458a(str, str2);
    }

    /* renamed from: a */
    public void mo155333a(String str, int i) {
        C43849u.m173826a(new Runnable(str, i) {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$L3VJ9OzYx_ntAIK_oLa5IaWkTZE */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                EditAutoReplyView.lambda$L3VJ9OzYx_ntAIK_oLa5IaWkTZE(EditAutoReplyView.this, this.f$1, this.f$2);
            }
        });
    }

    /* renamed from: a */
    public void mo155336a(final String str, final boolean z, final String str2, final long j, final String str3) {
        Log.m165389i("EditAutoReplyView", "updateImageUploadResult");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.RunnableC434899 */

            public void run() {
                EditAutoReplyView.this.f110433a.mo153459a(str, z, str2, j, str3);
            }
        });
    }

    /* renamed from: a */
    public void mo155337a(String[] strArr) {
        this.f110433a.mo153463a(strArr);
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: o */
    public void mo150630o() {
        this.f110443k.mo155831b();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: p */
    public int mo150631p() {
        return this.f110443k.mo155832c();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        this.f110443k.mo155830a();
    }

    /* renamed from: i */
    private void m172627i() {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.RunnableC434888 */

            public void run() {
                if (EditAutoReplyView.this.f110436d instanceof Activity) {
                    Log.m165388i("onRenderProcessGone finish Activity");
                    ((Activity) EditAutoReplyView.this.f110436d).finish();
                }
            }
        });
    }

    /* renamed from: d */
    public void mo155340d() {
        C43909a aVar = this.f110440h;
        if (aVar != null && aVar.mo156328b()) {
            this.f110440h.mo156326a();
        }
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public String getContainerName() {
        return ((BaseMailFragmentActivity) this.f110436d).mo150444a();
    }

    /* renamed from: g */
    private void m172625g() {
        if (this.f110439g.mo155369b()) {
            mo155339c();
        } else {
            this.f110441i.mo150731a(this.f110436d, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.DialogInterface$OnClickListenerC434844 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    EditAutoReplyView.this.mo155339c();
                }
            }, R.string.Mail_OutOfOffice_SaveAnyway);
        }
    }

    /* renamed from: h */
    private void m172626h() {
        C43909a aVar = this.f110440h;
        if (aVar == null || !aVar.mo156328b()) {
            this.f110440h = new C43909a(this.f110436d);
        }
        this.f110440h.mo156327a(C43819s.m173684a((int) R.string.Mail_OOO_Saving));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C41970e.m166941d().mo150952b(this);
        this.f110439g = null;
        this.f110438f = null;
        this.f110433a.mo19616a();
        LinearLayout linearLayout = this.mWebviewContainer;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
    }

    /* renamed from: e */
    public boolean mo155341e() {
        if (this.f110434b <= 0) {
            return true;
        }
        m172617a(this.f110436d, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$EUjFaqr1QdK8gZT3o_eZXTxH07c */

            public final void onClick(DialogInterface dialogInterface, int i) {
                EditAutoReplyView.lambda$EUjFaqr1QdK8gZT3o_eZXTxH07c(EditAutoReplyView.this, dialogInterface, i);
            }
        });
        return false;
    }

    /* renamed from: a */
    public void mo155327a() {
        mo155338b();
    }

    /* renamed from: b */
    public void mo155338b() {
        if (this.f110437e == null) {
            this.f110437e = new Runnable() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.RunnableC434833 */

                public void run() {
                    C41988g.m166978i().requestFocus();
                    C41988g.m166978i().mo153474e();
                }
            };
        }
        this.container.postDelayed(this.f110437e, 100);
    }

    /* renamed from: c */
    public void mo155339c() {
        m172626h();
        String[] c = this.f110439g.mo155370c();
        if (c != null && c.length > 0) {
            Log.m165389i("EditAutoReplyView", "onSaveBtnClick clear image upload ");
            mo155337a(c);
            this.f110439g.mo155371d();
        }
        C41988g.m166978i().mo153449a(new AbstractC42783b() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.C434855 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b
            /* renamed from: a */
            public void mo150645a() {
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b
            /* renamed from: a */
            public void mo150646a(String str, String str2, String str3, List<MailDocsPermissionConfig> list) {
                Log.m165389i("EditAutoReplyView", "onContentFetched");
                EditAutoReplyView.this.mo155335a(str2, str, str3);
            }
        }, ComposeWebView.FetchBodyType.Send);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110438f.mo155320a(this);
        mo155329a(this.f110439g.mo155367a());
        this.mCloseView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$VQIy_cYULXv9eWReVqmGZyao7W4 */

            public final void onClick(View view) {
                EditAutoReplyView.lambda$VQIy_cYULXv9eWReVqmGZyao7W4(EditAutoReplyView.this, view);
            }
        });
        this.mSaveView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$zP5bZIPHcDz_eCDW2ToUDXxJA_Y */

            public final void onClick(View view) {
                EditAutoReplyView.lambda$zP5bZIPHcDz_eCDW2ToUDXxJA_Y(EditAutoReplyView.this, view);
            }
        });
        m172624f();
    }

    /* renamed from: f */
    private void m172624f() {
        this.f110433a = C41988g.m166969a(this.f110436d, "", null);
        if (this.mWebviewContainer.getChildCount() != 0) {
            this.mWebviewContainer.removeAllViews();
        }
        this.mWebviewContainer.addView(this.f110433a);
        this.f110433a.setSelectionChangeCallback(new AbstractC42791e() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$_tExd9bk69EmBGrXVOwA9cwxyiE */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42791e
            public final void onSelectionChange(int i, boolean z) {
                EditAutoReplyView.lambda$_tExd9bk69EmBGrXVOwA9cwxyiE(EditAutoReplyView.this, i, z);
            }
        });
        this.f110433a.mo153448a(this.f110439g, this, this.f110436d, new DraftMailAction("EditAutoReplyView"));
        C41988g.m166978i().setContentChangeCallback(new AbstractC42761a() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.C434811 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42761a
            /* renamed from: a */
            public void mo150697a() {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - EditAutoReplyView.this.f110435c > 1000) {
                    Log.m165389i("EditAutoReplyView", "onContentChange");
                    EditAutoReplyView.this.f110434b = currentTimeMillis;
                }
            }
        });
        C41970e.m166941d().mo150949a(this);
        ((C42815b) aj.m5366a((FragmentActivity) this.f110436d).mo6005a(C42815b.class)).setToolbarCallback(new AbstractC42825f() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.C434822 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f
            /* renamed from: a */
            public void mo150667a(String str) {
                EditAutoReplyView.this.f110433a.mo22331a(str);
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f
            /* renamed from: b */
            public void mo150668b(int i) {
                EditAutoReplyView.this.f110433a.mo153440a(i);
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f
            /* renamed from: a */
            public void mo150666a(int i) {
                C41970e.m166941d().mo150950a(null, i);
            }
        });
        this.f110441i = new C41923a(this.f110436d);
        this.f110442j = (C42801c) aj.m5366a((FragmentActivity) this.f110436d).mo6005a(C42801c.class);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172615a(int i) {
        this.mComposeScrollView.scrollBy(0, i);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172619a(View view) {
        m172625g();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m172621b(View view) {
        if (this.f110434b > 0) {
            m172617a(this.f110436d, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$DP1neqOlTJnfCcIURmQ3bC5CPIU */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    EditAutoReplyView.lambda$DP1neqOlTJnfCcIURmQ3bC5CPIU(EditAutoReplyView.this, dialogInterface, i);
                }
            });
        } else {
            mo155332a(C42187a.C42191c.f107432I);
        }
    }

    /* renamed from: a */
    public void mo155328a(DialogInterface.OnClickListener onClickListener) {
        C41923a aVar = this.f110441i;
        if (aVar != null && onClickListener != null) {
            aVar.mo150743c(this.f110436d, onClickListener);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.C41970e.AbstractC41973b
    /* renamed from: c */
    public void mo150603c(int i) {
        if (i <= 0) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.mToolbarHeightView.getLayoutParams();
            layoutParams.height = 0;
            this.mToolbarHeightView.setLayoutParams(layoutParams);
            this.f110433a.mo153469c();
            return;
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.mToolbarHeightView.getLayoutParams();
        layoutParams2.height = i;
        this.mToolbarHeightView.setLayoutParams(layoutParams2);
        this.f110433a.mo153464b(i);
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: a */
    public void mo150561a(WebView webView) {
        Log.m165388i("onRenderProcessGone 66");
        m172627i();
        C41988g.m166973d();
    }

    /* renamed from: a */
    public void mo155329a(EmailAutoReply emailAutoReply) {
        m172622b(emailAutoReply);
    }

    /* renamed from: a */
    public void mo155330a(ComposeWebView.C42751a aVar) {
        Log.m165389i("EditAutoReplyView", "renderNormalDraft");
        if (this.f110435c == 0) {
            this.f110435c = System.currentTimeMillis();
        }
        C41988g.m166978i().mo153443a((AppCompatActivity) this.f110436d, aVar);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43504f.AbstractC43506b.AbstractC43507a aVar) {
        this.f110439g = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172618a(DialogInterface dialogInterface, int i) {
        m172625g();
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m172620b(DialogInterface dialogInterface, int i) {
        m172625g();
    }

    public EditAutoReplyView(Context context, AbstractC43490a aVar) {
        this.f110436d = context;
        this.f110438f = aVar;
        this.f110443k = new C43713a(context);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m172616a(int i, boolean z) {
        this.mComposeScrollView.postDelayed(new Runnable(i) {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.$$Lambda$EditAutoReplyView$nisAxDAgROfgZEF5Y7wpQt6oK6g */
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                EditAutoReplyView.lambda$nisAxDAgROfgZEF5Y7wpQt6oK6g(EditAutoReplyView.this, this.f$1);
            }
        }, 100);
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m172623b(String str, int i) {
        this.f110433a.mo153467b(str, i);
    }

    /* renamed from: a */
    private void m172617a(Context context, DialogInterface.OnClickListener onClickListener) {
        C25639g gVar = new C25639g(context);
        gVar.mo89256o(R.color.text_title).mo89237b(context.getResources().getString(R.string.Mail_OOO_Content_Exit)).mo89253l(3).mo89242c(context.getResources().getString(R.string.Mail_OOO_Exit_Confirm)).mo89255n(16);
        C25639g.C25640a aVar = new C25639g.C25640a();
        aVar.mo89266a(R.id.lkui_dialog_btn_center);
        aVar.mo89268a(context.getResources().getString(R.string.Mail_Signature_DraftConfirmAction));
        aVar.mo89272e(context.getResources().getColor(R.color.primary_pri_500));
        aVar.mo89270c(17);
        aVar.mo89267a(onClickListener);
        C25639g.C25640a aVar2 = new C25639g.C25640a();
        aVar2.mo89266a(R.id.lkui_dialog_btn_left);
        aVar2.mo89268a(context.getResources().getString(R.string.Mail_Alert_Discard));
        aVar2.mo89272e(context.getResources().getColor(R.color.text_title));
        aVar2.mo89270c(17);
        aVar2.mo89267a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.autoreply.EditAutoReplyView.DialogInterface$OnClickListenerC434877 */

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                EditAutoReplyView.this.mo155332a(C42187a.C42191c.f107431H);
            }
        });
        gVar.mo89229a(aVar).mo89229a(aVar2);
        gVar.mo89239c();
    }
}
