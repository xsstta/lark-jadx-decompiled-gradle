package com.ss.android.lark.mm.module.record.audiorecorder;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.depend.IMmDepend;
import com.ss.android.lark.mm.p2288b.C45855f;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\bH\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener;", "Landroid/telephony/PhoneStateListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "isListening", "", "listener", "Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener$IPhoneStateListener;", "getListener", "()Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener$IPhoneStateListener;", "setListener", "(Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener$IPhoneStateListener;)V", "telephonyManager", "Landroid/telephony/TelephonyManager;", "isPermissionGranted", "onCallStateChanged", "", "state", "", "phoneNumber", "", "start", "stop", "Companion", "IPhoneStateListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.e */
public final class MmPhoneStateListener extends PhoneStateListener {

    /* renamed from: a */
    public static final Companion f118018a = new Companion(null);

    /* renamed from: b */
    private final TelephonyManager f118019b;

    /* renamed from: c */
    private boolean f118020c;

    /* renamed from: d */
    private IPhoneStateListener f118021d;

    /* renamed from: e */
    private final Context f118022e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener$IPhoneStateListener;", "", "onPhoneStateChange", "", "isCalling", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.e$b */
    public interface IPhoneStateListener {
        /* renamed from: a */
        void mo164577a(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/record/audiorecorder/MmPhoneStateListener$Companion;", "", "()V", "isCalling", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.record.audiorecorder.e$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final boolean mo164641a() {
            try {
                IMmDepend a = C45899c.m181859a();
                Intrinsics.checkExpressionValueIsNotNull(a, "MmDepend.impl()");
                IMmDepend.AbstractC45871b contextDepend = a.getContextDepend();
                Intrinsics.checkExpressionValueIsNotNull(contextDepend, "MmDepend.impl().contextDepend");
                Object systemService = contextDepend.mo144557a().getSystemService("phone");
                if (systemService != null) {
                    TelephonyManager telephonyManager = (TelephonyManager) systemService;
                    if (2 == telephonyManager.getCallState() || 1 == telephonyManager.getCallState()) {
                        return true;
                    }
                    return false;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception e) {
                C45855f.m181666e("MmPhoneStateListener", "[isCalling] error: " + e);
                return false;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo164639b() {
        this.f118020c = false;
        this.f118019b.listen(this, 0);
    }

    /* renamed from: c */
    private final boolean m185686c() {
        if (Build.VERSION.SDK_INT >= 23 || ActivityCompat.checkSelfPermission(this.f118022e, "android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo164637a() {
        if (!this.f118020c && m185686c()) {
            this.f118020c = true;
            this.f118019b.listen(this, 32);
        }
    }

    /* renamed from: a */
    public final void mo164638a(IPhoneStateListener bVar) {
        this.f118021d = bVar;
    }

    public MmPhoneStateListener(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f118022e = context;
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            this.f118019b = (TelephonyManager) systemService;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    public void onCallStateChanged(int i, String str) {
        IPhoneStateListener bVar;
        super.onCallStateChanged(i, str);
        if (i == 0) {
            IPhoneStateListener bVar2 = this.f118021d;
            if (bVar2 != null) {
                bVar2.mo164577a(false);
            }
        } else if ((i == 1 || i == 2) && (bVar = this.f118021d) != null) {
            bVar.mo164577a(true);
        }
    }
}
