package com.bytedance.ee.bear.doc.blockeditpanel.model;

import com.bytedance.ee.bear.document.model.toolbar.selectcolor.impl.Highlight;
import com.bytedance.ee.util.io.NonProguard;
import java.util.List;
import java.util.Objects;

public class BlockEditPanelMenusModel implements NonProguard {
    private List<BlockEditPanel> panels;

    public static class BlockEditPanel implements NonProguard {
        private EMenuPanelId eMenuPanelId;
        private List<BlockEditPanelMenuItem> menus;
        private String panelId;

        public List<BlockEditPanelMenuItem> getMenus() {
            return this.menus;
        }

        public String getPanelId() {
            return this.panelId;
        }

        public EMenuPanelId getEMenuPanelId() {
            if (this.eMenuPanelId == null) {
                this.eMenuPanelId = EMenuPanelId.getEnumMenuPanelIdByPanelId(this.panelId);
            }
            return this.eMenuPanelId;
        }

        public String toString() {
            return "BlockEditPanel{panelId='" + this.panelId + '\'' + ", menus=" + this.menus + '}';
        }

        public void setMenus(List<BlockEditPanelMenuItem> list) {
            this.menus = list;
        }

        public void setPanelId(String str) {
            this.panelId = str;
        }
    }

    public static class BlockEditPanelMenuItem implements NonProguard {
        private Highlight.ColorRgba backgroundColor;
        private String buttonType;
        private EMenuItemButtonType eMenuItemButtonType;
        private boolean enable;
        private Highlight.ColorRgba foregroundColor;
        private String groupId;
        private String id;
        private List<BlockEditPanelMenuItem> members;
        private boolean selected;
        private String text;

        public BlockEditPanelMenuItem() {
        }

        public Highlight.ColorRgba getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getButtonType() {
            return this.buttonType;
        }

        public Highlight.ColorRgba getForegroundColor() {
            return this.foregroundColor;
        }

        public String getGroupId() {
            return this.groupId;
        }

        public String getId() {
            return this.id;
        }

        public List<BlockEditPanelMenuItem> getMembers() {
            return this.members;
        }

        public String getText() {
            return this.text;
        }

        public boolean isEnable() {
            return this.enable;
        }

        public boolean isSelected() {
            return this.selected;
        }

        public EMenuItemButtonType getEMenuItemButtonType() {
            if (this.eMenuItemButtonType == null) {
                this.eMenuItemButtonType = EMenuItemButtonType.getEMenuItemButtonTypeByName(this.buttonType);
            }
            return this.eMenuItemButtonType;
        }

        public int hashCode() {
            return Objects.hash(this.id);
        }

        public String toString() {
            return "BlockEditPanelMenuItem{id='" + this.id + '\'' + "text = '" + this.text + '\'' + ", buttonType='" + this.buttonType + '\'' + ", enable=" + this.enable + ", selected=" + this.selected + ", members=" + this.members + ", backgroundColor=" + this.backgroundColor + '}';
        }

        public void setBackgroundColor(Highlight.ColorRgba colorRgba) {
            this.backgroundColor = colorRgba;
        }

        public void setButtonType(String str) {
            this.buttonType = str;
        }

        public void setEnable(boolean z) {
            this.enable = z;
        }

        public void setForegroundColor(Highlight.ColorRgba colorRgba) {
            this.foregroundColor = colorRgba;
        }

        public void setGroupId(String str) {
            this.groupId = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setMembers(List<BlockEditPanelMenuItem> list) {
            this.members = list;
        }

        public void setSelected(boolean z) {
            this.selected = z;
        }

        public void setText(String str) {
            this.text = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.id, ((BlockEditPanelMenuItem) obj).id);
        }

        public BlockEditPanelMenuItem(String str, EMenuItemButtonType eMenuItemButtonType2, String str2) {
            this(str, eMenuItemButtonType2, str2, true, false);
        }

        public BlockEditPanelMenuItem(String str, EMenuItemButtonType eMenuItemButtonType2, String str2, boolean z, boolean z2) {
            this.id = str;
            this.buttonType = eMenuItemButtonType2.name;
            this.text = str2;
            this.enable = z;
            this.selected = z2;
        }
    }

    public List<BlockEditPanel> getPanels() {
        return this.panels;
    }

    public int hashCode() {
        return Objects.hash(this.panels);
    }

    public String toString() {
        return "BlockEditPanelModel{menuItems=" + this.panels + '}';
    }

    public void setPanels(List<BlockEditPanel> list) {
        this.panels = list;
    }

    public static boolean isValid(BlockEditPanelMenusModel blockEditPanelMenusModel) {
        List<BlockEditPanel> list;
        if (blockEditPanelMenusModel == null || (list = blockEditPanelMenusModel.panels) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.panels, ((BlockEditPanelMenusModel) obj).panels);
    }
}
