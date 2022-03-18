package com.ss.android.lark.mm.module.player.speed;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.player.speed.repo.SilenceDetail;
import com.ss.android.lark.mm.module.player.speed.repo.SilenceResponse;
import com.ss.android.lark.mm.module.player.speed.repo.SpeedRepo;
import com.ss.android.lark.mm.module.player.speed.view.SpeedPicker;
import com.ss.android.lark.mm.p2288b.C45858j;
import com.ss.android.lark.mm.utils.ktextensions.C47109c;
import com.ss.android.lark.mm.widget.BaseDialog;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001!B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog;", "Lcom/ss/android/lark/mm/widget/BaseDialog;", "isSilenceEnabled", "", "objectToken", "", "mSpeed", "", "toolbarListener", "Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;", "(ZLjava/lang/String;FLcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;)V", "switchDisposable", "Lio/reactivex/disposables/Disposable;", "enableSilence", "", "isEnabled", "onFail", "Lkotlin/Function0;", "getLayoutRes", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onViewCreated", "view", "ISpeedPickerDepend", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.speed.b */
public class SpeedPickerDialog extends BaseDialog {

    /* renamed from: c */
    public final String f117523c;

    /* renamed from: d */
    public final ISpeedPickerDepend f117524d;

    /* renamed from: e */
    private Disposable f117525e;

    /* renamed from: f */
    private final boolean f117526f;

    /* renamed from: g */
    private float f117527g;

    /* renamed from: h */
    private HashMap f117528h;

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: a */
    public View mo142944a(int i) {
        if (this.f117528h == null) {
            this.f117528h = new HashMap();
        }
        View view = (View) this.f117528h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f117528h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.mm.widget.BaseDialog
    /* renamed from: f */
    public void mo142945f() {
        HashMap hashMap = this.f117528h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo164088g() {
        return R.layout.mm_dialog_speed;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, com.ss.android.lark.mm.widget.BaseDialog, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo142945f();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "response", "Lcom/ss/android/lark/mm/module/player/speed/repo/SilenceResponse;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.speed.b$b */
    public static final class C46717b extends Lambda implements Function1<SilenceResponse, Unit> {
        final /* synthetic */ Function0 $onFail;
        final /* synthetic */ SpeedPickerDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46717b(SpeedPickerDialog bVar, Function0 function0) {
            super(1);
            this.this$0 = bVar;
            this.$onFail = function0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SilenceResponse silenceResponse) {
            invoke(silenceResponse);
            return Unit.INSTANCE;
        }

        public final void invoke(SilenceResponse silenceResponse) {
            String str;
            if (SilenceResponse.validate(silenceResponse)) {
                List<SilenceDetail> list = null;
                if (silenceResponse != null) {
                    str = silenceResponse.getToast();
                } else {
                    str = null;
                }
                if (str != null) {
                    C45858j.m181680b(silenceResponse.getToast());
                } else {
                    C45858j.m181677a((int) R.string.MMWeb_G_NoSlientParts);
                }
                ISpeedPickerDepend aVar = this.this$0.f117524d;
                String str2 = this.this$0.f117523c;
                if (silenceResponse != null) {
                    list = silenceResponse.getDetails();
                }
                aVar.mo164091a(true, str2, list);
                return;
            }
            C45858j.m181677a((int) R.string.MMWeb_G_CouldNotSkipSilentParts);
            this.$onFail.invoke();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b
    public void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkParameterIsNotNull(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Disposable disposable = this.f117525e;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "accept", "(Lkotlin/Unit;)V"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.speed.b$c */
    public static final class C46718c<T> implements Consumer<Unit> {

        /* renamed from: a */
        final /* synthetic */ SpeedPickerDialog f117529a;

        /* renamed from: b */
        final /* synthetic */ UDSwitch f117530b;

        C46718c(SpeedPickerDialog bVar, UDSwitch uDSwitch) {
            this.f117529a = bVar;
            this.f117530b = uDSwitch;
        }

        /* JADX WARN: Type inference failed for: r11v2, types: [int, boolean] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void accept(kotlin.Unit r11) {
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.player.speed.SpeedPickerDialog.C46718c.accept(kotlin.Unit):void");
        }
    }

    /* renamed from: a */
    public final void mo164089a(boolean z, Function0<Unit> function0) {
        if (z) {
            new SpeedRepo().mo164105a(this.f117523c, new C46717b(this, function0));
        } else {
            ISpeedPickerDepend.C46716a.m184907a(this.f117524d, false, null, null, 6, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        ((SpeedPicker) view.findViewById(R.id.mm_speed_picker)).mo164119a(this.f117524d, this.f117527g);
        UDSwitch uDSwitch = (UDSwitch) view.findViewById(R.id.mm_silence_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "ivSwitch");
        uDSwitch.setChecked(this.f117526f);
        this.f117525e = C47109c.m186569a(uDSwitch).throttleFirst(1, TimeUnit.SECONDS).subscribe(new C46718c(this, uDSwitch));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(mo164088g(), viewGroup, false);
    }

    public SpeedPickerDialog(boolean z, String str, float f, ISpeedPickerDepend aVar) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(aVar, "toolbarListener");
        this.f117526f = z;
        this.f117523c = str;
        this.f117527g = f;
        this.f117524d = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J.\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0003H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/mm/module/player/speed/SpeedPickerDialog$ISpeedPickerDepend;", "", "getSpeed", "", "onSilence", "", "isEnabled", "", "objectToken", "", "silenceList", "", "Lcom/ss/android/lark/mm/module/player/speed/repo/SilenceDetail;", "onSpeed", "speed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.speed.b$a */
    public interface ISpeedPickerDepend {
        /* renamed from: a */
        void mo164090a(float f);

        /* renamed from: a */
        void mo164091a(boolean z, String str, List<? extends SilenceDetail> list);

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.mm.module.player.speed.b$a$a */
        public static final class C46716a {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.mm.module.player.speed.b$a */
            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: a */
            public static /* synthetic */ void m184907a(ISpeedPickerDepend aVar, boolean z, String str, List list, int i, Object obj) {
                if (obj == null) {
                    if ((i & 2) != 0) {
                        str = null;
                    }
                    if ((i & 4) != 0) {
                        list = null;
                    }
                    aVar.mo164091a(z, str, list);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSilence");
            }
        }
    }
}
