package com.ss.android.lark.sdk;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.LarkError;
import com.bytedance.lark.sdk.AbstractC19831c;
import com.bytedance.lark.sdk.Sdk;
import com.bytedance.lark.sdk.StreamDataSource;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.squareup.wire.Message;
import com.ss.android.lark.pb.improto.Packet;
import com.ss.android.lark.pb.improto.PayloadType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

public class SdkSender {
    private static AbstractC53231b sErrorHandle;

    public interface IParser<T> {
        T parse(byte[] bArr) throws IOException;
    }

    /* renamed from: com.ss.android.lark.sdk.SdkSender$b */
    public interface AbstractC53231b {
        /* renamed from: a */
        boolean mo181687a(int i, String str);
    }

    /* renamed from: com.ss.android.lark.sdk.SdkSender$d */
    public static class C53233d<T> {

        /* renamed from: a */
        public T f131572a;

        /* renamed from: b */
        public ErrorResult f131573b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.sdk.SdkSender$a */
    public static class C53230a<T> implements AbstractC19831c {

        /* renamed from: a */
        protected Command f131565a;

        /* renamed from: b */
        protected IParser<T> f131566b;

        /* renamed from: c */
        protected IGetDataCallback<T> f131567c;

        /* renamed from: d */
        protected boolean f131568d;

        /* renamed from: e */
        private final String f131569e;

        @Override // com.bytedance.lark.sdk.AbstractC19831c
        /* renamed from: a */
        public boolean mo67179a() {
            return this.f131568d;
        }

        @Override // com.bytedance.lark.sdk.AbstractC19831c
        public void AsyncCallback(boolean z, byte[] bArr) {
            String str;
            String str2;
            String str3;
            int i;
            int i2 = 0;
            C53241h.m205897a("SdkSender", false, this.f131565a.name(), this.f131569e);
            if (z) {
                C53232c handleLarkError = SdkSender.handleLarkError(bArr, new RuntimeException(""), this.f131565a);
                C53241h.m205894a("SdkSender", "asyncCall command = " + this.f131565a.name() + "\n AsyncCallback, contextId: " + this.f131569e);
                Exception exc = handleLarkError.f131571b;
                LarkError larkError = handleLarkError.f131570a;
                if (larkError != null) {
                    if (larkError.code != null) {
                        i2 = larkError.code.intValue();
                    }
                    String str4 = larkError.debug_message;
                    String str5 = larkError.display_message;
                    str = larkError.server_message;
                    str2 = str5;
                    str3 = str4;
                    i = i2;
                } else {
                    str3 = "";
                    str2 = str3;
                    str = str2;
                    i = -1;
                }
                IGetDataCallback<T> iGetDataCallback = this.f131567c;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(new ErrorResult(i, str3, str2, str, exc));
                    return;
                }
                return;
            }
            C53233d parseObject = SdkSender.parseObject(bArr, this.f131566b, this.f131565a, this.f131569e, true);
            if (this.f131567c == null) {
                return;
            }
            if (parseObject.f131573b != null) {
                this.f131567c.onError(parseObject.f131573b);
            } else {
                this.f131567c.onSuccess(parseObject.f131572a);
            }
        }

