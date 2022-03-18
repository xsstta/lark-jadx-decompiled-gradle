package com.ss.android.lark.mail.impl.compose.mention;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.BaseWebPlugin;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.jsbridge.AbstractC7948j;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.lark.pb.email.client.v1.Address;
import com.bytedance.lark.pb.email.client.v1.SearchMemberInfo;
import com.bytedance.lark.pb.email.client.v1.SearchMemberType;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.compose.mention.C42021a;
import com.ss.android.lark.mail.impl.compose.mention.C42026b;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.utils.C43779n;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.recipient.C43800a;
import com.ss.android.lark.mail.impl.utils.recipient.SearchAddress;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import java.util.List;

public class MentionPlugin extends BaseWebPlugin<C4933k> {
    private final String TAG = "MentionPlugin";
    public AbstractC42020a callback;
    public Context composeContext;
    public C42021a fragment = new C42021a();
    public C42026b handler;
    private AbstractC10550f keyboardHeightProvider;
    public C43909a loadingToast;
    public boolean needAddRecipient = C43779n.m173508a(C43277a.m171921a().mo154946j()).getBoolean("mailsdk.mobile.account.lark", false);
    public final boolean needAddRecipientFG = C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.mention.addto");

    /* renamed from: com.ss.android.lark.mail.impl.compose.mention.MentionPlugin$a */
    public interface AbstractC42020a {
        /* renamed from: a */
        void mo151031a();

        /* renamed from: a */
        void mo151032a(int i);

        /* renamed from: a */
        void mo151033a(SearchAddress searchAddress);

        /* renamed from: b */
        void mo151034b(SearchAddress searchAddress);
    }

    public void processFail() {
        MailToast.m173697a((int) R.string.Mail_Normal_Failed);
    }

