package com.ss.android.lark.ai.textcorrection;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.AbstractC28531b;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.p1329c.AbstractC28534a;
import com.ss.android.lark.ai.p1329c.AbstractC28536c;
import com.ss.android.lark.ai.p1329c.AbstractC28537d;
import com.ss.android.lark.ai.smartcompose.C28578a;
import com.ss.android.lark.ai.smartreply.p1345c.p1346a.C28606a;
import com.ss.android.lark.ai.statistics.correction.ICorrectionHitPoint;
import com.ss.android.lark.ai.textcorrection.TextPositionHelper;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.AIGetTextCorrectionResponse;
import com.ss.android.lark.pb.ai.AITextCorrectionMatch;
import com.ss.android.lark.pb.ai.AITextCorrectionResult;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p3457e.C68296b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0003?@AB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J*\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020'H\u0002J\b\u0010+\u001a\u00020\u001bH\u0002J\u0018\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0002J*\u00101\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u00102\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0016J\u0012\u00103\u001a\u00020\u001b2\b\u00104\u001a\u0004\u0018\u000105H\u0002J\b\u00106\u001a\u00020\u001bH\u0002J\u0012\u00107\u001a\u00020\u001b2\b\u00108\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u0019H\u0016J \u0010;\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020=2\u0006\u0010-\u001a\u00020.2\u0006\u0010>\u001a\u000200H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController;", "Lcom/ss/android/lark/ai/textcorrection/ITextCorrectionController;", "hitPoint", "Lcom/ss/android/lark/ai/statistics/correction/ICorrectionHitPoint;", "(Lcom/ss/android/lark/ai/statistics/correction/ICorrectionHitPoint;)V", "guideDelegate", "Lcom/ss/android/lark/guide/ui/config/GuideDelegate;", "guideDependency", "Lcom/ss/android/lark/ai/dependency/IGuideDependency;", "ignoreFacade", "Lcom/ss/android/lark/ai/textcorrection/IgnoreFacade;", "keyboardWatcher", "Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController$KeyBoardStateListener;", "mSessionId", "", "panelRef", "Ljava/lang/ref/WeakReference;", "Landroid/widget/PopupWindow;", "requestDisposable", "Lio/reactivex/disposables/Disposable;", "requestSubject", "Lio/reactivex/subjects/PublishSubject;", "spanWatcher", "Lcom/ss/android/lark/ai/textcorrection/DirtySpanWatcher;", "textCorrectionInterface", "Lcom/ss/android/lark/ai/IComposeInterface;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "clearCorrectionTips", "destroy", "isKeyBoardShow", "", "view", "Landroid/view/View;", "isSmartCorrectionEnable", "maybeDismissPanel", "maybeShowGuide", "editText", "Landroid/widget/EditText;", "errorSpan", "Lcom/ss/android/lark/ai/textcorrection/ErrorCorrectionSpan;", "onTextChanged", "before", "process", "resp", "Lcom/ss/android/lark/pb/ai/AIGetTextCorrectionResponse;", "refreshSessionId", "requestErrorCorrection", "prefix", "setComposeInterface", "composeInterface", "showCorrectionPanel", "correction", "Lcom/ss/android/lark/pb/ai/AITextCorrectionMatch;", "span", "Companion", "DataCallback", "KeyBoardStateListener", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.e.h */
public final class TextCorrectionController implements AbstractC28542d {

    /* renamed from: d */
    public static final Companion f71733d = new Companion(null);

    /* renamed from: a */
    public IgnoreFacade f71734a = new IgnoreFacade();

    /* renamed from: b */
    public AbstractC28531b f71735b;

    /* renamed from: c */
    public final ICorrectionHitPoint f71736c;

    /* renamed from: e */
    private C68296b<String> f71737e;

    /* renamed from: f */
    private Disposable f71738f;

    /* renamed from: g */
    private WeakReference<PopupWindow> f71739g;

    /* renamed from: h */
    private final DirtySpanWatcher f71740h;

    /* renamed from: i */
    private final KeyBoardStateListener f71741i;

    /* renamed from: j */
    private GuideDelegate f71742j;

    /* renamed from: k */
    private final AbstractC28536c f71743k;

