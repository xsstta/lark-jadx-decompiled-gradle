package com.ss.android.lark.integrator.im.p2023c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.im.v1.GetChatLinkTokenResponse;
import com.bytedance.lark.pb.im.v1.GetTeamsByIdsResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.ProfileResponse;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.AbstractC29627s;
import com.ss.android.lark.biz.im.api.C29596a;
import com.ss.android.lark.biz.im.api.C29598aa;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.biz.im.api.FeedPreviewInfo;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.AvatarMeta;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.ChatApplyInfo;
import com.ss.android.lark.chat.entity.chat.ChatSetting;
import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33978b;
import com.ss.android.lark.chat.entity.p1663c.AbstractC33980d;
import com.ss.android.lark.chat.entity.p1664d.AbstractC33987b;
import com.ss.android.lark.chat.entity.p1667g.AbstractC33991a;
import com.ss.android.lark.chat.entity.thread.TopicGroup;
import com.ss.android.lark.chat.service.AbstractC34127i;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.dto.AbstractC34496c;
import com.ss.android.lark.chatsetting.dto.AbstractC34497d;
import com.ss.android.lark.chatsetting.dto.AbstractC34498e;
import com.ss.android.lark.chatsetting.dto.AbstractC34499f;
import com.ss.android.lark.chatsetting.dto.AbstractC34500g;
import com.ss.android.lark.chatsetting.dto.C34495a;
import com.ss.android.lark.chatsetting.dto.ChatLinkInfoResponse;
import com.ss.android.lark.chatsetting.dto.ChatLinkTokenResponse;
import com.ss.android.lark.chatsetting.dto.ChatQRCodeTokenResponse;
import com.ss.android.lark.chatsetting.dto.GetChatJoinLeaveHistoryResponse;
import com.ss.android.lark.chatsetting.dto.Profile;
import com.ss.android.lark.chatsetting.dto.PullChatShareHistoryResponse;
import com.ss.android.lark.chatsetting.dto.PushChatRelationListener;
import com.ss.android.lark.chatsetting.dto.SelectChatterDTO;
import com.ss.android.lark.chatsetting.dto.Shortcut;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingExtraParams;
import com.ss.android.lark.chatsetting.impl.statistics.ChatSettingHitPointNew;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.dto.chat.C36869c;
import com.ss.android.lark.dto.p1815d.C36871a;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.feed.interfaces.AbstractC38109s;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import com.ss.android.lark.integrator.im.groupmember.C39633a;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import com.ss.android.lark.integrator.im.p2029i.C39640a;
import com.ss.android.lark.integrator.im.p2037o.C39742a;
import com.ss.android.lark.integrator.im.p2038p.C39748a;
import com.ss.android.lark.integrator.im.p2041s.C39776a;
import com.ss.android.lark.listener.DefaultChatRelationPushListener;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.export.p2253a.AbstractC44896a;
import com.ss.android.lark.p2392o.AbstractC48703l;
import com.ss.android.lark.team.api.C55357a;
import com.ss.android.lark.team.api.entity.UnbindTeamChatResponse;
import com.ss.android.lark.team.entity.Item;
import com.ss.android.lark.team.entity.PatchTeamResponse;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.integrator.im.c.a */
public class C39452a {

    /* renamed from: com.ss.android.lark.integrator.im.c.a$a */
    public static class C39483a {

        /* renamed from: a */
        public static final AbstractC34461c f100900a = C39452a.m155776a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static ChatSettingModule m155775a() {
        return new ChatSettingModule(C39483a.f100900a);
    }

