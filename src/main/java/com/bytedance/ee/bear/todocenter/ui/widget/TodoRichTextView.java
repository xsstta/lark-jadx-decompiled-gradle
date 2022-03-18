package com.bytedance.ee.bear.todocenter.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.docshost.AbstractC5586d;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.todocenter.entity.UserEntity;
import com.bytedance.ee.bear.todocenter.model.C11697e;
import com.bytedance.ee.bear.todocenter.parser.AbsBlock;
import com.bytedance.ee.bear.todocenter.parser.AtDocumentBlock;
import com.bytedance.ee.bear.todocenter.parser.AtPersonBlock;
import com.bytedance.ee.bear.todocenter.parser.C11700a;
import com.bytedance.ee.bear.todocenter.parser.C11703b;
import com.bytedance.ee.bear.todocenter.parser.ReminderBlock;
import com.bytedance.ee.bear.todocenter.parser.p564a.C11701a;
import com.bytedance.ee.bear.todocenter.parser.p564a.C11702b;
import com.bytedance.ee.bear.todocenter.ui.entity.TodoUIEntity;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p705h.C13666a;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

public class TodoRichTextView extends EllipsizingTextView {

    /* renamed from: g */
    private static final long f31585g = TimeUnit.MILLISECONDS.convert(5, TimeUnit.DAYS);

    /* renamed from: h */
    private Disposable f31586h;

    /* renamed from: i */
    private C10917c f31587i = new C10917c(new C10929e());

    /* renamed from: j */
    private C11703b f31588j = new C11703b(new C11703b.AbstractC11706c() {
        /* class com.bytedance.ee.bear.todocenter.ui.widget.TodoRichTextView.C117501 */

        @Override // com.bytedance.ee.bear.todocenter.parser.C11703b.AbstractC11706c
        /* renamed from: a */
        public Locale mo44840a() {
            return C4484g.m18494b().mo17253d();
        }

        @Override // com.bytedance.ee.bear.todocenter.parser.C11703b.AbstractC11706c
        /* renamed from: a */
        public String mo44839a(String str) {
            UserEntity a = C11697e.m48531a().mo44811a(str);
            if (a != null) {
                return C13666a.m55443a(C4484g.m18494b().mo17253d().getLanguage(), a.name, a.en_name);
            }
            return null;
        }
    });

    /* renamed from: k */
    private TextPaint f31589k = new TextPaint(1);

    /* renamed from: l */
    private boolean f31590l;

    /* renamed from: m */
    private C11753a f31591m = new C11753a();

    /* renamed from: a */
    private static int m48712a(int i) {
        return i != 2 ? i != 3 ? i != 11 ? i != 12 ? i != 15 ? R.drawable.at_file_doc_prefix : R.drawable.at_file_slide_prefix : R.drawable.at_file_drive_prefix : R.drawable.at_file_mindnote_prefix : R.drawable.at_file_sheet_prefix : R.drawable.at_file_doc_prefix;
    }

    public void scrollBy(int i, int i2) {
    }

    public void scrollTo(int i, int i2) {
    }

    /* renamed from: b */
    private void m48717b() {
        setMovementMethod(this.f31591m);
        this.f31589k.setColor(getResources().getColor(R.color.space_kit_n900));
        this.f31589k.setStrokeWidth((float) C13655e.m55414b(1));
        this.f31589k.setAlpha(178);
    }

    public void setEnableDeleteLine(boolean z) {
        this.f31590l = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        C11753a aVar = this.f31591m;
        if (aVar != null) {
            return aVar.mo44981a();
        }
        return onTouchEvent;
    }

    public TodoRichTextView(Context context) {
        super(context);
        m48717b();
    }

