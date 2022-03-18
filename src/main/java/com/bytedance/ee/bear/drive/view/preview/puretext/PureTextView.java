package com.bytedance.ee.bear.drive.view.preview.puretext;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.C0899e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.preview.show.C6712a;
import com.bytedance.ee.bear.drive.common.C6897j;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7254b;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.puretext.PureTextView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;

public class PureTextView extends FrameLayout implements AbstractC7254b, AbstractC7549a {

    /* renamed from: a */
    public PureTextRecyclerView f19991a;

    /* renamed from: b */
    public View.OnClickListener f19992b;

    /* renamed from: c */
    public C0899e f19993c;

    /* renamed from: d */
    public boolean f19994d;

    /* renamed from: e */
    private C7427c f19995e;

    /* renamed from: f */
    private C7425b f19996f;

    /* renamed from: g */
    private Disposable f19997g;

    /* renamed from: h */
    private LinearLayoutManager f19998h;

    /* renamed from: i */
    private AbstractC7256c f19999i;

    /* renamed from: j */
    private C7555f f20000j;

    public static /* synthetic */ void lambda$Y6ezQ7mhPwCS8LK8P5UyirIDbWU(PureTextView pureTextView, ArrayList arrayList) {
        pureTextView.m29705a(arrayList);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    /* renamed from: a */
    public /* synthetic */ void mo28370a(Configuration configuration) {
        AbstractC7549a.CC.$default$a(this, configuration);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public String getCommentQuote() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public View getView() {
        return this;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public CommentRectF hideCreateComment() {
        return null;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onAreaClick() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentInputPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onCommentListPanelClose() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showSelectedComment(String str) {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void showThumbnailPreview() {
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void updateComment(ArrayList<CommentRectF> arrayList) {
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.puretext.PureTextView$c */
    public static class C7427c {

        /* renamed from: a */
        C7553d f20006a;

        /* renamed from: a */
        public C7553d mo28984a() {
            return this.f20006a;
        }

        public C7427c(C7553d dVar) {
            this.f20006a = dVar;
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.puretext.PureTextView$b */
    public class C7425b extends RecyclerView.Adapter<C7426a> {

        /* renamed from: b */
        private ArrayList<String> f20003b;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f20003b.size();
        }

        /* renamed from: a */
        public void mo28983a(ArrayList<String> arrayList) {
            this.f20003b.addAll(arrayList);
        }

        private C7425b() {
            PureTextView.this = r1;
            this.f20003b = new ArrayList<>();
        }

        /* renamed from: a */
        private /* synthetic */ boolean m29711a(View view, MotionEvent motionEvent) {
            PureTextView.this.f19993c.mo4687a(motionEvent);
            return false;
        }

        /* renamed from: com.bytedance.ee.bear.drive.view.preview.puretext.PureTextView$b$a */
        public class C7426a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public TextView f20004a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7426a(View view) {
                super(view);
                C7425b.this = r1;
                this.f20004a = (TextView) view.findViewById(R.id.pure_text_item_view);
            }
        }

        /* renamed from: a */
        public C7426a onCreateViewHolder(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.drive_preview_pure_text_item_view, viewGroup, false);
            inflate.setOnTouchListener(new View.OnTouchListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.puretext.$$Lambda$PureTextView$b$VG2jRWT1ucw_dIhZvYazJC2sS7w */

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return PureTextView.C7425b.this.m29711a((PureTextView.C7425b) view, (View) motionEvent);
                }
            });
            return new C7426a(inflate);
        }

        /* renamed from: a */
        public void onBindViewHolder(C7426a aVar, int i) {
            aVar.f20004a.setText(this.f20003b.get(i));
            aVar.f20004a.setTextIsSelectable(PureTextView.this.f19994d);
        }
    }

    public void onDetachedFromWindow() {
        C7555f fVar = this.f20000j;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            super.onDetachedFromWindow();
            Disposable disposable = this.f19997g;
            if (disposable != null) {
                disposable.dispose();
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void show() {
        C7427c cVar = this.f19995e;
        if (cVar != null && cVar.mo28984a() != null) {
            AbstractC7256c cVar2 = this.f19999i;
            if (cVar2 != null) {
                cVar2.mo26117a();
            }
            C6712a.m26463a(this.f20000j, this);
            m29703a(this.f19995e.mo28984a().mo29485e());
        }
    }

    /* renamed from: a */
    private void m29702a() {
        LayoutInflater.from(getContext()).inflate(R.layout.drive_preview_pure_text_view, this);
        this.f19991a = (PureTextRecyclerView) findViewById(R.id.pure_text_view);
        this.f19996f = new C7425b();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f19998h = linearLayoutManager;
        this.f19991a.setLayoutManager(linearLayoutManager);
        this.f19991a.setAdapter(this.f19996f);
        this.f19993c = new C0899e(getContext(), new C7424a());
        this.f19991a.setOnTouchListener(new View.OnTouchListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.puretext.$$Lambda$PureTextView$He5i17p9XOR6fQqdhL6LQ9m5WrA */

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return PureTextView.lambda$He5i17p9XOR6fQqdhL6LQ9m5WrA(PureTextView.this, view, motionEvent);
            }
        });
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.f19999i = cVar;
    }

    public void setPureTextOnClickListener(View.OnClickListener onClickListener) {
        this.f19992b = onClickListener;
    }

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.puretext.PureTextView$a */
    public class C7424a extends GestureDetector.SimpleOnGestureListener {
        private C7424a() {
            PureTextView.this = r1;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PureTextView.this.f19992b == null) {
                return true;
            }
            PureTextView.this.f19992b.onClick(PureTextView.this.f19991a);
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (PureTextView.this.f19994d) {
                super.onLongPress(motionEvent);
                return;
            }
            Toast.showFailureText(PureTextView.this.getContext(), PureTextView.this.getContext().getString(R.string.Doc_Comment_CopyFailed), 0);
        }
    }

    public PureTextView(Context context) {
        super(context);
        m29702a();
    }

    /* renamed from: a */
    public void mo28976a(C7427c cVar) {
        this.f19995e = cVar;
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
        this.f20000j = (C7555f) viewOwner.viewModel(C7555f.class);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m29704a(Throwable th) {
        C13479a.m54761a("PureTextView", th);
        AbstractC7256c cVar = this.f19999i;
        if (cVar != null) {
            cVar.mo26119a("pure_text", th);
        }
        C6712a.m26465c(this.f20000j, this);
    }

    /* renamed from: b */
    public static /* synthetic */ ArrayList m29707b(String str) {
        ArrayList arrayList = new ArrayList();
        C6897j.m27275a(str, new C6897j.AbstractC6898a(arrayList) {
            /* class com.bytedance.ee.bear.drive.view.preview.puretext.$$Lambda$_V8rjOHShvfKVKZ7nQsc5OP3EA */
            public final /* synthetic */ ArrayList f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.bear.drive.common.C6897j.AbstractC6898a
            public final void onBlockReadFile(String str) {
                this.f$0.add(str);
            }
        }, ParticipantRepo.f117150c, 2000, true);
        return arrayList;
    }

    /* renamed from: a */
    private void m29703a(String str) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("PureTextView", "showDocuments filePath is empty");
        } else {
            this.f19997g = AbstractC68307f.m265083a(str).mo238020d($$Lambda$PureTextView$lvYuXnHtZyg1l8FxEapd0PcHJl8.INSTANCE).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e()).mo238001b(new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.puretext.$$Lambda$PureTextView$Y6ezQ7mhPwCS8LK8P5UyirIDbWU */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PureTextView.lambda$Y6ezQ7mhPwCS8LK8P5UyirIDbWU(PureTextView.this, (ArrayList) obj);
                }
            }, new Consumer() {
                /* class com.bytedance.ee.bear.drive.view.preview.puretext.$$Lambda$PureTextView$Y4swXwskhNRnuiqAdzMGfWeNFeQ */

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    PureTextView.lambda$Y4swXwskhNRnuiqAdzMGfWeNFeQ(PureTextView.this, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: a */
    private /* synthetic */ void m29705a(ArrayList arrayList) {
        this.f19996f.mo28983a(arrayList);
        this.f19996f.notifyDataSetChanged();
        AbstractC7256c cVar = this.f19999i;
        if (cVar != null) {
            cVar.mo26118a("pure_text");
        }
        C6712a.m26464b(this.f20000j, this);
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7254b
    /* renamed from: a */
    public void mo28333a(boolean z) {
        this.f19994d = z;
        C7425b bVar = this.f19996f;
        if (bVar != null) {
            bVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m29706a(View view, MotionEvent motionEvent) {
        this.f19993c.mo4687a(motionEvent);
        return false;
    }

    public PureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29702a();
    }

    public PureTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29702a();
    }
}
