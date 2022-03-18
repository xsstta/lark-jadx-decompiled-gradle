package com.ss.android.lark.mail.impl.mailtoolbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b;
import com.bytedance.ee.bear.document.bridgestatus.BridgeReadyModel;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.email.client.v1.DocStruct;
import com.bytedance.lark.pb.email.client.v1.DocsPermissionConfig;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.huawei.hms.framework.common.ContainerUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.utils.C26284k;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.action.ComposeMailAction;
import com.ss.android.lark.mail.impl.action.DraftMailAction;
import com.ss.android.lark.mail.impl.compose.C41970e;
import com.ss.android.lark.mail.impl.compose.attachment.LocalAttachment;
import com.ss.android.lark.mail.impl.compose.mention.MentionPlugin;
import com.ss.android.lark.mail.impl.entity.C42093e;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailDocsPermissionConfig;
import com.ss.android.lark.mail.impl.entity.MailEntSignature;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.entity.ShareMailAddress;
import com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel.BridgeResizeYModel;
import com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel.BridgeSelecttionChangeModel;
import com.ss.android.lark.mail.impl.mailtoolbar.p2198a.AbstractC42757d;
import com.ss.android.lark.mail.impl.mailtoolbar.p2198a.AbstractC42758e;
import com.ss.android.lark.mail.impl.mailtoolbar.p2198a.C42754a;
import com.ss.android.lark.mail.impl.mailtoolbar.p2198a.C42755b;
import com.ss.android.lark.mail.impl.mailtoolbar.p2198a.C42756c;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42761a;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42783b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42789c;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42790d;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42791e;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42792f;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.C42799b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.image.ImageItem;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2200b.C42787b;
import com.ss.android.lark.mail.impl.mailtoolbar.plugins.toolbar.C42815b;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42351b;
import com.ss.android.lark.mail.impl.p2171h.p2177e.C42352c;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.uiframework.view.webview.AbstractC43719c;
import com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f;
import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.mail.impl.utils.C43764g;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.C43800a;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;

public class ComposeWebView extends C43725f {

    /* renamed from: a */
    public static final Pattern f108769a = Pattern.compile("https.*/space/api/(file|box).*");

    /* renamed from: A */
    private final String f108770A = "file:///android_asset/editor.html?";

    /* renamed from: B */
    private final String f108771B = "0";

    /* renamed from: C */
    private final String f108772C = "1";

    /* renamed from: D */
    private final String f108773D = "2";

    /* renamed from: E */
    private final String f108774E = "userPerm";

    /* renamed from: F */
    private final String f108775F = "0";

    /* renamed from: G */
    private final String f108776G = "1";

    /* renamed from: H */
    private final String f108777H = "2";

    /* renamed from: I */
    private final String f108778I = "3";

    /* renamed from: J */
    private final int f108779J = 1;

    /* renamed from: K */
    private final int f108780K = 4;

    /* renamed from: L */
    private final int f108781L = DynamicModule.f58006b;

    /* renamed from: M */
    private C42760e f108782M;

    /* renamed from: N */
    private ComposeMailAction f108783N;

    /* renamed from: O */
    private boolean f108784O = true;

    /* renamed from: P */
    private AbstractC42791e f108785P;

    /* renamed from: Q */
    private int f108786Q = 0;

    /* renamed from: R */
    private int f108787R = 0;

    /* renamed from: S */
    private boolean f108788S = false;

    /* renamed from: T */
    private int f108789T = 0;

    /* renamed from: U */
    private String f108790U;

    /* renamed from: V */
    private boolean f108791V = false;

    /* renamed from: b */
    public String f108792b = "other";

    /* renamed from: c */
    public int f108793c;

    /* renamed from: d */
    C1177w<Boolean> f108794d = new C1177w<>();

    /* renamed from: e */
    public AbstractC42759b f108795e;

    /* renamed from: f */
    public AbstractC42761a f108796f;

    /* renamed from: g */
    public AbstractC42790d f108797g;

    /* renamed from: h */
    public HashMap<String, AbstractC7947h> f108798h = new HashMap<>();

    /* renamed from: i */
    public HashMap<String, ArrayList<AbstractC7947h>> f108799i = new HashMap<>();

    /* renamed from: j */
    public HashMap<String, AbstractC7947h> f108800j = new HashMap<>();

    /* renamed from: k */
    public AbstractC42792f f108801k;

    /* renamed from: l */
    public int f108802l;

    /* renamed from: n */
    public Context f108803n;

    /* renamed from: o */
    public boolean f108804o = C41816b.m166115a().mo150153t();

    /* renamed from: p */
    public AbstractC42783b f108805p;

    /* renamed from: q */
    public AbstractC42783b f108806q;

    /* renamed from: z */
    private final String f108807z = "file:///android_asset/mail_index.html?";

    public enum FetchBodyType {
        Draft,
        Send
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public static /* synthetic */ void m170395B() {
    }

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView$a */
    public static class C42751a {

        /* renamed from: a */
        public String f108871a;

        /* renamed from: b */
        public List<MailImage> f108872b;

        /* renamed from: c */
        public List<MailAttachment> f108873c;

        /* renamed from: d */
        public List<MailDocsPermissionConfig> f108874d;

        /* renamed from: e */
        public boolean f108875e;

        /* renamed from: f */
        public boolean f108876f;

        /* renamed from: g */
        public String f108877g;

        /* renamed from: h */
        public List<MailEntSignature> f108878h;

        /* renamed from: i */
        public String f108879i;

        /* renamed from: j */
        public String f108880j;

        /* renamed from: a */
        public String mo153531a() {
            return this.f108871a;
        }

        /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView$a$a */
        public static class C42752a {

            /* renamed from: a */
            private String f108881a;

            /* renamed from: b */
            private List<MailImage> f108882b;

            /* renamed from: c */
            private List<MailAttachment> f108883c;

            /* renamed from: d */
            private List<MailDocsPermissionConfig> f108884d;

            /* renamed from: e */
            private String f108885e;

            /* renamed from: f */
            private boolean f108886f;

            /* renamed from: g */
            private boolean f108887g;

            /* renamed from: h */
            private List<MailEntSignature> f108888h;

            /* renamed from: i */
            private String f108889i;

            /* renamed from: j */
            private String f108890j;

            /* renamed from: a */
            public C42751a mo153535a() {
                C42751a aVar = new C42751a();
                aVar.f108871a = this.f108881a;
                aVar.f108872b = this.f108882b;
                aVar.f108873c = this.f108883c;
                aVar.f108874d = this.f108884d;
                aVar.f108875e = this.f108886f;
                aVar.f108876f = this.f108887g;
                aVar.f108878h = this.f108888h;
                aVar.f108877g = this.f108885e;
                aVar.f108879i = this.f108889i;
                aVar.f108880j = this.f108890j;
                return aVar;
            }

            /* renamed from: a */
            public C42752a mo153534a(List<MailImage> list) {
                this.f108882b = list;
                return this;
            }

            /* renamed from: b */
            public C42752a mo153536b(List<MailAttachment> list) {
                this.f108883c = list;
                return this;
            }

            /* renamed from: c */
            public C42752a mo153537c(List<MailDocsPermissionConfig> list) {
                this.f108884d = list;
                return this;
            }

            /* renamed from: a */
            public C42752a mo153533a(String str) {
                if (str == null) {
                    str = "";
                }
                this.f108881a = str;
                return this;
            }
        }

