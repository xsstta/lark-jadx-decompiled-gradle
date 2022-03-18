package com.bytedance.ee.bear.more.itemv2;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.ee.bear.contract.BinderIDeleteDocCallback;
import com.bytedance.ee.bear.contract.DeleteDocCallbackWrapper;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.document.AbstractC6158t;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.more.C10196b;
import com.bytedance.ee.bear.more.export.IMoreInfo;
import com.bytedance.ee.bear.more.moreprotocol.IMoreHost;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.C11824c;
import com.bytedance.ee.bear.widgets.dialog.checkboxdialog.BearUDCheckBoxDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.more.itemv2.a */
public class C10232a {

    /* renamed from: a */
    public Context f27617a;

    /* renamed from: b */
    public C11824c f27618b;

    C10232a(Activity activity) {
        this.f27617a = activity;
        this.f27618b = new C11824c(activity, true);
    }

    /* renamed from: a */
    public void mo39150a(int i) {
        if (i == 4202) {
            Toast.showFailureText(this.f27617a.getApplicationContext(), (int) R.string.CreationMobile_DataUpgrade_Locked_toast);
        } else {
            Toast.showFailureText(this.f27617a.getApplicationContext(), this.f27617a.getString(R.string.Doc_Facade_DeleteFailed), 0);
        }
    }

    /* renamed from: a */
    public void mo39151a(IMoreHost aVar) {
        String str;
        IMoreInfo a = aVar.mo39164a();
        C13479a.m54772d("DeleteItemCallbackV2", "onItemClick: docInfoData = " + a);
        C10196b.m42465a(a, "delete");
        if (a != null) {
            aVar.mo39166c();
            DeleteDocCallbackWrapper deleteDocCallbackWrapper = new DeleteDocCallbackWrapper(new am.AbstractC5108a() {
                /* class com.bytedance.ee.bear.more.itemv2.C10232a.C102331 */

                @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
                public void onPreExecute() {
                    C13479a.m54772d("DeleteItemCallbackV2", "deleteDoc: onPreExecute");
                    C10232a.this.f27618b.mo45304d();
                }

                @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
                public void onPostExecuteSuccess() {
                    C13479a.m54772d("DeleteItemCallbackV2", "deleteDoc: onPostExecuteSuccess");
                    C10232a.this.f27618b.mo45303c();
                    Toast.showSuccessText(C10232a.this.f27617a, C10232a.this.f27617a.getString(R.string.Doc_Facade_DeleteSuccessfully), 0);
                }

                @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
                public void onPostExecuteFail(int i) {
                    C13479a.m54764b("DeleteItemCallbackV2", "deleteDoc: onPostExecuteFail");
                    C10232a.this.f27618b.mo45303c();
                    C10232a.this.mo39150a(i);
                }

                @Override // com.bytedance.ee.bear.contract.am.AbstractC5108a
                public void onOfflinePostExecute(boolean z) {
                    C13479a.m54764b("DeleteItemCallbackV2", "deleteDoc: onOfflinePostExecute, success = " + z);
                    C10232a.this.f27618b.mo45303c();
                    if (!z) {
                        C10232a.this.mo39150a(-1);
                    }
                }
            });
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(a.mo39042i())) {
                str = ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31517c(this.f27617a, a.mo39036e());
            } else {
                str = a.mo39042i();
            }
            hashMap.put("doc_name", str);
            hashMap.put("doc_type", ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31489a(this.f27617a, a.mo39036e()));
            UDDialog build = ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) ((BearUDCheckBoxDialogBuilder) new BearUDCheckBoxDialogBuilder(this.f27617a).title(C10539a.m43640a(this.f27617a, R.string.Doc_Contract_Remove_Owner_Document_Dialog_Title, hashMap))).titleSize(16)).titleGravity(8388611)).message(R.string.Doc_Contract_Remove_Owner_Document_Dialog_Content)).messageTextSize(14)).messageGravity(8388611)).mo45382b(false).addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(R.id.ud_dialog_btn_primary).mo90710d(R.color.function_danger_500).mo90706b(R.string.Doc_Facade_Delete).mo90703a(new DialogInterface.OnClickListener(a, deleteDocCallbackWrapper) {
                /* class com.bytedance.ee.bear.more.itemv2.$$Lambda$a$0Z12yBMlCIX1aiCFLTqziYjCHD0 */
                public final /* synthetic */ IMoreInfo f$1;
                public final /* synthetic */ BinderIDeleteDocCallback f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C10232a.this.m42696a((C10232a) this.f$1, (IMoreInfo) this.f$2, (BinderIDeleteDocCallback) dialogInterface, (DialogInterface) i);
                }
            }))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Doc_Facade_Cancel, (DialogInterface.OnClickListener) null)).build();
            build.show();
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40651a(a.mo39041h(), String.valueOf(a.mo39036e()), build);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m42696a(IMoreInfo dVar, BinderIDeleteDocCallback binderIDeleteDocCallback, DialogInterface dialogInterface, int i) {
        m42697a(dVar.mo39041h(), dVar.mo39036e(), dVar.mo39031c(), binderIDeleteDocCallback);
    }

    /* renamed from: a */
    private void m42697a(String str, int i, int i2, BinderIDeleteDocCallback binderIDeleteDocCallback) {
        if (((AbstractC6158t) KoinJavaComponent.m268610a(AbstractC6158t.class)).mo20317a(str)) {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31503a(str, binderIDeleteDocCallback);
        } else {
            ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31498a(str, i, i2, binderIDeleteDocCallback);
        }
    }
}
