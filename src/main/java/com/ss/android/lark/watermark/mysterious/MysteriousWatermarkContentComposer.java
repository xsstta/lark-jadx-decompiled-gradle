package com.ss.android.lark.watermark.mysterious;

import android.content.Context;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.ttm.player.MediaPlayer;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\f\u0010\u000b\u001a\u00020\t*\u0004\u0018\u00010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkContentComposer;", "", "context", "Landroid/content/Context;", "is24Hours", "Lkotlin/Function0;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "compose", "", "inputContent", "toNullIfEmpty", "Companion", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.watermark.mysterious.a */
public final class MysteriousWatermarkContentComposer {

    /* renamed from: a */
    public static final Companion f143297a = new Companion(null);

    /* renamed from: b */
    private final Context f143298b;

    /* renamed from: c */
    private final Function0<Boolean> f143299c;

    /* renamed from: b */
    public final String mo197393b(String str) {
        return str != null ? str : "";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/watermark/mysterious/MysteriousWatermarkContentComposer$Companion;", "", "()V", "PATTERN_TIMESTAMP", "", "core_watermark_watermark_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.watermark.mysterious.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo197392a(String str) {
        String b = mo197393b(str);
        if (StringsKt.indexOf$default((CharSequence) b, "{{.timestamp}}", 0, false, 6, (Object) null) < 0) {
            return b;
        }
        Context context = this.f143298b;
        Date date = new Date();
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        aVar.mo191599b(!this.f143299c.invoke().booleanValue());
        return StringsKt.replace$default(b, "{{.timestamp}}", TimeFormatUtils.m219292g(context, date, aVar), false, 4, (Object) null);
    }

    public MysteriousWatermarkContentComposer(Context context, Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(function0, "is24Hours");
        this.f143298b = context;
        this.f143299c = function0;
    }
}