    /* renamed from: l */
    private String f71744l;

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a, com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public /* synthetic */ void mo101540a(int i) {
        IComposeController.CC.$default$a(this, i);
    }

    public void afterTextChanged(Editable editable) {
    }

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a, com.ss.android.lark.ai.IComposeController
    /* renamed from: b */
    public /* synthetic */ void mo101542b() {
        IComposeController.CC.$default$b(this);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController$Companion;", "", "()V", "TAG", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController$DataCallback;", "Lcom/larksuite/framework/callback/UIGetDataCallback;", "Lcom/ss/android/lark/pb/ai/AIGetTextCorrectionResponse;", "controller", "Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController;", "(Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController;)V", "weakRef", "Ljava/lang/ref/WeakReference;", "onErrored", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccessed", "response", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$b */
    public static final class DataCallback extends UIGetDataCallback<AIGetTextCorrectionResponse> {

        /* renamed from: a */
        private final WeakReference<TextCorrectionController> f71747a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.ai.e.h$b$a */
        public static final class RunnableC28546a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TextCorrectionController f71748a;

            /* renamed from: b */
            final /* synthetic */ AIGetTextCorrectionResponse f71749b;

            RunnableC28546a(TextCorrectionController hVar, AIGetTextCorrectionResponse aIGetTextCorrectionResponse) {
                this.f71748a = hVar;
                this.f71749b = aIGetTextCorrectionResponse;
            }

            public final void run() {
                this.f71748a.mo101641a(this.f71749b);
            }
        }

        public DataCallback(TextCorrectionController hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "controller");
            this.f71747a = new WeakReference<>(hVar);
        }

