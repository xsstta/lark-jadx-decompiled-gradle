package com.bytedance.ee.bear.drive.view.preview.pdf.presentationview;

import com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView;
import io.reactivex.AbstractC69009q;
import io.reactivex.Observable;
import io.reactivex.android.AbstractC68262a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.a */
public final class C7421a extends Observable<PdfPresentationView.C7417a> {

    /* renamed from: a */
    private final PdfPresentationView f19988a;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.a$a */
    static final class C7422a extends AbstractC68262a implements PdfPresentationView.AbstractC7419c {

        /* renamed from: a */
        private final PdfPresentationView f19989a;

        /* renamed from: b */
        private final AbstractC69009q<? super PdfPresentationView.C7417a> f19990b;

        /* access modifiers changed from: protected */
        @Override // io.reactivex.android.AbstractC68262a
        /* renamed from: a */
        public void mo28971a() {
            this.f19989a.setFlingListener(null);
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.pdf.presentationview.PdfPresentationView.AbstractC7419c
        /* renamed from: a */
        public void mo28967a(PdfPresentationView.C7417a aVar) {
            if (!isDisposed()) {
                this.f19990b.onNext(aVar);
            }
        }

        C7422a(PdfPresentationView pdfPresentationView, AbstractC69009q<? super PdfPresentationView.C7417a> qVar) {
            this.f19989a = pdfPresentationView;
            this.f19990b = qVar;
        }
    }

    private C7421a(PdfPresentationView pdfPresentationView) {
        this.f19988a = pdfPresentationView;
    }

    /* renamed from: a */
    static Observable<PdfPresentationView.C7417a> m29698a(PdfPresentationView pdfPresentationView) {
        return new C7421a(pdfPresentationView);
    }

    /* access modifiers changed from: protected */
    @Override // io.reactivex.Observable
    public void subscribeActual(AbstractC69009q<? super PdfPresentationView.C7417a> qVar) {
        C7422a aVar = new C7422a(this.f19988a, qVar);
        qVar.onSubscribe(aVar);
        this.f19988a.setFlingListener(aVar);
    }
}
