package com.ss.android.lark.chat.preview.components.view;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.chat.preview.ChatPreviewInit;
import com.ss.android.lark.chat.preview.entity.component.property.TimeProperty;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/TimingView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "timer", "Ljava/util/concurrent/ScheduledFuture;", "endTimerTask", "", "getCurrentTimeMilllis", "", "refreshTimerTextview", "timeProperty", "Lcom/ss/android/lark/chat/preview/entity/component/property/TimeProperty;", "mainThread", "", "startTimerTask", "props", "transformTime4Second", "", "time", "Companion", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.preview.components.view.f */
public final class TimingView extends AppCompatTextView {

    /* renamed from: a */
    public static final Companion f88284a = new Companion(null);

    /* renamed from: c */
    private static final int f88285c = UIHelper.dp2px(2.0f);

    /* renamed from: b */
    private ScheduledFuture<?> f88286b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/preview/components/view/TimingView$Companion;", "", "()V", "HOUR", "", "MINUTE", "MS", "", "SECOND", "TAG", "", "TEXT_ITALIC_PADDING", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.f$b */
    public static final class RunnableC34114b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimingView f88287a;

        /* renamed from: b */
        final /* synthetic */ String f88288b;

        RunnableC34114b(TimingView fVar, String str) {
            this.f88287a = fVar;
            this.f88288b = str;
        }

        public final void run() {
            this.f88287a.setText(this.f88288b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.f$c */
    public static final class RunnableC34115c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimingView f88289a;

        /* renamed from: b */
        final /* synthetic */ String f88290b;

        RunnableC34115c(TimingView fVar, String str) {
            this.f88289a = fVar;
            this.f88290b = str;
        }

        public final void run() {
            this.f88289a.setText(this.f88290b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.preview.components.view.f$d */
    static final class RunnableC34116d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TimingView f88291a;

        /* renamed from: b */
        final /* synthetic */ TimeProperty f88292b;

        RunnableC34116d(TimingView fVar, TimeProperty timeProperty) {
            this.f88291a = fVar;
            this.f88292b = timeProperty;
        }

        public final void run() {
            TimingView.m132464a(this.f88291a, this.f88292b, false, 2, null);
        }
    }

    private final long getCurrentTimeMilllis() {
        ChatPreviewInit.IChatPreviewModuleDependency a = ChatPreviewInit.f88086a.mo126246a();
        if (a != null) {
            return ChatPreviewInit.IChatPreviewModuleDependency.C34076a.m132238a(a, 0, 1, null);
        }
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    private final void m132463a() {
        Log.m165389i("TimingView", "endTimerTask");
        ScheduledFuture<?> scheduledFuture = this.f88286b;
        if (scheduledFuture != null) {
            if (scheduledFuture == null) {
                Intrinsics.throwNpe();
            }
            boolean cancel = scheduledFuture.cancel(true);
            Log.m165389i("TimingView", "cancle:" + cancel);
            this.f88286b = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimingView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    private final String m132462a(long j) {
        long j2 = (long) 60;
        long j3 = j % j2;
        long j4 = (long) 3600;
        long j5 = (j % j4) / j2;
        long j6 = j / j4;
        if (j6 == 0) {
            StringCompanionObject mVar = StringCompanionObject.f173215a;
            Locale locale = Locale.CHINA;
            Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
            String format = String.format(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j3)}, 2));
            Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(locale, format, *args)");
            return format;
        }
        StringCompanionObject mVar2 = StringCompanionObject.f173215a;
        Locale locale2 = Locale.CHINA;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.CHINA");
        String format2 = String.format(locale2, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j3)}, 3));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    /* renamed from: a */
    public final void mo126352a(TimeProperty timeProperty) {
        if (this.f88286b == null) {
            RunnableC34116d dVar = new RunnableC34116d(this, timeProperty);
            long currentTimeMillis = System.currentTimeMillis();
            CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
            this.f88286b = coreThreadPool.getScheduleThreadPool().scheduleWithFixedDelay(dVar, (((currentTimeMillis / 1000) + 1) * 1000) - currentTimeMillis, 1000, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void mo126353a(TimeProperty timeProperty, boolean z) {
        long j;
        if (timeProperty != null) {
            long currentTimeMilllis = getCurrentTimeMilllis() / 1000;
            if (timeProperty.getStartTimeStamp() != null) {
                long j2 = 0;
                if (Intrinsics.areEqual((Object) timeProperty.isEnd(), (Object) true)) {
                    Long endTimeStamp = timeProperty.getEndTimeStamp();
                    if (endTimeStamp != null) {
                        j = endTimeStamp.longValue();
                    } else {
                        j = 0;
                    }
                    Long startTimeStamp = timeProperty.getStartTimeStamp();
                    if (startTimeStamp != null) {
                        j2 = startTimeStamp.longValue();
                    }
                    String a = m132462a(j - j2);
                    Log.m165389i("TimingView", "isEnd time = " + a);
                    if (!z) {
                        post(new RunnableC34114b(this, a));
                    } else {
                        setText(a);
                    }
                    m132463a();
                    return;
                }
                long longValue = currentTimeMilllis - timeProperty.getStartTimeStamp().longValue();
                if (longValue < 0) {
                    Log.m165383e("TimingView", "getCurrentTimeMilllis() is less than meeting start time, force to use local time instead");
                    longValue = System.currentTimeMillis() - timeProperty.getStartTimeStamp().longValue();
                }
                if (longValue < 0) {
                    Log.m165383e("TimingView", "both getCurrentTimeMilllis() and local time  are less than meeting start time, force to zero");
                } else {
                    j2 = longValue;
                }
                String a2 = m132462a(j2);
                if (!z) {
                    post(new RunnableC34115c(this, a2));
                } else {
                    setText(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m132464a(TimingView fVar, TimeProperty timeProperty, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        fVar.mo126353a(timeProperty, z);
    }
}
