package com.bytedance.ee.bear.contract;

import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;

public class DeleteDocCallbackWrapper extends BinderIDeleteDocCallback.Stub {
    public am.AbstractC5108a mCallback;

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onPostExecuteSuccess() {
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50685 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (DeleteDocCallbackWrapper.this.mCallback != null) {
                    DeleteDocCallbackWrapper.this.mCallback.onPostExecuteSuccess();
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50696 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("DeleteDocCallbackWrapper", "onPostExecuteSuccess()...", th);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onPreExecute() {
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50641 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (DeleteDocCallbackWrapper.this.mCallback != null) {
                    DeleteDocCallbackWrapper.this.mCallback.onPreExecute();
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50652 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("DeleteDocCallbackWrapper", "onPreExecute()...", th);
            }
        });
    }

    public DeleteDocCallbackWrapper(am.AbstractC5108a aVar) {
        this.mCallback = aVar;
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onOfflinePostExecute(final boolean z) {
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50663 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (DeleteDocCallbackWrapper.this.mCallback != null) {
                    DeleteDocCallbackWrapper.this.mCallback.onOfflinePostExecute(z);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50674 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("DeleteDocCallbackWrapper", "onOfflinePostExecute()...", th);
            }
        });
    }

    @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
    public void onPostExecuteFail(final int i) {
        AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238001b(new Consumer<Boolean>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50707 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (DeleteDocCallbackWrapper.this.mCallback != null) {
                    DeleteDocCallbackWrapper.this.mCallback.onPostExecuteFail(i);
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper.C50718 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54759a("DeleteDocCallbackWrapper", "onPostExecuteFail()...", th);
            }
        });
    }
}
