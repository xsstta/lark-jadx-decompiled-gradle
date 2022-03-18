package com.ss.android.lark.mail.impl.message.file;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.lark.pb.email.client.v1.MailShareAttachmentResponse;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailAttachment;
import com.ss.android.lark.mail.impl.entity.MailImage;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import java.util.ArrayList;

public class ShareDriveFileInvisibleActivity extends Activity {

    /* renamed from: a */
    private final String f109312a = "ShareDriveFileInvisibleActivity";

    /* renamed from: b */
    private final int f109313b = 1018;

    /* renamed from: c */
    private C43909a f109314c;

    /* renamed from: d */
    private int f109315d = -1;

    /* renamed from: e */
    private boolean f109316e;

    /* renamed from: b */
    public void mo153988b() {
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        m170912a(this);
    }

    /* renamed from: a */
    public void mo153987a() {
        C43909a aVar = this.f109314c;
        if (aVar != null) {
            aVar.mo156326a();
        }
    }

    /* renamed from: c */
    private void m170913c() {
        if (this.f109314c == null) {
            this.f109314c = new C43909a(this);
        }
        this.f109314c.mo156327a(C43819s.m173684a((int) R.string.Mail_Normal_Loading));
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f109315d == 35484 && this.f109316e) {
            Log.m165389i("ShareDriveFileInvisibleActivity", "onResume showOversizeToast");
            this.f109316e = false;
            MailToast.m173697a((int) R.string.Mail_Attachment_LargeAttachmentCannotShareToChatToast);
            C42209j.m168612a("read_preview_largefile_send_to_chat_fail", "toast");
            C43849u.m173826a(new Runnable() {
                /* class com.ss.android.lark.mail.impl.message.file.ShareDriveFileInvisibleActivity.RunnableC429201 */

                public void run() {
                    C43752b.m173435a(ShareDriveFileInvisibleActivity.this);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m170912a(ShareDriveFileInvisibleActivity shareDriveFileInvisibleActivity) {
        shareDriveFileInvisibleActivity.mo153988b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShareDriveFileInvisibleActivity shareDriveFileInvisibleActivity2 = shareDriveFileInvisibleActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    shareDriveFileInvisibleActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("purpose", -1);
        this.f109315d = intExtra;
        if (intExtra == 35484) {
            Log.m165389i("ShareDriveFileInvisibleActivity", "onCreate PURPOSE_TOAST_OVERSIZE_FILE");
            this.f109316e = true;
        } else if (intExtra != 8383732) {
            Log.m165383e("ShareDriveFileInvisibleActivity", "onCreate purpose not recognized");
            C43752b.m173435a(this);
        } else {
            Log.m165389i("ShareDriveFileInvisibleActivity", "onCreate PURPOSE_SHARE_DRIVE_FILE");
            C41816b.m166115a().mo150122a(this, 1018, m170911a(getIntent(), "extra_data"), getIntent().getIntExtra("sharing_icon_res_id", R.drawable.mail_share_icon), getIntent().getStringExtra("sharing_title"));
        }
    }

    /* renamed from: a */
    public static Bundle m170911a(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m165389i("ShareDriveFileInvisibleActivity", "onActivityResult requestCode: " + i);
        if (i2 != -1) {
            Log.m165389i("ShareDriveFileInvisibleActivity", "onActivityResult not RESULT_OK");
            C43752b.m173435a(this);
        } else if (i != 1018) {
            Log.m165389i("ShareDriveFileInvisibleActivity", "onActivityResult switch to default");
            C43752b.m173435a(this);
        } else if (intent == null || intent.getExtras() == null) {
            Log.m165383e("ShareDriveFileInvisibleActivity", "onActivityResult REQUEST_CODE_SELECT_SHARE_ATTACHMENT empty data");
        } else {
            Bundle extras = intent.getExtras();
            Object obj = extras.get("bundle_key_share_drive_file");
            String str = null;
            if (obj instanceof MailAttachment) {
                str = ((MailAttachment) obj).mo151234j();
            } else if (obj instanceof MailImage) {
                str = ((MailImage) obj).mo151480f();
            }
            if (TextUtils.isEmpty(str)) {
                Log.m165383e("ShareDriveFileInvisibleActivity", "onActivityResult share drive files empty token");
                return;
            }
            ArrayList<String> stringArrayList = extras.getStringArrayList("forwardToChatChatIDList");
            if (CollectionUtils.isEmpty(stringArrayList)) {
                Log.m165383e("ShareDriveFileInvisibleActivity", "onActivityResult share drive files invalid target");
                return;
            }
            m170913c();
            C42176e.m168344a().mo152211a(str, extras.getString(C41816b.m166115a().mo150150q(), ""), stringArrayList, new IGetDataCallback<MailShareAttachmentResponse>() {
                /* class com.ss.android.lark.mail.impl.message.file.ShareDriveFileInvisibleActivity.C429212 */

                /* renamed from: a */
                public void onSuccess(MailShareAttachmentResponse mailShareAttachmentResponse) {
                    Log.m165389i("ShareDriveFileInvisibleActivity", "onSuccess");
                    ShareDriveFileInvisibleActivity.this.mo153987a();
                    MailToast.m173697a((int) R.string.Mail_Share_SharedSuccessfully);
                    C42187a.m168528e(true);
                    C43752b.m173435a(ShareDriveFileInvisibleActivity.this);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165389i("ShareDriveFileInvisibleActivity", "onError");
                    ShareDriveFileInvisibleActivity.this.mo153987a();
                    MailToast.m173697a((int) R.string.Mail_Share_FailedToShare);
                    C42187a.m168528e(false);
                    C43752b.m173435a(ShareDriveFileInvisibleActivity.this);
                }
            });
        }
    }
}
