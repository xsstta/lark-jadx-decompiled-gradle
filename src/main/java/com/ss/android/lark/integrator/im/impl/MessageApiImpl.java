package com.ss.android.lark.integrator.im.impl;

import com.ss.android.lark.biz.im.api.MessageApi;
import com.ss.android.lark.biz.im.api.param.DisplayTextParams;
import com.ss.android.lark.chat.utils.C34349o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/integrator/im/impl/MessageApiImpl;", "Lcom/ss/android/lark/biz/im/api/MessageApi;", "()V", "getDisplayText", "", "params", "Lcom/ss/android/lark/biz/im/api/param/DisplayTextParams;", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.impl.a */
public final class MessageApiImpl implements MessageApi {

    /* renamed from: a */
    public static final MessageApiImpl f101242a = new MessageApiImpl();

    private MessageApiImpl() {
    }

    @Override // com.ss.android.lark.biz.im.api.MessageApi
    /* renamed from: a */
    public CharSequence mo106772a(DisplayTextParams bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "params");
        CharSequence a = C34349o.m133204a(bVar.mo106745f(), bVar.mo106746g(), bVar.mo106738a(), bVar.mo106740b(), bVar.mo106742c(), bVar.mo106743d(), bVar.mo106744e());
        Intrinsics.checkExpressionValueIsNotNull(a, "MessageDisplayTextUtil.g…   params.color\n        )");
        return a;
    }
}
