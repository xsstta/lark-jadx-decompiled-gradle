package com.ss.android.lark.integrator.im.p2038p;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.C29604ae;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.LocationInfo;
import com.ss.android.lark.biz.im.api.p1408a.C29597a;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.C33982a;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.entity.message.content.MediaContent;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.p1665e.AbstractC33988a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.image.transform.CropTransformation;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import com.ss.android.lark.integrator.im.p2035m.C39715a;
import com.ss.android.lark.integrator.im.p2035m.C39718b;
import com.ss.android.lark.integrator.im.p2037o.C39742a;
import com.ss.android.lark.integrator.im.p2038p.C39748a;
import com.ss.android.lark.integrator.im.p2040r.C39766a;
import com.ss.android.lark.listener.DefaultChatRelationPushListener;
import com.ss.android.lark.message.card.p2262b.C45292a;
import com.ss.android.lark.message.card.p2262b.C45293b;
import com.ss.android.lark.message.service.AbstractC45376a;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.dto.C51487b;
import com.ss.android.lark.pin.dto.C51488f;
import com.ss.android.lark.pin.dto.ChatPinMessageEntity;
import com.ss.android.lark.pin.dto.SearchResult;
import com.ss.android.lark.pin.dto.SearchResultInfo;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.sticker.dto.StickerSetInfo;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.richtext.RichTextView;
import com.ss.android.lark.widget.span.AbbreviationInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.im.p.a */
public class C39748a {

    /* renamed from: com.ss.android.lark.integrator.im.p.a$a */
    public static class C39762a {

        /* renamed from: a */
        public static final AbstractC51472a f101318a = C39748a.m157769a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static PinModule m157770a() {
        return new PinModule(C39762a.f101318a);
    }

