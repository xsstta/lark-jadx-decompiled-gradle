package com.ss.android.lark.mail.impl.home.threadlist.listitem;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.home.threadlist.listitem.MailItemView;
import com.ss.android.lark.mail.impl.home.threadlist.p2188c.AbstractC42637b;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.AbstractC44045a;

/* renamed from: com.ss.android.lark.mail.impl.home.threadlist.listitem.a */
public class C42697a extends AbstractC44045a {

    /* renamed from: a */
    public static float f108637a = 1.0f;

    /* renamed from: A */
    private final AbstractC42698a f108638A;

    /* renamed from: b */
    public TextView f108639b;

    /* renamed from: c */
    public TextView f108640c;

    /* renamed from: d */
    public TextView f108641d;

    /* renamed from: e */
    public TextView f108642e;

    /* renamed from: f */
    public RelativeLayout f108643f;

    /* renamed from: g */
    public MailItemView f108644g;

    /* renamed from: h */
    public TextView f108645h;

    /* renamed from: i */
    public TextView f108646i;

    /* renamed from: j */
    public TextView f108647j;

    /* renamed from: k */
    public ImageView f108648k;

    /* renamed from: l */
    public ImageView f108649l;

    /* renamed from: m */
    public ImageView f108650m;

    /* renamed from: n */
    public UDBadgeView f108651n;

    /* renamed from: o */
    public UDCheckBox f108652o;

    /* renamed from: p */
    public ImageView f108653p;

    /* renamed from: q */
    public View f108654q;

    /* renamed from: r */
    public View f108655r;

    /* renamed from: s */
    boolean f108656s;

    /* renamed from: t */
    boolean f108657t;

    /* renamed from: u */
    boolean f108658u;

    /* renamed from: v */
    private boolean f108659v;

    /* renamed from: w */
    private AbstractC42637b f108660w;

    /* renamed from: x */
    private MailThread f108661x;

    /* renamed from: y */
    private boolean f108662y;

    /* renamed from: z */
    private MailItemView.AbstractC42696a f108663z;

    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.listitem.a$a */
    public interface AbstractC42698a {
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44041h
    /* renamed from: a */
    public View mo153358a() {
        return this.f108643f;
    }

    /* renamed from: d */
    public boolean mo153367d() {
        return this.f108658u;
    }

    /* renamed from: e */
    public boolean mo153368e() {
        return this.f108659v;
    }

    /* renamed from: p */
    private void m170196p() {
        this.f108644g.mo153354b();
    }

    /* renamed from: b */
    public boolean mo153364b() {
        return this.f108656s;
    }

    /* renamed from: c */
    public boolean mo153366c() {
        return this.f108657t;
    }

    /* renamed from: f */
    public void mo153369f() {
        mo156722d(65536.0f);
        mo156721c(-65536.0f);
    }

    /* renamed from: b */
    public void mo153363b(boolean z) {
        this.f108657t = z;
    }

    /* renamed from: c */
    public void mo153365c(boolean z) {
        this.f108659v = z;
    }

