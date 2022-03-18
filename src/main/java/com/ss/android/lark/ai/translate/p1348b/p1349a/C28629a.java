package com.ss.android.lark.ai.translate.p1348b.p1349a;

import android.app.Dialog;
import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.statistics.translate.TranslateHitPoint;
import com.ss.android.lark.ai.translate.feedback.DialogC28632a;
import com.ss.android.lark.ai.translate.feedback.TranslationFeedback;
import com.ss.android.lark.ai.translate.p1347a.AbstractC28625a;
import com.ss.android.lark.ai.translate.p1347a.C28626b;
import com.ss.android.lark.ai.translate.p1348b.AbstractC28628a;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.ai.translate.b.a.a */
public class C28629a implements AbstractC28628a {

    /* renamed from: a */
    private final AbstractC28625a f72023a;

    public C28629a() {
        this(new C28626b());
    }

    public C28629a(AbstractC28625a aVar) {
        this.f72023a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104970a(Context context, TranslationFeedback translationFeedback) {
        this.f72023a.mo101870a(translationFeedback, new UIGetDataCallback(new IGetDataCallback<Boolean>(context) {
            /* class com.ss.android.lark.ai.translate.p1348b.p1349a.C28629a.C286301 */

            /* renamed from: a */
            final /* synthetic */ Context f72024a;

            /* renamed from: c */
            private final WeakReference f72026c;

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                Context context = (Context) this.f72026c.get();
                if (context != null) {
                    LKUIToast.loadSuccess(context, UIHelper.getString(R.string.Lark_Chat_TranslationFeedbackThanksToast));
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Context context = (Context) this.f72026c.get();
                if (context != null) {
                    LKUIToast.show(context, UIHelper.getString(R.string.Lark_Legacy_FeedbackFailed));
                }
            }

            {
                this.f72024a = r2;
                this.f72026c = new WeakReference(r2);
            }
        }));
    }

    @Override // com.ss.android.lark.ai.translate.p1348b.AbstractC28628a
    /* renamed from: a */
    public Dialog mo101872a(Context context, String str, String str2, String str3, String str4, String str5) {
        DialogC28632a aVar = new DialogC28632a(context, TranslateHitPoint.f71692b);
        aVar.mo101881a(new DialogC28632a.AbstractC28641a(context) {
            /* class com.ss.android.lark.ai.translate.p1348b.p1349a.$$Lambda$a$ftnFh4g_H63QtpeYJ3I4oTmju4I */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.ss.android.lark.ai.translate.feedback.DialogC28632a.AbstractC28641a
            public final void onFeedback(TranslationFeedback translationFeedback) {
                C28629a.this.m104970a(this.f$1, translationFeedback);
            }
        });
        aVar.mo101882a(str, str2, str3, str4, str5);
        return aVar;
    }
}
