package com.ss.android.bytedcert.p1304b;

import android.util.Pair;
import com.ss.android.bytedcert.config.INetWork;
import com.ss.android.bytedcert.manager.BytedCertManager;
import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;

/* renamed from: com.ss.android.bytedcert.b.a */
public class C28317a {

    /* renamed from: com.ss.android.bytedcert.b.a$a */
    public static class C28318a {

        /* renamed from: A */
        public static Pair<Integer, String> f71126A = new Pair<>(-5011, "静默失败");

        /* renamed from: B */
        public static Pair<Integer, String> f71127B = new Pair<>(-5020, "比对初始化失败");

        /* renamed from: C */
        public static Pair<Integer, String> f71128C = new Pair<>(-5021, "比对失败");

        /* renamed from: D */
        public static int f71129D = -200;

        /* renamed from: E */
        public static int f71130E = -201;

        /* renamed from: F */
        public static int f71131F = -202;

        /* renamed from: G */
        public static int f71132G = -203;

        /* renamed from: H */
        public static int f71133H = -204;

        /* renamed from: I */
        public static int f71134I = -205;

        /* renamed from: J */
        public static int f71135J = -206;

        /* renamed from: K */
        public static int f71136K = -207;

        /* renamed from: a */
        public static Pair<Integer, String> f71137a = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_INVALID_TOKEN), "网络异常，请稍后再试");

        /* renamed from: b */
        public static Pair<Integer, String> f71138b = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_JOIN_ROOM_ERROR), "网络异常，请稍后再试");

        /* renamed from: c */
        public static Pair<Integer, String> f71139c = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_NO_PUBLISH_PERMISSION), "网络异常，请稍后再试");

        /* renamed from: d */
        public static Pair<Integer, String> f71140d = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_NO_SUBSCRIBE_PERMISSION), "活体识别失败，请再试一次");

        /* renamed from: e */
        public static Pair<Integer, String> f71141e = new Pair<>(Integer.valueOf((int) IByteRtcError.BRRERR_DUPLICATE_LOGIN), "网络异常，请稍后再试");

        /* renamed from: f */
        public static Pair<Integer, String> f71142f = new Pair<>(Integer.valueOf((int) IByteRtcError.BRERR_GET_ROOM_INVALID_RESPONSE), "网络异常，请稍后再试");

        /* renamed from: g */
        public static Pair<Integer, String> f71143g = new Pair<>(-1006, "");

        /* renamed from: h */
        public static Pair<Integer, String> f71144h = new Pair<>(-1007, "");

        /* renamed from: i */
        public static Pair<Integer, String> f71145i = new Pair<>(-1008, "");

        /* renamed from: j */
        public static Pair<Integer, String> f71146j = new Pair<>(-1101, "超过活体最大次数");

        /* renamed from: k */
        public static Pair<Integer, String> f71147k = new Pair<>(-3000, "无法使用相机，请检查是否打开相机权限");

        /* renamed from: l */
        public static Pair<Integer, String> f71148l = new Pair<>(-3001, "网络异常，请稍后再试");

        /* renamed from: m */
        public static Pair<Integer, String> f71149m = new Pair<>(-3002, "请退出多屏模式，再重试一次");

        /* renamed from: n */
        public static Pair<Integer, String> f71150n = new Pair<>(-3003, "无法使用相机，请检查是否打开相机权限");

        /* renamed from: o */
        public static Pair<Integer, String> f71151o = new Pair<>(-3004, "网络异常，请稍后再试");

        /* renamed from: p */
        public static Pair<Integer, String> f71152p = new Pair<>(-3006, "图片获取失败，请重新上传");

        /* renamed from: q */
        public static Pair<Integer, String> f71153q = new Pair<>(-3007, "图片获取失败，请重新拍照");

        /* renamed from: r */
        public static Pair<Integer, String> f71154r = new Pair<>(-4001, "网络请求注入失败 please call method setCertMonitorConfig or depend on byted_cert_adapter");

        /* renamed from: s */
        public static Pair<Integer, String> f71155s = new Pair<>(-4002, "网络请求注入失败 please call method setNetWork or depend on byted_cert_adapter");

        /* renamed from: t */
        public static Pair<Integer, String> f71156t = new Pair<>(-4003, "操作太频繁，请稍后再试");

        /* renamed from: u */
        public static Pair<Integer, String> f71157u = new Pair<>(-5000, "下载解压模型失败");

        /* renamed from: v */
        public static Pair<Integer, String> f71158v = new Pair<>(-5001, "无可用下载");

        /* renamed from: w */
        public static Pair<Integer, String> f71159w = new Pair<>(-5003, "未下载");

        /* renamed from: x */
        public static Pair<Integer, String> f71160x = new Pair<>(-5004, " 对应模型不存在");

        /* renamed from: y */
        public static Pair<Integer, String> f71161y = new Pair<>(-5005, "模型校验失败");

        /* renamed from: z */
        public static Pair<Integer, String> f71162z = new Pair<>(-5010, "静默初始化失败");
    }

    /* renamed from: a */
    public static int m103907a(Throwable th) {
        int checkResponseException;
        INetWork netWork = BytedCertManager.getInstance().getNetWork();
        if (netWork != null && (checkResponseException = netWork.checkResponseException(th)) != 0) {
            return checkResponseException;
        }
        if (th instanceof ConnectTimeoutException) {
            return -101;
        }
        if (th instanceof SocketTimeoutException) {
            return -102;
        }
        if (th instanceof SocketException) {
            return -103;
        }
        if (th instanceof SSLPeerUnverifiedException) {
            return -104;
        }
        if (th instanceof IOException) {
            return -106;
        }
        return -100;
    }

    /* renamed from: b */
    public static int m103908b(Throwable th) {
        if (th instanceof NullPointerException) {
            return C28318a.f71130E;
        }
        if (th instanceof IllegalArgumentException) {
            return C28318a.f71131F;
        }
        if (th instanceof RuntimeException) {
            return C28318a.f71132G;
        }
        if (th instanceof UnsupportedEncodingException) {
            return C28318a.f71133H;
        }
        if (th instanceof JSONException) {
            return C28318a.f71134I;
        }
        if (th instanceof IOException) {
            return C28318a.f71135J;
        }
        return C28318a.f71129D;
    }
}
