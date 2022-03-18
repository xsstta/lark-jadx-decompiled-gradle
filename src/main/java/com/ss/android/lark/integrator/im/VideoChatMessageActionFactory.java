package com.ss.android.lark.integrator.im;

import com.ss.android.lark.biz.im.extension.ActionInterceptor;
import com.ss.android.lark.biz.im.extension.ActionProvider;
import com.ss.android.lark.biz.im.extension.MessageActionFactory;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/integrator/im/VideoChatMessageActionFactory;", "Lcom/ss/android/lark/biz/im/extension/MessageActionFactory;", "()V", "createMessageActionInterceptors", "", "Lcom/ss/android/lark/biz/im/extension/ActionInterceptor;", "createMessageActionProviders", "Lcom/ss/android/lark/biz/im/extension/ActionProvider;", "vc_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.p */
public final class VideoChatMessageActionFactory implements MessageActionFactory {
    @Override // com.ss.android.lark.biz.im.extension.MessageActionFactory
    /* renamed from: a */
    public Collection<ActionProvider> mo106827a() {
        return CollectionsKt.emptyList();
    }

    @Override // com.ss.android.lark.biz.im.extension.MessageActionFactory
    /* renamed from: b */
    public Collection<ActionInterceptor> mo106828b() {
        return CollectionsKt.listOf(new VideoChatMessageActionInterceptor());
    }
}
