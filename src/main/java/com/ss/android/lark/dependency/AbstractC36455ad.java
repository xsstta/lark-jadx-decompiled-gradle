package com.ss.android.lark.dependency;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Content;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.ui.message.style.BubbleStyle;

/* renamed from: com.ss.android.lark.dependency.ad */
public interface AbstractC36455ad {
    /* renamed from: a */
    View mo134418a(Context context, CardContent cardContent);

    /* renamed from: a */
    com.bytedance.lark.pb.basic.v1.CardContent mo134419a(CardContent cardContent);

    /* renamed from: a */
    CardContent mo134420a(com.bytedance.lark.pb.basic.v1.CardContent cardContent);

    /* renamed from: a */
    CardContent mo134421a(C14928Entity entity, Content content);

    /* renamed from: a */
    BubbleStyle mo134422a(Context context, View view, CardContent cardContent);
}
