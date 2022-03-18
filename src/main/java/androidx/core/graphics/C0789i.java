package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.ss.ttm.player.MediaPlayer;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: androidx.core.graphics.i */
public class C0789i extends C0790j {
    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4376a(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public FontsContractCompat.C0811b mo4377a(FontsContractCompat.C0811b[] bVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4366a(Context context, FontResourcesParserCompat.C0752b bVar, Resources resources, int i) {
        int i2;
        FontResourcesParserCompat.C0753c[] a = bVar.mo4269a();
        int length = a.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                break;
            }
            FontResourcesParserCompat.C0753c cVar = a[i4];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.mo4275f()).setWeight(cVar.mo4271b());
                if (!cVar.mo4272c()) {
                    i5 = 0;
                }
                Font build = weight.setSlant(i5).setTtcIndex(cVar.mo4274e()).setFontVariationSettings(cVar.mo4273d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i4++;
        }
        if (builder == null) {
            return null;
        }
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i3)).build();
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4365a(Context context, CancellationSignal cancellationSignal, FontsContractCompat.C0811b[] bVarArr, int i) {
        int i2;
        ContentResolver contentResolver = context.getContentResolver();
        int length = bVarArr.length;
        int i3 = 0;
        FontFamily.Builder builder = null;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= length) {
                break;
            }
            FontsContractCompat.C0811b bVar = bVarArr[i4];
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(bVar.mo4412a(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.mo4414c());
                        if (!bVar.mo4415d()) {
                            i5 = 0;
                        }
                        Font build = weight.setSlant(i5).setTtcIndex(bVar.mo4413b()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                        if (openFileDescriptor == null) {
                            i4++;
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else if (openFileDescriptor == null) {
                    i4++;
                }
                openFileDescriptor.close();
            } catch (IOException unused) {
            }
            i4++;
        }
        if (builder == null) {
            return null;
        }
        if ((i & 1) != 0) {
            i2 = 700;
        } else {
            i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
        }
        if ((i & 2) != 0) {
            i3 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i2, i3)).build();
        throw th;
    }

    @Override // androidx.core.graphics.C0790j
    /* renamed from: a */
    public Typeface mo4367a(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }
}
