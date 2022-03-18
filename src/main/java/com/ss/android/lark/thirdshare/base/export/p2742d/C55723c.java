package com.ss.android.lark.thirdshare.base.export.p2742d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.p1787a.C36516a;
import com.ss.android.lark.desktopmode.p1787a.C36519d;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.OnShareCallback;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.base.export.TransActivity;
import com.ss.android.lark.thirdshare.base.export.TransActivityDelegate4Share;
import com.ss.android.lark.thirdshare.base.export.dialog.BottomShareView;
import com.ss.android.lark.thirdshare.base.export.downgrade.ShareDowngradePanelCallback;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55699a;
import com.ss.android.lark.thirdshare.base.export.p2739a.AbstractC55700b;
import com.ss.android.lark.thirdshare.base.export.p2740b.C55708d;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.io.File;
import java.util.Map;

/* renamed from: com.ss.android.lark.thirdshare.base.export.d.c */
public class C55723c {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m215817a(ShareEntity shareEntity, Boolean bool) {
        if (shareEntity.getCallback() == null) {
            return;
        }
        if (bool.booleanValue()) {
            shareEntity.getCallback().onSuccess(ShareActionType.SYS);
        } else {
            shareEntity.getCallback().onFailed(ShareActionType.SYS, OnShareCallback.SAVE_FAILED.appendMsg("Share image by system failed."));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m215816a(ShareEntity shareEntity, ApiUtils.AbstractC57748a aVar, Boolean bool) {
        if (!bool.booleanValue()) {
            m215821b(shareEntity);
        } else {
            aVar.consume(true);
        }
    }

    /* renamed from: a */
    public static AbstractC55700b m215807a() {
        return ((AbstractC55699a) ApiUtils.getApi(AbstractC55699a.class)).getDep();
    }

    /* renamed from: b */
    public static boolean m215823b() {
        if ((aj.m224263a().getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static void m215826c(ShareEntity shareEntity) {
        C55680a.m215712a((CharSequence) shareEntity.getContent());
        if (shareEntity.getCallback() != null) {
            shareEntity.getCallback().onSuccess(ShareActionType.COPY);
        }
    }

    /* renamed from: b */
    private static void m215821b(ShareEntity shareEntity) {
        if (shareEntity.isTextShare()) {
            C55680a.m215713a(shareEntity.getDowngradeContent());
            if (shareEntity.getCallback() != null) {
                shareEntity.getCallback().onSuccess(ShareActionType.SYS);
            }
        } else if (shareEntity.isImageShare()) {
            C55680a.m215711a(shareEntity.getImageFile(), new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.thirdshare.base.export.p2742d.$$Lambda$c$SYYQr8reD6t9iEQAyyDbhIIch0 */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    C55723c.m215827c(ShareEntity.this, (Boolean) obj);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m215813a(ShareEntity shareEntity) {
        TransActivity.m215740a(new TransActivity.AbstractC55697a() {
            /* class com.ss.android.lark.thirdshare.base.export.p2742d.$$Lambda$c$vS8iKHiZJjwA_wNo2DydS5GCJo */

            @Override // com.ss.android.lark.thirdshare.base.export.TransActivity.AbstractC55697a
            public final void accept(Object obj) {
                ((Intent) obj).putExtra((ShareEntity) "extra_share_entity", (Intent) ShareEntity.this);
            }
        }, new TransActivityDelegate4Share());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m215822b(ShareEntity shareEntity, Boolean bool) {
        if (!bool.booleanValue()) {
            m215821b(shareEntity);
        } else if (shareEntity.getCallback() != null) {
            shareEntity.getCallback().onSuccess(ShareActionType.SYS);
        }
    }

    /* renamed from: a */
    public static void m215808a(Context context, ShareEntity shareEntity) {
        if (TextUtils.isEmpty(shareEntity.getContentType())) {
            shareEntity.getCallback().onFailed(shareEntity.getCurActionType(), OnShareCallback.ILLEGAL_CONFIG_PARAM);
            ViewUtils.m224144a();
        } else if (shareEntity.isCrossProcess()) {
            m215813a(shareEntity);
        } else {
            m215818b(context, shareEntity);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m215827c(ShareEntity shareEntity, Boolean bool) {
        if (shareEntity.getCallback() == null) {
            return;
        }
        if (bool.booleanValue()) {
            shareEntity.getCallback().onSuccess(ShareActionType.SYS);
        } else {
            shareEntity.getCallback().onFailed(ShareActionType.SYS, OnShareCallback.SAVE_FAILED.appendMsg("Share image by system failed."));
        }
    }

    /* renamed from: b */
    private static void m215818b(Context context, ShareEntity shareEntity) {
        if (shareEntity.getCurActionType() != ShareActionType.UNKNOWN) {
            m215809a(context, shareEntity, shareEntity.getCurActionType());
        } else if (shareEntity.getShareActionTypes().size() == 1) {
            shareEntity.setCurActionType(shareEntity.getShareActionTypes().get(0));
            m215809a(context, shareEntity, shareEntity.getShareActionTypes().get(0));
        } else if (DesktopUtil.m144301a(aj.m224263a())) {
            C36516a b = C36519d.m144080a().mo134817b(ContainerType.Float);
            AbstractC55700b.AbstractC55701a a = m215807a().mo189814a();
            if (a == null || !a.mo189818a(context) || b == null) {
                C55708d.m215767a(context, shareEntity);
                return;
            }
            View view = b.getView();
            if (view != null) {
                BottomShareView.m215758a((ViewGroup) view.getRootView(), shareEntity);
            }
        } else {
            C55708d.m215767a(context, shareEntity);
        }
    }

    /* renamed from: c */
    private static boolean m215828c(ShareEntity shareEntity, ShareActionType shareActionType) {
        if (C55680a.m215714a(shareActionType)) {
            return false;
        }
        if (shareEntity.getCallback() == null) {
            return true;
        }
        shareEntity.getCallback().onFailed(shareActionType, OnShareCallback.NOT_INSTALLED.appendMsg(shareActionType.name()));
        return true;
    }

    /* renamed from: b */
    private static boolean m215824b(ShareEntity shareEntity, ShareActionType shareActionType) {
        if (shareActionType.isThirdAppShareType()) {
            return false;
        }
        OnShareCallback.ShareError shareError = OnShareCallback.ILLEGAL_CONFIG_PARAM;
        C55720a.m215799b(shareError.toString(shareActionType + " is not third share type."));
        if (shareEntity.getCallback() == null) {
            return true;
        }
        shareEntity.getCallback().onFailed(shareActionType, OnShareCallback.ILLEGAL_CONFIG_PARAM);
        return true;
    }

    /* renamed from: a */
    private static void m215815a(ShareEntity shareEntity, ShareActionType shareActionType) {
        if (m215824b(shareEntity, shareActionType) || m215828c(shareEntity, shareActionType)) {
            return;
        }
        if (shareEntity.isTextShare()) {
            C55680a.m215708a(shareActionType, shareEntity.getDowngradeContent(), new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.thirdshare.base.export.p2742d.$$Lambda$c$2e8XUJGuPQPXQ6_lYfprDFU3WMk */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    C55723c.m215822b(ShareEntity.this, (Boolean) obj);
                }
            });
        } else if (shareEntity.isImageShare()) {
            C55680a.m215707a(shareActionType, shareEntity.getImageFile(), new ApiUtils.AbstractC57748a(new ApiUtils.AbstractC57748a() {
                /* class com.ss.android.lark.thirdshare.base.export.p2742d.$$Lambda$c$mtnj_IH5knlyGCPCDsXeYS_ME3s */

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    C55723c.m215817a(ShareEntity.this, (Boolean) obj);
                }
            }) {
                /* class com.ss.android.lark.thirdshare.base.export.p2742d.$$Lambda$c$3eoE9gqHV2q6tAeYz8D6nXWvhA */
                public final /* synthetic */ ApiUtils.AbstractC57748a f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
                public final void consume(Object obj) {
                    C55723c.m215816a(ShareEntity.this, this.f$1, (Boolean) obj);
                }
            });
        } else if (shareEntity.isMiniAppShare()) {
            if (m215823b()) {
                ViewUtils.m224150a("sysShare didn't support miniApp");
            }
            Log.m165383e("ThirdShare", "WxSdk doesn't exist.");
        }
    }

    /* renamed from: a */
    private static void m215811a(Context context, final ShareEntity shareEntity, final Runnable runnable) {
        C55680a.m215700a(context, shareEntity.getImageFile(), new C55680a.AbstractC55692a() {
            /* class com.ss.android.lark.thirdshare.base.export.p2742d.C55723c.C557241 */

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55692a
            public void noNoPermission() {
                if (shareEntity.getCallback() != null) {
                    shareEntity.getCallback().onFailed(shareEntity.getCurActionType(), OnShareCallback.SAVE_FAILED.appendMsg("No storage permission."));
                }
            }

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveFailed(String str) {
                if (shareEntity.getCallback() != null) {
                    shareEntity.getCallback().onFailed(shareEntity.getCurActionType(), OnShareCallback.SAVE_FAILED.appendMsg(str));
                }
            }

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveSuccess(File file) {
                if (shareEntity.getCallback() != null) {
                    shareEntity.getCallback().onSuccess(shareEntity.getCurActionType());
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: b */
    private static void m215819b(Context context, ShareEntity shareEntity, ShareActionType shareActionType) {
        if (!m215824b(shareEntity, shareActionType) && !m215828c(shareEntity, shareActionType)) {
            AbstractC55700b a = m215807a();
            if (a != null) {
                a.mo189815a(context, shareEntity);
            } else if (shareEntity.getCallback() != null) {
                shareEntity.getCallback().onFailed(shareActionType, OnShareCallback.BASE_DEP_API_IS_NULL);
            }
            if (shareEntity.getCallback() != null) {
                shareEntity.getCallback().onSuccess(shareActionType);
            }
        }
    }

    /* renamed from: a */
    private static void m215809a(Context context, ShareEntity shareEntity, ShareActionType shareActionType) {
        if (shareEntity.getCallback() == null || !shareEntity.getCallback().intercept(shareActionType)) {
            Map<ShareActionType, String> answerTypes = shareEntity.getAnswerTypes();
            if (answerTypes != null) {
                String str = answerTypes.get(shareActionType);
                if (!TextUtils.isEmpty(str)) {
                    m215810a(context, shareEntity, shareActionType, str);
                    return;
                }
            }
            AbstractC55700b.AbstractC55701a a = m215807a().mo189814a();
            if (a != null && !a.mo189817a() && ShareActionType.WX.equals(shareActionType)) {
                m215815a(shareEntity, ShareActionType.WX);
            } else if (shareActionType.isThirdAppShareType()) {
                m215819b(context, shareEntity, shareActionType);
            } else if (ShareActionType.SYS.equals(shareActionType)) {
                m215821b(shareEntity);
            } else if (ShareActionType.COPY.equals(shareActionType)) {
                m215826c(shareEntity);
            } else if (ShareActionType.SAVE.equals(shareActionType)) {
                m215811a(context, shareEntity, (Runnable) null);
            } else {
                shareActionType.getShareItemInfo().mListener.onClickReal(context, shareEntity);
            }
        }
    }

    /* renamed from: c */
    private static void m215825c(Context context, final ShareEntity shareEntity, final ShareActionType shareActionType) {
        if (m215824b(shareEntity, shareActionType) || m215828c(shareEntity, shareActionType)) {
            return;
        }
        if (shareEntity.isTextShare()) {
            ShareEntity.TextDowngradePanel textDowngradePanel = shareEntity.getTextDowngradePanel();
            C55680a.m215701a(context, textDowngradePanel.getDowngradePanelCopyContent(), textDowngradePanel.getDowngradePanelTitle(), shareActionType, new ShareDowngradePanelCallback() {
                /* class com.ss.android.lark.thirdshare.base.export.p2742d.C55723c.C557252 */

                @Override // com.ss.android.lark.thirdshare.base.export.downgrade.ShareDowngradePanelCallback
                public void onSuccess(ShareActionType shareActionType) {
                    if (shareEntity.getCallback() != null) {
                        shareEntity.getCallback().onSuccess(shareActionType);
                    }
                }

                @Override // com.ss.android.lark.thirdshare.base.export.downgrade.ShareDowngradePanelCallback
                public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                    if (shareEntity.getCallback() != null) {
                        shareEntity.getCallback().onFailed(shareActionType, shareError);
                    }
                }
            });
        } else if (shareEntity.isImageShare()) {
            ShareEntity.ImageDowngradePanel imageDowngradePanel = shareEntity.getImageDowngradePanel();
            String downgradePanelTitle = imageDowngradePanel.getDowngradePanelTitle();
            if (imageDowngradePanel.isNeedSave2Album()) {
                m215811a(context, shareEntity, new Runnable(context, downgradePanelTitle, shareEntity, shareActionType) {
                    /* class com.ss.android.lark.thirdshare.base.export.p2742d.$$Lambda$c$AIRzxeAP_QUHEVNfcfwj7ADJtY */
                    public final /* synthetic */ Context f$0;
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ ShareEntity f$2;
                    public final /* synthetic */ ShareActionType f$3;

                    {
                        this.f$0 = r1;
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C55723c.m215812a(this.f$0, this.f$1, this.f$2, this.f$3);
                    }
                });
            } else {
                m215812a(context, downgradePanelTitle, shareEntity, shareActionType);
            }
        }
    }

    /* renamed from: a */
    private static void m215810a(Context context, ShareEntity shareEntity, ShareActionType shareActionType, String str) {
        if ("downgrade_to_system_share".equals(str)) {
            m215821b(shareEntity);
        }
        if ("downgrade_to_system_share_by_specific_app".equals(str)) {
            m215815a(shareEntity, shareActionType);
        }
        if ("downgrade_to_wakeup_by_tip".equals(str)) {
            m215825c(context, shareEntity, shareActionType);
        }
        if (shareEntity.getCallback() != null) {
            shareEntity.getCallback().onFailed(shareActionType, OnShareCallback.INTERCEPT_DOWNGRADE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m215812a(Context context, String str, final ShareEntity shareEntity, final ShareActionType shareActionType) {
        C55680a.m215701a(context, "", str, shareActionType, new ShareDowngradePanelCallback() {
            /* class com.ss.android.lark.thirdshare.base.export.p2742d.C55723c.C557263 */

            @Override // com.ss.android.lark.thirdshare.base.export.downgrade.ShareDowngradePanelCallback
            public void onSuccess(ShareActionType shareActionType) {
            }

            @Override // com.ss.android.lark.thirdshare.base.export.downgrade.ShareDowngradePanelCallback
            public void onFailed(ShareActionType shareActionType, OnShareCallback.ShareError shareError) {
                if (shareEntity.getCallback() != null) {
                    shareEntity.getCallback().onFailed(shareActionType, shareError);
                }
            }
        });
    }
}
