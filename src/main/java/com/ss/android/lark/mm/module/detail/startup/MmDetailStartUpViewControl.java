package com.ss.android.lark.mm.module.detail.startup;

import android.app.Activity;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.base.MmBaseActivity;
import com.ss.android.lark.mm.module.detail.C45950b;
import com.ss.android.lark.mm.module.detail.MmDetailErrorFactory;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.baseinfo.ObjectStatus;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.share.model.ApplyInfo;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.statistics.appreciable.MmAppreciableDetailTracker;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.C47098d;
import com.ss.android.lark.mm.utils.C47103g;
import com.ss.android.lark.mm.utils.ktextensions.C47108b;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import com.ss.android.lark.mm.widget.MmLoadingView;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68315g;
import io.reactivex.functions.Consumer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00022\u00020\u0004:\u0001;B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020%2\b\b\u0002\u0010)\u001a\u00020\u0012J\b\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020%2\u0006\u0010-\u001a\u00020\u0014H\u0016J\b\u0010.\u001a\u00020%H\u0016J\b\u0010/\u001a\u00020%H\u0016JF\u00100\u001a\u00020%2\u001e\u00101\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001203\u0012\u0004\u0012\u00020%022\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020%022\b\b\u0002\u0010)\u001a\u00020\u0012H\u0002J\u0012\u00106\u001a\u00020%2\b\b\u0002\u00107\u001a\u00020\u0012H\u0002J\u0012\u00108\u001a\u00020%2\b\b\u0002\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020%H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpListener;", "Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpDependency;", "Lcom/ss/android/lark/mm/module/detail/startup/IMmDetailStartUpInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "detailRefreshButton", "Landroid/view/View;", "detailRefreshTipWindow", "detailRefreshTopicTv", "Landroid/widget/TextView;", "emptyContainer", "Landroid/widget/FrameLayout;", "isFirstLoad", "", "lastDataError", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmMeetingBaseInfoControl$DataError;", "listener", "Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControl$IMmDetailStartUpViewControlListener;", "getListener", "()Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControl$IMmDetailStartUpViewControlListener;", "setListener", "(Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControl$IMmDetailStartUpViewControlListener;)V", "loadingView", "Lcom/ss/android/lark/mm/widget/MmLoadingView;", "refreshLoadingView", "getErrorState", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "getTopic", "", "hideLoadingIfWaitAsr", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "init", "isRefresh", "onDelete", "onDismissLoading", "onErrorDataChange", "dataError", "onRecordingTypeStatusChangeToCompleted", "onRefresh", "requestDetailInfo", "onSucceed", "Lkotlin/Function1;", "Lkotlin/Pair;", "onFailed", "", "setStatusAndNavigation", "isVideo", "setViewPadding", "isAudio", "showLoading", "IMmDetailStartUpViewControlListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.b.d */
public final class MmDetailStartUpViewControl extends MmBaseViewControl<IMmDetailStartUpListener, IMmDetailStartUpDependency> implements IMmDetailStartUpInquirer, IMmDetailStartUpListener {

    /* renamed from: a */
    public final View f115833a;

    /* renamed from: b */
    public final View f115834b;

    /* renamed from: c */
    public final IMmViewControlContext f115835c;

    /* renamed from: d */
    public final MmBaseViewControlAdapter<IMmDetailStartUpListener, IMmDetailStartUpDependency> f115836d;

    /* renamed from: e */
    private final MmLoadingView f115837e;

    /* renamed from: f */
    private final FrameLayout f115838f;

    /* renamed from: g */
    private final View f115839g;

    /* renamed from: h */
    private final TextView f115840h;

    /* renamed from: i */
    private boolean f115841i = true;

    /* renamed from: j */
    private MmMeetingBaseInfoControl.DataError f115842j;

    /* renamed from: k */
    private IMmDetailStartUpViewControlListener f115843k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/startup/MmDetailStartUpViewControl$IMmDetailStartUpViewControlListener;", "", "onInitialFailed", "", "onInitialSucceed", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$a */
    public interface IMmDetailStartUpViewControlListener {
        /* renamed from: a */
        void mo161339a();

        /* renamed from: a */
        void mo161340a(MmBaseInfo mmBaseInfo);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: i */
    public IMmDetailStartUpListener mo161243c() {
        return this;
    }

    /* renamed from: g */
    public final IMmDetailStartUpViewControlListener mo161421g() {
        return this.f115843k;
    }

