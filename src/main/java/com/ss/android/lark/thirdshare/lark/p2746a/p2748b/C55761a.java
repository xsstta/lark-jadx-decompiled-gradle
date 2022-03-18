package com.ss.android.lark.thirdshare.lark.p2746a.p2748b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.thirdshare.base.export.ShareActionType;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55760b;
import com.ss.android.lark.utils.ApiUtils;

/* renamed from: com.ss.android.lark.thirdshare.lark.a.b.a */
public class C55761a {

    /* renamed from: a */
    private ShareActionType f137588a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.thirdshare.lark.a.b.a$a */
    public static class C55763a {

        /* renamed from: a */
        public static final C55761a f137589a = new C55761a();
    }

    /* renamed from: a */
    public static ShareActionType m215988a() {
        return C55763a.f137589a.f137588a;
    }

    private C55761a() {
        ShareActionType shareActionType = ShareActionType.getShareActionType("inapp", true);
        this.f137588a = shareActionType;
        shareActionType.setShareItemInfo(new ShareActionType.ShareItemInfo(R.drawable.ud_icon_forward_outlined, R.string.Lark_IMGroups_ShareSendToChat_ButtonText, true), new ShareActionType.ShareItemClickListener(this.f137588a) {
            /* class com.ss.android.lark.thirdshare.lark.p2746a.p2748b.C55761a.C557621 */

            @Override // com.ss.android.lark.thirdshare.base.export.ShareActionType.ShareItemClickListener
            public void onClick(Context context, ShareEntity shareEntity) {
                if (shareEntity.isTextShare()) {
                    C55761a.m215990a(context, shareEntity.getContent());
                } else {
                    C55761a.m215989a(context, BitmapFactory.decodeFile(shareEntity.getImageFile().getAbsolutePath()));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m215989a(Context context, Bitmap bitmap) {
        ((AbstractC55760b) ApiUtils.getApi(AbstractC55760b.class)).shareLarkChatImage(context, bitmap, 10010);
    }

    /* renamed from: a */
    public static void m215990a(Context context, String str) {
        m215991a(context, "", str);
    }

    /* renamed from: a */
    public static void m215991a(Context context, String str, String str2) {
        ((AbstractC55760b) ApiUtils.getApi(AbstractC55760b.class)).shareLarkChatText(context, str, str2, 10010);
    }
}
