package com.ss.android.lark.widget.dialog;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.larksuite.component.ui.button.LKUIRadioButton;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.PullDownRecyclerView;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import com.ss.android.lark.widget.recyclerview.p2964a.C58973b;
import com.ss.android.lark.widget.recyclerview.p2964a.C58974c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.dialog.b */
public class C58423b extends AbstractC58413a<C58423b> {

    /* renamed from: a */
    public C58973b<C58425a> f143791a;

    /* renamed from: b */
    public AbstractC58427b f143792b;

    /* renamed from: c */
    private List<C58425a> f143793c;

    /* renamed from: d */
    private CharSequence f143794d;

    /* renamed from: e */
    private TextView f143795e;

    /* renamed from: f */
    private PullDownRecyclerView f143796f;

    /* renamed from: com.ss.android.lark.widget.dialog.b$b */
    public interface AbstractC58427b {
        /* renamed from: a */
        void mo108011a(int i);
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public int mo145866a() {
        return R.layout.widget_list_drawer_dialog;
    }

    /* renamed from: com.ss.android.lark.widget.dialog.b$a */
    private static class C58425a extends AbstractC58968a<C58425a> {

        /* renamed from: a */
        public AbstractC58427b f143798a;

        /* renamed from: b */
        private boolean f143799b;

        /* renamed from: f */
        private String f143800f;

        /* renamed from: g */
        private boolean f143801g;

        /* renamed from: a */
        public void mo197778a(boolean z) {
            this.f143799b = z;
        }

        @Override // com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a
        /* renamed from: a */
        public void mo101671a(C58974c cVar, int i) {
            int i2;
            TextView textView = (TextView) cVar.itemView.findViewById(R.id.tv_item);
            LKUIRadioButton lKUIRadioButton = (LKUIRadioButton) cVar.itemView.findViewById(R.id.rb_selected);
            textView.setText(this.f143800f);
            if (this.f143801g) {
                UIUtils.show(lKUIRadioButton);
                lKUIRadioButton.setChecked(this.f143799b);
            } else {
                UIUtils.hide(lKUIRadioButton);
                if (this.f143799b) {
                    i2 = R.color.function_info_500;
                } else {
                    i2 = R.color.text_title;
                }
                textView.setTextColor(UIHelper.getColor(i2));
            }
            cVar.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.dialog.C58423b.C58425a.View$OnClickListenerC584261 */

                public void onClick(View view) {
                    if (C58425a.this.f143798a != null) {
                        C58425a.this.f143798a.mo108011a(C58425a.this.mo200069h());
                    }
                }
            });
        }

        public C58425a(boolean z, String str, AbstractC58427b bVar, boolean z2) {
            super(R.layout.widget_list_drawer_dialog_item);
            this.f143799b = z;
            this.f143800f = str;
            this.f143798a = bVar;
            this.f143801g = z2;
        }
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: a */
    public C25639g mo145867a(C25639g gVar) {
        return gVar.mo89234b(1.0f).mo89222a(1.0f).mo89261t(0);
    }

    /* renamed from: com.ss.android.lark.widget.dialog.b$c */
    private class C58428c implements AbstractC58427b {

        /* renamed from: b */
        private int f143804b;

        @Override // com.ss.android.lark.widget.dialog.C58423b.AbstractC58427b
        /* renamed from: a */
        public void mo108011a(int i) {
            if (i != this.f143804b) {
                if (C58423b.this.f143791a != null) {
                    int size = C58423b.this.f143791a.mo200076a().size();
                    int i2 = this.f143804b;
                    if (i2 >= 0 && i2 < size) {
                        C58423b.this.f143791a.mo200074a(this.f143804b).mo197778a(false);
                        C58423b.this.f143791a.notifyItemChanged(this.f143804b);
                    }
                    if (i >= 0 && i < size) {
                        C58423b.this.f143791a.mo200074a(i).mo197778a(true);
                        C58423b.this.f143791a.notifyItemChanged(i);
                        this.f143804b = i;
                    }
                }
                C58423b.this.mo197766g();
                if (C58423b.this.f143792b != null) {
                    C58423b.this.f143792b.mo108011a(i);
                }
            }
        }

        C58428c(int i) {
            this.f143804b = i;
        }
    }

    @Override // com.ss.android.lark.widget.dialog.AbstractC58413a
    /* renamed from: c */
    public void mo145868c(DialogC25637f fVar) {
        this.f143795e = (TextView) fVar.findViewById(R.id.widgetListDrawerDialogTitleTv);
        this.f143796f = (PullDownRecyclerView) fVar.findViewById(R.id.widgetListDrawerDialogContentRv);
        this.f143795e.setText(this.f143794d);
        C58973b<C58425a> bVar = new C58973b<>();
        this.f143791a = bVar;
        bVar.mo200080a(this.f143793c);
        this.f143796f.setAdapter(this.f143791a);
        this.f143796f.setLayoutManager(new LinearLayoutManager(this.f143774l));
        this.f143796f.setOnPullDownListener(new PullDownRecyclerView.AbstractC58966a() {
            /* class com.ss.android.lark.widget.dialog.C58423b.C584241 */

            @Override // com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.AbstractC58966a
            /* renamed from: a */
            public void mo145869a(MotionEvent motionEvent) {
                C58423b.this.f143778p.dispatchTouchEvent(motionEvent);
            }

            @Override // com.ss.android.lark.widget.recyclerview.PullDownRecyclerView.AbstractC58966a
            /* renamed from: b */
            public void mo145870b(MotionEvent motionEvent) {
                C58423b.this.f143778p.dispatchTouchEvent(motionEvent);
            }
        });
        Window window = fVar.getWindow();
        if (window != null) {
            window.setNavigationBarColor(this.f143774l.getResources().getColor(R.color.bg_float));
        }
    }

    public C58423b(Context context, CharSequence charSequence, int i, List<String> list, AbstractC58427b bVar) {
        this(context, charSequence, i, list, bVar, false);
    }

    public C58423b(Context context, CharSequence charSequence, int i, List<String> list, AbstractC58427b bVar, boolean z) {
        super(context);
        boolean z2;
        this.f143794d = charSequence;
        this.f143792b = bVar;
        this.f143793c = new ArrayList();
        C58428c cVar = new C58428c(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            List<C58425a> list2 = this.f143793c;
            if (i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            list2.add(new C58425a(z2, str, cVar, z));
        }
        mo197762a(false);
    }
}
