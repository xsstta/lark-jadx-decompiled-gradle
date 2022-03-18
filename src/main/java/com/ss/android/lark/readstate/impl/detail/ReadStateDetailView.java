package com.ss.android.lark.readstate.impl.detail;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.readstate.ReadStateModule;
import com.ss.android.lark.readstate.impl.adapter.C53102c;
import com.ss.android.lark.readstate.impl.detail.C53111a;
import com.ss.android.lark.readstate.impl.detail.vo.SearchReadStateResult;
import com.ss.android.lark.readstate.impl.detail.vo.ShowReadStateResult;
import com.ss.android.lark.readstate.impl.fragment.C53131e;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.C57767ae;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

public class ReadStateDetailView implements C53111a.AbstractC53113b {

    /* renamed from: a */
    public AbstractC53110a f131322a;

    /* renamed from: b */
    public String f131323b;

    /* renamed from: c */
    public List<C29527a> f131324c;

    /* renamed from: d */
    public int f131325d;

    /* renamed from: e */
    public int f131326e;

    /* renamed from: f */
    public C53111a.AbstractC53113b.AbstractC53114a f131327f;

    /* renamed from: g */
    public C53102c f131328g;

    /* renamed from: h */
    public int f131329h;

    /* renamed from: i */
    public Context f131330i;

    /* renamed from: j */
    private LKUIStatus f131331j;

    /* renamed from: k */
    private Fragment f131332k;

    /* renamed from: l */
    private String f131333l;

    /* renamed from: m */
    private Message.Type f131334m;
    FrameLayout mContentLayout;
    TextView mEmptyHintTv;
    View mEmptyHintView;
    ViewGroup mFragmentContainer;
    MagicIndicator mIndicator;
    TextView mLkpReadCountTv;
    FrameLayout mLkpReadFragmentLayout;
    View mLkpReadStateLayoutWrap;
    TextView mLkpReadTitleTv;
    View mLkpSplitView;
    TextView mLkpUnreadCountTv;
    FrameLayout mLkpUnreadFragmentLayout;
    TextView mLkpUnreadTitleTv;
    View mSearchDel;
    EditText mSearchEt;
    View mSearchLayout;
    RecyclerView mSearchResultRV;
    CommonTitleBar mTitleBar;
    ViewPager mViewPager;

    /* renamed from: n */
    private boolean f131335n;