    @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener
    /* renamed from: a */
    public void mo161411a() {
        this.f115834b.setVisibility(8);
        if (this.f115837e.getVisibility() != 8) {
            this.f115837e.mo165613a();
            this.f115837e.setVisibility(8);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener
    /* renamed from: f */
    public void mo161415f() {
        m182129j();
        m182127a(new C45957g(this), new C45958h(this), true);
    }

    /* renamed from: j */
    private final void m182129j() {
        if (this.f115837e.getVisibility() != 0) {
            this.f115837e.setVisibility(0);
            MmLoadingView mmLoadingView = this.f115837e;
            String string = mmLoadingView.getContext().getString(R.string.MMWeb_G_Loading);
            Intrinsics.checkExpressionValueIsNotNull(string, "loadingView.context.getS…R.string.MMWeb_G_Loading)");
            mmLoadingView.mo165614a(string);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener
    /* renamed from: b */
    public void mo161413b() {
        MmDetailErrorFactory.f115916a.mo161617a(this.f115835c.mo161232n(), C45950b.m182104a(this.f115835c.mo161232n()).mo161319c(), this.f115838f, ((IMmDetailStartUpDependency) mo161247w()).mo161405b());
    }

    /* renamed from: k */
    private final String m182130k() {
        String topic;
        MmBaseInfo b = ((IMmDetailStartUpDependency) mo161247w()).mo161405b();
        if (b == null || (topic = b.getTopic()) == null) {
            return "";
        }
        int coerceAtMost = RangesKt.coerceAtMost(10, topic.length());
        if (topic != null) {
            String substring = topic.substring(0, coerceAtMost);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (substring.length() < 10) {
                return substring;
            }
            return substring + "...";
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener
    /* renamed from: d */
    public void mo161414d() {
        boolean z;
        boolean z2;
        C45855f.m181664c("MmDetailStartUpViewControl", "onRecordingTypeStatusChangeToCompleted");
        MmBaseInfo b = ((IMmDetailStartUpDependency) mo161247w()).mo161405b();
        if ((b == null || b.isRecordingObjectType()) && this.f115833a.getVisibility() != 0) {
            C47083e.m186425a(this.f115835c.mo161231e(), "vc_minutes_popup_view", C47086i.m186432a().mo165413a("popup_name", "recording_transcript_finish").mo165421c());
            this.f115833a.setVisibility(0);
            String k = m182130k();
            String mustacheFormat = UIHelper.mustacheFormat((int) R.string.MMWeb_G_RecordFinishedProcessing, "RecordName", k);
            String str = mustacheFormat;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Intrinsics.checkExpressionValueIsNotNull(mustacheFormat, "content");
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, k, 0, false, 6, (Object) null);
            int length = k.length() + indexOf$default;
            String obj = StringsKt.removeRange((CharSequence) str, indexOf$default, length).toString();
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, obj, 0, false, 6, (Object) null);
            int length2 = obj.length() + indexOf$default2;
            if (indexOf$default < 0 || indexOf$default2 < 0) {
                z = false;
            } else {
                z = true;
            }
            if (length > spannableStringBuilder.length() || length2 > spannableStringBuilder.length()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z || !z2) {
                this.f115840h.setText(spannableStringBuilder);
            } else {
                spannableStringBuilder.setSpan(new StyleSpan(1), indexOf$default, length, 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(this.f115835c.mo161232n(), R.color.text_title)), indexOf$default, length, 18);
                spannableStringBuilder.setSpan(new StyleSpan(0), indexOf$default2, length2, 18);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(UDColorUtils.getColor(this.f115835c.mo161232n(), R.color.text_caption)), indexOf$default2, length2, 18);
                this.f115840h.setText(spannableStringBuilder);
            }
            C47110e.m186572a(this.f115839g, C57582a.m223600a(10));
            C47110e.m186573a(this.f115839g, new C45956f(this));
        }
    }

    /* renamed from: a */
    public final void mo161416a(IMmDetailStartUpViewControlListener aVar) {
        this.f115843k = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$b */
    public static final class C45952b extends Lambda implements Function1<Pair<? extends MmBaseInfo, ? extends Boolean>, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45952b(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends MmBaseInfo, ? extends Boolean> pair) {
            invoke((Pair<? extends MmBaseInfo, Boolean>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(Pair<? extends MmBaseInfo, Boolean> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            C45855f.m181664c("MmDetailStartUpViewControl", "loadData baseInfo success: " + pair);
            this.this$0.mo161419b(((MmBaseInfo) pair.getFirst()).isAudioType());
            this.this$0.mo161420c(((MmBaseInfo) pair.getFirst()).isVideoType());
            IMmDetailStartUpViewControlListener g = this.this$0.mo161421g();
            if (g != null) {
                g.mo161340a((MmBaseInfo) pair.getFirst());
            }
            this.this$0.mo161417a((MmBaseInfo) pair.getFirst());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$c */
    public static final class C45953c extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45953c(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            MmDetailStartUpViewControl.m182128b(this.this$0, false, 1, null);
            this.this$0.mo161411a();
            C45855f.m181666e("MmDetailStartUpViewControl", "loadData baseInfo failed: " + th);
            IMmDetailStartUpViewControlListener g = this.this$0.mo161421g();
            if (g != null) {
                g.mo161339a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/share/model/ApplyInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$d */
    static final class C45954d extends Lambda implements Function1<Function1<? super ApplyInfo, ? extends Unit>, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45954d(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function1<? super ApplyInfo, ? extends Unit> function1) {
            invoke((Function1<? super ApplyInfo, Unit>) function1);
            return Unit.INSTANCE;
        }

        public final void invoke(Function1<? super ApplyInfo, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "it");
            this.this$0.f115836d.mo161230c().mo161404a(function1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$e */
    static final class C45955e extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45955e(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.this$0.f115836d.mo161230c().mo161403a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$f */
    static final class C45956f extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45956f(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
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
            C45855f.m181664c("MmDetailStartUpViewControl", "refresh detail page");
            C47083e.m186425a(this.this$0.f115835c.mo161231e(), "vc_minutes_popup_click", C47086i.m186432a().mo165413a("click", "refresh").mo165413a("target", "none").mo165413a("popup_name", "recording_transcript_finish").mo165421c());
            this.this$0.f115833a.setVisibility(8);
            this.this$0.f115834b.setVisibility(0);
            ((IMmDetailStartUpDependency) this.this$0.mo161247w()).mo161402a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$g */
    static final class C45957g extends Lambda implements Function1<Pair<? extends MmBaseInfo, ? extends Boolean>, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45957g(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends MmBaseInfo, ? extends Boolean> pair) {
            invoke((Pair<? extends MmBaseInfo, Boolean>) pair);
            return Unit.INSTANCE;
        }

        public final void invoke(Pair<? extends MmBaseInfo, Boolean> pair) {
            Intrinsics.checkParameterIsNotNull(pair, "it");
            C45855f.m181664c("MmDetailStartUpViewControl", "loadData baseInfo success: " + pair);
            ((IMmDetailStartUpDependency) this.this$0.mo161247w()).mo161408c();
            ((IMmDetailStartUpDependency) this.this$0.mo161247w()).mo161410d();
            this.this$0.mo161417a((MmBaseInfo) pair.getFirst());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$h */
    static final class C45958h extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ MmDetailStartUpViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45958h(MmDetailStartUpViewControl dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke(th);
            return Unit.INSTANCE;
        }

        public final void invoke(Throwable th) {
            Intrinsics.checkParameterIsNotNull(th, "it");
            this.this$0.mo161411a();
            C45855f.m181666e("MmDetailStartUpViewControl", "loadData baseInfo failed: " + th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$o */
    public static final class C45965o<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ Function1 f115852a;

        C45965o(Function1 function1) {
            this.f115852a = function1;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Function1 function1 = this.f115852a;
            Intrinsics.checkExpressionValueIsNotNull(th, "it");
            function1.invoke(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$i */
    public static final class C45959i<T> implements Consumer<MmBaseInfo> {

        /* renamed from: a */
        final /* synthetic */ long f115844a;

        C45959i(long j) {
            this.f115844a = j;
        }

        /* renamed from: a */
        public final void accept(MmBaseInfo mmBaseInfo) {
            C45855f.m181664c("MmDetailStartUpViewControl", "[endLoadBaseInfo], time:" + (System.currentTimeMillis() - this.f115844a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$j */
    public static final class C45960j<T> implements Consumer<MmMeetingSubtitles> {

        /* renamed from: a */
        final /* synthetic */ long f115845a;

        C45960j(long j) {
            this.f115845a = j;
        }

        /* renamed from: a */
        public final void accept(MmMeetingSubtitles mmMeetingSubtitles) {
            C45855f.m181664c("MmDetailStartUpViewControl", "[endLoadSubtitles], time:" + (System.currentTimeMillis() - this.f115845a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$k */
    public static final class C45961k<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ long f115846a;

        C45961k(long j) {
            this.f115846a = j;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C45855f.m181664c("MmDetailStartUpViewControl", "[endCheckHasSummary], time:" + (System.currentTimeMillis() - this.f115846a));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$l */
    public static final class C45962l<T> implements Consumer<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ long f115847a;

        C45962l(long j) {
            this.f115847a = j;
        }

        /* renamed from: a */
        public final void accept(List<String> list) {
            C45855f.m181664c("MmDetailStartUpViewControl", "[endLoadKeywords], time:" + (System.currentTimeMillis() - this.f115847a));
        }
    }

    /* renamed from: a */
    public final void mo161417a(MmBaseInfo mmBaseInfo) {
        if (mmBaseInfo.getObjectStatus() == ObjectStatus.WaitASR.getValue() && !mmBaseInfo.isRecordingObjectType()) {
            mo161411a();
        }
    }

    /* renamed from: c */
    public final void mo161420c(boolean z) {
        if (z) {
            C47103g.m186550c(C47098d.m186533a(this.f115835c.mo161232n()));
            return;
        }
        Activity a = C47098d.m186533a(this.f115835c.mo161232n());
        if (a instanceof MmBaseActivity) {
            ((MmBaseActivity) a).bd_();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$n */
    public static final class C45964n<T> implements Consumer<Pair<? extends MmBaseInfo, ? extends Boolean>> {

        /* renamed from: a */
        final /* synthetic */ MmDetailStartUpViewControl f115849a;

        /* renamed from: b */
        final /* synthetic */ long f115850b;

        /* renamed from: c */
        final /* synthetic */ Function1 f115851c;

        C45964n(MmDetailStartUpViewControl dVar, long j, Function1 function1) {
            this.f115849a = dVar;
            this.f115850b = j;
            this.f115851c = function1;
        }

        /* renamed from: a */
        public final void accept(Pair<? extends MmBaseInfo, Boolean> pair) {
            MmAppreciableDetailTracker.f118515a.mo165379c();
            C45855f.m181664c("MmAppreciableDetailTracker", "request finished, time: " + (System.currentTimeMillis() - this.f115850b));
            MmBaseInfo b = ((IMmDetailStartUpDependency) this.f115849a.mo161247w()).mo161405b();
            if (b != null) {
                b.setHasSummary(pair.getSecond().booleanValue());
            }
            Function1 function1 = this.f115851c;
            Intrinsics.checkExpressionValueIsNotNull(pair, "it");
            function1.invoke(pair);
        }
    }

    @Override // com.ss.android.lark.mm.module.detail.startup.IMmDetailStartUpListener
    /* renamed from: a */
    public void mo161412a(MmMeetingBaseInfoControl.DataError dataError) {
        MmMeetingBaseInfoControl.DataError dataError2;
        Intrinsics.checkParameterIsNotNull(dataError, "dataError");
        if (dataError != MmMeetingBaseInfoControl.DataError.None && !this.f115841i) {
            mo161411a();
        }
        MmDetailErrorFactory.f115916a.mo161621a(this.f115835c, dataError, this.f115838f, ((IMmDetailStartUpDependency) mo161247w()).mo161405b(), new C45954d(this), new C45955e(this));
        if (!(dataError != MmMeetingBaseInfoControl.DataError.None || (dataError2 = this.f115842j) == null || dataError2 == MmMeetingBaseInfoControl.DataError.None)) {
            mo161418a(true);
        }
        this.f115842j = dataError;
        this.f115841i = false;
    }

    /* renamed from: b */
    public final void mo161419b(boolean z) {
        int i;
        if (!C57764ab.m224186a(C47098d.m186533a(this.f115835c.mo161232n())) || Build.VERSION.SDK_INT < 26) {
            i = 0;
        } else {
            i = C57764ab.m224185a(this.f115835c.mo161232n());
        }
        int statusBarHeight = StatusBarUtil.getStatusBarHeight(this.f115835c.mo161232n());
        if (z) {
            this.f115835c.mo161233o().setPadding(0, statusBarHeight, 0, 0);
            View findViewById = this.f115835c.mo161233o().findViewById(R.id.detail_video_toolbar);
            if (findViewById != null) {
                findViewById.setPadding(0, 0, 0, i);
                return;
            }
            return;
        }
        this.f115835c.mo161233o().setPadding(0, statusBarHeight, 0, i);
    }

    /* renamed from: a */
    public final void mo161418a(boolean z) {
        m182129j();
        m182127a(new C45952b(this), new C45953c(this), z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmDetailStartUpViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmDetailStartUpListener, IMmDetailStartUpDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f115835c = gVar;
        this.f115836d = jVar;
        View findViewById = gVar.mo161233o().findViewById(R.id.loadingView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "vcContext.getRootView().…iewById(R.id.loadingView)");
        this.f115837e = (MmLoadingView) findViewById;
        View findViewById2 = gVar.mo161233o().findViewById(R.id.emptyContainer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "vcContext.getRootView().…ById(R.id.emptyContainer)");
        this.f115838f = (FrameLayout) findViewById2;
        View findViewById3 = gVar.mo161233o().findViewById(R.id.detailRefreshTipWindow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "vcContext.getRootView().…d.detailRefreshTipWindow)");
        this.f115833a = findViewById3;
        View findViewById4 = gVar.mo161233o().findViewById(R.id.detailRefreshButton);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "vcContext.getRootView().…R.id.detailRefreshButton)");
        this.f115839g = findViewById4;
        View findViewById5 = gVar.mo161233o().findViewById(R.id.detailRefreshTopicTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "vcContext.getRootView().….id.detailRefreshTopicTv)");
        this.f115840h = (TextView) findViewById5;
        View findViewById6 = gVar.mo161233o().findViewById(R.id.refreshLoadingView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "vcContext.getRootView().…(R.id.refreshLoadingView)");
        this.f115834b = findViewById6;
    }

    /* renamed from: a */
    private final void m182127a(Function1<? super Pair<? extends MmBaseInfo, Boolean>, Unit> function1, Function1<? super Throwable, Unit> function12, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C45855f.m181664c("MmDetailStartUpViewControl", "api request begin");
        MmAppreciableDetailTracker.f118515a.mo165378b();
        Disposable subscribe = Single.zip(((IMmDetailStartUpDependency) mo161247w()).mo161401a(z).doOnSuccess(new C45959i(currentTimeMillis)), ((IMmDetailStartUpDependency) mo161247w()).mo161406b(z).doOnSuccess(new C45960j(currentTimeMillis)), ((IMmDetailStartUpDependency) mo161247w()).mo161407c(z).doOnSuccess(new C45961k(currentTimeMillis)), ((IMmDetailStartUpDependency) mo161247w()).mo161409d(z).doOnSuccess(new C45962l(currentTimeMillis)), C45963m.f115848a).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C45964n(this, currentTimeMillis, function1), new C45965o(function12));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "Single.zip(getDependency…ed(it)\n                })");
        C47108b.m186566a(subscribe, this.f115835c.mo161232n());
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "", "baseInfo", "<anonymous parameter 1>", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "hasSummary", "<anonymous parameter 3>", "", "", "apply", "(Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;Ljava/lang/Boolean;Ljava/util/List;)Lkotlin/Pair;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.b.d$m */
    public static final class C45963m<T1, T2, T3, T4, R> implements AbstractC68315g<MmBaseInfo, MmMeetingSubtitles, Boolean, List<? extends String>, Pair<? extends MmBaseInfo, ? extends Boolean>> {

        /* renamed from: a */
        public static final C45963m f115848a = new C45963m();

        C45963m() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.AbstractC68315g
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Pair<? extends MmBaseInfo, ? extends Boolean> mo161434a(MmBaseInfo mmBaseInfo, MmMeetingSubtitles mmMeetingSubtitles, Boolean bool, List<? extends String> list) {
            return mo161435a(mmBaseInfo, mmMeetingSubtitles, bool, (List<String>) list);
        }

        /* renamed from: a */
        public final Pair<MmBaseInfo, Boolean> mo161435a(MmBaseInfo mmBaseInfo, MmMeetingSubtitles mmMeetingSubtitles, Boolean bool, List<String> list) {
            Intrinsics.checkParameterIsNotNull(mmBaseInfo, "baseInfo");
            Intrinsics.checkParameterIsNotNull(mmMeetingSubtitles, "<anonymous parameter 1>");
            Intrinsics.checkParameterIsNotNull(bool, "hasSummary");
            Intrinsics.checkParameterIsNotNull(list, "<anonymous parameter 3>");
            return TuplesKt.to(mmBaseInfo, bool);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m182126a(MmDetailStartUpViewControl dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dVar.mo161418a(z);
    }

    /* renamed from: b */
    static /* synthetic */ void m182128b(MmDetailStartUpViewControl dVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        dVar.mo161419b(z);
    }
}
