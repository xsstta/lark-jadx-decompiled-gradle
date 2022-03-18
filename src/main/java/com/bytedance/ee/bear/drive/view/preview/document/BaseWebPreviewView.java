package com.bytedance.ee.bear.drive.view.preview.document;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.common.C6897j;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7254b;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7262d;
import com.bytedance.ee.bear.drive.view.preview.block.DriveBlockPreviewVM;
import com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.bear.drive.view.widget.DriveWebView;
import com.bytedance.ee.bear.thread.C11678b;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.AbstractC68323g;
import io.reactivex.AbstractC68324h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;

public abstract class BaseWebPreviewView extends FrameLayout implements AbstractC7254b, AbstractC7262d, AbstractC7549a {

    /* renamed from: a */
    public DriveWebView f19466a;

    /* renamed from: b */
    public Disposable f19467b;

    /* renamed from: c */
    public AbstractC7256c f19468c;

    /* renamed from: d */
    public C7555f f19469d;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView$a */
    public interface AbstractC7264a {
        String getBlockData(String str, boolean z);
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

    public DriveWebView getWebView() {
        return this.f19466a;
    }

    /* renamed from: a */
    private void mo29357a() {
        Log.i("BaseWebPreviewView", "init");
        LayoutInflater.from(getContext()).inflate(R.layout.drive_preview_webview_wrapper, this);
        this.f19466a = (DriveWebView) findViewById(R.id.drive_document_webview);
    }

    public void onDetachedFromWindow() {
        C7555f fVar = this.f19469d;
        if (fVar == null || !fVar.isBlockViewChanging()) {
            super.onDetachedFromWindow();
            Log.i("BaseWebPreviewView", "onDetachedFromWindow");
            Disposable disposable = this.f19467b;
            if (disposable != null) {
                disposable.dispose();
            }
            DriveWebView driveWebView = this.f19466a;
            if (driveWebView != null) {
                driveWebView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
                this.f19466a.clearHistory();
                ViewGroup viewGroup = (ViewGroup) this.f19466a.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.f19466a);
                }
                this.f19466a.destroy();
                this.f19466a = null;
            }
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7262d
    public void setOnShowViewTrackEventCallback(AbstractC7256c cVar) {
        this.f19468c = cVar;
    }

    public BaseWebPreviewView(Context context) {
        super(context);
        mo29357a();
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7254b
    /* renamed from: a */
    public void mo28333a(boolean z) {
        if (getWebView() != null) {
            getWebView().setCopyPermission(z);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        DriveWebView driveWebView;
        super.onWindowVisibilityChanged(i);
        if (i == 0 && (driveWebView = this.f19466a) != null) {
            driveWebView.resumeTimers();
        }
    }

    @Override // com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a
    public void onSetup(ViewOwner viewOwner) {
        this.f19469d = (C7555f) viewOwner.viewModel(C7555f.class);
        ((DriveBlockPreviewVM) viewOwner.viewModel(DriveBlockPreviewVM.class)).getLiveBlockState().mo5923a(viewOwner.lifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$BaseWebPreviewView$j3mPemiMuf_EBaU52fkOcBqm2_s */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                BaseWebPreviewView.lambda$j3mPemiMuf_EBaU52fkOcBqm2_s(BaseWebPreviewView.this, (DriveBlockPreviewVM.BlockState) obj);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m29036a(DriveBlockPreviewVM.BlockState blockState) {
        if (this.f19466a != null) {
            if (blockState == DriveBlockPreviewVM.BlockState.FULLSCREEN) {
                this.f19466a.setScrollbarFadingEnabled(true);
                this.f19466a.setVerticalScrollBarEnabled(true);
                this.f19466a.setHorizontalScrollBarEnabled(true);
                return;
            }
            this.f19466a.setScrollbarFadingEnabled(false);
            this.f19466a.setVerticalScrollBarEnabled(false);
            this.f19466a.setHorizontalScrollBarEnabled(false);
        }
    }

    public BaseWebPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo29357a();
    }

    public BaseWebPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo29357a();
    }

    /* renamed from: a */
    public AbstractC68307f<String> mo28369a(final String str, final int i, final int i2, final boolean z, final AbstractC7264a aVar) {
        if (isAttachedToWindow()) {
            return AbstractC68307f.m265080a(new AbstractC68324h<String>() {
                /* class com.bytedance.ee.bear.drive.view.preview.document.BaseWebPreviewView.C72631 */

                @Override // io.reactivex.AbstractC68324h
                public void subscribe(AbstractC68323g<String> gVar) {
                    C6897j.m27275a(str, new C6897j.AbstractC6898a(aVar) {
                        /* class com.bytedance.ee.bear.drive.view.preview.document.$$Lambda$BaseWebPreviewView$1$0CjWLrr2rWFRvVOf_inkF7m3H_Y */
                        public final /* synthetic */ BaseWebPreviewView.AbstractC7264a f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.bytedance.ee.bear.drive.common.C6897j.AbstractC6898a
                        public final void onBlockReadFile(String str) {
                            BaseWebPreviewView.C72631.lambda$0CjWLrr2rWFRvVOf_inkF7m3H_Y(AbstractC68323g.this, this.f$1, str);
                        }
                    }, i, i2, z);
                    gVar.onNext(aVar.getBlockData("", false));
                    gVar.onComplete();
                }

                /* renamed from: a */
                public static /* synthetic */ void m29040a(AbstractC68323g gVar, AbstractC7264a aVar, String str) {
                    gVar.onNext(aVar.getBlockData(str, true));
                }
            }, BackpressureStrategy.BUFFER).mo238004b(C11678b.m48479c()).mo237985a(C11678b.m48481e());
        }
        return AbstractC68307f.m265084a(new Throwable("setDataToWebViewInChunks, not attached to window. "));
    }
}
