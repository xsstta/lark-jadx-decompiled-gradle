package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0259b;
import com.bytedance.ee.bear.widgets.p567a.C11815a;
import com.bytedance.ee.bear.widgets.p567a.C11816b;
import com.bytedance.ee.bear.widgets.p567a.C11819c;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.badge.UDBadgeView;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.widgets.a */
public class C11811a extends C11819c {

    /* renamed from: a */
    public Context f31800a;

    /* renamed from: b */
    public List<C11816b> f31801b = new ArrayList(10);

    /* renamed from: c */
    public String f31802c;

    /* renamed from: d */
    private C11815a f31803d;

    /* renamed from: e */
    private C11813a f31804e;

    /* renamed from: f */
    private DialogC0259b f31805f;

    /* renamed from: f */
    public List<C11816b> mo45234f() {
        return this.f31801b;
    }

    /* renamed from: a */
    public C11811a mo45220a(CharSequence charSequence) {
        ((C25644o) ((C25644o) ((C25644o) this.f31803d.mo89237b(charSequence)).mo89250i(R.color.text_placeholder)).mo89249h(14)).mo89251j(2);
        return this;
    }

    /* renamed from: a */
    public C11811a mo45221a(CharSequence charSequence, View.OnClickListener onClickListener) {
        return mo45219a(C11816b.m49006a().mo45254a(charSequence).mo45253a(onClickListener).mo45257a());
    }

    /* renamed from: a */
    public C11811a mo45219a(C11816b bVar) {
        this.f31801b.add(bVar);
        return this;
    }

