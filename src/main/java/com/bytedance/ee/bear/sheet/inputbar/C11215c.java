package com.bytedance.ee.bear.sheet.inputbar;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6238c;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.fab.C11143b;
import com.bytedance.ee.bear.sheet.fab.FabItemEnum;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetInputData;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.C11244a;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.ScrollLinearLayoutManager;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13630j;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.bytedence.ee.bear.fabview.FabView;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.ttm.player.MediaPlayer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.c */
public class C11215c extends C7667e implements AbstractC10549e {

    /* renamed from: e */
    static final /* synthetic */ boolean f30146e = true;

    /* renamed from: a */
    public C11219d f30147a;

    /* renamed from: b */
    public IStatusBar f30148b;

    /* renamed from: c */
    public SheetEditorLayout f30149c;

    /* renamed from: d */
    public C11244a f30150d;

    /* renamed from: f */
    private C6215b f30151f;

    /* renamed from: g */
    private C11088a f30152g;

    /* renamed from: h */
    private String f30153h;

    /* renamed from: i */
    private BearUrl f30154i;

    /* renamed from: j */
    private boolean f30155j;

    /* renamed from: k */
    private View f30156k;

    /* renamed from: l */
    private RecyclerView f30157l;

    /* renamed from: m */
    private View f30158m;

    /* renamed from: n */
    private Fragment f30159n;

    /* renamed from: o */
    private boolean f30160o;

    /* renamed from: p */
    private C6238c f30161p;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46623a(Boolean bool) {
        if (!bool.booleanValue()) {
            m46637k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46625a(SheetInputData.SheetToolbarItem[] sheetToolbarItemArr) {
        this.f30150d.mo43115a(sheetToolbarItemArr != null ? Arrays.asList(sheetToolbarItemArr) : Collections.EMPTY_LIST);
    }

    /* renamed from: a */
    public void mo42926a(ToolbarItemEnum toolbarItemEnum) {
        this.f30147a.notifyToolbarItemClicked(toolbarItemEnum);
        if (toolbarItemEnum == ToolbarItemEnum.mention) {
            this.f30149c.mo42988m();
            m46624a(ToolbarItemEnum.text.name());
        }
    }

    /* renamed from: a */
    private void m46624a(String str) {
        if (!TextUtils.isEmpty(str)) {
            List<SheetInputData.SheetToolbarItem> a = this.f30150d.mo43111a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f30150d.getItemCount()) {
                    break;
                } else if (TextUtils.equals(str, a.get(i2).getId())) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            this.f30150d.mo43112a(i);
            this.f30157l.scrollToPosition(i);
        }
    }

    /* renamed from: a */
    private void m46615a() {
        m46626b();
        m46628c();
        m46631e();
        m46632f();
    }

    /* renamed from: e */
    private void m46631e() {
        this.f30158m = this.f30156k.findViewById(R.id.sub_panel_container);
    }

    /* renamed from: d */
    private boolean m46630d() {
        return ((IAdminPermissionProxy) KoinJavaComponent.m268610a(IAdminPermissionProxy.class)).mo36541a(C8275a.f22372e.mo32555b(), this.f30153h) ^ f30146e;
    }

    /* renamed from: h */
    private ToolbarItemEnum m46634h() {
        SheetInputData.SheetToolbarItem b = this.f30150d.mo43116b();
        if (b != null) {
            return ToolbarItemEnum.getToolbarItemEnumByName(b.getId());
        }
        return null;
    }

    /* renamed from: j */
    private void m46636j() {
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        Fragment fragment = this.f30159n;
        if (fragment != null) {
            beginTransaction.hide(fragment).commitAllowingStateLoss();
        }
        m46637k();
    }

    /* renamed from: k */
    private void m46637k() {
        if (getActivity() != null) {
            FileSelectorManager.m31233a(getActivity().getSupportFragmentManager(), "SheetEditFragment");
        }
    }

    /* renamed from: l */
    private void m46638l() {
        TranslateAnimation translateAnimation = (TranslateAnimation) AnimationUtils.loadAnimation(getActivity(), R.anim.panel_enter);
        translateAnimation.setDuration(200);
        this.f30156k.findViewById(R.id.sheet_edit_view).startAnimation(translateAnimation);
    }

    /* renamed from: f */
    private void m46632f() {
        FabView fabView = (FabView) this.f30156k.findViewById(R.id.sheet_operation_fab);
        fabView.setOnClickListener(new View.OnClickListener((C11143b) C4950k.m20474a(this, C11143b.class)) {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$CdKeSa0qdpBctPjD7ZsnJJo4aPw */
            public final /* synthetic */ C11143b f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C11215c.this.m46620a((C11215c) this.f$1, (C11143b) view);
            }
        });
        this.f30147a.isHideFab().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$_axjBQYjb8hG0eGJUN1Byin1Jes */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11215c.m46622a(FabView.this, (Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (this.f30160o) {
            this.f30152g.mo42269b(this.f30149c.mo42989n());
        }
        this.f30152g.mo42256B();
        this.f30149c.mo42987l();
        this.f30149c.mo42966a();
        this.f30147a.setEditable(null);
        C10548d.m43696a(getContext());
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39928b(this);
        super.onDestroyView();
    }

    /* renamed from: b */
    private void m46626b() {
        SheetEditorLayout sheetEditorLayout = (SheetEditorLayout) this.f30156k.findViewById(R.id.sheet_edit_input_box);
        this.f30149c = sheetEditorLayout;
        sheetEditorLayout.setNeedShowKeyboard(false);
        this.f30149c.mo42990o();
        this.f30149c.setAtIconVisibility(8);
        this.f30149c.setDocumentUrl(this.f30154i);
        this.f30149c.setEditDelegate(this.f30147a.getEditDelegate());
        this.f30149c.setHeightChangeListener(new SheetEditorLayout.AbstractC11229a() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$KunQPLeelOMs0G8umLoemRCw6gE */

            @Override // com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AbstractC11229a
            public final void onHeightChange(int i) {
                C11215c.this.m46616a((C11215c) i);
            }
        });
        this.f30149c.setFullScreenCallback(new AbstractC11214b() {
            /* class com.bytedance.ee.bear.sheet.inputbar.C11215c.C112161 */

            @Override // com.bytedance.ee.bear.sheet.inputbar.AbstractC11214b
            /* renamed from: a */
            public void mo42924a() {
                C11215c.this.f30147a.setEditable(C11215c.this.f30149c.getFullEditable());
                C11215c.this.f30147a.setExpand(Boolean.valueOf((boolean) C11215c.f30146e));
                C11215c.this.f30148b.mo50687a();
                C11215c.this.f30148b.mo50688a(C11215c.this.getResources().getColor(R.color.sheet_gray_c3), C11215c.f30146e);
            }

            @Override // com.bytedance.ee.bear.sheet.inputbar.AbstractC11214b
            /* renamed from: b */
            public void mo42925b() {
                C11215c.this.f30147a.setEditable(C11215c.this.f30149c.getInputEditable());
                C11215c.this.f30147a.setExpand(false);
                C11215c.this.f30148b.mo50689b();
            }
        });
        this.f30149c.setInputTextChangedListener(new SheetEditorLayout.AbstractC11230b() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$1uLIFKF9V6FYTzpJepsDlfeqUk */

            @Override // com.bytedance.ee.bear.sheet.inputbar.editor.SheetEditorLayout.AbstractC11230b
            public final void afterTextChanged(Editable editable) {
                C11215c.this.m46617a((C11215c) editable);
            }
        });
        this.f30156k.findViewById(R.id.sheet_editor_divider).setVisibility(8);
    }

