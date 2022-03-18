package com.bytedance.ug.sdk.share.impl.p920d;

import com.bytedance.ug.sdk.share.api.panel.ShareChannelType;
import java.util.HashMap;

/* renamed from: com.bytedance.ug.sdk.share.impl.d.a */
public class C20829a {

    /* renamed from: a */
    public static HashMap<ShareChannelType, String> f50997a;

    static {
        HashMap<ShareChannelType, String> hashMap = new HashMap<>();
        f50997a = hashMap;
        hashMap.put(ShareChannelType.WX, "com.bytedance.ug.sdk.share.keep.impl.WXShareImpl");
        f50997a.put(ShareChannelType.WX_TIMELINE, "com.bytedance.ug.sdk.share.keep.impl.WXTimelineShareImpl");
        f50997a.put(ShareChannelType.QQ, "com.bytedance.ug.sdk.share.keep.impl.QQShareImpl");
        f50997a.put(ShareChannelType.QZONE, "com.bytedance.ug.sdk.share.keep.impl.QQZoneShareImpl");
        f50997a.put(ShareChannelType.DINGDING, "com.bytedance.ug.sdk.share.keep.impl.DDShareImpl");
        f50997a.put(ShareChannelType.DOUYIN, "com.bytedance.ug.sdk.share.keep.impl.DYShareImpl");
        f50997a.put(ShareChannelType.DOUYIN_IM, "com.bytedance.ug.sdk.share.keep.impl.DYIMShareImpl");
        f50997a.put(ShareChannelType.WEIBO, "com.bytedance.ug.sdk.share.keep.impl.WBShareImpl");
        f50997a.put(ShareChannelType.FEILIAO, "com.bytedance.ug.sdk.share.keep.impl.FLShareImpl");
        f50997a.put(ShareChannelType.DUOSHAN, "com.bytedance.ug.sdk.share.keep.impl.DSShareImpl");
        f50997a.put(ShareChannelType.FACEBOOK, "com.bytedance.ug.sdk.share.keep.impl.FacebookShareImpl");
        f50997a.put(ShareChannelType.LINE, "com.bytedance.ug.sdk.share.keep.impl.LineShareImpl");
        f50997a.put(ShareChannelType.WHATSAPP, "com.bytedance.ug.sdk.share.keep.impl.WhatsAppShareImpl");
        f50997a.put(ShareChannelType.INSTAGRAM, "com.bytedance.ug.sdk.share.keep.impl.InstagramShareImpl");
        f50997a.put(ShareChannelType.TIKTOK, "com.bytedance.ug.sdk.share.keep.impl.TiktokShareImpl");
        f50997a.put(ShareChannelType.TWITTER, "com.bytedance.ug.sdk.share.keep.impl.TwitterShareImpl");
        f50997a.put(ShareChannelType.KAKAO, "com.bytedance.ug.sdk.share.keep.impl.KakaoShareImpl");
        f50997a.put(ShareChannelType.SNAPCHAT, "com.bytedance.ug.sdk.share.keep.impl.SnapChatShareImpl");
        f50997a.put(ShareChannelType.MESSENGER, "com.bytedance.ug.sdk.share.keep.impl.MessengerShareImpl");
        f50997a.put(ShareChannelType.TOUTIAO, "com.bytedance.ug.sdk.share.keep.impl.TTShareImpl");
        f50997a.put(ShareChannelType.FEISHU, "com.bytedance.ug.sdk.share.keep.impl.FSShareImpl");
        f50997a.put(ShareChannelType.ZHIFUBAO, "com.bytedance.ug.sdk.share.keep.impl.ZFBShareImpl");
        f50997a.put(ShareChannelType.VK, "com.bytedance.ug.sdk.share.keep.impl.VKShareImpl");
        f50997a.put(ShareChannelType.IMAGE_SHARE, "com.bytedance.ug.sdk.share.keep.impl.ImageShareImpl");
        f50997a.put(ShareChannelType.LONG_IMAGE, "com.bytedance.ug.sdk.share.keep.impl.LongImageShareImpl");
    }
}
