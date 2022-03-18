package com.bytedance.ee.bear.list.folder;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AccountService;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.folder.C8339c;
import com.bytedance.ee.bear.list.folder.DialogC8333b;
import com.bytedance.ee.bear.list.sort.C8759d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.list.folder.b */
public class DialogC8333b extends Dialog {

    /* renamed from: a */
    public CommonActionPanelLayout f22517a;

    /* renamed from: b */
    public TextView f22518b;

    /* renamed from: c */
    public RecyclerView f22519c;

    /* renamed from: d */
    public C8339c f22520d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.folder.b$b */
    public static class C8337b {

        /* renamed from: a */
        DocumentListInfo f22522a;

        /* renamed from: b */
        C8335a.AbstractC8336a f22523b;

        /* renamed from: c */
        DialogInterface.OnClickListener f22524c;

        private C8337b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m34530a(DialogC8333b bVar, View view) {
            DialogInterface.OnClickListener onClickListener = this.f22524c;
            if (onClickListener != null) {
                onClickListener.onClick(bVar, -1);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m34529a(DialogC8333b bVar, int i, Document document) {
            C8335a.AbstractC8336a aVar = this.f22523b;
            if (aVar != null) {
                aVar.onUserClickListener(bVar, i, document);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo32759a(final DialogC8333b bVar, C10917c cVar, AccountService.Account account) {
            bVar.f22520d = new C8339c(cVar);
            bVar.f22520d.mo32761a(account);
            bVar.f22520d.mo32762a(new C8339c.AbstractC8340a(bVar) {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$b$b$mrJ4Ud9Xp3YkIS1_Ty8x7OkLtds */
                public final /* synthetic */ DialogC8333b f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.list.folder.C8339c.AbstractC8340a
                public final void onItemClick(int i, Document document) {
                    DialogC8333b.C8337b.this.m34529a((DialogC8333b.C8337b) this.f$1, (DialogC8333b) i, (int) document);
                }
            });
            bVar.f22518b.setOnClickListener(new View.OnClickListener(bVar) {
                /* class com.bytedance.ee.bear.list.folder.$$Lambda$b$b$TWdS55hT69p_p1ZveavA1v1LBuA */
                public final /* synthetic */ DialogC8333b f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    DialogC8333b.C8337b.this.m34530a(this.f$1, view);
                }
            });
            bVar.f22517a.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
                /* class com.bytedance.ee.bear.list.folder.DialogC8333b.C8337b.C83381 */

                @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
                /* renamed from: d */
                public void mo18838d() {
                    super.mo18838d();
                    if (C8337b.this.f22524c != null) {
                        C8337b.this.f22524c.onClick(bVar, -1);
                    }
                }
            });
            bVar.f22519c.setAdapter(bVar.f22520d);
            bVar.f22520d.mo32764a(this.f22522a.getDocumentList());
        }
    }

    /* renamed from: a */
    private void m34522a() {
        setContentView(getLayoutInflater().inflate(R.layout.list_dialog_delete_single_container_fail, (ViewGroup) null));
    }

    public void dismiss() {
        if (isShowing()) {
            super.dismiss();
        }
    }

    public void show() {
        if (!isShowing()) {
            super.show();
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.folder.b$a */
    public static class C8335a {

        /* renamed from: a */
        private final C8337b f22521a = new C8337b();

        /* renamed from: com.bytedance.ee.bear.list.folder.b$a$a */
        public interface AbstractC8336a {
            void onUserClickListener(DialogInterface dialogInterface, int i, Document document);
        }

        /* renamed from: a */
        public C8335a mo32754a(DialogInterface.OnClickListener onClickListener) {
            this.f22521a.f22524c = onClickListener;
            return this;
        }

        /* renamed from: a */
        public C8335a mo32755a(DocumentListInfo documentListInfo) {
            this.f22521a.f22522a = documentListInfo;
            return this;
        }

        /* renamed from: a */
        public C8335a mo32756a(AbstractC8336a aVar) {
            this.f22521a.f22523b = aVar;
            return this;
        }

        /* renamed from: a */
        public DialogC8333b mo32758a(Context context, C10917c cVar, AccountService.Account account) {
            return mo32757a(context, R.style.ActionSheetDialogStyle, cVar, account);
        }

        /* renamed from: a */
        public DialogC8333b mo32757a(Context context, int i, C10917c cVar, AccountService.Account account) {
            DialogC8333b bVar = new DialogC8333b(context, i);
            this.f22521a.mo32759a(bVar, cVar, account);
            return bVar;
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(view);
        m34523a(view);
    }

    /* renamed from: a */
    private void m34523a(View view) {
        this.f22517a = (CommonActionPanelLayout) view.findViewById(R.id.panel_layout);
        this.f22518b = (TextView) view.findViewById(R.id.tv_done);
        this.f22519c = (RecyclerView) view.findViewById(R.id.rv_users);
        this.f22519c.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f22519c.addItemDecoration(new C8759d());
        Window window = getWindow();
        if (window == null) {
            C13479a.m54758a("DeleteSingleContainerFailDialog", "window is null");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.width = -1;
        attributes.height = -2;
        TypedValue typedValue = new TypedValue();
        getContext().getResources().getValue(R.dimen.spacekit_dialog_background_dim_amount, typedValue, true);
        window.setDimAmount(typedValue.getFloat());
        window.setAttributes(attributes);
    }

    private DialogC8333b(Context context, int i) {
        super(context, i);
        m34522a();
    }
}
