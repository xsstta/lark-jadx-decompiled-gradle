package com.tt.miniapp.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.openplatform.core.container.p1118a.p1119a.AbstractC24460a;
import com.tt.miniapp.AppbrandFragment;
import com.tt.miniapp.p3331t.AbstractC66891k;
import com.tt.miniapp.view.TabHost;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.DebugUtil;
import java.util.ArrayList;

public class AppbrandFragmentTabHost extends TabHost implements TabHost.AbstractC67145d {

    /* renamed from: d */
    private boolean f169252d;

    /* renamed from: e */
    private final ArrayList<C67136b> f169253e = new ArrayList<>();

    /* renamed from: f */
    private FrameLayout f169254f;

    /* renamed from: g */
    private Context f169255g;

    /* renamed from: h */
    private FragmentManager f169256h;

    /* renamed from: i */
    private AbstractC24460a f169257i;

    /* renamed from: j */
    private int f169258j;

    /* renamed from: k */
    private TabHost.AbstractC67145d f169259k;

    /* renamed from: l */
    private C67136b f169260l;

    /* renamed from: m */
    private boolean f169261m;

    /* renamed from: n */
    private boolean f169262n = false;

    /* renamed from: o */
    private boolean f169263o = false;

    /* renamed from: p */
    private IAppContext f169264p;

    public boolean getDispatchWindowFocusChangedToAllTab() {
        return this.f169252d;
    }

    /* renamed from: a */
    public void mo233423a() {
        this.f169255g = null;
        this.f169264p = null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f169261m = false;
    }

    public Fragment getCurrentFragment() {
        C67136b bVar = this.f169260l;
        if (bVar != null) {
            return bVar.f169269c;
        }
        return null;
    }

