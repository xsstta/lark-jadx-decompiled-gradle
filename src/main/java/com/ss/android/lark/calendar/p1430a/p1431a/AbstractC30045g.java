package com.ss.android.lark.calendar.p1430a.p1431a;

import android.content.Context;
import android.view.View;
import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.basic.v1.Chatter;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30025c;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.a.a.g */
public interface AbstractC30045g {
    /* renamed from: a */
    AbstractC30025c mo108217a(String str);

    /* renamed from: a */
    AbstractC30026d mo108218a();

    /* renamed from: a */
    String mo108219a(AbstractC30026d dVar);

    /* renamed from: a */
    Map<String, AbstractC30026d> mo108220a(C14928Entity entity);

    /* renamed from: a */
    Map<String, AbstractC30026d> mo108221a(Map<String, Chatter> map);

    /* renamed from: a */
    void mo108222a(Context context, String str);

    /* renamed from: a */
    void mo108223a(View view, int i, View view2, int[] iArr);

    /* renamed from: a */
    void mo108224a(IGetDataCallback<AbstractC30026d> iGetDataCallback);

    /* renamed from: a */
    void mo108225a(String str, IGetDataCallback<AbstractC30026d> iGetDataCallback);

    /* renamed from: b */
    void mo108226b(Context context, String str);
}
