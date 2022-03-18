package com.bytedance.ee.bear.middleground.audio.asrsdk;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.contract.ao;
import com.bytedance.ee.bear.middleground.audio.Audio;
import com.bytedance.ee.bear.middleground.drive.p452a.AbstractC9349a;
import com.bytedance.ee.bear.middleground.p438a.C8883h;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13675f;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionRequest;
import com.bytedance.lark.pb.im.v1.SendSpeechRecognitionResponse;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.p1820e.p1821a.AbstractC36900c;
import com.ss.android.lark.sdk.SdkSender;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.ByteString;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0007J\u0016\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J@\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190$H\u0002J\b\u0010%\u001a\u00020\u0019H\u0007J\u0006\u0010&\u001a\u00020\u0019J0\u0010'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00042\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190$H\u0007J8\u0010(\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00132\u001e\u0010#\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00190$H\u0002J\b\u0010)\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/middleground/audio/asrsdk/AsrSDK;", "", "()V", "AUDIO_NAME", "", "TAG", "audioPath", "deviceLocale", "diffIndex", "", "", "feedResult", "", "handler", "Landroid/os/Handler;", "inited", "isEnd", "isStopped", "mAsrHandler", "", "opusRecorder", "Lcom/bytedance/ee/bear/middleground/audio/OpusRecorderEx;", "result", "sequenceId", "cancelRecord", "", "convertList2Array", "", "list", "", "createEngine", "feedAudio", "speechLocale", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "askCallCallBack", "Lkotlin/Function3;", "initAudio", "startEngine", "startRecord", "stopEngine", "stopRecord", "audio-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.a.a.a */
public final class AsrSDK {

    /* renamed from: a */
    public static final AsrSDK f23872a = new AsrSDK();

    /* renamed from: b */
    private static int f23873b = 1;

    /* renamed from: c */
    private static String f23874c = "";

    /* renamed from: d */
    private static boolean f23875d;

    /* renamed from: e */
    private static List<Integer> f23876e = new ArrayList();

    /* renamed from: f */
    private static boolean f23877f = true;

    /* renamed from: g */
    private static boolean f23878g = true;

    /* renamed from: h */
    private static String f23879h;

    /* renamed from: i */
    private static boolean f23880i;

    /* renamed from: j */
    private static final String f23881j;

    /* renamed from: k */
    private static C8883h f23882k;

    /* renamed from: l */
    private static long f23883l = -1;

    /* renamed from: m */
    private static final Handler f23884m = new Handler(Looper.getMainLooper());

    private AsrSDK() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m37192b() {
        C8883h hVar = f23882k;
        if (hVar != null) {
            hVar.mo34112c();
        }
    }

    /* renamed from: d */
    public final long mo34057d() {
        return System.currentTimeMillis();
    }

