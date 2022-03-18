package com.ss.android.lark.mail.impl.utils.recipient;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import androidx.loader.content.C1198c;
import androidx.loader.p045a.AbstractC1181a;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailAddress;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42268f;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView;
import java.lang.reflect.Field;

public abstract class RecipientFilterView extends TokenCompleteTextView<MailAddress> implements AbstractC1181a.AbstractC1182a<RecipientResult> {

    /* renamed from: A */
    private RecipientSearchType f111091A;

    /* renamed from: a */
    protected boolean f111092a;

    /* renamed from: b */
    C43813d f111093b;

    /* renamed from: c */
    public ListView f111094c;

    /* renamed from: d */
    protected boolean f111095d;

    /* renamed from: e */
    private AbstractC1181a f111096e;

    /* renamed from: x */
    private ListPopupWindow f111097x;

    /* renamed from: y */
    private int f111098y;

    /* renamed from: z */
    private String f111099z = "";

    /* renamed from: a */
    public void mo155966a(CharSequence charSequence, int i, int i2, int i3) {
        String n = mo156140n();
        if (getFilter() != null && this.f111096e != null) {
            if (TextUtils.isEmpty(n)) {
                this.f111096e.mo6048a(0);
                return;
            }
            this.f111099z = n;
            this.f111098y = 0;
            Bundle bundle = new Bundle();
            bundle.putString(SearchIntents.EXTRA_QUERY, n);
            bundle.putInt("index", 0);
            this.f111096e.mo6051b(0, bundle, this);
        }
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    /* renamed from: a */
    public void mo155963a() {
        mo155964a(-1);
    }

    public void dismissDropDown() {
        super.dismissDropDown();
        this.f111094c = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1181a aVar = this.f111096e;
        if (aVar != null) {
            aVar.mo6048a(0);
            this.f111096e = null;
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: f */
    private /* synthetic */ void mo156009f() {
        this.f111093b.mo156071a("");
        this.f111093b.mo156072a(null, "", true, null);
        this.f111098y = 0;
        this.f111095d = false;
    }

    public void showDropDown() {
        boolean z;
        if (this.f111093b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            super.showDropDown();
            mo156008e();
        }
    }

    /* renamed from: b */
    public void mo155967b() {
        AbstractC1181a aVar = this.f111096e;
        if (aVar != null && !aVar.mo6052b()) {
            Bundle bundle = new Bundle();
            bundle.putString(SearchIntents.EXTRA_QUERY, this.f111099z);
            bundle.putInt("index", this.f111098y);
            this.f111096e.mo6051b(0, bundle, this);
        }
    }

    /* renamed from: e */
    private void mo156008e() {
        if (this.f111097x == null) {
            Field field = null;
            try {
                field = TokenCompleteTextView.class.getSuperclass().getSuperclass().getDeclaredField("mPopup");
                field.setAccessible(true);
            } catch (Exception unused) {
            }
            if (field != null) {
                try {
                    this.f111097x = (ListPopupWindow) field.get(this);
                } catch (IllegalAccessException unused2) {
                }
            }
        }
        ListPopupWindow listPopupWindow = this.f111097x;
        if (listPopupWindow != null && this.f111094c == null) {
            ListView listView = listPopupWindow.getListView();
            this.f111094c = listView;
            if (listView != null) {
                AdapterView.OnItemClickListener onItemClickListener = listView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    this.f111094c.setOnItemClickListener(new AdapterView.OnItemClickListener(onItemClickListener) {
                        /* class com.ss.android.lark.mail.impl.utils.recipient.$$Lambda$RecipientFilterView$W4xAhqfSDOLxNZI3MXHdmdptqnU */
                        public final /* synthetic */ AdapterView.OnItemClickListener f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                            RecipientFilterView.lambda$W4xAhqfSDOLxNZI3MXHdmdptqnU(RecipientFilterView.this, this.f$1, adapterView, view, i, j);
                        }
                    });
                }
                this.f111094c.setOnScrollListener(new AbsListView.OnScrollListener() {
                    /* class com.ss.android.lark.mail.impl.utils.recipient.RecipientFilterView.C437942 */

                    /* renamed from: b */
                    private boolean f111103b;

                    /* renamed from: c */
                    private int f111104c;

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                        RecipientFilterView.this.mo156153p();
                        int lastVisiblePosition = absListView.getLastVisiblePosition();
                        Log.m165389i("RecipientFilterView", "onScrollStateChanged pos:" + lastVisiblePosition + ", count:" + RecipientFilterView.this.getAdapter().getCount() + ", scrollState:" + i + ", mIsComplete:" + RecipientFilterView.this.f111095d + ", mIsAllVisible:" + this.f111103b);
                        if (lastVisiblePosition > 8 && lastVisiblePosition > RecipientFilterView.this.getAdapter().getCount() - 4 && i == 0 && !RecipientFilterView.this.f111095d && !this.f111103b) {
                            RecipientFilterView.this.mo155967b();
                        }
                        RecipientFilterView.this.f111094c.setVerticalScrollBarEnabled(true);
                    }

                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        boolean z;
                        this.f111104c = i3;
                        if (i3 == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f111103b = z;
                    }
                });
            }
        }
    }

