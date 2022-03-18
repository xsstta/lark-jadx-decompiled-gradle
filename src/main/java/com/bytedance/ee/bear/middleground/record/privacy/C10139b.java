package com.bytedance.ee.bear.middleground.record.privacy;

import android.content.Context;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.middleground.record.C10115a;
import com.bytedance.ee.bear.middleground.record.p498b.C10118a;
import com.bytedance.ee.bear.middleground.record.p498b.C10123b;
import com.bytedance.ee.bear.middleground.record.p498b.C10128c;
import com.bytedance.ee.bear.middleground.record.viewhistory.RecordListResult;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.disposables.Disposable;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.record.privacy.b */
public class C10139b extends AbstractC1142af {
    public Disposable disposableAdmin;
    public Disposable disposableGet;
    public Disposable disposableSet;
    public C1177w<Boolean> isCheckMutableLiveData = new C1177w<>();
    private C10118a mGetPrivacyExecutor;
    private C10123b mGetRecordListExecutor;
    private C10128c mSetPrivacyExecutor;
    private int objType;
    public C1177w<Integer> stateMutableLiveData = new C1177w<>();
    private String token;

    public C1177w<Boolean> getIsCheckMutableLiveData() {
        return this.isCheckMutableLiveData;
    }

    public C1177w<Integer> getStateMutableLiveData() {
        return this.stateMutableLiveData;
    }

    public void getPrivacy() {
        C13479a.m54764b("PrivacyModel", "getPrivacy: ..");
        Disposable disposable = this.disposableGet;
        if (disposable != null) {
            disposable.dispose();
            this.disposableGet = null;
        }
        this.disposableGet = this.mGetPrivacyExecutor.mo38526a(new C10118a.AbstractC10121a() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.C10139b.C101412 */

            @Override // com.bytedance.ee.bear.middleground.record.p498b.C10118a.AbstractC10121a
            /* renamed from: a */
            public void mo38529a(Boolean bool) {
                C10139b.this.disposableGet = null;
                C10139b.this.stateMutableLiveData.mo5929b((Integer) 1);
                C10139b.this.isCheckMutableLiveData.mo5929b(bool);
            }

            @Override // com.bytedance.ee.bear.middleground.record.p498b.C10118a.AbstractC10121a
            /* renamed from: a */
            public void mo38530a(Throwable th) {
                C10139b.this.disposableGet = null;
                C10139b.this.stateMutableLiveData.mo5929b((Integer) 4);
            }
        });
    }

    public void getData() {
        Disposable disposable = this.disposableAdmin;
        if (disposable != null) {
            disposable.dispose();
            this.disposableAdmin = null;
        }
        if (this.stateMutableLiveData.mo5927b() == null || this.stateMutableLiveData.mo5927b().intValue() != 4) {
            this.stateMutableLiveData.mo5929b((Integer) 0);
        }
        this.disposableAdmin = this.mGetRecordListExecutor.mo38531a(this.token, this.objType, "", 1, true, new C10123b.AbstractC10126a() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.C10139b.C101401 */

            @Override // com.bytedance.ee.bear.middleground.record.p498b.C10123b.AbstractC10126a
            /* renamed from: a */
            public void mo38534a(RecordListResult recordListResult) {
                C10139b.this.disposableAdmin = null;
                C10139b.this.stateMutableLiveData.mo5929b((Integer) 1);
                C10139b.this.isCheckMutableLiveData.mo5929b((Boolean) true);
            }

            @Override // com.bytedance.ee.bear.middleground.record.p498b.C10123b.AbstractC10126a
            /* renamed from: a */
            public void mo38535a(Throwable th) throws Exception {
                C10139b.this.disposableAdmin = null;
                if (th instanceof NetService.ServerErrorException) {
                    int i = new JSONObject(((NetService.ServerErrorException) th).getJson()).getInt("code");
                    if (i == 1 || i == 2) {
                        C13479a.m54764b("PrivacyModel", "getAdmin: fail");
                        C10139b.this.stateMutableLiveData.mo5929b((Integer) 4);
                    } else if (i == 8) {
                        C13479a.m54764b("PrivacyModel", "getAdmin: no admin");
                        C10139b.this.stateMutableLiveData.mo5929b((Integer) 2);
                    } else if (i == 9) {
                        C13479a.m54764b("PrivacyModel", "getAdmin: no privacy");
                        C10139b.this.stateMutableLiveData.mo5929b((Integer) 1);
                        C10139b.this.isCheckMutableLiveData.mo5929b((Boolean) false);
                    } else {
                        C10139b.this.getPrivacy();
                    }
                }
            }
        });
    }

    public void pushPrivacy(final boolean z) {
        C13479a.m54764b("PrivacyModel", "pushPrivacy: ..");
        Disposable disposable = this.disposableSet;
        if (disposable != null) {
            disposable.dispose();
            this.disposableSet = null;
        }
        this.disposableSet = this.mSetPrivacyExecutor.mo38537a(z, new C10128c.AbstractC10131a() {
            /* class com.bytedance.ee.bear.middleground.record.privacy.C10139b.C101423 */

            @Override // com.bytedance.ee.bear.middleground.record.p498b.C10128c.AbstractC10131a
            /* renamed from: a */
            public void mo38540a() {
                C10139b.this.disposableSet = null;
                if (z) {
                    Toast.showSuccessText(C13615c.f35773a, C13749l.m55745a((Context) C13615c.f35773a, (int) R.string.CreationMobile_Stats_Visits_OnToast));
                    C10115a.m42132a("read_record_open");
                } else {
                    Toast.showSuccessText(C13615c.f35773a, C13749l.m55745a((Context) C13615c.f35773a, (int) R.string.CreationMobile_Stats_Visits_OffToast));
                    C10115a.m42132a("read_record_close");
                }
                C10139b.this.stateMutableLiveData.mo5929b((Integer) 1);
                C10139b.this.isCheckMutableLiveData.mo5929b(Boolean.valueOf(z));
            }

            @Override // com.bytedance.ee.bear.middleground.record.p498b.C10128c.AbstractC10131a
            /* renamed from: a */
            public void mo38541a(Throwable th) throws Exception {
                C10139b.this.disposableSet = null;
                C10139b.this.stateMutableLiveData.mo5929b((Integer) 3);
            }
        });
    }

    public void attach(String str, int i) {
        this.token = str;
        this.objType = i;
        this.mGetRecordListExecutor = new C10123b();
        this.mGetPrivacyExecutor = new C10118a();
        this.mSetPrivacyExecutor = new C10128c();
    }
}
