package com.bytedance.ee.bear.doc.structure;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.doc.structure.C5522a;
import com.bytedance.ee.bear.doc.structure.Structure;
import com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a;
import com.bytedance.ee.bear.document.toolbar.editpanels.C6215b;
import com.bytedance.ee.bear.facade.common.AbstractC7666d;
import com.bytedance.ee.bear.facade.common.AbstractC7710h;
import com.bytedance.ee.bear.facade.common.AbstractC7719m;
import com.bytedance.ee.bear.facade.common.AbstractC7720n;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.doc.structure.a */
public class C5522a extends DialogInterface$OnCancelListenerC1021b implements AbstractC7666d, AbstractC7720n {

    /* renamed from: f */
    static final /* synthetic */ boolean f15710f;

    /* renamed from: c */
    public C5537d f15711c;

    /* renamed from: d */
    public AbstractC5535c<Structure> f15712d;

    /* renamed from: e */
    public boolean f15713e;

    /* renamed from: g */
    private AbstractC7719m f15714g;

    /* renamed from: h */
    private C5524a f15715h;

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d
    public boolean onBackPressed() {
        mo5513b();
        return f15710f;
    }

    /* renamed from: com.bytedance.ee.bear.doc.structure.a$a */
    private class C5524a implements AbstractC6214a {

