package com.ss.android.lark.message.service.dto;

import com.bytedance.lark.pb.basic.v1.CardAction;

/* renamed from: com.ss.android.lark.message.service.dto.a */
public class C45380a {
    /* renamed from: a */
    public static CardActionUrl m180218a(CardAction.Url url) {
        CardActionUrl cardActionUrl = new CardActionUrl();
        if (url != null) {
            cardActionUrl.setUrl(url.url);
            cardActionUrl.setAndroid_url(url.android_url);
        } else {
            cardActionUrl.setUrl("");
            cardActionUrl.setAndroid_url("");
        }
        return cardActionUrl;
    }
}
