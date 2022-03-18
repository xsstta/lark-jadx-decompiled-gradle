package com.ss.android.lark.mm.module.tab;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import com.ss.android.lark.mm.utils.ResString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00010B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0019\u0010\u001f\u001a\u0002H \"\n\b\u0000\u0010 *\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\bH\u0016J\u0019\u0010$\u001a\u0002H \"\n\b\u0000\u0010 *\u0004\u0018\u00010!H\u0016¢\u0006\u0002\u0010\"J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u001eH\u0016J\b\u0010(\u001a\u00020\u000fH\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\n\u0010+\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020\u0019H\u0016J\b\u0010/\u001a\u00020\u0019H\u0016R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmTabPageSpec;", "Lcom/ss/android/lark/maincore/TabPageSpec;", "mContext", "Landroid/content/Context;", "mTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;)V", "TAB_KEY", "", "buttons", "", "Lcom/ss/android/lark/maincore/IFunctionButton;", "mNavigationTabView", "Lcom/ss/android/lark/mm/module/tab/MmNavigationTabView;", "mPageSwitchListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "mTabView", "Lcom/ss/android/lark/mm/module/tab/MmTabView;", "mTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "mainTabFragment", "Lcom/ss/android/lark/mm/module/tab/MmMainTabFragment;", "createFunctionButtonList", "", "destroy", "", "execCommand", "bundle", "Landroid/os/Bundle;", "getDrawerMenuLockMode", "", "getMainTabContent", "T", "Landroid/view/View;", "()Landroid/view/View;", "getName", "getNavigationTabContent", "getPageContent", "Landroidx/fragment/app/Fragment;", "getPageLoadStrategy", "getPageSwitchListener", "getTabDoubleClickedListener", "Lcom/ss/android/lark/maincore/TabPageSpec$OnTabDoubleClickedListener;", "getTitleInfo", "handleBackPress", "", "preloadPage", "reload", "MmTabTitleInfo", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.tab.d */
public final class MmTabPageSpec implements AbstractC44552i {

    /* renamed from: a */
    public final String f118417a = "videomm";

    /* renamed from: b */
    public MmTabView f118418b;

    /* renamed from: c */
    public MmMainTabFragment f118419c;

    /* renamed from: d */
    public final List<AbstractC44545b> f118420d = new ArrayList();

    /* renamed from: e */
    private MmNavigationTabView f118421e;

    /* renamed from: f */
    private ITitleInfo f118422f;

    /* renamed from: g */
    private final AbstractC44552i.AbstractC44553a f118423g = new C47055c(this);

    /* renamed from: h */
    private final Context f118424h;

    /* renamed from: i */
    private final ITitleController f118425i;

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 0;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/mm/module/tab/MmTabPageSpec$MmTabTitleInfo;", "Lcom/ss/android/lark/maincore/ITitleInfo;", "mTitleClick", "Lcom/ss/android/lark/maincore/ITitleInfo$ClickListener;", "(Lcom/ss/android/lark/mm/module/tab/MmTabPageSpec;Lcom/ss/android/lark/maincore/ITitleInfo$ClickListener;)V", "getClickListener", "getFunctionButtonList", "", "Lcom/ss/android/lark/maincore/IFunctionButton;", "getIconStyle", "Lcom/ss/android/lark/maincore/ITitleInfo$IconStyle;", "getName", "", "getSelectedItem", "Lcom/ss/android/lark/maincore/ITitleInfo$SelectedItem;", "getStatus", "Lcom/ss/android/lark/maincore/ITitleInfo$Status;", "isShow", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.d$a */
    public final class MmTabTitleInfo implements ITitleInfo {

        /* renamed from: a */
        final /* synthetic */ MmTabPageSpec f118426a;

        /* renamed from: b */
        private final ITitleInfo.AbstractC44542a f118427b;

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: a */
        public boolean mo33255a() {
            return true;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: g */
        public ITitleInfo.C44543b mo33261g() {
            return null;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: c */
        public ITitleInfo.IconStyle mo33257c() {
            return ITitleInfo.IconStyle.Hide;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: e */
        public ITitleInfo.Status mo33259e() {
            return ITitleInfo.Status.Normal;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: f */
        public ITitleInfo.AbstractC44542a mo33260f() {
            return this.f118427b;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: b */
        public String mo33256b() {
            return ResString.f118656a.mo165504a(R.string.MMWeb_G_MinutesNameShort);
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: d */
        public List<AbstractC44545b> mo33258d() {
            if (this.f118426a.f118420d.isEmpty()) {
                this.f118426a.f118420d.addAll(this.f118426a.mo165274a());
            }
            return this.f118426a.f118420d;
        }

        public MmTabTitleInfo(MmTabPageSpec dVar, ITitleInfo.AbstractC44542a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "mTitleClick");
            this.f118426a = dVar;
            this.f118427b = aVar;
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return this.f118417a;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f118423g;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.d$b */
    static final class C47054b implements ITitleInfo.AbstractC44542a {

        /* renamed from: a */
        final /* synthetic */ MmTabPageSpec f118428a;

        C47054b(MmTabPageSpec dVar) {
            this.f118428a = dVar;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo.AbstractC44542a
        /* renamed from: a */
        public final void mo99210a() {
            MmMainTabFragment aVar;
            if (this.f118428a.f118419c != null && (aVar = this.f118428a.f118419c) != null) {
                aVar.mo165265d();
            }
        }
    }

    /* renamed from: a */
    public final List<AbstractC44545b> mo165274a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MmTabMoreButton(this.f118424h));
        return arrayList;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f118418b == null) {
            this.f118418b = new MmTabView(this.f118424h);
        }
        return this.f118418b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: i */
    public Fragment mo31318i() {
        if (this.f118419c == null) {
            MmMainTabFragment aVar = new MmMainTabFragment(null, null, 0, 7, null);
            this.f118419c = aVar;
            if (aVar != null) {
                aVar.mo165264a(this.f118425i);
            }
        }
        return this.f118419c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f118421e == null) {
            this.f118421e = new MmNavigationTabView(this.f118424h);
        }
        return this.f118421e;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        if (this.f118422f == null) {
            this.f118422f = new MmTabTitleInfo(this, new C47054b(this));
        }
        return this.f118422f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001c\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/mm/module/tab/MmTabPageSpec$mPageSwitchListener$1", "Lcom/ss/android/lark/maincore/TabPageSpec$OnPageSwitchListener;", "afterPageSwitch", "", "prePageName", "", "currentPageName", "beforePageSwitch", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.tab.d$c */
    public static final class C47055c implements AbstractC44552i.AbstractC44553a {

        /* renamed from: a */
        final /* synthetic */ MmTabPageSpec f118429a;

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47055c(MmTabPageSpec dVar) {
            this.f118429a = dVar;
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals(this.f118429a.f118417a, str);
            boolean equals2 = TextUtils.equals(this.f118429a.f118417a, str2);
            MmTabView mmTabView = this.f118429a.f118418b;
            if (mmTabView != null) {
                if (equals && !equals2) {
                    mmTabView.mo110683b();
                }
                if (!equals && equals2) {
                    mmTabView.mo110677a();
                }
            }
        }
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
        MmMainTabFragment aVar = this.f118419c;
        if (aVar != null) {
            aVar.mo165263a(bundle);
        }
    }

    public MmTabPageSpec(Context context, ITitleController iTitleController) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(iTitleController, "mTitleController");
        this.f118424h = context;
        this.f118425i = iTitleController;
    }
}
