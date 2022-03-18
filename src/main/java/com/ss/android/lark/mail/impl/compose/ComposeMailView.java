package com.ss.android.lark.mail.impl.compose;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseIntArray;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.util.C0844e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import butterknife.BindView;
import com.bytedance.ee.bear.middleground.docsdk.DocSDKBridgeWebView;
import com.bytedance.lark.pb.email.client.v1.MailCanSendExternalResponse;
import com.bytedance.lark.pb.email.client.v1.MailGetScheduleMessageCountResponse;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.bytedance.lynx.webview.glue.IWebViewExtension;
import com.bytedance.lynx.webview.glue.TTRenderProcessGoneDetail;
import com.huawei.hms.location.LocationSettingsStatusCodes;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.compose.AbstractC41994h;
import com.ss.android.lark.mail.impl.compose.C41923a;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.compose.C41974f;
import com.ss.android.lark.mail.impl.compose.ComposeMailView;
import com.ss.android.lark.mail.impl.compose.ComposeScrollView;
import com.ss.android.lark.mail.impl.compose.attachment.C41937b;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.entity.AddressType;
import com.ss.android.lark.mail.impl.entity.C42092d;
import com.ss.android.lark.mail.impl.entity.EmailAliasList;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailDraft;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.ShareMailAddress;
import com.ss.android.lark.mail.impl.home.C42434b;
import com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42761a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42790d;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42791e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42792f;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.ImageItem;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42776b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42815b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.MailToolbarPlugin;
import com.ss.android.lark.mail.impl.p2162b.AbstractC41817a;
import com.ss.android.lark.mail.impl.p2162b.AbstractC41821c;
import com.ss.android.lark.mail.impl.p2162b.C41822d;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42226b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42276h;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42280i;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.service.C43345c;
import com.ss.android.lark.mail.impl.service.C43350d;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.settings.appconfig.MailArticlesLinkConfig;
import com.ss.android.lark.mail.impl.share.C43691h;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43713a;
import com.ss.android.lark.mail.impl.utils.ActivityDependency;
import com.ss.android.lark.mail.impl.utils.C43763f;
import com.ss.android.lark.mail.impl.utils.C43766i;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.mail.impl.view.dialog.C43943c;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.CreateShareButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.MoreButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.SendButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ShareMemberButton;
import com.ss.android.lark.mail.impl.view.titlebar.Button.ShowDiscussShareButton;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.mail.impl.widget.picker.C44066d;
import com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment;
import com.ss.android.lark.mail.impl.widget.time.TimeData;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class ComposeMailView implements C41937b.AbstractC41940a, C41970e.AbstractC41973b, AbstractC41994h.AbstractC41997b, MailToolbarPlugin.AbstractC42812b, AbstractC43719c {

    /* renamed from: A */
    private final C43713a f106276A;

    /* renamed from: B */
    private final C44066d.AbstractC44069a f106277B;

    /* renamed from: C */
    private final EditMultiTimeFragment.EventTimeFragmentAction f106278C;

    /* renamed from: D */
    private final AbstractC41849c.AbstractC41862m f106279D;

    /* renamed from: E */
    private boolean f106280E;

    /* renamed from: F */
    private boolean f106281F;

    /* renamed from: G */
    private ShowDiscussShareButton f106282G;

    /* renamed from: H */
    private SendButton f106283H;

    /* renamed from: I */
    private LKUIStatus f106284I;

    /* renamed from: J */
    private Runnable f106285J;

    /* renamed from: K */
    private Runnable f106286K;

    /* renamed from: L */
    private boolean f106287L;

    /* renamed from: a */
    MailAddress f106288a;

    /* renamed from: b */
    VisibleWrapper f106289b;

    /* renamed from: c */
    public ValueAnimator f106290c;
    @BindView(8339)
    View container;

    /* renamed from: d */
    public final Context f106291d;

    /* renamed from: e */
    public ActivityDependency f106292e;

    /* renamed from: f */
    public AbstractC41994h.AbstractC41997b.AbstractC41998a f106293f;

    /* renamed from: g */
    public ComposeWebView f106294g;

    /* renamed from: h */
    public C41923a f106295h;
    @BindView(8589)
    TextView hintText;

    /* renamed from: i */
    public C43943c f106296i;

    /* renamed from: j */
    public long f106297j;

    /* renamed from: k */
    public long f106298k;

    /* renamed from: l */
    public boolean f106299l;
    @BindView(8577)
    FrameLayout loadingContainer;

    /* renamed from: m */
    public int f106300m;
    @BindView(8578)
    LinearLayout mAttachmentContainer;
    @BindView(8431)
    RecipientSelectView mBccContacts;
    @BindView(10108)
    View mBccPickerView;
    @BindView(LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE)
    RecipientSelectView mCcContacts;
    @BindView(10110)
    View mCcPickerView;
    @BindView(9776)
    ComposeScrollView mComposeScrollView;
    @BindView(9312)
    FrameLayout mFragmentContainer;
    @BindView(8873)
    TextView mFromContacts;
    @BindView(8874)
    TextView mFromContactsTitle;
    @BindView(8875)
    LinearLayout mFromLayout;
    @BindView(10112)
    View mSBccPickerView;
    @BindView(10067)
    RecipientSelectView mSeparatelyBccContacts;
    @BindView(10189)
    View mSubjectTopSplit;
    @BindView(10321)
    RecipientSelectView mToContacts;
    @BindView(10113)
    View mToPickerView;
    @BindView(9570)
    View mToolbarHeightView;
    @BindView(10574)
    LinearLayout mWebviewContainer;

    /* renamed from: n */
    public long f106301n;

    /* renamed from: o */
    public C44066d f106302o;

    /* renamed from: p */
    public EditMultiTimeFragment f106303p;

    /* renamed from: q */
    public boolean f106304q;

    /* renamed from: r */
    private final String f106305r = "ComposeMailView";

    /* renamed from: s */
    private AbstractC41920b f106306s;
    @BindView(8590)
    UDEditText subject;

    /* renamed from: t */
    private ComposeMailAction f106307t;
    @BindView(8591)
    OperationTitleBar titleBar;

    /* renamed from: u */
    private C42801c f106308u;

    /* renamed from: v */
    private C41937b f106309v;

    /* renamed from: w */
    private boolean f106310w;

    /* renamed from: x */
    private boolean f106311x;

    /* renamed from: y */
    private boolean f106312y;

    /* renamed from: z */
    private final SparseIntArray f106313z;

    /* renamed from: com.ss.android.lark.mail.impl.compose.ComposeMailView$a */
    enum EnumC41919a {
        ShareMember,
        ShareDiscuss,
        Send,
        More,
        CreateShare
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.ComposeMailView$b */
    public interface AbstractC41920b {
        /* renamed from: a */
        void mo150554a(ComposeMailView composeMailView);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m166428a(View view, DragEvent dragEvent) {
        return true;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m166476s();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public Context getContext() {
        return this.f106291d;
    }

    /* renamed from: a */
    public void mo150556a() {
        C44066d dVar = this.f106302o;
        if (dVar != null) {
            int a = dVar.mo156738a();
            if (a == 2) {
                this.mCcContacts.requestFocus();
            } else if (a == 3) {
                this.mBccContacts.requestFocus();
            } else if (a != 4) {
                this.mToContacts.requestFocus();
            } else {
                this.mSeparatelyBccContacts.requestFocus();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166425a(Locale locale) {
        Log.m165389i("ComposeMailView", "onLanguageChangeListener");
        m166402E();
        this.f106293f.mo150920f();
    }

    /* renamed from: a */
    public void mo150575a(ActivityDependency aVar) {
        this.f106292e = aVar;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150588a(boolean z) {
        SendButton sendButton = this.f106283H;
        if (sendButton != null) {
            sendButton.setEnable(z);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public boolean mo150593a(boolean z, final IGetDataCallback iGetDataCallback, LifecycleOwner lifecycleOwner) {
        this.f106299l = z;
        if (this.f106310w) {
            Context context = this.f106291d;
            if (context != null) {
                ((C42276h) C42344d.m169091a(C42276h.class, context)).mo152380b((String) null);
            }
            String[] l = this.f106293f.mo150929l();
            if (l != null && l.length > 0) {
                Log.m165389i("ComposeMailView", "fetchDraftData clear image upload ");
                mo150591a(l);
                this.f106293f.mo150930m();
            }
            final MailDraft I = m166406I();
            final long j = this.f106297j;
            C42226b.m168638a().mo152308a("email_get_body_html");
            C41988g.m166978i().mo153449a(new AbstractC42783b() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass16 */

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b
                /* renamed from: a */
                public void mo150645a() {
                    if (ComposeMailView.this.f106291d != null) {
                        ((C42276h) C42344d.m169091a(C42276h.class, ComposeMailView.this.f106291d)).mo152372a("cancel", 0);
                    }
                }

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b
                /* renamed from: a */
                public void mo150646a(String str, String str2, String str3, List<MailDocsPermissionConfig> list) {
                    Log.m165389i("ComposeMailView", "onContentFetched");
                    if (!TextUtils.isEmpty(str)) {
                        ComposeMailView.this.mo150595b(str.length());
                    }
                    I.mo151340d(str2);
                    I.mo151337c(str);
                    I.mo151349f(list);
                    ComposeMailView.this.f106293f.mo150892a(I, ComposeMailView.this.f106299l, str3, j, iGetDataCallback);
                    long j = 0;
                    ComposeMailView.this.f106297j = 0;
                    if (ComposeMailView.this.f106291d != null) {
                        C42276h hVar = (C42276h) C42344d.m169091a(C42276h.class, ComposeMailView.this.f106291d);
                        if (str != null) {
                            j = (long) str.length();
                        }
                        hVar.mo152372a("success", j);
                    }
                }
            }, ComposeWebView.FetchBodyType.Draft);
            return true;
        } else if (iGetDataCallback == null) {
            return false;
        } else {
            iGetDataCallback.onError(new ErrorResult(""));
            return false;
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150585a(ArrayList<LocalAttachment> arrayList, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateAttachmentViewController, size: ");
        sb.append(arrayList == null ? 0 : arrayList.size());
        Log.m165389i("ComposeMailView", sb.toString());
        this.f106309v.mo150782a(arrayList, z);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150578a(String str, int i, int i2) {
        this.f106309v.mo150781a(str, i, i2, 0);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150579a(String str, int i, int i2, long j) {
        this.f106309v.mo150781a(str, i, i2, j);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: b */
    public void mo150601b(boolean z) {
        this.f106309v.mo150784a(z);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150573a(ComposeWebView.C42751a aVar) {
        Log.m165389i("ComposeMailView", "renderNormalDraft");
        if (this.f106298k == 0) {
            this.f106298k = System.currentTimeMillis();
        }
        C41988g.m166978i().mo153443a((BaseMailFragmentActivity) this.f106291d, aVar);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150580a(String str, PermissionCode permissionCode) {
        Log.m165389i("ComposeMailView", "renderSharedDraft");
        C41988g.m166978i().mo153444a((BaseMailFragmentActivity) this.f106291d, str, permissionCode, new AbstractC42792f() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass17 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42792f
            /* renamed from: a */
            public void mo150647a(String str) {
                Log.m165389i("ComposeMailView", "renderSharedDraft onContentUpdated");
                ComposeMailView.this.f106293f.mo150921f(str);
            }
        });
    }

    /* renamed from: a */
    private boolean m166429a(C0844e<Group, View> eVar) {
        return (eVar.f3317a == null || m166439b(eVar.f3317a)) && m166439b(eVar.f3318b) && (((eVar.f3318b instanceof TokenCompleteTextView) && eVar.f3318b.mo156138l()) || TextUtils.isEmpty(eVar.f3318b.getText()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0083  */
    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo150563a(com.bytedance.lark.pb.email.client.v1.PermissionCode r8) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.ComposeMailView.mo150563a(com.bytedance.lark.pb.email.client.v1.PermissionCode):void");
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150560a(final View view) {
        Log.m165389i("ComposeMailView", "onFocusChanged:" + view);
        if (this.f106300m == 0) {
            this.container.postDelayed(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass19 */

                public void run() {
                    if (ComposeMailView.this.f106300m == 0) {
                        Log.m165389i("ComposeMailView", "onFocusChanged");
                        ComposeMailView.this.mo150607d();
                        View view = view;
                        if (view instanceof TextView) {
                            if (ComposeMailView.this.container != null) {
                                ComposeMailView.this.container.postDelayed(new Runnable() {
                                    /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass19.RunnableC419081 */

                                    public void run() {
                                        Log.m165389i("ComposeMailView", "onFocusChanged TextView");
                                        ComposeMailView.this.mo150562a((TextView) view);
                                    }
                                }, 300);
                            }
                        } else if (view != null && ComposeMailView.this.container != null) {
                            ComposeMailView.this.container.postDelayed(new Runnable() {
                                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass19.RunnableC419092 */

                                public void run() {
                                    Log.m165389i("ComposeMailView", "onFocusChanged composeWebView");
                                    if (ComposeMailView.this.f106294g != null) {
                                        ((InputMethodManager) ComposeMailView.this.f106291d.getSystemService("input_method")).showSoftInput(ComposeMailView.this.f106294g, 1);
                                    }
                                }
                            }, 500);
                        }
                    }
                }
            }, 100);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150565a(final C41923a.EnumC41933a aVar) {
        Log.m165389i("ComposeMailView", "showInterruptEditingDialog");
        this.f106295h.mo150736a(aVar, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass20 */

            public void onClick(DialogInterface dialogInterface, int i) {
                int i2 = AnonymousClass50.f106381b[aVar.ordinal()];
                if (i2 == 1) {
                    ComposeMailView.this.f106293f.mo150934q();
                } else if (i2 == 2) {
                    ComposeMailView.this.f106293f.mo150936s();
                } else if (i2 == 3) {
                    ComposeMailView.this.f106293f.mo150935r();
                }
            }
        });
    }

    /* renamed from: a */
    public void m166438b(ImageItem imageItem) {
        Log.m165389i("ComposeMailView", "renderUploadedImageInSharedDraft");
        this.f106294g.mo153452a(imageItem);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150566a(LocalAttachment localAttachment) {
        Log.m165389i("ComposeMailView", "appendSharedAttachment");
        this.f106294g.mo153446a(localAttachment);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150557a(int i) {
        Log.m165389i("ComposeMailView", "deleteSharedAttachment");
        this.f106294g.mo153470c(i);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150577a(final String str, final int i) {
        Log.m165379d("ComposeMailView", "updateImageUploadingProgress");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ComposeMailView", "updateImageUploadingProgress empty uuid");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass21 */

                public void run() {
                    ComposeMailView.this.f106294g.mo153467b(str, i);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150584a(final String str, final boolean z, final String str2, final long j, final String str3) {
        Log.m165389i("ComposeMailView", "updateImageUploadResult");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ComposeMailView", "updateImageUploadResult empty uuid");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass23 */

                public void run() {
                    ComposeMailView.this.f106294g.mo153459a(str, z, str2, j, str3);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150582a(String str, String str2) {
        Log.m165389i("ComposeMailView", "retryUploadImage");
        this.f106294g.mo153458a(str, str2);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150559a(DialogInterface.OnClickListener onClickListener) {
        C41923a aVar = this.f106295h;
        if (aVar != null && onClickListener != null) {
            aVar.mo150743c(this.f106291d, onClickListener);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150591a(String[] strArr) {
        this.f106294g.mo153463a(strArr);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150572a(MailImage mailImage) {
        String d = C26311p.m95284d(mailImage.mo151477e());
        if (TextUtils.isEmpty(d)) {
            d = "png";
        }
        C43849u.m173826a(new Runnable(new ImageItem(mailImage.mo151481g(), C43691h.m173283b() + mailImage.mo151480f() + "?cid=" + mailImage.mo151481g() + "&token=" + mailImage.mo151480f() + "&size=" + mailImage.mo151482h() + "&fileType=" + d + "&isShare=true", mailImage.mo151484i(), mailImage.mo151485j(), mailImage.mo151477e())) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$DwAd9abOr1H7iwFUQpch8qVBp94 */
            public final /* synthetic */ ImageItem f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ComposeMailView.this.m166438b((ComposeMailView) this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: b */
    public void mo150596b(DialogInterface.OnClickListener onClickListener) {
        Log.m165389i("ComposeMailView", "showImageUploadingOrFailDialog");
        if (this.f106295h == null) {
            this.f106295h = new C41923a(this.f106291d);
        }
        this.f106295h.mo150731a(this.f106291d, onClickListener, R.string.Mail_Common_Confirm);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150576a(String str) {
        Log.m165389i("ComposeMailView", "updateSharedSubject");
        this.f106294g.mo153466b(str);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150581a(String str, ShareMailAddress shareMailAddress) {
        Log.m165389i("ComposeMailView", "addSharedRecipient");
        this.f106294g.mo153457a(str, shareMailAddress);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: b */
    public void mo150600b(String str, ShareMailAddress shareMailAddress) {
        char c;
        Log.m165389i("ComposeMailView", "removeSharedRecipient");
        if (TextUtils.isEmpty(str) || shareMailAddress == null) {
            Log.m165383e("ComposeMailView", "removeSharedRecipient invalid parameter");
            return;
        }
        MailDraft I = m166406I();
        List<MailAddress> list = null;
        str.hashCode();
        int i = 0;
        switch (str.hashCode()) {
            case 3168:
                if (str.equals("cc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3707:
                if (str.equals("to")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 97346:
                if (str.equals("bcc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                list = I.mo151343e();
                break;
            case 1:
                list = I.mo151339d();
                break;
            case 2:
                list = I.mo151347f();
                break;
        }
        if (CollectionUtils.isEmpty(list)) {
            Log.m165383e("ComposeMailView", "removeSharedRecipient empty list");
            return;
        }
        int size = list.size();
        while (true) {
            if (i < size) {
                MailAddress mailAddress = list.get(i);
                if (!(mailAddress instanceof ShareMailAddress) || !((ShareMailAddress) mailAddress).mo151780a(shareMailAddress)) {
                    i++;
                }
            } else {
                i = -1;
            }
        }
        if (i == -1) {
            Log.m165383e("ComposeMailView", "removeSharedRecipient not found");
        } else {
            this.f106294g.mo153453a(str, i);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150583a(String str, List<ShareMailAddress> list) {
        Log.m165389i("ComposeMailView", "updateShareContacts");
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 3168:
                    if (str.equals("cc")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3707:
                    if (str.equals("to")) {
                        c = 1;
                        break;
                    }
                    break;
                case 97346:
                    if (str.equals("bcc")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.mCcContacts.mo155987a((List<? extends MailAddress>) list);
                    return;
                case 1:
                    this.mToContacts.mo155987a((List<? extends MailAddress>) list);
                    return;
                case 2:
                    this.mBccContacts.mo155987a((List<? extends MailAddress>) list);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m166427a(EnumC41919a[] aVarArr) {
        int i;
        Log.m165389i("ComposeMailView", "updateTitleBarButtonList");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (aVarArr == null) {
            i = 0;
        } else {
            i = aVarArr.length;
        }
        int i2 = 0;
        while (true) {
            ShowDiscussShareButton showDiscussShareButton = null;
            if (i2 >= i) {
                break;
            }
            int i3 = AnonymousClass50.f106382c[aVarArr[i2].ordinal()];
            if (i3 == 1) {
                SendButton sendButton = new SendButton(new AbsButton.AbstractC43948a() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$b0nMVDxGGbLaxiBT1yvTOkcElSo */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                    public final void onButtonClick(View view) {
                        ComposeMailView.this.m166462g((ComposeMailView) view);
                    }
                });
                this.f106283H = sendButton;
                showDiscussShareButton = sendButton;
            } else if (i3 == 2) {
                showDiscussShareButton = new MoreButton(new AbsButton.AbstractC43948a() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$nnHO4Dp9TFiEOj7xm1it1bjWQiY */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                    public final void onButtonClick(View view) {
                        ComposeMailView.this.m166457f((ComposeMailView) view);
                    }
                });
            } else if (i3 == 3) {
                showDiscussShareButton = new CreateShareButton(new AbsButton.AbstractC43948a() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$pdGMSAADkG0ntRayWsxolX1ASKQ */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                    public final void onButtonClick(View view) {
                        ComposeMailView.this.m166453e((ComposeMailView) view);
                    }
                });
            } else if (i3 == 4) {
                showDiscussShareButton = new ShareMemberButton(new AbsButton.AbstractC43948a() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$gQP89xVPcWu72gsVXuFgZCv6lP0 */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                    public final void onButtonClick(View view) {
                        ComposeMailView.this.m166448d((ComposeMailView) view);
                    }
                });
            } else if (i3 == 5) {
                ShowDiscussShareButton showDiscussShareButton2 = new ShowDiscussShareButton(new AbsButton.AbstractC43948a() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$bhYgpZMZ4LT2KukRrVy9yq7pTPQ */

                    @Override // com.ss.android.lark.mail.impl.view.titlebar.AbsButton.AbstractC43948a
                    public final void onButtonClick(View view) {
                        ComposeMailView.this.m166441c((ComposeMailView) view);
                    }
                });
                this.f106282G = showDiscussShareButton2;
                showDiscussShareButton = showDiscussShareButton2;
            }
            if (showDiscussShareButton != null) {
                arrayList.add(showDiscussShareButton == 1 ? 1 : 0);
            }
            i2++;
        }
        this.titleBar.mo156419a(arrayList, null);
        if (this.mToContacts.getObjects().size() > 0 || this.mCcContacts.getObjects().size() > 0 || this.mBccContacts.getObjects().size() > 0 || this.mSeparatelyBccContacts.getObjects().size() > 0) {
            z = true;
        }
        mo150588a(z);
    }

    /* renamed from: a */
    public void mo150558a(long j, String str) {
        C42226b.m168638a().mo152308a(C42226b.C42229b.f107486b);
        if (j > 0) {
            LKUIToast.showLoading(this.f106291d, (int) R.string.Mail_SendLater_Scheduling);
        } else {
            LKUIToast.showLoading(this.f106291d, (int) R.string.Mail_Toast_Sending);
        }
        mo150588a(false);
        MailDraft I = m166406I();
        I.mo151336c(j);
        m166480w();
        ((C42280i) C42344d.m169091a(C42280i.class, this.f106291d)).mo152380b("");
        C41822d.C41827b bVar = new C41822d.C41827b();
        bVar.mo150392a("key_chain_capacity_limit", new AbstractC41817a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$LARnq1j0O5IqfVWPaicu_AyPi0 */

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166458f((ComposeMailView) aVar);
            }
        });
        bVar.mo150392a("key_chain_invalid_recipients", new AbstractC41817a(I) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$afD2V8JWK7r8JAEHSalfe6UU */
            public final /* synthetic */ MailDraft f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166475o(this.f$1, aVar);
            }
        });
        bVar.mo150392a("key_chain_restrict_outbound", new AbstractC41817a(I) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$ok8Z1yk8266veZJhlUr4Je2USqA */
            public final /* synthetic */ MailDraft f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166474n(this.f$1, aVar);
            }
        });
        bVar.mo150392a("key_chain_recipients_limited", new AbstractC41817a(I) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$sMt15VnigDNsJWMZECe2GVXzLM */
            public final /* synthetic */ MailDraft f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166473m(this.f$1, aVar);
            }
        });
        bVar.mo150392a("key_chain_uploading", new AbstractC41817a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$KPLwojHzzEKEcjUdJzyfElX9OgM */

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166454e((ComposeMailView) aVar);
            }
        });
        bVar.mo150392a("key_chain_upload_failed", new AbstractC41817a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$0wIYo7N9sgquSAP7Mcw97892j4 */

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166450d((ComposeMailView) aVar);
            }
        });
        bVar.mo150392a("key_chain_translate_attachment", new AbstractC41817a(I) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$hyyVTfEudhhGPL_cUsFlvga_PU */
            public final /* synthetic */ MailDraft f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166472l(this.f$1, aVar);
            }
        });
        bVar.mo150390a(new AbstractC41817a(I) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$fNGVJiIchEVPPsBNjPro_eCwH2A */
            public final /* synthetic */ MailDraft f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
            public final void run(C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.m166471k(this.f$1, aVar);
            }
        });
        bVar.mo150391a(new C41822d.AbstractC41829c() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass25 */

            @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41829c
            /* renamed from: a */
            public void mo150395a(boolean z) {
            }

            @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41829c
            /* renamed from: a */
            public void mo150394a(AbstractC41817a aVar) {
                if (aVar instanceof AbstractC41821c) {
                    ComposeMailView.this.mo150599b(((AbstractC41821c) aVar).mo150383a());
                }
            }
        }).mo150393a().mo150384a();
    }

    /* renamed from: a */
    public void mo150570a(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "checkExceedSizeAndSend");
        if (mailDraft.mo151369u() > 26214400) {
            mo150618g();
            mo150615f();
            mo150564a(aVar, true);
            return;
        }
        aVar.mo150380b();
    }

    /* renamed from: a */
    public void mo150564a(C41822d.AbstractC41826a aVar, boolean z) {
        m166481x();
        if (z) {
            ((C42280i) C42344d.m169091a(C42280i.class, this.f106291d)).mo152408q();
        } else {
            ((C42280i) C42344d.m169091a(C42280i.class, this.f106291d)).mo152407p();
        }
        C42344d.m169096b(this.f106291d);
        aVar.mo150379a();
    }

    /* renamed from: a */
    private void m166421a(MailAddress mailAddress) {
        C42176e.m168344a().mo152194a(new AbstractC41870b<MailCanSendExternalResponse>() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass27 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                Log.m165398w("ComposeMailView", "requestLimitOutgoing error:", errorResult);
                ComposeMailView.this.f106304q = true;
            }

            /* renamed from: a */
            public void mo150435a(MailCanSendExternalResponse mailCanSendExternalResponse) {
                Log.m165397w("ComposeMailView", "requestLimitOutgoing success");
                if (mailCanSendExternalResponse != null) {
                    ComposeMailView.this.f106304q = mailCanSendExternalResponse.canSendExternal.booleanValue();
                    return;
                }
                ComposeMailView.this.f106304q = true;
            }
        }, mailAddress);
    }

    /* renamed from: b */
    public void mo150597b(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "checkHarmfulFileAndSend");
        if (m166482y()) {
            mo150618g();
            this.f106295h.mo150732a(this.f106291d, new DialogInterface.OnClickListener(mailDraft, aVar) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$Zh7H_9e4RJnVkyXqdjTLF9s5fz4 */
                public final /* synthetic */ MailDraft f$1;
                public final /* synthetic */ C41822d.AbstractC41826a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166437b(this.f$1, this.f$2, dialogInterface, i);
                }
            }, new DialogInterface.OnCancelListener(aVar) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26CD8r2zOPQee7l_qSOdRaoaBc */
                public final /* synthetic */ C41822d.AbstractC41826a f$1;

                {
                    this.f$1 = r2;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    ComposeMailView.this.m166444c((ComposeMailView) this.f$1, (C41822d.AbstractC41826a) dialogInterface);
                }
            });
            return;
        }
        aVar.mo150380b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166422a(MailDraft mailDraft, C41822d.AbstractC41826a aVar, DialogInterface dialogInterface, int i) {
        this.f106293f.mo150904b(mailDraft);
        aVar.mo150380b();
    }

    /* renamed from: b */
    public void mo150595b(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("length", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C42226b.m168638a().mo152309a("email_get_body_html", jSONObject);
    }

    /* renamed from: b */
    public void mo150599b(String str) {
        ((C42280i) C42344d.m169091a(C42280i.class, this.f106291d)).mo152391h(str);
    }

    /* renamed from: a */
    public void mo150587a(List<MailDocsPermissionConfig> list, MailDraft mailDraft, final C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "checkDocLinkData");
        this.f106293f.mo150901a(list, mailDraft, new C41974f.AbstractC41986b() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass30 */

            @Override // com.ss.android.lark.mail.impl.compose.C41974f.AbstractC41986b
            /* renamed from: a */
            public void mo150662a() {
                ComposeMailView.this.mo150618g();
            }

            @Override // com.ss.android.lark.mail.impl.compose.C41974f.AbstractC41986b
            /* renamed from: a */
            public void mo150663a(boolean z) {
                Log.m165389i("ComposeMailView", "checkDocLinkData onConfirmPermissionResult confirmed: " + z);
                if (z) {
                    aVar.mo150380b();
                    return;
                }
                ComposeMailView.this.mo150618g();
                ComposeMailView.this.mo150564a(aVar, false);
            }
        });
    }

    /* renamed from: a */
    public void mo150571a(MailDraft mailDraft, boolean z, C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "callbackToSend");
        this.container.clearFocus();
        mo150607d();
        if (mailDraft.mo151316A()) {
            LKUIToast.showInCenter(this.f106291d, (int) R.string.Mail_Edit_AttachmentTransferAutomatically);
        }
        this.f106293f.mo150891a(mailDraft, z);
        aVar.mo150380b();
    }

    /* renamed from: a */
    public List<SearchBaseInfo> mo150555a(RecipientSelectView recipientSelectView) {
        ArrayList arrayList = new ArrayList();
        List<MailAddress> C = m166400C();
        if (C != null && !C.isEmpty()) {
            for (MailAddress mailAddress : C) {
                if (mailAddress != null) {
                    String j = mailAddress.mo151189j();
                    SearchBaseInfo searchBaseInfo = new SearchBaseInfo();
                    searchBaseInfo.setAvatarKey(mailAddress.mo151195p());
                    searchBaseInfo.setTitle(mailAddress.mo151176a());
                    searchBaseInfo.setSubTitle(mailAddress.mo151177b());
                    if (!TextUtils.isEmpty(j)) {
                        searchBaseInfo.setId(j);
                        searchBaseInfo.setType(1);
                    } else if (!TextUtils.isEmpty(mailAddress.mo151182e())) {
                        searchBaseInfo.setId(mailAddress.mo151182e());
                        searchBaseInfo.setType(16);
                    }
                    arrayList.add(searchBaseInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150569a(MailAddress mailAddress, EmailAliasList emailAliasList, boolean z, boolean z2) {
        if (mailAddress == null || !mailAddress.mo151185g()) {
            Log.m165397w("ComposeMailView", "from is legal:" + mailAddress);
            return;
        }
        if (TextUtils.isEmpty(mailAddress.mo151196q())) {
            mailAddress = mailAddress.mo151199t().mo151216f(C41816b.m166115a().mo150137d()).mo151210a();
        }
        if (mailAddress.mo151190k() != AddressType.SHARED_MAILBOX && !C43277a.m171921a().mo154951o()) {
            mailAddress = mailAddress.mo151199t().mo151207a(AddressType.SHARED_MAILBOX).mo151210a();
        }
        boolean z3 = true;
        boolean z4 = emailAliasList != null && emailAliasList.mo151122d().size() >= 2;
        if (!z && !z4) {
            z3 = false;
        }
        boolean z5 = this.f106280E & z3;
        this.f106288a = mailAddress;
        if (C41970e.m166941d().mo150951a()) {
            ((C42787b) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42787b.class)).setCurrentAddress(mailAddress);
        }
        if (z2) {
            m166421a(mailAddress);
        }
        if (z5) {
            this.mFromLayout.setVisibility(0);
            mo150619g(false);
            if (z4) {
                Drawable b = C0215a.m655b(this.f106291d, R.drawable.ud_icon_av_set_down_outlined);
                int dp2px = UIHelper.dp2px(14.0f);
                if (b != null) {
                    b.setBounds(0, 0, dp2px, dp2px);
                    this.mFromContacts.setCompoundDrawables(null, null, b, null);
                }
                if (!this.mFromContacts.hasOnClickListeners()) {
                    this.mFromContacts.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass31 */

                        /* access modifiers changed from: private */
                        /* access modifiers changed from: public */
                        /* renamed from: a */
                        private /* synthetic */ void m166598a(MailAddress mailAddress) {
                            if (TextUtils.isEmpty(mailAddress.mo151196q())) {
                                mailAddress = mailAddress.mo151199t().mo151216f(C41816b.m166115a().mo150137d()).mo151210a();
                            }
                            ComposeMailView.this.f106288a = mailAddress;
                            ComposeMailView.this.mo150619g(true);
                        }

                        public void onClick(View view) {
                            MailAddress mailAddress;
                            ComposeMailView.this.mo150607d();
                            if (ComposeMailView.this.f106288a == null) {
                                mailAddress = C43350d.m172098a().mo155044j().mo151118b();
                            } else {
                                mailAddress = ComposeMailView.this.f106288a;
                            }
                            ComposeMailView composeMailView = ComposeMailView.this;
                            composeMailView.f106296i = composeMailView.f106295h.mo150726a(ComposeMailView.this.f106291d, C43350d.m172098a().mo155044j().mo151122d(), mailAddress, new C41923a.AbstractC41934b() {
                                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$31$ND61FNTRRwX3XhTzFby9wyfIgUs */

                                @Override // com.ss.android.lark.mail.impl.compose.C41923a.AbstractC41934b
                                public final void onAddressSelected(MailAddress mailAddress) {
                                    ComposeMailView.AnonymousClass31.this.m166598a(mailAddress);
                                }
                            });
                        }
                    });
                } else {
                    this.f106295h.mo150737a(this.f106296i, emailAliasList.mo151122d(), this.f106288a, new C41923a.AbstractC41934b() {
                        /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$SB_lu38qTxPhIgN9QNyeQl3BIkI */

                        @Override // com.ss.android.lark.mail.impl.compose.C41923a.AbstractC41934b
                        public final void onAddressSelected(MailAddress mailAddress) {
                            ComposeMailView.this.m166436b((ComposeMailView) mailAddress);
                        }
                    });
                }
            } else {
                this.mFromContacts.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                this.mFromContacts.setOnClickListener(null);
            }
        } else {
            this.mFromLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150568a(EmailAliasList emailAliasList) {
        boolean z;
        if (this.f106288a != null && emailAliasList.mo151122d() != null) {
            Iterator<MailAddress> it = emailAliasList.mo151122d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                MailAddress next = it.next();
                if (next != null && TextUtils.equals(next.mo151182e(), this.f106288a.mo151182e())) {
                    z = true;
                    mo150569a(next, emailAliasList, C43277a.m171921a().mo154952p(), false);
                    break;
                }
            }
            if (!z) {
                mo150569a(emailAliasList.mo151118b(), emailAliasList, C43277a.m171921a().mo154952p(), false);
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150590a(boolean z, boolean z2, List<MailAddress> list, List<MailAddress> list2, List<MailAddress> list3) {
        mo150623h(z2);
        this.f106281F = z;
        m166426a(z, list, list2, list3);
        m166416a((View) this.mToContacts, this.mToPickerView, false, this.container.findViewById(R.id.show_ccbcc).getVisibility());
    }

    /* renamed from: a */
    private void m166426a(boolean z, List<MailAddress> list, List<MailAddress> list2, List<MailAddress> list3) {
        TextPaint textPaint = this.mToContacts.getTextPaint();
        ArrayList arrayList = new ArrayList();
        this.mToContacts.setInSeparately(z);
        this.mCcContacts.setInSeparately(z);
        this.mBccContacts.setInSeparately(z);
        this.f106289b.mo150723c(z);
        this.mSeparatelyBccContacts.setInSeparately(z);
        if (z) {
            arrayList.addAll(list);
            arrayList.addAll(list2);
            arrayList.addAll(list3);
            this.mSeparatelyBccContacts.mo155987a((List<? extends MailAddress>) arrayList);
            return;
        }
        this.mToContacts.mo155988a(list, textPaint);
        this.mCcContacts.mo155988a(list2, textPaint);
        this.mBccContacts.mo155988a(list3, textPaint);
    }

    /* renamed from: a */
    public void mo150586a(List<SearchBaseInfo> list, int i) {
        C44066d dVar = this.f106302o;
        boolean z = dVar == null;
        if (dVar != null) {
            dVar.mo156739a(list, i);
        } else {
            this.f106302o = new C44066d(this.f106277B, list, i);
        }
        m166423a(this.f106292e, this.f106302o, z);
        C42330c.m169041a(i);
    }

    /* renamed from: a */
    private void m166423a(ActivityDependency aVar, Fragment fragment, boolean z) {
        this.mFragmentContainer.setVisibility(0);
        if (z) {
            aVar.mo150552a(fragment, this.mFragmentContainer.getId());
        } else {
            aVar.mo150551a(fragment);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo150592a(com.ss.android.lark.mail.impl.utils.recipient.SearchAddress r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ComposeMailView"
            java.lang.String r1 = "addMentionedRecipient"
            com.ss.android.lark.log.Log.m165389i(r0, r1)
            java.util.List r1 = r4.m166400C()
            boolean r2 = com.larksuite.framework.utils.CollectionUtils.isNotEmpty(r1)
            if (r2 == 0) goto L_0x0043
            java.util.Iterator r1 = r1.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r1.next()
            com.ss.android.lark.mail.impl.entity.MailAddress r2 = (com.ss.android.lark.mail.impl.entity.MailAddress) r2
            if (r2 == 0) goto L_0x0015
            java.lang.String r3 = r2.mo151182e()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x002e
            goto L_0x0015
        L_0x002e:
            java.lang.String r2 = r2.mo151182e()
            java.lang.String r3 = r5.mo151182e()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0015
            r1 = 0
            java.lang.String r2 = "addMentionedRecipient no need to add"
            com.ss.android.lark.log.Log.m165389i(r0, r2)
            goto L_0x0044
        L_0x0043:
            r1 = 1
        L_0x0044:
            if (r1 == 0) goto L_0x004d
            com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView r0 = r4.m166401D()
            r0.mo156134i(r5)
        L_0x004d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.ComposeMailView.mo150592a(com.ss.android.lark.mail.impl.utils.recipient.SearchAddress):boolean");
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: b */
    public void mo150598b(SearchAddress searchAddress) {
        Log.m165389i("ComposeMailView", "removeMentionedRecipient");
        List<MailAddress> C = m166400C();
        if (CollectionUtils.isNotEmpty(C)) {
            for (MailAddress mailAddress : C) {
                if ((mailAddress instanceof SearchAddress) && ((SearchAddress) mailAddress).mo156033y() && TextUtils.equals(mailAddress.mo151182e(), searchAddress.mo151182e())) {
                    Log.m165389i("ComposeMailView", "removeMentionedRecipient do remove");
                    m166401D().mo155999c(mailAddress);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: a */
    public void mo150589a(boolean z, ArrayList<LocalAttachment> arrayList, boolean z2) {
        this.f106309v.mo150783a(arrayList, z2, true);
        if (z) {
            this.f106295h.mo150730a(this.f106291d, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$X8kMq6dq9Y8kMVip6VkoRtfHkxY */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166430b((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m166424a(List list, DialogInterface dialogInterface, int i) {
        if (list.get(i) != null) {
            ((C42092d) list.get(i)).mo151841c();
        }
    }

    /* renamed from: a */
    public void mo150562a(final TextView textView) {
        if (this.f106285J == null) {
            this.f106285J = new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass46 */

                public void run() {
                    if (textView != null) {
                        ((InputMethodManager) ComposeMailView.this.f106291d.getSystemService("input_method")).showSoftInput(textView, 1);
                    }
                }
            };
        }
        this.container.postDelayed(this.f106285J, 100);
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: a */
    public void mo150561a(WebView webView) {
        Log.m165388i("onRenderProcessGone 22");
        mo150633r();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: M */
    private /* synthetic */ void m166410M() {
        this.mComposeScrollView.fullScroll(130);
    }

    /* renamed from: x */
    private void m166481x() {
        AbstractC41994h.AbstractC41997b.AbstractC41998a aVar = this.f106293f;
        if (aVar != null) {
            aVar.mo150942y();
        }
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: p */
    public int mo150631p() {
        return this.f106276A.mo155832c();
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: q */
    public void mo150632q() {
        this.f106276A.mo155830a();
    }

    /* renamed from: D */
    private RecipientSelectView m166401D() {
        if (this.f106281F) {
            return this.mSeparatelyBccContacts;
        }
        return this.mToContacts;
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    public String getContainerName() {
        return ((BaseMailFragmentActivity) this.f106291d).mo150444a();
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: j */
    public void mo150625j() {
        C41923a aVar = this.f106295h;
        if (aVar != null) {
            aVar.mo150741b(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass39 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.f106293f.mo150920f();
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41937b.AbstractC41940a
    /* renamed from: l */
    public void mo150627l() {
        this.mComposeScrollView.postDelayed(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$xXS8evhIHP6uGq7HWDkYReysMNQ */

            public final void run() {
                ComposeMailView.this.m166410M();
            }
        }, 300);
    }

    /* renamed from: m */
    public void mo150628m() {
        mo150593a(false, (IGetDataCallback) new IGetDataCallback() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass45 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IRequestCallback
            public void onError(ErrorResult errorResult) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                MailToast.m173698a((int) R.string.Mail_Toast_DraftSaved, MailToast.Type.SUCCESS);
            }
        }, (LifecycleOwner) ((AppCompatActivity) this.f106291d));
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c
    /* renamed from: o */
    public void mo150630o() {
        this.f106287L = true;
        this.f106276A.mo155831b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: A */
    private void m166398A() {
        if (!C42434b.m169442a(getContext())) {
            C42187a.m168496b();
            C42176e.m168344a().mo152231b(new AbstractC41870b<MailGetScheduleMessageCountResponse>() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass41 */

                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                /* renamed from: a */
                public void mo150434a(ErrorResult errorResult) {
                    ComposeMailView.this.mo150626k();
                }

                /* renamed from: a */
                public void mo150435a(MailGetScheduleMessageCountResponse mailGetScheduleMessageCountResponse) {
                    if (mailGetScheduleMessageCountResponse == null || mailGetScheduleMessageCountResponse.schedule_send_message_count == null || mailGetScheduleMessageCountResponse.schedule_send_message_count.longValue() < 100) {
                        ComposeMailView.this.mo150626k();
                    } else {
                        MailToast.m173697a((int) R.string.Mail_SendLater_ClientLimit);
                    }
                }
            });
        }
    }

    /* renamed from: F */
    private void m166403F() {
        this.mToContacts.setSupportDragAndDrop(true);
        this.mCcContacts.setSupportDragAndDrop(true);
        this.mBccContacts.setSupportDragAndDrop(true);
        this.subject.setOnDragListener($$Lambda$ComposeMailView$H76Sc5VfjQocxJDUrKQ6oeEcbA.INSTANCE);
    }

    /* renamed from: J */
    private boolean m166407J() {
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.send_separately") || !C43350d.m172098a().mo155058x()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: K */
    private /* synthetic */ void m166408K() {
        if (this.f106293f.mo150886a(m166406I(), this.f106297j) != 1) {
            C41923a.m166667b(this.f106291d, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$xCTWNUmuTrjG3ssSn6XlEsm1dEc */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166415a((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
        } else {
            this.f106293f.mo150902a(true);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: L */
    private /* synthetic */ void m166409L() {
        if (!this.f106293f.mo150928k()) {
            mo150596b(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass43 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.mo150628m();
                }
            });
            return;
        }
        mo150628m();
        C42330c.m169079f("draft_save");
    }

    /* renamed from: t */
    private void m166477t() {
        C43350d.m172098a().mo155045k().mo5923a((FragmentActivity) this.f106291d, new AbstractC1178x<EmailAliasList>() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419102 */

            /* renamed from: a */
            public void onChanged(EmailAliasList emailAliasList) {
                if (emailAliasList != null) {
                    ComposeMailView.this.f106293f.mo150889a(emailAliasList);
                }
            }
        });
    }

    /* renamed from: v */
    private int m166479v() {
        int i = 0;
        for (int i2 = 1; i2 < 4; i2++) {
            i += this.f106313z.get(i2, 0);
        }
        return i;
    }

    /* renamed from: w */
    private void m166480w() {
        if (C41970e.m166941d().mo150951a()) {
            ((C42787b) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42787b.class)).onSendClick();
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: h */
    public void mo150622h() {
        C42187a.m168500b(this.f106301n);
    }

    /* renamed from: n */
    public void mo150629n() {
        if (this.f106286K == null) {
            this.f106286K = new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass47 */

                public void run() {
                    C41988g.m166978i().getWebView().requestFocus();
                    C41988g.m166978i().mo153474e();
                    if (ComposeMailView.this.f106294g != null) {
                        ((InputMethodManager) ComposeMailView.this.f106291d.getSystemService("input_method")).showSoftInput(ComposeMailView.this.f106294g, 1);
                    }
                }
            };
        }
        this.container.postDelayed(this.f106286K, 100);
    }

    /* renamed from: B */
    private TimeData m166399B() {
        return new TimeData(System.currentTimeMillis() / 1000, (System.currentTimeMillis() + 3600000) / 1000, false, TimeZone.getDefault().getID());
    }

    /* renamed from: C */
    private List<MailAddress> m166400C() {
        if (this.f106281F) {
            RecipientSelectView recipientSelectView = this.mSeparatelyBccContacts;
            return m166412a(recipientSelectView, recipientSelectView, -1);
        }
        ArrayList arrayList = new ArrayList();
        RecipientSelectView recipientSelectView2 = this.mToContacts;
        arrayList.addAll(m166412a(recipientSelectView2, recipientSelectView2, 1));
        RecipientSelectView recipientSelectView3 = this.mCcContacts;
        arrayList.addAll(m166412a(recipientSelectView3, recipientSelectView3, -1));
        RecipientSelectView recipientSelectView4 = this.mBccContacts;
        arrayList.addAll(m166412a(recipientSelectView4, recipientSelectView4, -1));
        return arrayList;
    }

    /* renamed from: E */
    private void m166402E() {
        ComposeWebView composeWebView = this.f106294g;
        if (composeWebView != null) {
            composeWebView.mo19616a();
            this.f106294g.getWebView().destroy();
            C41988g.m166973d();
            this.f106294g = null;
            ValueAnimator valueAnimator = this.f106290c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f106290c.cancel();
            }
        }
    }

    /* renamed from: y */
    private boolean m166482y() {
        List<LocalAttachment> h;
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.harmfulattachment") && (h = this.f106293f.mo150924h()) != null) {
            for (LocalAttachment localAttachment : h) {
                if (C43766i.m173487b(C26311p.m95284d(localAttachment.mo151229f()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C41970e.m166941d().mo150952b(this);
        if (this.f106308u != null) {
            this.f106308u = null;
        }
        this.f106306s = null;
        ComposeWebView composeWebView = this.f106294g;
        if (composeWebView != null) {
            composeWebView.mo19616a();
        }
        LinearLayout linearLayout = this.mWebviewContainer;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        ValueAnimator valueAnimator = this.f106290c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f106290c.cancel();
        }
        C43345c.m172076m().mo154994b(this.f106279D);
    }

    /* renamed from: g */
    public void mo150618g() {
        boolean z;
        C43849u.m173827a($$Lambda$ComposeMailView$Vfe_t3n35fXDZYiXY3tsN8lT8Hw.INSTANCE, 50);
        if (m166479v() > 0) {
            z = true;
        } else {
            z = false;
        }
        mo150588a(z);
        C42226b.m168638a().mo152310b(C42226b.C42229b.f107486b);
        ((C42280i) C42344d.m169091a(C42280i.class, this.f106291d)).mo152406o();
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: i */
    public void mo150624i() {
        m166402E();
        m166483z();
        this.f106293f.mo150917e();
    }

    /* renamed from: k */
    public void mo150626k() {
        boolean z;
        EditMultiTimeFragment hVar = this.f106303p;
        if (hVar == null) {
            z = true;
        } else {
            z = false;
        }
        if (hVar != null) {
            hVar.mo156894a(m166399B(), 2);
        } else {
            EditMultiTimeFragment hVar2 = new EditMultiTimeFragment(this.f106278C, m166399B(), 2, false);
            this.f106303p = hVar2;
            hVar2.mo156895a(new EditMultiTimeFragment.CheckInvalidTime() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass40 */

                /* renamed from: b */
                private long f106368b = 300000;

                @Override // com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment.CheckInvalidTime
                /* renamed from: a */
                public long mo150686a() {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.f106368b;
                    return ((currentTimeMillis / j) + 1) * j;
                }

                @Override // com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment.CheckInvalidTime
                /* renamed from: a */
                public boolean mo150687a(long j) {
                    if (mo150686a() > j * 1000) {
                        return true;
                    }
                    return false;
                }
            });
        }
        m166423a(this.f106292e, this.f106303p, z);
    }

    /* renamed from: r */
    public void mo150633r() {
        if (!this.f106287L) {
            C41988g.m166973d();
            if (C43345c.m172076m().mo154996b()) {
                Log.m165388i("onRenderProcessGone isAppFront now reloadWebView");
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass48 */

                    public void run() {
                        ComposeMailView.this.mo150624i();
                    }
                });
            } else {
                Log.m165388i("onRenderProcessGone onresume reloadWebView");
                ((ComposeMailActivity) this.f106291d).mo150548a(true);
            }
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass49 */

                public void run() {
                    ComposeMailView.this.mo150624i();
                }
            });
        }
        this.f106287L = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: H */
    private void m166405H() {
        boolean z = !this.f106281F;
        this.f106281F = z;
        if (z) {
            RecipientSelectView recipientSelectView = this.mToContacts;
            m166426a(true, m166412a(recipientSelectView, recipientSelectView, 1), m166412a(this.mToContacts, this.mCcContacts, 2), m166412a(this.mToContacts, this.mBccContacts, 3));
        } else {
            RecipientSelectView recipientSelectView2 = this.mSeparatelyBccContacts;
            m166426a(false, m166412a(recipientSelectView2, recipientSelectView2, -1), (List<MailAddress>) new ArrayList(), (List<MailAddress>) new ArrayList());
        }
        this.f106293f.mo150910b(true ^ this.f106281F);
    }

    /* renamed from: I */
    private MailDraft m166406I() {
        RecipientSelectView recipientSelectView = this.mToContacts;
        List<MailAddress> a = m166412a(recipientSelectView, recipientSelectView, 1);
        List<MailAddress> a2 = m166412a(this.mToContacts, this.mCcContacts, 2);
        List<MailAddress> a3 = m166412a(this.mToContacts, this.mBccContacts, 3);
        String obj = this.subject.getText().toString();
        MailDraft mailDraft = new MailDraft();
        mailDraft.mo151325a(this.f106288a);
        mailDraft.mo151329a(this.f106281F);
        if (this.f106281F) {
            RecipientSelectView recipientSelectView2 = this.mSeparatelyBccContacts;
            List<MailAddress> a4 = m166412a(recipientSelectView2, recipientSelectView2, -1);
            mailDraft.mo151328a(new ArrayList());
            mailDraft.mo151334b(new ArrayList());
            mailDraft.mo151338c(new ArrayList(a4));
        } else {
            mailDraft.mo151328a(new ArrayList(a));
            mailDraft.mo151334b(new ArrayList(a2));
            mailDraft.mo151338c(new ArrayList(a3));
        }
        mailDraft.mo151333b(obj);
        return mailDraft;
    }

    /* renamed from: f */
    public void mo150615f() {
        C41923a aVar = this.f106295h;
        if (aVar != null) {
            aVar.mo150727a(this.f106291d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.compose.ComposeMailView$50  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass50 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106380a;

        /* renamed from: b */
        static final /* synthetic */ int[] f106381b;

        /* renamed from: c */
        static final /* synthetic */ int[] f106382c;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|(2:21|22)|23|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|12|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007e */
        static {
            /*
            // Method dump skipped, instructions count: 137
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass50.<clinit>():void");
        }
    }

    /* renamed from: G */
    private void m166404G() {
        boolean z;
        int i;
        this.container.clearFocus();
        mo150607d();
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        String string = this.f106291d.getResources().getString(R.string.Mail_SendLater_ScheduleSend);
        $$Lambda$ComposeMailView$xgXWKaPAo5p7XA3gT03kcamwryY r4 = new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$xgXWKaPAo5p7XA3gT03kcamwryY */

            public final void run() {
                ComposeMailView.this.m166398A();
            }
        };
        if (m166479v() > 0) {
            z = true;
        } else {
            z = false;
        }
        arrayList.add(size, new C42092d(string, r4, z));
        if (m166407J()) {
            int size2 = arrayList.size();
            Resources resources = this.f106291d.getResources();
            if (this.f106281F) {
                i = R.string.Mail_Compose_CancelSp;
            } else {
                i = R.string.Mail_Compose_SendSeparately;
            }
            arrayList.add(size2, new C42092d(resources.getString(i), new Runnable() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$A8NUmEJ6z9FDSQzzfZp1uKVKLQ */

                public final void run() {
                    ComposeMailView.this.m166405H();
                }
            }, true));
        }
        arrayList.add(arrayList.size(), new C42092d(this.f106291d.getResources().getString(R.string.Mail_Alert_SaveDraft), new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$ePDFhEmmVMdfa_WusW7iPNb_yuE */

            public final void run() {
                ComposeMailView.this.m166409L();
            }
        }, true));
        arrayList.add(arrayList.size(), new C42092d(this.f106291d.getResources().getString(R.string.Mail_Alert_DiscardDraft), new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$AO01XlqfxszM3efuPKN4yXWrxPw */

            public final void run() {
                ComposeMailView.this.m166408K();
            }
        }, true));
        this.f106295h.mo150735a(this.f106291d, arrayList, new DialogInterface.OnClickListener(arrayList) {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$R_n90h0ShGmWgUW5ANB_3rGow */
            public final /* synthetic */ List f$0;

            {
                this.f$0 = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ComposeMailView.m166424a(this.f$0, dialogInterface, i);
            }
        });
    }

    /* renamed from: s */
    private void m166476s() {
        this.f106306s.mo150554a(this);
        this.mToolbarHeightView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass22 */

            public void onClick(View view) {
                if (ComposeMailView.this.f106294g == null) {
                    return;
                }
                if (!ComposeMailView.this.f106294g.isFocused() || ComposeMailView.this.f106300m == 0) {
                    ComposeMailView.this.mo150629n();
                }
            }
        });
        this.mComposeScrollView.setOnTouchChangedListener(new ComposeScrollView.AbstractC41922a() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass33 */

            @Override // com.ss.android.lark.mail.impl.compose.ComposeScrollView.AbstractC41922a
            /* renamed from: a */
            public void mo150665a() {
                if (ComposeMailView.this.f106294g == null) {
                    return;
                }
                if (!ComposeMailView.this.f106294g.isFocused() || ComposeMailView.this.f106300m == 0) {
                    ComposeMailView.this.mo150629n();
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 23) {
            this.f106301n = 0;
            this.mComposeScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass44 */

                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    ComposeMailView.this.f106301n += (long) Math.abs(i2 - i4);
                }
            });
        }
        m166478u();
        m166483z();
        this.titleBar.mo156417a(R.drawable.ud_icon_close_small_outlined);
        this.titleBar.mo156418a(OperationTitleBar.Type.Large);
        this.titleBar.setListener(new OperationTitleBar.AbstractC43958a() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass51 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.AbstractC43958a
            /* renamed from: a */
            public void mo150696a() {
                Log.m165389i("ComposeMailView", "onBackButtonClick onClick");
                ComposeMailView.this.container.clearFocus();
                ComposeMailView.this.mo150607d();
                ComposeMailView.this.f106293f.mo150911c();
            }
        });
        this.f106309v = new C41937b(this.f106291d, this.mAttachmentContainer, this);
        this.f106310w = true;
        C41988g.m166978i().setContentChangeCallback(new AbstractC42761a() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass52 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42761a
            /* renamed from: a */
            public void mo150697a() {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - ComposeMailView.this.f106298k > 1000) {
                    Log.m165389i("ComposeMailView", "onContentChange");
                    ComposeMailView.this.f106297j = currentTimeMillis;
                }
            }
        });
        this.f106295h = new C41923a(this.f106291d);
        this.loadingContainer.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass53 */

            public void onClick(View view) {
            }
        });
        this.f106284I = new LKUIStatus.C25680a(this.loadingContainer).mo89855a(0.5d).mo89859a();
        this.subject.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass54 */

            public void onFocusChange(View view, boolean z) {
                String str;
                if (!z) {
                    Editable text = ComposeMailView.this.subject.getText();
                    AbstractC41994h.AbstractC41997b.AbstractC41998a aVar = ComposeMailView.this.f106293f;
                    if (text == null) {
                        str = "";
                    } else {
                        str = text.toString();
                    }
                    aVar.mo150925h(str);
                }
            }
        });
        m166477t();
        C43345c.m172076m().mo154990a(this.f106279D);
    }

    /* renamed from: z */
    private void m166483z() {
        this.f106294g = C41988g.m166969a(this.f106291d, this.f106293f.mo150938u(), this);
        if (this.mWebviewContainer.getChildCount() != 0) {
            this.mWebviewContainer.removeAllViews();
        }
        this.mWebviewContainer.addView(this.f106294g.getWebView());
        this.f106294g.setSelectionChangeCallback(new AbstractC42791e() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$ChTwDVd07Lt_X0JC60DPtf6db8 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42791e
            public final void onSelectionChange(int i, boolean z) {
                ComposeMailView.this.m166414a((ComposeMailView) i, (int) z);
            }
        });
        this.f106294g.mo153448a(this.f106293f, this, this.f106291d, this.f106307t);
        this.f106294g.mo35519a(new IWebViewExtension.RenderProcessGoneListener() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass32 */

            @Override // com.bytedance.lynx.webview.glue.sdk112.IRenderProcessGoneListenersdk112
            public boolean onRenderProcessGone(WebView webView, TTRenderProcessGoneDetail tTRenderProcessGoneDetail) {
                Log.m165388i("onRenderProcessGone 11");
                ComposeMailView.this.mo150633r();
                return true;
            }
        });
        C41970e.m166941d().mo150949a(this);
        ((C42815b) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42815b.class)).setToolbarCallback(new AbstractC42825f() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass34 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f
            /* renamed from: a */
            public void mo150667a(String str) {
                ComposeMailView.this.f106294g.mo22331a(str);
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f
            /* renamed from: b */
            public void mo150668b(int i) {
                ComposeMailView.this.f106294g.mo153440a(i);
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.AbstractC42825f
            /* renamed from: a */
            public void mo150666a(int i) {
                C41970e.m166941d().mo150950a(null, i);
            }
        });
        C42801c cVar = (C42801c) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42801c.class);
        this.f106308u = cVar;
        cVar.setVideoDelegate(new C42801c.AbstractC42802a() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass35 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c.AbstractC42802a
            /* renamed from: a */
            public boolean mo150670a() {
                return true;
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c.AbstractC42802a
            /* renamed from: c */
            public long mo150672c() {
                Log.m165389i("ComposeMailView", "VideoDelegate getSelectedAttachmentSize");
                return ComposeMailView.this.f106293f.mo150887a();
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c.AbstractC42802a
            /* renamed from: d */
            public long mo150673d() {
                Log.m165389i("ComposeMailView", "VideoDelegate getSelectedCalculationFileSize");
                return ComposeMailView.this.f106293f.mo150903b();
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c.AbstractC42802a
            /* renamed from: b */
            public void mo150671b() {
                C42815b bVar = (C42815b) aj.m5366a((FragmentActivity) ComposeMailView.this.f106291d).mo6005a(C42815b.class);
                if (bVar != null) {
                    bVar.onShowKeyboardPanel(ComposeMailView.this.f106291d);
                }
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42801c.AbstractC42802a
            /* renamed from: a */
            public void mo150669a(String str) {
                Log.m165389i("ComposeMailView", "uploadVideo");
                if (TextUtils.isEmpty(str)) {
                    Log.m165383e("ComposeMailView", "uploadVideo invalid path");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                ComposeMailView.this.f106293f.mo150916d(arrayList);
            }
        });
        this.f106294g.setMentionCallback(new AbstractC42790d() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass36 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42790d
            /* renamed from: a */
            public void mo150674a() {
                int i;
                Log.m165389i("ComposeMailView", "onMentionEnd");
                if (ComposeMailView.this.f106300m == 0) {
                    i = 1;
                } else {
                    i = ComposeMailView.this.f106300m + UIHelper.getDimens(R.dimen.toolbar_menu_height);
                }
                m166608a(i);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m166610b(int i) {
                ComposeMailView.this.mComposeScrollView.smoothScrollBy(0, i);
            }

            /* renamed from: a */
            private void m166608a(int i) {
                if (ComposeMailView.this.mToolbarHeightView != null) {
                    ComposeMailView composeMailView = ComposeMailView.this;
                    composeMailView.f106290c = ValueAnimator.ofInt(composeMailView.mToolbarHeightView.getHeight(), i).setDuration(300L);
                    ComposeMailView.this.f106290c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$36$Roou9eGVB9EB0mFXTba6TgQAxBs */

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ComposeMailView.AnonymousClass36.this.m166609a((ComposeMailView.AnonymousClass36) valueAnimator);
                        }
                    });
                    ComposeMailView.this.f106290c.start();
                }
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m166609a(ValueAnimator valueAnimator) {
                if (ComposeMailView.this.mToolbarHeightView != null) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) ComposeMailView.this.mToolbarHeightView.getLayoutParams();
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    ComposeMailView.this.mToolbarHeightView.setLayoutParams(layoutParams);
                }
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42790d
            /* renamed from: a */
            public void mo150675a(int i, int i2) {
                Log.m165389i("ComposeMailView", "onMentionStart");
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) ComposeMailView.this.mToolbarHeightView.getLayoutParams();
                int dimens = ComposeMailView.this.f106300m + UIHelper.getDimens(R.dimen.toolbar_menu_height) + UIHelper.getDimens(R.dimen.mail_mention_select_list_height);
                int[] iArr = new int[2];
                ComposeMailView.this.mToolbarHeightView.getLocationOnScreen(iArr);
                layoutParams.height = Math.max((ComposeMailView.this.mComposeScrollView.getHeight() + i2) - iArr[1], dimens);
                ComposeMailView.this.mToolbarHeightView.setLayoutParams(layoutParams);
                ComposeMailView.this.mComposeScrollView.postDelayed(new Runnable(i) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$36$I3MfJO4Q_Xh3zc5jMmFgR6YuI40 */
                    public final /* synthetic */ int f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        ComposeMailView.AnonymousClass36.this.m166610b(this.f$1);
                    }
                }, 0);
            }
        });
        ((C42776b) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42776b.class)).setDelegate(new C42776b.AbstractC42777a() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass37 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42776b.AbstractC42777a
            /* renamed from: a */
            public long mo150676a() {
                Log.m165389i("ComposeMailView", "getSelectedAttachmentSize");
                return ComposeMailView.this.f106293f.mo150887a();
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42776b.AbstractC42777a
            /* renamed from: b */
            public long mo150678b() {
                Log.m165389i("ComposeMailView", "getSelectedAttachmentSize");
                return ComposeMailView.this.f106293f.mo150903b();
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42776b.AbstractC42777a
            /* renamed from: a */
            public void mo150677a(List<Uri> list) {
                Log.m165389i("ComposeMailView", "uploadAttachments");
                ComposeMailView.this.f106293f.mo150919e(list);
            }
        });
        if (C41970e.m166941d().mo150951a()) {
            ((C42787b) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42787b.class)).setDelegate(new C42787b.AbstractC42788a() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass38 */

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b.AbstractC42788a
                /* renamed from: d */
                public void mo150684d() {
                    ComposeMailView.this.f106294g.mo153477h();
                }

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b.AbstractC42788a
                /* renamed from: a */
                public Boolean mo150679a() {
                    if (ComposeMailView.this.f106288a == null) {
                        return null;
                    }
                    return Boolean.valueOf(AddressType.ENTERPRISE_MAIL_GROUP.equals(ComposeMailView.this.f106288a.mo151190k()));
                }

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b.AbstractC42788a
                /* renamed from: b */
                public String mo150681b() {
                    if (ComposeMailView.this.f106288a == null) {
                        return "";
                    }
                    return ComposeMailView.this.f106288a.mo151176a();
                }

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b.AbstractC42788a
                /* renamed from: c */
                public String mo150683c() {
                    if (ComposeMailView.this.f106288a == null) {
                        return "";
                    }
                    return ComposeMailView.this.f106288a.mo151182e();
                }

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b.AbstractC42788a
                /* renamed from: a */
                public void mo150680a(String str) {
                    ComposeMailView.this.f106294g.setSignature(str);
                }

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b.AbstractC42788a
                /* renamed from: b */
                public void mo150682b(String str) {
                    ComposeMailView.this.f106294g.mo153473d(str);
                }
            });
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: c */
    public View mo150602c() {
        return this.container;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: d */
    public void mo150607d() {
        ((InputMethodManager) this.f106291d.getSystemService("input_method")).hideSoftInputFromWindow(this.container.getWindowToken(), 0);
        this.container.removeCallbacks(this.f106285J);
        this.container.removeCallbacks(this.f106286K);
    }

    /* renamed from: u */
    private void m166478u() {
        VisibleWrapper visibleWrapper = new VisibleWrapper(this.container.findViewById(R.id.show_ccbcc));
        this.f106289b = visibleWrapper;
        visibleWrapper.mo150720a(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.View$OnClickListenerC419123 */

            public void onClick(View view) {
                ComposeMailView.this.mo150623h(true);
            }
        });
        this.mToPickerView.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419134 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                ComposeMailView composeMailView = ComposeMailView.this;
                composeMailView.mo150586a(composeMailView.mo150555a(composeMailView.mToContacts), 1);
            }
        });
        this.mCcPickerView.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419145 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                ComposeMailView composeMailView = ComposeMailView.this;
                composeMailView.mo150586a(composeMailView.mo150555a(composeMailView.mCcContacts), 2);
            }
        });
        this.mBccPickerView.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419156 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                ComposeMailView composeMailView = ComposeMailView.this;
                composeMailView.mo150586a(composeMailView.mo150555a(composeMailView.mBccContacts), 3);
            }
        });
        this.mSBccPickerView.setOnClickListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419167 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                ComposeMailView composeMailView = ComposeMailView.this;
                composeMailView.mo150586a(composeMailView.mo150555a(composeMailView.mSeparatelyBccContacts), 4);
            }
        });
        this.mToContacts.setMailContactsType(1);
        this.mCcContacts.setMailContactsType(2);
        this.mBccContacts.setMailContactsType(3);
        this.mSeparatelyBccContacts.setMailContactsType(3);
        this.mToContacts.mo156116b(this.f106291d.getResources().getString(R.string.Mail_Normal_ToColon), this.f106291d.getResources().getColor(R.color.text_caption));
        this.mCcContacts.mo156116b(this.f106291d.getResources().getString(R.string.Mail_Normal_CcColon), this.f106291d.getResources().getColor(R.color.text_caption));
        this.mBccContacts.mo156116b(this.f106291d.getResources().getString(R.string.Mail_Normal_BccColon), this.f106291d.getResources().getColor(R.color.text_caption));
        this.mSeparatelyBccContacts.mo156116b(this.f106291d.getResources().getString(R.string.Mail_Normal_SpColon), this.f106291d.getResources().getColor(R.color.text_caption));
        this.mSeparatelyBccContacts.setSeparatelyMode(true);
        mo150623h(false);
        this.subject.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419178 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String obj = ComposeMailView.this.subject.getText().toString();
                if (!TextUtils.isEmpty(obj)) {
                    obj.length();
                }
                if (TextUtils.isEmpty(obj)) {
                    ComposeMailView.this.subject.setTypeface(null, 0);
                } else {
                    ComposeMailView.this.subject.setTypeface(null, 1);
                }
            }
        });
        this.mToContacts.setAddressCountChange(new RecipientSelectView.AbstractC43796a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$5XWlYji6A6whLLH67QqGIkpkM */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43796a
            public final void onAddressCountChange(int i) {
                ComposeMailView.this.m166467i(i);
            }
        });
        this.mCcContacts.setAddressCountChange(new RecipientSelectView.AbstractC43796a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$bClV4sG4oLdYwxqGYJnIfGwWnI */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43796a
            public final void onAddressCountChange(int i) {
                ComposeMailView.this.m166464h((ComposeMailView) i);
            }
        });
        this.mBccContacts.setAddressCountChange(new RecipientSelectView.AbstractC43796a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$lEVB7od9JIIOZj8pxhMLW3oJiZM */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43796a
            public final void onAddressCountChange(int i) {
                ComposeMailView.this.m166460g((ComposeMailView) i);
            }
        });
        this.mSeparatelyBccContacts.setAddressCountChange(new RecipientSelectView.AbstractC43796a() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$Rz_KDEQabiNzSczZONzkZ2SzW8 */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43796a
            public final void onAddressCountChange(int i) {
                ComposeMailView.this.m166455f((ComposeMailView) i);
            }
        });
        this.mToContacts.setLoaderManager(((FragmentActivity) this.f106291d).getSupportLoaderManager());
        this.mCcContacts.setLoaderManager(((FragmentActivity) this.f106291d).getSupportLoaderManager());
        this.mBccContacts.setLoaderManager(((FragmentActivity) this.f106291d).getSupportLoaderManager());
        this.mSeparatelyBccContacts.setLoaderManager(((FragmentActivity) this.f106291d).getSupportLoaderManager());
        if (C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mailpicker")) {
            this.mToContacts.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$5nXual7j8K0pmN2IEws9yxRsp6Y */

                public final void onFocusChange(View view, boolean z) {
                    ComposeMailView.this.m166449d((ComposeMailView) view, (View) z);
                }
            });
            this.mCcContacts.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$4BNzUe9qTXCl8y9vnvhDkvf2Rn0 */

                public final void onFocusChange(View view, boolean z) {
                    ComposeMailView.this.m166442c((ComposeMailView) view, (View) z);
                }
            });
            this.mBccContacts.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$67pTXu8JFUFElYLFGq9NbnKL2tA */

                public final void onFocusChange(View view, boolean z) {
                    ComposeMailView.this.m166431b((ComposeMailView) view, (View) z);
                }
            });
            this.mSeparatelyBccContacts.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$WIwphHnt2IBtVCB5AmEoD0wmWz8 */

                public final void onFocusChange(View view, boolean z) {
                    ComposeMailView.this.m166417a((ComposeMailView) view, (View) z);
                }
            });
        }
        this.mToContacts.setCallback(new TokenCompleteTextView.AbstractC43835a<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419189 */

            /* renamed from: a */
            public void mo150640b(MailAddress mailAddress) {
                Log.m165389i("ComposeMailView", "initRecipientView to onObjectAdded");
                ComposeMailView.this.f106293f.mo150897a("to", mailAddress);
            }

            /* renamed from: b */
            public void mo150638a(MailAddress mailAddress) {
                Log.m165389i("ComposeMailView", "initRecipientView to onObjectRemoved");
                ComposeMailView.this.f106293f.mo150907b("to", mailAddress);
            }
        });
        this.mToContacts.setInterceptObjectListener(new RecipientSelectView.AbstractC43798c() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass10 */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43798c
            /* renamed from: a */
            public MailAddress mo150636a(MailAddress mailAddress) {
                return ComposeMailView.this.f106293f.mo150888a(mailAddress);
            }
        });
        this.mCcContacts.setCallback(new TokenCompleteTextView.AbstractC43835a<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass11 */

            /* renamed from: a */
            public void mo150640b(MailAddress mailAddress) {
                Log.m165389i("ComposeMailView", "initRecipientView cc onObjectAdded");
                ComposeMailView.this.f106293f.mo150897a("cc", mailAddress);
            }

            /* renamed from: b */
            public void mo150638a(MailAddress mailAddress) {
                Log.m165389i("ComposeMailView", "initRecipientView cc onObjectRemoved");
                ComposeMailView.this.f106293f.mo150907b("cc", mailAddress);
            }
        });
        this.mCcContacts.setInterceptObjectListener(new RecipientSelectView.AbstractC43798c() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass13 */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43798c
            /* renamed from: a */
            public MailAddress mo150636a(MailAddress mailAddress) {
                return ComposeMailView.this.f106293f.mo150888a(mailAddress);
            }
        });
        this.mBccContacts.setCallback(new TokenCompleteTextView.AbstractC43835a<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass14 */

            /* renamed from: a */
            public void mo150640b(MailAddress mailAddress) {
                Log.m165389i("ComposeMailView", "initRecipientView bcc onObjectAdded");
                ComposeMailView.this.f106293f.mo150897a("bcc", mailAddress);
            }

            /* renamed from: b */
            public void mo150638a(MailAddress mailAddress) {
                Log.m165389i("ComposeMailView", "initRecipientView bcc onObjectRemoved");
                ComposeMailView.this.f106293f.mo150907b("bcc", mailAddress);
            }
        });
        this.mBccContacts.setInterceptObjectListener(new RecipientSelectView.AbstractC43798c() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass15 */

            @Override // com.ss.android.lark.mail.impl.utils.recipient.RecipientSelectView.AbstractC43798c
            /* renamed from: a */
            public MailAddress mo150636a(MailAddress mailAddress) {
                return ComposeMailView.this.f106293f.mo150888a(mailAddress);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: e */
    public boolean mo150614e() {
        C44066d dVar = this.f106302o;
        if (dVar == null || !dVar.isVisible()) {
            EditMultiTimeFragment hVar = this.f106303p;
            if (hVar == null || !hVar.isVisible()) {
                return false;
            }
            ActivityDependency aVar = this.f106292e;
            if (aVar != null) {
                aVar.mo150553b(this.f106303p);
            }
            return true;
        }
        mo150556a();
        ActivityDependency aVar2 = this.f106292e;
        if (aVar2 == null) {
            return false;
        }
        aVar2.mo150553b(this.f106302o);
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: b */
    public void mo150594b() {
        if (this.f106312y) {
            mo150629n();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m166451e(int i) {
        this.mComposeScrollView.smoothScrollBy(0, i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m166455f(int i) {
        m166413a(3, i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m166460g(int i) {
        m166413a(3, i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m166464h(int i) {
        m166413a(2, i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m166467i(int i) {
        m166413a(1, i);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC41994h.AbstractC41997b.AbstractC41998a aVar) {
        this.f106293f = aVar;
    }

    /* renamed from: d */
    private void m166446d(int i) {
        ComposeWebView composeWebView = this.f106294g;
        if (!(composeWebView == null || this.f106300m == i || i <= 0)) {
            composeWebView.mo22336b();
        }
        this.f106300m = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m166453e(View view) {
        Log.m165389i("ComposeMailView", "CreateShareButton onClick");
        this.f106293f.mo150931n();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m166441c(View view) {
        Log.m165389i("ComposeMailView", "ShowDiscussShareButton onClick");
        if (C43691h.m173279a()) {
            this.f106282G.setHint(AbsButton.HintType.None, null);
        }
        this.f106293f.mo150933p();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m166457f(View view) {
        Log.m165389i("ComposeMailView", "MoreButton onClick");
        m166404G();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m166462g(View view) {
        Log.m165389i("ComposeMailView", "sendButton onClick");
        mo150558a(0, "send");
    }

    /* renamed from: b */
    private void m166432b(TextView textView) {
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.requestFocus();
        mo150562a(textView);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m166458f(C41822d.AbstractC41826a aVar) {
        if (C42434b.m169442a(getContext())) {
            mo150618g();
            mo150564a(aVar, true);
        }
        aVar.mo150380b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m166448d(View view) {
        Log.m165389i("ComposeMailView", "ShareMemberButton onClick");
        this.f106293f.mo150932o();
    }

    /* renamed from: h */
    public void mo150623h(boolean z) {
        Log.m165389i("ComposeMailView", "mShowCcBcc onClick");
        this.mCcContacts.setInMore(!z);
        this.mBccContacts.setInMore(!z);
        this.f106289b.mo150722b(z);
        m166403F();
        this.f106311x = z;
        if (z) {
            this.mSubjectTopSplit.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m166450d(C41822d.AbstractC41826a aVar) {
        if (this.f106293f.mo150927j()) {
            this.f106295h.mo150738b(this.f106291d);
            mo150618g();
            mo150564a(aVar, true);
        }
        aVar.mo150380b();
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41937b.AbstractC41940a
    /* renamed from: e */
    public void mo150612e(String str) {
        Log.m165389i("ComposeMailView", "onAttachmentErrorClick");
        this.f106293f.mo150906b(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m166436b(MailAddress mailAddress) {
        if (TextUtils.isEmpty(mailAddress.mo151196q())) {
            mailAddress = mailAddress.mo151199t().mo151216f(C41816b.m166115a().mo150137d()).mo151210a();
        }
        this.f106288a = mailAddress;
        mo150619g(true);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: e */
    public void mo150613e(boolean z) {
        Log.m165389i("ComposeMailView", "toggleLoadingView");
        if (z) {
            this.loadingContainer.setVisibility(0);
            this.f106284I.mo89837a();
            m166427a((EnumC41919a[]) null);
            mo150607d();
            return;
        }
        this.loadingContainer.setVisibility(8);
        this.f106284I.mo89847d();
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41937b.AbstractC41940a
    /* renamed from: f */
    public void mo150616f(String str) {
        Log.m165389i("ComposeMailView", "onOpenAttachment");
        this.f106293f.mo150912c(str);
    }

    /* renamed from: g */
    public void mo150619g(boolean z) {
        SpannableString spannableString = new SpannableString(" <" + this.f106288a.mo151182e() + ">");
        spannableString.setSpan(new ForegroundColorSpan(this.f106291d.getResources().getColor(R.color.lkui_N500)), 0, spannableString.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(0.875f), 0, spannableString.length(), 33);
        this.mFromContacts.setText(new SpannableStringBuilder().append((CharSequence) this.f106288a.mo151176a()).append((CharSequence) spannableString));
        if (z) {
            C42330c.m169079f("change_from");
            if (C41970e.m166941d().mo150951a()) {
                C42787b bVar = (C42787b) aj.m5366a((FragmentActivity) this.f106291d).mo6005a(C42787b.class);
                bVar.setCurrentAddress(this.f106288a);
                bVar.resetEditorSignature();
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.C41970e.AbstractC41973b
    /* renamed from: c */
    public void mo150603c(int i) {
        if (i > 0 || this.f106299l) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.mToolbarHeightView.getLayoutParams();
            layoutParams.height = i;
            this.mToolbarHeightView.setLayoutParams(layoutParams);
            this.f106294g.mo153464b(i);
        } else if (i != 0 || this.f106294g.getWebView().isFocused()) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.mToolbarHeightView.getLayoutParams();
            layoutParams2.height = 0;
            this.mToolbarHeightView.setLayoutParams(layoutParams2);
            this.f106294g.mo153469c();
        } else {
            m166446d(i);
            return;
        }
        m166446d(i);
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: f */
    public void mo150617f(final boolean z) {
        Log.m165379d("ComposeMailView", "setWebViewEditable： " + z);
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass24 */

            public void run() {
                ComposeMailView.this.f106294g.setEditable(z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m166454e(C41822d.AbstractC41826a aVar) {
        if (!this.f106293f.mo150926i()) {
            mo150610d(true);
            mo150618g();
            mo150564a(aVar, true);
        }
        aVar.mo150380b();
    }

    @Override // com.ss.android.lark.mail.impl.compose.attachment.C41937b.AbstractC41940a
    /* renamed from: d */
    public void mo150609d(String str) {
        Log.m165389i("ComposeMailView", "onDeleteAttachmentItem");
        this.f106293f.mo150895a(str);
    }

    /* renamed from: b */
    private boolean m166439b(View view) {
        if (view == null || view.getVisibility() != 0 || !view.isEnabled()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: c */
    public void mo150605c(String str) {
        this.subject.setText(str);
    }

    /* renamed from: d */
    public void mo150610d(boolean z) {
        Log.m165389i("ComposeMailView", "showWaitForUploadHint isSendingEmail: " + z);
        if (z) {
            this.f106295h.mo150724a().show();
        } else {
            this.f106295h.mo150725a(new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass18 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    Log.m165389i("ComposeMailView", "showWaitForUploadHint save draft onClick cancel");
                    ComposeMailView.this.f106293f.mo150914d();
                    dialogInterface.dismiss();
                }
            }).show();
        }
    }

    @Override // com.ss.android.lark.mail.impl.compose.AbstractC41994h.AbstractC41997b
    /* renamed from: c */
    public void mo150606c(boolean z) {
        Log.m165389i("ComposeMailView", "onDraftReady");
        if (!z) {
            this.f106312y = false;
            return;
        }
        C0844e<Group, View>[] eVarArr = {new C0844e<>(null, this.mToContacts), new C0844e<>(null, this.subject), new C0844e<>(null, this.f106294g.getWebView())};
        for (int i = 0; i < 3; i++) {
            C0844e<Group, View> eVar = eVarArr[i];
            if (eVar.f3318b instanceof DocSDKBridgeWebView) {
                this.f106312y = true;
                mo150629n();
                return;
            } else if ((eVar.f3318b instanceof TextView) && m166429a(eVar)) {
                S s = eVar.f3318b;
                if (!s.isFocused()) {
                    m166432b((TextView) s);
                }
                this.f106312y = false;
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m166434b(C41822d.AbstractC41826a aVar, DialogInterface dialogInterface) {
        mo150564a(aVar, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m166440c(DialogInterface dialogInterface, int i) {
        m166432b((TextView) this.mToContacts);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m166430b(DialogInterface dialogInterface, int i) {
        SettingManager.getInstance().get(MailArticlesLinkConfig.class, new IGetDataCallback<MailArticlesLinkConfig>() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass42 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccess(MailArticlesLinkConfig mailArticlesLinkConfig) {
                C42699a.m170291j(ComposeMailView.this.f106291d, mailArticlesLinkConfig.f110279a);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m166442c(View view, boolean z) {
        m166416a(this.mCcContacts, this.mCcPickerView, z, 8);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void m166456f(DialogInterface dialogInterface, int i) {
        m166432b((TextView) this.mToContacts);
        this.mToContacts.mo156008e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private /* synthetic */ void m166461g(DialogInterface dialogInterface, int i) {
        m166432b((TextView) this.mToContacts);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private /* synthetic */ void m166465h(DialogInterface dialogInterface, int i) {
        m166432b((TextView) this.mSeparatelyBccContacts);
        this.mSeparatelyBccContacts.mo156008e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private /* synthetic */ void m166468i(DialogInterface dialogInterface, int i) {
        m166432b((TextView) this.mSeparatelyBccContacts);
    }

    /* renamed from: a */
    private void m166413a(int i, int i2) {
        boolean z;
        this.f106313z.put(i, i2);
        if (m166479v() > 0) {
            z = true;
        } else {
            z = false;
        }
        mo150588a(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m166431b(View view, boolean z) {
        m166416a(this.mBccContacts, this.mBccPickerView, z, 8);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m166447d(DialogInterface dialogInterface, int i) {
        this.mBccContacts.setInMore(false);
        m166432b((TextView) this.mBccContacts);
        this.mBccContacts.mo156008e();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m166452e(DialogInterface dialogInterface, int i) {
        this.mCcContacts.setInMore(false);
        m166432b((TextView) this.mCcContacts);
        this.mCcContacts.mo156008e();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m166473m(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        int a = C43763f.m173478a(mailDraft);
        if (a > 0) {
            this.f106295h.mo150728a(this.f106291d, a, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$v_HfYQ41EZcTUvj6FHXfrWMUDs */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166440c((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
            mo150618g();
            mo150564a(aVar, true);
        }
        aVar.mo150380b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166414a(int i, boolean z) {
        if (i < 0 || this.f106294g.getWebView().isFocused()) {
            this.mComposeScrollView.postDelayed(new Runnable(i) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$Q3eK_JXCM0W4wTz4ZQvJdJJWao */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ComposeMailView.this.m166451e((ComposeMailView) this.f$1);
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m166471k(final MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "fetchEditorContent");
        ((C42280i) C42344d.m169091a(C42280i.class, this.f106291d)).mo152403l();
        C41988g.m166978i().mo153449a(new AbstractC42783b() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass26 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b
            /* renamed from: a */
            public void mo150645a() {
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m166582a(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150611e(mailDraft, aVar);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: b */
            private /* synthetic */ void m166585b(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150604c(mailDraft, aVar);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: c */
            private /* synthetic */ void m166586c(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150597b(mailDraft, aVar);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: d */
            private /* synthetic */ void m166587d(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150608d(mailDraft, aVar);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: e */
            private /* synthetic */ void m166588e(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150570a(mailDraft, aVar);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m166583a(MailDraft mailDraft, boolean z, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150571a(mailDraft, z, aVar);
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private /* synthetic */ void m166584a(List list, MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
                ComposeMailView.this.mo150587a(list, mailDraft, aVar);
            }

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b
            /* renamed from: a */
            public void mo150646a(String str, String str2, String str3, List<MailDocsPermissionConfig> list) {
                Log.m165389i("ComposeMailView", "onContentFetched");
                if (!TextUtils.isEmpty(str)) {
                    ComposeMailView.this.mo150595b(str.length());
                }
                ((C42280i) C42344d.m169091a(C42280i.class, ComposeMailView.this.f106291d)).mo152404m();
                boolean z = false;
                if (ComposeMailView.this.mCcContacts.getVisibility() == 0) {
                    z = true;
                }
                mailDraft.mo151340d(str2);
                mailDraft.mo151337c(str);
                if (!TextUtils.isEmpty(str3)) {
                    ComposeMailView.this.f106293f.mo150913c(C41969d.m166937a(str3));
                }
                ComposeMailView.this.f106293f.mo150890a(mailDraft);
                ComposeMailView.this.mo150599b("key_chain_fetch_content");
                C41822d.C41827b bVar = new C41822d.C41827b();
                bVar.mo150392a("key_chain_doc_link", new AbstractC41817a(list, mailDraft) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$HL6lZjq0nhfuFAGXbojkjqO_PDk */
                    public final /* synthetic */ List f$1;
                    public final /* synthetic */ MailDraft f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166584a((ComposeMailView.AnonymousClass26) this.f$1, (List) this.f$2, (MailDraft) aVar);
                    }
                });
                bVar.mo150392a("key_chain_exceed_size", new AbstractC41817a(mailDraft) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$4PCtjA8H3muGEcDflxJztgacXkU */
                    public final /* synthetic */ MailDraft f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166588e(this.f$1, aVar);
                    }
                });
                bVar.mo150392a("key_chain_large_file_expire", new AbstractC41817a(mailDraft) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$RiocbLI208XYTdz8ayOq_7X6KnQ */
                    public final /* synthetic */ MailDraft f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166587d(this.f$1, aVar);
                    }
                });
                bVar.mo150392a("key_chain_harmful_file", new AbstractC41817a(mailDraft) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$WH0HySftQZLm3GZwnuH5BPcdwR8 */
                    public final /* synthetic */ MailDraft f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166586c(this.f$1, aVar);
                    }
                });
                bVar.mo150392a("key_chain_large_file", new AbstractC41817a(mailDraft) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$TxT2aI9_21FDdLfkCplJ8pC51Q */
                    public final /* synthetic */ MailDraft f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166585b(this.f$1, aVar);
                    }
                });
                bVar.mo150392a("key_chain_title_missing", new AbstractC41817a(mailDraft) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$0YedqmXsA6WjJZOl8Vt7D4PazSs */
                    public final /* synthetic */ MailDraft f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166582a(this.f$1, aVar);
                    }
                });
                bVar.mo150392a("key_chain_end", new AbstractC41817a(mailDraft, z) {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$26$6NDMKB71JEd8VaKjVDhhkfDguFU */
                    public final /* synthetic */ MailDraft f$1;
                    public final /* synthetic */ boolean f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.AbstractC41817a
                    public final void run(C41822d.AbstractC41826a aVar) {
                        ComposeMailView.AnonymousClass26.this.m166583a((ComposeMailView.AnonymousClass26) this.f$1, (MailDraft) this.f$2, (boolean) aVar);
                    }
                });
                bVar.mo150391a(new C41822d.AbstractC41829c() {
                    /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass26.C419111 */

                    @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41829c
                    /* renamed from: a */
                    public void mo150395a(boolean z) {
                    }

                    @Override // com.ss.android.lark.mail.impl.p2162b.C41822d.AbstractC41829c
                    /* renamed from: a */
                    public void mo150394a(AbstractC41817a aVar) {
                        if (aVar instanceof AbstractC41821c) {
                            ComposeMailView.this.mo150599b(((AbstractC41821c) aVar).mo150383a());
                        }
                    }
                }).mo150393a().mo150384a();
            }
        }, ComposeWebView.FetchBodyType.Send);
        aVar.mo150380b();
    }

    /* renamed from: e */
    public void mo150611e(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "checkSubjectAndBodyEmpty");
        if (C43819s.m173689a(mailDraft.mo151350g()) || C43819s.m173689a(mailDraft.mo151359l())) {
            mo150618g();
            Log.m165389i("ComposeMailView", "sendButton onClick subject is empty or content is empty");
            this.f106295h.mo150739b(this.f106291d, new DialogInterface.OnClickListener(aVar) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$V__GaB1vxDGokzr0pU9WvWqxBXA */
                public final /* synthetic */ C41822d.AbstractC41826a f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166420a((ComposeMailView) this.f$1, (C41822d.AbstractC41826a) dialogInterface, (DialogInterface) i);
                }
            }, new DialogInterface.OnCancelListener(aVar) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$xSV3lY30jv9e7LkE3Ot3nIvPl8 */
                public final /* synthetic */ C41822d.AbstractC41826a f$1;

                {
                    this.f$1 = r2;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    ComposeMailView.this.m166419a((ComposeMailView) this.f$1, (C41822d.AbstractC41826a) dialogInterface);
                }
            });
            return;
        }
        aVar.mo150380b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166415a(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f106293f.mo150902a(true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m166444c(C41822d.AbstractC41826a aVar, DialogInterface dialogInterface) {
        Log.m165389i("ComposeMailView", "checkHarmfulFileAndSend cancel");
        mo150564a(aVar, false);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m166449d(View view, boolean z) {
        m166416a(this.mToContacts, this.mToPickerView, z, this.container.findViewById(R.id.show_ccbcc).getVisibility());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m166474n(final MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        if (this.f106304q) {
            aVar.mo150380b();
        } else if (!mailDraft.mo151371w()) {
            mo150618g();
            mo150564a(aVar, true);
            if (mailDraft.mo151366s()) {
                this.mSeparatelyBccContacts.mo156009f();
            } else {
                this.mToContacts.mo156009f();
                this.mCcContacts.mo156009f();
                this.mBccContacts.mo156009f();
            }
            C42187a.m168524e();
            this.f106295h.mo150740b(this.f106291d, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass28 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C42187a.m168490a(false);
                }
            }, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass29 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    C42187a.m168490a(true);
                    if (mailDraft.mo151366s()) {
                        ComposeMailView.this.mSeparatelyBccContacts.mo156010g();
                    } else {
                        ComposeMailView.this.mToContacts.mo156010g();
                        ComposeMailView.this.mCcContacts.mo156010g();
                        ComposeMailView.this.mBccContacts.mo156010g();
                    }
                    MailToast.m173697a((int) R.string.Mail_RestrictOutbound_DeletedSuccessfully);
                }
            });
        } else {
            aVar.mo150380b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m166472l(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        boolean z;
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.auto_translate_attachment") || !C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.largefile.phase2")) {
            z = false;
        } else {
            z = true;
        }
        Log.m165389i("ComposeMailView", "checkTranslateAttachment FG: " + z);
        if (!z) {
            aVar.mo150380b();
            return;
        }
        long j = 0;
        List<LocalAttachment> h = this.f106293f.mo150924h();
        List<MailImage> g = this.f106293f.mo150922g();
        if (h != null) {
            for (LocalAttachment localAttachment : h) {
                j += localAttachment.mo151233i();
            }
        }
        if (g != null) {
            for (MailImage mailImage : g) {
                j += mailImage.mo151482h();
            }
        }
        if (j > 26214400) {
            this.f106293f.mo150941x();
        }
        aVar.mo150380b();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166417a(View view, boolean z) {
        m166416a(this.mSeparatelyBccContacts, this.mSBccPickerView, z, 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m166475o(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        if (mailDraft.mo151366s()) {
            if (mailDraft.mo151347f().isEmpty()) {
                this.f106295h.mo150734a(this.f106291d, C43819s.m173684a((int) R.string.Mail_Alert_InvaildEmailAddress), new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$zlBn94QlBxLWLjKkB_OlcadvDA */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ComposeMailView.this.m166468i((ComposeMailView) dialogInterface, (DialogInterface) i);
                    }
                });
                mo150618g();
                mo150564a(aVar, true);
                return;
            } else if (!this.mSeparatelyBccContacts.getIllegalEmailObjectList().isEmpty()) {
                this.f106295h.mo150734a(this.f106291d, C43819s.m173684a((int) R.string.Mail_Compose_InvalidSendTips).replace("{{ToCcBcc}}", C43819s.m173684a((int) R.string.Mail_Normal_Sp)).replace("{{emailAddress}}", this.mSeparatelyBccContacts.getIllegalEmailObjectList().get(0).mo151176a()), new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$MputbBNOd8LscBc6X16rnXoZXJ4 */

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ComposeMailView.this.m166465h((ComposeMailView) dialogInterface, (DialogInterface) i);
                    }
                });
                mo150618g();
                mo150564a(aVar, true);
                return;
            }
        } else if (mailDraft.mo151339d().isEmpty() && mailDraft.mo151343e().isEmpty() && mailDraft.mo151347f().isEmpty()) {
            this.f106295h.mo150734a(this.f106291d, C43819s.m173684a((int) R.string.Mail_Alert_InvaildEmailAddress), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$DA8AJQZwv7gElOKoXnaBlB9LKb8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166461g((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
            mo150618g();
            mo150564a(aVar, true);
            return;
        } else if (!this.mToContacts.getIllegalEmailObjectList().isEmpty()) {
            this.f106295h.mo150734a(this.f106291d, C43819s.m173684a((int) R.string.Mail_Compose_InvalidSendTips).replace("{{ToCcBcc}}", C43819s.m173684a((int) R.string.Mail_Normal_To)).replace("{{emailAddress}}", this.mToContacts.getIllegalEmailObjectList().get(0).mo151176a()), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$Pb1SsyDoO6oK_XSwKdMRkE9IMLg */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166456f((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
            mo150618g();
            mo150564a(aVar, true);
            return;
        } else if (!this.mCcContacts.getIllegalEmailObjectList().isEmpty()) {
            this.f106295h.mo150734a(this.f106291d, C43819s.m173684a((int) R.string.Mail_Compose_InvalidSendTips).replace("{{ToCcBcc}}", C43819s.m173684a((int) R.string.Mail_Normal_Cc)).replace("{{emailAddress}}", this.mCcContacts.getIllegalEmailObjectList().get(0).mo151176a()), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$P73mK6J6iNMFuboJ4uJeetOL8JI */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166452e((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
            mo150618g();
            mo150564a(aVar, true);
            return;
        } else if (!this.mBccContacts.getIllegalEmailObjectList().isEmpty()) {
            this.f106295h.mo150734a(this.f106291d, C43819s.m173684a((int) R.string.Mail_Compose_InvalidSendTips).replace("{{ToCcBcc}}", C43819s.m173684a((int) R.string.Mail_Normal_Bcc)).replace("{{emailAddress}}", this.mBccContacts.getIllegalEmailObjectList().get(0).mo151176a()), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$oiUXoOURb_YcBUGNcC1Vh8FtGQ */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166447d((ComposeMailView) dialogInterface, (DialogInterface) i);
                }
            });
            mo150618g();
            mo150564a(aVar, true);
            return;
        }
        aVar.mo150380b();
    }

    /* renamed from: d */
    public void mo150608d(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        if (mailDraft.mo151375z()) {
            mo150618g();
            mo150564a(aVar, true);
            this.f106295h.mo150742c(this.f106291d);
            return;
        }
        aVar.mo150380b();
    }

    /* renamed from: c */
    public void mo150604c(MailDraft mailDraft, C41822d.AbstractC41826a aVar) {
        Log.m165389i("ComposeMailView", "checkLargeFileAndSend");
        if (!mailDraft.mo151373x() || mailDraft.mo151371w()) {
            aVar.mo150380b();
            return;
        }
        mo150618g();
        if (C43362e.m172201a().mo155099n()) {
            this.f106295h.mo150744c(this.f106291d, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$_jHcjvyNK2FzhvmCuGbYK9lS9PU */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41822d.AbstractC41826a.this.mo150380b();
                }
            }, new DialogInterface.OnClickListener(mailDraft, aVar) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$MacEjYnd1MpHu7DM4pCrvucf2bw */
                public final /* synthetic */ MailDraft f$1;
                public final /* synthetic */ C41822d.AbstractC41826a f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    ComposeMailView.this.m166422a((ComposeMailView) this.f$1, (MailDraft) this.f$2, (C41822d.AbstractC41826a) dialogInterface, (DialogInterface) i);
                }
            });
        } else {
            this.f106295h.mo150729a(this.f106291d, new DialogInterface.OnCancelListener(aVar) {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$5hU98_ewHOQDzf4SxiimfaYBrww */
                public final /* synthetic */ C41822d.AbstractC41826a f$1;

                {
                    this.f$1 = r2;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    ComposeMailView.this.m166434b((ComposeMailView) this.f$1, (C41822d.AbstractC41826a) dialogInterface);
                }
            }, new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$heUW3tRWRDsRfPutpc6WEkQny0c */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C41822d.AbstractC41826a.this.mo150380b();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166419a(C41822d.AbstractC41826a aVar, DialogInterface dialogInterface) {
        Log.m165389i("ComposeMailView", "checkSubjectAndBodyEmpty cancel");
        mo150564a(aVar, false);
    }

    /* renamed from: a */
    private List<MailAddress> m166412a(RecipientSelectView recipientSelectView, RecipientSelectView recipientSelectView2, int i) {
        if (this.f106311x) {
            return recipientSelectView2.mo155998c(-1);
        }
        return recipientSelectView.mo155998c(i);
    }

    public ComposeMailView(Context context, AbstractC41920b bVar, ComposeMailAction composeMailAction) {
        boolean z = true;
        this.f106312y = true;
        this.f106313z = new SparseIntArray();
        this.f106300m = 0;
        this.f106301n = 0;
        this.f106277B = new C44066d.AbstractC44069a() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.C419071 */

            @Override // com.ss.android.lark.mail.impl.widget.picker.C44066d.AbstractC44069a
            /* renamed from: a */
            public void mo150634a() {
                ComposeMailView.this.mo150556a();
                ComposeMailView.this.f106292e.mo150553b(ComposeMailView.this.f106302o);
                ComposeMailView.this.f106302o = null;
            }

            @Override // com.ss.android.lark.mail.impl.widget.picker.C44066d.AbstractC44069a
            /* renamed from: a */
            public void mo150635a(List<MailAddress> list, int i) {
                if (i == 2) {
                    ComposeMailView.this.mCcContacts.mo155989a((List<? extends MailAddress>) list, false);
                } else if (i == 3) {
                    ComposeMailView.this.mBccContacts.mo155989a((List<? extends MailAddress>) list, false);
                } else if (i != 4) {
                    ComposeMailView.this.mToContacts.mo155989a((List<? extends MailAddress>) list, false);
                } else {
                    ComposeMailView.this.mSeparatelyBccContacts.mo155989a((List<? extends MailAddress>) list, false);
                }
                mo150634a();
            }
        };
        this.f106278C = new EditMultiTimeFragment.EventTimeFragmentAction() {
            /* class com.ss.android.lark.mail.impl.compose.ComposeMailView.AnonymousClass12 */

            @Override // com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment.EventTimeFragmentAction
            /* renamed from: a */
            public void mo150641a() {
                ComposeMailView.this.f106292e.mo150553b(ComposeMailView.this.f106303p);
            }

            @Override // com.ss.android.lark.mail.impl.widget.time.EditMultiTimeFragment.EventTimeFragmentAction
            /* renamed from: a */
            public void mo150642a(long j, long j2, boolean z, String str) {
                Log.m165389i("ComposeMailView", "onSaveBtnPressed EditMultiTime startTime:" + j + ", endTime:" + j2);
                ComposeMailView.this.f106292e.mo150553b(ComposeMailView.this.f106303p);
                ComposeMailView.this.f106303p = null;
                long j3 = j2 * 1000;
                C42187a.m168472a(j3, str);
                ComposeMailView.this.mo150558a(j3, "time_send");
            }
        };
        this.f106279D = new AbstractC41849c.AbstractC41862m() {
            /* class com.ss.android.lark.mail.impl.compose.$$Lambda$ComposeMailView$tC6iKlg0kmkfiDD7ijxj2UFdljU */

            @Override // com.ss.android.lark.mail.impl.AbstractC41849c.AbstractC41862m
            public final void onLanguageChangeListener(Locale locale) {
                ComposeMailView.this.m166425a((ComposeMailView) locale);
            }
        };
        this.f106304q = true;
        this.f106291d = context;
        this.f106306s = bVar;
        this.f106307t = composeMailAction;
        if (!C43277a.m171921a().mo154952p() && (!C43350d.m172098a().mo155043i() || C43350d.m172098a().mo155044j().mo151122d().size() <= 1)) {
            z = false;
        }
        this.f106280E = z;
        this.f106276A = new C43713a(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m166420a(C41822d.AbstractC41826a aVar, DialogInterface dialogInterface, int i) {
        Log.m165389i("ComposeMailView", "checkSubjectAndBodyEmpty OK");
        dialogInterface.dismiss();
        aVar.mo150380b();
    }

    /* renamed from: a */
    private void m166416a(View view, View view2, boolean z, int i) {
        int i2;
        int i3 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view2.setVisibility(i2);
        if (i == 0) {
            i3 = 0 + UIHelper.getDimens(R.dimen.mail_compose_padding_icon_size);
        }
        if (z) {
            i3 += UIHelper.getDimens(R.dimen.mail_compose_padding_icon_size);
        }
        if (i3 == 0) {
            i3 += UIHelper.getDimens(R.dimen.mail_compose_vertical_padding);
        }
        view.setPadding(UIHelper.getDimens(R.dimen.mail_compose_vertical_padding), view.getPaddingTop(), i3, view.getPaddingBottom());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m166437b(MailDraft mailDraft, C41822d.AbstractC41826a aVar, DialogInterface dialogInterface, int i) {
        this.f106293f.mo150939v();
        mailDraft.mo151320E();
        aVar.mo150380b();
    }
}
