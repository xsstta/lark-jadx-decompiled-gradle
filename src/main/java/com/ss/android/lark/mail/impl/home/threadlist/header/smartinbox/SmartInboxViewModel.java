package com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox;

import androidx.lifecycle.LifecycleObserver;
import com.bytedance.lark.pb.email.client.v1.MailGetSmartInboxPreviewCardResponse;
import com.bytedance.lark.pb.email.client.v1.SmartInboxPreviewCard;
import com.larksuite.arch.jack.JackViewModel;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43362e;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.service.watchers.rustwatchers.SmartInboxCardChangeWatcher;
import com.ss.android.lark.mail.impl.utils.C43849u;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0014J\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxViewModel;", "Lcom/larksuite/arch/jack/JackViewModel;", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxState;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "smartInboxCardCallback", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/ISmartInboxCardCallback;", "getSmartInboxCardCallback", "()Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/ISmartInboxCardCallback;", "setSmartInboxCardCallback", "(Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/ISmartInboxCardCallback;)V", "clickCard", "", "closeSmartInboxCard", "defaultState", "requestSmartInboxCard", "setCurrentLabel", "currentLabel", "", "updatePreviewCard", "changeSmartLabel", "updateSmartInboxVisibleTime", "leaveLabel", "enterLabel", "Companion", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SmartInboxViewModel extends JackViewModel<SmartInboxState> implements LifecycleObserver {
    public static final Companion Companion = new Companion(null);
    private ISmartInboxCardCallback smartInboxCardCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxViewModel$Companion;", "", "()V", "COMMA", "", "TAG", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final ISmartInboxCardCallback getSmartInboxCardCallback() {
        return this.smartInboxCardCallback;
    }

    public SmartInboxViewModel() {
        initialize(new Function1<SmartInboxState, SmartInboxState>(this) {
            /* class com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel.C426851 */
            final /* synthetic */ SmartInboxViewModel this$0;

            {
                this.this$0 = r1;
            }

            public final SmartInboxState invoke(SmartInboxState bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                return this.this$0.defaultState();
            }
        });
    }

    public final void clickCard() {
        withState(new C42686b(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxViewModel$requestSmartInboxCard$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/email/client/v1/MailGetSmartInboxPreviewCardResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "mailGetSmartInboxPreviewCardResponse", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel$c */
    public static final class C42687c implements IGetDataCallback<MailGetSmartInboxPreviewCardResponse> {

        /* renamed from: a */
        final /* synthetic */ SmartInboxViewModel f108608a;

        /* renamed from: b */
        final /* synthetic */ String f108609b;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel$c$b */
        public static final class RunnableC42690b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42687c f108614a;

            RunnableC42690b(C42687c cVar) {
                this.f108614a = cVar;
            }

            public final void run() {
                this.f108614a.f108608a.setState(C426911.INSTANCE);
                this.f108614a.f108608a.withState(C426922.INSTANCE);
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel$c$a */
        public static final class RunnableC42688a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C42687c f108610a;

            /* renamed from: b */
            final /* synthetic */ Ref.BooleanRef f108611b;

            /* renamed from: c */
            final /* synthetic */ Ref.IntRef f108612c;

            /* renamed from: d */
            final /* synthetic */ String f108613d;

            RunnableC42688a(C42687c cVar, Ref.BooleanRef booleanRef, Ref.IntRef intRef, String str) {
                this.f108610a = cVar;
                this.f108611b = booleanRef;
                this.f108612c = intRef;
                this.f108613d = str;
            }

            public final void run() {
                this.f108610a.f108608a.setState(new Function1<SmartInboxState, SmartInboxState>(this) {
                    /* class com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel.C42687c.RunnableC42688a.C426891 */
                    final /* synthetic */ RunnableC42688a this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final SmartInboxState invoke(SmartInboxState bVar) {
                        Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
                        boolean z = this.this$0.f108611b.element;
                        int i = this.this$0.f108612c.element;
                        String str = this.this$0.f108613d;
                        C43374f f = C43374f.m172264f();
                        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
                        String q = f.mo155129q();
                        Intrinsics.checkExpressionValueIsNotNull(q, "MailAggregationService.g…nstance().currentEntityId");
                        return new SmartInboxState(z, i, str, q);
                    }
                });
                ((SmartInboxCardChangeWatcher) Watchers.m167205a(SmartInboxCardChangeWatcher.class)).mo152873a(this.f108611b.element, this.f108612c.element);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("SmartInboxViewModel", "SmartInboxViewModel onError");
        }

        /* renamed from: a */
        public void onSuccess(MailGetSmartInboxPreviewCardResponse mailGetSmartInboxPreviewCardResponse) {
            ArrayList arrayList;
            Intrinsics.checkParameterIsNotNull(mailGetSmartInboxPreviewCardResponse, "mailGetSmartInboxPreviewCardResponse");
            SmartInboxPreviewCard smartInboxPreviewCard = mailGetSmartInboxPreviewCardResponse.smart_inbox_preview_card;
            if (smartInboxPreviewCard == null || (arrayList = smartInboxPreviewCard.sender_names) == null) {
                arrayList = new ArrayList();
            }
            Log.m165389i("SmartInboxViewModel", "testSmartInbox onSuccess fromStrList:" + arrayList.size() + " labelID:" + this.f108609b);
            if (arrayList.size() > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    stringBuffer.append((String) arrayList.get(i));
                    if (i < arrayList.size() - 1) {
                        stringBuffer.append(", ");
                    }
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = 1;
                String stringBuffer2 = stringBuffer.toString();
                Intrinsics.checkExpressionValueIsNotNull(stringBuffer2, "stringBuffer.toString()");
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                booleanRef.element = false;
                if (Intrinsics.areEqual("IMPORTANT", this.f108609b)) {
                    intRef.element = 1;
                    booleanRef.element = true;
                } else if (Intrinsics.areEqual("OTHER", this.f108609b)) {
                    intRef.element = 2;
                    booleanRef.element = true;
                }
                C43849u.m173826a(new RunnableC42688a(this, booleanRef, intRef, stringBuffer2));
                return;
            }
            C43849u.m173826a(new RunnableC42690b(this));
        }

        C42687c(SmartInboxViewModel smartInboxViewModel, String str) {
            this.f108608a = smartInboxViewModel;
            this.f108609b = str;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.arch.jack.JackViewModel
    public SmartInboxState defaultState() {
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        String q = f.mo155129q();
        Intrinsics.checkExpressionValueIsNotNull(q, "MailAggregationService.g…nstance().currentEntityId");
        return new SmartInboxState(false, 2, "", q);
    }

    public final void closeSmartInboxCard() {
        Log.m165389i("SmartInboxViewModel", "SmartInboxViewModel testSmartInbox closeSmartInboxCard");
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (Intrinsics.areEqual("IMPORTANT", f.mo155129q())) {
            C43362e.m172201a().mo155086b(System.currentTimeMillis());
            return;
        }
        C43374f f2 = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
        if (Intrinsics.areEqual("OTHER", f2.mo155129q())) {
            C43362e.m172201a().mo155076a(System.currentTimeMillis());
        }
    }

    public final void requestSmartInboxCard() {
        Log.m165389i("SmartInboxViewModel", "testSmartInbox requestSmartInboxCard");
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (f.mo155134v()) {
            String str = null;
            C43374f f2 = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
            if (Intrinsics.areEqual("IMPORTANT", f2.mo155129q())) {
                str = "OTHER";
            } else {
                C43374f f3 = C43374f.m172264f();
                Intrinsics.checkExpressionValueIsNotNull(f3, "MailAggregationService.getInstance()");
                if (Intrinsics.areEqual("OTHER", f3.mo155129q())) {
                    str = "IMPORTANT";
                }
            }
            if (str != null) {
                C42176e.m168344a().mo152247d(str, new C42687c(this, str));
            }
        }
    }

    public final void setSmartInboxCardCallback(ISmartInboxCardCallback aVar) {
        this.smartInboxCardCallback = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel$b */
    public static final class C42686b extends Lambda implements Function1<SmartInboxState, Unit> {
        final /* synthetic */ SmartInboxViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42686b(SmartInboxViewModel smartInboxViewModel) {
            super(1);
            this.this$0 = smartInboxViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SmartInboxState bVar) {
            invoke(bVar);
            return Unit.INSTANCE;
        }

        public final void invoke(SmartInboxState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            ISmartInboxCardCallback smartInboxCardCallback = this.this$0.getSmartInboxCardCallback();
            if (smartInboxCardCallback != null) {
                MailLabelEntity mailLabelEntity = null;
                int i = 0;
                if (bVar.mo153344b() == 1) {
                    mailLabelEntity = C43374f.m172264f().mo155117c("IMPORTANT");
                    C42187a.m168558n(C42187a.C42191c.f107447X);
                } else if (bVar.mo153344b() == 2) {
                    mailLabelEntity = C43374f.m172264f().mo155117c("OTHER");
                    C42187a.m168558n(C42187a.C42191c.f107446W);
                    i = 1;
                }
                if (mailLabelEntity != null) {
                    smartInboxCardCallback.onSmartInboxCardOnClick(i, mailLabelEntity);
                }
            }
        }
    }

    public final void setCurrentLabel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "currentLabel");
        setState(new C42693d(str));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/mail/impl/home/threadlist/header/smartinbox/SmartInboxState;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.home.threadlist.header.smartinbox.SmartInboxViewModel$d */
    public static final class C42693d extends Lambda implements Function1<SmartInboxState, SmartInboxState> {
        final /* synthetic */ String $currentLabel;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42693d(String str) {
            super(1);
            this.$currentLabel = str;
        }

        public final SmartInboxState invoke(SmartInboxState bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "$receiver");
            return SmartInboxState.m170176a(bVar, false, 0, null, this.$currentLabel, 7, null);
        }
    }

    public final void updatePreviewCard(String str) {
        Intrinsics.checkParameterIsNotNull(str, "changeSmartLabel");
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (!f.mo155134v()) {
            Log.m165389i("SmartInboxViewModel", "SmartInboxViewModel updatePreviewCard return");
            return;
        }
        String str2 = null;
        C43374f f2 = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f2, "MailAggregationService.getInstance()");
        if (Intrinsics.areEqual("IMPORTANT", f2.mo155129q())) {
            str2 = "OTHER";
        } else {
            C43374f f3 = C43374f.m172264f();
            Intrinsics.checkExpressionValueIsNotNull(f3, "MailAggregationService.getInstance()");
            if (Intrinsics.areEqual("OTHER", f3.mo155129q())) {
                str2 = "IMPORTANT";
            }
        }
        Log.m165389i("SmartInboxViewModel", "SmartInboxViewModel updatePreviewCard watchLabelID:" + str2);
        if (Intrinsics.areEqual(str2, str)) {
            Log.m165389i("SmartInboxViewModel", "testSmartInbox requestSmartInboxCard");
            requestSmartInboxCard();
        }
    }

    public final void updateSmartInboxVisibleTime(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "leaveLabel");
        Intrinsics.checkParameterIsNotNull(str2, "enterLabel");
        Log.m165389i("SmartInboxViewModel", "SmartInboxViewModel testSmartInbox updateSmartInboxVisibleTime " + "leaveLabel:" + str + " enterLabel:" + str2);
        C43374f f = C43374f.m172264f();
        Intrinsics.checkExpressionValueIsNotNull(f, "MailAggregationService.getInstance()");
        if (f.mo155134v()) {
            if (Intrinsics.areEqual("OTHER", str) || Intrinsics.areEqual("OTHER", str2)) {
                Log.m165389i("SmartInboxViewModel", "testSmartInbox updateSmartInboxVisibleTime LABEL_ID_OTHER");
                C43362e.m172201a().mo155086b(System.currentTimeMillis());
            }
            if (Intrinsics.areEqual("IMPORTANT", str) || Intrinsics.areEqual("IMPORTANT", str2)) {
                Log.m165389i("SmartInboxViewModel", "testSmartInbox updateSmartInboxVisibleTime LABEL_ID_IMPORTANT");
                C43362e.m172201a().mo155076a(System.currentTimeMillis());
            }
        }
    }
}
