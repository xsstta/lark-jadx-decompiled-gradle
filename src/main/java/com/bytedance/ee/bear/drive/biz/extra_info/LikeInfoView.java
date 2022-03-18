package com.bytedance.ee.bear.drive.biz.extra_info;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.ui.ColorUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;

public class LikeInfoView extends FrameLayout {

    /* renamed from: a */
    private ImageView f17790a;

    /* renamed from: b */
    private TextView f17791b;

    /* renamed from: c */
    private LikeState f17792c;

    public enum LikeState {
        UNKNOWN(0),
        UNLIKE(1),
        LIKED(2);
        
        private final int value;

        public final int getNumber() {
            return this.value;
        }

        public static LikeState forNumber(int i) {
            if (i == 0) {
                return UNLIKE;
            }
            if (i != 1) {
                return UNKNOWN;
            }
            return LIKED;
        }

        private LikeState(int i) {
            this.value = i;
        }
    }

    public LikeState getState() {
        return this.f17792c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$1 */
    public static /* synthetic */ class C64371 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17793a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState[] r0 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.C64371.f17793a = r0
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState r1 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.LIKED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.C64371.f17793a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState r1 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.UNLIKE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.C64371.f17793a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView$LikeState r1 = com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.LikeState.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.extra_info.LikeInfoView.C64371.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo25787a() {
        if (getState() == LikeState.LIKED) {
            this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_filled);
            C13747j.m55728a(this.f17790a, (int) R.color.primary_pri_500);
            this.f17790a.setImageAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
        } else {
            this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_outlined);
            C13747j.m55728a(this.f17790a, (int) R.color.icon_n1);
            this.f17790a.setImageAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
        }
        TextView textView = this.f17791b;
        textView.setTextColor(ColorUtils.m55696a(77, textView.getCurrentTextColor()));
    }

    /* renamed from: b */
    public void mo25790b() {
        if (getState() == LikeState.LIKED) {
            this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_filled);
            C13747j.m55728a(this.f17790a, (int) R.color.primary_pri_500);
            this.f17790a.setImageAlpha(255);
        } else {
            this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_outlined);
            C13747j.m55728a(this.f17790a, (int) R.color.icon_n1);
            this.f17790a.setImageAlpha(255);
        }
        TextView textView = this.f17791b;
        textView.setTextColor(ColorUtils.m55696a(255, textView.getCurrentTextColor()));
    }

    /* renamed from: a */
    public void mo25788a(int i) {
        setLikeCount(i);
    }

    public LikeInfoView(Context context) {
        super(context);
        m25844a(context);
    }

    /* renamed from: a */
    public void mo25789a(boolean z) {
        if (z) {
            setState(LikeState.LIKED);
        } else {
            setState(LikeState.UNLIKE);
        }
    }

    /* renamed from: a */
    private void m25844a(Context context) {
        inflate(getContext(), R.layout.drive_like_item_layout, this);
        this.f17790a = (ImageView) findViewById(R.id.drive_like_item_dolike);
        this.f17791b = (TextView) findViewById(R.id.drive_like_count);
        setState(LikeState.UNKNOWN);
    }

    private void setLikeCount(int i) {
        if (i > 99) {
            this.f17791b.setText("99+");
            this.f17791b.setVisibility(0);
        } else if (i == 0) {
            this.f17791b.setVisibility(4);
        } else {
            this.f17791b.setText(String.valueOf(i));
            this.f17791b.setVisibility(0);
        }
    }

    private void setState(LikeState likeState) {
        if (this.f17790a == null) {
            C13479a.m54775e("LikeInfoView", "setState: view is invalid");
        } else if (likeState == this.f17792c) {
            C13479a.m54775e("LikeInfoView", "setState: alread is state=" + likeState);
        } else {
            C13479a.m54775e("LikeInfoView", "setState: state=" + likeState);
            this.f17792c = likeState;
            int i = C64371.f17793a[likeState.ordinal()];
            if (i == 1) {
                this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_filled);
                C13747j.m55728a(this.f17790a, (int) R.color.primary_pri_500);
                this.f17790a.setImageAlpha(255);
                this.f17791b.setTextColor(getResources().getColor(R.color.primary_pri_500));
                setBackground(getResources().getDrawable(R.drawable.drive_bg_like_count, null));
            } else if (i == 2) {
                this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_outlined);
                C13747j.m55728a(this.f17790a, (int) R.color.icon_n1);
                this.f17790a.setImageAlpha(255);
                this.f17791b.setTextColor(getResources().getColor(R.color.text_caption));
                setBackgroundColor(getResources().getColor(R.color.bg_body));
            } else if (i == 3) {
                this.f17790a.setImageResource(R.drawable.ud_icon_thumbsup_outlined);
                C13747j.m55728a(this.f17790a, (int) R.color.icon_n1);
                this.f17790a.setImageAlpha(SmActions.ACTION_ONTHECALL_ENTRY);
            }
        }
    }

    public LikeInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m25844a(context);
    }

    public LikeInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m25844a(context);
    }
}
