package com.ss.android.lark.mm.module.detail.contentdetail;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.main.IMmDetailListener;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68294a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailListener;", "Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailDependency;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailControl;)V", "getDependency", "onCreate", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.a.h */
public final class MmContentDetailViewControlAdapter extends MmBaseViewControlAdapter<IMmContentDetailListener, IMmContentDetailDependency> {

    /* renamed from: a */
    public final MmViewControlRegister f115828a;

    /* renamed from: b */
    public final MmControlRegister f115829b;

    /* renamed from: c */
    public final MmContentDetailControl f115830c;

    /* renamed from: b */
    public IMmContentDetailDependency mo161230c() {
        return new C45946a(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0016J,\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u001c\u0010\u0011\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\nH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"com/ss/android/lark/mm/module/detail/contentdetail/MmContentDetailViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/contentdetail/IMmContentDetailDependency;", "getHost", "", "getToken", "loadBaseInfo", "", "isFromNetwork", "", "onSuccess", "Lkotlin/Function1;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "loadParticipants", "offset", "", "size", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants;", "loadShareFiles", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo$File;", "notifyTopicUpdated", "notifyUpdateViewDismiss", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.h$a */
    public static final class C45946a implements IMmContentDetailDependency {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailViewControlAdapter f115831a;

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: a */
        public String mo161342a() {
            return this.f115831a.f115830c.mo161353a();
        }

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: b */
        public String mo161346b() {
            return this.f115831a.f115830c.mo161356b();
        }

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: c */
        public void mo161347c() {
            IMmDetailListener cVar = (IMmDetailListener) this.f115831a.f115828a.mo161266d(IMmDetailListener.class);
            if (cVar != null) {
                cVar.mo161907j();
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: d */
        public void mo161348d() {
            IMmDetailListener cVar;
            String str;
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f115831a.f115829b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null && (cVar = (IMmDetailListener) this.f115831a.f115828a.mo161266d(IMmDetailListener.class)) != null) {
                MmBaseInfo b = mmMeetingBaseInfoControl.mo161581b();
                if (b != null) {
                    str = b.getTopic();
                } else {
                    str = null;
                }
                cVar.mo161901a(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.a.h$a$a */
        static final class C45947a extends Lambda implements Function1<MmBaseInfo, Unit> {
            final /* synthetic */ Function1 $onSuccess;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C45947a(Function1 function1) {
                super(1);
                this.$onSuccess = function1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(MmBaseInfo mmBaseInfo) {
                invoke(mmBaseInfo);
                return Unit.INSTANCE;
            }

            public final void invoke(MmBaseInfo mmBaseInfo) {
                Intrinsics.checkParameterIsNotNull(mmBaseInfo, "it");
                this.$onSuccess.invoke(mmBaseInfo);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.detail.a.h$a$b */
        static final class C45948b extends Lambda implements Function1<C47068a, Unit> {
            public static final C45948b INSTANCE = new C45948b();

            C45948b() {
                super(1);
            }

            public final void invoke(C47068a aVar) {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C47068a aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45946a(MmContentDetailViewControlAdapter hVar) {
            this.f115831a = hVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: a */
        public void mo161344a(Function1<? super MmBaseInfo.File, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            this.f115831a.f115830c.mo161355a(function1);
        }

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: a */
        public void mo161345a(boolean z, Function1<? super MmBaseInfo, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f115831a.f115829b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl == null) {
                return;
            }
            if (z) {
                MmMeetingBaseInfoControl mmMeetingBaseInfoControl2 = (MmMeetingBaseInfoControl) this.f115831a.f115829b.mo161912a(MmMeetingBaseInfoControl.class);
                if (mmMeetingBaseInfoControl2 != null) {
                    MmMeetingBaseInfoControl.m182198a(mmMeetingBaseInfoControl2, new C45947a(function1), C45948b.INSTANCE, false, true, 4, null);
                    return;
                }
                return;
            }
            function1.invoke(mmMeetingBaseInfoControl.mo161581b());
        }

        @Override // com.ss.android.lark.mm.module.detail.contentdetail.IMmContentDetailDependency
        /* renamed from: a */
        public void mo161343a(int i, int i2, Function1<? super MmParticipants, Unit> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "onSuccess");
            this.f115831a.f115830c.mo161354a(i, i2, function1);
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        C68294a<MmBaseInfo> e;
        Disposable subscribe;
        super.mo161251a();
        MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f115829b.mo161912a(MmMeetingBaseInfoControl.class);
        if (mmMeetingBaseInfoControl != null && (e = mmMeetingBaseInfoControl.mo161587e()) != null && (subscribe = e.subscribe(new C45949b(this))) != null) {
            mo161257h().mo237937a(subscribe);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.a.h$b */
    static final class C45949b<T> implements Consumer<MmBaseInfo> {

        /* renamed from: a */
        final /* synthetic */ MmContentDetailViewControlAdapter f115832a;

        C45949b(MmContentDetailViewControlAdapter hVar) {
            this.f115832a = hVar;
        }

        /* renamed from: a */
        public final void accept(MmBaseInfo mmBaseInfo) {
            C45855f.m181663b("MmContentDetailViewControlAdapter", "onBaseInfoChange");
            IMmContentDetailListener cVar = (IMmContentDetailListener) this.f115832a.mo161258i();
            if (cVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(mmBaseInfo, "it");
                cVar.mo161350a(mmBaseInfo);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmContentDetailViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmContentDetailControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f115828a = kVar;
        this.f115829b = eVar;
        this.f115830c = dVar;
    }
}