    /* renamed from: e */
    public final void mo34058e() {
        f23873b = 1;
        f23874c = "";
        f23877f = false;
        f23878g = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J6\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"com/bytedance/ee/bear/middleground/audio/asrsdk/AsrSDK$startRecord$1", "Lcom/bytedance/ee/bear/middleground/audio/OpusRecorderEx$ICallback;", "startRecord", "", "stopRecord", "updateProgress", "duration", "", "volume", "Lcom/bytedance/ee/bear/middleground/audio/OpusRecorderEx$Volume;", "opus", "Ljava/nio/ByteBuffer;", "pcm", "pcmLen", "audio-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.a.a.a$d */
    public static final class C8862d implements C8883h.AbstractC8885a {

        /* renamed from: a */
        final /* synthetic */ String f23888a;

        /* renamed from: b */
        final /* synthetic */ Function3 f23889b;

        @Override // com.bytedance.ee.bear.middleground.p438a.C8883h.AbstractC8885a
        /* renamed from: a */
        public void mo34062a() {
            AsrSDK aVar = AsrSDK.f23872a;
            AsrSDK.f23883l = AsrSDK.f23872a.mo34057d();
            AsrSDK.f23872a.mo34058e();
            C13479a.m54764b("AsrSDK", "start record");
        }

        @Override // com.bytedance.ee.bear.middleground.p438a.C8883h.AbstractC8885a
        /* renamed from: b */
        public void mo34064b() {
            AsrSDK aVar = AsrSDK.f23872a;
            String str = this.f23888a;
            AsrSDK aVar2 = AsrSDK.f23872a;
            aVar.mo34054a(str, AsrSDK.f23883l, new C8863a(this));
        }

        C8862d(String str, Function3 oVar) {
            this.f23888a = str;
            this.f23889b = oVar;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "res", "", "isEnd", "", "diff", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.a.a.a$d$a */
        static final class C8863a extends Lambda implements Function3<String, Boolean, int[], Unit> {
            final /* synthetic */ C8862d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8863a(C8862d dVar) {
                super(3);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function3
            public /* synthetic */ Unit invoke(String str, Boolean bool, int[] iArr) {
                invoke(str, bool.booleanValue(), iArr);
                return Unit.INSTANCE;
            }

            public final void invoke(final String str, final boolean z, final int[] iArr) {
                Intrinsics.checkParameterIsNotNull(str, "res");
                Intrinsics.checkParameterIsNotNull(iArr, "diff");
                AsrSDK aVar = AsrSDK.f23872a;
                AsrSDK.f23884m.post(new Runnable(this) {
                    /* class com.bytedance.ee.bear.middleground.audio.asrsdk.AsrSDK.C8862d.C8863a.RunnableC88641 */

                    /* renamed from: a */
                    final /* synthetic */ C8863a f23890a;

                    {
                        this.f23890a = r1;
                    }

                    public final void run() {
                        C13479a.m54772d("AsrSDK", "stopRecord: " + str + " - " + z + " - " + iArr);
                        this.f23890a.this$0.f23889b.invoke(str, Boolean.valueOf(z), iArr);
                    }
                });
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "res", "", "isEnd", "", "diff", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.middleground.a.a.a$d$b */
        static final class C8865b extends Lambda implements Function3<String, Boolean, int[], Unit> {
            final /* synthetic */ C8862d this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8865b(C8862d dVar) {
                super(3);
                this.this$0 = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function3
            public /* synthetic */ Unit invoke(String str, Boolean bool, int[] iArr) {
                invoke(str, bool.booleanValue(), iArr);
                return Unit.INSTANCE;
            }

            public final void invoke(final String str, final boolean z, final int[] iArr) {
                Intrinsics.checkParameterIsNotNull(str, "res");
                Intrinsics.checkParameterIsNotNull(iArr, "diff");
                AsrSDK aVar = AsrSDK.f23872a;
                AsrSDK.f23884m.post(new Runnable(this) {
                    /* class com.bytedance.ee.bear.middleground.audio.asrsdk.AsrSDK.C8862d.C8865b.RunnableC88661 */

                    /* renamed from: a */
                    final /* synthetic */ C8865b f23894a;

                    {
                        this.f23894a = r1;
                    }

                    public final void run() {
                        C13479a.m54772d("AsrSDK", "updateProgress: " + str + " - " + z + " - " + iArr);
                        this.f23894a.this$0.f23889b.invoke(str, Boolean.valueOf(z), iArr);
                    }
                });
            }
        }

        @Override // com.bytedance.ee.bear.middleground.p438a.C8883h.AbstractC8885a
        /* renamed from: a */
        public void mo34063a(int i, C8883h.C8887c cVar, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i2) {
            if (byteBuffer != null && byteBuffer2 != null) {
                C13479a.m54772d("AsrSDK", "duration: " + i + ", pcmLen: " + i2);
                if (cVar != null && cVar.f23959b >= ((double) 0)) {
                    AsrSDK aVar = AsrSDK.f23872a;
                    String str = this.f23888a;
                    AsrSDK aVar2 = AsrSDK.f23872a;
                    long j = AsrSDK.f23883l;
                    byte[] array = byteBuffer.array();
                    Intrinsics.checkExpressionValueIsNotNull(array, "opus.array()");
                    aVar.mo34055a(str, j, array, new C8865b(this));
                }
            }
        }
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m37194c() {
        C8883h hVar = f23882k;
        if (hVar != null) {
            hVar.mo34113d();
        }
        C13675f.m55498a(new File(f23881j));
    }

    static {
        String c;
        String str = "zh_cn";
        f23879h = str;
        StringBuilder sb = new StringBuilder();
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        File filesDir = application.getFilesDir();
        Intrinsics.checkExpressionValueIsNotNull(filesDir, "ContextUtils.baseApplication.filesDir");
        sb.append(filesDir.getPath());
        sb.append(File.separator);
        sb.append("comment_audio.m4a");
        f23881j = sb.toString();
        ((AbstractC9349a) KoinJavaComponent.m268613a(AbstractC9349a.class, null, null, 6, null)).mo35637c();
        ao b = C4484g.m18494b();
        if (!(b == null || (c = b.mo17252c()) == null)) {
            str = c;
        }
        f23879h = str;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m37185a() {
        if (!f23880i) {
            f23880i = true;
            Audio.Companion aVar = Audio.f23871a;
            Application application = C13615c.f35773a;
            Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
            aVar.mo34053a(application);
            if (f23882k == null) {
                C8883h a = C8883h.m37251a();
                a.mo34108a(new WeakReference<>(C8861c.f23887a));
                f23882k = a;
                Unit unit = Unit.INSTANCE;
            }
            f23883l = f23872a.mo34057d();
            C13675f.m55498a(new File(f23881j));
            C8883h hVar = f23882k;
            if (hVar != null) {
                hVar.mo34113d();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/middleground/audio/asrsdk/AsrSDK$feedAudio$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/bytedance/lark/pb/im/v1/SendSpeechRecognitionResponse;", "onError", "", "error", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "audio-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.a.a.a$a */
    public static final class C8859a implements IGetDataCallback<SendSpeechRecognitionResponse> {

        /* renamed from: a */
        final /* synthetic */ Function3 f23885a;

        C8859a(Function3 oVar) {
            this.f23885a = oVar;
        }

        /* renamed from: a */
        public void onSuccess(SendSpeechRecognitionResponse sendSpeechRecognitionResponse) {
            if (sendSpeechRecognitionResponse != null) {
                Function3 oVar = this.f23885a;
                String str = sendSpeechRecognitionResponse.result;
                if (str == null) {
                    str = "";
                }
                Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual((Object) sendSpeechRecognitionResponse.is_end, (Object) true));
                AsrSDK aVar = AsrSDK.f23872a;
                List<Integer> list = sendSpeechRecognitionResponse.diff_index_slice;
                Intrinsics.checkExpressionValueIsNotNull(list, "response.diff_index_slice");
                oVar.invoke(str, valueOf, aVar.mo34056a(list));
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "error");
            C13479a.m54761a("AsrSDK", errorResult);
            AsrSDK aVar = AsrSDK.f23872a;
            if (AsrSDK.f23878g) {
                AsrSDK aVar2 = AsrSDK.f23872a;
                AsrSDK.f23878g = false;
            }
            AsrSDK aVar3 = AsrSDK.f23872a;
            AsrSDK.f23874c = "";
            AsrSDK aVar4 = AsrSDK.f23872a;
            AsrSDK.f23875d = true;
            AsrSDK aVar5 = AsrSDK.f23872a;
            AsrSDK.f23876e = new ArrayList();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/SendSpeechRecognitionResponse;", "kotlin.jvm.PlatformType", "it", "", "parse"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.a.a.a$b */
    public static final class C8860b<T> implements SdkSender.IParser<T> {

        /* renamed from: a */
        public static final C8860b f23886a = new C8860b();

        C8860b() {
        }

        /* renamed from: a */
        public final SendSpeechRecognitionResponse parse(byte[] bArr) {
            return SendSpeechRecognitionResponse.ADAPTER.decode(bArr);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mStopReason", "", "onRecordStop"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.a.a.a$c */
    static final class C8861c implements AbstractC36900c {

        /* renamed from: a */
        public static final C8861c f23887a = new C8861c();

        C8861c() {
        }

        @Override // com.ss.android.lark.p1820e.p1821a.AbstractC36900c
        /* renamed from: a */
        public final void mo34061a(int i) {
            C13479a.m54758a("AsrSDK", "onRecordStop: mStopReason=" + i);
        }
    }

    /* renamed from: a */
    public final int[] mo34056a(List<Integer> list) {
        List<Integer> list2 = list;
        if (list2 != null) {
            Object[] array = list2.toArray(new Integer[0]);
            if (array != null) {
                return C69043h.m265752a((Integer[]) array);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m37190a(String str, Function3<? super String, ? super Boolean, ? super int[], Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(str, "speechLocale");
        Intrinsics.checkParameterIsNotNull(oVar, "askCallCallBack");
        C8883h hVar = f23882k;
        if (hVar != null) {
            hVar.mo34107a(f23881j, new C8862d(str, oVar));
        }
    }

    /* renamed from: a */
    public final void mo34054a(String str, long j, Function3<? super String, ? super Boolean, ? super int[], Unit> oVar) {
        f23877f = true;
        mo34055a(str, j, new byte[0], oVar);
    }

    /* renamed from: a */
    public final boolean mo34055a(String str, long j, byte[] bArr, Function3<? super String, ? super Boolean, ? super int[], Unit> oVar) {
        SendSpeechRecognitionRequest.C18033a b = new SendSpeechRecognitionRequest.C18033a().mo62630a(ByteString.of(Arrays.copyOf(bArr, bArr.length))).mo62634c("opus").mo62632b((Integer) 16000).mo62633b(f23879h);
        int i = f23873b;
        f23873b = i + 1;
        SendSpeechRecognitionRequest.C18033a d = b.mo62628a(Integer.valueOf(i)).mo62627a((Boolean) true).mo62629a(String.valueOf(j)).mo62635d(str);
        Intrinsics.checkExpressionValueIsNotNull(d, "SendSpeechRecognitionReq…eech_locale(speechLocale)");
        Integer num = d.f45145b;
        if (num != null && num.intValue() == 1) {
            d.mo62626a(SendSpeechRecognitionRequest.Action.BEGIN);
        } else if (f23877f) {
            d.mo62626a(SendSpeechRecognitionRequest.Action.END);
        }
        SdkSender.asynSendRequestNonWrap(Command.SEND_SPEECH_RECOGNITION, d, new C8859a(oVar), C8860b.f23886a);
        return f23878g;
    }
}