        /* renamed from: b */
        public JSONObject mo153532b() {
            DocsPermissionConfig.Action action;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("html", C43819s.m173691b(this.f108871a));
            if (CollectionUtils.isNotEmpty(this.f108872b)) {
                JSONArray jSONArray = new JSONArray();
                for (MailImage mailImage : this.f108872b) {
                    if (mailImage != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("name", (Object) mailImage.mo151477e());
                        jSONObject2.put("token", (Object) mailImage.mo151480f());
                        jSONObject2.put("cid", (Object) mailImage.mo151481g());
                        jSONObject2.put("size", (Object) Long.valueOf(mailImage.mo151482h()));
                        jSONArray.add(jSONObject2);
                    }
                }
                jSONObject.put("images", (Object) jSONArray);
            }
            if (CollectionUtils.isNotEmpty(this.f108873c)) {
                JSONArray jSONArray2 = new JSONArray();
                for (MailAttachment mailAttachment : this.f108873c) {
                    if (mailAttachment != null) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("name", (Object) mailAttachment.mo151229f());
                        jSONObject3.put("token", (Object) mailAttachment.mo151234j());
                        jSONObject3.put("size", (Object) Long.valueOf(mailAttachment.mo151231h()));
                        jSONObject3.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(mailAttachment.mo151238n()));
                        jSONArray2.add(jSONObject3);
                    }
                }
                jSONObject.put("attachments", (Object) jSONArray2);
            }
            if (CollectionUtils.isNotEmpty(this.f108874d)) {
                JSONArray jSONArray3 = new JSONArray();
                for (MailDocsPermissionConfig mailDocsPermissionConfig : this.f108874d) {
                    if (mailDocsPermissionConfig != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("docUrl", (Object) mailDocsPermissionConfig.mo151306a());
                        if (mailDocsPermissionConfig.mo151309b() == null) {
                            action = DocsPermissionConfig.Action.KEEP;
                        } else {
                            action = mailDocsPermissionConfig.mo151309b();
                        }
                        jSONObject4.put("action", (Object) Integer.valueOf(action.getValue()));
                        jSONArray3.add(jSONObject4);
                    }
                }
                jSONObject.put("docLinks", (Object) jSONArray3);
            }
            if (C41970e.m166941d().mo150951a()) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("isForcedApply", Boolean.valueOf(this.f108876f));
                jSONObject5.put("defaultId", this.f108877g);
                JSONArray jSONArray4 = new JSONArray();
                if (CollectionUtils.isNotEmpty(this.f108878h)) {
                    for (MailEntSignature mailEntSignature : this.f108878h) {
                        if (mailEntSignature != null) {
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("id", (Object) mailEntSignature.mo151380a());
                            jSONObject6.put("name", (Object) mailEntSignature.mo151386b());
                            jSONObject6.put("template", (Object) mailEntSignature.mo151388c());
                            JSONObject jSONObject7 = null;
                            if (!this.f108875e) {
                                jSONObject7 = JSONObject.parseObject(mailEntSignature.mo151390d());
                            }
                            if (jSONObject7 == null) {
                                jSONObject7 = new JSONObject();
                            }
                            jSONObject7.put("B-NAME", (Object) this.f108879i);
                            jSONObject7.put("B-ENTERPRISE-EMAIL", (Object) this.f108880j);
                            jSONObject6.put("valueJSON", (Object) jSONObject7);
                            jSONObject6.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(mailEntSignature.mo151394f().ordinal()));
                            jSONArray4.add(jSONObject6);
                        }
                    }
                }
                jSONObject5.put("list", (Object) jSONArray4);
                jSONObject.put("signatures", (Object) jSONObject5);
            }
            return jSONObject;
        }
    }

    /* renamed from: a */
    public void mo153448a(AbstractC42759b bVar, AbstractC43719c cVar, Context context, ComposeMailAction composeMailAction) {
        this.f108795e = bVar;
        this.f108803n = context;
        this.f108783N = composeMailAction;
        this.f108791V = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.largefile.phase2");
        this.f108793c = C43785p.m173530a(28);
        this.f108802l = getContext().getResources().getDimensionPixelSize(R.dimen.mail_operation_title_bar_height) + DeviceUtils.getStatusHeight(getContext());
        m170406t();
        m170408v();
        m170405n();
        if (C41970e.m166941d().mo150951a()) {
            m170407u();
        }
        mo155848a(new C42753a(this.f108795e), cVar);
        if (C26284k.m95186b(C41816b.m166115a().mo150132b())) {
            setContentDescription("ComposeWebView");
        }
    }

    /* renamed from: a */
    public void mo153462a(boolean z) {
        Log.m165389i("ComposeWebView", "updateToolbarState enableAttribution: " + z);
        C42760e eVar = this.f108782M;
        if (eVar != null) {
            eVar.mo153565a(z && isFocused());
        }
    }

    @Override // com.bytedance.ee.larkwebview.base.BaseWebView
    /* renamed from: a */
    public void mo22331a(String str) {
        this.f108790U = str;
    }

    /* renamed from: a */
    public void mo153452a(ImageItem imageItem) {
        Log.m165389i("ComposeWebView", "renderUploadedImageInSharedDraft");
        if (imageItem == null) {
            Log.m165383e("ComposeWebView", "renderUploadedImageInSharedDraft empty image item");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uuid", (Object) imageItem.getUuid());
        jSONObject.put("src", (Object) imageItem.getSrc());
        jSONObject.put("width", (Object) Integer.valueOf(imageItem.getWidth()));
        jSONObject.put("height", (Object) Integer.valueOf(imageItem.getHeight()));
        mo30808a("javascript:replaceImage", jSONObject, true);
    }

    /* renamed from: a */
    public void mo153446a(LocalAttachment localAttachment) {
        Log.m165389i("ComposeWebView", "addSharedAttachment");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, "attachments");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) "push");
            jSONObject2.put("value", (Object) localAttachment.mo150767d());
            jSONObject.put("op", (Object) jSONObject2);
            m170397a(jSONObject);
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "addSharedAttachment", e);
        }
    }

    /* renamed from: a */
    public void mo153457a(String str, ShareMailAddress shareMailAddress) {
        Log.m165389i("ComposeWebView", "addSharedRecipient");
        if (TextUtils.isEmpty(str) || shareMailAddress == null) {
            Log.m165383e("ComposeWebView", "addSharedRecipient invalid parameter");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) "push");
            jSONObject2.put("value", (Object) shareMailAddress.mo151781u());
            jSONObject.put("op", (Object) jSONObject2);
            m170397a(jSONObject);
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "addSharedRecipient", e);
        }
    }

    /* renamed from: a */
    public void mo153453a(String str, int i) {
        Log.m165389i("ComposeWebView", "removeSharedRecipient");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) "remove");
            jSONObject2.put("value", (Object) Integer.valueOf(i));
            jSONObject.put("op", (Object) jSONObject2);
            m170397a(jSONObject);
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "removeSharedRecipient", e);
        }
    }

    /* renamed from: a */
    public void mo153449a(final AbstractC42783b bVar, final FetchBodyType fetchBodyType) {
        Log.m165389i("ComposeWebView", "fetchContent");
        m170399a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.RunnableC427467 */

            public void run() {
                Log.m165389i("ComposeWebView", "fetchContent");
                if (fetchBodyType == null || bVar == null) {
                    Log.m165383e("ComposeWebView", "fetchContent invalid parameter");
                    return;
                }
                int i = AnonymousClass29.f108848a[fetchBodyType.ordinal()];
                if (i == 1) {
                    Log.m165389i("ComposeWebView", "fetchContent Draft");
                    ComposeWebView.this.mo153454a("getDraftContent", new ValueCallback<String>() {
                        /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.RunnableC427467.C427471 */

                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            Log.m165389i("ComposeWebView", "fetchContent Draft onReceiveValue: " + str);
                        }
                    }, new String[0]);
                    ComposeWebView.this.f108805p = bVar;
                    ComposeWebView.this.f108792b = "draft";
                } else if (i != 2) {
                    Log.m165397w("ComposeWebView", "fetchContent switch to default");
                    ComposeWebView.this.f108792b = "other";
                } else {
                    Log.m165389i("ComposeWebView", "fetchContent Send");
                    ComposeWebView.this.mo153454a("getSendContent", new ValueCallback<String>() {
                        /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.RunnableC427467.C427482 */

                        /* renamed from: a */
                        public void onReceiveValue(String str) {
                            Log.m165389i("ComposeWebView", "fetchContent Send onReceiveValue: " + str);
                        }
                    }, new String[0]);
                    ComposeWebView.this.f108806q = bVar;
                    ComposeWebView.this.f108792b = "send";
                }
            }
        }, new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.RunnableC427498 */

            public void run() {
                bVar.mo150645a();
            }
        });
    }

    /* renamed from: a */
    public void mo153450a(AbstractC42783b bVar, String str) {
        if (bVar == null) {
            Log.m165383e("ComposeWebView", "processContentCallback invalid callback");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            bVar.mo150646a(jSONObject.optString("html"), jSONObject.optString("text"), jSONObject.optString("images"), m170402f(jSONObject.optString("docLinks")));
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "processContentCallback", e);
        }
        this.f108792b = "other";
    }

    /* renamed from: a */
    public void mo153445a(final DocStruct docStruct, final DocsPermissionConfig.Action action) {
        DocStruct.Type type;
        Log.m165389i("ComposeWebView", "updateDocInfo");
        if (docStruct == null) {
            Log.m165389i("ComposeWebView", "updateDocPermission null");
            return;
        }
        final String str = docStruct.url;
        String str2 = docStruct.name;
        if (TextUtils.isEmpty(str) || str2 == null) {
            Log.m165389i("ComposeWebView", "updateDocPermission illegal parameters");
            return;
        }
        AbstractC7947h remove = this.f108798h.remove(str);
        if (remove != null) {
            if (docStruct.type == null) {
                type = DocStruct.Type.UNKNOWN;
            } else {
                type = docStruct.type;
            }
            int value = type.getValue();
            remove.mo17190a("{\"name\": \"" + str2 + "\", \"type\": " + value + "}");
        }
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass19 */

            public void run() {
                ArrayList<AbstractC7947h> remove = ComposeWebView.this.f108799i.remove(str);
                if (CollectionUtils.isNotEmpty(remove)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("currentAction", ComposeWebView.this.mo153439a(action));
                        if (CollectionUtils.isEmpty(docStruct.user_perm)) {
                            Log.m165383e("ComposeWebView", "updateDocInfo no permission");
                            return;
                        }
                        org.json.JSONArray jSONArray = new org.json.JSONArray();
                        for (int i = 0; i < docStruct.user_perm.size(); i++) {
                            jSONArray.put("\"" + docStruct.user_perm.get(i).getValue() + "\"");
                        }
                        jSONObject.put("userPerm", jSONArray);
                        String jSONObject2 = jSONObject.toString();
                        for (int i2 = 0; i2 < remove.size(); i2++) {
                            AbstractC7947h hVar = remove.get(i2);
                            if (hVar != null) {
                                hVar.mo17190a(jSONObject2);
                            }
                        }
                    } catch (Exception e) {
                        Log.m165384e("ComposeWebView", "updateDocInfo", e);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo153455a(String str, DocsPermissionConfig.Action action) {
        Log.m165389i("ComposeWebView", "updateDocPermission");
        if (TextUtils.isEmpty(str) || action == null) {
            Log.m165389i("ComposeWebView", "updateDocPermission illegal parameters");
            return;
        }
        AbstractC7947h remove = this.f108800j.remove(str);
        if (remove != null) {
            remove.mo17190a(mo153439a(action));
        }
    }

    /* renamed from: a */
    public void mo153451a(final AbstractC42789c cVar) {
        Log.m165389i("ComposeWebView", "getCursorPosition");
        mo153454a("getCursorPosition", new ValueCallback<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass21 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                try {
                    cVar.onGetCursorPosition(new org.json.JSONObject(str).getInt("top"));
                } catch (Exception e) {
                    Log.m165384e("ComposeWebView", "getCursorPosition", e);
                }
            }
        }, new String[0]);
    }

    /* renamed from: a */
    public void mo153447a(C42751a aVar) {
        Log.m165389i("ComposeWebView", "doRenderNormalDraft");
        ((C42753a) this.f110963y).mo153542c();
        if (C41970e.m166941d().mo150951a()) {
            C42787b bVar = (C42787b) aj.m5366a((FragmentActivity) this.f108803n).mo6005a(C42787b.class);
            aVar.f108875e = bVar.isCurrentMailGroup();
            aVar.f108876f = bVar.isCurrentForceApply();
            aVar.f108878h = bVar.getCurrentUsableSignatureList();
            aVar.f108877g = bVar.getCurrentDefaultId();
            aVar.f108879i = bVar.getCurrentAddressName();
            aVar.f108880j = bVar.getCurrentAddress();
            m170401e(bVar.getCurrentDefaultId());
        }
        String a = aVar.mo153531a();
        mo155849c(a.length(), !TextUtils.isEmpty(a) && a.length() < 250000);
        mo153460a("render", aVar.mo153532b().toString(), m170411y());
    }

    /* renamed from: a */
    public void mo153444a(LifecycleOwner lifecycleOwner, final String str, final PermissionCode permissionCode, final AbstractC42792f fVar) {
        Log.m165389i("ComposeWebView", "renderSharedDraft permissionCode: " + permissionCode);
        C1177w<Boolean> wVar = this.f108794d;
        if (wVar == null || !wVar.mo5927b().booleanValue()) {
            this.f108794d.mo5923a(lifecycleOwner, new AbstractC1178x<Boolean>() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass25 */

                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    if (bool != null && bool.booleanValue()) {
                        ComposeWebView.this.mo153456a(str, permissionCode, fVar);
                        ComposeWebView.this.f108794d.mo5928b(this);
                    }
                }
            });
        } else {
            mo153456a(str, permissionCode, fVar);
        }
    }

    /* renamed from: a */
    public void mo153456a(String str, PermissionCode permissionCode, AbstractC42792f fVar) {
        Log.m165389i("ComposeWebView", "renderSharedDraft do render");
        ((C42753a) this.f110963y).mo153542c();
        this.f108801k = fVar;
        int i = 1;
        if (permissionCode != null) {
            int i2 = AnonymousClass29.f108849b[permissionCode.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    i = 4;
                } else if (i2 == 3) {
                    i = DynamicModule.f58006b;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("javascript:renderCollaMail(`");
            stringBuffer.append(str);
            stringBuffer.append("`,");
            stringBuffer.append(i);
            stringBuffer.append(", `");
            stringBuffer.append(UIHelper.getAppName());
            stringBuffer.append("`)");
            loadUrl(stringBuffer.toString());
        }
        i = 0;
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("javascript:renderCollaMail(`");
        stringBuffer2.append(str);
        stringBuffer2.append("`,");
        stringBuffer2.append(i);
        stringBuffer2.append(", `");
        stringBuffer2.append(UIHelper.getAppName());
        stringBuffer2.append("`)");
        loadUrl(stringBuffer2.toString());
    }

    /* renamed from: a */
    public void mo153461a(HashMap<String, String> hashMap) {
        Log.m165389i("ComposeWebView", "loadEditorHtml");
        StringBuilder sb = new StringBuilder();
        sb.append(C41970e.m166941d().mo150953b() ? "file:///android_asset/mail_index.html?" : "file:///android_asset/editor.html?");
        if (CollectionUtils.isNotEmpty(hashMap)) {
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                if (!TextUtils.isEmpty(entry.getKey()) && !TextUtils.isEmpty(entry.getValue())) {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                    sb.append(entry.getKey());
                    sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                    sb.append(entry.getValue());
                }
            }
        }
        loadUrl(sb.toString());
        this.f108794d.mo5929b((Boolean) false);
    }

    /* renamed from: a */
    public void mo153459a(String str, boolean z, String str2, long j, String str3) {
        Log.m165389i("ComposeWebView", "updateImageUploadResult uuid: " + str + ", success: " + z);
        if (z) {
            mo153460a("setDriveImgSuccess", C43819s.m173693c(str), C43819s.m173693c(str2), String.valueOf(j), C43819s.m173693c(str3));
            return;
        }
        mo153460a("setDriveImgError", C43819s.m173693c(str));
    }

    /* renamed from: a */
    public void mo153463a(String[] strArr) {
        Log.m165389i("ComposeWebView", "removeImage");
        if (strArr == null || strArr.length == 0) {
            Log.m165383e("ComposeWebView", "removeImage empty data");
            return;
        }
        StringBuilder sb = new StringBuilder("[");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
            if (i != length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        mo153460a("deleteImgDom", sb.toString());
    }

    /* renamed from: a */
    public void mo153458a(final String str, final String str2) {
        Log.m165389i("ComposeWebView", "retryUploadImage");
        if (TextUtils.isEmpty(str)) {
            Log.m165383e("ComposeWebView", "retryUploadImage empty block id");
        } else {
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass27 */

                public void run() {
                    ComposeWebView.this.mo153460a("setImgRetry", C43819s.m173693c(str), C43819s.m173693c(str2));
                }
            });
        }
    }

    /* renamed from: a */
    public void mo153460a(String str, String... strArr) {
        mo153454a(str, (ValueCallback<String>) null, strArr);
    }

    /* renamed from: a */
    public void mo153454a(String str, ValueCallback<String> valueCallback, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:window.command.");
        sb.append(str);
        sb.append("(");
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    sb.append(strArr[i]);
                    if (i < strArr.length - 1) {
                        sb.append(",");
                    }
                }
            }
        }
        sb.append(")");
        evaluateJavascript(sb.toString(), valueCallback);
    }

    /* renamed from: b */
    public void mo22336b() {
        mo153462a(true);
    }

    /* renamed from: g */
    public void mo153476g() {
        mo153465b(100, true);
    }

    private static String getLocaleString() {
        return m170396a(C41816b.m166115a().mo150146m());
    }

    /* renamed from: n */
    private void m170405n() {
        mo30810a("biz.core.getCurrentEmailAddress", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427456 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                String str2;
                C42093e l = C43277a.m171921a().mo154948l();
                if (l == null || TextUtils.isEmpty(l.mo151855e())) {
                    str2 = "";
                } else {
                    str2 = l.mo151855e();
                }
                Log.m165389i("ComposeWebView", "registerGetCurrentAccount handler BIZ_CORE_GET_CURRENT_MAIL_ADDRESS");
                hVar.mo17190a(str2);
            }
        });
    }

    /* renamed from: x */
    private void m170410x() {
        mo30810a("biz.core.isinquoteselection", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass18 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "registerInQuoteSelection :" + str);
                try {
                    final org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    C43849u.m173827a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass18.RunnableC427391 */

                        public void run() {
                            ComposeWebView.this.mo153462a(!jSONObject.optBoolean("isInQuote", true));
                        }
                    }, 200);
                } catch (Exception unused) {
                    Log.m165383e("ComposeWebView", "isInQuote error");
                }
            }
        });
    }

    /* renamed from: z */
    private void m170412z() {
        C42760e eVar = this.f108782M;
        if (eVar != null) {
            eVar.mo153562a(new MentionPlugin.AbstractC42020a() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass28 */

                @Override // com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AbstractC42020a
                /* renamed from: a */
                public void mo151031a() {
                    if (ComposeWebView.this.f108797g != null) {
                        ComposeWebView.this.f108797g.mo150674a();
                    }
                }

                @Override // com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AbstractC42020a
                /* renamed from: a */
                public void mo151033a(SearchAddress searchAddress) {
                    Log.m165389i("ComposeWebView", "onMentionedUserAdded");
                    if (ComposeWebView.this.f108795e != null) {
                        ComposeWebView.this.f108795e.mo150894a(searchAddress);
                    }
                }

                @Override // com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AbstractC42020a
                /* renamed from: b */
                public void mo151034b(SearchAddress searchAddress) {
                    Log.m165389i("ComposeWebView", "onMentionedUserRemoved");
                    if (ComposeWebView.this.f108795e != null) {
                        ComposeWebView.this.f108795e.mo150905b(searchAddress);
                    }
                }

                @Override // com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AbstractC42020a
                /* renamed from: a */
                public void mo151032a(int i) {
                    if (ComposeWebView.this.f108797g != null) {
                        int[] iArr = new int[2];
                        ComposeWebView.this.getLocationOnScreen(iArr);
                        float f = (float) i;
                        ComposeWebView.this.f108797g.mo150675a((UIHelper.dp2px(f) + iArr[1]) - ComposeWebView.this.f108802l, UIHelper.dp2px(f) + iArr[1]);
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public void mo153477h() {
        m170394A();
        mo153460a("removeSignature", new String[0]);
        mo153478i();
    }

    /* renamed from: i */
    public void mo153478i() {
        mo153460a("getSignatureId", new String[0]);
    }

    /* renamed from: A */
    private void m170394A() {
        C42787b bVar = (C42787b) aj.m5366a((FragmentActivity) this.f108803n).mo6005a(C42787b.class);
        AbstractC42759b bVar2 = this.f108795e;
        if (bVar2 != null) {
            bVar2.mo150909b(bVar.getCurrentImageList());
        }
    }

    /* renamed from: t */
    private void m170406t() {
        mo30810a("biz.core.getDraftContent", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427509 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_DRAFT_CONTENT");
                ComposeWebView composeWebView = ComposeWebView.this;
                composeWebView.mo153450a(composeWebView.f108805p, str);
            }
        });
        mo30810a("biz.core.getSendContent", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass10 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_SEND_CONTENT");
                ComposeWebView composeWebView = ComposeWebView.this;
                composeWebView.mo153450a(composeWebView.f108806q, str);
            }
        });
    }

    /* renamed from: v */
    private void m170408v() {
        mo30810a("biz.mail.fetchDocs", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass14 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_FETCH_DOCS add doc link");
                String c = ComposeWebView.this.mo153468c(str);
                if (!TextUtils.isEmpty(c)) {
                    ComposeWebView.this.f108798h.put(c, hVar);
                    if (ComposeWebView.this.f108795e != null) {
                        ComposeWebView.this.f108795e.mo150915d(c);
                    }
                }
            }
        });
        mo30810a("biz.mail.fetchDocsPermInfo", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass15 */

            /* renamed from: a */
            public void handle(String str, final AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_MAIL_FETCH_DOCS_PERMISSION_INFO");
                final String c = ComposeWebView.this.mo153468c(str);
                if (!TextUtils.isEmpty(c)) {
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass15.RunnableC427381 */

                        public void run() {
                            ArrayList<AbstractC7947h> arrayList = ComposeWebView.this.f108799i.get(c);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                            }
                            arrayList.add(hVar);
                            ComposeWebView.this.f108799i.put(c, arrayList);
                            if (ComposeWebView.this.f108795e != null) {
                                ComposeWebView.this.f108795e.mo150918e(c);
                            }
                        }
                    });
                }
            }
        });
        mo30810a("biz.mail.clickDocsPermission", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass16 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                DocsPermissionConfig.Action action;
                Log.m165389i("ComposeWebView", "BIZ_CLICK_DOCS_PERMISSION");
                if (C43764g.m173481a("composeClickDocLink")) {
                    Log.m165383e("ComposeWebView", "BIZ_CLICK_DOCS_PERMISSION block repeating click");
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    String optString = jSONObject.optString("url");
                    String optString2 = jSONObject.optString("permission");
                    if (!TextUtils.isEmpty(optString)) {
                        ComposeWebView.this.f108800j.put(optString, hVar);
                        if (!TextUtils.isEmpty(optString2)) {
                            optString2.hashCode();
                            char c = 65535;
                            switch (optString2.hashCode()) {
                                case 48:
                                    if (optString2.equals("0")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 49:
                                    if (optString2.equals("1")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                                    if (optString2.equals("2")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    action = DocsPermissionConfig.Action.KEEP;
                                    break;
                                case 1:
                                    action = DocsPermissionConfig.Action.READ;
                                    break;
                                case 2:
                                    action = DocsPermissionConfig.Action.EDIT;
                                    break;
                                default:
                                    action = DocsPermissionConfig.Action.KEEP;
                                    break;
                            }
                        } else {
                            action = DocsPermissionConfig.Action.READ;
                        }
                        if (ComposeWebView.this.f108795e != null) {
                            ComposeWebView.this.f108795e.mo150896a(optString, action);
                        }
                    }
                } catch (Exception unused) {
                    Log.m165383e("ComposeWebView", "BIZ_CLICK_DOCS_PERMISSION parse json error");
                }
            }
        });
    }

    /* renamed from: w */
    private void m170409w() {
        Log.m165389i("ComposeWebView", "registerImageDomChangeHandler");
        mo30810a("biz.core.imgDomDidChange", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass17 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                int i;
                String str2;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    String optString = jSONObject.optString("uuid");
                    String optString2 = jSONObject.optString("src");
                    String optString3 = jSONObject.optString("contentType");
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject("imgParams");
                    if (optJSONObject != null) {
                        String optString4 = optJSONObject.optString("token");
                        i = optJSONObject.optInt("width");
                        str2 = optString4;
                    } else {
                        str2 = null;
                        i = 0;
                    }
                    if (TextUtils.isEmpty(optString)) {
                        Log.m165383e("ComposeWebView", "BIZ_IMAGE_DOM_CHANGE invalid uuid");
                    } else if (TextUtils.isEmpty(optString2)) {
                        Log.m165383e("ComposeWebView", "BIZ_IMAGE_DOM_CHANGE invalid src");
                    } else {
                        Log.m165388i("BIZ_IMAGE_DOM_CHANGE uuid: " + optString + " src: " + optString2);
                        if (ComposeWebView.this.f108795e != null && !TextUtils.isEmpty(optString2) && ComposeWebView.f108769a.matcher(optString2).matches()) {
                            Log.m165388i("BIZ_IMAGE_DOM_CHANGE doc image link");
                            ComposeWebView.this.f108795e.mo150899a(optString, optString2, str2, optString3, i);
                        }
                    }
                } catch (Exception e) {
                    Log.m165384e("ComposeWebView", "BIZ_IMAGE_DOM_CHANGE", e);
                }
            }
        });
    }

    /* renamed from: d */
    public void mo153471d() {
        Log.m165389i("ComposeWebView", "clear");
        mo153454a("clear", new ValueCallback<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass22 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                Log.m165389i("ComposeWebView", "clear onReceiveValue: " + str);
            }
        }, new String[0]);
    }

    @Override // com.ss.android.lark.mail.impl.uiframework.view.webview.C43725f
    /* renamed from: f */
    public void mo153475f() {
        this.f108798h.clear();
        this.f108799i.clear();
        this.f108800j.clear();
        this.f108801k = null;
    }

    /* renamed from: u */
    private void m170407u() {
        final C42787b bVar = (C42787b) aj.m5366a((FragmentActivity) this.f108803n).mo6005a(C42787b.class);
        mo30810a("biz.mail.fetchSignatures", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass11 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                String string = JSONObject.parseObject(str).getString("address");
                if (TextUtils.isEmpty(string)) {
                    string = bVar.getCurrentAddress();
                }
                hVar.mo17188a(ComposeWebView.this.mo153438a(string, bVar));
                ComposeWebView.this.mo153478i();
            }
        });
        mo30810a("biz.mail.getSignatureId", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass13 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                try {
                    bVar.setCurrentSignatureId(new org.json.JSONObject(str).optString("id"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* renamed from: c */
    public void mo153469c() {
        int i;
        this.f108788S = false;
        AbstractC42791e eVar = this.f108785P;
        if (eVar != null && (i = this.f108786Q) < 0) {
            eVar.onSelectionChange(i, false);
        }
        this.f108786Q = 0;
        mo153460a("hideKeyboard", new String[0]);
    }

    /* renamed from: e */
    public void mo153474e() {
        Log.m165389i("ComposeWebView", "focusWebViewInput");
        mo153454a("focus", new ValueCallback<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass26 */

            /* renamed from: a */
            public void onReceiveValue(String str) {
                Log.m165389i("ComposeWebView", "focusWebViewInput value:" + str);
            }
        }, new String[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView$29  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass29 {

        /* renamed from: a */
        static final /* synthetic */ int[] f108848a;

        /* renamed from: b */
        static final /* synthetic */ int[] f108849b;

        /* renamed from: c */
        static final /* synthetic */ int[] f108850c;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        static {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass29.<clinit>():void");
        }
    }

    private int getCurrentFontHeight() {
        int i = 14;
        if (!TextUtils.isEmpty(this.f108790U)) {
            String str = this.f108790U;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case 429928378:
                    if (str.equals("FontHuge")) {
                        c = 0;
                        break;
                    }
                    break;
                case 445986828:
                    if (str.equals("FontLarge")) {
                        c = 1;
                        break;
                    }
                    break;
                case 452792792:
                    if (str.equals("FontSmall")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1010883126:
                    if (str.equals("FontNormal")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 32;
                    break;
                case 1:
                    i = 18;
                    break;
                case 2:
                    i = 12;
                    break;
            }
        }
        return UIHelper.dp2px((float) ((int) (((double) i) * 1.3d)));
    }

    private JSONObject getDomainJson() {
        JSONObject jSONObject = new JSONObject();
        m170398a(jSONObject, DomainSettings.Alias.DOCS_PEER, "domainPool");
        m170398a(jSONObject, DomainSettings.Alias.DOCS_API, "spaceApi");
        List<String> a = C41816b.m166115a().mo150121a(DomainSettings.Alias.DOCS_HOME);
        if (!CollectionUtils.isEmpty(a)) {
            jSONObject.put("docsHomeDomain", (Object) a.get(0));
        }
        List<String> a2 = C41816b.m166115a().mo150121a(DomainSettings.Alias.SUITE_MAIN_DOMAIN);
        if (!CollectionUtils.isEmpty(a2)) {
            jSONObject.put("mailBffDomain", (Object) a2.get(0));
        }
        return jSONObject;
    }

    private JSONObject getOldDomainJson() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        m170398a(jSONObject2, DomainSettings.Alias.DOCS_PEER, "domainPool");
        jSONObject.put("common", (Object) jSONObject2);
        m170398a(jSONObject, DomainSettings.Alias.DOCS_API, "space_api");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("downloadLark", (Object) "http://");
        jSONObject.put("urlMapper", (Object) jSONObject3);
        List<String> a = C41816b.m166115a().mo150121a(DomainSettings.Alias.DOCS_LONG);
        if (!CollectionUtils.isEmpty(a)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : a) {
                if (!TextUtils.isEmpty(str)) {
                    jSONArray.add("wss://" + str + "/ws/v2");
                }
            }
            jSONObject.put("DocsLongApiDomainList", (Object) jSONArray);
        }
        List<String> a2 = C41816b.m166115a().mo150121a(DomainSettings.Alias.DOCS_HOME);
        if (!CollectionUtils.isEmpty(a2)) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.addAll(a2);
            jSONObject.put("DocsHome", (Object) jSONArray2);
        }
        List<String> a3 = C41816b.m166115a().mo150121a(DomainSettings.Alias.SUITE_MAIN_DOMAIN);
        if (!CollectionUtils.isEmpty(a3)) {
            jSONObject.put("MailBFFDomain", a3.get(0));
        }
        return jSONObject;
    }

    /* renamed from: m */
    private void m170404m() {
        this.f108794d.mo5929b((Boolean) false);
        setOverScrollMode(2);
        mo30810a("biz.mail.log", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427371 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    String optString = jSONObject.optString("content");
                    String optString2 = jSONObject.optString("level");
                    char c = 65535;
                    switch (optString2.hashCode()) {
                        case 48:
                            if (optString2.equals("0")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 49:
                            if (optString2.equals("1")) {
                                c = 1;
                                break;
                            }
                            break;
                        case MmListControl.f116813f /*{ENCODED_INT: 50}*/:
                            if (optString2.equals("2")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 51:
                            if (optString2.equals("3")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        Log.m165379d("ComposeWebView", "BIZ_MAIL_LOG: " + optString);
                    } else if (c == 1) {
                        Log.m165389i("ComposeWebView", "BIZ_MAIL_LOG: " + optString);
                    } else if (c == 2) {
                        Log.m165397w("ComposeWebView", "BIZ_MAIL_LOG: " + optString);
                    } else if (c != 3) {
                        Log.m165383e("ComposeWebView", "BIZ_MAIL_LOG (default): " + optString);
                    } else {
                        if (!TextUtils.isEmpty(optString) && optString.startsWith("error in unhandledrejection")) {
                            C42187a.m168572u(ComposeWebView.this.f108792b);
                            ComposeWebView.this.f108792b = "other";
                        }
                        Log.m165383e("ComposeWebView", "BIZ_MAIL_LOG: " + optString);
                    }
                } catch (Exception e) {
                    Log.m165384e("ComposeWebView", "BIZ_MAIL_LOG", e);
                }
            }
        });
        mo30810a("biz.notify.ready", new C42754a(new AbstractC5678b() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass12 */

            @Override // com.bytedance.ee.bear.document.bridgestatus.AbstractC5678b
            public void ready(BridgeReadyModel bridgeReadyModel) {
                Log.m165389i("ComposeWebView", "BIZ_NOTIFY_READY");
                if (ComposeWebView.this.f108794d.mo5927b() == null || !ComposeWebView.this.f108794d.mo5927b().booleanValue()) {
                    ComposeWebView.this.f108794d.mo5929b((Boolean) true);
                }
            }
        }));
        mo30810a("biz.render.done", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass23 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_RENDER_DONE");
                if (ComposeWebView.this.f108795e != null) {
                    ComposeWebView.this.f108795e.mo150937t();
                }
                ComposeWebView.this.mo153478i();
                ComposeWebView.this.mo155851k();
                ((C42351b) C42344d.m169091a(C42351b.class, ComposeWebView.this.f108803n)).mo152462a(0);
                ((C42352c) C42344d.m169091a(C42352c.class, ComposeWebView.this.f108803n)).mo152462a(0);
            }
        });
        mo30810a("biz.core.contentChange", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass30 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                if (ComposeWebView.this.f108796f != null) {
                    ComposeWebView.this.f108796f.mo150697a();
                }
            }
        });
        mo30810a("biz.core.resizeY", new C42755b(new AbstractC42757d() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass31 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.p2198a.AbstractC42757d
            /* renamed from: a */
            public void mo153515a(BridgeResizeYModel bridgeResizeYModel) {
                ComposeWebView.this.mo153472d(C43785p.m173530a(bridgeResizeYModel.getHeight()));
            }
        }));
        mo30810a("biz.core.selectionchange", new C42756c(new AbstractC42758e() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass32 */

            @Override // com.ss.android.lark.mail.impl.mailtoolbar.p2198a.AbstractC42758e
            /* renamed from: a */
            public void mo153516a(BridgeSelecttionChangeModel bridgeSelecttionChangeModel) {
                ComposeWebView.this.mo153441a(bridgeSelecttionChangeModel.getTop(), true);
            }
        }));
        m170410x();
        m170409w();
        mo30810a("biz.util.retryUploadImg", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass33 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_RETRY_UPLOAD_IMAGE");
                if (ComposeWebView.this.f108795e != null) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        ComposeWebView.this.f108795e.mo150898a(jSONObject.optString("blockId"), jSONObject.optString("uuid"));
                    } catch (Exception unused) {
                        Log.m165383e("ComposeWebView", "BIZ_RETRY_UPLOAD_IMAGE error");
                    }
                }
            }
        });
        mo30810a("biz.util.deleteUploadImg", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass34 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_DELETE_UPLOADING_IMAGE");
                if (ComposeWebView.this.f108795e != null) {
                    try {
                        ComposeWebView.this.f108795e.mo150923g(new org.json.JSONObject(str).optString("uuid"));
                    } catch (Exception unused) {
                        Log.m165383e("ComposeWebView", "BIZ_DELETE_UPLOADING_IMAGE error");
                    }
                }
            }
        });
        mo30810a("biz.collaboration.on.update", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass35 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "connectSharedContent BIZ_SHARED_CONTENT_UPDATED");
                if (ComposeWebView.this.f108801k != null) {
                    ComposeWebView.this.f108801k.mo150647a(str);
                }
            }
        });
        mo30810a("biz.mail.largeAttachment", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427402 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                String str2;
                boolean z;
                Log.m165389i("ComposeWebView", "BIZ_LARGE_ATTACHMENT");
                if (hVar == null) {
                    Log.m165383e("ComposeWebView", "BIZ_LARGE_ATTACHMENT empty callback function");
                } else if (ComposeWebView.this.f108795e == null || CollectionUtils.isEmpty(ComposeWebView.this.f108795e.mo150924h())) {
                    Log.m165389i("ComposeWebView", "BIZ_LARGE_ATTACHMENT empty attachment list");
                    hVar.mo17190a("[]");
                } else {
                    JSONArray jSONArray = new JSONArray();
                    for (LocalAttachment localAttachment : ComposeWebView.this.f108795e.mo150924h()) {
                        if (localAttachment != null && localAttachment.mo151233i() == 0) {
                            if (localAttachment.mo151236l() != 0) {
                                if (localAttachment.mo151236l() < System.currentTimeMillis()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    str2 = C43819s.m173686a(R.string.Mail_Attachment_ExpireDate, "ExpireDate", C43760c.m173467a(localAttachment.mo151236l(), true));
                                } else {
                                    str2 = C43819s.m173686a(R.string.Mail_Attachment_ExpireDateFuture, "ExpireDate", C43760c.m173467a(localAttachment.mo151236l(), true));
                                }
                            } else {
                                str2 = "";
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", (Object) localAttachment.mo151229f());
                            jSONObject.put("size", (Object) Long.valueOf(localAttachment.mo151231h()));
                            jSONObject.put("token", (Object) localAttachment.mo151234j());
                            jSONObject.put("expireTime", (Object) Long.valueOf(localAttachment.mo151236l()));
                            jSONObject.put("expireTimeString", (Object) str2);
                            jSONArray.add(jSONObject);
                        }
                    }
                    if (jSONArray.isEmpty()) {
                        Log.m165389i("ComposeWebView", "BIZ_LARGE_ATTACHMENT empty attachment list");
                        hVar.mo17190a("[]");
                        return;
                    }
                    Log.m165389i("ComposeWebView", "BIZ_LARGE_ATTACHMENT large attachment list size:" + jSONArray.size());
                    hVar.mo17190a(jSONArray.toString());
                }
            }
        });
        mo30810a("biz.mail.smartComposeContext", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427413 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_SMART_COMPOSE_CONTEXT");
                if (hVar == null) {
                    Log.m165383e("ComposeWebView", "BIZ_SMART_COMPOSE_CONTEXT callBackFunction null");
                } else if (!ComposeWebView.this.f108804o) {
                    Log.m165397w("ComposeWebView", "BIZ_SMART_COMPOSE_CONTEXT fg denied");
                    hVar.mo17190a("{}");
                } else if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
                    Log.m165397w("ComposeWebView", "BIZ_SMART_COMPOSE_CONTEXT ai fg denied");
                    hVar.mo17190a("{}");
                } else {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("title", ComposeWebView.this.f108795e.mo150940w());
                        jSONObject.put("extra", "");
                        hVar.mo17190a(jSONObject.toString());
                    } catch (Exception e) {
                        Log.m165384e("ComposeWebView", "BIZ_SMART_COMPOSE_CONTEXT", e);
                        hVar.mo17190a("{}");
                    }
                }
            }
        });
        mo30810a("biz.img.insertDone", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427424 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_IMAGE_INSERT_DONE");
                if (TextUtils.isEmpty(str)) {
                    Log.m165383e("ComposeWebView", "BIZ_IMAGE_INSERT_DONE empty data");
                    return;
                }
                try {
                    String optString = new org.json.JSONObject(str).optString("uuid");
                    if (TextUtils.isEmpty(optString)) {
                        Log.m165383e("ComposeWebView", "BIZ_IMAGE_INSERT_DONE invalid uuid");
                        return;
                    }
                    String str2 = C42799b.mImgMap.get(optString);
                    if (TextUtils.isEmpty(str2)) {
                        Log.m165383e("ComposeWebView", "BIZ_IMAGE_INSERT_DONE invalid file path");
                    } else {
                        ComposeWebView.this.f108795e.mo150908b(optString, str2);
                    }
                } catch (Exception e) {
                    Log.m165384e("ComposeWebView", "BIZ_IMAGE_INSERT_DONE", e);
                }
            }
        });
        mo30810a("biz.mail.searchAtUser", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427435 */

            /* renamed from: a */
            public void handle(String str, final AbstractC7947h hVar) {
                Log.m165389i("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO");
                if (TextUtils.isEmpty(str) || hVar == null) {
                    Log.m165383e("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO invalid input");
                    return;
                }
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                    String optString = jSONObject.optString("userId");
                    String optString2 = jSONObject.optString("username");
                    if (!TextUtils.isEmpty(optString)) {
                        if (!TextUtils.isEmpty(optString2)) {
                            C43800a.m173635a().mo156045a(optString2, "", optString, new AbstractC41870b<MailAddress>() {
                                /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.C427435.C427441 */

                                @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
                                /* renamed from: a */
                                public void mo150434a(ErrorResult errorResult) {
                                    Log.m165383e("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO fetchProfile onError" + errorResult);
                                }

                                /* renamed from: a */
                                public void mo150435a(MailAddress mailAddress) {
                                    if (mailAddress == null) {
                                        Log.m165383e("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO fetchProfile empty data");
                                        return;
                                    }
                                    Log.m165389i("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO fetchProfile onSuccess");
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("address", (Object) mailAddress.mo151182e());
                                    jSONObject.put("username", (Object) mailAddress.mo151176a());
                                    jSONObject.put("userId", (Object) mailAddress.mo151189j());
                                    jSONObject.put("tenantId", (Object) mailAddress.mo151196q());
                                    jSONObject.put("avatar", (Object) mailAddress.mo151192m());
                                    JSONArray jSONArray = new JSONArray();
                                    jSONArray.add(jSONObject);
                                    hVar.mo17190a(jSONArray.toString());
                                }
                            });
                            return;
                        }
                    }
                    Log.m165383e("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO invalid user id");
                } catch (Exception e) {
                    Log.m165384e("ComposeWebView", "BIZ_REQUEST_FOR_MENTIONED_USER_INFO", e);
                }
            }
        });
    }

    /* renamed from: y */
    private String m170411y() {
        JSONObject jSONObject;
        boolean z;
        JSONObject jSONObject2 = new JSONObject();
        if (C41970e.m166941d().mo150953b()) {
            jSONObject = getDomainJson();
        } else {
            jSONObject = getOldDomainJson();
        }
        jSONObject2.put("domainConfig", (Object) jSONObject);
        jSONObject2.put("appName", (Object) UIHelper.getAppName());
        jSONObject2.put("lang", (Object) getLocaleString());
        int n = C41816b.m166115a().mo150147n();
        boolean z2 = false;
        if (n == 2 || n == 4) {
            z = true;
        } else {
            z = false;
        }
        jSONObject2.put("isOversea", (Object) Boolean.valueOf(z));
        MailAddress k = C43277a.m171921a().mo154947k();
        if (k != null && !TextUtils.isEmpty(k.mo151182e())) {
            jSONObject2.put("userAddress", (Object) k.mo151182e());
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("largeFile", (Object) Boolean.valueOf(this.f108791V));
        jSONObject3.put("columnStyleQuote", (Object) Boolean.valueOf(C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.column_quote_style")));
        boolean a = C41970e.m166941d().mo150951a();
        if (a) {
            boolean z3 = this.f108783N instanceof DraftMailAction;
            jSONObject2.put("isEditedDraft", (Object) Boolean.valueOf(z3));
            if (z3 && "EditAutoReplyView".contentEquals(this.f108783N.mo150245a())) {
                z2 = true;
            }
            jSONObject3.put("adminSignature", (Object) Boolean.valueOf(a ^ z2));
        }
        jSONObject2.put("fgList", (Object) jSONObject3);
        return jSONObject2.toString();
    }

    /* renamed from: a */
    public void mo19616a() {
        this.f108796f = null;
        this.f108795e = null;
        C42760e eVar = this.f108782M;
        if (eVar != null) {
            eVar.mo153566b();
            this.f108782M = null;
        }
        this.f108784O = true;
    }

    /* renamed from: a */
    public void mo153440a(int i) {
        this.f108787R = i;
    }

    public void setContentChangeCallback(AbstractC42761a aVar) {
        this.f108796f = aVar;
    }

    public void setMentionCallback(AbstractC42790d dVar) {
        this.f108797g = dVar;
    }

    public void setSelectionChangeCallback(AbstractC42791e eVar) {
        this.f108785P = eVar;
    }

    /* renamed from: a */
    private void m170397a(JSONObject jSONObject) {
        mo30808a("javascript:setCollaValue", jSONObject, true);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m170400e(int i) {
        mo153441a(i, false);
    }

    /* renamed from: d */
    public void mo153472d(int i) {
        mo153465b(i, false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f108784O = false;
    }

    public void setWebPluginProvider(C42760e eVar) {
        this.f108782M = eVar;
        m170412z();
    }

    /* renamed from: e */
    private void m170401e(String str) {
        C42787b bVar = (C42787b) aj.m5366a((FragmentActivity) this.f108803n).mo6005a(C42787b.class);
        AbstractC42759b bVar2 = this.f108795e;
        if (bVar2 != null) {
            bVar2.mo150900a(bVar.getImageListById(str));
        }
    }

    /* renamed from: a */
    public String mo153439a(DocsPermissionConfig.Action action) {
        if (action == null) {
            return "0";
        }
        int i = AnonymousClass29.f108850c[action.ordinal()];
        if (i == 2) {
            return "1";
        }
        if (i != 3) {
            return "0";
        }
        return "2";
    }

    /* renamed from: b */
    public void mo153464b(int i) {
        this.f108789T = i;
        if (this.f108788S) {
            this.f108788S = false;
        } else {
            mo153451a(new AbstractC42789c() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.$$Lambda$ComposeWebView$XI0YVCT1TvT1gAr1AaGF6IB7lk */

                @Override // com.ss.android.lark.mail.impl.mailtoolbar.plugins.AbstractC42789c
                public final void onGetCursorPosition(int i) {
                    ComposeWebView.this.m170400e((ComposeWebView) i);
                }
            });
        }
    }

    /* renamed from: c */
    public String mo153468c(String str) {
        try {
            return new org.json.JSONObject(str).optString("url");
        } catch (Exception unused) {
            Log.m165383e("ComposeWebView", "parseDocLink error");
            return null;
        }
    }

    public void setSignature(String str) {
        m170394A();
        m170401e(str);
        mo153460a("setSignature", C43819s.m173693c(str));
        mo153478i();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m170403g(String str) {
        mo153460a("resetSignatures", mo153438a(str, (C42787b) aj.m5366a((FragmentActivity) this.f108803n).mo6005a(C42787b.class)).toJSONString());
        mo153478i();
    }

    /* renamed from: d */
    public void mo153473d(String str) {
        m170394A();
        if (C41970e.m166941d().mo150951a() && !TextUtils.isEmpty(str)) {
            m170399a(new Runnable(str) {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.$$Lambda$ComposeWebView$DyOWoTrR9J5MbB4Ocuacm3A3biI */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ComposeWebView.this.m170403g(this.f$1);
                }
            }, $$Lambda$ComposeWebView$Uu5jqq1n6cREk2S_iSdr2r6jadQ.INSTANCE);
        }
    }

    public void setEditable(boolean z) {
        Log.m165389i("ComposeWebView", "setEditable");
        evaluateJavascript("javascript:setEditable(" + Boolean.toString(z) + ")", null);
    }

    public ComposeWebView(Context context) {
        super(context);
        m170404m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m170396a(java.util.Locale r3) {
        /*
            java.lang.String r0 = "ComposeWebView"
            if (r3 == 0) goto L_0x0035
            java.lang.String r1 = r3.getLanguage()     // Catch:{ Exception -> 0x002f }
            java.lang.String r2 = "in"
            boolean r2 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x002f }
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = "id"
        L_0x0012:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002f }
            r2.<init>()     // Catch:{ Exception -> 0x002f }
            r2.append(r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r1 = "-"
            r2.append(r1)     // Catch:{ Exception -> 0x002f }
            java.lang.String r3 = r3.getCountry()     // Catch:{ Exception -> 0x002f }
            java.lang.String r3 = r3.toUpperCase()     // Catch:{ Exception -> 0x002f }
            r2.append(r3)     // Catch:{ Exception -> 0x002f }
            java.lang.String r3 = r2.toString()     // Catch:{ Exception -> 0x002f }
            goto L_0x0036
        L_0x002f:
            r3 = move-exception
            java.lang.String r1 = "getLocaleString"
            com.ss.android.lark.log.Log.m165384e(r0, r1, r3)
        L_0x0035:
            r3 = 0
        L_0x0036:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x0042
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r3 = r3.toString()
        L_0x0042:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getLocaleString: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.ss.android.lark.log.Log.m165389i(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.m170396a(java.util.Locale):java.lang.String");
    }

    /* renamed from: f */
    private List<MailDocsPermissionConfig> m170402f(String str) {
        Log.m165389i("ComposeWebView", "processDocLinkData");
        if (TextUtils.isEmpty(str)) {
            Log.m165389i("ComposeWebView", "processDocLinkData empty data");
            return null;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() == 0) {
                Log.m165389i("ComposeWebView", "processDocLinkData empty array");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String optString = jSONObject.optString("docUrl");
                    DocsPermissionConfig.Action fromValue = DocsPermissionConfig.Action.fromValue(jSONObject.optInt("action"));
                    if (!TextUtils.isEmpty(optString)) {
                        if (fromValue != null) {
                            arrayList.add(new MailDocsPermissionConfig(optString, fromValue));
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "processDocLinkData", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo153466b(String str) {
        Log.m165389i("ComposeWebView", "updateSharedSubject");
        if (str == null) {
            str = "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, "subject");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) "set");
            jSONObject2.put("value", (Object) str);
            jSONObject.put("op", (Object) jSONObject2);
            m170397a(jSONObject);
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "removeSharedAttachment", e);
        }
    }

    /* renamed from: c */
    public void mo153470c(int i) {
        Log.m165389i("ComposeWebView", "removeSharedAttachment");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ShareHitPoint.f121869d, "attachments");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", (Object) "remove");
            jSONObject2.put("value", (Object) Integer.valueOf(i));
            jSONObject.put("op", (Object) jSONObject2);
            m170397a(jSONObject);
        } catch (Exception e) {
            Log.m165384e("ComposeWebView", "removeSharedAttachment", e);
        }
    }

    public void scrollBy(int i, int i2) {
        super.scrollBy(0, 0);
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(0, 0);
    }

    /* renamed from: a */
    private void m170399a(final Runnable runnable, final Runnable runnable2) {
        this.f108794d.mo5925a(new AbstractC1178x<Boolean>() {
            /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass20 */

            /* renamed from: a */
            public void onChanged(Boolean bool) {
                Log.m165389i("ComposeWebView", "ensureJSReady onChanged:" + bool);
                if (bool == null || !bool.booleanValue()) {
                    runnable2.run();
                } else {
                    runnable.run();
                }
                ComposeWebView.this.f108794d.mo5928b(this);
            }
        });
    }

    /* renamed from: b */
    public void mo153465b(int i, boolean z) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
        if (layoutParams == null) {
            Log.m165383e("ComposeWebView", "resizeHeight null");
            return;
        }
        if (this.f108784O || z) {
            layoutParams.height = getCurrentFontHeight() + this.f108793c;
        } else {
            layoutParams.height = i + this.f108793c;
        }
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public JSONObject mo153438a(String str, C42787b bVar) {
        if ("0".equals(bVar.getCurrentDefaultId())) {
            mo153460a("removeSignature", new String[0]);
        } else {
            m170401e(bVar.getCurrentDefaultId());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isForcedApply", Boolean.valueOf(bVar.isCurrentForceApply()));
        jSONObject.put("defaultId", bVar.getCurrentDefaultId());
        JSONArray jSONArray = new JSONArray();
        if (CollectionUtils.isNotEmpty(bVar.getUsableSignatureList(str))) {
            if (TextUtils.isEmpty(str)) {
                str = bVar.getCurrentAddress();
            }
            String currentAddressName = bVar.getCurrentAddressName();
            for (MailEntSignature mailEntSignature : bVar.getUsableSignatureList(str)) {
                if (mailEntSignature != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", (Object) mailEntSignature.mo151380a());
                    jSONObject2.put("name", (Object) mailEntSignature.mo151386b());
                    jSONObject2.put("template", (Object) mailEntSignature.mo151388c());
                    JSONObject jSONObject3 = null;
                    if (!bVar.isCurrentMailGroup()) {
                        jSONObject3 = JSONObject.parseObject(mailEntSignature.mo151390d());
                    }
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    jSONObject3.put("B-NAME", (Object) currentAddressName);
                    jSONObject3.put("B-ENTERPRISE-EMAIL", (Object) str);
                    jSONObject2.put("valueJSON", (Object) jSONObject3);
                    jSONObject2.put(ShareHitPoint.f121869d, (Object) Integer.valueOf(mailEntSignature.mo151394f().ordinal()));
                    jSONArray.add(jSONObject2);
                }
            }
            jSONObject.put("list", (Object) jSONArray);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo153467b(String str, int i) {
        Log.m165379d("ComposeWebView", "updateImageUploadingProgress uuid: " + str + ", progress:" + i);
        mo153460a("setDriveImgProgress", C43819s.m173693c(str), Integer.toString(i));
    }

    /* renamed from: a */
    public void mo153441a(int i, boolean z) {
        AbstractC42791e eVar;
        this.f108788S = z;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int a = C43785p.m173530a(i) + iArr[1] + getCurrentFontHeight() + C43785p.m173530a(8);
        int i2 = this.f108787R;
        if (i2 == 0) {
            this.f108786Q = (DeviceUtils.getScreenHeight(getContext()) - a) - this.f108789T;
        } else {
            this.f108786Q = i2 - a;
        }
        int i3 = this.f108786Q;
        if (i3 < 0 && (eVar = this.f108785P) != null) {
            eVar.onSelectionChange(-i3, z);
        }
    }

    /* renamed from: a */
    public void mo153442a(Context context, PermissionCode permissionCode) {
        if (PermissionCode.VIEW == permissionCode) {
            ((C42815b) aj.m5366a((FragmentActivity) context).mo6005a(C42815b.class)).hideToolbar();
        }
        C42760e eVar = this.f108782M;
        if (eVar != null) {
            eVar.mo153561a(permissionCode);
        }
    }

    /* renamed from: a */
    public void mo153443a(LifecycleOwner lifecycleOwner, final C42751a aVar) {
        Log.m165389i("ComposeWebView", "renderNormalDraft");
        if (aVar == null) {
            Log.m165383e("ComposeWebView", "renderNormalDraft null");
            return;
        }
        C1177w<Boolean> wVar = this.f108794d;
        if (wVar == null || !wVar.mo5927b().booleanValue()) {
            this.f108794d.mo5923a(lifecycleOwner, new AbstractC1178x<Boolean>() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.ComposeWebView.AnonymousClass24 */

                /* renamed from: a */
                public void onChanged(Boolean bool) {
                    if (bool != null && bool.booleanValue()) {
                        ComposeWebView.this.mo153447a(aVar);
                        ComposeWebView.this.f108794d.mo5928b(this);
                    }
                }
            });
        } else {
            mo153447a(aVar);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo22336b();
    }

    /* renamed from: a */
    private void m170398a(JSONObject jSONObject, DomainSettings.Alias alias, String str) {
        List<String> a = C41816b.m166115a().mo150121a(alias);
        if (CollectionUtils.isEmpty(a)) {
            Log.m165383e("ComposeWebView", "setupDomainInfo empty domain data");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.addAll(a);
        jSONObject.put(str, (Object) jSONArray);
    }
}
