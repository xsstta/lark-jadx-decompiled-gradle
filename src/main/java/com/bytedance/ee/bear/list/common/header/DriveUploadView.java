package com.bytedance.ee.bear.list.common.header;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.AbstractC4967c;
import com.bytedance.ee.bear.list.common.header.DriveUploadView;
import com.bytedance.ee.bear.middleground.drive.export.BinderIUploadStateMonitor;
import com.bytedance.ee.bear.middleground.drive.export.ProgressingEntity;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p716r.C13721c;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.C68289a;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import org.koin.java.KoinJavaComponent;

public class DriveUploadView extends LinearLayout {

    /* renamed from: a */
    public AbstractC8225a f22156a;

    /* renamed from: b */
    public final C68289a f22157b = new C68289a();

    /* renamed from: c */
    private ProgressBar f22158c;

    /* renamed from: d */
    private TextView f22159d;

    /* renamed from: e */
    private TextView f22160e;

    /* renamed from: f */
    private ImageView f22161f;

    /* renamed from: g */
    private TextView f22162g;

    /* renamed from: h */
    private View f22163h;

    /* renamed from: i */
    private View f22164i;

    /* renamed from: j */
    private C8226a f22165j;

    /* renamed from: k */
    private DriveUploadMonitor f22166k;

    /* renamed from: l */
    private String f22167l;

    /* renamed from: com.bytedance.ee.bear.list.common.header.DriveUploadView$a */
    public interface AbstractC8225a {
        /* renamed from: a */
        void mo32242a(String str, String str2);

        /* renamed from: b */
        void mo32243b();

        /* renamed from: c */
        void mo32244c();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m33725a(String str) throws Exception {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m33731c(String str) throws Exception {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22157b.mo237935a();
    }

    /* access modifiers changed from: private */
    public static class DriveUploadMonitor extends BinderIUploadStateMonitor.Stub {
        private WeakReference<DriveUploadView> viewRef;

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onExistUploadingFile() {
            C13479a.m54764b("DriveUploadView", "onExistUploadingFile()...");
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238018d(new Consumer() {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$Gus598ldoNfvhEEzFzvycIkUCLA */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onExistUploadingFile$2$DriveUploadView$DriveUploadMonitor((Boolean) obj);
                }
            });
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onUploadFinished() {
            C13479a.m54764b("DriveUploadView", "onUploadFinished()...");
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238018d(new Consumer() {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$u5CYoiJGapfX2DmONh1lE2fZ_TM */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onUploadFinished$3$DriveUploadView$DriveUploadMonitor((Boolean) obj);
                }
            });
        }

        DriveUploadMonitor(DriveUploadView driveUploadView) {
            this.viewRef = new WeakReference<>(driveUploadView);
        }

        public /* synthetic */ void lambda$onExistUploadingFile$2$DriveUploadView$DriveUploadMonitor(Boolean bool) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                DriveUploadView driveUploadView = this.viewRef.get();
                if (driveUploadView.f22156a != null) {
                    driveUploadView.f22156a.mo32243b();
                }
                driveUploadView.mo32229b();
            }
        }

