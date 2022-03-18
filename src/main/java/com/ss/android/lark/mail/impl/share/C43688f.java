package com.ss.android.lark.mail.impl.share;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;

/* renamed from: com.ss.android.lark.mail.impl.share.f */
class C43688f extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final String f110846a = "ShareMemberSelectedViewHolder";

    /* renamed from: b */
    private Context f110847b;

    /* renamed from: c */
    private int f110848c;

    /* renamed from: d */
    private LKUIRoundedImageView f110849d;

    /* renamed from: a */
    private void m173273a() {
        this.f110848c = (int) this.f110847b.getResources().getDimension(R.dimen.mail_share_member_selected_avatar_size);
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.itemView.findViewById(R.id.mail_share_member_selected_item_avatar);
        this.f110849d = lKUIRoundedImageView;
        lKUIRoundedImageView.setOval(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155766a(C43689g gVar) {
        String str;
        if (gVar == null || gVar.f110850a == null) {
            Log.m165383e("ShareMemberSelectedViewHolder", "update invalid data");
        } else if (TextUtils.isEmpty(gVar.f110852c)) {
            this.f110849d.setImageBitmap(null);
            this.f110849d.setTag(null);
        } else {
            AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
            Context context = this.f110847b;
            String str2 = gVar.f110852c;
            if (gVar.f110857h != CollaboratorType.GROUP || TextUtils.isEmpty(gVar.f110856g)) {
                str = gVar.f110851b;
            } else {
                str = gVar.f110856g;
            }
            LKUIRoundedImageView lKUIRoundedImageView = this.f110849d;
            int i = this.f110848c;
            v.mo150206a(context, str2, str, lKUIRoundedImageView, i, i);
        }
    }

    C43688f(Context context, View view) {
        super(view);
        this.f110847b = context;
        m173273a();
    }
}
