package com.bytedance.ee.bear.document.model.toolbar;

public interface ItemIdV2 {

    public enum DisplayMode {
        SubToolBarV2,
        FunctionPanel,
        NoDisplay
    }

    /* renamed from: com.bytedance.ee.bear.document.model.toolbar.ItemIdV2$a */
    public interface AbstractC5875a extends ItemIdV2 {
    }

    /* renamed from: com.bytedance.ee.bear.document.model.toolbar.ItemIdV2$b */
    public interface AbstractC5876b extends ItemIdV2 {
    }

    ItemIdV2[] children();

    DisplayMode displayMode();

    String name();

    public enum ConstId implements ItemIdV2 {
        unknown,
        keyboard,
        separator;

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public ItemIdV2[] children() {
            return null;
        }

        @Override // com.bytedance.ee.bear.document.model.toolbar.ItemIdV2
        public DisplayMode displayMode() {
            return DisplayMode.NoDisplay;
        }
    }
}
