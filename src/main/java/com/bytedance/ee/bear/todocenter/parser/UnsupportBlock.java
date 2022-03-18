package com.bytedance.ee.bear.todocenter.parser;

public class UnsupportBlock extends AbsBlock {
    @Override // com.bytedance.ee.bear.todocenter.parser.AbsBlock
    public boolean isValid() {
        return true;
    }

    public UnsupportBlock() {
        setType("99");
    }
}
