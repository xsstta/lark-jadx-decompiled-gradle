package com.ss.android.vc.common.widget.avatarlist;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.widget.avatarlist.C60835a;
import com.ss.android.vc.entity.Participant;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;

public class VcInfoBannerAvatarListView extends RelativeLayout {

    /* renamed from: a */
    private ImageView[] f152222a;

    /* renamed from: b */
    private TextView f152223b;

    /* renamed from: c */
    private Disposable f152224c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ boolean m236466a(Bitmap bitmap) throws Exception {
        return bitmap != null;
    }

    /* renamed from: a */
    private void m236464a() {
        LayoutInflater from = LayoutInflater.from(getContext());
        for (int i = 0; i < 5; i++) {
            LKUIRoundedImageView lKUIRoundedImageView = new LKUIRoundedImageView(getContext());
            lKUIRoundedImageView.setBackgroundResource(R.drawable.vc_banner_avatar_bg);
            lKUIRoundedImageView.setOval(true);
            lKUIRoundedImageView.setBorderWidthDP(1.0f);
            lKUIRoundedImageView.setBorderColor(C60773o.m236126d(R.color.ud_G100));
            this.f152222a[i] = lKUIRoundedImageView;
        }
        this.f152223b = (TextView) from.inflate(R.layout.vc_banner_avatar_list_num_item, (ViewGroup) null);
    }

    public VcInfoBannerAvatarListView(Context context) {
        super(context);
        this.f152222a = new ImageView[5];
        m236464a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ ObservableSource m236463a(ArrayList arrayList) throws Exception {
        if (arrayList != null) {
            return Observable.fromArray(arrayList.toArray());
        }
        return Observable.never();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Bitmap m236462a(Object obj) throws Exception {
        if (!(obj instanceof C60835a.C60840c)) {
            return null;
        }
        C60835a.C60840c cVar = (C60835a.C60840c) obj;
        return C60783v.m236225a(cVar.f152263b, cVar.f152262a, cVar.f152265d, 24, 24);
    }

    public VcInfoBannerAvatarListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f152222a = new ImageView[5];
        m236464a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m236465a(int i, List list) throws Exception {
        if (list != null) {
            int i2 = 0;
            while (i2 < i && i2 < list.size()) {
                this.f152222a[i2].setImageBitmap((Bitmap) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: a */
    public void mo208617a(String str, List<Participant> list) {
        int i;
        if (list != null && list.size() > 0) {
            removeAllViews();
            if (list.size() > 5) {
                i = 4;
            } else {
                i = list.size();
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.vc_banner_avatar_size);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.vc_banner_avatar_list_margin);
            for (int i2 = 0; i2 < i; i2++) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams.leftMargin = i2 * dimensionPixelSize2;
                addView(this.f152222a[i2], layoutParams);
            }
            if (list.size() > 5) {
                TextView textView = this.f152223b;
                textView.setText("" + list.size());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
                layoutParams2.leftMargin = dimensionPixelSize2 * i;
                addView(this.f152223b, layoutParams2);
            }
            this.f152224c = C60835a.m236488a(str, list, i).observeOn(LarkRxSchedulers.io()).flatMap($$Lambda$VcInfoBannerAvatarListView$58RnP_E4doRc6Zsuh2Ky4sk4GE.INSTANCE).map($$Lambda$VcInfoBannerAvatarListView$JizUXnt3LRojd3PoYdn9F2RazmA.INSTANCE).filter($$Lambda$VcInfoBannerAvatarListView$13KcOMKDTWgc_BDayyaKNT9qsOI.INSTANCE).toList().observeOn(LarkRxSchedulers.mainThread()).subscribe(new Consumer(i) {
                /* class com.ss.android.vc.common.widget.avatarlist.$$Lambda$VcInfoBannerAvatarListView$LTcYoTIY1XcGTEa6kS1WyAdMraU */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    VcInfoBannerAvatarListView.this.m236465a((VcInfoBannerAvatarListView) this.f$1, (int) ((List) obj));
                }
            });
        }
    }

    public VcInfoBannerAvatarListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152222a = new ImageView[5];
        m236464a();
    }
}
