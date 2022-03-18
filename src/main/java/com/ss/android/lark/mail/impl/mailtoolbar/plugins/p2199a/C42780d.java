package com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.android.file.picker.lib.media.FileEntry;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.a.d */
class C42780d extends RecyclerView.Adapter<C42778c> {

    /* renamed from: a */
    public final AbstractC42782a f108945a;

    /* renamed from: b */
    private final String f108946b = "ReceivedFileListAdapter";

    /* renamed from: c */
    private final Context f108947c;

    /* renamed from: d */
    private final int f108948d;

    /* renamed from: e */
    private final int f108949e;

    /* renamed from: f */
    private List<FileEntry> f108950f;

    /* renamed from: com.ss.android.lark.mail.impl.mailtoolbar.plugins.a.d$a */
    interface AbstractC42782a {
        /* renamed from: a */
        void mo153584a(int i, Uri uri);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (CollectionUtils.isEmpty(this.f108950f)) {
            return 0;
        }
        return this.f108950f.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo153596a(List<FileEntry> list) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("update size: ");
        if (CollectionUtils.isEmpty(list)) {
            i = 0;
        } else {
            i = list.size();
        }
        sb.append(i);
        Log.m165389i("ReceivedFileListAdapter", sb.toString());
        this.f108950f = list;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C42778c onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.f108947c).inflate(R.layout.mail_attachment_picker_recived_file_item_layout, (ViewGroup) null);
        inflate.setLayoutParams(new RecyclerView.LayoutParams(this.f108949e, this.f108948d));
        return new C42778c(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(C42778c cVar, final int i) {
        List<FileEntry> list = this.f108950f;
        if (list != null && list.size() > i) {
            final FileEntry fileEntry = this.f108950f.get(i);
            if (fileEntry == null) {
                Log.m165383e("ReceivedFileListAdapter", "onBindViewHolder empty file");
                return;
            }
            cVar.mo153592a(fileEntry);
            cVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.mailtoolbar.plugins.p2199a.C42780d.View$OnClickListenerC427811 */

                public void onClick(View view) {
                    if (C42780d.this.f108945a != null) {
                        C42780d.this.f108945a.mo153584a(i, fileEntry.getUri());
                    }
                }
            });
        }
    }

    public C42780d(Context context, AbstractC42782a aVar, int i) {
        this.f108947c = context;
        this.f108945a = aVar;
        this.f108948d = i;
        this.f108949e = UIHelper.getDimens(R.dimen.mail_compose_attachment_picker_received_file_item_width);
    }
}