    public void setRichText(TodoUIEntity todoUIEntity) {
        Disposable disposable = this.f31586h;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f31586h = AbstractC68307f.m265083a(todoUIEntity).mo238020d(new Function(todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.widget.$$Lambda$TodoRichTextView$7UvRD0eg7XqKNNyRu4UISsuTB4M */
            public final /* synthetic */ TodoUIEntity f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return TodoRichTextView.this.m48714a(this.f$1, (TodoUIEntity) obj);
            }
        }).mo238001b(new Consumer(todoUIEntity) {
            /* class com.bytedance.ee.bear.todocenter.ui.widget.$$Lambda$TodoRichTextView$nfw9ELr0D9WROVmpl91iaJISSlQ */
            public final /* synthetic */ TodoUIEntity f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TodoRichTextView.this.m48715a((TodoRichTextView) this.f$1, (TodoUIEntity) ((Spannable) obj));
            }
        }, $$Lambda$TodoRichTextView$7eTRJyyoF0vkFYFFsXOjWLyBylU.INSTANCE);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.todocenter.ui.widget.EllipsizingTextView
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f31590l) {
            for (int i = 0; i < getLineCount(); i++) {
                int lineBottom = getLayout().getLineBottom(i);
                int lineTop = getLayout().getLineTop(i);
                float strokeWidth = ((float) lineTop) + (((float) (lineBottom - lineTop)) / 2.0f) + this.f31589k.getStrokeWidth();
                canvas.drawLine(getLayout().getLineLeft(i), strokeWidth, getLayout().getLineWidth(i), strokeWidth, this.f31589k);
            }
            getLayout().getLineCount();
            getMaxLines();
        }
    }

    /* renamed from: a */
    private Spannable m48713a(TodoUIEntity todoUIEntity) throws Exception {
        int i;
        int i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        C11700a a = this.f31588j.mo44838a(todoUIEntity.content);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a.f31485a);
        AbsBlock[] absBlockArr = a.f31486b;
        for (final AbsBlock absBlock : absBlockArr) {
            if (absBlock instanceof AtPersonBlock) {
                spannableStringBuilder.setSpan(new C11702b() {
                    /* class com.bytedance.ee.bear.todocenter.ui.widget.TodoRichTextView.C117512 */

                    @Override // com.bytedance.ee.bear.todocenter.parser.p564a.C11702b
                    public void onClick(View view) {
                        C13479a.m54764b("TodoRichTextView", "clickableSpan#click() uid=" + ((AtPersonBlock) absBlock).getUid());
                        ((AbstractC5586d) KoinJavaComponent.m268610a(AbstractC5586d.class)).mo22257a(((AtPersonBlock) absBlock).getUid(), "");
                    }
                }.mo44835a(getContext().getResources().getColor(R.color.space_kit_b500)), absBlock.start, absBlock.end, 33);
            } else if (absBlock instanceof AtDocumentBlock) {
                int color = getContext().getResources().getColor(R.color.space_kit_b500);
                spannableStringBuilder.setSpan(new C11701a(getContext(), m48712a(((AtDocumentBlock) absBlock).getDocType()), C13655e.m55414b(15), C13655e.m55414b(4), color), absBlock.start, absBlock.start + 4, 33);
                spannableStringBuilder.setSpan(new C11702b() {
                    /* class com.bytedance.ee.bear.todocenter.ui.widget.TodoRichTextView.C117523 */

                    @Override // com.bytedance.ee.bear.todocenter.parser.p564a.C11702b
                    public void onClick(View view) {
                        AtDocumentBlock atDocumentBlock = (AtDocumentBlock) absBlock;
                        C13479a.m54764b("TodoRichTextView", "AtDocumentBlock#click() type=" + atDocumentBlock.getObjType() + " token=" + C13598b.m55200g(atDocumentBlock.getToken()));
                        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17292a(C6313i.m25327a().mo25382a(C8275a.m34050a(atDocumentBlock.getDocType()), atDocumentBlock.getToken(), ""));
                    }
                }.mo44835a(color), absBlock.start, absBlock.end, 18);
            } else if (absBlock instanceof ReminderBlock) {
                ReminderBlock reminderBlock = (ReminderBlock) absBlock;
                int c = C13749l.m55755c(getContext(), C11754b.m48722a(todoUIEntity.is_done, reminderBlock.getExpireTime()));
                if (!todoUIEntity.is_done) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(c), absBlock.start, absBlock.end, 33);
                } else {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(R.color.space_kit_n600)), absBlock.start, absBlock.end, 33);
                }
                Context context = getContext();
                if (reminderBlock.isShouldNotify()) {
                    i2 = 18;
                    i = R.drawable.icon_todo_alarmclock;
                } else {
                    i2 = 18;
                    i = R.drawable.icon_todo_alarmclock_dontremind;
                }
                spannableStringBuilder.setSpan(new C11701a(context, i, C13655e.m55414b(i2), C13655e.m55414b(5), c), absBlock.start, absBlock.start + 4, 33);
            }
        }
        C13479a.m54772d("TodoRichTextView", "transformText() cost time=" + (SystemClock.uptimeMillis() - uptimeMillis));
        return spannableStringBuilder;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ Spannable m48714a(TodoUIEntity todoUIEntity, TodoUIEntity todoUIEntity2) throws Exception {
        return m48713a(todoUIEntity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m48715a(TodoUIEntity todoUIEntity, Spannable spannable) throws Exception {
        if (todoUIEntity.is_done) {
            setAlpha(0.7f);
            setEnableDeleteLine(true);
        } else {
            setAlpha(1.0f);
            setEnableDeleteLine(false);
        }
        setText(spannable);
    }

    public TodoRichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48717b();
    }

    public TodoRichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48717b();
    }
}