    public int getTabCount() {
        ArrayList<C67136b> arrayList = this.f169253e;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.size();
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class com.tt.miniapp.view.AppbrandFragmentTabHost.SavedState.C671341 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        String f169265a;

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f169265a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f169265a = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f169265a);
        }
    }

    /* renamed from: d */
    private void m261722d() {
        if (this.f169254f == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f169258j);
            this.f169254f = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f169258j);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f169265a = getCurrentTabTag();
        AppBrandLogger.m52828d("tma_FragmentTabHost", "onSaveInstanceState ", savedState.f169265a);
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        FragmentTransaction a;
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < this.f169253e.size(); i++) {
            C67136b bVar = this.f169253e.get(i);
            bVar.f169269c = (AppbrandFragment) this.f169256h.findFragmentByTag(bVar.f169267a);
            if (bVar.f169269c != null && !bVar.f169269c.isDetached()) {
                if (bVar.f169267a.equals(currentTabTag)) {
                    this.f169260l = bVar;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.f169256h.beginTransaction();
                    }
                    C67509b.m262589a("fragment_detach", Log.getStackTraceString(new Throwable()), bVar.f169267a, this.f169264p);
                    fragmentTransaction.detach(bVar.f169269c);
                }
            }
        }
        this.f169261m = true;
        if (!(currentTabTag == null || (a = m261720a(currentTabTag, fragmentTransaction)) == null)) {
            a.commitAllowingStateLoss();
            this.f169256h.executePendingTransactions();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        if (context != null && findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            tabWidget.setDividerDrawable((Drawable) null);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, BitmapDescriptorFactory.HUE_RED));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, BitmapDescriptorFactory.HUE_RED));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f169254f = frameLayout2;
            frameLayout2.setId(this.f169258j);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    public void setAppContext(IAppContext iAppContext) {
        this.f169264p = iAppContext;
    }

    public void setDispatchWindowFocusChangedToAllTab(boolean z) {
        this.f169252d = z;
    }

    @Override // com.tt.miniapp.view.TabHost
    public void setOnTabChangedListener(TabHost.AbstractC67145d dVar) {
        this.f169259k = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.view.AppbrandFragmentTabHost$a */
    public static class C67135a implements TabHost.AbstractC67146e {

        /* renamed from: a */
        private final Context f169266a;

        public C67135a(Context context) {
            this.f169266a = context;
        }

        @Override // com.tt.miniapp.view.TabHost.AbstractC67146e
        /* renamed from: a */
        public View mo233447a(String str) {
            View view = new View(this.f169266a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public void setHideWhenTabChanged(boolean z) {
        if (!this.f169263o) {
            this.f169262n = z;
        } else {
            Log.w("FragmentTabHost", "setHideWhenTabChanged after onTabChanged, ignore");
        }
    }

    public AppbrandFragmentTabHost(Context context) {
        super(context, null);
        m261721a(context, (AttributeSet) null);
    }

    @Override // com.tt.miniapp.view.TabHost
    public void dispatchWindowFocusChanged(boolean z) {
        if (this.f169252d) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchWindowFocusChanged(z);
            }
            return;
        }
        super.dispatchWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        AppBrandLogger.m52828d("tma_FragmentTabHost", "onRestoreInstanceState ", savedState.f169265a);
        setCurrentTabByTag(savedState.f169265a);
    }

    /* renamed from: b */
    public boolean mo233427b(String str) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52830i("tma_FragmentTabHost", "remove tab is empty");
            return false;
        }
        int size = this.f169253e.size();
        for (int i = 0; i < size; i++) {
            C67136b bVar = this.f169253e.get(i);
            if (bVar != null && TextUtils.equals(str, bVar.f169267a) && mo233479d(str)) {
                this.f169253e.remove(i);
                if (!(bVar.f169269c == null || this.f169256h == null)) {
                    AppBrandLogger.m52830i("tma_FragmentTabHost", "remove tab fragment : " + str);
                    FragmentTransaction beginTransaction = this.f169256h.beginTransaction();
                    if (bVar.f169269c instanceof AbstractC66891k) {
                        bVar.f169269c.executeRemoveWithOutCommit(beginTransaction);
                        beginTransaction.commitAllowingStateLoss();
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.tt.miniapp.view.TabHost.AbstractC67145d
    /* renamed from: a */
    public void mo232384a(String str) {
        FragmentTransaction a;
        if (this.f169261m && (a = m261720a(str, (FragmentTransaction) null)) != null) {
            a.commitAllowingStateLoss();
        }
        TabHost.AbstractC67145d dVar = this.f169259k;
        if (dVar != null) {
            dVar.mo232384a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.tt.miniapp.view.AppbrandFragmentTabHost$b */
    public static final class C67136b {

        /* renamed from: a */
        public final String f169267a;

        /* renamed from: b */
        public final Bundle f169268b;

        /* renamed from: c */
        public AppbrandFragment f169269c;

        C67136b(String str, Bundle bundle) {
            this.f169267a = str;
            this.f169268b = bundle;
        }
    }

    /* renamed from: a */
    private void m261721a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f169258j = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public AppbrandFragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m261721a(context, attributeSet);
    }

    /* renamed from: a */
    public void mo233425a(TabHost.C67147f fVar, Bundle bundle) {
        fVar.mo233499a(new C67135a(this.f169255g));
        String a = fVar.mo233500a();
        C67136b bVar = new C67136b(a, bundle);
        if (this.f169261m) {
            bVar.f169269c = (AppbrandFragment) this.f169256h.findFragmentByTag(a);
            if (bVar.f169269c != null && !bVar.f169269c.isDetached()) {
                FragmentTransaction beginTransaction = this.f169256h.beginTransaction();
                C67509b.m262589a("fragment_detach", Log.getStackTraceString(new Throwable()), a, this.f169264p);
                beginTransaction.detach(bVar.f169269c);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        this.f169253e.add(bVar);
        mo233474a(fVar);
    }

    /* renamed from: a */
    private FragmentTransaction m261720a(String str, FragmentTransaction fragmentTransaction) {
        AppBrandLogger.m52828d("tma_FragmentTabHost", "doTabChanged ", str);
        this.f169263o = true;
        C67136b bVar = null;
        for (int i = 0; i < this.f169253e.size(); i++) {
            C67136b bVar2 = this.f169253e.get(i);
            AppBrandLogger.m52828d("tma_FragmentTabHost", "doTabChanged ", bVar2.f169267a);
            if (bVar2.f169267a.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar != null || !DebugUtil.debug()) {
            if (this.f169260l != bVar) {
                if (fragmentTransaction == null) {
                    fragmentTransaction = this.f169256h.beginTransaction();
                }
                C67136b bVar3 = this.f169260l;
                if (!(bVar3 == null || bVar3.f169269c == null)) {
                    if (this.f169262n) {
                        fragmentTransaction.hide(this.f169260l.f169269c);
                    } else {
                        C67509b.m262589a("fragment_detach", Log.getStackTraceString(new Throwable()), this.f169260l.f169269c.getTag(), this.f169264p);
                        fragmentTransaction.detach(this.f169260l.f169269c);
                    }
                }
                if (bVar != null) {
                    if (bVar.f169269c == null) {
                        String string = bVar.f169268b.getString("page_url");
                        String string2 = bVar.f169268b.getString("open_type");
                        bVar.f169269c = this.f169257i.mo87277b(getContext(), string, this.f169264p);
                        bVar.f169269c.updateRouterParams(string, string2);
                        fragmentTransaction.add(this.f169258j, bVar.f169269c, bVar.f169267a);
                    } else if (this.f169262n) {
                        if (bVar.f169269c.isDetached()) {
                            fragmentTransaction.attach(bVar.f169269c);
                        }
                        if (bVar.f169269c.isHidden()) {
                            fragmentTransaction.show(bVar.f169269c);
                        }
                    } else {
                        fragmentTransaction.attach(bVar.f169269c);
                    }
                }
                this.f169260l = bVar;
            }
            return fragmentTransaction;
        }
        throw new IllegalStateException("No tab known for tag " + str);
    }

    /* renamed from: a */
    public boolean mo233426a(TabHost.C67147f fVar, Bundle bundle, int i) {
        fVar.mo233499a(new C67135a(this.f169255g));
        String a = fVar.mo233500a();
        C67136b bVar = new C67136b(a, bundle);
        if (this.f169261m) {
            bVar.f169269c = (AppbrandFragment) this.f169256h.findFragmentByTag(a);
            if (bVar.f169269c != null && !bVar.f169269c.isDetached()) {
                FragmentTransaction beginTransaction = this.f169256h.beginTransaction();
                C67509b.m262589a("fragment_detach", Log.getStackTraceString(new Throwable()), a, this.f169264p);
                beginTransaction.detach(bVar.f169269c);
                beginTransaction.commitAllowingStateLoss();
            }
        }
        if (!mo233475a(i, fVar)) {
            return false;
        }
        if (i >= this.f169253e.size()) {
            this.f169253e.add(bVar);
            return true;
        }
        this.f169253e.add(i, bVar);
        return true;
    }

    /* renamed from: a */
    public void mo233424a(Context context, FragmentManager fragmentManager, int i, AbstractC24460a aVar) {
        super.mo233476b();
        this.f169255g = context;
        this.f169256h = fragmentManager;
        this.f169257i = aVar;
        this.f169258j = i;
        m261722d();
        this.f169254f.setId(i);
        if (getId() == -1) {
            setId(16908306);
        }
    }
}
