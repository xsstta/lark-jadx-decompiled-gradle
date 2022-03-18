package com.ss.android.vesdk;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONObject;

public class VEListener {

    public interface VEEditorEffectListener {
        /* renamed from: a */
        void mo220828a(int i, boolean z);
    }

    public interface VEInfoStickerBufferListener {
        Bitmap onGetBuffer(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$a */
    public interface AbstractC63853a {
        /* renamed from: a */
        void mo220830a(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$aa */
    public interface AbstractC63854aa {
        /* renamed from: a */
        void mo220831a(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$ab */
    public interface AbstractC63855ab extends AbstractC63856ac {
        /* renamed from: a */
        void mo120727a(int i, int i2, String str);

        /* renamed from: a */
        void mo120728a(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$ac */
    public interface AbstractC63856ac {
        /* renamed from: a */
        void mo120729a(boolean z);

        /* renamed from: b */
        void mo120730b(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$ad */
    public interface AbstractC63857ad {
        /* renamed from: a */
        void mo220832a(int i, int i2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$ae */
    public interface AbstractC63858ae {
        /* renamed from: a */
        String mo220833a();

        /* renamed from: a */
        void mo220834a(double d);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$b */
    public interface AbstractC63859b {
        /* renamed from: a */
        void mo220835a(float f, boolean z);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$c */
    public interface AbstractC63860c {
        /* renamed from: a */
        void mo196108a(String str, JSONObject jSONObject, String str2, String str3, String str4);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$d */
    public interface AbstractC63861d {
        /* renamed from: a */
        void mo220836a(int i, int i2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$e */
    public interface AbstractC63862e {
        /* renamed from: a */
        void mo220837a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$f */
    public interface AbstractC63863f {
        /* renamed from: a */
        void mo220838a(double d);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$g */
    public interface AbstractC63864g {
        /* renamed from: a */
        void mo220839a();

        /* renamed from: a */
        void mo220840a(int i, int i2, int i3);

        /* renamed from: a */
        void mo220841a(int i, String str);

        /* renamed from: a */
        void mo220842a(boolean z);

        /* renamed from: a */
        void mo220843a(byte[] bArr, int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$h */
    public interface AbstractC63865h {
        /* renamed from: a */
        void mo220844a(float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$i */
    public interface AbstractC63866i {
        void onDone(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$j */
    public interface AbstractC63867j extends AbstractC63868k {
        /* renamed from: a */
        void mo180960a(int i, int i2, String str);

        /* renamed from: a */
        void mo180961a(int i, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$k */
    public interface AbstractC63868k {
        /* renamed from: a */
        void mo180958a();

        /* renamed from: a */
        void mo180959a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$l */
    public interface AbstractC63869l {
        /* renamed from: a */
        void mo220845a();

        /* renamed from: a */
        void mo220846a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$m */
    public interface AbstractC63870m {
        /* renamed from: a */
        void mo220847a();

        /* renamed from: a */
        void mo220848a(float f);

        /* renamed from: a */
        void mo220849a(int i, int i2, float f, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$n */
    public interface AbstractC63871n {
        /* renamed from: a */
        void mo220850a(double d);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$o */
    public interface AbstractC63872o {
        /* renamed from: a */
        void mo220851a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$p */
    public interface AbstractC63873p {
        /* renamed from: a */
        void mo220852a(byte[] bArr, int i, int i2, boolean z);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$q */
    public interface AbstractC63874q {
        /* renamed from: a */
        void mo220853a(Throwable th);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$r */
    public interface AbstractC63875r {
        /* renamed from: a */
        void mo220854a();
    }

    /* renamed from: com.ss.android.vesdk.VEListener$s */
    public interface AbstractC63876s {
        /* renamed from: a */
        int mo220855a(byte[] bArr, int i, int i2, int i3, float f);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$t */
    public interface AbstractC63877t {
        /* renamed from: a */
        void mo220856a(int i, int i2, int i3);

        /* renamed from: a */
        void mo220857a(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$u */
    public interface AbstractC63878u {
        /* renamed from: a */
        boolean mo220858a(int i);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$v */
    public interface AbstractC63879v {
        /* renamed from: a */
        void mo220859a();
    }

    /* renamed from: com.ss.android.vesdk.VEListener$w */
    public interface AbstractC63880w {
        /* renamed from: a */
        int mo220860a();

        /* renamed from: a */
        int mo220861a(float f);

        /* renamed from: a */
        int mo220862a(int i, float f, float f2, boolean z);

        /* renamed from: a */
        int mo220863a(int i, int i2, float f, String str);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$x */
    public interface AbstractC63881x {
        /* renamed from: a */
        void mo196109a(String str, JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$y */
    public interface AbstractC63882y {
        /* renamed from: a */
        VESize mo220864a(List<VESize> list, List<VESize> list2);
    }

    /* renamed from: com.ss.android.vesdk.VEListener$z */
    public interface AbstractC63883z {
        /* renamed from: a */
        void mo220865a();

        /* renamed from: a */
        void mo220866a(float f);

        /* renamed from: a */
        void mo220867a(boolean z);
    }
}
