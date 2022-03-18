package com.ss.android.lark.integrator.im.groupmember;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.basic.v1.RichText;
import com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse;
import com.bytedance.lark.pb.im.v1.GetChatLinkTokenResponse;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.AbstractC29542ad;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.ContactSource;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.TimeFormatSetting;
import com.ss.android.lark.biz.core.api.UrlParams;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.core.api.p1402b.AbstractC29551a;
import com.ss.android.lark.biz.im.api.AbstractC29623p;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.chatwindow.chat.data.content.ChatMessageContentResolver;
import com.ss.android.lark.chat.chatwindow.secretchat.data.content.SecretChatMessageContentResolver;
import com.ss.android.lark.chat.entity.chat.AddChatChatterApply;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterCustomStatus;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUnReadInfo;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.dto.chat.C36870f;
import com.ss.android.lark.dto.chat.ChatChatterResponse;
import com.ss.android.lark.dto.chat.ChatInactiveMemberResponse;
import com.ss.android.lark.dto.chat.MessageReadStateResponse;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency;
import com.ss.android.lark.integrator.im.p2023c.C39452a;
import com.ss.android.lark.integrator.im.p2026f.C39587a;
import com.ss.android.lark.integrator.im.p2037o.C39742a;
import com.ss.android.lark.integrator.im.p2041s.C39776a;
import com.ss.android.lark.listener.DefaultChatRelationPushListener;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.dto.AbstractC44894c;
import com.ss.android.lark.member_manage.dto.C44893a;
import com.ss.android.lark.member_manage.dto.C44895d;
import com.ss.android.lark.member_manage.dto.GroupManageChatChatterResponse;
import com.ss.android.lark.member_manage.dto.SelectedData;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.Tenant;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ClaymoreImpl(IGroupMemberManageModuleDependency.class)
public class GroupMemberManageModuleDependency implements IGroupMemberManageModuleDependency {
    private final Context context = LarkContext.getApplication();
    private final Map<AbstractC44894c, AbstractC29623p> sPushChatterListenerMap = new ConcurrentHashMap();