        /* renamed from: a */
        public void onSuccessed(AIGetTextCorrectionResponse aIGetTextCorrectionResponse) {
            TextCorrectionController hVar = this.f71747a.get();
            if (hVar != null) {
                UICallbackExecutor.execute(new RunnableC28546a(hVar, aIGetTextCorrectionResponse));
            }
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            if (this.f71747a.get() != null) {
                Log.m165384e("CorrectionController", "onError", errorResult);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/ai/textcorrection/TextCorrectionController$KeyBoardStateListener;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "()V", "lastKeyBoardVisibility", "", "getLastKeyBoardVisibility", "()Z", "setLastKeyBoardVisibility", "(Z)V", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$c */
    public static abstract class KeyBoardStateListener implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        private boolean f71750a;

        /* renamed from: a */
        public final boolean mo101654a() {
            return this.f71750a;
        }

        /* renamed from: a */
        public final void mo101653a(boolean z) {
            this.f71750a = z;
        }
    }

    /* renamed from: f */
    private final void m104673f() {
        this.f71744l = UUID.randomUUID().toString();
    }

    /* renamed from: c */
    public final void mo101647c() {
        PopupWindow popupWindow;
        WeakReference<PopupWindow> weakReference = this.f71739g;
        if (weakReference != null && (popupWindow = weakReference.get()) != null) {
            popupWindow.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$g */
    public static final class C28550g implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ErrorCorrectionSpan f71765a;

        /* renamed from: b */
        final /* synthetic */ EditText f71766b;

        C28550g(ErrorCorrectionSpan cVar, EditText editText) {
            this.f71765a = cVar;
            this.f71766b = editText;
        }

        public final void onDismiss() {
            ErrorCorrectionSpan cVar = this.f71765a;
            Editable text = this.f71766b.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "editText.text");
            cVar.mo101615a(text, false);
        }
    }

    /* renamed from: e */
    private final boolean m104672e() {
        if (C28522a.m104531a().mo101558a("ai.smartcorrect.message")) {
            AbstractC28534a a = C28522a.m104531a();
            Intrinsics.checkExpressionValueIsNotNull(a, "AIModule.getDependency()");
            AbstractC28537d b = a.mo101559b();
            Intrinsics.checkExpressionValueIsNotNull(b, "AIModule.getDependency().settingDependency");
            if (b.mo101571c()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101539a() {
        EditText a;
        ViewTreeObserver viewTreeObserver;
        EditText a2;
        Log.m165379d("CorrectionController", "destroy");
        mo101647c();
        m104671d();
        this.f71738f.dispose();
        AbstractC28531b bVar = this.f71735b;
        if (!(bVar == null || (a2 = bVar.mo101577a()) == null)) {
            a2.removeTextChangedListener(this);
        }
        AbstractC28531b bVar2 = this.f71735b;
        if (!(bVar2 == null || (a = bVar2.mo101577a()) == null || (viewTreeObserver = a.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f71741i);
        }
        this.f71735b = null;
    }

    /* renamed from: d */
    private final void m104671d() {
        AbstractC28531b bVar = this.f71735b;
        ErrorCorrectionSpan[] cVarArr = null;
        EditText a = bVar != null ? bVar.mo101577a() : null;
        if (a != null) {
            Editable text = a.getText();
            if (text != null) {
                cVarArr = (ErrorCorrectionSpan[]) text.getSpans(0, a.getText().length(), ErrorCorrectionSpan.class);
            }
            if (cVarArr != null) {
                for (ErrorCorrectionSpan cVar : cVarArr) {
                    cVar.mo101619b(a.getText());
                }
            }
            Editable text2 = a.getText();
            if (text2 != null) {
                text2.removeSpan(this.f71740h);
            }
        }
    }

    /* renamed from: a */
    public final void mo101643a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C28606a.m104900a().mo101823b(str, this.f71744l, new DataCallback(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/ai/textcorrection/TextCorrectionController$process$1$1$1", "com/ss/android/lark/ai/textcorrection/TextCorrectionController$$special$$inlined$forEachIndexed$lambda$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$d */
    public static final class View$OnClickListenerC28547d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AITextCorrectionMatch f71751a;

        /* renamed from: b */
        final /* synthetic */ ErrorCorrectionSpan f71752b;

        /* renamed from: c */
        final /* synthetic */ TextCorrectionController f71753c;

        /* renamed from: d */
        final /* synthetic */ EditText f71754d;

        View$OnClickListenerC28547d(AITextCorrectionMatch aITextCorrectionMatch, ErrorCorrectionSpan cVar, TextCorrectionController hVar, EditText editText) {
            this.f71751a = aITextCorrectionMatch;
            this.f71752b = cVar;
            this.f71753c = hVar;
            this.f71754d = editText;
        }

        public final void onClick(View view) {
            if (this.f71753c.mo101644a(this.f71754d)) {
                TextCorrectionController hVar = this.f71753c;
                AITextCorrectionMatch aITextCorrectionMatch = this.f71751a;
                Intrinsics.checkExpressionValueIsNotNull(aITextCorrectionMatch, "match");
                hVar.mo101642a(aITextCorrectionMatch, this.f71754d, this.f71752b);
            }
            ICorrectionHitPoint bVar = this.f71753c.f71736c;
            if (bVar != null) {
                bVar.mo101582b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$f */
    public static final class View$OnClickListenerC28549f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextCorrectionController f71760a;

        /* renamed from: b */
        final /* synthetic */ ErrorCorrectionSpan f71761b;

        /* renamed from: c */
        final /* synthetic */ EditText f71762c;

        /* renamed from: d */
        final /* synthetic */ CorrectionPanelFacade f71763d;

        /* renamed from: e */
        final /* synthetic */ AITextCorrectionMatch f71764e;

        View$OnClickListenerC28549f(TextCorrectionController hVar, ErrorCorrectionSpan cVar, EditText editText, CorrectionPanelFacade aVar, AITextCorrectionMatch aITextCorrectionMatch) {
            this.f71760a = hVar;
            this.f71761b = cVar;
            this.f71762c = editText;
            this.f71763d = aVar;
            this.f71764e = aITextCorrectionMatch;
        }

        public final void onClick(View view) {
            this.f71761b.mo101619b(this.f71762c.getText());
            this.f71763d.mo101606a();
            this.f71760a.f71734a.mo101621b(this.f71764e);
            ICorrectionHitPoint bVar = this.f71760a.f71736c;
            if (bVar != null) {
                bVar.mo101584d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.e.h$e */
    public static final class View$OnClickListenerC28548e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextCorrectionController f71755a;

        /* renamed from: b */
        final /* synthetic */ EditText f71756b;

        /* renamed from: c */
        final /* synthetic */ ErrorCorrectionSpan f71757c;

        /* renamed from: d */
        final /* synthetic */ AITextCorrectionMatch f71758d;

        /* renamed from: e */
        final /* synthetic */ CorrectionPanelFacade f71759e;

        View$OnClickListenerC28548e(TextCorrectionController hVar, EditText editText, ErrorCorrectionSpan cVar, AITextCorrectionMatch aITextCorrectionMatch, CorrectionPanelFacade aVar) {
            this.f71755a = hVar;
            this.f71756b = editText;
            this.f71757c = cVar;
            this.f71758d = aITextCorrectionMatch;
            this.f71759e = aVar;
        }

        public final void onClick(View view) {
            int spanStart = this.f71756b.getText().getSpanStart(this.f71757c);
            int spanEnd = this.f71756b.getText().getSpanEnd(this.f71757c);
            ErrorCorrectionSpan cVar = this.f71757c;
            Editable text = this.f71756b.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "editText.text");
            if (!cVar.mo101618a(text) && spanStart >= 0 && spanEnd >= spanStart) {
                Editable editableText = this.f71756b.getEditableText();
                if (editableText != null) {
                    editableText.replace(spanStart, spanEnd, this.f71758d.mtarget_text);
                }
                this.f71757c.mo101619b(this.f71756b.getText());
                this.f71756b.setSelection(spanStart + this.f71758d.mtarget_text.length());
                ICorrectionHitPoint bVar = this.f71755a.f71736c;
                if (bVar != null) {
                    bVar.mo101583c();
                }
            }
            this.f71759e.mo101606a();
        }
    }

    public TextCorrectionController(ICorrectionHitPoint bVar) {
        this.f71736c = bVar;
        C68296b<String> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create()");
        this.f71737e = a;
        Disposable subscribe = this.f71737e.debounce(200, TimeUnit.MILLISECONDS).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<String>(this) {
            /* class com.ss.android.lark.ai.textcorrection.TextCorrectionController.C285441 */

            /* renamed from: a */
            final /* synthetic */ TextCorrectionController f71745a;

            {
                this.f71745a = r1;
            }

            /* renamed from: a */
            public final void accept(String str) {
                this.f71745a.mo101643a(str);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "requestSubject\n         …prefix)\n                }");
        this.f71738f = subscribe;
        this.f71740h = new DirtySpanWatcher();
        this.f71741i = new KeyBoardStateListener(this) {
            /* class com.ss.android.lark.ai.textcorrection.TextCorrectionController.C285452 */

            /* renamed from: a */
            final /* synthetic */ TextCorrectionController f71746a;

            public void onGlobalLayout() {
                EditText a;
                AbstractC28531b bVar = this.f71746a.f71735b;
                if (bVar != null && (a = bVar.mo101577a()) != null) {
                    Intrinsics.checkExpressionValueIsNotNull(a, "textCorrectionInterface?.editText ?: return");
                    boolean a2 = this.f71746a.mo101644a(a);
                    if (!a2 && mo101654a()) {
                        this.f71746a.mo101647c();
                    }
                    mo101653a(a2);
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f71746a = r1;
            }
        };
        AbstractC28534a a2 = C28522a.m104531a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AIModule.getDependency()");
        AbstractC28536c a3 = a2.mo101553a();
        Intrinsics.checkExpressionValueIsNotNull(a3, "AIModule.getDependency().guideDependency");
        this.f71743k = a3;
    }

    @Override // com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101541a(AbstractC28531b bVar) {
        MovementMethod movementMethod;
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkParameterIsNotNull(bVar, "composeInterface");
        if (!m104672e()) {
            Log.m165389i("CorrectionController", "fg disabled.");
            return;
        }
        this.f71735b = bVar;
        if (bVar != null && bVar.mo101577a() != null) {
            m104673f();
            EditText a = bVar.mo101577a();
            EditText a2 = bVar.mo101577a();
            if (a2 != null) {
                a2.addTextChangedListener(this);
            }
            MovementMethod movementMethod2 = null;
            if (a != null) {
                movementMethod = a.getMovementMethod();
            } else {
                movementMethod = null;
            }
            if (!(movementMethod instanceof C28578a)) {
                if (a != null) {
                    movementMethod2 = a.getMovementMethod();
                }
                C28578a aVar = new C28578a(movementMethod2);
                if (a != null) {
                    a.setMovementMethod(aVar);
                }
            }
            if (a != null && (viewTreeObserver = a.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f71741i);
            }
        }
    }

    /* renamed from: a */
    public final void mo101641a(AIGetTextCorrectionResponse aIGetTextCorrectionResponse) {
        EditText a;
        List<AITextCorrectionResult> list;
        String str;
        AbstractC28531b bVar = this.f71735b;
        if (!(bVar == null || (a = bVar.mo101577a()) == null)) {
            Intrinsics.checkExpressionValueIsNotNull(a, "textCorrectionInterface?.editText ?: return");
            if (!(aIGetTextCorrectionResponse == null || (list = aIGetTextCorrectionResponse.mdata) == null)) {
                for (T t : list) {
                    if (!t.mno_update.booleanValue()) {
                        m104671d();
                        List<AITextCorrectionMatch> list2 = t.mmatches;
                        Intrinsics.checkExpressionValueIsNotNull(list2, "it.mmatches");
                        int i = 0;
                        for (T t2 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            T t3 = t2;
                            IgnoreFacade eVar = this.f71734a;
                            Intrinsics.checkExpressionValueIsNotNull(t3, "match");
                            if (eVar.mo101620a(t3)) {
                                Log.m165379d("CorrectionController", "match ignored");
                                return;
                            }
                            Integer num = t3.mlength;
                            Integer num2 = t3.moffset;
                            Context context = a.getContext();
                            Intrinsics.checkExpressionValueIsNotNull(context, "editText.context");
                            String str2 = t3.msource_text;
                            Intrinsics.checkExpressionValueIsNotNull(str2, "match.msource_text");
                            ErrorCorrectionSpan cVar = new ErrorCorrectionSpan(context, str2);
                            cVar.mo101616a(new View$OnClickListenerC28547d(t3, cVar, this, a));
                            Editable text = a.getText();
                            if (text != null) {
                                str = text.toString();
                            } else {
                                str = null;
                            }
                            if (Intrinsics.areEqual(str, t3.msentence)) {
                                Intrinsics.checkExpressionValueIsNotNull(num2, "start");
                                int intValue = num2.intValue();
                                Intrinsics.checkExpressionValueIsNotNull(num, "len");
                                cVar.mo101614a(a.getText(), intValue, num.intValue());
                                if (i == 0) {
                                    m104670a(a, cVar);
                                }
                                ICorrectionHitPoint bVar2 = this.f71736c;
                                if (bVar2 != null) {
                                    bVar2.mo101581a();
                                }
                            }
                            i = i2;
                        }
                        continue;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo101644a(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int realScreenHeight = DeviceUtils.getRealScreenHeight(view.getContext());
        if (DesktopUtil.m144301a(view.getContext())) {
            realScreenHeight = DeviceUtils.getScreenHeight(view.getContext());
        }
        if (((float) (realScreenHeight - rect.bottom)) > ((float) realScreenHeight) / 6.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m104670a(EditText editText, ErrorCorrectionSpan cVar) {
        boolean z;
        int i;
        int i2;
        AnchorConfig.AnchorGravity anchorGravity;
        if (this.f71743k.mo101568a("mobile_suite_ai_smart_correction")) {
            if (editText.getVisibility() != 0 || editText.getWidth() == 0 || editText.getHeight() == 0) {
                Log.m165379d("CorrectionController", "view is invisible.");
                return;
            }
            GuideDelegate gVar = this.f71742j;
            if (gVar != null) {
                gVar.mo141659b();
            }
            TextPositionHelper.TextPositionData a = TextPositionHelper.Companion.m104687a(TextPositionHelper.f71767a, editText, editText.getText().getSpanStart(cVar), editText.getText().getSpanEnd(cVar), null, 8, null);
            int[] iArr = new int[2];
            editText.getLocationOnScreen(iArr);
            if (iArr[1] + a.mo101663c()[0] > DeviceUtils.getRealScreenHeight(editText.getContext()) - (iArr[1] + a.mo101663c()[1])) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = (a.mo101661a()[0] + a.mo101661a()[1]) / 2;
            } else {
                i = (a.mo101662b()[0] + a.mo101662b()[1]) / 2;
            }
            int[] c = a.mo101663c();
            if (z) {
                i2 = -c[0];
            } else {
                i2 = c[1] - editText.getHeight();
            }
            if (z) {
                anchorGravity = AnchorConfig.AnchorGravity.TOP;
            } else {
                anchorGravity = AnchorConfig.AnchorGravity.BOTTOM;
            }
            EditText editText2 = editText;
            AnchorConfig anchorConfig = new AnchorConfig(editText2, anchorGravity, new Point(i - (editText.getWidth() / 2), i2));
            MaskConfig maskConfig = new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null);
            String string = editText.getContext().getString(R.string.Lark_ASL_SmartCorrectionOnboardingTitle);
            String string2 = editText.getContext().getString(R.string.Lark_ASL_SmartCorrectionOnboardingDescMobile);
            Intrinsics.checkExpressionValueIsNotNull(string2, "editText.context.getStri…tionOnboardingDescMobile)");
            TextBubbleConfig kVar = new TextBubbleConfig(anchorConfig, maskConfig, string, string2);
            kVar.mo141759b(false);
            kVar.mo141757a((Boolean) true);
            Activity a2 = ViewUtils.m224142a(editText2);
            if (a2 != null) {
                this.f71742j = GuideComponent.f99382a.mo141642a(a2, kVar);
                this.f71743k.mo101567a("mobile_suite_ai_smart_correction", false);
            }
        }
    }

    /* renamed from: a */
    public final void mo101642a(AITextCorrectionMatch aITextCorrectionMatch, EditText editText, ErrorCorrectionSpan cVar) {
        PopupWindow popupWindow;
        editText.requestLayout();
        int spanStart = editText.getText().getSpanStart(cVar);
        int spanEnd = editText.getText().getSpanEnd(cVar);
        Editable text = editText.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "editText.text");
        cVar.mo101615a(text, true);
        TextPositionHelper.TextPositionData a = TextPositionHelper.f71767a.mo101659a(editText, spanStart, spanEnd);
        Context context = editText.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "editText.context");
        CorrectionPanelFacade aVar = new CorrectionPanelFacade(context, editText, a.mo101661a(), a.mo101662b(), a.mo101663c());
        aVar.mo101607a(new View$OnClickListenerC28548e(this, editText, cVar, aITextCorrectionMatch, aVar));
        aVar.mo101609b(new View$OnClickListenerC28549f(this, cVar, editText, aVar, aITextCorrectionMatch));
        aVar.mo101608a(new C28550g(cVar, editText));
        WeakReference<PopupWindow> weakReference = this.f71739g;
        if (!(weakReference == null || (popupWindow = weakReference.get()) == null)) {
            popupWindow.dismiss();
        }
        String str = aITextCorrectionMatch.mtarget_text;
        Intrinsics.checkExpressionValueIsNotNull(str, "correction.mtarget_text");
        this.f71739g = new WeakReference<>(aVar.mo101605a(str));
        Log.m165379d("CorrectionController", "showCorrectionPanel");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText a;
        String str;
        WeakReference<PopupWindow> weakReference;
        PopupWindow popupWindow;
        AbstractC28531b bVar = this.f71735b;
        if (bVar != null && (a = bVar.mo101577a()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(a, "textCorrectionInterface?.editText ?: return");
            Editable text = a.getText();
            boolean z = false;
            if (text != null) {
                text.setSpan(this.f71740h, 0, a.getText().length(), 33);
            }
            Editable text2 = a.getText();
            if (text2 != null) {
                str = text2.toString();
            } else {
                str = null;
            }
            if (str != null) {
                if (str.length() > 0) {
                    z = true;
                }
                if (z) {
                    this.f71737e.onNext(str);
                    weakReference = this.f71739g;
                    if (weakReference != null && (popupWindow = weakReference.get()) != null) {
                        popupWindow.dismiss();
                        return;
                    }
                }
            }
            m104673f();
            weakReference = this.f71739g;
            if (weakReference != null) {
            }
        }
    }
}
