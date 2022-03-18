package com.ss.android.lark.search.impl.func.chatinside.detail.image.view;

import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.media.MediaImageSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.view.C36592a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.impl.func.chatinside.detail.image.viewdata.ChatInsideSearchImageViewData;
import com.ss.android.lark.utils.UIHelper;

public class ChatInsideSearchImageGroup extends ConstraintLayout {

    /* renamed from: a */
    public AbstractC53521a f132208a;

    /* renamed from: b */
    public boolean f132209b;

    /* renamed from: c */
    private int f132210c;

    /* renamed from: d */
    private C36592a f132211d;

    /* renamed from: e */
    private ChatInsideSearchImageViewData f132212e;
    @BindView(6741)
    AppCompatCheckBox mCheckBox;
    @BindView(7049)
    ImageView mContentIV;
    @BindView(6997)
    ImageView mForwardIV;
    @BindView(7265)
    View mMarkView;
    @BindView(7987)
    TextView mVideoDuration;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup$a */
    public interface AbstractC53521a {
        /* renamed from: a */
        void mo182622a(View view, ImageSet imageSet);

        /* renamed from: a */
        void mo182623a(View view, ChatInsideSearchImageViewData chatInsideSearchImageViewData);

        /* renamed from: a */
        void mo182624a(ChatInsideSearchImageViewData chatInsideSearchImageViewData);

        /* renamed from: b */
        boolean mo182625b(ChatInsideSearchImageViewData chatInsideSearchImageViewData);

        /* renamed from: c */
        boolean mo182626c(ChatInsideSearchImageViewData chatInsideSearchImageViewData);
    }

    public ImageView getContentIV() {
        return this.mContentIV;
    }

    /* renamed from: a */
    public void mo182690a() {
        C36592a aVar = this.f132211d;
        if (aVar != null) {
            aVar.dismiss();
            this.f132211d = null;
        }
    }

    /* renamed from: b */
    private void m207271b() {
        ButterKnife.bind(this, LayoutInflater.from(getContext()).inflate(R.layout.view_chatinside_search_image, this));
    }

    public void setOperationCallback(AbstractC53521a aVar) {
        this.f132208a = aVar;
    }

    public ChatInsideSearchImageGroup(Context context) {
        super(context);
        m207271b();
    }

    /* renamed from: a */
    private void m207267a(ImageSet imageSet) {
        if (imageSet instanceof MediaImageSet) {
            this.mVideoDuration.setVisibility(0);
            this.mVideoDuration.setText(C26279i.m95149a((int) ((MediaImageSet) imageSet).getMediaExtra().getDuration()));
            return;
        }
        this.mVideoDuration.setVisibility(8);
    }