    private void initView() {
        this.fragment.mo151037a(new C42021a.AbstractC42025a() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420112 */

            @Override // com.ss.android.lark.mail.impl.compose.mention.C42021a.AbstractC42025a
            /* renamed from: a */
            public void mo151020a() {
                MentionPlugin.this.endMention();
            }

            @Override // com.ss.android.lark.mail.impl.compose.mention.C42021a.AbstractC42025a
            /* renamed from: a */
            public void mo151021a(SearchMemberInfo searchMemberInfo) {
                Log.m165389i("MentionPlugin", "onMentionCandidateSelected");
                if (searchMemberInfo == null) {
                    Log.m165383e("MentionPlugin", "onMentionCandidateSelected empty data");
                    return;
                }
                MentionPlugin.this.insertMentionedUser(searchMemberInfo);
                MentionPlugin.this.getUIContainer().mo19597c(MentionPlugin.this);
            }

            @Override // com.ss.android.lark.mail.impl.compose.mention.C42021a.AbstractC42025a
            /* renamed from: a */
            public void mo151022a(boolean z) {
                Log.m165389i("MentionPlugin", "onAddRecipientChanged:" + z);
                MentionPlugin.this.needAddRecipient = z;
                C43779n.m173508a(C43277a.m171921a().mo154946j()).putBoolean("mailsdk.mobile.account.lark", z);
            }
        });
    }

    public void release() {
        this.handler = null;
        this.fragment = null;
        this.callback = null;
        this.keyboardHeightProvider = null;
    }

    public void endMention() {
        Log.m165389i("MentionPlugin", "BIZ_MENTION_END");
        C42021a aVar = this.fragment;
        if (aVar != null) {
            aVar.mo151035a();
        }
        C43849u.m173827a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AnonymousClass12 */

            public void run() {
                MentionPlugin.this.getUIContainer().mo19597c(MentionPlugin.this);
            }
        }, 200);
        AbstractC42020a aVar2 = this.callback;
        if (aVar2 != null) {
            aVar2.mo151031a();
        }
    }

    private void initJSHandlers() {
        bindJSHandlerAutoUnbind("biz.core.atUser.active", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420166 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("MentionPlugin", "BIZ_MENTION_START");
                if (!(MentionPlugin.this.fragment == null || MentionPlugin.this.handler == null)) {
                    AbstractC4958n uIContainer = MentionPlugin.this.getUIContainer();
                    MentionPlugin mentionPlugin = MentionPlugin.this;
                    uIContainer.mo19589a(mentionPlugin, mentionPlugin.fragment);
                    MentionPlugin.this.handler.mo151042a("");
                }
                if (MentionPlugin.this.callback != null) {
                    int i = 0;
                    try {
                        i = JSONObject.parseObject(str).getIntValue("top");
                    } catch (Exception e) {
                        Log.m165384e("MentionPlugin", "BIZ_MENTION_START", e);
                    }
                    MentionPlugin.this.callback.mo151032a(i);
                }
            }
        });
        bindJSHandlerAutoUnbind("biz.core.atUser.deactive", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420177 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                MentionPlugin.this.endMention();
            }
        });
        bindJSHandlerAutoUnbind("biz.core.atUser.search", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420188 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("MentionPlugin", "BIZ_MENTION_SEARCH");
                try {
                    MentionPlugin.this.handler.mo151042a(JSONObject.parseObject(str).getString("text"));
                } catch (Exception e) {
                    Log.m165384e("MentionPlugin", "BIZ_MENTION_SEARCH", e);
                }
            }
        });
        bindJSHandlerAutoUnbind("biz.core.atUser.click", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420199 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("MentionPlugin", "BIZ_MENTION_CLICK");
                try {
                    JSONObject parseObject = JSONObject.parseObject(str);
                    String string = parseObject.getString("userId");
                    String string2 = parseObject.getString("address");
                    String string3 = parseObject.getString("username");
                    if (!TextUtils.isEmpty(string)) {
                        Log.m165389i("MentionPlugin", "BIZ_MENTION_CLICK user id");
                        C41816b.m166115a().mo150157x().mo150164a(C41816b.m166115a().mo150137d(), string, string2, string3);
                    } else if (!TextUtils.isEmpty(string2)) {
                        Log.m165389i("MentionPlugin", "BIZ_MENTION_CLICK address");
                        MentionPlugin.this.searchAddressAndOpenProfile(string2, string3);
                    } else {
                        Log.m165383e("MentionPlugin", "BIZ_MENTION_CLICK invalid data");
                    }
                } catch (Exception e) {
                    Log.m165384e("MentionPlugin", "BIZ_MENTION_CLICK", e);
                }
            }
        });
        bindJSHandlerAutoUnbind("biz.core.atUser.add", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AnonymousClass10 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("MentionPlugin", "BIZ_MENTION_ADD_USER");
                if ((!MentionPlugin.this.needAddRecipientFG || MentionPlugin.this.needAddRecipient) && MentionPlugin.this.callback != null) {
                    try {
                        MentionPlugin.this.callback.mo151033a(SearchAddress.m173620a(JSON.parseObject(JSON.parseObject(str).getString("user"))));
                    } catch (Exception e) {
                        Log.m165384e("MentionPlugin", "BIZ_MENTION_ADD_USER", e);
                    }
                }
                if (MentionPlugin.this.needAddRecipientFG) {
                    C42330c.m169073c(MentionPlugin.this.needAddRecipient);
                }
            }
        });
        bindJSHandlerAutoUnbind("biz.core.atUser.remove", new AbstractC7948j<String>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.AnonymousClass11 */

            /* renamed from: a */
            public void handle(String str, AbstractC7947h hVar) {
                Log.m165389i("MentionPlugin", "BIZ_MENTION_REMOVE_USER");
                if (MentionPlugin.this.callback != null) {
                    try {
                        SearchAddress.C43799a aVar = new SearchAddress.C43799a();
                        aVar.mo151212b(JSON.parseObject(str).getString("address"));
                        MentionPlugin.this.callback.mo151034b(aVar.mo151210a());
                    } catch (Exception e) {
                        Log.m165384e("MentionPlugin", "BIZ_MENTION_REMOVE_USER", e);
                    }
                }
            }
        });
    }

    public void setCallback(AbstractC42020a aVar) {
        this.callback = aVar;
    }

    public void insertMentionedUser(SearchMemberInfo searchMemberInfo) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("address", searchMemberInfo.email_address);
        jSONObject.put("username", searchMemberInfo.name);
        jSONObject.put("userId", searchMemberInfo.user_id);
        JSONObject jSONObject2 = new JSONObject();
        if (searchMemberInfo.member_type == SearchMemberType.MEMBER_GROUP) {
            jSONObject2.put("userType", (Object) Integer.valueOf(Address.LarkEntityType.GROUP.getValue()));
            jSONObject2.put("groupType", (Object) Address.DEFAULT_MAIL_GROUP_TYPE);
        } else {
            jSONObject2.put("userType", (Object) Integer.valueOf(Address.LarkEntityType.USER.getValue()));
        }
        jSONObject2.put("tenantId", (Object) C41816b.m166115a().mo150137d());
        jSONObject2.put("department", (Object) searchMemberInfo.department);
        jSONObject2.put("avatarKey", (Object) searchMemberInfo.avatar_key);
        jSONObject.put("extra", (Object) jSONObject2);
        execJS("window.command.insertAtBlock", jSONObject);
    }

    public void onAttachToUIContainer(C4933k kVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) kVar, nVar);
        if (nVar != null) {
            this.composeContext = nVar.mo19593b();
        }
        AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
        this.keyboardHeightProvider = b;
        b.mo39924a(new AbstractC10549e() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420101 */

            @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
            public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
                if (i == 0 && MentionPlugin.this.getUIContainer() != null) {
                    Log.m165389i("MentionPlugin", "onKeyboardHeightChanged 0 dismiss mention list");
                    MentionPlugin.this.getUIContainer().mo19597c(MentionPlugin.this);
                }
            }
        });
        this.handler = new C42026b(new C42026b.AbstractC42028a() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420145 */

            @Override // com.ss.android.lark.mail.impl.compose.mention.C42026b.AbstractC42028a
            /* renamed from: a */
            public void mo151025a(final List<SearchMemberInfo> list) {
                Log.m165389i("MentionPlugin", "onMentionContactListFetched");
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420145.RunnableC420151 */

                    public void run() {
                        if (MentionPlugin.this.fragment != null) {
                            MentionPlugin.this.fragment.mo151038a(list, MentionPlugin.this.needAddRecipient);
                        }
                    }
                });
            }
        });
        initJSHandlers();
        initView();
    }

    public void searchAddressAndOpenProfile(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.m165383e("MentionPlugin", "searchAddressAndOpenProfile empty address or name");
            return;
        }
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.RunnableC420123 */

            public void run() {
                if (MentionPlugin.this.composeContext == null) {
                    Log.m165383e("MentionPlugin", "searchAddressAndOpenProfile invalid context");
                    return;
                }
                if (MentionPlugin.this.loadingToast == null) {
                    MentionPlugin mentionPlugin = MentionPlugin.this;
                    mentionPlugin.loadingToast = new C43909a(mentionPlugin.composeContext);
                }
                MentionPlugin.this.loadingToast.mo156327a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
            }
        });
        C43800a.m173635a().mo156044a(str, str2, new AbstractC41870b<MailAddress>() {
            /* class com.ss.android.lark.mail.impl.compose.mention.MentionPlugin.C420134 */

            @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
            /* renamed from: a */
            public void mo150434a(ErrorResult errorResult) {
                Log.m165389i("MentionPlugin", "searchAddressAndOpenProfile onError");
                if (MentionPlugin.this.loadingToast != null) {
                    MentionPlugin.this.loadingToast.mo156326a();
                }
                MentionPlugin.this.processFail();
            }

            /* renamed from: a */
            public void mo150435a(MailAddress mailAddress) {
                if (MentionPlugin.this.loadingToast != null) {
                    MentionPlugin.this.loadingToast.mo156326a();
                }
                if (mailAddress == null || TextUtils.isEmpty(mailAddress.mo151189j())) {
                    Log.m165397w("MentionPlugin", "searchAddressAndOpenProfile onSuccess no user ID");
                    MentionPlugin.this.processFail();
                    return;
                }
                C41816b.m166115a().mo150157x().mo150164a(mailAddress.mo151196q(), mailAddress.mo151189j(), mailAddress.mo151182e(), mailAddress.mo151176a());
            }
        });
    }
}
