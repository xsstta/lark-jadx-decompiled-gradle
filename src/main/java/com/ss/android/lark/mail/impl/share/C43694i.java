package com.ss.android.lark.mail.impl.share;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.email.client.v1.CollaboratorType;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.ButtonBubbleConfig;
import com.ss.android.lark.guide.ui.config.ButtonConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guidemgr.p1935b.p1936a.AbstractC38707a;
import com.ss.android.lark.guidemgr.p1935b.p1937b.C38708a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.share.C43681d;
import com.ss.android.lark.mail.impl.share.C43685e;
import com.ss.android.lark.mail.impl.share.ShareActivity;
import com.ss.android.lark.mail.impl.utils.C43785p;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.view.p2225a.C43909a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.switch_button.SwitchButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.share.i */
public class C43694i {

    /* renamed from: A */
    private SwitchButton f110862A;

    /* renamed from: B */
    private boolean f110863B;

    /* renamed from: C */
    private int f110864C;

    /* renamed from: a */
    public Context f110865a;

    /* renamed from: b */
    public AbstractC43704a f110866b;

    /* renamed from: c */
    public View f110867c;

    /* renamed from: d */
    public ImageView f110868d;

    /* renamed from: e */
    public UDEditText f110869e;

    /* renamed from: f */
    public RecyclerView f110870f;

    /* renamed from: g */
    public RecyclerView f110871g;

    /* renamed from: h */
    public int f110872h;

    /* renamed from: i */
    public LinearLayoutManager f110873i;

    /* renamed from: j */
    public C43685e f110874j;

    /* renamed from: k */
    public C43681d f110875k;

    /* renamed from: l */
    public C43909a f110876l;

    /* renamed from: m */
    public boolean f110877m = true;

    /* renamed from: n */
    public ArrayList<C43689g> f110878n;

    /* renamed from: o */
    private final String f110879o = "ShareViewController";

    /* renamed from: p */
    private ShareActivity.Mode f110880p;

    /* renamed from: q */
    private View f110881q;

    /* renamed from: r */
    private View f110882r;

    /* renamed from: s */
    private View f110883s;

    /* renamed from: t */
    private ViewGroup f110884t;

    /* renamed from: u */
    private ViewGroup f110885u;

    /* renamed from: v */
    private ImageView f110886v;

    /* renamed from: w */
    private TextView f110887w;

    /* renamed from: x */
    private TextView f110888x;

    /* renamed from: y */
    private TextView f110889y;

