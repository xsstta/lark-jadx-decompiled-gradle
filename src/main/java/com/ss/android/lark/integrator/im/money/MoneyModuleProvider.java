package com.ss.android.lark.integrator.im.money;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.bytedance.i18n.claymore.ClaymoreServiceLoader;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.biz.core.api.LoadParams;
import com.ss.android.lark.biz.core.api.contact.IInitBuilder;
import com.ss.android.lark.biz.im.api.ChatterNameDisplayRule;
import com.ss.android.lark.chat.api.IChatParser;
import com.ss.android.lark.chat.api.IChatterParser;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.entity.Contact;
import com.ss.android.lark.contact.entity.UserRelationResponse;
import com.ss.android.lark.dynamicconfig.C36882a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.audit.AuditModuleProvider;
import com.ss.android.lark.integrator.im.chat.AbstractC39484a;
import com.ss.android.lark.integrator.im.money.MoneyModuleProvider;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.mira.UIGetPluginCallback;
import com.ss.android.lark.money_export.IMoneyModule;
import com.ss.android.lark.money_export.IMoneyModuleDependency;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;

public class MoneyModuleProvider {
    /* renamed from: a */
    public static String m157726a() {
        return "com.ss.android.lark.plugin.money";
    }

    @ClaymoreImpl(IMoneyModuleDependency.class)
    public static class MoneyModuleDependency implements IMoneyModuleDependency {
        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.AbstractC48197a getAppConfigDependency() {
            return new IMoneyModuleDependency.AbstractC48197a() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397399 */
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.IAuditDependency getAuditDependency() {
            return new IMoneyModuleDependency.IAuditDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397322 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IAuditDependency
                public int getLoginUserAuthorityDeniedCode() {
                    return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104075c();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IAuditDependency
                public int getOtherUserAuthorityDeniedCode() {
                    return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104077d();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IAuditDependency
                public String getUserAuthorityControledTip() {
                    return AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104073b();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IAuditDependency
                public void onUserAuthorityDenied(Context context, String str) {
                    AuditModuleProvider.f100784c.mo143320a().mo104057e().mo104071a(context, str, (DialogInterface.OnDismissListener) null);
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.AbstractC48198b getBrowserDependency() {
            return new IMoneyModuleDependency.AbstractC48198b() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397333 */
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public String getCaijingHost() {
            return C36882a.m145560d();
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.IChatDependency getChatDependency() {
            return new IMoneyModuleDependency.IChatDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397366 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IChatDependency
                public IChatParser getChatParser() {
                    return AbstractC39484a.m156004a().mo104275z();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IChatDependency
                public IChatterParser getChatterParser() {
                    return AbstractC39484a.m156004a().mo104177A();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IChatDependency
                public boolean isGooglePlay() {
                    return C39603g.m157160b().isUsPackage();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IChatDependency
                public boolean isOverseaTenant() {
                    return C39603g.m157159a().getPassportDependency().mo143675f();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IChatDependency
                public String getDisplayNameByName(Chatter chatter) {
                    return AbstractC39484a.m156004a().mo104265p().mo121121a(chatter, ChatterNameDisplayRule.NAME);
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IChatDependency
                public void getLoginChatter(IGetDataCallback<Chatter> iGetDataCallback) {
                    AbstractC39484a.m156004a().mo104256g().mo121190a(iGetDataCallback);
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.IContactDependency getContactDependency() {
            return new IMoneyModuleDependency.IContactDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.AnonymousClass10 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IContactDependency
                public UserRelationResponse checkUserRelationShip(String str) {
                    return C39603g.m157159a().getCoreDependency().mo143592i(str);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m157730a(Contact contact, String str, final IMoneyModuleDependency.IDialogCallback iDialogCallback, IInitBuilder.IApplyCollabDialogBuilder aVar) {
                    IInitBuilder.IApplyCollabDialogBuilder aVar2 = (IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) ((IInitBuilder.IApplyCollabDialogBuilder) aVar.mo105548a(contact).mo105553b(str)).mo105555d("hongbao_confirm")).mo105551a(new IInitBuilder.IDialogBuilder.IDialogCallback() {
                        /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.AnonymousClass10.C397311 */

                        @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                        /* renamed from: a */
                        public void mo105556a() {
                            IMoneyModuleDependency.IDialogCallback iDialogCallback = iDialogCallback;
                            if (iDialogCallback != null) {
                                iDialogCallback.onCancel();
                            }
                        }

                        @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                        /* renamed from: b */
                        public void mo105558b() {
                            IMoneyModuleDependency.IDialogCallback iDialogCallback = iDialogCallback;
                            if (iDialogCallback != null) {
                                iDialogCallback.onDismiss();
                            }
                        }

                        @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder.IDialogBuilder.IDialogCallback
                        /* renamed from: a */
                        public void mo105557a(boolean z, String str) {
                            IMoneyModuleDependency.IDialogCallback iDialogCallback = iDialogCallback;
                            if (iDialogCallback != null) {
                                iDialogCallback.onConfirm(z, str);
                            }
                        }
                    });
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IContactDependency
                public void showApplyCollabDialog(Context context, String str, String str2, String str3, IMoneyModuleDependency.IDialogCallback iDialogCallback) {
                    C39603g.m157159a().getCoreDependency().mo143427a(context, new IInitBuilder(new Contact(str, null, str2), str3, iDialogCallback) {
                        /* class com.ss.android.lark.integrator.im.money.$$Lambda$MoneyModuleProvider$MoneyModuleDependency$10$ziM4fzomQxWbGMCXyPVspjdA5Yk */
                        public final /* synthetic */ Contact f$1;
                        public final /* synthetic */ String f$2;
                        public final /* synthetic */ IMoneyModuleDependency.IDialogCallback f$3;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                            this.f$3 = r4;
                        }

                        @Override // com.ss.android.lark.biz.core.api.contact.IInitBuilder
                        public final void init(IInitBuilder.IDialogBuilder cVar) {
                            MoneyModuleProvider.MoneyModuleDependency.AnonymousClass10.this.m157730a(this.f$1, this.f$2, this.f$3, (IInitBuilder.IApplyCollabDialogBuilder) cVar);
                        }
                    });
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public Context getContext() {
            return LarkContext.getApplication();
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.IFeatureGatingDependency getFeatureGatingDependency() {
            return new IMoneyModuleDependency.IFeatureGatingDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397388 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IFeatureGatingDependency
                public boolean isEnable(String str) {
                    return C37239a.m146648b().mo136951a(str);
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IFeatureGatingDependency
                public boolean isEnable(String str, boolean z) {
                    return C37239a.m146648b().mo136952a(str, z);
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.IImageDependency getImageDependency() {
            return new IMoneyModuleDependency.IImageDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397355 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IImageDependency
                public void loadAvatarImage(Context context, String str, String str2, ImageView imageView, int i, int i2) {
                    C39603g.m157159a().getCoreDependency().mo143425a(context, imageView, str, str2, new LoadParams().mo105413a(i).mo105422b(i2));
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.ILanguageDependency getLanguageDependency() {
            return new IMoneyModuleDependency.ILanguageDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397301 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.ILanguageDependency
                public Locale getCacheLanguageSetting() {
                    return C39603g.m157159a().getCoreDependency().mo143610r();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.ILanguageDependency
                public Locale getLanguageSetting() {
                    return C39603g.m157159a().getCoreDependency().mo143609q();
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.ILoginDependency getLoginDependency() {
            return new IMoneyModuleDependency.ILoginDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397344 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.ILoginDependency
                public String getLoginUserId() {
                    return C39603g.m157159a().getPassportDependency().mo143668b();
                }

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.ILoginDependency
                public boolean isPrimaryHost() {
                    return C39603g.m157159a().getPassportDependency().mo143678i().mo172430k();
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public IMoneyModuleDependency.IMoneyDependency getMoneyDependency() {
            return new IMoneyModuleDependency.IMoneyDependency() {
                /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.MoneyModuleDependency.C397377 */

                @Override // com.ss.android.lark.money_export.IMoneyModuleDependency.IMoneyDependency
                public void onWebViewCreate(WebView webView) {
                    if (webView != null) {
                        C39603g.m157159a().getCoreDependency().mo143458a(webView, "Wallet");
                    }
                }
            };
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public String getAppId() {
            return String.valueOf(C29410a.m108287a().mo104277a());
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public String getDeviceId() {
            return C39603g.m157159a().getPassportDependency().mo143676g();
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public void initBytecertSdk() {
            C39603g.m157159a().getCoreDependency().mo143378D();
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public boolean isBoe() {
            return C39603g.m157159a().getPassportDependency().mo143687r();
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public void checkPhoneNumberValid(IGetDataCallback<Boolean> iGetDataCallback) {
            C39603g.m157159a().getPassportDependency().mo143660a(iGetDataCallback);
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public void openAddPhoneNumberPage(Context context) {
            C39603g.m157159a().getPassportDependency().mo143657a(context);
        }

        @Override // com.ss.android.lark.money_export.IMoneyModuleDependency
        public void openBulletSchema(Context context, String str) {
            C39603g.m157159a().getOpenPlatformDependency().mo143643a(context, str);
        }
    }

    /* renamed from: a */
    public static void m157727a(UIGetPluginCallback<IMoneyModule> dVar) {
        if (C39603g.m157159a().getOpenFeatureDependency().mo143637a()) {
            MiraModule.m205160a("com.ss.android.lark.plugin.money", IMoneyModule.class, "com.ss.android.lark.money.MoneyModule", dVar);
            return;
        }
        IMoneyModule iMoneyModule = (IMoneyModule) ClaymoreServiceLoader.loadFirstOrNull(IMoneyModule.class);
        if (iMoneyModule != null) {
            Log.m165389i("MoneyModuleProvider", "claymore service: $serviceImpl load success");
            dVar.onSuccess(iMoneyModule);
            return;
        }
        Log.m165389i("MoneyModuleProvider", "claymore service: $serviceImpl load failed");
        dVar.onError(new ErrorResult("claymore service find error"));
    }

    /* renamed from: a */
    public static boolean m157728a(final Context context, final String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.startsWith("sslocal://lynxview") && !str.startsWith("sslocal://lynx_page") && !str.startsWith("sslocal://lynxview_page") && !str.startsWith("lark://lynxview") && !str.startsWith("lark://lynx_page") && !str.startsWith("lark://lynxview_page") && !str.contains("//remote_debug_lynx")) {
            return false;
        }
        m157727a(new UIGetPluginCallback<IMoneyModule>() {
            /* class com.ss.android.lark.integrator.im.money.MoneyModuleProvider.C397291 */

            @Override // com.larksuite.framework.callback.UIGetDataCallback
            public void onErrored(ErrorResult errorResult) {
            }

            /* renamed from: a */
            public void onSuccessed(IMoneyModule iMoneyModule) {
                iMoneyModule.openLynxPage(context, str);
            }
        });
        return true;
    }
}
