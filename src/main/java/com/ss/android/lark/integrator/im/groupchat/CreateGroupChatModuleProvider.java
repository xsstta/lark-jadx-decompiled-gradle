package com.ss.android.lark.integrator.im.groupchat;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.bytedance.lark.pb.basic.v1.LocationContent;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.C29407b;
import com.ss.android.lark.biz.core.api.C29550b;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.SelectedData;
import com.ss.android.lark.create.groupchat.ICreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.C36260c;
import com.ss.android.lark.create.groupchat.dto.SelectedData;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider;
import com.ss.android.lark.location.dto.LarkLocation;
import com.ss.android.lark.location.listener.C41586e;
import com.ss.android.lark.location.p2146b.AbstractC41567g;
import com.ss.android.lark.parser.internal.ModelParserPickChatEntity;
import com.ss.android.lark.passport.signinsdk_api.account.TenantInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.Tenant;
import com.ss.android.lark.searchcommon.dto.C53892a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CreateGroupChatModuleProvider {

    @ClaymoreImpl(AbstractC36248c.class)
    public static class ICreateGroupChatModuleDependencyImpl implements AbstractC36248c {
        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36257i getMapDependency() {
            return $$Lambda$CreateGroupChatModuleProvider$ICreateGroupChatModuleDependencyImpl$ghJTV6_L42IqPNhAVplA12jByw.INSTANCE;
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36249a getAccountDependency() {
            return new AbstractC36248c.AbstractC36249a() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396114 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36249a
                /* renamed from: b */
                public String mo133721b() {
                    return C39603g.m157159a().getPassportDependency().mo143668b();
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36249a
                /* renamed from: a */
                public boolean mo133719a() {
                    return C39603g.m157159a().getPassportDependency().mo143678i().mo172429j();
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36249a
                /* renamed from: c */
                public boolean mo133722c() {
                    if (C39603g.m157159a().getPassportDependency().mo143678i().mo172421b().getTenantTag() != 0) {
                        return true;
                    }
                    return false;
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36249a
                /* renamed from: a */
                public boolean mo133720a(List<String> list) {
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

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36250b getAppConfigDependency() {
            return new AbstractC36248c.AbstractC36250b() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396158 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36250b
                /* renamed from: a */
                public int mo133723a() {
                    return C39603g.m157159a().getCoreDependency().mo143617w();
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36250b
                /* renamed from: a */
                public boolean mo133724a(String str) {
                    return C39603g.m157159a().getCoreDependency().mo143586f(str);
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36251c getAuditDependency() {
            return new AbstractC36248c.AbstractC36251c() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396092 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36251c
                /* renamed from: a */
                public int mo133725a() {
                    return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104079e();
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36252d getChatDependency() {
            return new AbstractC36248c.AbstractC36252d() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396103 */

                /* renamed from: a */
                C29407b f101084a = AbstractC39484a.m156004a();

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public IChatParser mo133726a() {
                    return this.f101084a.mo104275z();
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: c */
                public void mo133735c(String str) {
                    this.f101084a.mo104253d(str);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public Chat mo133727a(String str) {
                    return this.f101084a.mo104251d().mo120985a(str);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public List<PickEntities> mo133728a(Collection<PickChatEntity> collection) {
                    return ModelParserPickChatEntity.m222170a(collection);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: b */
                public Chat mo133733b(String str) {
                    return this.f101084a.mo104251d().mo121046c(Collections.singletonList(str)).get(str);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public void mo133729a(Context context, String str) {
                    this.f101084a.mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105933c("group_create").mo105929a());
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: b */
                public void mo133734b(Context context, String str) {
                    this.f101084a.mo104206a(context, ChatBundle.m109259a().mo105931b(str).mo105933c("group_create").mo105929a());
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public void mo133731a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
                    this.f101084a.mo104251d().mo121036b(str, iGetDataCallback);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public void mo133732a(boolean z, String str) {
                    this.f101084a.mo104230a(z, str);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36252d
                /* renamed from: a */
                public void mo133730a(Context context, String str, List<Contact> list) {
                    Bundle bundle = new Bundle();
                    if (list != null && !list.isEmpty()) {
                        bundle.putParcelableArrayList("option_bundle_contacts_to_apply", new ArrayList<>(list));
                    }
                    this.f101084a.mo104206a(context, ChatBundle.m109259a().mo105927a(str).mo105923a(ChatBundle.SourceType.PROFILE).mo105933c("group_create").mo105922a(bundle).mo105929a());
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36253e getChatterDependency() {
            return new AbstractC36248c.AbstractC36253e() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396136 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36253e
                /* renamed from: a */
                public Map<String, Chatter> mo133736a(List<String> list) {
                    return AbstractC39484a.m156004a().mo104256g().mo121189a(list);
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36254f getContactDependency() {
            return new AbstractC36248c.AbstractC36254f() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396125 */

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r12v0, types: [com.ss.android.lark.create.groupchat.dto.SelectedData] */
                /* JADX WARNING: Unknown variable types count: 1 */
                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36254f
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.util.List<com.ss.android.lark.create.groupchat.dto.SelectedData> mo133737a(android.content.Intent r14) {
                    /*
                        r13 = this;
                        java.lang.String r0 = "selectedMember"
                        java.io.Serializable r14 = r14.getSerializableExtra(r0)
                        java.util.ArrayList r14 = (java.util.ArrayList) r14
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.util.Iterator r14 = r14.iterator()
                    L_0x0011:
                        boolean r1 = r14.hasNext()
                        if (r1 == 0) goto L_0x004a
                        java.lang.Object r1 = r14.next()
                        com.ss.android.lark.contact.entity.SelectedData r1 = (com.ss.android.lark.contact.entity.SelectedData) r1
                        r2 = 0
                        if (r1 != 0) goto L_0x0021
                        goto L_0x0046
                    L_0x0021:
                        com.ss.android.lark.create.groupchat.dto.SelectedData r12 = new com.ss.android.lark.create.groupchat.dto.SelectedData
                        com.ss.android.lark.contact.entity.SelectedData$DataType r3 = r1.dataType
                        if (r3 != 0) goto L_0x0028
                        goto L_0x0032
                    L_0x0028:
                        com.ss.android.lark.contact.entity.SelectedData$DataType r2 = r1.dataType
                        int r2 = r2.getNumber()
                        com.ss.android.lark.create.groupchat.dto.SelectedData$DataType r2 = com.ss.android.lark.create.groupchat.dto.SelectedData.DataType.forNumber(r2)
                    L_0x0032:
                        r4 = r2
                        java.lang.String r5 = r1.id
                        java.lang.String r6 = r1.name
                        java.lang.String r7 = r1.avatarKey
                        boolean r8 = r1.isRegistered
                        boolean r9 = r1.isShowDescription
                        java.lang.String r10 = r1.description
                        int r11 = r1.descriptionDrawable
                        r3 = r12
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                        r2 = r12
                    L_0x0046:
                        r0.add(r2)
                        goto L_0x0011
                    L_0x004a:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396125.mo133737a(android.content.Intent):java.util.List");
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36254f
                /* renamed from: a */
                public void mo133738a(Activity activity, List<SelectedData> list, int i) {
                    ArrayList arrayList = new ArrayList();
                    for (SelectedData selectedData : list) {
                        arrayList.add(CreateGroupChatModuleProvider.m157167a(selectedData));
                    }
                    C39603g.m157159a().getCoreDependency().mo143418a(activity, arrayList, i);
                }

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36254f
                /* renamed from: a */
                public void mo133739a(Fragment fragment, List<SelectedData> list, int i) {
                    ArrayList arrayList = new ArrayList();
                    for (SelectedData selectedData : list) {
                        arrayList.add(CreateGroupChatModuleProvider.m157167a(selectedData));
                    }
                    C39603g.m157159a().getCoreDependency().mo143460a(fragment, arrayList, i);
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36255g getGuideDependency() {
            return new AbstractC36248c.AbstractC36255g() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.AnonymousClass10 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36255g
                /* renamed from: a */
                public void mo133740a(String str, boolean z) {
                    C39603g.m157159a().getCoreDependency().mo143501a(str);
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36256h getMainDependency() {
            return new AbstractC36248c.AbstractC36256h() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396169 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36256h
                /* renamed from: a */
                public void mo133741a(Context context, String str, Bundle bundle) {
                    C39603g.m157159a().getCoreDependency().mo143386L().mo105707b(context, str, bundle);
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36258j getSearchDependency() {
            return new AbstractC36248c.AbstractC36258j() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396147 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36258j
                /* renamed from: a */
                public void mo133743a(String str, String str2, List<C36260c> list, IGetDataCallback<Void> iGetDataCallback) {
                    ArrayList arrayList = new ArrayList();
                    for (C36260c cVar : list) {
                        arrayList.add(new C53892a(cVar.mo133801a(), cVar.mo133802b(), cVar.mo133803c()));
                    }
                    C39603g.m157159a().getCoreDependency().mo143488a(str, new Scene(str2, Scene.Type.ADD_CHAT_CHATTERS), arrayList, iGetDataCallback);
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC36248c.AbstractC36259k getSettingDependency() {
            return new AbstractC36248c.AbstractC36259k() {
                /* class com.ss.android.lark.integrator.im.groupchat.CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.C396081 */

                @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c.AbstractC36259k
                /* renamed from: a */
                public boolean mo133744a() {
                    return C39603g.m157159a().getCoreDependency().mo143593i();
                }
            };
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public AbstractC32812c getPerfEnterChatMonitor() {
            return C39603g.m157159a().getCoreDependency().aj();
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public boolean isAllowSecret() {
            return C39603g.m157159a().getCoreDependency().mo143618x();
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public boolean isSecretChatEnable() {
            C29550b v = C39603g.m157159a().getCoreDependency().mo143616v();
            if (v == null) {
                return false;
            }
            return v.mo105653h();
        }

        public String getDisplayNameForAliasNameRule(Chatter chatter) {
            return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.ALIAS_NAME);
        }

        @Override // com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c
        public boolean isFeatureGatingEnable(String str) {
            return C37239a.m146648b().mo136951a(str);
        }

        static /* synthetic */ void lambda$getMapDependency$1(Context context, IGetDataCallback iGetDataCallback) {
            if (!C39603g.m157159a().getCoreDependency().mo143500a(context, new AbstractC41567g.AbstractC41568a() {
                /* class com.ss.android.lark.integrator.im.groupchat.$$Lambda$CreateGroupChatModuleProvider$ICreateGroupChatModuleDependencyImpl$LIKmqeVnVSmsLRuJk6JQy5m5c7I */

                @Override // com.ss.android.lark.location.p2146b.AbstractC41567g.AbstractC41568a
                public final void onLocationChange(LarkLocation larkLocation) {
                    CreateGroupChatModuleProvider.ICreateGroupChatModuleDependencyImpl.lambda$null$0(IGetDataCallback.this, larkLocation);
                }
            })) {
                iGetDataCallback.onError(new ErrorResult(9029));
            }
        }

        static /* synthetic */ void lambda$null$0(IGetDataCallback iGetDataCallback, LarkLocation larkLocation) {
            if (larkLocation == null) {
                iGetDataCallback.onError(new ErrorResult(9029));
                return;
            }
            LocationContent.C15039a aVar = new LocationContent.C15039a();
            double latitude = larkLocation.getLatitude();
            double longitude = larkLocation.getLongitude();
            double[] dArr = {latitude, longitude};
            if (!C39603g.m157160b().isUsPackage()) {
                dArr = C41586e.m165041b(latitude, longitude);
            }
            aVar.f39787b = String.valueOf(dArr[0]);
            aVar.f39786a = String.valueOf(dArr[1]);
            iGetDataCallback.onSuccess(aVar.build());
        }

        public void loadImage(Context context, String str, String str2, ImageView imageView, int i, int i2) {
            C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(UIHelper.dp2px((float) i)).mo105422b(UIHelper.dp2px((float) i2)));
        }
    }

    /* renamed from: a */
    public static ICreateGroupChatModule m157168a() {
        return (ICreateGroupChatModule) ClaymoreServiceLoader.loadFirst(ICreateGroupChatModule.class);
    }

    /* renamed from: a */
    public static com.ss.android.lark.contact.entity.SelectedData m157167a(SelectedData selectedData) {
        SelectedData.DataType dataType = null;
        if (selectedData == null) {
            return null;
        }
        if (selectedData.dataType != null) {
            dataType = SelectedData.DataType.forNumber(selectedData.dataType.getNumber());
        }
        return new com.ss.android.lark.contact.entity.SelectedData(dataType, selectedData.id, selectedData.name, selectedData.avatarKey, selectedData.isRegistered, selectedData.isShowDescription, selectedData.description, selectedData.descriptionDrawable);
    }
}
