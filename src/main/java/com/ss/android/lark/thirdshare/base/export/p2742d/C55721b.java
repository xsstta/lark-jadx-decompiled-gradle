package com.ss.android.lark.thirdshare.base.export.p2742d;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26310o;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.aj;
import java.io.File;

/* renamed from: com.ss.android.lark.thirdshare.base.export.d.b */
public class C55721b {
    /* renamed from: a */
    public static void m215806a(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        Intent createChooser = Intent.createChooser(intent, UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleContactsShareTo));
        createChooser.setFlags(268435456);
        aj.m224263a().startActivity(createChooser);
    }

    /* renamed from: a */
    private static ComponentName m215800a(ShareActionType shareActionType) {
        if (shareActionType == null) {
            return null;
        }
        if (ShareActionType.WX.equals(shareActionType)) {
            return new ComponentName(ShareActionType.WX.getPkgName(), "com.tencent.mm.ui.tools.ShareImgUI");
        }
        if (ShareActionType.WX_TIMELINE.equals(shareActionType)) {
            return new ComponentName(ShareActionType.WX.getPkgName(), "com.tencent.mm.ui.tools.ShareToTimeLineUI");
        }
        if (ShareActionType.QQ.equals(shareActionType)) {
            return new ComponentName(ShareActionType.QQ.getPkgName(), "com.tencent.mobileqq.activity.JumpActivity");
        }
        if (ShareActionType.WB.equals(shareActionType)) {
            return new ComponentName(ShareActionType.WB.getPkgName(), "com.sina.weibo.composerinde.ComposerDispatchActivity");
        }
        return null;
    }

    /* renamed from: a */
    public static void m215805a(File file, ApiUtils.AbstractC57748a<Boolean> aVar) {
        Uri a = C26310o.m95259a(aj.m224263a(), file);
        if (a == null) {
            Log.m165383e("ThirdShare", "getUriForFile failed.");
            if (aVar != null) {
                aVar.consume(false);
                return;
            }
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", a);
        intent.setType("image/*");
        Intent createChooser = Intent.createChooser(intent, UIHelper.getString(R.string.Lark_UserGrowth_InvitePeopleContactsShareTo));
        createChooser.setFlags(268435456);
        aj.m224263a().startActivity(createChooser);
        if (aVar != null) {
            aVar.consume(true);
        }
    }

    /* renamed from: a */
    public static void m215802a(ShareActionType shareActionType, File file, ApiUtils.AbstractC57748a<Boolean> aVar) {
        m215803a(shareActionType, file, "", aVar);
    }

    /* renamed from: a */
    public static void m215801a(final ShareActionType shareActionType, Bitmap bitmap, final ApiUtils.AbstractC57748a<Boolean> aVar) {
        C55680a.m215704a(bitmap, new C55680a.AbstractC55693b() {
            /* class com.ss.android.lark.thirdshare.base.export.p2742d.C55721b.C557221 */

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveFailed(String str) {
                Log.m165383e("ThirdShare", str);
            }

            @Override // com.ss.android.lark.thirdshare.base.C55680a.AbstractC55693b
            public void onSaveSuccess(File file) {
                C55721b.m215802a(shareActionType, file, aVar);
            }
        });
    }

    /* renamed from: a */
    public static void m215804a(ShareActionType shareActionType, String str, ApiUtils.AbstractC57748a<Boolean> aVar) {
        try {
            ComponentName a = m215800a(shareActionType);
            if (a != null) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                intent.putExtra("android.intent.extra.TEXT", str);
                intent.setComponent(a);
                intent.setFlags(268435456);
                aj.m224263a().startActivity(intent);
                if (aVar != null) {
                    aVar.consume(true);
                }
            } else if (aVar != null) {
                aVar.consume(false);
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.consume(false);
            }
        }
    }

    /* renamed from: a */
    public static void m215803a(ShareActionType shareActionType, File file, String str, ApiUtils.AbstractC57748a<Boolean> aVar) {
        String str2;
        try {
            ComponentName a = m215800a(shareActionType);
            if (a != null) {
                Uri a2 = C26310o.m95259a(aj.m224263a(), file);
                if (a2 == null) {
                    Log.m165383e("ThirdShare", "getUriForFile failed.");
                    if (aVar != null) {
                        aVar.consume(false);
                        return;
                    }
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", a2);
                intent.setType("image/*");
                intent.setComponent(a);
                if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                intent.putExtra("android.intent.extra.TEXT", str2);
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                intent.putExtra("Kdescription", str);
                intent.setFlags(268435456);
                aj.m224263a().startActivity(intent);
                if (aVar != null) {
                    aVar.consume(true);
                }
            } else if (aVar != null) {
                aVar.consume(false);
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.consume(false);
            }
        }
    }
}
