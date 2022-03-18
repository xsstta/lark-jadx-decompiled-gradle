package com.ss.android.lark.mail.impl.share;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.share.b */
public class C43643b extends RecyclerView.Adapter<C43644a> {

    /* renamed from: a */
    private final String f110722a = "ShareDialogAdapter";

    /* renamed from: b */
    private final float f110723b = 8.0f;

    /* renamed from: c */
    private Context f110724c;

    /* renamed from: d */
    private int f110725d;

    /* renamed from: e */
    private int f110726e;

    /* renamed from: f */
    private List<C43689g> f110727f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<C43689g> list = this.f110727f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: com.ss.android.lark.mail.impl.share.b$a */
    public static class C43644a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        ImageView f110728a;

        C43644a(View view) {
            super(view);
            if (view instanceof LKUIRoundedImageView) {
                this.f110728a = (LKUIRoundedImageView) view;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155702a(List<C43689g> list) {
        Log.m165389i("ShareDialogAdapter", "update");
        this.f110727f = list;
        notifyDataSetChanged();
    }

    C43643b(Context context) {
        this.f110724c = context;
        this.f110725d = context.getResources().getDimensionPixelSize(R.dimen.mail_share_dialog_avatar_size);
        this.f110726e = UIUtils.dp2px(context, 8.0f);
    }

    /* renamed from: a */
    public C43644a onCreateViewHolder(ViewGroup viewGroup, int i) {
        LKUIRoundedImageView lKUIRoundedImageView = new LKUIRoundedImageView(this.f110724c);
        lKUIRoundedImageView.setBackgroundResource(R.drawable.icon_circle_bg);
        lKUIRoundedImageView.setOval(true);
        int i2 = this.f110725d;
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(i2, i2);
        layoutParams.leftMargin = this.f110726e;
        layoutParams.rightMargin = this.f110726e;
        lKUIRoundedImageView.setLayoutParams(layoutParams);
        return new C43644a(lKUIRoundedImageView);
    }

    /* renamed from: a */
    public void onBindViewHolder(C43644a aVar, int i) {
        String str;
        List<C43689g> list = this.f110727f;
        if (list == null || list.size() <= i) {
            Log.m165389i("ShareDialogAdapter", "onBindViewHolder invalid data");
            return;
        }
        C43689g gVar = this.f110727f.get(i);
        if (gVar == null) {
            Log.m165389i("ShareDialogAdapter", "onBindViewHolder empty data");
            return;
        }
        AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
        Context context = this.f110724c;
        String str2 = gVar.f110852c;
        if (gVar.f110857h != CollaboratorType.GROUP || TextUtils.isEmpty(gVar.f110856g)) {
            str = gVar.f110851b;
        } else {
            str = gVar.f110856g;
        }
        ImageView imageView = aVar.f110728a;
        int i2 = this.f110725d;
        v.mo150206a(context, str2, str, imageView, i2, i2);
    }
}
