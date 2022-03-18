package com.ss.android.lark.thirdshare.base.export;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.C55680a;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ShareActionType implements Serializable {
    private static final AtomicInteger AI = new AtomicInteger(-1);
    public static final ShareActionType COPY;
    public static final ShareActionType QQ;
    public static final ShareActionType SAVE;
    private static final Map<String, ShareActionType> SHARE_ACTION_TYPES = new ConcurrentHashMap();
    public static final ShareActionType SYS;
    public static final ShareActionType UNKNOWN = new ShareActionType("unknown", false);
    public static final ShareActionType WB;
    public static final ShareActionType WX;
    public static final ShareActionType WX_TIMELINE;
    private boolean isThirdApp;
    private ShareItemInfo shareItemInfo;
    private String typeName;
    private int value = AI.getAndIncrement();

    public ShareItemInfo getShareItemInfo() {
        return this.shareItemInfo;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isThirdAppShareType() {
        return this.isThirdApp;
    }

    public String name() {
        return this.typeName;
    }

    public static class ShareItemInfo implements Serializable {
        static final ShareItemInfo COPY_ITEM_INFO = new ShareItemInfo(R.drawable.ud_icon_link_copy_outlined, R.string.Lark_UserGrowth_InvitePeopleContactsShareToCopy, true);
        static final ShareItemInfo QQ_ITEM_INFO = new ShareItemInfo(R.drawable.ts_icon_qq, R.string.Lark_UserGrowth_TitleQQ);
        static final ShareItemInfo SAVE_ITEM_INFO = new ShareItemInfo(R.drawable.ud_icon_download_outlined, R.string.Lark_Legacy_QrCodeSave, true);
        static final ShareItemInfo SYS_ITEM_INFO = new ShareItemInfo(R.drawable.ud_icon_more_outlined, R.string.Lark_UserGrowth_InvitePeopleContactsShareToMore, true);
        static final ShareItemInfo WB_ITEM_INFO = new ShareItemInfo(R.drawable.ts_icon_wb, R.string.Lark_UserGrowth_TitleWeibo);
        static final ShareItemInfo WX_ITEM_INFO = new ShareItemInfo(R.drawable.ts_icon_wx, R.string.Lark_UserGrowth_TitleWechat);
        static final ShareItemInfo WX_TIMELINE_ITEM_INFO = new ShareItemInfo(R.drawable.ts_icon_wx_timeline, R.string.Lark_Invitation_SharePYQ);
        public int mIconId;
        public ShareItemClickListener mListener;
        public int mNameResId = -1;
        public boolean shouldApplyTint;

        public String getName() {
            return UIHelper.getString(this.mNameResId);
        }

        /* access modifiers changed from: package-private */
        public ShareItemInfo setListener(ShareItemClickListener shareItemClickListener) {
            this.mListener = shareItemClickListener;
            return this;
        }

        /* access modifiers changed from: package-private */
        public ShareItemInfo setListener(ShareActionType shareActionType) {
            setListener(new ShareItemClickListener(shareActionType) {
                /* class com.ss.android.lark.thirdshare.base.export.ShareActionType.ShareItemInfo.C556941 */

                @Override // com.ss.android.lark.thirdshare.base.export.ShareActionType.ShareItemClickListener
                public void onClick(Context context, ShareEntity shareEntity) {
                    C55680a.m215699a(context, shareEntity);
                }
            });
            return this;
        }

        public ShareItemInfo(int i, int i2) {
            this.mIconId = i;
            this.mNameResId = i2;
        }

        public ShareItemInfo(int i, int i2, boolean z) {
            this.mIconId = i;
            this.mNameResId = i2;
            this.shouldApplyTint = z;
        }
    }

    public String toString() {
        return name();
    }

    public ShareActionType copy() {
        return new ShareActionType(this.typeName, this.isThirdApp);
    }

    public boolean isBaseActionType() {
        if (this == WX || this == WB || this == QQ || this == COPY || this == SYS || this == WX_TIMELINE || this == SAVE) {
            return true;
        }
        return false;
    }

    static {
        ShareActionType shareActionType = new ShareActionType("wechat_session", true);
        WX = shareActionType;
        ShareActionType shareActionType2 = new ShareActionType("weibo", true);
        WB = shareActionType2;
        ShareActionType shareActionType3 = new ShareActionType("qq", true);
        QQ = shareActionType3;
        ShareActionType shareActionType4 = new ShareActionType("copy_text", false);
        COPY = shareActionType4;
        ShareActionType shareActionType5 = new ShareActionType("system_share", false);
        SYS = shareActionType5;
        ShareActionType shareActionType6 = new ShareActionType("wechat_timeline", true);
        WX_TIMELINE = shareActionType6;
        ShareActionType shareActionType7 = new ShareActionType("save_image", false);
        SAVE = shareActionType7;
        shareActionType.setShareItemInfo(ShareItemInfo.WX_ITEM_INFO);
        shareActionType2.setShareItemInfo(ShareItemInfo.WB_ITEM_INFO);
        shareActionType3.setShareItemInfo(ShareItemInfo.QQ_ITEM_INFO);
        shareActionType4.setShareItemInfo(ShareItemInfo.COPY_ITEM_INFO);
        shareActionType5.setShareItemInfo(ShareItemInfo.SYS_ITEM_INFO);
        shareActionType6.setShareItemInfo(ShareItemInfo.WX_TIMELINE_ITEM_INFO);
        shareActionType7.setShareItemInfo(ShareItemInfo.SAVE_ITEM_INFO);
    }

    public String getPkgName() {
        if (WX.equals(this) || WX_TIMELINE.equals(this)) {
            return "com.tencent.mm";
        }
        if (WB.equals(this)) {
            return "com.sina.weibo";
        }
        if (QQ.equals(this)) {
            return "com.tencent.mobileqq";
        }
        Log.m165383e("ThirdShare", this + "is not third app share type.");
        return "";
    }

    public void setThirdApp(boolean z) {
        this.isThirdApp = z;
    }

    public static abstract class ShareItemClickListener implements Serializable {
        private ShareActionType type;

        public abstract void onClick(Context context, ShareEntity shareEntity);

        public ShareItemClickListener(ShareActionType shareActionType) {
            this.type = shareActionType;
        }

        public void onClickReal(Context context, ShareEntity shareEntity) {
            shareEntity.setCurActionType(this.type);
            onClick(context, shareEntity);
        }
    }

    private void setShareItemInfo(ShareItemInfo shareItemInfo2) {
        this.shareItemInfo = shareItemInfo2.setListener(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ShareActionType) {
            return TextUtils.equals(this.typeName, ((ShareActionType) obj).typeName);
        }
        return false;
    }

    public static ShareActionType value2ShareActionType(int i) {
        for (Map.Entry<String, ShareActionType> entry : SHARE_ACTION_TYPES.entrySet()) {
            if (entry.getValue().getValue() == i) {
                return entry.getValue();
            }
        }
        return UNKNOWN;
    }

    public void setShareItemInfo(ShareItemInfo shareItemInfo2, ShareItemClickListener shareItemClickListener) {
        this.shareItemInfo = shareItemInfo2.setListener(shareItemClickListener);
    }

    private ShareActionType(String str, boolean z) {
        this.typeName = str;
        this.isThirdApp = z;
        SHARE_ACTION_TYPES.put(str, this);
    }

    public static ShareActionType getShareActionType(String str, boolean z) {
        ShareActionType shareActionType = SHARE_ACTION_TYPES.get(str);
        if (shareActionType != null) {
            return shareActionType;
        }
        if (!z) {
            return UNKNOWN;
        }
        Log.m165389i("ThirdShare", str + " will be added!!!");
        return new ShareActionType(str, false);
    }
}
