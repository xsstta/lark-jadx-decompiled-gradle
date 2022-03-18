package com.ss.android.lark.invitation.v2.feat.external.main;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.component.dybrid.h5api.api.AbstractC24158a;
import com.larksuite.component.dybrid.h5api.api.AbstractC24169l;
import com.larksuite.component.dybrid.h5api.api.H5Event;
import com.ss.android.lark.invitation.v2.feat.external.contact.v1.InviteExternalContactActivity;
import com.ss.android.lark.utils.C57805b;
import org.json.JSONException;

/* renamed from: com.ss.android.lark.invitation.v2.feat.external.main.c */
public class C40275c implements AbstractC24169l {
    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: a */
    public boolean mo86747a(H5Event h5Event) throws JSONException {
        return false;
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: d */
    public void mo86749d() {
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24169l
    /* renamed from: a */
    public void mo86761a(AbstractC24158a aVar) {
        aVar.mo86723a("biz.contact.external.invite");
    }

    @Override // com.larksuite.component.dybrid.h5api.api.AbstractC24167j
    /* renamed from: b */
    public boolean mo86748b(H5Event h5Event) throws JSONException {
        if (!(h5Event == null || h5Event.mo86710d() == null || !"biz.contact.external.invite".equals(h5Event.mo86707b()))) {
            String optString = h5Event.mo86710d().optString("smsText");
            h5Event.mo86710d().optInt("dataSourceType");
            if (!TextUtils.isEmpty(optString)) {
                h5Event.mo86701a(new H5Event.AbstractC24157b(optString) {
                    /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$c$UBQ9lrOyrcLafHrHia5zYUyhws */
                    public final /* synthetic */ String f$0;

                    {
                        this.f$0 = r1;
                    }

                    @Override // com.larksuite.component.dybrid.h5api.api.H5Event.AbstractC24157b
                    public final void onCreated(Activity activity, boolean z) {
                        C40275c.m159618a(this.f$0, activity, z);
                    }
                });
            } else {
                h5Event.mo86706a(H5Event.Error.INVALID_PARAM);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m159617a(Activity activity, String str, boolean z) {
        if (z) {
            InviteExternalContactActivity.m159404a(activity, str, "unknown");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m159618a(String str, Activity activity, boolean z) {
        C57805b.m224332c(activity, new C57805b.AbstractC57809a(activity, str) {
            /* class com.ss.android.lark.invitation.v2.feat.external.main.$$Lambda$c$dUHZFtDwZ0qaIcKm4Y3tVMpJpWc */
            public final /* synthetic */ Activity f$0;
            public final /* synthetic */ String f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public final void permissionGranted(boolean z) {
                C40275c.m159617a(this.f$0, this.f$1, z);
            }
        });
    }
}
