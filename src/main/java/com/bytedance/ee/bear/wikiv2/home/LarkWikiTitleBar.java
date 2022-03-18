package com.bytedance.ee.bear.wikiv2.home;

import android.content.Context;
import android.view.View;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.homepage.title.C8506d;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00014B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010&\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010'H\u0016J\u0012\u0010(\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010)\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0012\u0010*\u001a\u00020\u00182\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0012\u0010-\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0010\u00100\u001a\u00020\u00182\u0006\u00101\u001a\u00020\"H\u0016J\b\u00102\u001a\u00020\u0018H\u0016J\b\u00103\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/LarkWikiTitleBar;", "Lcom/bytedance/ee/bear/list/homepage/title/ITitleBar;", "context", "Landroid/content/Context;", "larkTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "wikiCallback", "Lcom/bytedance/ee/bear/contract/route/parcelable/IWikiHomeFragment$WikiCallback;", "(Landroid/content/Context;Lcom/ss/android/lark/maincore/ITitleController;Lcom/bytedance/ee/bear/contract/route/parcelable/IWikiHomeFragment$WikiCallback;)V", "titleInfo", "Lcom/bytedance/ee/bear/wikiv2/home/LarkWikiTitleBar$LarkWikiTitleInfo;", "transformHelper", "Lcom/bytedance/ee/bear/list/homepage/title/TitleBarTransformHelper;", "getCreateView", "Landroid/view/View;", "getLeftView", "getTitleBarHeight", "", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "getTitleSnapshot", "Landroid/graphics/Bitmap;", "getTitleType", "hideCreateRedPoint", "", "hideMenu", "onResetTitleBar", "onScrollBy", "dx", "dy", "setAddMenuDefault", "setAddMenuSelected", "setCreateViewEnable", "enable", "", "setOnCreateViewClickListener", "listener", "Landroid/view/View$OnClickListener;", "setOnGridViewClickListener", "Lcom/bytedance/ee/bear/list/homepage/title/HomeMainTitleBar$OnGridChangedListener;", "setOnLeftViewClickListener", "setSearchViewClickListener", "setShowBadgeDelegate", "showBadgeDelegate", "Lcom/bytedance/ee/bear/list/homepage/title/HomeMainTitleBar$ShowBadgeDelegate;", "setTitle", "title", "", "showGrid", "isGrid", "showHomePage", "showMenu", "LarkWikiTitleInfo", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.a */
public final class LarkWikiTitleBar implements AbstractC8505c {

    /* renamed from: a */
    public final Context f32932a;

    /* renamed from: b */
    public final AbstractC5226b.AbstractC5227a f32933b;

    /* renamed from: c */
    private final LarkWikiTitleInfo f32934c;

    /* renamed from: d */
    private final C8506d f32935d;

    /* renamed from: e */
    private final ITitleController f32936e;

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33175a() {
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public View getCreateView() {
        return null;
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleType() {
        return 0;
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: k */
    public void mo33198k() {
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setSearchViewClickListener(View.OnClickListener onClickListener) {
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public void setTitle(String str) {
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/LarkWikiTitleBar$LarkWikiTitleInfo;", "Lcom/ss/android/lark/maincore/ITitleInfo;", "(Lcom/bytedance/ee/bear/wikiv2/home/LarkWikiTitleBar;)V", "functionButtons", "", "Lcom/ss/android/lark/maincore/IFunctionButton;", "isShow", "", "getClickListener", "Lcom/ss/android/lark/maincore/ITitleInfo$ClickListener;", "getFunctionButtonList", "", "getIconStyle", "Lcom/ss/android/lark/maincore/ITitleInfo$IconStyle;", "getName", "", "getSelectedItem", "Lcom/ss/android/lark/maincore/ITitleInfo$SelectedItem;", "getStatus", "Lcom/ss/android/lark/maincore/ITitleInfo$Status;", "setShow", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.a$a */
    public final class LarkWikiTitleInfo implements ITitleInfo {

        /* renamed from: b */
        private final List<AbstractC44545b> f32938b;

        /* renamed from: c */
        private boolean f32939c = true;

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: f */
        public ITitleInfo.AbstractC44542a mo33260f() {
            return null;
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
        /* renamed from: d */
        public List<AbstractC44545b> mo33258d() {
            return this.f32938b;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: e */
        public ITitleInfo.Status mo33259e() {
            return ITitleInfo.Status.Normal;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: a */
        public boolean mo33255a() {
            return this.f32939c;
        }

        @Override // com.ss.android.lark.maincore.ITitleInfo
        /* renamed from: b */
        public String mo33256b() {
            String string = LarkWikiTitleBar.this.f32932a.getString(R.string.Doc_Wiki_Home_Title);
            Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.string.Doc_Wiki_Home_Title)");
            return string;
        }

        /* renamed from: a */
        public final void mo46815a(boolean z) {
            this.f32939c = z;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public LarkWikiTitleInfo() {
            ArrayList arrayList = new ArrayList();
            this.f32938b = arrayList;
            arrayList.add(new AbstractC44545b(this) {
                /* class com.bytedance.ee.bear.wikiv2.home.LarkWikiTitleBar.LarkWikiTitleInfo.C122541 */

                /* renamed from: a */
                final /* synthetic */ LarkWikiTitleInfo f32940a;

                {
                    this.f32940a = r1;
                }

                @Override // com.ss.android.lark.maincore.AbstractC44545b
                public final View getContentView() {
                    return C12286e.m51163a(LarkWikiTitleBar.this.f32932a, new AbstractView$OnClickListenerC11839e(this) {
                        /* class com.bytedance.ee.bear.wikiv2.home.LarkWikiTitleBar.LarkWikiTitleInfo.C122541.C122551 */

                        /* renamed from: a */
                        final /* synthetic */ C122541 f32941a;

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f32941a = r1;
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                        /* renamed from: a */
                        public void mo16698a(View view) {
                            Intrinsics.checkParameterIsNotNull(view, "v");
                            AbstractC5226b.AbstractC5227a aVar = LarkWikiTitleBar.this.f32933b;
                            if (aVar != null) {
                                aVar.onClickSearchBtn();
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: b */
    public final ITitleInfo mo46814b() {
        return this.f32934c;
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    public int getTitleBarHeight() {
        return this.f32936e.mo99189a();
    }

    @Override // com.bytedance.ee.bear.list.homepage.title.AbstractC8505c
    /* renamed from: a */
    public void mo33176a(int i, int i2) {
        boolean b = this.f32935d.mo33248b(i2);
        C13479a.m54772d("WikiTitleBarV2", "onScrollBy, visible:" + b);
        this.f32934c.mo46815a(b);
        this.f32936e.mo99192a(b);
    }

    public LarkWikiTitleBar(Context context, ITitleController iTitleController, AbstractC5226b.AbstractC5227a aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iTitleController, "larkTitleController");
        this.f32932a = context;
        this.f32936e = iTitleController;
        this.f32933b = aVar;
        int a = iTitleController.mo99189a();
        this.f32935d = new C8506d(a, a, a);
        LarkWikiTitleInfo aVar2 = new LarkWikiTitleInfo();
        this.f32934c = aVar2;
        iTitleController.mo99191a(aVar2);
    }
}
