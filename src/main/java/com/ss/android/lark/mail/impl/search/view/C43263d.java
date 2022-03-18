package com.ss.android.lark.mail.impl.search.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.component.universe_design.emptystate.UDEmptyState;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.ArchiveThreadListMailAction;
import com.ss.android.lark.mail.impl.action.MoveToInboxThreadListMailAction;
import com.ss.android.lark.mail.impl.action.NotSpamListAction;
import com.ss.android.lark.mail.impl.action.ReadThreadListMailAction;
import com.ss.android.lark.mail.impl.action.TrashThreadListMailAction;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.home.threadlist.C42593a;
import com.ss.android.lark.mail.impl.message.p2204d.AbstractC42870h;
import com.ss.android.lark.mail.impl.message.p2204d.C42871i;
import com.ss.android.lark.mail.impl.message.p2205e.C42886a;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.search.view.C43258a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.threadaction.ThreadActionManager;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.titlebar.AbsButton;
import com.ss.android.lark.mail.impl.view.titlebar.C43959a;
import com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar;
import com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.search.view.d */
public class C43263d implements C42593a.AbstractC42602b, C43258a.AbstractC43260a {

    /* renamed from: a */
    public final Context f110074a;

    /* renamed from: b */
    public final AbstractC43273a f110075b;

    /* renamed from: c */
    public ImageView f110076c;

    /* renamed from: d */
    public LinearLayout f110077d;

    /* renamed from: e */
    public ConstraintLayout f110078e;

    /* renamed from: f */
    public UDEditText f110079f;

    /* renamed from: g */
    public ImageView f110080g;

    /* renamed from: h */
    public int f110081h;

    /* renamed from: i */
    public C43262c f110082i;

    /* renamed from: j */
    public LinearLayoutManager f110083j;

    /* renamed from: k */
    public LinearLayout f110084k;

    /* renamed from: l */
    public LKUIStatus f110085l;

    /* renamed from: m */
    public String f110086m;

    /* renamed from: n */
    public LinearLayout f110087n;

    /* renamed from: o */
    private final String f110088o = "SearchViewController";

    /* renamed from: p */
    private final int f110089p = LocationRequest.PRIORITY_HD_ACCURACY;

    /* renamed from: q */
    private View f110090q;

    /* renamed from: r */
    private TextView f110091r;

    /* renamed from: s */
    private RecyclerView f110092s;

    /* renamed from: t */
    private UDEmptyState f110093t;

    /* renamed from: u */
    private FrameLayout f110094u;

    /* renamed from: v */
    private ImageView f110095v;

    /* renamed from: w */
    private RecyclerView f110096w;

    /* renamed from: x */
    private C43258a f110097x;

    /* renamed from: y */
    private OperationTitleBar f110098y;

    /* renamed from: z */
    private ThreadActionManager f110099z;

    /* renamed from: com.ss.android.lark.mail.impl.search.view.d$a */
    public interface AbstractC43273a {
        /* renamed from: a */
        void mo154803a(String str);

        /* renamed from: a */
        void mo154804a(String str, MailThread mailThread, int i);

        /* renamed from: b */
        void mo154807b(String str);

        /* renamed from: c */
        void mo154809c(String str);

        /* renamed from: d */
        void mo154811d();

        /* renamed from: d */
        void mo154812d(String str);

        /* renamed from: e */
        void mo150716e();

        /* renamed from: f */
        void mo154813f();

        /* renamed from: g */
        void mo154814g();

        /* renamed from: h */
        void mo154816h();
    }

    /* renamed from: b */
    public View mo154877b() {
        return this.f110090q;
    }

