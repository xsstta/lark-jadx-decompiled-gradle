package com.ss.android.lark.mail.impl.compose.attachment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.progress.UDProgress;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.utils.C43760c;
import com.ss.android.lark.mail.impl.utils.C43766i;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.mail.impl.compose.attachment.c */
public class C41941c {

    /* renamed from: a */
    public final AbstractC41945a f106453a;

    /* renamed from: b */
    public LocalAttachment f106454b;

    /* renamed from: c */
    public final boolean f106455c;

    /* renamed from: d */
    private final String f106456d = "AttachmentItemView";

    /* renamed from: e */
    private final Context f106457e;

    /* renamed from: f */
    private View f106458f;

    /* renamed from: g */
    private View f106459g;

    /* renamed from: h */
    private ImageView f106460h;

    /* renamed from: i */
    private ImageView f106461i;

    /* renamed from: j */
    private TextView f106462j;

    /* renamed from: k */
    private TextView f106463k;

    /* renamed from: l */
    private TextView f106464l;

    /* renamed from: m */
    private TextView f106465m;

    /* renamed from: n */
    private ImageView f106466n;

    /* renamed from: o */
    private UDProgress f106467o;

    /* renamed from: p */
    private ImageView f106468p;

    /* renamed from: q */
    private ImageView f106469q;

    /* renamed from: com.ss.android.lark.mail.impl.compose.attachment.c$a */
    public interface AbstractC41945a {
        /* renamed from: a */
        void mo150780a(String str);

        /* renamed from: b */
        void mo150785b(String str);

        /* renamed from: c */
        void mo150786c(String str);
    }

    /* renamed from: a */
    public View mo150789a() {
        return this.f106458f;
    }

    /* renamed from: b */
    public LocalAttachment mo150793b() {
        return this.f106454b;
    }

