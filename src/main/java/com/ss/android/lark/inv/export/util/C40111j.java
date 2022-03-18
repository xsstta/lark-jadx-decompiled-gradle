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
import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.contact.v1.BorderRadius;
import com.bytedance.lark.pb.contact.v1.CdnImageData;
import com.bytedance.lark.pb.contact.v1.ConstantKeyImageData;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaRequest;
import com.bytedance.lark.pb.contact.v1.GetDynamicMediaResponse;
import com.bytedance.lark.pb.contact.v1.ImageConfiguration;
import com.bytedance.lark.pb.contact.v1.ImageConfigurationProperty;
import com.bytedance.lark.pb.contact.v1.ImageResourceData;
import com.bytedance.lark.pb.contact.v1.RawImageData;
import com.bytedance.lark.pb.contact.v1.TextValue;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.inv.export.util.InvApmUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.aj;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.lark.inv.export.util.j */
public class C40111j {
    /* renamed from: a */
    private static boolean m159031a(Canvas canvas, ImageConfiguration imageConfiguration, C40114a aVar) {
        ImageConfigurationProperty imageConfigurationProperty = imageConfiguration.property;
        int dp2px = UIHelper.dp2px((float) imageConfigurationProperty.offset_x.intValue());
        int dp2px2 = UIHelper.dp2px((float) imageConfigurationProperty.offset_y.intValue());
        Bitmap a = m159024a(imageConfiguration, aVar);
        if (a == null || a.isRecycled()) {
            m159028a(canvas, imageConfiguration, -2130771968);
            return false;
        }
        if (imageConfigurationProperty.border_radius != null) {
            a = m159023a(a, m159032a(imageConfigurationProperty.border_radius), BitmapDescriptorFactory.HUE_RED, 0, false);
        }
        float floatValue = imageConfigurationProperty.alpha.floatValue();
        Paint paint = new Paint(5);
        paint.setAlpha((int) (floatValue * 255.0f));
        canvas.drawBitmap(a, (float) dp2px, (float) dp2px2, paint);
        m159028a(canvas, imageConfiguration, -2147418368);
        return true;
    }