    /* renamed from: b */
    private void m207272b(final ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
        this.mForwardIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.View$OnClickListenerC535192 */

            public void onClick(View view) {
                ChatInsideSearchImageGroup.this.f132209b = true;
                ChatInsideSearchImageGroup.this.mo182690a();
                if (ChatInsideSearchImageGroup.this.f132208a != null) {
                    ChatInsideSearchImageGroup.this.f132208a.mo182623a(view, chatInsideSearchImageViewData);
                }
            }
        });
        this.mContentIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.View$OnClickListenerC535203 */

            public void onClick(View view) {
                if (ChatInsideSearchImageGroup.this.f132208a != null) {
                    ChatInsideSearchImageGroup.this.f132208a.mo182622a(view, chatInsideSearchImageViewData.getImageSet());
                }
            }
        });
    }

    /* renamed from: a */
    private void m207269a(final ChatInsideSearchImageViewData chatInsideSearchImageViewData) {
        if (chatInsideSearchImageViewData.isSelectStatus()) {
            this.mCheckBox.setVisibility(0);
            this.mCheckBox.setChecked(this.f132208a.mo182625b(chatInsideSearchImageViewData));
            this.mCheckBox.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.search.impl.func.chatinside.detail.image.view.ChatInsideSearchImageGroup.View$OnClickListenerC535181 */

                public void onClick(View view) {
                    ChatInsideSearchImageGroup.this.f132208a.mo182624a(chatInsideSearchImageViewData);
                }
            });
            if (chatInsideSearchImageViewData.isFromPostMessage() || !this.f132208a.mo182626c(chatInsideSearchImageViewData)) {
                this.mMarkView.setVisibility(0);
            } else {
                this.mMarkView.setVisibility(8);
            }
        } else {
            this.mCheckBox.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        String str;
        if (this.f132209b) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            this.mForwardIV.setVisibility(0);
            if (m207270a(this.mForwardIV, motionEvent)) {
                ChatInsideSearchImageViewData chatInsideSearchImageViewData = this.f132212e;
                if (chatInsideSearchImageViewData != null) {
                    if (chatInsideSearchImageViewData.isThread()) {
                        str = UIUtils.getString(getContext(), R.string.Lark_Chat_TopicImageJumpToTopic);
                    } else {
                        str = UIUtils.getString(getContext(), R.string.Lark_Legacy_JumpToChat);
                    }
                    m207266a(this.mForwardIV, str);
                }
            } else {
                mo182690a();
            }
        } else if (action == 10) {
            this.mForwardIV.setVisibility(4);
        }
        return false;
    }

    public ChatInsideSearchImageGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m207271b();
    }

    /* renamed from: a */
    private void m207266a(View view, String str) {
        if (str != null) {
            if (this.f132211d == null) {
                this.f132211d = new C36592a.C36593a().mo135002a(str).mo135003a(getContext());
            }
            this.f132211d.mo134996a(view);
        }
    }

    /* renamed from: a */
    private void m207268a(ImageSet imageSet, boolean z) {
        Image thumbnail = imageSet.getThumbnail();
        if (thumbnail == null) {
            C53258a.m205939a().mo181734a(R.drawable.chat_inside_search_image_error_holder, this.mContentIV);
        } else if (!thumbnail.getKey().contains("http") || !CollectionUtils.isNotEmpty(thumbnail.getUrls())) {
            C53258a.m205939a().mo181758g().mo181804a(getContext(), this.mContentIV, thumbnail, UIHelper.getDrawable(R.drawable.chat_inside_search_image_place_holder), UIHelper.getDrawable(R.drawable.chat_inside_search_image_error_holder), UIHelper.dp2px((float) this.f132210c), UIHelper.dp2px((float) this.f132210c), true, ImageView.ScaleType.CENTER_CROP, true, true, z);
        } else {
            ImageLoader.with(getContext()).load(thumbnail.getUrls().get(0)).override(UIHelper.dp2px((float) this.f132210c), UIHelper.dp2px((float) this.f132210c)).placeholder(R.drawable.chat_inside_search_image_place_holder).error(R.drawable.chat_inside_search_image_error_holder).centerCrop().into(this.mContentIV);
        }
        if (!DesktopUtil.m144301a(getContext())) {
            this.mForwardIV.setVisibility(8);
        }
    }

    /* renamed from: a */
    private boolean m207270a(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF((float) iArr[0], (float) iArr[1], (float) (iArr[0] + view.getWidth()), (float) (iArr[1] + view.getHeight())).contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* renamed from: a */
    public void mo182691a(ChatInsideSearchImageViewData chatInsideSearchImageViewData, boolean z) {
        if (DesktopUtil.m144301a(getContext())) {
            this.f132210c = 68;
        } else if (z) {
            this.f132210c = 90;
        } else {
            this.f132210c = 83;
        }
        this.f132212e = chatInsideSearchImageViewData;
        m207268a(chatInsideSearchImageViewData.getImageSet(), chatInsideSearchImageViewData.isThread());
        m207267a(chatInsideSearchImageViewData.getImageSet());
        m207272b(chatInsideSearchImageViewData);
        m207269a(chatInsideSearchImageViewData);
    }

    public ChatInsideSearchImageGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m207271b();
    }
}
