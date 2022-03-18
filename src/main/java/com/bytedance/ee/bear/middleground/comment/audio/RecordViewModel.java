package com.bytedance.ee.bear.middleground.comment.audio;

import android.os.Vibrator;
import android.text.TextUtils;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.architecture.DisposableBase;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13619g;
import com.larksuite.suite.R;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0001)B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001d0\u001fJ\b\u0010 \u001a\u00020\u001dH\u0016J\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\rJ\u0006\u0010#\u001a\u00020\u001dJ&\u0010$\u001a\u00020\u001d2\u001e\u0010%\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001d0&J\u0006\u0010(\u001a\u00020\u001dR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel;", "Lcom/bytedance/ee/bear/architecture/DisposableBase;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;)V", "checkingPermission", "", "getCheckingPermission", "()Z", "setCheckingPermission", "(Z)V", "currentUserLocale", "Landroidx/lifecycle/MutableLiveData;", "", "getCurrentUserLocale", "()Landroidx/lifecycle/MutableLiveData;", "setCurrentUserLocale", "(Landroidx/lifecycle/MutableLiveData;)V", "isConnect", "setConnect", "mVibrator", "Landroid/os/Vibrator;", "value", "recording", "getRecording", "setRecording", "sp", "Lcom/bytedance/ee/bear/persistence/PersistenceSharedPreference;", "checkPermission", "", "perCall", "Lkotlin/Function1;", "onCleared", "recordRecognitionLan", "lanLocale", "showOfflineDialog", "startRecord", "rskCallBack", "Lkotlin/Function3;", "", "stopRecord", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.audio.e */
public final class RecordViewModel extends DisposableBase {

    /* renamed from: a */
    public static final Companion f24368a = new Companion(null);

    /* renamed from: b */
    private boolean f24369b;

    /* renamed from: c */
    private boolean f24370c;

    /* renamed from: d */
    private PersistenceSharedPreference f24371d = new PersistenceSharedPreference("RECORD_PANEL_CONFIG");

    /* renamed from: e */
    private Vibrator f24372e;

    /* renamed from: f */
    private C1177w<String> f24373f;

    /* renamed from: g */
    private boolean f24374g;

    /* renamed from: h */
    private final Config f24375h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/audio/RecordViewModel$Companion;", "", "()V", "AUDIO_RECOGNIZE_EN_LOCALE", "", "AUDIO_RECOGNIZE_LOCALE_SETTING_KEY", "AUDIO_RECOGNIZE_ZH_LOCALE", "RECORD_PANEL_CONFIG", "TAG", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public final C1177w<String> mo34604d() {
        return this.f24373f;
    }

    @Override // com.bytedance.ee.bear.architecture.DisposableBase
    /* renamed from: a */
    public void mo16330a() {
        super.mo16330a();
        this.f24370c = false;
    }

    /* renamed from: b */
    public final boolean mo34602b() {
        return this.f24369b;
    }

    /* renamed from: c */
    public final boolean mo34603c() {
        return this.f24370c;
    }

    /* renamed from: e */
    public final void mo34605e() {
        if (this.f24369b) {
            C13479a.m54764b("RecordViewModel", "stopRecord:");
            m37598c(false);
            CommentAudio.f24366a.mo34591a();
        }
    }

    /* renamed from: f */
    public final void mo34606f() {
        C13479a.m54765b("RecordViewModel", "showOfflineDialog:", new Throwable());
        new BearUDDialogBuilder(this.f24375h.mo35279a()).mo45362d(R.string.Doc_Comment_OfflineAudioDisabled).mo45352a(new BearUDDialogBuilder.ActionBuilder().mo45369a(R.id.ud_dialog_btn_primary).mo45372b(R.string.Doc_Facade_Confirm).mo45373c(R.color.text_title)).mo45355a().show();
    }

    /* renamed from: c */
    private final void m37598c(boolean z) {
        this.f24369b = z;
    }

    /* renamed from: a */
    public final void mo34600a(boolean z) {
        this.f24370c = z;
    }

    /* renamed from: b */
    public final void mo34601b(boolean z) {
        this.f24374g = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.e$b */
    public static final class C9042b<T> implements Consumer<Boolean> {

        /* renamed from: a */
        final /* synthetic */ RecordViewModel f24376a;

        /* renamed from: b */
        final /* synthetic */ Function1 f24377b;

        C9042b(RecordViewModel eVar, Function1 function1) {
            this.f24376a = eVar;
            this.f24377b = function1;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            this.f24376a.mo34600a(false);
            Function1 function1 = this.f24377b;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it");
            function1.invoke(bool);
        }
    }

    /* renamed from: a */
    public final void mo34597a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "lanLocale");
        this.f24373f.mo5926a(str);
        this.f24371d.mo34037a("AUDIO_RECOGNIZE_LOCALE_SETTING_KEY", str);
    }

    /* renamed from: a */
    public final void mo34598a(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "perCall");
        this.f24370c = true;
        mo16331a(new C13619g.C13621b(this.f24375h.mo35279a()).mo50566b("android.permission.RECORD_AUDIO").subscribe(new C9042b(this, function1)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.w<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public RecordViewModel(Config fVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        this.f24375h = fVar;
        C1177w<String> wVar = new C1177w<>();
        this.f24373f = wVar;
        this.f24374g = true;
        wVar.mo5929b((String) this.f24371d.mo34038b("AUDIO_RECOGNIZE_LOCALE_SETTING_KEY", "zh_ch"));
        Object systemService = fVar.mo35279a().getSystemService("vibrator");
        if (systemService != null) {
            this.f24372e = (Vibrator) systemService;
            C13479a.m54764b("RecordViewModel", "currentUserLocale:" + this.f24373f.mo5927b());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: androidx.lifecycle.w<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo34599a(Function3<? super String, ? super Boolean, ? super int[], Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "rskCallBack");
        this.f24372e.vibrate(100);
        if (!this.f24374g) {
            mo34606f();
            return;
        }
        m37598c(true);
        C13479a.m54764b("RecordViewModel", "startRecord:" + this.f24373f.mo5927b());
        this.f24373f.mo5929b((String) this.f24371d.mo34038b("AUDIO_RECOGNIZE_LOCALE_SETTING_KEY", "zh_ch"));
        CommentAudio bVar = CommentAudio.f24366a;
        String b = this.f24373f.mo5927b();
        if (b == null) {
            b = "";
        }
        bVar.mo34592a(b, new C9043c(oVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "content", "", "isEnd", "", "diffIndex", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.audio.e$c */
    public static final class C9043c extends Lambda implements Function3<String, Boolean, int[], Unit> {
        final /* synthetic */ Function3 $rskCallBack;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9043c(Function3 oVar) {
            super(3);
            this.$rskCallBack = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function3
        public /* synthetic */ Unit invoke(String str, Boolean bool, int[] iArr) {
            invoke(str, bool.booleanValue(), iArr);
            return Unit.INSTANCE;
        }

        public final void invoke(String str, boolean z, int[] iArr) {
            Intrinsics.checkParameterIsNotNull(str, "content");
            Intrinsics.checkParameterIsNotNull(iArr, "diffIndex");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.$rskCallBack.invoke(str, Boolean.valueOf(z), iArr);
        }
    }
}
