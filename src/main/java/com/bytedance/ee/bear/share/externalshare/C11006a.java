package com.bytedance.ee.bear.share.externalshare;

import android.text.TextUtils;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bizwidget.shareview.ShareItemModel;
import com.bytedance.ee.bear.bizwidget.shareview.ShareState;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.service.C10917c;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.share.externalshare.a */
public class C11006a {
    /* renamed from: a */
    private static ShareState m45838a(boolean z, boolean z2) {
        if (!z) {
            return ShareState.ADMIN_NOT_CLICK;
        }
        if (z2) {
            return ShareState.SHOW;
        }
        return ShareState.NOT_CLICK;
    }

    /* renamed from: a */
    private static ShareState m45839a(boolean z, boolean z2, boolean z3) {
        if (!z) {
            return ShareState.NOT_SHOW;
        }
        if (z2 && z3) {
            return ShareState.SHOW;
        }
        if (!z2) {
            return ShareState.ADMIN_NOT_CLICK;
        }
        return ShareState.NOT_CLICK;
    }

    /* renamed from: a */
    public static List<ShareItemModel> m45842a(C10917c cVar, int i, String str) {
        boolean z;
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        boolean z2 = false;
        if (C4511g.m18594d().mo17344E() == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean b = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36543b(i, str);
        if (!z && C11007b.m45863a()) {
            z2 = true;
        }
        boolean z3 = !z2;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        ShareType shareType2 = ShareType.More;
        if (b) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.ADMIN_NOT_CLICK;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        return arrayList;
    }

    /* renamed from: b */
    private static List<ShareItemModel> m45846b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z3) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z5, z2)));
        ShareType shareType3 = ShareType.Wechat;
        if (z4) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z4) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z4) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z4) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        return arrayList;
    }

    /* renamed from: a */
    private static List<ShareItemModel> m45843a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z3) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z5, z2)));
        ShareType shareType3 = ShareType.Wechat;
        if (z4) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z4) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z4) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z4) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        return arrayList;
    }

    /* renamed from: a */
    private static List<ShareItemModel> m45840a(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ShareState shareState;
        ShareState shareState2;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.ExportImage, m45839a(z3, z5, z4)));
        return arrayList;
    }

    /* renamed from: c */
    private static List<ShareItemModel> m45848c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ShareState shareState7;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        ShareType shareType3 = ShareType.More;
        if (!z6) {
            shareState3 = ShareState.ADMIN_NOT_CLICK;
        } else if (z5) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_CLICK;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.Wechat;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.WechatMoments;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.QQ;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        ShareType shareType7 = ShareType.Weibo;
        if (z3) {
            shareState7 = ShareState.SHOW;
        } else {
            shareState7 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType7, shareState7));
        arrayList.add(new ShareItemModel(ShareType.ExportImage, m45839a(z4, z7, z5)));
        return arrayList;
    }

    /* renamed from: d */
    private static List<ShareItemModel> m45849d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z6, z5)));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        arrayList.add(new ShareItemModel(ShareType.SlideExport, m45839a(z4, z7, z5)));
        return arrayList;
    }

    /* renamed from: e */
    private static List<ShareItemModel> m45850e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z6, z5)));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        return arrayList;
    }

    /* renamed from: f */
    private static List<ShareItemModel> m45851f(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z6, z5)));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        return arrayList;
    }

    /* renamed from: b */
    private static List<ShareItemModel> m45847b(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z6, z5)));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        arrayList.add(new ShareItemModel(ShareType.ExportImage, m45839a(z4, z7, z5)));
        return arrayList;
    }

    /* renamed from: a */
    private static List<ShareItemModel> m45844a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ArrayList arrayList = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType2, shareState2));
        arrayList.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList.add(new ShareItemModel(ShareType.More, m45838a(z6, z5)));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList.add(new ShareItemModel(shareType6, shareState6));
        arrayList.add(new ShareItemModel(ShareType.ExportImage, m45839a(z4, z7, z5)));
        return arrayList;
    }

    /* renamed from: a */
    public static List<ShareItemModel> m45841a(C10917c cVar, int i, int i2, String str, boolean z, boolean z2, String str2, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        boolean z3;
        boolean z4;
        boolean z5;
        String str3;
        boolean z6;
        boolean z7 = true;
        boolean z8 = false;
        if (C4511g.m18594d().mo17344E() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i == 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 || !C11007b.m45863a()) {
            z5 = false;
        } else {
            z5 = true;
        }
        boolean z9 = !z5;
        AccountService.Account f = ((an) KoinJavaComponent.m268610a(an.class)).mo16408f();
        if (f != null) {
            str3 = f.f14592i;
        } else {
            str3 = "";
        }
        if (!TextUtils.equals("1", str3) || z3) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean b = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36543b(i2, str);
        boolean c = ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36544c(i2, str);
        if (z) {
            if (i2 == C8275a.f22374g.mo32555b()) {
                if (!z4 || !TextUtils.equals(str2, "OUTLINE")) {
                    z7 = false;
                }
                z8 = z7;
            } else if (!(i2 == C8275a.f22373f.mo32555b() || i2 == C8275a.f22375h.mo32555b())) {
                z8 = z4;
            }
            return m45840a(i2, z3, z6, z8, z2, c);
        } else if (i2 == C8275a.f22371d.mo32555b()) {
            return m45844a(z3, z6, z9, z4, z2, b, c);
        } else {
            if (i2 == C8275a.f22378k.mo32555b()) {
                return m45847b(z3, z6, z9, z4, z2, b, c);
            }
            if (i2 == C8275a.f22372e.mo32555b()) {
                return m45845a(z3, z6, z9, z2, z4, b, c, arrayList, arrayList2);
            }
            if (i2 == C8275a.f22374g.mo32555b()) {
                if (z4 && TextUtils.equals(str2, "OUTLINE")) {
                    z8 = true;
                }
                return m45848c(z3, z6, z9, z8, z2, b, c);
            } else if (i2 == C8275a.f22375h.mo32555b()) {
                return m45846b(z3, z2, z6, z9, b);
            } else {
                if (i2 == C8275a.f22376i.mo32555b()) {
                    return m45849d(z3, z6, z9, z4, z2, b, c);
                }
                if (i2 == C8275a.f22373f.mo32555b()) {
                    return m45843a(z3, z2, z6, z9, b);
                }
                if (i2 == C8275a.f22380m.mo32555b()) {
                    return m45850e(z3, z6, z9, z4, z2, b, c);
                }
                return m45851f(z3, z6, z9, z4, z2, b, c);
            }
        }
    }

    /* renamed from: a */
    private static List<ShareItemModel> m45845a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2) {
        ShareState shareState;
        ShareState shareState2;
        ShareState shareState3;
        ShareState shareState4;
        ShareState shareState5;
        ShareState shareState6;
        ShareState shareState7;
        ShareState shareState8;
        ShareState shareState9;
        ArrayList arrayList3 = new ArrayList();
        ShareType shareType = ShareType.Lark;
        if (z) {
            shareState = ShareState.NOT_SHOW;
        } else {
            shareState = ShareState.SHOW;
        }
        arrayList3.add(new ShareItemModel(shareType, shareState));
        ShareType shareType2 = ShareType.ByteMoments;
        if (z2) {
            shareState2 = ShareState.SHOW;
        } else {
            shareState2 = ShareState.NOT_SHOW;
        }
        arrayList3.add(new ShareItemModel(shareType2, shareState2));
        arrayList3.add(new ShareItemModel(ShareType.CopyLink, ShareState.SHOW));
        arrayList3.add(new ShareItemModel(ShareType.More, m45838a(z6, z4)));
        ShareType shareType3 = ShareType.Wechat;
        if (z3) {
            shareState3 = ShareState.SHOW;
        } else {
            shareState3 = ShareState.NOT_SHOW;
        }
        arrayList3.add(new ShareItemModel(shareType3, shareState3));
        ShareType shareType4 = ShareType.WechatMoments;
        if (z3) {
            shareState4 = ShareState.SHOW;
        } else {
            shareState4 = ShareState.NOT_SHOW;
        }
        arrayList3.add(new ShareItemModel(shareType4, shareState4));
        ShareType shareType5 = ShareType.QQ;
        if (z3) {
            shareState5 = ShareState.SHOW;
        } else {
            shareState5 = ShareState.NOT_SHOW;
        }
        arrayList3.add(new ShareItemModel(shareType5, shareState5));
        ShareType shareType6 = ShareType.Weibo;
        if (z3) {
            shareState6 = ShareState.SHOW;
        } else {
            shareState6 = ShareState.NOT_SHOW;
        }
        arrayList3.add(new ShareItemModel(shareType6, shareState6));
        if (z5 && z7) {
            ShareType shareType7 = ShareType.ExportImage;
            if (z4) {
                shareState7 = ShareState.SHOW;
            } else {
                shareState7 = ShareState.NOT_SHOW;
            }
            ShareItemModel shareItemModel = new ShareItemModel(shareType7, shareState7);
            int ordinal = ShareType.ExportImage.ordinal();
            if (arrayList != null && arrayList.contains(Integer.valueOf(ordinal))) {
                if (z4) {
                    shareState9 = ShareState.NOT_CLICK;
                } else {
                    shareState9 = ShareState.NOT_SHOW;
                }
                shareItemModel.setState(shareState9);
            }
            if (arrayList2 != null && arrayList2.contains(Integer.valueOf(ordinal))) {
                if (z4) {
                    shareState8 = ShareState.SHOW_NEW;
                } else {
                    shareState8 = ShareState.NOT_SHOW;
                }
                shareItemModel.setState(shareState8);
            }
            arrayList3.add(shareItemModel);
        }
        return arrayList3;
    }
}