        /* renamed from: b */
        private C1177w<Boolean> f15718b;

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public String getPanelName() {
            return "catalog";
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void requestNotFocus(Context context) {
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public boolean shouldNotifyVCKeyboardEvent() {
            return false;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public LiveData<Boolean> getActive() {
            if (this.f15718b == null) {
                this.f15718b = new C1177w<>();
            }
            return this.f15718b;
        }

        private C5524a() {
            C5522a.this = r1;
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public int getPanelHeight(Context context) {
            return C5522a.this.mo22068f();
        }

        /* renamed from: a */
        public void mo22069a(boolean z) {
            C1177w wVar = (C1177w) getActive();
            if (wVar.mo5927b() == null || ((Boolean) wVar.mo5927b()).booleanValue() != z) {
                wVar.mo5929b(Boolean.valueOf(z));
            }
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void onBecomeActive(C6215b bVar, AbstractC6214a aVar) {
            bVar.requestUpdateWebContentHeight();
        }

        @Override // com.bytedance.ee.bear.document.toolbar.editpanels.AbstractC6214a
        public void onBecomeInactive(C6215b bVar, AbstractC6214a aVar) {
            bVar.requestUpdateWebContentHeight();
        }
    }

    /* renamed from: com.bytedance.ee.bear.doc.structure.a$b */
    public class C5525b extends RecyclerView.Adapter<C5526c> {

        /* renamed from: a */
        Structure f15719a;

        /* renamed from: b */
        LayoutInflater f15720b;

        public static /* synthetic */ void lambda$mtjoWLPOSDigCUUkhttA9632XJg(C5525b bVar, Structure.Paragraph paragraph, View view) {
            bVar.m22442a(paragraph, view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            Structure structure = this.f15719a;
            if (structure == null) {
                return 0;
            }
            return structure.getParagraphCount();
        }

        /* renamed from: a */
        public void mo22076a(Structure structure) {
            this.f15719a = structure;
        }

        private C5525b() {
            C5522a.this = r1;
        }

        /* renamed from: a */
        private Structure.Paragraph m22441a(int i) {
            return this.f15719a.getParagraph(i);
        }

        /* renamed from: a */
        public C5526c onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (this.f15720b == null) {
                this.f15720b = LayoutInflater.from(viewGroup.getContext());
            }
            return new C5526c(this.f15720b.inflate(R.layout.fixed_structure_paragraph, viewGroup, false));
        }

        /* renamed from: a */
        private /* synthetic */ void m22442a(Structure.Paragraph paragraph, View view) {
            C5522a.this.f15712d.setActive(paragraph.getHash());
            C5522a.this.f15712d.setIsUpdateActiveByFixedStructure(C5522a.f15710f);
            C5522a.this.f15712d.changeCollapseStatus(paragraph.getHash(), paragraph.collapse);
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m22443b(Structure.Paragraph paragraph, View view) {
            C5522a.this.f15712d.setActive(paragraph.getHash());
            C5522a.this.f15712d.setIsUpdateActiveByFixedStructure(C5522a.f15710f);
            C5522a.this.f15712d.scrollTo(paragraph.getHash());
            notifyDataSetChanged();
            C5522a.this.f15711c.mo22106c();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5526c cVar, int i) {
            int i2;
            int i3;
            Typeface typeface;
            int i4;
            Structure.Paragraph a = m22441a(i);
            View view = cVar.f15722a;
            View view2 = cVar.f15723b;
            ImageView imageView = cVar.f15724c;
            TextView textView = cVar.f15725d;
            int i5 = 0;
            if (a.showCollapse) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            if (a.collapse) {
                i3 = R.drawable.doc_structure_paragraph_collapse;
            } else {
                i3 = R.drawable.doc_structure_paragraph_expand;
            }
            imageView.setImageResource(i3);
            C13747j.m55728a(imageView, (int) R.color.icon_n3);
            textView.setText(a.title);
            textView.setSelected(false);
            view2.setSelected(false);
            if (a.level == 1) {
                typeface = Typeface.defaultFromStyle(1);
            } else {
                typeface = Typeface.defaultFromStyle(0);
            }
            textView.setTypeface(typeface);
            boolean equals = C5522a.this.f15712d.getActive().equals(a.getHash());
            textView.setSelected(equals);
            view2.setSelected(equals);
            C5522a aVar = C5522a.this;
            if (equals) {
                i4 = R.color.primary_pri_500;
            } else {
                i4 = 0;
            }
            aVar.mo22067a(imageView, i4);
            if (C5522a.this.f15713e) {
                C25649b.m91857a(textView, LarkFont.BODY0);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            if (imageView.getVisibility() == 0) {
                i5 = C13749l.m55738a(24);
            }
            layoutParams.width = C13749l.m55738a(12) + ((a.level - 1) * C13749l.m55738a(20)) + i5;
            view.setLayoutParams(layoutParams);
            textView.setOnClickListener(new View.OnClickListener(a) {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$a$b$BJDO08cqvJ8Amhm9uO56ex4nY */
                public final /* synthetic */ Structure.Paragraph f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C5522a.C5525b.m269184lambda$BJDO08cqvJ8Amhm9uO56ex4nY(C5522a.C5525b.this, this.f$1, view);
                }
            });
            view.setOnClickListener(new View.OnClickListener(a) {
                /* class com.bytedance.ee.bear.doc.structure.$$Lambda$a$b$mtjoWLPOSDigCUUkhttA9632XJg */
                public final /* synthetic */ Structure.Paragraph f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C5522a.C5525b.lambda$mtjoWLPOSDigCUUkhttA9632XJg(C5522a.C5525b.this, this.f$1, view);
                }
            });
        }
    }

    /* renamed from: f */
    public int mo22068f() {
        return Math.max((int) (((double) C13749l.m55748b()) * 0.63d), AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39936j());
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AbstractC7719m mVar = this.f15714g;
        if (mVar != null) {
            mVar.mo30101b(this);
            this.f15714g = null;
        }
        this.f15715h.mo22069a(false);
        ((C5538e) this.f15712d).setFixMode(false);
    }

    /* renamed from: g */
    private int m22436g() {
        Structure b;
        String active = this.f15712d.getActive();
        if (TextUtils.isEmpty(active) || (b = this.f15712d.getContent().mo5927b()) == null) {
            return -1;
        }
        int paragraphCount = b.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            if (b.getParagraph(i).getHash().equals(active)) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog v_ = v_();
        if (v_ == null) {
            window = null;
        } else {
            window = v_.getWindow();
        }
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = mo22068f();
            attributes.gravity = 80;
            attributes.softInputMode = 1;
            attributes.flags |= 264;
            attributes.flags &= -3;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.AnimationDialog);
            window.setBackgroundDrawableResource(17170445);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f15715h.mo22069a(false);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7720n
    public boolean onTouchStartIntercept(MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        View view = getView();
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (rawY >= ((float) iArr[1])) {
            return false;
        }
        mo5513b();
        return f15710f;
    }

    /* renamed from: com.bytedance.ee.bear.doc.structure.a$c */
    public static class C5526c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f15722a;

        /* renamed from: b */
        public View f15723b;

        /* renamed from: c */
        public ImageView f15724c;

        /* renamed from: d */
        public TextView f15725d;

        C5526c(View view) {
            super(view);
            this.f15722a = view.findViewById(R.id.paragraph_icon_layout);
            this.f15724c = (ImageView) view.findViewById(R.id.paragraph_icon);
            this.f15725d = (TextView) view.findViewById(R.id.paragraph_title);
            this.f15723b = view.findViewById(R.id.structure_layout);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f15710f || activity != null) {
            C5538e eVar = (C5538e) C4950k.m20474a(this, C5538e.class);
            this.f15712d = eVar;
            this.f15711c = eVar.getStructureAnalytic();
            C6215b bVar = (C6215b) aj.m5366a(activity).mo6005a(C6215b.class);
            C5524a aVar = new C5524a();
            this.f15715h = aVar;
            bVar.registerEditPanel(this, aVar);
            AbstractC10550f.AbstractC10551a.m43717b(activity).mo39924a(bVar);
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f15713e = arguments.getBoolean("enableFontScale");
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void mo22067a(ImageView imageView, int i) {
        ColorStateList colorStateList;
        if (imageView != null) {
            if (i == 0) {
                colorStateList = null;
            } else {
                colorStateList = getResources().getColorStateList(i);
            }
            imageView.setImageTintList(colorStateList);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CommonActionPanelLayout commonActionPanelLayout = (CommonActionPanelLayout) view.findViewById(R.id.title_layout);
        commonActionPanelLayout.setTitle(getString(R.string.Doc_Doc_More_Structure));
        commonActionPanelLayout.setOnActionListener(new CommonActionPanelLayout.SimpleActionListener() {
            /* class com.bytedance.ee.bear.doc.structure.C5522a.C55231 */

            @Override // com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.OnActionListener, com.bytedance.ee.bear.widgets.panel.CommonActionPanelLayout.SimpleActionListener
            /* renamed from: d */
            public void mo18838d() {
                C5522a.this.mo5513b();
            }
        });
        View findViewById = view.findViewById(R.id.ll_no_data);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        C5525b bVar = new C5525b();
        recyclerView.setAdapter(bVar);
        m22435a(this.f15712d.getContent().mo5927b(), recyclerView, findViewById);
        this.f15712d.getContent().mo5923a(this, new AbstractC1178x(recyclerView, findViewById, bVar) {
            /* class com.bytedance.ee.bear.doc.structure.$$Lambda$a$cC1cjSjbb8ugD3ofo5NAlrmyqy8 */
            public final /* synthetic */ RecyclerView f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ C5522a.C5525b f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                C5522a.this.m22434a(this.f$1, this.f$2, this.f$3, (Structure) obj);
            }
        });
        int g = m22436g();
        if (g >= 0) {
            recyclerView.scrollToPosition(g);
        }
        AbstractC7719m mVar = (AbstractC7719m) AbstractC7710h.C7711a.m30833a(getActivity(), AbstractC7719m.class);
        this.f15714g = mVar;
        if (mVar != null) {
            mVar.mo30100a(this);
        }
        this.f15715h.mo22069a(f15710f);
        ((C5538e) this.f15712d).setFixMode(f15710f);
        ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40644a(v_());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fixed_structure_fragment, viewGroup, false);
    }

    /* renamed from: a */
    private void m22435a(Structure structure, RecyclerView recyclerView, View view) {
        boolean z;
        int i;
        int i2 = 0;
        if (structure == null || structure.paragraphs == null || structure.paragraphs.length <= 0) {
            z = false;
        } else {
            z = f15710f;
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        if (!z) {
            i2 = 8;
        }
        recyclerView.setVisibility(i2);
    }

    /* renamed from: a */
    private /* synthetic */ void m22434a(RecyclerView recyclerView, View view, C5525b bVar, Structure structure) {
        m22435a(structure, recyclerView, view);
        bVar.mo22076a(structure);
        bVar.notifyDataSetChanged();
    }
}
