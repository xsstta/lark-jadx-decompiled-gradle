package com.ss.android.lark.mail.impl.view.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.view.dialog.c */
public class C43943c extends RecyclerView.Adapter<C43947c> {

    /* renamed from: a */
    public AbstractC43946b f111504a;

    /* renamed from: b */
    private Context f111505b;

    /* renamed from: c */
    private List<C43945a> f111506c;

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.c$b */
    public interface AbstractC43946b {
        void onItemClick();
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.c$a */
    public static class C43945a {

        /* renamed from: a */
        public String f111509a;

        /* renamed from: b */
        public boolean f111510b;

        /* renamed from: c */
        private Runnable f111511c;

        /* renamed from: a */
        public Runnable mo156392a() {
            return this.f111511c;
        }

        public C43945a(String str, Runnable runnable, boolean z) {
            this.f111509a = str;
            this.f111511c = runnable;
            this.f111510b = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f111506c.size();
    }

    /* renamed from: a */
    public void mo156388a(AbstractC43946b bVar) {
        this.f111504a = bVar;
    }

    public C43943c(Context context) {
        this.f111505b = context;
    }

    /* renamed from: a */
    public void mo156390a(List<C43945a> list) {
        this.f111506c = list;
    }

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.c$c */
    public static class C43947c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        View f111512a;

        /* renamed from: b */
        TextView f111513b;

        /* renamed from: c */
        ImageView f111514c;

        /* renamed from: d */
        ImageView f111515d;

        public C43947c(View view) {
            super(view);
            this.f111512a = view;
            this.f111513b = (TextView) view.findViewById(R.id.ud_dialog_list_item_text);
            this.f111514c = (ImageView) view.findViewById(R.id.ud_dialog_list_item_mark);
            this.f111515d = (ImageView) view.findViewById(R.id.ud_dialog_list_item_bottom_divider);
        }
    }

    /* renamed from: a */
    public C43947c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C43947c(LayoutInflater.from(this.f111505b).inflate(R.layout.mail_ud_bottom_dialog_list_item_view, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C43947c cVar, int i) {
        int i2;
        final C43945a aVar = this.f111506c.get(i);
        cVar.f111512a.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.view.dialog.C43943c.View$OnClickListenerC439441 */

            public void onClick(View view) {
                if (aVar.mo156392a() != null) {
                    aVar.mo156392a().run();
                }
                if (C43943c.this.f111504a != null) {
                    C43943c.this.f111504a.onItemClick();
                }
            }
        });
        cVar.f111513b.setText(aVar.f111509a);
        ImageView imageView = cVar.f111515d;
        int i3 = 4;
        if (i == this.f111506c.size() - 1) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        ImageView imageView2 = cVar.f111514c;
        if (aVar.f111510b) {
            i3 = 0;
        }
        imageView2.setVisibility(i3);
    }
}
