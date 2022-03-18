package com.ss.android.lark.core.p1772j.p1773a;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;

/* renamed from: com.ss.android.lark.core.j.a.a */
public class C36168a implements AbstractC44136a.AbstractC44147c {
    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44147c
    /* renamed from: a */
    public void mo133377a(Context context, String str) {
        if (context instanceof Activity) {
            C36083a.m141486a().getCalendarDependency().mo132733a((Activity) context, str);
        }
    }

    @Override // com.ss.android.lark.main.p2231a.AbstractC44136a.AbstractC44147c
    /* renamed from: a */
    public void mo133378a(String str, IGetDataCallback<Integer> iGetDataCallback) {
        if (TextUtils.isEmpty(str)) {
            iGetDataCallback.onError(new ErrorResult("chatId is null"));
        } else {
            C36083a.m141486a().getCalendarDependency().mo132748b(str, iGetDataCallback);
        }
    }
}
