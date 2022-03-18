package com.bytedance.ee.bear.mindnote.toolbar;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.toolbar.AbstractC6204a;
import com.bytedance.ee.bear.document.toolbar.AbstractC6212e;
import com.bytedance.ee.bear.document.toolbar.Item;
import com.bytedance.ee.bear.document.toolbar.ItemId;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker;
import com.larksuite.suite.R;
import kotlin.jvm.functions.Function0;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.mindnote.toolbar.d */
public class C10193d extends AbstractC6204a {

    /* renamed from: c */
    static final /* synthetic */ boolean f27492c;

    /* renamed from: d */
    private C10192c f27493d;

    /* renamed from: e */
    private CommonColorPicker f27494e;

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: f */
    public int mo22132f() {
        return R.layout.mindnote_toolbar_attribution_fragment;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: g */
    public ItemId mo22133g() {
        return MindNoteItemId.mnAttribute;
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: h */
    public AbstractC6212e mo22134h() {
        return this.f27493d;
    }

    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ DefinitionParameters m42435j() {
        return new DefinitionParameters(this);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6204a, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: i */
    public View mo22135i() {
        String str;
        View i = super.mo22135i();
        CommonColorPicker commonColorPicker = (CommonColorPicker) i.findViewById(R.id.colorpicker);
        this.f27494e = commonColorPicker;
        commonColorPicker.setOnSelectColorListener(new CommonColorPicker.OnSelectColorListener() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.$$Lambda$d$NI3o75WGNOpd8SbMOmcZpmdL_Fg */

            @Override // com.bytedance.ee.bear.widgets.colorpicker.CommonColorPicker.OnSelectColorListener
            public final void onColorSelected(String str) {
                C10193d.lambda$NI3o75WGNOpd8SbMOmcZpmdL_Fg(C10193d.this, str);
            }
        });
        BearUrl bearUrl = null;
        C10189a aVar = (C10189a) KoinJavaComponent.m268612a(C10189a.class, null, new Function0() {
            /* class com.bytedance.ee.bear.mindnote.toolbar.$$Lambda$d$6Y93IBzKWOBHhY4zKkyHTgt7QUI */

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C10193d.lambda$6Y93IBzKWOBHhY4zKkyHTgt7QUI(C10193d.this);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            bearUrl = (BearUrl) arguments.getParcelable("bear_url");
            str = arguments.getString("origin_bear_url");
        } else {
            str = null;
        }
        aVar.mo38952a("ccm_bottom_toolbar_font_color_view", bearUrl, str);
        return i;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m42434a(String str) {
        this.f27493d.processToolbarItemClick(MindNoteTxtAttrId.highlight, str);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.bytedance.ee.bear.document.toolbar.AbstractC6207c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (f27492c || activity != null) {
            this.f27493d = (C10192c) aj.m5366a(activity).mo6005a(C10192c.class);
            return;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.ee.bear.document.toolbar.AbstractC6205b
    /* renamed from: a */
    public void mo22131a(Item[] itemArr, View view) {
        super.mo22131a(itemArr, view);
        Item a = mo25095a(MindNoteTxtAttrId.highlight);
        if (a != null) {
            this.f27494e.mo45306a(a.getList(), a.getValue());
        }
    }
}
