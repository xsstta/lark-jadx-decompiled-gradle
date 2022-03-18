package com.bytedance.ee.bear.sheet.inputbar.subpanel;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.p398i.C7835g;
import com.bytedance.ee.bear.sheet.inputbar.AbstractC11188a;
import com.bytedance.ee.bear.sheet.inputbar.C11219d;
import com.bytedance.ee.bear.sheet.inputbar.at.p545a.C11193d;
import com.bytedance.ee.bear.sheet.inputbar.at.segment.BaseSegment;
import com.bytedance.ee.bear.sheet.inputbar.editor.SheetInputData;
import io.reactivex.Single;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.a */
public abstract class AbstractC11233a extends C7667e {

    /* renamed from: b */
    static final /* synthetic */ boolean f30223b = true;

    /* renamed from: a */
    protected C11219d f30224a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo43069a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1177w<Editable> mo43072b() {
        return this.f30224a.getEditable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C1177w<Boolean> mo43073c() {
        return this.f30224a.isExpand();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C1177w<String> mo43074d() {
        return this.f30224a.getFormat();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C1177w<String> mo43075e() {
        return this.f30224a.getDateType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C1177w<SheetInputData.InputData> mo43076f() {
        return this.f30224a.getInputData();
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        this.f30224a.setActive(false);
        return f30223b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public List<BaseSegment> mo43077g() {
        return this.f30224a.getInputData().mo5927b().getSegments();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo43078h() {
        if (this.f30224a.isExpand() != null) {
            return Boolean.TRUE.equals(this.f30224a.isExpand().mo5927b());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Single<List<BaseSegment>> mo43070a(Editable editable) {
        return Single.just(new C7835g((SpannableStringBuilder) editable)).map(new C11193d());
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (f30223b || getActivity() != null) {
            this.f30224a = (C11219d) C4950k.m20474a(this, C11219d.class);
            return;
        }
        throw new AssertionError();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo43069a(), viewGroup, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43071a(int i, List<BaseSegment> list, String str, String str2) {
        AbstractC11188a editDelegate = this.f30224a.getEditDelegate();
        if (editDelegate != null) {
            editDelegate.updateSheetEdit(i, list, str, str2);
        }
    }
}