    public Context getContext() {
        return this.context;
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44878a getAccountDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44878a() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass15 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44878a
            /* renamed from: a */
            public boolean mo143792a() {
                return C39603g.m157159a().getPassportDependency().mo143678i().mo172429j();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44878a
            /* renamed from: b */
            public String mo143795b() {
                return C39603g.m157159a().getPassportDependency().mo143678i().mo172422c();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44878a
            /* renamed from: a */
            public boolean mo143793a(String str) {
                return C39603g.m157159a().getPassportDependency().mo143678i().mo172420a(str);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44878a
            /* renamed from: a */
            public boolean mo143794a(List<String> list) {
                TenantInfo d = C39603g.m157159a().getPassportDependency().mo143673d();
                Map<String, Tenant> tenantsByIds = C39603g.m157159a().getPassportDependency().mo143686q().getTenantsByIds(list);
                if (d != null && !TextUtils.isEmpty(d.getUnitLeague()) && tenantsByIds != null && !tenantsByIds.isEmpty()) {
                    for (String str : tenantsByIds.keySet()) {
                        Tenant tenant = tenantsByIds.get(str);
                        if (tenant != null && !TextUtils.isEmpty(tenant.getUnitLeague()) && !TextUtils.equals(d.getUnitLeague(), tenant.getUnitLeague())) {
                            return true;
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44879b getAppConfigDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44879b() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396285 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44879b
            /* renamed from: a */
            public int mo143802a() {
                return C39603g.m157159a().getCoreDependency().mo143617w();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44879b
            /* renamed from: b */
            public int mo143803b() {
                C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
                if (v != null) {
                    return v.mo105656k();
                }
                return 100;
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.IChatDependency getChatDependency() {
        return new IGroupMemberManageModuleDependency.IChatDependency() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143760a(String str, List<String> list, boolean z, IGetDataCallback<Chat> iGetDataCallback) {
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143751a(String str, String str2, int i, final IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121019a(str, str2, true, i, (IGetDataCallback<ChatChatterResponse>) new IGetDataCallback<ChatChatterResponse>() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11.C396191 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(ChatChatterResponse aVar) {
                        GroupManageChatChatterResponse bVar = new GroupManageChatChatterResponse(aVar.mo136068b(), aVar.mo136069c(), null, aVar.mo136071e(), aVar.mo136073f(), aVar.mo136074g());
                        bVar.mo158903a(aVar.mo136067a());
                        iGetDataCallback.onSuccess(bVar);
                    }
                }, 0);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143752a(String str, String str2, IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback) {
                mo143751a(str, str2, 1, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143756a(String str, String str2, boolean z, int i, final IGetDataCallback<GroupManageChatChatterResponse> iGetDataCallback, int i2, int i3) {
                AbstractC39484a.m156004a().mo104251d().mo121010a(str, str2, i3, z, i, new IGetDataCallback<ChatChatterResponse>() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11.C396202 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(ChatChatterResponse aVar) {
                        GroupManageChatChatterResponse bVar = new GroupManageChatChatterResponse(aVar.mo136068b(), aVar.mo136069c(), aVar.mo136070d(), aVar.mo136071e(), aVar.mo136073f(), aVar.mo136074g());
                        bVar.mo158903a(aVar.mo136067a());
                        iGetDataCallback.onSuccess(bVar);
                    }
                }, i2);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143757a(String str, List<PickChatEntity> list, IGetDataCallback<Chat> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121021a(str, list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143754a(String str, String str2, String str3, IGetDataCallback<Chat> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121017a(str, str2, str3, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public boolean mo143762a(Chat chat) {
                return AbstractC39484a.m156004a().mo104232a(chat);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143753a(String str, String str2, final GroupMemberManageModule.AbstractC44877b bVar) {
                AbstractC39484a.m156004a().mo104266q().mo126545a(str, str2, new DefaultChatRelationPushListener() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11.C396213 */

                    @Override // com.ss.android.lark.chat.service.IPushChatRelationListener, com.ss.android.lark.listener.DefaultChatRelationPushListener
                    /* renamed from: a */
                    public void mo126574a(Chat chat) {
                        GroupMemberManageModule.AbstractC44877b bVar = bVar;
                        if (bVar != null) {
                            bVar.mo158813a(chat);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143758a(String str, List<String> list, String str2, String str3, String str4, int i, IGetDataCallback<Boolean> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo120995a(str, AddChatChatterApply.Ways.Companion.mo124354a(i), list, str4, str2, str3, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143755a(String str, String str2, String str3, boolean z, final IGetDataCallback<C44895d> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121018a(str, str2, str3, z, new IGetDataCallback<C36870f>() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11.C396224 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }

                    /* renamed from: a */
                    public void onSuccess(C36870f fVar) {
                        iGetDataCallback.onSuccess(new C44895d(fVar.f94773a, fVar.f94774b, fVar.f94775c, fVar.f94776d, fVar.f94777e, fVar.f94778f));
                    }
                });
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143761a(boolean z) {
                AbstractC39484a.m156004a().mo104229a(z);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143759a(String str, List<String> list, List<String> list2, IGetDataCallback<Boolean> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121023a(str, list, list2, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: b */
            public void mo143768b(boolean z) {
                AbstractC39484a.m156004a().mo104246b(z);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public RichText mo143742a(com.ss.android.lark.widget.richtext.RichText richText) {
                return AbstractC39484a.m156004a().mo104267r().mo121410a(richText);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: b */
            public Chat mo143763b(String str) {
                return AbstractC39484a.m156004a().mo104251d().mo121056e(str);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public Chat mo143743a(String str) {
                return AbstractC39484a.m156004a().mo104251d().mo120985a(str);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143747a(Intent intent, List<ChatChatter> list) {
                intent.putExtra("chatters_info", (Serializable) list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: c */
            public void mo143769c(String str, IGetDataCallback<List<Chatter>> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121078m(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: b */
            public void mo143764b(String str, final IGetDataCallback<Integer> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121076k(str, new IGetDataCallback<ChatInactiveMemberResponse>() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11.C396235 */

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        IGetDataCallback iGetDataCallback = iGetDataCallback;
                        if (iGetDataCallback != null) {
                            iGetDataCallback.onError(errorResult);
                        }
                    }

                    /* renamed from: a */
                    public void onSuccess(ChatInactiveMemberResponse bVar) {
                        if (iGetDataCallback == null) {
                            return;
                        }
                        if (bVar.mo136077a()) {
                            iGetDataCallback.onSuccess(Integer.valueOf(bVar.mo136078b()));
                        } else {
                            iGetDataCallback.onSuccess(0);
                        }
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public static /* synthetic */ MessageUnReadInfo m157203a(String str, String str2) {
                MessageReadStateResponse a;
                GetChatLimitInfoResponse i = AbstractC39484a.m156004a().mo104251d().mo121072i(str);
                MessageUnReadInfo cVar = new MessageUnReadInfo(str, str2, i, new ArrayList());
                if (i != null && !i.is_large_group.booleanValue() && !i.is_super_group.booleanValue() && !i.open_security.booleanValue() && (a = AbstractC39484a.m156004a().mo104258i().mo121081a(str2, 2, "")) != null) {
                    cVar.mo125336b().addAll(a.mo136089b());
                }
                return cVar;
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public Map<String, ChatChatter> mo143746a(String str, List<String> list) {
                return AbstractC39484a.m156004a().mo104256g().mo121212c(str, list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143749a(String str, IGetDataCallback<Chat> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121065g(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: d */
            public void mo143771d(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121049c(str, str2, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: c */
            public void mo143770c(String str, String str2, IGetDataCallback<MessageUnReadInfo> iGetDataCallback) {
                $$Lambda$GroupMemberManageModuleDependency$11$XFoCx7lRgCOpPd7M1dESJSHCPE8 r0 = new C57865c.AbstractC57873d(str, str2) {
                    /* class com.ss.android.lark.integrator.im.groupmember.$$Lambda$GroupMemberManageModuleDependency$11$XFoCx7lRgCOpPd7M1dESJSHCPE8 */
                    public final /* synthetic */ String f$0;
                    public final /* synthetic */ String f$1;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                    public final Object produce() {
                        return GroupMemberManageModuleDependency.AnonymousClass11.m157203a(this.f$0, this.f$1);
                    }
                };
                iGetDataCallback.getClass();
                C57865c.m224574a(r0, new C57865c.AbstractC57871b() {
                    /* class com.ss.android.lark.integrator.im.groupmember.$$Lambda$XlE73yMcZJQpe6kg9PuxJ6fDFLA */

                    @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                    public final void consume(Object obj) {
                        IGetDataCallback.this.onSuccess((MessageUnReadInfo) obj);
                    }
                });
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: b */
            public void mo143765b(String str, String str2, IGetDataCallback<Chat> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121058e(str, str2, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: b */
            public void mo143766b(String str, String str2, GroupMemberManageModule.AbstractC44877b bVar) {
                AbstractC39484a.m156004a().mo104266q().mo126544a(str, str2);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: b */
            public void mo143767b(String str, List<String> list, IGetDataCallback<Map<String, Boolean>> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121040b(str, list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143748a(String str, int i, final IGetDataCallback<String> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121047c(str, i, new IGetDataCallback<GetChatLinkTokenResponse>() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass11.C396246 */

                    /* renamed from: a */
                    public void onSuccess(GetChatLinkTokenResponse getChatLinkTokenResponse) {
                        iGetDataCallback.onSuccess(getChatLinkTokenResponse.paste_text);
                    }

                    @Override // com.larksuite.framework.callback.IGetDataCallback
                    public void onError(ErrorResult errorResult) {
                        iGetDataCallback.onError(errorResult);
                    }
                });
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public void mo143750a(String str, Iterable<String> iterable, IGetDataCallback<Chat> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104251d().mo121006a(str, iterable, 1, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public GroupManageChatChatterResponse mo143744a(String str, String str2, int i, int i2) {
                ChatChatterResponse a = AbstractC39484a.m156004a().mo104251d().mo120987a(str, str2, -1, i, false, i2);
                GroupManageChatChatterResponse bVar = new GroupManageChatChatterResponse(a.mo136068b(), a.mo136069c(), a.mo136070d(), a.mo136071e(), a.mo136073f(), a.mo136074g());
                bVar.mo158903a(a.mo136067a());
                return bVar;
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.IChatDependency
            /* renamed from: a */
            public C44895d mo143745a(String str, String str2, String str3, boolean z) {
                C36870f a = AbstractC39484a.m156004a().mo104251d().mo120989a(str, str2, str3, z);
                return new C44895d(a.f94773a, a.f94774b, a.f94775c, a.f94776d, a.f94777e, a.f94778f);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44880c getChatSettingDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44880c() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396307 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44880c
            /* renamed from: a */
            public void mo143809a(Activity activity, Chat chat) {
                C39452a.m155775a().mo127226a(activity, chat);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44880c
            /* renamed from: a */
            public void mo143812a(Chat chat, IGetDataCallback<Boolean> iGetDataCallback) {
                C39452a.m155775a().mo127236a(chat, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44880c
            /* renamed from: a */
            public void mo143813a(String str, String str2) {
                C39452a.m155775a().mo127238a(str, str2);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44880c
            /* renamed from: a */
            public void mo143810a(Activity activity, Chat chat, String str, int i) {
                C39452a.m155775a().mo127228a(activity, chat, 2, str, i);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44880c
            /* renamed from: a */
            public void mo143811a(Chat.ChatMode chatMode, List<PickChatEntity> list, Chat chat, IGetDataCallback<Pair<Boolean, String>> iGetDataCallback) {
                CreateGroupChatModuleProvider.m157168a().checkPickEntityMemberCountBeforeCreate(chatMode, list, chat, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44881d getChatterDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44881d() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass13 */

            /* renamed from: b */
            private final String f101111b = C39603g.m157159a().getPassportDependency().mo143678i().mo172419a().getTenantId();

            /* renamed from: c */
            private final boolean f101112c = C39603g.m157159a().getPassportDependency().mo143678i().mo172429j();

            /* renamed from: d */
            private final boolean f101113d = C39603g.m157159a().getPassportDependency().mo143677h();

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public Chatter mo143779a() {
                return AbstractC39484a.m156004a().mo104256g().mo121186a();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: b */
            public Map<String, Chatter> mo143787b(List<String> list) {
                return AbstractC39484a.m156004a().mo104256g().mo121189a(list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public List<Chatter> mo143780a(List<String> list) {
                if (CollectionUtils.isEmpty(list)) {
                    return new ArrayList();
                }
                ArrayList arrayList = new ArrayList(AbstractC39484a.m156004a().mo104256g().mo121189a(list).values());
                AbstractC39484a.m156004a().mo104265p().mo121124a(arrayList);
                return arrayList;
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public boolean mo143785a(Chatter chatter) {
                if (!(!TextUtils.equals(chatter.getTenantId(), this.f101111b)) || this.f101112c || this.f101113d) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: b */
            public Map<String, ChatChatter> mo143786b(String str, List<String> list) {
                return AbstractC39484a.m156004a().mo104256g().mo121204b(str, list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public Map<String, ChatChatter> mo143781a(String str, List<String> list) {
                return AbstractC39484a.m156004a().mo104256g().mo121188a(str, list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public void mo143782a(String str, IGetDataCallback<Chatter> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104256g().mo121208b(str, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public void mo143784a(List<String> list, IGetDataCallback<Map<String, Chatter>> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104256g().mo121210b(list, iGetDataCallback);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44881d
            /* renamed from: a */
            public void mo143783a(String str, List<String> list, IGetDataCallback<Map<String, ChatChatter>> iGetDataCallback) {
                AbstractC39484a.m156004a().mo104256g().mo121199a(str, list, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44882e getChatterNameDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44882e() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass14 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44882e
            /* renamed from: b */
            public void mo143791b(List<ChatChatter> list) {
                AbstractC39484a.m156004a().mo104265p().mo121125b(list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44882e
            /* renamed from: a */
            public String mo143789a(Chatter chatter) {
                return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NICKNAME_WITH_ALIAS);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44882e
            /* renamed from: a */
            public void mo143790a(List<Chatter> list) {
                AbstractC39484a.m156004a().mo104265p().mo121124a(list);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44882e
            /* renamed from: a */
            public char mo143788a(Chatter chatter, Locale locale) {
                return AbstractC39484a.m156004a().mo104265p().mo121120a(chatter, locale);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44883f getContactDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44883f() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass10 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f
            /* renamed from: b */
            public List<SelectedData> mo143741b(Intent intent) {
                return C39633a.m157283b((ArrayList) intent.getSerializableExtra("selectedMember"));
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f
            /* renamed from: a */
            public List<String> mo143737a(Intent intent) {
                ArrayList arrayList = new ArrayList();
                for (com.ss.android.lark.contact.entity.SelectedData selectedData : (List) intent.getSerializableExtra("selectedMember")) {
                    if (selectedData != null) {
                        arrayList.add(selectedData.id);
                    }
                }
                return arrayList;
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f
            /* renamed from: a */
            public void mo143738a(Activity activity, List<SelectedData> list, int i) {
                C39603g.m157159a().getCoreDependency().mo143418a(activity, C39633a.m157282a(list), i);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f
            /* renamed from: a */
            public void mo143740a(C36516a aVar, List<SelectedData> list, int i) {
                C39603g.m157159a().getCoreDependency().mo143460a(aVar, C39633a.m157282a(list), i);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m157194a(List list, String str, final IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a aVar, IInitBuilder.IApplyCollabDialogBuilder aVar2) {
                IInitBuilder.IApplyCollabDialogBuilder aVar3 = (IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar2.mo105550a(list).mo105552a(str)).mo105555d("profile_add")).mo105551a(new IInitBuilder.IDialogBuilder.IDialogCallback() {
                    /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass10.C396181 */

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                    /* renamed from: a */
                    public void mo105556a() {
                        IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo158814a();
                        }
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                    /* renamed from: b */
                    public void mo105558b() {
                        IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo158816b();
                        }
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                    /* renamed from: a */
                    public void mo105557a(boolean z, String str) {
                        IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a aVar = aVar;
                        if (aVar != null) {
                            aVar.mo158815a(z, str);
                        }
                    }
                });
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44883f
            /* renamed from: a */
            public void mo143739a(Context context, String str, List<Contact> list, boolean z, IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a aVar) {
                C39603g.m157159a().getCoreDependency().mo143427a(context, new IInitBuilder(list, str, aVar) {
                    /* class com.ss.android.lark.integrator.im.groupmember.$$Lambda$GroupMemberManageModuleDependency$10$fZAPkjyGFRRXxhM1EnZCl1IJlRA */
                    public final /* synthetic */ List f$1;
                    public final /* synthetic */ String f$2;
                    public final /* synthetic */ IGroupMemberManageModuleDependency.AbstractC44883f.AbstractC44884a f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                    public final void init(IInitBuilder.IDialogBuilder cVar) {
                        GroupMemberManageModuleDependency.AnonymousClass10.this.m157194a(this.f$1, this.f$2, this.f$3, (IInitBuilder.IApplyCollabDialogBuilder) cVar);
                    }
                });
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44885g getCreateGroupDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44885g() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396318 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44885g
            /* renamed from: a */
            public void mo143814a(Context context, boolean z, boolean z2, List<SearchBaseInfo> list, String str, IGetDataCallback<Chat> iGetDataCallback, boolean z3) {
                CreateGroupChatModuleProvider.m157168a().createExternalGroupFromInternal(context, z, z2, list, str, iGetDataCallback, z3);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44886h getImageDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44886h() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396329 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44886h
            /* renamed from: a */
            public void mo143815a(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44887i getLanguageDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44887i() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396274 */

            /* renamed from: b */
            private final AbstractC29551a f101120b = C39603g.m157159a().getCoreDependency().mo143614t();

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44887i
            /* renamed from: a */
            public Boolean mo143801a() {
                return Boolean.valueOf(this.f101120b.mo105664e());
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44888j getMessageDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44888j() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass16 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44888j
            /* renamed from: a */
            public MessageInfo mo143796a(String str) {
                return AbstractC39484a.m156004a().mo104258i().mo121106b(str);
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44888j
            /* renamed from: a */
            public com.ss.android.lark.widget.richtext.RichText mo143797a(Message message) {
                return ((PostContent) message.getContent()).getRichText();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44888j
            /* renamed from: a */
            public List<String> mo143798a(boolean z, Message message) {
                if (z) {
                    return SecretChatMessageContentResolver.f87377a.mo122524e(message);
                }
                return ChatMessageContentResolver.f85521a.mo122524e(message);
            }
        };
    }

    public GroupMemberManageModule.AbstractC44876a getPerfEnterChatMonitor() {
        return new GroupMemberManageModule.AbstractC44876a() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396171 */
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44889k getSearchDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44889k() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396252 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44889k
            /* renamed from: a */
            public void mo143799a(String str, String str2, List<C44893a> list, IGetDataCallback<Void> iGetDataCallback) {
                ArrayList arrayList = new ArrayList();
                for (C44893a aVar : list) {
                    arrayList.add(new C53892a(aVar.mo158900a(), 1, aVar.mo158901b()));
                }
                C39603g.m157159a().getCoreDependency().mo143488a(str, new Scene(str2, Scene.Type.ADD_CHAT_CHATTERS), arrayList, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44890l getSettingDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44890l() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396263 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44890l
            /* renamed from: a */
            public boolean mo143800a() {
                if (C39603g.m157159a().getCoreDependency().mo143579e().mo105510a() == TimeFormatSetting.TimeFormat.TWENTY_FOUR_HOUR) {
                    return true;
                }
                return false;
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44891m getTeamDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44891m() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.AnonymousClass12 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44891m
            /* renamed from: a */
            public boolean mo143778a() {
                return C39776a.m157896a().mo188880c();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44891m
            /* renamed from: a */
            public void mo143777a(long j, IGetDataCallback<Team> iGetDataCallback) {
                C39776a.m157896a().mo188872a(j, true, iGetDataCallback);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public IGroupMemberManageModuleDependency.AbstractC44892n getUserAuthorityDependency() {
        return new IGroupMemberManageModuleDependency.AbstractC44892n() {
            /* class com.ss.android.lark.integrator.im.groupmember.GroupMemberManageModuleDependency.C396296 */

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44892n
            /* renamed from: a */
            public int mo143804a() {
                return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104075c();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44892n
            /* renamed from: b */
            public int mo143806b() {
                return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104079e();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44892n
            /* renamed from: c */
            public int mo143807c() {
                return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104080f();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44892n
            /* renamed from: d */
            public String mo143808d() {
                return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104073b();
            }

            @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency.AbstractC44892n
            /* renamed from: a */
            public void mo143805a(Context context, String str) {
                AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, (DialogInterface.OnDismissListener) null);
            }
        };
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public Locale getLanguageSetting() {
        return C39603g.m157159a().getCoreDependency().mo143609q();
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public boolean isCheckSecretPermission() {
        return CreateGroupChatModuleProvider.m157168a().isCheckSecretPermission();
    }

    public int getCreateExternalChatMaxMemberCount() {
        C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
        if (v != null) {
            return v.mo105656k();
        }
        return 100;
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public void setInSecretMode(boolean z) {
        CreateGroupChatModuleProvider.m157168a().setInSecretMode(z);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public boolean isFeatureGatingEnable(String str) {
        return C37239a.m146648b().mo136951a(str);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public boolean isInZenMode(long j) {
        return C39603g.m157159a().getCoreDependency().mo143499a(j);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public String getOpenedStatus(List<ChatterCustomStatus> list) {
        Chatter.ChatterCustomStatus a = C39603g.m157159a().getCoreDependency().mo143404a(ChatterCustomStatus.toPB(list));
        if (a != null) {
            return a.icon_key;
        }
        return null;
    }

    public void registerListenerToChatterPush(AbstractC44894c cVar) {
        $$Lambda$GroupMemberManageModuleDependency$YDPoaV5MnrWlJOU65Ap4iqLKcDY r0 = new AbstractC29623p() {
            /* class com.ss.android.lark.integrator.im.groupmember.$$Lambda$GroupMemberManageModuleDependency$YDPoaV5MnrWlJOU65Ap4iqLKcDY */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29623p
            public final void onPushChatter(com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
                AbstractC44894c.this.mo158912a(chatter);
            }
        };
        this.sPushChatterListenerMap.put(cVar, r0);
        AbstractC39484a.m156004a().mo104214a(r0);
    }

    public void unregisterListenerToChatterPush(AbstractC44894c cVar) {
        AbstractC29623p pVar = this.sPushChatterListenerMap.get(cVar);
        this.sPushChatterListenerMap.remove(cVar);
        if (pVar != null) {
            AbstractC39484a.m156004a().mo104238b(pVar);
        }
    }

    public void showPhoneIdentifyDialog(Context context2, String str) {
        C39742a.m157747a().mo176937b((Activity) context2, str);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public void startAppProfileByBotId(Context context2, String str) {
        C39603g.m157159a().getCoreDependency().mo143379E().mo105585c(context2, str);
    }

    public void openUrlFromQueryLarkOther(Context context2, String str) {
        C39603g.m157159a().getCoreDependency().mo143441a(context2, str, UrlParams.m108857a().mo105523a(), C39603g.m157159a().getCCMDependency().mo143303c());
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public void startContactsProfileActivity(Context context2, com.ss.android.lark.chat.entity.chatter.Chatter chatter) {
        AbstractC29542ad E = C39603g.m157159a().getCoreDependency().mo143379E();
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(2);
        E.mo105573a(context2, chatter.getId(), (String) null, contactSource);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public void startInviteInactiveParentListActivity(Context context2, String str, int i) {
        C39603g.m157159a().getCoreDependency().mo143447a(context2, "", str, "", i);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public void startContactsProfileActivityFromChatContact(Context context2, com.ss.android.lark.chat.entity.chatter.Chatter chatter, String str, String str2) {
        AbstractC29542ad E = C39603g.m157159a().getCoreDependency().mo143379E();
        ContactSource contactSource = new ContactSource();
        contactSource.setSourceType(2);
        contactSource.setSourceName(str2);
        E.mo105573a(context2, chatter.getId(), str, contactSource);
    }

    @Override // com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency
    public void openSendDingActivity(Context context2, C36516a aVar, Message message, List<String> list, int i) {
        C39587a.m157080a().mo135082a(context2, aVar, message, list, false, i);
    }
}
