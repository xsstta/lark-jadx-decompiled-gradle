package com.ss.android.lark.mail.impl.home.menu;

import android.text.TextUtils;
import com.bytedance.ee.util.p702e.C13657b;
import com.google.firebase.messaging.Constants;
import com.larksuite.arch.jack.JackViewModel;
import com.ss.android.lark.mail.impl.AbstractC41849c;
import com.ss.android.lark.mail.impl.C41816b;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.menu.label.C42589a;
import com.ss.android.lark.mail.impl.p2171h.C42330c;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0002H\u0014J\u0018\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0002J*\u0010\u000e\u001a\u00020\n2\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00102\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0010J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/menu/MailMenuViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "()V", "mDelayUpdateTipsRunnable", "Ljava/lang/Runnable;", "mStartLoadingTime", "", "defaultState", "filterAndSortLabel", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/android/lark/mail/impl/entity/MailLabelEntity;", "setData", "labels", "", "folders", "setLoadingType", "loadingType", "", "setStatus", "isNetworkError", "", "show", "isShow", "updateOtherLabelUI", "isPreviewCardShow", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.home.menu.i */
public final class MailMenuViewModel extends JackViewModel<MailMenuState> {
    public Runnable mDelayUpdateTipsRunnable;
    public long mStartLoadingTime;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public MailMenuState defaultState() {
        return new MailMenuState(false, 1, new ArrayList(), false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.i$a */
    public static final class C42575a extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ List $menuItems;
        final /* synthetic */ MailMenuViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42575a(MailMenuViewModel iVar, List list) {
            super(1);
            this.this$0 = iVar;
            this.$menuItems = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = hVar.mo153057b();
            if (!C13657b.m55421a(this.$menuItems)) {
                intRef.element = 0;
            }
            this.this$0.setState(new Function1<MailMenuState, MailMenuState>(this) {
                /* class com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel.C42575a.C425761 */
                final /* synthetic */ C42575a this$0;

                {
                    this.this$0 = r1;
                }

                public final MailMenuState invoke(MailMenuState hVar) {
                    Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
                    return MailMenuState.m169863a(hVar, false, intRef.element, this.this$0.$menuItems, false, 9, null);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.i$b */
    public static final class C42577b extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ int $loadingType;
        final /* synthetic */ MailMenuViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42577b(MailMenuViewModel iVar, int i) {
            super(1);
            this.this$0 = iVar;
            this.$loadingType = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            if (hVar.mo153057b() == 1) {
                long currentTimeMillis = System.currentTimeMillis() - this.this$0.mStartLoadingTime;
                long j = (long) ParticipantRepo.f117150c;
                if (currentTimeMillis < j) {
                    this.this$0.mDelayUpdateTipsRunnable = new Runnable(this) {
                        /* class com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel.C42577b.RunnableC425781 */

                        /* renamed from: a */
                        final /* synthetic */ C42577b f108364a;

                        {
                            this.f108364a = r1;
                        }

                        public final void run() {
                            this.f108364a.this$0.setState(new Function1<MailMenuState, MailMenuState>(this) {
                                /* class com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel.C42577b.RunnableC425781.C425791 */
                                final /* synthetic */ RunnableC425781 this$0;

                                {
                                    this.this$0 = r1;
                                }

                                public final MailMenuState invoke(MailMenuState hVar) {
                                    Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
                                    return MailMenuState.m169863a(hVar, false, this.this$0.f108364a.$loadingType, null, false, 13, null);
                                }
                            });
                        }
                    };
                    C43849u.m173827a(this.this$0.mDelayUpdateTipsRunnable, (this.this$0.mStartLoadingTime + j) - System.currentTimeMillis());
                    return;
                }
            }
            this.this$0.setState(new Function1<MailMenuState, MailMenuState>(this) {
                /* class com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel.C42577b.C425802 */
                final /* synthetic */ C42577b this$0;

                {
                    this.this$0 = r1;
                }

                public final MailMenuState invoke(MailMenuState hVar) {
                    Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
                    return MailMenuState.m169863a(hVar, false, this.this$0.$loadingType, null, false, 13, null);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.i$c */
    public static final class C42581c extends Lambda implements Function1<MailMenuState, Unit> {
        final /* synthetic */ boolean $isNetworkError;
        final /* synthetic */ Ref.IntRef $tipsStation;
        final /* synthetic */ MailMenuViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42581c(MailMenuViewModel iVar, Ref.IntRef intRef, boolean z) {
            super(1);
            this.this$0 = iVar;
            this.$tipsStation = intRef;
            this.$isNetworkError = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MailMenuState hVar) {
            invoke(hVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MailMenuState hVar) {
            int i;
            Intrinsics.checkParameterIsNotNull(hVar, "it");
            if (hVar.mo153056a() && C13657b.m55421a(hVar.mo153058c())) {
                Ref.IntRef intRef = this.$tipsStation;
                if (this.$isNetworkError) {
                    i = 3;
                } else {
                    i = 2;
                }
                intRef.element = i;
            }
            this.this$0.setState(new Function1<MailMenuState, MailMenuState>(this) {
                /* class com.ss.android.lark.mail.impl.home.menu.MailMenuViewModel.C42581c.C425821 */
                final /* synthetic */ C42581c this$0;

                {
                    this.this$0 = r1;
                }

                public final MailMenuState invoke(MailMenuState hVar) {
                    Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
                    return MailMenuState.m169863a(hVar, false, this.this$0.$tipsStation.element, null, false, 13, null);
                }
            });
        }
    }

    public final void show(boolean z) {
        if (z) {
            C42330c.m169040a();
        }
        setState(new C42583d(z));
    }

    public final void updateOtherLabelUI(boolean z) {
        setState(new C42584e(z));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.i$d */
    public static final class C42583d extends Lambda implements Function1<MailMenuState, MailMenuState> {
        final /* synthetic */ boolean $isShow;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42583d(boolean z) {
            super(1);
            this.$isShow = z;
        }

        public final MailMenuState invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
            return MailMenuState.m169863a(hVar, this.$isShow, 0, null, false, 14, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/menu/MailMenuState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.menu.i$e */
    public static final class C42584e extends Lambda implements Function1<MailMenuState, MailMenuState> {
        final /* synthetic */ boolean $isPreviewCardShow;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42584e(boolean z) {
            super(1);
            this.$isPreviewCardShow = z;
        }

        public final MailMenuState invoke(MailMenuState hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "$receiver");
            return MailMenuState.m169863a(hVar, false, 0, null, this.$isPreviewCardShow, 7, null);
        }
    }

    public final void setLoadingType(int i) {
        if (i == 1) {
            this.mStartLoadingTime = System.currentTimeMillis();
        }
        Runnable runnable = this.mDelayUpdateTipsRunnable;
        if (runnable != null) {
            C43849u.m173829b(runnable);
        }
        withState(new C42577b(this, i));
    }

    public final void setStatus(boolean z) {
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        withState(new C42581c(this, intRef, z));
    }

    private final void filterAndSortLabel(List<MailLabelEntity> list) {
        AbstractC41849c a = C41816b.m166115a();
        Intrinsics.checkExpressionValueIsNotNull(a, "Host.get()");
        boolean a2 = a.mo150154u().mo150160a("larkmail.cli.quicklabel");
        MailLabelEntity mailLabelEntity = null;
        MailLabelEntity mailLabelEntity2 = mailLabelEntity;
        MailLabelEntity mailLabelEntity3 = mailLabelEntity2;
        for (int size = list.size() - 1; size >= 0; size--) {
            MailLabelEntity mailLabelEntity4 = list.get(size);
            if (mailLabelEntity4 != null) {
                if (a2 || !Intrinsics.areEqual("FLAGGED", mailLabelEntity4.mo151527k())) {
                    if (Intrinsics.areEqual("INBOX", mailLabelEntity4.mo151527k())) {
                        mailLabelEntity2 = mailLabelEntity4;
                    }
                    if (Intrinsics.areEqual("IMPORTANT", mailLabelEntity4.mo151527k())) {
                        list.remove(size);
                        mailLabelEntity3 = mailLabelEntity4;
                    } else if (Intrinsics.areEqual("OTHER", mailLabelEntity4.mo151527k())) {
                        list.remove(size);
                        mailLabelEntity = mailLabelEntity4;
                    } else if (!mailLabelEntity4.mo151534r()) {
                        list.remove(size);
                    }
                } else {
                    list.remove(size);
                }
            }
        }
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (!(!f.mo155134v() || mailLabelEntity == null || mailLabelEntity3 == null)) {
            if (mailLabelEntity2 != null) {
                list.remove(mailLabelEntity2);
            }
            list.add(0, mailLabelEntity);
            list.add(0, mailLabelEntity3);
        }
    }

    public final void setData(List<? extends MailLabelEntity> list, List<? extends MailLabelEntity> list2) {
        List<MailLabelEntity> list3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(list);
            filterAndSortLabel(arrayList3);
            C43374f f = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
            MailLabelEntity r = f.mo155130r();
            int size = arrayList3.size();
            int i = 0;
            int i2 = 0;
            while (i < size && (r7 = arrayList3.get(i)) != null && r7.mo151529m()) {
                i2 = i;
                i++;
            }
            if (arrayList3.size() == 0) {
                arrayList = new ArrayList();
                list3 = new ArrayList();
            } else {
                ArrayList arrayList4 = arrayList3;
                int i3 = i2 + 1;
                List subList = arrayList4.subList(0, i3);
                Intrinsics.checkExpressionValueIsNotNull(subList, "labels.subList(0, lastSystemLabelIndex + 1)");
                list3 = arrayList4.subList(i3, arrayList3.size());
                Intrinsics.checkExpressionValueIsNotNull(list3, "labels.subList(lastSyste…elIndex + 1, labels.size)");
                arrayList = subList;
            }
            Iterator it = arrayList.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                MailLabelEntity mailLabelEntity = (MailLabelEntity) it.next();
                C42589a aVar = new C42589a(1, mailLabelEntity);
                if (r != null) {
                    String k = r.mo151527k();
                    if (mailLabelEntity != null) {
                        str = mailLabelEntity.mo151527k();
                    }
                    if (TextUtils.equals(k, str)) {
                        z3 = true;
                        aVar.mo153078a(z3);
                        arrayList2.add(aVar);
                    }
                }
                z3 = false;
                aVar.mo153078a(z3);
                arrayList2.add(aVar);
            }
            if (list2 != null) {
                for (MailLabelEntity mailLabelEntity2 : list2) {
                    C42589a aVar2 = new C42589a(2, mailLabelEntity2);
                    if (r != null) {
                        if (TextUtils.equals(r.mo151527k(), mailLabelEntity2 != null ? mailLabelEntity2.mo151527k() : null)) {
                            z2 = true;
                            aVar2.mo153078a(z2);
                            arrayList2.add(aVar2);
                        }
                    }
                    z2 = false;
                    aVar2.mo153078a(z2);
                    arrayList2.add(aVar2);
                }
            }
            for (MailLabelEntity mailLabelEntity3 : list3) {
                C42589a aVar3 = new C42589a(3, mailLabelEntity3);
                if (r != null) {
                    if (TextUtils.equals(r.mo151527k(), mailLabelEntity3 != null ? mailLabelEntity3.mo151527k() : null)) {
                        z = true;
                        aVar3.mo153078a(z);
                        arrayList2.add(aVar3);
                    }
                }
                z = false;
                aVar3.mo153078a(z);
                arrayList2.add(aVar3);
            }
        }
        withState(new C42575a(this, arrayList2));
    }
}