    /* renamed from: a */
    private static float[] m159032a(BorderRadius borderRadius) {
        return new float[]{(float) UIHelper.dp2px(borderRadius.top_left.floatValue()), (float) UIHelper.dp2px(borderRadius.top_left.floatValue()), (float) UIHelper.dp2px(borderRadius.top_right.floatValue()), (float) UIHelper.dp2px(borderRadius.top_right.floatValue()), (float) UIHelper.dp2px(borderRadius.bottom_right.floatValue()), (float) UIHelper.dp2px(borderRadius.bottom_right.floatValue()), (float) UIHelper.dp2px(borderRadius.bottom_left.floatValue()), (float) UIHelper.dp2px(borderRadius.bottom_left.floatValue())};
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.inv.export.util.j$2 */
    public static /* synthetic */ class C401132 {

        /* renamed from: a */
        static final /* synthetic */ int[] f101951a;

        /* renamed from: b */
        static final /* synthetic */ int[] f101952b;

        /* renamed from: c */
        static final /* synthetic */ int[] f101953c;

        /* renamed from: d */
        static final /* synthetic */ int[] f101954d;

        /* renamed from: e */
        static final /* synthetic */ int[] f101955e;

        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|(3:69|70|72)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|(2:37|38)|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|(3:69|70|72)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|(3:69|70|72)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(57:0|(2:1|2)|3|5|6|7|9|10|(2:11|12)|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|(3:69|70|72)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(61:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|(2:19|20)|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|72) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|(2:41|42)|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|72) */
        /* JADX WARNING: Can't wrap try/catch for region: R(63:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|41|42|43|45|46|47|48|49|50|51|52|53|54|55|56|57|59|60|61|62|63|64|65|66|67|68|69|70|72) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0104 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x010e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0118 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0122 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x012c */
        static {
            /*
            // Method dump skipped, instructions count: 311
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.inv.export.util.C40111j.C401132.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.lark.inv.export.util.j$a */
    public static class C40114a {
        /* renamed from: a */
        public Map<String, String> mo145679a() {
            return null;
        }

        /* renamed from: g */
        public Bitmap mo145686g(int i, int i2) {
            return null;
        }

        /* renamed from: h */
        public Bitmap mo145687h(int i, int i2) {
            return null;
        }

        /* renamed from: a */
        private static int m159034a(TextValue.AlignFormat alignFormat) {
            int i = C401132.f101955e[alignFormat.ordinal()];
            if (i == 1) {
                return 3;
            }
            if (i != 2) {
                return 1;
            }
            return 5;
        }

        /* renamed from: a */
        public String mo145678a(String str) {
            Map<String, String> a = mo145679a();
            if (a == null || a.isEmpty()) {
                return str;
            }
            return UIHelper.mustacheFormat(str, a);
        }

        /* renamed from: b */
        public Bitmap mo145680b(int i, int i2) {
            return C40111j.m159022a((int) R.drawable.ic_launcher, i, i2);
        }

        /* renamed from: f */
        public Bitmap mo145685f(int i, int i2) {
            String g = C40147z.m159160a().getLoginDependency().mo145591g();
            if (!TextUtils.isEmpty(g)) {
                return C40102d.m159002a(g, i, i2);
            }
            Log.m165383e("InvitationModule", "tenantIconUrl is null.");
            return null;
        }

        /* renamed from: a */
        public Bitmap mo145674a(int i, int i2) {
            TextView textView = new TextView(aj.m224263a());
            textView.setText(UIHelper.getAppName());
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: c */
        public Bitmap mo145682c(int i, int i2) {
            String b = C40147z.m159160a().getLoginDependency().mo145586b();
            TextView textView = new TextView(aj.m224263a());
            textView.setText(b);
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: d */
        public Bitmap mo145683d(int i, int i2) {
            String d = C40147z.m159160a().getLoginDependency().mo145588d();
            TextView textView = new TextView(aj.m224263a());
            textView.setText(d);
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: e */
        public Bitmap mo145684e(int i, int i2) {
            try {
                return ImageLoader.with(aj.m224263a()).load(AvatarImage.Builder.obtain(C40147z.m159160a().getLoginDependency().mo145587c(), C40147z.m159160a().getLoginDependency().mo145582a(), i, i2).build()).asBitmap().centerCrop().error(R.drawable.inv_avatar_bg).getBitmap(i, i2);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
                return null;
            }
        }

        /* renamed from: b */
        public Bitmap mo145681b(String str, int i, int i2) {
            return Bitmap.createScaledBitmap(C40147z.m159160a().encodeQRCode(str, i, i2, 0), i, i2, true);
        }

        /* renamed from: a */
        public Bitmap mo145675a(ConstantKeyImageData constantKeyImageData, int i, int i2) {
            switch (C401132.f101952b[constantKeyImageData.type.ordinal()]) {
                case 1:
                    Log.m165383e("InvitationModule", "ConstantKeyImageData type is unknown.");
                    return null;
                case 2:
                    return mo145674a(i, i2);
                case 3:
                    return mo145680b(i, i2);
                case 4:
                    return mo145682c(i, i2);
                case 5:
                    return mo145683d(i, i2);
                case 6:
                    return mo145684e(i, i2);
                case 7:
                    return mo145685f(i, i2);
                case 8:
                    return mo145681b(mo145678a(constantKeyImageData.qr_code), i, i2);
                case 9:
                    return mo145686g(i, i2);
                case 10:
                    return mo145687h(i, i2);
                case 11:
                    return mo145677a(mo145678a(constantKeyImageData.dynamic_key), i, i2);
                default:
                    Log.m165383e("InvitationModule", "ConstantKeyImageData type is not valid.");
                    return null;
            }
        }

        /* renamed from: a */
        public Bitmap mo145677a(String str, int i, int i2) {
            String a = mo145678a(C40119m.m159076a(str));
            TextView textView = new TextView(aj.m224263a());
            textView.setText(a);
            return Bitmap.createScaledBitmap(C40102d.m159001a(textView), i, i2, true);
        }

        /* renamed from: a */
        public Bitmap mo145676a(TextValue textValue, boolean z, int i, int i2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(aj.m224263a());
            appCompatTextView.setWidth(i);
            appCompatTextView.setHeight(i2);
            appCompatTextView.setTextSize(0, (float) UIHelper.dp2px(textValue.font_size.floatValue()));
            appCompatTextView.setTextColor(Color.parseColor(textValue.color));
            appCompatTextView.setGravity(m159034a(textValue.align));
            String a = mo145678a(textValue.value);
            if (z) {
                appCompatTextView.setText(C40111j.m159027a(a));
            } else {
                appCompatTextView.setText(a);
            }
            int i3 = C401132.f101953c[textValue.overflow.ordinal()];
            if (i3 == 1) {
                appCompatTextView.setMaxLines(1);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
            } else if (i3 == 2) {
                appCompatTextView.setMaxLines(1);
                if (appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()) >= ((float) i)) {
                    try {
                        appCompatTextView.setAutoSizeTextTypeUniformWithConfiguration(textValue.min_font_size.intValue(), textValue.font_size.intValue(), 2, 0);
                    } catch (Exception unused) {
                    }
                }
            }
            Typeface typeface = appCompatTextView.getTypeface();
            int i4 = C401132.f101954d[textValue.text_style.ordinal()];
            if (i4 == 1) {
                typeface = Typeface.create(typeface, 1);
            } else if (i4 == 2) {
                typeface = Typeface.create(typeface, 2);
            } else if (i4 == 3) {
                typeface = Typeface.create(typeface, 3);
            }
            appCompatTextView.setTypeface(typeface);
            return Bitmap.createScaledBitmap(C40102d.m159001a(appCompatTextView), i, i2, true);
        }
    }

    /* renamed from: a */
    public static CharSequence m159027a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    /* renamed from: a */
    private static Bitmap m159024a(ImageConfiguration imageConfiguration, C40114a aVar) {
        int dp2px = UIHelper.dp2px((float) imageConfiguration.property.resize_width.intValue());
        int dp2px2 = UIHelper.dp2px((float) imageConfiguration.property.resize_height.intValue());
        ImageResourceData imageResourceData = imageConfiguration.data;
        Log.m165389i("InvitationModule", "start parse -> " + imageConfiguration.toString());
        switch (C401132.f101951a[imageResourceData.type.ordinal()]) {
            case 1:
                CdnImageData cdnImageData = imageResourceData.cdn_image;
                if (cdnImageData != null) {
                    return C40102d.m159002a(aVar.mo145678a(cdnImageData.url), dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "cdnImage is null when type is DecryptedRawCdnUrl.");
                return null;
            case 2:
                RawImageData rawImageData = imageResourceData.raw_image;
                if (rawImageData != null) {
                    return m159026a(rawImageData.raw_data.toByteArray(), dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "rawImage is null when type is DecryptedRawBytes.");
                return null;
            case 3:
                ConstantKeyImageData constantKeyImageData = imageResourceData.constant_key_image;
                if (constantKeyImageData != null) {
                    return aVar.mo145675a(constantKeyImageData, dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "constantKeyImage is null when type is ConstantKey.");
                return null;
            case 4:
                TextValue textValue = imageResourceData.text;
                if (textValue != null) {
                    return aVar.mo145676a(textValue, false, dp2px, dp2px2);
                }
                Log.m165383e("InvitationModule", "textValue is null when type is RawText.");
                return null;
            case 5:
                TextValue textValue2 = imageResourceData.raw_html;
                if (textValue2 != null) {
                    return aVar.mo145676a(textValue2, true, dp2px, dp2px2);
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
    public static void m159030a(GetDynamicMediaRequest.C16236a aVar, ApiUtils.AbstractC57748a<SdkSender.C53233d<Bitmap>> aVar2) {
        m159029a(aVar, new C40114a(), aVar2);
    }

    /* renamed from: a */
    private static Bitmap m159026a(byte[] bArr, int i, int i2) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), i, i2, true);
    }

    /* renamed from: a */
    public static Bitmap m159022a(int i, int i2, int i3) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(aj.m224263a().getResources(), i), i2, i3, true);
    }

    /* renamed from: a */
    public static Bitmap m159025a(List<ImageConfiguration> list, C40114a aVar, String str) {
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
                if (imageConfiguration.is_background.booleanValue()) {
                    break;
                }
            }
            if (imageConfiguration == null) {
                Log.m165383e("InvitationModule", "bg not found.");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(UIHelper.dp2px((float) imageConfiguration.property.resize_width.intValue()), UIHelper.dp2px((float) imageConfiguration.property.resize_height.intValue()), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(0);
            if (!m159031a(canvas, imageConfiguration, aVar)) {
                String str2 = "draw bg failed -> " + imageConfiguration.data.toString();
                Log.m165383e("InvitationModule", str2);
                sb.append(str2);
                sb.append("\n");
            }
            for (ImageConfiguration imageConfiguration2 : list) {
                if (imageConfiguration2 != imageConfiguration && !m159031a(canvas, imageConfiguration2, aVar)) {
                    String str3 = "draw failed -> " + imageConfiguration2.data.toString();
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
    private static void m159028a(Canvas canvas, ImageConfiguration imageConfiguration, int i) {
        float[] fArr;
        if (C40147z.m159164d()) {
            ImageConfigurationProperty imageConfigurationProperty = imageConfiguration.property;
            int dp2px = UIHelper.dp2px((float) imageConfigurationProperty.offset_x.intValue());
            int dp2px2 = UIHelper.dp2px((float) imageConfigurationProperty.offset_y.intValue());
            int dp2px3 = UIHelper.dp2px((float) imageConfigurationProperty.resize_width.intValue());
            int dp2px4 = UIHelper.dp2px((float) imageConfigurationProperty.resize_height.intValue());
            Paint paint = new Paint(5);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) UIHelper.dp2px(1.0f));
            paint.setColor(i);
            float dp2px5 = (float) UIHelper.dp2px(2.0f);
            paint.setPathEffect(new DashPathEffect(new float[]{dp2px5, dp2px5}, BitmapDescriptorFactory.HUE_RED));
            Path path = new Path();
            RectF rectF = new RectF((float) dp2px, (float) dp2px2, (float) (dp2px + dp2px3), (float) (dp2px2 + dp2px4));
            BorderRadius borderRadius = imageConfigurationProperty.border_radius;
            if (borderRadius != null) {
                fArr = m159032a(borderRadius);
            } else {
                fArr = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* renamed from: a */
    public static void m159029a(GetDynamicMediaRequest.C16236a aVar, final C40114a aVar2, final ApiUtils.AbstractC57748a<SdkSender.C53233d<Bitmap>> aVar3) {
        final String name = aVar.f42432a.name();
        Command command = Command.GET_DYNAMIC_RESOURCE;
        InvApmUtils.GetDataCallback bVar = new InvApmUtils.GetDataCallback(new IGetDataCallback<GetDynamicMediaResponse>() {
            /* class com.ss.android.lark.inv.export.util.C40111j.C401121 */

            /* renamed from: a */
            SdkSender.C53233d<Bitmap> f101947a = new SdkSender.C53233d<>();

            /* renamed from: a */
            public void onSuccess(GetDynamicMediaResponse getDynamicMediaResponse) {
                this.f101947a.f131572a = (T) C40111j.m159025a(getDynamicMediaResponse.image_configurations, aVar2, name);
                aVar3.consume(this.f101947a);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("InvitationModule", errorResult.getDebugMsg());
                this.f101947a.f131573b = errorResult;
                aVar3.consume(this.f101947a);
            }
        }, "ug_fetch_dy_resource", C40108g.m159014a(Pair.create("biz_scene", name)));
        ProtoAdapter<GetDynamicMediaResponse> protoAdapter = GetDynamicMediaResponse.ADAPTER;
        protoAdapter.getClass();
        SdkSender.asynSendRequestNonWrap(command, aVar, bVar, new SdkSender.IParser() {
            /* class com.ss.android.lark.inv.export.util.$$Lambda$iKlXZeOZaOCpGvGA0jUb3hda0Wk */

            @Override // com.ss.android.lark.sdk.SdkSender.IParser
            public final Object parse(byte[] bArr) {
                return (GetDynamicMediaResponse) ProtoAdapter.this.decode(bArr);
            }
        });
    }

    /* renamed from: a */
    public static Bitmap m159023a(Bitmap bitmap, float[] fArr, float f, int i, boolean z) {
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
