package com.ss.android.lark.mail.impl.message.send.state;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.SendStatusDetail;
import com.ss.android.lark.mail.impl.message.send.state.C43019a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.widget.C43992a;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import java.util.List;

public class SendStatusDetailView implements C43019a.AbstractC43021b {

    /* renamed from: a */
    UDNotice f109505a;

    /* renamed from: b */
    LKUIStatus f109506b;

    /* renamed from: c */
    C43023b f109507c;

    /* renamed from: d */
    public C43019a.AbstractC43021b.AbstractC43022a f109508d;

    /* renamed from: e */
    private Context f109509e;

    /* renamed from: f */
    private AbstractC43018a f109510f;
    @BindView(9485)
    ViewGroup mLoadingView;
    @BindView(9484)
    HeaderFooterRecyclerView mRecyclerView;

    /* renamed from: com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView$a */
    public interface AbstractC43018a {
        /* renamed from: a */
        void mo154183a(SendStatusDetailView sendStatusDetailView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public LifecycleOwner mo154185a() {
        return (ComponentActivity) this.f109509e;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f109510f.mo154183a(this);
        this.f109507c = new C43023b();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f109509e));
        UDNotice uDNotice = (UDNotice) LayoutInflater.from(this.f109509e).inflate(R.layout.mail_send_status_detail_header, (ViewGroup) this.mRecyclerView, false);
        this.f109505a = uDNotice;
        uDNotice.setTextButtonListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView.C430131 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                SendStatusDetailView.this.f109508d.mo154196c();
            }
        });
        this.mRecyclerView.mo156539a(this.f109505a);
        this.mRecyclerView.setAdapter(this.f109507c);
        this.mRecyclerView.setHideHeaderFooterDivider(true);
        this.mRecyclerView.addItemDecoration(new C43992a.C43994a(this.f109509e).mo156557c(R.color.lkui_N300).mo156554a(R.dimen.mail_divider_height).mo156556b(R.dimen.mail_home_list_padding).mo156555a());
        this.mLoadingView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView.View$OnClickListenerC430142 */

            public void onClick(View view) {
                if (SendStatusDetailView.this.f109506b.mo89852i()) {
                    SendStatusDetailView.this.f109508d.mo154196c();
                }
            }
        });
        this.f109506b = new LKUIStatus.C25680a(this.mLoadingView).mo89855a(0.44d).mo89861b(C43819s.m173684a((int) R.string.Mail_Common_NetworkError)).mo89860b(R.drawable.illustration_placeholder_common_load_failed).mo89859a();
        this.f109508d.mo154194a().mo5923a(mo154185a(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView.C430153 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num.intValue() == 2) {
                    SendStatusDetailView.this.mRecyclerView.setVisibility(0);
                    SendStatusDetailView.this.mLoadingView.setVisibility(8);
                    return;
                }
                SendStatusDetailView.this.mRecyclerView.setVisibility(8);
                SendStatusDetailView.this.mLoadingView.setVisibility(0);
                if (num.intValue() == 1) {
                    SendStatusDetailView.this.f109506b.mo89837a();
                    return;
                }
                SendStatusDetailView.this.f109506b.mo89843b();
                C42209j.m168612a("recall_detail_error_page", "error_page");
            }
        });
        this.f109508d.mo154195b().mo5923a(mo154185a(), new AbstractC1178x<List<SendStatusDetail>>() {
            /* class com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView.C430164 */

            /* renamed from: a */
            public void onChanged(List<SendStatusDetail> list) {
                if (!(list == null || list.size() == 0)) {
                    SendStatusDetailView.this.f109507c.mo154199a(list);
                    int i = 0;
                    for (SendStatusDetail sendStatusDetail : list) {
                        if (sendStatusDetail != null && sendStatusDetail.mo151774c() == SendStatusDetail.SendStatus.DELIVERED) {
                            i++;
                        }
                    }
                    final String str = i + "/" + list.size();
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.send.state.SendStatusDetailView.C430164.RunnableC430171 */

                        public void run() {
                            String a = C43819s.m173686a(R.string.Mail_Send_SentDone, "progress", str);
                            SendStatusDetailView.this.f109505a.setText(SendStatusDetailView.this.mo154184a(new SpannableStringBuilder(a), a, str));
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C43019a.AbstractC43021b.AbstractC43022a aVar) {
        this.f109508d = aVar;
    }

    public SendStatusDetailView(Context context, AbstractC43018a aVar) {
        this.f109509e = context;
        this.f109510f = aVar;
    }

    /* renamed from: a */
    public SpannableStringBuilder mo154184a(SpannableStringBuilder spannableStringBuilder, String str, String str2) {
        int indexOf = str.indexOf(str2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f109509e.getResources().getColor(R.color.text_placeholder)), indexOf, str2.length() + indexOf, 33);
        return spannableStringBuilder;
    }
}
