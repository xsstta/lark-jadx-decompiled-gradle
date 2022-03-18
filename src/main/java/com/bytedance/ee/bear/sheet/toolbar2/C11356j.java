package com.bytedance.ee.bear.sheet.toolbar2;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.browser.plugin.PluginInfoExtractException;
import com.bytedance.ee.bear.document.DocumentMetadata;
import com.bytedance.ee.bear.document.EditorAbility;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarV2;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7610d;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e;
import com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7616f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.sheet.inputbar.AbstractC11188a;
import com.bytedance.ee.bear.sheet.inputbar.AbstractC11214b;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout;
import com.bytedance.ee.bear.sheet.toolbar2.SheetBlockToolbarV2;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13749l;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.toolbar2.j */
public class C11356j extends AbstractC7612e<SheetBlockToolbarV2> {

    /* renamed from: a */
    public static int f30508a = (-C13749l.m55758d(C13615c.f35773a, 44));

    /* renamed from: l */
    public static int f30509l = 0;

    /* renamed from: m */
    static final /* synthetic */ boolean f30510m = true;

    /* renamed from: n */
    private DocumentMetadata f30511n;

    /* renamed from: o */
    private C11359k f30512o;

    /* renamed from: p */
    private SheetEditorLayout f30513p;

    /* renamed from: q */
    private IStatusBar f30514q;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: b */
    public Class<? extends AbstractC6207c> mo29929b(ItemIdV2 itemIdV2) {
        return null;
    }

