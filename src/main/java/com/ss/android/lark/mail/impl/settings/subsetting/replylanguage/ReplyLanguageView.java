package com.ss.android.lark.mail.impl.settings.subsetting.replylanguage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.LifecycleOwner;
import butterknife.BindView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.ReplyLanguage;
import com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.AbstractC43535a;

public class ReplyLanguageView implements View.OnClickListener, AbstractC43535a.AbstractC43537b {

    /* renamed from: a */
    private Context f110502a;

    /* renamed from: b */
    private AbstractC43534a f110503b;

    /* renamed from: c */
    private AbstractC43535a.AbstractC43537b.AbstractC43538a f110504c;
    @BindView(9346)
    View mAutoLayout;
    @BindView(9348)
    UDCheckBox mAutoRadio;
    @BindView(9351)
    View mCnLayout;
    @BindView(9353)
    UDCheckBox mCnRadio;
    @BindView(9355)
    View mEnLayout;
    @BindView(9357)
    UDCheckBox mEnRadio;

    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView$a */
    public interface AbstractC43534a {
        /* renamed from: a */
        void mo155429a(ReplyLanguageView replyLanguageView);
    }

    /* renamed from: a */
    public void mo155430a() {
        ((Activity) this.f110502a).finish();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f110504c = null;
        this.f110503b = null;
    }

    /* renamed from: c */
    private void m172813c() {
        this.mAutoLayout.setOnClickListener(this);
        this.mCnLayout.setOnClickListener(this);
        this.mEnLayout.setOnClickListener(this);
    }

    /* renamed from: b */
    public LifecycleOwner mo155433b() {
        return (ComponentActivity) this.f110502a;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f110503b.mo155429a(this);
        m172813c();
        m172814d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView$1 */
    public static /* synthetic */ class C435331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110505a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.mail.impl.entity.ReplyLanguage[] r0 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView.C435331.f110505a = r0
                com.ss.android.lark.mail.impl.entity.ReplyLanguage r1 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.US     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView.C435331.f110505a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.entity.ReplyLanguage r1 = com.ss.android.lark.mail.impl.entity.ReplyLanguage.ZH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.settings.subsetting.replylanguage.ReplyLanguageView.C435331.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m172814d() {
        if (C41816b.m166115a().mo150154u().mo150161b("larkmail.cli.hide_ai_point")) {
            this.mAutoLayout.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC43535a.AbstractC43537b.AbstractC43538a aVar) {
        this.f110504c = aVar;
    }

    /* renamed from: b */
    private void m172812b(ReplyLanguage replyLanguage) {
        this.f110504c.mo155437a(replyLanguage);
    }

    /* renamed from: a */
    public void mo155431a(ReplyLanguage replyLanguage) {
        int i = C435331.f110505a[replyLanguage.ordinal()];
        if (i == 1) {
            this.mAutoRadio.setChecked(false);
            this.mCnRadio.setChecked(false);
            this.mEnRadio.setChecked(true);
        } else if (i != 2) {
            this.mAutoRadio.setChecked(true);
            this.mCnRadio.setChecked(false);
            this.mEnRadio.setChecked(false);
        } else {
            this.mAutoRadio.setChecked(false);
            this.mCnRadio.setChecked(true);
            this.mEnRadio.setChecked(false);
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.mail_lang_auto_layout) {
            m172812b(ReplyLanguage.AUTO);
        } else if (id == R.id.mail_lang_en_layout) {
            m172812b(ReplyLanguage.US);
        } else if (id == R.id.mail_lang_cn_layout) {
            m172812b(ReplyLanguage.ZH);
        }
    }

    public ReplyLanguageView(Context context, AbstractC43534a aVar) {
        this.f110502a = context;
        this.f110503b = aVar;
    }
}
