package com.bytedance.ee.bear.document.toolbar;

public interface ItemId {

    public enum BusinessId implements ItemId {
        mention,
        insertSeparator;

        @Override // com.bytedance.ee.bear.document.toolbar.ItemId
        public ItemId[] children() {
            return null;
        }
    }

    public enum ConstId implements ItemId {
        unknown,
        keyboard;

        @Override // com.bytedance.ee.bear.document.toolbar.ItemId
        public ItemId[] children() {
            return null;
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.toolbar.ItemId$a */
    public interface AbstractC6203a extends ItemId {
    }

    ItemId[] children();

    String name();
}
