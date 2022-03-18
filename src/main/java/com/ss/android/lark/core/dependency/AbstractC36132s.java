package com.ss.android.lark.core.dependency;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.monitor.AbstractC48230h;
import com.ss.android.lark.monitor.C48246q;
import com.ss.android.lark.profile.dependency.IProfileModuleDependency;

/* renamed from: com.ss.android.lark.core.dependency.s */
public interface AbstractC36132s {
    /* renamed from: a */
    void mo133131a(Activity activity);

    /* renamed from: a */
    void mo133132a(Context context, String str);

    /* renamed from: a */
    void mo133133a(TextView textView, TextView textView2, ImageView imageView, Content content);

    /* renamed from: a */
    void mo133134a(ErrorResult errorResult, IGetDataCallback<String> iGetDataCallback);

    /* renamed from: a */
    void mo133135a(AbstractC48230h.AbstractC48231a aVar);

    /* renamed from: a */
    void mo133136a(C48246q qVar);

    /* renamed from: a */
    void mo133137a(String str, boolean z, boolean z2, IProfileModuleDependency.IVCLaunchCallback iVCLaunchCallback);

    /* renamed from: a */
    boolean mo133138a();

    /* renamed from: a */
    boolean mo133139a(Context context, String str, int i);

    /* renamed from: a */
    boolean mo133140a(String str);

    /* renamed from: b */
    void mo133141b(String str);

    /* renamed from: b */
    boolean mo133142b();

    /* renamed from: b */
    boolean mo133143b(Context context, String str, int i);

    /* renamed from: c */
    boolean mo133144c();

    /* renamed from: c */
    boolean mo133145c(String str);

    /* renamed from: d */
    boolean mo133146d();

    /* renamed from: d */
    boolean mo133147d(String str);

    /* renamed from: e */
    boolean mo133148e();

    /* renamed from: f */
    void mo133149f();

    /* renamed from: g */
    boolean mo133150g();

    /* renamed from: h */
    AbstractC44136a.AbstractC44139aa mo133151h();
}
