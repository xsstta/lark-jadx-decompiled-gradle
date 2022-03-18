package com.ss.android.lark.invitation.v2.feat.member.channel.p2059a;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.inv.export.util.C40125p;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;

/* renamed from: com.ss.android.lark.invitation.v2.feat.member.channel.a.a */
public class C40327a extends AbstractC58968a<C40327a> {

    /* renamed from: a */
    private int f102454a;

    /* renamed from: b */
    private int f102455b;

    /* renamed from: f */
    private CharSequence f102456f;

    /* renamed from: g */
    private CharSequence f102457g;

    /* renamed from: h */
    private View.OnClickListener f102458h;

    /* renamed from: i */
    private CharSequence f102459i;

    /* renamed from: j */
    private int f102460j;

    /* renamed from: k */
    private String f102461k;

    /* renamed from: l */
    private CharSequence f102462l;

    public C40327a(String str) {
        super(R.layout.inv_invite_member_channel_title_item);
        this.f102456f = str;
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
    /* renamed from: a */
    public void mo101671a(C58974c cVar, int i) {
        if (mo200061a(R.layout.inv_invite_member_channel_lark_header_item)) {
            C40125p.m159092a(this.f102461k, (ImageView) cVar.mo200081a(R.id.imclHeaderIv));
            ((TextView) cVar.mo200081a(R.id.imclHeaderTv)).setText(this.f102462l);
        } else if (mo200061a(R.layout.inv_invite_member_channel_title_item)) {
            ((TextView) cVar.mo200081a(R.id.imcTitleTv)).setText(this.f102456f);
        } else if (mo200061a(R.layout.inv_invite_member_channel_content_item)) {
            mo146219b(cVar, i);
        }
    }

    public C40327a(String str, CharSequence charSequence) {
        super(R.layout.inv_invite_member_channel_lark_header_item);
        this.f102461k = str;
        this.f102462l = charSequence;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo146219b(C58974c cVar, int i) {
        int i2;
        View a = cVar.mo200081a(R.id.imcContentIconView);
        a.setBackgroundTintList(null);
        View a2 = cVar.mo200081a(R.id.imcContentDividerView);
        View a3 = cVar.mo200081a(R.id.imcContentDividerLarkView);
        View a4 = cVar.mo200081a(R.id.imcContentGo);
        LinearLayout linearLayout = (LinearLayout) cVar.mo200081a(R.id.imcContentWithIconLl);
        TextView textView = (TextView) cVar.mo200081a(R.id.imcContentWithIconTitleTv);
        TextView textView2 = (TextView) cVar.mo200081a(R.id.imcContentWithIconSubTitleTv);
        LinearLayout linearLayout2 = (LinearLayout) cVar.mo200081a(R.id.imcContentWithoutIconLl);
        TextView textView3 = (TextView) cVar.mo200081a(R.id.imcContentWithoutIconLeftTv);
        TextView textView4 = (TextView) cVar.mo200081a(R.id.imcContentWithoutIconRightTv);
        View a5 = cVar.mo200081a(R.id.imcContentDividerTop);
        View a6 = cVar.mo200081a(R.id.imcContentDividerBottom);
        cVar.itemView.setOnClickListener(this.f102458h);
        a4.setVisibility(0);
        if (this.f102454a != -1) {
            linearLayout.setVisibility(0);
            a.setVisibility(0);
            a.setBackgroundResource(this.f102454a);
            if (this.f102455b != 0) {
                a.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(a.getContext(), this.f102455b)));
            }
            linearLayout2.setVisibility(8);
            textView.setText(this.f102456f);
            textView2.setText(this.f102457g);
            if (C40147z.m159165e()) {
                DesktopUtil.m144299a(textView);
                cVar.mo200081a(R.id.imcContentLayout).setMinimumHeight(48);
            }
        } else {
            linearLayout.setVisibility(8);
            a.setVisibility(8);
            linearLayout2.setVisibility(0);
            textView3.setText(this.f102459i);
            if (this.f102460j <= 0) {
                textView3.setTextColor(UIHelper.getColor(R.color.text_caption));
                textView4.setTextColor(UIHelper.getColor(R.color.text_caption));
                textView4.setText(R.string.Lark_Education_NoMoreInactiveParents);
                cVar.itemView.setOnClickListener(null);
                a4.setVisibility(8);
            } else {
                textView3.setTextColor(UIHelper.getColor(R.color.text_title));
                textView4.setTextColor(UIHelper.getColor(R.color.function_info_500));
                textView4.setText(UIHelper.mustacheFormat((int) R.string.Lark_Education_XParentInactive, "Count", String.valueOf(this.f102460j)));
            }
            m159870a(linearLayout2, textView3, textView4);
        }
        if (((C40327a) mo200067f().get(0)).mo200061a(R.layout.inv_invite_member_channel_lark_header_item) || ((C40327a) mo200067f().get(0)).mo200061a(R.layout.inv_invite_member_channel_content_item)) {
            if (!((C40327a) mo200067f().get(0)).mo200061a(R.layout.inv_invite_member_channel_lark_header_item)) {
                i2 = 8;
                if (mo200069h() == 0) {
                    a5.setVisibility(0);
                    a3.setVisibility(8);
                } else {
                    a5.setVisibility(8);
                    a3.setVisibility(0);
                }
            } else if (mo200069h() == 1) {
                a5.setVisibility(0);
                i2 = 8;
                a3.setVisibility(8);
            } else {
                i2 = 8;
                a5.setVisibility(8);
                a3.setVisibility(0);
            }
            if (mo200069h() == mo200068g() - 1) {
                a6.setVisibility(0);
            } else {
                a6.setVisibility(i2);
            }
        } else {
            if (((C40327a) mo200067f().get(mo200069h() - 1)).mo200061a(R.layout.inv_invite_member_channel_content_item)) {
                a2.setVisibility(0);
            } else {
                a2.setVisibility(8);
            }
            if (((C40327a) mo200067f().get(mo200069h() - 1)).mo200061a(R.layout.inv_invite_member_channel_title_item)) {
                a5.setVisibility(0);
            } else {
                a5.setVisibility(8);
            }
            if (mo200069h() == mo200068g() - 1 || ((C40327a) mo200067f().get(mo200069h() + 1)).mo200061a(R.layout.inv_invite_member_channel_title_item)) {
                a6.setVisibility(0);
            } else {
                a6.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private void m159870a(LinearLayout linearLayout, TextView textView, TextView textView2) {
        linearLayout.post(new Runnable(linearLayout, textView, textView2) {
            /* class com.ss.android.lark.invitation.v2.feat.member.channel.p2059a.$$Lambda$a$OVPGSCgLHIZGE_2bMudearr8IHY */
            public final /* synthetic */ LinearLayout f$0;
            public final /* synthetic */ TextView f$1;
            public final /* synthetic */ TextView f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C40327a.m159871b(this.f$0, this.f$1, this.f$2);
            }
        });
    }

    public C40327a(CharSequence charSequence, int i, View.OnClickListener onClickListener) {
        super(R.layout.inv_invite_member_channel_content_item);
        this.f102454a = -1;
        this.f102459i = charSequence;
        this.f102460j = i;
        this.f102458h = onClickListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m159871b(LinearLayout linearLayout, TextView textView, TextView textView2) {
        float measureText = textView.getPaint().measureText(textView.getText().toString());
        float measureText2 = textView2.getPaint().measureText(textView2.getText().toString());
        float width = (float) (linearLayout.getWidth() - 32);
        if (measureText + measureText2 <= width) {
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        } else {
            textView.setLayoutParams(new LinearLayout.LayoutParams((int) (width - measureText2), -2));
        }
    }

    public C40327a(int i, int i2, CharSequence charSequence, View.OnClickListener onClickListener) {
        super(R.layout.inv_invite_member_channel_content_item);
        this.f102454a = i;
        this.f102455b = i2;
        this.f102456f = charSequence;
        this.f102458h = onClickListener;
    }

    public C40327a(int i, int i2, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        super(R.layout.inv_invite_member_channel_content_item);
        this.f102454a = i;
        this.f102455b = i2;
        this.f102456f = charSequence;
        this.f102457g = charSequence2;
        this.f102458h = onClickListener;
    }

    protected C40327a(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        super(i);
        this.f102454a = i2;
        this.f102455b = i3;
        this.f102456f = charSequence;
        this.f102457g = charSequence2;
        this.f102458h = onClickListener;
    }
}
