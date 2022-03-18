package com.ss.android.vc.meeting.module.livestream.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.suite.R;
import com.ss.android.floatbubble.C28460b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.livestream.MsgWithUrlInfo;
import com.ss.android.vc.statistics.event.C63750bm;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiveActionView extends RelativeLayout {

    /* renamed from: a */
    public AbstractC62089b f155969a;

    /* renamed from: b */
    private View f155970b;

    /* renamed from: c */
    private View f155971c;

    /* renamed from: d */
    private int f155972d;

    /* renamed from: e */
    private AbstractC62090c f155973e = new AbstractC62090c() {
        /* class com.ss.android.vc.meeting.module.livestream.view.LiveActionView.C620851 */

        @Override // com.ss.android.vc.meeting.module.livestream.view.LiveActionView.AbstractC62090c
        /* renamed from: a */
        public void mo214837a(String str) {
            if (C28460b.m104296a(LiveActionView.this.getContext())) {
                try {
                    LiveActionView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (LiveActionView.this.getContext() instanceof Activity) {
                if (TextUtils.isEmpty(str)) {
                    C60700b.m235851b("LiveActionView", "[jumpByUrl]", "url is empty");
                }
                VCDialogUtils.m236160a(LiveActionView.this.getContext(), (int) R.string.View_N_FloatingWindowPermission, 1, UIHelper.mustacheFormat((int) R.string.View_G_PopupPermission, "appName", VideoChatModuleDependency.getLarkAppDependency().mo196409b()), (int) R.string.View_G_CancelButton, (int) R.string.View_G_ConfirmButton, false, UDUiModeUtils.m93320a(ar.m236698c().getResources().getConfiguration()));
            }
        }

        @Override // com.ss.android.vc.meeting.module.livestream.view.LiveActionView.AbstractC62090c
        /* renamed from: a */
        public void mo214838a(String str, String str2, String str3) {
            C63750bm.m250193a(str, str2, str3);
        }
    };

    /* renamed from: com.ss.android.vc.meeting.module.livestream.view.LiveActionView$b */
    public interface AbstractC62089b {
        void onAction(boolean z);
    }

    /* renamed from: com.ss.android.vc.meeting.module.livestream.view.LiveActionView$c */
    public interface AbstractC62090c {
        /* renamed from: a */
        void mo214837a(String str);

        /* renamed from: a */
        void mo214838a(String str, String str2, String str3);
    }

    public void setOnActionListener(AbstractC62089b bVar) {
        this.f155969a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.vc.meeting.module.livestream.view.LiveActionView$a */
    public class C62088a extends ClickableSpan {

        /* renamed from: b */
        private String f155978b;

        /* renamed from: c */
        private AbstractC62090c f155979c;

        /* renamed from: d */
        private String f155980d;

        /* renamed from: e */
        private String f155981e;

        /* renamed from: f */
        private String f155982f;

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(C60773o.m236126d(R.color.primary_pri_500));
            textPaint.setUnderlineText(false);
        }

        public void onClick(View view) {
            AbstractC62090c cVar = this.f155979c;
            if (cVar != null) {
                cVar.mo214837a(this.f155978b);
                this.f155979c.mo214838a(this.f155980d, this.f155981e, this.f155982f);
            }
        }

        private C62088a(String str, String str2, String str3, String str4, AbstractC62090c cVar) {
            this.f155978b = str;
            this.f155980d = str2;
            this.f155981e = str3;
            this.f155982f = str4;
            this.f155979c = cVar;
        }
    }

    public LiveActionView(Context context) {
        super(context);
        m242578a(context, null);
    }

    public void setMsgWithUrlInfo(MsgWithUrlInfo bVar) {
        if (bVar.mo209956b().size() == 1) {
            setMsgWithUrlInfo1(bVar);
        } else if (bVar.mo209956b().size() == 2) {
            setMsgWithUrlInfo2(bVar);
        }
    }

    public void setState(boolean z) {
        int i;
        View view = this.f155970b;
        int i2 = 8;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        View view2 = this.f155971c;
        if (z) {
            i2 = 0;
        }
        view2.setVisibility(i2);
    }

    private void setMsgWithUrlInfo1(MsgWithUrlInfo bVar) {
        String str = bVar.mo209956b().get(0);
        String a = bVar.mo209955a();
        Matcher matcher = Pattern.compile("@@.*?@@").matcher(a);
        String str2 = a;
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            String substring = a.substring(matcher.start() + 2, matcher.end() - 2);
            str2 = a.replace(group, substring);
            i = matcher.start();
            i2 = i + substring.length();
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new C62088a(str, bVar.mo209957c(), bVar.mo209958d(), "", this.f155973e), i, i2, 33);
        TextView textView = (TextView) findViewById(R.id.tv_protocal);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(C60773o.m236126d(R.color.text_caption));
        textView.setHighlightColor(0);
    }

    private void setMsgWithUrlInfo2(MsgWithUrlInfo bVar) {
        SpannableString spannableString;
        int i;
        int i2;
        SpannableString spannableString2;
        String a = bVar.mo209955a();
        String str = bVar.mo209956b().get(0);
        String str2 = bVar.mo209956b().get(1);
        SpannableString spannableString3 = new SpannableString(a);
        SpannableString spannableString4 = new SpannableString(a);
        Pattern compile = Pattern.compile("@@.*?@@");
        Matcher matcher = compile.matcher(a);
        if (matcher.find()) {
            String group = matcher.group();
            String substring = a.substring(matcher.start() + 2, matcher.end() - 2);
            String replace = a.replace(group, substring);
            int start = matcher.start();
            SpannableString spannableString5 = new SpannableString(replace);
            spannableString = spannableString4;
            i2 = start + substring.length();
            i = start;
            spannableString5.setSpan(new C62088a(str, bVar.mo209957c(), bVar.mo209958d(), "", this.f155973e), i, i2, 33);
            spannableString3 = spannableString5;
            a = replace;
        } else {
            spannableString = spannableString4;
            i2 = 0;
            i = 0;
        }
        Matcher matcher2 = compile.matcher(spannableString3);
        if (matcher2.find()) {
            String group2 = matcher2.group();
            String substring2 = a.substring(matcher2.start() + 2, matcher2.end() - 2);
            String replace2 = a.replace(group2, substring2);
            int start2 = matcher2.start();
            SpannableString spannableString6 = new SpannableString(replace2);
            spannableString6.setSpan(new C62088a(str, bVar.mo209957c(), bVar.mo209958d(), "", this.f155973e), i, i2, 33);
            spannableString6.setSpan(new C62088a(str2, bVar.mo209957c(), bVar.mo209959e(), "", this.f155973e), start2, start2 + substring2.length(), 33);
            spannableString2 = spannableString6;
        } else {
            spannableString2 = spannableString;
        }
        TextView textView = (TextView) findViewById(R.id.tv_protocal);
        textView.setText(spannableString2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor(C60773o.m236126d(R.color.text_caption));
        textView.setHighlightColor(0);
    }

    public LiveActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m242578a(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = getResources().getConfiguration().orientation;
        if (this.f155972d != i3) {
            this.f155972d = i3;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private void m242578a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.dialog_live_setting_item_action, this);
        this.f155970b = findViewById(R.id.btn_start);
        this.f155971c = findViewById(R.id.btn_finish);
        this.f155970b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.LiveActionView.C620862 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (LiveActionView.this.f155969a != null) {
                    LiveActionView.this.f155969a.onAction(true);
                }
            }
        });
        this.f155971c.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.livestream.view.LiveActionView.C620873 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (LiveActionView.this.f155969a != null) {
                    LiveActionView.this.f155969a.onAction(false);
                }
            }
        });
    }

    public LiveActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m242578a(context, attributeSet);
    }
}
