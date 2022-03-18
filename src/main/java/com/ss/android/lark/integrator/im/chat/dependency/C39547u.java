package com.ss.android.lark.integrator.im.chat.dependency;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.CardContent;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;
import com.ss.android.lark.dependency.AbstractC36455ad;
import com.ss.android.lark.integrator.im.p2035m.C39715a;

/* renamed from: com.ss.android.lark.integrator.im.chat.dependency.u */
public class C39547u implements AbstractC36455ad {
    @Override // com.ss.android.lark.dependency.AbstractC36455ad
    /* renamed from: a */
    public CardContent mo134419a(com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return C39715a.m157675a().mo160031a(cardContent);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36455ad
    /* renamed from: a */
    public com.ss.android.lark.chat.entity.message.content.CardContent mo134420a(CardContent cardContent) {
        return C39715a.m157675a().mo160032a(cardContent);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36455ad
    /* renamed from: a */
    public View mo134418a(Context context, com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return C39715a.m157675a().mo160030a(context, cardContent);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36455ad
    /* renamed from: a */
    public com.ss.android.lark.chat.entity.message.content.CardContent mo134421a(C14928Entity entity, Content content) {
        return C39715a.m157675a().mo160033a(entity, content);
    }

    @Override // com.ss.android.lark.dependency.AbstractC36455ad
    /* renamed from: a */
    public BubbleStyle mo134422a(Context context, View view, com.ss.android.lark.chat.entity.message.content.CardContent cardContent) {
        return C39715a.m157675a().mo160034a(context, view, cardContent);
    }
}