    /* renamed from: o */
    private AbstractC69621a f131336o = new AbstractC69621a() {
        /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.C531031 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return ReadStateDetailView.this.f131324c.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(context);
            aVar.setColors(Integer.valueOf(UIUtils.getColor(ReadStateDetailView.this.f131330i, R.color.primary_pri_500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIHelper.dp2px(4.0f));
            aVar.setRoundRadius((float) UIHelper.dp2px(2.0f));
            aVar.setYOffset((float) (-UIHelper.dp2px(2.0f)));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            C69627a aVar = new C69627a(context);
            aVar.setTextSize(16.0f);
            aVar.setNormalColor(UIUtils.getColor(ReadStateDetailView.this.f131330i, R.color.text_caption));
            aVar.setSelectedColor(UIUtils.getColor(ReadStateDetailView.this.f131330i, R.color.primary_pri_500));
            aVar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.C531031.View$OnClickListenerC531041 */

                public void onClick(View view) {
                    ReadStateDetailView.this.mViewPager.setCurrentItem(i);
                }
            });
            if (i == 0) {
                aVar.setText(UIHelper.mustacheFormat(ReadStateDetailView.this.f131324c.get(i).f73821b, "count", Integer.toString(ReadStateDetailView.this.f131325d)));
            } else if (i == 1) {
                aVar.setText(UIHelper.mustacheFormat(ReadStateDetailView.this.f131324c.get(i).f73821b, "count", Integer.toString(ReadStateDetailView.this.f131326e)));
            }
            return aVar;
        }
    };

    /* renamed from: com.ss.android.lark.readstate.impl.detail.ReadStateDetailView$a */
    public interface AbstractC53110a {
        /* renamed from: a */
        FragmentManager mo181413a();

        /* renamed from: a */
        void mo181414a(ReadStateDetailView readStateDetailView);

        /* renamed from: a */
        void mo181415a(String str);

        /* renamed from: b */
        void mo181416b();
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    /* renamed from: d */
    private void m205577d() {
        m205579e();
        m205580f();
        m205581g();
    }

    /* renamed from: b */
    public void mo181410b() {
        this.f131328g.mo181381a();
        this.mSearchResultRV.setVisibility(4);
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        this.f131322a.mo181414a(this);
        m205577d();
    }

    /* renamed from: h */
    private void m205582h() {
        this.mSearchLayout.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$ReadStateDetailView$8znYVUxdseVf91ENFnk5hBqSLf0 */

            public final void onClick(View view) {
                ReadStateDetailView.lambda$8znYVUxdseVf91ENFnk5hBqSLf0(ReadStateDetailView.this, view);
            }
        });
        this.mSearchEt.addTextChangedListener(new C57767ae() {
            /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.C531074 */

            @Override // com.ss.android.lark.utils.C57767ae
            public void afterTextChanged(final Editable editable) {
                if (TextUtils.isEmpty(editable)) {
                    ReadStateDetailView.this.mo181410b();
                    ReadStateDetailView.this.mFragmentContainer.setVisibility(0);
                    ReadStateDetailView.this.mSearchResultRV.setVisibility(8);
                    ReadStateDetailView.this.mSearchDel.setVisibility(8);
                    if (ReadStateDetailView.this.f131329h != 1) {
                        ReadStateDetailView.this.mIndicator.setVisibility(0);
                        return;
                    }
                    return;
                }
                if (ReadStateDetailView.this.f131328g != null) {
                    ReadStateDetailView.this.f131328g.mo181381a();
                } else {
                    ReadStateDetailView readStateDetailView = ReadStateDetailView.this;
                    readStateDetailView.f131328g = new C53102c(readStateDetailView.f131330i, ReadStateDetailView.this.f131323b);
                    ReadStateDetailView.this.mSearchResultRV.setLayoutManager(new LinearLayoutManager(ReadStateDetailView.this.f131330i, 1, false));
                    ReadStateDetailView.this.mSearchResultRV.setAdapter(ReadStateDetailView.this.f131328g);
                    ReadStateDetailView.this.f131328g.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
                        /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.C531074.C531081 */

                        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                        public void onChanged() {
                            int i;
                            super.onChanged();
                            View view = ReadStateDetailView.this.mEmptyHintView;
                            int i2 = 8;
                            if (ReadStateDetailView.this.f131328g.getItemCount() > 0) {
                                i = 8;
                            } else {
                                i = 0;
                            }
                            view.setVisibility(i);
                            RecyclerView recyclerView = ReadStateDetailView.this.mSearchResultRV;
                            if (ReadStateDetailView.this.f131328g.getItemCount() > 0) {
                                i2 = 0;
                            }
                            recyclerView.setVisibility(i2);
                            ReadStateDetailView.this.mEmptyHintTv.setText(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Noresult, "search_key", editable.toString()));
                        }
                    });
                    ReadStateDetailView.this.mSearchResultRV.addOnScrollListener(new RecyclerView.OnScrollListener() {
                        /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.C531074.C531092 */

                        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                            ReadStateDetailView.this.mSearchEt.clearFocus();
                            KeyboardUtils.hideKeyboard(ReadStateDetailView.this.f131330i);
                        }
                    });
                }
                ReadStateDetailView.this.mFragmentContainer.setVisibility(8);
                ReadStateDetailView.this.mSearchResultRV.setVisibility(0);
                ReadStateDetailView.this.f131327f.mo181419a(editable.toString());
                ReadStateDetailView.this.mSearchDel.setVisibility(0);
            }
        });
        this.mSearchDel.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$ReadStateDetailView$OeDlNt4R2qMK15Fgpj0GcWlsWGw */

            public final void onClick(View view) {
                ReadStateDetailView.lambda$OeDlNt4R2qMK15Fgpj0GcWlsWGw(ReadStateDetailView.this, view);
            }
        });
    }

    /* renamed from: e */
    private void m205579e() {
        if (DesktopUtil.m144301a(this.f131330i)) {
            this.mTitleBar.setVisibility(8);
        }
        if (this.f131335n) {
            this.mTitleBar.setTitle(R.string.Lark_Chat_BuzzStatustitle);
        } else {
            this.mTitleBar.setTitle(R.string.Lark_Legacy_TitleActivityReadstate);
        }
        this.mTitleBar.setDividerVisible(false);
        this.mTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.View$OnClickListenerC531052 */

            public void onClick(View view) {
                ReadStateDetailView.this.f131322a.mo181416b();
            }
        });
    }

    /* renamed from: f */
    private void m205580f() {
        this.mViewPager.setAdapter(new FragmentPagerAdapter(this.f131322a.mo181413a()) {
            /* class com.ss.android.lark.readstate.impl.detail.ReadStateDetailView.C531063 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return ReadStateDetailView.this.f131324c.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return ReadStateDetailView.this.f131324c.get(i).f73820a;
            }
        });
        C69619a aVar = new C69619a(this.f131330i);
        aVar.setAdjustMode(true);
        aVar.setAdapter(this.f131336o);
        this.mIndicator.setNavigator(aVar);
        this.mIndicator.setBackgroundColor(UIUtils.getColor(this.f131330i, R.color.bg_body));
        C69634c.m267483a(this.mIndicator, this.mViewPager);
    }

    /* renamed from: c */
    private void m205574c() {
        this.f131324c = new ArrayList();
        HashSet hashSet = new HashSet(2);
        hashSet.add(4);
        hashSet.add(6);
        this.f131324c.add(new C29527a(C53131e.m205666a(4, hashSet, this.f131333l, this.f131334m.getNumber(), this.f131323b, this.f131335n), m205566a(this.f131334m, 4)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(2);
        hashSet2.add(5);
        this.f131324c.add(new C29527a(C53131e.m205666a(2, hashSet2, this.f131333l, this.f131334m.getNumber(), this.f131323b, this.f131335n), m205566a(this.f131334m, 2)));
    }

    /* renamed from: g */
    private void m205581g() {
        LKUIStatus a = new LKUIStatus.C25680a(this.mContentLayout).mo89858a(UIHelper.getString(R.string.Lark_Legacy_InLoading)).mo89863c(UIHelper.getString(R.string.Lark_Legacy_CurrentPageEmpty)).mo89862c(R.drawable.illustration_empty_positive_im_default).mo89861b(UIHelper.getString(R.string.Lark_Legacy_LoadingFailed)).mo89860b(R.drawable.illustration_empty_negative_load_failed).mo89859a();
        this.f131331j = a;
        a.mo89838a(500);
    }

    @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53113b
    /* renamed from: a */
    public void mo181405a() {
        this.f131331j.mo89843b();
    }

    /* renamed from: a */
    public void setViewDelegate(C53111a.AbstractC53113b.AbstractC53114a aVar) {
        this.f131327f = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m205568a(View view) {
        this.mSearchEt.setText("");
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m205571b(View view) {
        this.mSearchEt.setFocusable(true);
        this.mSearchEt.setFocusableInTouchMode(true);
        this.mSearchEt.requestFocus();
        KeyboardUtils.showKeyboard(this.f131330i);
    }

    /* renamed from: d */
    private void m205578d(ShowReadStateResult bVar) {
        List<C53123f> a = bVar.mo181424a();
        int c = bVar.mo181426c();
        if (ReadStateModule.m205502a().mo144096a(this.f131323b, this.f131333l, c)) {
            ArrayList arrayList = new ArrayList();
            for (C53123f fVar : a) {
                arrayList.add(fVar.f131380e);
            }
            ReadStateModule.m205502a().mo144095a(this.f131323b, this.f131333l, c, arrayList);
        }
    }

    /* renamed from: b */
    private void m205572b(ShowReadStateResult bVar) {
        this.mIndicator.setVisibility(8);
        int c = bVar.mo181426c();
        int d = bVar.mo181427d();
        this.mLkpReadCountTv.setText(Integer.toString(c));
        this.mLkpReadTitleTv.setText(m205570b(this.f131334m, 4));
        this.mLkpUnreadCountTv.setText(Integer.toString(d));
        this.mLkpUnreadTitleTv.setText(m205570b(this.f131334m, 2));
        FragmentTransaction beginTransaction = this.f131332k.getChildFragmentManager().beginTransaction();
        C53131e a = m205565a(beginTransaction, R.id.read_fragment_container, 4, "LKP_READ_COLUMN");
        C53131e a2 = m205565a(beginTransaction, R.id.unread_fragment_container, 2, "LKP_UNREAD_COLUMN");
        beginTransaction.commitAllowingStateLoss();
        UICallbackExecutor.post(new Runnable(bVar) {
            /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$ReadStateDetailView$Tn_n5gYbk78E9jQLQD929_9Uug */
            public final /* synthetic */ ShowReadStateResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ReadStateDetailView.m270934lambda$Tn_n5gYbk78E9jQLQD929_9Uug(C53131e.this, this.f$1);
            }
        });
        UICallbackExecutor.post(new Runnable(bVar) {
            /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$ReadStateDetailView$JRCo0c76n5WRm2l8h8bdAa3eBg */
            public final /* synthetic */ ShowReadStateResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                ReadStateDetailView.m270935lambda$JRCo0c76n5WRm2l8h8bdAa3eBg(C53131e.this, this.f$1);
            }
        });
    }

    /* renamed from: c */
    private void m205575c(ShowReadStateResult bVar) {
        this.mIndicator.setVisibility(0);
        ((C53131e) this.f131324c.get(0).f73820a).mo181466a(bVar.mo181424a(), bVar.mo181431g());
        ((C53131e) this.f131324c.get(1).f73820a).mo181466a(bVar.mo181425b(), bVar.mo181432h());
        m205567a(bVar.mo181426c(), bVar.mo181427d());
    }

    @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53113b
    /* renamed from: a */
    public void mo181407a(SearchReadStateResult aVar) {
        this.mFragmentContainer.setVisibility(8);
        this.mIndicator.setVisibility(8);
        this.mSearchResultRV.setVisibility(0);
        this.f131328g.mo181383b(aVar.mo181420a());
    }

    @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53113b
    /* renamed from: a */
    public void mo181408a(ShowReadStateResult bVar) {
        if (bVar == null || (CollectionUtils.isEmpty(bVar.mo181424a()) && CollectionUtils.isEmpty(bVar.mo181425b()))) {
            this.f131331j.mo89845c();
            return;
        }
        this.f131331j.mo89849f();
        m205578d(bVar);
        this.f131329h = bVar.mo181430f();
        int i = 0;
        if (bVar.mo181428e()) {
            this.mSearchLayout.setVisibility(0);
            m205582h();
        } else {
            this.mSearchLayout.setVisibility(8);
        }
        boolean a = DesktopUtil.m144301a(this.f131330i);
        if (this.f131329h == 2 && this.f131324c.size() == 2) {
            View view = this.mLkpReadStateLayoutWrap;
            if (!a) {
                i = 8;
            }
            view.setVisibility(i);
            if (a) {
                m205572b(bVar);
            } else {
                m205575c(bVar);
            }
        } else {
            this.mIndicator.setVisibility(8);
            FragmentTransaction beginTransaction = this.f131332k.getChildFragmentManager().beginTransaction();
            HashSet hashSet = new HashSet(5);
            hashSet.add(7);
            hashSet.add(4);
            hashSet.add(6);
            hashSet.add(5);
            hashSet.add(8);
            C53131e a2 = C53131e.m205666a(7, hashSet, this.f131333l, this.f131334m.getNumber(), this.f131323b, this.f131335n);
            beginTransaction.add(R.id.fragment_container, a2, "READ_STATE_SHOW_TYPE_ONE_COLUMN_WITH_LIMIT");
            beginTransaction.commitAllowingStateLoss();
            UICallbackExecutor.post(new Runnable(bVar) {
                /* class com.ss.android.lark.readstate.impl.detail.$$Lambda$ReadStateDetailView$WvPcVIXrLnUo46F78jJYdwQWp8 */
                public final /* synthetic */ ShowReadStateResult f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    ReadStateDetailView.m270936lambda$WvPcVIXrLnUo46F78jJYdwQWp8(C53131e.this, this.f$1);
                }
            });
        }
    }

    @Override // com.ss.android.lark.readstate.impl.detail.C53111a.AbstractC53113b
    /* renamed from: a */
    public void mo181409a(String str) {
        this.f131322a.mo181415a(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m205573b(C53131e eVar, ShowReadStateResult bVar) {
        eVar.mo181465a(bVar.mo181424a());
    }

    /* renamed from: c */
    public static /* synthetic */ void m205576c(C53131e eVar, ShowReadStateResult bVar) {
        eVar.mo181465a(bVar.mo181424a());
    }

    /* renamed from: a */
    public static /* synthetic */ void m205569a(C53131e eVar, ShowReadStateResult bVar) {
        eVar.mo181465a(bVar.mo181425b());
    }

    /* renamed from: a */
    private void m205567a(int i, int i2) {
        this.f131325d = 0;
        this.f131326e = 0;
        List<C29527a> list = this.f131324c;
        if (list != null && list.size() == 2) {
            this.f131325d = i;
            this.f131326e = i2;
            this.f131336o.mo243218b();
        }
    }

    /* renamed from: a */
    private String m205566a(Message.Type type, int i) {
        if (this.f131335n) {
            if (i == 4) {
                return this.f131332k.getString(R.string.Lark_Chat_BuzzStatusConfirm);
            }
            return this.f131332k.getString(R.string.Lark_Chat_BuzzStatusUnconfirm);
        } else if (i == 4) {
            return this.f131332k.getString(R.string.Lark_Legacy_ReadCount);
        } else {
            return this.f131332k.getString(R.string.Lark_Legacy_UnreadCount);
        }
    }

    /* renamed from: b */
    private String m205570b(Message.Type type, int i) {
        if (this.f131335n) {
            if (i == 4) {
                return this.f131332k.getString(R.string.Lark_Chat_BuzzStatusPCConfirm);
            }
            return this.f131332k.getString(R.string.Lark_Chat_BuzzStatusPCUnconfirm);
        } else if (i == 4) {
            return this.f131332k.getString(R.string.Lark_Legacy_ReadStatus);
        } else {
            return this.f131332k.getString(R.string.Lark_Legacy_UnreadLabel);
        }
    }

    /* renamed from: a */
    private C53131e m205565a(FragmentTransaction fragmentTransaction, int i, int i2, String str) {
        HashSet hashSet = new HashSet(5);
        hashSet.add(7);
        hashSet.add(Integer.valueOf(i2));
        hashSet.add(6);
        hashSet.add(5);
        hashSet.add(8);
        C53131e a = C53131e.m205666a(7, hashSet, this.f131333l, this.f131334m.getNumber(), this.f131323b, this.f131335n);
        fragmentTransaction.add(i, a, str);
        return a;
    }

    public ReadStateDetailView(AbstractC53110a aVar, Fragment fragment, String str, Message.Type type, String str2, boolean z) {
        this.f131322a = aVar;
        this.f131332k = fragment;
        this.f131330i = fragment.getActivity();
        this.f131333l = str;
        this.f131323b = str2;
        this.f131334m = type;
        this.f131335n = z;
        m205574c();
    }
}
