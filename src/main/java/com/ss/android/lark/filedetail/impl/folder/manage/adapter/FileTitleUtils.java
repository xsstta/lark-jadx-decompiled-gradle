package com.ss.android.lark.filedetail.impl.folder.manage.adapter;

import android.content.Context;
import android.graphics.Point;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/filedetail/impl/folder/manage/adapter/FileTitleUtils;", "", "()V", "ellipsizeContent", "", "textView", "Landroid/widget/TextView;", "content", "width", "", "getLayout", "Landroid/text/StaticLayout;", "tp", "Landroid/text/TextPaint;", "cs", "", "getLineStartAndEnd", "", "Landroid/graphics/Point;", "getTimeDesc", "createTime", "", "file-detail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.filedetail.impl.folder.manage.adapter.b */
public final class FileTitleUtils {

    /* renamed from: a */
    public static final FileTitleUtils f98180a = new FileTitleUtils();

    private FileTitleUtils() {
    }

    /* renamed from: a */
    public final String mo139907a(long j) {
        LengthType lengthType;
        Date date = new Date(j * ((long) 1000));
        boolean c = C26279i.m95164c(date);
        Options aVar = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        aVar.mo191595a(id);
        aVar.mo191591a(DatePreciseness.DAY);
        if (c) {
            lengthType = LengthType.SHORT;
        } else {
            lengthType = LengthType.LONG;
        }
        aVar.mo191593a(lengthType);
        aVar.mo191592a(DisplayPattern.ABSOLUTE);
        Context context = UIHelper.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "UIHelper.getContext()");
        return TimeFormatUtils.m219289e(context, date, aVar);
    }

    /* renamed from: b */
    private final StaticLayout m150519b(TextPaint textPaint, CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    /* renamed from: a */
    private final List<Point> m150518a(TextPaint textPaint, CharSequence charSequence, int i) {
        StaticLayout staticLayout = new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
        int lineCount = staticLayout.getLineCount();
        ArrayList arrayList = new ArrayList();
        IntProgression step = RangesKt.step(RangesKt.until(0, lineCount), 1);
        int a = step.mo239399a();
        int b = step.mo239400b();
        int c = step.mo239401c();
        if (c < 0 ? a >= b : a <= b) {
            while (true) {
                arrayList.add(new Point(staticLayout.getLineStart(a), staticLayout.getLineEnd(a)));
                if (a == b) {
                    break;
                }
                a += c;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final String mo139908a(TextView textView, String str, int i) {
        int maxLines;
        int i2;
        Intrinsics.checkParameterIsNotNull(textView, "textView");
        Intrinsics.checkParameterIsNotNull(str, "content");
        if (textView.getEllipsize() != TextUtils.TruncateAt.MIDDLE || (maxLines = textView.getMaxLines()) < 2) {
            return str;
        }
        TextPaint paint = textView.getPaint();
        Intrinsics.checkExpressionValueIsNotNull(paint, "textView.paint");
        List<Point> a = m150518a(paint, str, i);
        if (a.size() <= maxLines) {
            return str;
        }
        int i3 = (maxLines - 1) / 2;
        String substring = str.substring(0, a.get(i3).y);
        Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        String substring2 = str.substring(a.get(CollectionsKt.getLastIndex(a) - ((maxLines - i3) - 1)).x);
        Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
        while (true) {
            TextPaint paint2 = textView.getPaint();
            Intrinsics.checkExpressionValueIsNotNull(paint2, "textView.paint");
            if (m150519b(paint2, substring + "..." + substring2, i).getLineCount() > maxLines) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) substring2, " ", 0, false, 6, (Object) null);
                if (indexOf$default == -1) {
                    i2 = 1;
                } else {
                    i2 = indexOf$default + 1;
                }
                if (substring2 != null) {
                    substring2 = substring2.substring(i2);
                    Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                return substring + "..." + substring2;
            }
        }
    }
}
