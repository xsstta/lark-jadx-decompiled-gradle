package com.bytedance.ee.bear.more;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.icon.IconInfo;
import com.bytedance.ee.bear.more.export.AbstractC10209c;
import com.bytedance.ee.bear.more.export.C10211e;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.export.PageviewResult;
import com.bytedance.ee.bear.more.moreprotocol.CommonMoreItemId;
import com.bytedance.ee.bear.more.moreprotocol.IBaseMoreItem;
import com.bytedance.ee.bear.more.moreprotocol.IMultiTaskMoreItemHelper;
import com.bytedance.ee.bear.more.moreprotocol.MoreItemGroup;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.more.a */
public interface AbstractC10194a {
    /* renamed from: a */
    DialogInterface$OnCancelListenerC1021b mo38962a(FragmentActivity fragmentActivity, ArrayList<MoreItemGroup> arrayList, C1177w<IMoreInfo> wVar, C1177w<IconInfo> wVar2, AbstractC10209c cVar, Bundle bundle);

    /* renamed from: a */
    IBaseMoreItem mo38963a(FragmentActivity fragmentActivity);

    /* renamed from: a */
    IBaseMoreItem mo38964a(FragmentActivity fragmentActivity, CommonMoreItemId commonMoreItemId);

    /* renamed from: a */
    IBaseMoreItem mo38965a(IMultiTaskMoreItemHelper bVar);

    /* renamed from: a */
    IBaseMoreItem mo38966a(String str, String str2);

    /* renamed from: a */
    void mo38967a();

    /* renamed from: a */
    void mo38968a(Bundle bundle, String str, int i, boolean z, String str2, String str3, String str4, String str5, String str6, String str7, boolean z2, boolean z3);

    /* renamed from: a */
    void mo38969a(FragmentActivity fragmentActivity, int i, String str, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: a */
    void mo38970a(FragmentActivity fragmentActivity, int i, String str, boolean z, C10211e eVar, DialogInterface.OnDismissListener onDismissListener);

    /* renamed from: a */
    void mo38971a(IMoreInfo dVar, C1177w<IMoreInfo> wVar, Runnable runnable);

    /* renamed from: a */
    void mo38972a(IMoreInfo dVar, String str);

    /* renamed from: a */
    void mo38973a(C10211e eVar);

    /* renamed from: a */
    void mo38974a(String str, int i, String str2, boolean z, boolean z2, boolean z3);

    /* renamed from: a */
    void mo38975a(String str, Bundle bundle, String str2, int i, String str3, boolean z, boolean z2);

    /* renamed from: a */
    void mo38976a(String str, Bundle bundle, String str2, int i, String str3, boolean z, boolean z2, String str4, String str5, String str6);

    /* renamed from: a */
    boolean mo38977a(String str);

    /* renamed from: b */
    C1177w<PageviewResult> mo38978b(FragmentActivity fragmentActivity);

    /* renamed from: b */
    void mo38979b();

    /* renamed from: b */
    void mo38980b(String str);
}