    /* renamed from: c */
    private void m166751c() {
        View inflate = LayoutInflater.from(this.f106457e).inflate(R.layout.mail_compose_attachment_item_layout, (ViewGroup) null);
        this.f106458f = inflate;
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.attachment.C41941c.View$OnClickListenerC419421 */

            public void onClick(View view) {
                if (C41941c.this.f106453a != null && C41941c.this.f106454b != null) {
                    if (C41941c.this.f106454b.mo151236l() == 0 || System.currentTimeMillis() <= C41941c.this.f106454b.mo151236l()) {
                        C41941c.this.f106453a.mo150786c(C41941c.this.f106454b.mo150760a());
                    } else {
                        MailToast.m173700a(C43819s.m173686a(R.string.Mail_Attachment_CantViewDesc, "ExpireDate", C43760c.m173467a(C41941c.this.f106454b.mo151236l(), false)));
                    }
                }
            }
        });
        this.f106459g = this.f106458f.findViewById(R.id.compose_mail_attachment_item_layout);
        this.f106460h = (ImageView) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_icon);
        this.f106469q = (ImageView) this.f106458f.findViewById(R.id.compose_mail_attachment_large_file_icon);
        this.f106462j = (TextView) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_title);
        this.f106461i = (ImageView) this.f106458f.findViewById(R.id.compose_mail_attachment_subinfo_divider);
        this.f106463k = (TextView) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_description);
        this.f106464l = (TextView) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_size);
        this.f106465m = (TextView) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_harmful);
        this.f106467o = (UDProgress) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_progress_bar);
        ImageView imageView = (ImageView) this.f106458f.findViewById(R.id.compose_mail_attachment_item_view_delete_button);
        this.f106466n = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.attachment.C41941c.View$OnClickListenerC419432 */

            public void onClick(View view) {
                if (C41941c.this.f106453a != null && C41941c.this.f106454b != null) {
                    C42330c.m169068b("attachment_delete", C41941c.this.f106454b.mo151239o());
                    C41941c.this.f106453a.mo150780a(C41941c.this.f106454b.mo150760a());
                }
            }
        });
        ImageView imageView2 = (ImageView) this.f106458f.findViewById(R.id.mail_compose_mail_attachment_item_view_error_icon);
        this.f106468p = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.compose.attachment.C41941c.View$OnClickListenerC419443 */

            public void onClick(View view) {
                if (C41941c.this.f106453a != null && C41941c.this.f106454b != null) {
                    if (!C41941c.this.f106455c || C41941c.this.f106454b.mo151236l() <= 0 || C41941c.this.f106454b.mo151236l() >= System.currentTimeMillis()) {
                        C42330c.m169068b("attachment_reload", C41941c.this.f106454b.mo151239o());
                        C41941c.this.f106453a.mo150785b(C41941c.this.f106454b.mo150760a());
                        return;
                    }
                    MailToast.m173700a(C43819s.m173686a(R.string.Mail_Attachment_CantViewDesc, "ExpireDate", C43760c.m173467a(C41941c.this.f106454b.mo151236l(), false)));
                }
            }
        });
    }

    /* renamed from: a */
    public void mo150792a(boolean z) {
        Log.m165389i("AttachmentItemView", "toggleDeleteIcon");
        if (z) {
            this.f106466n.setVisibility(0);
        } else {
            this.f106466n.setVisibility(8);
        }
    }

    /* renamed from: b */
    private String m166750b(int i) {
        long h = this.f106454b.mo151231h();
        if (i < 0) {
            return C26311p.m95262a(h);
        }
        return C26311p.m95262a((((long) i) * h) / 100) + " / " + C26311p.m95262a(h);
    }

    /* renamed from: a */
    private void m166749a(int i) {
        int i2;
        this.f106460h.setImageResource(C41816b.m166115a().mo150111A().mo150173a(C26311p.m95283c(this.f106454b.mo151229f()), this.f106454b.mo151229f()));
        ImageView imageView = this.f106469q;
        if (this.f106454b.mo151239o()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        this.f106462j.setText(this.f106454b.mo151229f());
        String d = C26311p.m95284d(this.f106454b.mo151229f());
        if (!C41816b.m166115a().mo150154u().mo150160a("larkmail.cli.harmfulattachment") || !C43766i.m173487b(d)) {
            this.f106465m.setVisibility(8);
            this.f106464l.setVisibility(0);
        } else {
            this.f106465m.setVisibility(0);
            this.f106464l.setVisibility(8);
        }
        this.f106464l.setText(C26311p.m95262a(this.f106454b.mo151231h()));
        mo150791a(i, 0, this.f106454b.mo151236l());
    }

    /* renamed from: a */
    public View mo150790a(LocalAttachment localAttachment, int i) {
        if (localAttachment == null || TextUtils.isEmpty(localAttachment.mo151229f()) || TextUtils.isEmpty(localAttachment.mo150760a())) {
            return this.f106458f;
        }
        this.f106454b = localAttachment;
        m166749a(i);
        return this.f106458f;
    }

    public C41941c(Context context, AbstractC41945a aVar, boolean z) {
        this.f106457e = context;
        this.f106453a = aVar;
        m166751c();
        this.f106455c = z;
    }

    /* renamed from: a */
    public void mo150791a(int i, int i2, long j) {
        boolean z = true;
        if (i == -1) {
            this.f106459g.setBackgroundResource(R.drawable.mail_bg_compose_attachment_item_view_error);
            this.f106464l.setTextColor(UIHelper.getColor(R.color.function_danger_500));
            this.f106464l.setText(R.string.Mail_Attachment_UploadFailed);
            LocalAttachment localAttachment = this.f106454b;
            if (localAttachment == null || !localAttachment.mo151239o()) {
                z = false;
            }
            C42330c.m169068b("attachment_error", z);
            this.f106467o.setVisibility(8);
            this.f106468p.setVisibility(0);
            this.f106463k.setVisibility(8);
            this.f106461i.setVisibility(8);
        } else if (i == 0) {
            this.f106459g.setBackgroundResource(R.drawable.mail_bg_compose_attachment_item_view);
            this.f106464l.setTextColor(UIHelper.getColor(R.color.text_placeholder));
            this.f106464l.setText(m166750b(i2));
            this.f106467o.setProgress(i2);
            this.f106467o.setVisibility(0);
            this.f106468p.setVisibility(8);
            this.f106463k.setVisibility(8);
            this.f106461i.setVisibility(8);
        } else if (i != 1) {
            Log.m165383e("AttachmentItemView", "updateState switch to default");
        } else {
            this.f106459g.setBackgroundResource(R.drawable.mail_bg_compose_attachment_item_view);
            this.f106464l.setTextColor(UIHelper.getColor(R.color.text_placeholder));
            this.f106464l.setText(m166750b(-1));
            this.f106467o.setVisibility(8);
            this.f106468p.setVisibility(8);
            if (j == 0 || !this.f106455c) {
                this.f106461i.setVisibility(8);
                this.f106463k.setVisibility(8);
                return;
            }
            this.f106461i.setVisibility(0);
            this.f106463k.setVisibility(0);
            if (j >= System.currentTimeMillis()) {
                z = false;
            }
            this.f106463k.setTextColor(this.f106457e.getResources().getColor(R.color.text_placeholder));
            if (z) {
                this.f106463k.setText(C43819s.m173686a(R.string.Mail_Attachment_ExpireDate, "ExpireDate", C43760c.m173467a(this.f106454b.mo151236l(), false)));
            } else {
                this.f106463k.setText(C43819s.m173686a(R.string.Mail_Attachment_ExpireDateFuture, "ExpireDate", C43760c.m173467a(this.f106454b.mo151236l(), false)));
            }
        }
    }
}