    /* renamed from: a */
    public static AbstractC51472a m157769a(final Context context) {
        return new AbstractC51472a() {
            /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491 */

            /* renamed from: b */
            private final AbstractC29551a f101298b = C39603g.m157159a().getCoreDependency().mo143614t();

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: c */
            public AbstractC51472a.AbstractC51482i mo144028c() {
                return new AbstractC51472a.AbstractC51482i() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397501 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51482i
                    /* renamed from: b */
                    public void mo144044b(String str, String str2, AbstractC51472a.AbstractC51482i.AbstractC51483a aVar) {
                        AbstractC39484a.m156004a().mo104266q().mo126544a(str, str2);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51482i
                    /* renamed from: a */
                    public void mo144043a(String str, String str2, final AbstractC51472a.AbstractC51482i.AbstractC51483a aVar) {
                        AbstractC39484a.m156004a().mo104266q().mo126545a(str, str2, new DefaultChatRelationPushListener() {
                            /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397501.C397511 */

                            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
                            /* renamed from: a */
                            public void mo126573a(C29598aa aaVar) {
                                AbstractC51472a.AbstractC51482i.AbstractC51483a aVar = aVar;
                                if (aVar != null) {
                                    aVar.onPushMessage(aaVar.mo106644a());
                                }
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: d */
            public boolean mo144030d() {
                return this.f101298b.mo105664e();
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: f */
            public AbstractC51472a.AbstractC51480g mo144032f() {
                return new AbstractC51472a.AbstractC51480g() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397565 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51480g
                    /* renamed from: a */
                    public void mo144055a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51480g
                    /* renamed from: a */
                    public void mo144054a(Context context, ImageView imageView, Image image, String str, int i, int i2, Drawable drawable, Drawable drawable2, boolean z, boolean z2, CropTransformation cropTransformation) {
                        C39603g.m157159a().getCoreDependency().mo143424a(context, imageView, image.getKey(), new LoadParams().mo105413a(i).mo105422b(i2).mo105419a(str).mo105414a(drawable2).mo105423b(drawable).mo105431e(z2).mo105418a(cropTransformation).mo105416a(new ListenerParams.Builder().mo105401a(z).mo105405b(false).mo105396a(Biz.Messenger).mo105397a(Scene.Pin).mo105398a(ListenerParams.FromType.IMAGE).mo105404b(image.getKey()).mo105402a()));
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: g */
            public AbstractC51472a.AbstractC51478e mo144033g() {
                return new AbstractC51472a.AbstractC51478e() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397576 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51478e
                    /* renamed from: a */
                    public void mo144056a(Context context, String str, String str2, String str3, int i, String str4, String str5, IGetDataCallback<String> iGetDataCallback, AbstractC25974h hVar) {
                        C39603g.m157159a().getCoreDependency().mo143448a(context, str, str2, str3, i, str4, str5, iGetDataCallback, hVar);
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: h */
            public AbstractC51472a.AbstractC51486l mo144034h() {
                return new AbstractC51472a.AbstractC51486l() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397587 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51486l
                    /* renamed from: a */
                    public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo144057a(Context context, AbstractC33988a<T> aVar) {
                        return C39603g.m157159a().getCalendarDependency().mo143317b(context, aVar);
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: i */
            public AbstractC51472a.AbstractC51474b mo144035i() {
                return new AbstractC51472a.AbstractC51474b() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397598 */

                    /* renamed from: a */
                    final C29407b f101313a = AbstractC39484a.m156004a();

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144069a(Context context, Message message) {
                        this.f101313a.mo104208a(context, message);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144073a(Context context, String str, String str2) {
                        C57865c.m224574a(new C57865c.AbstractC57873d(str) {
                            /* class com.ss.android.lark.integrator.im.p2038p.$$Lambda$a$1$8$25pfFujNr_9kkWMDUBLCkY7v5rc */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                            public final Object produce() {
                                return C39748a.C397491.C397598.this.m157816e(this.f$1);
                            }
                        }, new C57865c.AbstractC57871b(context, str, str2) {
                            /* class com.ss.android.lark.integrator.im.p2038p.$$Lambda$a$1$8$HDWhxy_g83HgkaN7HjGHZCSm08Y */
                            public final /* synthetic */ Context f$0;
                            public final /* synthetic */ String f$1;
                            public final /* synthetic */ String f$2;

                            {
                                this.f$0 = r1;
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                            public final void consume(Object obj) {
                                C39748a.C397491.C397598.m157815a(this.f$0, this.f$1, this.f$2, (Chatter) obj);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144075a(RichText richText, final AbstractC51472a.AbstractC51474b.AbstractC51475a aVar) {
                        C39715a.m157675a().mo160036a(richText, new AbstractC45376a() {
                            /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397598.C397601 */

                            @Override // com.ss.android.lark.message.service.AbstractC45376a
                            /* renamed from: a */
                            public void mo144083a() {
                                AbstractC51472a.AbstractC51474b.AbstractC51475a aVar = aVar;
                                if (aVar != null) {
                                    aVar.mo177255a();
                                }
                            }

                            @Override // com.ss.android.lark.message.service.AbstractC45376a
                            /* renamed from: a */
                            public void mo144084a(C45293b bVar) {
                                C51488f fVar;
                                AbstractC51472a.AbstractC51474b.AbstractC51475a aVar = aVar;
                                if (aVar != null) {
                                    if (bVar != null) {
                                        fVar = new C51488f(bVar.mo160020a(), bVar.mo160024b(), bVar.mo160027c(), C397598.this.mo144065a(bVar.mo160028d()));
                                    } else {
                                        fVar = null;
                                    }
                                    aVar.mo177256a(fVar);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144071a(Context context, String str, int i, boolean z) {
                        this.f101313a.mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105920a(i).mo105930b(-1).mo105923a(ChatBundle.SourceType.SEARCH).mo105933c("all_pin").mo105941h(true).mo105935d("").mo105929a());
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144074a(Message message, boolean z) {
                        this.f101313a.mo104219a(message, z);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144068a(Context context, TextView textView, Message message) {
                        this.f101313a.mo104205a(context, textView, message);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144067a(Context context, View view, Message message) {
                        this.f101313a.mo104203a(context, view, message);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144070a(Context context, String str, int i) {
                        this.f101313a.mo104207a(context, new C29604ae.C29606a().mo106670b(str).mo106662a(i).mo106671b(true).mo106674d("all_pin").mo106679h(DesktopUtil.m144307b()).mo106668a());
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144072a(Context context, String str, Message message) {
                        this.f101313a.mo104209a(context, str, message);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144076a(RichTextView richTextView, boolean z) {
                        this.f101313a.mo104224a(richTextView, z);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144077a(boolean z) {
                        this.f101313a.mo104250c(z);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public boolean mo144078a() {
                        return this.f101313a.mo104190R();
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public Image mo144060a(ImageContent imageContent) {
                        return this.f101313a.mo104197a(imageContent);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: e */
                    public /* synthetic */ Chatter m157816e(String str) {
                        return this.f101313a.mo104256g().mo121203b(str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public Chatter mo144058a(String str) {
                        return this.f101313a.mo104256g().mo121211c(str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: b */
                    public Chat mo144079b(String str) {
                        return this.f101313a.mo104251d().mo120985a(str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: c */
                    public Chatter mo144081c(String str) {
                        return this.f101313a.mo104256g().mo121203b(str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: d */
                    public Chat mo144082d(String str) {
                        return this.f101313a.mo104251d().mo121056e(str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public Image mo144061a(MediaContent mediaContent) {
                        return this.f101313a.mo104198a(mediaContent);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public C51487b mo144062a(MergeForwardContent mergeForwardContent) {
                        C29597a a = this.f101313a.mo104247c().mo121388a(mergeForwardContent);
                        if (a != null) {
                            return new C51487b(a.f74159a, a.f74160b);
                        }
                        return null;
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public String mo144063a(Chatter chatter) {
                        return this.f101313a.mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NICKNAME_WITH_ALIAS);
                    }

                    /* renamed from: a */
                    public List<String> mo144065a(List<C45292a> list) {
                        ArrayList arrayList = new ArrayList();
                        for (C45292a aVar : list) {
                            arrayList.add(aVar.mo160015f() + ". " + aVar.mo160016g());
                        }
                        return arrayList;
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public C33982a mo144059a(C14928Entity entity, String str) {
                        return this.f101313a.mo104177A().getChatChatters(entity, str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: b */
                    public CharSequence mo144080b(Context context, Message message) {
                        return this.f101313a.mo104264o().mo121389a(context, message, 0);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public List<Message> mo144064a(C14928Entity entity, List<String> list) {
                        return this.f101313a.mo104178B().mo120946a(entity, list);
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public static /* synthetic */ void m157815a(Context context, String str, String str2, Chatter chatter) {
                        AbstractC29542ad E = C39603g.m157159a().getCoreDependency().mo143379E();
                        if (chatter == null || !chatter.isBot()) {
                            E.mo105573a(context, str, str2, new ContactSource.C29531a().mo104726a(2).mo104728a());
                        } else {
                            E.mo105585c(context, str);
                        }
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51474b
                    /* renamed from: a */
                    public void mo144066a(Activity activity, MergeForwardContent mergeForwardContent, int i, String str) {
                        this.f101313a.mo104202a(activity, mergeForwardContent, null, 2, -1, str);
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: j */
            public AbstractC51472a.AbstractC51477d mo144036j() {
                return new AbstractC51472a.AbstractC51477d() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397619 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51477d
                    /* renamed from: a */
                    public int mo144085a(int i, boolean z) {
                        if (z) {
                            return C39603g.m157159a().getCCMDependency().mo143302c(i);
                        }
                        return C39603g.m157159a().getCCMDependency().mo143297b(i);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51477d
                    /* renamed from: a */
                    public int mo144086a(DocType docType, String str) {
                        return C39603g.m157159a().getCCMDependency().mo143288a(docType.getNumber(), str);
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: k */
            public AbstractC51472a.AbstractC51484j mo144037k() {
                return new AbstractC51472a.AbstractC51484j() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.AnonymousClass10 */

                    /* renamed from: a */
                    private Message m157801a(SearchMessageInfo searchMessageInfo) {
                        Message message = new Message();
                        message.setId(searchMessageInfo.getId());
                        message.setChatId(searchMessageInfo.getChatId());
                        message.setThreadId(searchMessageInfo.getThreadId());
                        message.setType(searchMessageInfo.getMsgType());
                        message.setUpdateTime(searchMessageInfo.getUpdateTime());
                        message.setPosition(searchMessageInfo.getPosition());
                        message.setThreadPosition(searchMessageInfo.getMessageThreadPosition());
                        message.setFromId(searchMessageInfo.getFromId());
                        return message;
                    }

                    /* renamed from: a */
                    public ChatPinMessageEntity mo144045a(SearchResponse searchResponse) {
                        ArrayList arrayList = new ArrayList(searchResponse.getTotal());
                        for (SearchBaseInfo searchBaseInfo : searchResponse.getInfoList()) {
                            if (searchBaseInfo instanceof SearchMessageInfo) {
                                SearchMessageInfo searchMessageInfo = (SearchMessageInfo) searchBaseInfo;
                                SearchResult cVar = new SearchResult(searchMessageInfo.getId());
                                cVar.mo177266a(searchMessageInfo.getTitle());
                                cVar.mo177270b(searchMessageInfo.getSubTitle());
                                cVar.mo177267a(searchMessageInfo.getTitleHitTerms());
                                cVar.mo177271b(searchMessageInfo.getSubTitleHitTerms());
                                cVar.mo177274c(searchMessageInfo.getFromName());
                                cVar.mo177277d(searchMessageInfo.getFromAvatarKey());
                                cVar.mo177279e(searchMessageInfo.getFromId());
                                if (searchMessageInfo.getMessageDocInfoList() != null) {
                                    cVar.mo177275c(searchMessageInfo.getMessageDocInfoList());
                                }
                                arrayList.add(new SearchResultInfo(cVar, m157801a(searchMessageInfo)));
                            }
                        }
                        ChatPinMessageEntity aVar = new ChatPinMessageEntity(arrayList, searchResponse.isHasMore(), arrayList.size(), -1);
                        aVar.mo177259a(searchResponse.getQuery());
                        return aVar;
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51484j
                    /* renamed from: a */
                    public void mo144046a(String str, String str2, long j, String str3, int i, final IGetDataCallback<ChatPinMessageEntity> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143492a(str, str2, j, str3, i, new IGetDataCallback<SearchResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.AnonymousClass10.C397521 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(SearchResponse searchResponse) {
                                iGetDataCallback.onSuccess(AnonymousClass10.this.mo144045a(searchResponse));
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: l */
            public AbstractC51472a.AbstractC51479f mo144038l() {
                return new AbstractC51472a.AbstractC51479f() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.AnonymousClass11 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51479f
                    /* renamed from: a */
                    public boolean mo144049a(String str) {
                        return C39603g.m157159a().getCoreDependency().mo143559b(str);
                    }

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51479f
                    /* renamed from: a */
                    public void mo144048a(String str, boolean z) {
                        C39603g.m157159a().getCoreDependency().mo143501a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: m */
            public AbstractC51472a.AbstractC51485k mo144039m() {
                return new AbstractC51472a.AbstractC51485k() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.AnonymousClass12 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51485k
                    /* renamed from: a */
                    public void mo144050a(Context context, Message message) {
                        if (message != null) {
                            StickerSetInfo stickerSetInfo = new StickerSetInfo();
                            stickerSetInfo.setMessage(message);
                            C39766a.m157868a().mo187805a(context, stickerSetInfo);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: n */
            public AbstractC51472a.AbstractC51481h mo144040n() {
                return new AbstractC51472a.AbstractC51481h() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397532 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51481h
                    /* renamed from: a */
                    public void mo144051a() {
                        C39603g.m157159a().getCoreDependency().mo143595j("pin");
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: o */
            public AbstractC51472a.AbstractC51473a mo144041o() {
                return new AbstractC51472a.AbstractC51473a() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397543 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51473a
                    /* renamed from: a */
                    public void mo144052a(String str) {
                        if (!TextUtils.isEmpty(str)) {
                            AuditModuleProvider.f100784c.mo143320a().mo104056d().mo104129a(str);
                        }
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: p */
            public AbstractC51472a.AbstractC51476c mo144042p() {
                return new AbstractC51472a.AbstractC51476c() {
                    /* class com.ss.android.lark.integrator.im.p2038p.C39748a.C397491.C397554 */

                    @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a.AbstractC51476c
                    /* renamed from: a */
                    public boolean mo144053a(Chat chat) {
                        return C39452a.m155775a().mo127243b(chat);
                    }
                };
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: b */
            public void mo144025b() {
                C39603g.m157159a().getCoreDependency().mo143487a("key_doc", ChatBundle.SourceType.CARD);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: e */
            public String mo144031e() {
                String b = C39603g.m157159a().getPassportDependency().mo143668b();
                if (b == null) {
                    return "";
                }
                return b;
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public boolean mo144023a() {
                if (C39603g.m157159a().getCoreDependency().mo143579e().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public <T> AbstractC58992f<T, ? extends RecyclerView.ViewHolder> mo144016a(Context context, AbstractC33988a<T> aVar) {
                return C39603g.m157159a().getCalendarDependency().mo143309a(context, aVar);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: c */
            public void mo144029c(Context context, Message message) {
                C39603g.m157159a().getMigrateTempDependency().mo143634b(context, message);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public void mo144017a(Context context, Message message) {
                C39603g.m157159a().getCoreDependency().mo143430a(context, message, 9, "click", "pin", "");
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: b */
            public void mo144026b(Context context, Message message) {
                C39603g.m157159a().getMigrateTempDependency().mo143632a(context, message);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public void mo144019a(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143489a("messenger", "messenger_pin");
                C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105523a(), C39603g.m157159a().getCCMDependency().mo143290a());
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: b */
            public void mo144027b(Context context, String str) {
                C39742a.m157747a().mo176937b((Activity) context, str);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public void mo144022a(String str, Activity activity) {
                C39603g.m157159a().getCoreDependency().mo143485a(str, activity);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public void mo144018a(Context context, Message message, LocationContent locationContent) {
                C39718b.m157699a().mo149715a(context, new LocationInfo.C29595a(locationContent.getLatitude(), locationContent.getLongitude()).mo106512a(message).mo106513a(locationContent.getName()).mo106516b(locationContent.getDescription()).mo106511a(locationContent.getZoomLevel()).mo106514a(false).mo106517b(locationContent.isInternal()).mo106518c(true).mo106515a(), null);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public boolean mo144024a(Context context, String str, int i) {
                if (!C39603g.m157159a().getCoreDependency().mo143558b(context, str, i)) {
                    return false;
                }
                C39603g.m157159a().getCoreDependency().mo143565c(context, str, i);
                return true;
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public void mo144021a(View view, AbbreviationInfo abbreviationInfo, float f, float f2) {
                AbstractC39484a.m156004a().mo104212a(view, abbreviationInfo, f, f2);
            }

            @Override // com.ss.android.lark.pin.p2466a.AbstractC51472a
            /* renamed from: a */
            public void mo144020a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
                C39766a.m157868a().mo187816d().mo187829a(context, z, i, i2, str, imageView, i3, i4);
            }
        };
    }
}
