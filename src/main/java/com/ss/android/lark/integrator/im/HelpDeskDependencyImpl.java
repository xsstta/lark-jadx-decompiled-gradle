package com.ss.android.lark.integrator.im;

import com.ss.android.lark.integrator.im.dependency.ChatHelpDeskDependency;
import com.ss.android.lark.integrator.im.dependency.IHelpdeskDependency;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/integrator/im/HelpDeskDependencyImpl;", "Lcom/ss/android/lark/integrator/im/dependency/IHelpdeskDependency;", "()V", "getChatHelpdeskDependency", "Lcom/ss/android/lark/dependency/IHelpdeskDependency;", "im_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.f */
public final class HelpDeskDependencyImpl implements IHelpdeskDependency {
    @Override // com.ss.android.lark.integrator.im.dependency.IHelpdeskDependency
    /* renamed from: a */
    public com.ss.android.lark.dependency.IHelpdeskDependency mo143626a() {
        return new ChatHelpDeskDependency();
    }
}
