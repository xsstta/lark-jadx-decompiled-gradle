package com.bytedance.ee.bear.list.loadstateview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.list.loadstateview.LoadStateView;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

public class LoadStateView extends FrameLayout {

    /* renamed from: a */
    C8578j f23260a;

    /* renamed from: b */
    C8572d f23261b;

    /* renamed from: c */
    C8576h f23262c;

    /* renamed from: d */
    C8571c f23263d;

    /* renamed from: e */
    C8575g f23264e;

    /* renamed from: f */
    EnumC8569a f23265f = EnumC8569a.NONE;

    /* renamed from: g */
    ViewTreeObserver.OnPreDrawListener f23266g = new ViewTreeObserver.OnPreDrawListener() {
        /* class com.bytedance.ee.bear.list.loadstateview.LoadStateView.ViewTreeObserver$OnPreDrawListenerC85671 */

        public boolean onPreDraw() {
            if (LoadStateView.this.f23265f == EnumC8569a.NONE || LoadStateView.this.getVisibility() != 0) {
                return true;
            }
            LoadStateView.this.mo33447a();
            return true;
        }
    };

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$a */
    public enum EnumC8569a {
        NONE,
        LOADING,
        LOADED_FAIL,
        EMPTY
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$b */
    public interface AbstractC8570b {
        /* renamed from: a */
        void mo32735a();

        /* renamed from: b */
        void mo32736b();

        /* renamed from: c */
        void mo32737c();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$e */
    public interface AbstractC8573e {
        /* renamed from: a */
        int mo33463a();

        /* renamed from: a */
        void mo33464a(int i);

        /* renamed from: b */
        View mo33467b();
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$f */
    public interface AbstractC8574f {
        void onTouchEvent();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$d */
    public class C8572d implements AbstractC8573e {

        /* renamed from: b */
        private View f23277b;

        /* renamed from: c */
        private SpaceEmptyState f23278c;

        /* renamed from: d */
        private TextView f23279d;

        /* renamed from: e */
        private int f23280e;

        /* renamed from: f */
        private AbstractC8570b f23281f;

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: a */
        public int mo33463a() {
            return this.f23280e;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: b */
        public View mo33467b() {
            m35765d();
            return this.f23277b;
        }

        /* renamed from: c */
        public void mo33468c() {
            View view = this.f23277b;
            if (view != null) {
                this.f23280e = 0;
                view.setVisibility(8);
            }
        }

        /* renamed from: d */
        private void m35765d() {
            if (this.f23278c == null) {
                View inflate = View.inflate(LoadStateView.this.getContext(), R.layout.load_state_empty_layout, null);
                this.f23277b = inflate.findViewById(R.id.list_state_empty_root);
                this.f23278c = (SpaceEmptyState) inflate.findViewById(R.id.list_state_empty_state);
                this.f23279d = (TextView) inflate.findViewById(R.id.list_state_empty_text_btn);
                LoadStateView.this.addView(inflate, new FrameLayout.LayoutParams(-1, -2));
                this.f23278c.setPrimaryClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.bear.list.loadstateview.$$Lambda$LoadStateView$d$2dHcbu5qxlG2lyEQdLDNTOcPbhE */

                    public final void onClick(View view) {
                        LoadStateView.C8572d.this.m35764c(view);
                    }
                });
                this.f23278c.setSecondaryClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.bear.list.loadstateview.$$Lambda$LoadStateView$d$Fe5sUjeMKvXVZDHTFT8T7n0FNJk */

                    public final void onClick(View view) {
                        LoadStateView.C8572d.this.m35762b((LoadStateView.C8572d) view);
                    }
                });
                this.f23279d.setOnClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.bear.list.loadstateview.$$Lambda$LoadStateView$d$j_BhB5cFLtYXysQpK7K13wKMCI4 */

                    public final void onClick(View view) {
                        LoadStateView.C8572d.this.m35761a((LoadStateView.C8572d) view);
                    }
                });
            }
        }

