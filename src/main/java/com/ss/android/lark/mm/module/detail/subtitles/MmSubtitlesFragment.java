package com.ss.android.lark.mm.module.detail.subtitles;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.comment.MmCommentControl;
import com.ss.android.lark.mm.module.detail.comment.MmCommentViewControl;
import com.ss.android.lark.mm.module.detail.comment.MmCommentViewControlAdapter;
import com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.translate.MmDetailTranslateViewControlAdapter;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.module.translate.MmTranslateViewControl;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.hitpoint.C47084f;
import com.ss.android.lark.mm.utils.p2335a.C47096b;
import com.ss.android.lark.mm.widget.MmKeyboardHideConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\fH\u0016J\u001a\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/MmSubtitlesFragment;", "Lcom/ss/android/lark/mm/module/detail/main/MmBaseDetailFragment;", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "()V", "contentView", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "viewControls", "", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "clearControl", "", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "getMContext", "getMmTimeExecutor", "Lcom/ss/android/lark/mm/utils/timer/MmTimerExecutor;", "getRootView", "init", "onAttach", "context", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.h */
public final class MmSubtitlesFragment extends MmBaseDetailFragment implements IMmViewControlContext {

    /* renamed from: a */
    private View f116548a;

    /* renamed from: b */
    private final List<MmBaseViewControl<?, ?>> f116549b = new ArrayList();

    /* renamed from: c */
    private Context f116550c;

    /* renamed from: d */
    private HashMap f116551d;

    @Override // com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: a */
    public View mo161166a(int i) {
        if (this.f116551d == null) {
            this.f116551d = new HashMap();
        }
        View view = (View) this.f116551d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116551d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment, com.ss.android.lark.mm.base.BaseFragment
    /* renamed from: c */
    public void mo161170c() {
        HashMap hashMap = this.f116551d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: e */
    public C47084f mo161231e() {
        return IMmViewControlContext.C45904a.m181880a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: p */
    public C47096b mo161234p() {
        return mo161169b();
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: n */
    public Context mo161232n() {
        Context context = this.f116550c;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return context;
    }

    @Override // com.ss.android.lark.mm.module.framework.IMmViewControlContext
    /* renamed from: o */
    public View mo161233o() {
        MmKeyboardHideConstraintLayout mmKeyboardHideConstraintLayout = (MmKeyboardHideConstraintLayout) mo161166a(R.id.layout_container);
        Intrinsics.checkExpressionValueIsNotNull(mmKeyboardHideConstraintLayout, "layout_container");
        return mmKeyboardHideConstraintLayout;
    }

    @Override // com.ss.android.lark.mm.module.detail.main.MmBaseDetailFragment, androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onDestroyView() {
        C45855f.m181664c("MmTranscriptionFragment", "onDestroyView");
        Iterator<T> it = this.f116549b.iterator();
        while (it.hasNext()) {
            it.next().mo161245h();
        }
        this.f116549b.clear();
        super.onDestroyView();
        mo161170c();
    }

    /* renamed from: i */
    private final void m183154i() {
        MmMeetingSubtitleControl dVar;
        MmViewControlRegister f = mo161909f();
        MmControlRegister d = mo161908d();
        if (d != null) {
            dVar = (MmMeetingSubtitleControl) d.mo161912a(MmMeetingSubtitleControl.class);
        } else {
            dVar = null;
        }
        if (f != null && d != null && dVar != null) {
            m183153a(d);
            List<MmBaseViewControl<?, ?>> list = this.f116549b;
            MmSubtitlesFragment hVar = this;
            MmTranslateControl dVar2 = new MmTranslateControl(mo161910g(), mo161911h());
            dVar2.mo161236m();
            list.add(new MmTranslateViewControl(hVar, new MmDetailTranslateViewControlAdapter(f, d, dVar2)));
            List<MmBaseViewControl<?, ?>> list2 = this.f116549b;
            MmCommentControl dVar3 = new MmCommentControl(mo161910g(), mo161911h());
            dVar3.mo161236m();
            list2.add(new MmCommentViewControl(hVar, new MmCommentViewControlAdapter(f, d, dVar3)));
            List<MmBaseViewControl<?, ?>> list3 = this.f116549b;
            dVar.mo161236m();
            list3.add(new MmMeetingSubtitleViewControl(hVar, new MmMeetingSubtitleViewControlAdapter(f, d, dVar)));
            Iterator<T> it = this.f116549b.iterator();
            while (it.hasNext()) {
                it.next().be_();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onAttach(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.onAttach(context);
        this.f116550c = context;
    }

    /* renamed from: a */
    private final void m183153a(MmControlRegister eVar) {
        String name = MmTranslateControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "MmTranslateControl::class.java.name");
        eVar.mo161918b(name);
        String name2 = MmCommentControl.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name2, "MmCommentControl::class.java.name");
        eVar.mo161918b(name2);
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.mm.base.BaseFragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m183154i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        C45855f.m181664c("MmTranscriptionFragment", "onCreateView");
        View inflate = layoutInflater.inflate(R.layout.mm_fragment_transcription, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…iption, container, false)");
        this.f116548a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentView");
        }
        return inflate;
    }
}
