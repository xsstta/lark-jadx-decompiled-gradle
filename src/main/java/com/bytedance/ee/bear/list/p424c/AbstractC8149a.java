package com.bytedance.ee.bear.list.p424c;

import android.content.Context;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.BinderIMakeCopyCallback;
import com.bytedance.ee.bear.contract.BinderIManualOfflineCallback;
import com.bytedance.ee.bear.contract.BinderListDataChangeCallback;
import com.bytedance.ee.bear.contract.BinderOnRequestCallback;
import com.bytedance.ee.bear.contract.create.DocumentCreateInfo;
import com.bytedance.ee.bear.contract.offline.OfflineDoc;
import com.bytedance.ee.bear.contract.offline.OfflineRenameData;
import com.bytedance.ee.bear.list.AbstractC8454g;
import com.bytedance.ee.bear.list.dto.DocVersion;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.list.c.a */
public interface AbstractC8149a {
    /* renamed from: a */
    RouteBean mo31482a(Context context, Document document, String str, List<Document> list, String str2, String str3);

    /* renamed from: a */
    Disposable mo31483a(BinderListDataChangeCallback binderListDataChangeCallback);

    /* renamed from: a */
    AbstractC68307f<OfflineDoc> mo31484a(int i, String str, String str2, boolean z);

    /* renamed from: a */
    AbstractC68307f<Boolean> mo31485a(long j);

    /* renamed from: a */
    AbstractC68307f<DocumentCreateInfo> mo31486a(Context context, int i, String str, String str2, boolean z);

    /* renamed from: a */
    AbstractC68307f<OfflineDoc> mo31487a(String str);

    /* renamed from: a */
    AbstractC68307f<DocVersion> mo31488a(String str, int i);

    /* renamed from: a */
    String mo31489a(Context context, int i);

    /* renamed from: a */
    String mo31490a(Context context, Document document);

    /* renamed from: a */
    void mo31491a();

    /* renamed from: a */
    void mo31492a(Context context);

    /* renamed from: a */
    void mo31493a(FragmentActivity fragmentActivity, C10917c cVar, Document document, AccountService.Account account, String str, String str2, String str3);

    /* renamed from: a */
    void mo31494a(OfflineDoc offlineDoc);

    /* renamed from: a */
    void mo31495a(OfflineRenameData offlineRenameData);

    /* renamed from: a */
    void mo31496a(AbstractC8454g gVar);

    /* renamed from: a */
    void mo31497a(C10917c cVar, Context context, Document document, String str, boolean z, ImageView imageView);

    /* renamed from: a */
    void mo31498a(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback);

    /* renamed from: a */
    void mo31499a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, BinderIMakeCopyCallback binderIMakeCopyCallback);

    /* renamed from: a */
    void mo31500a(String str, int i, boolean z);

    /* renamed from: a */
    void mo31501a(String str, int i, boolean z, BinderOnRequestCallback binderOnRequestCallback);

    /* renamed from: a */
    void mo31502a(String str, int i, boolean z, String str2);

    /* renamed from: a */
    void mo31503a(String str, BinderIDeleteDocCallback binderIDeleteDocCallback);

    /* renamed from: a */
    void mo31504a(String str, String str2);

    /* renamed from: a */
    void mo31505a(List<String> list);

    /* renamed from: a */
    void mo31506a(boolean z, boolean z2, String str, boolean z3, Document document, BinderIManualOfflineCallback binderIManualOfflineCallback);

    /* renamed from: a */
    boolean mo31507a(int i);

    /* renamed from: b */
    Disposable mo31508b(BinderListDataChangeCallback binderListDataChangeCallback);

    /* renamed from: b */
    AbstractC68307f<Integer> mo31509b(List<String> list);

    /* renamed from: b */
    String mo31510b(Context context, int i);

    /* renamed from: b */
    String mo31511b(Context context, Document document);

    /* renamed from: b */
    void mo31512b();

    /* renamed from: b */
    void mo31513b(String str);

    /* renamed from: b */
    void mo31514b(String str, int i, boolean z);

    /* renamed from: c */
    AbstractC68307f<Boolean> mo31515c(String str);

    /* renamed from: c */
    AbstractC68307f<Integer> mo31516c(List<String> list);

    /* renamed from: c */
    String mo31517c(Context context, int i);

    /* renamed from: c */
    String mo31518c(Context context, Document document);

    /* renamed from: c */
    void mo31519c();

    /* renamed from: d */
    AbstractC8454g mo31520d();

    /* renamed from: d */
    void mo31521d(String str);

    /* renamed from: e */
    void mo31522e(String str);

    /* renamed from: e */
    boolean mo31523e();

    /* renamed from: f */
    AbstractC68307f<Boolean> mo31524f(String str);

    /* renamed from: f */
    boolean mo31525f();

    /* renamed from: g */
    AbstractC68307f<Boolean> mo31526g(String str);

    /* renamed from: h */
    String mo31527h(String str);
}
