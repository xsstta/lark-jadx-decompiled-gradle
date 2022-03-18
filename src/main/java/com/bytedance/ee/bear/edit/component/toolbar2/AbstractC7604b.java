package com.bytedance.ee.bear.edit.component.toolbar2;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.document.model.toolbar.DocToolbarV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemIdV2;
import com.bytedance.ee.bear.document.model.toolbar.ItemV2;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.toolbar.AbstractC6207c;
import com.bytedance.ee.bear.document.toolbar.C6226g;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6237b;
import com.bytedance.ee.bear.document.toolbar.media.impl.C6238c;
import com.bytedance.ee.bear.document.toolbar.selectcolor.p322a.C6249b;
import com.bytedance.ee.bear.fileselector.FileSelectFragment;
import com.bytedance.ee.bear.fileselector.FileSelectorManager;
import com.bytedance.ee.bear.fileselector.api.FileSelectConfig;
import com.bytedance.ee.bear.util.keyboard.HardKeyboardUtils;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.bear.edit.component.toolbar2.b */
public abstract class AbstractC7604b extends AbstractC7612e<DocToolbarV2> {

    /* renamed from: a */
    static final /* synthetic */ boolean f20628a = true;

    /* renamed from: l */
    private AbstractC7624i f20629l;

    /* renamed from: m */
    private boolean f20630m = f20628a;

    /* renamed from: n */
    private C6238c f20631n;

    /* renamed from: o */
    private boolean f20632o = f20628a;

    /* renamed from: b */
    public abstract Class<? extends AbstractC7610d> mo22167b();

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: d */
    public void mo29932d() {
        this.f20629l.onToolbarChanged();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: c */
    public void mo29931c() {
        if (!this.f20629l.onKeyboardToolbarItemClick()) {
            super.mo29931c();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public boolean mo29928a(Fragment fragment) {
        return (fragment instanceof C6249b) ^ f20628a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public int mo29924a(ItemIdV2 itemIdV2) {
        if (itemIdV2 instanceof ToolbarPrimaryItemId) {
            return C6226g.m25079a((ToolbarPrimaryItemId) itemIdV2);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: b */
    public Class<? extends AbstractC6207c> mo29929b(ItemIdV2 itemIdV2) {
        if (itemIdV2 == ToolbarPrimaryItemId.insertImage) {
            return C6237b.class;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: c */
    public Class<? extends AbstractC7610d> mo29930c(ItemIdV2 itemIdV2) {
        if (itemIdV2 == ToolbarPrimaryItemId.blockTransform || itemIdV2 == ToolbarPrimaryItemId.textTransform || itemIdV2 == ToolbarPrimaryItemId.alignTransform) {
            return mo22167b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public void mo29925a(int i) {
        super.mo29925a(i);
        if (!this.f20630m && i <= 0 && !HardKeyboardUtils.m43694a((Context) getActivity()) && !this.f20629l.hasShowingPanel() && !this.f20660b.hasFunctionPanel()) {
            C13479a.m54764b("ToolbarV2Fragment", "onUpdateToolbar null");
            this.f20660b.hideToolbar();
        }
        this.f20630m = false;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20629l = DocToolbarV2Compat.of(getActivity());
        this.f20631n = (C6238c) aj.m5366a(getActivity()).mo6005a(C6238c.class);
        if (getArguments() != null) {
            this.f20632o = getArguments().getBoolean("EnableExternalSelect", f20628a);
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public void mo29927a(ItemV2 itemV2) {
        this.f20668j.mo25308a();
        FragmentActivity activity = getActivity();
        if (!f20628a && activity == null) {
            throw new AssertionError();
        } else if (!(activity.getSupportFragmentManager().findFragmentByTag(itemV2.id().name()) instanceof AbstractC6207c) && itemV2.id() == ToolbarPrimaryItemId.insertImage) {
            FileSelectConfig.C7789d defaultBuilder = this.f20631n.getDefaultBuilder(activity);
            defaultBuilder.mo30472j(this.f20632o);
            this.f20631n.showInsertImageSelectorPanel(activity, defaultBuilder, "ToolbarV2Fragment");
        }
    }

    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public void mo29926a(FragmentActivity fragmentActivity, Fragment fragment) {
        if (fragment instanceof FileSelectFragment) {
            FileSelectorManager.m31233a(fragmentActivity.getSupportFragmentManager(), "ToolbarV2Fragment");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.edit.component.toolbar2.AbstractC7612e
    /* renamed from: a */
    public void mo22166a(ItemIdV2 itemIdV2, String str) {
        super.mo22166a(itemIdV2, str);
        this.f20629l.onToolbarItemClick(itemIdV2.name());
    }
}
