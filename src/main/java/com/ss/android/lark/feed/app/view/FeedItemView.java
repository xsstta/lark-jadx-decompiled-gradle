package com.ss.android.lark.feed.app.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.avatar.v2.LarkAvatarView;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.ui.SpareLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.desktopmode.base.ContainerType;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.app.p1849b.AbstractC37305b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1871b.AbstractC38037a;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.p2932c.AbstractC58347e;
import java.util.ArrayList;
import java.util.List;

public class FeedItemView extends FrameLayout {
    private static final int AVATAR_SIZE = UIHelper.dp2px((float) C37967b.f97456a);
    private static final int BEHIND_COMPOUND_DRAWABLE_PADDING = UIHelper.dp2px(5.0f);
    private static final int BEHIND_ICON_SIZE = UIHelper.dp2px(16.0f);
    private static final int BEHIND_LEFT_PADDING = UIHelper.dp2px(16.0f);
    private static final int BOT_IV_HEIGHT = UIHelper.dp2px(16.0f);
    private static final int BOT_IV_LEFT_MARGIN = UIHelper.dp2px(6.0f);
    private static final int BOT_IV_WIDTH = UIHelper.dp2px(33.0f);
    private static final int CHAT_TAG_PADDING = UIHelper.dp2px(4.0f);
    private static final int CHAT_TAG_TV = UIHelper.dp2px(16.0f);
    private static final int CHAT_TAG_TV_LEFT_MARGIN = UIHelper.dp2px(6.0f);
    private static final int CONTAINER_HORIZONTAL_PADDING = UIHelper.dp2px(16.0f);
    private static final int CONTAINER_LEFT_MARGIN = UIHelper.dp2px((float) C37967b.f97468m);
    private static final int CUSTOM_STATUS_IV_LEFT_MARGIN = UIHelper.dp2px(8.0f);
    private static final int DEFAULT_ITEM_HEIGHT = UIHelper.dp2px((float) C37967b.f97469n);
    private static final int DEFAULT_MESSAGE_ZONE_HEIGHT = UIHelper.dp2px((float) C37967b.f97470o);
    private static final int DIVIDER_HEIGHT = UIHelper.dp2px(C37967b.f97464i);
    private static final int EMOJI_SIZE = UIHelper.dp2px(16.0f);
    private static final int FEED_CONTAINER_TOP_MARGIN = UIHelper.dp2px(1.0f);
    private static final int LAST_MESSAGE_ICON_SIZE = UIHelper.dp2px(14.0f);
    private static final int LEFT_SLIDE_BACK_VIEW_ICON_SIZE = UIHelper.dp2px(20.0f);
    private static final int MARK_IV_SIZE = UIHelper.dp2px(20.0f);
    private static final int MARK_LATER_MARGIN = UIHelper.dp2px(17.0f);
    private static final int MARK_LATTER_FLAG_SIZE = UIHelper.dp2px(10.0f);
    private static final int MINI_AVATAR_SIZE = UIHelper.dp2px(16.0f);
    private static final int ONCALL_TAG_SIZE = UIHelper.dp2px(16.0f);
    private static final int REACTION_DIVIDER_LEFT_MARGIN = UIHelper.dp2px(2.0f);
    private static final int REACTION_DIVIDER_RIGHT_MARGIN = UIHelper.dp2px(6.0f);
    private static final int REACTION_MARGIN = UIHelper.dp2px(4.0f);
    private static final int SECRET_IV_HEIGHT = UIHelper.dp2px(16.0f);
    private static final int SECRET_IV_WIDTH = UIHelper.dp2px(16.0f);
    private static final int SEND_STATUS_RIGHT_MARGIN = UIHelper.dp2px(4.0f);
    private static final int TITLE_LAYOUT_RIGHT_MARGIN = UIHelper.dp2px(16.0f);
    private static final int TV_MESSAGE_RIGHT_VIEW_LEFT_MARGIN = UIHelper.dp2px(12.0f);
    private static final int TV_MESSAGE_RIGHT_VIEW_SIZE = UIHelper.dp2px(14.0f);
    private static final int TV_MIN_HEIGHT = UIHelper.dp2px(16.0f);
    private static final int TV_RIGHT_MARGIN = UIHelper.dp2px(41.0f);
    private static boolean isMeasured;
    private static boolean isRendered;
    private static AbstractC38037a.AbstractC38047g sChatDependency = C37268c.m146766b().mo139154A();
    public LarkAvatarView mAvatarIV;
    private final int mAvatarSize;
    private final float mBadgeTextSize;
    private LKUIBadgeView mBadgeView;
    private TextView mBehindIcon;
    public RelativeLayout mBehindMarkLatterView;
    private final float mBehindTextSize;
    private RelativeLayout mBehindViewContainer;
    LinearLayout mBehindViews;
    private ImageView mBotTagIV;
    private TextView mChatNameTV;
    private TextView mChatTagTV;
    private final int mChatTagTv;
    public ImageView mCheckMarkIV;
    private ImageView mClickRegionMarkLatterFlagIV;
    private TextView mClickRegionMarkLatterTextTV;
    public ConstraintLayout mContainer;
    private int mContainerDefaultHeight;
    private final int mContainerLeftMargin;
    private int mContainerWithTeamHeight;
    private View mCurrBehindView;
    private ImageView mCustomStatusIV;
    private final int mCustomStatusIconSize;
    private final int mDefaultItemHeight;
    private final int mDefaultMessageZoneHeight;
    private ImageView mDoNotDisturbIV;
    private LinearLayout mIconAndTextLayout;
    float mLastAnimDistance;
    private TextView mLastChatTimeTV;
    private ImageView mLastMessageMarkIV;
    private ImageView mLastMessageRightView;
    private AsyncMessageView mLastMessageTextView;
    private final int mLastMsgMarkSize;
    private final int mLeftSlideBackViewIconSize;
    private final int mMarkIvBgSize;
    private final int mMarkIvSize;
    private ImageView mMarkLatterFlagIV;
    private TextView mMarkTV;
    private LarkAvatarView mMarkTipIV;
    private FrameLayout mMarkTipIVContainer;
    private LinearLayout mMessageZone;
    private final int mMiniAvatarSize;
    private SpareLayout mNameLayout;
    private ImageView mOnCallTagIV;
    private AbstractC58347e mOnShowMenuListener;
    private Animation mRotateAnimation;
    private int mScreenWidth;
    private ImageView mSecretTagIV;
    private int mTeamNameHeight;
    private TextView mTeamNameTV;
    private final float mTextSizeInfo;
    private final float mTextSizeMessage;
    private final float mTextSizeTitle;
    public LKUIRoundedImageView2 mThreadIconIV;
    private FrameLayout mTitleLayout;
    public RelativeLayout mToppingContainer;
    private ImageView mToppingFlagIv;
    private TextView mToppingTextTv;
    private TextView reactionCountTV;
    private ImageView reactionDivider;
    private List<FeedReactionView> reactions;

    public FrameLayout getMarkTipIVContainer() {
        createMarkTip();
        return this.mMarkTipIVContainer;
    }

    public LarkAvatarView getMarkTipIv() {
        createMarkTip();
        return this.mMarkTipIV;
    }