        public C53230a(Command command, IParser iParser, IGetDataCallback<T> iGetDataCallback, String str, boolean z) {
            this.f131565a = command;
            this.f131566b = iParser;
            this.f131567c = iGetDataCallback;
            this.f131569e = str;
            this.f131568d = z;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.sdk.SdkSender$c */
    public static class C53232c {

        /* renamed from: a */
        LarkError f131570a;

        /* renamed from: b */
        Exception f131571b;

        private C53232c() {
        }
    }

    public static long getNtpTime() {
        return Sdk._getNtpTime();
    }

    public static void setErrorHandle(AbstractC53231b bVar) {
        sErrorHandle = bVar;
    }

    private static String appendCallStackTrace(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        if (stackTraceElementArr != null) {
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            sb.append("\n className=" + stackTraceElement.getClassName());
            sb.append("\n fileName=" + stackTraceElement.getFileName());
            sb.append("\n methodName=" + stackTraceElement.getMethodName());
            sb.append("\n lineNumber=" + stackTraceElement.getLineNumber());
        }
        return sb.toString();
    }

    public static <T> T syncSend(Command command, Message.Builder builder, IParser<T> iParser) {
        return (T) syncSend(command, builder, C53234a.m205877a(), iParser);
    }

    public static <T> C53233d<T> syncSendMayError(Command command, Message.Builder builder, IParser<T> iParser) {
        return syncSendMayError(command, builder, C53234a.m205877a(), iParser, null);
    }

    public static <T> T sendRequest(Command command, Message.Builder builder, IParser<T> iParser) {
        return (T) sendRequest(command, builder, iParser, 30000, C53234a.m205877a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r2 != null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.lark.sdk.SdkSender.C53232c handleLarkError(byte[] r4, java.lang.Exception r5, com.bytedance.lark.pb.basic.v1.Command r6) {
        /*
            com.ss.android.lark.sdk.SdkSender$c r0 = new com.ss.android.lark.sdk.SdkSender$c
            r1 = 0
            r0.<init>()
            com.squareup.wire.ProtoAdapter<com.bytedance.lark.pb.basic.v1.LarkError> r2 = com.bytedance.lark.pb.basic.v1.LarkError.ADAPTER     // Catch:{ Exception -> 0x0044 }
            java.lang.Object r4 = r2.decode(r4)     // Catch:{ Exception -> 0x0044 }
            com.bytedance.lark.pb.basic.v1.LarkError r4 = (com.bytedance.lark.pb.basic.v1.LarkError) r4     // Catch:{ Exception -> 0x0044 }
            if (r4 == 0) goto L_0x004c
            java.lang.String r1 = r4.debug_message     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = r4.display_message     // Catch:{ Exception -> 0x003f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003f }
            r2.<init>()     // Catch:{ Exception -> 0x003f }
            java.lang.String r3 = "\n debugMessage = "
            r2.append(r3)     // Catch:{ Exception -> 0x003f }
            r2.append(r1)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x003f }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x003f }
            r2.<init>(r1)     // Catch:{ Exception -> 0x003f }
            com.ss.android.lark.sdk.SdkSender$b r5 = com.ss.android.lark.sdk.SdkSender.sErrorHandle     // Catch:{ Exception -> 0x003c }
            if (r5 == 0) goto L_0x004b
            java.lang.Integer r1 = r4.code     // Catch:{ Exception -> 0x003c }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x003c }
            java.lang.String r6 = r6.name()     // Catch:{ Exception -> 0x003c }
            r5.mo181687a(r1, r6)     // Catch:{ Exception -> 0x003c }
            goto L_0x004b
        L_0x003c:
            r5 = move-exception
            r1 = r4
            goto L_0x0047
        L_0x003f:
            r6 = move-exception
            r1 = r4
            r2 = r5
            r5 = r6
            goto L_0x0047
        L_0x0044:
            r4 = move-exception
            r2 = r5
            r5 = r4
        L_0x0047:
            r4 = r1
            if (r2 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r5 = r2
        L_0x004c:
            r0.f131571b = r5
            r0.f131570a = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.sdk.SdkSender.handleLarkError(byte[], java.lang.Exception, com.bytedance.lark.pb.basic.v1.Command):com.ss.android.lark.sdk.SdkSender$c");
    }

    public static <T> void sendPassThroughRequest(com.ss.android.lark.pb.improto.Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser) {
        sendPassThroughRequest(command, builder, iGetDataCallback, iParser, (C53253l) null);
    }

    public static <T> T sendRequest(Command command, Message.Builder builder, String str, IParser<T> iParser) {
        return (T) sendRequest(command, builder, iParser, 30000, str);
    }

    public static <T> T syncSend(Command command, Message.Builder builder, String str, IParser<T> iParser) {
        return syncSendMayError(command, builder, str, iParser, null).f131572a;
    }

    public static <T> C53233d<T> syncSendMayError(Command command, Message.Builder builder, String str, IParser<T> iParser) {
        return syncSendMayError(command, builder, str, iParser, null);
    }

    public static <T> T sendRequest(Command command, Message.Builder builder, int i, IParser<T> iParser) {
        return (T) sendRequest(command, builder, iParser, i, C53234a.m205877a());
    }

    public static <T> void asynSendRequestNonWrap(Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser) {
        asynSendRequestNonWrap(command, builder.build().encode(), (IGetDataCallback) iGetDataCallback, false, C53234a.m205877a(), (IParser) iParser, (StreamDataSource) null, (C53253l) null);
    }

    public static <T> void sendLocalRequest(Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser) {
        asynSendRequestNonWrap(command, builder.build().encode(), (IGetDataCallback) iGetDataCallback, false, C53234a.m205877a(), (IParser) iParser, StreamDataSource.ONCE_LOCAL, (C53253l) null);
    }

    public static <T> void sendNetRequest(Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser) {
        asynSendRequestNonWrap(command, builder.build().encode(), (IGetDataCallback) iGetDataCallback, false, C53234a.m205877a(), (IParser) iParser, StreamDataSource.ONCE_NET, (C53253l) null);
    }

    public static <T> void sendSmartRequest(Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser) {
        asynSendRequestNonWrap(command, builder.build().encode(), (IGetDataCallback) iGetDataCallback, false, C53234a.m205877a(), (IParser) iParser, StreamDataSource.DEFAULT_SMART, (C53253l) null);
    }

    public static <T> C53233d<T> syncSendMayError(Command command, Message.Builder builder, IParser<T> iParser, C53253l lVar) {
        return syncSendMayError(command, builder, C53234a.m205877a(), iParser, lVar);
    }

    public static <T> void sendPassThroughRequest(com.ss.android.lark.pb.improto.Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser, C53253l lVar) {
        sendPassThroughRequest(command, builder.build(), iGetDataCallback, iParser, lVar);
    }

    public static <T> T syncSend(Command command, Message.Builder builder, String str, IParser<T> iParser, C53253l lVar) {
        return syncSendMayError(command, builder, str, iParser, lVar).f131572a;
    }

    public static <T> void asynSendRequestNonWrap(Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser, C53253l lVar) {
        asynSendRequestNonWrap(command, builder.build().encode(), (IGetDataCallback) iGetDataCallback, false, C53234a.m205877a(), (IParser) iParser, (StreamDataSource) null, lVar);
    }

    public static <T> C53233d<T> parseObject(byte[] bArr, IParser<T> iParser, Command command, String str, boolean z) {
        String str2;
        C53232c cVar;
        Exception exc;
        String str3;
        String str4;
        String str5;
        int i;
        int i2;
        C53233d<T> dVar = new C53233d<>();
        try {
            dVar.f131572a = iParser.parse(bArr);
        } catch (Exception e) {
            if (z) {
                str2 = "asyncCall";
            } else {
                str2 = "syncCall";
            }
            if (z) {
                cVar = new C53232c();
                cVar.f131571b = e;
                cVar.f131570a = null;
            } else {
                cVar = handleLarkError(bArr, e, command);
            }
            C53241h.m205894a("SdkSender", str2 + " command = " + command.name() + "\n parseObject, contextId: " + str);
            LarkError larkError = cVar.f131570a;
            if (larkError != null) {
                Exception exc2 = cVar.f131571b;
                if (larkError.code == null) {
                    i2 = 0;
                } else {
                    i2 = larkError.code.intValue();
                }
                String str6 = larkError.debug_message;
                str4 = larkError.display_message;
                str3 = larkError.server_message;
                i = i2;
                str5 = str6;
                exc = exc2;
            } else {
                str5 = "";
                str4 = str5;
                str3 = str4;
                exc = null;
                i = -1;
            }
            dVar.f131573b = new ErrorResult(i, str5, str4, str3, exc);
        }
        return dVar;
    }

    public static <T> void sendPassThroughRequest(com.ss.android.lark.pb.improto.Command command, Message message, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser, C53253l lVar) {
        String a = C53234a.m205877a();
        ByteString of = ByteString.of(message.encode());
        Packet.C49811a aVar = new Packet.C49811a();
        aVar.mo173371a(a);
        aVar.mo173370a(PayloadType.PB2);
        aVar.mo173372a(of);
        aVar.mo173369a(command);
        C53241h.m205898b("SdkSender", "sendPassThroughRequest : contextId is " + a + " , command is " + command.name());
        asynPassTroughSendRequestNonWrap(command.getValue(), aVar.build().encode(), iGetDataCallback, false, a, iParser, null, lVar);
    }

    public static <T> C53233d<T> syncSendMayError(Command command, Message.Builder builder, String str, IParser<T> iParser, C53253l lVar) {
        C53241h.m205897a("SdkSender", true, command.name(), str);
        byte[] invoke = Sdk.invoke(command, builder.build().encode(), str, lVar);
        byte[] bArr = new byte[(invoke.length - 4)];
        System.arraycopy(invoke, 0, new byte[4], 0, 4);
        System.arraycopy(invoke, 4, bArr, 0, invoke.length - 4);
        C53233d<T> parseObject = parseObject(bArr, iParser, command, str, false);
        if (parseObject.f131573b != null) {
            C53241h.m205894a("SdkSender", "sync call error：command = " + command.name() + " contextId: " + str);
        }
        C53241h.m205897a("SdkSender", false, command.name(), str);
        return parseObject;
    }

    public static <T> void asynSendRequestNonWrap(Command command, Message.Builder builder, String str, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser) {
        asynSendRequestNonWrap(command, builder.build().encode(), iGetDataCallback, false, str, iParser, null);
    }

    public static <T> T sendRequest(Command command, Message.Builder builder, final IParser<T> iParser, int i, String str) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        asynSendRequestNonWrap(command, builder.build().encode(), new IGetDataCallback<T>() {
            /* class com.ss.android.lark.sdk.SdkSender.C532281 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                arrayList.add(null);
                countDownLatch.countDown();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(T t) {
                arrayList.add(t);
                countDownLatch.countDown();
            }
        }, true, str, new IParser<T>() {
            /* class com.ss.android.lark.sdk.SdkSender.C532292 */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public T parse(byte[] bArr) throws IOException {
                return (T) iParser.parse(bArr);
            }
        }, null);
        try {
            if (!countDownLatch.await((long) i, TimeUnit.MILLISECONDS)) {
                C53241h.m205894a("SdkSender", "moniter syn sendRequest command = " + command.name() + "\n timeout, contextId: " + str + "\n error: time out ");
                arrayList.add(null);
            }
        } catch (InterruptedException e) {
            C53241h.m205894a("SdkSender", "moniter syn sendRequest command = " + command.name() + "\n interrupt, contextId: " + str + "\n error: InterruptedException " + e);
            arrayList.add(null);
        }
        return (T) arrayList.get(0);
    }

    public static <T> void asynSendRequestNonWrap(Command command, Message.Builder builder, String str, IGetDataCallback<T> iGetDataCallback, IParser<T> iParser, C53253l lVar) {
        asynSendRequestNonWrap(command, builder.build().encode(), iGetDataCallback, false, str, iParser, lVar);
    }

    private static <T> void asynSendRequestNonWrap(Command command, byte[] bArr, IGetDataCallback<T> iGetDataCallback, boolean z, String str, IParser iParser, C53253l lVar) {
        asynSendRequestNonWrap(command, bArr, iGetDataCallback, z, str, iParser, (StreamDataSource) null, lVar);
    }

    private static <T> void asynPassTroughSendRequestNonWrap(int i, byte[] bArr, IGetDataCallback<T> iGetDataCallback, boolean z, String str, IParser iParser, StreamDataSource streamDataSource, C53253l lVar) {
        C53241h.m205899c("SdkSender", "async nonWrap sendPassTroughRequest command id is: " + i + " , contextId is: " + str);
        Sdk.invokePassTroughAsync(i, bArr, str, new C53230a(Command.POST_GATEWAY, iParser, iGetDataCallback, str, z), streamDataSource, lVar);
    }

    public static <T> void asynSendRequestNonWrap(Command command, Message.Builder builder, IGetDataCallback<T> iGetDataCallback, boolean z, String str, IParser iParser, StreamDataSource streamDataSource, C53253l lVar) {
        asynSendRequestNonWrap(command, builder.build().encode(), iGetDataCallback, z, str, iParser, streamDataSource, lVar);
    }

    public static <T> void asynSendRequestNonWrap(Command command, byte[] bArr, IGetDataCallback<T> iGetDataCallback, boolean z, String str, IParser iParser, StreamDataSource streamDataSource, C53253l lVar) {
        C53241h.m205899c("SdkSender", "async nonWrap sendRequest command = " + command.name());
        C53241h.m205897a("SdkSender", true, command.name(), str);
        Sdk.invokeAsync(command, bArr, str, new C53230a(command, iParser, iGetDataCallback, str, z), streamDataSource, lVar);
    }
}
