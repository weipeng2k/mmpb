package io.github.weipeng2k.mmpb;

/**
 * @author weipeng2k 2021年08月13日 下午23:00:17
 */
public class Dir extends Entry {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