    /* renamed from: n */
    private boolean m171878n() {
        OperationTitleBar operationTitleBar = this.f110098y;
        if (operationTitleBar == null || operationTitleBar.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo154884g() {
        Log.m165389i("SearchViewController", "destroy");
        this.f110082i.mo153127i();
    }

    /* renamed from: h */
    public void mo154885h() {
        mo154886i();
        ((Activity) this.f110074a).finish();
    }

    /* renamed from: j */
    public void mo154887j() {
        this.f110098y.setVisibility(0);
        this.f110077d.setVisibility(4);
    }

    /* renamed from: k */
    public boolean mo154888k() {
        if (!m171878n()) {
            return false;
        }
        mo154886i();
        return true;
    }

    /* renamed from: c */
    public void mo154880c() {
        RecyclerView recyclerView = this.f110092s;
        if (recyclerView != null && recyclerView.getVisibility() == 0) {
            Log.m165389i("SearchViewController", "scrollToTop");
            this.f110092s.scrollToPosition(0);
        }
    }

    /* renamed from: d */
    public void mo154881d() {
        Log.m165389i("SearchViewController", "hideKeyboard");
        ((InputMethodManager) this.f110074a.getSystemService("input_method")).hideSoftInputFromWindow(this.f110090q.getWindowToken(), 0);
    }

    /* renamed from: e */
    public void mo154882e() {
        this.f110078e.getLayoutParams().width = m171876l();
        this.f110078e.requestLayout();
    }

    /* renamed from: f */
    public String mo154883f() {
        UDEditText uDEditText = this.f110079f;
        if (uDEditText == null || uDEditText.getText() == null) {
            return "";
        }
        return this.f110079f.getText().toString();
    }

    /* renamed from: i */
    public void mo154886i() {
        this.f110098y.setVisibility(4);
        this.f110077d.setVisibility(0);
        this.f110082i.mo153124f();
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42602b
    /* renamed from: a */
    public void mo153144a() {
        this.f110098y.setInfoText(C43819s.m173692c(this.f110082i.mo153126h()));
        Pair<List<AbsButton>, List<AbsButton>> buttons = this.f110099z.getButtons("SEARCH", this.f110082i.mo153122d());
        if (buttons != null) {
            this.f110098y.mo156419a((List) buttons.first, new C43959a(null, (List) buttons.second));
        } else {
            this.f110098y.mo156419a(null, null);
        }
    }

    /* renamed from: l */
    private int m171876l() {
        int dimensionPixelSize = this.f110074a.getResources().getDimensionPixelSize(R.dimen.mail_search_common_spacing);
        return (UIHelper.getWindowWidth(this.f110074a) - dimensionPixelSize) - Math.min(this.f110074a.getResources().getDimensionPixelSize(R.dimen.mail_search_cancel_max_width), ((int) this.f110091r.getPaint().measureText(C43819s.m173684a((int) R.string.Mail_Alert_Cancel))) + (this.f110074a.getResources().getDimensionPixelSize(R.dimen.mail_search_cancel_spacing) * 2));
    }

    /* renamed from: m */
    private void m171877m() {
        if (C42871i.m170779b()) {
            this.f110090q = LayoutInflater.from(this.f110074a).inflate(R.layout.mail_search_activity_frame, (ViewGroup) null);
        } else {
            this.f110090q = LayoutInflater.from(this.f110074a).inflate(R.layout.mail_search_activity, (ViewGroup) null);
        }
        this.f110076c = (ImageView) this.f110090q.findViewById(R.id.mail_search_animation_image);
        this.f110077d = (LinearLayout) this.f110090q.findViewById(R.id.mail_search_bar_container);
        this.f110078e = (ConstraintLayout) this.f110090q.findViewById(R.id.mail_search_bar);
        UDEditText uDEditText = (UDEditText) this.f110090q.findViewById(R.id.mail_search_input_edit_text);
        this.f110079f = uDEditText;
        uDEditText.addTextChangedListener(new TextWatcher() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.AnonymousClass11 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                String obj = editable.toString();
                int i = 8;
                if (TextUtils.isEmpty(C43263d.this.f110086m) && !TextUtils.isEmpty(obj)) {
                    C43263d.this.f110085l.mo89837a();
                    C43263d.this.f110084k.setVisibility(8);
                    C43263d.this.f110087n.setVisibility(8);
                }
                C43263d.this.f110086m = editable.toString();
                if (C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo154803a(editable.toString());
                }
                ImageView imageView = C43263d.this.f110080g;
                if (!TextUtils.isEmpty(obj)) {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        });
        this.f110079f.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.mail.impl.search.view.$$Lambda$d$FfDEJk_pn6fmMZ6m6Lr6BgDUJ1M */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return C43263d.this.m171875a((C43263d) textView, (TextView) i, (int) keyEvent);
            }
        });
        this.f110079f.setFocusableInTouchMode(true);
        this.f110079f.requestFocus();
        this.f110079f.postDelayed(new Runnable() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.AnonymousClass12 */

            public void run() {
                ((InputMethodManager) C43263d.this.f110074a.getSystemService("input_method")).showSoftInput(C43263d.this.f110079f, 1);
            }
        }, 300);
        ImageView imageView = (ImageView) this.f110090q.findViewById(R.id.mail_search_clear_button);
        this.f110080g = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.AnonymousClass13 */