    public boolean showContextMenu() {
        showContextMenuInternal(this, -1.0f, -1.0f);
        return true;
    }

    private void initLeftSlideBehindView() {
        if (this.mBehindMarkLatterView == null) {
            initMarkLatterView();
        }
        if (this.mToppingContainer == null) {
            initToppingView();
        }
    }

    private void initView() {
        setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        setId(R.id.feed_item_container);
        initContainerContent();
        initHover();
    }

    private boolean needUpdateViewWidth() {
        if (this.mScreenWidth != getContext().getResources().getDisplayMetrics().widthPixels) {
            return true;
        }
        return false;
    }

    private void updateMessageZoneLayoutWithTeamName() {
        LinearLayout linearLayout = this.mMessageZone;
        if (linearLayout != null) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.f2817i = R.id.team_name;
            int i = DIVIDER_HEIGHT;
            layoutParams.topMargin = i + i;
            layoutParams.f2829u = i;
            this.mMessageZone.setLayoutParams(layoutParams);
        }
    }

    public void initChildView() {
        createChatName();
        createBageView();
        createMarkTip();
        createCustomStatusIfNeed();
        createChatTagIfNeed();
        createMark();
        createLastChatTime();
        createChatLastMessage();
        createLastMessageRightView();
    }

    /* access modifiers changed from: package-private */
    public void initSwipeView() {
        if (this.mBehindViewContainer == null) {
            initBehindViewContainer();
        }
        initLeftSlideBehindView();
        if (this.mBehindViews == null) {
            initBehindLayout();
        }
    }

    public void updateLastMessageTvView() {
        this.mLastMessageTextView.mo138842a(getLastMessageViewWidth(this.mMessageZone.getLayoutParams().width));
    }

    private void createBotTag() {
        if (this.mBotTagIV == null) {
            ImageView imageView = new ImageView(getContext());
            this.mBotTagIV = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.mBotTagIV.setImageResource(2131231470);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(BOT_IV_WIDTH, BOT_IV_HEIGHT);
            layoutParams.leftMargin = BOT_IV_LEFT_MARGIN;
            layoutParams.gravity = 16;
            this.mNameLayout.addView(this.mBotTagIV, layoutParams);
        }
    }

    private void createCustomStatusIfNeed() {
        if (this.mCustomStatusIV == null) {
            this.mCustomStatusIV = new ImageView(getContext());
            int i = this.mCustomStatusIconSize;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.leftMargin = CUSTOM_STATUS_IV_LEFT_MARGIN;
            layoutParams.gravity = 16;
            this.mCustomStatusIV.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.mNameLayout.addView(this.mCustomStatusIV, layoutParams);
        }
    }

    private void createLastMessageMark() {
        LinearLayout.LayoutParams layoutParams;
        if (this.mLastMessageMarkIV == null) {
            ImageView imageView = new ImageView(getContext());
            this.mLastMessageMarkIV = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (DesktopUtil.m144307b()) {
                int i = LAST_MESSAGE_ICON_SIZE;
                layoutParams = new LinearLayout.LayoutParams(i, i);
            } else {
                int i2 = this.mLastMsgMarkSize;
                layoutParams = new LinearLayout.LayoutParams(i2, i2);
            }
            layoutParams.gravity = 16;
            layoutParams.rightMargin = SEND_STATUS_RIGHT_MARGIN;
            this.mMessageZone.addView(this.mLastMessageMarkIV, 0, layoutParams);
        }
    }

    private void createLastMessageRightView() {
        if (this.mLastMessageRightView == null) {
            this.mLastMessageRightView = new ImageView(getContext());
            int i = TV_MESSAGE_RIGHT_VIEW_SIZE;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.gravity = 16;
            layoutParams.rightMargin = TV_RIGHT_MARGIN;
            layoutParams.leftMargin = TV_MESSAGE_RIGHT_VIEW_LEFT_MARGIN;
            LinearLayout linearLayout = this.mMessageZone;
            linearLayout.addView(this.mLastMessageRightView, linearLayout.getChildCount(), layoutParams);
        }
    }

    private void createReactionDivider() {
        if (this.reactionDivider == null) {
            ImageView imageView = new ImageView(getContext());
            this.reactionDivider = imageView;
            imageView.setImageResource(R.drawable.vertical_divier_1dp);
            this.reactionDivider.setBackgroundColor(UDColorUtils.getColor(getContext(), R.color.line_divider_default));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.rightMargin = REACTION_DIVIDER_RIGHT_MARGIN;
            layoutParams.leftMargin = REACTION_DIVIDER_LEFT_MARGIN;
            this.mMessageZone.addView(this.reactionDivider, 0, layoutParams);
        }
    }

    private void createSecretTag() {
        if (this.mSecretTagIV == null) {
            ImageView imageView = new ImageView(getContext());
            this.mSecretTagIV = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.mSecretTagIV.setImageResource(R.drawable.icon_secret_chat);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(SECRET_IV_WIDTH, SECRET_IV_HEIGHT);
            layoutParams.leftMargin = BOT_IV_LEFT_MARGIN;
            layoutParams.gravity = 16;
            this.mNameLayout.addView(this.mSecretTagIV, layoutParams);
        }
    }

    private void initBehindViewContainer() {
        int i;
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.mBehindViewContainer = relativeLayout;
        relativeLayout.setLayoutDirection(1);
        if (DesktopUtil.m144307b()) {
            i = DEFAULT_ITEM_HEIGHT;
        } else {
            i = this.mDefaultItemHeight;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
        ConstraintLayout constraintLayout = this.mContainer;
        if (!(constraintLayout == null || (layoutParams = constraintLayout.getLayoutParams()) == null)) {
            layoutParams2.height = layoutParams.height;
        }
        addView(this.mBehindViewContainer, 0, layoutParams2);
    }

    private void createBageView() {
        float f;
        ConstraintLayout.LayoutParams layoutParams;
        if (this.mBadgeView == null) {
            LKUIBadgeView lKUIBadgeView = new LKUIBadgeView(getContext());
            this.mBadgeView = lKUIBadgeView;
            lKUIBadgeView.setId(R.id.badge);
            LKUIBadgeView lKUIBadgeView2 = this.mBadgeView;
            if (DesktopUtil.m144307b()) {
                f = C37967b.f97461f;
            } else {
                f = this.mBadgeTextSize;
            }
            lKUIBadgeView2.mo89316a(f);
            if (!DesktopUtil.m144301a(C37268c.m146766b().mo139170a())) {
                layoutParams = new ConstraintLayout.LayoutParams(-2, UIHelper.dp2px(C37967b.f97463h));
                layoutParams.f2822n = this.mAvatarSize / 2;
            } else {
                layoutParams = new ConstraintLayout.LayoutParams(UIHelper.dp2px(C37967b.f97463h), UIHelper.dp2px(C37967b.f97463h));
                layoutParams.f2822n = AVATAR_SIZE / 2;
            }
            layoutParams.f2821m = R.id.avatar;
            layoutParams.f2823o = 45.0f;
            this.mContainer.addView(this.mBadgeView, layoutParams);
        }
    }

    private void createChatName() {
        if (this.mChatNameTV == null) {
            this.mChatNameTV = new TextView(getContext());
            if (DesktopUtil.m144307b()) {
                this.mChatNameTV.setTextSize(C37967b.f97474s);
            } else {
                this.mChatNameTV.setTextSize(0, this.mTextSizeTitle);
            }
            this.mChatNameTV.setTextColor(UDColorUtils.getColor(getContext(), R.color.text_title));
            this.mChatNameTV.setEllipsize(TextUtils.TruncateAt.END);
            this.mChatNameTV.setContentDescription("UITest");
            this.mChatNameTV.setSingleLine(true);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.mNameLayout.addView(this.mChatNameTV, 0, layoutParams);
        }
    }

    private void createChatTagIfNeed() {
        int i;
        if (this.mChatTagTV == null) {
            TextView textView = new TextView(getContext());
            this.mChatTagTV = textView;
            textView.setTextSize(12.0f);
            TextView textView2 = this.mChatTagTV;
            int i2 = CHAT_TAG_PADDING;
            textView2.setPadding(i2, 0, i2, 0);
            this.mChatTagTV.setSingleLine(true);
            if (DesktopUtil.m144307b()) {
                i = CHAT_TAG_TV;
            } else {
                i = -2;
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, i);
            this.mChatTagTV.setId(R.id.chat_tag);
            layoutParams.leftMargin = CHAT_TAG_TV_LEFT_MARGIN;
            layoutParams.gravity = 16;
            this.mNameLayout.addView(this.mChatTagTV, layoutParams);
        }
    }

    private void createLastChatTime() {
        if (this.mLastChatTimeTV == null) {
            TextView textView = new TextView(getContext());
            this.mLastChatTimeTV = textView;
            textView.setId(R.id.txtChatLastTime);
            if (DesktopUtil.m144307b()) {
                this.mLastChatTimeTV.setTextSize(14.0f);
            } else {
                this.mLastChatTimeTV.setTextSize(0, this.mTextSizeInfo);
            }
            this.mLastChatTimeTV.setTextColor(UDColorUtils.getColor(getContext(), R.color.text_placeholder));
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = CONTAINER_HORIZONTAL_PADDING;
            layoutParams.bottomMargin = DIVIDER_HEIGHT;
            layoutParams.f2815g = R.id.container;
            layoutParams.f2816h = R.id.title_layout;
            layoutParams.f2819k = R.id.title_layout;
            this.mContainer.addView(this.mLastChatTimeTV, layoutParams);
        }
    }

    private void createMark() {
        if (this.mMarkTV == null) {
            this.mMarkTV = new TextView(getContext());
            if (DesktopUtil.m144307b()) {
                this.mMarkTV.setTextSize(C37967b.f97475t);
            } else {
                this.mMarkTV.setTextSize(0, this.mTextSizeMessage);
            }
            this.mMarkTV.setSingleLine(true);
            this.mMarkTV.setEllipsize(TextUtils.TruncateAt.END);
            this.mMarkTV.setGravity(16);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            this.mMessageZone.addView(this.mMarkTV, 0, layoutParams);
        }
    }

    private void createMarkTip() {
        if (this.mMarkTipIVContainer == null) {
            this.mMarkTipIVContainer = new FrameLayout(getContext());
            int i = this.mMarkIvBgSize;
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i, i);
            layoutParams.f2817i = R.id.txtChatLastTime;
            layoutParams.f2815g = R.id.txtChatLastTime;
            layoutParams.topMargin = FEED_CONTAINER_TOP_MARGIN;
            this.mContainer.addView(this.mMarkTipIVContainer, layoutParams);
        }
        if (this.mMarkTipIV == null) {
            AdvanceAvatarView advanceAvatarView = new AdvanceAvatarView(getContext());
            this.mMarkTipIV = advanceAvatarView;
            advanceAvatarView.setId(R.id.at_avatar);
            this.mMarkTipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.mMarkTipIV.setBackgroundResource(R.drawable.avatar_bg);
            this.mMarkTipIV.setOval(true);
            int i2 = this.mMarkIvSize;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i2);
            layoutParams2.gravity = 17;
            this.mMarkTipIVContainer.addView(this.mMarkTipIV, layoutParams2);
        }
    }

    private void createReactionCount() {
        if (this.reactionCountTV == null) {
            TextView textView = new TextView(getContext());
            this.reactionCountTV = textView;
            textView.setGravity(17);
            this.reactionCountTV.setTextSize(2, 11.0f);
            this.reactionCountTV.setTextColor(UIUtils.getColor(getContext(), R.color.lkui_N600));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, UIHelper.dp2px(18.0f));
            layoutParams.gravity = 16;
            layoutParams.rightMargin = REACTION_MARGIN;
            this.mMessageZone.addView(this.reactionCountTV, 0, layoutParams);
        }
    }

    private void createTeamName() {
        if (this.mTeamNameTV == null) {
            TextView textView = new TextView(getContext());
            this.mTeamNameTV = textView;
            textView.setId(R.id.team_name);
            if (DesktopUtil.m144307b()) {
                this.mTeamNameTV.setTextSize(C37967b.f97475t);
            } else {
                this.mTeamNameTV.setTextSize(0, this.mTextSizeMessage);
            }
            this.mTeamNameTV.setTextColor(UDColorUtils.getColor(getContext(), R.color.text_title));
            this.mTeamNameTV.setEllipsize(TextUtils.TruncateAt.END);
            this.mTeamNameTV.setContentDescription("UITest");
            this.mTeamNameTV.setSingleLine(true);
            this.mTeamNameTV.setIncludeFontPadding(false);
            this.mTeamNameTV.setGravity(8388627);
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, this.mTeamNameHeight);
            layoutParams.f2825q = R.id.title_layout;
            layoutParams.f2827s = R.id.title_layout;
            layoutParams.f2817i = R.id.guideline_horizontal;
            layoutParams.topMargin = DIVIDER_HEIGHT;
            this.mContainer.addView(this.mTeamNameTV, layoutParams);
            updateMessageZoneLayoutWithTeamName();
        }
    }

    private void initContainerContent() {
        int i;
        int i2;
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        this.mContainer = constraintLayout;
        constraintLayout.setId(R.id.container);
        this.mContainer.setPadding(CONTAINER_HORIZONTAL_PADDING, 0, 0, 0);
        this.mContainer.setBackgroundResource(R.drawable.feed_item_selector_bg);
        if (DesktopUtil.m144307b()) {
            i = DEFAULT_ITEM_HEIGHT;
        } else {
            i = this.mDefaultItemHeight;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
        addView(this.mContainer, layoutParams);
        int i3 = layoutParams.height;
        this.mContainerDefaultHeight = i3;
        if (DesktopUtil.m144307b()) {
            i2 = DEFAULT_MESSAGE_ZONE_HEIGHT;
        } else {
            i2 = this.mDefaultMessageZoneHeight;
        }
        this.mTeamNameHeight = i2;
        this.mContainerWithTeamHeight = i2 + i3;
        initDefaultGuideline(this.mContainer, i3);
        initAvatar(this.mContainer);
        initGuideLine(this.mContainer, i3);
        initTitleLayout(this.mContainer);
        initMessageZone(this.mContainer);
        initChildView();
    }

    private void initHover() {
        if (DesktopUtil.m144301a(getContext())) {
            this.mCheckMarkIV = new ImageView(getContext());
            ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
            layoutParams.rightMargin = CONTAINER_HORIZONTAL_PADDING;
            layoutParams.bottomMargin = DIVIDER_HEIGHT;
            layoutParams.f2815g = R.id.container;
            layoutParams.f2816h = 0;
            layoutParams.f2819k = 0;
            this.mContainer.addView(this.mCheckMarkIV, layoutParams);
            this.mCheckMarkIV.setVisibility(8);
            this.mCheckMarkIV.setImageDrawable(UIHelper.getDrawable(R.drawable.feed_check_mark_selector));
        }
    }

    private void createChatLastMessage() {
        int i;
        if (this.mLastMessageTextView == null) {
            if (C37713d.f96672b) {
                this.mLastMessageTextView = new AdvanceLastMessageView(getContext());
            } else {
                AdvanceLastMessageView2 advanceLastMessageView2 = new AdvanceLastMessageView2(getContext());
                this.mLastMessageTextView = advanceLastMessageView2;
                advanceLastMessageView2.setLineHeight(DEFAULT_MESSAGE_ZONE_HEIGHT);
            }
            if (DesktopUtil.m144307b()) {
                this.mLastMessageTextView.setTextSize(C37967b.f97475t);
            } else {
                this.mLastMessageTextView.setTextSize(0, LKUIDisplayManager.m91864a(getContext(), (int) C37967b.f97475t));
            }
            this.mLastMessageTextView.setMaxLines(1);
            this.mLastMessageTextView.setSingleLine();
            this.mLastMessageTextView.setGravity(16);
            this.mLastMessageTextView.setMinHeight(TV_MIN_HEIGHT);
            this.mLastMessageTextView.setEllipsize(TextUtils.TruncateAt.END);
            this.mLastMessageTextView.setTextColor(UDColorUtils.getColor(getContext(), R.color.text_placeholder));
            this.mLastMessageTextView.setIncludeFontPadding(true);
            if (DesktopUtil.m144307b()) {
                i = DEFAULT_MESSAGE_ZONE_HEIGHT;
            } else {
                i = -2;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 16;
            this.mMessageZone.addView(this.mLastMessageTextView, this.mMessageZone.getChildCount(), layoutParams);
        }
    }

    private void initBehindLayout() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mBehindViews = linearLayout;
        linearLayout.setBackgroundColor(C37967b.f97471p);
        this.mBehindViews.setOrientation(0);
        TextView textView = new TextView(getContext());
        this.mBehindIcon = textView;
        textView.setText(UIHelper.getString(R.string.Lark_Legacy_PickerDone));
        this.mBehindIcon.setTextColor(C37967b.f97473r);
        if (DesktopUtil.m144307b()) {
            this.mBehindIcon.setTextSize((float) C37967b.f97465j);
        } else {
            this.mBehindIcon.setTextSize(0, this.mBehindTextSize);
        }
        this.mBehindIcon.setGravity(16);
        this.mBehindIcon.setCompoundDrawablePadding(BEHIND_COMPOUND_DRAWABLE_PADDING);
        Drawable drawable = UIHelper.getDrawable(R.drawable.ud_icon_done_outlined);
        drawable.mutate();
        drawable.setTint(ContextCompat.getColor(getContext(), R.color.static_white));
        int i = BEHIND_ICON_SIZE;
        drawable.setBounds(0, 0, i, i);
        this.mBehindIcon.setCompoundDrawables(drawable, null, null, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        this.mBehindViews.addView(this.mBehindIcon, layoutParams);
        this.mBehindViewContainer.addView(this.mBehindViews, 0, new ConstraintLayout.LayoutParams(-1, -1));
    }

    private void initMarkLatterView() {
        int i;
        this.mBehindMarkLatterView = new RelativeLayout(getContext());
        this.mClickRegionMarkLatterFlagIV = new ImageView(getContext());
        if (DesktopUtil.m144307b()) {
            i = LEFT_SLIDE_BACK_VIEW_ICON_SIZE;
        } else {
            i = this.mLeftSlideBackViewIconSize;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, UIHelper.dp2px(5.0f), 0);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ud_icon_later_outlined);
        drawable.mutate();
        drawable.setTint(ContextCompat.getColor(getContext(), R.color.static_white));
        this.mClickRegionMarkLatterFlagIV.setImageDrawable(drawable);
        this.mClickRegionMarkLatterTextTV = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.mClickRegionMarkLatterTextTV.setText(UIHelper.getString(R.string.Lark_Legacy_MarkForLater));
        layoutParams2.gravity = 16;
        if (DesktopUtil.m144307b()) {
            this.mClickRegionMarkLatterTextTV.setTextSize((float) C37967b.f97467l);
        } else {
            C25649b.m91856a(this.mClickRegionMarkLatterTextTV, C37967b.f97467l);
        }
        this.mClickRegionMarkLatterTextTV.setTextColor(-1);
        this.mClickRegionMarkLatterTextTV.setMaxLines(3);
        this.mClickRegionMarkLatterTextTV.setMaxWidth(UIUtils.dp2px(getContext(), 130.0f));
        this.mClickRegionMarkLatterTextTV.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mIconAndTextLayout = linearLayout;
        linearLayout.setOrientation(0);
        this.mIconAndTextLayout.addView(this.mClickRegionMarkLatterFlagIV, layoutParams);
        this.mIconAndTextLayout.addView(this.mClickRegionMarkLatterTextTV, layoutParams2);
        this.mBehindMarkLatterView.addView(this.mIconAndTextLayout, new RelativeLayout.LayoutParams(-2, -2));
        this.mBehindMarkLatterView.setGravity(17);
        this.mBehindMarkLatterView.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.mBehindMarkLatterView.getMeasuredWidth() + (UIHelper.dp2px(16.0f) * 2), -1);
        layoutParams3.addRule(11);
        this.mBehindMarkLatterView.setId(R.id.id_process_later);
        this.mBehindMarkLatterView.setZ(1.0f);
        this.mBehindViewContainer.addView(this.mBehindMarkLatterView, layoutParams3);
    }

    private void initToppingView() {
        int i;
        this.mToppingContainer = new RelativeLayout(getContext());
        this.mToppingFlagIv = new ImageView(getContext());
        if (DesktopUtil.m144307b()) {
            i = LEFT_SLIDE_BACK_VIEW_ICON_SIZE;
        } else {
            i = this.mLeftSlideBackViewIconSize;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(new LinearLayout.LayoutParams(i, i));
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, UIHelper.dp2px(5.0f), 0);
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ud_icon_set_top_outlined);
        drawable.mutate();
        drawable.setTint(ContextCompat.getColor(getContext(), R.color.static_white));
        this.mToppingFlagIv.setImageDrawable(drawable);
        this.mToppingTextTv = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        this.mToppingTextTv.setText(UIHelper.getString(R.string.Lark_Chat_FeedClickTipsPin));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mToppingTextTv.measure(makeMeasureSpec, makeMeasureSpec);
        layoutParams2.gravity = 16;
        if (DesktopUtil.m144307b()) {
            this.mToppingTextTv.setTextSize((float) C37967b.f97467l);
        } else {
            C25649b.m91856a(this.mToppingTextTv, C37967b.f97467l);
        }
        this.mToppingTextTv.setTextColor(-1);
        this.mToppingTextTv.setMaxLines(3);
        this.mToppingTextTv.setMaxWidth(UIUtils.dp2px(getContext(), 130.0f));
        this.mToppingTextTv.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(this.mToppingFlagIv, layoutParams);
        linearLayout.addView(this.mToppingTextTv, layoutParams2);
        this.mToppingContainer.addView(linearLayout, new RelativeLayout.LayoutParams(-2, -2));
        this.mToppingContainer.setGravity(17);
        this.mToppingContainer.measure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.mToppingContainer.getMeasuredWidth() + (UIHelper.dp2px(16.0f) * 2), -1);
        layoutParams3.addRule(0, R.id.id_process_later);
        this.mToppingContainer.setBackgroundResource(R.color.primary_pri_500);
        this.mToppingContainer.setZ(BitmapDescriptorFactory.HUE_RED);
        this.mBehindViewContainer.addView(this.mToppingContainer, layoutParams3);
    }

    public void setOnShowMenuListener(AbstractC58347e eVar) {
        this.mOnShowMenuListener = eVar;
    }

    public FeedItemView(Context context) {
        this(context, null);
    }

    public void setClickRegionMarkLatterText(String str) {
        this.mClickRegionMarkLatterTextTV.setText(str);
    }

    public boolean showContextMenuForChild(View view) {
        showContextMenuInternal(view, -1.0f, -1.0f);
        return true;
    }

    public void setBotTag(int i) {
        if (i == 0) {
            createBotTag();
        }
        ImageView imageView = this.mBotTagIV;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public void setSecretTagIV(int i) {
        if (i == 0) {
            createSecretTag();
        }
        ImageView imageView = this.mSecretTagIV;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    private void updateAllContainerHeight(boolean z) {
        int i;
        if (z) {
            i = this.mContainerWithTeamHeight;
        } else {
            i = this.mContainerDefaultHeight;
        }
        if (i != 0) {
            updateContainerViewHeight(this.mContainer, i);
            updateContainerViewHeight(this.mBehindViewContainer, i);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!isRendered) {
            isRendered = true;
            C37268c.m146766b().mo139195n().mo139358d("first_feed_render", "first_feed_render");
        }
    }

    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 9) {
            setHovered(true);
        } else if (motionEvent.getAction() == 10) {
            setHovered(false);
        }
        return false;
    }

    public void setClickRegionMarkLatterFlag(int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        drawable.mutate();
        drawable.setTint(ContextCompat.getColor(getContext(), R.color.static_white));
        this.mClickRegionMarkLatterFlagIV.setImageDrawable(drawable);
    }

    public void setCustomStatus(String str) {
        createCustomStatusIfNeed();
        if (str != null) {
            C52977a.m205190a().mo180997b(this.mCustomStatusIV, str);
            this.mCustomStatusIV.setVisibility(0);
            return;
        }
        this.mCustomStatusIV.setVisibility(8);
    }

    public void setToppingFlag(int i) {
        Drawable drawable = ContextCompat.getDrawable(getContext(), i);
        drawable.mutate();
        drawable.setTint(ContextCompat.getColor(getContext(), R.color.static_white));
        this.mToppingFlagIv.setImageDrawable(drawable);
    }

    private void initAvatar(ConstraintLayout constraintLayout) {
        int i;
        AdvanceAvatarView advanceAvatarView = new AdvanceAvatarView(getContext());
        this.mAvatarIV = advanceAvatarView;
        advanceAvatarView.setId(R.id.avatar);
        this.mAvatarIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (DesktopUtil.m144307b()) {
            i = AVATAR_SIZE;
        } else {
            i = this.mAvatarSize;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i, i);
        layoutParams.f2819k = R.id.container_default_height_line;
        layoutParams.f2816h = R.id.container;
        layoutParams.f2812d = R.id.container;
        constraintLayout.addView(this.mAvatarIV, layoutParams);
    }

    private void swipeLeftAnim(float f) {
        if (f <= 1.0f && f >= BitmapDescriptorFactory.HUE_RED) {
            float f2 = 1.0f - f;
            float width = ((float) (this.mBehindMarkLatterView.getWidth() + this.mToppingContainer.getLayoutParams().width)) * f2;
            float f3 = ((float) this.mBehindMarkLatterView.getLayoutParams().width) * f2;
            this.mLastAnimDistance = f3;
            this.mBehindMarkLatterView.setTranslationX(f3);
            this.mToppingContainer.setTranslationX(width);
        }
    }

    public void setToppingText(String str) {
        if (str != null && !str.equals(this.mToppingTextTv.getText())) {
            int measuredWidth = this.mToppingTextTv.getMeasuredWidth();
            this.mToppingTextTv.setText(str);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.mToppingTextTv.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredWidth2 = this.mToppingTextTv.getMeasuredWidth() - measuredWidth;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mToppingContainer.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width += measuredWidth2;
            }
        }
    }

    public void setZenModeIV(int i) {
        if (this.mDoNotDisturbIV == null) {
            ImageView imageView = new ImageView(getContext());
            this.mDoNotDisturbIV = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.mDoNotDisturbIV.setImageResource(R.drawable.icon_do_not_disturb_tag);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(SECRET_IV_WIDTH, SECRET_IV_HEIGHT);
            layoutParams.leftMargin = CHAT_TAG_TV_LEFT_MARGIN;
            layoutParams.gravity = 16;
            this.mNameLayout.addView(this.mDoNotDisturbIV, layoutParams);
        }
        this.mDoNotDisturbIV.setVisibility(i);
    }

    private int getLastMessageViewWidth(int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.mMessageZone.getChildCount(); i4++) {
            View childAt = this.mMessageZone.getChildAt(i4);
            if (childAt.getVisibility() == 0 && childAt != this.mLastMessageTextView) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE));
                i3 += childAt.getMeasuredWidth();
            }
        }
        int i5 = TV_RIGHT_MARGIN;
        if (this.mMarkTipIVContainer.getVisibility() == 0 || this.mLastMessageRightView.getVisibility() != 0) {
            i2 = i5;
        }
        return (i - i3) - i2;
    }

    private void initMessageZone(ConstraintLayout constraintLayout) {
        int i;
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.mMessageZone = linearLayout;
        linearLayout.setId(R.id.message_zone);
        this.mMessageZone.setGravity(16);
        this.mMessageZone.setOrientation(0);
        if (DesktopUtil.m144307b()) {
            i = CONTAINER_LEFT_MARGIN;
        } else {
            i = this.mContainerLeftMargin;
        }
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams((this.mScreenWidth - i) - (CONTAINER_HORIZONTAL_PADDING * 2), -2);
        layoutParams.f2812d = R.id.title_layout;
        if (this.mTeamNameTV == null) {
            layoutParams.f2817i = R.id.guideline_horizontal;
            layoutParams.topMargin = DIVIDER_HEIGHT;
        } else {
            layoutParams.f2817i = R.id.team_name;
            int i2 = DIVIDER_HEIGHT;
            layoutParams.topMargin = i2 + i2;
            layoutParams.f2829u = i2;
        }
        constraintLayout.addView(this.mMessageZone, layoutParams);
    }

    private void initTitleLayout(ConstraintLayout constraintLayout) {
        int i;
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.mTitleLayout = frameLayout;
        frameLayout.setId(R.id.title_layout);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(0, -2);
        layoutParams.f2787E = 1.0f;
        if (DesktopUtil.m144307b()) {
            i = CONTAINER_LEFT_MARGIN;
        } else {
            i = this.mContainerLeftMargin;
        }
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = TITLE_LAYOUT_RIGHT_MARGIN;
        layoutParams.bottomMargin = DIVIDER_HEIGHT;
        layoutParams.f2826r = R.id.txtChatLastTime;
        layoutParams.f2825q = R.id.avatar;
        layoutParams.f2818j = R.id.guideline_horizontal;
        this.mNameLayout = new SpareLayout(getContext());
        this.mTitleLayout.addView(this.mNameLayout, new FrameLayout.LayoutParams(-2, -2));
        constraintLayout.addView(this.mTitleLayout, layoutParams);
    }

    public void onHoverChanged(boolean z) {
        int i;
        super.onHoverChanged(z);
        this.mContainer.setHovered(z);
        View view = this.mCurrBehindView;
        int i2 = 0;
        if (view != null) {
            view.setBackgroundColor(0);
        }
        RelativeLayout relativeLayout = this.mBehindMarkLatterView;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(UIHelper.getColor(R.color.ud_Y500));
        }
        ImageView imageView = this.mCheckMarkIV;
        if (imageView != null && imageView.isEnabled()) {
            if (z) {
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.mCheckMarkIV.getLayoutParams();
                layoutParams.rightMargin = CONTAINER_HORIZONTAL_PADDING;
                layoutParams.bottomMargin = DIVIDER_HEIGHT;
                layoutParams.f2815g = R.id.container;
                LarkAvatarView larkAvatarView = this.mMarkTipIV;
                if (larkAvatarView == null || larkAvatarView.getVisibility() != 0) {
                    layoutParams.f2816h = 0;
                    layoutParams.f2819k = 0;
                } else {
                    layoutParams.f2816h = R.id.title_layout;
                    layoutParams.f2819k = R.id.title_layout;
                }
                this.mCheckMarkIV.setLayoutParams(layoutParams);
            }
            ImageView imageView2 = this.mCheckMarkIV;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView2.setVisibility(i);
            TextView textView = this.mLastChatTimeTV;
            if (z) {
                i2 = 4;
            }
            textView.setVisibility(i2);
        }
    }

    public void setLatterMarkFlagVisibility(int i) {
        if (i == 0) {
            if (this.mMarkLatterFlagIV == null) {
                this.mMarkLatterFlagIV = new ImageView(getContext());
                Drawable drawable = UIHelper.getDrawable(R.drawable.ud_icon_later_filled);
                drawable.mutate();
                drawable.setTint(UIHelper.getColor(R.color.ud_Y500));
                this.mMarkLatterFlagIV.setImageDrawable(drawable);
                int i2 = MARK_LATTER_FLAG_SIZE;
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(i2, i2);
                layoutParams.f2815g = R.id.container;
                layoutParams.f2816h = R.id.container;
                layoutParams.rightMargin = MARK_LATER_MARGIN;
                this.mContainer.addView(this.mMarkLatterFlagIV, layoutParams);
            }
            this.mMarkLatterFlagIV.setVisibility(0);
            return;
        }
        ImageView imageView = this.mMarkLatterFlagIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public void setThreadIconVisibility(int i) {
        ConstraintLayout.LayoutParams layoutParams;
        int i2;
        if (i == 0) {
            if (this.mThreadIconIV == null) {
                LKUIRoundedImageView2 lKUIRoundedImageView2 = new LKUIRoundedImageView2(getContext());
                this.mThreadIconIV = lKUIRoundedImageView2;
                lKUIRoundedImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.mThreadIconIV.setBackgroundResource(R.drawable.ic_feed_hash_tag);
                this.mThreadIconIV.setOval(true);
                if (DesktopUtil.m144307b()) {
                    int i3 = MINI_AVATAR_SIZE;
                    layoutParams = new ConstraintLayout.LayoutParams(i3, i3);
                } else {
                    int i4 = this.mMiniAvatarSize;
                    layoutParams = new ConstraintLayout.LayoutParams(i4, i4);
                }
                layoutParams.f2821m = R.id.avatar;
                layoutParams.f2823o = 135.0f;
                if (DesktopUtil.m144307b()) {
                    i2 = AVATAR_SIZE;
                } else {
                    i2 = this.mAvatarSize;
                }
                layoutParams.f2822n = i2 / 2;
                this.mContainer.addView(this.mThreadIconIV, layoutParams);
            }
            this.mThreadIconIV.setVisibility(i);
            return;
        }
        LKUIRoundedImageView2 lKUIRoundedImageView22 = this.mThreadIconIV;
        if (lKUIRoundedImageView22 != null) {
            lKUIRoundedImageView22.setVisibility(i);
        }
    }

    public void setLastMessageMark(int i, int i2) {
        setLastMessageMark(i, i2, false);
    }

    public FeedItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean showContextMenu(float f, float f2) {
        showContextMenuInternal(this, f, f2);
        return true;
    }

    private void initDefaultGuideline(ConstraintLayout constraintLayout, int i) {
        Guideline guideline = new Guideline(getContext());
        guideline.setId(R.id.container_default_height_line);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2801S = 0;
        layoutParams.f2809a = i;
        constraintLayout.addView(guideline, layoutParams);
    }

    private void initGuideLine(ConstraintLayout constraintLayout, int i) {
        Guideline guideline = new Guideline(getContext());
        guideline.setId(R.id.guideline_horizontal);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.f2801S = 0;
        layoutParams.f2809a = i / 2;
        constraintLayout.addView(guideline, layoutParams);
    }

    private static void updateContainerViewHeight(View view, int i) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.height != i) {
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    public void setChatName(int i, String str) {
        if (i == 0) {
            createChatName();
            this.mChatNameTV.setVisibility(0);
            this.mChatNameTV.setText(str);
            return;
        }
        TextView textView = this.mChatNameTV;
        if (textView != null) {
            textView.setVisibility(i);
        }
    }

    public void setLastChatTime(int i, String str) {
        if (i == 0) {
            createLastChatTime();
            this.mLastChatTimeTV.setVisibility(i);
            this.mLastChatTimeTV.setText(str);
            return;
        }
        TextView textView = this.mLastChatTimeTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void setTeamName(int i, String str) {
        if (i == 0) {
            createTeamName();
            this.mTeamNameTV.setVisibility(0);
            this.mTeamNameTV.setText(str);
            updateAllContainerHeight(true);
            return;
        }
        TextView textView = this.mTeamNameTV;
        if (textView != null) {
            textView.setVisibility(i);
            updateAllContainerHeight(false);
        }
    }

    public void doSwipeRightBehindViewsAnim(float f, int i) {
        if (this.mBehindViewContainer == null) {
            initBehindViewContainer();
        }
        if (this.mBehindViews == null) {
            initBehindLayout();
        }
        float width = (float) (this.mBehindIcon.getWidth() + (BEHIND_LEFT_PADDING * 2));
        float f2 = f / width;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        float width2 = ((width - ((float) this.mBehindIcon.getWidth())) / 2.0f) + (f - width);
        if (width2 < BitmapDescriptorFactory.HUE_RED) {
            width2 = BitmapDescriptorFactory.HUE_RED;
        }
        setBehindViewsForSwipeRight(0, f2, i, width2);
    }

    public void setFeedTagTV(boolean z, Drawable drawable) {
        int i;
        if (z) {
            createChatTagIfNeed();
            this.mChatTagTV.setBackground(drawable);
        }
        TextView textView = this.mChatTagTV;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void setLastMessageRightView(int i, Drawable drawable) {
        if (i == 0) {
            createLastMessageRightView();
            this.mLastMessageRightView.setBackground(drawable);
            if (this.mMarkTipIVContainer.getVisibility() == 0 && this.mMarkTipIV.getVisibility() == 0) {
                ((LinearLayout.LayoutParams) this.mLastMessageRightView.getLayoutParams()).rightMargin = TV_RIGHT_MARGIN;
            } else {
                ((LinearLayout.LayoutParams) this.mLastMessageRightView.getLayoutParams()).rightMargin = 0;
            }
        }
        this.mLastMessageRightView.setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (!isMeasured) {
            isMeasured = true;
            C37268c.m146766b().mo139195n().mo139357c("first_feed_render", "first_feed_render");
        }
        if (needUpdateViewWidth()) {
            this.mScreenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
            if (DesktopUtil.m144307b()) {
                i3 = CONTAINER_LEFT_MARGIN;
            } else {
                i3 = this.mContainerLeftMargin;
            }
            int i4 = (this.mScreenWidth - i3) - (CONTAINER_HORIZONTAL_PADDING * 2);
            this.mMessageZone.getLayoutParams().width = i4;
            this.mLastMessageTextView.mo138842a(getLastMessageViewWidth(i4));
        }
        super.onMeasure(i, i2);
    }

    public void setFeedTagTV(boolean z, LarkNameTag dVar) {
        int i;
        if (z) {
            createChatTagIfNeed();
            this.mChatTagTV.setBackground(dVar.mo90006b());
        }
        TextView textView = this.mChatTagTV;
        if (textView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
        }
    }

    public void setOnCallTagIV(int i, boolean z) {
        if (this.mOnCallTagIV == null) {
            this.mOnCallTagIV = new ImageView(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(UIHelper.dp2px(16.0f), UIHelper.dp2px(16.0f));
            layoutParams.leftMargin = CHAT_TAG_TV_LEFT_MARGIN;
            layoutParams.gravity = 16;
            this.mNameLayout.addView(this.mOnCallTagIV, layoutParams);
            if (z) {
                this.mOnCallTagIV.setImageDrawable(getResources().getDrawable(R.drawable.ic_oncall_offline));
            } else {
                this.mOnCallTagIV.setImageDrawable(getResources().getDrawable(R.drawable.ic_oncall));
            }
        }
        this.mOnCallTagIV.setVisibility(i);
    }

    private void showContextMenuInternal(View view, float f, float f2) {
        AbstractC58347e eVar = this.mOnShowMenuListener;
        if (eVar != null) {
            eVar.mo137287a(view, f, f2);
        }
    }

    public void setLastMessageMark(int i, int i2, boolean z) {
        setLastMessageMarkImpl(i, i2, null, false, z);
    }

    public boolean showContextMenuForChild(View view, float f, float f2) {
        showContextMenuInternal(view, f, f2);
        return true;
    }

    public void setLastMessageMarkWithTint(int i, int i2, int i3) {
        setLastMessageMarkImpl(i, -1, UDIconUtils.getIconDrawable(getContext(), i2, UDColorUtils.getColor(getContext(), i3)), true, false);
    }

    public void setMarkTv(int i, int i2, String str) {
        if (i == 0) {
            createMark();
            this.mMarkTV.setText(str);
            this.mMarkTV.setTextColor(i2);
            this.mMarkTV.setVisibility(i);
            return;
        }
        TextView textView = this.mMarkTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public FeedItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int c = LKUIDisplayManager.m91881c(getContext(), C37967b.f97456a);
        this.mAvatarSize = c;
        this.mDefaultItemHeight = (DEFAULT_ITEM_HEIGHT + c) - UIHelper.dp2px((float) C37967b.f97456a);
        this.mTextSizeTitle = LKUIDisplayManager.m91864a(getContext(), (int) C37967b.f97474s);
        this.mTextSizeMessage = LKUIDisplayManager.m91864a(getContext(), (int) C37967b.f97475t);
        this.mContainerLeftMargin = (CONTAINER_LEFT_MARGIN + c) - UIHelper.dp2px((float) C37967b.f97456a);
        this.mMarkIvSize = LKUIDisplayManager.m91881c(getContext(), 20);
        this.mMarkIvBgSize = LKUIDisplayManager.m91881c(getContext(), 24);
        this.mCustomStatusIconSize = LKUIDisplayManager.m91881c(getContext(), C37967b.f97466k);
        this.mChatTagTv = LKUIDisplayManager.m91881c(getContext(), 16);
        this.mDefaultMessageZoneHeight = LKUIDisplayManager.m91881c(getContext(), C37967b.f97470o);
        this.mTextSizeInfo = LKUIDisplayManager.m91864a(getContext(), 14);
        this.mBehindTextSize = LKUIDisplayManager.m91864a(getContext(), C37967b.f97465j);
        this.mLeftSlideBackViewIconSize = LKUIDisplayManager.m91881c(getContext(), 16);
        this.mBadgeTextSize = LKUIDisplayManager.m91862a((int) C37967b.f97461f);
        this.mMiniAvatarSize = LKUIDisplayManager.m91881c(getContext(), 16);
        this.mLastMsgMarkSize = LKUIDisplayManager.m91881c(getContext(), 16);
        this.mLastAnimDistance = BitmapDescriptorFactory.HUE_RED;
        this.reactions = new ArrayList();
        setWillNotDraw(false);
        if (DesktopUtil.m144301a(context)) {
            this.mScreenWidth = UIHelper.getWindowWidth(C37268c.m146766b().mo139170a(), ContainerType.Left);
        } else {
            this.mScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        }
        initView();
    }

    public void setLastMessageTv(int i, String str, boolean z, boolean z2) {
        setLastMessageTv(i, C37967b.f97460e, str, z, z2);
    }

    public void setFeedTagTV(int i, int i2, int i3, int i4) {
        createChatTagIfNeed();
        TextView textView = this.mChatTagTV;
        if (textView != null) {
            textView.setVisibility(i);
        }
        if (i == 0) {
            this.mChatTagTV.setText(i2);
            this.mChatTagTV.setBackgroundResource(i3);
            this.mChatTagTV.setTextColor(i4);
        }
    }

    public void setBadge(int i, String str, int i2, int i3) {
        if (i == 0) {
            createBageView();
            this.mBadgeView.mo89318a((Drawable) null);
            this.mBadgeView.mo89323b((Drawable) null);
            this.mBadgeView.setVisibility(0);
            if (i2 != 0) {
                this.mBadgeView.mo89317a(i2);
            }
            this.mBadgeView.mo89319a(str).mo89322b(i3).mo89320a();
            return;
        }
        LKUIBadgeView lKUIBadgeView = this.mBadgeView;
        if (lKUIBadgeView != null) {
            lKUIBadgeView.setVisibility(8);
        }
    }

    public void setBadge(int i, String str, Drawable drawable, Drawable drawable2) {
        if (i == 0) {
            createBageView();
            this.mBadgeView.setVisibility(0);
            this.mBadgeView.mo89318a(drawable);
            this.mBadgeView.mo89323b(drawable2);
            this.mBadgeView.mo89319a(str).mo89320a();
            return;
        }
        LKUIBadgeView lKUIBadgeView = this.mBadgeView;
        if (lKUIBadgeView != null) {
            lKUIBadgeView.setVisibility(8);
        }
    }

    public void setBehindViewsForSwipeLeft(int i, int i2, boolean z, float f) {
        if (i == 0) {
            if (this.mBehindViewContainer == null) {
                initBehindViewContainer();
            }
            if (this.mBehindMarkLatterView == null) {
                initLeftSlideBehindView();
            }
            if (this.mCurrBehindView != this.mBehindMarkLatterView) {
                this.mBehindViewContainer.removeAllViews();
                this.mBehindViewContainer.addView(this.mBehindMarkLatterView);
                this.mBehindViewContainer.addView(this.mToppingContainer);
                this.mCurrBehindView = this.mBehindMarkLatterView;
            }
            int i3 = 0;
            this.mBehindMarkLatterView.setVisibility(0);
            RelativeLayout relativeLayout = this.mToppingContainer;
            if (!z) {
                i3 = 8;
            }
            relativeLayout.setVisibility(i3);
            this.mBehindMarkLatterView.setBackgroundColor(i2);
            if (f > 0.8f) {
                f = 1.0f;
            }
            swipeLeftAnim(f);
        }
    }

    public void setBehindViewsForSwipeRight(int i, float f, int i2, float f2) {
        if (i == 0) {
            if (this.mBehindViewContainer == null) {
                initBehindViewContainer();
            }
            if (this.mBehindViews == null) {
                initBehindLayout();
            }
            if (this.mCurrBehindView != this.mBehindViews) {
                this.mBehindViewContainer.removeAllViews();
                this.mBehindViewContainer.addView(this.mBehindViews);
                this.mCurrBehindView = this.mBehindViews;
            }
            this.mBehindViews.setVisibility(i);
            this.mBehindViews.setBackgroundColor(i2);
            this.mBehindIcon.setTranslationX(f2);
            if (f < 0.2f) {
                this.mBehindIcon.setVisibility(8);
            } else {
                this.mBehindIcon.setVisibility(0);
            }
            this.mBehindIcon.setScaleX(f);
            this.mBehindIcon.setScaleY(f);
            return;
        }
        LinearLayout linearLayout = this.mBehindViews;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    public void setReactions(List<Reaction> list, int i, int i2, AbstractC37305b bVar) {
        int i3;
        boolean z;
        int i4;
        int i5 = 8;
        if (!CollectionUtils.isEmpty(list)) {
            createReactionDivider();
            createReactionCount();
            int max = (int) Math.max(((((float) this.mMessageZone.getMeasuredWidth()) - this.reactionCountTV.getPaint().measureText("...")) / ((float) (UIHelper.dp2px(18.0f) + REACTION_MARGIN))) - 1.0f, 7.0f);
            int size = list.size();
            if (i > 0) {
                i3 = Math.min(i, size);
            } else {
                i3 = size;
            }
            int min = Math.min(i3, max);
            if (size > min) {
                this.reactionCountTV.setVisibility(0);
                this.reactionCountTV.setText("...");
            } else {
                this.reactionCountTV.setVisibility(8);
            }
            ImageView imageView = this.reactionDivider;
            if (min != max) {
                i5 = 0;
            }
            imageView.setVisibility(i5);
            if (min < this.reactions.size()) {
                while (this.reactions.size() > min) {
                    FeedReactionView remove = this.reactions.remove(0);
                    this.mMessageZone.removeView(remove);
                    bVar.mo137129a(FeedReactionView.class, remove);
                }
            } else {
                for (int size2 = this.reactions.size(); size2 < min; size2++) {
                    FeedReactionView feedReactionView = (FeedReactionView) bVar.mo137128a(FeedReactionView.class, getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    layoutParams.rightMargin = REACTION_MARGIN;
                    this.mMessageZone.addView(feedReactionView, 0, layoutParams);
                    this.reactions.add(0, feedReactionView);
                }
            }
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            for (int i6 = 0; i6 < min; i6++) {
                FeedReactionView feedReactionView2 = this.reactions.get(i6);
                Reaction reaction = list.get(i6);
                feedReactionView2.setVisibility(0);
                if (z) {
                    i4 = reaction.getCount();
                } else {
                    i4 = 0;
                }
                feedReactionView2.setReactionCount(i4);
                sChatDependency.mo139238a(feedReactionView2.getIconIV(), reaction.getType());
            }
            return;
        }
        ImageView imageView2 = this.reactionDivider;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        TextView textView = this.reactionCountTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
        for (FeedReactionView feedReactionView3 : this.reactions) {
            feedReactionView3.setVisibility(8);
        }
    }

    public void setLastMessageTv(int i, int i2, String str, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            i = 8;
        }
        this.mLastMessageTextView.setVisibility(i);
        if (i != 8) {
            this.mLastMessageTextView.mo138843a(str, getLastMessageViewWidth(this.mMessageZone.getLayoutParams().width), z, z2);
        }
    }

    private void setLastMessageMarkImpl(int i, int i2, Drawable drawable, boolean z, boolean z2) {
        if (i == 0) {
            createLastMessageMark();
            if (z2) {
                if (this.mRotateAnimation == null) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.rotate);
                    this.mRotateAnimation = loadAnimation;
                    loadAnimation.setInterpolator(new LinearInterpolator());
                    this.mRotateAnimation.setRepeatCount(-1);
                    this.mRotateAnimation.setRepeatMode(1);
                }
                this.mLastMessageMarkIV.startAnimation(this.mRotateAnimation);
            } else {
                this.mLastMessageMarkIV.clearAnimation();
            }
            this.mLastMessageMarkIV.setVisibility(i);
            if (z) {
                this.mLastMessageMarkIV.setImageDrawable(drawable);
            } else {
                this.mLastMessageMarkIV.setImageResource(i2);
            }
        } else {
            ImageView imageView = this.mLastMessageMarkIV;
            if (imageView != null) {
                imageView.clearAnimation();
                this.mLastMessageMarkIV.setVisibility(i);
            }
        }
    }
}
