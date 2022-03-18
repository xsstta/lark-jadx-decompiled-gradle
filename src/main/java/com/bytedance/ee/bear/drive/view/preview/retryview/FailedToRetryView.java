package com.bytedance.ee.bear.drive.view.preview.retryview;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.drive.common.DriveNetUtils;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7555f;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

public class FailedToRetryView extends SpaceEmptyState {

    /* renamed from: a */
    public AbstractC7431a f20007a;

    /* renamed from: e */
    private C7555f f20008e;

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView$a */
    public interface AbstractC7431a {
        void onRetryClick(View view);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public FailedToRetryView mo28988a() {
        mo90952d(false);
        return this;
    }

    /* renamed from: b */
    public FailedToRetryView mo28992b() {
        mo90953e(false);
        return this;
    }

    /* renamed from: c */
    public void mo28993c() {
        setVisibility(0);
    }

    /* renamed from: g */
    private void m29722g() {
        m29718a(getContext().getString(R.string.Drive_Drive_OpenWithOtherApps), new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.retryview.$$Lambda$FailedToRetryView$g5UoSGeaHUwhEFqBfZ4URAR4v6Q */

            public final void onClick(View view) {
                FailedToRetryView.this.m29719b((FailedToRetryView) view);
            }
        });
    }

    /* renamed from: h */
    private boolean m29723h() {
        if (!C4211a.m17514a().mo16536a("ccm.drive.network_level_retry_enable", true) || !DriveNetUtils.m27237a() || DriveNetUtils.m27238b()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo28995e() {
        if (!m29723h()) {
            setDesc(getResources().getString(R.string.CreationMobile_Common_NoInternet));
            return;
        }
        Context context = getContext();
        setVisibility(0);
        m29718a(context.getString(R.string.Drive_Drive_Retry), new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.retryview.$$Lambda$FailedToRetryView$iSpZ40syXhi2YVM4bPDnN4VLtM */

            public final void onClick(View view) {
                FailedToRetryView.this.m29721c((FailedToRetryView) view);
            }
        });
        mo28992b();
    }

    /* renamed from: f */
    public void mo28996f() {
        Context context = getContext();
        setVisibility(0);
        m29722g();
        if (m29723h()) {
            m29720b(context.getString(R.string.Drive_Drive_Retry), new View.OnClickListener() {
                /* class com.bytedance.ee.bear.drive.view.preview.retryview.$$Lambda$FailedToRetryView$MHgv2GHPeSpaN2EvTjm6vBYkfRc */

                public final void onClick(View view) {
                    FailedToRetryView.this.m29716a((FailedToRetryView) view);
                }
            });
        }
    }

    /* renamed from: d */
    public void mo28994d() {
        mo28988a();
        mo28992b();
        String string = getResources().getString(R.string.CreationMobile_PDFPreview_Failed_Placeholder1);
        String string2 = getResources().getString(R.string.CreationMobile_PDFPreview_Failed_Placeholder2);
        SpannableString spannableString = new SpannableString(string + string2);
        C74303 r0 = new ClickableSpan() {
            /* class com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView.C74303 */

            public void onClick(View view) {
                if (FailedToRetryView.this.f20007a != null) {
                    C13479a.m54764b("DRIVE_PREVIEW_FLOW", "showBlockState#btn retry click");
                    FailedToRetryView.this.f20007a.onRetryClick(view);
                }
            }

            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(UIHelper.getColor(R.color.text_placeholder));
                textPaint.setUnderlineText(false);
            }
        };
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(R.color.primary_pri_500));
        spannableString.setSpan(r0, 0, spannableString.length(), 17);
        spannableString.setSpan(foregroundColorSpan, spannableString.length() - string2.length(), spannableString.length(), 17);
        setImageSize(Float.valueOf(68.0f));
        setDesc(spannableString);
        View findViewById = findViewById(R.id.desc);
        if (findViewById instanceof TextView) {
            findViewById.setTag(R.id.drive_preview_block_fun_location_tag, true);
        }
    }

    public void setPlaceHolderText(String str) {
        setDesc(str);
    }

    public void setRetryClickListener(AbstractC7431a aVar) {
        this.f20007a = aVar;
    }

    public FailedToRetryView(Context context) {
        super(context);
        mo28990a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29716a(View view) {
        if (this.f20007a != null) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", "FailedToRetryView#btn retry click");
            this.f20007a.onRetryClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m29719b(View view) {
        if (this.f20008e != null) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", "FailedToRetryView#open external");
            this.f20008e.liveInnerOpenExternal().mo5926a((Void) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m29721c(View view) {
        if (this.f20007a != null) {
            C13479a.m54764b("DRIVE_PREVIEW_FLOW", "FailedToRetryView#btn retry click");
            this.f20007a.onRetryClick(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m29717a(Boolean bool) {
        if (bool != null) {
            setPrimaryActionEnabled(bool.booleanValue());
            setSecondaryActionEnabled(bool.booleanValue());
        }
    }

    /* renamed from: a */
    public FailedToRetryView mo28989a(boolean z) {
        if (z) {
            mo28995e();
        } else {
            mo28996f();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28990a(Context context) {
        setImageSizeResource(R.dimen.space_kit_emptystate_image_size_middle);
        setImageRes(Integer.valueOf((int) R.drawable.illustration_empty_negative_load_failed));
        setDesc(context.getString(R.string.Drive_Drive_LoadingFail));
        mo28995e();
    }

    public FailedToRetryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo28990a(context);
    }

    /* renamed from: a */
    private void m29718a(String str, final View.OnClickListener onClickListener) {
        setPrimaryText(str);
        setPrimaryClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView.View$OnClickListenerC74281 */

            public void onClick(View view) {
                View.OnClickListener onClickListener;
                if (C13737d.m55693a(800) && (onClickListener = onClickListener) != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }

    /* renamed from: b */
    private void m29720b(String str, final View.OnClickListener onClickListener) {
        setSecondaryText(str);
        setSecondaryClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.drive.view.preview.retryview.FailedToRetryView.View$OnClickListenerC74292 */

            public void onClick(View view) {
                View.OnClickListener onClickListener;
                if (C13737d.m55693a(800) && (onClickListener = onClickListener) != null) {
                    onClickListener.onClick(view);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo28991a(C7555f fVar, LifecycleOwner lifecycleOwner) {
        this.f20008e = fVar;
        fVar.liveOuterNetState().mo5923a(lifecycleOwner, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.drive.view.preview.retryview.$$Lambda$FailedToRetryView$7rqbzTG7lLpGPfC6r6RYeSzTfQ */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                FailedToRetryView.this.m29717a((FailedToRetryView) ((Boolean) obj));
            }
        });
    }

    public FailedToRetryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo28990a(context);
    }
}
