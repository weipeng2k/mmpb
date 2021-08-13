package io.github.weipeng2k.mmpb;

/**
 * @author weipeng2k 2021年08月13日 下午22:59:13
 */
public class Res extends Entry {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
