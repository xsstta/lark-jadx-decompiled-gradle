package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pin.PinModule;
import com.ss.android.lark.pin.impl.C51502e;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.pin.impl.v3.binder.p2472a.AbstractC51540b.C51541a;
import com.ss.android.lark.pin.p2466a.AbstractC51472a;
import com.ss.android.lark.utils.C57851l;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.AbstractC58992f;

/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.b */
public abstract class AbstractC51540b<VH extends C51541a> extends AbstractC58992f<PinInfo, VH> {

    /* renamed from: a */
    private static final int f128305a = UIHelper.dp2px(32.0f);

    /* renamed from: c */
    protected C51502e.AbstractC51506c f128306c;

    /* renamed from: a */
    private void mo177588a(View view) {
        PinItemHoverHandler.m200104a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View.OnLongClickListener mo177529a(PinInfo bVar) {
        return new View.OnLongClickListener(bVar) {
            /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$b$eQkxzDEnqjt0MVUAobT2GGTjgsI */
            public final /* synthetic */ PinInfo f$1;

            {
                this.f$1 = r2;
            }

            public final boolean onLongClick(View view) {
                return AbstractC51540b.this.m200024e(this.f$1, view);
            }
        };
    }

    /* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.b$a */
    public static class C51541a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f128307a;

        /* renamed from: b */
        public TextView f128308b;

        /* renamed from: c */
        public LKUIRoundedImageView f128309c;

        /* renamed from: d */
        public TextView f128310d;

        /* renamed from: e */
        public ViewGroup f128311e;

        /* renamed from: f */
        public TextView f128312f;

        /* renamed from: g */
        public LinearLayout f128313g;

        /* renamed from: h */
        public View f128314h;

        /* renamed from: i */
        public ImageView f128315i;

        /* renamed from: j */
        public ImageView f128316j;

        /* renamed from: k */
        public ImageView f128317k;

        /* renamed from: l */
        public ImageView f128318l;

        public C51541a(View view) {
            super(view);
            this.f128313g = (LinearLayout) view.findViewById(R.id.item_root_layout);
            this.f128307a = (TextView) view.findViewById(R.id.tv_name);
            this.f128308b = (TextView) view.findViewById(R.id.tv_time);
            this.f128309c = (LKUIRoundedImageView) view.findViewById(R.id.avatar);
            this.f128310d = (TextView) view.findViewById(R.id.tv_footer);
            this.f128312f = (TextView) view.findViewById(R.id.tv_name_time);
            this.f128311e = (ViewGroup) view.findViewById(R.id.sender_layout);
            this.f128314h = view.findViewById(R.id.pin_item_divider);
            this.f128315i = (ImageView) view.findViewById(R.id.item_menu_btn);
            this.f128316j = (ImageView) view.findViewById(R.id.item_unpin_btn);
            this.f128317k = (ImageView) view.findViewById(R.id.item_view_in_chat_btn);
            this.f128318l = (ImageView) view.findViewById(R.id.item_forward_btn);
        }
    }

