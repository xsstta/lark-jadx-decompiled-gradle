package com.ss.android.lark.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.DialogC0259b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.larksuite.suite.R;

public class BottomSheetListDialog extends DialogC0259b implements DialogInterface {

    /* renamed from: a */
    BottomSheetBehavior<LinearLayout> f143746a;

    /* renamed from: b */
    RecyclerView.Adapter f143747b;

    /* renamed from: c */
    String f143748c;

    /* renamed from: d */
    boolean f143749d;

    /* renamed from: e */
    DialogInterface.OnClickListener f143750e;

    /* renamed from: f */
    String f143751f;

    /* renamed from: g */
    boolean f143752g;

    /* renamed from: h */
    DialogInterface.OnClickListener f143753h;

    /* renamed from: i */
    String f143754i;

    /* renamed from: j */
    String f143755j;

    /* renamed from: k */
    boolean f143756k;
    @BindView(5697)
    TextView mMessageView;
    @BindView(5859)
    TextView mNegativeBtn;
    @BindView(5860)
    TextView mPositiveBtn;
    @BindView(5696)
    RecyclerView mRecyclerView;
    @BindView(5698)
    TextView mTitleView;

    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            attributes.gravity = 80;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: com.ss.android.lark.widget.dialog.BottomSheetListDialog$a */
    public static final class C58412a {

        /* renamed from: a */
        public Context f143760a;

        /* renamed from: b */
        public boolean f143761b;

        /* renamed from: c */
        public String f143762c;

        /* renamed from: d */
        public String f143763d;

        /* renamed from: e */
        public RecyclerView.Adapter f143764e;

        /* renamed from: f */
        public String f143765f;

        /* renamed from: g */
        public DialogInterface.OnClickListener f143766g;

        /* renamed from: h */
        public String f143767h;

        /* renamed from: i */
        public DialogInterface.OnClickListener f143768i;

        /* renamed from: j */
        public boolean f143769j = true;

        /* renamed from: a */
        public BottomSheetListDialog mo197752a() {
            return new BottomSheetListDialog(this);
        }

        /* renamed from: a */
        public C58412a mo197747a(RecyclerView.Adapter adapter) {
            this.f143764e = adapter;
            return this;
        }

        /* renamed from: b */
        public C58412a mo197753b(String str) {
            this.f143763d = str;
            return this;
        }

        /* renamed from: a */
        public C58412a mo197748a(String str) {
            this.f143762c = str;
            return this;
        }

        public C58412a(Context context) {
            this.f143760a = context;
        }

        /* renamed from: a */
        public C58412a mo197751a(boolean z) {
            this.f143761b = z;
            return this;
        }

        /* renamed from: b */
        public C58412a mo197754b(String str, DialogInterface.OnClickListener onClickListener) {
            this.f143765f = str;
            this.f143766g = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C58412a mo197749a(String str, DialogInterface.OnClickListener onClickListener) {
            this.f143767h = str;
            this.f143768i = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C58412a mo197750a(String str, boolean z, DialogInterface.OnClickListener onClickListener) {
            this.f143769j = z;
            mo197749a(str, onClickListener);
            return this;
        }
    }

    /* renamed from: a */
    public void mo197742a(String str) {
        this.f143751f = str;
        this.mPositiveBtn.setText(str);
    }

    private BottomSheetListDialog(C58412a aVar) {
        super(aVar.f143760a, R.style.customDialog);
        this.f143749d = true;
        supportRequestWindowFeature(1);
        this.f143756k = aVar.f143761b;
        this.f143747b = aVar.f143764e;
        this.f143748c = aVar.f143765f;
        this.f143750e = aVar.f143766g;
        this.f143751f = aVar.f143767h;
        this.f143753h = aVar.f143768i;
        this.f143752g = aVar.f143769j;
        this.f143754i = aVar.f143762c;
        this.f143755j = aVar.f143763d;
    }

    @Override // androidx.appcompat.app.DialogC0259b
    public void onCreate(Bundle bundle) {
        getWindow().setSoftInputMode(16);
        super.onCreate(bundle);
        setContentView(R.layout.bottom_sheet_list_dialog);
        ButterKnife.bind(this);
        BottomSheetBehavior<LinearLayout> b = BottomSheetBehavior.m79955b((LinearLayout) findViewById(R.id.bottom_sheet));
        this.f143746a = b;
        b.mo76715c(false);
        setCancelable(this.f143756k);
        setCanceledOnTouchOutside(true);
        findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.dialog.BottomSheetListDialog.View$OnClickListenerC584091 */

            public void onClick(View view) {
                BottomSheetListDialog.this.dismiss();
            }
        });
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView.Adapter adapter = this.f143747b;
        if (adapter != null) {
            this.mRecyclerView.setAdapter(adapter);
        }
        this.mTitleView.setText(this.f143754i);
        this.mMessageView.setText(this.f143755j);
        this.mPositiveBtn.setText(this.f143751f);
        this.mPositiveBtn.setEnabled(this.f143752g);
        this.mPositiveBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.dialog.BottomSheetListDialog.View$OnClickListenerC584102 */

            public void onClick(View view) {
                if (BottomSheetListDialog.this.f143753h != null) {
                    BottomSheetListDialog.this.f143753h.onClick(BottomSheetListDialog.this, 0);
                }
                BottomSheetListDialog.this.dismiss();
            }
        });
        this.mNegativeBtn.setText(this.f143748c);
        this.mNegativeBtn.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.dialog.BottomSheetListDialog.View$OnClickListenerC584113 */

            public void onClick(View view) {
                if (BottomSheetListDialog.this.f143750e != null) {
                    BottomSheetListDialog.this.f143750e.onClick(BottomSheetListDialog.this, 0);
                }
                BottomSheetListDialog.this.dismiss();
            }
        });
    }
}
