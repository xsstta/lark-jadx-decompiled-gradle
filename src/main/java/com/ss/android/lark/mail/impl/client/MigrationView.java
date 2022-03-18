package com.ss.android.lark.mail.impl.client;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.bytedance.lark.pb.email.client.v1.MigrationFailureDetail;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.client.AbstractC41891b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.ui.CommonTitleBar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MigrationView implements AbstractC41891b.AbstractC41893b {

    /* renamed from: a */
    public C41875a f106211a;

    /* renamed from: b */
    private Context f106212b;

    /* renamed from: c */
    private AbstractC41877b f106213c;

    /* renamed from: d */
    private AbstractC41891b.AbstractC41893b.AbstractC41894a f106214d;
    @BindView(9379)
    RecyclerView mRecyclerView;
    @BindView(10320)
    CommonTitleBar mTitleBar;

    /* renamed from: com.ss.android.lark.mail.impl.client.MigrationView$b */
    public interface AbstractC41877b {
        /* renamed from: a */
        void mo150451a(MigrationView migrationView);
    }

    /* renamed from: com.ss.android.lark.mail.impl.client.MigrationView$a */
    public static class C41875a extends RecyclerView.Adapter<C41876a> {

        /* renamed from: a */
        private List<MigrationFailureDetail> f106216a = new ArrayList();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f106216a.size();
        }

        /* renamed from: a */
        public void mo150457a(List<MigrationFailureDetail> list) {
            this.f106216a.clear();
            this.f106216a.addAll(list);
            notifyDataSetChanged();
        }

        /* renamed from: com.ss.android.lark.mail.impl.client.MigrationView$a$a */
        public class C41876a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            TextView f106217a;

            C41876a(View view) {
                super(view);
                this.f106217a = (TextView) view.findViewById(R.id.mail_migration_detail_tv);
            }
        }

        /* renamed from: a */
        public C41876a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C41876a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mail_migration_detail_item, viewGroup, false));
        }

        /* renamed from: a */
        public void onBindViewHolder(C41876a aVar, int i) {
            MigrationFailureDetail migrationFailureDetail = this.f106216a.get(i);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(migrationFailureDetail.timestamp.longValue());
            String format = new SimpleDateFormat("yyyy/MM/dd").format(instance.getTime());
            TextView textView = aVar.f106217a;
            textView.setText(C43819s.m173684a((int) R.string.Mail_Migration_FailureDetailHeader) + C43819s.m173684a((int) R.string.Mail_Migration_FailureDetailPrefix).replace("{{subject}}", migrationFailureDetail.subject) + C43819s.m173684a((int) R.string.Mail_Migration_FailureDetailSuffix).replace("{{date}}", format));
        }
    }

    /* renamed from: a */
    public LifecycleOwner mo150452a() {
        return (ComponentActivity) this.f106212b;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.f106214d = null;
        this.f106213c = null;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f106213c.mo150451a(this);
        this.f106211a = new C41875a();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(this.f106212b));
        this.mRecyclerView.setAdapter(this.f106211a);
        this.f106214d.mo150477a().mo5923a(mo150452a(), new AbstractC1178x<List<MigrationFailureDetail>>() {
            /* class com.ss.android.lark.mail.impl.client.MigrationView.C418741 */

            /* renamed from: a */
            public void onChanged(List<MigrationFailureDetail> list) {
                if (list != null) {
                    MigrationView.this.f106211a.mo150457a(list);
                }
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC41891b.AbstractC41893b.AbstractC41894a aVar) {
        this.f106214d = aVar;
    }

    public MigrationView(Context context, AbstractC41877b bVar) {
        this.f106212b = context;
        this.f106213c = bVar;
    }
}
