package com.ss.android.lark.inv.export.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.dynamic_resource.BorderRadius;
import com.ss.android.lark.pb.dynamic_resource.CdnImageData;
import com.ss.android.lark.pb.dynamic_resource.ConstantKeyImageData;
import com.ss.android.lark.pb.dynamic_resource.ImageConfiguration;
import com.ss.android.lark.pb.dynamic_resource.ImageConfigurationProperty;
import com.ss.android.lark.pb.dynamic_resource.ImageResourceData;
import com.ss.android.lark.pb.dynamic_resource.RawImageData;
import com.ss.android.lark.pb.dynamic_resource.TextValue;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.aj;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.inv.export.util.k */
public class C40115k {
    /* renamed from: a */
    private static float[] m159058a(BorderRadius borderRadius) {
        return new float[]{(float) UIHelper.dp2px(borderRadius.mtop_left.floatValue()), (float) UIHelper.dp2px(borderRadius.mtop_left.floatValue()), (float) UIHelper.dp2px(borderRadius.mtop_right.floatValue()), (float) UIHelper.dp2px(borderRadius.mtop_right.floatValue()), (float) UIHelper.dp2px(borderRadius.mbottom_right.floatValue()), (float) UIHelper.dp2px(borderRadius.mbottom_right.floatValue()), (float) UIHelper.dp2px(borderRadius.mbottom_left.floatValue()), (float) UIHelper.dp2px(borderRadius.mbottom_left.floatValue())};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.inv.export.util.k$1 */
    public static /* synthetic */ class C401161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f101956a;

        /* renamed from: b */
        static final /* synthetic */ int[] f101957b;

        /* renamed from: c */
        static final /* synthetic */ int[] f101958c;

        /* renamed from: d */
        static final /* synthetic */ int[] f101959d;

        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|22|(2:23|24)|25|(2:27|28)|29|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|(3:59|60|62)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|19|20|21|22|23|24|25|(2:27|28)|29|(2:31|32)|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|(2:11|12)|13|15|16|17|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|22|23|24|25|(2:27|28)|29|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|22|23|24|25|27|28|29|31|32|33|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0094 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00df */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fd */
        static {
            /*
            // Method dump skipped, instructions count: 264
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.inv.export.util.C40115k.C401161.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.inv.export.util.k$a */
    public static class C40117a {
        /* renamed from: a */
        public Map<String, String> mo145693a() {
            return null;
        }

        /* renamed from: g */
        public Bitmap mo145700g(int i, int i2) {
            return null;
        }

        /* renamed from: h */
        public Bitmap mo145701h(int i, int i2) {
            return null;
        }

        /* renamed from: a */
        private static int m159059a(TextValue.AlignFormat alignFormat) {
            int i = C401161.f101959d[alignFormat.ordinal()];
            if (i == 1) {
                return 3;
            }
            if (i != 2) {
                return 17;
            }
            return 5;
        }

        /* renamed from: a */
        public String mo145692a(String str) {
            Map<String, String> a = mo145693a();
            if (a == null || a.isEmpty()) {
                return str;
            }
            return UIHelper.mustacheFormat(str, a);
        }

        /* renamed from: b */
        public Bitmap mo145694b(int i, int i2) {
            return C40115k.m159049a((int) R.drawable.ic_launcher, i, i2);
        }

        /* renamed from: f */
        public Bitmap mo145699f(int i, int i2) {
            String g = C40147z.m159160a().getLoginDependency().mo145591g();
            if (!TextUtils.isEmpty(g)) {
                return C40102d.m159002a(g, i, i2);
            }
            Log.m165383e("InvitationModule", "tenantIconUrl is null.");
            return null;
        }

        /* renamed from: a */
        public Bitmap mo145688a(int i, int i2) {
            TextView textView = new TextView(aj.m224263a());
            textView.setText(UIHelper.getAppName());
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: c */
        public Bitmap mo145696c(int i, int i2) {
            String b = C40147z.m159160a().getLoginDependency().mo145586b();
            TextView textView = new TextView(aj.m224263a());
            textView.setText(b);
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: d */
        public Bitmap mo145697d(int i, int i2) {
            String d = C40147z.m159160a().getLoginDependency().mo145588d();
            TextView textView = new TextView(aj.m224263a());
            textView.setText(d);
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: e */
        public Bitmap mo145698e(int i, int i2) {
            try {
                return ImageLoader.with(aj.m224263a()).load(AvatarImage.Builder.obtain(C40147z.m159160a().getLoginDependency().mo145587c(), C40147z.m159160a().getLoginDependency().mo145582a(), i, i2).build()).asBitmap().centerCrop().error(R.drawable.inv_avatar_bg).getBitmap(i, i2);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public Bitmap mo145695b(String str, int i, int i2) {
            return Bitmap.createScaledBitmap(C40147z.m159160a().encodeQRCode(str, i, i2, 0), i, i2, true);
        }

        /* renamed from: a */
        public Bitmap mo145689a(ConstantKeyImageData constantKeyImageData, int i, int i2) {
            switch (C401161.f101957b[constantKeyImageData.mtype.ordinal()]) {
                case 1:
                    Log.m165383e("InvitationModule", "ConstantKeyImageData type is unknown.");
                    return null;
                case 2:
                    return mo145688a(i, i2);
                case 3:
                    return mo145694b(i, i2);
                case 4:
                    return mo145696c(i, i2);
                case 5:
                    return mo145697d(i, i2);
                case 6:
                    return mo145698e(i, i2);
                case 7:
                    return mo145699f(i, i2);
                case 8:
                    return mo145695b(mo145692a(constantKeyImageData.mqr_code), i, i2);
                case 9:
                    return mo145700g(i, i2);
                case 10:
                    return mo145701h(i, i2);
                case 11:
                    return mo145691a(mo145692a(constantKeyImageData.mdynamic_key), i, i2);
                default:
                    Log.m165383e("InvitationModule", "ConstantKeyImageData type is not valid.");
                    return null;
            }
        }

        /* renamed from: a */
        public Bitmap mo145691a(String str, int i, int i2) {
            String a = mo145692a(C40119m.m159076a(str));
            TextView textView = new TextView(aj.m224263a());
            textView.setText(a);
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: a */
        public Bitmap mo145690a(TextValue textValue, boolean z, int i, int i2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(aj.m224263a());
            appCompatTextView.setWidth(i);
            appCompatTextView.setHeight(i2);
            appCompatTextView.setTextSize(0, (float) UIHelper.dp2px(textValue.mfont_size.floatValue()));
            appCompatTextView.setTextColor(Color.parseColor(textValue.mcolor));
            appCompatTextView.setGravity(m159059a(textValue.malign));
            String a = mo145692a(textValue.mvalue);
            if (z) {
                appCompatTextView.setText(C40115k.m159055a(a));
            } else {
                appCompatTextView.setText(a);
            }
            int i3 = C401161.f101958c[textValue.moverflow.ordinal()];
            if (i3 == 1) {
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
            } else if (i3 == 2) {
                appCompatTextView.setMaxLines(1);
                if (appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()) >= ((float) i)) {
                    try {
                        appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(textValue.mmin_font_size.intValue(), textValue.mfont_size.intValue(), 2, 0);
                    } catch (Exception unused) {
                    }
                }
            }
            return Bitmap.createScaledBitmap(C40102d.m159001a(appCompatTextView), i, i2, true);
        }
    }

    /* renamed from: a */
    public static CharSequence m159055a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: a */
    public static Bitmap m159053a(List<ImageConfiguration> list, String str) {
        return m159052a(list, new C40117a(), str);
    }

    /* renamed from: a */
    private static Bitmap m159051a(ImageConfiguration imageConfiguration, C40117a aVar) {
        int dp2px = UIHelper.dp2px((float) imageConfiguration.mproperty.mresize_width.intValue());
        int dp2px2 = UIHelper.dp2px((float) imageConfiguration.mproperty.mresize_height.intValue());
        ImageResourceData imageResourceData = imageConfiguration.mdata;
        Log.m165389i("InvitationModule", "start parse -> " + imageConfiguration.toString());
        switch (C401161.f101956a[imageResourceData.mtype.ordinal()]) {
            case 1:
                CdnImageData cdnImageData = imageResourceData.mcdn_image;
                if (cdnImageData != null) {
                    return C40102d.m159002a(aVar.mo145692a(cdnImageData.murl), dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "cdnImage is null when type is DecryptedRawCdnUrl.");
                return null;
            case 2:
                RawImageData rawImageData = imageResourceData.mraw_image;
                if (rawImageData != null) {
                    return m159054a(rawImageData.mraw_data.toByteArray(), dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "rawImage is null when type is DecryptedRawBytes.");
                return null;
            case 3:
                ConstantKeyImageData constantKeyImageData = imageResourceData.mconstant_key_image;
                if (constantKeyImageData != null) {
                    return aVar.mo145689a(constantKeyImageData, dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "constantKeyImage is null when type is ConstantKey.");
                return null;
            case 4:
                TextValue textValue = imageResourceData.mtext;
                if (textValue != null) {
                    return aVar.mo145690a(textValue, false, dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "textValue is null when type is RawText.");
                return null;
            case 5:
                TextValue textValue2 = imageResourceData.mraw_html;
                if (textValue2 != null) {
                    return aVar.mo145690a(textValue2, true, dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "rawHtml is null when type is RawHtml");
                return null;
            case 6:
                Log.m165383e("InvitationModule", "ImageResourceData type is UnknownType.");
                return null;
            default:
                Log.m165383e("InvitationModule", "ImageResourceData type is not valid.");
                return null;
        }
    }

    /* renamed from: a */
    public static Bitmap m159049a(int i, int i2, int i3) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(aj.m224263a().getResources(), i), i2, i3, true);
    }

    /* renamed from: a */
    private static Bitmap m159054a(byte[] bArr, int i, int i2) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), i, i2, true);
    }

    /* renamed from: a */
    public static Bitmap m159052a(List<ImageConfiguration> list, C40117a aVar, String str) {
        ImageConfiguration imageConfiguration;
        InvApmUtils.m158958a("ug_dy_resource_generate_img");
        StringBuilder sb = new StringBuilder();
        if (list == null) {
            Log.m165383e("InvitationModule", "configs is null.");
            return null;
        } else if (list.size() == 0) {
            Log.m165383e("InvitationModule", "configs is empty.");
            return null;
        } else {
            Iterator<ImageConfiguration> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    imageConfiguration = null;
                    break;
                }
                imageConfiguration = it.next();
                if (imageConfiguration.mis_background.booleanValue()) {
                    break;
                }
            }
            if (imageConfiguration == null) {
                Log.m165383e("InvitationModule", "bg not found.");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(UIHelper.dp2px((float) imageConfiguration.mproperty.mresize_width.intValue()), UIHelper.dp2px((float) imageConfiguration.mproperty.mresize_height.intValue()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(0);
            if (!m159057a(canvas, imageConfiguration, aVar)) {
                String str2 = "draw bg failed -> " + imageConfiguration.mdata.toString();
                Log.m165383e("InvitationModule", str2);
                sb.append(str2);
                sb.append("\n");
            }
            for (ImageConfiguration imageConfiguration2 : list) {
                if (imageConfiguration2 != imageConfiguration && !m159057a(canvas, imageConfiguration2, aVar)) {
                    String str3 = "draw failed -> " + imageConfiguration2.mdata.toString();
                    Log.m165383e("InvitationModule", str3);
                    sb.append(str3);
                    sb.append("\n");
                }
            }
            if (sb.length() == 0) {
                InvApmUtils.m158968a("ug_dy_resource_generate_img", true, (Map<String, ? extends Object>) C40108g.m159014a(Pair.create("biz_scene", str)));
            } else {
                InvApmUtils.m158961a("ug_dy_resource_generate_img", C40108g.m159014a(Pair.create("biz_scene", str)), 0, sb.toString());
            }
            return createBitmap;
        }
    }

    /* renamed from: a */
    private static void m159056a(Canvas canvas, ImageConfiguration imageConfiguration, int i) {
        float[] fArr;
        if (C40147z.m159164d()) {
            ImageConfigurationProperty imageConfigurationProperty = imageConfiguration.mproperty;
            int dp2px = UIHelper.dp2px((float) imageConfigurationProperty.moffset_x.intValue());
            int dp2px2 = UIHelper.dp2px((float) imageConfigurationProperty.moffset_y.intValue());
            int dp2px3 = UIHelper.dp2px((float) imageConfigurationProperty.mresize_width.intValue());
            int dp2px4 = UIHelper.dp2px((float) imageConfigurationProperty.mresize_height.intValue());
            Paint paint = new Paint(5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) UIHelper.dp2px(1.0f));
            paint.setColor(i);
            float dp2px5 = (float) UIHelper.dp2px(2.0f);
            paint.setPathEffect(new DashPathEffect(new float[]{dp2px5, dp2px5}, BitmapDescriptorFactory.HUE_RED));
            Path path = new Path();
            RectF rectF = new RectF((float) dp2px, (float) dp2px2, (float) (dp2px + dp2px3), (float) (dp2px2 + dp2px4));
            BorderRadius borderRadius = imageConfigurationProperty.mborder_radius;
            if (borderRadius != null) {
                fArr = m159058a(borderRadius);
            } else {
                fArr = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: a */
    private static boolean m159057a(Canvas canvas, ImageConfiguration imageConfiguration, C40117a aVar) {
        ImageConfigurationProperty imageConfigurationProperty = imageConfiguration.mproperty;
        int dp2px = UIHelper.dp2px((float) imageConfigurationProperty.moffset_x.intValue());
        int dp2px2 = UIHelper.dp2px((float) imageConfigurationProperty.moffset_y.intValue());
        Bitmap a = m159051a(imageConfiguration, aVar);
        if (a == null || a.isRecycled()) {
            m159056a(canvas, imageConfiguration, -2130771968);
            return false;
        }
        if (imageConfigurationProperty.mborder_radius != null) {
            a = m159050a(a, m159058a(imageConfigurationProperty.mborder_radius), BitmapDescriptorFactory.HUE_RED, 0, false);
        }
        float floatValue = imageConfigurationProperty.malpha.floatValue();
        Paint paint = new Paint(5);
        paint.setAlpha((int) (floatValue * 255.0f));
        canvas.drawBitmap(a, (float) dp2px, (float) dp2px2, paint);
        m159056a(canvas, imageConfiguration, -2147418368);
        return true;
    }

    /* renamed from: a */
    public static Bitmap m159050a(Bitmap bitmap, float[] fArr, float f, int i, boolean z) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Paint paint = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
        float f2 = f / 2.0f;
        rectF.inset(f2, f2);
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        if (f > BitmapDescriptorFactory.HUE_RED) {
            paint.setShader(null);
            paint.setColor(i);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(f);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint);
        }
        if (z && !bitmap.isRecycled() && createBitmap != bitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }
}
