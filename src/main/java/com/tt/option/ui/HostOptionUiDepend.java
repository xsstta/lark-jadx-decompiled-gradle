package com.tt.option.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.entity.C67521a;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public interface HostOptionUiDepend {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DATE_PICKER_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TOAST_ICON_TYPE {
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$a */
    public interface AbstractC67689a<T> extends AbstractC67692d {
        /* renamed from: a */
        void mo234052a(T t, T t2, T t3);
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$b */
    public interface AbstractC67690b extends AbstractC67692d {
        /* renamed from: a */
        void mo234058a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo234059a(int[] iArr);
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$c */
    public interface AbstractC67691c<T> extends AbstractC67692d {
        /* renamed from: a */
        void mo234062a(int i, T t);
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$d */
    public interface AbstractC67692d {
        /* renamed from: a */
        void mo234047a();

        /* renamed from: b */
        void mo234050b();
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$e */
    public interface AbstractC67693e extends AbstractC67692d {
        /* renamed from: a */
        void mo234066a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo234067a(String[] strArr, String[] strArr2);
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$f */
    public interface AbstractC67694f<T> extends AbstractC67692d {
        /* renamed from: a */
        void mo234048a(T t, T t2);
    }

    /* renamed from: com.tt.option.ui.HostOptionUiDepend$g */
    public interface AbstractC67695g {
        /* renamed from: a */
        void mo231034a();
    }

    C67521a getAnchorConfig(String str);

    Dialog getLoadingDialog(Activity activity, String str);

    void hideToast();

    void initFeignHostConfig(Context context);

    void initNativeUIParams();

    void showActionSheet(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar, IAppContext iAppContext);

    void showDatePickerView(Activity activity, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, AbstractC67689a<String> aVar);

    void showModal(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, AbstractC67550j.AbstractC67551a<Integer> aVar, Activity activity);

    void showMultiPickerView(Activity activity, String str, List<List<String>> list, int[] iArr, AbstractC67690b bVar);

    Dialog showPermissionDialog(Activity activity, int i, String str, AbstractC67540b bVar, IAppContext iAppContext);

    Dialog showPermissionsDialog(Activity activity, Set<Integer> set, LinkedHashMap<Integer, String> linkedHashMap, AbstractC67539a aVar, HashMap<String, String> hashMap, IAppContext iAppContext);

    void showPickerView(Activity activity, String str, int i, List<String> list, AbstractC67691c<String> cVar);

    void showRegionPickerView(Activity activity, String str, String[] strArr, AbstractC67693e eVar);

    void showTimePickerView(Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6, AbstractC67694f<String> fVar);

    void showToast(Context context, ViewGroup viewGroup, String str, String str2, long j, String str3);

    void showToast(Context context, String str, String str2, long j, String str3);

    void showUnSupportView(Activity activity, String str, AbstractC67695g gVar, IAppContext iAppContext);
}
