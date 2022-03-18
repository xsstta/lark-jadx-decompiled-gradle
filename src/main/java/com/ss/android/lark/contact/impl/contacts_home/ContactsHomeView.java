package com.ss.android.lark.contact.impl.contacts_home;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.C26034b;
import com.larksuite.framework.ui.StableLinearLayoutManager;
import com.larksuite.framework.ui.p1198b.C26198f;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.AbstractC29565l;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f;
import com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter;
import com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView;
import com.ss.android.lark.contact.impl.p1747b.C35502b;
import com.ss.android.lark.contact.impl.statistics.ContactHitPoint;
import com.ss.android.lark.contact.impl.viewdata.C36077a;
import com.ss.android.lark.contact.impl.viewdata.ContactViewDataWrapper;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.ui.C57580a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.lark.utils.C57820d;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.DuplicateEnterChecker;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarTipsView;
import com.ss.android.lark.widget.quick_sidebar.QuickSideBarView;
import com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ContactsHomeView extends C26034b<AbstractC35680f.AbstractC35683b.AbstractC35684a> implements AbstractC35680f.AbstractC35683b {

    /* renamed from: A */
    private ImageView f92177A;

    /* renamed from: B */
    private float f92178B;

    /* renamed from: C */
    private float f92179C;

    /* renamed from: D */
    private float f92180D;

    /* renamed from: E */
    private boolean f92181E;

    /* renamed from: a */
    AbstractC44545b f92182a;

    /* renamed from: b */
    public AbstractC35680f.AbstractC35683b.AbstractC35684a f92183b;

    /* renamed from: c */
    public AbstractC35659a f92184c;

    /* renamed from: d */
    public Activity f92185d;

    /* renamed from: e */
    public FrameLayout f92186e;

    /* renamed from: f */
    public int f92187f;

    /* renamed from: g */
    public C35678d f92188g = new C35678d();

    /* renamed from: h */
    public Boolean f92189h;

    /* renamed from: i */
    public int f92190i;

    /* renamed from: j */
    public ITitleController f92191j;

    /* renamed from: k */
    public ITitleController.Style f92192k;

    /* renamed from: l */
    public C35502b f92193l;

    /* renamed from: m */
    AbstractC58955a f92194m = new AbstractC58955a() {
        /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356471 */

        @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
        /* renamed from: a */
        public void mo131379a(boolean z) {
            int i;
            QuickSideBarTipsView quickSideBarTipsView = ContactsHomeView.this.mQuickSideBarTipView;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            quickSideBarTipsView.setVisibility(i);
        }

        @Override // com.ss.android.lark.widget.quick_sidebar.p2963a.AbstractC58955a
        /* renamed from: a */
        public void mo131378a(String str, int i, float f) {
            ContactsHomeView.this.mQuickSideBarTipView.mo200024a(str, i, f - ((float) UIUtils.dp2px(ContactsHomeView.this.f92185d, 40.0f)));
            if (ContactsHomeView.this.f92193l.mo130934a().containsKey(str)) {
                ((LinearLayoutManager) ContactsHomeView.this.mDepartmentListRV.getLayoutManager()).scrollToPositionWithOffset(ContactsHomeView.this.f92193l.mo130934a().get(str).intValue(), 0);
            }
        }
    };
    CommonRecyclerView mDepartmentListRV;
    ImageView mInviterNewMember;
    View mQuickSideBarCover;
    QuickSideBarTipsView mQuickSideBarTipView;
    QuickSideBarView mQuickSideBarView;
    CommonTitleBar mTitleBar;
    TextView mTitleTV;
    View mTitleTvContainer;

    /* renamed from: n */
    public boolean f92195n;

    /* renamed from: o */
    public boolean f92196o;

    /* renamed from: p */
    public boolean f92197p;

    /* renamed from: q */
    private final float f92198q = 0.42307693f;

    /* renamed from: r */
    private final float f92199r = 0.5769231f;

    /* renamed from: s */
    private final float f92200s = 1.0f;

    /* renamed from: t */
    private final float f92201t = 370.5f;

    /* renamed from: u */
    private final float f92202u = 67.0f;

    /* renamed from: v */
    private final float f92203v = 44.0f;

    /* renamed from: w */
    private final float f92204w = 104.0f;

    /* renamed from: x */
    private Fragment f92205x;

    /* renamed from: y */
    private List<ContactViewDataWrapper> f92206y = new ArrayList();

    /* renamed from: z */
    private ContactsHomeAdapter f92207z;

    /* renamed from: com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView$a */
    public interface AbstractC35659a {
        /* renamed from: a */
        void mo131386a();

        /* renamed from: a */
        void mo131387a(Bitmap bitmap);

        /* renamed from: a */
        void mo131388a(Chatter chatter);

        /* renamed from: a */
        void mo131389a(ContactsHomeView contactsHomeView);

        /* renamed from: a */
        void mo131390a(String str);

        /* renamed from: a */
        void mo131391a(String str, String str2);

        /* renamed from: b */
        void mo131392b();

        /* renamed from: c */
        void mo131393c();

        /* renamed from: d */
        void mo131394d();

        /* renamed from: e */
        void mo131395e();

        /* renamed from: f */
        void mo131396f();

        /* renamed from: g */
        void mo131397g();

        /* renamed from: h */
        void mo131398h();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: b */
    public void mo131364b() {
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: d */
    public void mo131370d() {
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: f */
    public ITitleInfo mo131372f() {
        return this.f92188g;
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131363a(boolean z) {
        if (this.f92195n) {
            this.mTitleBar.setVisibility(8);
            this.mTitleTV.setVisibility(8);
            this.f92191j.mo99194b(false);
            this.f92188g.mo131443a(false);
            return;
        }
        if (this.f92192k == ITitleController.Style.Old) {
            this.f92206y.add(new ContactViewDataWrapper(0, null));
        }
        this.f92206y.add(new ContactViewDataWrapper(5, null));
        this.f92206y.add(new ContactViewDataWrapper(1, null));
        this.f92207z.diff(this.f92206y);
        this.f92207z.mo131329a(new AbstractC29565l.AbstractC29567b() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356578 */

            @Override // com.ss.android.lark.biz.core.api.AbstractC29565l.AbstractC29567b
            public void onReady() {
                ContactsHomeView contactsHomeView = ContactsHomeView.this;
                contactsHomeView.f92190i = contactsHomeView.mo131373g();
                ContactsHomeView.this.mo131376j();
            }
        });
        if (z) {
            this.mQuickSideBarView.setOnQuickSideBarTouchListener(this.f92194m);
        } else {
            this.mQuickSideBarView.setOnQuickSideBarTouchListener(null);
        }
        if (!z) {
            this.f92197p = true;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131362a(Set<String> set) {
        if (!CollectionUtils.isEmpty(set)) {
            for (ContactViewDataWrapper contactViewDataWrapper : this.f92206y) {
                if (contactViewDataWrapper.getType() == 2) {
                    contactViewDataWrapper.getViewData().f93253k = !set.contains(contactViewDataWrapper.getViewData().f93246d);
                }
            }
            this.f92207z.resetAll(this.f92206y);
        }
    }

    /* renamed from: m */
    private void m139519m() {
        this.f92193l.mo130933a(this.f92206y);
    }

    /* renamed from: g */
    public int mo131373g() {
        return this.f92207z.mo131328a();
    }

    /* renamed from: n */
    private void m139520n() {
        m139523q();
        m139522p();
        m139524r();
        m139521o();
    }

    /* renamed from: o */
    private void m139521o() {
        this.mInviterNewMember.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass11 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ContactsHomeView.this.mo131374h();
            }
        });
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        AbstractC35659a aVar = this.f92184c;
        if (aVar != null) {
            aVar.mo131389a(this);
        }
        m139520n();
    }

    @Override // com.larksuite.framework.mvp.C26034b, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
        this.f92183b = null;
        this.f92184c = null;
    }

    /* renamed from: j */
    public void mo131376j() {
        if (this.f92190i > 0) {
            m139514a(m139525s());
        }
    }

    /* renamed from: l */
    private boolean m139518l() {
        List<ContactViewDataWrapper> list = this.f92206y;
        if (list == null || list.get(list.size() - 1).getType() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private void m139524r() {
        FrameLayout frameLayout = (FrameLayout) this.f92185d.findViewById(16908290);
        this.f92186e = frameLayout;
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.ViewTreeObserver$OnGlobalLayoutListenerC356567 */

            public void onGlobalLayout() {
                ContactsHomeView.this.f92186e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (ContactsHomeView.this.f92192k != ITitleController.Style.Old) {
                    return;
                }
                if (ContactsHomeView.this.f92190i != 3) {
                    ContactsHomeView.this.mo131376j();
                } else if (ContactsHomeView.this.f92189h == null) {
                    ContactsHomeView contactsHomeView = ContactsHomeView.this;
                    contactsHomeView.f92189h = Boolean.valueOf(C57764ab.m224186a(contactsHomeView.f92185d));
                } else {
                    boolean a = C57764ab.m224186a(ContactsHomeView.this.f92185d);
                    if (a != ContactsHomeView.this.f92189h.booleanValue()) {
                        ContactsHomeView.this.f92187f = 0;
                        ContactsHomeView.this.mo131376j();
                        ContactsHomeView contactsHomeView2 = ContactsHomeView.this;
                        contactsHomeView2.mo131356a(contactsHomeView2.mTitleTV, 1.0f);
                        int a2 = C57764ab.m224185a((Context) ContactsHomeView.this.f92185d);
                        if (a) {
                            a2 = -a2;
                        }
                        ContactsHomeView.this.mDepartmentListRV.scrollBy(0, a2);
                    }
                    ContactsHomeView.this.f92189h = Boolean.valueOf(a);
                }
            }
        });
    }

    /* renamed from: t */
    private void m139526t() {
        this.mQuickSideBarView.setVisibility(8);
        this.mQuickSideBarCover.setVisibility(8);
        this.mQuickSideBarTipView.setVisibility(8);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: e */
    public void mo131371e() {
        this.f92206y.add(new ContactViewDataWrapper(3, null));
        this.f92207z.diff(this.f92206y);
        this.f92197p = true;
    }

    /* renamed from: h */
    public void mo131374h() {
        if (C35358a.m138143a().mo130158e().mo130219b()) {
            ContactHitPoint.m140795c("contacts_tab_invite");
            C35358a.m138143a().mo130158e().mo130221c(this.f92185d);
        } else {
            C35358a.m138143a().mo130158e().mo130214a((Context) this.f92185d, "contact");
        }
        ContactHitPoint.m140803g();
    }

    /* renamed from: s */
    private float m139525s() {
        int screenHeight = DeviceUtils.getScreenHeight(this.f92185d);
        int statusBarHeight = StatusBarUtil.getStatusBarHeight(this.f92185d);
        int a = C57764ab.m224185a((Context) this.f92185d);
        boolean a2 = C57764ab.m224186a(this.f92185d);
        float dp2px = (float) (UIUtils.dp2px(this.f92185d, 370.5f) + (this.f92190i * UIUtils.dp2px(this.f92185d, 67.0f)));
        int i = screenHeight - statusBarHeight;
        if (!a2) {
            a = -a;
        }
        return dp2px - ((float) ((i - a) - UIUtils.dp2px(this.f92185d, 44.0f)));
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131354a() {
        ITitleController.Style b = this.f92191j.mo99193b();
        this.f92192k = b;
        if (b == ITitleController.Style.New) {
            this.f92188g = new C35678d();
        } else {
            this.f92188g = null;
        }
        m139523q();
        this.f92206y.clear();
        this.f92207z.diff(this.f92206y);
        m139519m();
        this.mQuickSideBarView.setVisibility(8);
    }

    /* renamed from: i */
    public Bitmap mo131375i() {
        View view;
        if (this.f92192k != ITitleController.Style.Old) {
            return this.f92191j.mo99195c();
        }
        if (this.mTitleTV.getVisibility() == 0) {
            view = this.mTitleTV;
        } else {
            view = this.mTitleBar;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), UIHelper.getDimens(R.dimen.feed_title_height), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        view.draw(canvas);
        return C57820d.m224429a(createBitmap, (int) ParticipantRepo.f117150c);
    }

    /* renamed from: k */
    public void mo131377k() {
        if (this.f92192k == ITitleController.Style.Old) {
            int i = this.f92187f;
            if (i <= 0) {
                mo131356a(this.mTitleTV, 1.0f);
            } else if (((float) i) <= this.f92180D) {
                float f = this.f92178B;
                if (((float) i) <= f) {
                    mo131356a(this.mTitleTV, 1.0f - (((float) i) / f));
                }
                int i2 = this.f92187f;
                if (((float) i2) > this.f92178B && ((float) i2) < this.f92179C) {
                    this.mTitleBar.setVisibility(8);
                    this.mTitleTV.setVisibility(8);
                }
                int i3 = this.f92187f;
                float f2 = this.f92179C;
                if (((float) i3) >= f2) {
                    mo131356a(this.mTitleBar, (((float) i3) - f2) / (this.f92180D - f2));
                }
            } else {
                mo131356a(this.mTitleBar, 1.0f);
            }
        }
    }

    /* renamed from: p */
    private void m139522p() {
        this.mDepartmentListRV.setLayoutManager(new StableLinearLayoutManager(this.f92185d, 1, false));
        this.mDepartmentListRV.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass12 */

            public boolean onPreDraw() {
                if (!ContactsHomeView.this.f92197p) {
                    return true;
                }
                ContactsHomeView.this.mDepartmentListRV.getViewTreeObserver().removeOnPreDrawListener(this);
                C35358a.m138143a().mo130159e("contact");
                return true;
            }
        });
        ContactsHomeAdapter contactsHomeAdapter = new ContactsHomeAdapter(this.f92205x, this.f92196o, this.f92181E);
        this.f92207z = contactsHomeAdapter;
        contactsHomeAdapter.mo131331a(new ContactsHomeAdapter.AbstractC35643b() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass13 */

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: b */
            public void mo131343b() {
                ContactsHomeView.this.f92184c.mo131397g();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: c */
            public void mo131344c() {
                ContactsHomeView.this.f92184c.mo131396f();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: d */
            public void mo131345d() {
                ContactsHomeView.this.f92184c.mo131395e();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: e */
            public void mo131346e() {
                ContactsHomeView.this.f92184c.mo131386a();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: f */
            public void mo131347f() {
                ContactsHomeView.this.f92184c.mo131392b();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: g */
            public void mo131348g() {
                ContactsHomeView.this.f92184c.mo131393c();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: h */
            public void mo131349h() {
                ContactsHomeView.this.f92184c.mo131394d();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: i */
            public void mo131350i() {
                ContactsHomeView.this.f92184c.mo131398h();
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35643b
            /* renamed from: a */
            public void mo131342a() {
                ContactsHomeView.this.f92184c.mo131387a(ContactsHomeView.this.mo131375i());
            }
        });
        this.f92207z.mo131332a(new ContactsHomeAdapter.AbstractC35644c() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass14 */

            /* renamed from: a */
            DuplicateEnterChecker f92219a = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35644c
            /* renamed from: a */
            public void mo131351a(String str) {
                if (!this.f92219a.mo198450a()) {
                    ContactsHomeView.this.f92184c.mo131390a(str);
                }
            }
        });
        this.f92207z.mo131333a(new ContactsHomeAdapter.AbstractC35645d() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass15 */

            /* renamed from: a */
            DuplicateEnterChecker f92221a = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35645d
            /* renamed from: a */
            public void mo131352a(String str, String str2) {
                if (!this.f92221a.mo198450a()) {
                    ContactsHomeView.this.f92184c.mo131391a(str, str2);
                }
            }
        });
        this.f92207z.mo131330a(new ContactsHomeAdapter.AbstractC35642a() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356512 */

            /* renamed from: a */
            DuplicateEnterChecker f92223a = new DuplicateEnterChecker();

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35642a
            /* renamed from: a */
            public void mo131340a(C36077a aVar) {
                ContactsHomeView.this.mo131368c(aVar);
            }

            @Override // com.ss.android.lark.contact.impl.contacts_home.ContactsHomeAdapter.AbstractC35642a
            /* renamed from: a */
            public void mo131341a(String str, boolean z) {
                if (ContactsHomeView.this.f92196o) {
                    ContactsHomeView.this.f92183b.mo131438a(str, z);
                } else if (!this.f92223a.mo198450a()) {
                    ContactsHomeView.this.f92183b.mo131437a(str);
                }
            }
        });
        this.f92207z.setHasStableIds(true);
        HashMap hashMap = new HashMap();
        hashMap.put("biz", Integer.valueOf(Biz.Messenger.getValue()));
        hashMap.put("scene", Integer.valueOf(Scene.Contact.getValue()));
        this.mDepartmentListRV.mo200036a(hashMap);
        this.mDepartmentListRV.setAdapter(this.f92207z);
        this.mDepartmentListRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356523 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                ContactsHomeView.this.f92187f += i2;
                if (!ContactsHomeView.this.f92195n) {
                    ContactsHomeView.this.mo131377k();
                }
            }
        });
        this.mDepartmentListRV.addItemDecoration(new C26198f(this.f92207z));
    }

    /* renamed from: q */
    private void m139523q() {
        int i = 0;
        if (this.f92192k == ITitleController.Style.Old) {
            if (DesktopUtil.m144307b()) {
                this.mTitleBar.setLeftVisible(true);
                this.mTitleBar.getLeftText().setText(R.string.Lark_Contacts_Contacts);
                this.mTitleBar.getLeftText().setTextColor(UIUtils.getColor(this.f92185d, R.color.text_title));
                this.mTitleBar.setLeftImageDrawable(null);
                this.mTitleBar.getCenterLayout().setVisibility(8);
                this.mTitleBar.setLeftClickListener(null);
                this.mTitleTV.setTextSize((float) CommonTitleBarConstants.DEFAULT_MAIN_TEXT_SIZE);
                this.mTitleTV.setTypeface(Typeface.DEFAULT);
                this.mTitleTvContainer.setMinimumHeight(this.f92185d.getResources().getDimensionPixelSize(R.dimen.title_height));
                this.mTitleTV.setPadding(C57580a.m223594a(), 0, 0, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mTitleTV.getLayoutParams();
                layoutParams.addRule(13);
                this.mTitleTV.setLayoutParams(layoutParams);
                ImageView imageView = this.mInviterNewMember;
                imageView.setPadding(0, 0, imageView.getPaddingRight(), 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.mInviterNewMember.getLayoutParams();
                layoutParams2.addRule(13);
                this.mInviterNewMember.setImageResource(R.drawable.ic_svg_more_add_friend);
                this.mInviterNewMember.setImageTintList(C0215a.m652a(this.f92185d, R.color.icon_n1));
                this.mInviterNewMember.setLayoutParams(layoutParams2);
            } else {
                this.mTitleBar.setMainTitleColor(UIUtils.getColor(this.f92185d, R.color.text_title));
                this.mTitleBar.setLeftTextColor(UIUtils.getColor(this.f92185d, R.color.text_title));
                this.mTitleBar.setLeftVisible(false);
                this.mTitleBar.setDividerVisible(false);
                C35678d dVar = this.f92188g;
                if (dVar != null) {
                    dVar.mo131443a(false);
                }
                this.mTitleBar.setHeight(UIHelper.getDimens(R.dimen.feed_title_height));
            }
            this.mTitleBar.setRightImage(this.f92185d.getResources().getDrawable(R.drawable.icon_top_navigation_search_entrance));
            ImageView imageView2 = (ImageView) this.mTitleBar.getRightView(0);
            this.f92177A = imageView2;
            imageView2.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356534 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    if (((double) ContactsHomeView.this.mTitleBar.getAlpha()) >= 0.8d) {
                        ContactsHomeView.this.f92184c.mo131387a(ContactsHomeView.this.mo131375i());
                    }
                }
            });
        } else {
            final ImageView imageView3 = new ImageView(this.f92185d);
            imageView3.setImageResource(R.drawable.icon_top_navigation_search_entrance);
            imageView3.setImageTintList(C0215a.m652a(this.f92185d, R.color.icon_n1));
            imageView3.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356545 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ContactsHomeView.this.f92184c.mo131387a(ContactsHomeView.this.mo131375i());
                }
            });
            this.f92188g.mo131442a(new AbstractC44545b() {
                /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356556 */

                @Override // com.ss.android.lark.maincore.AbstractC44545b
                public View getContentView() {
                    return imageView3;
                }
            });
            this.f92188g.mo131443a(true);
            this.f92191j.mo99191a(this.f92188g);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mDepartmentListRV.getLayoutParams();
        if (this.f92192k == ITitleController.Style.New) {
            i = this.f92191j.mo99189a();
        }
        marginLayoutParams.topMargin = i;
        this.mDepartmentListRV.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC35680f.AbstractC35683b.AbstractC35684a aVar) {
        this.f92183b = aVar;
    }

    /* renamed from: c */
    private void m139516c(List<ContactViewDataWrapper> list) {
        Collections.sort(list, new Comparator<ContactViewDataWrapper>() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.C356589 */

            /* renamed from: a */
            public int compare(ContactViewDataWrapper contactViewDataWrapper, ContactViewDataWrapper contactViewDataWrapper2) {
                int type = contactViewDataWrapper.getType();
                int type2 = contactViewDataWrapper2.getType();
                if (type != 2 || type2 != 2) {
                    return type - type2;
                }
                return contactViewDataWrapper.getViewData().f93249g.compareTo(contactViewDataWrapper2.getViewData().f93249g);
            }
        });
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131355a(int i) {
        this.f92207z.mo131335b(i);
    }

    /* renamed from: d */
    private void m139517d(List<ContactViewDataWrapper> list) {
        this.mQuickSideBarView.setLetters(this.f92193l.mo130933a(list));
        this.mQuickSideBarView.setVisibility(0);
        this.mQuickSideBarCover.setVisibility(8);
        this.mQuickSideBarTipView.setVisibility(8);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131357a(Chatter chatter) {
        this.f92184c.mo131388a(chatter);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: b */
    public void mo131367b(final boolean z) {
        if (this.f92196o) {
            z = false;
        }
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass10 */

            public void run() {
                int i;
                if (ContactsHomeView.this.f92192k == ITitleController.Style.Old) {
                    ImageView imageView = ContactsHomeView.this.mInviterNewMember;
                    if (z) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    imageView.setVisibility(i);
                    return;
                }
                if (ContactsHomeView.this.f92182a == null) {
                    final ImageView imageView2 = new ImageView(ContactsHomeView.this.f92185d);
                    imageView2.setImageResource(R.drawable.contact_inviter_new_member_add);
                    imageView2.setImageTintList(C0215a.m652a(ContactsHomeView.this.f92185d, R.color.icon_n1));
                    imageView2.setOnClickListener(new OnSingleClickListener() {
                        /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass10.C356481 */

                        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                        public void onSingleClick(View view) {
                            ContactsHomeView.this.mo131374h();
                        }
                    });
                    ContactsHomeView.this.f92182a = new AbstractC44545b() {
                        /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass10.C356492 */

                        @Override // com.ss.android.lark.maincore.AbstractC44545b
                        public View getContentView() {
                            return imageView2;
                        }
                    };
                    imageView2.post(new Runnable() {
                        /* class com.ss.android.lark.contact.impl.contacts_home.ContactsHomeView.AnonymousClass10.RunnableC356503 */

                        public void run() {
                            if (ContactsHomeView.this.f92185d != null) {
                                C35358a.m138143a().mo130173r().mo130210a(ContactsHomeView.this.f92185d, imageView2, new View.OnClickListener() {
                                    /* class com.ss.android.lark.contact.impl.contacts_home.$$Lambda$ContactsHomeView$10$3$SCq3RUpm2fYuoY5HCp5zv0QZQt4 */

                                    public final void onClick(View view) {
                                        ContactsHomeView.AnonymousClass10.RunnableC356503.lambda$SCq3RUpm2fYuoY5HCp5zv0QZQt4(ContactsHomeView.AnonymousClass10.RunnableC356503.this, view);
                                    }
                                });
                            }
                        }

                        /* access modifiers changed from: public */
                        /* renamed from: a */
                        private /* synthetic */ void m139553a(View view) {
                            ContactsHomeView.this.mo131374h();
                        }
                    });
                }
                if (z) {
                    ContactsHomeView.this.f92188g.mo131442a(ContactsHomeView.this.f92182a);
                } else {
                    ContactsHomeView.this.f92188g.mo131444b(ContactsHomeView.this.f92182a);
                }
                ContactsHomeView.this.f92191j.mo99191a(ContactsHomeView.this.f92188g);
            }
        });
        if (z) {
            ContactHitPoint.m140801f();
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: c */
    public void mo131369c(boolean z) {
        ContactsHomeAdapter contactsHomeAdapter = this.f92207z;
        if (contactsHomeAdapter != null) {
            contactsHomeAdapter.mo131334a(z);
            this.f92207z.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private void m139514a(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            if (f >= ((float) UIUtils.dp2px(this.f92185d, 104.0f))) {
                f = (float) UIUtils.dp2px(this.f92185d, 104.0f);
            }
            this.f92178B = 0.42307693f * f;
            this.f92179C = 0.5769231f * f;
            this.f92180D = f * 1.0f;
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: b */
    public void mo131366b(List<String> list) {
        if (list != null) {
            HashSet hashSet = new HashSet(list);
            for (ContactViewDataWrapper contactViewDataWrapper : this.f92206y) {
                if (contactViewDataWrapper.getType() == 2) {
                    contactViewDataWrapper.getViewData().f93252j = hashSet.contains(contactViewDataWrapper.getViewData().f93246d);
                }
            }
            this.f92207z.resetAll(this.f92206y);
        }
    }

    /* renamed from: c */
    public void mo131368c(C36077a aVar) {
        C25639g a = new C25639g(this.f92185d).mo89248g(R.string.Lark_Legacy_DialogDeleteExternalContactTitle).mo89238b(true).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(aVar) {
            /* class com.ss.android.lark.contact.impl.contacts_home.$$Lambda$ContactsHomeView$0sGK4xU_fLbUgQf48aM3mUa7t8 */
            public final /* synthetic */ C36077a f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                ContactsHomeView.m270486lambda$0sGK4xU_fLbUgQf48aM3mUa7t8(ContactsHomeView.this, this.f$1, dialogInterface, i);
            }
        });
        if (DesktopUtil.m144307b()) {
            a.mo89222a(440.0f);
        }
        a.mo89239c();
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: b */
    public void mo131365b(C36077a aVar) {
        if (aVar.f93248f) {
            mo131359a(aVar);
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f92206y.size()) {
                break;
            }
            ContactViewDataWrapper contactViewDataWrapper = this.f92206y.get(i);
            if (contactViewDataWrapper.getType() == 2) {
                C36077a viewData = contactViewDataWrapper.getViewData();
                if (viewData.f93246d.equals(aVar.f93246d) && viewData.f93247e.equals(aVar.f93247e)) {
                    this.f92206y.set(i, new ContactViewDataWrapper(2, aVar));
                    m139519m();
                    this.f92207z.notifyItemChanged(i);
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (!z) {
            if (m139518l()) {
                List<ContactViewDataWrapper> list = this.f92206y;
                list.remove(list.size() - 1);
            }
            this.f92206y.add(new ContactViewDataWrapper(2, aVar));
            m139516c(this.f92206y);
            m139519m();
            this.f92207z.diff(this.f92206y);
        }
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131359a(C36077a aVar) {
        int i = 0;
        while (true) {
            if (i >= this.f92206y.size()) {
                break;
            }
            ContactViewDataWrapper contactViewDataWrapper = this.f92206y.get(i);
            if (contactViewDataWrapper.getType() == 2) {
                C36077a viewData = contactViewDataWrapper.getViewData();
                if (viewData.f93246d.equals(aVar.f93246d) && viewData.f93247e.equals(aVar.f93247e)) {
                    this.f92206y.remove(i);
                    break;
                }
            }
            i++;
        }
        List<ContactViewDataWrapper> list = this.f92206y;
        if (list.get(list.size() - 1).getType() == 1) {
            mo131371e();
            m139526t();
            return;
        }
        this.f92207z.diff(this.f92206y);
        m139517d(this.f92206y);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131360a(String str) {
        LKUIToast.show(this.f92185d, str);
    }

    @Override // com.ss.android.lark.contact.impl.contacts_home.AbstractC35680f.AbstractC35683b
    /* renamed from: a */
    public void mo131361a(List<C36077a> list) {
        if (CollectionUtils.isEmpty(list)) {
            mo131371e();
            m139526t();
        } else {
            for (C36077a aVar : list) {
                this.f92206y.add(new ContactViewDataWrapper(2, aVar));
            }
            this.f92207z.diff(this.f92206y);
            m139517d(this.f92206y);
        }
        this.f92197p = true;
    }

    /* renamed from: a */
    public void mo131356a(View view, float f) {
        boolean z;
        int i;
        if (this.f92192k == ITitleController.Style.Old) {
            int i2 = 0;
            if (view.getId() == R.id.title_tv) {
                z = true;
            } else {
                z = false;
            }
            CommonTitleBar commonTitleBar = this.mTitleBar;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            commonTitleBar.setVisibility(i);
            TextView textView = this.mTitleTV;
            if (!z) {
                i2 = 8;
            }
            textView.setVisibility(i2);
            view.setAlpha(f);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m139515a(C36077a aVar, DialogInterface dialogInterface, int i) {
        this.f92183b.mo131436a(aVar);
    }

    public ContactsHomeView(AbstractC35659a aVar, Activity activity, Fragment fragment, boolean z, boolean z2, boolean z3, ITitleController iTitleController) {
        this.f92184c = aVar;
        this.f92185d = activity;
        this.f92205x = fragment;
        this.f92195n = z;
        this.f92196o = z2;
        this.f92181E = z3;
        this.f92191j = iTitleController;
        this.f92192k = iTitleController.mo99193b();
        this.f92193l = new C35502b();
    }
}
