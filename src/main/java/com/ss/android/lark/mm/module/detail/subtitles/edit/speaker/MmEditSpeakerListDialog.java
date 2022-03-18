package com.ss.android.lark.mm.module.detail.subtitles.edit.speaker;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerRvAdapter;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.BaseDialog;
import com.ss.android.lark.mm.widget.MmLoadingView;
import com.ss.android.lark.searchcommon.view.SearchInputView;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u001a\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u0016\u0010\u001d\u001a\u00020\u000f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\u0018\u0010\u001f\u001a\u00020\u000f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\u0016\u0010\"\u001a\u00020\u000f2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "()V", "adapter", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter;", "listener", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$IEditSpeakerListener;", "getListener", "()Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$IEditSpeakerListener;", "setListener", "(Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$IEditSpeakerListener;)V", "suggestedSpeakers", "", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "init", "", "initMaxHeight", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "render", "setInitialData", "searchSpeakers", "setPlaceholderVisibility", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "setSearchAddLayout", "setSearchSpeakers", "IEditSpeakerListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a */
public final class MmEditSpeakerListDialog extends BaseDialog {

    /* renamed from: c */
    public MmEditSpeakerRvAdapter f116459c;

    /* renamed from: d */
    private IEditSpeakerListener f116460d;

    /* renamed from: e */
    private List<? extends MmParticipants.MmParticipantInfo> f116461e;

    /* renamed from: f */
    private HashMap f116462f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$IEditSpeakerListener;", "", "onChangingSpeaker", "", "onClickCancel", "onClickDone", "speaker", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "isAdd", "", "onSearch", "keywords", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$a */
    public interface IEditSpeakerListener {
        /* renamed from: a */
        void mo162376a();

        /* renamed from: a */
        void mo162377a(MmParticipants.MmParticipantInfo mmParticipantInfo, boolean z);

        /* renamed from: a */
        void mo162378a(String str);

