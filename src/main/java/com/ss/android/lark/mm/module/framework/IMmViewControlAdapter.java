package com.ss.android.lark.mm.module.framework;

import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.framework.IMmListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\r\u0010\n\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0015\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/framework/IMmViewControlAdapter;", "C", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "D", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmLifecycle;", "bindInquirer", "", "inquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getDependency", "()Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "getListener", "()Lcom/ss/android/lark/mm/module/framework/IMmListener;", "subscribe", "listener", "(Lcom/ss/android/lark/mm/module/framework/IMmListener;)V", "unBindInquirer", "unSubscribe", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.a.f */
public interface IMmViewControlAdapter<C extends IMmListener, D extends IMmDependency> extends IMmLifecycle {
    /* renamed from: c */
    D mo161230c();
}
