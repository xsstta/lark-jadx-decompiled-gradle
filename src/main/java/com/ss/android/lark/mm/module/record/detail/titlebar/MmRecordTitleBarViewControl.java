package com.ss.android.lark.mm.module.record.detail.titlebar;

import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmInquirer;
import com.ss.android.lark.mm.module.framework.IMmViewControlContext;
import com.ss.android.lark.mm.module.framework.MmBaseViewControl;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.p2288b.C45852d;
import com.ss.android.lark.mm.statistics.hitpoint.C47083e;
import com.ss.android.lark.mm.statistics.hitpoint.C47086i;
import com.ss.android.lark.mm.utils.ktextensions.C47107a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0002B!\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBarViewControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControl;", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/IMmRecordTitleBarListener;", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/IMmRecordTitleBarDependency;", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/IMmRecordTitleBarInquirer;", "vcContext", "Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "controlAdapter", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "(Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;)V", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getControlAdapter", "()Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "recordTitleBar", "Lcom/ss/android/lark/mm/module/record/detail/titlebar/MmRecordTitleBar;", "kotlin.jvm.PlatformType", "getVcContext", "()Lcom/ss/android/lark/mm/module/framework/IMmViewControlContext;", "getMmInquirer", "Lcom/ss/android/lark/mm/module/framework/IMmInquirer;", "getMmListener", "onCreate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.e */
public final class MmRecordTitleBarViewControl extends MmBaseViewControl<IMmRecordTitleBarListener, IMmRecordTitleBarDependency> implements IMmRecordTitleBarInquirer, IMmRecordTitleBarListener {

    /* renamed from: a */
    public final MmRecordTitleBar f118123a;

    /* renamed from: b */
    public final MmBaseInfo f118124b;

    /* renamed from: c */
    private final IMmViewControlContext f118125c;

    /* renamed from: d */
    private final MmBaseViewControlAdapter<IMmRecordTitleBarListener, IMmRecordTitleBarDependency> f118126d;

    /* renamed from: a */
    public IMmRecordTitleBarListener mo161243c() {
        return this;
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    /* renamed from: e */
    public IMmInquirer mo161244e() {
        return this;
    }

    /* renamed from: b */
    public final IMmViewControlContext mo164760b() {
        return this.f118125c;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.e$a */
    static final class C46919a extends Lambda implements Function0<Unit> {
        final /* synthetic */ MmRecordTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46919a(MmRecordTitleBarViewControl eVar) {
            super(0);
            this.this$0 = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (!C45852d.m181651a().mo161150a(this.this$0.f118124b.getObjectToken()).mo164531j()) {
                FragmentActivity a = C47107a.m186565a(this.this$0.mo164760b().mo161232n());
                if (a != null) {
                    a.finish();
                    return;
                }
                return;
            }
            C45852d.m181651a().mo161150a(this.this$0.f118124b.getObjectToken()).mo164522a(true);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControl
    public void be_() {
        super.be_();
        this.f118123a.setOnBackClickListener(new C46919a(this));
        this.f118123a.setIsEditable(this.f118124b.isRecordingDevice());
        MmRecordTitleBar mmRecordTitleBar = this.f118123a;
        String topic = this.f118124b.getTopic();
        Intrinsics.checkExpressionValueIsNotNull(topic, "baseInfo.topic");
        mmRecordTitleBar.setTitle(topic);
        this.f118123a.setTime(this.f118124b.getStartTime());
        this.f118123a.setTitleEditor(new C46920b(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.detail.titlebar.e$b */
    public static final class C46920b extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ MmRecordTitleBarViewControl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46920b(MmRecordTitleBarViewControl eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke(str);
            return Unit.INSTANCE;
        }

        public final void invoke(final String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            C47083e.m186425a(this.this$0.mo164760b().mo161231e(), "vc_minutes_recording_click", C47086i.m186432a().mo165422d("header_title_edit").mo165423e("none").mo165414a("is_change", !Intrinsics.areEqual(str, this.this$0.f118123a.getTitle())).mo165421c());
            ((IMmRecordTitleBarDependency) this.this$0.mo161247w()).mo164755a(str, new Function0<Unit>(this) {
                /* class com.ss.android.lark.mm.module.record.detail.titlebar.MmRecordTitleBarViewControl.C46920b.C469211 */
                final /* synthetic */ C46920b this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.f118123a.setTitle(str);
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmRecordTitleBarViewControl(IMmViewControlContext gVar, MmBaseViewControlAdapter<IMmRecordTitleBarListener, IMmRecordTitleBarDependency> jVar) {
        super(gVar, jVar);
        Intrinsics.checkParameterIsNotNull(gVar, "vcContext");
        Intrinsics.checkParameterIsNotNull(jVar, "controlAdapter");
        this.f118125c = gVar;
        this.f118126d = jVar;
        this.f118123a = (MmRecordTitleBar) gVar.mo161233o().findViewById(R.id.recordTitleBar);
        this.f118124b = jVar.mo161230c().mo164754a();
    }
}