    /* renamed from: z */
    private TextView f110890z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.i$b */
    public interface AbstractC43705b {
        /* renamed from: a */
        void mo155671a(String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.i$a */
    public static abstract class AbstractC43704a {
        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo155662a();

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo155663a(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo155664a(String str);

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo155665a(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo155666b();

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo155667b(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo155668b(String str) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo155669c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo155670d() {
        }

        AbstractC43704a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo155769a() {
        return this.f110881q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo155782f() {
        return this.f110862A.isChecked();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155777b() {
        Log.m165389i("ShareViewController", "dismissLoadingDialog");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass11 */

            public void run() {
                if (C43694i.this.f110876l != null && C43694i.this.f110876l.mo156328b()) {
                    C43694i.this.f110876l.mo156326a();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo155779c() {
        Log.m165389i("ShareViewController", "clearSearchInput");
        this.f110869e.setText("");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo155781e() {
        Log.m165389i("ShareViewController", "hideKeyboard");
        ((InputMethodManager) this.f110865a.getSystemService("input_method")).hideSoftInputFromWindow(this.f110881q.getWindowToken(), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.mail.impl.share.i$9 */
    public static /* synthetic */ class C437039 {

        /* renamed from: a */
        static final /* synthetic */ int[] f110914a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode[] r0 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.share.C43694i.C437039.f110914a = r0
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r1 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.Collaborate     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.share.C43694i.C437039.f110914a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r1 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.SendToChat     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.share.C43694i.C437039.f110914a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.lark.mail.impl.share.ShareActivity$Mode r1 = com.ss.android.lark.mail.impl.share.ShareActivity.Mode.CreateNewChat     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.share.C43694i.C437039.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo155780d() {
        int findFirstVisibleItemPosition;
        int findLastVisibleItemPosition;
        Log.m165389i("ShareViewController", "updateVisibleCandidates");
        if (!CollectionUtils.isEmpty(this.f110878n) && (findFirstVisibleItemPosition = this.f110873i.findFirstVisibleItemPosition()) >= 0 && (findLastVisibleItemPosition = this.f110873i.findLastVisibleItemPosition()) >= 0 && findLastVisibleItemPosition < this.f110875k.getItemCount()) {
            this.f110875k.notifyItemRangeChanged(findFirstVisibleItemPosition, (findLastVisibleItemPosition - findFirstVisibleItemPosition) + 1);
        }
    }

    /* renamed from: g */
    public void mo155783g() {
        int i;
        if (this.f110884t.getVisibility() == 0 || this.f110874j.getItemCount() != 0 || !this.f110877m) {
            i = 0;
        } else {
            i = this.f110864C;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f110882r.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.f110882r.setLayoutParams(layoutParams);
    }

    /* renamed from: h */
    public void mo155784h() {
        if (this.f110874j.getItemCount() > 0) {
            this.f110883s.setVisibility(0);
        } else if (this.f110874j.getItemCount() > 0 || this.f110867c.getVisibility() != 0) {
            this.f110883s.setVisibility(8);
        } else {
            this.f110883s.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void m173287i() {
        View inflate = LayoutInflater.from(this.f110865a).inflate(R.layout.mail_share_layout, (ViewGroup) null);
        this.f110881q = inflate;
        this.f110887w = (TextView) inflate.findViewById(R.id.mail_share_title_bar_title);
        ImageView imageView = (ImageView) this.f110881q.findViewById(R.id.mail_share_title_bar_back_button);
        this.f110886v = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass12 */

            public void onClick(View view) {
                Log.m165389i("ShareViewController", "onClick back");
                C43694i.this.f110866b.mo155662a();
            }
        });
        TextView textView = (TextView) this.f110881q.findViewById(R.id.mail_share_title_bar_done_button);
        this.f110888x = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass13 */

            public void onClick(View view) {
                Log.m165389i("ShareViewController", "onClick done");
                C43694i.this.mo155781e();
                C43694i.this.f110866b.mo155666b();
            }
        });
        this.f110882r = this.f110881q.findViewById(R.id.mail_share_search_container);
        this.f110864C = UIHelper.dp2px(16.0f);
        UDEditText uDEditText = (UDEditText) this.f110881q.findViewById(R.id.mail_share_add_member_search_input);
        this.f110869e = uDEditText;
        uDEditText.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass14 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                int i;
                ImageView imageView = C43694i.this.f110868d;
                if (TextUtils.isEmpty(editable.toString())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
                if (C43694i.this.f110866b != null) {
                    C43694i.this.f110866b.mo155664a(editable.toString());
                }
            }
        });
        ImageView imageView2 = (ImageView) this.f110881q.findViewById(R.id.mail_share_add_member_clear_input_button);
        this.f110868d = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass15 */

            public void onClick(View view) {
                Log.m165389i("ShareViewController", "onClick clear input");
                C43694i.this.mo155779c();
            }
        });
        ViewGroup viewGroup = (ViewGroup) this.f110881q.findViewById(R.id.mail_share_create_new_chat_container);
        this.f110884t = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass16 */

            public void onClick(View view) {
                Log.m165389i("ShareViewController", "create new chat click");
                if (C43694i.this.f110866b != null) {
                    C43694i.this.f110866b.mo155670d();
                }
            }
        });
        this.f110883s = this.f110881q.findViewById(R.id.mail_share_create_new_chat_borderline);
        RecyclerView recyclerView = (RecyclerView) this.f110881q.findViewById(R.id.mail_share_add_member_sharing_list);
        this.f110870f = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(this.f110865a, 1, 0, false));
        C43685e eVar = new C43685e(this.f110865a, new C43685e.AbstractC43687a() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass17 */

            @Override // com.ss.android.lark.mail.impl.share.C43685e.AbstractC43687a
            /* renamed from: a */
            public void mo155765a(int i) {
                C43694i.this.f110866b.mo155667b(i);
            }
        });
        this.f110874j = eVar;
        this.f110870f.setAdapter(eVar);
        this.f110871g = (RecyclerView) this.f110881q.findViewById(R.id.mail_share_add_member_candidate_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f110865a);
        this.f110873i = linearLayoutManager;
        this.f110871g.setLayoutManager(linearLayoutManager);
        C43681d dVar = new C43681d(this.f110865a, new C43681d.AbstractC43684a() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.C436962 */

            @Override // com.ss.android.lark.mail.impl.share.C43681d.AbstractC43684a
            /* renamed from: a */
            public void mo155762a(int i) {
                if (C43694i.this.f110866b != null) {
                    C43694i.this.f110866b.mo155663a(i);
                }
            }
        });
        this.f110875k = dVar;
        this.f110871g.setAdapter(dVar);
        this.f110871g.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.C436973 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (C43694i.this.f110873i.findLastVisibleItemPosition() >= C43694i.this.f110875k.getItemCount() - 2 && C43694i.this.f110866b != null) {
                    C43694i.this.f110866b.mo155668b(C43694i.this.f110869e.getText().toString());
                }
                if (C43694i.this.f110872h == 0 && i == 1 && C43694i.this.f110866b != null) {
                    C43694i.this.f110866b.mo155669c();
                }
                C43694i.this.f110872h = i;
            }
        });
        this.f110871g.addItemDecoration(new C26198f(this.f110875k));
        this.f110867c = this.f110881q.findViewById(R.id.mail_share_empty_candidate_list_container);
        this.f110889y = (TextView) this.f110881q.findViewById(R.id.mail_share_mode_title);
        this.f110885u = (ViewGroup) this.f110881q.findViewById(R.id.mail_share_mode_switch_container);
        SwitchButton switchButton = (SwitchButton) this.f110881q.findViewById(R.id.mail_share_mode_switch);
        this.f110862A = switchButton;
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.C436984 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (C43694i.this.f110866b != null) {
                    C43694i.this.f110866b.mo155665a(z);
                }
            }
        });
        this.f110890z = (TextView) this.f110881q.findViewById(R.id.mail_share_mode_description);
        int i = C437039.f110914a[this.f110880p.ordinal()];
        if (i == 1) {
            this.f110887w.setText(R.string.Mail_Share_AddCollaboratorsTitle);
            m173286c(8);
            this.f110884t.setVisibility(8);
        } else if (i == 2) {
            this.f110887w.setText(R.string.Mail_ThreadAction_ForwardToChat);
            m173286c(8);
            this.f110884t.setVisibility(8);
        } else if (i != 3) {
            this.f110887w.setText(R.string.Mail_Share_ShareEmail);
            m173286c(0);
            this.f110884t.setVisibility(0);
        } else {
            this.f110887w.setText(R.string.Mail_Share_ShareEmail);
            m173286c(0);
            this.f110884t.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m173286c(int i) {
        this.f110889y.setVisibility(i);
        this.f110885u.setVisibility(i);
        this.f110890z.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155773a(final ArrayList<C43689g> arrayList) {
        Log.m165389i("ShareViewController", "updateSelectedList");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.RunnableC436951 */

            public void run() {
                C43694i.this.f110874j.mo155763a(arrayList);
                if (CollectionUtils.isEmpty(arrayList)) {
                    C43694i.this.f110870f.setVisibility(8);
                } else {
                    C43694i.this.f110870f.setVisibility(0);
                }
                C43694i.this.mo155783g();
                C43694i.this.mo155784h();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155770a(int i) {
        Log.m165389i("ShareViewController", "updateItem");
        if (i >= 0 && i < this.f110875k.getItemCount()) {
            this.f110875k.notifyItemChanged(i);
        }
    }

    /* renamed from: a */
    private void m173285a(C43689g gVar) {
        int findFirstVisibleItemPosition;
        int findLastVisibleItemPosition;
        Log.m165389i("ShareViewController", "updateSearchItemIfVisible");
        if (!CollectionUtils.isEmpty(this.f110878n) && (findFirstVisibleItemPosition = this.f110873i.findFirstVisibleItemPosition()) >= 0 && (findLastVisibleItemPosition = this.f110873i.findLastVisibleItemPosition()) >= 0) {
            for (findFirstVisibleItemPosition = this.f110873i.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                if (this.f110878n.get(findFirstVisibleItemPosition) == gVar) {
                    this.f110875k.notifyItemChanged(findFirstVisibleItemPosition);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155772a(String str) {
        Log.m165389i("ShareViewController", "showLoadingDialog");
        if (this.f110876l == null) {
            this.f110876l = new C43909a(this.f110865a);
        }
        this.f110876l.mo156327a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo155778b(int i) {
        Log.m165389i("ShareViewController", "showOnboardingBubbleIfNeeded");
        if (this.f110863B) {
            Log.m165389i("ShareViewController", "showOnboardingBubbleIfNeeded enqueued, abort");
            return;
        }
        this.f110863B = true;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.f110871g.findViewHolderForAdapterPosition(i);
        if (!(findViewHolderForAdapterPosition instanceof C43706j)) {
            Log.m165383e("ShareViewController", "showOnboardingBubbleIfNeeded missing view holder");
            return;
        }
        View a = ((C43706j) findViewHolderForAdapterPosition).mo155798a();
        if (a == null) {
            Log.m165383e("ShareViewController", "showOnboardingBubbleIfNeeded empty avatar view");
            return;
        }
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        AnchorConfig.AnchorGravity anchorGravity = AnchorConfig.AnchorGravity.BOTTOM;
        if (iArr[1] + (a.getHeight() / 2) > DeviceUtils.getScreenHeight(this.f110865a) / 2) {
            anchorGravity = AnchorConfig.AnchorGravity.TOP;
        }
        C41816b.m166115a().mo150118H().mo150197a("all_email_shareusers", new C38708a((Activity) this.f110865a, (AbstractC38707a) null, new ButtonBubbleConfig(new AnchorConfig(new WeakReference(a), anchorGravity), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), null, C43819s.m173684a((int) R.string.Mail_Share_SelectMemberOnboarding), null, new ButtonConfig(C43819s.m173684a((int) R.string.Mail_Onboard_OK), new ButtonConfig.ButtonAction() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.C436995 */

            @Override // com.ss.android.lark.guide.ui.config.ButtonConfig.ButtonAction
            public void onClick(View view, GuideDelegate gVar) {
                gVar.mo141659b();
            }
        }))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155776a(boolean z) {
        Log.m165389i("ShareViewController", "toggleTopRightButton");
        this.f110888x.setEnabled(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155771a(int i, C43689g gVar) {
        Log.m165389i("ShareViewController", "removeSelectedItem");
        this.f110874j.notifyDataSetChanged();
        mo155783g();
        mo155784h();
        m173285a(gVar);
    }

    C43694i(Context context, AbstractC43704a aVar, ShareActivity.Mode mode) {
        if (context == null || aVar == null || mode == null) {
            throw new IllegalArgumentException("ShareViewControllerconstructor invalid parameter");
        }
        this.f110865a = context;
        this.f110866b = aVar;
        this.f110880p = mode;
        m173287i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155774a(final ArrayList<C43689g> arrayList, final boolean z, final boolean z2) {
        Log.m165389i("ShareViewController", "updateCandidateList");
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.AnonymousClass10 */

            public void run() {
                C43694i.this.f110877m = z;
                C43694i.this.f110878n = arrayList;
                C43694i.this.f110875k.mo155760a(arrayList, z);
                if (!z2 || z || !CollectionUtils.isEmpty(C43694i.this.f110878n)) {
                    C43694i.this.f110867c.setVisibility(8);
                    C43694i.this.f110871g.setVisibility(0);
                } else {
                    C43694i.this.f110867c.setVisibility(0);
                    C43694i.this.f110871g.setVisibility(8);
                }
                C43694i.this.mo155783g();
                C43694i.this.mo155784h();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo155775a(List<C43689g> list, String str, final AbstractC43705b bVar) {
        String str2;
        String str3;
        Log.m165389i("ShareViewController", "showConfirmingDialog");
        if (CollectionUtils.isEmpty(list)) {
            Log.m165389i("ShareViewController", "showConfirmingDialog empty list");
            return;
        }
        C25639g gVar = new C25639g(this.f110865a);
        gVar.mo89237b(C43819s.m173684a((int) R.string.Mail_Share_ShareToOthers));
        gVar.mo89252k(3);
        View inflate = LayoutInflater.from(this.f110865a).inflate(R.layout.mail_share_dialog_layout, (ViewGroup) null, false);
        inflate.setBackgroundColor(UIHelper.getColor(R.color.bg_body));
        ((TextView) inflate.findViewById(R.id.mail_share_dialog_confirming_text)).setText(str);
        View findViewById = inflate.findViewById(R.id.mail_share_dialog_single_target);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mail_share_dialog_multi_target_list);
        final UDEditText uDEditText = (UDEditText) inflate.findViewById(R.id.mail_share_dialog_addition_text);
        int dimension = (int) this.f110865a.getResources().getDimension(R.dimen.mail_share_dialog_avatar_size);
        if (list.size() == 1) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.mail_share_dialog_single_target_avatar);
            TextView textView = (TextView) inflate.findViewById(R.id.mail_share_dialog_single_target_name);
            C43689g gVar2 = list.get(0);
            recyclerView.setVisibility(8);
            findViewById.setVisibility(0);
            AbstractC41849c.AbstractC41861l v = C41816b.m166115a().mo150155v();
            Context context = this.f110865a;
            String str4 = gVar2.f110852c;
            if (gVar2.f110857h != CollaboratorType.GROUP || TextUtils.isEmpty(gVar2.f110856g)) {
                str2 = gVar2.f110851b;
            } else {
                str2 = gVar2.f110856g;
            }
            v.mo150206a(context, str4, str2, imageView, dimension, dimension);
            if (C43785p.m173548c()) {
                str3 = gVar2.f110854e;
            } else {
                str3 = gVar2.f110853d;
            }
            textView.setText(str3);
        } else {
            recyclerView.setVisibility(0);
            findViewById.setVisibility(8);
            recyclerView.setLayoutManager(new GridLayoutManager(this.f110865a, 5));
            C43643b bVar2 = new C43643b(this.f110865a);
            recyclerView.addItemDecoration(new RecyclerView.AbstractC1335d() {
                /* class com.ss.android.lark.mail.impl.share.C43694i.C437006 */

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    super.getItemOffsets(rect, view, recyclerView, state);
                    rect.bottom = UIUtils.dp2px(C43694i.this.f110865a, 10.0f);
                }
            });
            recyclerView.setAdapter(bVar2);
            bVar2.mo155702a(list);
        }
        gVar.mo89236b(inflate);
        gVar.mo89225a(R.id.lkui_dialog_btn_right, C43819s.m173684a((int) R.string.Mail_Alert_OK), new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.DialogInterface$OnClickListenerC437028 */

            public void onClick(DialogInterface dialogInterface, int i) {
                KeyboardUtils.hideKeyboard(C43694i.this.f110865a, uDEditText);
                AbstractC43705b bVar = bVar;
                if (bVar != null) {
                    bVar.mo155671a(uDEditText.getText().toString());
                }
            }
        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Mail_Alert_Cancel, new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.share.C43694i.DialogInterface$OnClickListenerC437017 */

            public void onClick(DialogInterface dialogInterface, int i) {
                KeyboardUtils.hideKeyboard(C43694i.this.f110865a, uDEditText);
            }
        });
        DialogC25637f b = gVar.mo89233b();
        b.getWindow().setDimAmount(0.3f);
        b.show();
    }
}