    /* renamed from: a */
    public static AbstractC34461c m155776a(final Context context) {
        return new AbstractC34461c() {
            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531 */

            /* renamed from: a */
            public final Map<AbstractC34499f, AbstractC38109s> f100824a = new ConcurrentHashMap();

            /* renamed from: b */
            public final Map<AbstractC34496c, AbstractC29623p> f100825b = new ConcurrentHashMap();

            /* renamed from: c */
            public final Map<AbstractC34497d, AbstractC29627s> f100826c = new ConcurrentHashMap();

            /* renamed from: d */
            public final Map<AbstractC34500g, AbstractC34127i> f100827d = new ConcurrentHashMap();

            /* renamed from: e */
            public final Map<AbstractC34498e, AbstractC48703l> f100828e = new ConcurrentHashMap();

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: y */
            public Context mo127295y() {
                return context;
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: C */
            public AbstractC34461c.AbstractC34468g mo127258C() {
                return new AbstractC34461c.AbstractC34468g() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394807 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34468g
                    /* renamed from: a */
                    public void mo127385a(AbstractC33987b bVar) {
                        if (bVar != null) {
                            C39603g.m157159a().getCCMDependency().mo143294a(bVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34468g
                    /* renamed from: b */
                    public void mo127387b(AbstractC33987b bVar) {
                        if (bVar != null) {
                            C39603g.m157159a().getCCMDependency().mo143300b(bVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34468g
                    /* renamed from: a */
                    public int mo127384a(DocType docType) {
                        return C39603g.m157159a().getCCMDependency().mo143287a(docType.getNumber());
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34468g
                    /* renamed from: a */
                    public void mo127386a(List<String> list) {
                        C39603g.m157159a().getCCMDependency().mo143296a(list);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: D */
            public AbstractC34461c.AbstractC34477p mo127259D() {
                return new AbstractC34461c.AbstractC34477p() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394829 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34477p
                    /* renamed from: a */
                    public boolean mo127416a() {
                        return C39603g.m157159a().getMailDependency().mo143627a();
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: a */
            public String mo127264a() {
                return DynamicConfigModule.m145551a(DomainSettings.Alias.SUITE_REPORT);
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: b */
            public ChatSettingModule.AbstractC34455b mo127269b() {
                return new ChatSettingModule.AbstractC34455b() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394541 */

                    @Override // com.ss.android.lark.chatsetting.ChatSettingModule.AbstractC34455b
                    /* renamed from: a */
                    public void mo127250a() {
                        C39603g.m157159a().getCoreDependency().mo143487a("key_doc", ChatBundle.SourceType.PROFILE);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: c */
            public AbstractC34461c.AbstractC34464c mo127272c() {
                return new AbstractC34461c.AbstractC34464c() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass19 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34464c
                    /* renamed from: a */
                    public void mo127302a(Context context, String str) {
                        C39603g.m157159a().getCoreDependency().mo143489a("messenger", "messenger_chat");
                        C39603g.m157159a().getCoreDependency().mo143437a(context, str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34464c
                    /* renamed from: b */
                    public void mo127304b(Context context, String str) {
                        C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105523a(), C39603g.m157159a().getCCMDependency().mo143303c());
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34464c
                    /* renamed from: a */
                    public void mo127303a(Context context, String str, String str2) {
                        C39603g.m157159a().getCoreDependency().mo143441a(context, str, UrlParams.m108857a().mo105523a(), C39603g.m157159a().getCCMDependency().mo143291a(str2));
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: d */
            public AbstractC34461c.AbstractC34466e mo127274d() {
                return new AbstractC34461c.AbstractC34466e() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127321a(AbstractC34496c cVar) {
                        $$Lambda$a$1$21$PStXrVFEEJMoS2toWOWjxCWkWtw r0 = new AbstractC29623p() {
                            /* class com.ss.android.lark.integrator.im.p2023c.$$Lambda$a$1$21$PStXrVFEEJMoS2toWOWjxCWkWtw */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
                            public final void onPushChatter(Chatter chatter) {
                                C39452a.C394531.AnonymousClass21.lambda$PStXrVFEEJMoS2toWOWjxCWkWtw(AbstractC34496c.this, chatter);
                            }
                        };
                        C394531.this.f100825b.put(cVar, r0);
                        AbstractC39484a.m156004a().mo104214a(r0);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127322a(final AbstractC34497d dVar) {
                        C394624 r0 = new AbstractC29627s() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394624 */

                            @Override // com.ss.android.lark.biz.im.api.AbstractC29627s
                            public void onPushMineChatterChanged(Chatter chatter, Chat chat) {
                                dVar.mo127527a(chatter);
                            }
                        };
                        C394531.this.f100826c.put(dVar, r0);
                        AbstractC39484a.m156004a().mo104216a(r0);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127323a(final AbstractC34498e eVar) {
                        C394635 r0 = new AbstractC48703l() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394635 */

                            @Override // com.ss.android.lark.p2392o.AbstractC48703l
                            /* renamed from: a */
                            public void mo143335a(String str, boolean z) {
                                eVar.mo127528a(str, z);
                            }
                        };
                        C394531.this.f100828e.put(eVar, r0);
                        AbstractC39484a.m156004a().mo104222a(r0);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127324a(String str, int i, final IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121034b(str, i, new IGetDataCallback<com.ss.android.lark.dto.chat.ChatQRCodeTokenResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394646 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.dto.chat.ChatQRCodeTokenResponse chatQRCodeTokenResponse) {
                                iGetDataCallback.onSuccess(AnonymousClass21.this.mo143329a(chatQRCodeTokenResponse));
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127325a(String str, int i, boolean z, final IGetDataCallback<ChatQRCodeTokenResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo120993a(str, i, z, new IGetDataCallback<com.ss.android.lark.dto.chat.ChatQRCodeTokenResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394657 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.dto.chat.ChatQRCodeTokenResponse chatQRCodeTokenResponse) {
                                iGetDataCallback.onSuccess(AnonymousClass21.this.mo143329a(chatQRCodeTokenResponse));
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127326a(final String str, final IGetDataCallback<ChatLinkInfoResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121061f(str, new IGetDataCallback<com.ss.android.lark.dto.chat.ChatLinkInfoResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.AnonymousClass10 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.dto.chat.ChatLinkInfoResponse chatLinkInfoResponse) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(new ChatLinkInfoResponse(chatLinkInfoResponse.isInChat(), chatLinkInfoResponse.getChatId(), str, chatLinkInfoResponse.getChat(), chatLinkInfoResponse.isCanInvited(), chatLinkInfoResponse.getInviterId()));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127357b(String str, final IGetDataCallback<String> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121077l(str, new IGetDataCallback<C36869c>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.AnonymousClass11 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(C36869c cVar) {
                                String a = cVar.mo136079a();
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(a);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127320a(Channel channel, String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104256g().mo121193a(channel, str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127339a(String str, String str2, IGetDataCallback<ChatApplyInfo> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121070h(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127360b(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121012a(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127337a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121006a(str, iterable, 1, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127341a(String str, String str2, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121016a(str, str2, iterable, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127346a(List<String> list, IGetDataCallback<Map<String, ChatSetting>> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121042b(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127332a(String str, Chat.MessagePosition messagePosition, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121001a(str, messagePosition, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127343a(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121059e(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127361b(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121041b(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127334a(String str, Chat.PostType postType, List<String> list, List<String> list2, IGetDataCallback<Void> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121003a(str, postType, list, list2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127327a(String str, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo120996a(str, addMemberPermission, shareCardPermission, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127328a(String str, Chat.AtAllPermission atAllPermission, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo120997a(str, atAllPermission, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127335a(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121004a(str, systemMessageVisible, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127358b(String str, Chat.SystemMessageVisible systemMessageVisible, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121037b(str, systemMessageVisible, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127329a(String str, Chat.BuzzPermissionSetting buzzPermissionSetting, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo120998a(str, buzzPermissionSetting, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127330a(String str, Chat.CreateVideoConferenceSetting createVideoConferenceSetting, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo120999a(str, createVideoConferenceSetting, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127333a(String str, Chat.PinPermissionSetting pinPermissionSetting, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121002a(str, pinPermissionSetting, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127336a(String str, Chat.TopNoticePermissionSetting topNoticePermissionSetting, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121005a(str, topNoticePermissionSetting, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127331a(String str, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121000a(str, groupMailSendPermissionType, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127345a(String str, boolean z, Chat.GroupMailSendPermissionType groupMailSendPermissionType, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121026a(str, z, groupMailSendPermissionType, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127344a(String str, boolean z, Chat.AddMemberPermission addMemberPermission, Chat.ShareCardPermission shareCardPermission, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121025a(str, z, addMemberPermission, shareCardPermission, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127340a(String str, String str2, AvatarMeta avatarMeta, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121015a(str, str2, avatarMeta, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127342a(String str, String str2, boolean z, IGetDataCallback<Boolean> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121014a(str, str2, z ? AddChatChatterApply.Status.APPROVED : AddChatChatterApply.Status.REFUSED, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127338a(String str, String str2, int i, final IGetDataCallback<PullChatShareHistoryResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121009a(str, str2, i, new IGetDataCallback<com.ss.android.lark.dto.chat.PullChatShareHistoryResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394591 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.dto.chat.PullChatShareHistoryResponse hVar) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(new PullChatShareHistoryResponse(hVar.mo136103a(), hVar.mo136104b(), hVar.mo136105c()));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127347a(List<String> list, ChatShareInfo.ShareStatus shareStatus, IGetDataCallback<Boolean> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121028a(list, shareStatus, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127359b(String str, String str2, int i, final IGetDataCallback<GetChatJoinLeaveHistoryResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121038b(str, str2, i, new IGetDataCallback<com.ss.android.lark.dto.chat.GetChatJoinLeaveHistoryResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394602 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.dto.chat.GetChatJoinLeaveHistoryResponse dVar) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(new GetChatJoinLeaveHistoryResponse(dVar.mo136080a(), dVar.mo136081b(), dVar.mo136082c()));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127362b(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104256g().mo121200a(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127317a() {
                        AbstractC39484a.m156004a().mo104182I();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public IChatParser mo127348b() {
                        return AbstractC39484a.m156004a().mo104275z();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: c */
                    public boolean mo127368c() {
                        return AbstractC39484a.m156004a().mo104184K();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public Chat mo127312a(String str) {
                        return AbstractC39484a.m156004a().mo104251d().mo121056e(str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: c */
                    public TopicGroup mo127363c(String str) {
                        return AbstractC39484a.m156004a().mo104273x().mo106482a(str, false);
                    }

                    /* renamed from: a */
                    private List<ChatChatter> m155853a(List<ChatChatter> list) {
                        ArrayList arrayList = new ArrayList();
                        for (ChatChatter chatChatter : list) {
                            if (!chatChatter.isBot()) {
                                arrayList.add(chatChatter);
                            }
                        }
                        return arrayList;
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public Chat mo127349b(String str) {
                        return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: c */
                    public String mo127364c(Chatter chatter) {
                        return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NAME);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public String mo127350b(Chatter chatter) {
                        return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NICKNAME_NAME);
                    }

                    /* renamed from: a */
                    public ChatQRCodeTokenResponse mo143329a(com.ss.android.lark.dto.chat.ChatQRCodeTokenResponse chatQRCodeTokenResponse) {
                        if (chatQRCodeTokenResponse != null) {
                            return new ChatQRCodeTokenResponse(chatQRCodeTokenResponse.getToken(), chatQRCodeTokenResponse.getUrl(), chatQRCodeTokenResponse.getExpireTime(), chatQRCodeTokenResponse.isUnLimited());
                        }
                        return null;
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public String mo127314a(Chatter chatter) {
                        return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.ALIAS_NAME);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127352b(AbstractC34496c cVar) {
                        AbstractC29623p pVar = C394531.this.f100825b.get(cVar);
                        C394531.this.f100825b.remove(cVar);
                        if (pVar != null) {
                            AbstractC39484a.m156004a().mo104238b(pVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127353b(AbstractC34497d dVar) {
                        AbstractC29627s sVar = C394531.this.f100826c.get(dVar);
                        C394531.this.f100826c.remove(dVar);
                        if (sVar != null) {
                            AbstractC39484a.m156004a().mo104240b(sVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127354b(AbstractC34498e eVar) {
                        AbstractC48703l lVar = C394531.this.f100828e.get(eVar);
                        C394531.this.f100828e.remove(eVar);
                        if (lVar != null) {
                            AbstractC39484a.m156004a().mo104244b(lVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127319a(final IGetDataCallback<Long> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104273x().mo106484a(new IGetDataCallback<C29596a>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394613 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(C29596a aVar) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(Long.valueOf(aVar.mo106643b()));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: d */
                    public void mo127369d(String str, IGetDataCallback<Chatter> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104256g().mo121208b(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: e */
                    public void mo127372e(String str, IGetDataCallback<AvatarMeta> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121075j(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: f */
                    public void mo127375f(String str, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121069h(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: g */
                    public void mo127377g(String str, IGetDataCallback<List<ChatChatter>> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121073i(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: h */
                    public void mo127379h(String str, IGetDataCallback<Object> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104273x().mo106488c(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: i */
                    public void mo127380i(String str, IGetDataCallback<Object> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104273x().mo106489d(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: j */
                    public void mo127381j(String str, IGetDataCallback<List<Chatter>> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121078m(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public ChatChatter mo127313a(String str, String str2) {
                        return AbstractC39484a.m156004a().mo104256g().mo121185a(str, str2);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: c */
                    public void mo127365c(String str, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo120994a(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public List<ChatChatter> mo127351b(String str, int i) {
                        return m155853a(AbstractC39484a.m156004a().mo104251d().mo120988a(str, "", i, true, 0).mo136071e());
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public List<ChatChatter> mo127315a(String str, int i) {
                        return m155853a(AbstractC39484a.m156004a().mo104251d().mo120988a(str, "", i, false, 0).mo136071e());
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public Map<String, ChatChatter> mo127316a(String str, List<String> list) {
                        return AbstractC39484a.m156004a().mo104256g().mo121188a(str, list);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: a */
                    public void mo127318a(Context context, String str) {
                        AbstractC39484a.m156004a().mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.PUSH).mo105933c("group_share").mo105929a());
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: d */
                    public void mo127370d(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121054d(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: e */
                    public void mo127373e(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121049c(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: f */
                    public void mo127376f(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121067g(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: g */
                    public void mo127378g(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121071h(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: d */
                    public void mo127371d(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121055d(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: e */
                    public void mo127374e(String str, boolean z, IGetDataCallback<ChatSetting> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121024a(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: c */
                    public void mo127366c(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121039b(str, str2, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: c */
                    public void mo127367c(String str, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121050c(str, z, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127355b(String str, int i, final IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121047c(str, i, new IGetDataCallback<GetChatLinkTokenResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394679 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(errorResult);
                                }
                            }

                            /* renamed from: a */
                            public void onSuccess(GetChatLinkTokenResponse getChatLinkTokenResponse) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(new ChatLinkTokenResponse(getChatLinkTokenResponse.share_token, getChatLinkTokenResponse.shared_url, getChatLinkTokenResponse.paste_text, getChatLinkTokenResponse.expire_time.longValue()));
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34466e
                    /* renamed from: b */
                    public void mo127356b(String str, int i, boolean z, final IGetDataCallback<ChatLinkTokenResponse> iGetDataCallback) {
                        AbstractC39484a.m156004a().mo104251d().mo121035b(str, i, z, new IGetDataCallback<com.ss.android.lark.dto.chat.ChatLinkTokenResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass21.C394668 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.dto.chat.ChatLinkTokenResponse chatLinkTokenResponse) {
                                iGetDataCallback.onSuccess(new ChatLinkTokenResponse(chatLinkTokenResponse.getToken(), chatLinkTokenResponse.getSharedUrl(), chatLinkTokenResponse.getDisplayContent(), chatLinkTokenResponse.getExpireTime(), chatLinkTokenResponse.isUnLimited()));
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: e */
            public AbstractC34461c.AbstractC34481t mo127275e() {
                return new AbstractC34461c.AbstractC34481t() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass22 */

                    /* renamed from: a */
                    final C29407b f100867a = AbstractC39484a.m156004a();

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34481t
                    /* renamed from: a */
                    public void mo127430a(final AbstractC34500g gVar) {
                        C394692 r0 = new AbstractC34127i() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass22.C394692 */

                            @Override // com.ss.android.lark.chat.service.AbstractC34127i
                            /* renamed from: a */
                            public void mo126577a(TopicGroup topicGroup) {
                                AbstractC34500g gVar = gVar;
                                if (gVar != null) {
                                    gVar.mo127530a(topicGroup);
                                }
                            }
                        };
                        C394531.this.f100827d.put(gVar, r0);
                        this.f100867a.mo104220a(r0);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34481t
                    /* renamed from: b */
                    public void mo127432b(AbstractC34500g gVar) {
                        AbstractC34127i remove = C394531.this.f100827d.remove(gVar);
                        if (remove != null) {
                            this.f100867a.mo104243b(remove);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34481t
                    /* renamed from: a */
                    public void mo127431a(String str, String str2, final PushChatRelationListener iVar) {
                        this.f100867a.mo104266q().mo126545a(str, str2, new DefaultChatRelationPushListener() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass22.C394681 */

                            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
                            /* renamed from: a */
                            public void mo126574a(Chat chat) {
                                PushChatRelationListener iVar = iVar;
                                if (iVar != null) {
                                    iVar.mo127537a(chat);
                                }
                            }

                            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
                            /* renamed from: a */
                            public void mo126573a(C29598aa aaVar) {
                                Chat b = aaVar.mo106645b();
                                PushChatRelationListener iVar = iVar;
                                if (iVar != null && b != null) {
                                    iVar.mo127539a(aaVar.mo106644a(), b);
                                }
                            }

                            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
                            /* renamed from: b */
                            public void mo126576b(Chat chat, Map<String, ? extends Chatter> map) {
                                PushChatRelationListener iVar = iVar;
                                if (iVar != null) {
                                    iVar.mo127540b(chat, map);
                                }
                            }

                            @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
                            /* renamed from: a */
                            public void mo126575a(Chat chat, Map<String, ? extends Chatter> map) {
                                PushChatRelationListener iVar = iVar;
                                if (iVar != null) {
                                    iVar.mo127538a(chat, map);
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34481t
                    /* renamed from: b */
                    public void mo127433b(String str, String str2, PushChatRelationListener iVar) {
                        this.f100867a.mo104266q().mo126544a(str, str2);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: f */
            public AbstractC34461c.AbstractC34472k mo127276f() {
                return new AbstractC34461c.AbstractC34472k() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass23 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34472k
                    /* renamed from: a */
                    public void mo127398a(Context context, ProfileContent profileContent) {
                        C39603g.m157159a().getCoreDependency().mo143433a(context, profileContent);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: g */
            public AbstractC34461c.AbstractC34476o mo127277g() {
                return new AbstractC34461c.AbstractC34476o() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass24 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34476o
                    /* renamed from: a */
                    public String mo127412a() {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172422c();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34476o
                    /* renamed from: b */
                    public String mo127414b() {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172419a().getTenantName();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34476o
                    /* renamed from: c */
                    public String mo127415c() {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172419a().getTenantId();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34476o
                    /* renamed from: a */
                    public boolean mo127413a(String str) {
                        return C39603g.m157159a().getPassportDependency().mo143678i().mo172420a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: h */
            public AbstractC34461c.AbstractC34471j mo127278h() {
                return new AbstractC34461c.AbstractC34471j() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass25 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: a */
                    public boolean mo127395a() {
                        return C39640a.m157299a().mo136983g().mo137458g();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: a */
                    public List<Shortcut> mo127390a(List<String> list) {
                        return C39452a.m155778a(C39640a.m157299a().mo136982f().mo139426a(list));
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: b */
                    public void mo127397b(AbstractC34499f fVar) {
                        AbstractC38109s sVar = C394531.this.f100824a.get(fVar);
                        C394531.this.f100824a.remove(fVar);
                        if (sVar != null) {
                            C39640a.m157299a().mo136978b(sVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: a */
                    public void mo127392a(final AbstractC34499f fVar) {
                        C394701 r0 = new AbstractC38109s() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass25.C394701 */

                            @Override // com.ss.android.lark.feed.interfaces.AbstractC38109s
                            /* renamed from: a */
                            public void mo138554a(List<com.ss.android.lark.biz.im.api.Shortcut> list, List<FeedPreviewInfo> list2) {
                                fVar.mo127529a(C39452a.m155778a(list));
                            }
                        };
                        C394531.this.f100824a.put(fVar, r0);
                        C39640a.m157299a().mo136974a(r0);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: a */
                    public void mo127393a(List<String> list, IGetDataCallback<Object> iGetDataCallback) {
                        C39640a.m157299a().mo136980d().mo139420a(list, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: b */
                    public void mo127396b(Shortcut shortcut, final IGetDataCallback<Shortcut> iGetDataCallback) {
                        C39640a.m157299a().mo136982f().mo139430b(C39452a.m155774a(shortcut), new IGetDataCallback<com.ss.android.lark.biz.im.api.Shortcut>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass25.C394723 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.biz.im.api.Shortcut shortcut) {
                                iGetDataCallback.onSuccess(C39452a.m155777a(shortcut));
                            }
                        }, 1);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: a */
                    public void mo127391a(Shortcut shortcut, final IGetDataCallback<Shortcut> iGetDataCallback) {
                        C39640a.m157299a().mo136982f().mo139428a(C39452a.m155774a(shortcut), new IGetDataCallback<com.ss.android.lark.biz.im.api.Shortcut>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass25.C394712 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(com.ss.android.lark.biz.im.api.Shortcut shortcut) {
                                iGetDataCallback.onSuccess(C39452a.m155777a(shortcut));
                            }
                        }, 1);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34471j
                    /* renamed from: a */
                    public void mo127394a(List<String> list, boolean z, IGetDataCallback<Object> iGetDataCallback) {
                        C39640a.m157299a().mo136980d().mo139421a(list, z, iGetDataCallback);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: i */
            public AbstractC34461c.AbstractC34474m mo127279i() {
                return new AbstractC34461c.AbstractC34474m() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394582 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34474m
                    /* renamed from: a */
                    public void mo127408a(Context context, String str, ImageView imageView, int i, int i2) {
                        C39603g.m157159a().getCoreDependency().mo143524b(context, imageView, str, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)));
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34474m
                    /* renamed from: a */
                    public void mo127409a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                        C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i2).mo105422b(i2));
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: j */
            public AbstractC34461c.AbstractC34480s mo127280j() {
                return new AbstractC34461c.AbstractC34480s() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394733 */

                    /* renamed from: a */
                    final AbstractC29542ad f100882a = C39603g.m157159a().getCoreDependency().mo143379E();

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: a */
                    public void mo127423a(Context context, String str) {
                        this.f100882a.mo105585c(context, str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: c */
                    public void mo127429c(Context context, String str) {
                        this.f100882a.mo105569a(context, str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: b */
                    public void mo127428b(Context context, String str) {
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceType(2);
                        this.f100882a.mo105573a(context, str, (String) null, contactSource);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: a */
                    public void mo127427a(String str, final IGetDataCallback<Profile> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143567c(str, new IGetDataCallback<ProfileResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394733.C394741 */

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                iGetDataCallback.onError(errorResult);
                            }

                            /* renamed from: a */
                            public void onSuccess(ProfileResponse profileResponse) {
                                if (!profileResponse.isNotValid()) {
                                    com.ss.android.lark.profile.entity.Profile profile = profileResponse.profile;
                                    IGetDataCallback iGetDataCallback = iGetDataCallback;
                                    if (iGetDataCallback != null) {
                                        iGetDataCallback.onSuccess(new Profile(profile.getEmail(), profile.getDepartment()));
                                    }
                                }
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: a */
                    public void mo127424a(Context context, String str, String str2, String str3) {
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceType(2);
                        contactSource.setSourceName(str3);
                        this.f100882a.mo105573a(context, str, str2, contactSource);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: a */
                    public void mo127422a(Context context, Chatter chatter, String str, String str2, String str3) {
                        ContactSource contactSource = new ContactSource();
                        contactSource.setSourceName(str3);
                        contactSource.setSourceType(2);
                        this.f100882a.mo105573a(context, chatter.getId(), str2, contactSource);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: a */
                    public void mo127425a(Context context, String str, String str2, String str3, String str4, boolean z) {
                        this.f100882a.mo105579a(context, str, str2, str3, str4, z);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34480s
                    /* renamed from: a */
                    public void mo127426a(Context context, String str, String str2, String str3, boolean z, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6) {
                        this.f100882a.mo105580a(context, str, str2, str3, z, z2, str4, z3, z4, str5, str6, true);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: k */
            public AbstractC34461c.AbstractC34473l mo127281k() {
                return new AbstractC34461c.AbstractC34473l() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394754 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public List<SelectChatterDTO> mo127399a(Intent intent) {
                        return m155970a(intent.getParcelableArrayListExtra("result_key_checked_chatters"));
                    }

                    /* renamed from: a */
                    private List<SelectChatterDTO> m155970a(List<com.ss.android.lark.member_manage.dto.SelectChatterDTO> list) {
                        ArrayList arrayList = new ArrayList();
                        if (list != null) {
                            for (com.ss.android.lark.member_manage.dto.SelectChatterDTO selectChatterDTO : list) {
                                if (selectChatterDTO != null) {
                                    arrayList.add(new SelectChatterDTO(selectChatterDTO.mo158888a(), selectChatterDTO.mo158889b()));
                                }
                            }
                        }
                        return arrayList;
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127401a(Activity activity, String str, int i) {
                        C39633a.m157280a().mo158786a(activity, str, i);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127403a(Activity activity, String str, boolean z) {
                        C39633a.m157280a().mo158790a(activity, str, z);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127402a(Activity activity, String str, int i, boolean z) {
                        C39633a.m157280a().mo158787a(activity, str, i, z);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127404a(Activity activity, String str, boolean z, boolean z2) {
                        C39633a.m157280a().mo158792a(activity, str, z, z2);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127406a(C36516a aVar, String str, int i, boolean z) {
                        C39633a.m157280a().mo158800a(aVar, str, i, z);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127407a(C36516a aVar, String str, ArrayList<String> arrayList, int i) {
                        C39633a.m157280a().mo158804b(aVar, str, arrayList, i);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127400a(Activity activity, Chat chat, boolean z, int i, String str) {
                        C39633a.m157280a().mo158783a(activity, chat, z, i, str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34473l
                    /* renamed from: a */
                    public void mo127405a(Context context, String str, List<String> list, int i, AbstractC44896a aVar) {
                        C39633a.m157280a().mo158795a(context, str, list, i, aVar);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: l */
            public AbstractC34461c.AbstractC34465d mo127282l() {
                return new AbstractC34461c.AbstractC34465d() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394765 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: a */
                    public void mo127306a() {
                        C39603g.m157159a().getCalendarDependency().mo143310a();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: b */
                    public boolean mo127311b(int i) {
                        return C39603g.m157159a().getCalendarDependency().mo143314a(i);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: a */
                    public boolean mo127309a(int i) {
                        return C39603g.m157159a().getCalendarDependency().mo143318b(i);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: a */
                    public void mo127308a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        C39603g.m157159a().getCalendarDependency().mo143313a(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: a */
                    public boolean mo127310a(Chat chat, ChatChatter chatChatter) {
                        return C39603g.m157159a().getCalendarDependency().mo143315a(chat, chatChatter);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: a */
                    public void mo127307a(Context context, Chat chat, ChatChatter chatChatter) {
                        C39603g.m157159a().getCalendarDependency().mo143312a(context, chat, chatChatter);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34465d
                    /* renamed from: a */
                    public AbstractC33978b mo127305a(Activity activity, String str, String str2, AbstractC33980d dVar) {
                        return C39603g.m157159a().getCalendarDependency().mo143308a(activity, str, str2, dVar);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: m */
            public AbstractC34461c.AbstractC34470i mo127283m() {
                return new AbstractC34461c.AbstractC34470i() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394818 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34470i
                    /* renamed from: a */
                    public boolean mo127389a() {
                        return C37239a.m146648b().mo136951a("suite_translation");
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: n */
            public AbstractC34461c.AbstractC34462a mo127284n() {
                return new AbstractC34461c.AbstractC34462a() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass10 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34462a
                    /* renamed from: a */
                    public boolean mo127297a(String str) {
                        return C39603g.m157159a().getCoreDependency().mo143586f(str);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: o */
            public AbstractC34461c.AbstractC34483v mo127285o() {
                return new AbstractC34461c.AbstractC34483v() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass11 */

                    /* renamed from: a */
                    private ShareActionType m155822a(ShareActionType shareActionType) {
                        ShareActionType copy = shareActionType.copy();
                        final ShareActionType.ShareItemInfo shareItemInfo = shareActionType.getShareItemInfo();
                        copy.setShareItemInfo(new ShareActionType.ShareItemInfo(shareItemInfo.mIconId, shareItemInfo.mNameResId, shareItemInfo.shouldApplyTint), new ShareActionType.ShareItemClickListener(copy) {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass11.C394562 */

                            @Override // com.ss.android.lark.thirdshare.base.export.ShareActionType.ShareItemClickListener
                            public void onClick(Context context, ShareEntity shareEntity) {
                                ChatSettingHitPointNew.m136644i(ChatSettingExtraParams.Click.LARK.plus(ChatSettingExtraParams.Target.PUBLIC_MULTI_SELECT_SHARE_VIEW));
                                shareItemInfo.mListener.onClick(context, shareEntity);
                            }
                        });
                        return copy;
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34483v
                    /* renamed from: a */
                    public Fragment mo127438a(Bundle bundle) {
                        return C39633a.m157280a().mo158781a(bundle);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34483v
                    /* renamed from: a */
                    public Fragment mo127437a(Context context, Bundle bundle, Chat chat) {
                        return C39603g.m157159a().getCoreDependency().mo143403a(context, bundle, chat);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34483v
                    /* renamed from: a */
                    public void mo127439a(Context context, Bitmap bitmap, final IGetDataCallback<String> iGetDataCallback) {
                        ShareEntity.C55696a aVar = new ShareEntity.C55696a(bitmap);
                        aVar.mo189775b("lark.chatsetting.group.qrcode");
                        aVar.mo189764a(new OnShareCallback() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass11.C394573 */
                            private static final long serialVersionUID;

                            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                            public void onSuccess(ShareActionType shareActionType) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(shareActionType.name());
                                }
                            }

                            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(new ErrorResult(shareError.getCode(), shareError.getMsg()));
                                    if (OnShareCallback.NOT_INSTALLED.equals(shareError)) {
                                        iGetDataCallback.onError(new ErrorResult(OnShareCallback.NOT_INSTALLED.getCode(), OnShareCallback.NOT_INSTALLED.getMsg()));
                                    }
                                }
                            }
                        });
                        aVar.mo189768a(Arrays.asList(m155822a(C55761a.m215988a()), ShareActionType.WX, ShareActionType.WB, ShareActionType.QQ, ShareActionType.SYS));
                        aVar.mo189765a(new ShareEntity.ImageDowngradePanel(UIHelper.getString(R.string.Lark_Chat_QRCodeSavedToAlbum), true));
                        ChatSettingHitPointNew.m136641h();
                        ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(context, aVar.mo189769a());
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34483v
                    /* renamed from: a */
                    public void mo127440a(Context context, String str, String str2, String str3, final IGetDataCallback<String> iGetDataCallback) {
                        ShareEntity.C55696a aVar = new ShareEntity.C55696a(str, str2, str3);
                        aVar.mo189775b("lark.chatsetting.group.link");
                        aVar.mo189764a(new OnShareCallback() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass11.C394551 */
                            private static final long serialVersionUID;

                            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                            public void onSuccess(ShareActionType shareActionType) {
                                if (ShareActionType.COPY.equals(shareActionType)) {
                                    ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
                                }
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onSuccess(shareActionType.name());
                                }
                            }

                            @Override // com.ss.android.lark.thirdshare.base.export.OnShareCallback
                            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                                IGetDataCallback iGetDataCallback = iGetDataCallback;
                                if (iGetDataCallback != null) {
                                    iGetDataCallback.onError(new ErrorResult(shareError.getCode(), shareError.getMsg()));
                                    if (OnShareCallback.NOT_INSTALLED.equals(shareError)) {
                                        iGetDataCallback.onError(new ErrorResult(OnShareCallback.NOT_INSTALLED.getCode(), OnShareCallback.NOT_INSTALLED.getMsg()));
                                    }
                                }
                            }
                        });
                        aVar.mo189768a(Arrays.asList(m155822a(C55761a.m215988a()), ShareActionType.WX, ShareActionType.WB, ShareActionType.QQ, ShareActionType.COPY, ShareActionType.SYS));
                        aVar.mo189766a(new ShareEntity.TextDowngradePanel(UIHelper.getString(R.string.Lark_Chat_GroupShareTitle), str2));
                        ChatSettingHitPointNew.m136641h();
                        ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(context, aVar.mo189769a());
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: p */
            public AbstractC34461c.AbstractC34463b mo127286p() {
                return new AbstractC34461c.AbstractC34463b() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass12 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34463b
                    /* renamed from: a */
                    public int mo127298a() {
                        return C39603g.m157159a().getCoreDependency().af();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34463b
                    /* renamed from: a */
                    public void mo127301a(String str, IGetDataCallback<String> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143576d(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34463b
                    /* renamed from: a */
                    public void mo127299a(Context context, String str, String str2, String str3, View view) {
                        C39603g.m157159a().getCoreDependency().mo143449a(context, str, str2, str3, view);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34463b
                    /* renamed from: a */
                    public void mo127300a(Fragment fragment, Activity activity, ImageView imageView, String str, int i) {
                        C39603g.m157159a().getCoreDependency().mo143459a(fragment, activity, imageView, i, str);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: q */
            public AbstractC34461c.AbstractC34478q mo127287q() {
                return new AbstractC34461c.AbstractC34478q() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass13 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34478q
                    /* renamed from: a */
                    public void mo127417a(Context context, String str) {
                        C39603g.m157159a().getCoreDependency().mo143386L().mo105709c(context, str);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: r */
            public AbstractC34461c.AbstractC34482u mo127288r() {
                return new AbstractC34461c.AbstractC34482u() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass14 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34482u
                    /* renamed from: a */
                    public void mo127436a(String str) {
                        C39603g.m157159a().getCoreDependency().mo143602n(str);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34482u
                    /* renamed from: a */
                    public void mo127434a(Context context, String str, boolean z) {
                        C39603g.m157159a().getCoreDependency().mo143451a(context, str, true, z);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34482u
                    /* renamed from: a */
                    public void mo127435a(Context context, String str, boolean z, int i) {
                        int i2;
                        if (i == 0) {
                            i2 = 0;
                        } else if (i == 1) {
                            i2 = 1;
                        } else if (i == 2) {
                            i2 = 2;
                        } else if (i == 3) {
                            i2 = 3;
                        } else if (i == 4) {
                            i2 = 4;
                        } else if (i != 5) {
                            i2 = -1;
                        } else {
                            i2 = 5;
                        }
                        C39603g.m157159a().getCoreDependency().mo143452a(context, str, true, z, i2);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: s */
            public AbstractC34461c.AbstractC34475n mo127289s() {
                return new AbstractC34461c.AbstractC34475n() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass15 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34475n
                    /* renamed from: a */
                    public void mo127411a(String str, AbstractC33991a aVar) {
                        if (aVar != null) {
                            C39603g.m157159a().getOpenPlatformDependency().mo143650a(str, aVar);
                        }
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34475n
                    /* renamed from: a */
                    public void mo127410a(Context context, String str, boolean z) {
                        C39603g.m157159a().getOpenPlatformDependency().mo143647a(context, str, z);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: t */
            public AbstractC34461c.AbstractC34479r mo127290t() {
                return new AbstractC34461c.AbstractC34479r() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass16 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34479r
                    /* renamed from: a */
                    public void mo127418a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        C39748a.m157770a().mo177249a(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34479r
                    /* renamed from: a */
                    public boolean mo127421a(Chat chat, Message message) {
                        return C39748a.m157770a().mo177252a(chat, message);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34479r
                    /* renamed from: a */
                    public void mo127419a(String str, String str2, Context context, boolean z, int i) {
                        C39748a.m157770a().mo177251a(str, str2, z, context, i);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34479r
                    /* renamed from: a */
                    public void mo127420a(String str, String str2, Context context, boolean z, boolean z2, int i) {
                        C39748a.m157770a().mo177250a(str, str2, context, z, z2, i);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: u */
            public AbstractC34461c.AbstractC34485x mo127291u() {
                return new AbstractC34461c.AbstractC34485x() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass17 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34485x
                    /* renamed from: a */
                    public boolean mo127452a() {
                        return C39603g.m157159a().getTodoDependency().mo143691a();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34485x
                    /* renamed from: a */
                    public void mo127451a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                        C39603g.m157159a().getTodoDependency().mo143690a(str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34485x
                    /* renamed from: a */
                    public void mo127450a(Context context, String str, boolean z) {
                        C39603g.m157159a().getTodoDependency().mo143689a(context, str, z);
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: v */
            public AbstractC34461c.AbstractC34467f mo127292v() {
                return new AbstractC34461c.AbstractC34467f() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass18 */

                    /* renamed from: a */
                    public static /* synthetic */ void m155844a(Contact contact, String str, IInitBuilder.IApplyCollabDialogBuilder aVar) {
                        IInitBuilder.IApplyCollabDialogBuilder aVar2 = (IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar.mo105548a(contact).mo105553b(str)).mo105555d("group_confirm");
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34467f
                    /* renamed from: a */
                    public void mo127382a(int i, List<String> list, String str, IGetDataCallback<Map<String, Integer>> iGetDataCallback) {
                        C39603g.m157159a().getCoreDependency().mo143415a(i, list, str, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34467f
                    /* renamed from: a */
                    public void mo127383a(Context context, String str, String str2, Contact contact) {
                        C39603g.m157159a().getCoreDependency().mo143427a(context, new IInitBuilder(str) {
                            /* class com.ss.android.lark.integrator.im.p2023c.$$Lambda$a$1$18$OVg8rBHxupp9P_OegW_leEw3UAU */
                            public final /* synthetic */ String f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                            public final void init(IInitBuilder.IDialogBuilder cVar) {
                                C39452a.C394531.AnonymousClass18.lambda$OVg8rBHxupp9P_OegW_leEw3UAU(Contact.this, this.f$1, (IInitBuilder.IApplyCollabDialogBuilder) cVar);
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: w */
            public AbstractC34461c.AbstractC34469h mo127293w() {
                return new AbstractC34461c.AbstractC34469h() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.AnonymousClass20 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34469h
                    /* renamed from: a */
                    public boolean mo127388a() {
                        return C37239a.m146648b().mo136951a("share_link_enable");
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: x */
            public AbstractC34461c.AbstractC34484w mo127294x() {
                return new AbstractC34461c.AbstractC34484w() {
                    /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394776 */

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public boolean mo127447a() {
                        return C39776a.m157896a().mo188880c();
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public Map<Long, Team> mo127441a(GetTeamsByIdsResponse getTeamsByIdsResponse) {
                        return C55357a.m214868a(getTeamsByIdsResponse);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public void mo127442a(long j, IGetDataCallback<Team> iGetDataCallback) {
                        C39776a.m157896a().mo188872a(j, true, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: b */
                    public void mo127448b(Activity activity, Team team, Chat chat) {
                        C39776a.m157896a().mo188879c(activity, team, chat);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: c */
                    public void mo127449c(Activity activity, Team team, Chat chat) {
                        C39776a.m157896a().mo188874a(activity, team, chat);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public void mo127443a(final long j, final String str, final IGetDataCallback<Chat> iGetDataCallback) {
                        C39776a.m157896a().mo188870a(j, str, new IGetDataCallback<UnbindTeamChatResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394776.C394781 */

                            /* renamed from: a */
                            public void onSuccess(UnbindTeamChatResponse unbindTeamChatResponse) {
                                iGetDataCallback.onSuccess(unbindTeamChatResponse.getChat());
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165384e("TeamDependency", "unbindChatFromTeam err teamId:" + j + ",chatId:" + str, errorResult);
                                iGetDataCallback.onError(errorResult);
                            }
                        });
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public void mo127445a(Activity activity, Team team, Chat chat) {
                        C39776a.m157896a().mo188878b(activity, team, chat);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public void mo127446a(List<String> list, Item.Type type, IGetDataCallback<Map<String, Item>> iGetDataCallback) {
                        C39776a.m157896a().mo188876a(list, type, iGetDataCallback);
                    }

                    @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c.AbstractC34484w
                    /* renamed from: a */
                    public void mo127444a(final long j, final String str, AvatarMeta avatarMeta, final IGetDataCallback<Team> iGetDataCallback) {
                        C39776a.m157896a().mo188871a(j, str, avatarMeta, new IGetDataCallback<PatchTeamResponse>() {
                            /* class com.ss.android.lark.integrator.im.p2023c.C39452a.C394531.C394776.C394792 */

                            /* renamed from: a */
                            public void onSuccess(PatchTeamResponse patchTeamResponse) {
                                Team team;
                                if (patchTeamResponse != null) {
                                    team = patchTeamResponse.getTeam();
                                } else {
                                    team = null;
                                }
                                iGetDataCallback.onSuccess(team);
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Log.m165384e("TeamDependency", "updateTeamAvatar err, teamId:" + j + ", avatarKey:" + str, errorResult);
                                iGetDataCallback.onError(errorResult);
                            }
                        });
                    }
                };
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: A */
            public boolean mo127256A() {
                return C39603g.m157159a().getCoreDependency().mo143618x();
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: E */
            public boolean mo127260E() {
                return C39603g.m157159a().getPassportDependency().mo143675f();
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: F */
            public boolean mo127261F() {
                return C37239a.m146648b().mo136951a("suite_report");
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: G */
            public boolean mo127262G() {
                return AbstractC39484a.m156004a().mo104188O();
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: z */
            public boolean mo127296z() {
                return CreateGroupChatModuleProvider.m157168a().isSecretOpen();
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: B */
            public boolean mo127257B() {
                if (C39603g.m157159a().getCoreDependency().mo143579e().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                    return true;
                }
                return false;
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: a */
            public void mo127265a(Context context) {
                C39603g.m157159a().getCoreDependency().mo143386L().mo105705b(context);
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: b */
            public C34495a mo127270b(String str) {
                C36871a c = AbstractC39484a.m156004a().mo104251d().mo121045c(str);
                if (c == null) {
                    return null;
                }
                C34495a aVar = new C34495a();
                aVar.mo127520a(c.mo136109a());
                aVar.mo127521a(c.mo136110b().getAppId());
                aVar.mo127522b(c.mo136110b().getBotId());
                return aVar;
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: a */
            public boolean mo127268a(String str) {
                return C37239a.m146648b().mo136951a(str);
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: b */
            public void mo127271b(Context context, String str) {
                C39603g.m157159a().getCoreDependency().mo143437a(context, str);
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: c */
            public boolean mo127273c(Context context, String str) {
                if (!C39603g.m157159a().getCoreDependency().mo143558b(context, str, 9)) {
                    return false;
                }
                C39603g.m157159a().getCoreDependency().mo143565c(context, str, 9);
                return true;
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: a */
            public void mo127266a(Context context, String str) {
                C39742a.m157747a().mo176937b((Activity) context, str);
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: a */
            public Bitmap mo127263a(String str, int i, int i2, int i3) {
                return C39603g.m157159a().getCoreDependency().mo143402a(str, i, i2, i3);
            }

            @Override // com.ss.android.lark.chatsetting.p1693a.AbstractC34461c
            /* renamed from: a */
            public void mo127267a(Context context, String str, String str2, ImageView imageView) {
                C39603g.m157159a().getCoreDependency().mo143446a(context, str, str2, imageView);
            }
        };
    }

    /* renamed from: a */
    public static com.ss.android.lark.biz.im.api.Shortcut m155774a(Shortcut shortcut) {
        com.ss.android.lark.biz.im.api.Shortcut shortcut2 = new com.ss.android.lark.biz.im.api.Shortcut(shortcut.getChannel());
        shortcut2.setChannel(shortcut.getChannel());
        shortcut2.setPosition(shortcut.getPosition());
        return shortcut2;
    }

    /* renamed from: a */
    public static Shortcut m155777a(com.ss.android.lark.biz.im.api.Shortcut shortcut) {
        Shortcut shortcut2 = new Shortcut(shortcut.getChannel());
        shortcut2.setChannel(shortcut.getChannel());
        shortcut2.setPosition(shortcut.getPosition());
        return shortcut2;
    }

    /* renamed from: a */
    public static List<Shortcut> m155778a(List<com.ss.android.lark.biz.im.api.Shortcut> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (com.ss.android.lark.biz.im.api.Shortcut shortcut : list) {
                if (shortcut != null) {
                    arrayList.add(m155777a(shortcut));
                }
            }
        }
        return arrayList;
    }
}