        private C8572d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m35761a(View view) {
            AbstractC8570b bVar = this.f23281f;
            if (bVar != null) {
                bVar.mo32737c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m35762b(View view) {
            AbstractC8570b bVar = this.f23281f;
            if (bVar != null) {
                bVar.mo32736b();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m35764c(View view) {
            AbstractC8570b bVar = this.f23281f;
            if (bVar != null) {
                bVar.mo32735a();
            }
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: a */
        public void mo33464a(int i) {
            this.f23280e = i;
        }

        /* renamed from: a */
        public void mo33465a(AbstractC8570b bVar) {
            this.f23281f = bVar;
        }

        /* renamed from: a */
        public void mo33466a(C8571c cVar) {
            m35765d();
            m35763b(cVar);
            LoadStateView.this.mo33450a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00bd  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m35763b(com.bytedance.ee.bear.list.loadstateview.LoadStateView.C8571c r7) {
            /*
            // Method dump skipped, instructions count: 223
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.loadstateview.LoadStateView.C8572d.m35763b(com.bytedance.ee.bear.list.loadstateview.LoadStateView$c):void");
        }

        /* renamed from: a */
        private String m35760a(Resources resources, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return resources.getString(resources.getIdentifier(str, "string", LoadStateView.this.getContext().getPackageName()));
                } catch (Exception unused) {
                    C13479a.m54758a("load_state_view_module", "EmptyViewHolder getTagString: fetch resource fail: " + str2 + " = " + str);
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$h */
    public class C8576h implements AbstractC8573e {

        /* renamed from: b */
        private SpaceEmptyState f23288b;

        /* renamed from: c */
        private int f23289c;

        /* renamed from: d */
        private AbstractC8574f f23290d;

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: a */
        public int mo33463a() {
            return this.f23289c;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: b */
        public View mo33467b() {
            m35783d();
            return this.f23288b;
        }

        /* renamed from: c */
        public void mo33476c() {
            SpaceEmptyState spaceEmptyState = this.f23288b;
            if (spaceEmptyState != null) {
                this.f23289c = 0;
                spaceEmptyState.setVisibility(8);
            }
        }

        /* renamed from: d */
        private void m35783d() {
            if (this.f23288b == null) {
                SpaceEmptyState spaceEmptyState = new SpaceEmptyState(LoadStateView.this.getContext());
                this.f23288b = spaceEmptyState;
                LoadStateView.this.addView(spaceEmptyState, new FrameLayout.LayoutParams(-1, -2));
                this.f23288b.setOnClickListener(new View.OnClickListener() {
                    /* class com.bytedance.ee.bear.list.loadstateview.$$Lambda$LoadStateView$h$2IaVGESpepreeiY7FynGZMygcG0 */

                    public final void onClick(View view) {
                        LoadStateView.C8576h.this.m35781a((LoadStateView.C8576h) view);
                    }
                });
            }
        }

        private C8576h() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m35781a(View view) {
            AbstractC8574f fVar = this.f23290d;
            if (fVar != null) {
                fVar.onTouchEvent();
            }
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: a */
        public void mo33464a(int i) {
            this.f23289c = i;
        }

        /* renamed from: a */
        public void mo33474a(AbstractC8574f fVar) {
            this.f23290d = fVar;
        }

        /* renamed from: a */
        public void mo33475a(C8575g gVar) {
            m35783d();
            m35782b(gVar);
            LoadStateView.this.mo33450a(this);
        }

        /* renamed from: b */
        private void m35782b(C8575g gVar) {
            if (gVar == null) {
                C13479a.m54775e("load_state_view_module", "ListStateView.java.setLoadedFailViewAttr: attr=" + gVar + " currentLoadedFailEntity=" + LoadStateView.this.f23264e);
                return;
            }
            Resources resources = LoadStateView.this.getResources();
            this.f23288b.setImageSizeResource(R.dimen.space_kit_emptystate_image_size_middle);
            int i = 0;
            if (!TextUtils.isEmpty(gVar.f23282a)) {
                try {
                    i = resources.getIdentifier(gVar.f23282a, "drawable", LoadStateView.this.getContext().getPackageName());
                } catch (Exception unused) {
                    C13479a.m54758a("load_state_view_module", "setLoadedFailViewAttr: attr.imageRes=" + gVar.f23282a);
                }
            }
            this.f23288b.setImageRes(Integer.valueOf(i));
            this.f23288b.setTitle(m35780a(resources, gVar.f23283b, "attr.masterTip"));
            this.f23288b.setDesc(m35780a(resources, gVar.f23284c, "attr.slaveTip"));
            this.f23288b.setPrimaryText(m35780a(resources, gVar.f23285d, "attr.masterBtnName"));
            this.f23288b.setSecondaryText(m35780a(resources, gVar.f23286e, "attr.slaveBtnName"));
        }

        /* renamed from: a */
        private String m35780a(Resources resources, String str, String str2) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return resources.getString(resources.getIdentifier(str, "string", LoadStateView.this.getContext().getPackageName()));
                } catch (Exception unused) {
                    C13479a.m54758a("load_state_view_module", "LoadedFailViewHolder getTagString: fetch resource fail: " + str2 + " = " + str);
                }
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$i */
    public static class C8577i {

        /* renamed from: a */
        private LoadingCategory f23291a;

        /* renamed from: b */
        private String f23292b;

        /* renamed from: a */
        public LoadingCategory mo33477a() {
            return this.f23291a;
        }

        /* renamed from: a */
        public void mo33478a(LoadingCategory loadingCategory) {
            this.f23291a = loadingCategory;
        }

        /* renamed from: a */
        public void mo33479a(String str) {
            this.f23292b = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$j */
    public class C8578j implements AbstractC8573e {

        /* renamed from: a */
        BearLottieView f23293a;

        /* renamed from: b */
        C8577i f23294b;

        /* renamed from: c */
        int f23295c;

        /* renamed from: e */
        private RelativeLayout f23297e;

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: a */
        public int mo33463a() {
            return this.f23295c;
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: b */
        public View mo33467b() {
            m35793e();
            return this.f23297e;
        }

        /* renamed from: d */
        public void mo33482d() {
            RelativeLayout relativeLayout = this.f23297e;
            if (relativeLayout != null) {
                this.f23295c = 0;
                relativeLayout.setVisibility(8);
                BearLottieView bearLottieView = this.f23293a;
                if (bearLottieView != null && bearLottieView.isAnimating()) {
                    this.f23293a.cancelAnimation();
                }
            }
        }

        /* renamed from: e */
        private void m35793e() {
            if (this.f23297e == null) {
                View inflate = View.inflate(LoadStateView.this.getContext(), R.layout.load_state_loading_layout, null);
                this.f23297e = (RelativeLayout) inflate.findViewById(R.id.list_state_loading_root);
                this.f23293a = (BearLottieView) inflate.findViewById(R.id.list_state_loading_Lottie_view);
                LoadStateView.this.addView(inflate, new FrameLayout.LayoutParams(-1, -2));
            }
        }

        /* renamed from: c */
        public void mo33481c() {
            m35793e();
            LoadStateView.this.mo33450a(this);
            BearLottieView bearLottieView = this.f23293a;
            if (bearLottieView != null && !bearLottieView.isAnimating()) {
                C8577i iVar = this.f23294b;
                if (iVar != null) {
                    this.f23293a.setAnimation(iVar.mo33477a().getResId());
                    this.f23294b = null;
                }
                this.f23293a.playAnimation();
            }
        }

        private C8578j() {
        }

        @Override // com.bytedance.ee.bear.list.loadstateview.LoadStateView.AbstractC8573e
        /* renamed from: a */
        public void mo33464a(int i) {
            this.f23295c = i;
        }

        /* renamed from: a */
        public void mo33480a(C8577i iVar) {
            if (iVar == null) {
                C13479a.m54775e("load_state_view_module", "ListStateView.java.setLoadingViewAttr: attr = " + iVar);
                return;
            }
            this.f23294b = iVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f23266g);
    }

    /* renamed from: b */
    private void m35742b() {
        this.f23260a = new C8578j();
        this.f23261b = new C8572d();
        this.f23262c = new C8576h();
        getViewTreeObserver().addOnPreDrawListener(this.f23266g);
    }

    /* renamed from: c */
    private void m35743c() {
        this.f23265f = EnumC8569a.LOADING;
        setVisibility(0);
        this.f23261b.mo33468c();
        this.f23262c.mo33476c();
        this.f23260a.mo33481c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$2 */
    public static /* synthetic */ class C85682 {

        /* renamed from: a */
        static final /* synthetic */ int[] f23268a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.bytedance.ee.bear.list.loadstateview.LoadStateView$a[] r0 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.EnumC8569a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.list.loadstateview.LoadStateView.C85682.f23268a = r0
                com.bytedance.ee.bear.list.loadstateview.LoadStateView$a r1 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.EnumC8569a.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.C85682.f23268a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.list.loadstateview.LoadStateView$a r1 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.EnumC8569a.EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.C85682.f23268a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.list.loadstateview.LoadStateView$a r1 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.EnumC8569a.LOADED_FAIL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.C85682.f23268a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.list.loadstateview.LoadStateView$a r1 = com.bytedance.ee.bear.list.loadstateview.LoadStateView.EnumC8569a.LOADING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.list.loadstateview.LoadStateView.C85682.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo33447a() {
        int i = C85682.f23268a[this.f23265f.ordinal()];
        if (i == 2) {
            mo33449a(this.f23263d);
        } else if (i == 3) {
            mo33452a(this.f23264e);
        } else if (i == 4) {
            m35743c();
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$c */
    public static class C8571c {

        /* renamed from: a */
        public String f23270a;

        /* renamed from: b */
        public String f23271b;

        /* renamed from: c */
        public String f23272c;

        /* renamed from: d */
        public String f23273d;

        /* renamed from: e */
        public String f23274e;

        /* renamed from: f */
        public String f23275f;

        /* renamed from: a */
        public void mo33457a(String str) {
            this.f23275f = str;
        }

        /* renamed from: b */
        public void mo33458b(String str) {
            this.f23270a = str;
        }

        /* renamed from: c */
        public void mo33459c(String str) {
            this.f23271b = str;
        }

        /* renamed from: d */
        public void mo33460d(String str) {
            this.f23272c = str;
        }

        /* renamed from: e */
        public void mo33461e(String str) {
            this.f23273d = str;
        }

        /* renamed from: f */
        public void mo33462f(String str) {
            this.f23274e = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.list.loadstateview.LoadStateView$g */
    public static class C8575g {

        /* renamed from: a */
        public String f23282a;

        /* renamed from: b */
        public String f23283b;

        /* renamed from: c */
        public String f23284c;

        /* renamed from: d */
        public String f23285d;

        /* renamed from: e */
        public String f23286e;

        /* renamed from: a */
        public void mo33469a(String str) {
            this.f23282a = str;
        }

        /* renamed from: b */
        public void mo33470b(String str) {
            this.f23283b = str;
        }

        /* renamed from: c */
        public void mo33471c(String str) {
            this.f23284c = str;
        }

        /* renamed from: d */
        public void mo33472d(String str) {
            this.f23285d = str;
        }

        /* renamed from: e */
        public void mo33473e(String str) {
            this.f23286e = str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33448a(AbstractC8570b bVar) {
        if (bVar == null) {
            C13479a.m54758a("load_state_view_module", "registerEmptyStateClickHandler: EmptyStateHandler is invalid");
        } else {
            this.f23261b.mo33465a(bVar);
        }
    }

    public LoadStateView(Context context) {
        super(context);
        m35742b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33451a(AbstractC8574f fVar) {
        if (fVar == null) {
            C13479a.m54775e("load_state_view_module", "registerLoadedFailStateClickHandler: LoadedFailHandler is invalid");
        } else {
            this.f23262c.mo33474a(fVar);
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            this.f23265f = EnumC8569a.NONE;
            this.f23260a.mo33482d();
            this.f23262c.mo33476c();
            this.f23261b.mo33468c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33449a(C8571c cVar) {
        if (cVar == null) {
            C13479a.m54775e("load_state_view_module", "ListStateView.java.showEmptyView: currentEmptyViewAttr=" + this.f23263d + " attr=" + cVar);
            return;
        }
        this.f23265f = EnumC8569a.EMPTY;
        this.f23263d = cVar;
        setVisibility(0);
        this.f23260a.mo33482d();
        this.f23262c.mo33476c();
        this.f23261b.mo33466a(cVar);
    }

    /* renamed from: a */
    public void mo33450a(AbstractC8573e eVar) {
        if (eVar != null && getVisibility() == 0) {
            Rect rect = new Rect();
            if (getGlobalVisibleRect(rect) && rect.height() > 0) {
                try {
                    View b = eVar.mo33467b();
                    int height = (rect.height() - b.getMeasuredHeight()) / 2;
                    if (height > 0 && Math.abs(height - eVar.mo33463a()) > 5) {
                        eVar.mo33464a(height);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b.getLayoutParams();
                        layoutParams.setMargins(0, height, 0, 0);
                        b.setLayoutParams(layoutParams);
                    }
                    if (b.getVisibility() != 0) {
                        b.setVisibility(0);
                    }
                } catch (Exception e) {
                    C13479a.m54759a("load_state_view_module", "showAndAdjustLayoutPosition: ", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33452a(C8575g gVar) {
        if (gVar == null) {
            C13479a.m54775e("load_state_view_module", "ListStateView.java.showLoadedFailView: 46 attr is null");
            return;
        }
        this.f23265f = EnumC8569a.LOADED_FAIL;
        this.f23264e = gVar;
        setVisibility(0);
        this.f23260a.mo33482d();
        this.f23261b.mo33468c();
        this.f23262c.mo33475a(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo33453a(C8577i iVar) {
        if (iVar == null) {
            C13479a.m54764b("load_state_view_module", "ListStateView.java.showLoadingView: attr = " + iVar);
            return;
        }
        this.f23260a.mo33480a(iVar);
        m35743c();
    }

    public LoadStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35742b();
    }

    public LoadStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35742b();
    }
}
