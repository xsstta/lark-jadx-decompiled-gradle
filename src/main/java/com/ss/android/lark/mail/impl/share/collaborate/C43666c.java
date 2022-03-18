package com.ss.android.lark.mail.impl.share.collaborate;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.PermissionCode;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.share.collaborate.C43663b;
import com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity;
import com.ss.android.lark.mail.impl.utils.C43771m;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.share.collaborate.c */
class C43666c {

    /* renamed from: a */
    public AbstractC43675a f110782a;

    /* renamed from: b */
    public C43663b f110783b;

    /* renamed from: c */
    public C43909a f110784c;

    /* renamed from: d */
    public ArrayList<Collaborator> f110785d;

    /* renamed from: e */
    private final String f110786e = "CollaborateViewController";

    /* renamed from: f */
    private Context f110787f;

    /* renamed from: g */
    private View f110788g;

    /* renamed from: h */
    private ImageView f110789h;

    /* renamed from: i */
    private TextView f110790i;

    /* renamed from: j */
    private TextView f110791j;

    /* renamed from: k */
    private RecyclerView f110792k;

    /* renamed from: l */
    private LinearLayoutManager f110793l;

    /* renamed from: m */
    private CollaborateActivity.CollaborateMode f110794m = CollaborateActivity.CollaborateMode.Add;

    /* renamed from: n */
    private PermissionCode f110795n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.c$a */
    public static abstract class AbstractC43675a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo155723a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo155724a(Collaborator collaborator) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo155725a(Collaborator collaborator, int i);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo155726b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo155727c() {
        }

