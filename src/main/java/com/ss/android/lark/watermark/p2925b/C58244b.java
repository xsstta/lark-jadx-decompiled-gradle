package com.ss.android.lark.watermark.p2925b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LruCache;
import com.larksuite.framework.utils.C26308n;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.watermark.dto.WatermarkInfo;
import com.ss.android.lark.watermark.p2924a.AbstractC58221a;
import com.ss.android.lark.watermark.p2929f.AbstractC58289c;
import com.ss.android.lark.watermark.p2929f.C58286a;
import com.ss.android.lark.watermark.p2929f.C58287b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.ss.android.lark.watermark.b.b */
public class C58244b {

    /* renamed from: a */
    private LruCache<Integer, Bitmap> f143217a = new LruCache<>(3);

    /* renamed from: b */
    private AbstractC58221a f143218b;

    /* renamed from: a */
    public void mo197295a(AbstractC58221a aVar) {
        this.f143218b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo197291a(Context context) {
        String str = C26308n.m95257c(context) + "/avatar/";
        C26311p.m95289i(str);
        return str;
    }

    /* renamed from: a */
    public boolean mo197296a(Context context, String str) {
        return !TextUtils.isEmpty(m225924b(context, str));
    }

    /* renamed from: b */
    private String m225924b(Context context, String str) {
        String str2 = mo197291a(context) + str;
        if (C26311p.m95290j(str2)) {
            return str2;
        }
        return "";
    }

    /* renamed from: c */
    private void m225925c(Context context, WatermarkInfo watermarkInfo, AbstractC58289c<Drawable> cVar) {
        if (!mo197296a(context, watermarkInfo.getWatermarkTag())) {
            mo197297b(context, watermarkInfo, cVar);
        } else {
            m225926d(context, watermarkInfo, cVar);
        }
    }

    /* renamed from: a */
    public void mo197292a(Context context, WatermarkInfo watermarkInfo, AbstractC58289c<Drawable> cVar) {
        Bitmap bitmap = this.f143217a.get(Integer.valueOf(watermarkInfo.hashCode()));
        if (bitmap != null) {
            BitmapDrawable a = C58247c.m225943a(context, bitmap);
            Log.m165389i("WatermarkCreater", "watermark drawable from cache. watermark tag: " + watermarkInfo.getWatermarkTag());
            if (cVar != null) {
                cVar.mo197242a(a);
                return;
            }
        }
        m225925c(context, watermarkInfo, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo197297b(Context context, WatermarkInfo watermarkInfo, AbstractC58289c<Drawable> cVar) {
        String watermarkContent = watermarkInfo.getWatermarkContent();
        int color = UIUtils.getColor(context, watermarkInfo.getBgColor());
        float alpha = watermarkInfo.getAlpha();
        String watermarkTag = watermarkInfo.getWatermarkTag();
        if (watermarkContent.length() < 5) {
            watermarkContent = watermarkContent + "      ";
        }
        Bitmap a = C58247c.m225939a(context, watermarkContent, 14, color, alpha);
        BitmapDrawable a2 = C58247c.m225943a(context, a);
        this.f143217a.put(Integer.valueOf(watermarkInfo.hashCode()), a);
        if (cVar != null) {
            Log.m165389i("WatermarkCreater", "watermark drawable created! watermark tag: " + watermarkInfo.getWatermarkTag());
            cVar.mo197242a(a2);
        }
        mo197293a(context, watermarkInfo, watermarkTag, a);
    }

    /* renamed from: d */
    private void m225926d(Context context, WatermarkInfo watermarkInfo, AbstractC58289c<Drawable> cVar) {
        try {
            String b = m225924b(context, watermarkInfo.getWatermarkTag());
            if (!TextUtils.isEmpty(b)) {
                FileInputStream fileInputStream = new FileInputStream(b);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                if (decodeStream != null) {
                    BitmapDrawable a = C58247c.m225943a(context, decodeStream);
                    this.f143217a.put(Integer.valueOf(watermarkInfo.hashCode()), decodeStream);
                    if (cVar != null) {
                        Log.m165389i("WatermarkCreater", "watermark drawable from disk. watermark tag: " + watermarkInfo.getWatermarkTag());
                        cVar.mo197242a(a);
                    }
                    fileInputStream.close();
                } else if (cVar != null) {
                    cVar.mo197241a(new C58286a("watermark bitmap parse fail. watermark tag: " + watermarkInfo.getWatermarkTag()));
                }
            } else if (cVar != null) {
                cVar.mo197241a(new C58286a("watermark file path null"));
            }
        } catch (IOException e) {
            Log.m165383e("WatermarkCreater", "watermark get from disk fail: " + e.getMessage() + " watermark tag: " + watermarkInfo.getWatermarkTag());
            if (cVar != null) {
                cVar.mo197241a(new C58286a(e.getMessage()));
            }
        }
    }

    /* renamed from: a */
    public void mo197294a(Context context, String str, AbstractC58289c<File> cVar) {
        File file = new File(str);
        AbstractC58221a aVar = this.f143218b;
        if (aVar == null) {
            Log.m165389i("WatermarkCreater", "watermark bitmap compressor is not ready, use origin file");
            cVar.mo197242a(file);
            return;
        }
        aVar.mo197247a(context, file, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo197293a(final Context context, final WatermarkInfo watermarkInfo, String str, Bitmap bitmap) {
        C58287b.m226017a(bitmap, new File(mo197291a(context) + str), new C58287b.AbstractC58288a() {
            /* class com.ss.android.lark.watermark.p2925b.C58244b.C582451 */

            @Override // com.ss.android.lark.watermark.p2929f.C58287b.AbstractC58288a
            /* renamed from: a */
            public void mo197298a(String str) {
                Log.m165389i("WatermarkCreater", "watermark file saved! watermark tag: " + watermarkInfo.getWatermarkTag());
                C58244b.this.mo197294a(context, str, new AbstractC58289c<File>() {
                    /* class com.ss.android.lark.watermark.p2925b.C58244b.C582451.C582461 */

                    /* renamed from: a */
                    public void mo197242a(File file) {
                        Log.m165389i("WatermarkCreater", "watermark file compressed! watermark tag: " + watermarkInfo.getWatermarkTag());
                    }

                    @Override // com.ss.android.lark.watermark.p2929f.AbstractC58289c
                    /* renamed from: a */
                    public void mo197241a(C58286a aVar) {
                        Log.m165383e("WatermarkCreater", "watermark compress fail: " + aVar.mo197385b() + " watermark tag: " + watermarkInfo.getWatermarkTag());
                    }
                });
            }

            @Override // com.ss.android.lark.watermark.p2929f.C58287b.AbstractC58288a
            /* renamed from: a */
            public void mo197299a(Throwable th) {
                Log.m165383e("WatermarkCreater", "watermark file save fail:" + th.getMessage() + " watermark tag: " + watermarkInfo.getWatermarkTag());
            }
        });
    }
}
