package com.ss.android.lark.contact.feat.mobile.mvp;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.larksuite.framework.mvp.IView;
import com.larksuite.suite.R;
import com.ss.android.lark.contact.entity.api.ContactMobileApi;
import com.ss.android.lark.contact.entity.mobile.ContactMobileBean;
import com.ss.android.lark.contact.entity.mobile.item.ContactMobileItem;
import com.ss.android.lark.contact.entity.mobile.item.ContactMobileSelectedItem;
import com.ss.android.lark.contact.feat.common.C35428b;
import com.ss.android.lark.contact.feat.common.IndexBar;
import com.ss.android.lark.contact.feat.common.MaxLinesRecyclerView;
import com.ss.android.lark.contact.feat.mobile.mvp.C35489e;
import com.ss.android.lark.contact.feat.statistics.ContactMobileHitPoint;
import com.ss.android.lark.inv.export.util.C40129q;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.thirdshare.base.export.p2741c.C55718b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57768af;
import com.ss.android.lark.utils.C57783ah;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class ContactMobileChooseBaseView implements C35489e.AbstractC35491b {

    /* renamed from: a */
    public LinearLayoutManager f91726a;

    /* renamed from: b */
    public C35489e.AbstractC35491b.AbstractC35492a f91727b;

    /* renamed from: c */
    public LinkedHashMap<Integer, String> f91728c;
    public RecyclerView cmContactRv;
    public MaxLinesRecyclerView cmSelectedRv;
    public CommonTitleBar commonTitleBar;

    /* renamed from: d */
    public C35428b f91729d;

    /* renamed from: e */
    public int f91730e;

    /* renamed from: f */
    protected Context f91731f;

    /* renamed from: g */
    protected AbstractC35482a f91732g;

    /* renamed from: h */
    protected ContactMobileApi.AbstractC35403b f91733h;

    /* renamed from: i */
    protected String f91734i;
    public IndexBar indexBar;

    /* renamed from: j */
    protected String f91735j;

    /* renamed from: k */
    protected boolean f91736k;

    /* renamed from: l */
    public C55718b<ContactMobileItem> f91737l;

    /* renamed from: m */
    public List<ContactMobileItem> f91738m = new ArrayList();
    public ImageView mSearchDelIv;

    /* renamed from: n */
    public C55718b<ContactMobileSelectedItem> f91739n;

    /* renamed from: o */
    public ApiUtils.AbstractC57748a<ContactMobileItem> f91740o;

    /* renamed from: p */
    private TextView f91741p;

    /* renamed from: q */
    private Vibrator f91742q;

    /* renamed from: r */
    private List<ContactMobileBean> f91743r;

    /* renamed from: s */
    private C57768af.AbstractRunnableC57773c<Void> f91744s;
    public EditText search;
    public RelativeLayout searchLayout;

    /* renamed from: t */
    private TextWatcher f91745t;

    /* renamed from: u */
    private RecyclerView.OnScrollListener f91746u;

    /* renamed from: v */
    private List<ContactMobileItem> f91747v;

    /* renamed from: w */
    private ContactMobileItem.OnContactsBeanClickListener f91748w;

    /* renamed from: com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView$a */
    public interface AbstractC35482a {
        /* renamed from: a */
        void mo130891a(IView iView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract TextView mo130897a(CommonTitleBar commonTitleBar2, C35489e.AbstractC35491b.AbstractC35492a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo130906c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract ContactMobileApi.C35402a mo130907d();

    @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35491b
    /* renamed from: a */
    public void mo130903a(List<ContactMobileBean> list) {
        this.f91743r = list;
    }

    /* renamed from: a */
    public void mo130904a(boolean z) {
        C35428b bVar;
        RecyclerView recyclerView = this.cmContactRv;
        if (!(recyclerView == null || (bVar = this.f91729d) == null)) {
            if (z) {
                recyclerView.addItemDecoration(bVar);
            } else {
                recyclerView.removeItemDecoration(bVar);
            }
        }
        IndexBar indexBar2 = this.indexBar;
        if (indexBar2 != null) {
            indexBar2.setVisibility(z ? 0 : 8);
        }
        m138769b(z);
    }

    /* renamed from: k */
    private List<ContactMobileSelectedItem> m138772k() {
        return ContactMobileSelectedItem.m138410a(this.f91738m, this.f91740o);
    }

    /* renamed from: j */
    private FlexboxLayoutManager m138771j() {
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.f91731f);
        flexboxLayoutManager.mo72862d(1);
        flexboxLayoutManager.mo72861c(0);
        flexboxLayoutManager.mo72864f(4);
        flexboxLayoutManager.mo72863e(0);
        return flexboxLayoutManager;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        this.cmContactRv.removeOnScrollListener(this.f91746u);
        C57768af.AbstractRunnableC57773c<Void> cVar = this.f91744s;
        if (cVar != null) {
            cVar.mo196077c();
            this.f91744s = null;
        }
        this.search.removeTextChangedListener(this.f91745t);
    }

    /* renamed from: f */
    public Vibrator mo130909f() {
        if (this.f91742q == null) {
            this.f91742q = (Vibrator) aj.m224263a().getSystemService("vibrator");
        }
        return this.f91742q;
    }

    /* renamed from: i */
    private void m138770i() {
        this.cmSelectedRv.setMaxLines(3);
        this.cmSelectedRv.setOnHeightChangedListener(new MaxLinesRecyclerView.AbstractC35426a() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354796 */

            @Override // com.ss.android.lark.contact.feat.common.MaxLinesRecyclerView.AbstractC35426a
            /* renamed from: a */
            public void mo130750a(int i, int i2) {
                ContactMobileChooseBaseView.this.mo130900a(i, i2);
            }
        });
        this.cmSelectedRv.setLayoutManager(m138771j());
        this.f91739n = new C55718b<>();
        this.f91740o = new ApiUtils.AbstractC57748a() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.$$Lambda$ContactMobileChooseBaseView$5GDpdnUFlwa6YDPewOxKKf4GeiA */

            @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
            public final void consume(Object obj) {
                ContactMobileChooseBaseView.lambda$5GDpdnUFlwa6YDPewOxKKf4GeiA(ContactMobileChooseBaseView.this, (ContactMobileItem) obj);
            }
        };
        this.f91739n.mo189862a(m138772k());
        this.cmSelectedRv.setAdapter(this.f91739n);
    }

    /* renamed from: m */
    private void m138774m() {
        List<ContactMobileBean> list = this.f91743r;
        if (list != null && !list.isEmpty()) {
            ContactMobileApi.C35405d dVar = new ContactMobileApi.C35405d();
            dVar.mo130585a(this.f91737l.mo189857a());
            C57783ah.m224245a().mo196093a(ContactMobileApi.C35405d.UiMessageContactMobileUpdateItem, dVar);
        }
    }

    /* renamed from: b */
    public void mo130905b() {
        int i;
        CommonTitleBar commonTitleBar2 = this.commonTitleBar;
        if (this.f91736k) {
            i = CommonTitleBarConstants.ICON_CLOSE;
        } else {
            i = CommonTitleBarConstants.ICON_BACK;
        }
        commonTitleBar2.setLeftImageResource(i);
        this.searchLayout.setVisibility(0);
        this.f91741p = mo130897a(this.commonTitleBar, this.f91727b);
        m138770i();
        m138773l();
        this.indexBar.setNavigators(new ArrayList(this.f91728c.values()));
    }

    /* renamed from: e */
    public void mo130908e() {
        C354763 r0 = new TextWatcher() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354763 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                boolean z;
                boolean isEmpty = TextUtils.isEmpty(editable.toString());
                ContactMobileChooseBaseView.this.mo130904a(isEmpty);
                if (ContactMobileChooseBaseView.this.f91737l != null) {
                    ContactMobileChooseBaseView.this.f91737l.mo189862a(ContactMobileChooseBaseView.this.mo130898a(editable.toString()));
                    ContactMobileChooseBaseView.this.f91737l.notifyDataSetChanged();
                    ContactMobileHitPoint.m138536d();
                    if (!isEmpty) {
                        if (ContactMobileChooseBaseView.this.f91730e > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ContactMobileHitPoint.m138533b(z);
                    }
                }
            }
        };
        this.f91745t = r0;
        this.search.addTextChangedListener(r0);
        this.search.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.$$Lambda$ContactMobileChooseBaseView$WXIVi91BUskmd9YaabvzXuz6wyI */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return ContactMobileChooseBaseView.lambda$WXIVi91BUskmd9YaabvzXuz6wyI(ContactMobileChooseBaseView.this, textView, i, keyEvent);
            }
        });
        C354774 r02 = new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354774 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                ContactMobileChooseBaseView.this.search.clearFocus();
                C40129q.m159107a(ViewUtils.m224142a(recyclerView));
                if (ContactMobileChooseBaseView.this.f91729d != null) {
                    ContactMobileChooseBaseView.this.indexBar.setFocusIndex(ContactMobileChooseBaseView.this.f91729d.mo130756a());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ContactMobileChooseBaseView.this.f91729d != null) {
                    C53241h.m205899c("ContactMobileChooseBaseView", "floatingBarItemDecoration.getCurrentDrawPosition():" + ContactMobileChooseBaseView.this.f91729d.mo130756a());
                }
            }
        };
        this.f91746u = r02;
        this.cmContactRv.addOnScrollListener(r02);
        this.indexBar.setOnTouchingLetterChangedListener(new IndexBar.AbstractC35425a() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354785 */

            @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
            /* renamed from: b */
            public void mo130746b(String str) {
                ContactMobileChooseBaseView.this.mo130909f().vibrate(10);
            }

            @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
            /* renamed from: c */
            public void mo130747c(String str) {
                if ("invite_member".equals(ContactMobileChooseBaseView.this.f91734i)) {
                    ContactMobileHitPoint.m138532b();
                }
                if ("invite_external".equals(ContactMobileChooseBaseView.this.f91734i)) {
                    ContactMobileHitPoint.m138530a();
                }
            }

            @Override // com.ss.android.lark.contact.feat.common.IndexBar.AbstractC35425a
            /* renamed from: a */
            public void mo130745a(String str) {
                ContactMobileChooseBaseView.this.mo130909f().vibrate(10);
                for (Integer num : ContactMobileChooseBaseView.this.f91728c.keySet()) {
                    if (ContactMobileChooseBaseView.this.f91728c.get(num).equals(str)) {
                        ContactMobileChooseBaseView.this.f91726a.scrollToPositionWithOffset(num.intValue(), 0);
                        return;
                    }
                }
            }
        });
    }

    /* renamed from: g */
    public List<ContactMobileBean> mo130910g() {
        ArrayList arrayList = new ArrayList();
        for (ContactMobileItem aVar : this.f91738m) {
            if (aVar.f91461a != null) {
                arrayList.add(aVar.f91461a);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private void m138773l() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f91731f);
        this.f91726a = linearLayoutManager;
        this.cmContactRv.setLayoutManager(linearLayoutManager);
        Context context = this.f91731f;
        C35428b bVar = new C35428b(context, this.f91728c, context.getResources().getDimensionPixelOffset(mo130906c()));
        this.f91729d = bVar;
        this.cmContactRv.addItemDecoration(bVar);
        this.f91737l = new C55718b<>();
        this.f91748w = new ContactMobileItem.OnContactsBeanClickListener() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354818 */

            @Override // com.ss.android.lark.contact.entity.mobile.item.ContactMobileItem.OnContactsBeanClickListener
            /* renamed from: a */
            public void mo130635a(ContactMobileItem aVar) {
                if (aVar.f91461a != null) {
                    ContactMobileChooseBaseView.this.f91727b.mo130926a(aVar.f91461a);
                }
            }

            @Override // com.ss.android.lark.contact.entity.mobile.item.ContactMobileItem.OnContactsBeanClickListener
            /* renamed from: a */
            public void mo130636a(ContactMobileItem aVar, View view, boolean z) {
                if (ContactMobileChooseBaseView.this.f91738m.contains(aVar)) {
                    if (!z) {
                        ContactMobileHitPoint.m138539g();
                        int indexOf = ContactMobileChooseBaseView.this.f91738m.indexOf(aVar);
                        ContactMobileChooseBaseView.this.f91738m.remove(aVar);
                        ContactMobileChooseBaseView.this.f91739n.mo189855a(indexOf, true);
                    } else {
                        C53241h.m205900d("ContactMobileChooseBaseView", "contactMobileSelectedBeans status is wrong.");
                    }
                } else if (z) {
                    ContactMobileHitPoint.m138537e();
                    ContactMobileChooseBaseView.this.f91738m.add(aVar);
                    ContactMobileChooseBaseView.this.f91739n.mo189858a(new ContactMobileSelectedItem(aVar, ContactMobileChooseBaseView.this.f91740o), true);
                    ContactMobileChooseBaseView.this.cmSelectedRv.smoothScrollToPosition(ContactMobileChooseBaseView.this.f91738m.size() - 1);
                } else {
                    C53241h.m205900d("ContactMobileChooseBaseView", "contactMobileSelectedBeans status is wrong.");
                }
                ContactMobileChooseBaseView.this.mo130911h();
                ContactMobileHitPoint.m138535c(z);
            }
        };
        List<ContactMobileItem> a = ContactMobileItem.m138396a(this.f91743r, mo130907d(), this.f91748w, this.f91738m);
        this.f91747v = a;
        this.f91737l.mo189862a(a);
        this.cmContactRv.setAdapter(this.f91737l);
        m138774m();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC35482a aVar = this.f91732g;
        if (aVar != null) {
            aVar.mo130891a(this);
        }
        this.commonTitleBar.setTitle(UIHelper.getString(R.string.Lark_UserGrowth_InviteMemberImportContactsTitle));
        this.commonTitleBar.getLeftText().setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.$$Lambda$ContactMobileChooseBaseView$omqS5AdssljtSV1M5JcYdYPw_ro */

            public final void onClick(View view) {
                ContactMobileChooseBaseView.lambda$omqS5AdssljtSV1M5JcYdYPw_ro(ContactMobileChooseBaseView.this, view);
            }
        });
        this.searchLayout.setVisibility(4);
        final long currentTimeMillis = System.currentTimeMillis();
        C57768af.AbstractRunnableC57773c<Void> a = new C57768af.AbstractRunnableC57773c<Void>() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354752 */

            /* renamed from: a */
            public Void mo130916b() {
                ContactMobileChooseBaseView.this.f91727b.mo130925a();
                return null;
            }

            /* renamed from: a */
            public void mo130914a(Void r5) {
                ContactMobileChooseBaseView.this.mo130905b();
                ContactMobileChooseBaseView.this.mo130908e();
                ContactMobileChooseBaseView.this.mo130899a();
                if (ContactMobileChooseBaseView.this.f91733h != null) {
                    ContactMobileChooseBaseView.this.f91733h.mo130580a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }.mo196075a((Runnable) new Runnable() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.RunnableC354741 */

            public void run() {
                Activity a = ViewUtils.m224141a(ContactMobileChooseBaseView.this.f91731f);
                if (a != null) {
                    a.finish();
                }
            }
        });
        this.f91744s = a;
        C57768af.m224218a(this.f91731f, a);
    }

    /* renamed from: h */
    public void mo130911h() {
        if (this.f91741p != null) {
            if (this.f91738m.size() == 0) {
                this.f91741p.setEnabled(false);
                this.f91741p.setText(this.f91735j);
                this.f91741p.setTextColor(UIHelper.getColor(R.color.primary_pri_300));
                return;
            }
            if (!this.f91741p.isEnabled()) {
                this.f91741p.setEnabled(true);
                this.f91741p.setTextColor(UIHelper.getColor(R.color.primary_pri_500));
            }
            TextView textView = this.f91741p;
            textView.setText(this.f91735j + "(" + this.f91738m.size() + ")");
            this.search.clearFocus();
            C40129q.m159107a(ViewUtils.m224141a(this.f91731f));
        }
    }

    /* renamed from: a */
    public void mo130899a() {
        C40129q.m159108a((Activity) this.f91731f, new C40129q.AbstractC40131a() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.$$Lambda$ContactMobileChooseBaseView$glOWABMgYPJwhQvyD8l_1CTj0 */

            @Override // com.ss.android.lark.inv.export.util.C40129q.AbstractC40131a
            public final void onSoftInputChanged(int i) {
                ContactMobileChooseBaseView.m270483lambda$glOWABMgYPJwhQvyD8l_1CTj0(ContactMobileChooseBaseView.this, i);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C35489e.AbstractC35491b.AbstractC35492a aVar) {
        this.f91727b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m138764a(int i) {
        if (i < 400) {
            this.search.clearFocus();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m138768b(View view) {
        this.search.setText("");
        this.mSearchDelIv.setVisibility(8);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m138765a(View view) {
        ContactMobileApi.AbstractC35403b bVar = this.f91733h;
        if (bVar != null) {
            bVar.mo130581a(mo130910g());
        }
    }

    /* renamed from: b */
    private void m138769b(boolean z) {
        if (z) {
            this.mSearchDelIv.setVisibility(8);
            return;
        }
        this.mSearchDelIv.setVisibility(0);
        this.mSearchDelIv.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.$$Lambda$ContactMobileChooseBaseView$Ht768Zf1OWMZzv6B24Ekm_2s_w */

            public final void onClick(View view) {
                ContactMobileChooseBaseView.m270482lambda$Ht768Zf1OWMZzv6B24Ekm_2s_w(ContactMobileChooseBaseView.this, view);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m138766a(ContactMobileItem aVar) {
        this.f91738m.remove(aVar);
        mo130911h();
        aVar.mo130632a(false);
        ContactMobileHitPoint.m138534c();
    }

    /* renamed from: a */
    public List<ContactMobileItem> mo130898a(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.f91747v;
        }
        ArrayList arrayList = new ArrayList();
        for (ContactMobileItem aVar : this.f91747v) {
            if (aVar.f91461a != null && aVar.f91461a.isMatch(str)) {
                arrayList.add(aVar);
            }
        }
        this.f91730e = arrayList.size();
        if (arrayList.isEmpty()) {
            arrayList.add(new ContactMobileItem());
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.contact.feat.mobile.mvp.C35489e.AbstractC35491b
    /* renamed from: a */
    public void mo130902a(LinkedHashMap<Integer, String> linkedHashMap) {
        this.f91728c = linkedHashMap;
    }

    /* renamed from: a */
    public void mo130900a(int i, int i2) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(300L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class com.ss.android.lark.contact.feat.mobile.mvp.ContactMobileChooseBaseView.C354807 */

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ContactMobileChooseBaseView.this.cmContactRv.getLayoutParams();
                layoutParams.topMargin = intValue + UIHelper.dp2px(16.0f);
                ContactMobileChooseBaseView.this.cmContactRv.setLayoutParams(layoutParams);
            }
        });
        duration.start();
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m138767a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        this.search.clearFocus();
        C40129q.m159107a(ViewUtils.m224142a(textView));
        return true;
    }

    public ContactMobileChooseBaseView(Context context, AbstractC35482a aVar, ContactMobileApi.AbstractC35403b bVar, String str) {
        this.f91731f = context;
        this.f91732g = aVar;
        this.f91733h = bVar;
        this.f91734i = str;
    }
}
