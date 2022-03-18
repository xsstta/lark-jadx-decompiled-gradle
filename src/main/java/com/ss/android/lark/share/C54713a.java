package com.ss.android.lark.share;

import android.content.Context;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.openapi.jsapi.entity.ShareModel;
import com.ss.android.lark.share.dto.ShareChatDto;
import com.ss.android.lark.share.impl.C54745c;
import com.ss.android.lark.share.impl.p2682a.C54741f;
import com.ss.android.lark.share.p2681a.AbstractC54714a;

/* renamed from: com.ss.android.lark.share.a */
public class C54713a {

    /* renamed from: a */
    private static volatile AbstractC54714a f135140a;

    /* renamed from: a */
    public static AbstractC54714a m212321a() {
        return f135140a;
    }

    public C54713a(AbstractC54714a aVar) {
        m212322a(aVar);
    }

    /* renamed from: a */
    private static void m212322a(AbstractC54714a aVar) {
        f135140a = aVar;
    }

    /* renamed from: a */
    public void mo186842a(Context context, ShareModel shareModel) {
        C54745c.m212408a(context, shareModel);
    }

    /* renamed from: a */
    public void mo186843a(CommonShareData commonShareData, ShareChatDto shareChatDto) {
        C54745c.m212409a(commonShareData, shareChatDto);
    }

    /* renamed from: a */
    public void mo186844a(CommonShareData commonShareData, boolean z) {
        C54741f.m212396a(commonShareData, z);
    }
}
