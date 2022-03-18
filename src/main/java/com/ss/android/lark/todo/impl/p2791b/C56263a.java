package com.ss.android.lark.todo.impl.p2791b;

import android.content.Context;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.ttm.player.MediaPlayer;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"timeText", "", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "date", "Ljava/util/Date;", "options", "Lcom/ss/android/lark/time/format/Options;", "todoExpandTouch", "Landroid/view/View;", "pixel", "", "todo_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.b.a */
public final class C56263a {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.b.a$a */
    static final class RunnableC56264a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f139257a;

        /* renamed from: b */
        final /* synthetic */ int f139258b;

        RunnableC56264a(View view, int i) {
            this.f139257a = view;
            this.f139258b = i;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f139257a.getHitRect(rect);
            rect.top -= this.f139258b;
            rect.bottom += this.f139258b;
            rect.left -= this.f139258b;
            rect.right += this.f139258b;
            ViewParent parent = this.f139257a.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.setTouchDelegate(new TouchDelegate(rect, this.f139257a));
            }
        }
    }

    /* renamed from: a */
    public static final void m219590a(View view, int i) {
        Intrinsics.checkParameterIsNotNull(view, "$this$todoExpandTouch");
        view.post(new RunnableC56264a(view, i));
    }

    /* renamed from: a */
    public static final void m219591a(TextView textView, Context context, Date date, Options aVar) {
        Options aVar2;
        Intrinsics.checkParameterIsNotNull(textView, "$this$timeText");
        Intrinsics.checkParameterIsNotNull(date, "date");
        if (context != null) {
            if (aVar != null) {
                aVar2 = aVar;
            } else {
                aVar2 = new Options(null, null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
            }
            aVar2.mo191599b(!TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b());
            textView.setText(TimeFormatUtils.m219287d(context, date, aVar2));
        }
    }
}