    /* renamed from: c */
    private void m46628c() {
        RecyclerView recyclerView = (RecyclerView) this.f30156k.findViewById(R.id.toolbar_items_rv);
        this.f30157l = recyclerView;
        recyclerView.setLayoutManager(new ScrollLinearLayoutManager(getContext(), 0, false));
        C11244a aVar = new C11244a();
        this.f30150d = aVar;
        this.f30157l.setAdapter(aVar);
        ToolbarItemEnum.insertImage.adminLimit = m46630d();
        this.f30150d.mo43113a(new C11244a.AbstractC11247a() {
            /* class com.bytedance.ee.bear.sheet.inputbar.C11215c.C112172 */

            @Override // com.bytedance.ee.bear.sheet.inputbar.toolbar.C11244a.AbstractC11247a
            /* renamed from: a */
            public void mo42928a(ToolbarItemEnum toolbarItemEnum) {
                C11215c.this.mo42926a(toolbarItemEnum);
            }

            @Override // com.bytedance.ee.bear.sheet.inputbar.toolbar.C11244a.AbstractC11247a
            /* renamed from: b */
            public void mo42929b(ToolbarItemEnum toolbarItemEnum) {
                C11215c.this.mo42927b(toolbarItemEnum);
            }
        });
        this.f30156k.findViewById(R.id.toolbar_shortcut).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$uNzhJBz7yRB5VGXkPgEB2g7n0g */

            public final void onClick(View view) {
                C11215c.this.m46618a((C11215c) view);
            }
        });
        final View findViewById = this.f30156k.findViewById(R.id.mark);
        final RecyclerView.LayoutManager layoutManager = this.f30157l.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            this.f30157l.addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.bytedance.ee.bear.sheet.inputbar.C11215c.C112183 */

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
                    int itemCount = C11215c.this.f30150d.getItemCount();
                    boolean z = C11215c.f30146e;
                    int i3 = 0;
                    if (findLastCompletelyVisibleItemPosition != itemCount - 1) {
                        z = false;
                    }
                    View view = findViewById;
                    if (z) {
                        i3 = 8;
                    }
                    view.setVisibility(i3);
                }
            });
        }
    }

    /* renamed from: g */
    private void m46633g() {
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39924a(this);
        AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39925a((Long) 10L);
        this.f30147a.getToolbarItems().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$zchTK2_pp3VCIpUmwjPuSTX_Awk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11215c.this.m46625a((C11215c) ((SheetInputData.SheetToolbarItem[]) obj));
            }
        });
        this.f30147a.setExpand(Boolean.valueOf(this.f30149c.mo42989n()));
        this.f30147a.getInputData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$3_NdYmvY6DpkThrzfQ_s1paIKWs */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11215c.this.m46621a((C11215c) ((SheetInputData.InputData) obj));
            }
        });
        this.f30147a.getFormat().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$U5QuFmUJ91JAKll78B1UO4v1YbY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11215c.this.m46629c((C11215c) ((String) obj));
            }
        });
        this.f30147a.getDateType().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$ApUv6x_ni65IRzC2zeEjEpaSj2o */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C11215c.this.m46627b((C11215c) ((String) obj));
            }
        });
    }

    /* renamed from: i */
    private void m46635i() {
        if (isAdded()) {
            m46637k();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f30158m.getLayoutParams();
            layoutParams.height = this.f30147a.getSheetKeyboardFixedHeight(getActivity());
            this.f30147a.getCustomKeyboardHeight().mo5929b(Integer.valueOf(layoutParams.height));
            this.f30158m.setLayoutParams(layoutParams);
            FragmentManager childFragmentManager = getChildFragmentManager();
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            Fragment fragment = this.f30159n;
            if (fragment != null) {
                beginTransaction.hide(fragment);
            }
            String str = m46634h().fragment;
            if (!TextUtils.isEmpty(str)) {
                Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(str);
                if (findFragmentByTag == null) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("EnableExternalSelect", this.f30155j ^ f30146e);
                    C4943e.m20406a(this, bundle);
                    findFragmentByTag = Fragment.instantiate(getContext(), str, bundle);
                    beginTransaction.add(R.id.sub_panel_container, findFragmentByTag, str).commitAllowingStateLoss();
                } else {
                    beginTransaction.show(findFragmentByTag).commitAllowingStateLoss();
                }
                this.f30159n = findFragmentByTag;
                if (ToolbarItemEnum.insertImage.equals(m46634h()) && getActivity() != null) {
                    FileSelectConfig.C7789d defaultBuilder = this.f30161p.getDefaultBuilder(getActivity());
                    defaultBuilder.mo30472j(this.f30155j ^ f30146e);
                    defaultBuilder.mo30473k(false);
                    defaultBuilder.mo30468h(this.f30147a.getSheetKeyboardFixedHeight(getActivity()));
                    this.f30161p.showInsertImageSelectorPanel(getActivity(), defaultBuilder, "SheetEditFragment");
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46627b(String str) {
        this.f30149c.setDateType(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m46629c(String str) {
        this.f30149c.setFormat(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46617a(Editable editable) {
        if (ToolbarItemEnum.text.equals(m46634h())) {
            this.f30160o = f30146e;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46616a(int i) {
        C13479a.m54772d("SheetEditFragment", "inputBox height changed: " + i);
        this.f30147a.setInputHeight(i);
        this.f30151f.requestUpdateWebContentHeight();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46618a(View view) {
        C13630j.m55310a(getContext(), 10, 50);
        this.f30147a.setActive(false);
        m46637k();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46619a(C11143b bVar) {
        bVar.clickItem(FabItemEnum.operation.name(), null);
    }

    /* renamed from: b */
    public void mo42927b(ToolbarItemEnum toolbarItemEnum) {
        ToolbarItemEnum toolbarItemEnum2;
        String name = toolbarItemEnum.name();
        if (TextUtils.equals(toolbarItemEnum.name(), "text") || TextUtils.equals(toolbarItemEnum.name(), "number") || TextUtils.equals(toolbarItemEnum.name(), "date")) {
            this.f30147a.getFormat().mo5929b(name);
        }
        this.f30152g.mo42261a(toolbarItemEnum);
        if (ToolbarItemEnum.text.equals(m46634h())) {
            KeyboardUtils.showKeyboard(getContext());
        } else {
            KeyboardUtils.hideKeyboard(getContext());
            m46635i();
            this.f30149c.mo42966a();
            if (this.f30160o) {
                this.f30152g.mo42269b(this.f30149c.mo42989n());
                this.f30160o = false;
            }
        }
        if (ToolbarItemEnum.date.equals(m46634h())) {
            this.f30149c.setCursorVisible(false);
            this.f30149c.setNewLineEnable(false);
            this.f30149c.mo42970a("date", this.f30147a.getDateKeyboardCurType());
            return;
        }
        this.f30147a.getDateType().mo5929b("");
        SheetEditorLayout sheetEditorLayout = this.f30149c;
        if (ToolbarItemEnum.number.equals(m46634h())) {
            toolbarItemEnum2 = ToolbarItemEnum.number;
        } else {
            toolbarItemEnum2 = ToolbarItemEnum.text;
        }
        sheetEditorLayout.mo42970a(toolbarItemEnum2.name(), "");
        this.f30149c.setCursorVisible(ToolbarItemEnum.insertImage.equals(m46634h()) ^ f30146e);
        this.f30149c.setNewLineEnable(f30146e);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        if (f30146e || getActivity() != null) {
            DocViewModel docViewModel = (DocViewModel) C4950k.m20474a(this, DocViewModel.class);
            this.f30153h = docViewModel.getToken();
            this.f30154i = docViewModel.getBearUrl();
            if (docViewModel.getOpenSource() == DocsOpenSource.vc) {
                z = f30146e;
            } else {
                z = false;
            }
            this.f30155j = z;
            this.f30161p = (C6238c) aj.m5366a(getActivity()).mo6005a(C6238c.class);
            this.f30147a = (C11219d) C4950k.m20474a(this, C11219d.class);
            this.f30151f = (C6215b) aj.m5366a(getActivity()).mo6005a(C6215b.class);
            C11088a aVar = new C11088a();
            this.f30152g = aVar;
            aVar.mo42260a(this.f30154i);
            this.f30148b = StatusBarManager.m55628a(getActivity());
            this.f30147a.getActive().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$pfF14UYma97GaWGkvhPlrLlkaI */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C11215c.this.m46623a((C11215c) ((Boolean) obj));
                }
            });
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46621a(SheetInputData.InputData inputData) {
        if (inputData != null) {
            this.f30149c.setCellStyle(inputData.getStyle());
            this.f30149c.mo42971a(inputData.getSegments(), this.f30153h, 3);
            this.f30147a.setEditable(this.f30149c.getInputEditable());
            this.f30147a.getDateType().mo5929b(inputData.getDateType());
            this.f30147a.getFormat().mo5929b(inputData.getFormat());
            m46624a(inputData.getFormat());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f30156k = view;
        m46638l();
        m46615a();
        m46633g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m46620a(C11143b bVar, View view) {
        this.f30152g.mo42287j();
        this.f30147a.setActive(false);
        m46637k();
        bVar.setFabHideTime(Integer.valueOf((int) MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL));
        C13742g.m55706a(new Runnable() {
            /* class com.bytedance.ee.bear.sheet.inputbar.$$Lambda$c$OR7RHAKMTvzyGfyN4UyWrJMxSxg */

            public final void run() {
                C11215c.m46619a(C11143b.this);
            }
        }, 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m46622a(FabView fabView, Boolean bool) {
        int i;
        if (Boolean.TRUE.equals(bool)) {
            i = 8;
        } else {
            i = 0;
        }
        fabView.setVisibility(i);
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z || ToolbarItemEnum.text.equals(m46634h())) {
            return super.onCreateAnimation(i, z, i2);
        }
        return AnimationUtils.loadAnimation(getActivity(), R.anim.panel_exit);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.sheet_edit_fragment, viewGroup, false);
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        this.f30151f.requestUpdateWebContentHeight();
        this.f30147a.setSystemKeyboardHeight(i);
        if (i == 0 && ToolbarItemEnum.text.equals(m46634h())) {
            this.f30147a.setActive(false);
        } else if (ToolbarItemEnum.text.equals(m46634h())) {
            m46636j();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f30158m.getLayoutParams();
            layoutParams.height = i;
            this.f30158m.setLayoutParams(layoutParams);
        }
    }
}
