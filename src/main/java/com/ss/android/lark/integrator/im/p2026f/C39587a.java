package com.ss.android.lark.integrator.im.p2026f;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.biz.core.api.AppConfig;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.WSConnState;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.core.api.p1404d.AbstractC29555b;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.api.AbstractC32810b;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.chatwindow.secretchat.data.decrypt.SecretContentResolver;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.ding.C36618a;
import com.ss.android.lark.ding.dependency.IDingModuleDependency;
import com.ss.android.lark.ding.dto.C36637b;
import com.ss.android.lark.ding.dto.C36638c;
import com.ss.android.lark.ding.p1803a.AbstractC36619a;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.feed.p1871b.C38068c;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import com.ss.android.lark.integrator.im.p2029i.C39640a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.f.a */
public class C39587a {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.integrator.im.f.a$a */
    public static class C39602a {

        /* renamed from: a */
        public static final IDingModuleDependency f101077a = C39587a.m157081a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C36618a m157080a() {
        return new C36618a(C39602a.f101077a);
    }

    /* renamed from: a */
    public static IDingModuleDependency m157081a(final Context context) {
        return new IDingModuleDependency() {
            /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881 */

            /* renamed from: a */
            public final Map<AbstractC36619a, WSConnState.AbstractC29537a> f101049a = new ConcurrentHashMap();

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: c */
            public int mo135098c() {
                return R.mipmap.feishu;
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: a */
            public Context mo135096a() {
                return context;
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: r */
            public void mo135113r() {
                C38068c.m149767a();
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: d */
            public IDingModuleDependency.AbstractC36635l mo135099d() {
                return new IDingModuleDependency.AbstractC36635l() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395891 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36635l
                    /* renamed from: a */
                    public void mo135164a(final AbstractC36619a aVar) {
                        C395901 r0 = new WSConnState.AbstractC29537a() {
                            /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395891.C395901 */

                            @Override // com.ss.android.lark.biz.core.api.WSConnState.AbstractC29537a
                            /* renamed from: a */
                            public void mo102563a(WSConnState.ConnState connState) {
                                boolean z;
                                AbstractC36619a aVar = aVar;
                                if (connState == null || connState != WSConnState.ConnState.Connected) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                aVar.mo135093a(z);
                            }
                        };
                        C395881.this.f101049a.put(aVar, r0);
                        C39603g.m157159a().getCoreDependency().mo143464a(r0);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36635l
                    /* renamed from: b */
                    public void mo135165b(AbstractC36619a aVar) {
                        WSConnState.AbstractC29537a aVar2 = C395881.this.f101049a.get(aVar);
                        if (aVar2 != null) {
                            C395881.this.f101049a.remove(aVar);
                            C39603g.m157159a().getCoreDependency().mo143534b(aVar2);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: e */
            public IDingModuleDependency.AbstractC36630g mo135100e() {
                return new IDingModuleDependency.AbstractC36630g() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395986 */

                    /* renamed from: b */
                    private final AbstractC29551a f101073b = C39603g.m157159a().getCoreDependency().mo143614t();

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36630g
                    /* renamed from: a */
                    public boolean mo135153a() {
                        return this.f101073b.mo105664e();
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: f */
            public IDingModuleDependency.ISettingDependency mo135101f() {
                return new IDingModuleDependency.ISettingDependency() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395997 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.ISettingDependency
                    /* renamed from: a */
                    public int mo135114a() {
                        return C39603g.m157159a().getCoreDependency().mo143579e().mo105510a().getNumber();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.ISettingDependency
                    /* renamed from: a */
                    public void mo135115a(IGetDataCallback<List<String>> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143532b(iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.ISettingDependency
                    /* renamed from: b */
                    public boolean mo135118b(boolean z) {
                        return C39603g.m157159a().getCoreDependency().mo143503a(z);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.ISettingDependency
                    /* renamed from: a */
                    public void mo135116a(boolean z) {
                        C39603g.m157159a().getCoreDependency().mo143554b(z);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.ISettingDependency
                    /* renamed from: a */
                    public boolean mo135117a(long j) {
                        return C39603g.m157159a().getCoreDependency().mo143499a(j);
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: g */
            public IDingModuleDependency.AbstractC36631h mo135102g() {
                return new IDingModuleDependency.AbstractC36631h() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C396008 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36631h
                    /* renamed from: a */
                    public String mo135154a() {
                        return C39603g.m157159a().getPassportDependency().mo143668b();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36631h
                    /* renamed from: b */
                    public boolean mo135155b() {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172430k();
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: h */
            public IDingModuleDependency.AbstractC36629f mo135103h() {
                return new IDingModuleDependency.AbstractC36629f() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C396019 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36629f
                    /* renamed from: a */
                    public void mo135152a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36629f
                    /* renamed from: a */
                    public void mo135151a(Context context, ImageView imageView, String str, int i, int i2, Drawable drawable, Drawable drawable2) {
                        C39603g.m157159a().getCoreDependency().mo143424a(context, imageView, str, new LoadParams().mo105413a(i).mo105422b(i2).mo105414a(drawable2).mo105423b(drawable));
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: i */
            public IDingModuleDependency.AbstractC36625c mo135104i() {
                return new IDingModuleDependency.AbstractC36625c() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.AnonymousClass10 */

                    /* renamed from: b */
                    private final C29407b f101055b = AbstractC39484a.m156004a();

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public void mo135134a(Context context, String str, int i, int i2) {
                        this.f101055b.mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105930b(i).mo105920a(i2).mo105923a(ChatBundle.SourceType.CARD).mo105933c("notification").mo105929a());
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public void mo135135a(final String str, final IGetDataCallback<Chatter> iGetDataCallback) {
                        this.f101055b.mo104256g().mo121210b(new ArrayList(Collections.singleton(str)), new IGetDataCallback<Map<String, Chatter>>() {
                            /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.AnonymousClass10.C395911 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(Map<String, Chatter> map) {
                                IGetDataCallback iGetDataCallback;
                                if (map != null && map.containsKey(str) && (iGetDataCallback = iGetDataCallback) != null) {
                                    iGetDataCallback.onSuccess(map.get(str));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public void mo135136a(final List<String> list, final IGetDataCallback<List<Chatter>> iGetDataCallback) {
                        this.f101055b.mo104256g().mo121200a(list, new IGetDataCallback<Map<String, Chatter>>() {
                            /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.AnonymousClass10.C395922 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(Map<String, Chatter> map) {
                                ArrayList arrayList = new ArrayList();
                                if (map != null) {
                                    for (String str : list) {
                                        Chatter chatter = map.get(str);
                                        if (chatter != null) {
                                            arrayList.add(chatter);
                                        }
                                    }
                                }
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(arrayList);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public IChatParser mo135124a() {
                        return this.f101055b.mo104275z();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: b */
                    public AbstractC32810b mo135137b() {
                        return this.f101055b.mo104178B();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: c */
                    public void mo135142c() {
                        AbstractC39484a.m156004a().mo104191S();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: d */
                    public void mo135143d(String str) {
                        AbstractC39484a.m156004a().mo104249c(str);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public MessageInfo mo135125a(String str) {
                        return this.f101055b.mo104258i().mo121106b(str);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: b */
                    public Chat mo135138b(String str) {
                        return this.f101055b.mo104251d().mo121056e(str);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: c */
                    public Chatter mo135141c(String str) {
                        return this.f101055b.mo104256g().mo121203b(str);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public C36637b mo135126a(MergeForwardContent mergeForwardContent) {
                        C29597a a = this.f101055b.mo104247c().mo121388a(mergeForwardContent);
                        if (a == null) {
                            return null;
                        }
                        return new C36637b(a.f74159a, a.f74160b);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: b */
                    public Map<String, Chat> mo135140b(List<String> list) {
                        return this.f101055b.mo104251d().mo121033b(list);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public Image mo135127a(ImageContent imageContent) {
                        return AbstractC39484a.m156004a().mo104197a(imageContent);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public CharSequence mo135129a(Message message) {
                        Content b = SecretContentResolver.m131240a().mo123955b(message);
                        if (b instanceof TextContent) {
                            return C59035h.m229202a(((TextContent) b).getRichText(), false, true, true, true);
                        }
                        return "";
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public String mo135131a(Chatter chatter) {
                        return this.f101055b.mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NICKNAME_ALIAS_NAME);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public Map<String, Message> mo135133a(List<String> list) {
                        return this.f101055b.mo104258i().mo121083a(list);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: b */
                    public C36638c mo135139b(Context context, Message message) {
                        if (context == null || message == null) {
                            return null;
                        }
                        PostContent postContent = (PostContent) message.getContent();
                        return new C36638c(postContent.getTitleWithFilter(context), C59035h.m229202a(postContent.getRichText(), false, true, true, true));
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public String mo135130a(Context context, Message message) {
                        if (message == null) {
                            return null;
                        }
                        return ((AudioContent) message.getContent()).formatDuration(context);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public String mo135132a(Chatter chatter, boolean z) {
                        return AbstractC39484a.m156004a().mo104264o().mo121391a(chatter, z);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36625c
                    /* renamed from: a */
                    public CharSequence mo135128a(Context context, Message message, int i) {
                        Map<String, Doc> map;
                        CharSequence a = this.f101055b.mo104264o().mo121390a(context, message, false, i);
                        Content content = message.getContent();
                        if (content instanceof TextContent) {
                            map = ((TextContent) content).getDocEntityMap();
                        } else if (content instanceof PostContent) {
                            map = ((PostContent) content).getDocEntityMap();
                        } else {
                            map = null;
                        }
                        if (!CollectionUtils.isEmpty(map)) {
                            for (Doc doc : map.values()) {
                                a = a.toString().replace(doc.getUrl(), UIHelper.mustacheFormat((int) R.string.Lark_Chat_HideDocsURL, "doctitle", doc.getName()));
                            }
                        }
                        return a;
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: j */
            public IDingModuleDependency.AbstractC36634k mo135105j() {
                return new IDingModuleDependency.AbstractC36634k() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.AnonymousClass11 */

                    /* renamed from: d */
                    private String m157125d(int i) {
                        return i != 3 ? "normal_v2" : "ding_v2";
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36634k
                    /* renamed from: b */
                    public boolean mo135162b(int i) {
                        return C39603g.m157159a().getCoreDependency().mo143578d(m157125d(i));
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36634k
                    /* renamed from: c */
                    public String mo135163c(int i) {
                        return C39603g.m157159a().getCoreDependency().mo143580e(m157125d(i));
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36634k
                    /* renamed from: a */
                    public boolean mo135161a(int i) {
                        return C39603g.m157159a().getCoreDependency().mo143571c(m157125d(i));
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36634k
                    /* renamed from: a */
                    public PendingIntent mo135159a(Message message, boolean z, boolean z2) {
                        return C39603g.m157159a().getCoreDependency().mo143401a(message, z, z2);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36634k
                    /* renamed from: a */
                    public void mo135160a(String str, String str2, String str3, String str4) {
                        C39603g.m157159a().getCoreDependency().mo143493a(str, str2, System.currentTimeMillis(), str3, str4);
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: k */
            public IDingModuleDependency.AbstractC36632i mo135106k() {
                return new IDingModuleDependency.AbstractC36632i() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.AnonymousClass12 */

                    /* renamed from: a */
                    final AbstractC29555b f101063a = C39603g.m157159a().getCoreDependency().mo143386L();

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36632i
                    /* renamed from: a */
                    public String mo135157a() {
                        return this.f101063a.mo105699a();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36632i
                    /* renamed from: a */
                    public Intent mo135156a(Context context, String str, Bundle bundle) {
                        return this.f101063a.mo105698a(context, str, bundle);
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: l */
            public IDingModuleDependency.AbstractC36633j mo135107l() {
                return new IDingModuleDependency.AbstractC36633j() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.AnonymousClass13 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36633j
                    /* renamed from: a */
                    public void mo135158a(IGetDataCallback iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143583e(iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: m */
            public IDingModuleDependency.AbstractC36628e mo135108m() {
                return new IDingModuleDependency.AbstractC36628e() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395932 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36628e
                    /* renamed from: a */
                    public String mo135149a() {
                        return "switch_to_inbox";
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36628e
                    /* renamed from: b */
                    public String mo135150b() {
                        return C39640a.m157299a().mo136983g().mo137459h();
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: n */
            public IDingModuleDependency.AbstractC36623a mo135109n() {
                return new IDingModuleDependency.AbstractC36623a() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395943 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36623a
                    /* renamed from: a */
                    public boolean mo135119a(String str, boolean z) {
                        AppConfig.FeatureConfig g = C39603g.m157159a().getCoreDependency().mo143587g(str);
                        if (g == null) {
                            return z;
                        }
                        return g.isOn();
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: p */
            public IDingModuleDependency.AbstractC36626d mo135111p() {
                return new IDingModuleDependency.AbstractC36626d() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395954 */

                    /* renamed from: a */
                    private IInitBuilder.IDialogBuilder.IDialogCallback m157137a(final IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar) {
                        return new IInitBuilder.IDialogBuilder.IDialogCallback() {
                            /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395954.C395961 */

                            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                            /* renamed from: a */
                            public void mo105556a() {
                                IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo135146a();
                                }
                            }

                            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                            /* renamed from: b */
                            public void mo105558b() {
                                IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo135148b();
                                }
                            }

                            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                            /* renamed from: a */
                            public void mo105557a(boolean z, String str) {
                                IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo135147a(z, str);
                                }
                            }
                        };
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36626d
                    /* renamed from: a */
                    public void mo135144a(Context context, String str, String str2, String str3, IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar) {
                        C39603g.m157159a().getCoreDependency().mo143525b(context, new IInitBuilder(str, str2, str3, aVar) {
                            /* class com.ss.android.lark.integrator.im.p2026f.$$Lambda$a$1$4$kFHdLpihdXuUqZI93Yp1byXNKK4 */
                            public final /* synthetic */ String f$1;
                            public final /* synthetic */ String f$2;
                            public final /* synthetic */ String f$3;
                            public final /* synthetic */ IDingModuleDependency.AbstractC36626d.AbstractC36627a f$4;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                            }

                            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                            public final void init(IInitBuilder.IDialogBuilder cVar) {
                                C39587a.C395881.C395954.this.m157138a((C39587a.C395881.C395954) this.f$1, this.f$2, this.f$3, (String) this.f$4, (IDingModuleDependency.AbstractC36626d.AbstractC36627a) ((IInitBuilder.IBlockTipBuilder) cVar));
                            }
                        });
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m157138a(String str, String str2, String str3, IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar, IInitBuilder.IBlockTipBuilder bVar) {
                        IInitBuilder.IBlockTipBuilder bVar2 = (IInitBuilder.IBlockTipBuilder) ((IInitBuilder.IBlockTipBuilder) ((IInitBuilder.IBlockTipBuilder) ((IInitBuilder.IBlockTipBuilder) ((IInitBuilder.IBlockTipBuilder) bVar.mo105552a(str)).mo105553b(str2)).mo105554c(str3)).mo105555d("buzz_confirm")).mo105551a(m157137a(aVar));
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public /* synthetic */ void m157139a(List list, String str, String str2, String str3, IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar, C36516a aVar2, int i, IInitBuilder.IApplyCollabDialogBuilder aVar3) {
                        ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar3.mo105550a(list).mo105552a(str)).mo105553b(str2)).mo105554c(str3)).mo105555d("buzz_confirm")).mo105551a(m157137a(aVar))).mo105549a(aVar2).mo105546a(i);
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36626d
                    /* renamed from: a */
                    public void mo135145a(Context context, String str, String str2, String str3, String str4, List<Contact> list, IDingModuleDependency.AbstractC36626d.AbstractC36627a aVar, int i, C36516a<?> aVar2) {
                        C39603g.m157159a().getCoreDependency().mo143427a(context, new IInitBuilder(list, str, str2, str3, aVar, aVar2, i) {
                            /* class com.ss.android.lark.integrator.im.p2026f.$$Lambda$a$1$4$n6v9uXPJnAdDhgnqtWLXmjga6U */
                            public final /* synthetic */ List f$1;
                            public final /* synthetic */ String f$2;
                            public final /* synthetic */ String f$3;
                            public final /* synthetic */ String f$4;
                            public final /* synthetic */ IDingModuleDependency.AbstractC36626d.AbstractC36627a f$5;
                            public final /* synthetic */ C36516a f$6;
                            public final /* synthetic */ int f$7;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                                this.f$3 = r4;
                                this.f$4 = r5;
                                this.f$5 = r6;
                                this.f$6 = r7;
                                this.f$7 = r8;
                            }

                            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                            public final void init(IInitBuilder.IDialogBuilder cVar) {
                                C39587a.C395881.C395954.this.m157139a(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, (IInitBuilder.IApplyCollabDialogBuilder) cVar);
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: q */
            public IDingModuleDependency.AbstractC36624b mo135112q() {
                return new IDingModuleDependency.AbstractC36624b() {
                    /* class com.ss.android.lark.integrator.im.p2026f.C39587a.C395881.C395975 */

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36624b
                    /* renamed from: a */
                    public int mo135120a() {
                        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104075c();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36624b
                    /* renamed from: b */
                    public int mo135122b() {
                        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104077d();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36624b
                    /* renamed from: c */
                    public String mo135123c() {
                        return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104073b();
                    }

                    @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency.AbstractC36624b
                    /* renamed from: a */
                    public void mo135121a(Context context, String str, DialogInterface.OnDismissListener onDismissListener) {
                        if (context == null) {
                            context = LarkContext.getApplication();
                        }
                        AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, onDismissListener);
                    }
                };
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: b */
            public boolean mo135097b() {
                return C29410a.m108289c().mo104288b();
            }

            @Override // com.ss.android.lark.ding.dependency.IDingModuleDependency
            /* renamed from: o */
            public boolean mo135110o() {
                return C39603g.m157159a().getPassportDependency().mo143675f();
            }
        };
    }
}