        /* renamed from: b */
        void mo162379b();
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f116462f == null) {
            this.f116462f = new HashMap();
        }
        View view = (View) this.f116462f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116462f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f116462f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* renamed from: g */
    public final IEditSpeakerListener mo162373g() {
        return this.f116460d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$init$5", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnQueryClear;", "onQueryClear", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$f */
    public static final class C46216f implements SearchInputView.IOnQueryClear {

        /* renamed from: a */
        final /* synthetic */ MmEditSpeakerListDialog f116465a;

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnQueryClear
        /* renamed from: a */
        public void mo162384a() {
            this.f116465a.mo162374h();
            this.f116465a.mo162375i();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46216f(MmEditSpeakerListDialog aVar) {
            this.f116465a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$init$3", "Lcom/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerRvAdapter$IEditSpeakerCallback;", "onChangingSpeaker", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$d */
    public static final class C46214d implements MmEditSpeakerRvAdapter.IEditSpeakerCallback {

        /* renamed from: a */
        final /* synthetic */ MmEditSpeakerListDialog f116463a;

        @Override // com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerRvAdapter.IEditSpeakerCallback
        /* renamed from: a */
        public void mo162382a() {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f116463a.mo142944a(R.id.addParticipantCheckMark);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "addParticipantCheckMark");
            appCompatImageView.setVisibility(8);
            IEditSpeakerListener g = this.f116463a.mo162373g();
            if (g != null) {
                g.mo162376a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46214d(MmEditSpeakerListDialog aVar) {
            this.f116463a = aVar;
        }
    }

    /* renamed from: j */
    private final void m182995j() {
        Window window;
        Window window2;
        int screenHeight = (int) (((float) UIUtils.getScreenHeight(getContext())) * 0.8f);
        Dialog v_ = v_();
        if (!(v_ == null || (window2 = v_.getWindow()) == null)) {
            window2.setLayout(-1, screenHeight);
        }
        Dialog v_2 = v_();
        if (v_2 != null && (window = v_2.getWindow()) != null) {
            window.setGravity(80);
        }
    }

    /* renamed from: h */
    public final void mo162374h() {
        m182994c(this.f116461e);
        List<? extends MmParticipants.MmParticipantInfo> list = this.f116461e;
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "suggestedSpeakersRv");
            recyclerView.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo142944a(R.id.placeHolderLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "placeHolderLayout");
            constraintLayout.setVisibility(8);
            MmEditSpeakerRvAdapter dVar = this.f116459c;
            if (dVar != null) {
                dVar.mo162404a(list);
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog v_ = v_();
        if (v_ != null) {
            View findViewById = v_.findViewById(R.id.design_bottom_sheet);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "bottomSheet");
            findViewById.getLayoutParams().height = -1;
            BottomSheetBehavior b = BottomSheetBehavior.m79955b(findViewById);
            Intrinsics.checkExpressionValueIsNotNull(b, "behavior");
            b.mo76702a((int) (((double) C57582a.m223609b(getContext())) * 0.8d));
            View view = getView();
            if (view != null) {
                view.requestLayout();
            }
            BottomSheetBehavior b2 = BottomSheetBehavior.m79955b(findViewById);
            Intrinsics.checkExpressionValueIsNotNull(b2, "BottomSheetBehavior.from<View>(bottomSheet)");
            b2.mo76715c(false);
            b2.mo76706a(new C46217g(b2));
            m182995j();
        }
    }

    /* renamed from: k */
    private final void m182996k() {
        MmLoadingView mmLoadingView = (MmLoadingView) mo142944a(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(mmLoadingView, "loadingView");
        String string = mmLoadingView.getContext().getString(R.string.MMWeb_G_Loading);
        Intrinsics.checkExpressionValueIsNotNull(string, "loadingView.context.getS…R.string.MMWeb_G_Loading)");
        ((MmLoadingView) mo142944a(R.id.loadingView)).mo165614a(string);
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo142944a(R.id.leftCancelTv);
        Intrinsics.checkExpressionValueIsNotNull(appCompatTextView, "leftCancelTv");
        C47110e.m186573a(appCompatTextView, new C46212b(this));
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo142944a(R.id.rightDoneTv);
        Intrinsics.checkExpressionValueIsNotNull(appCompatTextView2, "rightDoneTv");
        C47110e.m186573a(appCompatTextView2, new C46213c(this));
        ((SearchInputView) mo142944a(R.id.searchBar)).setHint(R.string.MMWeb_G_ToPlaceholder);
        this.f116459c = new MmEditSpeakerRvAdapter(new C46214d(this));
        RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "suggestedSpeakersRv");
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView2 = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "suggestedSpeakersRv");
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "suggestedSpeakersRv");
        recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView4 = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "suggestedSpeakersRv");
        recyclerView4.setAdapter(this.f116459c);
        ((SearchInputView) mo142944a(R.id.searchBar)).setOnSearch(new C46215e(this));
        ((SearchInputView) mo142944a(R.id.searchBar)).setOnQueryClear(new C46216f(this));
    }

    /* renamed from: i */
    public final void mo162375i() {
        String query = ((SearchInputView) mo142944a(R.id.searchBar)).getQuery();
        if (StringsKt.isBlank(query)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo142944a(R.id.addParticipantLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "addParticipantLayout");
            constraintLayout.setVisibility(8);
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo142944a(R.id.addParticipantCheckMark);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "addParticipantCheckMark");
            appCompatImageView.setVisibility(8);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo142944a(R.id.addParticipantLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "addParticipantLayout");
        constraintLayout2.setVisibility(0);
        TextView textView = (TextView) mo142944a(R.id.addParticipantTv);
        Intrinsics.checkExpressionValueIsNotNull(textView, "addParticipantTv");
        textView.setText(UIHelper.mustacheFormat((int) R.string.MMWeb_G_AddNameAsParticipant_Desc, "name", "\"" + query + "\""));
        ConstraintLayout constraintLayout3 = (ConstraintLayout) mo142944a(R.id.addParticipantLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout3, "addParticipantLayout");
        C47110e.m186573a(constraintLayout3, new C46218h(this));
    }

    /* renamed from: a */
    public final void mo162370a(IEditSpeakerListener aVar) {
        this.f116460d = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$b */
    public static final class C46212b extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmEditSpeakerListDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46212b(MmEditSpeakerListDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmEditSpeakerListDialog", "cancel");
            this.this$0.mo5513b();
            IEditSpeakerListener g = this.this$0.mo162373g();
            if (g != null) {
                g.mo162379b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$c */
    public static final class C46213c extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmEditSpeakerListDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46213c(MmEditSpeakerListDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            MmParticipants.MmParticipantInfo b;
            IEditSpeakerListener g;
            boolean z;
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmEditSpeakerListDialog", "done");
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.mo142944a(R.id.addParticipantCheckMark);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "addParticipantCheckMark");
            if (appCompatImageView.getVisibility() == 0) {
                String query = ((SearchInputView) this.this$0.mo142944a(R.id.searchBar)).getQuery();
                if (query == null || StringsKt.isBlank(query)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.this$0.mo5513b();
                    return;
                }
                IEditSpeakerListener g2 = this.this$0.mo162373g();
                if (g2 != null) {
                    MmParticipants.MmParticipantInfo mmParticipantInfo = new MmParticipants.MmParticipantInfo();
                    mmParticipantInfo.setUserType(0);
                    mmParticipantInfo.setUserName(((SearchInputView) this.this$0.mo142944a(R.id.searchBar)).getQuery());
                    g2.mo162377a(mmParticipantInfo, true);
                    return;
                }
                return;
            }
            MmEditSpeakerRvAdapter dVar = this.this$0.f116459c;
            if (dVar != null && (b = dVar.mo162406b()) != null && (g = this.this$0.mo162373g()) != null) {
                g.mo162377a(b, false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$init$4", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnSearch;", "onSearch", "", SearchIntents.EXTRA_QUERY, "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$e */
    public static final class C46215e implements SearchInputView.IOnSearch {

        /* renamed from: a */
        final /* synthetic */ MmEditSpeakerListDialog f116464a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46215e(MmEditSpeakerListDialog aVar) {
            this.f116464a = aVar;
        }

        @Override // com.ss.android.lark.searchcommon.view.SearchInputView.IOnSearch
        /* renamed from: a */
        public void mo162383a(String str) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, SearchIntents.EXTRA_QUERY);
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f116464a.mo162374h();
                this.f116464a.mo162375i();
                return;
            }
            IEditSpeakerListener g = this.f116464a.mo162373g();
            if (g != null) {
                g.mo162378a(str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/mm/module/detail/subtitles/edit/speaker/MmEditSpeakerListDialog$onStart$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "p0", "Landroid/view/View;", "p1", "", "onStateChanged", "bottomSheet", "newState", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$g */
    public static final class C46217g extends BottomSheetBehavior.AbstractC22177a {

        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f116466a;

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24937a(View view, float f) {
            Intrinsics.checkParameterIsNotNull(view, "p0");
        }

        C46217g(BottomSheetBehavior bottomSheetBehavior) {
            this.f116466a = bottomSheetBehavior;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
        /* renamed from: a */
        public void mo24938a(View view, int i) {
            Intrinsics.checkParameterIsNotNull(view, "bottomSheet");
            if (i == 1) {
                this.f116466a.mo76718d(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.a$h */
    public static final class C46218h extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmEditSpeakerListDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46218h(MmEditSpeakerListDialog aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            MmEditSpeakerRvAdapter dVar = this.this$0.f116459c;
            if (dVar != null) {
                dVar.mo162403a();
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.this$0.mo142944a(R.id.addParticipantCheckMark);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "addParticipantCheckMark");
            appCompatImageView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo162371a(List<? extends MmParticipants.MmParticipantInfo> list) {
        if (((MmLoadingView) mo142944a(R.id.loadingView)) != null) {
            this.f116461e = list;
            mo162374h();
            ((MmLoadingView) mo142944a(R.id.loadingView)).mo165613a();
        }
    }

    /* renamed from: c */
    private final void m182994c(List<? extends MmParticipants.MmParticipantInfo> list) {
        if (list == null || list.isEmpty()) {
            RecyclerView recyclerView = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "suggestedSpeakersRv");
            recyclerView.setVisibility(8);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo142944a(R.id.placeHolderLayout);
            Intrinsics.checkExpressionValueIsNotNull(constraintLayout, "placeHolderLayout");
            constraintLayout.setVisibility(0);
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) mo142944a(R.id.suggestedSpeakersRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "suggestedSpeakersRv");
        recyclerView2.setVisibility(0);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) mo142944a(R.id.placeHolderLayout);
        Intrinsics.checkExpressionValueIsNotNull(constraintLayout2, "placeHolderLayout");
        constraintLayout2.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r4 != null) goto L_0x0072;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo162372b(java.util.List<? extends com.ss.android.lark.mm.module.participant.model.MmParticipants.MmParticipantInfo> r8) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.detail.subtitles.edit.speaker.MmEditSpeakerListDialog.mo162372b(java.util.List):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m182996k();
        mo162374h();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.mm_edit_speaker_list_dialog, viewGroup, false);
    }
}
