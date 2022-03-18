package com.ss.android.lark.mail.impl.message.recall.sender.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import com.bytedance.lark.pb.email.client.v1.MailGetRecallDetailResponse;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.message.recall.sender.detail.C42997a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.widget.C43992a;
import com.ss.android.lark.mail.impl.widget.HeaderFooterRecyclerView;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.List;

public class RecallDetailView implements C42997a.AbstractC42999b {

    /* renamed from: a */
    TextView f109470a;

    /* renamed from: b */
    LKUIStatus f109471b;

    /* renamed from: c */
    C43002c f109472c;

    /* renamed from: d */
    public C42997a.AbstractC42999b.AbstractC43000a f109473d;

    /* renamed from: e */
    private Context f109474e;

    /* renamed from: f */
    private AbstractC42996a f109475f;
    @BindView(9485)
    ViewGroup mLoadingView;
    @BindView(9484)
    HeaderFooterRecyclerView mRecyclerView;
    @BindView(10320)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView$a */
    public interface AbstractC42996a {
        /* renamed from: a */
        void mo154153a(RecallDetailView recallDetailView);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: a */
    public LifecycleOwner mo154154a() {
        return (ComponentActivity) this.f109474e;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f109475f.mo154153a(this);
        this.f109472c = new C43002c();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f109474e));
        TextView textView = (TextView) LayoutInflater.from(this.f109474e).inflate(R.layout.mail_recall_detail_header, (ViewGroup) this.mRecyclerView, false);
        this.f109470a = textView;
        this.mRecyclerView.mo156539a(textView);
        this.mRecyclerView.setAdapter(this.f109472c);
        this.mRecyclerView.setHideHeaderFooterDivider(true);
        this.mRecyclerView.addItemDecoration(new C43992a.C43994a(this.f109474e).mo156557c(R.color.lkui_N300).mo156554a(R.dimen.mail_divider_height).mo156556b(R.dimen.mail_home_list_padding).mo156555a());
        this.mLoadingView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView.View$OnClickListenerC429921 */

            public void onClick(View view) {
                if (RecallDetailView.this.f109471b.mo89852i()) {
                    RecallDetailView.this.f109473d.mo154165c();
                }
            }
        });
        this.f109471b = new LKUIStatus.C25680a(this.mLoadingView).mo89855a(0.44d).mo89861b(C43819s.m173684a((int) R.string.Mail_Common_NetworkError)).mo89860b(R.drawable.illustration_placeholder_common_load_failed).mo89859a();
        this.f109473d.mo154163a().mo5923a(mo154154a(), new AbstractC1178x<Integer>() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView.C429932 */

            /* renamed from: a */
            public void onChanged(Integer num) {
                if (num.intValue() == 2) {
                    RecallDetailView.this.mRecyclerView.setVisibility(0);
                    RecallDetailView.this.mLoadingView.setVisibility(8);
                    return;
                }
                RecallDetailView.this.mRecyclerView.setVisibility(8);
                RecallDetailView.this.mLoadingView.setVisibility(0);
                if (num.intValue() == 1) {
                    RecallDetailView.this.f109471b.mo89837a();
                    return;
                }
                RecallDetailView.this.f109471b.mo89843b();
                C42209j.m168612a("recall_detail_error_page", "error_page");
            }
        });
        this.f109473d.mo154164b().mo5923a(mo154154a(), new AbstractC1178x<List<C43001b>>() {
            /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView.C429943 */

            /* renamed from: a */
            public void onChanged(final List<C43001b> list) {
                if (list != null) {
                    RecallDetailView.this.f109472c.mo154168a(list);
                    C43849u.m173826a(new Runnable() {
                        /* class com.ss.android.lark.mail.impl.message.recall.sender.detail.RecallDetailView.C429943.RunnableC429951 */

                        public void run() {
                            int i;
                            List list = list;
                            int i2 = 0;
                            if (list != null) {
                                i = list.size();
                            } else {
                                i = 0;
                            }
                            int i3 = 0;
                            int i4 = 0;
                            for (C43001b bVar : list) {
                                int value = bVar.f109482a.status.getValue();
                                if (value == MailGetRecallDetailResponse.MailRecallDetailStatus.RECALL_PROCESSING.getValue()) {
                                    i4++;
                                } else if (value == MailGetRecallDetailResponse.MailRecallDetailStatus.RECALL_SUCCESS.getValue()) {
                                    i2++;
                                } else if (value == MailGetRecallDetailResponse.MailRecallDetailStatus.RECALL_FAIL.getValue()) {
                                    i3++;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            String a = C43819s.m173684a((int) R.string.Mail_Recall_DetailTotal);
                            sb.append(a.replace("{{num}}", "" + i));
                            if (i2 > 0) {
                                String a2 = C43819s.m173684a((int) R.string.Mail_Recall_DetailSuccess);
                                sb.append(a2.replace("{{num}}", "" + i2));
                            }
                            if (i3 > 0) {
                                String a3 = C43819s.m173684a((int) R.string.Mail_Recall_DetailFail);
                                sb.append(a3.replace("{{num}}", "" + i3));
                            }
                            if (i4 > 0) {
                                String a4 = C43819s.m173684a((int) R.string.Mail_Recall_DetailRecalling);
                                sb.append(a4.replace("{{num}}", "" + i4));
                            }
                            sb.append(C43819s.m173684a((int) R.string.Mail_Recall_DetailListBelow));
                            RecallDetailView.this.f109470a.setText(sb.toString());
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C42997a.AbstractC42999b.AbstractC43000a aVar) {
        this.f109473d = aVar;
    }

    public RecallDetailView(Context context, AbstractC42996a aVar) {
        this.f109474e = context;
        this.f109475f = aVar;
    }
}