    /* renamed from: e */
    private void m47128e() {
        C13479a.m54772d("SheetBlockToolbarV2PanelFragment", "closeSheetEditor");
        this.f30513p.mo42987l();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public AbstractC7616f mo22165a() {
        return (AbstractC7616f) C4950k.m20474a(this, C11359k.class);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f30513p.mo42966a();
    }

    /* renamed from: b */
    private int m47125b() {
        if (this.f30511n.getUrl() != null) {
            return C10599b.m43898a(C8275a.m34055d(C6313i.m25327a().mo25399g(this.f30511n.getUrl()).f17446a));
        }
        return C8275a.f22371d.mo32555b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.sheet.toolbar2.j$2 */
    public static /* synthetic */ class C113582 {

        /* renamed from: a */
        static final /* synthetic */ int[] f30516a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId[] r0 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a = r0
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.addNewBlock     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.cellAttribute     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.alignTransform     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.textTransform     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.checkbox     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.reminder     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.insertImage     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.f30516a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId r1 = com.bytedance.ee.bear.sheet.toolbar2.SheetBlockPrimaryItemId.mention     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113582.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public int mo29924a(ItemIdV2 itemIdV2) {
        return m47126d(itemIdV2);
    }

    /* renamed from: a */
    private void m47123a(SheetBlockToolbarV2.Input input) {
        C13479a.m54772d("SheetBlockToolbarV2PanelFragment", "showSheetEditor");
        this.f30513p.setCellStyle(input.style);
        this.f30513p.mo42971a(input.getSegments(), input.getToken(), m47125b());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m47127d(int i) {
        if (this.f30512o.getInputHeight() != i) {
            this.f30512o.setInputHeight(i);
            this.f20660b.requestUpdateContentHeight();
        }
    }

    /* renamed from: b */
    public void mo43468b(int i) {
        ViewGroup.LayoutParams layoutParams = this.f30513p.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            this.f30513p.setLayoutParams(marginLayoutParams);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: c */
    public Class<? extends AbstractC7610d> mo29930c(ItemIdV2 itemIdV2) {
        if (itemIdV2 == SheetBlockPrimaryItemId.cellAttribute) {
            return C11339e.class;
        }
        if (itemIdV2 == SheetBlockPrimaryItemId.textTransform) {
            return C11354i.class;
        }
        if (itemIdV2 == SheetBlockPrimaryItemId.alignTransform) {
            return C11331b.class;
        }
        return null;
    }

    /* renamed from: a */
    private void m47124a(SheetBlockToolbarV2 sheetBlockToolbarV2) {
        SheetBlockToolbarV2.Input input;
        boolean z;
        if (sheetBlockToolbarV2 == null) {
            input = null;
        } else {
            input = sheetBlockToolbarV2.getInput();
        }
        if (sheetBlockToolbarV2 == null || !TextUtils.isEmpty(sheetBlockToolbarV2.getShowingItemId()) || input == null) {
            z = false;
        } else {
            z = f30510m;
        }
        if (z) {
            mo22165a().clearSubToolbar();
            mo29950a(f30510m);
            m47123a(input);
            this.f30512o.setShowingInput(f30510m);
            return;
        }
        m47128e();
        this.f30512o.setShowingInput(false);
    }

    /* renamed from: c */
    public void mo43469c(boolean z) {
        FragmentActivity activity = getActivity();
        if (!f30510m && activity == null) {
            throw new AssertionError();
        } else if (z) {
            IStatusBar aVar = this.f30514q;
            if (aVar != null) {
                aVar.mo50687a();
                this.f30514q.mo50690b(R.color.space_kit_n400, f30510m);
            }
        } else {
            IStatusBar aVar2 = this.f30514q;
            if (aVar2 != null) {
                aVar2.mo50689b();
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30512o = (C11359k) C4950k.m20474a(this, C11359k.class);
        try {
            this.f30511n = ((EditorAbility) C4943e.m20402a(this).mo19551b(EditorAbility.class)).mo24602q();
        } catch (PluginInfoExtractException e) {
            e.printStackTrace();
        }
        this.f30514q = StatusBarManager.m55628a(getActivity());
    }

    /* renamed from: d */
    private int m47126d(ItemIdV2 itemIdV2) {
        if (!(itemIdV2 instanceof SheetBlockPrimaryItemId)) {
            return 0;
        }
        switch (C113582.f30516a[((SheetBlockPrimaryItemId) itemIdV2).ordinal()]) {
            case 1:
                return R.drawable.ud_icon_more_add_outlined;
            case 2:
                return R.drawable.ud_icon_sheet_table_outlined;
            case 3:
                return R.drawable.ud_icon_typography_outlined;
            case 4:
                return R.drawable.ud_icon_textstyle_outlined;
            case 5:
                return R.drawable.ud_icon_todo_outlined;
            case 6:
                return R.drawable.ud_icon_calendar_outlined;
            case 7:
                return R.drawable.ud_icon_image_outlined;
            case 8:
                return R.drawable.ud_icon_at_outlined;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public boolean mo29928a(Fragment fragment) {
        if ((fragment instanceof C11344g) || (fragment instanceof C11342f)) {
            return false;
        }
        return f30510m;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public void mo22166a(ItemIdV2 itemIdV2, String str) {
        if (itemIdV2 == ItemIdV2.ConstId.keyboard) {
            if (f30510m || getActivity() != null) {
                str = String.valueOf(AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39935i());
            } else {
                throw new AssertionError();
            }
        } else if (itemIdV2 == SheetBlockPrimaryItemId.alignTransform || itemIdV2 == SheetBlockPrimaryItemId.cellAttribute || itemIdV2 == SheetBlockPrimaryItemId.textTransform) {
            C10548d.m43696a(getContext());
        }
        super.mo22166a(itemIdV2, str);
        this.f30513p.mo42966a();
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f20663e.setImageResource(R.drawable.doc_toolbar_keyboard_selector);
        SheetEditorLayout sheetEditorLayout = (SheetEditorLayout) view.findViewById(R.id.sheetEdit);
        this.f30513p = sheetEditorLayout;
        sheetEditorLayout.setDocumentUrl(this.f30511n.getBearUrl());
        this.f30513p.setEditDelegate((AbstractC11188a) this.f20660b);
        this.f30513p.setHeightChangeListener(new SheetEditorLayout.AbstractC11229a() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.$$Lambda$j$zSdLIrcpdyuOlDcVwSZMI4O1rk */

            @Override // com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AbstractC11229a
            public final void onHeightChange(int i) {
                C11356j.this.m47127d((C11356j) i);
            }
        });
        this.f30513p.setFullScreenCallback(new AbstractC11214b() {
            /* class com.bytedance.ee.bear.sheet.toolbar2.C11356j.C113571 */

            @Override // com.bytedance.ee.bear.sheet.inputbar.AbstractC11214b
            /* renamed from: a */
            public void mo42924a() {
                C11356j.this.mo43469c(C11356j.f30510m);
                C11356j.this.f20664f.setVisibility(8);
                C11356j.this.mo43468b(C11356j.f30509l);
            }

            @Override // com.bytedance.ee.bear.sheet.inputbar.AbstractC11214b
            /* renamed from: b */
            public void mo42925b() {
                C11356j.this.mo43469c(false);
                C11356j.this.f20664f.setVisibility(0);
                C11356j.this.mo43468b(C11356j.f30508a);
            }
        });
        mo43468b(f30508a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29949a(SheetBlockToolbarV2 sheetBlockToolbarV2, int i) {
        int i2 = 8;
        if (sheetBlockToolbarV2 == null || sheetBlockToolbarV2.getItems() == null || sheetBlockToolbarV2.getItems().length == 0) {
            this.f20664f.setVisibility(8);
        } else {
            View view = this.f20664f;
            if (!this.f30513p.mo42985j()) {
                i2 = 0;
            }
            view.setVisibility(i2);
            mo29948a((ToolbarV2) sheetBlockToolbarV2);
        }
        m47124a(sheetBlockToolbarV2);
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.sheet_toolbar_v2_fragment, viewGroup, false);
    }
}
