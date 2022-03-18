package com.bytedance.ee.bear.bitable.managerpanel;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.util.io.NonProguard;
import com.chad.library.adapter.base.entity.AbstractC20928a;
import com.chad.library.adapter.base.entity.AbstractC20930c;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0005\"#$%&B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fJ\b\u0010!\u001a\u00020\u0019H\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006'"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "activeTableIndex", "", "getActiveTableIndex", "()Ljava/lang/Integer;", "setActiveTableIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "bottomFixedData", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BottomFixedData;", "getBottomFixedData", "()Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BottomFixedData;", "setBottomFixedData", "(Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BottomFixedData;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BlockBean;", "getData", "()[Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BlockBean;", "setData", "([Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BlockBean;)V", "[Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BlockBean;", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "convert2MultiItemEntities", "", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "toString", "BlockBean", "BottomFixedData", "Companion", "MenuAction", "ViewBean", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BitableManagerPanelData implements NonProguard {
    public static final Companion Companion = new Companion(null);
    private Integer activeTableIndex;
    private BottomFixedData bottomFixedData;
    private BlockBean[] data;
    private String title;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$MenuAction;", "", "Companion", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MenuAction {
        public static final Companion Companion = Companion.f14072a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$MenuAction$Companion;", "", "()V", "ADD_VIEW", "", "MORE", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData$MenuAction$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f14072a = new Companion();

            private Companion() {
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BlockBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Lcom/chad/library/adapter/base/entity/AbstractExpandableItem;", "Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$ViewBean;", "()V", "actions", "", "", "getActions", "()[Ljava/lang/String;", "setActions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "active", "", "getActive", "()Z", "setActive", "(Z)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "text", "getText", "setText", ShareHitPoint.f121869d, "getType", "setType", "views", "getViews", "()[Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$ViewBean;", "setViews", "([Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$ViewBean;)V", "[Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$ViewBean;", "getItemType", "", "getLevel", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class BlockBean extends AbstractC20928a<ViewBean> implements NonProguard, AbstractC20930c {
        private String[] actions;
        private boolean active;
        private String id;
        private String text;
        private String type;
        private ViewBean[] views;

        @Override // com.chad.library.adapter.base.entity.AbstractC20930c
        public int getItemType() {
            return 1;
        }

        @Override // com.chad.library.adapter.base.entity.AbstractC20929b
        public int getLevel() {
            return 0;
        }

        public final String[] getActions() {
            return this.actions;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final ViewBean[] getViews() {
            return this.views;
        }

        public final void setActions(String[] strArr) {
            this.actions = strArr;
        }

        public final void setActive(boolean z) {
            this.active = z;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }

        public final void setViews(ViewBean[] viewBeanArr) {
            this.views = viewBeanArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$BottomFixedData;", "Lcom/bytedance/ee/util/io/NonProguard;", "()V", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "text", "getText", "setText", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class BottomFixedData implements NonProguard {
        private String id;
        private String text;

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setText(String str) {
            this.text = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010 \u001a\u00020!H\u0016R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$ViewBean;", "Lcom/bytedance/ee/util/io/NonProguard;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "()V", "actions", "", "", "getActions", "()[Ljava/lang/String;", "setActions", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "active", "", "getActive", "()Z", "setActive", "(Z)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "parentTableId", "getParentTableId", "setParentTableId", "text", "getText", "setText", ShareHitPoint.f121869d, "getType", "setType", "getItemType", "", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class ViewBean implements NonProguard, AbstractC20930c {
        private String[] actions;
        private boolean active;
        private String id;
        private String parentTableId;
        private String text;
        private String type;

        @Override // com.chad.library.adapter.base.entity.AbstractC20930c
        public int getItemType() {
            return 2;
        }

        public final String[] getActions() {
            return this.actions;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final String getId() {
            return this.id;
        }

        public final String getParentTableId() {
            return this.parentTableId;
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final void setActions(String[] strArr) {
            this.actions = strArr;
        }

        public final void setActive(boolean z) {
            this.active = z;
        }

        public final void setId(String str) {
            this.id = str;
        }

        public final void setParentTableId(String str) {
            this.parentTableId = str;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final void setType(String str) {
            this.type = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/bitable/managerpanel/BitableManagerPanelData$Companion;", "", "()V", "ITEM_FIRST_LEVEL", "", "ITEM_SECOND_LEVEL", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.bitable.managerpanel.BitableManagerPanelData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Integer getActiveTableIndex() {
        return this.activeTableIndex;
    }

    public final BottomFixedData getBottomFixedData() {
        return this.bottomFixedData;
    }

    public final BlockBean[] getData() {
        return this.data;
    }

    public final String getTitle() {
        return this.title;
    }

    public String toString() {
        return "BitableManagerPanelData : title = " + this.title + " data = " + JSON.toJSONString(this.data) + " bottomFixedData = " + JSON.toJSONString(this.bottomFixedData);
    }

    public final List<AbstractC20930c> convert2MultiItemEntities() {
        BlockBean[] blockBeanArr = this.data;
        if (blockBeanArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = blockBeanArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            BlockBean blockBean = blockBeanArr[i];
            int i3 = i2 + 1;
            ViewBean[] views = blockBean.getViews();
            if (views != null) {
                for (ViewBean viewBean : views) {
                    blockBean.addSubItem(viewBean);
                    viewBean.setParentTableId(blockBean.getId());
                }
            }
            arrayList.add(blockBean);
            if (blockBean.getActive()) {
                this.activeTableIndex = Integer.valueOf(i2);
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public final void setActiveTableIndex(Integer num) {
        this.activeTableIndex = num;
    }

    public final void setBottomFixedData(BottomFixedData bottomFixedData2) {
        this.bottomFixedData = bottomFixedData2;
    }

    public final void setData(BlockBean[] blockBeanArr) {
        this.data = blockBeanArr;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