            public void onClick(View view) {
                Log.m165389i("SearchViewController", "clear input click");
                C43263d.this.f110079f.setText("");
            }
        });
        TextView textView = (TextView) this.f110090q.findViewById(R.id.mail_search_cancel_button);
        this.f110091r = textView;
        textView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.AnonymousClass14 */

            public void onClick(View view) {
                if (C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo154811d();
                }
            }
        });
        this.f110092s = (RecyclerView) this.f110090q.findViewById(R.id.mail_search_result_list);
        C43262c cVar = new C43262c(this.f110074a, 2);
        this.f110082i = cVar;
        cVar.mo153104a(this);
        this.f110092s.setAdapter(this.f110082i);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f110074a, 1, false);
        this.f110083j = linearLayoutManager;
        this.f110092s.setLayoutManager(linearLayoutManager);
        this.f110092s.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432652 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && C43263d.this.f110083j.findLastVisibleItemPosition() >= C43263d.this.f110082i.getItemCount() - 2 && C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo154809c(C43263d.this.f110079f.getText().toString());
                }
                if (C43263d.this.f110081h == 0 && i == 1 && C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo154816h();
                }
                C43263d.this.f110081h = i;
            }
        });
        this.f110082i.mo153103a(new C42593a.AbstractC42601a() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432663 */

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42601a
            /* renamed from: b */
            public void mo152942b() {
            }

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42601a
            /* renamed from: a */
            public void mo152940a() {
                C43263d.this.mo154886i();
            }

            @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42601a
            /* renamed from: a */
            public void mo152941a(MailThread mailThread) {
                C43263d.this.mo154887j();
                C43263d.this.mo154881d();
            }
        });
        RecyclerView.ItemAnimator itemAnimator = this.f110092s.getItemAnimator();
        if (itemAnimator instanceof SimpleItemAnimator) {
            itemAnimator.setAddDuration(0);
            itemAnimator.setMoveDuration(0);
            itemAnimator.setChangeDuration(0);
            itemAnimator.setRemoveDuration(0);
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        this.f110084k = (LinearLayout) this.f110090q.findViewById(R.id.mail_search_empty_result_container);
        this.f110093t = (UDEmptyState) this.f110090q.findViewById(R.id.mail_search_empty_state);
        FrameLayout frameLayout = (FrameLayout) this.f110090q.findViewById(R.id.mail_search_loading);
        this.f110094u = frameLayout;
        this.f110085l = new LKUIStatus.C25680a(frameLayout).mo89855a(0.44d).mo89859a();
        this.f110087n = (LinearLayout) this.f110090q.findViewById(R.id.mail_search_history_container);
        ImageView imageView2 = (ImageView) this.f110090q.findViewById(R.id.mail_search_history_clear_button);
        this.f110095v = imageView2;
        imageView2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.View$OnClickListenerC432674 */

            public void onClick(View view) {
                if (C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo150716e();
                }
            }
        });
        this.f110096w = (RecyclerView) this.f110090q.findViewById(R.id.mail_search_history_list);
        this.f110096w.setLayoutManager(new FlexboxLayoutManager(this.f110074a, 0, 1));
        C43258a aVar = new C43258a(this.f110074a, this);
        this.f110097x = aVar;
        this.f110096w.setAdapter(aVar);
        OperationTitleBar operationTitleBar = (OperationTitleBar) this.f110090q.findViewById(R.id.multiTitleBarSearch);
        this.f110098y = operationTitleBar;
        operationTitleBar.setListener(new OperationTitleBar.AbstractC43958a() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432685 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.OperationTitleBar.AbstractC43958a
            /* renamed from: a */
            public void mo150696a() {
                Log.m165389i("SearchViewController", "multiSelectTitleBar onBackButtonClick");
                if (!C42871i.m170779b() || !C42871i.m170775a().mo153853a((AbstractC42870h) null, C43263d.this.f110074a)) {
                    C43263d.this.mo154885h();
                }
            }
        });
        this.f110099z = new ThreadActionManager(new ThreadActionButtonListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432696 */

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onChangeLabelClick() {
                Log.m165389i("SearchViewController", "multiSelectHandler onChangeLabelClick");
                C42699a.m170246a(C43263d.this.f110074a, C43263d.this.f110082i.mo153122d(), "SEARCH");
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToLabelClick() {
                C42699a.m170245a(C43263d.this.f110074a, C43263d.this.f110082i.mo153123e(), "SEARCH");
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToFolderClick() {
                C43263d.this.mo154886i();
                C42187a.m168576w(C42187a.C42191c.f107435L);
                C42699a.m170281d(C43263d.this.f110074a, C43263d.this.f110082i.mo153123e(), "SEARCH");
                C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107645I);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onMoveToInboxClick() {
                Log.m165389i("SearchViewController", "multiSelectHandler onMoveToInboxClick");
                C43263d.this.mo154886i();
                C43307b.m172030a().mo154977a(new MoveToInboxThreadListMailAction(C43263d.this.f110082i.mo153123e(), "SEARCH", new ArrayList()));
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onNotSpamClick() {
                Log.m165389i("SearchViewController", "multiSelectHandler onNotSpamClick");
                C43307b.m172030a().mo154977a(new NotSpamListAction(C43263d.this.f110082i.mo153123e(), "SEARCH", new ArrayList()));
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onReadClick() {
                int i;
                Log.m165389i("SearchViewController", "multiSelectHandler onReadClick");
                C43307b.m172030a().mo154977a(new ReadThreadListMailAction((List<String>) C43263d.this.f110082i.mo153123e(), "SEARCH", true));
                if (C43263d.this.f110082i.mo153123e() == null) {
                    i = 0;
                } else {
                    i = C43263d.this.f110082i.mo153123e().size();
                }
                C42187a.m168492a(true, i, true, C42187a.C42191c.f107434K);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onSpamClick() {
                int i;
                Log.m165389i("SearchViewController", "multiSelectHandler onSpamClick");
                C42886a.m170828a(C43263d.this.f110082i.mo153123e(), (String) null, "SEARCH");
                if (C43263d.this.f110082i.mo153123e() == null) {
                    i = 0;
                } else {
                    i = C43263d.this.f110082i.mo153123e().size();
                }
                C42187a.m168512c(i, true, C42187a.C42191c.f107434K);
                C42330c.m169059a(true, C42330c.C42332a.f107634b, C42330c.C42333b.f107646J);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onUnreadClick() {
                int i;
                Log.m165389i("SearchViewController", "multiSelectHandler onUnreadClick");
                C43307b.m172030a().mo154977a(new ReadThreadListMailAction((List<String>) C43263d.this.f110082i.mo153123e(), "SEARCH", false));
                if (C43263d.this.f110082i.mo153123e() == null) {
                    i = 0;
                } else {
                    i = C43263d.this.f110082i.mo153123e().size();
                }
                C42187a.m168492a(false, i, true, C42187a.C42191c.f107434K);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onArchiveClick() {
                int i;
                Log.m165389i("SearchViewController", "multiSelectHandler onArchiveClick");
                C43263d.this.mo154886i();
                C43307b.m172030a().mo154977a(new ArchiveThreadListMailAction(C43263d.this.f110082i.mo153123e(), "SEARCH", new ArrayList()));
                if (C43263d.this.f110082i.mo153123e() == null) {
                    i = 0;
                } else {
                    i = C43263d.this.f110082i.mo153123e().size();
                }
                C42187a.m168469a(i, true, C42187a.C42191c.f107434K);
            }

            @Override // com.ss.android.lark.mail.impl.view.titlebar.ThreadActionButtonListener
            public void onDeleteClick() {
                int i;
                Log.m165389i("SearchViewController", "multiSelectHandler onDeleteClick");
                C43307b.m172030a().mo154977a(new TrashThreadListMailAction(C43263d.this.f110082i.mo153123e(), "SEARCH", new ArrayList()));
                if (C43263d.this.f110082i.mo153123e() == null) {
                    i = 0;
                } else {
                    i = C43263d.this.f110082i.mo153123e().size();
                }
                C42187a.m168499b(i, true, C42187a.C42191c.f107434K);
            }
        });
    }

    /* renamed from: b */
    public void mo154879b(String str) {
        int i;
        Log.m165389i("SearchViewController", "setKeyword");
        this.f110079f.setText(str);
        UDEditText uDEditText = this.f110079f;
        if (TextUtils.isEmpty(str)) {
            i = 0;
        } else {
            i = str.length();
        }
        uDEditText.setSelection(i);
    }

    @Override // com.ss.android.lark.mail.impl.search.view.C43258a.AbstractC43260a
    /* renamed from: a */
    public void mo154873a(String str) {
        Log.m165389i("SearchViewController", "onHistoryItemClick");
        AbstractC43273a aVar = this.f110075b;
        if (aVar != null) {
            aVar.mo154807b(str);
        }
    }

    public C43263d(Context context, AbstractC43273a aVar) {
        this.f110074a = context;
        this.f110075b = aVar;
        m171877m();
    }

    @Override // com.ss.android.lark.mail.impl.home.threadlist.C42593a.AbstractC42602b
    /* renamed from: a */
    public void mo153145a(MailThread mailThread, int i) {
        Log.m165389i("SearchViewController", "onResultItemClick");
        AbstractC43273a aVar = this.f110075b;
        if (aVar != null) {
            aVar.mo154804a(this.f110079f.getText().toString(), mailThread, i);
        }
    }

    /* renamed from: a */
    public void mo154875a(Bitmap bitmap, int i) {
        Log.m165389i("SearchViewController", "showEnterAnimation");
        this.f110076c.setImageBitmap(bitmap);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f110076c.getLayoutParams();
        layoutParams.height = i;
        this.f110076c.setLayoutParams(layoutParams);
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (-i));
        translateAnimation.setDuration(200);
        translateAnimation.setFillAfter(false);
        this.f110076c.startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) i, BitmapDescriptorFactory.HUE_RED);
        translateAnimation2.setDuration(200);
        translateAnimation2.setFillAfter(true);
        this.f110077d.startAnimation(translateAnimation2);
        ValueAnimator ofInt = ValueAnimator.ofInt(UIHelper.getWindowWidth(this.f110074a) - (this.f110074a.getResources().getDimensionPixelSize(R.dimen.mail_search_cancel_spacing) * 2), m171876l());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432707 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C43263d.this.f110078e.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C43263d.this.f110078e.requestLayout();
            }
        });
        ofInt.setDuration(200L);
        ofInt.start();
        ofInt.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432718 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                C43263d.this.f110076c.setVisibility(8);
                if (C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo154813f();
                }
                C43263d.this.f110077d.setAnimation(null);
                if (C43263d.this.f110078e.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) C43263d.this.f110078e.getLayoutParams()).weight = 1.0f;
                    C43263d.this.f110078e.requestLayout();
                }
            }
        });
    }

    /* renamed from: b */
    public void mo154878b(Bitmap bitmap, int i) {
        Log.m165389i("SearchViewController", "showExitAnimation");
        this.f110076c.setImageBitmap(bitmap);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f110076c.getLayoutParams();
        layoutParams.height = i;
        this.f110076c.setLayoutParams(layoutParams);
        this.f110076c.setVisibility(0);
        this.f110076c.clearAnimation();
        TranslateAnimation translateAnimation = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) (-i), BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        translateAnimation.setFillAfter(true);
        this.f110076c.startAnimation(translateAnimation);
        float f = (float) i;
        TranslateAnimation translateAnimation2 = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f);
        translateAnimation2.setDuration(200);
        translateAnimation2.setFillAfter(true);
        this.f110077d.startAnimation(translateAnimation2);
        if (this.f110078e.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) this.f110078e.getLayoutParams()).weight = BitmapDescriptorFactory.HUE_RED;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(m171876l(), UIHelper.getWindowWidth(this.f110074a) - (this.f110074a.getResources().getDimensionPixelSize(R.dimen.mail_search_cancel_spacing) * 2));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.C432729 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C43263d.this.f110078e.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                C43263d.this.f110078e.requestLayout();
            }
        });
        ofInt.setDuration(200L);
        ofInt.start();
        ofInt.addListener(new Animator.AnimatorListener() {
            /* class com.ss.android.lark.mail.impl.search.view.C43263d.AnonymousClass10 */

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                if (C43263d.this.f110075b != null) {
                    C43263d.this.f110075b.mo154814g();
                }
            }
        });
        TranslateAnimation translateAnimation3 = new TranslateAnimation(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f);
        translateAnimation3.setDuration(200);
        translateAnimation3.setFillAfter(true);
        if (this.f110092s.getVisibility() == 0) {
            this.f110092s.startAnimation(translateAnimation3);
        }
        if (this.f110084k.getVisibility() == 0) {
            this.f110084k.startAnimation(translateAnimation3);
        }
        if (this.f110087n.getVisibility() == 0) {
            this.f110087n.startAnimation(translateAnimation3);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m171875a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo154881d();
        return true;
    }

    /* renamed from: a */
    public void mo154876a(List<MailThread> list, List<String> list2, boolean z) {
        Log.m165389i("SearchViewController", "update");
        if (this.f110085l.mo89851h()) {
            this.f110085l.mo89847d();
        }
        final String obj = this.f110079f.getText().toString();
        String str = null;
        if (z) {
            this.f110082i.mo153110a((List<MailThread>) null, "SEARCH", obj, false);
            this.f110097x.mo154871a(null);
            this.f110092s.setVisibility(8);
            this.f110087n.setVisibility(8);
            this.f110084k.setVisibility(0);
            UDEmptyState uDEmptyState = this.f110093t;
            Context context = this.f110074a;
            if (context != null) {
                str = context.getString(R.string.Mail_Common_NetworkError);
            }
            uDEmptyState.setDesc(str);
            this.f110093t.setImageRes(Integer.valueOf((int) R.drawable.illustration_placeholder_common_load_failed));
            this.f110084k.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.mail.impl.search.view.C43263d.View$OnClickListenerC432641 */

                public void onClick(View view) {
                    if (C43263d.this.f110075b != null) {
                        C43263d.this.f110085l.mo89837a();
                        C43263d.this.f110084k.setVisibility(8);
                        C43263d.this.f110075b.mo154812d(obj);
                    }
                }
            });
            C42209j.m168612a("search_error_page", "error_page");
            return;
        }
        this.f110084k.setOnClickListener(null);
        if (TextUtils.isEmpty(obj)) {
            Log.m165389i("SearchViewController", "update history");
            this.f110082i.mo153110a((List<MailThread>) null, "SEARCH", obj, false);
            this.f110097x.mo154871a(list2);
            if (list2 == null || list2.size() == 0) {
                this.f110087n.setVisibility(8);
            } else {
                this.f110087n.setVisibility(0);
            }
            this.f110092s.setVisibility(8);
            this.f110084k.setVisibility(8);
        } else if (CollectionUtils.isEmpty(list)) {
            Log.m165389i("SearchViewController", "update show empty result view");
            this.f110082i.mo153110a((List<MailThread>) null, "SEARCH", obj, false);
            this.f110097x.mo154871a(null);
            this.f110092s.setVisibility(8);
            this.f110084k.setVisibility(0);
            this.f110093t.setDesc(C43819s.m173684a((int) R.string.Mail_Search_NoResultFound).replace("{{keyword}}", obj));
            this.f110093t.setImageRes(Integer.valueOf((int) R.drawable.illustration_placeholder_common_search));
            this.f110087n.setVisibility(8);
        } else {
            Log.m165389i("SearchViewController", "update result list");
            this.f110082i.mo153110a(list, "SEARCH", obj, false);
            this.f110097x.mo154871a(null);
            this.f110092s.setVisibility(0);
            this.f110084k.setVisibility(8);
            this.f110087n.setVisibility(8);
        }
    }
}
