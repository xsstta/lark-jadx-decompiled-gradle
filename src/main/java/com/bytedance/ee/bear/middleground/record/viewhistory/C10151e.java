package com.bytedance.ee.bear.middleground.record.viewhistory;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.record.p498b.C10123b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.disposables.Disposable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.bear.middleground.record.viewhistory.e */
public class C10151e extends AbstractC1142af {
    public boolean isFinish;
    public boolean isStart = true;
    private C10123b mGetRecordListExecutor;
    public C1177w<C10153a> mLoadingMoreState = new C1177w<>();
    public Disposable mPullDisposable;
    public String nextPageToken;
    private int objType;
    private final int pageSize = 20;
    public C1177w<RecordListResult> resultMutableLiveData = new C1177w<>();
    private String token;

    public C1177w<RecordListResult> getResultMutableLiveData() {
        return this.resultMutableLiveData;
    }

    public C1177w<C10153a> getmLoadingMoreState() {
        return this.mLoadingMoreState;
    }

    public void pull() {
        if (this.isFinish) {
            C13479a.m54764b("ViewHistoryViewModel", "pull: finish");
            this.mLoadingMoreState.mo5929b(new C10153a(0));
            return;
        }
        Disposable disposable = this.mPullDisposable;
        if (disposable != null) {
            disposable.dispose();
            this.mPullDisposable = null;
        }
        if (this.isStart) {
            C13479a.m54764b("ViewHistoryViewModel", "pull: loading");
            this.mLoadingMoreState.mo5929b(new C10153a(1));
        }
        if (!C5084ad.m20847d().mo20038b().mo20041b()) {
            C13479a.m54772d("ViewHistoryViewModel", "pull: no network");
            if (this.isStart) {
                this.mLoadingMoreState.mo5929b(new C10153a(2));
            } else {
                this.mLoadingMoreState.mo5929b(new C10153a(3));
            }
        } else {
            this.mPullDisposable = this.mGetRecordListExecutor.mo38531a(this.token, this.objType, this.nextPageToken, 20, this.isStart, new C10123b.AbstractC10126a() {
                /* class com.bytedance.ee.bear.middleground.record.viewhistory.C10151e.C101521 */

                @Override // com.bytedance.ee.bear.middleground.record.p498b.C10123b.AbstractC10126a
                /* renamed from: a */
                public void mo38534a(RecordListResult recordListResult) {
                    C10151e.this.mPullDisposable = null;
                    C10151e.this.mLoadingMoreState.mo5929b(new C10153a(0));
                    C10151e.this.nextPageToken = recordListResult.nextPageToken;
                    C10151e.this.resultMutableLiveData.mo5929b(recordListResult);
                    if (TextUtils.isEmpty(C10151e.this.nextPageToken)) {
                        C10151e.this.isFinish = true;
                    }
                    if (C10151e.this.isStart && recordListResult.users.size() == 0) {
                        C10151e.this.mLoadingMoreState.mo5929b(new C10153a(5));
                    }
                    if (C10151e.this.isFinish) {
                        C10151e.this.mLoadingMoreState.mo5929b(new C10153a(4));
                    }
                    C13479a.m54764b("ViewHistoryViewModel", "pull: success");
                    C10151e.this.isStart = false;
                }

                @Override // com.bytedance.ee.bear.middleground.record.p498b.C10123b.AbstractC10126a
                /* renamed from: a */
                public void mo38535a(Throwable th) {
                    C10151e.this.mPullDisposable = null;
                    if (th instanceof NetService.ServerErrorException) {
                        try {
                            int optInt = new JSONObject(((NetService.ServerErrorException) th).getJson()).optInt("code");
                            if (optInt == 8) {
                                C13479a.m54764b("ViewHistoryViewModel", "pull: no admin");
                                C10151e.this.mLoadingMoreState.mo5929b(new C10153a(8));
                            } else if (optInt != 9) {
                                C13479a.m54764b("ViewHistoryViewModel", "pull: fail");
                                C10151e.this.mLoadingMoreState.mo5929b(new C10153a(2));
                            } else {
                                C13479a.m54764b("ViewHistoryViewModel", "pull: no privacy");
                                C10151e.this.mLoadingMoreState.mo5929b(new C10153a(9));
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    } else {
                        C13479a.m54759a("ViewHistoryViewModel", "pull: fail", th);
                        if (C10151e.this.isStart) {
                            C10151e.this.mLoadingMoreState.mo5929b(new C10153a(2));
                        } else {
                            C10151e.this.mLoadingMoreState.mo5929b(new C10153a(3));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.record.viewhistory.e$a */
    public static class C10153a {

        /* renamed from: a */
        public int f27427a;

        C10153a(int i) {
            this.f27427a = i;
        }
    }

    public void attach(String str, int i) {
        this.token = str;
        this.objType = i;
        this.isStart = true;
        this.isFinish = false;
        this.nextPageToken = "";
        this.mGetRecordListExecutor = new C10123b();
    }
}