    public AbstractC51540b(Context context, C51502e.AbstractC51506c cVar) {
        super(context);
        this.f128306c = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m200017a(PinInfo bVar, View view) {
        this.f128306c.mo177369c(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m200018b(PinInfo bVar, View view) {
        this.f128306c.mo177366b(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m200020c(PinInfo bVar, View view) {
        this.f128306c.mo177364a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m200022d(PinInfo bVar, View view) {
        this.f128306c.mo177368c(view, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ boolean m200024e(PinInfo bVar, View view) {
        C51502e.AbstractC51506c cVar = this.f128306c;
        if (cVar != null) {
            return cVar.mo177367b(view, bVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo177530a(VH vh, PinInfo bVar) {
        if (this.f128306c != null) {
            vh.f128315i.setOnClickListener(new View.OnClickListener(bVar) {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$b$vv8eNET37wxWT4Qd0VmxoIyYQ */
                public final /* synthetic */ PinInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC51540b.this.m200022d(this.f$1, view);
                }
            });
            vh.f128316j.setOnClickListener(new View.OnClickListener(bVar) {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$b$NFOzq8nflf__sQCnAGZKlRD_2wo */
                public final /* synthetic */ PinInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC51540b.this.m200020c(this.f$1, view);
                }
            });
            vh.f128317k.setOnClickListener(new View.OnClickListener(bVar) {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$b$z0XhbaKTSr7xOZHTpItHxlrThk */
                public final /* synthetic */ PinInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC51540b.this.m200018b((AbstractC51540b) this.f$1, (PinInfo) view);
                }
            });
            vh.f128318l.setOnClickListener(new View.OnClickListener(bVar) {
                /* class com.ss.android.lark.pin.impl.v3.binder.p2472a.$$Lambda$b$Cs1ppasp30bS5lCAtFwTVYVMnDs */
                public final /* synthetic */ PinInfo f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC51540b.this.m200017a((AbstractC51540b) this.f$1, (PinInfo) view);
                }
            });
        }
    }

    /* renamed from: c */
    private void m200021c(VH vh, int i, PinInfo bVar) {
        DesktopUtil.m144306b(vh.f128310d);
        vh.f128310d.setVisibility(8);
        if (!DesktopUtil.m144307b()) {
            C25649b.m91857a(vh.f128310d, LarkFont.BODY1);
        }
    }

    /* renamed from: d */
    private void m200023d(VH vh, int i, PinInfo bVar) {
        AbstractC51472a.AbstractC51480g f = PinModule.m199585b().mo144032f();
        Context context = this.f146181d;
        String d = bVar.mo177393d();
        String c = bVar.mo177392c();
        LKUIRoundedImageView lKUIRoundedImageView = vh.f128309c;
        int i2 = f128305a;
        f.mo144055a(context, d, c, lKUIRoundedImageView, i2, i2);
        if (!DesktopUtil.m144307b()) {
            C25649b.m91853a(vh.f128309c, 32);
        }
    }

    /* renamed from: a */
    public void mo31174a(VH vh, int i, PinInfo bVar) {
        m200019b(vh, i, bVar);
        m200021c(vh, i, bVar);
        m200023d(vh, i, bVar);
        mo177530a(vh, bVar);
        mo177588a(((C51541a) vh).itemView);
    }

    /* renamed from: b */
    private void m200019b(VH vh, int i, PinInfo bVar) {
        String str;
        if (bVar.mo177397h() == null) {
            Log.m165383e("PinBaseHolderView", "Pin is null, msg = " + bVar.toString());
            str = "";
        } else {
            str = C57851l.m224543a(this.f146181d, bVar.mo177396g().getCreateTime() * 1000, PinModule.m199585b().mo144023a(), PinModule.m199585b().mo144030d());
        }
        String i2 = bVar.mo177398i();
        String mustacheFormat = UIHelper.mustacheFormat((int) R.string.Lark_Pin_PostAt, "date", str);
        if (bVar.mo177391b()) {
            vh.f128312f.setText(String.format("%s %s", i2, mustacheFormat));
            vh.f128312f.setVisibility(0);
            vh.f128311e.setVisibility(8);
            ((C51541a) vh).itemView.setBackgroundResource(R.drawable.item_bg_corner4_white_border);
            if (vh.f128314h != null) {
                vh.f128314h.setVisibility(8);
            }
        } else {
            vh.f128307a.setText(i2);
            vh.f128308b.setText(mustacheFormat);
            vh.f128312f.setVisibility(8);
        }
        DesktopUtil.m144299a(vh.f128307a);
        DesktopUtil.m144306b(vh.f128308b);
        DesktopUtil.m144306b(vh.f128312f);
        if (!DesktopUtil.m144307b()) {
            vh.f128316j.setVisibility(8);
            vh.f128317k.setVisibility(8);
            vh.f128318l.setVisibility(8);
            C25649b.m91857a(vh.f128307a, LarkFont.BODY1);
            C25649b.m91857a(vh.f128308b, LarkFont.CAPTION0);
            C25649b.m91857a(vh.f128312f, LarkFont.CAPTION0);
            int c = LKUIDisplayManager.m91881c(this.f146181d, 24) + UIHelper.dp2px(3.0f);
            int c2 = LKUIDisplayManager.m91881c(this.f146181d, 24) + UIHelper.dp2px(6.0f);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) vh.f128315i.getLayoutParams();
            layoutParams.width = c;
            layoutParams.height = c2;
            vh.f128315i.setLayoutParams(layoutParams);
            return;
        }
        vh.f128315i.setVisibility(8);
    }
}