    @Override // com.bytedance.ee.bear.widgets.p567a.C11819c
    /* renamed from: a */
    public void mo45222a(int i, C11816b bVar) {
        if (!mo45233e()) {
            C13479a.m54775e("ActionSheet", "updateItem: dialog is not built or not showing");
        } else if (this.f31801b.get(i) != null) {
            this.f31801b.set(i, bVar);
            this.f31804e.notifyItemChanged(i, bVar);
        } else {
            C13479a.m54775e("ActionSheet", String.format("updateItem: update position = %s failure, check it out", Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public void mo45223a(C11814b bVar, final C11816b bVar2) {
        if (!TextUtils.isEmpty(bVar2.mo45241b())) {
            bVar.f31810a.setText(bVar2.mo45241b());
        }
        if (bVar2.mo45245f()) {
            bVar.f31810a.setTypeface(Typeface.defaultFromStyle(1));
        }
        if (!bVar2.mo45247h()) {
            bVar.f31810a.setTextColor(bVar.f31810a.getResources().getColor(R.color.text_disable));
        } else if (bVar2.mo45244e() != -1) {
            bVar.f31810a.setTextColor(bVar2.mo45244e());
        } else {
            bVar.f31810a.setTextColor(bVar.f31810a.getResources().getColor(R.color.text_title));
        }
        int i = 0;
        if (bVar2.mo45243d() != null) {
            bVar.f31812c.setVisibility(0);
            bVar.f31812c.setImageDrawable(bVar2.mo45243d());
        } else {
            bVar.f31812c.setVisibility(8);
            bVar.f31812c.setImageDrawable(null);
        }
        bVar.f31810a.setAlpha(bVar2.mo45248i());
        UDBadgeView uDBadgeView = bVar.f31811b;
        if (!bVar2.mo45242c()) {
            i = 8;
        }
        uDBadgeView.setVisibility(i);
        bVar.itemView.setEnabled(bVar2.mo45247h());
        bVar.itemView.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.widgets.C11811a.C118121 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (bVar2.mo45247h()) {
                    if (bVar2.mo45246g() != null) {
                        bVar2.mo45246g().onClick(view);
                    }
                    C11811a.this.mo45232d();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widgets.a$a */
    public class C11813a extends UDBaseListDialogAdapter {

        /* renamed from: c */
        private final List<C11816b> f31809c;

        @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f31809c.size();
        }

        /* renamed from: a */
        public C11816b mo45236a(int i) {
            return this.f31809c.get(i);
        }

        /* renamed from: a */
        public C11814b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C11814b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.widget_action_sheet_content_item_layout, viewGroup, false));
        }

        @Override // com.larksuite.component.universe_design.dialog.UDBaseListDialogAdapter
        /* renamed from: a */
        public void onBindViewHolder(UDBaseListDialogAdapter.UDDialogListItemViewHolder aVar, int i) {
            C11811a.this.mo45223a((C11814b) aVar, mo45236a(i));
        }

        C11813a(Context context, List<C11816b> list) {
            super(context);
            this.f31809c = list;
        }
    }

    /* renamed from: b */
    public DialogC0259b mo45224b() {
        return mo45212a(-1.0f);
    }

    /* renamed from: d */
    public void mo45232d() {
        DialogC0259b bVar = this.f31805f;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    /* renamed from: e */
    public boolean mo45233e() {
        DialogC0259b bVar = this.f31805f;
        if (bVar == null || !bVar.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C11811a mo45213a() {
        return mo45226b(C11816b.m49006a().mo45254a(this.f31800a.getText(R.string.Doc_Widget_Cancel)).mo45257a());
    }

    /* renamed from: c */
    public void mo45231c() {
        try {
            DialogC0259b bVar = this.f31805f;
            if (bVar != null) {
                bVar.show();
                return;
            }
            DialogC0259b b = mo45224b();
            this.f31805f = b;
            b.show();
        } catch (Exception e) {
            C13479a.m54761a("ActionSheet", e);
        }
    }

    /* renamed from: a */
    public static C11811a m48976a(Context context) {
        return new C11811a(context);
    }

    /* renamed from: a */
    public C11811a mo45214a(int i) {
        return mo45220a((CharSequence) this.f31800a.getText(i).toString());
    }

    private C11811a(Context context) {
        this.f31800a = context;
        this.f31803d = new C11815a(context);
    }

    /* renamed from: a */
    public int mo45211a(String str) {
        for (int i = 0; i < this.f31801b.size(); i++) {
            C11816b bVar = this.f31801b.get(i);
            if (!(TextUtils.isEmpty(bVar.mo45249j()) || TextUtils.isEmpty(str) || !TextUtils.equals(bVar.mo45249j(), str))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public C11811a mo45226b(C11816b bVar) {
        if (bVar != null) {
            if (TextUtils.isEmpty(bVar.mo45241b())) {
                bVar.mo45239a(this.f31800a.getText(R.string.Doc_Widget_Cancel));
            }
            View inflate = View.inflate(this.f31800a, R.layout.widget_action_sheet_content_cancel_item_layout, null);
            mo45223a(new C11814b(inflate), bVar);
            this.f31803d.mo89241c(inflate);
        }
        return this;
    }

    /* renamed from: a */
    public DialogC0259b mo45212a(float f) {
        C11813a aVar = new C11813a(this.f31800a, this.f31801b);
        this.f31804e = aVar;
        this.f31803d.mo89204a(aVar);
        if (f >= BitmapDescriptorFactory.HUE_RED && f <= 1.0f) {
            this.f31803d.mo89245d(f);
        }
        DialogC25637f b = this.f31803d.mo89233b();
        this.f31805f = b;
        return b;
    }

    @Override // com.bytedance.ee.bear.widgets.p567a.C11819c
    /* renamed from: b */
    public void mo45228b(int i) {
        if (!mo45233e()) {
            C13479a.m54775e("ActionSheet", "subtractItem: dialog is not built or not showing");
        } else if (this.f31801b.remove(i) == null) {
            C13479a.m54775e("ActionSheet", String.format("subtractItem: remove position = %s failure, check it out", Integer.valueOf(i)));
        } else {
            this.f31804e.notifyItemRemoved(i);
        }
    }

    /* renamed from: a */
    public C11811a mo45216a(DialogInterface.OnCancelListener onCancelListener) {
        this.f31803d.mo89226a(onCancelListener);
        return this;
    }

    /* renamed from: a */
    public C11811a mo45217a(DialogInterface.OnDismissListener onDismissListener) {
        this.f31803d.mo89227a(onDismissListener);
        return this;
    }

    /* renamed from: a */
    public C11811a mo45218a(View.OnClickListener onClickListener) {
        return mo45226b(C11816b.m49006a().mo45254a(this.f31800a.getText(R.string.Doc_Widget_Cancel)).mo45253a(onClickListener).mo45257a());
    }

    /* renamed from: b */
    public C11811a mo45225b(int i, View.OnClickListener onClickListener) {
        return mo45227b(this.f31800a.getText(i), onClickListener);
    }

    /* renamed from: c */
    public C11811a mo45229c(int i, View.OnClickListener onClickListener) {
        return mo45230c(this.f31800a.getText(i), onClickListener);
    }

    /* renamed from: c */
    public C11811a mo45230c(CharSequence charSequence, View.OnClickListener onClickListener) {
        this.f31801b.add(C11816b.m49006a().mo45254a(charSequence).mo45253a(onClickListener).mo45256a(true).mo45257a());
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.widgets.a$b */
    public class C11814b extends UDBaseListDialogAdapter.UDDialogListItemViewHolder {

        /* renamed from: a */
        TextView f31810a;

        /* renamed from: b */
        UDBadgeView f31811b;

        /* renamed from: c */
        ImageView f31812c;

        C11814b(View view) {
            super(view);
            this.f31810a = (TextView) view.findViewById(R.id.ud_dialog_content_item_tv);
            this.f31812c = (ImageView) view.findViewById(R.id.action_sheet_icon);
            this.f31811b = (UDBadgeView) view.findViewById(R.id.action_sheet_badge);
        }
    }

    /* renamed from: b */
    public C11811a mo45227b(CharSequence charSequence, View.OnClickListener onClickListener) {
        return mo45219a(C11816b.m49006a().mo45254a(charSequence).mo45251a(this.f31800a.getResources().getColor(R.color.function_danger_500)).mo45253a(onClickListener).mo45257a());
    }

    /* renamed from: a */
    public C11811a mo45215a(int i, View.OnClickListener onClickListener) {
        return mo45219a(C11816b.m49006a().mo45254a(this.f31800a.getText(i)).mo45253a(onClickListener).mo45257a());
    }
}
