package com.ss.android.lark.profile.func.medal.detail;

import androidx.lifecycle.C1143ag;
import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0002H\u0014J\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "userId", "", "medalId", "grantId", ShareHitPoint.f121868c, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getGrantId", "()Ljava/lang/String;", "getMedalId", "getSource", "()I", "getUserId", "defaultState", "loadMedalDetail", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.medal.detail.j */
public final class MedalDetailViewModel extends JackViewModel<MedalDetailState> {
    private final String grantId;
    private final String medalId;
    private final int source;
    private final String userId;

    public MedalDetailViewModel() {
        this(null, null, null, 0, 15, null);
    }

    public final String getGrantId() {
        return this.grantId;
    }

    public final String getMedalId() {
        return this.medalId;
    }

    public final int getSource() {
        return this.source;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final void loadMedalDetail() {
        withState(new C52380a(this));
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public MedalDetailState defaultState() {
        return new MedalDetailState(null, null, this.userId, this.medalId, this.grantId, this.source, false, null, 195, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/profile/func/medal/detail/MedalDetailState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.medal.detail.j$a */
    public static final class C52380a extends Lambda implements Function1<MedalDetailState, Unit> {
        final /* synthetic */ MedalDetailViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52380a(MedalDetailViewModel jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MedalDetailState iVar) {
            invoke(iVar);
            return Unit.INSTANCE;
        }

        public final void invoke(final MedalDetailState iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "it");
            Job unused = C69553g.m266944a(C1143ag.m5356a(this.this$0), null, null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, null) {
                /* class com.ss.android.lark.profile.func.medal.detail.MedalDetailViewModel.C52380a.C523811 */
                Object L$0;
                int label;
                private CoroutineScope p$;
                final /* synthetic */ C52380a this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                    Intrinsics.checkParameterIsNotNull(cVar, "completion");
                    C523811 r0 = 

                    public MedalDetailViewModel(String str, String str2, String str3, int i) {
                        Intrinsics.checkParameterIsNotNull(str, "userId");
                        Intrinsics.checkParameterIsNotNull(str2, "medalId");
                        Intrinsics.checkParameterIsNotNull(str3, "grantId");
                        this.userId = str;
                        this.medalId = str2;
                        this.grantId = str3;
                        this.source = i;
                    }

                    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ MedalDetailViewModel(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? MedalDetailSource.SOURCE_MEDAL_WALL.getValue() : i);
                    }
                }