    /* renamed from: e */
    private boolean m170195e(float f) {
        if (Math.abs(f) > 0.4f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo153361a(MailItemView.AbstractC42696a aVar) {
        this.f108663z = aVar;
    }

    /* renamed from: a */
    public void mo153362a(boolean z) {
        this.f108656s = z;
    }

    /* renamed from: a */
    public void mo153360a(AbstractC42637b bVar, MailThread mailThread) {
        this.f108660w = bVar;
        this.f108661x = mailThread;
    }

    public C42697a(MailItemView mailItemView, AbstractC42698a aVar) {
        super(mailItemView);
        this.f108644g = mailItemView;
        this.f108643f = (RelativeLayout) mailItemView.findViewById(R.id.mail_home_item_layout);
        this.f108645h = (TextView) mailItemView.findViewById(R.id.mail_home_item_message_count);
        this.f108639b = (TextView) mailItemView.findViewById(R.id.mail_home_item_user_name);
        this.f108640c = (TextView) mailItemView.findViewById(R.id.mail_home_item_subject);
        this.f108647j = (TextView) mailItemView.findViewById(R.id.mail_home_item_folder);
        this.f108641d = (TextView) mailItemView.findViewById(R.id.mail_home_item_content);
        this.f108642e = (TextView) mailItemView.findViewById(R.id.mail_home_item_time);
        this.f108646i = (TextView) mailItemView.findViewById(R.id.mail_home_item_draft_tag);
        this.f108648k = (ImageView) mailItemView.findViewById(R.id.mail_home_item_attac_label);
        this.f108649l = (ImageView) mailItemView.findViewById(R.id.mail_home_item_schedule_label);
        this.f108650m = (ImageView) mailItemView.findViewById(R.id.mail_home_item_time_schedule_label);
        this.f108651n = (UDBadgeView) mailItemView.findViewById(R.id.mail_home_item_read_rea_dot);
        this.f108652o = (UDCheckBox) mailItemView.findViewById(R.id.thread_checkbox);
        this.f108653p = (ImageView) mailItemView.findViewById(R.id.mail_home_item_flagged);
        this.f108654q = mailItemView.findViewById(R.id.mail_flag_click);
        this.f108655r = mailItemView.findViewById(R.id.mail_home_item_bottom_divider);
        this.f108638A = aVar;
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.AbstractC44041h, com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.AbstractC44045a
    /* renamed from: a */
    public void mo153359a(float f, float f2, boolean z) {
        super.mo153359a(f, f2, z);
        if (!mo153364b() && !mo153366c()) {
            if (!mo153368e()) {
                return;
            }
            if ((!mo153367d() || f <= BitmapDescriptorFactory.HUE_RED) && (mo153367d() || f >= BitmapDescriptorFactory.HUE_RED)) {
                return;
            }
        }
        if (!this.f108662y || (f < 1.0f && f > BitmapDescriptorFactory.HUE_RED)) {
            double d = (double) f;
            if (d < 0.0d) {
                m170194c(f, f2, mo153364b());
            } else if (d > 0.0d) {
                m170193b(f, f2, mo153364b());
            } else {
                m170196p();
            }
        } else {
            this.f108644g.mo153354b();
            mo156695a(BitmapDescriptorFactory.HUE_RED);
            this.f108662y = false;
        }
    }

    /* renamed from: b */
    private void m170193b(float f, float f2, boolean z) {
        int i;
        int i2;
        String str;
        Drawable drawable;
        if (this.f108660w != null) {
            this.f108658u = true;
            float width = f * ((float) this.itemView.getWidth());
            boolean e = m170195e(f);
            this.f108657t = e;
            AbstractC42637b bVar = this.f108660w;
            MailThread mailThread = this.f108661x;
            if (e) {
                i = bVar.mo153206b(mailThread)[2];
            } else {
                i = bVar.mo153206b(mailThread)[3];
            }
            AbstractC42637b bVar2 = this.f108660w;
            MailThread mailThread2 = this.f108661x;
            if (e) {
                i2 = bVar2.mo153207c(mailThread2)[2];
            } else {
                i2 = bVar2.mo153207c(mailThread2)[3];
            }
            AbstractC42637b bVar3 = this.f108660w;
            MailThread mailThread3 = this.f108661x;
            if (e) {
                str = bVar3.mo153208d(mailThread3)[2];
            } else {
                str = bVar3.mo153208d(mailThread3)[3];
            }
            if (e) {
                drawable = this.f108660w.mo153209e(this.f108661x)[2];
            } else {
                drawable = this.f108660w.mo153209e(this.f108661x)[3];
            }
            drawable.setTint(C43761d.m173472c(R.color.static_white));
            f108637a = this.f108644g.mo153350a(width, str, i2, i, drawable, this.f108660w.mo153204a(this.f108661x)[2], this.f108663z);
        }
    }

    /* renamed from: c */
    private void m170194c(float f, float f2, boolean z) {
        int i;
        int i2;
        String str;
        Drawable drawable;
        if (this.f108660w != null) {
            this.f108658u = false;
            float width = f * ((float) this.itemView.getWidth());
            boolean e = m170195e(f);
            this.f108657t = e;
            AbstractC42637b bVar = this.f108660w;
            MailThread mailThread = this.f108661x;
            if (e) {
                i = bVar.mo153206b(mailThread)[0];
            } else {
                i = bVar.mo153206b(mailThread)[1];
            }
            AbstractC42637b bVar2 = this.f108660w;
            MailThread mailThread2 = this.f108661x;
            if (e) {
                i2 = bVar2.mo153207c(mailThread2)[0];
            } else {
                i2 = bVar2.mo153207c(mailThread2)[1];
            }
            AbstractC42637b bVar3 = this.f108660w;
            MailThread mailThread3 = this.f108661x;
            if (e) {
                str = bVar3.mo153208d(mailThread3)[0];
            } else {
                str = bVar3.mo153208d(mailThread3)[1];
            }
            if (e) {
                drawable = this.f108660w.mo153209e(this.f108661x)[0];
            } else {
                drawable = this.f108660w.mo153209e(this.f108661x)[1];
            }
            drawable.setTint(C43761d.m173472c(R.color.static_white));
            f108637a = this.f108644g.mo153353b(width, str, i2, i, drawable, this.f108660w.mo153204a(this.f108661x)[0], this.f108663z);
        }
    }
}