        AbstractC43675a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo155744a() {
        return this.f110788g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155749b() {
        Log.m165389i("CollaborateViewController", "dismissLoadingDialog");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.RunnableC436682 */

            public void run() {
                if (C43666c.this.f110784c != null && C43666c.this.f110784c.mo156328b()) {
                    C43666c.this.f110784c.mo156326a();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.collaborate.c$8 */
    public static /* synthetic */ class C436748 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110805a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$CollaborateMode[] r0 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.CollaborateMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.share.collaborate.C43666c.C436748.f110805a = r0
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$CollaborateMode r1 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.CollaborateMode.Edit     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.share.collaborate.C43666c.C436748.f110805a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity$CollaborateMode r1 = com.ss.android.lark.mail.impl.share.collaborate.CollaborateActivity.CollaborateMode.Add     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.collaborate.C43666c.C436748.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo155751d() {
        Log.m165389i("CollaborateViewController", "hideKeyboard");
        ((InputMethodManager) this.f110787f.getSystemService("input_method")).hideSoftInputFromWindow(this.f110788g.getWindowToken(), 0);
    }

    /* renamed from: c */
    public void mo155750c() {
        int i;
        int i2;
        Log.m165389i("CollaborateViewController", "showQuitShareConfirmDialog");
        PermissionCode permissionCode = this.f110795n;
        if (permissionCode == null || permissionCode == PermissionCode.NONE) {
            Log.m165389i("CollaborateViewController", "showQuitShareConfirmDialog not a share thread");
            return;
        }
        if (this.f110795n == PermissionCode.OWNER) {
            i = R.string.Mail_Share_QuitShareForOwner;
        } else {
            i = R.string.Mail_Share_QuitSharing;
        }
        Context context = this.f110787f;
        if (this.f110795n == PermissionCode.OWNER) {
            i2 = R.string.Mail_Share_ConfirmQuitShareMessageForOwner;
        } else {
            i2 = R.string.Mail_Share_ConfirmQuitShareMessage;
        }
        C43771m.m173502a(context, i, i2, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, i, (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.DialogInterface$OnClickListenerC436704 */

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m165389i("CollaborateViewController", "showQuitShareConfirmDialog onClick confirm");
                if (C43666c.this.f110782a != null) {
                    C43666c.this.f110782a.mo155727c();
                }
            }
        }).mo89239c();
        if (this.f110795n == PermissionCode.OWNER) {
            C42209j.m168612a("share_quit_share_from_owner_fail", "toast");
        } else {
            C42209j.m168612a("share_quit_share_fail", "toast");
        }
        if (this.f110795n == PermissionCode.OWNER) {
            C42187a.m168579z();
        } else {
            C42187a.m168457A();
        }
    }

    /* renamed from: e */
    private void m173246e() {
        View inflate = LayoutInflater.from(this.f110787f).inflate(R.layout.mail_collaborate_layout, (ViewGroup) null);
        this.f110788g = inflate;
        this.f110790i = (TextView) inflate.findViewById(R.id.mail_collaborate_title);
        ImageView imageView = (ImageView) this.f110788g.findViewById(R.id.mail_share_title_bar_back_button);
        this.f110789h = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.View$OnClickListenerC436715 */

            public void onClick(View view) {
                Log.m165389i("CollaborateViewController", "onClick back");
                C43666c.this.f110782a.mo155723a();
            }
        });
        TextView textView = (TextView) this.f110788g.findViewById(R.id.mail_collaborate_done_button);
        this.f110791j = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.View$OnClickListenerC436726 */

            public void onClick(View view) {
                Log.m165389i("CollaborateViewController", "onClick done");
                C43666c.this.mo155751d();
                C43666c.this.f110782a.mo155726b();
            }
        });
        this.f110792k = (RecyclerView) this.f110788g.findViewById(R.id.mail_share_add_member_candidate_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f110787f);
        this.f110793l = linearLayoutManager;
        this.f110792k.setLayoutManager(linearLayoutManager);
        C43663b bVar = new C43663b(this.f110787f, new C43663b.AbstractC43665a() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.C436737 */

            @Override // com.ss.android.lark.mail.impl.share.collaborate.C43663b.AbstractC43665a
            /* renamed from: a */
            public void mo155743a(Collaborator collaborator, int i) {
                Log.m165389i("CollaborateViewController", "onItemPermissionTagClick");
                if (C43666c.this.f110782a != null) {
                    C43666c.this.f110782a.mo155725a(collaborator, i);
                }
            }
        }, this.f110795n);
        this.f110783b = bVar;
        this.f110792k.setAdapter(bVar);
        int i = C436748.f110805a[this.f110794m.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.f110790i.setText(C43819s.m173684a((int) R.string.Mail_Share_CollaboratorPermissions));
            }
        } else if (this.f110795n == PermissionCode.OWNER) {
            this.f110790i.setText(C43819s.m173684a((int) R.string.Mail_Share_ManageCollaborators));
            this.f110791j.setText(R.string.Mail_Share_QuitShareForOwner);
        } else {
            this.f110790i.setText(C43819s.m173684a((int) R.string.Mail_Share_CheckSharing));
            this.f110791j.setText(R.string.Mail_Share_QuitSharing);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155747a(final ArrayList<Collaborator> arrayList) {
        Log.m165389i("CollaborateViewController", "updateCollaboratorList");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.RunnableC436671 */

            public void run() {
                C43666c.this.f110785d = arrayList;
                C43666c.this.f110783b.mo155741a(arrayList);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155746a(String str) {
        Log.m165389i("CollaborateViewController", "showLoadingDialog");
        if (this.f110784c == null) {
            this.f110784c = new C43909a(this.f110787f);
        }
        this.f110784c.mo156327a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155745a(final Collaborator collaborator) {
        Log.m165389i("CollaborateViewController", "showRemoveConfirmDialog");
        C43771m.m173503a(this.f110787f, (int) R.string.Mail_Share_RemoveTheCollaborator, (int) R.string.Mail_Alert_Cancel, (int) R.color.text_title, (int) R.string.Mail_Share_TitleBarRemove, (int) R.color.function_danger_500, (DialogInterface.OnClickListener) null, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.collaborate.C43666c.DialogInterface$OnClickListenerC436693 */

            public void onClick(DialogInterface dialogInterface, int i) {
                C43666c.this.f110782a.mo155724a(collaborator);
            }
        }).mo89239c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155748a(boolean z) {
        int i;
        Log.m165389i("CollaborateViewController", "toggleDoneButtonVisibility");
        TextView textView = this.f110791j;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
    }

    C43666c(Context context, AbstractC43675a aVar, CollaborateActivity.CollaborateMode collaborateMode, PermissionCode permissionCode) {
        if (context == null || aVar == null) {
            throw new IllegalArgumentException("CollaborateViewControllerconstructor invalid parameter");
        }
        this.f110787f = context;
        this.f110782a = aVar;
        this.f110794m = collaborateMode;
        this.f110795n = permissionCode;
        m173246e();
    }
}
