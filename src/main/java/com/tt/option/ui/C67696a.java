package com.tt.option.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3301m.C66344j;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.entity.C67521a;
import com.tt.miniapphost.p3373f.AbstractC67539a;
import com.tt.miniapphost.p3373f.AbstractC67540b;
import com.tt.option.AbstractC67593a;
import com.tt.option.ui.HostOptionUiDepend;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.tt.option.ui.a */
public class C67696a extends AbstractC67593a<HostOptionUiDepend> implements HostOptionUiDepend {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HostOptionUiDepend mo232057b() {
        return new C66344j();
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void hideToast() {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).hideToast();
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void initNativeUIParams() {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).initNativeUIParams();
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public C67521a getAnchorConfig(String str) {
        if (!mo234790c()) {
            return null;
        }
        ((HostOptionUiDepend) this.f170423a).getAnchorConfig(str);
        return null;
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void initFeignHostConfig(Context context) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).initFeignHostConfig(context);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog getLoadingDialog(Activity activity, String str) {
        if (mo234790c()) {
            return ((HostOptionUiDepend) this.f170423a).getLoadingDialog(activity, str);
        }
        return null;
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showRegionPickerView(Activity activity, String str, String[] strArr, HostOptionUiDepend.AbstractC67693e eVar) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showRegionPickerView(activity, str, strArr, eVar);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showUnSupportView(Activity activity, String str, HostOptionUiDepend.AbstractC67695g gVar, IAppContext iAppContext) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showUnSupportView(activity, str, gVar, iAppContext);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showActionSheet(Context context, String str, String[] strArr, AbstractC67550j.AbstractC67551a<Integer> aVar, IAppContext iAppContext) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showActionSheet(context, str, strArr, aVar, iAppContext);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showMultiPickerView(Activity activity, String str, List<List<String>> list, int[] iArr, HostOptionUiDepend.AbstractC67690b bVar) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showMultiPickerView(activity, str, list, iArr, bVar);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionDialog(Activity activity, int i, String str, AbstractC67540b bVar, IAppContext iAppContext) {
        if (mo234790c()) {
            return ((HostOptionUiDepend) this.f170423a).showPermissionDialog(activity, i, str, bVar, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showPickerView(Activity activity, String str, int i, List<String> list, HostOptionUiDepend.AbstractC67691c<String> cVar) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showPickerView(activity, str, i, list, cVar);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, String str, String str2, long j, String str3) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showToast(context, str, str2, j, str3);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public Dialog showPermissionsDialog(Activity activity, Set<Integer> set, LinkedHashMap<Integer, String> linkedHashMap, AbstractC67539a aVar, HashMap<String, String> hashMap, IAppContext iAppContext) {
        if (mo234790c()) {
            return ((HostOptionUiDepend) this.f170423a).showPermissionsDialog(activity, set, linkedHashMap, aVar, hashMap, iAppContext);
        }
        return null;
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showToast(Context context, ViewGroup viewGroup, String str, String str2, long j, String str3) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showToast(context, viewGroup, str, str2, j, str3);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showTimePickerView(Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6, HostOptionUiDepend.AbstractC67694f<String> fVar) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showTimePickerView(activity, str, i, i2, i3, i4, i5, i6, fVar);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showModal(Context context, String str, String str2, String str3, boolean z, String str4, String str5, String str6, String str7, AbstractC67550j.AbstractC67551a<Integer> aVar, Activity activity) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showModal(context, str, str2, str3, z, str4, str5, str6, str7, aVar, activity);
        }
    }

    @Override // com.tt.option.ui.HostOptionUiDepend
    public void showDatePickerView(Activity activity, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, HostOptionUiDepend.AbstractC67689a<String> aVar) {
        if (mo234790c()) {
            ((HostOptionUiDepend) this.f170423a).showDatePickerView(activity, str, str2, i, i2, i3, i4, i5, i6, i7, i8, i9, aVar);
        }
    }
}