    public void setLoaderManager(AbstractC1181a aVar) {
        this.f111096e = aVar;
    }

    public RecipientFilterView(Context context) {
        super(context);
        m173561a(context);
    }

    /* renamed from: a */
    private void m173561a(Context context) {
        C43813d dVar = new C43813d(context);
        this.f111093b = dVar;
        setAdapter(dVar);
        setDropDownBackgroundResource(R.color.transparent);
        setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.RecipientFilterView.C437921 */

            public void onDismiss() {
                C43849u.m173827a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.utils.recipient.RecipientFilterView.C437921.RunnableC437931 */

                    public void run() {
                        if (RecipientFilterView.this.f111093b != null) {
                            RecipientFilterView.this.f111093b.mo156074b(-1);
                        }
                    }
                }, 500);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m173563a(RecipientResult cVar) {
        if (cVar != null && cVar.mo156059a()) {
            if (cVar.mo156065f() != RecipientSearchType.CONTACTS) {
                this.f111091A = cVar.mo156065f();
                this.f111093b.mo156072a(cVar.mo156062d(), cVar.mo156060b(), true, this.f111091A);
            } else {
                this.f111098y = cVar.mo156061c();
                this.f111091A = cVar.mo156065f();
                this.f111093b.mo156072a(cVar.mo156062d(), cVar.mo156060b(), false, this.f111091A);
                this.f111095d = !cVar.mo156063e();
            }
        }
        if (getContext() != null) {
            ((C42268f) C42344d.m169091a(C42268f.class, getContext())).mo152372a("success", 0);
        }
    }

    /* renamed from: a */
    public void mo155964a(int i) {
        this.f111093b.mo156074b(i);
    }

    @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
    /* renamed from: a */
    public void mo6054a(C1198c<RecipientResult> cVar) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.utils.recipient.$$Lambda$RecipientFilterView$E0he3KBMIRnjh8Ur6g5HVGcBko */

            public final void run() {
                RecipientFilterView.m270788lambda$E0he3KBMIRnjh8Ur6g5HVGcBko(RecipientFilterView.this);
            }
        });
    }

    public RecipientFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m173561a(context);
    }

    /* renamed from: a */
    public int mo155962a(CharSequence charSequence, int i) {
        int i2 = i;
        while (i2 > 0 && charSequence.charAt(i2 - 1) != ',') {
            i2--;
        }
        while (i2 < i && charSequence.charAt(i2) == ';') {
            i2++;
        }
        return i2;
    }

    public void performFiltering(CharSequence charSequence, int i) {
        if (!mo156158s()) {
            if (enoughToFilter()) {
                int selectionEnd = getSelectionEnd();
                int a = mo155962a(charSequence, selectionEnd);
                if (a < this.f111214k.length()) {
                    a = this.f111214k.length();
                }
                mo155966a(charSequence, a, selectionEnd, i);
                return;
            }
            dismissDropDown();
            Filter filter = getFilter();
            if (filter != null) {
                filter.filter(null);
            }
        }
    }

    @Override // androidx.loader.p045a.AbstractC1181a.AbstractC1182a
    /* renamed from: a */
    public C1198c<RecipientResult> mo6053a(int i, Bundle bundle) {
        String str;
        int i2;
        if (getContext() != null) {
            ((C42268f) C42344d.m169091a(C42268f.class, getContext())).mo152380b((String) null);
        }
        if (bundle == null || !bundle.containsKey(SearchIntents.EXTRA_QUERY)) {
            str = "";
        } else {
            str = bundle.getString(SearchIntents.EXTRA_QUERY);
        }
        if (bundle == null || !bundle.containsKey("index")) {
            i2 = 0;
        } else {
            i2 = bundle.getInt("index");
        }
        this.f111093b.mo156071a(str);
        return new C43812b(getContext(), str, i2, this.f111093b.mo156068a());
    }

    /* renamed from: a */
    public void mo6055a(C1198c<RecipientResult> cVar, RecipientResult cVar2) {
        C43849u.m173826a(new Runnable(cVar2) {
            /* class com.ss.android.lark.mail.impl.utils.recipient.$$Lambda$RecipientFilterView$oRc4YLhBh0WQdcbXhVNWTf9V4 */
            public final /* synthetic */ RecipientResult f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RecipientFilterView.m270789lambda$oRc4YLhBh0WQdcbXhVNWTf9V4(RecipientFilterView.this, this.f$1);
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.utils.tokenautocomplete.TokenCompleteTextView
    public void onFocusChanged(boolean z, int i, Rect rect) {
        this.f111093b.mo156073a(z);
        if (!z) {
            mo155964a(-1);
        }
        super.onFocusChanged(z, i, rect);
    }

    public RecipientFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m173561a(context);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m173562a(AdapterView.OnItemClickListener onItemClickListener, AdapterView adapterView, View view, int i, long j) {
        this.f111092a = true;
        onItemClickListener.onItemClick(adapterView, view, i, j);
        mo155964a(i);
        this.f111092a = false;
    }
}