        public /* synthetic */ void lambda$onFileProgressChange$0$DriveUploadView$DriveUploadMonitor(Integer num) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.viewRef.get().mo32230b(num.intValue());
            }
        }

        public /* synthetic */ void lambda$onUploadError$4$DriveUploadView$DriveUploadMonitor(Integer num) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.viewRef.get().mo32226a(num.intValue());
            }
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onUploadError(int i) {
            C13479a.m54764b("DriveUploadView", "onUploadError()...");
            AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(C11678b.m48481e()).mo238018d(new Consumer() {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$qBeUa9A7Rlx6eNrGel0QicetN0E */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onUploadError$4$DriveUploadView$DriveUploadMonitor((Integer) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onUploadFinished$3$DriveUploadView$DriveUploadMonitor(Boolean bool) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null && this.viewRef.get().f22156a != null) {
                this.viewRef.get().f22156a.mo32244c();
            }
        }

        public /* synthetic */ void lambda$onUploadErrorCode$5$DriveUploadView$DriveUploadMonitor(int i, String str) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.viewRef.get().mo32231c(i);
            }
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onFileProgressChange(int i, ProgressingEntity progressingEntity) {
            C13479a.m54764b("DriveUploadView", "onFileProgressChange()...");
            AbstractC68307f.m265083a(Integer.valueOf(i)).mo237985a(C11678b.m48481e()).mo238018d(new Consumer() {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$7XAbrF5Gxk9QUhHvYRtrbJ8tgSg */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onFileProgressChange$0$DriveUploadView$DriveUploadMonitor((Integer) obj);
                }
            });
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onUploadErrorCode(String str, int i) {
            C13479a.m54764b("DriveUploadView", "onUploadErrorCode()...");
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238018d(new Consumer(i) {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$W7g9SaHeRTUS0152TUDarcFkAM */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onUploadErrorCode$5$DriveUploadView$DriveUploadMonitor(this.f$1, (String) obj);
                }
            });
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onFileCountChange(int i, int i2) {
            C13479a.m54764b("DriveUploadView", "onFileCountChange()...");
            AbstractC68307f.m265083a((Object) true).mo237985a(C11678b.m48481e()).mo238018d(new Consumer(i, i2) {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$wZZUewhWfTmv0_j_HfFVO6MRUg */
                public final /* synthetic */ int f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onFileCountChange$1$DriveUploadView$DriveUploadMonitor(this.f$1, this.f$2, (Boolean) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onFileCountChange$1$DriveUploadView$DriveUploadMonitor(int i, int i2, Boolean bool) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null) {
                this.viewRef.get().mo32227a(i, i2);
            }
        }

        public /* synthetic */ void lambda$onUploadFileSuccess$6$DriveUploadView$DriveUploadMonitor(String str, String str2, String str3) throws Exception {
            WeakReference<DriveUploadView> weakReference = this.viewRef;
            if (weakReference != null && weakReference.get() != null && this.viewRef.get().f22156a != null) {
                this.viewRef.get().f22156a.mo32242a(str, str2);
            }
        }

        @Override // com.bytedance.ee.bear.middleground.drive.export.AbstractC9363c.AbstractC9364a
        public void onUploadFileSuccess(String str, String str2, String str3) {
            C13479a.m54764b("DriveUploadView", "onUploadFileSuccess()... key =" + str + ", token = " + C13721c.m55650d(str2) + ", nodeToken: " + C13721c.m55650d(str3));
            AbstractC68307f.m265083a("").mo237985a(C11678b.m48481e()).mo238018d(new Consumer(str2, str3) {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$DriveUploadMonitor$af4nseTzvfAgVmpkU5ziKgey2VU */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.DriveUploadMonitor.this.lambda$onUploadFileSuccess$6$DriveUploadView$DriveUploadMonitor(this.f$1, this.f$2, (String) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo32225a() {
        C13479a.m54764b("DriveUploadView", "unObserveProgress. ");
        if (this.f22166k != null) {
            this.f22157b.mo237937a(AbstractC68307f.m265083a("").mo238005b((Consumer) new Consumer() {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$7sc_OmqnhHD_ukAyVTDxHxmwhtg */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.this.m33727b((DriveUploadView) ((String) obj));
                }
            }).mo238001b($$Lambda$DriveUploadView$FI8iPUAZq5LhMJl4Ok7q4340I.INSTANCE, $$Lambda$DriveUploadView$2NIVtbjokCo6v2AFuw4XhFjMC1k.INSTANCE));
        }
    }

    /* renamed from: b */
    public void mo32229b() {
        if (this.f22165j == null) {
            this.f22165j = new C8226a();
        }
        this.f22165j.mo32254e(0);
        m33732d();
    }

    /* renamed from: c */
    private void m33730c() {
        View.inflate(getContext(), R.layout.list_upload_item_view, this);
        this.f22158c = (ProgressBar) findViewById(R.id.upload_progress_bar);
        this.f22159d = (TextView) findViewById(R.id.upload_progress_count);
        this.f22160e = (TextView) findViewById(R.id.upload_title_text);
        this.f22161f = (ImageView) findViewById(R.id.upload_state_icon);
        this.f22162g = (TextView) findViewById(R.id.upload_failed_title_text);
        this.f22163h = findViewById(R.id.above_line);
        this.f22164i = findViewById(R.id.under_line);
    }

    /* renamed from: d */
    private void m33732d() {
        C8226a aVar = this.f22165j;
        if (aVar != null) {
            this.f22158c.setProgress(aVar.mo32251d());
            int b = this.f22165j.mo32247b() + 1;
            int c = this.f22165j.mo32249c();
            if (c == 0) {
                b = 0;
            }
            this.f22159d.setText(String.format("%d/%d", Integer.valueOf(b), Integer.valueOf(c)));
            if (this.f22165j.mo32253e() == 16) {
                String quantityString = getContext().getResources().getQuantityString(R.plurals.Doc_List_UploadedFail, this.f22165j.mo32245a(), Integer.valueOf(this.f22165j.mo32245a()));
                this.f22160e.setVisibility(8);
                this.f22158c.setVisibility(8);
                this.f22159d.setVisibility(8);
                this.f22161f.setVisibility(0);
                this.f22162g.setVisibility(0);
                this.f22162g.setText(quantityString);
                return;
            }
            this.f22160e.setVisibility(0);
            this.f22158c.setVisibility(0);
            this.f22159d.setVisibility(0);
            this.f22161f.setVisibility(8);
            this.f22162g.setVisibility(8);
            this.f22160e.setText(R.string.Doc_List_UploadingFile);
        }
    }

    public void setViewDelegate(AbstractC8225a aVar) {
        this.f22156a = aVar;
    }

    public DriveUploadView(Context context) {
        super(context);
        m33730c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m33727b(String str) throws Exception {
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19652a(this.f22166k);
    }

    public void setAboveLineVisible(boolean z) {
        int i;
        View view = this.f22163h;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public void mo32226a(int i) {
        C8226a aVar = this.f22165j;
        if (aVar != null) {
            aVar.mo32246a(i);
            this.f22165j.mo32254e(16);
            m33732d();
        }
    }

    /* renamed from: b */
    public void mo32230b(int i) {
        C8226a aVar = this.f22165j;
        if (aVar != null) {
            aVar.mo32252d(i);
            m33732d();
        }
    }

    /* renamed from: c */
    public void mo32231c(int i) {
        boolean z;
        C13479a.m54764b("DriveUploadView", "errorCode = " + i);
        if (this.f22165j != null) {
            if (i == 13001) {
                Context context = getContext();
                C13479a.m54764b("DriveUploadView", "context = " + context);
                if (context instanceof FragmentActivity) {
                    ((AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class)).mo40012a((FragmentActivity) context, FullQuotoConfig.UPLOAD);
                }
            } else if (i == 90003061 && (getContext() instanceof FragmentActivity)) {
                AbstractC10575k kVar = (AbstractC10575k) KoinJavaComponent.m268610a(AbstractC10575k.class);
                FragmentActivity fragmentActivity = (FragmentActivity) getContext();
                if (TextUtils.isEmpty(this.f22167l) || "all_files_token".equals(this.f22167l)) {
                    z = false;
                } else {
                    z = true;
                }
                kVar.mo40013a(fragmentActivity, null, null, z);
            }
        }
    }

    /* renamed from: a */
    public void mo32227a(int i, int i2) {
        C8226a aVar = this.f22165j;
        if (aVar != null) {
            aVar.mo32248b(i);
            this.f22165j.mo32250c(i2);
            m33732d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m33728b(String str, String str2, String str3) throws Exception {
        ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19655a(str, str2, this.f22166k);
    }

    /* renamed from: a */
    public void mo32228a(final String str, final String str2, final String str3) {
        C13479a.m54764b("DriveUploadView", "observeProgress, key: " + C13598b.m55197d(str) + ", mountPoint: " + str2);
        this.f22167l = str;
        if (this.f22166k == null) {
            this.f22166k = new DriveUploadMonitor(this);
            this.f22157b.mo237937a(AbstractC68307f.m265083a("").mo238005b((Consumer) new Consumer(str, str2) {
                /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$5fAM9TsF2ylVJUGdcuEvKt4MA88 */
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    DriveUploadView.this.m33728b(this.f$1, this.f$2, (String) obj);
                }
            }).mo238001b($$Lambda$DriveUploadView$hru54DXoTBunig_RUzOHzRjzg.INSTANCE, $$Lambda$DriveUploadView$TSDC2Twv6nQzu2vBXYevPwY0k.INSTANCE));
            setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.list.common.header.DriveUploadView.C82241 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m33740a(String str) throws Exception {
                }

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    DriveUploadView.this.f22157b.mo237937a(AbstractC68307f.m265083a("").mo238005b((Consumer) new Consumer(str, str2, str3) {
                        /* class com.bytedance.ee.bear.list.common.header.$$Lambda$DriveUploadView$1$fC8ky0YHtQKMCg9yfxnla8EEAI */
                        public final /* synthetic */ String f$0;
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ String f$2;

                        {
                            this.f$0 = r1;
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj) {
                            DriveUploadView.C82241.m33741a(this.f$0, this.f$1, this.f$2, (String) obj);
                        }
                    }).mo238001b($$Lambda$DriveUploadView$1$n2vqDZ9dtEwwP9IpTK48h6MlRs.INSTANCE, $$Lambda$DriveUploadView$1$H1FFoGw5fL8DcxzG2etwo2Blc.INSTANCE));
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m33741a(String str, String str2, String str3, String str4) throws Exception {
                    ((AbstractC4967c) KoinJavaComponent.m268610a(AbstractC4967c.class)).mo19656a(str, str2, str3);
                }
            });
        }
    }
}
