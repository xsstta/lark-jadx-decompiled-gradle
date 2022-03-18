package com.ss.android.lark.contact.feat.contact_recommend.mvp;

import android.os.SystemClock;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.feat.contact_recommend.entity.ContactRecData;
import com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact;
import com.ss.android.lark.contact.feat.entity.C35469b;
import com.ss.android.lark.contact.feat.entity.C35471d;
import com.ss.android.lark.contact.feat.p1745d.C35464c;
import com.ss.android.lark.contact.feat.p1745d.C35466d;
import com.ss.android.lark.contact.feat.statistics.ContactApm;
import com.ss.android.lark.contact.feat.util.ContactDataUtils;
import com.ss.android.lark.inv.export.util.InvAppreciableUtils;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J4\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\rH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u0011H\u0016J \u0010\u0012\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0018\u00010\u0011H\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/contact/feat/contact_recommend/mvp/IContactRecContact$IModel;", "()V", "contactNamePrefix", "", "kotlin.jvm.PlatformType", "convertToContactRecData", "", "Lcom/ss/android/lark/contact/feat/contact_recommend/entity/ContactRecData;", "contactPointUserInfos", "Lcom/ss/android/lark/contact/feat/entity/ContactPointUserInfoBean;", "cp2ContactNameMap", "", "loadData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "loadDataInner", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.contact.feat.a.b.a */
public final class ContactRecModel extends BaseModel implements IContactRecContact.IModel {

    /* renamed from: a */
    private final String f91521a = UIHelper.getString(R.string.Lark_NewContacts_OnboardingMobileContactsMobile);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a$a */
    static final class RunnableC35414a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ContactRecModel f91522a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f91523b;

        /* renamed from: c */
        final /* synthetic */ UIGetDataCallback f91524c;

        RunnableC35414a(ContactRecModel aVar, IGetDataCallback iGetDataCallback, UIGetDataCallback uIGetDataCallback) {
            this.f91522a = aVar;
            this.f91523b = iGetDataCallback;
            this.f91524c = uIGetDataCallback;
        }

        public final void run() {
            try {
                this.f91522a.mo130683b(this.f91523b);
            } catch (Exception e) {
                UIGetDataCallback uIGetDataCallback = this.f91524c;
                if (uIGetDataCallback != null) {
                    uIGetDataCallback.onError(new ErrorResult(e));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/contact/feat/contact_recommend/mvp/ContactRecModel$loadDataInner$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/contact/feat/entity/ContactPointUserInfoBean;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "contactPointUserInfos", "core_contact_contact_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.contact.feat.a.b.a$b */
    public static final class C35415b implements IGetDataCallback<List<? extends C35469b>> {

        /* renamed from: a */
        final /* synthetic */ ContactRecModel f91525a;

        /* renamed from: b */
        final /* synthetic */ Map f91526b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f91527c;

        /* renamed from: d */
        final /* synthetic */ long f91528d;

        /* renamed from: a */
        public void onSuccess(List<? extends C35469b> list) {
            List<ContactRecData> a = this.f91525a.mo130681a(list, this.f91526b);
            IGetDataCallback iGetDataCallback = this.f91527c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(a);
            }
            ContactApm.f91564a.mo130726b(a.size());
            ContactApm.f91564a.mo130725a(SystemClock.uptimeMillis() - this.f91528d);
            InvAppreciableUtils.BaseAppreciable.m158992a(InvAppreciableUtils.m158977b(), Event.contact_opt_onboarding_fetch_rec_user, null, null, null, 14, null);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            IGetDataCallback iGetDataCallback = this.f91527c;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
            ContactApm.f91564a.mo130724a(errorResult.getErrorCode(), errorResult.getDebugMsg());
            InvAppreciableUtils.BaseAppreciable.m158991a(InvAppreciableUtils.m158977b(), Event.contact_opt_onboarding_fetch_rec_user, errorResult, false, 4, null);
        }

        C35415b(ContactRecModel aVar, Map map, IGetDataCallback iGetDataCallback, long j) {
            this.f91525a = aVar;
            this.f91526b = map;
            this.f91527c = iGetDataCallback;
            this.f91528d = j;
        }
    }

    @Override // com.ss.android.lark.contact.feat.contact_recommend.mvp.IContactRecContact.IModel
    /* renamed from: a */
    public void mo130682a(IGetDataCallback<List<ContactRecData>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC35414a(this, iGetDataCallback, wrapAndAddGetDataCallback));
    }

    /* renamed from: b */
    public final void mo130683b(IGetDataCallback<List<ContactRecData>> iGetDataCallback) {
        long uptimeMillis = SystemClock.uptimeMillis();
        List<ContactMobileBean> list = null;
        InvAppreciableUtils.BaseAppreciable.m158993a(InvAppreciableUtils.m158977b(), Event.contact_opt_onboarding_fetch_rec_user, false, 2, null);
        List<ContactMobileBean> a = C35466d.m138736a(3);
        if (a != null) {
            if (!a.isEmpty()) {
                list = a;
            }
            if (list != null) {
                int d = ContactDataUtils.m138723d();
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (int i2 = 0; i2 < list.size() && i < d; i2++) {
                    ContactMobileBean contactMobileBean = list.get(i2);
                    if (contactMobileBean != null) {
                        String emailOrPhoneE164 = contactMobileBean.getEmailOrPhoneE164();
                        if (!TextUtils.isEmpty(emailOrPhoneE164)) {
                            i++;
                            Intrinsics.checkExpressionValueIsNotNull(emailOrPhoneE164, "cp");
                            arrayList.add(emailOrPhoneE164);
                            String name = contactMobileBean.getName();
                            Intrinsics.checkExpressionValueIsNotNull(name, "bean.name");
                            hashMap.put(emailOrPhoneE164, name);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ContactApm.f91564a.mo130723a(arrayList.size());
                    C35464c.m138730a(arrayList, new C35415b(this, hashMap, iGetDataCallback, uptimeMillis));
                    return;
                } else if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(new ArrayList());
                    return;
                } else {
                    return;
                }
            }
        }
        if (iGetDataCallback != null) {
            iGetDataCallback.onSuccess(new ArrayList());
        }
    }

    /* renamed from: a */
    public final List<ContactRecData> mo130681a(List<? extends C35469b> list, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (!(list == null || map == null)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C35469b bVar = (C35469b) list.get(i);
                String a = bVar.mo130879a();
                String str = map.get(a);
                if (TextUtils.isEmpty(str)) {
                    str = a;
                }
                C35471d b = bVar.mo130880b();
                ContactRecData aVar = new ContactRecData();
                Intrinsics.checkExpressionValueIsNotNull(b, "userInfo");
                aVar.mo130670a(b.mo130882a());
                aVar.mo130673b(b.mo130883b());
                aVar.mo130675c(this.f91521a + str);
                aVar.mo130669a(b);
                aVar.mo130677d(a);
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }
}
