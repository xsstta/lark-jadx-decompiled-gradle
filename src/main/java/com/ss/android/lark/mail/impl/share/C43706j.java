package com.ss.android.lark.mail.impl.share;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43785p;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.j */
public class C43706j extends RecyclerView.ViewHolder {

    /* renamed from: a */
    private final String f110915a = "ShareMemberViewHolder";

    /* renamed from: b */
    private Context f110916b;

    /* renamed from: c */
    private boolean f110917c = C43785p.m173548c();

    /* renamed from: d */
    private int f110918d;

    /* renamed from: e */
    private TextView f110919e;

    /* renamed from: f */
    private TextView f110920f;

    /* renamed from: g */
    private ImageView f110921g;

    /* renamed from: h */
    private LKUIRoundedImageView f110922h;

    /* renamed from: i */
    private View f110923i;

    /* renamed from: a */
    public View mo155798a() {
        return this.f110922h;
    }

    /* renamed from: com.ss.android.lark.mail.impl.share.j$1 */
    static /* synthetic */ class C437071 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110924a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.ss.android.lark.mail.impl.share.g$a[] r0 = com.ss.android.lark.mail.impl.share.C43689g.EnumC43690a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.share.C43706j.C437071.f110924a = r0
                com.ss.android.lark.mail.impl.share.g$a r1 = com.ss.android.lark.mail.impl.share.C43689g.EnumC43690a.Owner     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.share.C43706j.C437071.f110924a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.share.g$a r1 = com.ss.android.lark.mail.impl.share.C43689g.EnumC43690a.Disable     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.share.C43706j.C437071.f110924a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.share.g$a r1 = com.ss.android.lark.mail.impl.share.C43689g.EnumC43690a.Selected     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.share.C43706j.C437071.f110924a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.lark.mail.impl.share.g$a r1 = com.ss.android.lark.mail.impl.share.C43689g.EnumC43690a.Unselected     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.C43706j.C437071.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m173316b() {
        this.f110921g = (ImageView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_checkbox);
        this.f110918d = (int) this.f110916b.getResources().getDimension(R.dimen.mail_share_add_member_candidate_item_avatar_size);
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_avatar);
        this.f110922h = lKUIRoundedImageView;
        lKUIRoundedImageView.setOval(true);
        this.f110919e = (TextView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_name);
        this.f110920f = (TextView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_description);
        this.f110923i = this.itemView.findViewById(R.id.mail_share_candidate_item_borderline);
    }

    /* renamed from: a */
    public void mo155800a(boolean z) {
        int i;
        View view = this.f110923i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155799a(C43689g gVar) {
        String str;
        if (gVar == null || gVar.f110850a == null) {
            Log.m165383e("ShareMemberViewHolder", "update invalid data");
            return;
        }
        int i = C437071.f110924a[gVar.f110850a.ordinal()];
        if (i == 1 || i == 2) {
            this.f110921g.setImageResource(R.drawable.mail_share_add_member_candidate_item_disable);
            this.f110921g.setVisibility(0);
        } else if (i == 3) {
            this.f110921g.setImageResource(R.drawable.mail_share_add_member_candidate_item_selected);
            this.f110921g.setVisibility(0);
        } else if (i == 4) {
            this.f110921g.setImageResource(R.drawable.mail_share_add_member_candidate_item_unselected);
            this.f110921g.setVisibility(0);
        }
        AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
        Context context = this.f110921g.getContext();
        String str2 = gVar.f110852c;
        if (gVar.f110857h != CollaboratorType.GROUP || TextUtils.isEmpty(gVar.f110856g)) {
            str = gVar.f110851b;
        } else {
            str = gVar.f110856g;
        }
        LKUIRoundedImageView lKUIRoundedImageView = this.f110922h;
        int i2 = this.f110918d;
        v.mo150206a(context, str2, str, lKUIRoundedImageView, i2, i2);
        if (this.f110917c) {
            this.f110919e.setText(gVar.f110854e);
        } else {
            this.f110919e.setText(gVar.f110853d);
        }
        if (TextUtils.isEmpty(gVar.f110855f)) {
            this.f110920f.setVisibility(8);
            return;
        }
        this.f110920f.setVisibility(0);
        this.f110920f.setText(gVar.f110855f);
    }

    C43706j(Context context, View view) {
        super(view);
        this.f110916b = context;
        m173316b();
    }
}
