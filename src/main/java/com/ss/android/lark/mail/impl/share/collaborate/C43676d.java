package com.ss.android.lark.mail.impl.share.collaborate;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.utils.C43785p;

/* renamed from: com.ss.android.lark.mail.impl.share.collaborate.d */
class C43676d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public AbstractC43679a f110806a;

    /* renamed from: b */
    private final String f110807b = "CollaborateViewHolder";

    /* renamed from: c */
    private Context f110808c;

    /* renamed from: d */
    private boolean f110809d = C43785p.m173548c();

    /* renamed from: e */
    private PermissionCode f110810e;

    /* renamed from: f */
    private int f110811f;

    /* renamed from: g */
    private int f110812g;

    /* renamed from: h */
    private int f110813h;

    /* renamed from: i */
    private int f110814i;

    /* renamed from: j */
    private LinearLayout f110815j;

    /* renamed from: k */
    private TextView f110816k;

    /* renamed from: l */
    private TextView f110817l;

    /* renamed from: m */
    private TextView f110818m;

    /* renamed from: n */
    private ImageView f110819n;

    /* renamed from: o */
    private LKUIRoundedImageView f110820o;

    /* renamed from: p */
    private Collaborator f110821p;

    /* renamed from: q */
    private int f110822q;

    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.d$a */
    interface AbstractC43679a {
        /* renamed from: a */
        void mo155742a(Collaborator collaborator, int i);
    }

    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.d$2 */
    static /* synthetic */ class C436782 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110826a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.lark.pb.email.client.v1.PermissionCode[] r0 = com.bytedance.lark.pb.email.client.v1.PermissionCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.share.collaborate.C43676d.C436782.f110826a = r0
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.OWNER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.share.collaborate.C43676d.C436782.f110826a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.VIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.share.collaborate.C43676d.C436782.f110826a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.email.client.v1.PermissionCode r1 = com.bytedance.lark.pb.email.client.v1.PermissionCode.EDIT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.collaborate.C43676d.C436782.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m173261a() {
        this.f110811f = (int) this.f110808c.getResources().getDimension(R.dimen.mail_share_add_member_candidate_item_avatar_size);
        LKUIRoundedImageView lKUIRoundedImageView = (LKUIRoundedImageView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_avatar);
        this.f110820o = lKUIRoundedImageView;
        lKUIRoundedImageView.setOval(true);
        this.f110815j = (LinearLayout) this.itemView.findViewById(R.id.mail_collaborate_list_item_info_container);
        this.f110816k = (TextView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_name);
        this.f110817l = (TextView) this.itemView.findViewById(R.id.mail_share_add_member_candidate_item_description);
        this.f110818m = (TextView) this.itemView.findViewById(R.id.mail_collaborate_list_item_owner_tag);
        this.f110819n = (ImageView) this.itemView.findViewById(R.id.mail_collaborate_list_item_delete_button);
        this.f110812g = this.f110808c.getResources().getDimensionPixelSize(R.dimen.mail_collaborate_list_item_vertical_space);
        this.f110818m.measure(0, 0);
        this.f110813h = (this.f110812g * 2) + this.f110818m.getMeasuredWidth();
        this.f110814i = this.f110808c.getResources().getDimensionPixelSize(R.dimen.mail_collaborate_list_item_delete_button_width);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155758a(final Collaborator collaborator, final int i) {
        if (collaborator == null || i < 0) {
            Log.m165383e("CollaborateViewHolder", "update invalid data");
            return;
        }
        this.f110821p = collaborator;
        this.f110822q = i;
        AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
        Context context = this.f110808c;
        String str = collaborator.avatar;
        String str2 = collaborator.user_id;
        LKUIRoundedImageView lKUIRoundedImageView = this.f110820o;
        int i2 = this.f110811f;
        v.mo150206a(context, str, str2, lKUIRoundedImageView, i2, i2);
        if (this.f110809d) {
            this.f110816k.setText(collaborator.cn_name);
        } else {
            this.f110816k.setText(collaborator.en_name);
        }
        if (TextUtils.isEmpty(collaborator.department)) {
            this.f110817l.setVisibility(8);
        } else {
            this.f110817l.setVisibility(0);
            this.f110817l.setText(collaborator.department);
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f110815j.getLayoutParams();
        if (collaborator.code == null || collaborator.code == PermissionCode.NONE) {
            this.f110818m.setVisibility(8);
            this.f110819n.setVisibility(8);
            if (layoutParams != null) {
                layoutParams.rightMargin = this.f110812g;
            }
            Log.m165383e("CollaborateViewHolder", "update invalid code");
        } else if (C436782.f110826a[collaborator.code.ordinal()] != 1) {
            this.f110818m.setVisibility(8);
            if (this.f110810e == PermissionCode.OWNER) {
                this.f110819n.setVisibility(0);
                if (layoutParams != null) {
                    layoutParams.rightMargin = this.f110814i;
                }
            } else {
                this.f110819n.setVisibility(8);
                if (layoutParams != null) {
                    layoutParams.rightMargin = this.f110812g;
                }
            }
            this.f110819n.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.share.collaborate.C43676d.View$OnClickListenerC436771 */

                public void onClick(View view) {
                    if (C43676d.this.f110806a != null) {
                        C43676d.this.f110806a.mo155742a(collaborator, i);
                    }
                }
            });
        } else {
            this.f110818m.setVisibility(0);
            this.f110819n.setVisibility(8);
            if (layoutParams != null) {
                layoutParams.rightMargin = this.f110813h;
            }
        }
        this.f110815j.setLayoutParams(layoutParams);
    }

    C43676d(Context context, View view, AbstractC43679a aVar, PermissionCode permissionCode) {
        super(view);
        this.f110808c = context;
        this.f110806a = aVar;
        this.f110810e = permissionCode;
        m173261a();
    }
}
