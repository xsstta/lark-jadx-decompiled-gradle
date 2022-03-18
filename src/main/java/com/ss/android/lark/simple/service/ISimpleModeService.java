package com.ss.android.lark.simple.service;

import android.content.Context;
import com.larksuite.framework.callback.IGetDataCallback;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J&\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/simple/service/ISimpleModeService;", "", "canShowSimpleTip", "", "completeSimpleTip", "", "fetchSimpleMode", "context", "Landroid/content/Context;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "getSimpleMode", "isSimpleModeEntranceEnable", "isSimpleModeFeatureEnable", "setSimpleMode", "simpleMode", "core_simple_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.simple.service.a */
public interface ISimpleModeService {
    /* renamed from: a */
    int mo187130a(Context context);

    /* renamed from: a */
    void mo187132a(Context context, int i, IGetDataCallback<Boolean> iGetDataCallback);

    /* renamed from: a */
    void mo187133a(Context context, IGetDataCallback<Integer> iGetDataCallback);

    /* renamed from: a */
    boolean mo187134a();

    /* renamed from: b */
    boolean mo187135b();

    /* renamed from: c */
    void mo187136c();
}
