package com.ss.android.lark.mail.impl.view.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.util.UDUiUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.view.dialog.C43943c;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.view.dialog.b */
public class C43939b {

    /* renamed from: a */
    public static final int f111495a = UIHelper.dp2px(48.0f);

    /* renamed from: com.ss.android.lark.mail.impl.view.dialog.b$a */
    public static class C43942a {

        /* renamed from: a */
        public final Context f111499a;

        /* renamed from: b */
        public String f111500b;

        /* renamed from: c */
        public List<C43943c.C43945a> f111501c;

        /* renamed from: d */
        public int f111502d;

        /* renamed from: e */
        public C43943c f111503e;

        /* renamed from: a */
        public boolean mo156386a() {
            if (this.f111499a == null || CollectionUtils.isEmpty(this.f111501c)) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public C43942a mo156384a(String str) {
            this.f111500b = str;
            return this;
        }

        public C43942a(Context context) {
            this.f111499a = context;
        }

        /* renamed from: a */
        public C43942a mo156385a(List<C43943c.C43945a> list) {
            this.f111501c = list;
            return this;
        }
    }

    /* renamed from: a */
    public static UDDialog m174080a(C43942a aVar) {
        C43943c cVar;
        if (!aVar.mo156386a()) {
            return null;
        }
        if (aVar.f111503e == null) {
            cVar = new C43943c(aVar.f111499a);
        } else {
            cVar = aVar.f111503e;
        }
        cVar.mo156390a(aVar.f111501c);
        UDDialog a = m174081a(aVar, m174082a(aVar, cVar));
        a.getClass();
        cVar.mo156388a(new C43943c.AbstractC43946b() {
            /* class com.ss.android.lark.mail.impl.view.dialog.$$Lambda$AxHb_vNuAFNpOx4ciwih3RbA3BQ */

            @Override // com.ss.android.lark.mail.impl.view.dialog.C43943c.AbstractC43946b
            public final void onItemClick() {
                UDDialog.this.dismiss();
            }
        });
        return a;
    }

    /* renamed from: b */
    public static C43943c m174083b(C43942a aVar) {
        C43943c cVar;
        if (!aVar.mo156386a()) {
            return null;
        }
        if (aVar.f111503e == null) {
            cVar = new C43943c(aVar.f111499a);
        } else {
            cVar = aVar.f111503e;
        }
        cVar.mo156390a(aVar.f111501c);
        UDDialog a = m174081a(aVar, m174082a(aVar, cVar));
        a.getClass();
        cVar.mo156388a(new C43943c.AbstractC43946b() {
            /* class com.ss.android.lark.mail.impl.view.dialog.$$Lambda$AxHb_vNuAFNpOx4ciwih3RbA3BQ */

            @Override // com.ss.android.lark.mail.impl.view.dialog.C43943c.AbstractC43946b
            public final void onItemClick() {
                UDDialog.this.dismiss();
            }
        });
        a.show();
        return cVar;
    }

    /* renamed from: a */
    private static UDDialogController m174082a(final C43942a aVar, final C43943c cVar) {
        return new UDDialogController(aVar.f111499a) {
            /* class com.ss.android.lark.mail.impl.view.dialog.C43939b.C439401 */

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.universe_design.dialog.UDDialogController
            public int getDefaultRootRes() {
                return R.layout.mail_ud_bottom_dialog_with_title_bar;
            }

            /* access modifiers changed from: protected */
            @Override // com.larksuite.component.universe_design.dialog.UDDialogController
            public View createView() {
                int i;
                View createView = super.createView();
                TextView textView = (TextView) createView.findViewById(R.id.title_bar_text);
                if (aVar.f111502d > 0) {
                    i = aVar.f111502d;
                } else {
                    i = R.id.title_bar_close_button;
                }
                textView.setText(aVar.f111500b);
                ((ImageView) createView.findViewById(i)).setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.lark.mail.impl.view.dialog.C43939b.C439401.View$OnClickListenerC439411 */

                    public void onClick(View view) {
                        if (C439401.this.getMDialog() != null) {
                            C439401.this.getMDialog().dismiss();
                        }
                    }
                });
                ((ConstraintLayout) createView.findViewById(R.id.ud_bottom_dialog_content_layout)).setMaxHeight(((int) (((float) UDUiUtils.m93321a(getContext()).getHeight()) * 0.8f)) - C43939b.f111495a);
                RecyclerView recyclerView = (RecyclerView) createView.findViewById(R.id.ud_bottom_dialog_content_list);
                recyclerView.setLayoutManager(new LinearLayoutManager(aVar.f111499a));
                recyclerView.setAdapter(cVar);
                return createView;
            }
        };
    }

    /* renamed from: a */
    private static UDDialog m174081a(C43942a aVar, UDDialogController uDDialogController) {
        return ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(aVar.f111499a).controller(uDDialogController)).gravity(80)).marginInDp(0)).build();
    }
}
